package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.AbstractC0522ce;
import p000a.AbstractC0579fe;
import p000a.AbstractC0792r;
import p000a.C0146I;
import p000a.C0181Jg;
import p000a.C0336Sa;
import p000a.C0354Ta;
import p000a.C0393Vd;
import p000a.C0726n9;
import p000a.C0805rc;
import p000a.C0811s;
import p000a.C0866ug;
import p000a.C0878v9;
import p000a.C0899wb;
import p000a.C0939yd;
import p000a.C0944z;
import p000a.C0961zg;
import p000a.InterfaceC0182K;
import p000a.InterfaceC0503be;
import p000a.RunnableC0221M2;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC1059c<V> {

    /* JADX INFO: renamed from: w */
    public static final int f5830w = C1247R.string.side_sheet_accessibility_pane_title;

    /* JADX INFO: renamed from: x */
    public static final int f5831x = C1247R.style.Widget_Material3_SideSheet;

    /* JADX INFO: renamed from: a */
    public AbstractC0522ce f5832a;

    /* JADX INFO: renamed from: b */
    public final C0354Ta f5833b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f5834c;

    /* JADX INFO: renamed from: d */
    public final C0393Vd f5835d;

    /* JADX INFO: renamed from: e */
    public final SideSheetBehavior<V>.C1306c f5836e;

    /* JADX INFO: renamed from: f */
    public final float f5837f;

    /* JADX INFO: renamed from: g */
    public final boolean f5838g;

    /* JADX INFO: renamed from: h */
    public int f5839h;

    /* JADX INFO: renamed from: i */
    public C0961zg f5840i;

    /* JADX INFO: renamed from: j */
    public boolean f5841j;

    /* JADX INFO: renamed from: k */
    public final float f5842k;

    /* JADX INFO: renamed from: l */
    public int f5843l;

    /* JADX INFO: renamed from: m */
    public int f5844m;

    /* JADX INFO: renamed from: n */
    public int f5845n;

    /* JADX INFO: renamed from: o */
    public int f5846o;

    /* JADX INFO: renamed from: p */
    public WeakReference<V> f5847p;

    /* JADX INFO: renamed from: q */
    public WeakReference<View> f5848q;

    /* JADX INFO: renamed from: r */
    public final int f5849r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f5850s;

    /* JADX INFO: renamed from: t */
    public int f5851t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f5852u;

    /* JADX INFO: renamed from: v */
    public final C1304a f5853v;

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    public class C1304a extends C0961zg.c {
        public C1304a() {
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: a */
        public final int mo2267a(View view, int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return C0726n9.m1667j(i, sideSheetBehavior.f5832a.mo1289f(), sideSheetBehavior.f5832a.mo1288e());
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: b */
        public final int mo2268b(View view, int i) {
            return view.getTop();
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: c */
        public final int mo2269c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.f5843l + sideSheetBehavior.f5846o;
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: f */
        public final void mo2272f(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f5838g) {
                    sideSheetBehavior.m3250s(1);
                }
            }
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: g */
        public final void mo2273g(View view, int i, int i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f5848q;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.f5832a.mo1297n(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f5852u;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.f5832a.mo1285b(i);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC0503be) it.next()).m1249b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo2274h(View view, float f, float f2) {
            int i;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (!sideSheetBehavior.f5832a.mo1293j(f)) {
                if (sideSheetBehavior.f5832a.mo1296m(view, f)) {
                    i = (sideSheetBehavior.f5832a.mo1295l(f, f2) || sideSheetBehavior.f5832a.mo1294k(view)) ? 5 : 3;
                } else {
                    if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f5832a.mo1286c()) < Math.abs(left - sideSheetBehavior.f5832a.mo1287d())) {
                        }
                    }
                }
            }
            sideSheetBehavior.m3252u(view, i, true);
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: i */
        public final boolean mo2275i(View view, int i) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f5839h == 1 || (weakReference = sideSheetBehavior.f5847p) == null || weakReference.get() != view) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c */
    public class C1306c {

        /* JADX INFO: renamed from: a */
        public int f5856a;

        /* JADX INFO: renamed from: b */
        public boolean f5857b;

        /* JADX INFO: renamed from: c */
        public final RunnableC0221M2 f5858c = new RunnableC0221M2(15, this);

        public C1306c() {
        }

        /* JADX INFO: renamed from: a */
        public final void m3254a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f5847p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f5856a = i;
            if (this.f5857b) {
                return;
            }
            V v = sideSheetBehavior.f5847p.get();
            RunnableC0221M2 runnableC0221M2 = this.f5858c;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            v.postOnAnimation(runnableC0221M2);
            this.f5857b = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SideSheetBehavior() {
        this.f5836e = new C1306c();
        this.f5838g = true;
        this.f5839h = 5;
        this.f5842k = 0.1f;
        this.f5849r = -1;
        this.f5852u = new LinkedHashSet();
        this.f5853v = new C1304a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: c */
    public final void mo2456c(CoordinatorLayout.C1062f c1062f) {
        this.f5847p = null;
        this.f5840i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: f */
    public final void mo2459f() {
        this.f5847p = null;
        this.f5840i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1271g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0961zg c0961zg;
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (C0866ug.g.m2056b(v) != null) {
                if (this.f5838g) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 && (velocityTracker = this.f5850s) != null) {
                        velocityTracker.recycle();
                        this.f5850s = null;
                    }
                    if (this.f5850s == null) {
                        this.f5850s = VelocityTracker.obtain();
                    }
                    this.f5850s.addMovement(motionEvent);
                    if (actionMasked == 0) {
                        this.f5851t = (int) motionEvent.getX();
                    } else if ((actionMasked == 1 || actionMasked == 3) && this.f5841j) {
                        this.f5841j = false;
                        return false;
                    }
                    return (this.f5841j || (c0961zg = this.f5840i) == null || !c0961zg.m2265p(motionEvent)) ? false : true;
                }
            }
        }
        this.f5841j = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: h */
    public final boolean mo371h(CoordinatorLayout coordinatorLayout, V v, int i) {
        V v2;
        V v3;
        int i2;
        View viewFindViewById;
        C0354Ta c0354Ta = this.f5833b;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int iMo1290g = 0;
        if (this.f5847p == null) {
            this.f5847p = new WeakReference<>(v);
            Context context = v.getContext();
            C0899wb.m2188d(context, C1247R.attr.motionEasingStandardDecelerateInterpolator, C0805rc.m1882b(0.0f, 0.0f, 0.0f, 1.0f));
            C0899wb.m2187c(context, C1247R.attr.motionDurationMedium2, 300);
            C0899wb.m2187c(context, C1247R.attr.motionDurationShort3, 150);
            C0899wb.m2187c(context, C1247R.attr.motionDurationShort2, 100);
            Resources resources = v.getResources();
            resources.getDimension(C1247R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(C1247R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(C1247R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0354Ta != null) {
                v.setBackground(c0354Ta);
                float fM2017i = this.f5837f;
                if (fM2017i == -1.0f) {
                    fM2017i = C0866ug.d.m2017i(v);
                }
                c0354Ta.m966j(fM2017i);
            } else {
                ColorStateList colorStateList = this.f5834c;
                if (colorStateList != null) {
                    C0866ug.d.m2025q(v, colorStateList);
                }
            }
            int i3 = this.f5839h == 5 ? 4 : 0;
            if (v.getVisibility() != i3) {
                v.setVisibility(i3);
            }
            m3253v();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            if (C0866ug.g.m2056b(v) == null) {
                C0866ug.m2004k(v, v.getResources().getString(f5830w));
            }
        }
        int i4 = Gravity.getAbsoluteGravity(((CoordinatorLayout.C1062f) v.getLayoutParams()).f4406c, i) == 3 ? 1 : 0;
        AbstractC0522ce abstractC0522ce = this.f5832a;
        if (abstractC0522ce == null || abstractC0522ce.mo1292i() != i4) {
            C0393Vd c0393Vd = this.f5835d;
            CoordinatorLayout.C1062f c1062f = null;
            if (i4 == 0) {
                this.f5832a = new C0939yd(this);
                if (c0393Vd != null) {
                    WeakReference<V> weakReference = this.f5847p;
                    if (weakReference != null && (v3 = weakReference.get()) != null && (v3.getLayoutParams() instanceof CoordinatorLayout.C1062f)) {
                        c1062f = (CoordinatorLayout.C1062f) v3.getLayoutParams();
                    }
                    if (c1062f == null || ((ViewGroup.MarginLayoutParams) c1062f).rightMargin <= 0) {
                        C0393Vd.a aVarM1026e = c0393Vd.m1026e();
                        aVarM1026e.f1499f = new C0811s(0.0f);
                        aVarM1026e.f1500g = new C0811s(0.0f);
                        C0393Vd c0393VdM1028a = aVarM1026e.m1028a();
                        if (c0354Ta != null) {
                            c0354Ta.setShapeAppearanceModel(c0393VdM1028a);
                        }
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException(C0944z.m2223c(i4, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f5832a = new C0878v9(this);
                if (c0393Vd != null) {
                    WeakReference<V> weakReference2 = this.f5847p;
                    if (weakReference2 != null && (v2 = weakReference2.get()) != null && (v2.getLayoutParams() instanceof CoordinatorLayout.C1062f)) {
                        c1062f = (CoordinatorLayout.C1062f) v2.getLayoutParams();
                    }
                    if (c1062f == null || ((ViewGroup.MarginLayoutParams) c1062f).leftMargin <= 0) {
                        C0393Vd.a aVarM1026e2 = c0393Vd.m1026e();
                        aVarM1026e2.f1498e = new C0811s(0.0f);
                        aVarM1026e2.f1501h = new C0811s(0.0f);
                        C0393Vd c0393VdM1028a2 = aVarM1026e2.m1028a();
                        if (c0354Ta != null) {
                            c0354Ta.setShapeAppearanceModel(c0393VdM1028a2);
                        }
                    }
                }
            }
        }
        if (this.f5840i == null) {
            this.f5840i = new C0961zg(coordinatorLayout.getContext(), coordinatorLayout, this.f5853v);
        }
        int iMo1290g2 = this.f5832a.mo1290g(v);
        coordinatorLayout.m2448q(v, i);
        this.f5844m = coordinatorLayout.getWidth();
        this.f5845n = this.f5832a.mo1291h(coordinatorLayout);
        this.f5843l = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.f5846o = marginLayoutParams != null ? this.f5832a.mo1284a(marginLayoutParams) : 0;
        int i5 = this.f5839h;
        if (i5 == 1 || i5 == 2) {
            iMo1290g = iMo1290g2 - this.f5832a.mo1290g(v);
        } else if (i5 != 3) {
            if (i5 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f5839h);
            }
            iMo1290g = this.f5832a.mo1287d();
        }
        v.offsetLeftAndRight(iMo1290g);
        if (this.f5848q == null && (i2 = this.f5849r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f5848q = new WeakReference<>(viewFindViewById);
        }
        for (InterfaceC0503be interfaceC0503be : this.f5852u) {
            if (interfaceC0503be instanceof AbstractC0579fe) {
                ((AbstractC0579fe) interfaceC0503be).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: i */
    public final boolean mo1305i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: n */
    public final void mo2464n(View view, Parcelable parcelable) {
        int i = ((C1305b) parcelable).f5855c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f5839h = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: o */
    public final Parcelable mo2465o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C1305b(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: r */
    public final boolean mo1272r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5839h == 1 && actionMasked == 0) {
            return true;
        }
        if (m3251t()) {
            this.f5840i.m2259j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f5850s) != null) {
            velocityTracker.recycle();
            this.f5850s = null;
        }
        if (this.f5850s == null) {
            this.f5850s = VelocityTracker.obtain();
        }
        this.f5850s.addMovement(motionEvent);
        if (m3251t() && actionMasked == 2 && !this.f5841j && m3251t()) {
            float fAbs = Math.abs(this.f5851t - motionEvent.getX());
            C0961zg c0961zg = this.f5840i;
            if (fAbs > c0961zg.f3572b) {
                c0961zg.m2251b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f5841j;
    }

    /* JADX INFO: renamed from: s */
    public final void m3250s(int i) {
        V v;
        if (this.f5839h == i) {
            return;
        }
        this.f5839h = i;
        WeakReference<V> weakReference = this.f5847p;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = this.f5839h == 5 ? 4 : 0;
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator it = this.f5852u.iterator();
        while (it.hasNext()) {
            ((InterfaceC0503be) it.next()).m1248a();
        }
        m3253v();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3251t() {
        if (this.f5840i != null) {
            return this.f5838g || this.f5839h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m2264o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m3250s(2);
        r2.f5836e.m3254a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3252u(View view, int i, boolean z) {
        int iMo1286c;
        if (i == 3) {
            iMo1286c = this.f5832a.mo1286c();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(C0944z.m2225e("Invalid state to get outer edge offset: ", i));
            }
            iMo1286c = this.f5832a.mo1287d();
        }
        C0961zg c0961zg = this.f5840i;
        if (c0961zg != null) {
            if (!z) {
                int top2 = view.getTop();
                c0961zg.f3588r = view;
                c0961zg.f3573c = -1;
                boolean zM2257h = c0961zg.m2257h(iMo1286c, top2, 0, 0);
                if (!zM2257h && c0961zg.f3571a == 0 && c0961zg.f3588r != null) {
                    c0961zg.f3588r = null;
                }
            }
        }
        m3250s(i);
    }

    /* JADX INFO: renamed from: v */
    public final void m3253v() {
        V v;
        WeakReference<V> weakReference = this.f5847p;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C0866ug.m2000g(v, 262144);
        C0866ug.m1998e(v, 0);
        C0866ug.m2000g(v, 1048576);
        C0866ug.m1998e(v, 0);
        final int i = 5;
        if (this.f5839h != 5) {
            C0866ug.m2001h(v, C0146I.a.f512j, new InterfaceC0182K() { // from class: a.ee
                @Override // p000a.InterfaceC0182K
                /* JADX INFO: renamed from: a */
                public final boolean mo493a(View view) {
                    int i2 = 1;
                    int i3 = SideSheetBehavior.f5830w;
                    SideSheetBehavior sideSheetBehavior = this.f2102a;
                    sideSheetBehavior.getClass();
                    int i4 = i;
                    if (i4 == 1 || i4 == 2) {
                        throw new IllegalArgumentException(C0944z.m2228h(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.f5847p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.m3250s(i4);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f5847p.get();
                    RunnableC0806rd runnableC0806rd = new RunnableC0806rd(sideSheetBehavior, i4, i2);
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                        if (view2.isAttachedToWindow()) {
                            view2.post(runnableC0806rd);
                            return true;
                        }
                    }
                    runnableC0806rd.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f5839h != 3) {
            C0866ug.m2001h(v, C0146I.a.f510h, new InterfaceC0182K() { // from class: a.ee
                @Override // p000a.InterfaceC0182K
                /* JADX INFO: renamed from: a */
                public final boolean mo493a(View view) {
                    int i22 = 1;
                    int i3 = SideSheetBehavior.f5830w;
                    SideSheetBehavior sideSheetBehavior = this.f2102a;
                    sideSheetBehavior.getClass();
                    int i4 = i2;
                    if (i4 == 1 || i4 == 2) {
                        throw new IllegalArgumentException(C0944z.m2228h(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    Reference reference = sideSheetBehavior.f5847p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.m3250s(i4);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.f5847p.get();
                    RunnableC0806rd runnableC0806rd = new RunnableC0806rd(sideSheetBehavior, i4, i22);
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                        if (view2.isAttachedToWindow()) {
                            view2.post(runnableC0806rd);
                            return true;
                        }
                    }
                    runnableC0806rd.run();
                    return true;
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    public static class C1305b extends AbstractC0792r {
        public static final Parcelable.Creator<C1305b> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public final int f5855c;

        /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b$a */
        public class a implements Parcelable.ClassLoaderCreator<C1305b> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1305b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1305b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1305b[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1305b(parcel, null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1305b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5855c = parcel.readInt();
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5855c);
        }

        public C1305b(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f5855c = sideSheetBehavior.f5839h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5836e = new C1306c();
        this.f5838g = true;
        this.f5839h = 5;
        this.f5842k = 0.1f;
        this.f5849r = -1;
        this.f5852u = new LinkedHashSet();
        this.f5853v = new C1304a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.f5834c = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f5835d = C0393Vd.m1023b(context, attributeSet, 0, f5831x).m1028a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(C1247R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.f5849r = resourceId;
            WeakReference<View> weakReference = this.f5848q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f5848q = null;
            WeakReference<V> weakReference2 = this.f5847p;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    if (v.isLaidOut()) {
                        v.requestLayout();
                    }
                }
            }
        }
        C0393Vd c0393Vd = this.f5835d;
        if (c0393Vd != null) {
            C0354Ta c0354Ta = new C0354Ta(c0393Vd);
            this.f5833b = c0354Ta;
            c0354Ta.m965i(context);
            ColorStateList colorStateList = this.f5834c;
            if (colorStateList != null) {
                this.f5833b.m967k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f5833b.setTint(typedValue.data);
            }
        }
        this.f5837f = typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f5838g = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
