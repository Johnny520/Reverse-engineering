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
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC0628Oj;
import p000.AbstractC0706Qb;
import p000.AbstractC0714Qj;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1360eE;
import p000.AbstractC1492hE;
import p000.AbstractC2185lE;
import p000.AbstractC2374ph;
import p000.C0417Jn;
import p000.C0685Px;
import p000.C0728Qx;
import p000.C0834Tb;
import p000.C0902V;
import p000.C1021Xq;
import p000.C1080Z5;
import p000.C1204b6;
import p000.C2211ly;
import p000.C2228mE;
import p000.C2254my;
import p000.C2436r;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0706Qb {

    /* JADX INFO: renamed from: a */
    public AbstractC0628Oj f4562a;

    /* JADX INFO: renamed from: b */
    public final C1021Xq f4563b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f4564c;

    /* JADX INFO: renamed from: d */
    public final C0728Qx f4565d;

    /* JADX INFO: renamed from: e */
    public final C1204b6 f4566e;

    /* JADX INFO: renamed from: f */
    public final float f4567f;

    /* JADX INFO: renamed from: g */
    public final boolean f4568g;

    /* JADX INFO: renamed from: h */
    public int f4569h;

    /* JADX INFO: renamed from: i */
    public C2228mE f4570i;

    /* JADX INFO: renamed from: j */
    public boolean f4571j;

    /* JADX INFO: renamed from: k */
    public final float f4572k;

    /* JADX INFO: renamed from: l */
    public int f4573l;

    /* JADX INFO: renamed from: m */
    public int f4574m;

    /* JADX INFO: renamed from: n */
    public int f4575n;

    /* JADX INFO: renamed from: o */
    public int f4576o;

    /* JADX INFO: renamed from: p */
    public WeakReference f4577p;

    /* JADX INFO: renamed from: q */
    public WeakReference f4578q;

    /* JADX INFO: renamed from: r */
    public final int f4579r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f4580s;

    /* JADX INFO: renamed from: t */
    public int f4581t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f4582u;

    /* JADX INFO: renamed from: v */
    public final C1080Z5 f4583v;

    public SideSheetBehavior() {
        this.f4566e = new C1204b6(this);
        this.f4568g = true;
        this.f4569h = 5;
        this.f4572k = 0.1f;
        this.f4579r = -1;
        this.f4582u = new LinkedHashSet();
        this.f4583v = new C1080Z5(this, 1);
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: c */
    public final void mo1455c(C0834Tb r1) {
        this.f4577p = null;
        this.f4570i = null;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: e */
    public final void mo1457e() {
        this.f4577p = null;
        this.f4570i = null;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public final boolean mo1458f(CoordinatorLayout r3, View r4, MotionEvent r5) {
        if (r4.isShown() == true) goto L7;
        WeakHashMap r32 = AbstractC2185lE.f7617a;
        if (AbstractC1492hE.m2850a(r4) != null) goto L7;
    L35:
        this.f4571j = true;
        return false;
    L7:
        if (this.f4568g == false) goto L35;
        int r33 = r5.getActionMasked();
        if (r33 != 0) goto L14;
        VelocityTracker r42 = this.f4580s;
        if (r42 == null) goto L14;
        r42.recycle();
        this.f4580s = null;
    L14:
        if (this.f4580s != null) goto L16;
        this.f4580s = VelocityTracker.obtain();
    L16:
        this.f4580s.addMovement(r5);
        if (r33 == 0) goto L26;
        if (r33 == 1) goto L23;
        if (r33 == 3) goto L23;
    L28:
        if (this.f4571j == true) goto L34;
        C2228mE r34 = this.f4570i;
        if (r34 == null) goto L34;
        if (r34.m4500o(r5) == false) goto L34;
        return true;
    L34:
        return false;
    L23:
        if (this.f4571j == false) goto L28;
        this.f4571j = false;
        return false;
    L26:
        this.f4581t = (int) r5.getX();
        goto L28
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout r11, View r12, int r13) {
        int r1 = 1;
        if (r11.getFitsSystemWindows() == true) goto L5;
    L7:
        WeakReference r0 = this.f4577p;
        C1021Xq r2 = this.f4563b;
        int r5 = 0;
        if (r0 != null) goto L32;
        this.f4577p = new WeakReference(r12);
        new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
        Context r02 = r12.getContext();
        AbstractC0714Qj.m1473D(r02, R.attr.motionDurationMedium2, 300);
        AbstractC0714Qj.m1473D(r02, R.attr.motionDurationShort3, 150);
        AbstractC0714Qj.m1473D(r02, R.attr.motionDurationShort2, 100);
        Resources r03 = r12.getResources();
        r03.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        r03.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        r03.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
        if (r2 == null) goto L15;
        r12.setBackground(r2);
        float r6 = this.f4567f;
        if (r6 != (-1.0f)) goto L14;
        r6 = r12.getElevation();
    L14:
        r2.m1927m(r6);
    L19:
        if (this.f4569h != 5) goto L21;
        int r04 = 4;
    L23:
        if (r12.getVisibility() == r04) goto L25;
        r12.setVisibility(r04);
    L25:
        m2471u();
        if (r12.getImportantForAccessibility() != 0) goto L28;
        r12.setImportantForAccessibility(1);
    L28:
        WeakHashMap r05 = AbstractC2185lE.f7617a;
        if (AbstractC1492hE.m2850a(r12) != null) goto L32;
        AbstractC2185lE.m4400m(r12, r12.getResources().getString(R.string.side_sheet_accessibility_pane_title));
        goto L32
    L21:
        r04 = 0;
        goto L23
    L15:
        ColorStateList r06 = this.f4564c;
        if (r06 == null) goto L19;
        WeakHashMap r62 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2637i(r12, r06);
    L32:
        if (Gravity.getAbsoluteGravity(((C0834Tb) r12.getLayoutParams()).f2647c, r13) != 3) goto L34;
        int r07 = 1;
    L35:
        AbstractC0628Oj r7 = this.f4562a;
        if (r7 != null) goto L38;
    L39:
        C0834Tb r72 = null;
        C0728Qx r8 = this.f4565d;
        if (r07 != 0) goto L57;
        this.f4562a = new C0417Jn(this, r1);
        if (r8 == null) goto L75;
        WeakReference r08 = this.f4577p;
        if (r08 == null) goto L50;
        View r09 = (View) r08.get();
        if (r09 == null) goto L50;
        if ((r09.getLayoutParams() instanceof C0834Tb) == false) goto L50;
        r72 = (C0834Tb) r09.getLayoutParams();
    L50:
        if (r72 != null) goto L52;
    L54:
        C0685Px r010 = r8.m1516f();
        r010.f2197f = new C2436r(0.0f);
        r010.f2198g = new C2436r(0.0f);
        C0728Qx r011 = r010.m1383a();
        if (r2 == null) goto L75;
        r2.setShapeAppearanceModel(r011);
        goto L75
    L52:
        if (((ViewGroup.MarginLayoutParams) r72).rightMargin <= 0) goto L54;
    L75:
        if (this.f4570i != null) goto L77;
        this.f4570i = new C2228mE(r11.getContext(), r11, this.f4583v);
    L77:
        int r012 = this.f4562a.mo876w(r12);
        r11.m2140p(r12, r13);
        this.f4574m = r11.getWidth();
        this.f4575n = this.f4562a.mo877x(r11);
        this.f4573l = r12.getWidth();
        ViewGroup.MarginLayoutParams r132 = (ViewGroup.MarginLayoutParams) r12.getLayoutParams();
        if (r132 == null) goto L80;
        int r133 = this.f4562a.mo870d(r132);
    L81:
        this.f4576o = r133;
        int r134 = this.f4569h;
        if (r134 != 1) goto L84;
    L90:
        r5 = r012 - this.f4562a.mo876w(r12);
    L91:
        WeakHashMap r135 = AbstractC2185lE.f7617a;
        r12.offsetLeftAndRight(r5);
        if (this.f4578q != null) goto L98;
        int r136 = this.f4579r;
        if (r136 == (-1)) goto L98;
        View r112 = r11.findViewById(r136);
        if (r112 == null) goto L98;
        this.f4578q = new WeakReference(r112);
    L98:
        Iterator r113 = this.f4582u.iterator();
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
        r5 = this.f4562a.mo873r();
        goto L91
    L89:
        throw new IllegalStateException("Unexpected value: " + this.f4569h);
    L80:
        r133 = 0;
        goto L81
    L57:
        if (r07 != 1) goto L108;
        this.f4562a = new C0417Jn(this, r5);
        if (r8 == null) goto L75;
        WeakReference r013 = this.f4577p;
        if (r013 == null) goto L67;
        View r014 = (View) r013.get();
        if (r014 == null) goto L67;
        if ((r014.getLayoutParams() instanceof C0834Tb) == false) goto L67;
        r72 = (C0834Tb) r014.getLayoutParams();
    L67:
        if (r72 != null) goto L69;
    L71:
        C0685Px r015 = r8.m1516f();
        r015.f2196e = new C2436r(0.0f);
        r015.f2199h = new C2436r(0.0f);
        C0728Qx r016 = r015.m1383a();
        if (r2 == null) goto L75;
        r2.setShapeAppearanceModel(r016);
        goto L75
    L69:
        if (((ViewGroup.MarginLayoutParams) r72).leftMargin <= 0) goto L71;
    L108:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r07, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
    L38:
        if (r7.mo878z() == r07) goto L75;
    L34:
        r07 = 0;
        goto L35
    L5:
        if (r12.getFitsSystemWindows() == true) goto L7;
        r12.setFitsSystemWindows(true);
        goto L7
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout r4, View r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r1 = r4.getPaddingLeft();
        int r62 = ViewGroup.getChildMeasureSpec(r6, (((r4.getPaddingRight() + r1) + r0.leftMargin) + r0.rightMargin) + r7, r0.width);
        int r72 = r4.getPaddingTop();
        r5.measure(r62, ViewGroup.getChildMeasureSpec(r8, ((r4.getPaddingBottom() + r72) + r0.topMargin) + r0.bottomMargin, r0.height));
        return true;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: m */
    public final void mo1465m(View r1, Parcelable r2) {
        int r12 = ((C2254my) r2).f7965c;
        if (r12 != 1) goto L5;
    L6:
        r12 = 5;
    L7:
        this.f4569h = r12;
        return;
    L5:
        if (r12 != 2) goto L7;
        goto L6
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1466n(View r2) {
        AbsSavedState r0 = View.BaseSavedState.EMPTY_STATE;
        return new C2254my(this);
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    public final boolean mo1469q(View r5, MotionEvent r6) {
        if (r5.isShown() == true) goto L6;
        return false;
    L6:
        int r0 = r6.getActionMasked();
        if (this.f4569h != 1) goto L11;
        if (r0 != 0) goto L11;
        return true;
    L11:
        if (m2469s() == false) goto L13;
        this.f4570i.m4494i(r6);
    L13:
        if (r0 != 0) goto L18;
        VelocityTracker r1 = this.f4580s;
        if (r1 == null) goto L18;
        r1.recycle();
        this.f4580s = null;
    L18:
        if (this.f4580s != null) goto L20;
        this.f4580s = VelocityTracker.obtain();
    L20:
        this.f4580s.addMovement(r6);
        if (m2469s() == false) goto L33;
        if (r0 != 2) goto L33;
        if (this.f4571j == true) goto L33;
        if (m2469s() == false) goto L33;
        float r02 = Math.abs(this.f4581t - r6.getX());
        C2228mE r12 = this.f4570i;
        if (r02 <= r12.f7750b) goto L33;
        r12.m4487b(r5, r6.getPointerId(r6.getActionIndex()));
    L33:
        return !this.f4571j;
    }

    /* JADX INFO: renamed from: r */
    public final void m2468r(int r3) {
        if (this.f4569h == r3) goto L24;
        this.f4569h = r3;
        WeakReference r32 = this.f4577p;
        if (r32 == null) goto L25;
        View r33 = (View) r32.get();
        if (r33 != null) goto L12;
        return;
    L12:
        if (this.f4569h != 5) goto L14;
        int r0 = 4;
    L16:
        if (r33.getVisibility() == r0) goto L18;
        r33.setVisibility(r0);
    L18:
        Iterator r34 = this.f4582u.iterator();
        if (r34.hasNext() == true) goto L22;
        m2471u();
        return;
    L22:
        r34.next().getClass();
        throw new ClassCastException();
    L14:
        r0 = 0;
        goto L16
    L25:
        return;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2469s() {
        if (this.f4570i != null) goto L5;
        return false;
    L5:
        if (this.f4568g == false) goto L7;
    L8:
        return true;
    L7:
        if (this.f4569h == 1) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m2470t(View r3, int r4, boolean r5) {
        if (r4 != 3) goto L5;
        int r0 = this.f4562a.mo872q();
    L10:
        C2228mE r1 = this.f4570i;
        if (r1 == null) goto L26;
        if (r5 == true) goto L14;
        int r52 = r3.getTop();
        r1.f7766r = r3;
        r1.f7751c = -1;
        boolean r32 = r1.m4493h(r0, r52, 0, 0);
        if (r32 == false) goto L19;
    L23:
        if (r32 == false) goto L26;
    L24:
        m2468r(2);
        this.f4566e.m2324a(r4);
        return;
    L19:
        if (r1.f7749a != 0) goto L23;
        if (r1.f7766r == null) goto L23;
        r1.f7766r = null;
        goto L23
    L14:
        if (r1.m4499n(r0, r3.getTop()) == true) goto L24;
    L26:
        m2468r(r4);
        return;
    L5:
        if (r4 != 5) goto L8;
        r0 = this.f4562a.mo873r();
        goto L10
    L8:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r4, "Invalid state to get outer edge offset: "));
    }

    /* JADX INFO: renamed from: u */
    public final void m2471u() {
        WeakReference r0 = this.f4577p;
        if (r0 == null) goto L16;
        View r02 = (View) r0.get();
        if (r02 == null) goto L17;
        AbstractC2185lE.m4396i(r02, 262144);
        AbstractC2185lE.m4393f(r02, 0);
        AbstractC2185lE.m4396i(r02, 1048576);
        AbstractC2185lE.m4393f(r02, 0);
        final int r2 = 5;
        if (this.f4569h == 5) goto L11;
        AbstractC2185lE.m4397j(r02, C0902V.f2807j, new C2211ly(this, r2));
    L11:
        final int r22 = 3;
        if (this.f4569h == 3) goto L15;
        AbstractC2185lE.m4397j(r02, C0902V.f2805h, new C2211ly(this, r22));
        return;
    L15:
        return;
    L17:
        return;
    }

    public SideSheetBehavior(Context r7, AttributeSet r8) {
        this.f4566e = new C1204b6(this);
        this.f4568g = true;
        this.f4569h = 5;
        this.f4572k = 0.1f;
        this.f4579r = -1;
        this.f4582u = new LinkedHashSet();
        this.f4583v = new C1080Z5(this, 1);
        TypedArray r3 = r7.obtainStyledAttributes(r8, AbstractC0939Vu.f2957z);
        if (r3.hasValue(3) == false) goto L6;
        this.f4564c = AbstractC0828TB.m1643j(r7, r3, 3);
    L6:
        if (r3.hasValue(6) == false) goto L9;
        this.f4565d = C0728Qx.m1512b(r7, r8, 0, R.style.Widget_Material3_SideSheet).m1383a();
    L9:
        if (r3.hasValue(5) == false) goto L20;
        int r82 = r3.getResourceId(5, -1);
        this.f4579r = r82;
        WeakReference r1 = this.f4578q;
        if (r1 == null) goto L13;
        r1.clear();
    L13:
        this.f4578q = null;
        WeakReference r12 = this.f4577p;
        if (r12 == null) goto L20;
        View r13 = (View) r12.get();
        if (r82 == (-1)) goto L20;
        if (r13.isLaidOut() == false) goto L20;
        r13.requestLayout();
    L20:
        C0728Qx r83 = this.f4565d;
        if (r83 == null) goto L27;
        C1021Xq r14 = new C1021Xq(r83);
        this.f4563b = r14;
        r14.m1925k(r7);
        ColorStateList r84 = this.f4564c;
        if (r84 == null) goto L26;
        this.f4563b.m1928n(r84);
        goto L27
    L26:
        TypedValue r85 = new TypedValue();
        r7.getTheme().resolveAttribute(android.R.attr.colorBackground, r85, true);
        this.f4563b.setTint(r85.data);
    L27:
        this.f4567f = r3.getDimension(2, -1.0f);
        this.f4568g = r3.getBoolean(4, true);
        r3.recycle();
        ViewConfiguration.get(r7).getScaledMaximumFlingVelocity();
    }
}
