package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0501a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p008E.C0151e;
import p010F.AbstractC0196a;
import p021L.C0245e;
import p034S.AbstractC0324d;
import p056f0.AbstractC0805P;
import p058g0.AbstractC0942a;
import p068l0.C0979a;
import p078r.AbstractC1058a;
import p078r.C1061d;
import p089x0.C1117a;
import p089x0.C1123g;
import p089x0.C1126j;
import p089x0.C1127k;
import p090y0.C1139a;
import p090y0.C1140b;
import p090y0.C1141c;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC1058a {

    /* JADX INFO: renamed from: a */
    public AbstractC0805P f2409a;

    /* JADX INFO: renamed from: b */
    public final C1123g f2410b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f2411c;

    /* JADX INFO: renamed from: d */
    public final C1127k f2412d;

    /* JADX INFO: renamed from: e */
    public final C0501a f2413e;

    /* JADX INFO: renamed from: f */
    public final float f2414f;

    /* JADX INFO: renamed from: g */
    public final boolean f2415g;

    /* JADX INFO: renamed from: h */
    public int f2416h;

    /* JADX INFO: renamed from: i */
    public C0245e f2417i;

    /* JADX INFO: renamed from: j */
    public boolean f2418j;

    /* JADX INFO: renamed from: k */
    public final float f2419k;

    /* JADX INFO: renamed from: l */
    public int f2420l;

    /* JADX INFO: renamed from: m */
    public int f2421m;

    /* JADX INFO: renamed from: n */
    public int f2422n;

    /* JADX INFO: renamed from: o */
    public int f2423o;

    /* JADX INFO: renamed from: p */
    public WeakReference f2424p;

    /* JADX INFO: renamed from: q */
    public WeakReference f2425q;

    /* JADX INFO: renamed from: r */
    public final int f2426r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f2427s;

    /* JADX INFO: renamed from: t */
    public int f2428t;

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f2429u;

    /* JADX INFO: renamed from: v */
    public final C0979a f2430v;

    public SideSheetBehavior() {
        this.f2413e = new C0501a(this);
        this.f2415g = true;
        this.f2416h = 5;
        this.f2419k = 0.1f;
        this.f2426r = -1;
        this.f2429u = new LinkedHashSet();
        this.f2430v = new C0979a(this, 1);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: c */
    public final void mo1843c(C1061d r1) {
        this.f2424p = null;
        this.f2417i = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: e */
    public final void mo1844e() {
        this.f2424p = null;
        this.f2417i = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public final boolean mo1815f(CoordinatorLayout r3, View r4, MotionEvent r5) {
        if (r4.isShown() == true) goto L7;
        if (AbstractC0080Q.m283b(r4) != null) goto L7;
    L36:
        this.f2418j = true;
        return false;
    L7:
        if (this.f2415g == false) goto L36;
        int r32 = r5.getActionMasked();
        if (r32 != 0) goto L14;
        VelocityTracker r42 = this.f2427s;
        if (r42 == null) goto L14;
        r42.recycle();
        this.f2427s = null;
    L14:
        if (this.f2427s != null) goto L16;
        this.f2427s = VelocityTracker.obtain();
    L16:
        this.f2427s.addMovement(r5);
        if (r32 == 0) goto L26;
        if (r32 == 1) goto L23;
        if (r32 == 3) goto L23;
    L28:
        if (this.f2418j == true) goto L35;
        C0245e r33 = this.f2417i;
        if (r33 == null) goto L35;
        if (r33.m683o(r5) == false) goto L35;
        return true;
    L35:
        return false;
    L23:
        if (this.f2418j == false) goto L28;
        this.f2418j = false;
        return false;
    L26:
        this.f2428t = (int) r5.getX();
        goto L28
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout r11, View r12, int r13) {
        int r02 = 0;
        int r1 = 1;
        C1123g r2 = this.f2410b;
        Field r3 = AbstractC0080Q.f219a;
        if (r11.getFitsSystemWindows() == false) goto L8;
        if (r12.getFitsSystemWindows() == true) goto L8;
        r12.setFitsSystemWindows(true);
    L8:
        if (this.f2424p != null) goto L32;
        this.f2424p = new WeakReference(r12);
        Context r32 = r12.getContext();
        AbstractC0805P.m2039S(r32, C1031R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0196a.m567b(0.0f, 0.0f, 0.0f, 1.0f));
        AbstractC0805P.m2038R(r32, C1031R.attr.motionDurationMedium2, 300);
        AbstractC0805P.m2038R(r32, C1031R.attr.motionDurationShort3, 150);
        AbstractC0805P.m2038R(r32, C1031R.attr.motionDurationShort2, 100);
        Resources r33 = r12.getResources();
        r33.getDimension(C1031R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        r33.getDimension(C1031R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        r33.getDimension(C1031R.dimen.m3_back_progress_side_container_max_scale_y_distance);
        if (r2 == null) goto L15;
        r12.setBackground(r2);
        float r34 = this.f2414f;
        if (r34 != (-1.0f)) goto L14;
        r34 = AbstractC0070G.m219i(r12);
    L14:
        r2.m2650j(r34);
    L19:
        if (this.f2416h != 5) goto L21;
        int r35 = 4;
    L23:
        if (r12.getVisibility() == r35) goto L25;
        r12.setVisibility(r35);
    L25:
        m1885u();
        if (r12.getImportantForAccessibility() != 0) goto L29;
        r12.setImportantForAccessibility(1);
    L29:
        if (AbstractC0080Q.m283b(r12) != null) goto L32;
        AbstractC0080Q.m292k(r12, r12.getResources().getString(C1031R.string.side_sheet_accessibility_pane_title));
        goto L32
    L21:
        r35 = 0;
        goto L23
    L15:
        ColorStateList r36 = this.f2411c;
        if (r36 == null) goto L19;
        AbstractC0070G.m227q(r12, r36);
    L32:
        if (Gravity.getAbsoluteGravity(((C1061d) r12.getLayoutParams()).f4066c, r13) != 3) goto L34;
        int r37 = 1;
    L35:
        AbstractC0805P r7 = this.f2409a;
        if (r7 != null) goto L38;
    L39:
        C1127k r72 = this.f2412d;
        C1061d r8 = null;
        if (r37 != 0) goto L57;
        this.f2409a = new C1139a(this, r1);
        if (r72 == null) goto L75;
        WeakReference r38 = this.f2424p;
        if (r38 == null) goto L50;
        View r39 = (View) r38.get();
        if (r39 == null) goto L50;
        if ((r39.getLayoutParams() instanceof C1061d) == false) goto L50;
        r8 = (C1061d) r39.getLayoutParams();
    L50:
        if (r8 != null) goto L52;
    L54:
        C1126j r310 = r72.m2660d();
        r310.f4340f = new C1117a(0.0f);
        r310.f4341g = new C1117a(0.0f);
        C1127k r311 = r310.m2656a();
        if (r2 == null) goto L75;
        r2.setShapeAppearanceModel(r311);
        goto L75
    L52:
        if (((ViewGroup.MarginLayoutParams) r8).rightMargin <= 0) goto L54;
    L75:
        if (this.f2417i != null) goto L77;
        this.f2417i = new C0245e(r11.getContext(), r11, this.f2430v);
    L77:
        int r22 = this.f2409a.mo2079z(r12);
        r11.m1174p(r12, r13);
        this.f2421m = r11.getWidth();
        this.f2422n = this.f2409a.mo2054A(r11);
        this.f2420l = r12.getWidth();
        ViewGroup.MarginLayoutParams r132 = (ViewGroup.MarginLayoutParams) r12.getLayoutParams();
        if (r132 == null) goto L80;
        int r133 = this.f2409a.mo2065a(r132);
    L81:
        this.f2423o = r133;
        int r134 = this.f2416h;
        if (r134 != 1) goto L84;
    L90:
        r02 = r22 - this.f2409a.mo2079z(r12);
    L91:
        r12.offsetLeftAndRight(r02);
        if (this.f2425q != null) goto L98;
        int r122 = this.f2426r;
        if (r122 == (-1)) goto L98;
        View r112 = r11.findViewById(r122);
        if (r112 == null) goto L98;
        this.f2425q = new WeakReference(r112);
    L98:
        Iterator r113 = this.f2429u.iterator();
    L100:
        if (r113.hasNext() == false) goto L102;
        AbstractC0324d.m726i(r113.next());
        goto L100
    L102:
        return true;
    L84:
        if (r134 == 2) goto L90;
        if (r134 == 3) goto L91;
        if (r134 != 5) goto L89;
        r02 = this.f2409a.mo2076v();
        goto L91
    L89:
        throw new IllegalStateException("Unexpected value: " + this.f2416h);
    L80:
        r133 = 0;
        goto L81
    L57:
        if (r37 != 1) goto L104;
        this.f2409a = new C1139a(this, r02);
        if (r72 == null) goto L75;
        WeakReference r312 = this.f2424p;
        if (r312 == null) goto L67;
        View r313 = (View) r312.get();
        if (r313 == null) goto L67;
        if ((r313.getLayoutParams() instanceof C1061d) == false) goto L67;
        r8 = (C1061d) r313.getLayoutParams();
    L67:
        if (r8 != null) goto L69;
    L71:
        C1126j r314 = r72.m2660d();
        r314.f4339e = new C1117a(0.0f);
        r314.f4342h = new C1117a(0.0f);
        C1127k r315 = r314.m2656a();
        if (r2 == null) goto L75;
        r2.setShapeAppearanceModel(r315);
        goto L75
    L69:
        if (((ViewGroup.MarginLayoutParams) r8).leftMargin <= 0) goto L71;
    L104:
        throw new IllegalArgumentException("Invalid sheet edge position value: " + r37 + ". Must be 0 or 1.");
    L38:
        if (r7.mo2055B() == r37) goto L75;
    L34:
        r37 = 0;
        goto L35
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout r4, View r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r02 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r1 = r4.getPaddingLeft();
        int r62 = ViewGroup.getChildMeasureSpec(r6, (((r4.getPaddingRight() + r1) + r02.leftMargin) + r02.rightMargin) + r7, r02.width);
        int r72 = r4.getPaddingTop();
        r5.measure(r62, ViewGroup.getChildMeasureSpec(r8, ((r4.getPaddingBottom() + r72) + r02.topMargin) + r02.bottomMargin, r02.height));
        return true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: m */
    public final void mo1820m(View r1, Parcelable r2) {
        int r22 = ((C1141c) r2).f4402c;
        if (r22 != 1) goto L5;
    L6:
        r22 = 5;
    L7:
        this.f2416h = r22;
        return;
    L5:
        if (r22 != 2) goto L7;
        goto L6
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1821n(View r2) {
        return new C1141c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View r5, MotionEvent r6) {
        if (r5.isShown() == true) goto L6;
        return false;
    L6:
        int r02 = r6.getActionMasked();
        if (this.f2416h != 1) goto L11;
        if (r02 != 0) goto L11;
        return true;
    L11:
        if (m1883s() == false) goto L13;
        this.f2417i.m677i(r6);
    L13:
        if (r02 != 0) goto L18;
        VelocityTracker r1 = this.f2427s;
        if (r1 == null) goto L18;
        r1.recycle();
        this.f2427s = null;
    L18:
        if (this.f2427s != null) goto L20;
        this.f2427s = VelocityTracker.obtain();
    L20:
        this.f2427s.addMovement(r6);
        if (m1883s() == false) goto L33;
        if (r02 != 2) goto L33;
        if (this.f2418j == true) goto L33;
        if (m1883s() == false) goto L33;
        float r03 = Math.abs(this.f2428t - r6.getX());
        C0245e r12 = this.f2417i;
        if (r03 <= r12.f504b) goto L33;
        r12.m670b(r5, r6.getPointerId(r6.getActionIndex()));
    L33:
        return !this.f2418j;
    }

    /* JADX INFO: renamed from: r */
    public final void m1882r(int r3) {
        if (this.f2416h != r3) goto L5;
        return;
    L5:
        this.f2416h = r3;
        WeakReference r32 = this.f2424p;
        if (r32 != null) goto L8;
        return;
    L8:
        View r33 = (View) r32.get();
        if (r33 != null) goto L12;
        return;
    L12:
        if (this.f2416h != 5) goto L14;
        int r02 = 4;
    L16:
        if (r33.getVisibility() == r02) goto L18;
        r33.setVisibility(r02);
    L18:
        Iterator r34 = this.f2429u.iterator();
        if (r34.hasNext() == true) goto L22;
        m1885u();
        return;
    L22:
        AbstractC0324d.m726i(r34.next());
        throw null;
    L14:
        r02 = 0;
        goto L16
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1883s() {
        if (this.f2417i != null) goto L5;
    L9:
        return false;
    L5:
        if (this.f2415g == false) goto L7;
        return true;
    L7:
        if (this.f2416h != 1) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m1884t(View r3, int r4, boolean r5) {
        if (r4 != 3) goto L5;
        int r02 = this.f2409a.mo2075u();
    L10:
        C0245e r1 = this.f2417i;
        if (r1 == null) goto L25;
        if (r5 == true) goto L14;
        int r52 = r3.getTop();
        r1.f520r = r3;
        r1.f505c = -1;
        boolean r32 = r1.m676h(r02, r52, 0, 0);
        if (r32 == false) goto L19;
    L23:
        if (r32 == false) goto L25;
    L24:
        m1882r(2);
        this.f2413e.m1226c(r4);
        return;
    L19:
        if (r1.f503a != 0) goto L23;
        if (r1.f520r == null) goto L23;
        r1.f520r = null;
        goto L23
    L14:
        if (r1.m682n(r02, r3.getTop()) == true) goto L24;
    L25:
        m1882r(r4);
        return;
    L5:
        if (r4 != 5) goto L8;
        r02 = this.f2409a.mo2076v();
        goto L10
    L8:
        throw new IllegalArgumentException(AbstractC0324d.m720c("Invalid state to get outer edge offset: ", r4));
    }

    /* JADX INFO: renamed from: u */
    public final void m1885u() {
        WeakReference r02 = this.f2424p;
        if (r02 != null) goto L5;
        return;
    L5:
        View r03 = (View) r02.get();
        if (r03 != null) goto L8;
        return;
    L8:
        AbstractC0080Q.m288g(r03, 262144);
        AbstractC0080Q.m286e(r03, 0);
        AbstractC0080Q.m288g(r03, 1048576);
        AbstractC0080Q.m286e(r03, 0);
        final int r2 = 5;
        if (this.f2416h == 5) goto L11;
        AbstractC0080Q.m289h(r03, C0151e.f349j, new C1140b(this, r2));
    L11:
        final int r22 = 3;
        if (this.f2416h == 3) goto L15;
        AbstractC0080Q.m289h(r03, C0151e.f347h, new C1140b(this, r22));
        return;
    }

    public SideSheetBehavior(Context r7, AttributeSet r8) {
        this.f2413e = new C0501a(this);
        this.f2415g = true;
        this.f2416h = 5;
        this.f2419k = 0.1f;
        this.f2426r = -1;
        this.f2429u = new LinkedHashSet();
        this.f2430v = new C0979a(this, 1);
        TypedArray r3 = r7.obtainStyledAttributes(r8, AbstractC0942a.f3345q);
        if (r3.hasValue(3) == false) goto L6;
        this.f2411c = AbstractC0805P.m2051r(r7, r3, 3);
    L6:
        if (r3.hasValue(6) == false) goto L9;
        this.f2412d = C1127k.m2657a(r7, r8, 0, C1031R.style.Widget_Material3_SideSheet).m2656a();
    L9:
        if (r3.hasValue(5) == false) goto L20;
        int r82 = r3.getResourceId(5, -1);
        this.f2426r = r82;
        WeakReference r1 = this.f2425q;
        if (r1 == null) goto L13;
        r1.clear();
    L13:
        this.f2425q = null;
        WeakReference r12 = this.f2424p;
        if (r12 == null) goto L20;
        View r13 = (View) r12.get();
        if (r82 == (-1)) goto L20;
        Field r83 = AbstractC0080Q.f219a;
        if (r13.isLaidOut() == false) goto L20;
        r13.requestLayout();
    L20:
        C1127k r84 = this.f2412d;
        if (r84 == null) goto L27;
        C1123g r14 = new C1123g(r84);
        this.f2410b = r14;
        r14.m2649i(r7);
        ColorStateList r85 = this.f2411c;
        if (r85 == null) goto L26;
        this.f2410b.m2651k(r85);
        goto L27
    L26:
        TypedValue r86 = new TypedValue();
        r7.getTheme().resolveAttribute(R.attr.colorBackground, r86, true);
        this.f2410b.setTint(r86.data);
    L27:
        this.f2414f = r3.getDimension(2, -1.0f);
        this.f2415g = r3.getBoolean(4, true);
        r3.recycle();
        ViewConfiguration.get(r7).getScaledMaximumFlingVelocity();
    }
}
