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
    public static final int[] f3745C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: D */
    public static final C0489LF f3746D;

    /* JADX INFO: renamed from: E */
    public static final Rect f3747E;

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
        int i = Build.VERSION.SDK_INT;
        AbstractC2796zF c2753yF = i >= 34 ? new C2753yF() : i >= 31 ? new C2710xF() : i >= 30 ? new C2667wF() : i >= 29 ? new C2624vF() : new C2581uF();
        c2753yF.mo5086g(C2765yl.m5337b(0, 1, 0, 1));
        f3746D = c2753yF.mo5084b();
        f3747E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3751b = 0;
        this.f3762m = new Rect();
        this.f3763n = new Rect();
        this.f3764o = new Rect();
        this.f3765p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0489LF c0489lf = C0489LF.f1601b;
        this.f3766q = c0489lf;
        this.f3767r = c0489lf;
        this.f3768s = c0489lf;
        this.f3769t = c0489lf;
        this.f3773x = new C2437r0(0, this);
        this.f3774y = new RunnableC2480s0(this, 0);
        this.f3775z = new RunnableC2480s0(this, 1);
        m2086i(context);
        this.f3748A = new C0422Js();
        C2609v0 c2609v0 = new C2609v0(context);
        c2609v0.setWillNotDraw(true);
        this.f3749B = c2609v0;
        addView(c2609v0);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2084g(View view, Rect rect, boolean z) {
        boolean z2;
        C2566u0 c2566u0 = (C2566u0) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c2566u0).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c2566u0).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c2566u0).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c2566u0).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c2566u0).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c2566u0).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c2566u0).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c2566u0).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: a */
    public final void mo720a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: b */
    public final void mo721b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: c */
    public final void mo722c(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2566u0;
    }

    @Override // p000.InterfaceC0379Is
    /* JADX INFO: renamed from: d */
    public final void mo820d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo723e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f3755f != null) {
            if (this.f3753d.getVisibility() == 0) {
                translationY = (int) (this.f3753d.getTranslationY() + this.f3753d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f3755f.setBounds(0, translationY, getWidth(), this.f3755f.getIntrinsicHeight() + translationY);
            this.f3755f.draw(canvas);
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: e */
    public final void mo723e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: f */
    public final boolean mo724f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2566u0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2566u0(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3753d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0422Js c0422Js = this.f3748A;
        return c0422Js.f1404b | c0422Js.f1403a;
    }

    public CharSequence getTitle() {
        m2088k();
        return ((C2663wB) this.f3754e).f9213a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m2085h() {
        removeCallbacks(this.f3774y);
        removeCallbacks(this.f3775z);
        ViewPropertyAnimator viewPropertyAnimator = this.f3772w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2086i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3745C);
        this.f3750a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f3755f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3771v = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m2087j(int i) {
        m2088k();
        if (i == 2) {
            this.f3754e.getClass();
        } else if (i == 5) {
            this.f3754e.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2088k() {
        InterfaceC0492Lc wrapper;
        if (this.f3752c == null) {
            this.f3752c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3753d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0492Lc) {
                wrapper = (InterfaceC0492Lc) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f3754e = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2089l(Menu menu, InterfaceC0120Cr interfaceC0120Cr) {
        m2088k();
        C2663wB c2663wB = (C2663wB) this.f3754e;
        Toolbar toolbar = c2663wB.f9213a;
        if (c2663wB.f9225m == null) {
            c2663wB.f9225m = new C0130D0(toolbar.getContext());
        }
        C0130D0 c0130d0 = c2663wB.f9225m;
        c0130d0.f306e = interfaceC0120Cr;
        MenuC2204lr menuC2204lr = (MenuC2204lr) menu;
        if (menuC2204lr == null && toolbar.f3823a == null) {
            return;
        }
        toolbar.m2106f();
        MenuC2204lr menuC2204lr2 = toolbar.f3823a.f3777p;
        if (menuC2204lr2 == menuC2204lr) {
            return;
        }
        if (menuC2204lr2 != null) {
            menuC2204lr2.m4437r(toolbar.f3814L);
            menuC2204lr2.m4437r(toolbar.f3815M);
        }
        if (toolbar.f3815M == null) {
            toolbar.f3815M = new C2354pB(toolbar);
        }
        c0130d0.f318q = true;
        if (menuC2204lr != null) {
            menuC2204lr.m4429b(c0130d0, toolbar.f3832j);
            menuC2204lr.m4429b(toolbar.f3815M, toolbar.f3832j);
        } else {
            c0130d0.mo220i(toolbar.f3832j, null);
            toolbar.f3815M.mo220i(toolbar.f3832j, null);
            c0130d0.mo218g();
            toolbar.f3815M.mo218g();
        }
        toolbar.f3823a.setPopupTheme(toolbar.f3833k);
        toolbar.f3823a.setPresenter(c0130d0);
        toolbar.f3814L = c0130d0;
        toolbar.m2118v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m2088k();
        C0489LF c0489lfM939h = C0489LF.m939h(this, windowInsets);
        boolean zM2084g = m2084g(this.f3753d, new Rect(c0489lfM939h.m941b(), c0489lfM939h.m943d(), c0489lfM939h.m942c(), c0489lfM939h.m940a()), false);
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        Rect rect = this.f3762m;
        AbstractC1360eE.m2630b(this, c0489lfM939h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C0317HF c0317hf = c0489lfM939h.f1602a;
        C0489LF c0489lfMo16m = c0317hf.mo16m(i, i2, i3, i4);
        this.f3766q = c0489lfMo16m;
        boolean z = true;
        if (!this.f3767r.equals(c0489lfMo16m)) {
            this.f3767r = this.f3766q;
            zM2084g = true;
        }
        Rect rect2 = this.f3763n;
        if (rect2.equals(rect)) {
            z = zM2084g;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c0317hf.mo149a().f1602a.mo92c().f1602a.mo91b().m945g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2086i(getContext());
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2085h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C2566u0 c2566u0 = (C2566u0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c2566u0).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c2566u0).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m2088k();
        measureChildWithMargins(this.f3753d, i, 0, i2, 0);
        C2566u0 c2566u0 = (C2566u0) this.f3753d.getLayoutParams();
        int iMax = Math.max(0, this.f3753d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2566u0).leftMargin + ((ViewGroup.MarginLayoutParams) c2566u0).rightMargin);
        int iMax2 = Math.max(0, this.f3753d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2566u0).topMargin + ((ViewGroup.MarginLayoutParams) c2566u0).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3753d.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f3750a;
            if (this.f3757h && this.f3753d.getTabContainer() != null) {
                measuredHeight += this.f3750a;
            }
        } else {
            measuredHeight = this.f3753d.getVisibility() != 8 ? this.f3753d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3762m;
        Rect rect2 = this.f3764o;
        rect2.set(rect);
        this.f3768s = this.f3766q;
        if (this.f3756g || z) {
            C2765yl c2765ylM5337b = C2765yl.m5337b(this.f3768s.m941b(), this.f3768s.m943d() + measuredHeight, this.f3768s.m942c(), this.f3768s.m940a());
            C0489LF c0489lf = this.f3768s;
            int i3 = Build.VERSION.SDK_INT;
            AbstractC2796zF c2753yF = i3 >= 34 ? new C2753yF(c0489lf) : i3 >= 31 ? new C2710xF(c0489lf) : i3 >= 30 ? new C2667wF(c0489lf) : i3 >= 29 ? new C2624vF(c0489lf) : new C2581uF(c0489lf);
            c2753yF.mo5086g(c2765ylM5337b);
            this.f3768s = c2753yF.mo5084b();
        } else {
            C2609v0 c2609v0 = this.f3749B;
            C0489LF c0489lf2 = f3746D;
            Rect rect3 = this.f3765p;
            AbstractC1360eE.m2630b(c2609v0, c0489lf2, rect3);
            if (!rect3.equals(f3747E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f3768s = this.f3768s.f1602a.mo16m(0, measuredHeight, 0, 0);
            }
        }
        m2084g(this.f3752c, rect2, true);
        if (!this.f3769t.equals(this.f3768s)) {
            C0489LF c0489lf3 = this.f3768s;
            this.f3769t = c0489lf3;
            AbstractC2185lE.m4389b(this.f3752c, c0489lf3);
        }
        measureChildWithMargins(this.f3752c, i, 0, i2, 0);
        C2566u0 c2566u02 = (C2566u0) this.f3752c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3752c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2566u02).leftMargin + ((ViewGroup.MarginLayoutParams) c2566u02).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3752c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2566u02).topMargin + ((ViewGroup.MarginLayoutParams) c2566u02).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3752c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f3758i || !z) {
            return false;
        }
        this.f3771v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3771v.getFinalY() > this.f3753d.getHeight()) {
            m2085h();
            this.f3775z.run();
        } else {
            m2085h();
            this.f3774y.run();
        }
        this.f3759j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f3760k + i2;
        this.f3760k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C2229mF c2229mF;
        C0316HE c0316he;
        this.f3748A.f1403a = i;
        this.f3760k = getActionBarHideOffset();
        m2085h();
        InterfaceC2523t0 interfaceC2523t0 = this.f3770u;
        if (interfaceC2523t0 == null || (c0316he = (c2229mF = (C2229mF) interfaceC2523t0).f7791t) == null) {
            return;
        }
        c0316he.m668a();
        c2229mF.f7791t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f3753d.getVisibility() != 0) {
            return false;
        }
        return this.f3758i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3758i || this.f3759j) {
            return;
        }
        if (this.f3760k <= this.f3753d.getHeight()) {
            m2085h();
            postDelayed(this.f3774y, 600L);
        } else {
            m2085h();
            postDelayed(this.f3775z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m2088k();
        int i2 = this.f3761l ^ i;
        this.f3761l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC2523t0 interfaceC2523t0 = this.f3770u;
        if (interfaceC2523t0 != null) {
            C2229mF c2229mF = (C2229mF) interfaceC2523t0;
            c2229mF.f7786o = !z2;
            if (z || !z2) {
                if (c2229mF.f7788q) {
                    c2229mF.f7788q = false;
                    c2229mF.m4516t(true);
                }
            } else if (!c2229mF.f7788q) {
                c2229mF.f7788q = true;
                c2229mF.m4516t(true);
            }
        }
        if ((i2 & 256) == 0 || this.f3770u == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f3751b = i;
        InterfaceC2523t0 interfaceC2523t0 = this.f3770u;
        if (interfaceC2523t0 != null) {
            ((C2229mF) interfaceC2523t0).f7785n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m2085h();
        this.f3753d.setTranslationY(-Math.max(0, Math.min(i, this.f3753d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2523t0 interfaceC2523t0) {
        this.f3770u = interfaceC2523t0;
        if (getWindowToken() != null) {
            ((C2229mF) this.f3770u).f7785n = this.f3751b;
            int i = this.f3761l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                AbstractC1255cE.m2370c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f3757h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f3758i) {
            this.f3758i = z;
            if (z) {
                return;
            }
            m2085h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m2088k();
        C2663wB c2663wB = (C2663wB) this.f3754e;
        c2663wB.f9216d = i != 0 ? AbstractC1406fG.m2695U(c2663wB.f9213a.getContext(), i) : null;
        c2663wB.m5230c();
    }

    public void setLogo(int i) {
        m2088k();
        C2663wB c2663wB = (C2663wB) this.f3754e;
        c2663wB.f9217e = i != 0 ? AbstractC1406fG.m2695U(c2663wB.f9213a.getContext(), i) : null;
        c2663wB.m5230c();
    }

    public void setOverlayMode(boolean z) {
        this.f3756g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000.InterfaceC0449Kc
    public void setWindowCallback(Window.Callback callback) {
        m2088k();
        ((C2663wB) this.f3754e).f9223k = callback;
    }

    @Override // p000.InterfaceC0449Kc
    public void setWindowTitle(CharSequence charSequence) {
        m2088k();
        C2663wB c2663wB = (C2663wB) this.f3754e;
        if (c2663wB.f9219g) {
            return;
        }
        Toolbar toolbar = c2663wB.f9213a;
        c2663wB.f9220h = charSequence;
        if ((c2663wB.f9214b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c2663wB.f9219g) {
                AbstractC2185lE.m4400m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2566u0(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m2088k();
        C2663wB c2663wB = (C2663wB) this.f3754e;
        c2663wB.f9216d = drawable;
        c2663wB.m5230c();
    }
}
