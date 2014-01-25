package xg.pullaction.activities;


import xg.pullaction.R;
import xg.pullaction.adapters.MyPagerAdapter;
import xg.pullaction.views.PagerSlidingTabStrip;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;

public class MainActivity extends SherlockFragmentActivity {
	
	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		setContentView(R.layout.activity_main);
		
		PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
		
		tabs.setIndicatorColorResource(R.color.tab_indicator);
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		pager.setOffscreenPageLimit(5);
		
		MyPagerAdapter adapter = new MyPagerAdapter(this, getSupportFragmentManager());
		
		final int pageMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
				8, getResources().getDisplayMetrics());
		pager.setPageMargin(pageMargin);
		pager.setAdapter(adapter);
		tabs.setViewPager(pager);
		
		setupActionBar();
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.drawable.ic_transparent);
    }

}
