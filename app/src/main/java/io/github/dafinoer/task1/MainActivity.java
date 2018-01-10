package io.github.dafinoer.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import io.github.dafinoer.task1.model.Listing;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextFirstInput, mEditTextSecondInput;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextFirstInput = (EditText) findViewById(R.id.edit_text_input_1);

        mEditTextSecondInput = (EditText) findViewById(R.id.edit_text_input_2);

        mListView = (ListView) findViewById(R.id.list_number);


    }

    private ArrayAdapter getAdapter(ArrayList arrayList){

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.text_list,
                R.id.text_list,
                arrayList);
        mListView.setAdapter(arrayAdapter);

        return arrayAdapter;
    }


    public void mButtonProcess(View view){

        Listing listing = new Listing();

        listing.setFirst(Integer.parseInt(mEditTextFirstInput.getText().toString()));

        listing.setSecond(Integer.parseInt(mEditTextSecondInput.getText().toString()));

        IterateListing iterateListing = new IterateListing();

        System.out.println(iterateListing.iterateNumber(listing));

        getAdapter(iterateListing.iterateNumber(listing));

    }
}
