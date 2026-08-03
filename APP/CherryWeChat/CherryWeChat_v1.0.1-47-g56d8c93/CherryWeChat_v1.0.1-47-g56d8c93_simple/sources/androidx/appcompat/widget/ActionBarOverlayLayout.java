package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import io.github.cherrywechat.R;
import java.util.WeakHashMap;
import p000.AbstractC1255cE;
import p000.AbstractC1360eE;
import p000.AbstractC1406fG;
import p000.AbstractC2185lE;
import p000.AbstractC2796zF;
import p000.C0130D0;
import p000.C0316HE;
import p000.C0317HF;
import p000.C0422Js;
import p000.C0489LF;
import p000.C2229mF;
import p000.C2354pB;
import p000.C2437r0;
import p000.C2566u0;
import p000.C2581uF;
import p000.C2609v0;
import p000.C2624vF;
import p000.C2663wB;
import p000.C2667wF;
import p000.C2710xF;
import p000.C2753yF;
import p000.C2765yl;
import p000.InterfaceC0120Cr;
import p000.InterfaceC0336Hs;
import p000.InterfaceC0379Is;
import p000.InterfaceC0449Kc;
import p000.InterfaceC0492Lc;
import p000.InterfaceC2523t0;
import p000.MenuC2204lr;
import p000.RunnableC2480s0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0449Kc, InterfaceC0336Hs, InterfaceC0379Is {

    /* JADX INFO: renamed from: C */
    public static final int[] f3745C = null;

    /* JADX INFO: renamed from: D */
    public static final C0489LF f3746D = null;

    /* JADX INFO: renamed from: E */
    public static final Rect f3747E = null;

    /* JADX INFO: renamed from: A */
    public final C0422Js f3748A;

    /* JADX INFO: renamed from: B */
    public final C2609v0 f3749B;

    /* JADX INFO: renamed from: a */
    public int f3750a;

    /* JADX INFO: renamed from: b */
    public int f3751b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f3752c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f3753d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0492Lc f3754e;

    /* JADX INFO: renamed from: f */
    public Drawable f3755f;

    /* JADX INFO: renamed from: g */
    public boolean f3756g;

    /* JADX INFO: renamed from: h */
    public boolean f3757h;

    /* JADX INFO: renamed from: i */
    public boolean f3758i;

    /* JADX INFO: renamed from: j */
    public boolean f3759j;

    /* JADX INFO: renamed from: k */
    public int f3760k;

    /* JADX INFO: renamed from: l */
    public int f3761l;

    /* JADX INFO: renamed from: m */
    public final Rect f3762m;

    /* JADX INFO: renamed from: n */
    public final Rect f3763n;

    /* JADX INFO: renamed from: o */
    public final Rect f3764o;

    /* JADX INFO: renamed from: p */
    public final Rect f3765p;

    /* JADX INFO: renamed from: q */
    public C0489LF f3766q;

    /* JADX INFO: renamed from: r */
    public C0489LF f3767r;

    /* JADX INFO: renamed from: s */
    public C0489LF f3768s;

    /* JADX INFO: renamed from: t */
    public C0489LF f3769t;

    /* JADX INFO: renamed from: u */
    public InterfaceC2523t0 f3770u;

    /* JADX INFO: renamed from: v */
    public OverScroller f3771v;

    /* JADX INFO: renamed from: w */
    public ViewPropertyAnimator f3772w;

    /* JADX INFO: renamed from: x */
    public final C2437r0 f3773x;

    /* JADX INFO: renamed from: y */
    public final RunnableC2480s0 f3774y;

    /* JADX INFO: renamed from: z */
    public final RunnableC2480s0 f3775z;

    static {
        f3745C = new int[]{R.attr.actionBarSize, android.R.attr.windowContentOverlay};
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 34) goto L6;
        AbstractC2796zF r02 = new C2753yF();
    L15:
        r02.mo5086g(C2765yl.m5337b(0, 1, 0, 1));
        f3746D = r02.mo5084b();
        f3747E = new Rect();
        return;
    L6:
        if (r0 < 31) goto L9;
        r02 = new C2710xF();
        goto L15
    L9:
        if (r0 < 30) goto L12;
        r02 = new C2667wF();
        goto L15
    L12:
        if (r0 < 29) goto L14;
        r02 = new C2624vF();
        goto L15
    L14:
        r02 = new C2581uF();
        goto L15
    }

    public ActionBarOverlayLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f3751b = 0;
        this.f3762m = new Rect();
        this.f3763n = new Rect();
        this.f3764o = new Rect();
        this.f3765p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0489LF r32 = C0489LF.f1601b;
        this.f3766q = r32;
        this.f3767r = r32;
        this.f3768s = r32;
        this.f3769t = r32;
        this.f3773x = new C2437r0(0, this);
        this.f3774y = new RunnableC2480s0(this, 0);
        this.f3775z = new RunnableC2480s0(this, 1);
        m2086i(r2);
        this.f3748A = new C0422Js();
        C2609v0 r33 = new C2609v0(r2);
        r33.setWillNotDraw(true);
        this.f3749B = r33;
        addView(r33);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2084g(View r4, Rect r5, boolean r6) {
        C2566u0 r42 = (C2566u0) r4.getLayoutParams();
        int r0 = ((ViewGroup.MarginLayoutParams) r42).leftMargin;
        int r1 = r5.left;
        if (r0 == r1) goto L5;
        ((ViewGroup.MarginLayoutParams) r42).leftMargin = r1;
        boolean r02 = true;
    L6:
        int r12 = ((ViewGroup.MarginLayoutParams) r42).topMargin;
        int r3 = r5.top;
        if (r12 == r3) goto L9;
        ((ViewGroup.MarginLayoutParams) r42).topMargin = r3;
        r02 = true;
    L9:
        int r13 = ((ViewGroup.MarginLayoutParams) r42).rightMargin;
        int r32 = r5.right;
        if (r13 == r32) goto L12;
        ((ViewGroup.MarginLayoutParams) r42).rightMargin = r32;
        r02 = true;
    L12:
        if (r6 == false) goto L17;
        int r62 = ((ViewGroup.MarginLayoutParams) r42).bottomMargin;
        int r52 = r5.bottom;
        if (r62 == r52) goto L17;
        ((ViewGroup.MarginLayoutParams) r42).bottomMargin = r52;
        return true;
    L17:
        return r02;
    L5:
        r02 = false;
        goto L6
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: a */
    public final void mo720a(View r1, View r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        onNestedScrollAccepted(r1, r2, r3);
        return;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: b */
    public final void mo721b(View r1, int r2) {
        if (r2 != 0) goto L5;
        onStopNestedScroll(r1);
        return;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: c */
    public final void mo722c(View r1, int r2, int r3, int[] r4, int r5) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C2566u0;
    }

    @Override // p000.InterfaceC0379Is
    /* JADX INFO: renamed from: d */
    public final void mo820d(View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        mo723e(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.view.View
    public final void draw(Canvas r6) {
        super.draw(r6);
        if (this.f3755f != null) goto L5;
        return;
    L5:
        if (this.f3753d.getVisibility() != 0) goto L7;
        int r0 = (int) ((this.f3753d.getTranslationY() + this.f3753d.getBottom()) + 0.5f);
    L8:
        this.f3755f.setBounds(0, r0, getWidth(), this.f3755f.getIntrinsicHeight() + r0);
        this.f3755f.draw(r6);
        return;
    L7:
        r0 = 0;
        goto L8
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: e */
    public final void mo723e(View r1, int r2, int r3, int r4, int r5, int r6) {
        if (r6 != 0) goto L5;
        onNestedScroll(r1, r2, r3, r4, r5);
        return;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: f */
    public final boolean mo724f(View r1, View r2, int r3, int r4) {
        if (r4 == 0) goto L4;
        return false;
    L4:
        if (onStartNestedScroll(r1, r2, r3) == false) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect r1) {
        return super.fitSystemWindows(r1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2566u0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new C2566u0(getContext(), r3);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer r0 = this.f3753d;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return -((int) r0.getTranslationY());
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0422Js r0 = this.f3748A;
        int r1 = r0.f1403a;
        return r0.f1404b | r1;
    }

    public CharSequence getTitle() {
        m2088k();
        return ((C2663wB) this.f3754e).f9213a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m2085h() {
        removeCallbacks(this.f3774y);
        removeCallbacks(this.f3775z);
        ViewPropertyAnimator r0 = this.f3772w;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    /* JADX INFO: renamed from: i */
    public final void m2086i(Context r5) {
        TypedArray r0 = getContext().getTheme().obtainStyledAttributes(f3745C);
        boolean r1 = false;
        this.f3750a = r0.getDimensionPixelSize(0, 0);
        Drawable r3 = r0.getDrawable(1);
        this.f3755f = r3;
        if (r3 != null) goto L5;
        r1 = true;
    L5:
        setWillNotDraw(r1);
        r0.recycle();
        this.f3771v = new OverScroller(r5);
    }

    /* JADX INFO: renamed from: j */
    public final void m2087j(int r2) {
        m2088k();
        if (r2 != 2) goto L5;
        this.f3754e.getClass();
        return;
    L5:
        if (r2 != 5) goto L7;
        this.f3754e.getClass();
        return;
    L7:
        if (r2 == 109) goto L9;
        return;
    L9:
        setOverlayMode(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m2088k() {
        if (this.f3752c != null) goto L14;
        this.f3752c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
        this.f3753d = (ActionBarContainer) findViewById(R.id.action_bar_container);
        KeyEvent.Callback r0 = findViewById(R.id.action_bar);
        if ((r0 instanceof InterfaceC0492Lc) == false) goto L8;
        InterfaceC0492Lc r02 = (InterfaceC0492Lc) r0;
    L10:
        this.f3754e = r02;
        return;
    L8:
        if ((r0 instanceof Toolbar) == false) goto L13;
        r02 = ((Toolbar) r0).getWrapper();
        goto L10
    L13:
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(r0.getClass().getSimpleName()));
    }

    /* JADX INFO: renamed from: l */
    public final void m2089l(Menu r5, InterfaceC0120Cr r6) {
        m2088k();
        C2663wB r0 = (C2663wB) this.f3754e;
        Toolbar r1 = r0.f9213a;
        if (r0.f9225m != null) goto L5;
        r0.f9225m = new C0130D0(r1.getContext());
    L5:
        C0130D0 r02 = r0.f9225m;
        r02.f306e = r6;
        MenuC2204lr r52 = (MenuC2204lr) r5;
        if (r52 == null) goto L8;
    L10:
        r1.m2106f();
        MenuC2204lr r62 = r1.f3823a.f3777p;
        if (r62 != r52) goto L13;
        return;
    L13:
        if (r62 == null) goto L16;
        r62.m4437r(r1.f3814L);
        r62.m4437r(r1.f3815M);
    L16:
        if (r1.f3815M != null) goto L18;
        r1.f3815M = new C2354pB(r1);
    L18:
        r02.f318q = true;
        if (r52 == null) goto L21;
        r52.m4429b(r02, r1.f3832j);
        r52.m4429b(r1.f3815M, r1.f3832j);
    L22:
        r1.f3823a.setPopupTheme(r1.f3833k);
        r1.f3823a.setPresenter(r02);
        r1.f3814L = r02;
        r1.m2118v();
        return;
    L21:
        r02.mo220i(r1.f3832j, null);
        r1.f3815M.mo220i(r1.f3832j, null);
        r02.mo218g();
        r1.f3815M.mo218g();
        goto L22
    L8:
        if (r1.f3823a != null) goto L10;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets r7) {
        m2088k();
        C0489LF r72 = C0489LF.m939h(this, r7);
        boolean r0 = m2084g(this.f3753d, new Rect(r72.m941b(), r72.m943d(), r72.m942c(), r72.m940a()), false);
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        Rect r12 = this.f3762m;
        AbstractC1360eE.m2630b(this, r72, r12);
        int r2 = r12.left;
        int r3 = r12.top;
        int r4 = r12.right;
        int r5 = r12.bottom;
        C0317HF r73 = r72.f1602a;
        C0489LF r22 = r73.mo16m(r2, r3, r4, r5);
        this.f3766q = r22;
        boolean r32 = true;
        if (this.f3767r.equals(r22) == true) goto L5;
        this.f3767r = this.f3766q;
        r0 = true;
    L5:
        Rect r23 = this.f3763n;
        if (r23.equals(r12) == true) goto L8;
        r23.set(r12);
    L9:
        if (r32 == false) goto L12;
        requestLayout();
    L12:
        return r73.mo149a().f1602a.mo92c().f1602a.mo91b().m945g();
    L8:
        r32 = r0;
        goto L9
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        m2086i(getContext());
        WeakHashMap r12 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2085h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        int r52 = getChildCount();
        int r62 = getPaddingLeft();
        int r72 = getPaddingTop();
        int r82 = 0;
    L3:
        if (r82 >= r52) goto L8;
        View r92 = getChildAt(r82);
        if (r92.getVisibility() == 8) goto L7;
        C2566u0 r0 = (C2566u0) r92.getLayoutParams();
        int r1 = r92.getMeasuredWidth();
        int r2 = r92.getMeasuredHeight();
        int r3 = ((ViewGroup.MarginLayoutParams) r0).leftMargin + r62;
        int r02 = ((ViewGroup.MarginLayoutParams) r0).topMargin + r72;
        r92.layout(r3, r02, r1 + r3, r2 + r02);
    L7:
        r82 = r82 + 1;
        goto L3
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
        m2088k();
        measureChildWithMargins(this.f3753d, r13, 0, r14, 0);
        C2566u0 r132 = (C2566u0) this.f3753d.getLayoutParams();
        int r142 = Math.max(0, (this.f3753d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r132).leftMargin) + ((ViewGroup.MarginLayoutParams) r132).rightMargin);
        int r133 = Math.max(0, (this.f3753d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r132).topMargin) + ((ViewGroup.MarginLayoutParams) r132).bottomMargin);
        int r3 = View.combineMeasuredStates(0, this.f3753d.getMeasuredState());
        WeakHashMap r5 = AbstractC2185lE.f7617a;
        if ((getWindowSystemUiVisibility() & 256) == 0) goto L5;
        boolean r52 = true;
    L6:
        if (r52 == false) goto L13;
        int r7 = this.f3750a;
        if (this.f3757h == true) goto L10;
    L16:
        Rect r8 = this.f3762m;
        Rect r9 = this.f3764o;
        r9.set(r8);
        this.f3768s = this.f3766q;
        if (this.f3756g == true) goto L22;
        if (r52 == true) goto L22;
        C2609v0 r53 = this.f3749B;
        C0489LF r82 = f3746D;
        Rect r10 = this.f3765p;
        AbstractC1360eE.m2630b(r53, r82, r10);
        if (r10.equals(f3747E) == true) goto L22;
        r9.top += r7;
        r9.bottom = r9.bottom;
        this.f3768s = this.f3768s.f1602a.mo16m(0, r7, 0, 0);
    L36:
        m2084g(this.f3752c, r9, true);
        if (this.f3769t.equals(this.f3768s) == true) goto L39;
        C0489LF r1 = this.f3768s;
        this.f3769t = r1;
        AbstractC2185lE.m4389b(this.f3752c, r1);
    L39:
        measureChildWithMargins(this.f3752c, r13, 0, r14, 0);
        C2566u0 r12 = (C2566u0) this.f3752c.getLayoutParams();
        int r143 = Math.max(r142, (this.f3752c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r12).leftMargin) + ((ViewGroup.MarginLayoutParams) r12).rightMargin);
        int r134 = Math.max(r133, (this.f3752c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r12).topMargin) + ((ViewGroup.MarginLayoutParams) r12).bottomMargin);
        int r15 = View.combineMeasuredStates(r3, this.f3752c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max((getPaddingRight() + getPaddingLeft()) + r143, getSuggestedMinimumWidth()), r13, r15), View.resolveSizeAndState(Math.max((getPaddingBottom() + getPaddingTop()) + r134, getSuggestedMinimumHeight()), r14, r15 << 16));
        return;
    L22:
        C2765yl r16 = C2765yl.m5337b(this.f3768s.m941b(), this.f3768s.m943d() + r7, this.f3768s.m942c(), this.f3768s.m940a());
        C0489LF r54 = this.f3768s;
        int r72 = Build.VERSION.SDK_INT;
        if (r72 < 34) goto L26;
        AbstractC2796zF r73 = new C2753yF(r54);
    L35:
        r73.mo5086g(r16);
        this.f3768s = r73.mo5084b();
        goto L36
    L26:
        if (r72 < 31) goto L29;
        r73 = new C2710xF(r54);
        goto L35
    L29:
        if (r72 < 30) goto L32;
        r73 = new C2667wF(r54);
        goto L35
    L32:
        if (r72 < 29) goto L34;
        r73 = new C2624vF(r54);
        goto L35
    L34:
        r73 = new C2581uF(r54);
        goto L35
    L10:
        if (this.f3753d.getTabContainer() == null) goto L16;
        r7 = r7 + this.f3750a;
        goto L16
    L13:
        if (this.f3753d.getVisibility() == 8) goto L15;
        r7 = this.f3753d.getMeasuredHeight();
        goto L16
    L15:
        r7 = 0;
        goto L16
    L5:
        r52 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View r10, float r11, float r12, boolean r13) {
        if (this.f3758i == false) goto L12;
        if (r13 == false) goto L14;
        this.f3771v.fling(0, 0, 0, (int) r12, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3771v.getFinalY() <= this.f3753d.getHeight()) goto L9;
        m2085h();
        this.f3775z.run();
    L10:
        this.f3759j = true;
        return true;
    L9:
        m2085h();
        this.f3774y.run();
        goto L10
    L14:
        return false;
    L12:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View r1, float r2, float r3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r1, int r2, int r3, int[] r4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r1, int r2, int r3, int r4, int r5) {
        int r12 = this.f3760k + r3;
        this.f3760k = r12;
        setActionBarHideOffset(r12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r1, View r2, int r3) {
        this.f3748A.f1403a = r3;
        this.f3760k = getActionBarHideOffset();
        m2085h();
        InterfaceC2523t0 r12 = this.f3770u;
        if (r12 == null) goto L8;
        C2229mF r13 = (C2229mF) r12;
        C0316HE r22 = r13.f7791t;
        if (r22 == null) goto L9;
        r22.m668a();
        r13.f7791t = null;
        return;
    L9:
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r1, View r2, int r3) {
        if ((r3 & 2) != 0) goto L5;
        return false;
    L5:
        if (this.f3753d.getVisibility() == 0) goto L8;
        return false;
    L8:
        return this.f3758i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r4) {
        if (this.f3758i == true) goto L5;
        return;
    L5:
        if (this.f3759j == false) goto L7;
        return;
    L7:
        if (this.f3760k > this.f3753d.getHeight()) goto L9;
        m2085h();
        postDelayed(this.f3774y, 600);
        return;
    L9:
        m2085h();
        postDelayed(this.f3775z, 600);
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r7) {
        super.onWindowSystemUiVisibilityChanged(r7);
        m2088k();
        int r0 = this.f3761l ^ r7;
        this.f3761l = r7;
        if ((r7 & 4) != 0) goto L5;
        boolean r1 = true;
    L7:
        if ((r7 & 256) == 0) goto L9;
        boolean r72 = true;
    L10:
        InterfaceC2523t0 r4 = this.f3770u;
        if (r4 == null) goto L23;
        C2229mF r42 = (C2229mF) r4;
        r42.f7786o = !r72;
        if (r1 == true) goto L20;
        if (r72 == false) goto L20;
        if (r42.f7788q == true) goto L23;
        r42.f7788q = true;
        r42.m4516t(true);
    L20:
        if (r42.f7788q == false) goto L23;
        r42.f7788q = false;
        r42.m4516t(true);
    L23:
        if ((r0 & 256) != 0) goto L25;
        return;
    L25:
        if (this.f3770u == null) goto L29;
        WeakHashMap r73 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(this);
        return;
    L29:
        return;
    L9:
        r72 = false;
        goto L10
    L5:
        r1 = false;
        goto L7
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r2) {
        super.onWindowVisibilityChanged(r2);
        this.f3751b = r2;
        InterfaceC2523t0 r0 = this.f3770u;
        if (r0 == null) goto L6;
        ((C2229mF) r0).f7785n = r2;
        return;
    }

    public void setActionBarHideOffset(int r3) {
        m2085h();
        int r32 = Math.max(0, Math.min(r3, this.f3753d.getHeight()));
        this.f3753d.setTranslationY(-r32);
    }

    public void setActionBarVisibilityCallback(InterfaceC2523t0 r2) {
        this.f3770u = r2;
        if (getWindowToken() == null) goto L8;
        InterfaceC2523t0 r22 = this.f3770u;
        ((C2229mF) r22).f7785n = this.f3751b;
        int r23 = this.f3761l;
        if (r23 == 0) goto L9;
        onWindowSystemUiVisibilityChanged(r23);
        WeakHashMap r24 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(this);
        return;
    L9:
        return;
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
        this.f3757h = r1;
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
        if (r2 == this.f3758i) goto L8;
        this.f3758i = r2;
        if (r2 == true) goto L9;
        m2085h();
        setActionBarHideOffset(0);
        return;
    L9:
        return;
    }

    public void setIcon(int r3) {
        m2088k();
        C2663wB r0 = (C2663wB) this.f3754e;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC1406fG.m2695U(r0.f9213a.getContext(), r3);
    L6:
        r0.f9216d = r32;
        r0.m5230c();
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setLogo(int r3) {
        m2088k();
        C2663wB r0 = (C2663wB) this.f3754e;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC1406fG.m2695U(r0.f9213a.getContext(), r3);
    L6:
        r0.f9217e = r32;
        r0.m5230c();
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setOverlayMode(boolean r1) {
        this.f3756g = r1;
    }

    public void setShowingForActionMode(boolean r1) {
    }

    public void setUiOptions(int r1) {
    }

    @Override // p000.InterfaceC0449Kc
    public void setWindowCallback(Window.Callback r2) {
        m2088k();
        ((C2663wB) this.f3754e).f9223k = r2;
    }

    @Override // p000.InterfaceC0449Kc
    public void setWindowTitle(CharSequence r4) {
        m2088k();
        C2663wB r0 = (C2663wB) this.f3754e;
        if (r0.f9219g == true) goto L10;
        Toolbar r1 = r0.f9213a;
        r0.f9220h = r4;
        if ((r0.f9214b & 8) == 0) goto L11;
        r1.setTitle(r4);
        if (r0.f9219g == false) goto L12;
        AbstractC2185lE.m4400m(r1.getRootView(), r4);
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r2) {
        return new C2566u0(r2);
    }

    public void setIcon(Drawable r2) {
        m2088k();
        C2663wB r0 = (C2663wB) this.f3754e;
        r0.f9216d = r2;
        r0.m5230c();
    }
}
