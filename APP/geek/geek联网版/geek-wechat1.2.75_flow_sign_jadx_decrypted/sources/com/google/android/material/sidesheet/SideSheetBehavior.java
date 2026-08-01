package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC0168dz;
import p000.AbstractC0274gu;
import p000.AbstractC0834vx;
import p000.AbstractC0889xd;
import p000.C0015ae;
import p000.C0095c8;
import p000.C0169e;
import p000.C0178e8;
import p000.C0281h0;
import p000.C0347iq;
import p000.C0350iu;
import p000.InterfaceC0801v0;
import p000.a40;
import p000.aa0;
import p000.da0;
import p000.g40;
import p000.l30;
import p000.m30;
import p000.oa0;
import p000.ra0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0889xd {

    /* JADX INFO: renamed from: a */
    public AbstractC0274gu f1070a;

    /* JADX INFO: renamed from: b */
    public final C0350iu f1071b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f1072c;

    /* JADX INFO: renamed from: d */
    public final m30 f1073d;

    /* JADX INFO: renamed from: e */
    public final C0178e8 f1074e;

    /* JADX INFO: renamed from: f */
    public final float f1075f;

    /* JADX INFO: renamed from: g */
    public final boolean f1076g;

    /* JADX INFO: renamed from: h */
    public int f1077h;

    /* JADX INFO: renamed from: i */
    public ra0 f1078i;

    /* JADX INFO: renamed from: j */
    public boolean f1079j;

    /* JADX INFO: renamed from: k */
    public final float f1080k;

    /* JADX INFO: renamed from: l */
    public int f1081l;

    /* JADX INFO: renamed from: m */
    public int f1082m;

    /* JADX INFO: renamed from: n */
    public int f1083n;

    /* JADX INFO: renamed from: o */
    public int f1084o;

    /* JADX INFO: renamed from: p */
    public WeakReference f1085p;

    /* JADX INFO: renamed from: q */
    public WeakReference f1086q;

    /* JADX INFO: renamed from: r */
    public final int f1087r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f1088s;

    /* JADX INFO: renamed from: t */
    public int f1089t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f1090u;

    /* JADX INFO: renamed from: v */
    public final C0095c8 f1091v;

    public SideSheetBehavior() {
        this.f1074e = new C0178e8(this);
        this.f1076g = true;
        this.f1077h = 5;
        this.f1080k = 0.1f;
        this.f1087r = -1;
        this.f1090u = new LinkedHashSet();
        this.f1091v = new C0095c8(this, 1);
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: c */
    public final void mo682c(C0015ae c0015ae) {
        this.f1085p = null;
        this.f1078i = null;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: e */
    public final void mo683e() {
        this.f1085p = null;
        this.f1078i = null;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: f */
    public final boolean mo654f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ra0 ra0Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && oa0.m2004d(view) == null) || !this.f1076g) {
            this.f1079j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1088s) != null) {
            velocityTracker.recycle();
            this.f1088s = null;
        }
        if (this.f1088s == null) {
            this.f1088s = VelocityTracker.obtain();
        }
        this.f1088s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1089t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1079j) {
            this.f1079j = false;
            return false;
        }
        return (this.f1079j || (ra0Var = this.f1078i) == null || !ra0Var.m2281p(motionEvent)) ? false : true;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: g */
    public final boolean mo655g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        WeakHashMap weakHashMap = oa0.f3426a;
        int i3 = 1;
        if (x90.m2654b(coordinatorLayout) && !x90.m2654b(view)) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f1085p;
        C0350iu c0350iu = this.f1071b;
        int iMo1334q = 0;
        if (weakReference == null) {
            this.f1085p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0274gu.m1303F(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0834vx.m2579b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0274gu.m1302E(context, R.attr.motionDurationMedium2, 300);
            AbstractC0274gu.m1302E(context, R.attr.motionDurationShort3, 150);
            AbstractC0274gu.m1302E(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0350iu != null) {
                x90.m2669q(view, c0350iu);
                float fM891i = this.f1075f;
                if (fM891i == -1.0f) {
                    fM891i = da0.m891i(view);
                }
                c0350iu.m1536i(fM891i);
            } else {
                ColorStateList colorStateList = this.f1072c;
                if (colorStateList != null) {
                    da0.m899q(view, colorStateList);
                }
            }
            int i4 = this.f1077h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            m723u();
            if (x90.m2655c(view) == 0) {
                x90.m2671s(view, 1);
            }
            if (oa0.m2004d(view) == null) {
                oa0.m2013m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((C0015ae) view.getLayoutParams()).f66c, i) == 3 ? 1 : 0;
        AbstractC0274gu abstractC0274gu = this.f1070a;
        if (abstractC0274gu == null || abstractC0274gu.mo1336s() != i5) {
            C0015ae c0015ae = null;
            m30 m30Var = this.f1073d;
            if (i5 == 0) {
                this.f1070a = new C0347iq(this, i3);
                if (m30Var != null) {
                    WeakReference weakReference2 = this.f1085p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C0015ae)) {
                        c0015ae = (C0015ae) view3.getLayoutParams();
                    }
                    if (c0015ae == null || ((ViewGroup.MarginLayoutParams) c0015ae).rightMargin <= 0) {
                        l30 l30VarM1802e = m30Var.m1802e();
                        l30VarM1802e.f2909f = new C0169e(0.0f);
                        l30VarM1802e.f2910g = new C0169e(0.0f);
                        m30 m30VarM1731a = l30VarM1802e.m1731a();
                        if (c0350iu != null) {
                            c0350iu.setShapeAppearanceModel(m30VarM1731a);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i5 + ". Must be 0 or 1.");
                }
                this.f1070a = new C0347iq(this, iMo1334q);
                if (m30Var != null) {
                    WeakReference weakReference3 = this.f1085p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C0015ae)) {
                        c0015ae = (C0015ae) view2.getLayoutParams();
                    }
                    if (c0015ae == null || ((ViewGroup.MarginLayoutParams) c0015ae).leftMargin <= 0) {
                        l30 l30VarM1802e2 = m30Var.m1802e();
                        l30VarM1802e2.f2908e = new C0169e(0.0f);
                        l30VarM1802e2.f2911h = new C0169e(0.0f);
                        m30 m30VarM1731a2 = l30VarM1802e2.m1731a();
                        if (c0350iu != null) {
                            c0350iu.setShapeAppearanceModel(m30VarM1731a2);
                        }
                    }
                }
            }
        }
        if (this.f1078i == null) {
            this.f1078i = new ra0(coordinatorLayout.getContext(), coordinatorLayout, this.f1091v);
        }
        int iMo1334q2 = this.f1070a.mo1334q(view);
        coordinatorLayout.m209q(view, i);
        this.f1082m = coordinatorLayout.getWidth();
        this.f1083n = this.f1070a.mo1335r(coordinatorLayout);
        this.f1081l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1084o = marginLayoutParams != null ? this.f1070a.mo1328a(marginLayoutParams) : 0;
        int i6 = this.f1077h;
        if (i6 == 1 || i6 == 2) {
            iMo1334q = iMo1334q2 - this.f1070a.mo1334q(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f1077h);
            }
            iMo1334q = this.f1070a.mo1331l();
        }
        view.offsetLeftAndRight(iMo1334q);
        if (this.f1086q == null && (i2 = this.f1087r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1086q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f1090u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: h */
    public final boolean mo656h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: m */
    public final void mo659m(View view, Parcelable parcelable) {
        int i = ((a40) parcelable).f26c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f1077h = i;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: n */
    public final Parcelable mo660n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new a40(this);
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: q */
    public final boolean mo663q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1077h == 1 && actionMasked == 0) {
            return true;
        }
        if (m721s()) {
            this.f1078i.m2275j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1088s) != null) {
            velocityTracker.recycle();
            this.f1088s = null;
        }
        if (this.f1088s == null) {
            this.f1088s = VelocityTracker.obtain();
        }
        this.f1088s.addMovement(motionEvent);
        if (m721s() && actionMasked == 2 && !this.f1079j && m721s()) {
            float fAbs = Math.abs(this.f1089t - motionEvent.getX());
            ra0 ra0Var = this.f1078i;
            if (fAbs > ra0Var.f4091b) {
                ra0Var.m2267b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1079j;
    }

    /* JADX INFO: renamed from: r */
    public final void m720r(int i) {
        View view;
        if (this.f1077h == i) {
            return;
        }
        this.f1077h = i;
        WeakReference weakReference = this.f1085p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f1077h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1090u.iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        m723u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m721s() {
        if (this.f1078i != null) {
            return this.f1076g || this.f1077h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r1.m2280o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        m720r(2);
        r2.f1074e.m970a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m722t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L21
            r0 = 5
            if (r4 != r0) goto Ld
            gu r0 = r2.f1070a
            int r0 = r0.mo1331l()
            goto L27
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid state to get outer edge offset: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L21:
            gu r0 = r2.f1070a
            int r0 = r0.mo1330k()
        L27:
            ra0 r1 = r2.f1078i
            if (r1 == 0) goto L5f
            if (r5 == 0) goto L38
            int r3 = r3.getTop()
            boolean r3 = r1.m2280o(r0, r3)
            if (r3 == 0) goto L5f
            goto L55
        L38:
            int r5 = r3.getTop()
            r1.f4107r = r3
            r3 = -1
            r1.f4092c = r3
            r3 = 0
            boolean r3 = r1.m2273h(r0, r5, r3, r3)
            if (r3 != 0) goto L53
            int r5 = r1.f4090a
            if (r5 != 0) goto L53
            android.view.View r5 = r1.f4107r
            if (r5 == 0) goto L53
            r5 = 0
            r1.f4107r = r5
        L53:
            if (r3 == 0) goto L5f
        L55:
            r3 = 2
            r2.m720r(r3)
            e8 r3 = r2.f1074e
            r3.m970a(r4)
            return
        L5f:
            r2.m720r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m722t(android.view.View, int, boolean):void");
    }

    /* JADX INFO: renamed from: u */
    public final void m723u() {
        View view;
        WeakReference weakReference = this.f1085p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        oa0.m2009i(view, 262144);
        oa0.m2007g(view, 0);
        oa0.m2009i(view, 1048576);
        oa0.m2007g(view, 0);
        final int i = 5;
        if (this.f1077h != 5) {
            oa0.m2010j(view, C0281h0.f2073j, new InterfaceC0801v0() { // from class: z30
                @Override // p000.InterfaceC0801v0
                /* JADX INFO: renamed from: d */
                public final boolean mo1072d(View view2) {
                    int i2 = i;
                    if (i2 != 1) {
                        int i3 = 2;
                        if (i2 != 2) {
                            SideSheetBehavior sideSheetBehavior = this.f5538a;
                            WeakReference weakReference2 = sideSheetBehavior.f1085p;
                            if (weakReference2 == null || weakReference2.get() == null) {
                                sideSheetBehavior.m720r(i2);
                                return true;
                            }
                            View view3 = (View) sideSheetBehavior.f1085p.get();
                            RunnableC0570os runnableC0570os = new RunnableC0570os(sideSheetBehavior, i2, i3);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap weakHashMap = oa0.f3426a;
                                if (aa0.m39b(view3)) {
                                    view3.post(runnableC0570os);
                                    return true;
                                }
                            }
                            runnableC0570os.run();
                            return true;
                        }
                    }
                    throw new IllegalArgumentException(g40.m1149l(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                }
            });
        }
        final int i2 = 3;
        if (this.f1077h != 3) {
            oa0.m2010j(view, C0281h0.f2071h, new InterfaceC0801v0() { // from class: z30
                @Override // p000.InterfaceC0801v0
                /* JADX INFO: renamed from: d */
                public final boolean mo1072d(View view2) {
                    int i22 = i2;
                    if (i22 != 1) {
                        int i3 = 2;
                        if (i22 != 2) {
                            SideSheetBehavior sideSheetBehavior = this.f5538a;
                            WeakReference weakReference2 = sideSheetBehavior.f1085p;
                            if (weakReference2 == null || weakReference2.get() == null) {
                                sideSheetBehavior.m720r(i22);
                                return true;
                            }
                            View view3 = (View) sideSheetBehavior.f1085p.get();
                            RunnableC0570os runnableC0570os = new RunnableC0570os(sideSheetBehavior, i22, i3);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap weakHashMap = oa0.f3426a;
                                if (aa0.m39b(view3)) {
                                    view3.post(runnableC0570os);
                                    return true;
                                }
                            }
                            runnableC0570os.run();
                            return true;
                        }
                    }
                    throw new IllegalArgumentException(g40.m1149l(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1074e = new C0178e8(this);
        this.f1076g = true;
        this.f1077h = 5;
        this.f1080k = 0.1f;
        this.f1087r = -1;
        this.f1090u = new LinkedHashSet();
        this.f1091v = new C0095c8(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1460w);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1072c = AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f1073d = m30.m1799b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m1731a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f1087r = resourceId;
            WeakReference weakReference = this.f1086q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1086q = null;
            WeakReference weakReference2 = this.f1085p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = oa0.f3426a;
                    if (aa0.m40c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        m30 m30Var = this.f1073d;
        if (m30Var != null) {
            C0350iu c0350iu = new C0350iu(m30Var);
            this.f1071b = c0350iu;
            c0350iu.m1535h(context);
            ColorStateList colorStateList = this.f1072c;
            if (colorStateList != null) {
                this.f1071b.m1537j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1071b.setTint(typedValue.data);
            }
        }
        this.f1075f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f1076g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
