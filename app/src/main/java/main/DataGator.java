package main;

import android.util.Log;

import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.FitnessOptions;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataSourcesRequest;

import static android.content.ContentValues.TAG;

public class DataGator {

    FitnessOptions fitnessOptions = FitnessOptions.builder().addDataType(DataType.TYPE_STEP_COUNT_DELTA).build();



}
