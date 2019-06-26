package com.jsonobject.json_object_parsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    String json_string="{\"employee\":{\"name\":\"pallavi waghaye\",\"salary\":65000}}";
    String name,salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView employeeName=(TextView)findViewById(R.id.name);
        TextView employeeSalary=(TextView)findViewById(R.id.salary);

        try
        {
            JSONObject obj=new JSONObject(json_string);
            JSONObject employee=obj.getJSONObject("employee");
            name=employee.getString("name");
            salary=employee.getString("salary");
            employeeName.setText("name:"+name);
            employeeSalary.setText("salary:"+salary);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
