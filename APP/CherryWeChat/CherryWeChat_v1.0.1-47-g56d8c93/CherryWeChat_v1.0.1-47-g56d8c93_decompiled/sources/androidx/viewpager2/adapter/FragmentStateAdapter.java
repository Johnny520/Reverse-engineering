package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractActivityC2148ki;
import p000.AbstractC0213Ey;
import p000.AbstractC0760Rn;
import p000.AbstractC1516hv;
import p000.AbstractC2633vi;
import p000.AbstractC2805zi;
import p000.AbstractComponentCallbacksC1503hi;
import p000.C0326Hi;
import p000.C0349I4;
import p000.C0607O4;
import p000.C0649P3;
import p000.C1459gi;
import p000.C1483h5;
import p000.C2324oi;
import p000.C2640vp;
import p000.EnumC0632On;
import p000.EnumC0675Pn;
import p000.InterfaceC0889Un;
import p000.InterfaceC1061Yn;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends AbstractC1158g implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    FragmentEventDispatcher mFragmentEventDispatcher;
    final AbstractC2805zi mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final C2640vp mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final C2640vp mItemIdToViewHolder;
    final AbstractC0760Rn mLifecycle;
    private final C2640vp mSavedStates;

    public static abstract class DataSetChangeObserver extends AbstractC1516hv {
        @Override // p000.AbstractC1516hv
        public abstract void onChanged();

        @Override // p000.AbstractC1516hv
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        private DataSetChangeObserver() {
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    public @interface ExperimentalFragmentStateAdapterApi {
    }

    public static class FragmentEventDispatcher {
        private List<FragmentTransactionCallback> mCallbacks = new CopyOnWriteArrayList();

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchMaxLifecyclePreUpdated(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, EnumC0675Pn enumC0675Pn) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentMaxLifecyclePreUpdated(abstractComponentCallbacksC1503hi, enumC0675Pn));
            }
            return arrayList;
        }

        public void dispatchPostEvents(List<FragmentTransactionCallback.OnPostEventListener> list) {
            Iterator<FragmentTransactionCallback.OnPostEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPost();
            }
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreAdded(abstractComponentCallbacksC1503hi));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreRemoved(abstractComponentCallbacksC1503hi));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
            ArrayList arrayList = new ArrayList();
            Iterator<FragmentTransactionCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreSavedInstanceState(abstractComponentCallbacksC1503hi));
            }
            return arrayList;
        }

        public void registerCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            this.mCallbacks.add(fragmentTransactionCallback);
        }

        public void unregisterCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            this.mCallbacks.remove(fragmentTransactionCallback);
        }
    }

    public class FragmentMaxLifecycleEnforcer {
        private AbstractC1516hv mDataObserver;
        private InterfaceC0889Un mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private ViewPager2 mViewPager;

        public FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 inferViewPager(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void register(RecyclerView recyclerView) {
            this.mViewPager = inferViewPager(recyclerView);
            ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mPageChangeCallback = onPageChangeCallback;
            this.mViewPager.registerOnPageChangeCallback(onPageChangeCallback);
            DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, p000.AbstractC1516hv
                public void onChanged() {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                }
            };
            this.mDataObserver = dataSetChangeObserver;
            FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            InterfaceC0889Un interfaceC0889Un = new InterfaceC0889Un() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // p000.InterfaceC0889Un
                public void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mLifecycleObserver = interfaceC0889Un;
            FragmentStateAdapter.this.mLifecycle.mo1555a(interfaceC0889Un);
        }

        public void unregister(RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            FragmentStateAdapter.this.mLifecycle.mo1556b(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        public void updateFragmentMaxLifecycle(boolean z) {
            int currentItem;
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.mViewPager.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.m5172g() == 0 || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.mViewPager.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.mPrimaryItemId || z) && (abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) FragmentStateAdapter.this.mFragments.m5167b(itemId)) != null && abstractComponentCallbacksC1503hi.m2875i()) {
                this.mPrimaryItemId = itemId;
                AbstractC2805zi abstractC2805zi = FragmentStateAdapter.this.mFragmentManager;
                abstractC2805zi.getClass();
                C1483h5 c1483h5 = new C1483h5(abstractC2805zi);
                ArrayList arrayList = new ArrayList();
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = null;
                for (int i = 0; i < FragmentStateAdapter.this.mFragments.m5172g(); i++) {
                    long jM5169d = FragmentStateAdapter.this.mFragments.m5169d(i);
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi3 = (AbstractComponentCallbacksC1503hi) FragmentStateAdapter.this.mFragments.m5173h(i);
                    if (abstractComponentCallbacksC1503hi3.m2875i()) {
                        if (jM5169d != this.mPrimaryItemId) {
                            EnumC0675Pn enumC0675Pn = EnumC0675Pn.f2150d;
                            c1483h5.m2845h(abstractComponentCallbacksC1503hi3, enumC0675Pn);
                            arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(abstractComponentCallbacksC1503hi3, enumC0675Pn));
                        } else {
                            abstractComponentCallbacksC1503hi2 = abstractComponentCallbacksC1503hi3;
                        }
                        boolean z2 = jM5169d == this.mPrimaryItemId;
                        if (abstractComponentCallbacksC1503hi3.f5293B != z2) {
                            abstractComponentCallbacksC1503hi3.f5293B = z2;
                        }
                    }
                }
                if (abstractComponentCallbacksC1503hi2 != null) {
                    EnumC0675Pn enumC0675Pn2 = EnumC0675Pn.f2151e;
                    c1483h5.m2845h(abstractComponentCallbacksC1503hi2, enumC0675Pn2);
                    arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(abstractComponentCallbacksC1503hi2, enumC0675Pn2));
                }
                if (c1483h5.f5236a.isEmpty()) {
                    return;
                }
                if (c1483h5.f5242g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                c1483h5.f5251p.m5428z(c1483h5, false);
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchPostEvents((List) it.next());
                }
            }
        }
    }

    public static abstract class FragmentTransactionCallback {
        private static final OnPostEventListener NO_OP = new OnPostEventListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void onPost() {
            }
        };

        public interface OnPostEventListener {
            void onPost();
        }

        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, EnumC0675Pn enumC0675Pn) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreAdded(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreRemoved(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
            return NO_OP;
        }

        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener onFragmentPreSavedInstanceState(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
            return NO_OP;
        }
    }

    public FragmentStateAdapter(AbstractActivityC2148ki abstractActivityC2148ki) {
        this(abstractActivityC2148ki.getSupportFragmentManager(), abstractActivityC2148ki.getLifecycle());
    }

    private static String createKey(String str, long j) {
        return str + j;
    }

    private void ensureFragment(int i) {
        Bundle bundle;
        long itemId = getItemId(i);
        if (this.mFragments.m5168c(itemId) >= 0) {
            return;
        }
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiCreateFragment = createFragment(i);
        C1459gi c1459gi = (C1459gi) this.mSavedStates.m5167b(itemId);
        if (abstractComponentCallbacksC1503hiCreateFragment.f5327r != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c1459gi == null || (bundle = c1459gi.f5178a) == null) {
            bundle = null;
        }
        abstractComponentCallbacksC1503hiCreateFragment.f5311b = bundle;
        this.mFragments.m5170e(itemId, abstractComponentCallbacksC1503hiCreateFragment);
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        if (this.mItemIdToViewHolder.m5168c(j) >= 0) {
            return true;
        }
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(j);
        return (abstractComponentCallbacksC1503hi == null || (view = abstractComponentCallbacksC1503hi.f5296E) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.m5172g(); i2++) {
            if (((Integer) this.mItemIdToViewHolder.m5173h(i2)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.m5169d(i2));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j) {
        ViewParent parent;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(j);
        if (abstractComponentCallbacksC1503hi == null) {
            return;
        }
        View view = abstractComponentCallbacksC1503hi.f5296E;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.m5171f(j);
        }
        if (!abstractComponentCallbacksC1503hi.m2875i()) {
            this.mFragments.m5171f(j);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (abstractComponentCallbacksC1503hi.m2875i() && containsItem(j)) {
            List<FragmentTransactionCallback.OnPostEventListener> listDispatchPreSavedInstanceState = this.mFragmentEventDispatcher.dispatchPreSavedInstanceState(abstractComponentCallbacksC1503hi);
            AbstractC2805zi abstractC2805zi = this.mFragmentManager;
            C0326Hi c0326Hi = (C0326Hi) ((HashMap) abstractC2805zi.f9494c.f8521b).get(abstractComponentCallbacksC1503hi.f5314e);
            if (c0326Hi != null) {
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2 = c0326Hi.f1110c;
                if (abstractComponentCallbacksC1503hi2.equals(abstractComponentCallbacksC1503hi)) {
                    C1459gi c1459gi = abstractComponentCallbacksC1503hi2.f5310a > -1 ? new C1459gi(c0326Hi.m708o()) : null;
                    this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreSavedInstanceState);
                    this.mSavedStates.m5170e(j, c1459gi);
                }
            }
            abstractC2805zi.m5403b0(new IllegalStateException("Fragment " + abstractComponentCallbacksC1503hi + " is not currently in the FragmentManager"));
            throw null;
        }
        List<FragmentTransactionCallback.OnPostEventListener> listDispatchPreRemoved = this.mFragmentEventDispatcher.dispatchPreRemoved(abstractComponentCallbacksC1503hi);
        try {
            AbstractC2805zi abstractC2805zi2 = this.mFragmentManager;
            abstractC2805zi2.getClass();
            C1483h5 c1483h5 = new C1483h5(abstractC2805zi2);
            c1483h5.m2844g(abstractComponentCallbacksC1503hi);
            if (c1483h5.f5242g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c1483h5.f5251p.m5428z(c1483h5, false);
            this.mFragments.m5171f(j);
        } finally {
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreRemoved);
        }
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.mo1555a(new InterfaceC0889Un() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // p000.InterfaceC0889Un
            public void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
                if (enumC0632On == EnumC0632On.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    interfaceC1061Yn.getLifecycle().mo1556b(this);
                }
            }
        });
        handler.postDelayed(runnable, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(final AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi, final FrameLayout frameLayout) {
        ((CopyOnWriteArrayList) this.mFragmentManager.f9504m.f2089b).add(new C2324oi(new AbstractC2633vi() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
            @Override // p000.AbstractC2633vi
            public void onFragmentViewCreated(AbstractC2805zi abstractC2805zi, AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi2, View view, Bundle bundle) {
                if (abstractComponentCallbacksC1503hi2 == abstractComponentCallbacksC1503hi) {
                    C0649P3 c0649p3 = abstractC2805zi.f9504m;
                    synchronized (((CopyOnWriteArrayList) c0649p3.f2089b)) {
                        try {
                            int size = ((CopyOnWriteArrayList) c0649p3.f2089b).size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (((C2324oi) ((CopyOnWriteArrayList) c0649p3.f2089b).get(i)).f8171a == this) {
                                    ((CopyOnWriteArrayList) c0649p3.f2089b).remove(i);
                                    break;
                                }
                                i++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }));
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public abstract AbstractComponentCallbacksC1503hi createFragment(int i);

    public void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        C0607O4 c0607o4 = new C0607O4();
        for (int i = 0; i < this.mFragments.m5172g(); i++) {
            long jM5169d = this.mFragments.m5169d(i);
            if (!containsItem(jM5169d)) {
                c0607o4.add(Long.valueOf(jM5169d));
                this.mItemIdToViewHolder.m5171f(jM5169d);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < this.mFragments.m5172g(); i2++) {
                long jM5169d2 = this.mFragments.m5169d(i2);
                if (!isFragmentViewBound(jM5169d2)) {
                    c0607o4.add(Long.valueOf(jM5169d2));
                }
            }
        }
        C0349I4 c0349i4 = new C0349I4(c0607o4);
        while (c0349i4.hasNext()) {
            removeFragment(((Long) c0349i4.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.mFragmentMaxLifecycleEnforcer != null) {
            throw new IllegalArgumentException();
        }
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final boolean onFailedToRecycleView(FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public void placeFragmentInViewHolder(final FragmentViewHolder fragmentViewHolder) {
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(fragmentViewHolder.getItemId());
        if (abstractComponentCallbacksC1503hi == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout container = fragmentViewHolder.getContainer();
        View view = abstractComponentCallbacksC1503hi.f5296E;
        if (!abstractComponentCallbacksC1503hi.m2875i() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (abstractComponentCallbacksC1503hi.m2875i() && view == null) {
            scheduleViewAttach(abstractComponentCallbacksC1503hi, container);
            return;
        }
        if (abstractComponentCallbacksC1503hi.m2875i() && view.getParent() != null) {
            if (view.getParent() != container) {
                addViewToContainer(view, container);
                return;
            }
            return;
        }
        if (abstractComponentCallbacksC1503hi.m2875i()) {
            addViewToContainer(view, container);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.f9485H) {
                return;
            }
            this.mLifecycle.mo1555a(new InterfaceC0889Un() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // p000.InterfaceC0889Un
                public void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
                    if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    interfaceC1061Yn.getLifecycle().mo1556b(this);
                    if (fragmentViewHolder.getContainer().isAttachedToWindow()) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(abstractComponentCallbacksC1503hi, container);
        List<FragmentTransactionCallback.OnPostEventListener> listDispatchPreAdded = this.mFragmentEventDispatcher.dispatchPreAdded(abstractComponentCallbacksC1503hi);
        try {
            if (abstractComponentCallbacksC1503hi.f5293B) {
                abstractComponentCallbacksC1503hi.f5293B = false;
            }
            AbstractC2805zi abstractC2805zi = this.mFragmentManager;
            abstractC2805zi.getClass();
            C1483h5 c1483h5 = new C1483h5(abstractC2805zi);
            c1483h5.m2842e(0, abstractComponentCallbacksC1503hi, "f" + fragmentViewHolder.getItemId(), 1);
            c1483h5.m2845h(abstractComponentCallbacksC1503hi, EnumC0675Pn.f2150d);
            if (c1483h5.f5242g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c1483h5.f5251p.m5428z(c1483h5, false);
            this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
        } finally {
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreAdded);
        }
    }

    public void registerFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.registerCallback(fragmentTransactionCallback);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(Parcelable parcelable) {
        if (this.mSavedStates.m5172g() != 0 || this.mFragments.m5172g() != 0) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_FRAGMENT);
                AbstractC2805zi abstractC2805zi = this.mFragmentManager;
                abstractC2805zi.getClass();
                String string = bundle.getString(str);
                AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = null;
                if (string != null) {
                    AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM4876n = abstractC2805zi.f9494c.m4876n(string);
                    if (abstractComponentCallbacksC1503hiM4876n == null) {
                        abstractC2805zi.m5403b0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                        throw null;
                    }
                    abstractComponentCallbacksC1503hi = abstractComponentCallbacksC1503hiM4876n;
                }
                this.mFragments.m5170e(idFromKey, abstractComponentCallbacksC1503hi);
            } else {
                if (!isValidKey(str, KEY_PREFIX_STATE)) {
                    throw new IllegalArgumentException(AbstractC0213Ey.m420r("Unexpected key in savedState: ", str));
                }
                long idFromKey2 = parseIdFromKey(str, KEY_PREFIX_STATE);
                C1459gi c1459gi = (C1459gi) bundle.getParcelable(str);
                if (containsItem(idFromKey2)) {
                    this.mSavedStates.m5170e(idFromKey2, c1459gi);
                }
            }
        }
        if (this.mFragments.m5172g() == 0) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.m5172g() + this.mFragments.m5172g());
        for (int i = 0; i < this.mFragments.m5172g(); i++) {
            long jM5169d = this.mFragments.m5169d(i);
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(jM5169d);
            if (abstractComponentCallbacksC1503hi != null && abstractComponentCallbacksC1503hi.m2875i()) {
                String strCreateKey = createKey(KEY_PREFIX_FRAGMENT, jM5169d);
                AbstractC2805zi abstractC2805zi = this.mFragmentManager;
                abstractC2805zi.getClass();
                if (abstractComponentCallbacksC1503hi.f5327r != abstractC2805zi) {
                    abstractC2805zi.m5403b0(new IllegalStateException("Fragment " + abstractComponentCallbacksC1503hi + " is not currently in the FragmentManager"));
                    throw null;
                }
                bundle.putString(strCreateKey, abstractComponentCallbacksC1503hi.f5314e);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.m5172g(); i2++) {
            long jM5169d2 = this.mSavedStates.m5169d(i2);
            if (containsItem(jM5169d2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jM5169d2), (Parcelable) this.mSavedStates.m5167b(jM5169d2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.m5385L();
    }

    public void unregisterFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.unregisterCallback(fragmentTransactionCallback);
    }

    public FragmentStateAdapter(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        this(abstractComponentCallbacksC1503hi.m2869c(), abstractComponentCallbacksC1503hi.f5304M);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(FragmentViewHolder fragmentViewHolder, int i) {
        long itemId = fragmentViewHolder.getItemId();
        int id = fragmentViewHolder.getContainer().getId();
        Long lItemForViewHolder = itemForViewHolder(id);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.m5171f(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.m5170e(itemId, Integer.valueOf(id));
        ensureFragment(i);
        if (fragmentViewHolder.getContainer().isAttachedToWindow()) {
            placeFragmentInViewHolder(fragmentViewHolder);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final FragmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return FragmentViewHolder.create(viewGroup);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onViewAttachedToWindow(FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onViewRecycled(FragmentViewHolder fragmentViewHolder) {
        Long lItemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.m5171f(lItemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(AbstractC2805zi abstractC2805zi, AbstractC0760Rn abstractC0760Rn) {
        this.mFragments = new C2640vp();
        this.mSavedStates = new C2640vp();
        this.mItemIdToViewHolder = new C2640vp();
        this.mFragmentEventDispatcher = new FragmentEventDispatcher();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = abstractC2805zi;
        this.mLifecycle = abstractC0760Rn;
        super.setHasStableIds(true);
    }
}
