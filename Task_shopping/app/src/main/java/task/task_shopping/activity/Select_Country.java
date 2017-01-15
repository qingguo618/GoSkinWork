package task.task_shopping.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import task.task_shopping.R;

/**
 * Created by 201612221434 on 1/5/2017.
 */

public class Select_Country extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_country);

        ArrayList image_details = getListData();

        final ListView lv1 = (ListView) findViewById(R.id.custom_list);
        lv1.setAdapter(new CustomListAdapter(this, image_details));
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                NewsItem newsData = (NewsItem) o;
                Toast.makeText(Select_Country.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList getListData() {
        ArrayList<NewsItem> results = new ArrayList<NewsItem>();
        NewsItem newsData = new NewsItem();
        newsData.setHeadline("DPR Korea");

        NewsItem newsData1 = new NewsItem();
        newsData1.setHeadline("Russia");

        NewsItem newsData2 = new NewsItem();
        newsData2.setHeadline("China");

        NewsItem newsData3 = new NewsItem();
        newsData3.setHeadline("India");

        NewsItem newsData4 = new NewsItem();
        newsData4.setHeadline("Japen");

        NewsItem newsData5 = new NewsItem();
        newsData5.setHeadline("Iran");

        NewsItem newsData6 = new NewsItem();
        newsData6.setHeadline("Israel");

        NewsItem newsData7 = new NewsItem();
        newsData7.setHeadline("Belgalia");

        NewsItem newsData8 = new NewsItem();
        newsData8.setHeadline("Angola");

        NewsItem newsData9 = new NewsItem();
        newsData9.setHeadline("Andorra");


        results.add(newsData);
        results.add(newsData1);
        results.add(newsData2);
        results.add(newsData3);
        results.add(newsData4);
        results.add(newsData5);
        results.add(newsData6);
        results.add(newsData7);
        results.add(newsData8);
        results.add(newsData9);
        results.add(newsData1);
        results.add(newsData1);
        results.add(newsData);
        results.add(newsData1);
        results.add(newsData1);
        results.add(newsData1);
        results.add(newsData);
        results.add(newsData1);
        results.add(newsData1);
        results.add(newsData1);



        // Add some more dummy data for testing
        return results;
    }
}
