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
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ljx.wechatmod.R;
import defpackage.a8;
import defpackage.ae;
import defpackage.be;
import defpackage.ce;
import defpackage.co;
import defpackage.dh;
import defpackage.f0;
import defpackage.gd;
import defpackage.ja0;
import defpackage.jw;
import defpackage.kw;
import defpackage.l0;
import defpackage.lw;
import defpackage.na0;
import defpackage.s90;
import defpackage.sx;
import defpackage.sy;
import defpackage.t90;
import defpackage.tx;
import defpackage.u30;
import defpackage.v90;
import defpackage.w90;
import defpackage.wc0;
import defpackage.wd;
import defpackage.xd;
import defpackage.y90;
import defpackage.yd;
import defpackage.zd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements jw, kw {
    public static final String t = null;
    public static final Class[] u = null;
    public static final ThreadLocal v = null;
    public static final ce w = null;
    public static final tx x = null;
    public final ArrayList a;
    public final a8 b;
    public final ArrayList c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public ae l;
    public boolean m;
    public wc0 n;
    public boolean o;
    public Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public l0 r;
    public final lw s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 == null) goto L5;
        String r02 = r0.getName();
    L6:
        t = r02;
        w = new ce(0);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new tx();
        return;
    L5:
        r02 = null;
        goto L6
    }

    public CoordinatorLayout(Context r7, AttributeSet r8) {
        super(r7, r8, R.attr.coordinatorLayoutStyle);
        this.a = new ArrayList();
        this.b = new a8(1);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.s = new lw();
        int[] r1 = sy.a;
        int r3 = 0;
        TypedArray r0 = r7.obtainStyledAttributes(r8, r1, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT < 29) goto L5;
        f0.q(this, r7, r1, r8, r0);
    L5:
        int r82 = r0.getResourceId(0, 0);
        if (r82 == 0) goto L10;
        Resources r72 = r7.getResources();
        int[] r83 = r72.getIntArray(r82);
        this.i = r83;
        float r73 = r72.getDisplayMetrics().density;
        int r84 = r83.length;
    L8:
        if (r3 >= r84) goto L10;
        this.i[r3] = (int) (r1[r3] * r73);
        r3 = r3 + 1;
    L10:
        this.p = r0.getDrawable(1);
        r0.recycle();
        w();
        super.setOnHierarchyChangeListener(new yd(this));
        WeakHashMap r74 = ja0.a;
        if (s90.c(this) != 0) goto L15;
        s90.s(this, 1);
        return;
    }

    public static Rect g() {
        Rect r0 = (Rect) x.a();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new Rect();
    }

    public static void l(int r6, Rect r7, Rect r8, zd r9, int r10, int r11) {
        int r0 = r9.c;
        if (r0 != 0) goto L5;
        r0 = 17;
    L5:
        int r02 = Gravity.getAbsoluteGravity(r0, r6);
        int r92 = r9.d;
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

    public static zd n(View r5) {
        zd r0 = (zd) r5.getLayoutParams();
        if (r0.b == true) goto L22;
        Class<?> r52 = r5.getClass();
        xd r2 = null;
    L5:
        if (r52 == null) goto L10;
        r2 = (xd) r52.getAnnotation(xd.class);
        if (r2 != null) goto L10;
        r52 = r52.getSuperclass();
    L10:
        if (r2 != null) goto L23;
    L21:
        r0.b = true;
        goto L22
    L23:
        wd r1 = (wd) r2.value().getDeclaredConstructor(null).newInstance(null);     // Catch: Exception -> L19
        wd r3 = r0.a;     // Catch: Exception -> L19
        if (r3 == r1) goto L21;
        if (r3 == null) goto L15;
        r3.e();     // Catch: Exception -> L19
    L15:
        r0.a = r1;     // Catch: Exception -> L19
        r0.b = true;     // Catch: Exception -> L19
        if (r1 == null) goto L21;
        r1.c(r0);     // Catch: Exception -> L19
    L19:
        e = move-exception;
        Log.e("CoordinatorLayout", "Default behavior class " + r2.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
    L22:
        return r0;
    }

    public static void u(View r3, int r4) {
        zd r0 = (zd) r3.getLayoutParams();
        int r1 = r0.i;
        if (r1 == r4) goto L6;
        WeakHashMap r2 = ja0.a;
        r3.offsetLeftAndRight(r4 - r1);
        r0.i = r4;
        return;
    }

    public static void v(View r3, int r4) {
        zd r0 = (zd) r3.getLayoutParams();
        int r1 = r0.j;
        if (r1 == r4) goto L6;
        WeakHashMap r2 = ja0.a;
        r3.offsetTopAndBottom(r4 - r1);
        r0.j = r4;
        return;
    }

    @Override // defpackage.jw
    public final void a(View r2, View r3, int r4, int r5) {
        lw r0 = this.s;
        if (r5 != 1) goto L5;
        r0.b = r4;
    L6:
        this.k = r3;
        int r22 = getChildCount();
        int r32 = 0;
    L7:
        if (r32 >= r22) goto L9;
        ((zd) getChildAt(r32).getLayoutParams()).getClass();
        r32 = r32 + 1;
        goto L7
    L9:
        return;
    L5:
        r0.a = r4;
        goto L6
    }

    @Override // defpackage.jw
    public final void b(View r8, int r9) {
        lw r0 = this.s;
        if (r9 != 1) goto L5;
        r0.b = 0;
    L6:
        int r02 = getChildCount();
        int r3 = 0;
    L7:
        if (r3 >= r02) goto L20;
        View r4 = getChildAt(r3);
        zd r5 = (zd) r4.getLayoutParams();
        if (r5.a(r9) == false) goto L19;
        wd r6 = r5.a;
        if (r6 == null) goto L14;
        r6.p(r4, r8, r9);
    L14:
        if (r9 == 0) goto L18;
        if (r9 != 1) goto L19;
        r5.n = false;
        goto L19
    L18:
        r5.m = false;
    L19:
        r3 = r3 + 1;
        goto L7
    L20:
        this.k = null;
        return;
    L5:
        r0.a = 0;
        goto L6
    }

    @Override // defpackage.jw
    public final void c(View r15, int r16, int r17, int[] r18, int r19) {
        int r8 = getChildCount();
        boolean r0 = false;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
    L4:
        if (r10 >= r8) goto L24;
        View r2 = getChildAt(r10);
        if (r2.getVisibility() == 8) goto L23;
        zd r3 = (zd) r2.getLayoutParams();
        if (r3.a(r19) == false) goto L23;
        wd r32 = r3.a;
        if (r32 == null) goto L23;
        int[] r6 = this.e;
        r6[0] = 0;
        r6[1] = 0;
        r32.j(this, r2, r15, r16, r17, r6, r19);
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
        p(1);
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof zd) == true) goto L5;
        return false;
    L5:
        if (super.checkLayoutParams(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.kw
    public final void d(View r15, int r16, int r17, int r18, int r19, int r20, int[] r21) {
        int r152 = getChildCount();
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r1 >= r152) goto L22;
        View r8 = getChildAt(r1);
        if (r8.getVisibility() == 8) goto L21;
        zd r6 = (zd) r8.getLayoutParams();
        if (r6.a(r20) == false) goto L21;
        wd r62 = r6.a;
        if (r62 == null) goto L21;
        int[] r12 = this.e;
        r12[0] = 0;
        r12[1] = 0;
        r62.k(this, r8, r17, r18, r19, r12);
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
        p(1);
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r2, View r3, long r4) {
        wd r0 = ((zd) r3.getLayoutParams()).a;
        if (r0 == null) goto L6;
        r0.getClass();
    L6:
        return super.drawChild(r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] r0 = getDrawableState();
        Drawable r1 = this.p;
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

    @Override // defpackage.jw
    public final void e(View r9, int r10, int r11, int r12, int r13, int r14) {
        d(r9, r10, r11, r12, r13, 0, this.f);
    }

    @Override // defpackage.jw
    public final boolean f(View r7, View r8, int r9, int r10) {
        int r72 = getChildCount();
        int r0 = 0;
        boolean r1 = false;
    L3:
        if (r0 >= r72) goto L21;
        View r2 = getChildAt(r0);
        if (r2.getVisibility() == 8) goto L20;
        zd r3 = (zd) r2.getLayoutParams();
        wd r4 = r3.a;
        if (r4 == null) goto L15;
        boolean r22 = r4.o(r2, r9, r10);
        r1 = r1 | r22;
        if (r10 == 0) goto L14;
        if (r10 != 1) goto L20;
        r3.n = r22;
        goto L20
    L14:
        r3.m = r22;
        goto L20
    L15:
        if (r10 == 0) goto L19;
        if (r10 != 1) goto L20;
        r3.n = false;
        goto L20
    L19:
        r3.m = false;
    L20:
        r0 = r0 + 1;
        goto L3
    L21:
        return r1;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zd();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new zd(getContext(), r3);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.a);
    }

    public final wc0 getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        lw r0 = this.s;
        int r1 = r0.a;
        return r0.b | r1;
    }

    public Drawable getStatusBarBackground() {
        return this.p;
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

    public final void h(zd r6, Rect r7, int r8, int r9) {
        int r0 = getWidth();
        int r1 = getHeight();
        int r02 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r6).leftMargin, Math.min(r7.left, ((r0 - getPaddingRight()) - r8) - ((ViewGroup.MarginLayoutParams) r6).rightMargin));
        int r62 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r6).topMargin, Math.min(r7.top, ((r1 - getPaddingBottom()) - r9) - ((ViewGroup.MarginLayoutParams) r6).bottomMargin));
        r7.set(r02, r62, r8 + r02, r9 + r62);
    }

    public final void i(View r3, Rect r4, boolean r5) {
        if (r3.isLayoutRequested() == false) goto L5;
    L12:
        r4.setEmpty();
        return;
    L5:
        if (r3.getVisibility() == 8) goto L12;
        if (r5 == false) goto L10;
        k(r3, r4);
        return;
    L10:
        r4.set(r3.getLeft(), r3.getTop(), r3.getRight(), r3.getBottom());
    }

    public final ArrayList j(View r6) {
        u30 r0 = (u30) this.b.b;
        int r1 = r0.c;
        ArrayList r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        ArrayList r4 = (ArrayList) r0.j(r3);
        if (r4 == null) goto L11;
        if (r4.contains(r6) == false) goto L11;
        if (r2 != null) goto L10;
        r2 = new ArrayList();
    L10:
        r2.add(r0.h(r3));
    L11:
        r3 = r3 + 1;
        goto L3
    L12:
        ArrayList r62 = this.d;
        r62.clear();
        if (r2 == null) goto L15;
        r62.addAll(r2);
    L15:
        return r62;
    }

    public final void k(View r5, Rect r6) {
        ThreadLocal r0 = na0.a;
        r6.set(0, 0, r5.getWidth(), r5.getHeight());
        ThreadLocal r02 = na0.a;
        Matrix r1 = (Matrix) r02.get();
        if (r1 != null) goto L5;
        r1 = new Matrix();
        r02.set(r1);
    L6:
        na0.a(this, r5, r1);
        ThreadLocal r52 = na0.b;
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

    public final int m(int r5) {
        int[] r2 = this.i;
        if (r2 != null) goto L6;
        Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + r5);
        return 0;
    L6:
        if (r5 >= 0) goto L8;
    L12:
        Log.e("CoordinatorLayout", "Keyline index " + r5 + " out of range for " + this);
        return 0;
    L8:
        if (r5 >= r2.length) goto L12;
        return r2[r5];
    }

    public final boolean o(View r3, int r4, int r5) {
        tx r0 = x;
        Rect r1 = g();
        k(r3, r1);
        boolean r32 = r1.contains(r4, r5);     // Catch: Throwable -> L6
        r1.setEmpty();
        r0.c(r1);
        return r32;
    L6:
        th = move-exception;
        r1.setEmpty();
        r0.c(r1);
        throw th;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.m == false) goto L9;
        if (this.l != null) goto L7;
        this.l = new ae(this);
    L7:
        getViewTreeObserver().addOnPreDrawListener(this.l);
    L9:
        if (this.n != null) goto L13;
        WeakHashMap r0 = ja0.a;
        if (s90.b(this) == false) goto L13;
        w90.c(this);
    L13:
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.m == true) goto L5;
    L7:
        View r1 = this.k;
        if (r1 == null) goto L10;
        b(r1, 0);
    L10:
        this.h = false;
        return;
    L5:
        if (this.l == null) goto L7;
        getViewTreeObserver().removeOnPreDrawListener(this.l);
        goto L7
    }

    @Override // android.view.View
    public final void onDraw(Canvas r5) {
        super.onDraw(r5);
        if (this.o == true) goto L5;
        return;
    L5:
        if (this.p == null) goto L14;
        wc0 r0 = this.n;
        if (r0 == null) goto L9;
        int r02 = r0.d();
    L10:
        if (r02 <= 0) goto L15;
        this.p.setBounds(0, 0, getWidth(), r02);
        this.p.draw(r5);
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
        t(true);
    L5:
        boolean r42 = r(r4, 0);
        if (r0 != 1) goto L8;
    L11:
        t(true);
        return r42;
    L8:
        if (r0 == 3) goto L11;
        return r42;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        WeakHashMap r32 = ja0.a;
        int r33 = t90.d(this);
        ArrayList r42 = this.a;
        int r52 = r42.size();
        int r62 = 0;
    L3:
        if (r62 >= r52) goto L13;
        View r72 = (View) r42.get(r62);
        if (r72.getVisibility() == 8) goto L12;
        wd r0 = ((zd) r72.getLayoutParams()).a;
        if (r0 != null) goto L10;
    L11:
        q(r72, r33);
        goto L12
    L10:
        if (r0.g(this, r72, r33) == false) goto L11;
    L12:
        r62 = r62 + 1;
        goto L3
    }

    @Override // android.view.View
    public final void onMeasure(int r27, int r28) {
        CoordinatorLayout r0 = this;
        r0.s();
        int r1 = r0.getChildCount();
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L14;
        View r4 = r0.getChildAt(r2);
        u30 r5 = (u30) r0.b.b;
        int r7 = r5.c;
        int r8 = 0;
    L6:
        if (r8 >= r7) goto L13;
        ArrayList r9 = (ArrayList) r5.j(r8);
        if (r9 == null) goto L12;
        if (r9.contains(r4) == false) goto L12;
        boolean r12 = true;
    L16:
        if (r12 == r0.m) goto L31;
        if (r12 == false) goto L26;
        if (r0.h == true) goto L21;
    L24:
        r0.m = true;
        goto L31
    L21:
        if (r0.l != null) goto L23;
        r0.l = new ae(r0);
    L23:
        r0.getViewTreeObserver().addOnPreDrawListener(r0.l);
        goto L24
    L26:
        if (r0.h == true) goto L28;
    L30:
        r0.m = false;
        goto L31
    L28:
        if (r0.l == null) goto L30;
        r0.getViewTreeObserver().removeOnPreDrawListener(r0.l);
    L31:
        int r72 = r0.getPaddingLeft();
        int r13 = r0.getPaddingTop();
        int r82 = r0.getPaddingRight();
        int r22 = r0.getPaddingBottom();
        WeakHashMap r42 = ja0.a;
        int r92 = t90.d(r0);
        if (r92 != 1) goto L34;
        boolean r10 = true;
    L35:
        int r11 = View.MeasureSpec.getMode(r27);
        int r122 = View.MeasureSpec.getSize(r27);
        int r132 = View.MeasureSpec.getMode(r28);
        int r14 = View.MeasureSpec.getSize(r28);
        int r15 = r72 + r82;
        int r16 = r13 + r22;
        int r17 = r0.getSuggestedMinimumWidth();
        int r23 = r0.getSuggestedMinimumHeight();
        if (r0.n != null) goto L38;
    L40:
        boolean r172 = false;
    L41:
        ArrayList r3 = r0.a;
        int r43 = r3.size();
        int r52 = 0;
        int r18 = 0;
    L42:
        if (r52 >= r43) goto L84;
        View r19 = (View) r3.get(r52);
        int r21 = r17;
        if (r19.getVisibility() != 8) goto L46;
        ArrayList r232 = r3;
        int r222 = r43;
        int r192 = r52;
        int r20 = r72;
        r17 = r21;
        boolean r24 = false;
        int r212 = r82;
    L83:
        r52 = r192 + 1;
        r72 = r20;
        r82 = r212;
        r43 = r222;
        r3 = r232;
        goto L42
    L46:
        zd r6 = (zd) r19.getLayoutParams();
        int r110 = r6.e;
        if (r110 < 0) goto L67;
        if (r11 == 0) goto L67;
        int r111 = r0.m(r110);
        int r112 = r6.c;
        if (r112 != 0) goto L52;
        r112 = 8388661;
    L52:
        int r113 = Gravity.getAbsoluteGravity(r112, r92) & 7;
        int r233 = r23;
        if (r113 != 3) goto L56;
        if (r10 == true) goto L56;
    L58:
        int r114 = Math.max(0, (r122 - r82) - r111);
    L59:
        int r25 = r43;
        int r44 = r114;
        int r115 = r25;
    L69:
        if (r172 == true) goto L71;
    L73:
        r222 = r115;
        int r26 = r27;
        int r116 = r28;
    L74:
        wd r02 = r6.a;
        if (r02 == null) goto L80;
        r24 = false;
        r20 = r72;
        int r73 = r21;
        r212 = r82;
        int r83 = r233;
        r232 = r3;
        int r32 = r26;
        r192 = r52;
        int r53 = r116;
        boolean r03 = r02.h(this, r19, r32, r44, r53);
        View r117 = r19;
        r26 = r32;
        int r33 = r44;
        int r45 = r53;
        if (r03 == false) goto L81;
        r0 = this;
    L82:
        int r29 = Math.max(r73, ((r117.getMeasuredWidth() + r15) + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((ViewGroup.MarginLayoutParams) r6).rightMargin);
        int r34 = Math.max(r83, ((r117.getMeasuredHeight() + r16) + ((ViewGroup.MarginLayoutParams) r6).topMargin) + ((ViewGroup.MarginLayoutParams) r6).bottomMargin);
        r18 = View.combineMeasuredStates(r18, r117.getMeasuredState());
        r17 = r29;
        r23 = r34;
    L81:
        r0 = this;
        r0.measureChildWithMargins(r117, r26, r33, r45, 0);
        goto L82
    L80:
        r20 = r72;
        r73 = r21;
        r24 = false;
        r212 = r82;
        r83 = r233;
        r232 = r3;
        r33 = r44;
        r45 = r116;
        r117 = r19;
        r192 = r52;
        goto L81
    L71:
        if (s90.b(r19) == true) goto L73;
        r222 = r115;
        int r118 = r0.n.c() + r0.n.b();
        int r119 = r0.n.a() + r0.n.d();
        r26 = View.MeasureSpec.makeMeasureSpec(r122 - r118, r11);
        r116 = View.MeasureSpec.makeMeasureSpec(r14 - r119, r132);
    L56:
        if (r113 != 5) goto L60;
        if (r10 == true) goto L58;
    L60:
        if (r113 != 5) goto L63;
        if (r10 == true) goto L63;
    L65:
        r114 = Math.max(0, r111 - r72);
    L63:
        if (r113 != 3) goto L68;
        if (r10 == true) goto L65;
    L68:
        r115 = r43;
        r44 = 0;
    L67:
        r233 = r23;
        goto L68
    L84:
        int r62 = r18;
        r0.setMeasuredDimension(View.resolveSizeAndState(r17, r27, (-16777216) & r62), View.resolveSizeAndState(r23, r28, r62 << 16));
        return;
    L38:
        if (s90.b(r0) == false) goto L40;
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
        zd r63 = (zd) r62.getLayoutParams();
        if (r63.a(0) == false) goto L11;
        wd r64 = r63.a;
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
        zd r22 = (zd) r2.getLayoutParams();
        if (r22.a(0) == false) goto L13;
        wd r23 = r22.a;
        if (r23 == null) goto L13;
        r1 = r1 | r23.i(r6);
    L13:
        r0 = r0 + 1;
        goto L3
    L14:
        return r1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r7, int r8, int r9, int[] r10) {
        c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r8, int r9, int r10, int r11, int r12) {
        e(r8, r9, r10, r11, r12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r2, View r3, int r4) {
        a(r2, r3, r4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r7) {
        if ((r7 instanceof be) == true) goto L6;
        super.onRestoreInstanceState(r7);
        return;
    L6:
        be r72 = (be) r7;
        super.onRestoreInstanceState(r72.a);
        SparseArray r73 = r72.c;
        int r0 = getChildCount();
        int r1 = 0;
    L7:
        if (r1 >= r0) goto L15;
        View r2 = getChildAt(r1);
        int r3 = r2.getId();
        wd r4 = n(r2).a;
        if (r3 == (-1)) goto L14;
        if (r4 == null) goto L14;
        Parcelable r32 = (Parcelable) r73.get(r3);
        if (r32 == null) goto L14;
        r4.m(r2, r32);
    L14:
        r1 = r1 + 1;
        goto L7
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        be r0 = new be(super.onSaveInstanceState());
        SparseArray r1 = new SparseArray();
        int r2 = getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        View r4 = getChildAt(r3);
        int r5 = r4.getId();
        wd r6 = ((zd) r4.getLayoutParams()).a;
        if (r5 == (-1)) goto L10;
        if (r6 == null) goto L10;
        Parcelable r42 = r6.n(r4);
        if (r42 == null) goto L10;
        r1.append(r5, r42);
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        r0.c = r1;
        return r0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r2, View r3, int r4) {
        return f(r2, r3, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r2) {
        b(r2, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r18) {
        int r2 = r18.getActionMasked();
        if (this.j != null) goto L8;
        boolean r3 = r(r18, 1);
        if (r3 == true) goto L9;
    L7:
        boolean r6 = false;
    L12:
        MotionEvent r8 = null;
        if (this.j != null) goto L15;
        r6 = r6 | super.onTouchEvent(r18);
    L17:
        if (r8 == null) goto L19;
        r8.recycle();
    L19:
        if (r2 != 1) goto L21;
    L24:
        t(false);
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
        wd r62 = ((zd) this.j.getLayoutParams()).a;
        if (r62 == null) goto L7;
        r6 = r62.q(this.j, r18);
        goto L12
    L8:
        r3 = false;
        goto L9
    }

    public final void p(int r23) {
        WeakHashMap r2 = ja0.a;
        int r3 = t90.d(this);
        ArrayList r22 = this.a;
        int r9 = r22.size();
        Rect r10 = g();
        Rect r11 = g();
        Rect r12 = g();
        int r14 = 0;
    L3:
        tx r15 = x;
        if (r14 >= r9) goto L120;
        View r4 = (View) r22.get(r14);
        zd r5 = (zd) r4.getLayoutParams();
        if (r23 == 0) goto L8;
    L10:
        int r6 = 0;
    L11:
        if (r6 >= r14) goto L35;
        if (r5.l != ((View) r22.get(r6))) goto L33;
        zd r7 = (zd) r4.getLayoutParams();
        if (r7.k == null) goto L33;
        Rect r8 = g();
        Rect r13 = g();
        zd r17 = r5;
        Rect r52 = g();
        k(r7.k, r8);
        i(r4, r13, false);
        int r72 = r4.getMeasuredWidth();
        View r19 = r4;
        int r82 = r19.getMeasuredHeight();
        ArrayList r172 = r22;
        zd r24 = r17;
        int r18 = r6;
        r3 = r3;
        int r20 = r14;
        View r142 = r19;
        l(r3, r8, r52, r7, r72, r82);
        int r192 = r9;
        Rect r21 = r12;
        if (r52.left == r13.left) goto L19;
    L22:
        boolean r16 = true;
    L23:
        h(r7, r52, r72, r82);
        int r73 = r52.left - r13.left;
        int r83 = r52.top - r13.top;
        if (r73 == 0) goto L26;
        WeakHashMap r92 = ja0.a;
        r142.offsetLeftAndRight(r73);
    L26:
        if (r83 == 0) goto L28;
        WeakHashMap r74 = ja0.a;
        r142.offsetTopAndBottom(r83);
    L28:
        if (r16 == false) goto L32;
        wd r75 = r7.a;
        if (r75 == null) goto L32;
        r75.d(this, r142, r7.k);
    L32:
        r8.setEmpty();
        r15.c(r8);
        r13.setEmpty();
        r15.c(r13);
        r52.setEmpty();
        r15.c(r52);
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
        zd r25 = r5;
        int r193 = r9;
        Rect r212 = r12;
        int r202 = r14;
        View r143 = r4;
        i(r143, r11, true);
        if (r25.g == 0) goto L52;
        if (r11.isEmpty() == true) goto L52;
        int r53 = Gravity.getAbsoluteGravity(r25.g, r3);
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
        if (r25.h == 0) goto L106;
        if (r143.getVisibility() != 0) goto L106;
        WeakHashMap r26 = ja0.a;
        if (v90.c(r143) == false) goto L106;
        if (r143.getWidth() <= 0) goto L106;
        if (r143.getHeight() <= 0) goto L106;
        zd r27 = (zd) r143.getLayoutParams();
        wd r43 = r27.a;
        Rect r54 = g();
        Rect r123 = g();
        r123.set(r143.getLeft(), r143.getTop(), r143.getRight(), r143.getBottom());
        if (r43 != null) goto L66;
    L72:
        r54.set(r123);
    L73:
        r123.setEmpty();
        r15.c(r123);
        if (r54.isEmpty() == false) goto L76;
        r54.setEmpty();
        r15.c(r54);
        goto L106
    L76:
        int r44 = Gravity.getAbsoluteGravity(r27.h, r3);
        if ((r44 & 48) != 48) goto L81;
        int r62 = (r54.top - ((ViewGroup.MarginLayoutParams) r27).topMargin) - r27.j;
        int r76 = r10.top;
        if (r62 >= r76) goto L81;
        v(r143, r76 - r62);
        boolean r77 = true;
    L83:
        if ((r44 & 80) != 80) goto L87;
        int r63 = ((getHeight() - r54.bottom) - ((ViewGroup.MarginLayoutParams) r27).bottomMargin) + r27.j;
        int r84 = r10.bottom;
        if (r63 >= r84) goto L87;
        v(r143, r63 - r84);
        r77 = true;
    L87:
        if (r77 == true) goto L90;
        v(r143, 0);
    L90:
        if ((r44 & 3) != 3) goto L94;
        int r64 = (r54.left - ((ViewGroup.MarginLayoutParams) r27).leftMargin) - r27.i;
        int r78 = r10.left;
        if (r64 >= r78) goto L94;
        u(r143, r78 - r64);
        boolean r79 = true;
    L96:
        if ((r44 & 5) != 5) goto L101;
        int r45 = ((getWidth() - r54.right) - ((ViewGroup.MarginLayoutParams) r27).rightMargin) + r27.i;
        int r28 = r10.right;
        if (r45 >= r28) goto L101;
        u(r143, r45 - r28);
        r79 = true;
    L101:
        if (r79 == true) goto L103;
        u(r143, 0);
    L103:
        r54.setEmpty();
        r15.c(r54);
    L94:
        r79 = false;
    L81:
        r77 = false;
        goto L83
    L66:
        if (r43.a(r143) == false) goto L72;
        if (r123.contains(r54) == true) goto L73;
        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + r54.toShortString() + " | Bounds:" + r123.toShortString());
    L106:
        if (r23 == 2) goto L111;
        Rect r46 = r212;
        r46.set(((zd) r143.getLayoutParams()).o);
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
        ((zd) r143.getLayoutParams()).o.set(r11);
    L112:
        int r144 = r202 + 1;
        r29 = r193;
    L113:
        r55 = r173;
        if (r144 >= r29) goto L119;
        View r710 = (View) r55.get(r144);
        wd r85 = ((zd) r710.getLayoutParams()).a;
        if (r85 == null) goto L118;
        r85.b(r710);
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
        r15.c(r10);
        r11.setEmpty();
        r15.c(r11);
        r47.setEmpty();
        r15.c(r47);
    }

    public final void q(View r13, int r14) {
        zd r0 = (zd) r13.getLayoutParams();
        View r1 = r0.k;
        if (r1 == null) goto L5;
    L9:
        tx r2 = x;
        if (r1 == null) goto L18;
        Rect r4 = g();
        Rect r5 = g();
        k(r1, r4);     // Catch: Throwable -> L15
        zd r6 = (zd) r13.getLayoutParams();     // Catch: Throwable -> L15
        int r7 = r13.getMeasuredWidth();     // Catch: Throwable -> L15
        int r8 = r13.getMeasuredHeight();     // Catch: Throwable -> L15
        l(r14, r4, r5, r6, r7, r8);     // Catch: Throwable -> L15
        h(r6, r5, r7, r8);     // Catch: Throwable -> L15
        r13.layout(r5.left, r5.top, r5.right, r5.bottom);     // Catch: Throwable -> L15
        r4.setEmpty();
        r2.c(r4);
        r5.setEmpty();
        r2.c(r5);
        return;
    L15:
        th = move-exception;
        r4.setEmpty();
        r2.c(r4);
        r5.setEmpty();
        r2.c(r5);
        throw th;
    L18:
        int r142 = r0.e;
        if (r142 < 0) goto L42;
        zd r02 = (zd) r13.getLayoutParams();
        int r12 = r02.c;
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
        int r143 = m(r142) - r62;
        if (r22 != 1) goto L29;
        r143 = r143 + (r62 / 2);
    L34:
        if (r16 != 16) goto L36;
        int r17 = r72 / 2;
    L40:
        int r144 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r02).leftMargin, Math.min(r143, ((r42 - getPaddingRight()) - r62) - ((ViewGroup.MarginLayoutParams) r02).rightMargin));
        int r03 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r02).topMargin, Math.min(r17, ((r52 - getPaddingBottom()) - r72) - ((ViewGroup.MarginLayoutParams) r02).bottomMargin));
        r13.layout(r144, r03, r62 + r144, r72 + r03);
        return;
    L36:
        if (r16 == 80) goto L38;
        r17 = 0;
        goto L40
    L38:
        r17 = r72;
        goto L40
    L29:
        if (r22 != 5) goto L34;
        r143 = r143 + r62;
        goto L34
    L42:
        zd r145 = (zd) r13.getLayoutParams();
        Rect r9 = g();
        r9.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r145).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) r145).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) r145).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) r145).bottomMargin);
        if (this.n == null) goto L49;
        WeakHashMap r04 = ja0.a;
        if (s90.b(this) == false) goto L49;
        if (s90.b(r13) == true) goto L49;
        r9.left = this.n.b() + r9.left;
        r9.top = this.n.d() + r9.top;
        r9.right -= this.n.c();
        r9.bottom -= this.n.a();
    L49:
        Rect r10 = g();
        int r146 = r145.c;
        if ((r146 & 7) != 0) goto L53;
        r146 = r146 | 8388611;
    L53:
        if ((r146 & 112) != 0) goto L55;
        r146 = r146 | 48;
    L55:
        co.b(r146, r13.getMeasuredWidth(), r13.getMeasuredHeight(), r9, r10, r14);
        r13.layout(r10.left, r10.top, r10.right, r10.bottom);
        r9.setEmpty();
        r2.c(r9);
        r10.setEmpty();
        r2.c(r10);
        return;
    L5:
        if (r0.f == (-1)) goto L9;
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final boolean r(MotionEvent r21, int r22) {
        int r3 = r21.getActionMasked();
        ArrayList r4 = this.c;
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
        ce r52 = w;
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
        wd r10 = ((zd) r9.getLayoutParams()).a;
        if (r72 == false) goto L25;
        if (r3 == 0) goto L25;
        if (r10 == null) goto L34;
        if (r82 != null) goto L20;
        long r12 = SystemClock.uptimeMillis();
        r82 = MotionEvent.obtain(r12, r12, 3, 0.0f, 0.0f, 0);
    L20:
        if (r22 == 0) goto L24;
        if (r22 != 1) goto L34;
        r10.q(r9, r82);
        goto L34
    L24:
        r10.f(this, r9, r82);
    L34:
        r62 = r62 + 1;
    L25:
        if (r72 == true) goto L34;
        if (r10 == null) goto L34;
        if (r22 == 0) goto L31;
        if (r22 != 1) goto L32;
        r72 = r10.q(r9, r21);
    L32:
        if (r72 == false) goto L34;
        this.j = r9;
        goto L34
    L31:
        r72 = r10.f(this, r9, r21);
        goto L32
    L35:
        r4.clear();
        return r72;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r2, Rect r3, boolean r4) {
        wd r0 = ((zd) r2.getLayoutParams()).a;
        if (r0 == null) goto L6;
        r0.l(this, r2);
    L6:
        return super.requestChildRectangleOnScreen(r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r1) {
        super.requestDisallowInterceptTouchEvent(r1);
        if (r1 == true) goto L5;
        return;
    L5:
        if (this.g == true) goto L9;
        t(false);
        this.g = true;
        return;
    }

    public final void s() {
        ArrayList r0 = this.a;
        r0.clear();
        a8 r1 = this.b;
        u30 r2 = (u30) r1.b;
        sx r3 = (sx) r1.a;
        u30 r4 = (u30) r1.b;
        int r5 = r2.c;
        int r6 = 0;
        int r7 = 0;
    L3:
        if (r7 >= r5) goto L8;
        ArrayList r8 = (ArrayList) r2.j(r7);
        if (r8 == null) goto L7;
        r8.clear();
        r3.c(r8);
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
        zd r82 = n(r72);
        int r9 = r82.f;
        if (r9 != (-1)) goto L13;
        r82.l = null;
        r82.k = null;
    L55:
        if (r4.containsKey(r72) == true) goto L57;
        r4.put(r72, null);
    L57:
        int r92 = 0;
    L58:
        if (r92 >= r22) goto L90;
        if (r92 == r52) goto L87;
        View r10 = getChildAt(r92);
        if (r10 == r82.l) goto L72;
        WeakHashMap r12 = ja0.a;
        int r122 = t90.d(this);
        int r13 = Gravity.getAbsoluteGravity(((zd) r10.getLayoutParams()).g, r122);
        if (r13 != 0) goto L66;
    L68:
        wd r102 = r82.a;
        if (r102 == null) goto L87;
        r102.b(r72);
        goto L87
    L66:
        if ((Gravity.getAbsoluteGravity(r82.h, r122) & r13) != r13) goto L68;
    L72:
        if (r4.containsKey(r10) == true) goto L77;
        if (r4.containsKey(r10) == true) goto L77;
        r4.put(r10, null);
    L77:
        if (r4.containsKey(r10) == false) goto L89;
        if (r4.containsKey(r72) == false) goto L89;
        ArrayList r123 = (ArrayList) r4.getOrDefault(r10, null);
        if (r123 != null) goto L86;
        r123 = (ArrayList) r3.a();
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
        View r103 = r82.k;
        if (r103 != null) goto L16;
    L29:
        View r104 = findViewById(r9);
        r82.k = r104;
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
        r82.l = null;
        r82.k = null;
        goto L55
    L45:
        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
    L50:
        r82.l = r104;
        goto L55
    L33:
        if (isInEditMode() == false) goto L36;
        r82.l = null;
        r82.k = null;
        goto L55
    L36:
        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
    L52:
        if (isInEditMode() == false) goto L92;
        r82.l = null;
        r82.k = null;
        goto L55
    L92:
        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(r9) + " to anchor view " + r72);
    L16:
        if (r103.getId() != r9) goto L29;
        View r105 = r82.k;
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
        r82.l = null;
        r82.k = null;
        goto L29
    L28:
        r82.l = r105;
        goto L55
    L93:
        ArrayList r23 = (ArrayList) r1.c;
        r23.clear();
        HashSet r32 = (HashSet) r1.d;
        r32.clear();
        int r53 = r4.c;
    L94:
        if (r6 >= r53) goto L96;
        r1.a(r4.h(r6), r23, r32);
        r6 = r6 + 1;
        goto L94
    L96:
        r0.addAll(r23);
        Collections.reverse(r0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
        super.setFitsSystemWindows(r1);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener r1) {
        this.q = r1;
    }

    public void setStatusBarBackground(Drawable r3) {
        Drawable r0 = this.p;
        if (r0 == r3) goto L21;
        Drawable r1 = null;
        if (r0 == null) goto L7;
        r0.setCallback(null);
    L7:
        if (r3 == null) goto L9;
        r1 = r3.mutate();
    L9:
        this.p = r1;
        if (r1 != null) goto L12;
    L19:
        WeakHashMap r32 = ja0.a;
        s90.k(this);
        return;
    L12:
        if (r1.isStateful() == false) goto L14;
        this.p.setState(getDrawableState());
    L14:
        Drawable r33 = this.p;
        WeakHashMap r02 = ja0.a;
        dh.b(r33, t90.d(this));
        Drawable r34 = this.p;
        if (getVisibility() != 0) goto L17;
        boolean r03 = true;
    L18:
        r34.setVisible(r03, false);
        this.p.setCallback(this);
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
        Drawable r22 = gd.b(getContext(), r2);
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
        Drawable r1 = this.p;
        if (r1 != null) goto L9;
        return;
    L9:
        if (r1.isVisible() == r32) goto L13;
        this.p.setVisible(r32, false);
        return;
    L13:
        return;
    L5:
        r32 = false;
        goto L6
    }

    public final void t(boolean r14) {
        int r0 = getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L12;
        View r3 = getChildAt(r2);
        wd r4 = ((zd) r3.getLayoutParams()).a;
        if (r4 == null) goto L11;
        long r5 = SystemClock.uptimeMillis();
        MotionEvent r52 = MotionEvent.obtain(r5, r5, 3, 0.0f, 0.0f, 0);
        if (r14 == false) goto L9;
        r4.f(this, r3, r52);
    L10:
        r52.recycle();
        goto L11
    L9:
        r4.q(r3, r52);
    L11:
        r2 = r2 + 1;
        goto L3
    L12:
        int r142 = 0;
    L13:
        if (r142 >= r0) goto L15;
        ((zd) getChildAt(r142).getLayoutParams()).getClass();
        r142 = r142 + 1;
        goto L13
    L15:
        this.j = null;
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.p) goto L11;
        return false;
    L11:
        return true;
    }

    public final void w() {
        WeakHashMap r0 = ja0.a;
        if (s90.b(this) == true) goto L5;
        y90.u(this, null);
        return;
    L5:
        if (this.r != null) goto L7;
        this.r = new l0(9, this);
    L7:
        y90.u(this, this.r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof zd) == false) goto L7;
        return new zd((zd) r2);
    L7:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new zd((ViewGroup.MarginLayoutParams) r2);
    L11:
        return new zd(r2);
    }
}
