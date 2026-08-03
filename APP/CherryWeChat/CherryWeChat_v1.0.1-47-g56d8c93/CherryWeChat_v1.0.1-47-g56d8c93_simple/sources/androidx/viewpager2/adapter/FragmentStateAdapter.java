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
import androidx.recyclerview.widget.AbstractC1166o;
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
import p000.C1459gi;
import p000.C1483h5;
import p000.C2324oi;
import p000.C2428qs;
import p000.C2640vp;
import p000.EnumC0675Pn;
import p000.InterfaceC0889Un;

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
        public /* synthetic */ DataSetChangeObserver(C11681 r1) {
            this();
        }

        @Override // p000.AbstractC1516hv
        public abstract void onChanged();

        @Override // p000.AbstractC1516hv
        public final void onItemRangeChanged(int r1, int r2) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeInserted(int r1, int r2) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeMoved(int r1, int r2, int r3) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeRemoved(int r1, int r2) {
            onChanged();
        }

        private DataSetChangeObserver() {
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeChanged(int r1, int r2, Object r3) {
            onChanged();
        }
    }

    public @interface ExperimentalFragmentStateAdapterApi {
    }

    public static class FragmentEventDispatcher {
        private List<FragmentTransactionCallback> mCallbacks;

        public FragmentEventDispatcher() {
            this.mCallbacks = new CopyOnWriteArrayList();
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchMaxLifecyclePreUpdated(AbstractComponentCallbacksC1503hi r4, EnumC0675Pn r5) {
            ArrayList r0 = new ArrayList();
            Iterator<FragmentTransactionCallback> r1 = this.mCallbacks.iterator();
        L4:
            if (r1.hasNext() == false) goto L6;
            r0.add(r1.next().onFragmentMaxLifecyclePreUpdated(r4, r5));
            goto L4
        L6:
            return r0;
        }

        public void dispatchPostEvents(List<FragmentTransactionCallback.OnPostEventListener> r2) {
            Iterator<FragmentTransactionCallback.OnPostEventListener> r22 = r2.iterator();
        L4:
            if (r22.hasNext() == false) goto L6;
            r22.next().onPost();
            goto L4
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded(AbstractComponentCallbacksC1503hi r4) {
            ArrayList r0 = new ArrayList();
            Iterator<FragmentTransactionCallback> r1 = this.mCallbacks.iterator();
        L4:
            if (r1.hasNext() == false) goto L6;
            r0.add(r1.next().onFragmentPreAdded(r4));
            goto L4
        L6:
            return r0;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved(AbstractComponentCallbacksC1503hi r4) {
            ArrayList r0 = new ArrayList();
            Iterator<FragmentTransactionCallback> r1 = this.mCallbacks.iterator();
        L4:
            if (r1.hasNext() == false) goto L6;
            r0.add(r1.next().onFragmentPreRemoved(r4));
            goto L4
        L6:
            return r0;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState(AbstractComponentCallbacksC1503hi r4) {
            ArrayList r0 = new ArrayList();
            Iterator<FragmentTransactionCallback> r1 = this.mCallbacks.iterator();
        L4:
            if (r1.hasNext() == false) goto L6;
            r0.add(r1.next().onFragmentPreSavedInstanceState(r4));
            goto L4
        L6:
            return r0;
        }

        public void registerCallback(FragmentTransactionCallback r2) {
            this.mCallbacks.add(r2);
        }

        public void unregisterCallback(FragmentTransactionCallback r2) {
            this.mCallbacks.remove(r2);
        }
    }

    public class FragmentMaxLifecycleEnforcer {
        private AbstractC1516hv mDataObserver;
        private InterfaceC0889Un mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId;
        private ViewPager2 mViewPager;
        final /* synthetic */ FragmentStateAdapter this$0;

        public FragmentMaxLifecycleEnforcer(FragmentStateAdapter r3) {
            this.this$0 = r3;
            this.mPrimaryItemId = -1;
        }

        private ViewPager2 inferViewPager(RecyclerView r4) {
            ViewParent r42 = r4.getParent();
            if ((r42 instanceof ViewPager2) == false) goto L7;
            return (ViewPager2) r42;
        L7:
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + r42);
        }

        public void register(RecyclerView r2) {
            this.mViewPager = inferViewPager(r2);
            ViewPager2.OnPageChangeCallback r22 = new C11721(this);
            this.mPageChangeCallback = r22;
            this.mViewPager.registerOnPageChangeCallback(r22);
            DataSetChangeObserver r23 = new C11732(this);
            this.mDataObserver = r23;
            this.this$0.registerAdapterDataObserver(r23);
            InterfaceC0889Un r24 = new C11743(this);
            this.mLifecycleObserver = r24;
            this.this$0.mLifecycle.mo1555a(r24);
        }

        public void unregister(RecyclerView r2) {
            inferViewPager(r2).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            this.this$0.unregisterAdapterDataObserver(this.mDataObserver);
            this.this$0.mLifecycle.mo1556b(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        public void updateFragmentMaxLifecycle(boolean r10) {
            if (this.this$0.shouldDelayFragmentTransactions() == false) goto L6;
            return;
        L6:
            if (this.mViewPager.getScrollState() == 0) goto L9;
            return;
        L9:
            if (this.this$0.mFragments.m5172g() != 0) goto L12;
            return;
        L12:
            if (this.this$0.getItemCount() == 0) goto L65;
            int r0 = this.mViewPager.getCurrentItem();
            if (r0 >= this.this$0.getItemCount()) goto L66;
            long r02 = this.this$0.getItemId(r0);
            if (r02 != this.mPrimaryItemId) goto L21;
            if (r10 == true) goto L21;
            return;
        L21:
            AbstractComponentCallbacksC1503hi r102 = (AbstractComponentCallbacksC1503hi) this.this$0.mFragments.m5167b(r02);
            if (r102 != null) goto L24;
            return;
        L24:
            if (r102.m2875i() == false) goto L68;
            this.mPrimaryItemId = r02;
            AbstractC2805zi r103 = this.this$0.mFragmentManager;
            r103.getClass();
            C1483h5 r03 = new C1483h5(r103);
            ArrayList r104 = new ArrayList();
            AbstractComponentCallbacksC1503hi r2 = null;
            int r3 = 0;
        L28:
            if (r3 >= this.this$0.mFragments.m5172g()) goto L44;
            long r4 = this.this$0.mFragments.m5169d(r3);
            AbstractComponentCallbacksC1503hi r6 = (AbstractComponentCallbacksC1503hi) this.this$0.mFragments.m5173h(r3);
            if (r6.m2875i() == false) goto L43;
            if (r4 == this.mPrimaryItemId) goto L35;
            EnumC0675Pn r7 = EnumC0675Pn.f2150d;
            r03.m2845h(r6, r7);
            r104.add(this.this$0.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(r6, r7));
        L37:
            if (r4 != this.mPrimaryItemId) goto L39;
            boolean r42 = true;
        L41:
            if (r6.f5293B == r42) goto L43;
            r6.f5293B = r42;
            goto L43
        L39:
            r42 = false;
            goto L41
        L35:
            r2 = r6;
        L43:
            r3 = r3 + 1;
            goto L28
        L44:
            if (r2 == null) goto L47;
            EnumC0675Pn r32 = EnumC0675Pn.f2151e;
            r03.m2845h(r2, r32);
            r104.add(this.this$0.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(r2, r32));
        L47:
            if (r03.f5236a.isEmpty() == false) goto L49;
            return;
        L49:
            if (r03.f5242g == true) goto L55;
            r03.f5251p.m5428z(r03, false);
            Collections.reverse(r104);
            Iterator r105 = r104.iterator();
        L52:
            if (r105.hasNext() == false) goto L69;
            this.this$0.mFragmentEventDispatcher.dispatchPostEvents((List) r105.next());
            goto L52
        L69:
            return;
        L55:
            throw new IllegalStateException("This transaction is already being added to the back stack");
        L68:
            return;
        L66:
            return;
        }
    }

    public static abstract class FragmentTransactionCallback {
        private static final OnPostEventListener NO_OP = null;

        public interface OnPostEventListener {
            void onPost();
        }

        static {
            NO_OP = new C11751();
        }

        public FragmentTransactionCallback() {
        }

        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(AbstractComponentCallbacksC1503hi r1, EnumC0675Pn r2) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreAdded(AbstractComponentCallbacksC1503hi r1) {
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreRemoved(AbstractComponentCallbacksC1503hi r1) {
            return NO_OP;
        }

        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener onFragmentPreSavedInstanceState(AbstractComponentCallbacksC1503hi r1) {
            return NO_OP;
        }
    }

    public FragmentStateAdapter(AbstractActivityC2148ki r2) {
        this(r2.getSupportFragmentManager(), r2.getLifecycle());
    }

    private static String createKey(String r1, long r2) {
        return r1 + r2;
    }

    private void ensureFragment(int r5) {
        long r0 = getItemId(r5);
        if (this.mFragments.m5168c(r0) < 0) goto L5;
        return;
    L5:
        AbstractComponentCallbacksC1503hi r52 = createFragment(r5);
        C1459gi r2 = (C1459gi) this.mSavedStates.m5167b(r0);
        if (r52.f5327r != null) goto L15;
        if (r2 == null) goto L11;
        Bundle r22 = r2.f5178a;
        if (r22 == null) goto L11;
    L12:
        r52.f5311b = r22;
        this.mFragments.m5170e(r0, r52);
        return;
    L11:
        r22 = null;
        goto L12
    L15:
        throw new IllegalStateException("Fragment already added");
    }

    private boolean isFragmentViewBound(long r3) {
        if (this.mItemIdToViewHolder.m5168c(r3) < 0) goto L5;
        return true;
    L5:
        AbstractComponentCallbacksC1503hi r32 = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(r3);
        if (r32 == null) goto L16;
        View r33 = r32.f5296E;
        if (r33 != null) goto L12;
        return false;
    L12:
        if (r33.getParent() == null) goto L14;
        return true;
    L14:
        return false;
    L16:
        return false;
    }

    private static boolean isValidKey(String r1, String r2) {
        if (r1.startsWith(r2) == true) goto L5;
        return false;
    L5:
        if (r1.length() <= r2.length()) goto L10;
        return true;
    L10:
        return false;
    }

    private Long itemForViewHolder(int r5) {
        Long r0 = null;
        int r1 = 0;
    L4:
        if (r1 >= this.mItemIdToViewHolder.m5172g()) goto L12;
        if (((Integer) this.mItemIdToViewHolder.m5173h(r1)).intValue() != r5) goto L11;
        if (r0 != null) goto L10;
        r0 = Long.valueOf(this.mItemIdToViewHolder.m5169d(r1));
        goto L11
    L10:
        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
    L11:
        r1 = r1 + 1;
        goto L4
    L12:
        return r0;
    }

    private static long parseIdFromKey(String r0, String r1) {
        return Long.parseLong(r0.substring(r1.length()));
    }

    private void removeFragment(long r8) {
        AbstractComponentCallbacksC1503hi r0 = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(r8);
        if (r0 != null) goto L5;
        return;
    L5:
        View r1 = r0.f5296E;
        if (r1 == null) goto L11;
        ViewParent r12 = r1.getParent();
        if (r12 == null) goto L11;
        ((FrameLayout) r12).removeAllViews();
    L11:
        if (containsItem(r8) == true) goto L14;
        this.mSavedStates.m5171f(r8);
    L14:
        if (r0.m2875i() == true) goto L18;
        this.mFragments.m5171f(r8);
        return;
    L18:
        if (shouldDelayFragmentTransactions() == false) goto L22;
        this.mHasStaleFragments = true;
        return;
    L22:
        if (r0.m2875i() == true) goto L24;
    L35:
        List<FragmentTransactionCallback.OnPostEventListener> r13 = this.mFragmentEventDispatcher.dispatchPreRemoved(r0);
        AbstractC2805zi r2 = this.mFragmentManager;     // Catch: Throwable -> L41
        r2.getClass();     // Catch: Throwable -> L41
        C1483h5 r3 = new C1483h5(r2);     // Catch: Throwable -> L41
        r3.m2844g(r0);     // Catch: Throwable -> L41
        if (r3.f5242g == true) goto L44;
        r3.f5251p.m5428z(r3, false);     // Catch: Throwable -> L41
        this.mFragments.m5171f(r8);     // Catch: Throwable -> L41
        this.mFragmentEventDispatcher.dispatchPostEvents(r13);
        return;
    L44:
        throw new IllegalStateException("This transaction is already being added to the back stack");     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        this.mFragmentEventDispatcher.dispatchPostEvents(r13);
        throw th;
    L24:
        if (containsItem(r8) == false) goto L35;
        List<FragmentTransactionCallback.OnPostEventListener> r14 = this.mFragmentEventDispatcher.dispatchPreSavedInstanceState(r0);
        AbstractC2805zi r22 = this.mFragmentManager;
        C2428qs r32 = r22.f9494c;
        C0326Hi r33 = (C0326Hi) ((HashMap) r32.f8521b).get(r0.f5314e);
        C1459gi r4 = null;
        if (r33 == null) goto L33;
        AbstractComponentCallbacksC1503hi r5 = r33.f1110c;
        if (r5.equals(r0) == false) goto L33;
        if (r5.f5310a <= (-1)) goto L32;
        r4 = new C1459gi(r33.m708o());
    L32:
        this.mFragmentEventDispatcher.dispatchPostEvents(r14);
        this.mSavedStates.m5170e(r8, r4);
    L33:
        r22.m5403b0(new IllegalStateException("Fragment " + r0 + " is not currently in the FragmentManager"));
        throw null;
    }

    private void scheduleGracePeriodEnd() {
        final Handler r0 = new Handler(Looper.getMainLooper());
        final Runnable r1 = new RunnableC11703(this);
        this.mLifecycle.mo1555a(new C11714(this, r0, r1));
        r0.postDelayed(r1, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(final AbstractComponentCallbacksC1503hi r3, final FrameLayout r4) {
        AbstractC2805zi r0 = this.mFragmentManager;
        AbstractC2633vi r1 = new C11692(this, r3, r4);
        ((CopyOnWriteArrayList) r0.f9504m.f2089b).add(new C2324oi(r1));
    }

    public void addViewToContainer(View r3, FrameLayout r4) {
        if (r4.getChildCount() > 1) goto L16;
        if (r3.getParent() != r4) goto L8;
        return;
    L8:
        if (r4.getChildCount() <= 0) goto L11;
        r4.removeAllViews();
    L11:
        if (r3.getParent() == null) goto L13;
        ((ViewGroup) r3.getParent()).removeView(r3);
    L13:
        r4.addView(r3);
        return;
    L16:
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean containsItem(long r3) {
        if (r3 >= 0) goto L5;
        return false;
    L5:
        if (r3 >= getItemCount()) goto L10;
        return true;
    L10:
        return false;
    }

    public abstract AbstractComponentCallbacksC1503hi createFragment(int r1);

    public void gcFragments() {
        if (this.mHasStaleFragments == true) goto L5;
        return;
    L5:
        if (shouldDelayFragmentTransactions() == true) goto L35;
        C0607O4 r0 = new C0607O4();
        int r1 = 0;
        int r2 = 0;
    L9:
        if (r2 >= this.mFragments.m5172g()) goto L15;
        long r3 = this.mFragments.m5169d(r2);
        if (containsItem(r3) == true) goto L13;
        r0.add(Long.valueOf(r3));
        this.mItemIdToViewHolder.m5171f(r3);
    L13:
        r2 = r2 + 1;
        goto L9
    L15:
        if (this.mIsInGracePeriod == true) goto L23;
        this.mHasStaleFragments = false;
    L18:
        if (r1 >= this.mFragments.m5172g()) goto L23;
        long r22 = this.mFragments.m5169d(r1);
        if (isFragmentViewBound(r22) == true) goto L22;
        r0.add(Long.valueOf(r22));
    L22:
        r1 = r1 + 1;
    L23:
        C0349I4 r12 = new C0349I4(r0);
    L25:
        if (r12.hasNext() == false) goto L36;
        removeFragment(((Long) r12.next()).longValue());
        goto L25
    L36:
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public long getItemId(int r3) {
        return r3;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public void onAttachedToRecyclerView(RecyclerView r2) {
        if (this.mFragmentMaxLifecycleEnforcer != null) goto L7;
        FragmentMaxLifecycleEnforcer r0 = new FragmentMaxLifecycleEnforcer(this);
        this.mFragmentMaxLifecycleEnforcer = r0;
        r0.register(r2);
        return;
    L7:
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public /* bridge */ /* synthetic */ void onBindViewHolder(AbstractC1166o r1, int r2) {
        onBindViewHolder((FragmentViewHolder) r1, r2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public /* bridge */ /* synthetic */ AbstractC1166o onCreateViewHolder(ViewGroup r1, int r2) {
        return onCreateViewHolder(r1, r2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public void onDetachedFromRecyclerView(RecyclerView r2) {
        this.mFragmentMaxLifecycleEnforcer.unregister(r2);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    public final boolean onFailedToRecycleView(FragmentViewHolder r1) {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(AbstractC1166o r1) {
        onViewAttachedToWindow((FragmentViewHolder) r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public /* bridge */ /* synthetic */ void onViewRecycled(AbstractC1166o r1) {
        onViewRecycled((FragmentViewHolder) r1);
    }

    public void placeFragmentInViewHolder(final FragmentViewHolder r9) {
        AbstractComponentCallbacksC1503hi r1 = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(r9.getItemId());
        if (r1 == null) goto L50;
        FrameLayout r3 = r9.getContainer();
        View r4 = r1.f5296E;
        if (r1.m2875i() == true) goto L11;
        if (r4 == null) goto L11;
        throw new IllegalStateException("Design assumption violated.");
    L11:
        if (r1.m2875i() == false) goto L16;
        if (r4 != null) goto L16;
        scheduleViewAttach(r1, r3);
        return;
    L16:
        if (r1.m2875i() == false) goto L24;
        if (r4.getParent() == null) goto L24;
        if (r4.getParent() == r3) goto L46;
        addViewToContainer(r4, r3);
        return;
    L46:
        return;
    L24:
        if (r1.m2875i() == false) goto L28;
        addViewToContainer(r4, r3);
        return;
    L28:
        if (shouldDelayFragmentTransactions() == true) goto L45;
        scheduleViewAttach(r1, r3);
        List<FragmentTransactionCallback.OnPostEventListener> r2 = this.mFragmentEventDispatcher.dispatchPreAdded(r1);
    L38:
        th = move-exception;
        this.mFragmentEventDispatcher.dispatchPostEvents(r2);
        throw th;
    L31:
        if (r1.f5293B == false) goto L33;
        r1.f5293B = false;     // Catch: Throwable -> L38
    L33:
        AbstractC2805zi r32 = this.mFragmentManager;     // Catch: Throwable -> L38
        r32.getClass();     // Catch: Throwable -> L38
        C1483h5 r5 = new C1483h5(r32);     // Catch: Throwable -> L38
        r5.m2842e(0, r1, "f" + r9.getItemId(), 1);     // Catch: Throwable -> L38
        r5.m2845h(r1, EnumC0675Pn.f2150d);     // Catch: Throwable -> L38
        if (r5.f5242g == true) goto L41;
        r5.f5251p.m5428z(r5, false);     // Catch: Throwable -> L38
        this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);     // Catch: Throwable -> L38
        this.mFragmentEventDispatcher.dispatchPostEvents(r2);
        return;
    L41:
        throw new IllegalStateException("This transaction is already being added to the back stack");     // Catch: Throwable -> L38
    L45:
        if (this.mFragmentManager.f9485H == true) goto L52;
        this.mLifecycle.mo1555a(new C11681(this, r9));
        return;
    L52:
        return;
    L50:
        throw new IllegalStateException("Design assumption violated.");
    }

    public void registerFragmentTransactionCallback(FragmentTransactionCallback r2) {
        this.mFragmentEventDispatcher.registerCallback(r2);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(Parcelable r9) {
        if (this.mSavedStates.m5172g() != 0) goto L36;
        if (this.mFragments.m5172g() != 0) goto L36;
        Bundle r92 = (Bundle) r9;
        if (r92.getClassLoader() != null) goto L9;
        r92.setClassLoader(getClass().getClassLoader());
    L9:
        Iterator<String> r0 = r92.keySet().iterator();
    L11:
        if (r0.hasNext() == false) goto L31;
        String r1 = r0.next();
        if (isValidKey(r1, KEY_PREFIX_FRAGMENT) == true) goto L14;
        if (isValidKey(r1, KEY_PREFIX_STATE) == false) goto L29;
        long r2 = parseIdFromKey(r1, KEY_PREFIX_STATE);
        C1459gi r12 = (C1459gi) r92.getParcelable(r1);
        if (containsItem(r2) == false) goto L11;
        this.mSavedStates.m5170e(r2, r12);
        goto L11
    L29:
        throw new IllegalArgumentException(AbstractC0213Ey.m420r("Unexpected key in savedState: ", r1));
    L14:
        long r22 = parseIdFromKey(r1, KEY_PREFIX_FRAGMENT);
        AbstractC2805zi r4 = this.mFragmentManager;
        r4.getClass();
        String r5 = r92.getString(r1);
        AbstractComponentCallbacksC1503hi r6 = null;
        if (r5 == null) goto L20;
        AbstractComponentCallbacksC1503hi r7 = r4.f9494c.m4876n(r5);
        if (r7 == null) goto L21;
        r6 = r7;
        goto L20
    L21:
        r4.m5403b0(new IllegalStateException("Fragment no longer exists for key " + r1 + ": unique id " + r5));
        throw null;
    L20:
        this.mFragments.m5170e(r22, r6);
        goto L11
    L31:
        if (this.mFragments.m5172g() != 0) goto L33;
        return;
    L33:
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
        return;
    L36:
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable saveState() {
        Bundle r0 = new Bundle(this.mSavedStates.m5172g() + this.mFragments.m5172g());
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= this.mFragments.m5172g()) goto L16;
        long r3 = this.mFragments.m5169d(r2);
        AbstractComponentCallbacksC1503hi r5 = (AbstractComponentCallbacksC1503hi) this.mFragments.m5167b(r3);
        if (r5 == null) goto L14;
        if (r5.m2875i() == false) goto L14;
        String r32 = createKey(KEY_PREFIX_FRAGMENT, r3);
        AbstractC2805zi r4 = this.mFragmentManager;
        r4.getClass();
        if (r5.f5327r != r4) goto L12;
        r0.putString(r32, r5.f5314e);
        goto L14
    L12:
        r4.m5403b0(new IllegalStateException("Fragment " + r5 + " is not currently in the FragmentManager"));
        throw null;
    L14:
        r2 = r2 + 1;
    L16:
        if (r1 >= this.mSavedStates.m5172g()) goto L21;
        long r22 = this.mSavedStates.m5169d(r1);
        if (containsItem(r22) == false) goto L20;
        r0.putParcelable(createKey(KEY_PREFIX_STATE, r22), (Parcelable) this.mSavedStates.m5167b(r22));
    L20:
        r1 = r1 + 1;
        goto L16
    L21:
        return r0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void setHasStableIds(boolean r2) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.m5385L();
    }

    public void unregisterFragmentTransactionCallback(FragmentTransactionCallback r2) {
        this.mFragmentEventDispatcher.unregisterCallback(r2);
    }

    public FragmentStateAdapter(AbstractComponentCallbacksC1503hi r2) {
        this(r2.m2869c(), r2.f5304M);
    }

    public final void onBindViewHolder(FragmentViewHolder r8, int r9) {
        long r0 = r8.getItemId();
        int r2 = r8.getContainer().getId();
        Long r3 = itemForViewHolder(r2);
        if (r3 != null) goto L5;
    L7:
        this.mItemIdToViewHolder.m5170e(r0, Integer.valueOf(r2));
        ensureFragment(r9);
        if (r8.getContainer().isAttachedToWindow() == false) goto L10;
        placeFragmentInViewHolder(r8);
    L10:
        gcFragments();
        return;
    L5:
        if (r3.longValue() == r0) goto L7;
        removeFragment(r3.longValue());
        this.mItemIdToViewHolder.m5171f(r3.longValue());
        goto L7
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final FragmentViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
        return FragmentViewHolder.create(r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(AbstractC1166o r1) {
        return onFailedToRecycleView((FragmentViewHolder) r1);
    }

    public final void onViewAttachedToWindow(FragmentViewHolder r1) {
        placeFragmentInViewHolder(r1);
        gcFragments();
    }

    public final void onViewRecycled(FragmentViewHolder r4) {
        Long r42 = itemForViewHolder(r4.getContainer().getId());
        if (r42 == null) goto L6;
        removeFragment(r42.longValue());
        this.mItemIdToViewHolder.m5171f(r42.longValue());
        return;
    }

    public FragmentStateAdapter(AbstractC2805zi r2, AbstractC0760Rn r3) {
        this.mFragments = new C2640vp();
        this.mSavedStates = new C2640vp();
        this.mItemIdToViewHolder = new C2640vp();
        this.mFragmentEventDispatcher = new FragmentEventDispatcher();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = r2;
        this.mLifecycle = r3;
        super.setHasStableIds(true);
    }
}
