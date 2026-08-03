package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.C1066R;
import com.google.android.material.C1247R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000a.AbstractC0792r;
import p000a.C0038C;
import p000a.C0146I;
import p000a.C0181Jg;
import p000a.C0253Ng;
import p000a.C0324Rg;
import p000a.C0336Sa;
import p000a.C0354Ta;
import p000a.C0393Vd;
import p000a.C0498b9;
import p000a.C0715mh;
import p000a.C0726n9;
import p000a.C0805rc;
import p000a.C0852u2;
import p000a.C0866ug;
import p000a.C0871v2;
import p000a.C0890w2;
import p000a.C0899wb;
import p000a.C0944z;
import p000a.C0961zg;
import p000a.ViewOnAttachStateChangeListenerC0271Og;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC1059c<V> {

    /* JADX INFO: renamed from: e0 */
    public static final int f5434e0 = C1247R.style.Widget_Design_BottomSheet_Modal;

    /* JADX INFO: renamed from: A */
    public final BottomSheetBehavior<V>.C1264e f5435A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f5436B;

    /* JADX INFO: renamed from: C */
    public final int f5437C;

    /* JADX INFO: renamed from: D */
    public int f5438D;

    /* JADX INFO: renamed from: E */
    public int f5439E;

    /* JADX INFO: renamed from: F */
    public final float f5440F;

    /* JADX INFO: renamed from: G */
    public int f5441G;

    /* JADX INFO: renamed from: H */
    public final float f5442H;

    /* JADX INFO: renamed from: I */
    public boolean f5443I;

    /* JADX INFO: renamed from: J */
    public boolean f5444J;

    /* JADX INFO: renamed from: K */
    public final boolean f5445K;

    /* JADX INFO: renamed from: L */
    public int f5446L;

    /* JADX INFO: renamed from: M */
    public C0961zg f5447M;

    /* JADX INFO: renamed from: N */
    public boolean f5448N;

    /* JADX INFO: renamed from: O */
    public int f5449O;

    /* JADX INFO: renamed from: P */
    public boolean f5450P;

    /* JADX INFO: renamed from: Q */
    public final float f5451Q;

    /* JADX INFO: renamed from: R */
    public int f5452R;

    /* JADX INFO: renamed from: S */
    public int f5453S;

    /* JADX INFO: renamed from: T */
    public int f5454T;

    /* JADX INFO: renamed from: U */
    public WeakReference<V> f5455U;

    /* JADX INFO: renamed from: V */
    public WeakReference<View> f5456V;

    /* JADX INFO: renamed from: W */
    public final ArrayList<AbstractC1262c> f5457W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f5458X;

    /* JADX INFO: renamed from: Y */
    public int f5459Y;

    /* JADX INFO: renamed from: Z */
    public int f5460Z;

    /* JADX INFO: renamed from: a */
    public final int f5461a;

    /* JADX INFO: renamed from: a0 */
    public boolean f5462a0;

    /* JADX INFO: renamed from: b */
    public boolean f5463b;

    /* JADX INFO: renamed from: b0 */
    public HashMap f5464b0;

    /* JADX INFO: renamed from: c */
    public final float f5465c;

    /* JADX INFO: renamed from: c0 */
    public final SparseIntArray f5466c0;

    /* JADX INFO: renamed from: d */
    public final int f5467d;

    /* JADX INFO: renamed from: d0 */
    public final C1261b f5468d0;

    /* JADX INFO: renamed from: e */
    public int f5469e;

    /* JADX INFO: renamed from: f */
    public boolean f5470f;

    /* JADX INFO: renamed from: g */
    public int f5471g;

    /* JADX INFO: renamed from: h */
    public final int f5472h;

    /* JADX INFO: renamed from: i */
    public final C0354Ta f5473i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f5474j;

    /* JADX INFO: renamed from: k */
    public final int f5475k;

    /* JADX INFO: renamed from: l */
    public final int f5476l;

    /* JADX INFO: renamed from: m */
    public int f5477m;

    /* JADX INFO: renamed from: n */
    public final boolean f5478n;

    /* JADX INFO: renamed from: o */
    public final boolean f5479o;

    /* JADX INFO: renamed from: p */
    public final boolean f5480p;

    /* JADX INFO: renamed from: q */
    public final boolean f5481q;

    /* JADX INFO: renamed from: r */
    public final boolean f5482r;

    /* JADX INFO: renamed from: s */
    public final boolean f5483s;

    /* JADX INFO: renamed from: t */
    public final boolean f5484t;

    /* JADX INFO: renamed from: u */
    public final boolean f5485u;

    /* JADX INFO: renamed from: v */
    public int f5486v;

    /* JADX INFO: renamed from: w */
    public int f5487w;

    /* JADX INFO: renamed from: x */
    public final boolean f5488x;

    /* JADX INFO: renamed from: y */
    public final C0393Vd f5489y;

    /* JADX INFO: renamed from: z */
    public boolean f5490z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC1260a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f5491a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5492b;

        public RunnableC1260a(View view, int i) {
            this.f5491a = view;
            this.f5492b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BottomSheetBehavior.f5434e0;
            BottomSheetBehavior.this.m3102F(this.f5491a, this.f5492b, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C1261b extends C0961zg.c {
        public C1261b() {
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: a */
        public final int mo2267a(View view, int i) {
            return view.getLeft();
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: b */
        public final int mo2268b(View view, int i) {
            return C0726n9.m1667j(i, BottomSheetBehavior.this.m3111y(), mo2270d());
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: d */
        public final int mo2270d() {
            int i = BottomSheetBehavior.f5434e0;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f5443I ? bottomSheetBehavior.f5454T : bottomSheetBehavior.f5441G;
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: f */
        public final void mo2272f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f5445K) {
                    bottomSheetBehavior.m3100D(1);
                }
            }
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: g */
        public final void mo2273g(View view, int i, int i2) {
            BottomSheetBehavior.this.m3110v(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo2274h(View view, float f, float f2) {
            int i = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (bottomSheetBehavior.f5463b) {
                    i = 3;
                } else {
                    int top2 = view.getTop();
                    System.currentTimeMillis();
                    bottomSheetBehavior.getClass();
                    if (top2 <= bottomSheetBehavior.f5439E) {
                    }
                }
            } else if (bottomSheetBehavior.f5443I && bottomSheetBehavior.m3101E(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f5467d) {
                    if (view.getTop() > (bottomSheetBehavior.m3111y() + bottomSheetBehavior.f5454T) / 2) {
                        i = 5;
                    } else if (bottomSheetBehavior.f5463b || Math.abs(view.getTop() - bottomSheetBehavior.m3111y()) < Math.abs(view.getTop() - bottomSheetBehavior.f5439E)) {
                    }
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top3 = view.getTop();
                if (!bottomSheetBehavior.f5463b) {
                    int i2 = bottomSheetBehavior.f5439E;
                    if (top3 < i2) {
                        if (top3 >= Math.abs(top3 - bottomSheetBehavior.f5441G)) {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top3 - i2) < Math.abs(top3 - bottomSheetBehavior.f5441G)) {
                        bottomSheetBehavior.getClass();
                    }
                } else if (Math.abs(top3 - bottomSheetBehavior.f5438D) >= Math.abs(top3 - bottomSheetBehavior.f5441G)) {
                    i = 4;
                }
            } else if (!bottomSheetBehavior.f5463b) {
                int top4 = view.getTop();
                if (Math.abs(top4 - bottomSheetBehavior.f5439E) < Math.abs(top4 - bottomSheetBehavior.f5441G)) {
                    bottomSheetBehavior.getClass();
                }
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.m3102F(view, i, true);
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: i */
        public final boolean mo2275i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f5446L;
            if (i2 == 1 || bottomSheetBehavior.f5462a0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f5459Y == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f5456V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f5455U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public static abstract class AbstractC1262c {
        /* JADX INFO: renamed from: a */
        public abstract void m3113a();

        /* JADX INFO: renamed from: b */
        public abstract void m3114b();
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C1264e {

        /* JADX INFO: renamed from: a */
        public int f5500a;

        /* JADX INFO: renamed from: b */
        public boolean f5501b;

        /* JADX INFO: renamed from: c */
        public final a f5502c = new a();

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1264e c1264e = C1264e.this;
                c1264e.f5501b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                C0961zg c0961zg = bottomSheetBehavior.f5447M;
                if (c0961zg != null && c0961zg.m2255f()) {
                    c1264e.m3115a(c1264e.f5500a);
                } else if (bottomSheetBehavior.f5446L == 2) {
                    bottomSheetBehavior.m3100D(c1264e.f5500a);
                }
            }
        }

        public C1264e() {
        }

        /* JADX INFO: renamed from: a */
        public final void m3115a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f5455U;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f5500a = i;
            if (this.f5501b) {
                return;
            }
            V v = bottomSheetBehavior.f5455U.get();
            a aVar = this.f5502c;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            v.postOnAnimation(aVar);
            this.f5501b = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomSheetBehavior() {
        this.f5461a = 0;
        this.f5463b = true;
        this.f5475k = -1;
        this.f5476l = -1;
        this.f5435A = new C1264e();
        this.f5440F = 0.5f;
        this.f5442H = -1.0f;
        this.f5445K = true;
        this.f5446L = 4;
        this.f5451Q = 0.1f;
        this.f5457W = new ArrayList<>();
        this.f5460Z = -1;
        this.f5466c0 = new SparseIntArray();
        this.f5468d0 = new C1261b();
    }

    /* JADX INFO: renamed from: w */
    public static View m3095w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (C0866ug.d.m2024p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM3095w = m3095w(viewGroup.getChildAt(i));
            if (viewM3095w != null) {
                return viewM3095w;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static int m3096x(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m3097A() {
        WeakReference<V> weakReference = this.f5455U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.f5455U.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final void m3098B(int i) {
        if (i == -1) {
            if (this.f5470f) {
                return;
            } else {
                this.f5470f = true;
            }
        } else {
            if (!this.f5470f && this.f5469e == i) {
                return;
            }
            this.f5470f = false;
            this.f5469e = Math.max(0, i);
        }
        m3106J();
    }

    /* JADX INFO: renamed from: C */
    public final void m3099C(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(C0944z.m2228h(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f5443I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f5463b && m3112z(i) <= this.f5438D) ? 3 : i;
        WeakReference<V> weakReference = this.f5455U;
        if (weakReference == null || weakReference.get() == null) {
            m3100D(i);
            return;
        }
        V v = this.f5455U.get();
        RunnableC1260a runnableC1260a = new RunnableC1260a(v, i2);
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (v.isAttachedToWindow()) {
                v.post(runnableC1260a);
                return;
            }
        }
        runnableC1260a.run();
    }

    /* JADX INFO: renamed from: D */
    public final void m3100D(int i) {
        if (this.f5446L == i) {
            return;
        }
        this.f5446L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f5443I;
        }
        WeakReference<V> weakReference = this.f5455U;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            m3105I(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m3105I(false);
        }
        m3104H(i, true);
        while (true) {
            ArrayList<AbstractC1262c> arrayList = this.f5457W;
            if (i2 >= arrayList.size()) {
                m3103G();
                return;
            } else {
                arrayList.get(i2).m3114b();
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m3101E(View view, float f) {
        if (this.f5444J) {
            return true;
        }
        if (view.getTop() < this.f5441G) {
            return false;
        }
        return Math.abs(((f * this.f5451Q) + ((float) view.getTop())) - ((float) this.f5441G)) / ((float) m3109u()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m3100D(2);
        m3104H(r4, true);
        r2.f5435A.m3115a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m2264o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3102F(View view, int i, boolean z) {
        int iM3112z = m3112z(i);
        C0961zg c0961zg = this.f5447M;
        if (c0961zg != null) {
            if (!z) {
                int left = view.getLeft();
                c0961zg.f3588r = view;
                c0961zg.f3573c = -1;
                boolean zM2257h = c0961zg.m2257h(left, iM3112z, 0, 0);
                if (!zM2257h && c0961zg.f3571a == 0 && c0961zg.f3588r != null) {
                    c0961zg.f3588r = null;
                }
            }
        }
        m3100D(i);
    }

    /* JADX INFO: renamed from: G */
    public final void m3103G() {
        V v;
        int iM384a;
        WeakReference<V> weakReference = this.f5455U;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C0866ug.m2000g(v, 524288);
        C0866ug.m1998e(v, 0);
        C0866ug.m2000g(v, 262144);
        C0866ug.m1998e(v, 0);
        C0866ug.m2000g(v, 1048576);
        C0866ug.m1998e(v, 0);
        SparseIntArray sparseIntArray = this.f5466c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            C0866ug.m2000g(v, i);
            C0866ug.m1998e(v, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f5463b && this.f5446L != 6) {
            String string = v.getResources().getString(C1247R.string.bottomsheet_action_expand_halfway);
            C0890w2 c0890w2 = new C0890w2(this, 6);
            ArrayList arrayListM1996c = C0866ug.m1996c(v);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListM1996c.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        int i5 = C0866ug.f3398d[i4];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListM1996c.size(); i6++) {
                            z &= ((C0146I.a) arrayListM1996c.get(i6)).m384a() != i5;
                        }
                        if (z) {
                            i3 = i5;
                        }
                    }
                    iM384a = i3;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0146I.a) arrayListM1996c.get(i2)).f515a).getLabel())) {
                        iM384a = ((C0146I.a) arrayListM1996c.get(i2)).m384a();
                        break;
                    }
                    i2++;
                }
            }
            if (iM384a != -1) {
                C0146I.a aVar = new C0146I.a(null, iM384a, string, c0890w2, null);
                View.AccessibilityDelegate accessibilityDelegateM1995b = C0866ug.m1995b(v);
                C0038C c0038c = accessibilityDelegateM1995b == null ? null : accessibilityDelegateM1995b instanceof C0038C.a ? ((C0038C.a) accessibilityDelegateM1995b).f139a : new C0038C(accessibilityDelegateM1995b);
                if (c0038c == null) {
                    c0038c = new C0038C();
                }
                C0866ug.m2003j(v, c0038c);
                C0866ug.m2000g(v, aVar.m384a());
                C0866ug.m1996c(v).add(aVar);
                C0866ug.m1998e(v, 0);
            }
            sparseIntArray.put(0, iM384a);
        }
        if (this.f5443I && this.f5446L != 5) {
            C0866ug.m2001h(v, C0146I.a.f512j, new C0890w2(this, 5));
        }
        int i7 = this.f5446L;
        if (i7 == 3) {
            C0866ug.m2001h(v, C0146I.a.f511i, new C0890w2(this, this.f5463b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            C0866ug.m2001h(v, C0146I.a.f510h, new C0890w2(this, this.f5463b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            C0866ug.m2001h(v, C0146I.a.f511i, new C0890w2(this, 4));
            C0866ug.m2001h(v, C0146I.a.f510h, new C0890w2(this, 3));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m3104H(int i, boolean z) {
        C0354Ta c0354Ta = this.f5473i;
        ValueAnimator valueAnimator = this.f5436B;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f5446L == 3 && (this.f5488x || m3097A());
        if (this.f5490z == z2 || c0354Ta == null) {
            return;
        }
        this.f5490z = z2;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0354Ta.f1310a.f1342i, z2 ? m3108t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM3108t = this.f5490z ? m3108t() : 1.0f;
        C0354Ta.b bVar = c0354Ta.f1310a;
        if (bVar.f1342i != fM3108t) {
            bVar.f1342i = fM3108t;
            c0354Ta.f1314e = true;
            c0354Ta.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m3105I(boolean z) {
        WeakReference<V> weakReference = this.f5455U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f5464b0 != null) {
                    return;
                } else {
                    this.f5464b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f5455U.get() && z) {
                    this.f5464b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f5464b0 = null;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m3106J() {
        V v;
        if (this.f5455U != null) {
            m3107s();
            if (this.f5446L != 4 || (v = this.f5455U.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: c */
    public final void mo2456c(CoordinatorLayout.C1062f c1062f) {
        this.f5455U = null;
        this.f5447M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: f */
    public final void mo2459f() {
        this.f5455U = null;
        this.f5447M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: g */
    public final boolean mo1271g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        C0961zg c0961zg;
        if (!v.isShown() || !this.f5445K) {
            this.f5448N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5459Y = -1;
            this.f5460Z = -1;
            VelocityTracker velocityTracker = this.f5458X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5458X = null;
            }
        }
        if (this.f5458X == null) {
            this.f5458X = VelocityTracker.obtain();
        }
        this.f5458X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f5460Z = (int) motionEvent.getY();
            if (this.f5446L != 2) {
                WeakReference<View> weakReference = this.f5456V;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m2446l(view, x, this.f5460Z)) {
                    this.f5459Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5462a0 = true;
                }
            }
            this.f5448N = this.f5459Y == -1 && !coordinatorLayout.m2446l(v, x, this.f5460Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5462a0 = false;
            this.f5459Y = -1;
            if (this.f5448N) {
                this.f5448N = false;
                return false;
            }
        }
        if (this.f5448N || (c0961zg = this.f5447M) == null || !c0961zg.m2265p(motionEvent)) {
            WeakReference<View> weakReference2 = this.f5456V;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.f5448N || this.f5446L == 1 || coordinatorLayout.m2446l(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f5447M == null || (i = this.f5460Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f5447M.f3572b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: h */
    public final boolean mo371h(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = this.f5476l;
        C0354Ta c0354Ta = this.f5473i;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.f5455U == null) {
            this.f5471g = coordinatorLayout.getResources().getDimensionPixelSize(C1247R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z = (i4 < 29 || this.f5478n || this.f5470f) ? false : true;
            if (this.f5479o || this.f5480p || this.f5481q || this.f5483s || this.f5484t || this.f5485u || z) {
                C0871v2 c0871v2 = new C0871v2(this, z);
                int paddingStart = v.getPaddingStart();
                v.getPaddingTop();
                int paddingEnd = v.getPaddingEnd();
                int paddingBottom = v.getPaddingBottom();
                C0324Rg.a aVar = new C0324Rg.a();
                aVar.f1157a = paddingStart;
                aVar.f1158b = paddingEnd;
                aVar.f1159c = paddingBottom;
                C0866ug.d.m2029u(v, new C0253Ng(c0871v2, aVar));
                if (v.isAttachedToWindow()) {
                    C0866ug.c.m2008c(v);
                } else {
                    v.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0271Og());
                }
            }
            C0498b9 c0498b9 = new C0498b9(v);
            if (i4 >= 30) {
                v.setWindowInsetsAnimationCallback(new C0715mh.d.a(c0498b9));
            } else {
                PathInterpolator pathInterpolator = C0715mh.c.f2709e;
                Object tag = v.getTag(C1066R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener aVar2 = new C0715mh.c.a(v, c0498b9);
                v.setTag(C1066R.id.tag_window_insets_animation_callback, aVar2);
                if (tag == null) {
                    v.setOnApplyWindowInsetsListener(aVar2);
                }
            }
            this.f5455U = new WeakReference<>(v);
            Context context = v.getContext();
            C0899wb.m2188d(context, C1247R.attr.motionEasingStandardDecelerateInterpolator, C0805rc.m1882b(0.0f, 0.0f, 0.0f, 1.0f));
            C0899wb.m2187c(context, C1247R.attr.motionDurationMedium2, 300);
            C0899wb.m2187c(context, C1247R.attr.motionDurationShort3, 150);
            C0899wb.m2187c(context, C1247R.attr.motionDurationShort2, 100);
            Resources resources = v.getResources();
            resources.getDimension(C1247R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(C1247R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c0354Ta != null) {
                v.setBackground(c0354Ta);
                float fM2017i = this.f5442H;
                if (fM2017i == -1.0f) {
                    fM2017i = C0866ug.d.m2017i(v);
                }
                c0354Ta.m966j(fM2017i);
            } else {
                ColorStateList colorStateList = this.f5474j;
                if (colorStateList != null) {
                    C0866ug.d.m2025q(v, colorStateList);
                }
            }
            m3103G();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.f5447M == null) {
            this.f5447M = new C0961zg(coordinatorLayout.getContext(), coordinatorLayout, this.f5468d0);
        }
        int top2 = v.getTop();
        coordinatorLayout.m2448q(v, i);
        this.f5453S = coordinatorLayout.getWidth();
        this.f5454T = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f5452R = height;
        int iMin = this.f5454T;
        int i5 = iMin - height;
        int i6 = this.f5487w;
        if (i5 < i6) {
            if (this.f5482r) {
                if (i2 != -1) {
                    iMin = Math.min(iMin, i2);
                }
                this.f5452R = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i2 != -1) {
                    iMin2 = Math.min(iMin2, i2);
                }
                this.f5452R = iMin2;
            }
        }
        this.f5438D = Math.max(0, this.f5454T - this.f5452R);
        this.f5439E = (int) ((1.0f - this.f5440F) * this.f5454T);
        m3107s();
        int i7 = this.f5446L;
        if (i7 == 3) {
            v.offsetTopAndBottom(m3111y());
        } else if (i7 == 6) {
            v.offsetTopAndBottom(this.f5439E);
        } else if (this.f5443I && i7 == 5) {
            v.offsetTopAndBottom(this.f5454T);
        } else if (i7 == 4) {
            v.offsetTopAndBottom(this.f5441G);
        } else if (i7 == 1 || i7 == 2) {
            v.offsetTopAndBottom(top2 - v.getTop());
        }
        m3104H(this.f5446L, false);
        this.f5456V = new WeakReference<>(m3095w(v));
        while (true) {
            ArrayList<AbstractC1262c> arrayList = this.f5457W;
            if (i3 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i3).getClass();
            i3++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: i */
    public final boolean mo1305i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m3096x(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f5475k, marginLayoutParams.width), m3096x(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f5476l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: j */
    public final boolean mo2460j(View view) {
        WeakReference<View> weakReference = this.f5456V;
        return (weakReference == null || view != weakReference.get() || this.f5446L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: k */
    public final void mo2461k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        boolean z = this.f5445K;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f5456V;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top2 = v.getTop();
        int i4 = top2 - i2;
        if (i2 > 0) {
            if (i4 < m3111y()) {
                int iM3111y = top2 - m3111y();
                iArr[1] = iM3111y;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                v.offsetTopAndBottom(-iM3111y);
                m3100D(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                v.offsetTopAndBottom(-i2);
                m3100D(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.f5441G;
            if (i4 > i5 && !this.f5443I) {
                int i6 = top2 - i5;
                iArr[1] = i6;
                WeakHashMap<View, C0181Jg> weakHashMap3 = C0866ug.f3395a;
                v.offsetTopAndBottom(-i6);
                m3100D(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, C0181Jg> weakHashMap4 = C0866ug.f3395a;
                v.offsetTopAndBottom(-i2);
                m3100D(1);
            }
        }
        m3110v(v.getTop());
        this.f5449O = i2;
        this.f5450P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: l */
    public final void mo2462l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: n */
    public final void mo2464n(View view, Parcelable parcelable) {
        C1263d c1263d = (C1263d) parcelable;
        int i = this.f5461a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f5469e = c1263d.f5496d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f5463b = c1263d.f5497e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f5443I = c1263d.f5498f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f5444J = c1263d.f5499g;
            }
        }
        int i2 = c1263d.f5495c;
        if (i2 == 1 || i2 == 2) {
            this.f5446L = 4;
        } else {
            this.f5446L = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: o */
    public final Parcelable mo2465o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1263d(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: p */
    public final boolean mo2466p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f5449O = 0;
        this.f5450P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2467q(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        float yVelocity;
        int i2 = 3;
        if (v.getTop() == m3111y()) {
            m3100D(3);
            return;
        }
        WeakReference<View> weakReference = this.f5456V;
        if (weakReference != null && view == weakReference.get() && this.f5450P) {
            if (this.f5449O > 0) {
                if (!this.f5463b && v.getTop() > this.f5439E) {
                    i2 = 6;
                }
            } else if (this.f5443I) {
                VelocityTracker velocityTracker = this.f5458X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f5465c);
                    yVelocity = this.f5458X.getYVelocity(this.f5459Y);
                }
                if (m3101E(v, yVelocity)) {
                    i2 = 5;
                }
            } else if (this.f5449O == 0) {
                int top2 = v.getTop();
                if (!this.f5463b) {
                    int i3 = this.f5439E;
                    if (top2 < i3) {
                        if (top2 >= Math.abs(top2 - this.f5441G)) {
                        }
                    } else if (Math.abs(top2 - i3) < Math.abs(top2 - this.f5441G)) {
                    }
                    i2 = 6;
                } else if (Math.abs(top2 - this.f5438D) >= Math.abs(top2 - this.f5441G)) {
                    i2 = 4;
                }
            } else {
                if (!this.f5463b) {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f5439E) < Math.abs(top3 - this.f5441G)) {
                    }
                }
                i2 = 4;
            }
            m3102F(v, i2, false);
            this.f5450P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: r */
    public final boolean mo1272r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f5446L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C0961zg c0961zg = this.f5447M;
        if (c0961zg != null && (this.f5445K || i == 1)) {
            c0961zg.m2259j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f5459Y = -1;
            this.f5460Z = -1;
            VelocityTracker velocityTracker = this.f5458X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5458X = null;
            }
        }
        if (this.f5458X == null) {
            this.f5458X = VelocityTracker.obtain();
        }
        this.f5458X.addMovement(motionEvent);
        if (this.f5447M != null && ((this.f5445K || this.f5446L == 1) && actionMasked == 2 && !this.f5448N)) {
            float fAbs = Math.abs(this.f5460Z - motionEvent.getY());
            C0961zg c0961zg2 = this.f5447M;
            if (fAbs > c0961zg2.f3572b) {
                c0961zg2.m2251b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f5448N;
    }

    /* JADX INFO: renamed from: s */
    public final void m3107s() {
        int iM3109u = m3109u();
        if (this.f5463b) {
            this.f5441G = Math.max(this.f5454T - iM3109u, this.f5438D);
        } else {
            this.f5441G = this.f5454T - iM3109u;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m3108t() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.f5473i != null && (weakReference = this.f5455U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.f5455U.get();
            if (m3097A() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                C0354Ta c0354Ta = this.f5473i;
                float fMo1073a = c0354Ta.f1310a.f1334a.f1486e.mo1073a(c0354Ta.m963g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f = (radius <= 0.0f || fMo1073a <= 0.0f) ? 0.0f : radius / fMo1073a;
                }
                C0354Ta c0354Ta2 = this.f5473i;
                float fMo1073a2 = c0354Ta2.f1310a.f1334a.f1487f.mo1073a(c0354Ta2.m963g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo1073a2 > 0.0f) {
                        f2 = radius2 / fMo1073a2;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: u */
    public final int m3109u() {
        int i;
        return this.f5470f ? Math.min(Math.max(this.f5471g, this.f5454T - ((this.f5453S * 9) / 16)), this.f5452R) + this.f5486v : (this.f5478n || this.f5479o || (i = this.f5477m) <= 0) ? this.f5469e + this.f5486v : Math.max(this.f5469e, i + this.f5472h);
    }

    /* JADX INFO: renamed from: v */
    public final void m3110v(int i) {
        if (this.f5455U.get() != null) {
            ArrayList<AbstractC1262c> arrayList = this.f5457W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f5441G;
            if (i <= i2 && i2 != m3111y()) {
                m3111y();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).m3113a();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m3111y() {
        if (this.f5463b) {
            return this.f5438D;
        }
        return Math.max(this.f5437C, this.f5482r ? 0 : this.f5487w);
    }

    /* JADX INFO: renamed from: z */
    public final int m3112z(int i) {
        if (i == 3) {
            return m3111y();
        }
        if (i == 4) {
            return this.f5441G;
        }
        if (i == 5) {
            return this.f5454T;
        }
        if (i == 6) {
            return this.f5439E;
        }
        throw new IllegalArgumentException(C0944z.m2225e("Invalid state to get top offset: ", i));
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public static class C1263d extends AbstractC0792r {
        public static final Parcelable.Creator<C1263d> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public final int f5495c;

        /* JADX INFO: renamed from: d */
        public final int f5496d;

        /* JADX INFO: renamed from: e */
        public final boolean f5497e;

        /* JADX INFO: renamed from: f */
        public final boolean f5498f;

        /* JADX INFO: renamed from: g */
        public final boolean f5499g;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d$a */
        public class a implements Parcelable.ClassLoaderCreator<C1263d> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1263d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1263d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1263d[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1263d(parcel, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1263d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5495c = parcel.readInt();
            this.f5496d = parcel.readInt();
            this.f5497e = parcel.readInt() == 1;
            this.f5498f = parcel.readInt() == 1;
            this.f5499g = parcel.readInt() == 1;
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5495c);
            parcel.writeInt(this.f5496d);
            parcel.writeInt(this.f5497e ? 1 : 0);
            parcel.writeInt(this.f5498f ? 1 : 0);
            parcel.writeInt(this.f5499g ? 1 : 0);
        }

        public C1263d(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f5495c = bottomSheetBehavior.f5446L;
            this.f5496d = bottomSheetBehavior.f5469e;
            this.f5497e = bottomSheetBehavior.f5463b;
            this.f5498f = bottomSheetBehavior.f5443I;
            this.f5499g = bottomSheetBehavior.f5444J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f5461a = 0;
        this.f5463b = true;
        this.f5475k = -1;
        this.f5476l = -1;
        this.f5435A = new C1264e();
        this.f5440F = 0.5f;
        this.f5442H = -1.0f;
        this.f5445K = true;
        this.f5446L = 4;
        this.f5451Q = 0.1f;
        this.f5457W = new ArrayList<>();
        this.f5460Z = -1;
        this.f5466c0 = new SparseIntArray();
        this.f5468d0 = new C1261b();
        this.f5472h = context.getResources().getDimensionPixelSize(C1247R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.f5474j = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f5489y = C0393Vd.m1023b(context, attributeSet, C1247R.attr.bottomSheetStyle, f5434e0).m1028a();
        }
        C0393Vd c0393Vd = this.f5489y;
        if (c0393Vd != null) {
            C0354Ta c0354Ta = new C0354Ta(c0393Vd);
            this.f5473i = c0354Ta;
            c0354Ta.m965i(context);
            ColorStateList colorStateList = this.f5474j;
            if (colorStateList != null) {
                this.f5473i.m967k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f5473i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m3108t(), 1.0f);
        this.f5436B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f5436B.addUpdateListener(new C0852u2(this));
        this.f5442H = typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.f5475k = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.f5476l = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C1247R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m3098B(i);
        } else {
            m3098B(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1247R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.f5443I != z) {
            this.f5443I = z;
            if (!z && this.f5446L == 5) {
                m3099C(4);
            }
            m3103G();
        }
        this.f5478n = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f5463b != z2) {
            this.f5463b = z2;
            if (this.f5455U != null) {
                m3107s();
            }
            m3100D((this.f5463b && this.f5446L == 6) ? 3 : this.f5446L);
            m3104H(this.f5446L, true);
            m3103G();
        }
        this.f5444J = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f5445K = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f5461a = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(C1247R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f5440F = f;
            if (this.f5455U != null) {
                this.f5439E = (int) ((1.0f - f) * this.f5454T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(C1247R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i2 = typedValuePeekValue2.data;
                if (i2 >= 0) {
                    this.f5437C = i2;
                    m3104H(this.f5446L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1247R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f5437C = dimensionPixelOffset;
                    m3104H(this.f5446L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f5467d = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
            this.f5479o = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
            this.f5480p = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
            this.f5481q = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
            this.f5482r = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
            this.f5483s = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
            this.f5484t = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
            this.f5485u = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
            this.f5488x = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f5465c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
