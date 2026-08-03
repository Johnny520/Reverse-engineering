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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p004C.C0061b;
import p004C.C0062c;
import p006D.AbstractC0068E;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p006D.C0119p;
import p006D.C0122q0;
import p006D.InterfaceC0115n;
import p006D.InterfaceC0117o;
import p037U.C0375k;
import p043Y.C0463v;
import p057g.AbstractC0883T;
import p063j.C0966k;
import p076q.AbstractC1054a;
import p078r.AbstractC1058a;
import p078r.AbstractC1064g;
import p078r.C1061d;
import p078r.C1063f;
import p078r.InterfaceC1059b;
import p078r.ViewGroupOnHierarchyChangeListenerC1060c;
import p078r.ViewTreeObserverOnPreDrawListenerC1062e;
import p082t.AbstractC1080a;
import p087w.AbstractC1112b;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0115n, InterfaceC0117o {

    /* JADX INFO: renamed from: t */
    public static final String f1273t = null;

    /* JADX INFO: renamed from: u */
    public static final Class[] f1274u = null;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f1275v = null;

    /* JADX INFO: renamed from: w */
    public static final C0375k f1276w = null;

    /* JADX INFO: renamed from: x */
    public static final C0062c f1277x = null;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1278a;

    /* JADX INFO: renamed from: b */
    public final C0463v f1279b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1280c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f1281d;

    /* JADX INFO: renamed from: e */
    public final int[] f1282e;

    /* JADX INFO: renamed from: f */
    public final int[] f1283f;

    /* JADX INFO: renamed from: g */
    public boolean f1284g;

    /* JADX INFO: renamed from: h */
    public boolean f1285h;

    /* JADX INFO: renamed from: i */
    public final int[] f1286i;

    /* JADX INFO: renamed from: j */
    public View f1287j;

    /* JADX INFO: renamed from: k */
    public View f1288k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC1062e f1289l;

    /* JADX INFO: renamed from: m */
    public boolean f1290m;

    /* JADX INFO: renamed from: n */
    public C0122q0 f1291n;

    /* JADX INFO: renamed from: o */
    public boolean f1292o;

    /* JADX INFO: renamed from: p */
    public Drawable f1293p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f1294q;

    /* JADX INFO: renamed from: r */
    public C0095d f1295r;

    /* JADX INFO: renamed from: s */
    public final C0119p f1296s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 == null) goto L5;
        String r03 = r02.getName();
    L6:
        f1273t = r03;
        f1276w = new C0375k(3);
        f1274u = new Class[]{Context.class, AttributeSet.class};
        f1275v = new ThreadLocal();
        f1277x = new C0062c();
        return;
    L5:
        r03 = null;
        goto L6
    }

    public CoordinatorLayout(Context r7, AttributeSet r8) {
        super(r7, r8, C1031R.attr.coordinatorLayoutStyle);
        this.f1278a = new ArrayList();
        this.f1279b = new C0463v(3);
        this.f1280c = new ArrayList();
        this.f1281d = new ArrayList();
        this.f1282e = new int[2];
        this.f1283f = new int[2];
        this.f1296s = new C0119p();
        int[] r2 = AbstractC1054a.f4061a;
        int r3 = 0;
        TypedArray r1 = r7.obtainStyledAttributes(r8, r2, C1031R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT < 29) goto L5;
        AbstractC0883T.m2214d(this, r7, r2, r8, r1);
    L5:
        int r82 = r1.getResourceId(0, 0);
        if (r82 == 0) goto L10;
        Resources r72 = r7.getResources();
        int[] r83 = r72.getIntArray(r82);
        this.f1286i = r83;
        float r73 = r72.getDisplayMetrics().density;
        int r84 = r83.length;
    L8:
        if (r3 >= r84) goto L10;
        this.f1286i[r3] = (int) (r2[r3] * r73);
        r3 = r3 + 1;
    L10:
        this.f1293p = r1.getDrawable(1);
        r1.recycle();
        m1178v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1060c(this));
        Field r74 = AbstractC0080Q.f219a;
        if (getImportantForAccessibility() != 0) goto L15;
        setImportantForAccessibility(1);
        return;
    }

    /* JADX INFO: renamed from: g */
    public static Rect m1163g() {
        Rect r02 = (Rect) f1277x.mo198a();
        if (r02 == null) goto L5;
        return r02;
    L5:
        return new Rect();
    }

    /* JADX INFO: renamed from: l */
    public static void m1164l(int r6, Rect r7, Rect r8, C1061d r9, int r10, int r11) {
        int r02 = r9.f4066c;
        if (r02 != 0) goto L5;
        r02 = 17;
    L5:
        int r03 = Gravity.getAbsoluteGravity(r02, r6);
        int r92 = r9.f4067d;
        if ((r92 & 7) != 0) goto L9;
        r92 = r92 | 8388611;
    L9:
        if ((r92 & 112) != 0) goto L11;
        r92 = r92 | 48;
    L11:
        int r62 = Gravity.getAbsoluteGravity(r92, r6);
        int r93 = r03 & 7;
        int r04 = r03 & 112;
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
        if (r04 == 16) goto L30;
        if (r04 == 80) goto L31;
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
    public static C1061d m1165m(View r4) {
        C1061d r02 = (C1061d) r4.getLayoutParams();
        if (r02.f4065b == true) goto L21;
        Class<?> r42 = r4.getClass();
        InterfaceC1059b r2 = null;
    L5:
        if (r42 == null) goto L10;
        r2 = (InterfaceC1059b) r42.getAnnotation(InterfaceC1059b.class);
        if (r2 != null) goto L10;
        r42 = r42.getSuperclass();
    L10:
        if (r2 != null) goto L22;
    L20:
        r02.f4065b = true;
        goto L21
    L22:
        AbstractC1058a r1 = (AbstractC1058a) r2.value().getDeclaredConstructor(null).newInstance(null);     // Catch: Exception -> L19
        AbstractC1058a r3 = r02.f4064a;     // Catch: Exception -> L19
        if (r3 == r1) goto L20;
        if (r3 == null) goto L15;
        r3.mo1844e();     // Catch: Exception -> L19
    L15:
        r02.f4064a = r1;     // Catch: Exception -> L19
        r02.f4065b = true;     // Catch: Exception -> L19
        if (r1 == null) goto L20;
        r1.mo1843c(r02);     // Catch: Exception -> L19
    L19:
        r2.value().getClass();
    L21:
        return r02;
    }

    /* JADX INFO: renamed from: t */
    public static void m1166t(View r3, int r4) {
        C1061d r02 = (C1061d) r3.getLayoutParams();
        int r1 = r02.f4072i;
        if (r1 == r4) goto L6;
        Field r2 = AbstractC0080Q.f219a;
        r3.offsetLeftAndRight(r4 - r1);
        r02.f4072i = r4;
        return;
    }

    /* JADX INFO: renamed from: u */
    public static void m1167u(View r3, int r4) {
        C1061d r02 = (C1061d) r3.getLayoutParams();
        int r1 = r02.f4073j;
        if (r1 == r4) goto L6;
        Field r2 = AbstractC0080Q.f219a;
        r3.offsetTopAndBottom(r4 - r1);
        r02.f4073j = r4;
        return;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: a */
    public final void mo421a(View r2, View r3, int r4, int r5) {
        C0119p r02 = this.f1296s;
        if (r5 != 1) goto L5;
        r02.f307b = r4;
    L6:
        this.f1288k = r3;
        int r22 = getChildCount();
        int r32 = 0;
    L7:
        if (r32 >= r22) goto L9;
        ((C1061d) getChildAt(r32).getLayoutParams()).getClass();
        r32 = r32 + 1;
        goto L7
    L9:
        return;
    L5:
        r02.f306a = r4;
        goto L6
    }

    @Override // p006D.InterfaceC0117o
    /* JADX INFO: renamed from: b */
    public final void mo426b(View r17, int r18, int r19, int r20, int r21, int r22, int[] r23) {
        int r8 = getChildCount();
        boolean r02 = false;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
    L4:
        if (r10 >= r8) goto L24;
        View r2 = getChildAt(r10);
        if (r2.getVisibility() == 8) goto L23;
        C1061d r1 = (C1061d) r2.getLayoutParams();
        if (r1.m2535a(r22) == false) goto L23;
        AbstractC1058a r13 = r1.f4064a;
        if (r13 == null) goto L23;
        int[] r15 = this.f1282e;
        r15[0] = 0;
        r15[1] = 0;
        r13.mo1819k(this, r2, r19, r20, r21, r15);
        if (r20 <= 0) goto L17;
        int r03 = Math.max(r11, r15[0]);
    L16:
        r11 = r03;
        if (r21 <= 0) goto L21;
        int r04 = Math.max(r12, r15[1]);
    L20:
        r12 = r04;
        r02 = true;
        goto L23
    L21:
        r04 = Math.min(r12, r15[1]);
        goto L20
    L17:
        r03 = Math.min(r11, r15[0]);
    L23:
        r10 = r10 + 1;
        goto L4
    L24:
        r23[0] = r23[0] + r11;
        r23[1] = r23[1] + r12;
        if (r02 == false) goto L33;
        m1173o(1);
        return;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: c */
    public final void mo422c(View r9, int r10, int r11, int r12, int r13, int r14) {
        mo426b(r9, r10, r11, r12, r13, 0, this.f1283f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C1061d) == true) goto L5;
    L7:
        return false;
    L5:
        if (super.checkLayoutParams(r2) == false) goto L7;
        return true;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: d */
    public final void mo423d(View r8, int r9) {
        C0119p r2 = this.f1296s;
        if (r9 != 1) goto L5;
        r2.f307b = 0;
    L6:
        int r22 = getChildCount();
        int r3 = 0;
    L7:
        if (r3 >= r22) goto L21;
        View r4 = getChildAt(r3);
        C1061d r5 = (C1061d) r4.getLayoutParams();
        if (r5.m2535a(r9) == false) goto L20;
        AbstractC1058a r6 = r5.f4064a;
        if (r6 == null) goto L14;
        r6.mo1823p(r4, r8, r9);
    L14:
        if (r9 == 0) goto L18;
        if (r9 != 1) goto L19;
        r5.f4078o = false;
    L19:
        r5.getClass();
        goto L20
    L18:
        r5.f4077n = false;
    L20:
        r3 = r3 + 1;
        goto L7
    L21:
        this.f1288k = null;
        return;
    L5:
        r2.f306a = 0;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r2, View r3, long r4) {
        AbstractC1058a r02 = ((C1061d) r3.getLayoutParams()).f4064a;
        if (r02 == null) goto L6;
        r02.getClass();
    L6:
        return super.drawChild(r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] r02 = getDrawableState();
        Drawable r1 = this.f1293p;
        if (r1 != null) goto L5;
    L7:
        boolean r03 = false;
    L8:
        if (r03 == false) goto L11;
        invalidate();
        return;
    L11:
        return;
    L5:
        if (r1.isStateful() == false) goto L7;
        r03 = r1.setState(r02);
        goto L8
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: e */
    public final void mo424e(View r18, int r19, int r20, int[] r21, int r22) {
        int r9 = getChildCount();
        boolean r02 = false;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
    L4:
        if (r11 >= r9) goto L24;
        View r2 = getChildAt(r11);
        if (r2.getVisibility() == 8) goto L23;
        C1061d r1 = (C1061d) r2.getLayoutParams();
        if (r1.m2535a(r22) == false) goto L23;
        AbstractC1058a r14 = r1.f4064a;
        if (r14 == null) goto L23;
        int[] r7 = this.f1282e;
        r7[0] = 0;
        r7[1] = 0;
        r14.mo1818j(this, r2, r18, r19, r20, r7, r22);
        if (r19 <= 0) goto L17;
        int r03 = Math.max(r12, r7[0]);
    L16:
        r12 = r03;
        if (r20 <= 0) goto L21;
        int r04 = Math.max(r13, r7[1]);
    L20:
        r13 = r04;
        r02 = true;
        goto L23
    L21:
        r04 = Math.min(r13, r7[1]);
        goto L20
    L17:
        r03 = Math.min(r12, r7[0]);
    L23:
        r11 = r11 + 1;
        goto L4
    L24:
        r21[0] = r12;
        r21[1] = r13;
        if (r02 == false) goto L33;
        m1173o(1);
        return;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: f */
    public final boolean mo425f(View r7, View r8, int r9, int r10) {
        int r72 = getChildCount();
        int r02 = 0;
        boolean r1 = false;
    L3:
        if (r02 >= r72) goto L21;
        View r2 = getChildAt(r02);
        if (r2.getVisibility() == 8) goto L20;
        C1061d r3 = (C1061d) r2.getLayoutParams();
        AbstractC1058a r4 = r3.f4064a;
        if (r4 == null) goto L15;
        boolean r22 = r4.mo1822o(r2, r9, r10);
        r1 = r1 | r22;
        if (r10 == 0) goto L14;
        if (r10 != 1) goto L20;
        r3.f4078o = r22;
        goto L20
    L14:
        r3.f4077n = r22;
        goto L20
    L15:
        if (r10 == 0) goto L19;
        if (r10 != 1) goto L20;
        r3.f4078o = false;
        goto L20
    L19:
        r3.f4077n = false;
    L20:
        r02 = r02 + 1;
        goto L3
    L21:
        return r1;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1061d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new C1061d(getContext(), r3);
    }

    public final List<View> getDependencySortedChildren() {
        m1176r();
        return Collections.unmodifiableList(this.f1278a);
    }

    public final C0122q0 getLastWindowInsets() {
        return this.f1291n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0119p r02 = this.f1296s;
        int r1 = r02.f306a;
        return r02.f307b | r1;
    }

    public Drawable getStatusBarBackground() {
        return this.f1293p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int r02 = super.getSuggestedMinimumHeight();
        int r1 = getPaddingTop();
        return Math.max(r02, getPaddingBottom() + r1);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int r02 = super.getSuggestedMinimumWidth();
        int r1 = getPaddingLeft();
        return Math.max(r02, getPaddingRight() + r1);
    }

    /* JADX INFO: renamed from: h */
    public final void m1168h(C1061d r6, Rect r7, int r8, int r9) {
        int r02 = getWidth();
        int r1 = getHeight();
        int r03 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r6).leftMargin, Math.min(r7.left, ((r02 - getPaddingRight()) - r8) - ((ViewGroup.MarginLayoutParams) r6).rightMargin));
        int r62 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r6).topMargin, Math.min(r7.top, ((r1 - getPaddingBottom()) - r9) - ((ViewGroup.MarginLayoutParams) r6).bottomMargin));
        r7.set(r03, r62, r8 + r03, r9 + r62);
    }

    /* JADX INFO: renamed from: i */
    public final void m1169i(View r3, Rect r4, boolean r5) {
        if (r3.isLayoutRequested() == false) goto L5;
    L11:
        r4.setEmpty();
        return;
    L5:
        if (r3.getVisibility() == 8) goto L11;
        if (r5 == false) goto L9;
        m1171k(r3, r4);
        return;
    L9:
        r4.set(r3.getLeft(), r3.getTop(), r3.getRight(), r3.getBottom());
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m1170j(View r6) {
        C0966k r02 = (C0966k) this.f1279b.f1045b;
        int r1 = r02.f3432c;
        ArrayList r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L12;
        ArrayList r4 = (ArrayList) r02.m2324j(r3);
        if (r4 == null) goto L11;
        if (r4.contains(r6) == false) goto L11;
        if (r2 != null) goto L10;
        r2 = new ArrayList();
    L10:
        r2.add(r02.m2322h(r3));
    L11:
        r3 = r3 + 1;
        goto L3
    L12:
        ArrayList r62 = this.f1281d;
        r62.clear();
        if (r2 == null) goto L15;
        r62.addAll(r2);
    L15:
        return r62;
    }

    /* JADX INFO: renamed from: k */
    public final void m1171k(View r5, Rect r6) {
        ThreadLocal r02 = AbstractC1064g.f4082a;
        r6.set(0, 0, r5.getWidth(), r5.getHeight());
        ThreadLocal r03 = AbstractC1064g.f4082a;
        Matrix r1 = (Matrix) r03.get();
        if (r1 != null) goto L5;
        r1 = new Matrix();
        r03.set(r1);
    L6:
        AbstractC1064g.m2536a(this, r5, r1);
        ThreadLocal r52 = AbstractC1064g.f4083b;
        RectF r04 = (RectF) r52.get();
        if (r04 != null) goto L9;
        r04 = new RectF();
        r52.set(r04);
    L9:
        r04.set(r6);
        r1.mapRect(r04);
        r6.set((int) (r04.left + 0.5f), (int) (r04.top + 0.5f), (int) (r04.right + 0.5f), (int) (r04.bottom + 0.5f));
        return;
    L5:
        r1.reset();
        goto L6
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1172n(View r3, int r4, int r5) {
        C0062c r02 = f1277x;
        Rect r1 = m1163g();
        m1171k(r3, r1);
        boolean r32 = r1.contains(r4, r5);     // Catch: Throwable -> L6
        r1.setEmpty();
        r02.mo200c(r1);
        return r32;
    L6:
        th = move-exception;
        r1.setEmpty();
        r02.mo200c(r1);
        throw th;
    }

    /* JADX INFO: renamed from: o */
    public final void m1173o(int r26) {
        int r1 = r26;
        Field r7 = AbstractC0080Q.f219a;
        int r72 = getLayoutDirection();
        ArrayList r14 = this.f1278a;
        int r15 = r14.size();
        Rect r13 = m1163g();
        Rect r12 = m1163g();
        Rect r11 = m1163g();
        int r9 = 0;
    L3:
        C0062c r8 = f1277x;
        if (r9 >= r15) goto L129;
        View r2 = (View) r14.get(r9);
        C1061d r3 = (C1061d) r2.getLayoutParams();
        if (r1 == 0) goto L8;
    L11:
        int r4 = 0;
    L12:
        if (r4 >= r9) goto L37;
        if (r3.f4075l != ((View) r14.get(r4))) goto L35;
        C1061d r5 = (C1061d) r2.getLayoutParams();
        if (r5.f4074k == null) goto L35;
        Rect r6 = m1163g();
        Rect r10 = m1163g();
        ArrayList r18 = r14;
        Rect r142 = m1163g();
        m1171k(r5.f4074k, r6);
        m1169i(r2, r10, false);
        int r17 = r15;
        int r152 = r2.getMeasuredWidth();
        int r16 = r2.getMeasuredHeight();
        C1061d r20 = r3;
        C0062c r32 = r8;
        int r21 = r9;
        int r19 = r72;
        Rect r22 = r11;
        Rect r23 = r12;
        Rect r24 = r13;
        m1164l(r72, r6, r142, r5, r152, r16);
        if (r142.left == r10.left) goto L20;
    L23:
        boolean r102 = true;
    L24:
        m1168h(r5, r142, r152, r16);
        int r110 = r142.left - r10.left;
        int r82 = r142.top - r10.top;
        if (r110 == 0) goto L27;
        Field r92 = AbstractC0080Q.f219a;
        r2.offsetLeftAndRight(r110);
    L27:
        if (r82 == 0) goto L29;
        Field r111 = AbstractC0080Q.f219a;
        r2.offsetTopAndBottom(r82);
    L29:
        if (r102 == false) goto L33;
        AbstractC1058a r112 = r5.f4064a;
        if (r112 == null) goto L33;
        r112.mo1827d(this, r2, r5.f4074k);
    L33:
        r6.setEmpty();
        r32.mo200c(r6);
        r10.setEmpty();
        r32.mo200c(r10);
        r142.setEmpty();
        r32.mo200c(r142);
    L36:
        r4 = r4 + 1;
        r8 = r32;
        r15 = r17;
        r14 = r18;
        r72 = r19;
        r3 = r20;
        r9 = r21;
        r11 = r22;
        r12 = r23;
        r13 = r24;
        goto L12
    L20:
        if (r142.top != r10.top) goto L23;
        r102 = false;
    L35:
        r20 = r3;
        r19 = r72;
        r32 = r8;
        r21 = r9;
        r22 = r11;
        r23 = r12;
        r24 = r13;
        r18 = r14;
        r17 = r15;
        goto L36
    L37:
        C1061d r202 = r3;
        int r192 = r72;
        C0061b r33 = r8;
        int r212 = r9;
        Rect r222 = r11;
        Rect r42 = r12;
        Rect r242 = r13;
        ArrayList r182 = r14;
        int r172 = r15;
        m1169i(r2, r42, true);
        if (r202.f4070g != 0) goto L40;
    L55:
        int r62 = r192;
        Rect r73 = r242;
    L57:
        if (r202.f4071h == 0) goto L113;
        if (r2.getVisibility() != 0) goto L113;
        Field r113 = AbstractC0080Q.f219a;
        if (r2.isLaidOut() == false) goto L113;
        if (r2.getWidth() <= 0) goto L113;
        if (r2.getHeight() <= 0) goto L113;
        C1061d r114 = (C1061d) r2.getLayoutParams();
        AbstractC1058a r52 = r114.f4064a;
        Rect r83 = m1163g();
        Rect r93 = m1163g();
        r93.set(r2.getLeft(), r2.getTop(), r2.getRight(), r2.getBottom());
        if (r52 != null) goto L71;
    L77:
        r83.set(r93);
    L78:
        r93.setEmpty();
        r33.mo200c(r93);
        if (r83.isEmpty() == false) goto L81;
        r83.setEmpty();
        r33.mo200c(r83);
        goto L113
    L81:
        int r53 = Gravity.getAbsoluteGravity(r114.f4071h, r62);
        if ((r53 & 48) != 48) goto L87;
        int r103 = (r83.top - ((ViewGroup.MarginLayoutParams) r114).topMargin) - r114.f4073j;
        int r115 = r73.top;
        if (r103 >= r115) goto L87;
        m1167u(r2, r115 - r103);
        boolean r104 = true;
    L89:
        if ((r53 & 80) != 80) goto L93;
        int r122 = ((getHeight() - r83.bottom) - ((ViewGroup.MarginLayoutParams) r114).bottomMargin) + r114.f4073j;
        int r132 = r73.bottom;
        if (r122 >= r132) goto L93;
        m1167u(r2, r122 - r132);
        r104 = true;
    L93:
        if (r104 == true) goto L96;
        int r105 = 0;
        m1167u(r2, 0);
    L98:
        if ((r53 & 3) != 3) goto L103;
        int r133 = (r83.left - ((ViewGroup.MarginLayoutParams) r114).leftMargin) - r114.f4072i;
        int r143 = r73.left;
        if (r133 >= r143) goto L103;
        m1166t(r2, r143 - r133);
        int r134 = 1;
    L105:
        if ((r53 & 5) != 5) goto L109;
        int r54 = ((getWidth() - r83.right) - ((ViewGroup.MarginLayoutParams) r114).rightMargin) + r114.f4072i;
        int r116 = r73.right;
        if (r54 >= r116) goto L109;
        m1166t(r2, r54 - r116);
        r134 = 1;
    L109:
        if (r134 != 0) goto L111;
        m1166t(r2, r105);
    L111:
        r83.setEmpty();
        r33.mo200c(r83);
    L103:
        r134 = r105;
        goto L105
    L96:
        r105 = 0;
    L87:
        r104 = false;
        goto L89
    L71:
        if (r52.mo1881a(r2) == false) goto L77;
        if (r93.contains(r83) == true) goto L78;
        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + r83.toShortString() + " | Bounds:" + r93.toShortString());
    L113:
        int r55 = r26;
        if (r55 == 2) goto L120;
        Rect r84 = r222;
        r84.set(((C1061d) r2.getLayoutParams()).f4079p);
        if (r84.equals(r42) == false) goto L118;
        int r117 = r172;
        ArrayList r135 = r182;
    L128:
        r15 = r117;
        r9 = r212 + 1;
        r12 = r42;
        r1 = r55;
        r11 = r84;
        r14 = r135;
        r13 = r73;
        r72 = r62;
        goto L3
    L118:
        ((C1061d) r2.getLayoutParams()).f4079p.set(r42);
    L121:
        int r25 = r212 + 1;
        r117 = r172;
    L122:
        r135 = r182;
        if (r25 >= r117) goto L128;
        View r34 = (View) r135.get(r25);
        AbstractC1058a r153 = ((C1061d) r34.getLayoutParams()).f4064a;
        if (r153 == null) goto L127;
        r153.mo1826b(r34);
    L127:
        r25 = r25 + 1;
        r182 = r135;
        goto L122
    L120:
        r84 = r222;
        goto L121
    L40:
        if (r42.isEmpty() == true) goto L55;
        r62 = r192;
        int r56 = Gravity.getAbsoluteGravity(r202.f4070g, r62);
        int r74 = r56 & 112;
        if (r74 != 48) goto L44;
        r73 = r242;
        r73.top = Math.max(r73.top, r42.bottom);
    L48:
        int r57 = r56 & 7;
        if (r57 != 3) goto L51;
        r73.left = Math.max(r73.left, r42.right);
        goto L57
    L51:
        if (r57 != 5) goto L57;
        r73.right = Math.max(r73.right, getWidth() - r42.left);
        goto L57
    L44:
        if (r74 == 80) goto L46;
        r73 = r242;
        goto L48
    L46:
        r73 = r242;
        r73.bottom = Math.max(r73.bottom, getHeight() - r42.top);
        goto L48
    L8:
        if (r2.getVisibility() != 8) goto L11;
        r55 = r1;
        r62 = r72;
        r212 = r9;
        r84 = r11;
        r42 = r12;
        r73 = r13;
        r135 = r14;
        r117 = r15;
        goto L128
    L129:
        Rect r85 = r11;
        Rect r43 = r12;
        Rect r75 = r13;
        r75.setEmpty();
        r8.mo200c(r75);
        r43.setEmpty();
        r8.mo200c(r43);
        r85.setEmpty();
        r8.mo200c(r85);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1177s(false);
        if (this.f1290m == false) goto L9;
        if (this.f1289l != null) goto L7;
        this.f1289l = new ViewTreeObserverOnPreDrawListenerC1062e(this);
    L7:
        getViewTreeObserver().addOnPreDrawListener(this.f1289l);
    L9:
        if (this.f1291n != null) goto L13;
        Field r02 = AbstractC0080Q.f219a;
        if (getFitsSystemWindows() == false) goto L13;
        AbstractC0068E.m210c(this);
    L13:
        this.f1285h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1177s(false);
        if (this.f1290m == true) goto L5;
    L7:
        View r1 = this.f1288k;
        if (r1 == null) goto L10;
        mo423d(r1, 0);
    L10:
        this.f1285h = false;
        return;
    L5:
        if (this.f1289l == null) goto L7;
        getViewTreeObserver().removeOnPreDrawListener(this.f1289l);
        goto L7
    }

    @Override // android.view.View
    public final void onDraw(Canvas r5) {
        super.onDraw(r5);
        if (this.f1292o == true) goto L5;
        return;
    L5:
        if (this.f1293p == null) goto L14;
        C0122q0 r02 = this.f1291n;
        if (r02 == null) goto L9;
        int r03 = r02.m430a();
    L10:
        if (r03 <= 0) goto L15;
        this.f1293p.setBounds(0, 0, getWidth(), r03);
        this.f1293p.draw(r5);
        return;
    L15:
        return;
    L9:
        r03 = 0;
        goto L10
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r4) {
        int r02 = r4.getActionMasked();
        if (r02 != 0) goto L5;
        m1177s(true);
    L5:
        boolean r42 = m1175q(r4, 0);
        if (r02 != 1) goto L8;
    L9:
        m1177s(true);
    L10:
        return r42;
    L8:
        if (r02 != 3) goto L10;
        goto L9
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        Field r32 = AbstractC0080Q.f219a;
        int r33 = getLayoutDirection();
        ArrayList r42 = this.f1278a;
        int r52 = r42.size();
        int r62 = 0;
    L3:
        if (r62 >= r52) goto L13;
        View r72 = (View) r42.get(r62);
        if (r72.getVisibility() == 8) goto L12;
        AbstractC1058a r02 = ((C1061d) r72.getLayoutParams()).f4064a;
        if (r02 != null) goto L10;
    L11:
        m1174p(r72, r33);
        goto L12
    L10:
        if (r02.mo1816g(this, r72, r33) == false) goto L11;
    L12:
        r62 = r62 + 1;
        goto L3
    }

    @Override // android.view.View
    public final void onMeasure(int r31, int r32) {
        m1176r();
        int r02 = getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L13;
        View r2 = getChildAt(r1);
        C0966k r3 = (C0966k) this.f1279b.f1045b;
        int r4 = r3.f3432c;
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L12;
        ArrayList r9 = (ArrayList) r3.m2324j(r5);
        if (r9 == null) goto L11;
        if (r9.contains(r2) == false) goto L11;
        boolean r03 = true;
    L15:
        if (r03 == this.f1290m) goto L30;
        if (r03 == false) goto L25;
        if (this.f1285h == true) goto L20;
    L23:
        this.f1290m = true;
        goto L30
    L20:
        if (this.f1289l != null) goto L22;
        this.f1289l = new ViewTreeObserverOnPreDrawListenerC1062e(this);
    L22:
        getViewTreeObserver().addOnPreDrawListener(this.f1289l);
        goto L23
    L25:
        if (this.f1285h == true) goto L27;
    L29:
        this.f1290m = false;
        goto L30
    L27:
        if (this.f1289l == null) goto L29;
        getViewTreeObserver().removeOnPreDrawListener(this.f1289l);
    L30:
        int r92 = getPaddingLeft();
        int r04 = getPaddingTop();
        int r10 = getPaddingRight();
        int r12 = getPaddingBottom();
        Field r22 = AbstractC0080Q.f219a;
        int r11 = getLayoutDirection();
        if (r11 != 1) goto L33;
        boolean r122 = true;
    L34:
        int r13 = View.MeasureSpec.getMode(r31);
        int r14 = View.MeasureSpec.getSize(r31);
        int r15 = View.MeasureSpec.getMode(r32);
        int r16 = View.MeasureSpec.getSize(r32);
        int r17 = r92 + r10;
        int r18 = r04 + r12;
        int r05 = getSuggestedMinimumWidth();
        int r19 = getSuggestedMinimumHeight();
        if (this.f1291n != null) goto L37;
    L39:
        boolean r192 = false;
    L40:
        ArrayList r52 = this.f1278a;
        int r42 = r52.size();
        int r33 = r05;
        int r23 = r19;
        int r06 = 0;
        int r110 = 0;
    L41:
        if (r110 >= r42) goto L93;
        View r20 = (View) r52.get(r110);
        if (r20.getVisibility() != 8) goto L46;
        int r222 = r110;
        int r27 = r42;
        ArrayList r28 = r52;
        int r232 = r92;
        int r25 = r10;
        int r26 = r11;
    L92:
        r110 = r222 + 1;
        r92 = r232;
        r10 = r25;
        r11 = r26;
        r42 = r27;
        r52 = r28;
        goto L41
    L46:
        C1061d r7 = (C1061d) r20.getLayoutParams();
        int r8 = r7.f4068e;
        if (r8 < 0) goto L77;
        if (r13 == 0) goto L77;
        int r223 = r06;
        int[] r07 = this.f1286i;
        if (r07 != null) goto L53;
        toString();
        int r233 = r110;
    L52:
        int r08 = 0;
    L60:
        int r111 = r7.f4066c;
        if (r111 != 0) goto L63;
        r111 = 8388661;
    L63:
        int r112 = Gravity.getAbsoluteGravity(r111, r11) & 7;
        if (r112 != 3) goto L67;
        if (r122 == true) goto L67;
    L69:
        int r21 = Math.max(0, (r14 - r10) - r08);
    L79:
        if (r192 == true) goto L81;
    L83:
        int r82 = r31;
        int r24 = r32;
    L84:
        AbstractC1058a r09 = r7.f4064a;
        if (r09 == null) goto L89;
        int r113 = r223;
        r222 = r233;
        r232 = r92;
        int r93 = r113;
        r25 = r10;
        int r102 = r23;
        r26 = r11;
        int r114 = r33;
        r27 = r42;
        r28 = r52;
        if (r09.mo1817h(this, r20, r82, r21, r24) == false) goto L90;
    L91:
        int r010 = Math.max(r114, ((r20.getMeasuredWidth() + r17) + ((ViewGroup.MarginLayoutParams) r7).leftMargin) + ((ViewGroup.MarginLayoutParams) r7).rightMargin);
        int r115 = Math.max(r102, ((r20.getMeasuredHeight() + r18) + ((ViewGroup.MarginLayoutParams) r7).topMargin) + ((ViewGroup.MarginLayoutParams) r7).bottomMargin);
        r33 = r010;
        r06 = View.combineMeasuredStates(r93, r20.getMeasuredState());
        r23 = r115;
    L90:
        measureChildWithMargins(r20, r82, r21, r24, 0);
        goto L91
    L89:
        r27 = r42;
        r28 = r52;
        r25 = r10;
        r26 = r11;
        r102 = r23;
        r114 = r33;
        int r29 = r233;
        r232 = r92;
        r93 = r223;
        r222 = r29;
        goto L90
    L81:
        if (r20.getFitsSystemWindows() == true) goto L83;
        int r116 = this.f1291n.f309a.mo382j().f4251c + this.f1291n.f309a.mo382j().f4249a;
        int r83 = this.f1291n.f309a.mo382j().f4252d + this.f1291n.m430a();
        int r011 = View.MeasureSpec.makeMeasureSpec(r14 - r116, r13);
        int r117 = View.MeasureSpec.makeMeasureSpec(r16 - r83, r15);
        r82 = r011;
        r24 = r117;
    L67:
        if (r112 != 5) goto L70;
        if (r122 == true) goto L69;
    L70:
        if (r112 != 5) goto L73;
        if (r122 == true) goto L73;
    L75:
        r21 = Math.max(0, r08 - r92);
    L73:
        if (r112 != 3) goto L78;
        if (r122 == true) goto L75;
    L78:
        r21 = 0;
        goto L79
    L53:
        r233 = r110;
        if (r8 >= 0) goto L56;
    L59:
        toString();
        goto L52
    L56:
        if (r8 >= r07.length) goto L59;
        r08 = r07[r8];
    L77:
        r223 = r06;
        r233 = r110;
        goto L78
    L93:
        int r94 = r06;
        setMeasuredDimension(View.resolveSizeAndState(r33, r31, (-16777216) & r94), View.resolveSizeAndState(r23, r32, r94 << 16));
        return;
    L37:
        if (getFitsSystemWindows() == false) goto L39;
        r192 = true;
        goto L40
    L33:
        r122 = false;
    L11:
        r5 = r5 + 1;
        goto L5
    L12:
        r1 = r1 + 1;
        goto L3
    L13:
        r03 = false;
        goto L15
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View r3, float r4, float r5, boolean r6) {
        int r32 = getChildCount();
        int r52 = 0;
    L3:
        if (r52 >= r32) goto L12;
        View r62 = getChildAt(r52);
        if (r62.getVisibility() == 8) goto L11;
        C1061d r63 = (C1061d) r62.getLayoutParams();
        if (r63.m2535a(0) == false) goto L11;
        AbstractC1058a r64 = r63.f4064a;
    L11:
        r52 = r52 + 1;
        goto L3
    L12:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View r6, float r7, float r8) {
        int r72 = getChildCount();
        int r02 = 0;
        boolean r1 = false;
    L3:
        if (r02 >= r72) goto L14;
        View r2 = getChildAt(r02);
        if (r2.getVisibility() == 8) goto L13;
        C1061d r22 = (C1061d) r2.getLayoutParams();
        if (r22.m2535a(0) == false) goto L13;
        AbstractC1058a r23 = r22.f4064a;
        if (r23 == null) goto L13;
        r1 = r1 | r23.mo1845i(r6);
    L13:
        r02 = r02 + 1;
        goto L3
    L14:
        return r1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r7, int r8, int r9, int[] r10) {
        mo424e(r7, r8, r9, r10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r8, int r9, int r10, int r11, int r12) {
        mo422c(r8, r9, r10, r11, r12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r2, View r3, int r4) {
        mo421a(r2, r3, r4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r7) {
        if ((r7 instanceof C1063f) == true) goto L6;
        super.onRestoreInstanceState(r7);
        return;
    L6:
        C1063f r72 = (C1063f) r7;
        super.onRestoreInstanceState(r72.f481a);
        SparseArray r73 = r72.f4081c;
        int r02 = getChildCount();
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L15;
        View r2 = getChildAt(r1);
        int r3 = r2.getId();
        AbstractC1058a r4 = m1165m(r2).f4064a;
        if (r3 == (-1)) goto L14;
        if (r4 == null) goto L14;
        Parcelable r32 = (Parcelable) r73.get(r3);
        if (r32 == null) goto L14;
        r4.mo1820m(r2, r32);
    L14:
        r1 = r1 + 1;
        goto L7
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1063f r02 = new C1063f(super.onSaveInstanceState());
        SparseArray r1 = new SparseArray();
        int r2 = getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        View r4 = getChildAt(r3);
        int r5 = r4.getId();
        AbstractC1058a r6 = ((C1061d) r4.getLayoutParams()).f4064a;
        if (r5 == (-1)) goto L10;
        if (r6 == null) goto L10;
        Parcelable r42 = r6.mo1821n(r4);
        if (r42 == null) goto L10;
        r1.append(r5, r42);
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        r02.f4081c = r1;
        return r02;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r2, View r3, int r4) {
        return mo425f(r2, r3, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r2) {
        mo423d(r2, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r18) {
        int r2 = r18.getActionMasked();
        if (this.f1287j != null) goto L8;
        boolean r3 = m1175q(r18, 1);
        if (r3 == true) goto L9;
    L7:
        boolean r6 = false;
    L12:
        MotionEvent r8 = null;
        if (this.f1287j != null) goto L15;
        r6 = r6 | super.onTouchEvent(r18);
    L17:
        if (r8 == null) goto L19;
        r8.recycle();
    L19:
        if (r2 != 1) goto L21;
    L22:
        m1177s(false);
    L23:
        return r6;
    L21:
        if (r2 != 3) goto L23;
    L15:
        if (r3 == false) goto L17;
        long r11 = SystemClock.uptimeMillis();
        r8 = MotionEvent.obtain(r11, r11, 3, 0.0f, 0.0f, 0);
        super.onTouchEvent(r8);
    L9:
        AbstractC1058a r62 = ((C1061d) this.f1287j.getLayoutParams()).f4064a;
        if (r62 == null) goto L7;
        r6 = r62.mo1824q(this.f1287j, r18);
        goto L12
    L8:
        r3 = false;
        goto L9
    }

    /* JADX INFO: renamed from: p */
    public final void m1174p(View r13, int r14) {
        C1061d r02 = (C1061d) r13.getLayoutParams();
        View r1 = r02.f4074k;
        if (r1 == null) goto L5;
    L9:
        C0062c r2 = f1277x;
        if (r1 == null) goto L17;
        Rect r03 = m1163g();
        Rect r9 = m1163g();
        m1171k(r1, r03);     // Catch: Throwable -> L14
        C1061d r12 = (C1061d) r13.getLayoutParams();     // Catch: Throwable -> L14
        int r10 = r13.getMeasuredWidth();     // Catch: Throwable -> L14
        int r11 = r13.getMeasuredHeight();     // Catch: Throwable -> L14
        m1164l(r14, r03, r9, r12, r10, r11);     // Catch: Throwable -> L14
        m1168h(r12, r9, r10, r11);     // Catch: Throwable -> L14
        r13.layout(r9.left, r9.top, r9.right, r9.bottom);     // Catch: Throwable -> L14
        r03.setEmpty();
        r2.mo200c(r03);
        r9.setEmpty();
        r2.mo200c(r9);
        return;
    L14:
        th = move-exception;
        r03.setEmpty();
        r2.mo200c(r03);
        r9.setEmpty();
        r2.mo200c(r9);
        throw th;
    L17:
        int r04 = r02.f4068e;
        if (r04 < 0) goto L50;
        C1061d r15 = (C1061d) r13.getLayoutParams();
        int r22 = r15.f4066c;
        if (r22 != 0) goto L22;
        r22 = 8388661;
    L22:
        int r23 = Gravity.getAbsoluteGravity(r22, r14);
        int r3 = r23 & 7;
        int r24 = r23 & 112;
        int r4 = getWidth();
        int r5 = getHeight();
        int r6 = r13.getMeasuredWidth();
        int r7 = r13.getMeasuredHeight();
        if (r14 != 1) goto L25;
        r04 = r4 - r04;
    L25:
        int[] r142 = this.f1286i;
        int r92 = 0;
        if (r142 != null) goto L29;
        toString();
    L28:
        int r143 = 0;
    L35:
        int r144 = r143 - r6;
        if (r3 != 1) goto L38;
        r144 = r144 + (r6 / 2);
    L43:
        if (r24 != 16) goto L45;
        r92 = r7 / 2;
    L49:
        int r145 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r15).leftMargin, Math.min(r144, ((r4 - getPaddingRight()) - r6) - ((ViewGroup.MarginLayoutParams) r15).rightMargin));
        int r05 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r15).topMargin, Math.min(r92, ((r5 - getPaddingBottom()) - r7) - ((ViewGroup.MarginLayoutParams) r15).bottomMargin));
        r13.layout(r145, r05, r6 + r145, r7 + r05);
        return;
    L45:
        if (r24 != 80) goto L49;
        r92 = r7;
        goto L49
    L38:
        if (r3 != 5) goto L43;
        r144 = r144 + r6;
        goto L43
    L29:
        if (r04 >= 0) goto L31;
    L34:
        toString();
        goto L28
    L31:
        if (r04 >= r142.length) goto L34;
        r143 = r142[r04];
        goto L35
    L50:
        C1061d r06 = (C1061d) r13.getLayoutParams();
        Rect r16 = m1163g();
        r16.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r06).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) r06).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) r06).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) r06).bottomMargin);
        if (this.f1291n == null) goto L57;
        Field r32 = AbstractC0080Q.f219a;
        if (getFitsSystemWindows() == false) goto L57;
        if (r13.getFitsSystemWindows() == true) goto L57;
        r16.left = this.f1291n.f309a.mo382j().f4249a + r16.left;
        r16.top = this.f1291n.m430a() + r16.top;
        r16.right -= this.f1291n.f309a.mo382j().f4251c;
        r16.bottom -= this.f1291n.f309a.mo382j().f4252d;
    L57:
        Rect r93 = m1163g();
        int r07 = r06.f4066c;
        if ((r07 & 7) != 0) goto L61;
        r07 = r07 | 8388611;
    L61:
        if ((r07 & 112) != 0) goto L63;
        r07 = r07 | 48;
    L63:
        Gravity.apply(r07, r13.getMeasuredWidth(), r13.getMeasuredHeight(), r16, r93, r14);
        r13.layout(r93.left, r93.top, r93.right, r93.bottom);
        r16.setEmpty();
        r2.mo200c(r16);
        r93.setEmpty();
        r2.mo200c(r93);
        return;
    L5:
        if (r02.f4069f == (-1)) goto L9;
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1175q(MotionEvent r24, int r25) {
        int r3 = r24.getActionMasked();
        ArrayList r4 = this.f1280c;
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
        C0375k r52 = f1276w;
        if (r52 == null) goto L11;
        Collections.sort(r4, r52);
    L11:
        int r53 = r4.size();
        MotionEvent r72 = null;
        int r82 = 0;
        boolean r9 = false;
        boolean r10 = false;
    L12:
        if (r82 >= r53) goto L49;
        View r11 = (View) r4.get(r82);
        C1061d r12 = (C1061d) r11.getLayoutParams();
        AbstractC1058a r13 = r12.f4064a;
        if (r9 == true) goto L16;
        if (r10 == true) goto L16;
    L25:
        if (r9 == true) goto L35;
        if (r13 == null) goto L35;
        if (r25 == 0) goto L31;
        if (r25 != 1) goto L32;
        r9 = r13.mo1824q(r11, r24);
    L32:
        if (r9 == false) goto L35;
        this.f1287j = r11;
        goto L35
    L31:
        r9 = r13.mo1815f(this, r11, r24);
    L35:
        if (r12.f4064a != null) goto L37;
        r12.f4076m = false;
    L37:
        boolean r102 = r12.f4076m;
        if (r102 == false) goto L40;
        boolean r112 = true;
    L41:
        if (r112 == false) goto L44;
        if (r102 == true) goto L44;
        r10 = true;
    L45:
        if (r112 == false) goto L48;
        if (r10 == false) goto L49;
    L48:
        r82 = r82 + 1;
    L44:
        r10 = false;
        goto L45
    L40:
        r12.f4076m = r102;
        r112 = r102;
    L16:
        if (r3 == 0) goto L25;
        if (r13 == null) goto L48;
        if (r72 != null) goto L20;
        long r17 = SystemClock.uptimeMillis();
        r72 = MotionEvent.obtain(r17, r17, 3, 0.0f, 0.0f, 0);
    L20:
        if (r25 == 0) goto L24;
        if (r25 != 1) goto L48;
        r13.mo1824q(r11, r72);
        goto L48
    L24:
        r13.mo1815f(this, r11, r72);
    L49:
        r4.clear();
        return r9;
    }

    /* JADX INFO: renamed from: r */
    public final void m1176r() {
        ArrayList r02 = this.f1278a;
        r02.clear();
        C0463v r1 = this.f1279b;
        C0966k r2 = (C0966k) r1.f1045b;
        int r3 = r2.f3432c;
        int r4 = 0;
        int r5 = 0;
    L3:
        C0061b r6 = (C0061b) r1.f1044a;
        if (r5 >= r3) goto L9;
        ArrayList r7 = (ArrayList) r2.m2324j(r5);
        if (r7 == null) goto L8;
        r7.clear();
        r6.mo200c(r7);
    L8:
        r5 = r5 + 1;
        goto L3
    L9:
        r2.clear();
        int r22 = getChildCount();
        int r32 = 0;
    L10:
        C0966k r52 = (C0966k) r1.f1045b;
        if (r32 >= r22) goto L95;
        View r72 = getChildAt(r32);
        C1061d r8 = m1165m(r72);
        int r9 = r8.f4069f;
        if (r9 != (-1)) goto L15;
        r8.f4075l = null;
        r8.f4074k = null;
    L57:
        if (r52.containsKey(r72) == true) goto L59;
        r52.put(r72, null);
    L59:
        int r92 = 0;
    L60:
        if (r92 >= r22) goto L92;
        if (r92 == r32) goto L89;
        View r11 = getChildAt(r92);
        if (r11 == r8.f4075l) goto L74;
        Field r12 = AbstractC0080Q.f219a;
        int r122 = getLayoutDirection();
        int r13 = Gravity.getAbsoluteGravity(((C1061d) r11.getLayoutParams()).f4070g, r122);
        if (r13 != 0) goto L68;
    L70:
        AbstractC1058a r112 = r8.f4064a;
        if (r112 == null) goto L89;
        r112.mo1826b(r72);
        goto L89
    L68:
        if ((Gravity.getAbsoluteGravity(r8.f4071h, r122) & r13) != r13) goto L70;
    L74:
        if (r52.containsKey(r11) == true) goto L79;
        if (r52.containsKey(r11) == true) goto L79;
        r52.put(r11, null);
    L79:
        if (r52.containsKey(r11) == false) goto L91;
        if (r52.containsKey(r72) == false) goto L91;
        ArrayList r123 = (ArrayList) r52.getOrDefault(r11, null);
        if (r123 != null) goto L88;
        r123 = (ArrayList) r6.mo198a();
        if (r123 != null) goto L87;
        r123 = new ArrayList();
    L87:
        r52.put(r11, r123);
    L88:
        r123.add(r72);
    L91:
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    L89:
        r92 = r92 + 1;
        goto L60
    L92:
        r32 = r32 + 1;
        goto L10
    L15:
        View r113 = r8.f4074k;
        if (r113 != null) goto L18;
    L31:
        View r114 = findViewById(r9);
        r8.f4074k = r114;
        if (r114 == null) goto L54;
        if (r114 == this) goto L35;
        ViewParent r93 = r114.getParent();
    L40:
        if (r93 == this) goto L52;
        if (r93 == null) goto L52;
        if (r93 == r72) goto L44;
        if ((r93 instanceof View) == false) goto L51;
        r114 = r93;
    L51:
        r93 = r93.getParent();
        goto L40
    L44:
        if (isInEditMode() == false) goto L47;
        r8.f4075l = null;
        r8.f4074k = null;
        goto L57
    L47:
        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
    L52:
        r8.f4075l = r114;
        goto L57
    L35:
        if (isInEditMode() == false) goto L38;
        r8.f4075l = null;
        r8.f4074k = null;
        goto L57
    L38:
        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
    L54:
        if (isInEditMode() == false) goto L94;
        r8.f4075l = null;
        r8.f4074k = null;
        goto L57
    L94:
        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(r9) + " to anchor view " + r72);
    L18:
        if (r113.getId() != r9) goto L31;
        View r115 = r8.f4074k;
        ViewParent r124 = r115.getParent();
    L21:
        if (r124 == this) goto L30;
        if (r124 == null) goto L29;
        if (r124 == r72) goto L29;
        if ((r124 instanceof View) == false) goto L28;
        r115 = r124;
    L28:
        r124 = r124.getParent();
    L29:
        r8.f4075l = null;
        r8.f4074k = null;
        goto L31
    L30:
        r8.f4075l = r115;
        goto L57
    L95:
        ArrayList r23 = (ArrayList) r1.f1046c;
        r23.clear();
        HashSet r33 = (HashSet) r1.f1047d;
        r33.clear();
        int r62 = r52.f3432c;
    L96:
        if (r4 >= r62) goto L98;
        r1.m1092a(r52.m2322h(r4), r23, r33);
        r4 = r4 + 1;
        goto L96
    L98:
        r02.addAll(r23);
        Collections.reverse(r02);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r2, Rect r3, boolean r4) {
        AbstractC1058a r02 = ((C1061d) r2.getLayoutParams()).f4064a;
        if (r02 == null) goto L6;
        r02.mo1828l(this, r2);
    L6:
        return super.requestChildRectangleOnScreen(r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r1) {
        super.requestDisallowInterceptTouchEvent(r1);
        if (r1 == true) goto L5;
        return;
    L5:
        if (this.f1284g == true) goto L9;
        m1177s(false);
        this.f1284g = true;
        return;
    }

    /* JADX INFO: renamed from: s */
    public final void m1177s(boolean r14) {
        int r02 = getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L12;
        View r3 = getChildAt(r2);
        AbstractC1058a r4 = ((C1061d) r3.getLayoutParams()).f4064a;
        if (r4 == null) goto L11;
        long r7 = SystemClock.uptimeMillis();
        MotionEvent r5 = MotionEvent.obtain(r7, r7, 3, 0.0f, 0.0f, 0);
        if (r14 == false) goto L9;
        r4.mo1815f(this, r3, r5);
    L10:
        r5.recycle();
        goto L11
    L9:
        r4.mo1824q(r3, r5);
    L11:
        r2 = r2 + 1;
        goto L3
    L12:
        int r142 = 0;
    L13:
        if (r142 >= r02) goto L15;
        ((C1061d) getChildAt(r142).getLayoutParams()).f4076m = false;
        r142 = r142 + 1;
        goto L13
    L15:
        this.f1287j = null;
        this.f1284g = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
        super.setFitsSystemWindows(r1);
        m1178v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener r1) {
        this.f1294q = r1;
    }

    public void setStatusBarBackground(Drawable r3) {
        Drawable r02 = this.f1293p;
        if (r02 == r3) goto L21;
        Drawable r1 = null;
        if (r02 == null) goto L7;
        r02.setCallback(null);
    L7:
        if (r3 == null) goto L9;
        r1 = r3.mutate();
    L9:
        this.f1293p = r1;
        if (r1 != null) goto L12;
    L19:
        Field r32 = AbstractC0080Q.f219a;
        postInvalidateOnAnimation();
        return;
    L12:
        if (r1.isStateful() == false) goto L14;
        this.f1293p.setState(getDrawableState());
    L14:
        Drawable r33 = this.f1293p;
        Field r03 = AbstractC0080Q.f219a;
        AbstractC1112b.m2629b(r33, getLayoutDirection());
        Drawable r34 = this.f1293p;
        if (getVisibility() != 0) goto L17;
        boolean r04 = true;
    L18:
        r34.setVisible(r04, false);
        this.f1293p.setCallback(this);
        goto L19
    L17:
        r04 = false;
        goto L18
    }

    public void setStatusBarBackgroundColor(int r2) {
        setStatusBarBackground(new ColorDrawable(r2));
    }

    public void setStatusBarBackgroundResource(int r2) {
        if (r2 == 0) goto L4;
        Drawable r22 = AbstractC1080a.m2560b(getContext(), r2);
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
        Drawable r1 = this.f1293p;
        if (r1 != null) goto L9;
        return;
    L9:
        if (r1.isVisible() == r32) goto L13;
        this.f1293p.setVisible(r32, false);
        return;
    L13:
        return;
    L5:
        r32 = false;
        goto L6
    }

    /* JADX INFO: renamed from: v */
    public final void m1178v() {
        Field r02 = AbstractC0080Q.f219a;
        if (getFitsSystemWindows() == true) goto L5;
        AbstractC0070G.m231u(this, null);
        return;
    L5:
        if (this.f1295r != null) goto L7;
        this.f1295r = new C0095d(22, this);
    L7:
        AbstractC0070G.m231u(this, this.f1295r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
    L8:
        return true;
    L5:
        if (r2 == this.f1293p) goto L8;
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C1061d) == false) goto L6;
        return new C1061d((C1061d) r2);
    L6:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L9;
        return new C1061d((ViewGroup.MarginLayoutParams) r2);
    L9:
        return new C1061d(r2);
    }
}
