package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0682Pu;
import p000.AbstractC0688Q;
import p000.AbstractC0706Qb;
import p000.AbstractC1255cE;
import p000.AbstractC1360eE;
import p000.AbstractC2185lE;
import p000.AbstractC2357pE;
import p000.C0132D2;
import p000.C0422Js;
import p000.C0489LF;
import p000.C0834Tb;
import p000.C0920Vb;
import p000.C0963Wb;
import p000.C1067Yt;
import p000.C1110Zt;
import p000.C2428qs;
import p000.C2520sy;
import p000.InterfaceC0336Hs;
import p000.InterfaceC0379Is;
import p000.InterfaceC0748Rb;
import p000.ViewGroupOnHierarchyChangeListenerC0791Sb;
import p000.ViewTreeObserverOnPreDrawListenerC0877Ub;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0336Hs, InterfaceC0379Is {

    /* JADX INFO: renamed from: t */
    public static final String f3886t = null;

    /* JADX INFO: renamed from: u */
    public static final Class[] f3887u = null;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f3888v = null;

    /* JADX INFO: renamed from: w */
    public static final C0963Wb f3889w = null;

    /* JADX INFO: renamed from: x */
    public static final C1110Zt f3890x = null;

    /* JADX INFO: renamed from: a */
    public final ArrayList f3891a;

    /* JADX INFO: renamed from: b */
    public final C2428qs f3892b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3893c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3894d;

    /* JADX INFO: renamed from: e */
    public final int[] f3895e;

    /* JADX INFO: renamed from: f */
    public final int[] f3896f;

    /* JADX INFO: renamed from: g */
    public boolean f3897g;

    /* JADX INFO: renamed from: h */
    public boolean f3898h;

    /* JADX INFO: renamed from: i */
    public final int[] f3899i;

    /* JADX INFO: renamed from: j */
    public View f3900j;

    /* JADX INFO: renamed from: k */
    public View f3901k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC0877Ub f3902l;

    /* JADX INFO: renamed from: m */
    public boolean f3903m;

    /* JADX INFO: renamed from: n */
    public C0489LF f3904n;

    /* JADX INFO: renamed from: o */
    public boolean f3905o;

    /* JADX INFO: renamed from: p */
    public Drawable f3906p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f3907q;

    /* JADX INFO: renamed from: r */
    public C0132D2 f3908r;

    /* JADX INFO: renamed from: s */
    public final C0422Js f3909s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 == null) goto L5;
        String r02 = r0.getName();
    L6:
        f3886t = r02;
        f3889w = new C0963Wb(0);
        f3887u = new Class[]{Context.class, AttributeSet.class};
        f3888v = new ThreadLocal();
        f3890x = new C1110Zt(12);
        return;
    L5:
        r02 = null;
        goto L6
    }

    public CoordinatorLayout(Context r6, AttributeSet r7) {
        super(r6, r7, R.attr.coordinatorLayoutStyle);
        this.f3891a = new ArrayList();
        this.f3892b = new C2428qs(3);
        this.f3893c = new ArrayList();
        this.f3894d = new ArrayList();
        this.f3895e = new int[2];
        this.f3896f = new int[2];
        this.f3909s = new C0422Js();
        int[] r1 = AbstractC0682Pu.f2180a;
        int r2 = 0;
        TypedArray r0 = r6.obtainStyledAttributes(r7, r1, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT < 29) goto L5;
        AbstractC0688Q.m1415s(this, r6, r1, r7, r0);
    L5:
        int r72 = r0.getResourceId(0, 0);
        if (r72 == 0) goto L10;
        Resources r62 = r6.getResources();
        int[] r73 = r62.getIntArray(r72);
        this.f3899i = r73;
        float r63 = r62.getDisplayMetrics().density;
        int r74 = r73.length;
    L8:
        if (r2 >= r74) goto L10;
        this.f3899i[r2] = (int) (r1[r2] * r63);
        r2 = r2 + 1;
    L10:
        this.f3906p = r0.getDrawable(1);
        r0.recycle();
        m2144v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0791Sb(this));
        WeakHashMap r75 = AbstractC2185lE.f7617a;
        if (getImportantForAccessibility() != 0) goto L15;
        setImportantForAccessibility(1);
        return;
    }

    /* JADX INFO: renamed from: g */
    public static Rect m2129g() {
        Rect r0 = (Rect) f3890x.mo1935c();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new Rect();
    }

    /* JADX INFO: renamed from: l */
    public static void m2130l(int r6, Rect r7, Rect r8, C0834Tb r9, int r10, int r11) {
        int r0 = r9.f2647c;
        if (r0 != 0) goto L5;
        r0 = 17;
    L5:
        int r02 = Gravity.getAbsoluteGravity(r0, r6);
        int r92 = r9.f2648d;
        if ((r92 & 7) != 0) goto L9;
        r92 = r92 | 8388611;
    L9:
        if ((r92 & 112) != 0) goto L11;
        r92 = r92 | 48;
    L11:
        int r62 = Gravity.getAbsoluteGravity(r92, r6);
        int r93 = r02 & 7;
        int r03 = r02 & 112;
        int r1 = r62 & 7;
        int r63 = r62 & 112;
        if (r1 == 1) goto L16;
        if (r1 == 5) goto L15;
        int r12 = r7.left;
    L18:
        if (r63 == 16) goto L22;
        if (r63 == 80) goto L21;
        int r64 = r7.top;
    L23:
        if (r93 == 1) goto L26;
        if (r93 == 5) goto L27;
        r12 = r12 - r10;
    L27:
        if (r03 == 16) goto L30;
        if (r03 == 80) goto L31;
        r64 = r64 - r11;
    L31:
        r8.set(r12, r64, r10 + r12, r11 + r64);
        return;
    L30:
        r64 = r64 - (r11 / 2);
        goto L31
    L26:
        r12 = r12 - (r10 / 2);
        goto L27
    L21:
        r64 = r7.bottom;
        goto L23
    L22:
        r64 = r7.top + (r7.height() / 2);
        goto L23
    L15:
        r12 = r7.right;
        goto L18
    L16:
        r12 = r7.left + (r7.width() / 2);
        goto L18
    }

    /* JADX INFO: renamed from: m */
    public static C0834Tb m2131m(View r4) {
        C0834Tb r0 = (C0834Tb) r4.getLayoutParams();
        if (r0.f2646b == true) goto L21;
        Class<?> r42 = r4.getClass();
        InterfaceC0748Rb r2 = null;
    L5:
        if (r42 == null) goto L10;
        r2 = (InterfaceC0748Rb) r42.getAnnotation(InterfaceC0748Rb.class);
        if (r2 != null) goto L10;
        r42 = r42.getSuperclass();
    L10:
        if (r2 != null) goto L22;
    L20:
        r0.f2646b = true;
        goto L21
    L22:
        AbstractC0706Qb r1 = (AbstractC0706Qb) r2.value().getDeclaredConstructor(null).newInstance(null);     // Catch: Exception -> L19
        AbstractC0706Qb r3 = r0.f2645a;     // Catch: Exception -> L19
        if (r3 == r1) goto L20;
        if (r3 == null) goto L15;
        r3.mo1457e();     // Catch: Exception -> L19
    L15:
        r0.f2645a = r1;     // Catch: Exception -> L19
        r0.f2646b = true;     // Catch: Exception -> L19
        if (r1 == null) goto L20;
        r1.mo1455c(r0);     // Catch: Exception -> L19
    L19:
        r2.value().getClass();
    L21:
        return r0;
    }

    /* JADX INFO: renamed from: t */
    public static void m2132t(View r3, int r4) {
        C0834Tb r0 = (C0834Tb) r3.getLayoutParams();
        int r1 = r0.f2653i;
        if (r1 == r4) goto L6;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        r3.offsetLeftAndRight(r4 - r1);
        r0.f2653i = r4;
        return;
    }

    /* JADX INFO: renamed from: u */
    public static void m2133u(View r3, int r4) {
        C0834Tb r0 = (C0834Tb) r3.getLayoutParams();
        int r1 = r0.f2654j;
        if (r1 == r4) goto L6;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        r3.offsetTopAndBottom(r4 - r1);
        r0.f2654j = r4;
        return;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: a */
    public final void mo720a(View r2, View r3, int r4, int r5) {
        C0422Js r0 = this.f3909s;
        if (r5 != 1) goto L5;
        r0.f1404b = r4;
    L6:
        this.f3901k = r3;
        int r22 = getChildCount();
        int r32 = 0;
    L7:
        if (r32 >= r22) goto L9;
        ((C0834Tb) getChildAt(r32).getLayoutParams()).getClass();
        r32 = r32 + 1;
        goto L7
    L9:
        return;
    L5:
        r0.f1403a = r4;
        goto L6
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: b */
    public final void mo721b(View r8, int r9) {
        C0422Js r0 = this.f3909s;
        if (r9 != 1) goto L5;
        r0.f1404b = 0;
    L6:
        int r02 = getChildCount();
        int r3 = 0;
    L7:
        if (r3 >= r02) goto L20;
        View r4 = getChildAt(r3);
        C0834Tb r5 = (C0834Tb) r4.getLayoutParams();
        if (r5.m1659a(r9) == false) goto L19;
        AbstractC0706Qb r6 = r5.f2645a;
        if (r6 == null) goto L14;
        r6.mo1468p(r4, r8, r9);
    L14:
        if (r9 == 0) goto L18;
        if (r9 != 1) goto L19;
        r5.f2658n = false;
        goto L19
    L18:
        r5.f2657m = false;
    L19:
        r3 = r3 + 1;
        goto L7
    L20:
        this.f3901k = null;
        return;
    L5:
        r0.f1403a = 0;
        goto L6
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: c */
    public final void mo722c(View r15, int r16, int r17, int[] r18, int r19) {
        int r8 = getChildCount();
        boolean r0 = false;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
    L4:
        if (r10 >= r8) goto L24;
        View r2 = getChildAt(r10);
        if (r2.getVisibility() == 8) goto L23;
        C0834Tb r3 = (C0834Tb) r2.getLayoutParams();
        if (r3.m1659a(r19) == false) goto L23;
        AbstractC0706Qb r32 = r3.f2645a;
        if (r32 == null) goto L23;
        int[] r6 = this.f3895e;
        r6[0] = 0;
        r6[1] = 0;
        r32.mo1462j(this, r2, r15, r16, r17, r6, r19);
        if (r16 <= 0) goto L17;
        int r02 = Math.max(r11, r6[0]);
    L16:
        r11 = r02;
        if (r17 <= 0) goto L21;
        int r03 = Math.max(r12, r6[1]);
    L20:
        r12 = r03;
        r0 = true;
        goto L23
    L21:
        r03 = Math.min(r12, r6[1]);
        goto L20
    L17:
        r02 = Math.min(r11, r6[0]);
    L23:
        r10 = r10 + 1;
        goto L4
    L24:
        r18[0] = r11;
        r18[1] = r12;
        if (r0 == false) goto L33;
        m2139o(1);
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C0834Tb) == true) goto L5;
        return false;
    L5:
        if (super.checkLayoutParams(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.InterfaceC0379Is
    /* JADX INFO: renamed from: d */
    public final void mo820d(View r15, int r16, int r17, int r18, int r19, int r20, int[] r21) {
        int r152 = getChildCount();
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r1 >= r152) goto L22;
        View r8 = getChildAt(r1);
        if (r8.getVisibility() == 8) goto L21;
        C0834Tb r6 = (C0834Tb) r8.getLayoutParams();
        if (r6.m1659a(r20) == false) goto L21;
        AbstractC0706Qb r62 = r6.f2645a;
        if (r62 == null) goto L21;
        int[] r12 = this.f3895e;
        r12[0] = 0;
        r12[1] = 0;
        r62.mo1463k(this, r8, r17, r18, r19, r12);
        if (r18 <= 0) goto L16;
        r2 = Math.max(r2, r12[0]);
    L17:
        if (r19 <= 0) goto L19;
        r3 = Math.max(r3, r12[1]);
    L20:
        r4 = true;
        goto L21
    L19:
        r3 = Math.min(r3, r12[1]);
        goto L20
    L16:
        r2 = Math.min(r2, r12[0]);
    L21:
        r1 = r1 + 1;
        goto L4
    L22:
        r21[0] = r21[0] + r2;
        r21[1] = r21[1] + r3;
        if (r4 == false) goto L31;
        m2139o(1);
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r2, View r3, long r4) {
        AbstractC0706Qb r0 = ((C0834Tb) r3.getLayoutParams()).f2645a;
        if (r0 == null) goto L6;
        r0.getClass();
    L6:
        return super.drawChild(r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] r0 = getDrawableState();
        Drawable r1 = this.f3906p;
        if (r1 != null) goto L5;
    L7:
        boolean r02 = false;
    L8:
        if (r02 == false) goto L11;
        invalidate();
        return;
    L11:
        return;
    L5:
        if (r1.isStateful() == false) goto L7;
        r02 = r1.setState(r0);
        goto L8
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: e */
    public final void mo723e(View r9, int r10, int r11, int r12, int r13, int r14) {
        mo820d(r9, r10, r11, r12, r13, 0, this.f3896f);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: f */
    public final boolean mo724f(View r7, View r8, int r9, int r10) {
        int r72 = getChildCount();
        int r0 = 0;
        boolean r1 = false;
    L3:
        if (r0 >= r72) goto L21;
        View r2 = getChildAt(r0);
        if (r2.getVisibility() == 8) goto L20;
        C0834Tb r3 = (C0834Tb) r2.getLayoutParams();
        AbstractC0706Qb r4 = r3.f2645a;
        if (r4 == null) goto L15;
        boolean r22 = r4.mo1467o(r2, r9, r10);
        r1 = r1 | r22;
        if (r10 == 0) goto L14;
        if (r10 != 1) goto L20;
        r3.f2658n = r22;
        goto L20
    L14:
        r3.f2657m = r22;
        goto L20
    L15:
        if (r10 == 0) goto L19;
        if (r10 != 1) goto L20;
        r3.f2658n = false;
        goto L20
    L19:
        r3.f2657m = false;
    L20:
        r0 = r0 + 1;
        goto L3
    L21:
        return r1;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0834Tb();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new C0834Tb(getContext(), r3);
    }

    public final List<View> getDependencySortedChildren() {
        m2142r();
        return Collections.unmodifiableList(this.f3891a);
    }

    public final C0489LF getLastWindowInsets() {
        return this.f3904n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0422Js r0 = this.f3909s;
        int r1 = r0.f1403a;
        return r0.f1404b | r1;
    }

    public Drawable getStatusBarBackground() {
        return this.f3906p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int r0 = super.getSuggestedMinimumHeight();
        int r1 = getPaddingTop();
        return Math.max(r0, getPaddingBottom() + r1);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int r0 = super.getSuggestedMinimumWidth();
        int r1 = getPaddingLeft();
        return Math.max(r0, getPaddingRight() + r1);
    }

    /* JADX INFO: renamed from: h */
    public final void m2134h(C0834Tb r6, Rect r7, int r8, int r9) {
        int r0 = getWidth();
        int r1 = getHeight();
        int r02 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r6).leftMargin, Math.min(r7.left, ((r0 - getPaddingRight()) - r8) - ((ViewGroup.MarginLayoutParams) r6).rightMargin));
        int r62 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r6).topMargin, Math.min(r7.top, ((r1 - getPaddingBottom()) - r9) - ((ViewGroup.MarginLayoutParams) r6).bottomMargin));
        r7.set(r02, r62, r8 + r02, r9 + r62);
    }

    /* JADX INFO: renamed from: i */
    public final void m2135i(View r3, Rect r4, boolean r5) {
        if (r3.isLayoutRequested() == false) goto L5;
    L12:
        r4.setEmpty();
        return;
    L5:
        if (r3.getVisibility() == 8) goto L12;
        if (r5 == false) goto L10;
        m2137k(r3, r4);
        return;
    L10:
        r4.set(r3.getLeft(), r3.getTop(), r3.getRight(), r3.getBottom());
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m2136j(View r6) {
        C2520sy r0 = (C2520sy) this.f3892b.f8523d;
        int r1 = r0.f8818c;
        ArrayList r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        ArrayList r4 = (ArrayList) r0.m5003j(r3);
        if (r4 == null) goto L11;
        if (r4.contains(r6) == false) goto L11;
        if (r2 != null) goto L10;
        r2 = new ArrayList();
    L10:
        r2.add(r0.m5002f(r3));
    L11:
        r3 = r3 + 1;
        goto L3
    L12:
        ArrayList r62 = this.f3894d;
        r62.clear();
        if (r2 == null) goto L15;
        r62.addAll(r2);
    L15:
        return r62;
    }

    /* JADX INFO: renamed from: k */
    public final void m2137k(View r5, Rect r6) {
        ThreadLocal r0 = AbstractC2357pE.f8243a;
        r6.set(0, 0, r5.getWidth(), r5.getHeight());
        ThreadLocal r02 = AbstractC2357pE.f8243a;
        Matrix r1 = (Matrix) r02.get();
        if (r1 != null) goto L5;
        r1 = new Matrix();
        r02.set(r1);
    L6:
        AbstractC2357pE.m4773a(this, r5, r1);
        ThreadLocal r52 = AbstractC2357pE.f8244b;
        RectF r03 = (RectF) r52.get();
        if (r03 != null) goto L9;
        r03 = new RectF();
        r52.set(r03);
    L9:
        r03.set(r6);
        r1.mapRect(r03);
        r6.set((int) (r03.left + 0.5f), (int) (r03.top + 0.5f), (int) (r03.right + 0.5f), (int) (r03.bottom + 0.5f));
        return;
    L5:
        r1.reset();
        goto L6
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2138n(View r3, int r4, int r5) {
        C1110Zt r0 = f3890x;
        Rect r1 = m2129g();
        m2137k(r3, r1);
        boolean r32 = r1.contains(r4, r5);     // Catch: Throwable -> L6
        r1.setEmpty();
        r0.mo1934a(r1);
        return r32;
    L6:
        th = move-exception;
        r1.setEmpty();
        r0.mo1934a(r1);
        throw th;
    }

    /* JADX INFO: renamed from: o */
    public final void m2139o(int r23) {
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        int r3 = getLayoutDirection();
        ArrayList r22 = this.f3891a;
        int r9 = r22.size();
        Rect r10 = m2129g();
        Rect r11 = m2129g();
        Rect r12 = m2129g();
        int r14 = 0;
    L3:
        C1110Zt r15 = f3890x;
        if (r14 >= r9) goto L120;
        View r4 = (View) r22.get(r14);
        C0834Tb r5 = (C0834Tb) r4.getLayoutParams();
        if (r23 == 0) goto L8;
    L10:
        int r6 = 0;
    L11:
        if (r6 >= r14) goto L35;
        if (r5.f2656l != ((View) r22.get(r6))) goto L33;
        C0834Tb r7 = (C0834Tb) r4.getLayoutParams();
        if (r7.f2655k == null) goto L33;
        Rect r8 = m2129g();
        Rect r13 = m2129g();
        C0834Tb r17 = r5;
        Rect r52 = m2129g();
        m2137k(r7.f2655k, r8);
        m2135i(r4, r13, false);
        int r72 = r4.getMeasuredWidth();
        View r19 = r4;
        int r82 = r19.getMeasuredHeight();
        ArrayList r172 = r22;
        C0834Tb r24 = r17;
        int r18 = r6;
        r3 = r3;
        int r20 = r14;
        View r142 = r19;
        m2130l(r3, r8, r52, r7, r72, r82);
        int r192 = r9;
        Rect r21 = r12;
        if (r52.left == r13.left) goto L19;
    L22:
        boolean r16 = true;
    L23:
        m2134h(r7, r52, r72, r82);
        int r73 = r52.left - r13.left;
        int r83 = r52.top - r13.top;
        if (r73 == 0) goto L26;
        WeakHashMap r92 = AbstractC2185lE.f7617a;
        r142.offsetLeftAndRight(r73);
    L26:
        if (r83 == 0) goto L28;
        WeakHashMap r74 = AbstractC2185lE.f7617a;
        r142.offsetTopAndBottom(r83);
    L28:
        if (r16 == false) goto L32;
        AbstractC0706Qb r75 = r7.f2645a;
        if (r75 == null) goto L32;
        r75.mo1456d(this, r142, r7.f2655k);
    L32:
        r8.setEmpty();
        r15.mo1934a(r8);
        r13.setEmpty();
        r15.mo1934a(r13);
        r52.setEmpty();
        r15.mo1934a(r52);
    L34:
        r6 = r18 + 1;
        r5 = r24;
        r4 = r142;
        r22 = r172;
        r9 = r192;
        r14 = r20;
        r12 = r21;
        goto L11
    L19:
        if (r52.top != r13.top) goto L22;
        r16 = false;
    L33:
        r172 = r22;
        r24 = r5;
        r18 = r6;
        r192 = r9;
        r21 = r12;
        r20 = r14;
        r142 = r4;
        goto L34
    L35:
        ArrayList r173 = r22;
        C0834Tb r25 = r5;
        int r193 = r9;
        Rect r212 = r12;
        int r202 = r14;
        View r143 = r4;
        m2135i(r143, r11, true);
        if (r25.f2651g == 0) goto L52;
        if (r11.isEmpty() == true) goto L52;
        int r53 = Gravity.getAbsoluteGravity(r25.f2651g, r3);
        int r122 = r53 & 112;
        if (r122 == 48) goto L44;
        if (r122 != 80) goto L45;
        r10.bottom = Math.max(r10.bottom, getHeight() - r11.top);
    L45:
        int r42 = r53 & 7;
        if (r42 == 3) goto L50;
        if (r42 != 5) goto L52;
        r10.right = Math.max(r10.right, getWidth() - r11.left);
        goto L52
    L50:
        r10.left = Math.max(r10.left, r11.right);
        goto L52
    L44:
        r10.top = Math.max(r10.top, r11.bottom);
    L52:
        if (r25.f2652h == 0) goto L106;
        if (r143.getVisibility() != 0) goto L106;
        WeakHashMap r26 = AbstractC2185lE.f7617a;
        if (r143.isLaidOut() == false) goto L106;
        if (r143.getWidth() <= 0) goto L106;
        if (r143.getHeight() <= 0) goto L106;
        C0834Tb r27 = (C0834Tb) r143.getLayoutParams();
        AbstractC0706Qb r43 = r27.f2645a;
        Rect r54 = m2129g();
        Rect r123 = m2129g();
        r123.set(r143.getLeft(), r143.getTop(), r143.getRight(), r143.getBottom());
        if (r43 != null) goto L66;
    L72:
        r54.set(r123);
    L73:
        r123.setEmpty();
        r15.mo1934a(r123);
        if (r54.isEmpty() == false) goto L76;
        r54.setEmpty();
        r15.mo1934a(r54);
        goto L106
    L76:
        int r44 = Gravity.getAbsoluteGravity(r27.f2652h, r3);
        if ((r44 & 48) != 48) goto L81;
        int r62 = (r54.top - ((ViewGroup.MarginLayoutParams) r27).topMargin) - r27.f2654j;
        int r76 = r10.top;
        if (r62 >= r76) goto L81;
        m2133u(r143, r76 - r62);
        boolean r77 = true;
    L83:
        if ((r44 & 80) != 80) goto L87;
        int r63 = ((getHeight() - r54.bottom) - ((ViewGroup.MarginLayoutParams) r27).bottomMargin) + r27.f2654j;
        int r84 = r10.bottom;
        if (r63 >= r84) goto L87;
        m2133u(r143, r63 - r84);
        r77 = true;
    L87:
        if (r77 == true) goto L90;
        m2133u(r143, 0);
    L90:
        if ((r44 & 3) != 3) goto L94;
        int r64 = (r54.left - ((ViewGroup.MarginLayoutParams) r27).leftMargin) - r27.f2653i;
        int r78 = r10.left;
        if (r64 >= r78) goto L94;
        m2132t(r143, r78 - r64);
        boolean r79 = true;
    L96:
        if ((r44 & 5) != 5) goto L101;
        int r45 = ((getWidth() - r54.right) - ((ViewGroup.MarginLayoutParams) r27).rightMargin) + r27.f2653i;
        int r28 = r10.right;
        if (r45 >= r28) goto L101;
        m2132t(r143, r45 - r28);
        r79 = true;
    L101:
        if (r79 == true) goto L103;
        m2132t(r143, 0);
    L103:
        r54.setEmpty();
        r15.mo1934a(r54);
    L94:
        r79 = false;
    L81:
        r77 = false;
        goto L83
    L66:
        if (r43.mo1453a(r143) == false) goto L72;
        if (r123.contains(r54) == true) goto L73;
        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + r54.toShortString() + " | Bounds:" + r123.toShortString());
    L106:
        if (r23 == 2) goto L111;
        Rect r46 = r212;
        r46.set(((C0834Tb) r143.getLayoutParams()).f2659o);
        if (r46.equals(r11) == false) goto L110;
        ArrayList r55 = r173;
        int r29 = r193;
    L119:
        r14 = r202 + 1;
        r9 = r29;
        r12 = r46;
        r22 = r55;
        goto L3
    L110:
        ((C0834Tb) r143.getLayoutParams()).f2659o.set(r11);
    L112:
        int r144 = r202 + 1;
        r29 = r193;
    L113:
        r55 = r173;
        if (r144 >= r29) goto L119;
        View r710 = (View) r55.get(r144);
        AbstractC0706Qb r85 = ((C0834Tb) r710.getLayoutParams()).f2645a;
        if (r85 == null) goto L118;
        r85.mo1454b(r710);
    L118:
        r144 = r144 + 1;
        r173 = r55;
        goto L113
    L111:
        r46 = r212;
        goto L112
    L8:
        if (r4.getVisibility() != 8) goto L10;
        r55 = r22;
        r29 = r9;
        r46 = r12;
        r202 = r14;
        goto L119
    L120:
        Rect r47 = r12;
        r10.setEmpty();
        r15.mo1934a(r10);
        r11.setEmpty();
        r15.mo1934a(r11);
        r47.setEmpty();
        r15.mo1934a(r47);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2143s(false);
        if (this.f3903m == false) goto L9;
        if (this.f3902l != null) goto L7;
        this.f3902l = new ViewTreeObserverOnPreDrawListenerC0877Ub(this);
    L7:
        getViewTreeObserver().addOnPreDrawListener(this.f3902l);
    L9:
        if (this.f3904n != null) goto L13;
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        if (getFitsSystemWindows() == false) goto L13;
        AbstractC1255cE.m2370c(this);
    L13:
        this.f3898h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2143s(false);
        if (this.f3903m == true) goto L5;
    L7:
        View r1 = this.f3901k;
        if (r1 == null) goto L10;
        mo721b(r1, 0);
    L10:
        this.f3898h = false;
        return;
    L5:
        if (this.f3902l == null) goto L7;
        getViewTreeObserver().removeOnPreDrawListener(this.f3902l);
        goto L7
    }

    @Override // android.view.View
    public final void onDraw(Canvas r5) {
        super.onDraw(r5);
        if (this.f3905o == true) goto L5;
        return;
    L5:
        if (this.f3906p == null) goto L14;
        C0489LF r0 = this.f3904n;
        if (r0 == null) goto L9;
        int r02 = r0.m943d();
    L10:
        if (r02 <= 0) goto L15;
        this.f3906p.setBounds(0, 0, getWidth(), r02);
        this.f3906p.draw(r5);
        return;
    L15:
        return;
    L9:
        r02 = 0;
        goto L10
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r4) {
        int r0 = r4.getActionMasked();
        if (r0 != 0) goto L5;
        m2143s(true);
    L5:
        boolean r42 = m2141q(r4, 0);
        if (r0 != 1) goto L8;
    L11:
        m2143s(true);
        return r42;
    L8:
        if (r0 == 3) goto L11;
        return r42;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        WeakHashMap r32 = AbstractC2185lE.f7617a;
        int r33 = getLayoutDirection();
        ArrayList r42 = this.f3891a;
        int r52 = r42.size();
        int r62 = 0;
    L3:
        if (r62 >= r52) goto L13;
        View r72 = (View) r42.get(r62);
        if (r72.getVisibility() == 8) goto L12;
        AbstractC0706Qb r0 = ((C0834Tb) r72.getLayoutParams()).f2645a;
        if (r0 != null) goto L10;
    L11:
        m2140p(r72, r33);
        goto L12
    L10:
        if (r0.mo1459g(this, r72, r33) == false) goto L11;
    L12:
        r62 = r62 + 1;
        goto L3
    }

    @Override // android.view.View
    public final void onMeasure(int r26, int r27) {
        CoordinatorLayout r0 = this;
        r0.m2142r();
        int r1 = r0.getChildCount();
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L14;
        View r4 = r0.getChildAt(r2);
        C2520sy r5 = (C2520sy) r0.f3892b.f8523d;
        int r7 = r5.f8818c;
        int r8 = 0;
    L6:
        if (r8 >= r7) goto L13;
        ArrayList r9 = (ArrayList) r5.m5003j(r8);
        if (r9 == null) goto L12;
        if (r9.contains(r4) == false) goto L12;
        boolean r12 = true;
    L16:
        if (r12 == r0.f3903m) goto L31;
        if (r12 == false) goto L26;
        if (r0.f3898h == true) goto L21;
    L24:
        r0.f3903m = true;
        goto L31
    L21:
        if (r0.f3902l != null) goto L23;
        r0.f3902l = new ViewTreeObserverOnPreDrawListenerC0877Ub(r0);
    L23:
        r0.getViewTreeObserver().addOnPreDrawListener(r0.f3902l);
        goto L24
    L26:
        if (r0.f3898h == true) goto L28;
    L30:
        r0.f3903m = false;
        goto L31
    L28:
        if (r0.f3902l == null) goto L30;
        r0.getViewTreeObserver().removeOnPreDrawListener(r0.f3902l);
    L31:
        int r72 = r0.getPaddingLeft();
        int r13 = r0.getPaddingTop();
        int r82 = r0.getPaddingRight();
        int r22 = r0.getPaddingBottom();
        WeakHashMap r42 = AbstractC2185lE.f7617a;
        int r92 = r0.getLayoutDirection();
        if (r92 != 1) goto L34;
        boolean r10 = true;
    L35:
        int r11 = View.MeasureSpec.getMode(r26);
        int r122 = View.MeasureSpec.getSize(r26);
        int r132 = View.MeasureSpec.getMode(r27);
        int r14 = View.MeasureSpec.getSize(r27);
        int r15 = r72 + r82;
        int r16 = r13 + r22;
        int r17 = r0.getSuggestedMinimumWidth();
        int r23 = r0.getSuggestedMinimumHeight();
        if (r0.f3904n != null) goto L38;
    L40:
        boolean r172 = false;
    L41:
        ArrayList r3 = r0.f3891a;
        int r43 = r3.size();
        int r52 = 0;
        int r18 = 0;
    L42:
        if (r52 >= r43) goto L94;
        View r19 = (View) r3.get(r52);
        int r21 = r17;
        if (r19.getVisibility() != 8) goto L46;
        ArrayList r232 = r3;
        int r192 = r43;
        int r20 = r52;
        int r222 = r82;
        r17 = r21;
        boolean r24 = false;
        int r212 = r72;
    L93:
        r52 = r20 + 1;
        r43 = r192;
        r72 = r212;
        r82 = r222;
        r3 = r232;
        goto L42
    L46:
        C0834Tb r6 = (C0834Tb) r19.getLayoutParams();
        int r110 = r6.f2649e;
        if (r110 < 0) goto L77;
        if (r11 == 0) goto L77;
        int r223 = r23;
        int[] r25 = r0.f3899i;
        if (r25 != null) goto L53;
        r0.toString();
        r232 = r3;
    L52:
        int r111 = 0;
    L60:
        int r28 = r6.f2647c;
        if (r28 != 0) goto L63;
        r28 = 8388661;
    L63:
        int r29 = Gravity.getAbsoluteGravity(r28, r92) & 7;
        if (r29 != 3) goto L67;
        if (r10 == true) goto L67;
    L69:
        int r32 = Math.max(0, (r122 - r82) - r111);
    L79:
        if (r172 == true) goto L81;
    L83:
        int r210 = r26;
        int r112 = r27;
    L84:
        AbstractC0706Qb r02 = r6.f2645a;
        if (r02 == null) goto L90;
        int r202 = r32;
        int r33 = r210;
        r192 = r43;
        r212 = r72;
        int r73 = r21;
        int r203 = r223;
        r222 = r82;
        int r83 = r203;
        r24 = false;
        r20 = r52;
        int r53 = r112;
        boolean r03 = r02.mo1460h(this, r19, r33, r202, r53);
        View r113 = r19;
        r210 = r33;
        r32 = r202;
        int r44 = r53;
        if (r03 == false) goto L91;
        r0 = this;
    L92:
        int r211 = Math.max(r73, ((r113.getMeasuredWidth() + r15) + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((ViewGroup.MarginLayoutParams) r6).rightMargin);
        int r34 = Math.max(r83, ((r113.getMeasuredHeight() + r16) + ((ViewGroup.MarginLayoutParams) r6).topMargin) + ((ViewGroup.MarginLayoutParams) r6).bottomMargin);
        r18 = View.combineMeasuredStates(r18, r113.getMeasuredState());
        r17 = r211;
        r23 = r34;
    L91:
        r0 = this;
        r0.measureChildWithMargins(r113, r210, r32, r44, 0);
        goto L92
    L90:
        int r204 = r43;
        r44 = r112;
        r113 = r19;
        r192 = r204;
        r212 = r72;
        r73 = r21;
        int r205 = r223;
        r222 = r82;
        r83 = r205;
        r20 = r52;
        r24 = false;
        goto L91
    L81:
        if (r19.getFitsSystemWindows() == true) goto L83;
        int r213 = r0.f3904n.m942c() + r0.f3904n.m941b();
        int r114 = r0.f3904n.m940a() + r0.f3904n.m943d();
        r210 = View.MeasureSpec.makeMeasureSpec(r122 - r213, r11);
        r112 = View.MeasureSpec.makeMeasureSpec(r14 - r114, r132);
    L67:
        if (r29 != 5) goto L70;
        if (r10 == true) goto L69;
    L70:
        if (r29 != 5) goto L73;
        if (r10 == true) goto L73;
    L75:
        r32 = Math.max(0, r111 - r72);
    L73:
        if (r29 != 3) goto L78;
        if (r10 == true) goto L75;
    L78:
        r32 = 0;
        goto L79
    L53:
        r232 = r3;
        if (r110 >= 0) goto L56;
    L59:
        r0.toString();
        goto L52
    L56:
        if (r110 >= r25.length) goto L59;
        r111 = r25[r110];
    L77:
        r223 = r23;
        r232 = r3;
        goto L78
    L94:
        int r62 = r18;
        r0.setMeasuredDimension(View.resolveSizeAndState(r17, r26, (-16777216) & r62), View.resolveSizeAndState(r23, r27, r62 << 16));
        return;
    L38:
        if (r0.getFitsSystemWindows() == false) goto L40;
        r172 = true;
        goto L41
    L34:
        r10 = false;
    L12:
        r8 = r8 + 1;
        goto L6
    L13:
        r2 = r2 + 1;
        goto L4
    L14:
        r12 = false;
        goto L16
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View r3, float r4, float r5, boolean r6) {
        int r32 = getChildCount();
        int r52 = 0;
    L3:
        if (r52 >= r32) goto L12;
        View r62 = getChildAt(r52);
        if (r62.getVisibility() == 8) goto L11;
        C0834Tb r63 = (C0834Tb) r62.getLayoutParams();
        if (r63.m1659a(0) == false) goto L11;
        AbstractC0706Qb r64 = r63.f2645a;
    L11:
        r52 = r52 + 1;
        goto L3
    L12:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View r6, float r7, float r8) {
        int r72 = getChildCount();
        int r0 = 0;
        boolean r1 = false;
    L3:
        if (r0 >= r72) goto L14;
        View r2 = getChildAt(r0);
        if (r2.getVisibility() == 8) goto L13;
        C0834Tb r22 = (C0834Tb) r2.getLayoutParams();
        if (r22.m1659a(0) == false) goto L13;
        AbstractC0706Qb r23 = r22.f2645a;
        if (r23 == null) goto L13;
        r1 = r1 | r23.mo1461i(r6);
    L13:
        r0 = r0 + 1;
        goto L3
    L14:
        return r1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r7, int r8, int r9, int[] r10) {
        mo722c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r8, int r9, int r10, int r11, int r12) {
        mo723e(r8, r9, r10, r11, r12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r2, View r3, int r4) {
        mo720a(r2, r3, r4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r7) {
        if ((r7 instanceof C0920Vb) == true) goto L6;
        super.onRestoreInstanceState(r7);
        return;
    L6:
        C0920Vb r72 = (C0920Vb) r7;
        super.onRestoreInstanceState(r72.f8397a);
        SparseArray r73 = r72.f2875c;
        int r0 = getChildCount();
        int r1 = 0;
    L7:
        if (r1 >= r0) goto L15;
        View r2 = getChildAt(r1);
        int r3 = r2.getId();
        AbstractC0706Qb r4 = m2131m(r2).f2645a;
        if (r3 == (-1)) goto L14;
        if (r4 == null) goto L14;
        Parcelable r32 = (Parcelable) r73.get(r3);
        if (r32 == null) goto L14;
        r4.mo1465m(r2, r32);
    L14:
        r1 = r1 + 1;
        goto L7
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0920Vb r0 = new C0920Vb(super.onSaveInstanceState());
        SparseArray r1 = new SparseArray();
        int r2 = getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        View r4 = getChildAt(r3);
        int r5 = r4.getId();
        AbstractC0706Qb r6 = ((C0834Tb) r4.getLayoutParams()).f2645a;
        if (r5 == (-1)) goto L10;
        if (r6 == null) goto L10;
        Parcelable r42 = r6.mo1466n(r4);
        if (r42 == null) goto L10;
        r1.append(r5, r42);
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        r0.f2875c = r1;
        return r0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r2, View r3, int r4) {
        return mo724f(r2, r3, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r2) {
        mo721b(r2, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r18) {
        int r2 = r18.getActionMasked();
        if (this.f3900j != null) goto L8;
        boolean r3 = m2141q(r18, 1);
        if (r3 == true) goto L9;
    L7:
        boolean r6 = false;
    L12:
        MotionEvent r8 = null;
        if (this.f3900j != null) goto L15;
        r6 = r6 | super.onTouchEvent(r18);
    L17:
        if (r8 == null) goto L19;
        r8.recycle();
    L19:
        if (r2 != 1) goto L21;
    L24:
        m2143s(false);
        return r6;
    L21:
        if (r2 == 3) goto L24;
        return r6;
    L15:
        if (r3 == false) goto L17;
        long r9 = SystemClock.uptimeMillis();
        r8 = MotionEvent.obtain(r9, r9, 3, 0.0f, 0.0f, 0);
        super.onTouchEvent(r8);
    L9:
        AbstractC0706Qb r62 = ((C0834Tb) this.f3900j.getLayoutParams()).f2645a;
        if (r62 == null) goto L7;
        r6 = r62.mo1469q(this.f3900j, r18);
        goto L12
    L8:
        r3 = false;
        goto L9
    }

    /* JADX INFO: renamed from: p */
    public final void m2140p(View r13, int r14) {
        C0834Tb r0 = (C0834Tb) r13.getLayoutParams();
        View r1 = r0.f2655k;
        if (r1 == null) goto L5;
    L9:
        C1110Zt r2 = f3890x;
        if (r1 == null) goto L18;
        Rect r4 = m2129g();
        Rect r5 = m2129g();
        m2137k(r1, r4);     // Catch: Throwable -> L15
        C0834Tb r6 = (C0834Tb) r13.getLayoutParams();     // Catch: Throwable -> L15
        int r7 = r13.getMeasuredWidth();     // Catch: Throwable -> L15
        int r8 = r13.getMeasuredHeight();     // Catch: Throwable -> L15
        m2130l(r14, r4, r5, r6, r7, r8);     // Catch: Throwable -> L15
        m2134h(r6, r5, r7, r8);     // Catch: Throwable -> L15
        r13.layout(r5.left, r5.top, r5.right, r5.bottom);     // Catch: Throwable -> L15
        r4.setEmpty();
        r2.mo1934a(r4);
        r5.setEmpty();
        r2.mo1934a(r5);
        return;
    L15:
        th = move-exception;
        r4.setEmpty();
        r2.mo1934a(r4);
        r5.setEmpty();
        r2.mo1934a(r5);
        throw th;
    L18:
        int r142 = r0.f2649e;
        if (r142 < 0) goto L52;
        C0834Tb r02 = (C0834Tb) r13.getLayoutParams();
        int r12 = r02.f2647c;
        if (r12 != 0) goto L23;
        r12 = 8388661;
    L23:
        int r15 = Gravity.getAbsoluteGravity(r12, r14);
        int r22 = r15 & 7;
        int r16 = r15 & 112;
        int r42 = getWidth();
        int r52 = getHeight();
        int r62 = r13.getMeasuredWidth();
        int r72 = r13.getMeasuredHeight();
        if (r14 != 1) goto L26;
        r142 = r42 - r142;
    L26:
        int r3 = 0;
        int[] r9 = this.f3899i;
        if (r9 != null) goto L30;
        toString();
    L29:
        int r143 = 0;
    L36:
        int r144 = r143 - r62;
        if (r22 != 1) goto L39;
        r144 = r144 + (r62 / 2);
    L44:
        if (r16 != 16) goto L46;
        r3 = r72 / 2;
    L50:
        int r145 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r02).leftMargin, Math.min(r144, ((r42 - getPaddingRight()) - r62) - ((ViewGroup.MarginLayoutParams) r02).rightMargin));
        int r03 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r02).topMargin, Math.min(r3, ((r52 - getPaddingBottom()) - r72) - ((ViewGroup.MarginLayoutParams) r02).bottomMargin));
        r13.layout(r145, r03, r62 + r145, r72 + r03);
        return;
    L46:
        if (r16 != 80) goto L50;
        r3 = r72;
        goto L50
    L39:
        if (r22 != 5) goto L44;
        r144 = r144 + r62;
        goto L44
    L30:
        if (r142 >= 0) goto L32;
    L35:
        toString();
        goto L29
    L32:
        if (r142 >= r9.length) goto L35;
        r143 = r9[r142];
        goto L36
    L52:
        C0834Tb r146 = (C0834Tb) r13.getLayoutParams();
        Rect r92 = m2129g();
        r92.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r146).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) r146).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) r146).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) r146).bottomMargin);
        if (this.f3904n == null) goto L59;
        WeakHashMap r04 = AbstractC2185lE.f7617a;
        if (getFitsSystemWindows() == false) goto L59;
        if (r13.getFitsSystemWindows() == true) goto L59;
        r92.left = this.f3904n.m941b() + r92.left;
        r92.top = this.f3904n.m943d() + r92.top;
        r92.right -= this.f3904n.m942c();
        r92.bottom -= this.f3904n.m940a();
    L59:
        Rect r10 = m2129g();
        int r147 = r146.f2647c;
        if ((r147 & 7) != 0) goto L63;
        r147 = r147 | 8388611;
    L63:
        if ((r147 & 112) != 0) goto L65;
        r147 = r147 | 48;
    L65:
        Gravity.apply(r147, r13.getMeasuredWidth(), r13.getMeasuredHeight(), r92, r10, r14);
        r13.layout(r10.left, r10.top, r10.right, r10.bottom);
        r92.setEmpty();
        r2.mo1934a(r92);
        r10.setEmpty();
        r2.mo1934a(r10);
        return;
    L5:
        if (r0.f2650f == (-1)) goto L9;
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2141q(MotionEvent r21, int r22) {
        int r3 = r21.getActionMasked();
        ArrayList r4 = this.f3893c;
        r4.clear();
        boolean r5 = isChildrenDrawingOrderEnabled();
        int r6 = getChildCount();
        int r7 = r6 - 1;
    L3:
        if (r7 < 0) goto L8;
        if (r5 == false) goto L6;
        int r8 = getChildDrawingOrder(r6, r7);
    L7:
        r4.add(getChildAt(r8));
        r7 = r7 - 1;
        goto L3
    L6:
        r8 = r7;
        goto L7
    L8:
        C0963Wb r52 = f3889w;
        if (r52 == null) goto L11;
        Collections.sort(r4, r52);
    L11:
        int r53 = r4.size();
        int r62 = 0;
        MotionEvent r82 = null;
        boolean r72 = false;
    L12:
        if (r62 >= r53) goto L35;
        View r9 = (View) r4.get(r62);
        AbstractC0706Qb r10 = ((C0834Tb) r9.getLayoutParams()).f2645a;
        if (r72 == false) goto L25;
        if (r3 == 0) goto L25;
        if (r10 == null) goto L34;
        if (r82 != null) goto L20;
        long r12 = SystemClock.uptimeMillis();
        r82 = MotionEvent.obtain(r12, r12, 3, 0.0f, 0.0f, 0);
    L20:
        if (r22 == 0) goto L24;
        if (r22 != 1) goto L34;
        r10.mo1469q(r9, r82);
        goto L34
    L24:
        r10.mo1458f(this, r9, r82);
    L34:
        r62 = r62 + 1;
    L25:
        if (r72 == true) goto L34;
        if (r10 == null) goto L34;
        if (r22 == 0) goto L31;
        if (r22 != 1) goto L32;
        r72 = r10.mo1469q(r9, r21);
    L32:
        if (r72 == false) goto L34;
        this.f3900j = r9;
        goto L34
    L31:
        r72 = r10.mo1458f(this, r9, r21);
        goto L32
    L35:
        r4.clear();
        return r72;
    }

    /* JADX INFO: renamed from: r */
    public final void m2142r() {
        ArrayList r0 = this.f3891a;
        r0.clear();
        C2428qs r1 = this.f3892b;
        C2520sy r2 = (C2520sy) r1.f8523d;
        C1067Yt r3 = (C1067Yt) r1.f8521b;
        C2520sy r4 = (C2520sy) r1.f8523d;
        int r5 = r2.f8818c;
        int r6 = 0;
        int r7 = 0;
    L3:
        if (r7 >= r5) goto L8;
        ArrayList r8 = (ArrayList) r2.m5003j(r7);
        if (r8 == null) goto L7;
        r8.clear();
        r3.mo1934a(r8);
    L7:
        r7 = r7 + 1;
        goto L3
    L8:
        r2.clear();
        int r22 = getChildCount();
        int r52 = 0;
    L9:
        if (r52 >= r22) goto L93;
        View r72 = getChildAt(r52);
        C0834Tb r82 = m2131m(r72);
        int r9 = r82.f2650f;
        if (r9 != (-1)) goto L13;
        r82.f2656l = null;
        r82.f2655k = null;
    L55:
        if (r4.containsKey(r72) == true) goto L57;
        r4.put(r72, null);
    L57:
        int r92 = 0;
    L58:
        if (r92 >= r22) goto L90;
        if (r92 == r52) goto L87;
        View r10 = getChildAt(r92);
        if (r10 == r82.f2656l) goto L72;
        WeakHashMap r12 = AbstractC2185lE.f7617a;
        int r122 = getLayoutDirection();
        int r13 = Gravity.getAbsoluteGravity(((C0834Tb) r10.getLayoutParams()).f2651g, r122);
        if (r13 != 0) goto L66;
    L68:
        AbstractC0706Qb r102 = r82.f2645a;
        if (r102 == null) goto L87;
        r102.mo1454b(r72);
        goto L87
    L66:
        if ((Gravity.getAbsoluteGravity(r82.f2652h, r122) & r13) != r13) goto L68;
    L72:
        if (r4.containsKey(r10) == true) goto L77;
        if (r4.containsKey(r10) == true) goto L77;
        r4.put(r10, null);
    L77:
        if (r4.containsKey(r10) == false) goto L89;
        if (r4.containsKey(r72) == false) goto L89;
        ArrayList r123 = (ArrayList) r4.get(r10);
        if (r123 != null) goto L86;
        r123 = (ArrayList) r3.mo1935c();
        if (r123 != null) goto L85;
        r123 = new ArrayList();
    L85:
        r4.put(r10, r123);
    L86:
        r123.add(r72);
    L89:
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    L87:
        r92 = r92 + 1;
        goto L58
    L90:
        r52 = r52 + 1;
        goto L9
    L13:
        View r103 = r82.f2655k;
        if (r103 != null) goto L16;
    L29:
        View r104 = findViewById(r9);
        r82.f2655k = r104;
        if (r104 == null) goto L52;
        if (r104 == this) goto L33;
        ViewParent r93 = r104.getParent();
    L38:
        if (r93 == this) goto L50;
        if (r93 == null) goto L50;
        if (r93 == r72) goto L42;
        if ((r93 instanceof View) == false) goto L49;
        r104 = r93;
    L49:
        r93 = r93.getParent();
        goto L38
    L42:
        if (isInEditMode() == false) goto L45;
        r82.f2656l = null;
        r82.f2655k = null;
        goto L55
    L45:
        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
    L50:
        r82.f2656l = r104;
        goto L55
    L33:
        if (isInEditMode() == false) goto L36;
        r82.f2656l = null;
        r82.f2655k = null;
        goto L55
    L36:
        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
    L52:
        if (isInEditMode() == false) goto L92;
        r82.f2656l = null;
        r82.f2655k = null;
        goto L55
    L92:
        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(r9) + " to anchor view " + r72);
    L16:
        if (r103.getId() != r9) goto L29;
        View r105 = r82.f2655k;
        ViewParent r124 = r105.getParent();
    L19:
        if (r124 == this) goto L28;
        if (r124 == null) goto L27;
        if (r124 == r72) goto L27;
        if ((r124 instanceof View) == false) goto L26;
        r105 = r124;
    L26:
        r124 = r124.getParent();
    L27:
        r82.f2656l = null;
        r82.f2655k = null;
        goto L29
    L28:
        r82.f2656l = r105;
        goto L55
    L93:
        ArrayList r23 = (ArrayList) r1.f8520a;
        r23.clear();
        HashSet r32 = (HashSet) r1.f8522c;
        r32.clear();
        int r53 = r4.f8818c;
    L94:
        if (r6 >= r53) goto L96;
        r1.m4875m(r4.m5002f(r6), r23, r32);
        r6 = r6 + 1;
        goto L94
    L96:
        r0.addAll(r23);
        Collections.reverse(r0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r2, Rect r3, boolean r4) {
        AbstractC0706Qb r0 = ((C0834Tb) r2.getLayoutParams()).f2645a;
        if (r0 == null) goto L6;
        r0.mo1464l(this, r2);
    L6:
        return super.requestChildRectangleOnScreen(r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r1) {
        super.requestDisallowInterceptTouchEvent(r1);
        if (r1 == true) goto L5;
        return;
    L5:
        if (this.f3897g == true) goto L9;
        m2143s(false);
        this.f3897g = true;
        return;
    }

    /* JADX INFO: renamed from: s */
    public final void m2143s(boolean r14) {
        int r0 = getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L12;
        View r3 = getChildAt(r2);
        AbstractC0706Qb r4 = ((C0834Tb) r3.getLayoutParams()).f2645a;
        if (r4 == null) goto L11;
        long r5 = SystemClock.uptimeMillis();
        MotionEvent r52 = MotionEvent.obtain(r5, r5, 3, 0.0f, 0.0f, 0);
        if (r14 == false) goto L9;
        r4.mo1458f(this, r3, r52);
    L10:
        r52.recycle();
        goto L11
    L9:
        r4.mo1469q(r3, r52);
    L11:
        r2 = r2 + 1;
        goto L3
    L12:
        int r142 = 0;
    L13:
        if (r142 >= r0) goto L15;
        ((C0834Tb) getChildAt(r142).getLayoutParams()).getClass();
        r142 = r142 + 1;
        goto L13
    L15:
        this.f3900j = null;
        this.f3897g = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
        super.setFitsSystemWindows(r1);
        m2144v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener r1) {
        this.f3907q = r1;
    }

    public void setStatusBarBackground(Drawable r3) {
        Drawable r0 = this.f3906p;
        if (r0 == r3) goto L21;
        Drawable r1 = null;
        if (r0 == null) goto L7;
        r0.setCallback(null);
    L7:
        if (r3 == null) goto L9;
        r1 = r3.mutate();
    L9:
        this.f3906p = r1;
        if (r1 != null) goto L12;
    L19:
        WeakHashMap r32 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L12:
        if (r1.isStateful() == false) goto L14;
        this.f3906p.setState(getDrawableState());
    L14:
        Drawable r33 = this.f3906p;
        WeakHashMap r02 = AbstractC2185lE.f7617a;
        r33.setLayoutDirection(getLayoutDirection());
        Drawable r34 = this.f3906p;
        if (getVisibility() != 0) goto L17;
        boolean r03 = true;
    L18:
        r34.setVisible(r03, false);
        this.f3906p.setCallback(this);
        goto L19
    L17:
        r03 = false;
        goto L18
    }

    public void setStatusBarBackgroundColor(int r2) {
        setStatusBarBackground(new ColorDrawable(r2));
    }

    public void setStatusBarBackgroundResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = getContext().getDrawable(r2);
    L5:
        setStatusBarBackground(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        if (r3 != 0) goto L5;
        boolean r32 = true;
    L6:
        Drawable r1 = this.f3906p;
        if (r1 != null) goto L9;
        return;
    L9:
        if (r1.isVisible() == r32) goto L13;
        this.f3906p.setVisible(r32, false);
        return;
    L13:
        return;
    L5:
        r32 = false;
        goto L6
    }

    /* JADX INFO: renamed from: v */
    public final void m2144v() {
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        if (getFitsSystemWindows() == true) goto L5;
        AbstractC1360eE.m2640l(this, null);
        return;
    L5:
        if (this.f3908r != null) goto L7;
        this.f3908r = new C0132D2(13, this);
    L7:
        AbstractC1360eE.m2640l(this, this.f3908r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.f3906p) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C0834Tb) == false) goto L7;
        return new C0834Tb((C0834Tb) r2);
    L7:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new C0834Tb((ViewGroup.MarginLayoutParams) r2);
    L11:
        return new C0834Tb(r2);
    }
}
