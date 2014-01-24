package xg.pullaction.activities;


import xg.pullaction.R;
import xg.pullaction.R.color;
import xg.pullaction.R.id;
import xg.pullaction.R.layout;
import xg.pullaction.R.menu;
import xg.pullaction.adapters.MyPagerAdapter;
import xg.pullaction.views.PagerSlidingTabStrip;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.TypedValue;
import android.widget.ImageView;

public class MainActivity extends SherlockFragmentActivity {

	private final PageListener pageListener = new PageListener();
	private ImageView mover;
	
	
	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setContentView(R.layout.activity_main);
		
		PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
		
		tabs.setIndicatorColorResource(R.color.tab_indicator);
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		pager.setOffscreenPageLimit(5);
		//pager.setOnPageChangeListener(pageListener);
		
		MyPagerAdapter adapter = new MyPagerAdapter(this, getSupportFragmentManager());
		
		final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
				8, getResources().getDisplayMetrics());
		pager.setPageMargin(pageMargin);
		pager.setAdapter(adapter);
		tabs.setViewPager(pager);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	private class PageListener implements OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {
			System.out.println("-------------"+arg0);
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			System.out.println("======arg0 "+ arg0 + "=========arg1=======" + arg1+"=====arg2==========="+arg2);
			
		}

		@Override
		public void onPageSelected(int arg0) {
			System.out.println("-------------"+arg0);
		}

	}
}
