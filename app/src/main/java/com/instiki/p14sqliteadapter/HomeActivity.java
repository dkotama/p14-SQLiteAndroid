package com.instiki.p14sqliteadapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.instiki.p14sqliteadapter.mahasiswa.MahasiswaDBHelper;
import com.instiki.p14sqliteadapter.mahasiswa.MahasiswaModel;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    ListView mhsListView;
    private String[] mhsStrings;
    private MahasiswaDBHelper db;
    private ArrayAdapter mhsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // setup views
        mhsListView = findViewById(R.id.mahasiswa_listview);

//        db = new MahasiswaDBHelper(this);
//
//        mhsStrings = db.getAllMahasiswaFullname();
//
//
//        mhsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mhsStrings);
//        mhsListView.setAdapter(mhsAdapter);
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("List Mahasiswa");
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//       getMenuInflater().inflate(R.menu.homepage_menu, menu);
//       return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_add:
    // TODO: Tambahkan Intent ke Register Activity disini

//                return true;
//            case R.id.action_refresh:
//                mhsStrings = db.getAllMahasiswaFullname();
//                mhsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mhsStrings);
//                mhsListView.setAdapter(mhsAdapter);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
}