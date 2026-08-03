package Yue;

import Yue.C3055;
import Yue.C6965;
import Yue.InterfaceC3070;
import Yue.InterfaceC7144;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C8988;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8336 extends ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f24904 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f24905 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f24906 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f24907 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f24908 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f24909 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static boolean f24910 = true;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Rect f24911;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Rect f24912;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C4066 f24913;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f24914;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f24915;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public RecyclerView.AbstractC8911 f24916;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public LinearLayoutManager f24917;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f24918;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Parcelable f24919;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public RecyclerView f24920;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8988 f24921;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C7244 f24922;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C4066 f24923;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C4787 f24924;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public C6593 f24925;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public RecyclerView.AbstractC8914 f24926;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f24927;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f24928;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f24929;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public AbstractC8339 f24930;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ */
    public class C1488 extends AbstractC8341 {
        public C1488() {
            super(null);
        }

        @Override // Yue.C8336.AbstractC8341, androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onChanged() {
            C8336 c8336 = C8336.this;
            c8336.f24915 = true;
            c8336.f24922.m22689();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟ */
    public class C1489 extends AbstractC8344 {
        public C1489() {
        }

        @Override // Yue.C8336.AbstractC8344
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                C8336.this.m27809();
            }
        }

        @Override // Yue.C8336.AbstractC8344
        public void onPageSelected(int i) {
            C8336 c8336 = C8336.this;
            if (c8336.f24914 != i) {
                c8336.f24914 = i;
                c8336.f24930.mo27825();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟, reason: contains not printable characters */
    public class C8337 extends AbstractC8344 {
        public C8337() {
        }

        @Override // Yue.C8336.AbstractC8344
        public void onPageSelected(int i) {
            C8336.this.clearFocus();
            if (C8336.this.hasFocus()) {
                C8336.this.f24920.requestFocus(2);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟, reason: contains not printable characters */
    public class C8338 implements RecyclerView.InterfaceC8923 {
        public C8338() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8923
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4311(@InterfaceC6391 View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8923
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo27810(@InterfaceC6391 View view) {
            RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c8922).width != -1 || ((ViewGroup.MarginLayoutParams) c8922).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract class AbstractC8339 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC8339() {
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean mo4312() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4313(int i) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean mo27811(int i, Bundle bundle) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo27812() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo27813(@InterfaceC6490 RecyclerView.AbstractC8909<?> abstractC8909) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo27814(@InterfaceC6490 RecyclerView.AbstractC8909<?> abstractC8909) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public String mo27815() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo27816(@InterfaceC6391 C4066 c4066, @InterfaceC6391 RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo27817(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo27818(@InterfaceC6391 C3055 c3055) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean mo27819(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean mo27820(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo27821() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public CharSequence mo27822() {
            throw new IllegalStateException("Not implemented.");
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public void mo27823(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void mo27824() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public void mo27825() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void mo27826() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void mo27827() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥۢۤۦۢ) A[MD:(Yue.ۥۢۤۦۢ):void (m)] (LINE:2) call: Yue.ۥۢۤۦۢ.ۥ۟۟۟۟.<init>(Yue.ۥۢۤۦۢ):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC8339(C8336 c8336, C1488 c1488) {
            this();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8340 extends AbstractC8339 {
        public C8340() {
            super(C8336.this, null);
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4313(int i) {
            return (i == 8192 || i == 4096) && !C8336.this.m27796();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo27812() {
            return true;
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo27818(@InterfaceC6391 C3055 c3055) {
            if (C8336.this.m27796()) {
                return;
            }
            c3055.m6043(C3055.C0034.f4521);
            c3055.m6043(C3055.C0034.f4520);
            c3055.m6097(false);
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public boolean mo27819(int i) {
            if (mo4313(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public CharSequence mo27822() {
            if (mo27812()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC8341 extends RecyclerView.AbstractC8911 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC8341() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: Yue.ۥۢۤۦۢ.ۥ۟۟۟ۡ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AbstractC8341(C1488 c1488) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public final void onItemRangeChanged(int i, int i2, @InterfaceC6490 Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C8342 extends LinearLayoutManager {
        public C8342(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@InterfaceC6391 RecyclerView.C8935 c8935, @InterfaceC6391 int[] iArr) {
            int offscreenPageLimit = C8336.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(c8935, iArr);
                return;
            }
            int pageSize = C8336.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
        public void onInitializeAccessibilityNodeInfo(@InterfaceC6391 RecyclerView.C8929 c8929, @InterfaceC6391 RecyclerView.C8935 c8935, @InterfaceC6391 C3055 c3055) {
            super.onInitializeAccessibilityNodeInfo(c8929, c8935, c3055);
            C8336.this.f24930.mo27818(c3055);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
        public boolean performAccessibilityAction(@InterfaceC6391 RecyclerView.C8929 c8929, @InterfaceC6391 RecyclerView.C8935 c8935, int i, @InterfaceC6490 Bundle bundle) {
            return C8336.this.f24930.mo4313(i) ? C8336.this.f24930.mo27819(i) : super.performAccessibilityAction(c8929, c8935, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
        public boolean requestChildRectangleOnScreen(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 View view, @InterfaceC6391 Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC5459(from = 1)
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8343 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static abstract class AbstractC8344 {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, @InterfaceC6844 int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8345 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public class C8346 extends AbstractC8339 {

        /* JADX INFO: renamed from: ۥ۟ */
        public final InterfaceC3070 f3421;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final InterfaceC3070 f24931;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public RecyclerView.AbstractC8911 f24932;

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ */
        public class C1490 implements InterfaceC3070 {
            public C1490() {
            }

            @Override // Yue.InterfaceC3070
            public boolean perform(@InterfaceC6391 View view, @InterfaceC6490 InterfaceC3070.AbstractC0039 abstractC0039) {
                C8346.this.m27830(((C8336) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟ */
        public class C1491 implements InterfaceC3070 {
            public C1491() {
            }

            @Override // Yue.InterfaceC3070
            public boolean perform(@InterfaceC6391 View view, @InterfaceC6490 InterfaceC3070.AbstractC0039 abstractC0039) {
                C8346.this.m27830(((C8336) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟۟, reason: contains not printable characters */
        public class C8347 extends AbstractC8341 {
            public C8347() {
                super(null);
            }

            @Override // Yue.C8336.AbstractC8341, androidx.recyclerview.widget.RecyclerView.AbstractC8911
            public void onChanged() {
                C8346.this.m27831();
            }
        }

        public C8346() {
            super(C8336.this, null);
            this.f3421 = new C1490();
            this.f24931 = new C1491();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4312() {
            return true;
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo27811(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo27813(@InterfaceC6490 RecyclerView.AbstractC8909<?> abstractC8909) {
            m27831();
            if (abstractC8909 != null) {
                abstractC8909.registerAdapterDataObserver(this.f24932);
            }
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo27814(@InterfaceC6490 RecyclerView.AbstractC8909<?> abstractC8909) {
            if (abstractC8909 != null) {
                abstractC8909.unregisterAdapterDataObserver(this.f24932);
            }
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public String mo27815() {
            if (mo4312()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo27816(@InterfaceC6391 C4066 c4066, @InterfaceC6391 RecyclerView recyclerView) {
            C8273.m27457(recyclerView, 2);
            this.f24932 = new C8347();
            if (C8273.m27351(C8336.this) == 0) {
                C8273.m27457(C8336.this, 1);
            }
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo27817(AccessibilityNodeInfo accessibilityNodeInfo) {
            m27828(accessibilityNodeInfo);
            m27829(accessibilityNodeInfo);
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo27820(int i, Bundle bundle) {
            if (!mo27811(i, bundle)) {
                throw new IllegalStateException();
            }
            m27830(i == 8192 ? C8336.this.getCurrentItem() - 1 : C8336.this.getCurrentItem() + 1);
            return true;
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo27821() {
            m27831();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public void mo27823(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(C8336.this);
            accessibilityEvent.setClassName(mo27815());
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public void mo27824() {
            m27831();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public void mo27825() {
            m27831();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public void mo27826() {
            m27831();
        }

        @Override // Yue.C8336.AbstractC8339
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo27827() {
            m27831();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final void m27828(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (C8336.this.getAdapter() == null) {
                itemCount = 0;
                itemCount2 = 0;
            } else if (C8336.this.getOrientation() == 1) {
                itemCount = C8336.this.getAdapter().getItemCount();
                itemCount2 = 0;
            } else {
                itemCount2 = C8336.this.getAdapter().getItemCount();
                itemCount = 0;
            }
            C3055.m5950(accessibilityNodeInfo).m6059(C3055.C3059.m6139(itemCount, itemCount2, false, 0));
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final void m27829(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.AbstractC8909 adapter = C8336.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !C8336.this.m27796()) {
                return;
            }
            if (C8336.this.f24914 > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (C8336.this.f24914 < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void m27830(int i) {
            if (C8336.this.m27796()) {
                C8336.this.m27804(i, true);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public void m27831() {
            int itemCount;
            C8336 c8336 = C8336.this;
            int i = R.id.accessibilityActionPageLeft;
            C8273.m27429(c8336, R.id.accessibilityActionPageLeft);
            C8273.m27429(c8336, R.id.accessibilityActionPageRight);
            C8273.m27429(c8336, R.id.accessibilityActionPageUp);
            C8273.m27429(c8336, R.id.accessibilityActionPageDown);
            if (C8336.this.getAdapter() == null || (itemCount = C8336.this.getAdapter().getItemCount()) == 0 || !C8336.this.m27796()) {
                return;
            }
            if (C8336.this.getOrientation() != 0) {
                if (C8336.this.f24914 < itemCount - 1) {
                    C8273.m27432(c8336, new C3055.C0034(R.id.accessibilityActionPageDown, null), null, this.f3421);
                }
                if (C8336.this.f24914 > 0) {
                    C8273.m27432(c8336, new C3055.C0034(R.id.accessibilityActionPageUp, null), null, this.f24931);
                    return;
                }
                return;
            }
            boolean zM27795 = C8336.this.m27795();
            int i2 = zM27795 ? 16908360 : 16908361;
            if (zM27795) {
                i = 16908361;
            }
            if (C8336.this.f24914 < itemCount - 1) {
                C8273.m27432(c8336, new C3055.C0034(i2, null), null, this.f3421);
            }
            if (C8336.this.f24914 > 0) {
                C8273.m27432(c8336, new C3055.C0034(i, null), null, this.f24931);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public interface InterfaceC8348 {
        /* JADX INFO: renamed from: ۥ */
        void mo1019(@InterfaceC6391 View view, float f);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public class C8349 extends C8988 {
        public C8349() {
        }

        @Override // androidx.recyclerview.widget.C8988, androidx.recyclerview.widget.AbstractC8992
        @InterfaceC6490
        public View findSnapView(RecyclerView.AbstractC8919 abstractC8919) {
            if (C8336.this.m27794()) {
                return null;
            }
            return super.findSnapView(abstractC8919);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠, reason: contains not printable characters */
    public class C8350 extends RecyclerView {
        public C8350(@InterfaceC6391 Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @InterfaceC7113(23)
        public CharSequence getAccessibilityClassName() {
            return C8336.this.f24930.mo27812() ? C8336.this.f24930.mo27822() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(C8336.this.f24914);
            accessibilityEvent.setToIndex(C8336.this.f24914);
            C8336.this.f24930.mo27823(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return C8336.this.m27796() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C8336.this.m27796() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8352 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static class RunnableC8353 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int f24939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final RecyclerView f24940;

        public RunnableC8353(int i, RecyclerView recyclerView) {
            this.f24939 = i;
            this.f24940 = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24940.smoothScrollToPosition(this.f24939);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8336(@InterfaceC6391 Context context) {
        super(context);
        this.f24911 = new Rect();
        this.f24912 = new Rect();
        this.f24913 = new C4066(3);
        this.f24915 = false;
        this.f24916 = new C1488();
        this.f24918 = -1;
        this.f24926 = null;
        this.f24927 = false;
        this.f24928 = true;
        this.f24929 = -1;
        m27792(context, null);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f24920.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f24920.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C8351) {
            int i = ((C8351) parcelable).f24936;
            sparseArray.put(this.f24920.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m27802();
    }

    @Override // android.view.ViewGroup, android.view.View
    @InterfaceC7113(23)
    public CharSequence getAccessibilityClassName() {
        return this.f24930.mo4312() ? this.f24930.mo27815() : super.getAccessibilityClassName();
    }

    @InterfaceC6490
    public RecyclerView.AbstractC8909 getAdapter() {
        return this.f24920.getAdapter();
    }

    public int getCurrentItem() {
        return this.f24914;
    }

    public int getItemDecorationCount() {
        return this.f24920.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f24929;
    }

    public int getOrientation() {
        return this.f24917.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f24920;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f24922.m22683();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f24930.mo27817(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f24920.getMeasuredWidth();
        int measuredHeight = this.f24920.getMeasuredHeight();
        this.f24911.left = getPaddingLeft();
        this.f24911.right = (i3 - i) - getPaddingRight();
        this.f24911.top = getPaddingTop();
        this.f24911.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f24911, this.f24912);
        RecyclerView recyclerView = this.f24920;
        Rect rect = this.f24912;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f24915) {
            m27809();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f24920, i, i2);
        int measuredWidth = this.f24920.getMeasuredWidth();
        int measuredHeight = this.f24920.getMeasuredHeight();
        int measuredState = this.f24920.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8351)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8351 c8351 = (C8351) parcelable;
        super.onRestoreInstanceState(c8351.getSuperState());
        this.f24918 = c8351.f24937;
        this.f24919 = c8351.f24938;
    }

    @Override // android.view.View
    @InterfaceC6490
    public Parcelable onSaveInstanceState() {
        C8351 c8351 = new C8351(super.onSaveInstanceState());
        c8351.f24936 = this.f24920.getId();
        int i = this.f24918;
        if (i == -1) {
            i = this.f24914;
        }
        c8351.f24937 = i;
        Parcelable parcelable = this.f24919;
        if (parcelable != null) {
            c8351.f24938 = parcelable;
        } else {
            Object adapter = this.f24920.getAdapter();
            if (adapter instanceof InterfaceC7593) {
                c8351.f24938 = ((InterfaceC7593) adapter).saveState();
            }
        }
        return c8351;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(C8336.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    @InterfaceC7113(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.f24930.mo27811(i, bundle) ? this.f24930.mo27820(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(@InterfaceC6490 RecyclerView.AbstractC8909 abstractC8909) {
        RecyclerView.AbstractC8909 adapter = this.f24920.getAdapter();
        this.f24930.mo27814(adapter);
        m27807(adapter);
        this.f24920.setAdapter(abstractC8909);
        this.f24914 = 0;
        m27802();
        this.f24930.mo27813(abstractC8909);
        m27797(abstractC8909);
    }

    public void setCurrentItem(int i) {
        m27803(i, true);
    }

    @Override // android.view.View
    @InterfaceC7113(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f24930.mo27824();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f24929 = i;
        this.f24920.requestLayout();
    }

    public void setOrientation(int i) {
        this.f24917.setOrientation(i);
        this.f24930.mo27826();
    }

    public void setPageTransformer(@InterfaceC6490 InterfaceC8348 interfaceC8348) {
        if (interfaceC8348 != null) {
            if (!this.f24927) {
                this.f24926 = this.f24920.getItemAnimator();
                this.f24927 = true;
            }
            this.f24920.setItemAnimator(null);
        } else if (this.f24927) {
            this.f24920.setItemAnimator(this.f24926);
            this.f24926 = null;
            this.f24927 = false;
        }
        if (interfaceC8348 == this.f24925.m3052()) {
            return;
        }
        this.f24925.m3053(interfaceC8348);
        m27801();
    }

    public void setUserInputEnabled(boolean z) {
        this.f24928 = z;
        this.f24930.mo27827();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4309(@InterfaceC6391 RecyclerView.AbstractC8918 abstractC8918) {
        this.f24920.addItemDecoration(abstractC8918);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4310(@InterfaceC6391 RecyclerView.AbstractC8918 abstractC8918, int i) {
        this.f24920.addItemDecoration(abstractC8918, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m27787() {
        return this.f24924.m1693();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m27788() {
        return this.f24924.m14464();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final RecyclerView.InterfaceC8923 m27789() {
        return new C8338();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m27790(@InterfaceC6844 @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.f24924.m14465(f);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public RecyclerView.AbstractC8918 m27791(int i) {
        return this.f24920.getItemDecorationAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m27792(Context context, AttributeSet attributeSet) {
        this.f24930 = f24910 ? new C8346() : new C8340();
        C8350 c8350 = new C8350(context);
        this.f24920 = c8350;
        c8350.setId(C8273.m27331());
        this.f24920.setDescendantFocusability(131072);
        C8342 c8342 = new C8342(context);
        this.f24917 = c8342;
        this.f24920.setLayoutManager(c8342);
        this.f24920.setScrollingTouchSlop(1);
        m27805(context, attributeSet);
        this.f24920.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f24920.addOnChildAttachStateChangeListener(m27789());
        C7244 c7244 = new C7244(this);
        this.f24922 = c7244;
        this.f24924 = new C4787(this, c7244, this.f24920);
        C8349 c8349 = new C8349();
        this.f24921 = c8349;
        c8349.attachToRecyclerView(this.f24920);
        this.f24920.addOnScrollListener(this.f24922);
        C4066 c4066 = new C4066(3);
        this.f24923 = c4066;
        this.f24922.m22693(c4066);
        C1489 c1489 = new C1489();
        C8337 c8337 = new C8337();
        this.f24923.m1017(c1489);
        this.f24923.m1017(c8337);
        this.f24930.mo27816(this.f24923, this.f24920);
        this.f24923.m1017(this.f24913);
        C6593 c6593 = new C6593(this.f24917);
        this.f24925 = c6593;
        this.f24923.m1017(c6593);
        RecyclerView recyclerView = this.f24920;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27793() {
        this.f24920.invalidateItemDecorations();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m27794() {
        return this.f24924.m14466();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m27795() {
        return this.f24917.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m27796() {
        return this.f24928;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m27797(@InterfaceC6490 RecyclerView.AbstractC8909<?> abstractC8909) {
        if (abstractC8909 != null) {
            abstractC8909.registerAdapterDataObserver(this.f24916);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m27798(@InterfaceC6391 AbstractC8344 abstractC8344) {
        this.f24913.m1017(abstractC8344);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m27799(@InterfaceC6391 RecyclerView.AbstractC8918 abstractC8918) {
        this.f24920.removeItemDecoration(abstractC8918);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m27800(int i) {
        this.f24920.removeItemDecorationAt(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m27801() {
        if (this.f24925.m3052() == null) {
            return;
        }
        double dM22682 = this.f24922.m22682();
        int i = (int) dM22682;
        float f = (float) (dM22682 - ((double) i));
        this.f24925.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m27802() {
        RecyclerView.AbstractC8909 adapter;
        if (this.f24918 == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f24919;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC7593) {
                ((InterfaceC7593) adapter).mo3750(parcelable);
            }
            this.f24919 = null;
        }
        int iMax = Math.max(0, Math.min(this.f24918, adapter.getItemCount() - 1));
        this.f24914 = iMax;
        this.f24918 = -1;
        this.f24920.scrollToPosition(iMax);
        this.f24930.mo27821();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m27803(int i, boolean z) {
        if (m27794()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m27804(i, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m27804(int i, boolean z) {
        RecyclerView.AbstractC8909 adapter = getAdapter();
        if (adapter == null) {
            if (this.f24918 != -1) {
                this.f24918 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        if (iMin == this.f24914 && this.f24922.m22686()) {
            return;
        }
        int i2 = this.f24914;
        if (iMin == i2 && z) {
            return;
        }
        double dM22682 = i2;
        this.f24914 = iMin;
        this.f24930.mo27825();
        if (!this.f24922.m22686()) {
            dM22682 = this.f24922.m22682();
        }
        this.f24922.m22691(iMin, z);
        if (!z) {
            this.f24920.scrollToPosition(iMin);
            return;
        }
        double d = iMin;
        if (Math.abs(d - dM22682) <= 3.0d) {
            this.f24920.smoothScrollToPosition(iMin);
            return;
        }
        this.f24920.scrollToPosition(d > dM22682 ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f24920;
        recyclerView.post(new RunnableC8353(iMin, recyclerView));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m27805(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6965.C6973.f20740);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C6965.C6973.f20740, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(C6965.C6973.f20741, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m27806() {
        View viewFindSnapView = this.f24921.findSnapView(this.f24917);
        if (viewFindSnapView == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = this.f24921.calculateDistanceToFinalSnap(this.f24917, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f24920.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m27807(@InterfaceC6490 RecyclerView.AbstractC8909<?> abstractC8909) {
        if (abstractC8909 != null) {
            abstractC8909.unregisterAdapterDataObserver(this.f24916);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m27808(@InterfaceC6391 AbstractC8344 abstractC8344) {
        this.f24913.m1018(abstractC8344);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m27809() {
        C8988 c8988 = this.f24921;
        if (c8988 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = c8988.findSnapView(this.f24917);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f24917.getPosition(viewFindSnapView);
        if (position != this.f24914 && getScrollState() == 0) {
            this.f24923.onPageSelected(position);
        }
        this.f24915 = false;
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C8351 extends View.BaseSavedState {
        public static final Parcelable.Creator<C8351> CREATOR = new C1492();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f24936;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f24937;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Parcelable f24938;

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ */
        public static class C1492 implements Parcelable.ClassLoaderCreator<C8351> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8351 createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8351 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C8351(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C8351[] newArray(int i) {
                return new C8351[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC7113(24)
        public C8351(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m4314(parcel, classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24936);
            parcel.writeInt(this.f24937);
            parcel.writeParcelable(this.f24938, i);
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4314(Parcel parcel, ClassLoader classLoader) {
            this.f24936 = parcel.readInt();
            this.f24937 = parcel.readInt();
            this.f24938 = parcel.readParcelable(classLoader);
        }

        public C8351(Parcel parcel) {
            super(parcel);
            m4314(parcel, null);
        }

        public C8351(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public C8336(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24911 = new Rect();
        this.f24912 = new Rect();
        this.f24913 = new C4066(3);
        this.f24915 = false;
        this.f24916 = new C1488();
        this.f24918 = -1;
        this.f24926 = null;
        this.f24927 = false;
        this.f24928 = true;
        this.f24929 = -1;
        m27792(context, attributeSet);
    }

    public C8336(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24911 = new Rect();
        this.f24912 = new Rect();
        this.f24913 = new C4066(3);
        this.f24915 = false;
        this.f24916 = new C1488();
        this.f24918 = -1;
        this.f24926 = null;
        this.f24927 = false;
        this.f24928 = true;
        this.f24929 = -1;
        m27792(context, attributeSet);
    }

    @InterfaceC7113(21)
    public C8336(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24911 = new Rect();
        this.f24912 = new Rect();
        this.f24913 = new C4066(3);
        this.f24915 = false;
        this.f24916 = new C1488();
        this.f24918 = -1;
        this.f24926 = null;
        this.f24927 = false;
        this.f24928 = true;
        this.f24929 = -1;
        m27792(context, attributeSet);
    }
}
