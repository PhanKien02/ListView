package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView  Lv_MonHoc;
    ArrayList <String> DSMonHoc;
    Button btnthem,btnsua;
    EditText textMH;
    int vitri =-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnthem = (Button) findViewById(R.id.Them);
        btnsua =(Button) findViewById(R.id.sua);
        textMH = (EditText) findViewById(R.id.nhapText);
        Lv_MonHoc = (ListView) findViewById(R.id.listview_1);
        DSMonHoc = new ArrayList<>();
        DSMonHoc.add("Lập trình DTDD");
        DSMonHoc.add("Quản trị mạng");
        DSMonHoc.add("thiết kế web");
        DSMonHoc.add("Lập trình C");

        ArrayAdapter adapter =new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_dropdown_item_1line
                ,DSMonHoc);
        Lv_MonHoc.setAdapter(adapter);
        Lv_MonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             textMH.setText(DSMonHoc.get(i));
             vitri =i;
         }
     });
        Lv_MonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Long click"+i,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    btnthem.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String mon = textMH.getText().toString();
            DSMonHoc.add(mon);
            textMH.setText("");
            adapter.notifyDataSetChanged();
        }
    });
    btnsua.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            DSMonHoc.set(vitri,textMH.getText().toString());
            adapter.notifyDataSetChanged();
        }
    });
    }
}