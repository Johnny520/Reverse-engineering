package com.google.android.material.tabs;

import Yue.C8336;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class TabLayoutMediator {

    @InterfaceC6490
    private RecyclerView.AbstractC8909<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;

    @InterfaceC6490
    private TabLayoutOnPageChangeCallback onPageChangeCallback;

    @InterfaceC6490
    private TabLayout.OnTabSelectedListener onTabSelectedListener;

    @InterfaceC6490
    private RecyclerView.AbstractC8911 pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabConfigurationStrategy tabConfigurationStrategy;

    @InterfaceC6391
    private final TabLayout tabLayout;

    @InterfaceC6391
    private final C8336 viewPager;

    public class PagerAdapterObserver extends RecyclerView.AbstractC8911 {
        public PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeChanged(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeInserted(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeMoved(int i, int i2, int i3) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeRemoved(int i, int i2) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeChanged(int i, int i2, @InterfaceC6490 Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }

    public interface TabConfigurationStrategy {
        void onConfigureTab(@InterfaceC6391 TabLayout.Tab tab, int i);
    }

    public static class TabLayoutOnPageChangeCallback extends C8336.AbstractC8344 {
        private int previousScrollState;
        private int scrollState;

        @InterfaceC6391
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
            reset();
        }

        @Override // Yue.C8336.AbstractC8344
        public void onPageScrollStateChanged(int i) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // Yue.C8336.AbstractC8344
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i3 = this.scrollState;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.previousScrollState == 1, (i3 == 2 && this.previousScrollState == 0) ? false : true, false);
            }
        }

        @Override // Yue.C8336.AbstractC8344
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.previousScrollState == 0));
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    public static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final C8336 viewPager;

        public ViewPagerOnTabSelectedListener(C8336 c8336, boolean z) {
            this.viewPager = c8336;
            this.smoothScroll = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@InterfaceC6391 TabLayout.Tab tab) {
            this.viewPager.m27803(tab.getPosition(), this.smoothScroll);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TabLayoutMediator(@InterfaceC6391 TabLayout tabLayout, @InterfaceC6391 C8336 c8336, @InterfaceC6391 TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, c8336, true, tabConfigurationStrategy);
    }

    public void attach() {
        if (this.attached) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.AbstractC8909<?> adapter = this.viewPager.getAdapter();
        this.adapter = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.attached = true;
        TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.tabLayout);
        this.onPageChangeCallback = tabLayoutOnPageChangeCallback;
        this.viewPager.m27798(tabLayoutOnPageChangeCallback);
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
        this.onTabSelectedListener = viewPagerOnTabSelectedListener;
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
        if (this.autoRefresh) {
            PagerAdapterObserver pagerAdapterObserver = new PagerAdapterObserver();
            this.pagerAdapterObserver = pagerAdapterObserver;
            this.adapter.registerAdapterDataObserver(pagerAdapterObserver);
        }
        populateTabsFromPagerAdapter();
        this.tabLayout.setScrollPosition(this.viewPager.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        RecyclerView.AbstractC8909<?> abstractC8909;
        if (this.autoRefresh && (abstractC8909 = this.adapter) != null) {
            abstractC8909.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.m27808(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        RecyclerView.AbstractC8909<?> abstractC8909 = this.adapter;
        if (abstractC8909 != null) {
            int itemCount = abstractC8909.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(tabNewTab, i);
                this.tabLayout.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.viewPager.getCurrentItem(), this.tabLayout.getTabCount() - 1);
                if (iMin != this.tabLayout.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.tabLayout;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TabLayoutMediator(@InterfaceC6391 TabLayout tabLayout, @InterfaceC6391 C8336 c8336, boolean z, @InterfaceC6391 TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, c8336, z, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@InterfaceC6391 TabLayout tabLayout, @InterfaceC6391 C8336 c8336, boolean z, boolean z2, @InterfaceC6391 TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = c8336;
        this.autoRefresh = z;
        this.smoothScroll = z2;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }
}
