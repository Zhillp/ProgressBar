# ProgressBar

## Introduction 
The ProgressBar is a user interface element that will indicate the progress of the operation on the app. The progress bar widgets supports to two different types of modes, it supports the progress in determinate and indeterminate. 

### Indeterminate Progress
The indeterminate Progress is used for when you don’t know how long the operation in the app will take. This is the default mode for the the progress bar and will show a cyclic animation without any specific amount of progress being indicated. An example of the indeterminate progress in the XML file can be written like the following: 

<ProgressBar
	android:id=“@id/indeterminateBar”
	android:layout_width=“wrap_content”
	android:layout_height=“wrap_content” />

### Determinate Progress
The determinate progress is used for when you want to show how long a specific quantity of progress has happened.There are methods that can be used to set up how the progress bar will work. Methods like setProgress(int) ad incrementProgressBy(int) to increase the current progress completed, the default set value for this is 100. An example of the determinate progress in the XML file can be written as the following:

<ProgressBar
	android:id=“@id/determinateBar”
	style=“@android:style/Widget.ProgressBar.Horizontal”
	android:layout_width=“wrap_content”
	android:layout_height=“wrap_content” 
android:progress=“25”/>

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

## The references 
