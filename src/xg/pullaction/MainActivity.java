package xg.pullaction;


import xg.pullaction.adapters.MyPagerAdapter;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.astuetz.PagerSlidingTabStrip;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.TypedValue;

public class MainActivity extends SherlockFragmentActivity {

	private final PageListener pageListener = new PageListener();
	
	
	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setContentView(R.layout.activity_main);
		
		PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
		
		tabs.setIndicatorColorResource(R.color.tab_indicator);
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		pager.setOffscreenPageLimit(5);
		pager.setOnPageChangeListener(pageListener);
		
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
			
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			
		}

		@Override
		public void onPageSelected(int arg0) {
			
		}

	}
}
