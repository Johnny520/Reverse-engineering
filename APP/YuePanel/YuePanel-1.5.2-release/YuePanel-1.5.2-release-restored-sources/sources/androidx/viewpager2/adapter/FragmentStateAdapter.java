package androidx.viewpager2.adapter;

import Yue.C3399;
import Yue.C5110;
import Yue.C5885;
import Yue.C6740;
import Yue.C8273;
import Yue.C8336;
import Yue.InterfaceC3647;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7593;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC8909<C5110> implements InterfaceC7593 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f30383 = "f#";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f30384 = "s#";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long f30385 = 10000;

    /* JADX INFO: renamed from: ۥ */
    public final Lifecycle f4004;

    /* JADX INFO: renamed from: ۥ۟ */
    public final FragmentManager f4005;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5885<Fragment> f30386;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C5885<Fragment.C8845> f30387;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C5885<Integer> f30388;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public FragmentMaxLifecycleEnforcer f30389;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f30390;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f30391;

    public class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: ۥ */
        public C8336.AbstractC8344 f4006;

        /* JADX INFO: renamed from: ۥ۟ */
        public RecyclerView.AbstractC8911 f4007;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public LifecycleEventObserver f30397;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C8336 f30398;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public long f30399 = -1;

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ */
        public class C1799 extends C8336.AbstractC8344 {
            public C1799() {
            }

            @Override // Yue.C8336.AbstractC8344
            public void onPageScrollStateChanged(int i) {
                FragmentMaxLifecycleEnforcer.this.m30830(false);
            }

            @Override // Yue.C8336.AbstractC8344
            public void onPageSelected(int i) {
                FragmentMaxLifecycleEnforcer.this.m30830(false);
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ۟ */
        public class C1800 extends AbstractC9002 {
            public C1800() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC9002, androidx.recyclerview.widget.RecyclerView.AbstractC8911
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.m30830(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public final C8336 m5027(@InterfaceC6391 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof C8336) {
                return (C8336) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m5028(@InterfaceC6391 RecyclerView recyclerView) {
            this.f30398 = m5027(recyclerView);
            C1799 c1799 = new C1799();
            this.f4006 = c1799;
            this.f30398.m27798(c1799);
            C1800 c1800 = new C1800();
            this.f4007 = c1800;
            FragmentStateAdapter.this.registerAdapterDataObserver(c1800);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // android.view.LifecycleEventObserver
                public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.m30830(false);
                }
            };
            this.f30397 = lifecycleEventObserver;
            FragmentStateAdapter.this.f4004.addObserver(lifecycleEventObserver);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30829(@InterfaceC6391 RecyclerView recyclerView) {
            m5027(recyclerView).m27808(this.f4006);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f4007);
            FragmentStateAdapter.this.f4004.removeObserver(this.f30397);
            this.f30398 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30830(boolean z) {
            int currentItem;
            Fragment fragmentM18216;
            if (FragmentStateAdapter.this.m30828() || this.f30398.getScrollState() != 0 || FragmentStateAdapter.this.f30386.m18220() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f30398.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f30399 || z) && (fragmentM18216 = FragmentStateAdapter.this.f30386.m18216(itemId)) != null && fragmentM18216.isAdded()) {
                this.f30399 = itemId;
                AbstractC8885 abstractC8885M29749 = FragmentStateAdapter.this.f4005.m29749();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.f30386.m18231(); i++) {
                    long jM18221 = FragmentStateAdapter.this.f30386.m18221(i);
                    Fragment fragmentM18232 = FragmentStateAdapter.this.f30386.m18232(i);
                    if (fragmentM18232.isAdded()) {
                        if (jM18221 != this.f30399) {
                            abstractC8885M29749.mo29913(fragmentM18232, Lifecycle.State.STARTED);
                        } else {
                            fragment = fragmentM18232;
                        }
                        fragmentM18232.setMenuVisibility(jM18221 == this.f30399);
                    }
                }
                if (fragment != null) {
                    abstractC8885M29749.mo29913(fragment, Lifecycle.State.RESUMED);
                }
                if (abstractC8885M29749.mo29911()) {
                    return;
                }
                abstractC8885M29749.mo29906();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ */
    public class ViewOnLayoutChangeListenerC1801 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ FrameLayout f4010;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ C5110 f4011;

        public ViewOnLayoutChangeListenerC1801(FrameLayout frameLayout, C5110 c5110) {
            this.f4010 = frameLayout;
            this.f4011 = c5110;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f4010.getParent() != null) {
                this.f4010.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.m30824(this.f4011);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟ */
    public class C1802 extends FragmentManager.AbstractC8856 {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Fragment f4012;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ FrameLayout f4013;

        public C1802(Fragment fragment, FrameLayout frameLayout) {
            this.f4012 = fragment;
            this.f4013 = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC8856
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo29900(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Fragment fragment, @InterfaceC6391 View view, @InterfaceC6490 Bundle bundle) {
            if (fragment == this.f4012) {
                fragmentManager.m29883(this);
                FragmentStateAdapter.this.m5026(view, this.f4013);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC9001 implements Runnable {
        public RunnableC9001() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f30390 = false;
            fragmentStateAdapter.m30816();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC9002 extends RecyclerView.AbstractC8911 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC9002() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public abstract void onChanged();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: androidx.viewpager2.adapter.FragmentStateAdapter.ۥ۟۟۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC9002(ViewOnLayoutChangeListenerC1801 viewOnLayoutChangeListenerC1801) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public final void onItemRangeChanged(int i, int i2, @InterfaceC6490 Object obj) {
            onChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FragmentStateAdapter(@InterfaceC6391 FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m30810(@InterfaceC6391 String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m30811(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static long m30812(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    @InterfaceC3647
    public void onAttachedToRecyclerView(@InterfaceC6391 RecyclerView recyclerView) {
        C6740.m3226(this.f30389 == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f30389 = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.m5028(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    @InterfaceC3647
    public void onDetachedFromRecyclerView(@InterfaceC6391 RecyclerView recyclerView) {
        this.f30389.m30829(recyclerView);
        this.f30389 = null;
    }

    @Override // Yue.InterfaceC7593
    @InterfaceC6391
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.f30386.m18231() + this.f30387.m18231());
        for (int i = 0; i < this.f30386.m18231(); i++) {
            long jM18221 = this.f30386.m18221(i);
            Fragment fragmentM18216 = this.f30386.m18216(jM18221);
            if (fragmentM18216 != null && fragmentM18216.isAdded()) {
                this.f4005.m29853(bundle, m30810(f30383, jM18221), fragmentM18216);
            }
        }
        for (int i2 = 0; i2 < this.f30387.m18231(); i2++) {
            long jM182212 = this.f30387.m18221(i2);
            if (m30813(jM182212)) {
                bundle.putParcelable(m30810(f30384, jM182212), this.f30387.m18216(jM182212));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @Override // Yue.InterfaceC7593
    /* JADX INFO: renamed from: ۥ */
    public final void mo3750(@InterfaceC6391 Parcelable parcelable) {
        if (!this.f30387.m18220() || !this.f30386.m18220()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m30811(str, f30383)) {
                this.f30386.m18222(m30812(str, f30383), this.f4005.m29807(bundle, str));
            } else {
                if (!m30811(str, f30384)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jM30812 = m30812(str, f30384);
                Fragment.C8845 c8845 = (Fragment.C8845) bundle.getParcelable(str);
                if (m30813(jM30812)) {
                    this.f30387.m18222(jM30812, c8845);
                }
            }
        }
        if (this.f30386.m18220()) {
            return;
        }
        this.f30391 = true;
        this.f30390 = true;
        m30816();
        m30826();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m5026(@InterfaceC6391 View view, @InterfaceC6391 FrameLayout frameLayout) {
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

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m30813(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract Fragment m30814(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30815(int i) {
        long itemId = getItemId(i);
        if (this.f30386.m18212(itemId)) {
            return;
        }
        Fragment fragmentM30814 = m30814(i);
        fragmentM30814.setInitialSavedState(this.f30387.m18216(itemId));
        this.f30386.m18222(itemId, fragmentM30814);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m30816() {
        if (!this.f30391 || m30828()) {
            return;
        }
        C3399 c3399 = new C3399();
        for (int i = 0; i < this.f30386.m18231(); i++) {
            long jM18221 = this.f30386.m18221(i);
            if (!m30813(jM18221)) {
                c3399.add(Long.valueOf(jM18221));
                this.f30388.m18225(jM18221);
            }
        }
        if (!this.f30390) {
            this.f30391 = false;
            for (int i2 = 0; i2 < this.f30386.m18231(); i2++) {
                long jM182212 = this.f30386.m18221(i2);
                if (!m30817(jM182212)) {
                    c3399.add(Long.valueOf(jM182212));
                }
            }
        }
        Iterator<E> it = c3399.iterator();
        while (it.hasNext()) {
            m30825(((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m30817(long j) {
        View view;
        if (this.f30388.m18212(j)) {
            return true;
        }
        Fragment fragmentM18216 = this.f30386.m18216(j);
        return (fragmentM18216 == null || (view = fragmentM18216.getView()) == null || view.getParent() == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Long m30818(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.f30388.m18231(); i2++) {
            if (this.f30388.m18232(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f30388.m18221(i2));
            }
        }
        return lValueOf;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@InterfaceC6391 C5110 c5110, int i) {
        long itemId = c5110.getItemId();
        int id = c5110.m15772().getId();
        Long lM30818 = m30818(id);
        if (lM30818 != null && lM30818.longValue() != itemId) {
            m30825(lM30818.longValue());
            this.f30388.m18225(lM30818.longValue());
        }
        this.f30388.m18222(itemId, Integer.valueOf(id));
        m30815(i);
        FrameLayout frameLayoutM15772 = c5110.m15772();
        if (C8273.m27397(frameLayoutM15772)) {
            if (frameLayoutM15772.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutM15772.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1801(frameLayoutM15772, c5110));
        }
        m30816();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ; */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5110 onCreateViewHolder(@InterfaceC6391 ViewGroup viewGroup, int i) {
        return C5110.m1923(viewGroup);
    }

    /* JADX DEBUG: Method merged with bridge method: onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(@InterfaceC6391 C5110 c5110) {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@InterfaceC6391 C5110 c5110) {
        m30824(c5110);
        m30816();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void onViewRecycled(@InterfaceC6391 C5110 c5110) {
        Long lM30818 = m30818(c5110.m15772().getId());
        if (lM30818 != null) {
            m30825(lM30818.longValue());
            this.f30388.m18225(lM30818.longValue());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m30824(@InterfaceC6391 final C5110 c5110) {
        Fragment fragmentM18216 = this.f30386.m18216(c5110.getItemId());
        if (fragmentM18216 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutM15772 = c5110.m15772();
        View view = fragmentM18216.getView();
        if (!fragmentM18216.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentM18216.isAdded() && view == null) {
            m30827(fragmentM18216, frameLayoutM15772);
            return;
        }
        if (fragmentM18216.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutM15772) {
                m5026(view, frameLayoutM15772);
                return;
            }
            return;
        }
        if (fragmentM18216.isAdded()) {
            m5026(view, frameLayoutM15772);
            return;
        }
        if (m30828()) {
            if (this.f4005.m29823()) {
                return;
            }
            this.f4004.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // android.view.LifecycleEventObserver
                public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.m30828()) {
                        return;
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    if (C8273.m27397(c5110.m15772())) {
                        FragmentStateAdapter.this.m30824(c5110);
                    }
                }
            });
            return;
        }
        m30827(fragmentM18216, frameLayoutM15772);
        this.f4005.m29749().m30045(fragmentM18216, "f" + c5110.getItemId()).mo29913(fragmentM18216, Lifecycle.State.STARTED).mo29906();
        this.f30389.m30830(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m30825(long j) {
        ViewParent parent;
        Fragment fragmentM18216 = this.f30386.m18216(j);
        if (fragmentM18216 == null) {
            return;
        }
        if (fragmentM18216.getView() != null && (parent = fragmentM18216.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!m30813(j)) {
            this.f30387.m18225(j);
        }
        if (!fragmentM18216.isAdded()) {
            this.f30386.m18225(j);
            return;
        }
        if (m30828()) {
            this.f30391 = true;
            return;
        }
        if (fragmentM18216.isAdded() && m30813(j)) {
            this.f30387.m18222(j, this.f4005.m29871(fragmentM18216));
        }
        this.f4005.m29749().mo29912(fragmentM18216).mo29906();
        this.f30386.m18225(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m30826() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final RunnableC9001 runnableC9001 = new RunnableC9001();
        this.f4004.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // android.view.LifecycleEventObserver
            public void onStateChanged(@InterfaceC6391 LifecycleOwner lifecycleOwner, @InterfaceC6391 Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnableC9001);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(runnableC9001, 10000L);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m30827(Fragment fragment, @InterfaceC6391 FrameLayout frameLayout) {
        this.f4005.m29854(new C1802(fragment, frameLayout), false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m30828() {
        return this.f4005.m29830();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FragmentStateAdapter(@InterfaceC6391 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@InterfaceC6391 FragmentManager fragmentManager, @InterfaceC6391 Lifecycle lifecycle) {
        this.f30386 = new C5885<>();
        this.f30387 = new C5885<>();
        this.f30388 = new C5885<>();
        this.f30390 = false;
        this.f30391 = false;
        this.f4005 = fragmentManager;
        this.f4004 = lifecycle;
        super.setHasStableIds(true);
    }
}
