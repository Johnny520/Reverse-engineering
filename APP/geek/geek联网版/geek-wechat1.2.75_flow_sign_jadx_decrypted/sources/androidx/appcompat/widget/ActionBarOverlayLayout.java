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
import p000.AbstractC0259gf;
import p000.C0052b1;
import p000.C0346ip;
import p000.C0358j1;
import p000.C0759tw;
import p000.C0913y0;
import p000.InterfaceC0002a1;
import p000.InterfaceC0296hf;
import p000.InterfaceC0372jf;
import p000.InterfaceC0425kv;
import p000.InterfaceC0685rw;
import p000.InterfaceC0722sw;
import p000.MenuC0646qu;
import p000.RunnableC0950z0;
import p000.ba0;
import p000.bd0;
import p000.cb0;
import p000.da0;
import p000.dc0;
import p000.l70;
import p000.nc0;
import p000.oa0;
import p000.pc0;
import p000.q70;
import p000.qc0;
import p000.rc0;
import p000.x90;
import p000.yc0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0296hf, InterfaceC0685rw, InterfaceC0722sw {

    /* JADX INFO: renamed from: B */
    public static final int[] f216B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    public final C0759tw f217A;

    /* JADX INFO: renamed from: a */
    public int f218a;

    /* JADX INFO: renamed from: b */
    public int f219b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f220c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f221d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0372jf f222e;

    /* JADX INFO: renamed from: f */
    public Drawable f223f;

    /* JADX INFO: renamed from: g */
    public boolean f224g;

    /* JADX INFO: renamed from: h */
    public boolean f225h;

    /* JADX INFO: renamed from: i */
    public boolean f226i;

    /* JADX INFO: renamed from: j */
    public boolean f227j;

    /* JADX INFO: renamed from: k */
    public boolean f228k;

    /* JADX INFO: renamed from: l */
    public int f229l;

    /* JADX INFO: renamed from: m */
    public int f230m;

    /* JADX INFO: renamed from: n */
    public final Rect f231n;

    /* JADX INFO: renamed from: o */
    public final Rect f232o;

    /* JADX INFO: renamed from: p */
    public final Rect f233p;

    /* JADX INFO: renamed from: q */
    public bd0 f234q;

    /* JADX INFO: renamed from: r */
    public bd0 f235r;

    /* JADX INFO: renamed from: s */
    public bd0 f236s;

    /* JADX INFO: renamed from: t */
    public bd0 f237t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0002a1 f238u;

    /* JADX INFO: renamed from: v */
    public OverScroller f239v;

    /* JADX INFO: renamed from: w */
    public ViewPropertyAnimator f240w;

    /* JADX INFO: renamed from: x */
    public final C0913y0 f241x;

    /* JADX INFO: renamed from: y */
    public final RunnableC0950z0 f242y;

    /* JADX INFO: renamed from: z */
    public final RunnableC0950z0 f243z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f219b = 0;
        this.f231n = new Rect();
        this.f232o = new Rect();
        this.f233p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        bd0 bd0Var = bd0.f723b;
        this.f234q = bd0Var;
        this.f235r = bd0Var;
        this.f236s = bd0Var;
        this.f237t = bd0Var;
        this.f241x = new C0913y0(0, this);
        this.f242y = new RunnableC0950z0(this, 0);
        this.f243z = new RunnableC0950z0(this, 1);
        m141i(context);
        this.f217A = new C0759tw();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m133g(View view, Rect rect, boolean z) {
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

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: a */
    public final void mo134a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: b */
    public final void mo135b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0052b1;
    }

    @Override // p000.InterfaceC0722sw
    /* JADX INFO: renamed from: d */
    public final void mo137d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo138e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f223f == null || this.f224g) {
            return;
        }
        if (this.f221d.getVisibility() == 0) {
            translationY = (int) (this.f221d.getTranslationY() + this.f221d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f223f.setBounds(0, translationY, getWidth(), this.f223f.getIntrinsicHeight() + translationY);
        this.f223f.draw(canvas);
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: e */
    public final void mo138e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: f */
    public final boolean mo139f(View view, View view2, int i, int i2) {
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
        ActionBarContainer actionBarContainer = this.f221d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0759tw c0759tw = this.f217A;
        return c0759tw.f4594b | c0759tw.f4593a;
    }

    public CharSequence getTitle() {
        m143k();
        return ((q70) this.f222e).f3849a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m140h() {
        removeCallbacks(this.f242y);
        removeCallbacks(this.f243z);
        ViewPropertyAnimator viewPropertyAnimator = this.f240w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m141i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f216B);
        this.f218a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f223f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f224g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f239v = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m142j(int i) {
        m143k();
        if (i == 2) {
            ((q70) this.f222e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((q70) this.f222e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m143k() {
        InterfaceC0372jf wrapper;
        if (this.f220c == null) {
            this.f220c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f221d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0372jf) {
                wrapper = (InterfaceC0372jf) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f222e = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m144l(Menu menu, InterfaceC0425kv interfaceC0425kv) {
        m143k();
        q70 q70Var = (q70) this.f222e;
        Toolbar toolbar = q70Var.f3849a;
        if (q70Var.f3861m == null) {
            q70Var.f3861m = new C0358j1(toolbar.getContext());
        }
        C0358j1 c0358j1 = q70Var.f3861m;
        c0358j1.f2627e = interfaceC0425kv;
        MenuC0646qu menuC0646qu = (MenuC0646qu) menu;
        if (menuC0646qu == null && toolbar.f329a == null) {
            return;
        }
        toolbar.m176f();
        MenuC0646qu menuC0646qu2 = toolbar.f329a.f244p;
        if (menuC0646qu2 == menuC0646qu) {
            return;
        }
        if (menuC0646qu2 != null) {
            menuC0646qu2.m2174r(toolbar.f322K);
            menuC0646qu2.m2174r(toolbar.f323L);
        }
        if (toolbar.f323L == null) {
            toolbar.f323L = new l70(toolbar);
        }
        c0358j1.f2639q = true;
        if (menuC0646qu != null) {
            menuC0646qu.m2166b(c0358j1, toolbar.f338j);
            menuC0646qu.m2166b(toolbar.f323L, toolbar.f338j);
        } else {
            c0358j1.mo532i(toolbar.f338j, null);
            toolbar.f323L.mo532i(toolbar.f338j, null);
            c0358j1.mo977h();
            toolbar.f323L.mo977h();
        }
        toolbar.f329a.setPopupTheme(toolbar.f339k);
        toolbar.f329a.setPresenter(c0358j1);
        toolbar.f322K = c0358j1;
        toolbar.m187u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m143k();
        bd0 bd0VarM515g = bd0.m515g(this, windowInsets);
        boolean zM133g = m133g(this.f221d, new Rect(bd0VarM515g.m517b(), bd0VarM515g.m519d(), bd0VarM515g.m518c(), bd0VarM515g.m516a()), false);
        WeakHashMap weakHashMap = oa0.f3426a;
        Rect rect = this.f231n;
        da0.m884b(this, bd0VarM515g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        yc0 yc0Var = bd0VarM515g.f724a;
        bd0 bd0VarMo2370l = yc0Var.mo2370l(i, i2, i3, i4);
        this.f234q = bd0VarMo2370l;
        boolean z = true;
        if (!this.f235r.equals(bd0VarMo2370l)) {
            this.f235r = this.f234q;
            zM133g = true;
        }
        Rect rect2 = this.f232o;
        if (rect2.equals(rect)) {
            z = zM133g;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return yc0Var.mo2562a().f724a.mo2409c().f724a.mo2408b().m520f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m141i(getContext());
        WeakHashMap weakHashMap = oa0.f3426a;
        ba0.m506c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m140h();
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
        m143k();
        measureChildWithMargins(this.f221d, i, 0, i2, 0);
        C0052b1 c0052b1 = (C0052b1) this.f221d.getLayoutParams();
        int iMax = Math.max(0, this.f221d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0052b1).leftMargin + ((ViewGroup.MarginLayoutParams) c0052b1).rightMargin);
        int iMax2 = Math.max(0, this.f221d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0052b1).topMargin + ((ViewGroup.MarginLayoutParams) c0052b1).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f221d.getMeasuredState());
        WeakHashMap weakHashMap = oa0.f3426a;
        boolean z = (x90.m2659g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f218a;
            if (this.f226i && this.f221d.getTabContainer() != null) {
                measuredHeight += this.f218a;
            }
        } else {
            measuredHeight = this.f221d.getVisibility() != 8 ? this.f221d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f231n;
        Rect rect2 = this.f233p;
        rect2.set(rect);
        bd0 bd0Var = this.f234q;
        this.f236s = bd0Var;
        if (this.f225h || z) {
            C0346ip c0346ipM1524b = C0346ip.m1524b(bd0Var.m517b(), this.f236s.m519d() + measuredHeight, this.f236s.m518c(), this.f236s.m516a());
            bd0 bd0Var2 = this.f236s;
            int i3 = Build.VERSION.SDK_INT;
            rc0 qc0Var = i3 >= 30 ? new qc0(bd0Var2) : i3 >= 29 ? new pc0(bd0Var2) : new nc0(bd0Var2);
            qc0Var.mo1946g(c0346ipM1524b);
            this.f236s = qc0Var.mo1944b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f236s = bd0Var.f724a.mo2370l(0, measuredHeight, 0, 0);
        }
        m133g(this.f220c, rect2, true);
        if (!this.f237t.equals(this.f236s)) {
            bd0 bd0Var3 = this.f236s;
            this.f237t = bd0Var3;
            ContentFrameLayout contentFrameLayout = this.f220c;
            WindowInsets windowInsetsM520f = bd0Var3.m520f();
            if (windowInsetsM520f != null) {
                WindowInsets windowInsetsM504a = ba0.m504a(contentFrameLayout, windowInsetsM520f);
                if (!windowInsetsM504a.equals(windowInsetsM520f)) {
                    bd0.m515g(contentFrameLayout, windowInsetsM504a);
                }
            }
        }
        measureChildWithMargins(this.f220c, i, 0, i2, 0);
        C0052b1 c0052b12 = (C0052b1) this.f220c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f220c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0052b12).leftMargin + ((ViewGroup.MarginLayoutParams) c0052b12).rightMargin);
        int iMax4 = Math.max(iMax2, this.f220c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0052b12).topMargin + ((ViewGroup.MarginLayoutParams) c0052b12).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f220c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f227j || !z) {
            return false;
        }
        this.f239v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f239v.getFinalY() > this.f221d.getHeight()) {
            m140h();
            this.f243z.run();
        } else {
            m140h();
            this.f242y.run();
        }
        this.f228k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f229l + i2;
        this.f229l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        dc0 dc0Var;
        cb0 cb0Var;
        this.f217A.f4593a = i;
        this.f229l = getActionBarHideOffset();
        m140h();
        InterfaceC0002a1 interfaceC0002a1 = this.f238u;
        if (interfaceC0002a1 == null || (cb0Var = (dc0Var = (dc0) interfaceC0002a1).f1374N) == null) {
            return;
        }
        cb0Var.m610a();
        dc0Var.f1374N = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f221d.getVisibility() != 0) {
            return false;
        }
        return this.f227j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f227j || this.f228k) {
            return;
        }
        if (this.f229l <= this.f221d.getHeight()) {
            m140h();
            postDelayed(this.f242y, 600L);
        } else {
            m140h();
            postDelayed(this.f243z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m143k();
        int i2 = this.f230m ^ i;
        this.f230m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0002a1 interfaceC0002a1 = this.f238u;
        if (interfaceC0002a1 != null) {
            dc0 dc0Var = (dc0) interfaceC0002a1;
            dc0Var.f1370J = !z2;
            if (z || !z2) {
                if (dc0Var.f1371K) {
                    dc0Var.f1371K = false;
                    dc0Var.m914V(true);
                }
            } else if (!dc0Var.f1371K) {
                dc0Var.f1371K = true;
                dc0Var.m914V(true);
            }
        }
        if ((i2 & 256) == 0 || this.f238u == null) {
            return;
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        ba0.m506c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f219b = i;
        InterfaceC0002a1 interfaceC0002a1 = this.f238u;
        if (interfaceC0002a1 != null) {
            ((dc0) interfaceC0002a1).f1369I = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m140h();
        this.f221d.setTranslationY(-Math.max(0, Math.min(i, this.f221d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0002a1 interfaceC0002a1) {
        this.f238u = interfaceC0002a1;
        if (getWindowToken() != null) {
            ((dc0) this.f238u).f1369I = this.f219b;
            int i = this.f230m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = oa0.f3426a;
                ba0.m506c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f226i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f227j) {
            this.f227j = z;
            if (z) {
                return;
            }
            m140h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m143k();
        q70 q70Var = (q70) this.f222e;
        q70Var.f3852d = i != 0 ? AbstractC0259gf.m1261w(q70Var.f3849a.getContext(), i) : null;
        q70Var.m2131c();
    }

    public void setLogo(int i) {
        m143k();
        q70 q70Var = (q70) this.f222e;
        q70Var.f3853e = i != 0 ? AbstractC0259gf.m1261w(q70Var.f3849a.getContext(), i) : null;
        q70Var.m2131c();
    }

    public void setOverlayMode(boolean z) {
        this.f225h = z;
        this.f224g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // p000.InterfaceC0296hf
    public void setWindowCallback(Window.Callback callback) {
        m143k();
        ((q70) this.f222e).f3859k = callback;
    }

    @Override // p000.InterfaceC0296hf
    public void setWindowTitle(CharSequence charSequence) {
        m143k();
        q70 q70Var = (q70) this.f222e;
        if (q70Var.f3855g) {
            return;
        }
        Toolbar toolbar = q70Var.f3849a;
        q70Var.f3856h = charSequence;
        if ((q70Var.f3850b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (q70Var.f3855g) {
                oa0.m2013m(toolbar.getRootView(), charSequence);
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
        m143k();
        q70 q70Var = (q70) this.f222e;
        q70Var.f3852d = drawable;
        q70Var.m2131c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: c */
    public final void mo136c(View view, int i, int i2, int[] iArr, int i3) {
    }
}
