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
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.AbstractC0222ff;
import p000.C0052b1;
import p000.C0195ep;
import p000.C0358j1;
import p000.C0463lw;
import p000.C0913y0;
import p000.InterfaceC0002a1;
import p000.InterfaceC0128cv;
import p000.InterfaceC0259gf;
import p000.InterfaceC0296hf;
import p000.InterfaceC0389jw;
import p000.InterfaceC0426kw;
import p000.MenuC0424ku;
import p000.RunnableC0950z0;
import p000.f70;
import p000.ic0;
import p000.ja0;
import p000.k70;
import p000.kc0;
import p000.lc0;
import p000.mc0;
import p000.s90;
import p000.tc0;
import p000.w90;
import p000.wc0;
import p000.xa0;
import p000.y90;
import p000.yb0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0259gf, InterfaceC0389jw, InterfaceC0426kw {

    /* JADX INFO: renamed from: B */
    public static final int[] f253B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    public final C0463lw f254A;

    /* JADX INFO: renamed from: a */
    public int f255a;

    /* JADX INFO: renamed from: b */
    public int f256b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f257c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f258d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0296hf f259e;

    /* JADX INFO: renamed from: f */
    public Drawable f260f;

    /* JADX INFO: renamed from: g */
    public boolean f261g;

    /* JADX INFO: renamed from: h */
    public boolean f262h;

    /* JADX INFO: renamed from: i */
    public boolean f263i;

    /* JADX INFO: renamed from: j */
    public boolean f264j;

    /* JADX INFO: renamed from: k */
    public boolean f265k;

    /* JADX INFO: renamed from: l */
    public int f266l;

    /* JADX INFO: renamed from: m */
    public int f267m;

    /* JADX INFO: renamed from: n */
    public final Rect f268n;

    /* JADX INFO: renamed from: o */
    public final Rect f269o;

    /* JADX INFO: renamed from: p */
    public final Rect f270p;

    /* JADX INFO: renamed from: q */
    public wc0 f271q;

    /* JADX INFO: renamed from: r */
    public wc0 f272r;

    /* JADX INFO: renamed from: s */
    public wc0 f273s;

    /* JADX INFO: renamed from: t */
    public wc0 f274t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0002a1 f275u;

    /* JADX INFO: renamed from: v */
    public OverScroller f276v;

    /* JADX INFO: renamed from: w */
    public ViewPropertyAnimator f277w;

    /* JADX INFO: renamed from: x */
    public final C0913y0 f278x;

    /* JADX INFO: renamed from: y */
    public final RunnableC0950z0 f279y;

    /* JADX INFO: renamed from: z */
    public final RunnableC0950z0 f280z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f256b = 0;
        this.f268n = new Rect();
        this.f269o = new Rect();
        this.f270p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        wc0 wc0Var = wc0.f4954b;
        this.f271q = wc0Var;
        this.f272r = wc0Var;
        this.f273s = wc0Var;
        this.f274t = wc0Var;
        this.f278x = new C0913y0(0, this);
        this.f279y = new RunnableC0950z0(this, 0);
        this.f280z = new RunnableC0950z0(this, 1);
        m156i(context);
        this.f254A = new C0463lw();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m148g(View view, Rect rect, boolean z) {
        boolean z2;
        C0052b1 c0052b1 = (C0052b1) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0052b1).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0052b1).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0052b1).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0052b1).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0052b1).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0052b1).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0052b1).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0052b1).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: a */
    public final void mo149a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: b */
    public final void mo150b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0052b1;
    }

    @Override // p000.InterfaceC0426kw
    /* JADX INFO: renamed from: d */
    public final void mo152d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo153e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f260f == null || this.f261g) {
            return;
        }
        if (this.f258d.getVisibility() == 0) {
            translationY = (int) (this.f258d.getTranslationY() + this.f258d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f260f.setBounds(0, translationY, getWidth(), this.f260f.getIntrinsicHeight() + translationY);
        this.f260f.draw(canvas);
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: e */
    public final void mo153e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: f */
    public final boolean mo154f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0052b1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0052b1(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f258d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0463lw c0463lw = this.f254A;
        return c0463lw.f3118b | c0463lw.f3117a;
    }

    public CharSequence getTitle() {
        m158k();
        return ((k70) this.f259e).f2717a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m155h() {
        removeCallbacks(this.f279y);
        removeCallbacks(this.f280z);
        ViewPropertyAnimator viewPropertyAnimator = this.f277w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m156i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f253B);
        this.f255a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f260f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f261g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f276v = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m157j(int i) {
        m158k();
        if (i == 2) {
            ((k70) this.f259e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((k70) this.f259e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m158k() {
        InterfaceC0296hf wrapper;
        if (this.f257c == null) {
            this.f257c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f258d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0296hf) {
                wrapper = (InterfaceC0296hf) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f259e = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m159l(Menu menu, InterfaceC0128cv interfaceC0128cv) {
        m158k();
        k70 k70Var = (k70) this.f259e;
        Toolbar toolbar = k70Var.f2717a;
        if (k70Var.f2729m == null) {
            k70Var.f2729m = new C0358j1(toolbar.getContext());
        }
        C0358j1 c0358j1 = k70Var.f2729m;
        c0358j1.f2520e = interfaceC0128cv;
        MenuC0424ku menuC0424ku = (MenuC0424ku) menu;
        if (menuC0424ku == null && toolbar.f366a == null) {
            return;
        }
        toolbar.m191f();
        MenuC0424ku menuC0424ku2 = toolbar.f366a.f281p;
        if (menuC0424ku2 == menuC0424ku) {
            return;
        }
        if (menuC0424ku2 != null) {
            menuC0424ku2.m1725r(toolbar.f359K);
            menuC0424ku2.m1725r(toolbar.f360L);
        }
        if (toolbar.f360L == null) {
            toolbar.f360L = new f70(toolbar);
        }
        c0358j1.f2532q = true;
        if (menuC0424ku != null) {
            menuC0424ku.m1717b(c0358j1, toolbar.f375j);
            menuC0424ku.m1717b(toolbar.f360L, toolbar.f375j);
        } else {
            c0358j1.mo955i(toolbar.f375j, null);
            toolbar.f360L.mo955i(toolbar.f375j, null);
            c0358j1.mo954h();
            toolbar.f360L.mo954h();
        }
        toolbar.f366a.setPopupTheme(toolbar.f376k);
        toolbar.f366a.setPresenter(c0358j1);
        toolbar.f359K = c0358j1;
        toolbar.m202u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m158k();
        wc0 wc0VarM2563g = wc0.m2563g(this, windowInsets);
        boolean zM148g = m148g(this.f258d, new Rect(wc0VarM2563g.m2565b(), wc0VarM2563g.m2567d(), wc0VarM2563g.m2566c(), wc0VarM2563g.m2564a()), false);
        WeakHashMap weakHashMap = ja0.f2600a;
        Rect rect = this.f268n;
        y90.m2656b(this, wc0VarM2563g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        tc0 tc0Var = wc0VarM2563g.f4955a;
        wc0 wc0VarMo1934l = tc0Var.mo1934l(i, i2, i3, i4);
        this.f271q = wc0VarMo1934l;
        boolean z = true;
        if (!this.f272r.equals(wc0VarMo1934l)) {
            this.f272r = this.f271q;
            zM148g = true;
        }
        Rect rect2 = this.f269o;
        if (rect2.equals(rect)) {
            z = zM148g;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return tc0Var.mo2169a().f4955a.mo2013c().f4955a.mo2012b().m2568f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m156i(getContext());
        WeakHashMap weakHashMap = ja0.f2600a;
        w90.m2552c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m155h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0052b1 c0052b1 = (C0052b1) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0052b1).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0052b1).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m158k();
        measureChildWithMargins(this.f258d, i, 0, i2, 0);
        C0052b1 c0052b1 = (C0052b1) this.f258d.getLayoutParams();
        int iMax = Math.max(0, this.f258d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0052b1).leftMargin + ((ViewGroup.MarginLayoutParams) c0052b1).rightMargin);
        int iMax2 = Math.max(0, this.f258d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0052b1).topMargin + ((ViewGroup.MarginLayoutParams) c0052b1).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f258d.getMeasuredState());
        WeakHashMap weakHashMap = ja0.f2600a;
        boolean z = (s90.m2315g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f255a;
            if (this.f263i && this.f258d.getTabContainer() != null) {
                measuredHeight += this.f255a;
            }
        } else {
            measuredHeight = this.f258d.getVisibility() != 8 ? this.f258d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f268n;
        Rect rect2 = this.f270p;
        rect2.set(rect);
        wc0 wc0Var = this.f271q;
        this.f273s = wc0Var;
        if (this.f262h || z) {
            C0195ep c0195epM1050b = C0195ep.m1050b(wc0Var.m2565b(), this.f273s.m2567d() + measuredHeight, this.f273s.m2566c(), this.f273s.m2564a());
            wc0 wc0Var2 = this.f273s;
            int i3 = Build.VERSION.SDK_INT;
            mc0 lc0Var = i3 >= 30 ? new lc0(wc0Var2) : i3 >= 29 ? new kc0(wc0Var2) : new ic0(wc0Var2);
            lc0Var.mo1435g(c0195epM1050b);
            this.f273s = lc0Var.mo1433b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f273s = wc0Var.f4955a.mo1934l(0, measuredHeight, 0, 0);
        }
        m148g(this.f257c, rect2, true);
        if (!this.f274t.equals(this.f273s)) {
            wc0 wc0Var3 = this.f273s;
            this.f274t = wc0Var3;
            ContentFrameLayout contentFrameLayout = this.f257c;
            WindowInsets windowInsetsM2568f = wc0Var3.m2568f();
            if (windowInsetsM2568f != null) {
                WindowInsets windowInsetsM2550a = w90.m2550a(contentFrameLayout, windowInsetsM2568f);
                if (!windowInsetsM2550a.equals(windowInsetsM2568f)) {
                    wc0.m2563g(contentFrameLayout, windowInsetsM2550a);
                }
            }
        }
        measureChildWithMargins(this.f257c, i, 0, i2, 0);
        C0052b1 c0052b12 = (C0052b1) this.f257c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f257c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0052b12).leftMargin + ((ViewGroup.MarginLayoutParams) c0052b12).rightMargin);
        int iMax4 = Math.max(iMax2, this.f257c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0052b12).topMargin + ((ViewGroup.MarginLayoutParams) c0052b12).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f257c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f264j || !z) {
            return false;
        }
        this.f276v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f276v.getFinalY() > this.f258d.getHeight()) {
            m155h();
            this.f280z.run();
        } else {
            m155h();
            this.f279y.run();
        }
        this.f265k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f266l + i2;
        this.f266l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        yb0 yb0Var;
        xa0 xa0Var;
        this.f254A.f3117a = i;
        this.f266l = getActionBarHideOffset();
        m155h();
        InterfaceC0002a1 interfaceC0002a1 = this.f275u;
        if (interfaceC0002a1 == null || (xa0Var = (yb0Var = (yb0) interfaceC0002a1).f5321O) == null) {
            return;
        }
        xa0Var.m2617a();
        yb0Var.f5321O = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f258d.getVisibility() != 0) {
            return false;
        }
        return this.f264j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f264j || this.f265k) {
            return;
        }
        if (this.f266l <= this.f258d.getHeight()) {
            m155h();
            postDelayed(this.f279y, 600L);
        } else {
            m155h();
            postDelayed(this.f280z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m158k();
        int i2 = this.f267m ^ i;
        this.f267m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0002a1 interfaceC0002a1 = this.f275u;
        if (interfaceC0002a1 != null) {
            yb0 yb0Var = (yb0) interfaceC0002a1;
            yb0Var.f5317K = !z2;
            if (z || !z2) {
                if (yb0Var.f5318L) {
                    yb0Var.f5318L = false;
                    yb0Var.m2686P(true);
                }
            } else if (!yb0Var.f5318L) {
                yb0Var.f5318L = true;
                yb0Var.m2686P(true);
            }
        }
        if ((i2 & 256) == 0 || this.f275u == null) {
            return;
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        w90.m2552c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f256b = i;
        InterfaceC0002a1 interfaceC0002a1 = this.f275u;
        if (interfaceC0002a1 != null) {
            ((yb0) interfaceC0002a1).f5316J = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m155h();
        this.f258d.setTranslationY(-Math.max(0, Math.min(i, this.f258d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0002a1 interfaceC0002a1) {
        this.f275u = interfaceC0002a1;
        if (getWindowToken() != null) {
            ((yb0) this.f275u).f5316J = this.f256b;
            int i = this.f267m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = ja0.f2600a;
                w90.m2552c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f263i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f264j) {
            this.f264j = z;
            if (z) {
                return;
            }
            m155h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m158k();
        k70 k70Var = (k70) this.f259e;
        k70Var.f2720d = i != 0 ? AbstractC0222ff.m1196r(k70Var.f2717a.getContext(), i) : null;
        k70Var.m1642c();
    }

    public void setLogo(int i) {
        m158k();
        k70 k70Var = (k70) this.f259e;
        k70Var.f2721e = i != 0 ? AbstractC0222ff.m1196r(k70Var.f2717a.getContext(), i) : null;
        k70Var.m1642c();
    }

    public void setOverlayMode(boolean z) {
        this.f262h = z;
        this.f261g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // p000.InterfaceC0259gf
    public void setWindowCallback(Window.Callback callback) {
        m158k();
        ((k70) this.f259e).f2727k = callback;
    }

    @Override // p000.InterfaceC0259gf
    public void setWindowTitle(CharSequence charSequence) {
        m158k();
        k70 k70Var = (k70) this.f259e;
        if (k70Var.f2723g) {
            return;
        }
        Toolbar toolbar = k70Var.f2717a;
        k70Var.f2724h = charSequence;
        if ((k70Var.f2718b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k70Var.f2723g) {
                ja0.m1576m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0052b1(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m158k();
        k70 k70Var = (k70) this.f259e;
        k70Var.f2720d = drawable;
        k70Var.m1642c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: c */
    public final void mo151c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
