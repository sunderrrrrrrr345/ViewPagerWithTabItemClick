package sunder.com.khstm.viewpagerwithtabitemclick;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import sunder.com.khstm.viewpagerwithtabitemclick.adapter.ViewPagerAdapter;
import sunder.com.khstm.viewpagerwithtabitemclick.viewpager.LockableViewPager;

public class MainActivity extends AppCompatActivity {
    public LockableViewPager mViewPager;
    private Toolbar mToolbar;
    private ViewPagerAdapter mViewPagerAdapter;
    private TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mViewPager.getCurrentItem() != 0) {
                        mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1,false);
                    }else{
                        finish();
                    }
                }
            });
        }

        setViewPager();
    }

    private void setViewPager() {
        mViewPager = (LockableViewPager) findViewById(R.id.pager);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mViewPagerAdapter);
      /*  mTabLayout = (TabLayout) findViewById(R.id.tab);
        mTabLayout.setupWithViewPager(mViewPager);*/
    }

   public void setCurrentItem (int item, boolean smoothScroll) {
        mViewPager.setCurrentItem(item, smoothScroll);
    }


    public void onBackPressed(){
        if (mViewPager.getCurrentItem() != 0) {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1,false);
        }else{
            finish();
        }
    }


    public void NavigationClick(){
        if (mViewPager.getCurrentItem() != 0) {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1,false);
        }else{
            finish();
        }
    }
}
