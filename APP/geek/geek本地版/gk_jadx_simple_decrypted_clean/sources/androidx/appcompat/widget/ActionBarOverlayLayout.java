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
import defpackage.a1;
import defpackage.b1;
import defpackage.cv;
import defpackage.ep;
import defpackage.f70;
import defpackage.ff;
import defpackage.gf;
import defpackage.hf;
import defpackage.ic0;
import defpackage.j1;
import defpackage.ja0;
import defpackage.jw;
import defpackage.k70;
import defpackage.kc0;
import defpackage.ku;
import defpackage.kw;
import defpackage.lc0;
import defpackage.lw;
import defpackage.mc0;
import defpackage.s90;
import defpackage.tc0;
import defpackage.w90;
import defpackage.wc0;
import defpackage.xa0;
import defpackage.y0;
import defpackage.y90;
import defpackage.yb0;
import defpackage.z0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements gf, jw, kw {
    public static final int[] B = null;
    public final lw A;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public hf e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public wc0 q;
    public wc0 r;
    public wc0 s;
    public wc0 t;
    public a1 u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final y0 x;
    public final z0 y;
    public final z0 z;

    static {
        B = new int[]{R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    }

    public ActionBarOverlayLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.b = 0;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        wc0 r32 = wc0.b;
        this.q = r32;
        this.r = r32;
        this.s = r32;
        this.t = r32;
        this.x = new y0(0, this);
        this.y = new z0(this, 0);
        this.z = new z0(this, 1);
        i(r2);
        this.A = new lw();
    }

    public static boolean g(View r4, Rect r5, boolean r6) {
        b1 r42 = (b1) r4.getLayoutParams();
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

    @Override // defpackage.jw
    public final void a(View r1, View r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        onNestedScrollAccepted(r1, r2, r3);
        return;
    }

    @Override // defpackage.jw
    public final void b(View r1, int r2) {
        if (r2 != 0) goto L5;
        onStopNestedScroll(r1);
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof b1;
    }

    @Override // defpackage.kw
    public final void d(View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        e(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.view.View
    public final void draw(Canvas r6) {
        super.draw(r6);
        if (this.f != null) goto L5;
        return;
    L5:
        if (this.g == false) goto L7;
        return;
    L7:
        if (this.d.getVisibility() != 0) goto L9;
        int r0 = (int) ((this.d.getTranslationY() + this.d.getBottom()) + 0.5f);
    L10:
        this.f.setBounds(0, r0, getWidth(), this.f.getIntrinsicHeight() + r0);
        this.f.draw(r6);
        return;
    L9:
        r0 = 0;
        goto L10
    }

    @Override // defpackage.jw
    public final void e(View r1, int r2, int r3, int r4, int r5, int r6) {
        if (r6 != 0) goto L5;
        onNestedScroll(r1, r2, r3, r4, r5);
        return;
    }

    @Override // defpackage.jw
    public final boolean f(View r1, View r2, int r3, int r4) {
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
        return new b1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new b1(getContext(), r3);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer r0 = this.d;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return -((int) r0.getTranslationY());
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        lw r0 = this.A;
        int r1 = r0.a;
        return r0.b | r1;
    }

    public CharSequence getTitle() {
        k();
        return ((k70) this.e).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator r0 = this.w;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    public final void i(Context r5) {
        TypedArray r0 = getContext().getTheme().obtainStyledAttributes(B);
        boolean r1 = false;
        this.a = r0.getDimensionPixelSize(0, 0);
        Drawable r3 = r0.getDrawable(1);
        this.f = r3;
        if (r3 != null) goto L5;
        boolean r32 = true;
    L6:
        setWillNotDraw(r32);
        r0.recycle();
        if (r5.getApplicationInfo().targetSdkVersion >= 19) goto L9;
        r1 = true;
    L9:
        this.g = r1;
        this.v = new OverScroller(r5);
        return;
    L5:
        r32 = false;
        goto L6
    }

    public final void j(int r4) {
        k();
        if (r4 != 2) goto L5;
        ((k70) this.e).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        return;
    L5:
        if (r4 != 5) goto L7;
        ((k70) this.e).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        return;
    L7:
        if (r4 == 109) goto L9;
        return;
    L9:
        setOverlayMode(true);
    }

    public final void k() {
        if (this.c != null) goto L14;
        this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
        this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
        KeyEvent.Callback r0 = findViewById(R.id.action_bar);
        if ((r0 instanceof hf) == false) goto L8;
        hf r02 = (hf) r0;
    L10:
        this.e = r02;
        return;
    L8:
        if ((r0 instanceof Toolbar) == false) goto L13;
        r02 = ((Toolbar) r0).getWrapper();
        goto L10
    L13:
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(r0.getClass().getSimpleName()));
    }

    public final void l(Menu r5, cv r6) {
        k();
        k70 r0 = (k70) this.e;
        Toolbar r1 = r0.a;
        if (r0.m != null) goto L5;
        r0.m = new j1(r1.getContext());
    L5:
        j1 r02 = r0.m;
        r02.e = r6;
        ku r52 = (ku) r5;
        if (r52 == null) goto L8;
    L10:
        r1.f();
        ku r62 = r1.a.p;
        if (r62 != r52) goto L13;
        return;
    L13:
        if (r62 == null) goto L16;
        r62.r(r1.K);
        r62.r(r1.L);
    L16:
        if (r1.L != null) goto L18;
        r1.L = new f70(r1);
    L18:
        r02.q = true;
        if (r52 == null) goto L21;
        r52.b(r02, r1.j);
        r52.b(r1.L, r1.j);
    L22:
        r1.a.setPopupTheme(r1.k);
        r1.a.setPresenter(r02);
        r1.K = r02;
        r1.u();
        return;
    L21:
        r02.i(r1.j, null);
        r1.L.i(r1.j, null);
        r02.h();
        r1.L.h();
        goto L22
    L8:
        if (r1.a != null) goto L10;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets r7) {
        k();
        wc0 r72 = wc0.g(this, r7);
        boolean r0 = g(this.d, new Rect(r72.b(), r72.d(), r72.c(), r72.a()), false);
        WeakHashMap r1 = ja0.a;
        Rect r12 = this.n;
        y90.b(this, r72, r12);
        int r2 = r12.left;
        int r3 = r12.top;
        int r4 = r12.right;
        int r5 = r12.bottom;
        tc0 r73 = r72.a;
        wc0 r22 = r73.l(r2, r3, r4, r5);
        this.q = r22;
        boolean r32 = true;
        if (this.r.equals(r22) == true) goto L5;
        this.r = this.q;
        r0 = true;
    L5:
        Rect r23 = this.o;
        if (r23.equals(r12) == true) goto L8;
        r23.set(r12);
    L9:
        if (r32 == false) goto L12;
        requestLayout();
    L12:
        return r73.a().a.c().a.b().f();
    L8:
        r32 = r0;
        goto L9
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        i(getContext());
        WeakHashMap r12 = ja0.a;
        w90.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
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
        b1 r0 = (b1) r92.getLayoutParams();
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
        k();
        measureChildWithMargins(this.d, r13, 0, r14, 0);
        b1 r132 = (b1) this.d.getLayoutParams();
        int r142 = Math.max(0, (this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r132).leftMargin) + ((ViewGroup.MarginLayoutParams) r132).rightMargin);
        int r133 = Math.max(0, (this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r132).topMargin) + ((ViewGroup.MarginLayoutParams) r132).bottomMargin);
        int r3 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap r5 = ja0.a;
        if ((s90.g(this) & 256) == 0) goto L5;
        boolean r52 = true;
    L6:
        if (r52 == false) goto L13;
        int r7 = this.a;
        if (this.i == true) goto L10;
    L16:
        Rect r8 = this.n;
        Rect r9 = this.p;
        r9.set(r8);
        wc0 r82 = this.q;
        this.s = r82;
        if (this.h == true) goto L20;
        if (r52 == true) goto L20;
        r9.top += r7;
        r9.bottom = r9.bottom;
        this.s = r82.a.l(0, r7, 0, 0);
    L28:
        g(this.c, r9, true);
        if (this.t.equals(this.s) == true) goto L35;
        wc0 r1 = this.s;
        this.t = r1;
        ContentFrameLayout r53 = this.c;
        WindowInsets r12 = r1.f();
        if (r12 == null) goto L35;
        WindowInsets r6 = w90.a(r53, r12);
        if (r6.equals(r12) == true) goto L35;
        wc0.g(r53, r6);
    L35:
        measureChildWithMargins(this.c, r13, 0, r14, 0);
        b1 r15 = (b1) this.c.getLayoutParams();
        int r143 = Math.max(r142, (this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r15).leftMargin) + ((ViewGroup.MarginLayoutParams) r15).rightMargin);
        int r134 = Math.max(r133, (this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r15).topMargin) + ((ViewGroup.MarginLayoutParams) r15).bottomMargin);
        int r16 = View.combineMeasuredStates(r3, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max((getPaddingRight() + getPaddingLeft()) + r143, getSuggestedMinimumWidth()), r13, r16), View.resolveSizeAndState(Math.max((getPaddingBottom() + getPaddingTop()) + r134, getSuggestedMinimumHeight()), r14, r16 << 16));
        return;
    L20:
        ep r17 = ep.b(r82.b(), this.s.d() + r7, this.s.c(), this.s.a());
        wc0 r54 = this.s;
        int r72 = Build.VERSION.SDK_INT;
        if (r72 < 30) goto L24;
        mc0 r73 = new lc0(r54);
    L27:
        r73.g(r17);
        this.s = r73.b();
        goto L28
    L24:
        if (r72 < 29) goto L26;
        r73 = new kc0(r54);
        goto L27
    L26:
        r73 = new ic0(r54);
        goto L27
    L10:
        if (this.d.getTabContainer() == null) goto L16;
        r7 = r7 + this.a;
        goto L16
    L13:
        if (this.d.getVisibility() == 8) goto L15;
        r7 = this.d.getMeasuredHeight();
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
        if (this.j == false) goto L12;
        if (r13 == false) goto L14;
        this.v.fling(0, 0, 0, (int) r12, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.v.getFinalY() <= this.d.getHeight()) goto L9;
        h();
        this.z.run();
    L10:
        this.k = true;
        return true;
    L9:
        h();
        this.y.run();
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
    public final void onNestedScroll(View r1, int r2, int r3, int r4, int r5) {
        int r12 = this.l + r3;
        this.l = r12;
        setActionBarHideOffset(r12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r1, View r2, int r3) {
        this.A.a = r3;
        this.l = getActionBarHideOffset();
        h();
        a1 r12 = this.u;
        if (r12 == null) goto L8;
        yb0 r13 = (yb0) r12;
        xa0 r22 = r13.O;
        if (r22 == null) goto L9;
        r22.a();
        r13.O = null;
        return;
    L9:
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r1, View r2, int r3) {
        if ((r3 & 2) != 0) goto L5;
        return false;
    L5:
        if (this.d.getVisibility() == 0) goto L8;
        return false;
    L8:
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r4) {
        if (this.j == true) goto L5;
        return;
    L5:
        if (this.k == false) goto L7;
        return;
    L7:
        if (this.l > this.d.getHeight()) goto L9;
        h();
        postDelayed(this.y, 600);
        return;
    L9:
        h();
        postDelayed(this.z, 600);
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r7) {
        super.onWindowSystemUiVisibilityChanged(r7);
        k();
        int r0 = this.m ^ r7;
        this.m = r7;
        if ((r7 & 4) != 0) goto L5;
        boolean r1 = true;
    L7:
        if ((r7 & 256) == 0) goto L9;
        boolean r72 = true;
    L10:
        a1 r4 = this.u;
        if (r4 == null) goto L23;
        yb0 r42 = (yb0) r4;
        r42.K = !r72;
        if (r1 == true) goto L20;
        if (r72 == false) goto L20;
        if (r42.L == true) goto L23;
        r42.L = true;
        r42.P(true);
    L20:
        if (r42.L == false) goto L23;
        r42.L = false;
        r42.P(true);
    L23:
        if ((r0 & 256) != 0) goto L25;
        return;
    L25:
        if (this.u == null) goto L29;
        WeakHashMap r73 = ja0.a;
        w90.c(this);
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
        this.b = r2;
        a1 r0 = this.u;
        if (r0 == null) goto L6;
        ((yb0) r0).J = r2;
        return;
    }

    public void setActionBarHideOffset(int r3) {
        h();
        int r32 = Math.max(0, Math.min(r3, this.d.getHeight()));
        this.d.setTranslationY(-r32);
    }

    public void setActionBarVisibilityCallback(a1 r2) {
        this.u = r2;
        if (getWindowToken() == null) goto L8;
        a1 r22 = this.u;
        ((yb0) r22).J = this.b;
        int r23 = this.m;
        if (r23 == 0) goto L9;
        onWindowSystemUiVisibilityChanged(r23);
        WeakHashMap r24 = ja0.a;
        w90.c(this);
        return;
    L9:
        return;
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
        this.i = r1;
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
        if (r2 == this.j) goto L8;
        this.j = r2;
        if (r2 == true) goto L9;
        h();
        setActionBarHideOffset(0);
        return;
    L9:
        return;
    }

    public void setIcon(int r3) {
        k();
        k70 r0 = (k70) this.e;
        if (r3 == 0) goto L5;
        Drawable r32 = ff.r(r0.a.getContext(), r3);
    L6:
        r0.d = r32;
        r0.c();
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setLogo(int r3) {
        k();
        k70 r0 = (k70) this.e;
        if (r3 == 0) goto L5;
        Drawable r32 = ff.r(r0.a.getContext(), r3);
    L6:
        r0.e = r32;
        r0.c();
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setOverlayMode(boolean r2) {
        this.h = r2;
        if (r2 == true) goto L5;
    L7:
        boolean r22 = false;
    L8:
        this.g = r22;
        return;
    L5:
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) goto L7;
        r22 = true;
        goto L8
    }

    @Override // defpackage.gf
    public void setWindowCallback(Window.Callback r2) {
        k();
        ((k70) this.e).k = r2;
    }

    @Override // defpackage.gf
    public void setWindowTitle(CharSequence r4) {
        k();
        k70 r0 = (k70) this.e;
        if (r0.g == true) goto L10;
        Toolbar r1 = r0.a;
        r0.h = r4;
        if ((r0.b & 8) == 0) goto L11;
        r1.setTitle(r4);
        if (r0.g == false) goto L12;
        ja0.m(r1.getRootView(), r4);
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
        return new b1(r2);
    }

    public void setIcon(Drawable r2) {
        k();
        k70 r0 = (k70) this.e;
        r0.d = r2;
        r0.c();
    }

    public void setShowingForActionMode(boolean r1) {
    }

    public void setUiOptions(int r1) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r1, int r2, int r3, int[] r4) {
    }

    @Override // defpackage.jw
    public final void c(View r1, int r2, int r3, int[] r4, int r5) {
    }
}
