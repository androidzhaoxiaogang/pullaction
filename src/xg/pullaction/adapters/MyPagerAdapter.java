package xg.pullaction.adapters;

import xg.pullaction.R;
import xg.pullaction.fragments.HomeFragment;
import xg.pullaction.fragments.HomeFragment1;
import xg.pullaction.fragments.HomeFragment2;
import xg.pullaction.fragments.HomeFragment3;
import xg.pullaction.fragments.HomeFragment4;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
	private String[] TITLES;

	public MyPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		TITLES = context.getResources().getStringArray(R.array.fragment_title);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position];
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return HomeFragment.newInstance(position);
		case 1:
			return HomeFragment1.newInstance(position);
		case 2:
			return HomeFragment2.newInstance(position);
		case 3:
			return HomeFragment3.newInstance(position);
		case 4:
			return HomeFragment4.newInstance(position);
		default:
			return HomeFragment.newInstance(position);

		}
	}

}
