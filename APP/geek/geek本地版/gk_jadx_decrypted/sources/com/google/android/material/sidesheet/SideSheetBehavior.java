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
import p000.AbstractC0126ct;
import p000.AbstractC0538nx;
import p000.AbstractC0852wd;
import p000.AbstractC0873wy;
import p000.AbstractC0979zt;
import p000.C0169e;
import p000.C0196eq;
import p000.C0200eu;
import p000.C0281h0;
import p000.C0698s7;
import p000.C0772u7;
import p000.C0963zd;
import p000.InterfaceC0802v0;
import p000.e30;
import p000.f30;
import p000.ja0;
import p000.ma0;
import p000.s90;
import p000.t30;
import p000.v90;
import p000.y90;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0852wd {

    /* JADX INFO: renamed from: a */
    public AbstractC0979zt f1145a;

    /* JADX INFO: renamed from: b */
    public final C0200eu f1146b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f1147c;

    /* JADX INFO: renamed from: d */
    public final f30 f1148d;

    /* JADX INFO: renamed from: e */
    public final C0772u7 f1149e;

    /* JADX INFO: renamed from: f */
    public final float f1150f;

    /* JADX INFO: renamed from: g */
    public final boolean f1151g;

    /* JADX INFO: renamed from: h */
    public int f1152h;

    /* JADX INFO: renamed from: i */
    public ma0 f1153i;

    /* JADX INFO: renamed from: j */
    public boolean f1154j;

    /* JADX INFO: renamed from: k */
    public final float f1155k;

    /* JADX INFO: renamed from: l */
    public int f1156l;

    /* JADX INFO: renamed from: m */
    public int f1157m;

    /* JADX INFO: renamed from: n */
    public int f1158n;

    /* JADX INFO: renamed from: o */
    public int f1159o;

    /* JADX INFO: renamed from: p */
    public WeakReference f1160p;

    /* JADX INFO: renamed from: q */
    public WeakReference f1161q;

    /* JADX INFO: renamed from: r */
    public final int f1162r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f1163s;

    /* JADX INFO: renamed from: t */
    public int f1164t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f1165u;

    /* JADX INFO: renamed from: v */
    public final C0698s7 f1166v;

    public SideSheetBehavior() {
        this.f1149e = new C0772u7(this);
        this.f1151g = true;
        this.f1152h = 5;
        this.f1155k = 0.1f;
        this.f1162r = -1;
        this.f1165u = new LinkedHashSet();
        this.f1166v = new C0698s7(this, 1);
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: c */
    public final void mo724c(C0963zd c0963zd) {
        this.f1160p = null;
        this.f1153i = null;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: e */
    public final void mo725e() {
        this.f1160p = null;
        this.f1153i = null;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: f */
    public final boolean mo696f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ma0 ma0Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && ja0.m1567d(view) == null) || !this.f1151g) {
            this.f1154j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1163s) != null) {
            velocityTracker.recycle();
            this.f1163s = null;
        }
        if (this.f1163s == null) {
            this.f1163s = VelocityTracker.obtain();
        }
        this.f1163s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1164t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1154j) {
            this.f1154j = false;
            return false;
        }
        return (this.f1154j || (ma0Var = this.f1153i) == null || !ma0Var.m1816p(motionEvent)) ? false : true;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: g */
    public final boolean mo697g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        WeakHashMap weakHashMap = ja0.f2600a;
        int i3 = 1;
        if (s90.m2310b(coordinatorLayout) && !s90.m2310b(view)) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f1160p;
        C0200eu c0200eu = this.f1146b;
        int iMo1064q = 0;
        if (weakReference == null) {
            this.f1160p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC0126ct.m825w(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0538nx.m1950b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC0126ct.m824v(context, R.attr.motionDurationMedium2, 300);
            AbstractC0126ct.m824v(context, R.attr.motionDurationShort3, 150);
            AbstractC0126ct.m824v(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0200eu != null) {
                s90.m2325q(view, c0200eu);
                float fM2663i = this.f1150f;
                if (fM2663i == -1.0f) {
                    fM2663i = y90.m2663i(view);
                }
                c0200eu.m1084i(fM2663i);
            } else {
                ColorStateList colorStateList = this.f1147c;
                if (colorStateList != null) {
                    y90.m2671q(view, colorStateList);
                }
            }
            int i4 = this.f1152h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            m765u();
            if (s90.m2311c(view) == 0) {
                s90.m2327s(view, 1);
            }
            if (ja0.m1567d(view) == null) {
                ja0.m1576m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((C0963zd) view.getLayoutParams()).f5541c, i) == 3 ? 1 : 0;
        AbstractC0979zt abstractC0979zt = this.f1145a;
        if (abstractC0979zt == null || abstractC0979zt.mo1066v() != i5) {
            C0963zd c0963zd = null;
            f30 f30Var = this.f1148d;
            if (i5 == 0) {
                this.f1145a = new C0196eq(this, i3);
                if (f30Var != null) {
                    WeakReference weakReference2 = this.f1160p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C0963zd)) {
                        c0963zd = (C0963zd) view3.getLayoutParams();
                    }
                    if (c0963zd == null || ((ViewGroup.MarginLayoutParams) c0963zd).rightMargin <= 0) {
                        e30 e30VarM1139e = f30Var.m1139e();
                        e30VarM1139e.f1698f = new C0169e(0.0f);
                        e30VarM1139e.f1699g = new C0169e(0.0f);
                        f30 f30VarM982a = e30VarM1139e.m982a();
                        if (c0200eu != null) {
                            c0200eu.setShapeAppearanceModel(f30VarM982a);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i5 + ". Must be 0 or 1.");
                }
                this.f1145a = new C0196eq(this, iMo1064q);
                if (f30Var != null) {
                    WeakReference weakReference3 = this.f1160p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C0963zd)) {
                        c0963zd = (C0963zd) view2.getLayoutParams();
                    }
                    if (c0963zd == null || ((ViewGroup.MarginLayoutParams) c0963zd).leftMargin <= 0) {
                        e30 e30VarM1139e2 = f30Var.m1139e();
                        e30VarM1139e2.f1697e = new C0169e(0.0f);
                        e30VarM1139e2.f1700h = new C0169e(0.0f);
                        f30 f30VarM982a2 = e30VarM1139e2.m982a();
                        if (c0200eu != null) {
                            c0200eu.setShapeAppearanceModel(f30VarM982a2);
                        }
                    }
                }
            }
        }
        if (this.f1153i == null) {
            this.f1153i = new ma0(coordinatorLayout.getContext(), coordinatorLayout, this.f1166v);
        }
        int iMo1064q2 = this.f1145a.mo1064q(view);
        coordinatorLayout.m224q(view, i);
        this.f1157m = coordinatorLayout.getWidth();
        this.f1158n = this.f1145a.mo1065u(coordinatorLayout);
        this.f1156l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1159o = marginLayoutParams != null ? this.f1145a.mo1058a(marginLayoutParams) : 0;
        int i6 = this.f1152h;
        if (i6 == 1 || i6 == 2) {
            iMo1064q = iMo1064q2 - this.f1145a.mo1064q(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f1152h);
            }
            iMo1064q = this.f1145a.mo1061m();
        }
        view.offsetLeftAndRight(iMo1064q);
        if (this.f1161q == null && (i2 = this.f1162r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1161q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f1165u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: h */
    public final boolean mo698h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: m */
    public final void mo701m(View view, Parcelable parcelable) {
        int i = ((t30) parcelable).f4494c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f1152h = i;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: n */
    public final Parcelable mo702n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new t30(this);
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: q */
    public final boolean mo705q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1152h == 1 && actionMasked == 0) {
            return true;
        }
        if (m763s()) {
            this.f1153i.m1810j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1163s) != null) {
            velocityTracker.recycle();
            this.f1163s = null;
        }
        if (this.f1163s == null) {
            this.f1163s = VelocityTracker.obtain();
        }
        this.f1163s.addMovement(motionEvent);
        if (m763s() && actionMasked == 2 && !this.f1154j && m763s()) {
            float fAbs = Math.abs(this.f1164t - motionEvent.getX());
            ma0 ma0Var = this.f1153i;
            if (fAbs > ma0Var.f3165b) {
                ma0Var.m1802b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1154j;
    }

    /* JADX INFO: renamed from: r */
    public final void m762r(int i) {
        View view;
        if (this.f1152h == i) {
            return;
        }
        this.f1152h = i;
        WeakReference weakReference = this.f1160p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f1152h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1165u.iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        m765u();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m763s() {
        if (this.f1153i != null) {
            return this.f1151g || this.f1152h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r1.m1815o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        m762r(2);
        r2.f1149e.m2425a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m764t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L21
            r0 = 5
            if (r4 != r0) goto Ld
            zt r0 = r2.f1145a
            int r0 = r0.mo1061m()
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
            zt r0 = r2.f1145a
            int r0 = r0.mo1060l()
        L27:
            ma0 r1 = r2.f1153i
            if (r1 == 0) goto L5f
            if (r5 == 0) goto L38
            int r3 = r3.getTop()
            boolean r3 = r1.m1815o(r0, r3)
            if (r3 == 0) goto L5f
            goto L55
        L38:
            int r5 = r3.getTop()
            r1.f3181r = r3
            r3 = -1
            r1.f3166c = r3
            r3 = 0
            boolean r3 = r1.m1808h(r0, r5, r3, r3)
            if (r3 != 0) goto L53
            int r5 = r1.f3164a
            if (r5 != 0) goto L53
            android.view.View r5 = r1.f3181r
            if (r5 == 0) goto L53
            r5 = 0
            r1.f3181r = r5
        L53:
            if (r3 == 0) goto L5f
        L55:
            r3 = 2
            r2.m762r(r3)
            u7 r3 = r2.f1149e
            r3.m2425a(r4)
            return
        L5f:
            r2.m762r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m764t(android.view.View, int, boolean):void");
    }

    /* JADX INFO: renamed from: u */
    public final void m765u() {
        View view;
        WeakReference weakReference = this.f1160p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ja0.m1572i(view, 262144);
        ja0.m1570g(view, 0);
        ja0.m1572i(view, 1048576);
        ja0.m1570g(view, 0);
        final int i = 5;
        if (this.f1152h != 5) {
            ja0.m1573j(view, C0281h0.f2185j, new InterfaceC0802v0() { // from class: s30
                @Override // p000.InterfaceC0802v0
                /* JADX INFO: renamed from: c */
                public final boolean mo1134c(View view2) {
                    int i2 = i;
                    if (i2 != 1) {
                        int i3 = 2;
                        if (i2 != 2) {
                            SideSheetBehavior sideSheetBehavior = this.f4380a;
                            WeakReference weakReference2 = sideSheetBehavior.f1160p;
                            if (weakReference2 == null || weakReference2.get() == null) {
                                sideSheetBehavior.m762r(i2);
                                return true;
                            }
                            View view3 = (View) sideSheetBehavior.f1160p.get();
                            RunnableC0422ks runnableC0422ks = new RunnableC0422ks(sideSheetBehavior, i2, i3);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap weakHashMap = ja0.f2600a;
                                if (v90.m2495b(view3)) {
                                    view3.post(runnableC0422ks);
                                    return true;
                                }
                            }
                            runnableC0422ks.run();
                            return true;
                        }
                    }
                    throw new IllegalArgumentException(z30.m2767l(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                }
            });
        }
        final int i2 = 3;
        if (this.f1152h != 3) {
            ja0.m1573j(view, C0281h0.f2183h, new InterfaceC0802v0() { // from class: s30
                @Override // p000.InterfaceC0802v0
                /* JADX INFO: renamed from: c */
                public final boolean mo1134c(View view2) {
                    int i22 = i2;
                    if (i22 != 1) {
                        int i3 = 2;
                        if (i22 != 2) {
                            SideSheetBehavior sideSheetBehavior = this.f4380a;
                            WeakReference weakReference2 = sideSheetBehavior.f1160p;
                            if (weakReference2 == null || weakReference2.get() == null) {
                                sideSheetBehavior.m762r(i22);
                                return true;
                            }
                            View view3 = (View) sideSheetBehavior.f1160p.get();
                            RunnableC0422ks runnableC0422ks = new RunnableC0422ks(sideSheetBehavior, i22, i3);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap weakHashMap = ja0.f2600a;
                                if (v90.m2495b(view3)) {
                                    view3.post(runnableC0422ks);
                                    return true;
                                }
                            }
                            runnableC0422ks.run();
                            return true;
                        }
                    }
                    throw new IllegalArgumentException(z30.m2767l(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1149e = new C0772u7(this);
        this.f1151g = true;
        this.f1152h = 5;
        this.f1155k = 0.1f;
        this.f1162r = -1;
        this.f1165u = new LinkedHashSet();
        this.f1166v = new C0698s7(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5064w);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f1147c = AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f1148d = f30.m1136b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m982a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f1162r = resourceId;
            WeakReference weakReference = this.f1161q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1161q = null;
            WeakReference weakReference2 = this.f1160p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = ja0.f2600a;
                    if (v90.m2496c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        f30 f30Var = this.f1148d;
        if (f30Var != null) {
            C0200eu c0200eu = new C0200eu(f30Var);
            this.f1146b = c0200eu;
            c0200eu.m1083h(context);
            ColorStateList colorStateList = this.f1147c;
            if (colorStateList != null) {
                this.f1146b.m1085j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1146b.setTint(typedValue.data);
            }
        }
        this.f1150f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f1151g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
