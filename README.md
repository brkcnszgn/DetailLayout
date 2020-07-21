# DetailLayout


  
  
  <com.brkcnszgn.detail_layout.DetailFabLayout
            android:id="@+id/fabtoolbar"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:showDuration="600"
            app:hideDuration="400"
            app:fadeInFraction="0.5"
            app:fabId="@+id/fabtoolbar_fab"
            app:containerId="@+id/fabtoolbar_container"
            app:fabToolbarId="@+id/fabtoolbar_toolbar">


            <RelativeLayout
                android:id="@+id/fabtoolbar_container"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_alignParentBottom="true"
                android:layout_alignParentEnd="true">

                <com.google.android.material.floatingactionbutton.FloatingActionButton
                    android:id="@+id/fabtoolbar_fab"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    app:fabSize="auto"
                    android:rotation="-90"
                    android:src="@drawable/down_arrow_icon" />

            </RelativeLayout>

            <LinearLayout
                android:id="@+id/fabtoolbar_toolbar"
                android:layout_width="match_parent"
                android:layout_height="160dp"
                android:gravity="center"
                android:background="@color/color_white_half_transparent"
                android:layout_alignParentBottom="true"
                android:orientation="vertical">

                //Here create Layout

            </LinearLayout>

        </com.brkcnszgn.detail_layout.DetailFabLayout>
