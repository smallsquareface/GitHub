package com.qk.fragment_detail;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = findViewById(R.id.main_list);
        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.main_list: {
                switch (position) {
                    case 0: {
                        showLifeCycle();
                    }
                    break;
                    case 1: {
                        AddMethod();
                    }
                    break;

                    default:
                        break;
                }
            }
            break;

            default:
                break;
        }
    }

    private void showLifeCycle() {
        startActivity(new Intent(this, Lifecycle_Activity.class));
    }

    private void AddMethod() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.add_method);
        builder.setItems(R.array.method_list, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0: {
                        startActivity(new Intent(MainActivity.this, Static_Method_Activity.class));
                    }
                    break;
                    case 1: {
                        startActivity(new Intent(MainActivity.this, Dynamic_Method_Activity.class));

                    }
                    break;

                    default:
                        break;
                }
            }
        });
        builder.create().show();
    }
}
