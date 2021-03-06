package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //create a list of  words
        ArrayList<Word> words=new ArrayList<Word>();
        //add word in ArrayList
        words.add(new Word("Father","apa"));
        words.add(new Word("Mother","ata"));
        words.add(new Word("Son","Angsi"));
        words.add(new Word("Doughter","Tune"));
        words.add(new Word("Older brother","Taachi"));
        words.add(new Word("Younger brother","Chalitti"));
        words.add(new Word("Older sister","Tete"));
        words.add(new Word("Younger sister","Kolliti"));
        words.add(new Word("Grandmother","Arna"));
        words.add(new Word("Grandfather","Paapa"));

        //check ArrayList
        /*Log.v("NumbersActivity","Word at index 0: "+words.get(0));
        Log.v("NumbersActivity","Word at index 5: "+words.get(8));*/
        //create LinearLayout object and add child View TextView with Text
        //LinearLayout rootView=(LinearLayout)findViewById(R.id.rootView);
        //set index initial value 0
       /* int index=0;
        //use while loop for view all words
        while(index<words.size()){
            TextView wordView=new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            //update the index
            index++;
        }*/
        //use for loop for view all words
        /*for(int index=0;index<words.size();index++){
            //create a new Textview
            TextView wordview=new TextView(this);
              //set the text to be word at the current index
            wordview.setText(words.get(index));
            //add thid text view as another child to the root view of this layout
            rootView.addView(wordview);
        }*/

        //Create an {@link WordAdapter},whose data source is a list of {@link Word}s.The
        //adapter knows how to create list items for each item in the list.
        WordAdapter adapter=new WordAdapter(this,words);
        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the view ID called list, which is declared in the
        //words_listayout file
        ListView listView=(ListView)findViewById(R.id.list);
        //Make the {@link ListView} use the {@link WordAdapter}we created above so that
        //{@link ListView}will display list items for each {@link Word}in the list
        listView.setAdapter(adapter);
    }
}
