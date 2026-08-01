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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ljx.wechatmod.R;
import defpackage.ct;
import defpackage.e;
import defpackage.e30;
import defpackage.eq;
import defpackage.eu;
import defpackage.f30;
import defpackage.h0;
import defpackage.ja0;
import defpackage.ma0;
import defpackage.nx;
import defpackage.s30;
import defpackage.s7;
import defpackage.s90;
import defpackage.t30;
import defpackage.u7;
import defpackage.v90;
import defpackage.wd;
import defpackage.wy;
import defpackage.y90;
import defpackage.z30;
import defpackage.zd;
import defpackage.zt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends wd {
    public zt a;
    public final eu b;
    public final ColorStateList c;
    public final f30 d;
    public final u7 e;
    public final float f;
    public final boolean g;
    public int h;
    public ma0 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final s7 v;

    public SideSheetBehavior() {
        this.e = new u7(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new s7(this, 1);
    }

    @Override // defpackage.wd
    public final void c(zd r1) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.wd
    public final void e() {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.wd
    public final boolean f(CoordinatorLayout r3, View r4, MotionEvent r5) {
        if (r4.isShown() == true) goto L7;
        if (ja0.d(r4) != null) goto L7;
    L35:
        this.j = true;
        return false;
    L7:
        if (this.g == false) goto L35;
        int r32 = r5.getActionMasked();
        if (r32 != 0) goto L14;
        VelocityTracker r42 = this.s;
        if (r42 == null) goto L14;
        r42.recycle();
        this.s = null;
    L14:
        if (this.s != null) goto L16;
        this.s = VelocityTracker.obtain();
    L16:
        this.s.addMovement(r5);
        if (r32 == 0) goto L26;
        if (r32 == 1) goto L23;
        if (r32 == 3) goto L23;
    L28:
        if (this.j == true) goto L34;
        ma0 r33 = this.i;
        if (r33 == null) goto L34;
        if (r33.p(r5) == false) goto L34;
        return true;
    L34:
        return false;
    L23:
        if (this.j == false) goto L28;
        this.j = false;
        return false;
    L26:
        this.t = (int) r5.getX();
        goto L28
    }

    @Override // defpackage.wd
    public final boolean g(CoordinatorLayout r11, View r12, int r13) {
        WeakHashMap r0 = ja0.a;
        int r1 = 1;
        if (s90.b(r11) == true) goto L5;
    L7:
        WeakReference r02 = this.p;
        eu r2 = this.b;
        int r5 = 0;
        if (r02 != null) goto L32;
        this.p = new WeakReference(r12);
        Context r03 = r12.getContext();
        ct.w(r03, R.attr.motionEasingStandardDecelerateInterpolator, nx.b(0.0f, 0.0f, 0.0f, 1.0f));
        ct.v(r03, R.attr.motionDurationMedium2, 300);
        ct.v(r03, R.attr.motionDurationShort3, 150);
        ct.v(r03, R.attr.motionDurationShort2, 100);
        Resources r04 = r12.getResources();
        r04.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        r04.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        r04.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
        if (r2 == null) goto L15;
        s90.q(r12, r2);
        float r6 = this.f;
        if (r6 != (-1.0f)) goto L14;
        r6 = y90.i(r12);
    L14:
        r2.i(r6);
    L19:
        if (this.h != 5) goto L21;
        int r05 = 4;
    L23:
        if (r12.getVisibility() == r05) goto L25;
        r12.setVisibility(r05);
    L25:
        u();
        if (s90.c(r12) != 0) goto L29;
        s90.s(r12, 1);
    L29:
        if (ja0.d(r12) != null) goto L32;
        ja0.m(r12, r12.getResources().getString(R.string.side_sheet_accessibility_pane_title));
        goto L32
    L21:
        r05 = 0;
        goto L23
    L15:
        ColorStateList r06 = this.c;
        if (r06 == null) goto L19;
        y90.q(r12, r06);
    L32:
        if (Gravity.getAbsoluteGravity(((zd) r12.getLayoutParams()).c, r13) != 3) goto L34;
        int r07 = 1;
    L35:
        zt r7 = this.a;
        if (r7 != null) goto L38;
    L39:
        zd r72 = null;
        f30 r8 = this.d;
        if (r07 != 0) goto L57;
        this.a = new eq(this, r1);
        if (r8 == null) goto L75;
        WeakReference r08 = this.p;
        if (r08 == null) goto L50;
        View r09 = (View) r08.get();
        if (r09 == null) goto L50;
        if ((r09.getLayoutParams() instanceof zd) == false) goto L50;
        r72 = (zd) r09.getLayoutParams();
    L50:
        if (r72 != null) goto L52;
    L54:
        e30 r010 = r8.e();
        r010.f = new e(0.0f);
        r010.g = new e(0.0f);
        f30 r011 = r010.a();
        if (r2 == null) goto L75;
        r2.setShapeAppearanceModel(r011);
        goto L75
    L52:
        if (((ViewGroup.MarginLayoutParams) r72).rightMargin <= 0) goto L54;
    L75:
        if (this.i != null) goto L77;
        this.i = new ma0(r11.getContext(), r11, this.v);
    L77:
        int r012 = this.a.q(r12);
        r11.q(r12, r13);
        this.m = r11.getWidth();
        this.n = this.a.u(r11);
        this.l = r12.getWidth();
        ViewGroup.MarginLayoutParams r132 = (ViewGroup.MarginLayoutParams) r12.getLayoutParams();
        if (r132 == null) goto L80;
        int r133 = this.a.a(r132);
    L81:
        this.o = r133;
        int r134 = this.h;
        if (r134 != 1) goto L84;
    L90:
        r5 = r012 - this.a.q(r12);
    L91:
        r12.offsetLeftAndRight(r5);
        if (this.q != null) goto L98;
        int r135 = this.r;
        if (r135 == (-1)) goto L98;
        View r112 = r11.findViewById(r135);
        if (r112 == null) goto L98;
        this.q = new WeakReference(r112);
    L98:
        Iterator r113 = this.u.iterator();
    L100:
        if (r113.hasNext() == false) goto L106;
        if (r113.next() == null) goto L100;
        throw new ClassCastException();
    L106:
        return true;
    L84:
        if (r134 == 2) goto L90;
        if (r134 == 3) goto L91;
        if (r134 != 5) goto L89;
        r5 = this.a.m();
        goto L91
    L89:
        throw new IllegalStateException("Unexpected value: " + this.h);
    L80:
        r133 = 0;
        goto L81
    L57:
        if (r07 != 1) goto L108;
        this.a = new eq(this, r5);
        if (r8 == null) goto L75;
        WeakReference r013 = this.p;
        if (r013 == null) goto L67;
        View r014 = (View) r013.get();
        if (r014 == null) goto L67;
        if ((r014.getLayoutParams() instanceof zd) == false) goto L67;
        r72 = (zd) r014.getLayoutParams();
    L67:
        if (r72 != null) goto L69;
    L71:
        e30 r015 = r8.e();
        r015.e = new e(0.0f);
        r015.h = new e(0.0f);
        f30 r016 = r015.a();
        if (r2 == null) goto L75;
        r2.setShapeAppearanceModel(r016);
        goto L75
    L69:
        if (((ViewGroup.MarginLayoutParams) r72).leftMargin <= 0) goto L71;
    L108:
        throw new IllegalArgumentException("Invalid sheet edge position value: " + r07 + ". Must be 0 or 1.");
    L38:
        if (r7.v() == r07) goto L75;
    L34:
        r07 = 0;
        goto L35
    L5:
        if (s90.b(r12) == true) goto L7;
        r12.setFitsSystemWindows(true);
        goto L7
    }

    @Override // defpackage.wd
    public final boolean h(CoordinatorLayout r4, View r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r1 = r4.getPaddingLeft();
        int r62 = ViewGroup.getChildMeasureSpec(r6, (((r4.getPaddingRight() + r1) + r0.leftMargin) + r0.rightMargin) + r7, r0.width);
        int r72 = r4.getPaddingTop();
        r5.measure(r62, ViewGroup.getChildMeasureSpec(r8, ((r4.getPaddingBottom() + r72) + r0.topMargin) + r0.bottomMargin, r0.height));
        return true;
    }

    @Override // defpackage.wd
    public final void m(View r1, Parcelable r2) {
        int r12 = ((t30) r2).c;
        if (r12 != 1) goto L5;
    L6:
        r12 = 5;
    L7:
        this.h = r12;
        return;
    L5:
        if (r12 != 2) goto L7;
        goto L6
    }

    @Override // defpackage.wd
    public final Parcelable n(View r2) {
        AbsSavedState r0 = View.BaseSavedState.EMPTY_STATE;
        return new t30(this);
    }

    @Override // defpackage.wd
    public final boolean q(View r5, MotionEvent r6) {
        if (r5.isShown() == true) goto L6;
        return false;
    L6:
        int r0 = r6.getActionMasked();
        if (this.h != 1) goto L11;
        if (r0 != 0) goto L11;
        return true;
    L11:
        if (s() == false) goto L13;
        this.i.j(r6);
    L13:
        if (r0 != 0) goto L18;
        VelocityTracker r1 = this.s;
        if (r1 == null) goto L18;
        r1.recycle();
        this.s = null;
    L18:
        if (this.s != null) goto L20;
        this.s = VelocityTracker.obtain();
    L20:
        this.s.addMovement(r6);
        if (s() == false) goto L33;
        if (r0 != 2) goto L33;
        if (this.j == true) goto L33;
        if (s() == false) goto L33;
        float r02 = Math.abs(this.t - r6.getX());
        ma0 r12 = this.i;
        if (r02 <= r12.b) goto L33;
        r12.b(r5, r6.getPointerId(r6.getActionIndex()));
    L33:
        return !this.j;
    }

    public final void r(int r3) {
        if (this.h == r3) goto L24;
        this.h = r3;
        WeakReference r32 = this.p;
        if (r32 == null) goto L25;
        View r33 = (View) r32.get();
        if (r33 != null) goto L12;
        return;
    L12:
        if (this.h != 5) goto L14;
        int r0 = 4;
    L16:
        if (r33.getVisibility() == r0) goto L18;
        r33.setVisibility(r0);
    L18:
        Iterator r34 = this.u.iterator();
        if (r34.hasNext() == true) goto L23;
        u();
        return;
    L23:
        throw z30.h(r34);
    L14:
        r0 = 0;
        goto L16
    L25:
        return;
    }

    public final boolean s() {
        if (this.i != null) goto L5;
        return false;
    L5:
        if (this.g == false) goto L7;
    L8:
        return true;
    L7:
        if (this.h == 1) goto L8;
        return false;
    }

    public final void t(View r3, int r4, boolean r5) {
        if (r4 != 3) goto L5;
        int r0 = this.a.l();
    L10:
        ma0 r1 = this.i;
        if (r1 == null) goto L26;
        if (r5 == true) goto L14;
        int r52 = r3.getTop();
        r1.r = r3;
        r1.c = -1;
        boolean r32 = r1.h(r0, r52, 0, 0);
        if (r32 == false) goto L19;
    L23:
        if (r32 == false) goto L26;
    L24:
        r(2);
        this.e.a(r4);
        return;
    L19:
        if (r1.a != 0) goto L23;
        if (r1.r == null) goto L23;
        r1.r = null;
        goto L23
    L14:
        if (r1.o(r0, r3.getTop()) == true) goto L24;
    L26:
        r(r4);
        return;
    L5:
        if (r4 != 5) goto L8;
        r0 = this.a.m();
        goto L10
    L8:
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + r4);
    }

    public final void u() {
        WeakReference r0 = this.p;
        if (r0 == null) goto L16;
        View r02 = (View) r0.get();
        if (r02 == null) goto L17;
        ja0.i(r02, 262144);
        ja0.g(r02, 0);
        ja0.i(r02, 1048576);
        ja0.g(r02, 0);
        final int r2 = 5;
        if (this.h == 5) goto L11;
        ja0.j(r02, h0.j, new s30(this, r2));
    L11:
        final int r22 = 3;
        if (this.h == 3) goto L15;
        ja0.j(r02, h0.h, new s30(this, r22));
        return;
    L15:
        return;
    L17:
        return;
    }

    public SideSheetBehavior(Context r7, AttributeSet r8) {
        this.e = new u7(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new s7(this, 1);
        TypedArray r3 = r7.obtainStyledAttributes(r8, wy.w);
        if (r3.hasValue(3) == false) goto L6;
        this.c = ct.n(r7, r3, 3);
    L6:
        if (r3.hasValue(6) == false) goto L9;
        this.d = f30.b(r7, r8, 0, R.style.Widget_Material3_SideSheet).a();
    L9:
        if (r3.hasValue(5) == false) goto L20;
        int r82 = r3.getResourceId(5, -1);
        this.r = r82;
        WeakReference r1 = this.q;
        if (r1 == null) goto L13;
        r1.clear();
    L13:
        this.q = null;
        WeakReference r12 = this.p;
        if (r12 == null) goto L20;
        View r13 = (View) r12.get();
        if (r82 == (-1)) goto L20;
        WeakHashMap r83 = ja0.a;
        if (v90.c(r13) == false) goto L20;
        r13.requestLayout();
    L20:
        f30 r84 = this.d;
        if (r84 == null) goto L27;
        eu r14 = new eu(r84);
        this.b = r14;
        r14.h(r7);
        ColorStateList r85 = this.c;
        if (r85 == null) goto L26;
        this.b.j(r85);
        goto L27
    L26:
        TypedValue r86 = new TypedValue();
        r7.getTheme().resolveAttribute(android.R.attr.colorBackground, r86, true);
        this.b.setTint(r86.data);
    L27:
        this.f = r3.getDimension(2, -1.0f);
        this.g = r3.getBoolean(4, true);
        r3.recycle();
        ViewConfiguration.get(r7).getScaledMaximumFlingVelocity();
    }
}
