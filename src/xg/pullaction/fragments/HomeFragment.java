package xg.pullaction.fragments;

import xg.pullaction.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragment;

public class HomeFragment extends SherlockFragment {
	
	public static HomeFragment newInstance(int position) {
		HomeFragment f = new HomeFragment();
		return f;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_home, container, false);
		ImageView mover = (ImageView) view.findViewById(R.id.mover);
		mover.setTag("mover");
		
		Animation am = new RotateAnimation ( 0, 360, 50, 50 );
	    am.setDuration ( 800 );
	    am.setRepeatCount ( -1 );
	    mover.setAnimation (am);
	    am.startNow ();
		
		return view;
	}
	
}
