package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ljx.wechatmod.R;
import defpackage.ab0;
import defpackage.ad;
import defpackage.bc0;
import defpackage.ct;
import defpackage.d0;
import defpackage.d4;
import defpackage.dc0;
import defpackage.du;
import defpackage.eu;
import defpackage.f2;
import defpackage.f30;
import defpackage.h0;
import defpackage.ja0;
import defpackage.ma0;
import defpackage.nx;
import defpackage.p7;
import defpackage.q7;
import defpackage.r7;
import defpackage.s7;
import defpackage.s90;
import defpackage.t7;
import defpackage.t90;
import defpackage.u7;
import defpackage.v;
import defpackage.v90;
import defpackage.w90;
import defpackage.wd;
import defpackage.wn;
import defpackage.wy;
import defpackage.x;
import defpackage.y4;
import defpackage.y90;
import defpackage.z30;
import defpackage.zd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends wd {
    public final u7 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public ma0 M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;
    public final int a;
    public boolean a0;
    public boolean b;
    public HashMap b0;
    public final float c;
    public final SparseIntArray c0;
    public final int d;
    public final s7 d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final eu i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final f30 y;
    public boolean z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new u7(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new s7(this, 0);
    }

    public static View v(View r3) {
        if (r3.getVisibility() != 0) goto L20;
        WeakHashMap r0 = ja0.a;
        if (y90.p(r3) == false) goto L9;
        return r3;
    L9:
        if ((r3 instanceof ViewGroup) == false) goto L16;
        ViewGroup r32 = (ViewGroup) r3;
        int r02 = r32.getChildCount();
        int r1 = 0;
    L11:
        if (r1 >= r02) goto L21;
        View r2 = v(r32.getChildAt(r1));
        if (r2 != null) goto L14;
        r1 = r1 + 1;
        goto L11
    L14:
        return r2;
    L21:
        return null;
    L16:
        return null;
    L20:
        return null;
    }

    public static int w(int r0, int r1, int r2, int r3) {
        int r02 = ViewGroup.getChildMeasureSpec(r0, r1, r3);
        if (r2 != (-1)) goto L5;
        return r02;
    L5:
        int r12 = View.MeasureSpec.getMode(r02);
        int r03 = View.MeasureSpec.getSize(r02);
        if (r12 == 1073741824) goto L13;
        if (r03 == 0) goto L11;
        r2 = Math.min(r03, r2);
    L11:
        return View.MeasureSpec.makeMeasureSpec(r2, Integer.MIN_VALUE);
    L13:
        return View.MeasureSpec.makeMeasureSpec(Math.min(r03, r2), 1073741824);
    }

    public final void A(int r2) {
        if (r2 != (-1)) goto L8;
        if (this.f == true) goto L12;
        this.f = true;
    L14:
        I();
        return;
    L12:
        return;
    L8:
        if (this.f == false) goto L10;
    L13:
        this.f = false;
        this.e = Math.max(0, r2);
        goto L14
    L10:
        if (this.e != r2) goto L13;
    }

    public final void B(int r5) {
        if (r5 != 1) goto L5;
    L38:
        StringBuilder r2 = new StringBuilder("STATE_");
        if (r5 != 1) goto L41;
        String r52 = "DRAGGING";
    L43:
        throw new IllegalArgumentException(z30.l(r2, r52, " should not be set externally."));
    L41:
        r52 = "SETTLING";
        goto L43
    L5:
        if (r5 == 2) goto L38;
        if (this.I == true) goto L14;
        if (r5 != 5) goto L14;
        Log.w("BottomSheetBehavior", "Cannot set state: " + r5);
        return;
    L14:
        if (r5 == 6) goto L16;
    L20:
        int r0 = r5;
    L21:
        WeakReference r1 = this.U;
        if (r1 != null) goto L24;
    L36:
        C(r5);
        return;
    L24:
        if (r1.get() == null) goto L36;
        View r53 = (View) this.U.get();
        y4 r12 = new y4(this, r53, r0);
        ViewParent r02 = r53.getParent();
        if (r02 != null) goto L29;
    L34:
        r12.run();
        return;
    L29:
        if (r02.isLayoutRequested() == false) goto L34;
        WeakHashMap r03 = ja0.a;
        if (v90.b(r53) == false) goto L34;
        r53.post(r12);
        return;
    L16:
        if (this.b == false) goto L20;
        if (y(r5) > this.D) goto L20;
        r0 = 3;
        goto L21
    }

    public final void C(int r7) {
        if (this.L == r7) goto L29;
        this.L = r7;
        if (r7 == 4) goto L10;
        if (r7 == 3) goto L10;
        if (r7 == 6) goto L10;
        boolean r4 = this.I;
    L10:
        WeakReference r42 = this.U;
        if (r42 != null) goto L14;
        return;
    L14:
        if (((View) r42.get()) != null) goto L17;
        return;
    L17:
        if (r7 != 3) goto L19;
        H(true);
    L23:
        G(r7, true);
        ArrayList r72 = this.W;
        if (r72.size() > 0) goto L27;
        F();
        return;
    L27:
        r72.get(0).getClass();
        throw new ClassCastException();
    L19:
        if (r7 == 6) goto L22;
        if (r7 == 5) goto L22;
        if (r7 != 4) goto L23;
    L22:
        H(false);
        goto L23
    }

    public final boolean D(View r5, float r6) {
        if (this.J == false) goto L6;
        return true;
    L6:
        if (r5.getTop() >= this.G) goto L9;
        return false;
    L9:
        if ((Math.abs(((r6 * this.Q) + r5.getTop()) - this.G) / t()) <= 0.5f) goto L11;
        return true;
    L11:
        return false;
    }

    public final void E(View r3, int r4, boolean r5) {
        int r0 = y(r4);
        ma0 r1 = this.M;
        if (r1 == null) goto L18;
        if (r5 == true) goto L6;
        int r52 = r3.getLeft();
        r1.r = r3;
        r1.c = -1;
        boolean r32 = r1.h(r52, r0, 0, 0);
        if (r32 == false) goto L11;
    L15:
        if (r32 == false) goto L18;
    L16:
        C(2);
        G(r4, true);
        this.A.a(r4);
        return;
    L11:
        if (r1.a != 0) goto L15;
        if (r1.r == null) goto L15;
        r1.r = null;
        goto L15
    L6:
        if (r1.o(r3.getLeft(), r0) == true) goto L16;
    L18:
        C(r4);
    }

    public final void F() {
        WeakReference r0 = this.U;
        if (r0 == null) goto L80;
        View r02 = (View) r0.get();
        if (r02 == null) goto L81;
        ja0.i(r02, 524288);
        ja0.g(r02, 0);
        ja0.i(r02, 262144);
        ja0.g(r02, 0);
        ja0.i(r02, 1048576);
        ja0.g(r02, 0);
        SparseIntArray r2 = this.c0;
        int r4 = r2.get(0, -1);
        if (r4 == (-1)) goto L10;
        ja0.i(r02, r4);
        ja0.g(r02, 0);
        r2.delete(0);
    L10:
        int r5 = 6;
        if (this.b == true) goto L50;
        if (this.L == 6) goto L50;
        String r10 = r02.getResources().getString(R.string.bottomsheet_action_expand_halfway);
        f2 r11 = new f2(this, 6);
        ArrayList r42 = ja0.e(r02);
        int r6 = 0;
    L16:
        if (r6 >= r42.size()) goto L21;
        if (TextUtils.equals(r10, ((AccessibilityNodeInfo.AccessibilityAction) ((h0) r42.get(r6)).a).getLabel()) == true) goto L19;
        r6 = r6 + 1;
        goto L16
    L19:
        int r9 = ((h0) r42.get(r6)).a();
    L37:
        if (r9 == (-1)) goto L48;
        h0 r7 = new h0(null, r9, r10, r11, null);
        View.AccessibilityDelegate r3 = ja0.c(r02);
        if (r3 != null) goto L42;
        x r32 = null;
    L45:
        if (r32 != null) goto L47;
        r32 = new x();
    L47:
        ja0.l(r02, r32);
        ja0.i(r02, r7.a());
        ja0.e(r02).add(r7);
        ja0.g(r02, 0);
        goto L48
    L42:
        if ((r3 instanceof v) == false) goto L44;
        r32 = ((v) r3).a;
        goto L45
    L44:
        r32 = new x(r3);
    L48:
        r2.put(0, r9);
        goto L50
    L21:
        int r72 = 0;
        int r62 = -1;
    L22:
        int[] r8 = ja0.d;
        if (r72 >= r8.length) goto L36;
        if (r62 != (-1)) goto L36;
        int r82 = r8[r72];
        int r12 = 0;
        boolean r13 = true;
    L27:
        if (r12 >= r42.size()) goto L33;
        if (((h0) r42.get(r12)).a() == r82) goto L31;
        boolean r14 = true;
    L32:
        r13 = r13 & r14;
        r12 = r12 + 1;
        goto L27
    L31:
        r14 = false;
        goto L32
    L33:
        if (r13 == false) goto L35;
        r62 = r82;
    L35:
        r72 = r72 + 1;
    L36:
        r9 = r62;
    L50:
        if (this.I == true) goto L52;
    L54:
        int r1 = this.L;
        if (r1 == 3) goto L67;
        if (r1 == 4) goto L62;
        if (r1 != 6) goto L82;
        ja0.j(r02, h0.i, new f2(this, 4));
        ja0.j(r02, h0.h, new f2(this, 3));
        return;
    L82:
        return;
    L62:
        if (this.b == false) goto L64;
        r5 = 3;
    L64:
        ja0.j(r02, h0.h, new f2(this, r5));
        return;
    L67:
        if (this.b == false) goto L69;
        r5 = 4;
    L69:
        ja0.j(r02, h0.i, new f2(this, r5));
        return;
    L52:
        if (this.L == 5) goto L54;
        ja0.j(r02, h0.j, new f2(this, 5));
        goto L54
    L81:
        return;
    }

    public final void G(int r7, boolean r8) {
        if (r7 != 2) goto L6;
        return;
    L6:
        if (this.L == 3) goto L8;
    L12:
        boolean r72 = false;
    L14:
        if (this.z == r72) goto L41;
        eu r1 = this.i;
        if (r1 == null) goto L44;
        this.z = r72;
        ValueAnimator r4 = this.B;
        float r5 = 1.0f;
        if (r8 == false) goto L30;
        if (r4 == null) goto L30;
        if (r4.isRunning() == false) goto L25;
        r4.reverse();
        return;
    L25:
        float r82 = r1.a.i;
        if (r72 == false) goto L28;
        r5 = s();
    L28:
        r4.setFloatValues(new float[]{r82, r5});
        r4.start();
        return;
    L30:
        if (r4 == null) goto L35;
        if (r4.isRunning() == false) goto L35;
        r4.cancel();
    L35:
        if (this.z == false) goto L37;
        r5 = s();
    L37:
        du r73 = r1.a;
        if (r73.i == r5) goto L42;
        r73.i = r5;
        r1.e = true;
        r1.invalidateSelf();
        return;
    L42:
        return;
    L44:
        return;
    L41:
        return;
    L8:
        if (this.x == false) goto L10;
    L11:
        r72 = true;
        goto L14
    L10:
        if (z() == false) goto L12;
        goto L11
    }

    public final void H(boolean r7) {
        WeakReference r0 = this.U;
        if (r0 == null) goto L30;
        ViewParent r02 = ((View) r0.get()).getParent();
        if ((r02 instanceof CoordinatorLayout) == false) goto L31;
        CoordinatorLayout r03 = (CoordinatorLayout) r02;
        int r1 = r03.getChildCount();
        if (r7 == true) goto L11;
    L13:
        int r2 = 0;
    L14:
        if (r2 >= r1) goto L21;
        View r3 = r03.getChildAt(r2);
        if (r3 == this.U.get()) goto L20;
        if (r7 == false) goto L20;
        this.b0.put(r3, Integer.valueOf(r3.getImportantForAccessibility()));
    L20:
        r2 = r2 + 1;
        goto L14
    L21:
        if (r7 == true) goto L29;
        this.b0 = null;
        return;
    L29:
        return;
    L11:
        if (this.b0 != null) goto L28;
        this.b0 = new HashMap(r1);
        goto L13
    L28:
        return;
    L31:
        return;
    }

    public final void I() {
        if (this.U == null) goto L10;
        r();
        if (this.L != 4) goto L11;
        View r0 = (View) this.U.get();
        if (r0 == null) goto L12;
        r0.requestLayout();
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // defpackage.wd
    public final void c(zd r1) {
        this.U = null;
        this.M = null;
    }

    @Override // defpackage.wd
    public final void e() {
        this.U = null;
        this.M = null;
    }

    @Override // defpackage.wd
    public final boolean f(CoordinatorLayout r10, View r11, MotionEvent r12) {
        if (r11.isShown() == true) goto L5;
    L68:
        this.N = true;
        return false;
    L5:
        if (this.K == false) goto L68;
        int r0 = r12.getActionMasked();
        View r3 = null;
        if (r0 != 0) goto L13;
        this.Y = -1;
        this.Z = -1;
        VelocityTracker r5 = this.X;
        if (r5 == null) goto L13;
        r5.recycle();
        this.X = null;
    L13:
        if (this.X != null) goto L15;
        this.X = VelocityTracker.obtain();
    L15:
        this.X.addMovement(r12);
        if (r0 == 0) goto L25;
        if (r0 != 1) goto L19;
    L21:
        this.a0 = false;
        this.Y = -1;
        if (this.N == false) goto L43;
        this.N = false;
        return false;
    L43:
        if (this.N == true) goto L49;
        ma0 r112 = this.M;
        if (r112 == null) goto L49;
        if (r112.p(r12) == false) goto L49;
    L66:
        return true;
    L49:
        WeakReference r113 = this.V;
        if (r113 == null) goto L52;
        r3 = (View) r113.get();
    L52:
        if (r0 != 2) goto L67;
        if (r3 == null) goto L67;
        if (this.N == true) goto L67;
        if (this.L == 1) goto L67;
        if (r10.o(r3, (int) r12.getX(), (int) r12.getY()) == true) goto L67;
        if (this.M == null) goto L67;
        int r102 = this.Z;
        if (r102 == (-1)) goto L67;
        if (Math.abs(r102 - r12.getY()) > this.M.b) goto L66;
    L67:
        return false;
    L19:
        if (r0 == 3) goto L21;
    L25:
        int r6 = (int) r12.getX();
        this.Z = (int) r12.getY();
        if (this.L == 2) goto L36;
        WeakReference r7 = this.V;
        if (r7 == null) goto L30;
        View r72 = (View) r7.get();
    L31:
        if (r72 == null) goto L36;
        if (r10.o(r72, r6, this.Z) == false) goto L36;
        this.Y = r12.getPointerId(r12.getActionIndex());
        this.a0 = true;
        goto L36
    L30:
        r72 = null;
    L36:
        if (this.Y == (-1)) goto L38;
    L40:
        boolean r114 = false;
    L41:
        this.N = r114;
        goto L43
    L38:
        if (r10.o(r11, r6, this.Z) == true) goto L40;
        r114 = true;
        goto L41
    }

    @Override // defpackage.wd
    public final boolean g(CoordinatorLayout r10, View r11, int r12) {
        WeakHashMap r0 = ja0.a;
        int r1 = 1;
        if (s90.b(r10) == true) goto L5;
    L7:
        boolean r3 = false;
        if (this.U != null) goto L54;
        this.g = r10.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 29) goto L12;
    L16:
        boolean r4 = false;
    L18:
        if (this.o == false) goto L20;
    L31:
        r7 r5 = new r7(this, r4);
        int r6 = t90.f(r11);
        r11.getPaddingTop();
        int r7 = t90.e(r11);
        int r8 = r11.getPaddingBottom();
        ab0 r42 = new ab0();
        r42.a = r6;
        r42.b = r7;
        r42.c = r8;
        y90.u(r11, new d4(r5, r42, 20, r3));
        if (v90.b(r11) == false) goto L34;
        w90.c(r11);
    L35:
        ad r43 = new ad(r11);
        if (r02 < 30) goto L38;
        d0.o(r11, new dc0(r43));
    L41:
        this.U = new WeakReference(r11);
        Context r03 = r11.getContext();
        ct.w(r03, R.attr.motionEasingStandardDecelerateInterpolator, nx.b(0.0f, 0.0f, 0.0f, 1.0f));
        ct.v(r03, R.attr.motionDurationMedium2, 300);
        ct.v(r03, R.attr.motionDurationShort3, 150);
        ct.v(r03, R.attr.motionDurationShort2, 100);
        Resources r04 = r11.getResources();
        r04.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        r04.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
        eu r05 = this.i;
        if (r05 == null) goto L47;
        s90.q(r11, r05);
        float r52 = this.H;
        if (r52 != (-1.0f)) goto L46;
        r52 = y90.i(r11);
    L46:
        r05.i(r52);
    L50:
        F();
        if (s90.c(r11) != 0) goto L54;
        s90.s(r11, 1);
        goto L54
    L47:
        ColorStateList r06 = this.j;
        if (r06 == null) goto L50;
        y90.q(r11, r06);
        goto L50
    L38:
        Object r07 = r11.getTag(R.id.tag_on_apply_window_listener);
        View.OnApplyWindowInsetsListener r53 = new bc0(r11, r43);
        r11.setTag(R.id.tag_window_insets_animation_callback, r53);
        if (r07 != null) goto L41;
        r11.setOnApplyWindowInsetsListener(r53);
        goto L41
    L34:
        r11.addOnAttachStateChangeListener(new wn(r1));
        goto L35
    L20:
        if (this.p == true) goto L31;
        if (this.q == true) goto L31;
        if (this.s == true) goto L31;
        if (this.t == true) goto L31;
        if (this.u == true) goto L31;
        if (r4 == true) goto L31;
    L12:
        if (this.n == true) goto L16;
        if (this.f == true) goto L16;
        r4 = true;
    L54:
        if (this.M != null) goto L56;
        this.M = new ma0(r10.getContext(), r10, this.d0);
    L56:
        int r08 = r11.getTop();
        r10.q(r11, r12);
        this.S = r10.getWidth();
        this.T = r10.getHeight();
        int r102 = r11.getHeight();
        this.R = r102;
        int r122 = this.T;
        int r103 = r122 - r102;
        int r44 = this.w;
        if (r103 >= r44) goto L69;
        boolean r104 = this.r;
        int r54 = this.l;
        if (r104 == false) goto L64;
        if (r54 == (-1)) goto L63;
        r122 = Math.min(r122, r54);
    L63:
        this.R = r122;
        goto L69
    L64:
        int r123 = r122 - r44;
        if (r54 == (-1)) goto L68;
        r123 = Math.min(r123, r54);
    L68:
        this.R = r123;
    L69:
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        r();
        int r105 = this.L;
        if (r105 != 3) goto L73;
        r11.offsetTopAndBottom(x());
    L87:
        G(this.L, false);
        this.V = new WeakReference(v(r11));
        ArrayList r106 = this.W;
        if (r106.size() > 0) goto L90;
        return true;
    L90:
        r106.get(0).getClass();
        throw new ClassCastException();
    L73:
        if (r105 != 6) goto L76;
        r11.offsetTopAndBottom(this.E);
        goto L87
    L76:
        if (this.I == false) goto L81;
        if (r105 != 5) goto L81;
        r11.offsetTopAndBottom(this.T);
    L81:
        if (r105 != 4) goto L83;
        r11.offsetTopAndBottom(this.G);
        goto L87
    L83:
        if (r105 != 1) goto L85;
    L86:
        r11.offsetTopAndBottom(r08 - r11.getTop());
        goto L87
    L85:
        if (r105 != 2) goto L87;
    L5:
        if (s90.b(r11) == true) goto L7;
        r11.setFitsSystemWindows(true);
        goto L7
    }

    @Override // defpackage.wd
    public final boolean h(CoordinatorLayout r4, View r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r1 = r4.getPaddingLeft();
        int r62 = w(r6, (((r4.getPaddingRight() + r1) + r0.leftMargin) + r0.rightMargin) + r7, this.k, r0.width);
        int r72 = r4.getPaddingTop();
        r5.measure(r62, w(r8, ((r4.getPaddingBottom() + r72) + r0.topMargin) + r0.bottomMargin, this.l, r0.height));
        return true;
    }

    @Override // defpackage.wd
    public final boolean i(View r2) {
        WeakReference r0 = this.V;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r2 == r0.get()) goto L7;
        return false;
    L7:
        if (this.L == 3) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // defpackage.wd
    public final void j(CoordinatorLayout r3, View r4, View r5, int r6, int r7, int[] r8, int r9) {
        if (r9 == 1) goto L33;
        WeakReference r62 = this.V;
        if (r62 == null) goto L8;
        View r63 = (View) r62.get();
    L9:
        if (r5 != r63) goto L34;
        int r64 = r4.getTop();
        int r92 = r64 - r7;
        boolean r0 = this.K;
        if (r7 > 0) goto L14;
        if (r7 < 0) goto L21;
    L31:
        u(r4.getTop());
        this.O = r7;
        this.P = true;
        return;
    L21:
        if (r5.canScrollVertically(-1) == true) goto L31;
        int r52 = this.G;
        if (r92 > r52) goto L25;
    L28:
        if (r0 == true) goto L30;
        return;
    L30:
        r8[1] = r7;
        WeakHashMap r65 = ja0.a;
        r4.offsetTopAndBottom(-r7);
        C(1);
        goto L31
    L25:
        if (this.I == true) goto L28;
        int r66 = r64 - r52;
        r8[1] = r66;
        int r53 = -r66;
        WeakHashMap r67 = ja0.a;
        r4.offsetTopAndBottom(r53);
        C(4);
        goto L31
    L14:
        if (r92 >= x()) goto L16;
        int r68 = r64 - x();
        r8[1] = r68;
        int r54 = -r68;
        WeakHashMap r69 = ja0.a;
        r4.offsetTopAndBottom(r54);
        C(3);
        goto L31
    L16:
        if (r0 == false) goto L35;
        r8[1] = r7;
        WeakHashMap r610 = ja0.a;
        r4.offsetTopAndBottom(-r7);
        C(1);
        goto L31
    L35:
        return;
    L34:
        return;
    L8:
        r63 = null;
        goto L9
    }

    @Override // defpackage.wd
    public final void m(View r6, Parcelable r7) {
        t7 r72 = (t7) r7;
        int r2 = this.a;
        if (r2 != 0) goto L6;
    L22:
        int r73 = r72.c;
        if (r73 == 1) goto L28;
        if (r73 == 2) goto L28;
        this.L = r73;
        return;
    L28:
        this.L = 4;
        return;
    L6:
        if (r2 != (-1)) goto L8;
    L9:
        this.e = r72.d;
    L10:
        if (r2 != (-1)) goto L12;
    L13:
        this.b = r72.e;
    L14:
        if (r2 != (-1)) goto L16;
    L17:
        this.I = r72.f;
    L18:
        if (r2 != (-1)) goto L20;
    L21:
        this.J = r72.g;
        goto L22
    L20:
        if ((r2 & 8) != 8) goto L22;
    L16:
        if ((r2 & 4) != 4) goto L18;
    L12:
        if ((r2 & 2) != 2) goto L14;
    L8:
        if ((r2 & 1) != 1) goto L10;
        goto L9
    }

    @Override // defpackage.wd
    public final Parcelable n(View r2) {
        AbsSavedState r0 = View.BaseSavedState.EMPTY_STATE;
        return new t7(this);
    }

    @Override // defpackage.wd
    public final boolean o(View r1, int r2, int r3) {
        this.O = 0;
        this.P = false;
        if ((r2 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.wd
    public final void p(View r4, View r5, int r6) {
        int r1 = 3;
        if (r4.getTop() != x()) goto L6;
        C(3);
        return;
    L6:
        WeakReference r62 = this.V;
        if (r62 != null) goto L9;
        return;
    L9:
        if (r5 == r62.get()) goto L11;
        return;
    L11:
        if (this.P == true) goto L14;
        return;
    L14:
        if (this.O <= 0) goto L22;
        if (this.b == false) goto L19;
    L51:
        E(r4, r1, false);
        this.P = false;
        return;
    L19:
        if (r4.getTop() <= this.E) goto L51;
    L50:
        r1 = 6;
        goto L51
    L22:
        if (this.I == false) goto L31;
        VelocityTracker r52 = this.X;
        if (r52 != null) goto L26;
        float r53 = 0.0f;
    L28:
        if (D(r4, r53) == false) goto L31;
        r1 = 5;
        goto L51
    L26:
        r52.computeCurrentVelocity(1000, this.c);
        r53 = this.X.getYVelocity(this.Y);
    L31:
        if (this.O != 0) goto L46;
        int r54 = r4.getTop();
        if (this.b == true) goto L35;
        int r2 = this.E;
        if (r54 >= r2) goto L43;
        if (r54 >= Math.abs(r54 - this.G)) goto L50;
    L43:
        if (Math.abs(r54 - r2) < Math.abs(r54 - this.G)) goto L50;
    L47:
        r1 = 4;
        goto L51
    L35:
        if (Math.abs(r54 - this.D) >= Math.abs(r54 - this.G)) goto L47;
    L46:
        if (this.b == true) goto L47;
        int r55 = r4.getTop();
        if (Math.abs(r55 - this.E) >= Math.abs(r55 - this.G)) goto L47;
        goto L47
    }

    @Override // defpackage.wd
    public final boolean q(View r6, MotionEvent r7) {
        if (r6.isShown() == true) goto L6;
        return false;
    L6:
        int r0 = r7.getActionMasked();
        int r1 = this.L;
        if (r1 != 1) goto L10;
        if (r0 != 0) goto L10;
        return true;
    L10:
        ma0 r3 = this.M;
        if (r3 != null) goto L13;
    L16:
        if (r0 != 0) goto L21;
        this.Y = -1;
        this.Z = -1;
        VelocityTracker r12 = this.X;
        if (r12 == null) goto L21;
        r12.recycle();
        this.X = null;
    L21:
        if (this.X != null) goto L23;
        this.X = VelocityTracker.obtain();
    L23:
        this.X.addMovement(r7);
        if (this.M == null) goto L37;
        if (this.K == true) goto L30;
        if (this.L != 1) goto L37;
    L30:
        if (r0 != 2) goto L37;
        if (this.N == true) goto L37;
        float r02 = Math.abs(this.Z - r7.getY());
        ma0 r13 = this.M;
        if (r02 <= r13.b) goto L37;
        r13.b(r6, r7.getPointerId(r7.getActionIndex()));
    L37:
        return !this.N;
    L13:
        if (this.K == true) goto L15;
        if (r1 != 1) goto L16;
    L15:
        r3.j(r7);
        goto L16
    }

    public final void r() {
        int r0 = t();
        if (this.b == false) goto L6;
        this.G = Math.max(this.T - r0, this.D);
        return;
    L6:
        this.G = this.T - r0;
    }

    public final float s() {
        float r1 = 0.0f;
        if (this.i == null) goto L31;
        WeakReference r0 = this.U;
        if (r0 == null) goto L31;
        if (r0.get() == null) goto L31;
        if (Build.VERSION.SDK_INT < 31) goto L31;
        View r02 = (View) this.U.get();
        if (z() == false) goto L31;
        WindowInsets r03 = r02.getRootWindowInsets();
        if (r03 == null) goto L31;
        eu r2 = this.i;
        float r22 = r2.a.a.e.a(r2.f());
        RoundedCorner r3 = p7.i(r03);
        if (r3 == null) goto L21;
        float r32 = p7.c(r3);
        if (r32 <= 0.0f) goto L21;
        if (r22 <= 0.0f) goto L21;
        float r33 = r32 / r22;
    L22:
        eu r23 = this.i;
        float r24 = r23.a.a.f.a(r23.f());
        RoundedCorner r04 = p7.t(r03);
        if (r04 == null) goto L30;
        float r05 = p7.c(r04);
        if (r05 <= 0.0f) goto L30;
        if (r24 <= 0.0f) goto L30;
        r1 = r05 / r24;
    L30:
        return Math.max(r33, r1);
    L21:
        r33 = 0.0f;
    L31:
        return 0.0f;
    }

    public final int t() {
        if (this.f == false) goto L7;
        return Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R) + this.v;
    L7:
        if (this.n == true) goto L15;
        if (this.o == true) goto L15;
        int r0 = this.m;
        if (r0 <= 0) goto L15;
        return Math.max(this.e, r0 + this.h);
    L15:
        return this.e + this.v;
    }

    public final void u(int r3) {
        if (((View) this.U.get()) == null) goto L17;
        ArrayList r0 = this.W;
        if (r0.isEmpty() == true) goto L18;
        int r1 = this.G;
        if (r3 > r1) goto L13;
        if (r1 == x()) goto L13;
        x();
    L13:
        if (r0.size() <= 0) goto L19;
        r0.get(0).getClass();
        throw new ClassCastException();
    L19:
        return;
    L18:
        return;
    }

    public final int x() {
        if (this.b == false) goto L7;
        return this.D;
    L7:
        if (this.r == false) goto L9;
        int r0 = 0;
    L11:
        return Math.max(this.C, r0);
    L9:
        r0 = this.w;
        goto L11
    }

    public final int y(int r4) {
        if (r4 == 3) goto L19;
        if (r4 == 4) goto L17;
        if (r4 == 5) goto L15;
        if (r4 != 6) goto L13;
        return this.E;
    L13:
        throw new IllegalArgumentException("Invalid state to get top offset: " + r4);
    L15:
        return this.T;
    L17:
        return this.G;
    L19:
        return x();
    }

    public final boolean z() {
        WeakReference r0 = this.U;
        if (r0 != null) goto L5;
    L10:
        return false;
    L5:
        if (r0.get() == null) goto L10;
        int[] r02 = new int[2];
        ((View) this.U.get()).getLocationOnScreen(r02);
        if (r02[1] != 0) goto L10;
        return true;
    }

    public BottomSheetBehavior(Context r13, AttributeSet r14) {
        int r0 = 0;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new u7(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new s7(this, r0);
        this.h = r13.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray r6 = r13.obtainStyledAttributes(r14, wy.a);
        int r7 = 3;
        if (r6.hasValue(3) == false) goto L6;
        this.j = ct.n(r13, r6, 3);
    L6:
        if (r6.hasValue(21) == false) goto L8;
        this.y = f30.b(r13, r14, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
    L8:
        f30 r142 = this.y;
        if (r142 == null) goto L15;
        eu r8 = new eu(r142);
        this.i = r8;
        r8.h(r13);
        ColorStateList r143 = this.j;
        if (r143 == null) goto L14;
        this.i.j(r143);
        goto L15
    L14:
        TypedValue r144 = new TypedValue();
        r13.getTheme().resolveAttribute(android.R.attr.colorBackground, r144, true);
        this.i.setTint(r144.data);
    L15:
        ValueAnimator r9 = ValueAnimator.ofFloat(new float[]{s(), 1.0f});
        this.B = r9;
        r9.setDuration(500);
        this.B.addUpdateListener(new q7(r0, this));
        this.H = r6.getDimension(2, -1.0f);
        if (r6.hasValue(0) == false) goto L19;
        this.k = r6.getDimensionPixelSize(0, -1);
    L19:
        if (r6.hasValue(1) == false) goto L21;
        this.l = r6.getDimensionPixelSize(1, -1);
    L21:
        TypedValue r82 = r6.peekValue(9);
        if (r82 == null) goto L26;
        int r83 = r82.data;
        if (r83 != (-1)) goto L26;
        A(r83);
    L27:
        boolean r2 = r6.getBoolean(8, false);
        if (this.I == r2) goto L35;
        this.I = r2;
        if (r2 == false) goto L32;
    L34:
        F();
        goto L35
    L32:
        if (this.L != 5) goto L34;
        B(4);
    L35:
        this.n = r6.getBoolean(13, false);
        boolean r4 = r6.getBoolean(6, true);
        if (this.b == r4) goto L48;
        this.b = r4;
        if (this.U == null) goto L42;
        r();
    L42:
        if (this.b == true) goto L44;
    L46:
        r7 = this.L;
    L47:
        C(r7);
        G(this.L, true);
        F();
        goto L48
    L44:
        if (this.L != 6) goto L46;
    L48:
        this.J = r6.getBoolean(12, false);
        this.K = r6.getBoolean(4, true);
        this.a = r6.getInt(10, 0);
        float r22 = r6.getFloat(7, 0.5f);
        if (r22 <= 0.0f) goto L72;
        if (r22 >= 1.0f) goto L72;
        this.F = r22;
        if (this.U == null) goto L55;
        this.E = (int) ((1.0f - r22) * this.T);
    L55:
        TypedValue r145 = r6.peekValue(5);
        if (r145 != null) goto L58;
    L64:
        int r146 = r6.getDimensionPixelOffset(5, 0);
        if (r146 < 0) goto L70;
        this.C = r146;
        G(this.L, true);
    L67:
        this.d = r6.getInt(11, 500);
        this.o = r6.getBoolean(17, false);
        this.p = r6.getBoolean(18, false);
        this.q = r6.getBoolean(19, false);
        this.r = r6.getBoolean(20, true);
        this.s = r6.getBoolean(14, false);
        this.t = r6.getBoolean(15, false);
        this.u = r6.getBoolean(16, false);
        this.x = r6.getBoolean(23, true);
        r6.recycle();
        this.c = ViewConfiguration.get(r13).getScaledMaximumFlingVelocity();
        return;
    L70:
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    L58:
        if (r145.type != 16) goto L64;
        int r147 = r145.data;
        if (r147 < 0) goto L63;
        this.C = r147;
        G(this.L, true);
        goto L67
    L63:
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    L72:
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    L26:
        A(r6.getDimensionPixelSize(9, -1));
        goto L27
    }

    @Override // defpackage.wd
    public final void k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
    }
}
