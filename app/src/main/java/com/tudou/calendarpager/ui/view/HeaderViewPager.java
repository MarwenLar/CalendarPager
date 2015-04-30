package com.tudou.calendarpager.ui.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by tudou on 15-4-30.
 */
public class HeaderViewPager extends ViewPager {
  private final static String TAG = "HeaderViewPager";

  public HeaderViewPager(Context context) {
    this(context, null);
  }

  public HeaderViewPager(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public void onContentPageScrolled(int position, float positionOffset,
      int positionOffsetPixels) {
    Log.e(TAG, "position: " + position + "      positionOffset: " + positionOffset + "     positionOffsetPicxels: " + positionOffsetPixels);
    if (position % 6 == 0) {
      //this.onPageScrolled(position / 6, positionOffset, positionOffsetPixels);

    }
  }

  public void onContentPageSelected(int position) {

  }

  public void onContentPageScrollStateChanged(int state) {

  }
}
