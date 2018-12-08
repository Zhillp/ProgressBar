# ProgressBar

## Introduction 
The ProgressBar is a user interface element that will indicate the progress of the operation on the app. The progress bar widgets supports to two different types of modes, it supports the progress in determinate and indeterminate. 

### Indeterminate Progress
The indeterminate Progress is used for when you don’t know how long the operation in the app will take. This is the default mode for the the progress bar and will show a cyclic animation without any specific amount of progress being indicated. An example of the indeterminate progress in the XML file can be written like the following: 
```
<ProgressBar
	android:id=“@id/indeterminateBar”
	android:layout_width=“wrap_content”
	android:layout_height=“wrap_content” />
```

### Determinate Progress
The determinate progress is used for when you want to show how long a specific quantity of progress has happened.There are methods that can be used to set up how the progress bar will work. Methods like setProgress(int) ad incrementProgressBy(int) to increase the current progress completed, the default set value for this is 100. An example of the determinate progress in the XML file can be written as the following:
```
<ProgressBar
	android:id=“@id/determinateBar”
	style=“@android:style/Widget.ProgressBar.Horizontal”
	android:layout_width=“wrap_content”
	android:layout_height=“wrap_content” 
android:progress=“25”/>
```

## The History 
The ProgressBar widget was introduced in API level 1 and is still currently an active in the API level 28, but it has become the main progress widgets as the ProgressDialog widget has been deprecated at API level 26. The ProgressBar class extends the View class. The ProgressBar widget comes from the class hierarchy of the following: 

| Class Hierarchy |
| --------------------  |
| java.lang.Object |
|android.view.View|
|android.widget.ProgressBar|

## The Major methods and attributes
There are a lot of methods that can be used with the Progress Bar widgets, but a few of the methods that can be used for Progress Bar are the following methods:

| Method | Description |
| ---------- | --------------- |
| getInterpolator() | This method gets the acceleration curve type for the indeterminate animation|
| getMax() | This method returns the upper limit of the progress bar range |
| getMin() | This method returns the lower limit of the progress bar range |
| getProgress() | This method gets the progress bar’s current level of progress |
| isAnimating() | This method returns whether the Progress Bar is animating or not |
|  |  |

## The code
The code for the example of Progress Bar over [here](https://github.com/Zhillp/ProgressBar)
### activity_main.xml
The activity_main.xml contains the layout for the progress bar example. Inside the activity_main.xml, it contains 3 buttons, 2 textviews and 2 progressbar xml tags, the 3 buttons in the xml file are for both the determinate and indeterminate progress bar. There are 2 buttons for the indeterminate progress bar and the 1 button is for the determinate progress bar. For the indeterminate progress bar I placed a start and stop button and for the determinate progress bar I placed a start button for it. The 2 textviews are to tell whether is it a indeterminate progress bar or a determinate progress bar. The 2 progress bar tags are for indeterminate and determinate progress bars.

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <Button
        android:id="@+id/indeterminateprogress"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="24dp"
        android:text="@string/indeterminate"
        app:layout_constraintBottom_toTopOf="@+id/stop"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.503"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/determinateprogress"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="100dp"
        android:layout_marginEnd="8dp"
        android:text="@string/determinate"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/stop"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="136dp"
        android:text="@string/stop"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <ProgressBar
        android:id="@+id/indeterminate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="44dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/stop"
        app:layout_constraintVertical_bias="0.0" />

    <ProgressBar
        android:id="@+id/determinate"
        style="@android:style/Widget.ProgressBar.Horizontal"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="8dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/determinateprogress" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="16dp"
        android:text="@string/determinate"
        app:layout_constraintBottom_toTopOf="@+id/determinateprogress"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:text="@string/indeterminate"
        app:layout_constraintBottom_toTopOf="@+id/indeterminateprogress"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</android.support.constraint.ConstraintLayout>
```
### MainActivity.java
The main activity for the ProgressBar example puts the logic into the xml tags in the activity_main.xml. Basically what happens in the code is that it finds and give variables to all the xml tags from the xml file. Once the variables are initialized in the code, I set up the buttons to listen to when they are pressed on when one of the buttons are pressed it starts the progress bars. Since there is 2 buttons for the indeterminate progress bar, the start button starts the progress bar while the stop button stops the progress bar. The determinate progress bar button basically sets the progress to a fixed value of 20. I set the line “indeterminatebar.setVisibility(View.INVISIBLE);” is basically set to keep the indeterminate progress bar starting when the app starts up.

```
package com.example.zhill.progressbarexample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar indeterminatebar = (ProgressBar) findViewById(R.id.indeterminate);
        final ProgressBar determinatebar = (ProgressBar) findViewById(R.id.determinate);

        Button startindeterminate = (Button) findViewById(R.id.indeterminateprogress);
        Button startdeterminate = (Button) findViewById(R.id.determinateprogress);
        Button stopindeterminate = (Button) findViewById(R.id.stop);

        indeterminatebar.setVisibility(View.INVISIBLE);

        startindeterminate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indeterminatebar.setVisibility(View.VISIBLE);
            }
        });


        stopindeterminate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 indeterminatebar.setVisibility(View.GONE);
            }
        });

        startdeterminate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                determinatebar.setProgress(progress);
                determinatebar.incrementProgressBy(50);
            }
        });
    } 
}
```
## The references 
The reference that I used to help do this assignment are:
- https://developer.android.com/reference/android/widget/ProgressBar
- https://abhiandroid.com/ui/progressbar
