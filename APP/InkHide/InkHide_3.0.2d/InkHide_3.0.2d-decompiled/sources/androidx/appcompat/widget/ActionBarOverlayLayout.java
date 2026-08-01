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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p052b1.AbstractC0503h;
import p061e.C0524E;
import p066g.C0571k;
import p068h.InterfaceC0606y;
import p068h.MenuC0594m;
import p069i.C0665c;
import p069i.C0674f;
import p069i.C0682h1;
import p069i.C0689k;
import p069i.C0697m1;
import p069i.InterfaceC0671e;
import p069i.InterfaceC0699n0;
import p069i.InterfaceC0702o0;
import p069i.RunnableC0668d;
import p085r.C0811c;
import p099y.AbstractC1038B;
import p099y.AbstractC1048L;
import p099y.AbstractC1060Y;
import p099y.AbstractC1094z;
import p099y.C1057V;
import p099y.C1058W;
import p099y.C1059X;
import p099y.C1073f0;
import p099y.C1075g0;
import p099y.C1083o;
import p099y.InterfaceC1081m;
import p099y.InterfaceC1082n;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0699n0, InterfaceC1081m, InterfaceC1082n {

    /* JADX INFO: renamed from: C */
    public static final int[] f974C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    public final RunnableC0668d f975A;

    /* JADX INFO: renamed from: B */
    public final C1083o f976B;

    /* JADX INFO: renamed from: b */
    public int f977b;

    /* JADX INFO: renamed from: c */
    public int f978c;

    /* JADX INFO: renamed from: d */
    public ContentFrameLayout f979d;

    /* JADX INFO: renamed from: e */
    public ActionBarContainer f980e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0702o0 f981f;

    /* JADX INFO: renamed from: g */
    public Drawable f982g;

    /* JADX INFO: renamed from: h */
    public boolean f983h;

    /* JADX INFO: renamed from: i */
    public boolean f984i;

    /* JADX INFO: renamed from: j */
    public boolean f985j;

    /* JADX INFO: renamed from: k */
    public boolean f986k;

    /* JADX INFO: renamed from: l */
    public boolean f987l;

    /* JADX INFO: renamed from: m */
    public int f988m;

    /* JADX INFO: renamed from: n */
    public int f989n;

    /* JADX INFO: renamed from: o */
    public final Rect f990o;

    /* JADX INFO: renamed from: p */
    public final Rect f991p;

    /* JADX INFO: renamed from: q */
    public final Rect f992q;

    /* JADX INFO: renamed from: r */
    public C1075g0 f993r;

    /* JADX INFO: renamed from: s */
    public C1075g0 f994s;

    /* JADX INFO: renamed from: t */
    public C1075g0 f995t;

    /* JADX INFO: renamed from: u */
    public C1075g0 f996u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0671e f997v;

    /* JADX INFO: renamed from: w */
    public OverScroller f998w;

    /* JADX INFO: renamed from: x */
    public ViewPropertyAnimator f999x;

    /* JADX INFO: renamed from: y */
    public final C0665c f1000y;

    /* JADX INFO: renamed from: z */
    public final RunnableC0668d f1001z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f978c = 0;
        this.f990o = new Rect();
        this.f991p = new Rect();
        this.f992q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C1075g0 c1075g0 = C1075g0.f3704b;
        this.f993r = c1075g0;
        this.f994s = c1075g0;
        this.f995t = c1075g0;
        this.f996u = c1075g0;
        this.f1000y = new C0665c(this);
        this.f1001z = new RunnableC0668d(this, 0);
        this.f975A = new RunnableC0668d(this, 1);
        m667i(context);
        this.f976B = new C1083o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m659g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0674f c0674f = (C0674f) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0674f).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0674f).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0674f).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0674f).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0674f).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0674f).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0674f).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0674f).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: b */
    public final void mo661b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: c */
    public final void mo662c(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0674f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1082n
    /* JADX INFO: renamed from: d */
    public final void mo663d(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        mo664e(nestedScrollView, i2, i3, i4, i5, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f982g == null || this.f983h) {
            return;
        }
        if (this.f980e.getVisibility() == 0) {
            translationY = (int) (this.f980e.getTranslationY() + this.f980e.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f982g.setBounds(0, translationY, getWidth(), this.f982g.getIntrinsicHeight() + translationY);
        this.f982g.draw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: e */
    public final void mo664e(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(nestedScrollView, i2, i3, i4, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: f */
    public final boolean mo665f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0674f(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0674f(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f980e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1083o c1083o = this.f976B;
        return c1083o.f3721b | c1083o.f3720a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getTitle() {
        m669k();
        return ((C0697m1) this.f981f).f2351a.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m666h() {
        removeCallbacks(this.f1001z);
        removeCallbacks(this.f975A);
        ViewPropertyAnimator viewPropertyAnimator = this.f999x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m667i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f974C);
        this.f977b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f982g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f983h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f998w = new OverScroller(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m668j(int i2) {
        m669k();
        if (i2 == 2) {
            ((C0697m1) this.f981f).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((C0697m1) this.f981f).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m669k() {
        InterfaceC0702o0 wrapper;
        if (this.f979d == null) {
            this.f979d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f980e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0702o0) {
                wrapper = (InterfaceC0702o0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f981f = wrapper;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m670l(MenuC0594m menuC0594m, InterfaceC0606y interfaceC0606y) {
        m669k();
        C0697m1 c0697m1 = (C0697m1) this.f981f;
        C0689k c0689k = c0697m1.f2363m;
        Toolbar toolbar = c0697m1.f2351a;
        if (c0689k == null) {
            c0697m1.f2363m = new C0689k(toolbar.getContext());
        }
        C0689k c0689k2 = c0697m1.f2363m;
        c0689k2.f2306f = interfaceC0606y;
        if (menuC0594m == null && toolbar.f1084b == null) {
            return;
        }
        toolbar.m704f();
        MenuC0594m menuC0594m2 = toolbar.f1084b.f1002q;
        if (menuC0594m2 == menuC0594m) {
            return;
        }
        if (menuC0594m2 != null) {
            menuC0594m2.m1191r(toolbar.f1080L);
            menuC0594m2.m1191r(toolbar.f1081M);
        }
        if (toolbar.f1081M == null) {
            toolbar.f1081M = new C0682h1(toolbar);
        }
        c0689k2.f2318r = true;
        if (menuC0594m != null) {
            menuC0594m.m1183b(c0689k2, toolbar.f1093k);
            menuC0594m.m1183b(toolbar.f1081M, toolbar.f1093k);
        } else {
            c0689k2.mo1178g(toolbar.f1093k, null);
            toolbar.f1081M.mo1178g(toolbar.f1093k, null);
            c0689k2.mo1148c();
            toolbar.f1081M.mo1148c();
        }
        toolbar.f1084b.setPopupTheme(toolbar.f1094l);
        toolbar.f1084b.setPresenter(c0689k2);
        toolbar.f1080L = c0689k2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m669k();
        C1075g0 c1075g0M2342c = C1075g0.m2342c(windowInsets, this);
        C1073f0 c1073f0 = c1075g0M2342c.f3705a;
        boolean zM659g = m659g(this.f980e, new Rect(c1073f0.mo2316g().f2712a, c1073f0.mo2316g().f2713b, c1073f0.mo2316g().f2714c, c1073f0.mo2316g().f2715d), false);
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        Rect rect = this.f990o;
        AbstractC1038B.m2227b(this, c1075g0M2342c, rect);
        C1075g0 c1075g0Mo2317h = c1073f0.mo2317h(rect.left, rect.top, rect.right, rect.bottom);
        this.f993r = c1075g0Mo2317h;
        boolean z2 = true;
        if (!this.f994s.equals(c1075g0Mo2317h)) {
            this.f994s = this.f993r;
            zM659g = true;
        }
        Rect rect2 = this.f991p;
        if (rect2.equals(rect)) {
            z2 = zM659g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c1073f0.mo2327a().f3705a.mo2323c().f3705a.mo2322b().m2343b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m667i(getContext());
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        AbstractC1094z.m2366c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m666h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0674f c0674f = (C0674f) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0674f).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0674f).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        m669k();
        measureChildWithMargins(this.f980e, i2, 0, i3, 0);
        C0674f c0674f = (C0674f) this.f980e.getLayoutParams();
        int iMax = Math.max(0, this.f980e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0674f).leftMargin + ((ViewGroup.MarginLayoutParams) c0674f).rightMargin);
        int iMax2 = Math.max(0, this.f980e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0674f).topMargin + ((ViewGroup.MarginLayoutParams) c0674f).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f980e.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f977b;
            if (this.f985j && this.f980e.getTabContainer() != null) {
                measuredHeight += this.f977b;
            }
        } else {
            measuredHeight = this.f980e.getVisibility() != 8 ? this.f980e.getMeasuredHeight() : 0;
        }
        Rect rect = this.f990o;
        Rect rect2 = this.f992q;
        rect2.set(rect);
        C1075g0 c1075g0 = this.f993r;
        this.f995t = c1075g0;
        if (this.f984i || z2) {
            C0811c c0811cM1479a = C0811c.m1479a(c1075g0.f3705a.mo2316g().f2712a, this.f995t.f3705a.mo2316g().f2713b + measuredHeight, this.f995t.f3705a.mo2316g().f2714c, this.f995t.f3705a.mo2316g().f2715d);
            C1075g0 c1075g02 = this.f995t;
            int i4 = Build.VERSION.SDK_INT;
            AbstractC1060Y c1059x = i4 >= 30 ? new C1059X(c1075g02) : i4 >= 29 ? new C1058W(c1075g02) : new C1057V(c1075g02);
            c1059x.mo2311d(c0811cM1479a);
            this.f995t = c1059x.mo2309b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f995t = c1075g0.f3705a.mo2317h(0, measuredHeight, 0, 0);
        }
        m659g(this.f979d, rect2, true);
        if (!this.f996u.equals(this.f995t)) {
            C1075g0 c1075g03 = this.f995t;
            this.f996u = c1075g03;
            ContentFrameLayout contentFrameLayout = this.f979d;
            WindowInsets windowInsetsM2343b = c1075g03.m2343b();
            if (windowInsetsM2343b != null) {
                WindowInsets windowInsetsM2364a = AbstractC1094z.m2364a(contentFrameLayout, windowInsetsM2343b);
                if (!windowInsetsM2364a.equals(windowInsetsM2343b)) {
                    C1075g0.m2342c(windowInsetsM2364a, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f979d, i2, 0, i3, 0);
        C0674f c0674f2 = (C0674f) this.f979d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f979d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0674f2).leftMargin + ((ViewGroup.MarginLayoutParams) c0674f2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f979d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0674f2).topMargin + ((ViewGroup.MarginLayoutParams) c0674f2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f979d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.f986k || !z2) {
            return false;
        }
        this.f998w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f998w.getFinalY() > this.f980e.getHeight()) {
            m666h();
            this.f975A.run();
        } else {
            m666h();
            this.f1001z.run();
        }
        this.f987l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f988m + i3;
        this.f988m = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        C0524E c0524e;
        C0571k c0571k;
        this.f976B.f3720a = i2;
        this.f988m = getActionBarHideOffset();
        m666h();
        InterfaceC0671e interfaceC0671e = this.f997v;
        if (interfaceC0671e == null || (c0571k = (c0524e = (C0524E) interfaceC0671e).f1691I) == null) {
            return;
        }
        c0571k.m1137a();
        c0524e.f1691I = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f980e.getVisibility() != 0) {
            return false;
        }
        return this.f986k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f986k || this.f987l) {
            return;
        }
        if (this.f988m <= this.f980e.getHeight()) {
            m666h();
            postDelayed(this.f1001z, 600L);
        } else {
            m666h();
            postDelayed(this.f975A, 600L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        m669k();
        int i3 = this.f989n ^ i2;
        this.f989n = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        InterfaceC0671e interfaceC0671e = this.f997v;
        if (interfaceC0671e != null) {
            C0524E c0524e = (C0524E) interfaceC0671e;
            c0524e.f1686D = !z3;
            if (z2 || !z3) {
                if (c0524e.f1688F) {
                    c0524e.f1688F = false;
                    c0524e.m1067V(true);
                }
            } else if (!c0524e.f1688F) {
                c0524e.f1688F = true;
                c0524e.m1067V(true);
            }
        }
        if ((i3 & 256) == 0 || this.f997v == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        AbstractC1094z.m2366c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f978c = i2;
        InterfaceC0671e interfaceC0671e = this.f997v;
        if (interfaceC0671e != null) {
            ((C0524E) interfaceC0671e).f1685C = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActionBarHideOffset(int i2) {
        m666h();
        this.f980e.setTranslationY(-Math.max(0, Math.min(i2, this.f980e.getHeight())));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActionBarVisibilityCallback(InterfaceC0671e interfaceC0671e) {
        this.f997v = interfaceC0671e;
        if (getWindowToken() != null) {
            ((C0524E) this.f997v).f1685C = this.f978c;
            int i2 = this.f989n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                AbstractC1094z.m2366c(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f985j = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f986k) {
            this.f986k = z2;
            if (z2) {
                return;
            }
            m666h();
            setActionBarHideOffset(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(int i2) {
        m669k();
        C0697m1 c0697m1 = (C0697m1) this.f981f;
        c0697m1.f2354d = i2 != 0 ? AbstractC0503h.m992y(c0697m1.f2351a.getContext(), i2) : null;
        c0697m1.m1325c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogo(int i2) {
        m669k();
        C0697m1 c0697m1 = (C0697m1) this.f981f;
        c0697m1.f2355e = i2 != 0 ? AbstractC0503h.m992y(c0697m1.f2351a.getContext(), i2) : null;
        c0697m1.m1325c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverlayMode(boolean z2) {
        this.f984i = z2;
        this.f983h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0699n0
    public void setWindowCallback(Window.Callback callback) {
        m669k();
        ((C0697m1) this.f981f).f2361k = callback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.InterfaceC0699n0
    public void setWindowTitle(CharSequence charSequence) {
        m669k();
        C0697m1 c0697m1 = (C0697m1) this.f981f;
        if (c0697m1.f2357g) {
            return;
        }
        c0697m1.f2358h = charSequence;
        if ((c0697m1.f2352b & 8) != 0) {
            Toolbar toolbar = c0697m1.f2351a;
            toolbar.setTitle(charSequence);
            if (c0697m1.f2357g) {
                AbstractC1048L.m2291j(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0674f(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m669k();
        C0697m1 c0697m1 = (C0697m1) this.f981f;
        c0697m1.f2354d = drawable;
        c0697m1.m1325c();
    }

    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: a */
    public final void mo660a(int i2, int i3, int[] iArr, int i4) {
    }
}
