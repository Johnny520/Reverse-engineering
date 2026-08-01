package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.a80;
import defpackage.fw;
import defpackage.gw;
import defpackage.hw;
import defpackage.iw;
import defpackage.ja0;
import defpackage.kw;
import defpackage.lw;
import defpackage.qt;
import defpackage.s90;
import defpackage.uh;
import defpackage.y90;
import defpackage.zt;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements kw {
    public static final float A = 0.0f;
    public static final qt B = null;
    public static final int[] C = null;
    public final float a;
    public long b;
    public final Rect c;
    public final OverScroller d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public View j;
    public boolean k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public hw w;
    public final lw x;
    public final iw y;
    public float z;

    static {
        A = (float) (Math.log(0.78d) / Math.log(0.9d));
        B = new qt(3);
        C = new int[]{R.attr.fillViewport};
    }

    public NestedScrollView(Context r7, AttributeSet r8) {
        super(r7, r8, com.ljx.wechatmod.R.attr.nestedScrollViewStyle);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 31) goto L5;
        EdgeEffect r5 = uh.a(r7, r8);
    L6:
        this.e = r5;
        if (r3 < 31) goto L9;
        EdgeEffect r32 = uh.a(r7, r8);
    L10:
        this.f = r32;
        this.a = ((r7.getResources().getDisplayMetrics().density * 160.0f) * 386.0878f) * 0.84f;
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration r33 = ViewConfiguration.get(getContext());
        this.o = r33.getScaledTouchSlop();
        this.p = r33.getScaledMinimumFlingVelocity();
        this.q = r33.getScaledMaximumFlingVelocity();
        TypedArray r72 = r7.obtainStyledAttributes(r8, C, com.ljx.wechatmod.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(r72.getBoolean(0, false));
        r72.recycle();
        this.x = new lw();
        this.y = new iw(this);
        setNestedScrollingEnabled(true);
        ja0.l(this, B);
        return;
    L9:
        r32 = new EdgeEffect(r7);
        goto L10
    L5:
        r5 = new EdgeEffect(r7);
        goto L6
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z != 0.0f) goto L10;
        TypedValue r0 = new TypedValue();
        Context r1 = getContext();
        if (r1.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, r0, true) == false) goto L8;
        this.z = r0.getDimension(r1.getResources().getDisplayMetrics());
        goto L10
    L8:
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    L10:
        return this.z;
    }

    public static boolean m(View r1, NestedScrollView r2) {
        if (r1 == r2) goto L12;
        Object r12 = r1.getParent();
        if ((r12 instanceof ViewGroup) == true) goto L7;
        return false;
    L7:
        if (m((View) r12, r2) == false) goto L13;
        return true;
    L13:
        return false;
    L12:
        return true;
    }

    @Override // defpackage.jw
    public final void a(View r1, View r2, int r3, int r4) {
        lw r22 = this.x;
        if (r4 != 1) goto L5;
        r22.b = r3;
    L6:
        this.y.g(2, r4);
        return;
    L5:
        r22.a = r3;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // defpackage.jw
    public final void b(View r3, int r4) {
        lw r0 = this.x;
        if (r4 != 1) goto L5;
        r0.b = 0;
    L6:
        v(r4);
        return;
    L5:
        r0.a = 0;
        goto L6
    }

    @Override // defpackage.jw
    public final void c(View r7, int r8, int r9, int[] r10, int r11) {
        this.y.c(r8, r9, r10, null, r11);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller r1 = this.d;
        if (r1.isFinished() == false) goto L5;
        return;
    L5:
        r1.computeScrollOffset();
        int r2 = r1.getCurrY();
        int r3 = r2 - this.v;
        int r4 = getHeight();
        EdgeEffect r5 = this.e;
        EdgeEffect r6 = this.f;
        if (r3 > 0) goto L8;
    L14:
        if (r3 < 0) goto L16;
    L13:
        int r9 = r3;
        this.v = r2;
        int[] r10 = this.t;
        r10[1] = 0;
        this.y.c(0, r9, r10, null, 1);
        int r92 = r9 - r10[1];
        int r42 = getScrollRange();
        if (r92 == 0) goto L23;
        int r7 = getScrollY();
        q(r92, getScrollX(), r7, r42);
        int r12 = getScrollY() - r7;
        int r14 = r92 - r12;
        r10[1] = 0;
        this.y.d(0, r12, 0, r14, this.s, 1, r10);
        r92 = r14 - r10[1];
    L23:
        if (r92 == 0) goto L37;
        int r32 = getOverScrollMode();
        if (r32 == 0) goto L28;
        if (r32 != 1) goto L35;
        if (r42 > 0) goto L28;
    L35:
        r1.abortAnimation();
        v(1);
    L28:
        if (r92 >= 0) goto L33;
        if (r5.isFinished() == false) goto L35;
        r5.onAbsorb((int) r1.getCurrVelocity());
        goto L35
    L33:
        if (r6.isFinished() == false) goto L35;
        r6.onAbsorb((int) r1.getCurrVelocity());
    L37:
        if (r1.isFinished() == true) goto L40;
        WeakHashMap r13 = ja0.a;
        s90.k(this);
        return;
    L40:
        v(1);
        return;
    L16:
        if (a80.k(r6) == 0.0f) goto L13;
        float r43 = r4;
        int r44 = Math.round(a80.w(r6, (r3 * 4.0f) / r43, 0.5f) * (r43 / 4.0f));
        if (r44 != r3) goto L19;
    L12:
        r3 = r3 - r44;
        goto L13
    L19:
        r6.finish();
        goto L12
    L8:
        if (a80.k(r5) == 0.0f) goto L14;
        r44 = Math.round(a80.w(r5, ((-r3) * 4.0f) / r4, 0.5f) * ((-r4) / 4.0f));
        if (r44 == r3) goto L12;
        r5.finish();
        goto L12
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int r0 = getChildCount();
        int r1 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (r0 != 0) goto L5;
        return r1;
    L5:
        View r2 = getChildAt(0);
        FrameLayout.LayoutParams r3 = (FrameLayout.LayoutParams) r2.getLayoutParams();
        int r22 = r2.getBottom() + r3.bottomMargin;
        int r32 = getScrollY();
        int r02 = Math.max(0, r22 - r1);
        if (r32 < 0) goto L8;
        if (r32 > r02) goto L11;
        return r22;
    L11:
        return (r32 - r02) + r22;
    L8:
        return r22 - r32;
    }

    @Override // defpackage.kw
    public final void d(View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        o(r5, r6, r7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        if (super.dispatchKeyEvent(r2) == false) goto L5;
        return true;
    L5:
        if (j(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
        return this.y.a(r2, r3, r4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
        return this.y.b(r2, r3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return this.y.c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return this.y.d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas r11) {
        super.draw(r11);
        int r0 = getScrollY();
        EdgeEffect r1 = this.e;
        int r3 = 0;
        if (r1.isFinished() == true) goto L15;
        int r2 = r11.save();
        int r4 = getWidth();
        int r5 = getHeight();
        int r6 = Math.min(0, r0);
        if (fw.a(this) == false) goto L7;
        r4 = r4 - (getPaddingRight() + getPaddingLeft());
        int r7 = getPaddingLeft();
    L9:
        if (fw.a(this) == false) goto L11;
        r5 = r5 - (getPaddingBottom() + getPaddingTop());
        r6 = r6 + getPaddingTop();
    L11:
        r11.translate(r7, r6);
        r1.setSize(r4, r5);
        if (r1.draw(r11) == false) goto L14;
        WeakHashMap r12 = ja0.a;
        s90.k(this);
    L14:
        r11.restoreToCount(r2);
        goto L15
    L7:
        r7 = 0;
    L15:
        EdgeEffect r13 = this.f;
        if (r13.isFinished() == true) goto L28;
        int r22 = r11.save();
        int r42 = getWidth();
        int r52 = getHeight();
        int r02 = Math.max(getScrollRange(), r0) + r52;
        if (fw.a(this) == false) goto L21;
        r42 = r42 - (getPaddingRight() + getPaddingLeft());
        r3 = getPaddingLeft();
    L21:
        if (fw.a(this) == false) goto L23;
        r52 = r52 - (getPaddingBottom() + getPaddingTop());
        r02 = r02 - getPaddingBottom();
    L23:
        r11.translate(r3 - r42, r02);
        r11.rotate(180.0f, r42, 0.0f);
        r13.setSize(r42, r52);
        if (r13.draw(r11) == false) goto L26;
        WeakHashMap r03 = ja0.a;
        s90.k(this);
    L26:
        r11.restoreToCount(r22);
        return;
    }

    @Override // defpackage.jw
    public final void e(View r1, int r2, int r3, int r4, int r5, int r6) {
        o(r5, r6, null);
    }

    @Override // defpackage.jw
    public final boolean f(View r1, View r2, int r3, int r4) {
        if ((r3 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean g(int r8) {
        View r0 = findFocus();
        if (r0 != this) goto L5;
        r0 = null;
    L5:
        View r1 = FocusFinder.getInstance().findNextFocus(this, r0, r8);
        int r2 = getMaxScrollAmount();
        if (r1 == null) goto L11;
        if (n(r1, r2, getHeight()) == false) goto L11;
        Rect r22 = this.c;
        r1.getDrawingRect(r22);
        offsetDescendantRectToMyCoords(r1, r22);
        i(h(r22));
        r1.requestFocus(r8);
    L25:
        if (r0 != null) goto L27;
        return true;
    L27:
        if (r0.isFocused() == true) goto L29;
        return true;
    L29:
        if (n(r0, 0, getHeight()) == true) goto L35;
        int r82 = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(r82);
        return true;
    L35:
        return true;
    L11:
        if (r8 == 33) goto L13;
    L15:
        if (r8 == 130) goto L17;
    L19:
        if (r2 != 0) goto L21;
        return false;
    L21:
        if (r8 == 130) goto L24;
        r2 = -r2;
    L24:
        i(r2);
        goto L25
    L17:
        if (getChildCount() <= 0) goto L19;
        View r12 = getChildAt(0);
        FrameLayout.LayoutParams r5 = (FrameLayout.LayoutParams) r12.getLayoutParams();
        int r13 = r12.getBottom() + r5.bottomMargin;
        int r52 = getScrollY();
        r2 = Math.min(r13 - ((getHeight() + r52) - getPaddingBottom()), r2);
        goto L19
    L13:
        if (getScrollY() >= r2) goto L15;
        r2 = getScrollY();
        goto L19
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() != 0) goto L6;
        return 0.0f;
    L6:
        View r0 = getChildAt(0);
        FrameLayout.LayoutParams r1 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        int r2 = getVerticalFadingEdgeLength();
        int r02 = ((r0.getBottom() + r1.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (r02 < r2) goto L9;
        return 1.0f;
    L9:
        return r02 / r2;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        lw r0 = this.x;
        int r1 = r0.a;
        return r0.b | r1;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) goto L6;
        View r0 = getChildAt(0);
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        return Math.max(0, ((r0.getHeight() + r2.topMargin) + r2.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    L6:
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() != 0) goto L6;
        return 0.0f;
    L6:
        int r0 = getVerticalFadingEdgeLength();
        int r1 = getScrollY();
        if (r1 < r0) goto L9;
        return 1.0f;
    L9:
        return r1 / r0;
    }

    public final int h(Rect r11) {
        if (getChildCount() != 0) goto L5;
        return 0;
    L5:
        int r0 = getHeight();
        int r2 = getScrollY();
        int r3 = r2 + r0;
        int r4 = getVerticalFadingEdgeLength();
        if (r11.top <= 0) goto L8;
        r2 = r2 + r4;
    L8:
        View r5 = getChildAt(0);
        FrameLayout.LayoutParams r6 = (FrameLayout.LayoutParams) r5.getLayoutParams();
        if (r11.bottom >= ((r5.getHeight() + r6.topMargin) + r6.bottomMargin)) goto L11;
        int r42 = r3 - r4;
    L12:
        int r7 = r11.bottom;
        if (r7 <= r42) goto L23;
        if (r11.top <= r2) goto L23;
        if (r11.height() <= r0) goto L19;
        int r112 = r11.top - r2;
    L21:
        return Math.min(r112, (r5.getBottom() + r6.bottomMargin) - r3);
    L19:
        r112 = r11.bottom - r42;
    L23:
        if (r11.top >= r2) goto L31;
        if (r7 >= r42) goto L31;
        if (r11.height() <= r0) goto L28;
        int r1 = 0 - (r42 - r11.bottom);
    L30:
        return Math.max(r1, -getScrollY());
    L28:
        r1 = 0 - (r2 - r11.top);
    L31:
        return 0;
    L11:
        r42 = r3;
        goto L12
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.y.f(0);
    }

    public final void i(int r3) {
        if (r3 != 0) goto L4;
        return;
    L4:
        if (this.n == false) goto L7;
        t(0, r3, false);
        return;
    L7:
        scrollBy(0, r3);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.y.d;
    }

    public final boolean j(KeyEvent r8) {
        Rect r0 = this.c;
        r0.setEmpty();
        if (getChildCount() <= 0) goto L48;
        View r1 = getChildAt(0);
        FrameLayout.LayoutParams r5 = (FrameLayout.LayoutParams) r1.getLayoutParams();
        if (((r1.getHeight() + r5.topMargin) + r5.bottomMargin) <= ((getHeight() - getPaddingTop()) - getPaddingBottom())) goto L48;
        if (r8.getAction() != 0) goto L46;
        int r12 = r8.getKeyCode();
        int r6 = 33;
        if (r12 == 19) goto L41;
        if (r12 == 20) goto L35;
        if (r12 != 62) goto L46;
        if (r8.isShiftPressed() == true) goto L19;
        r6 = 130;
    L19:
        if (r6 != 130) goto L21;
        boolean r82 = true;
    L22:
        int r13 = getHeight();
        if (r82 == false) goto L29;
        r0.top = getScrollY() + r13;
        int r83 = getChildCount();
        if (r83 <= 0) goto L32;
        View r84 = getChildAt(r83 - 1);
        int r2 = getPaddingBottom() + (r84.getBottom() + ((FrameLayout.LayoutParams) r84.getLayoutParams()).bottomMargin);
        if ((r0.top + r13) <= r2) goto L32;
        r0.top = r2 - r13;
    L32:
        int r85 = r0.top;
        int r14 = r13 + r85;
        r0.bottom = r14;
        r(r6, r85, r14);
        return false;
    L29:
        int r86 = getScrollY() - r13;
        r0.top = r86;
        if (r86 >= 0) goto L32;
        r0.top = 0;
        goto L32
    L21:
        r82 = false;
        goto L22
    L35:
        if (r8.isAltPressed() == true) goto L39;
        return g(130);
    L39:
        return l(130);
    L41:
        if (r8.isAltPressed() == true) goto L45;
        return g(33);
    L45:
        return l(33);
    L46:
        return false;
    L48:
        if (isFocused() == true) goto L50;
    L60:
        return false;
    L50:
        if (r8.getKeyCode() == 4) goto L60;
        View r87 = findFocus();
        if (r87 != this) goto L54;
        r87 = null;
    L54:
        View r88 = FocusFinder.getInstance().findNextFocus(this, r87, 130);
        if (r88 == null) goto L60;
        if (r88 == this) goto L60;
        if (r88.requestFocus(130) == false) goto L60;
        return true;
    }

    public final void k(int r13) {
        if (getChildCount() <= 0) goto L6;
        int r2 = getScrollX();
        int r3 = getScrollY();
        this.d.fling(r2, r3, 0, r13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        this.y.g(2, 1);
        this.v = getScrollY();
        WeakHashMap r132 = ja0.a;
        s90.k(this);
        return;
    }

    public final boolean l(int r6) {
        if (r6 != 130) goto L5;
        boolean r0 = true;
    L6:
        int r3 = getHeight();
        Rect r4 = this.c;
        r4.top = 0;
        r4.bottom = r3;
        if (r0 == false) goto L12;
        int r02 = getChildCount();
        if (r02 <= 0) goto L12;
        View r03 = getChildAt(r02 - 1);
        int r1 = getPaddingBottom() + (r03.getBottom() + ((FrameLayout.LayoutParams) r03.getLayoutParams()).bottomMargin);
        r4.bottom = r1;
        r4.top = r1 - r3;
    L12:
        return r(r6, r4.top, r4.bottom);
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View r3, int r4, int r5) {
        ViewGroup.LayoutParams r52 = r3.getLayoutParams();
        int r0 = getPaddingLeft();
        r3.measure(ViewGroup.getChildMeasureSpec(r4, getPaddingRight() + r0, r52.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View r2, int r3, int r4, int r5, int r6) {
        ViewGroup.MarginLayoutParams r52 = (ViewGroup.MarginLayoutParams) r2.getLayoutParams();
        int r62 = getPaddingLeft();
        r2.measure(ViewGroup.getChildMeasureSpec(r3, (((getPaddingRight() + r62) + r52.leftMargin) + r52.rightMargin) + r4, r52.width), View.MeasureSpec.makeMeasureSpec(r52.topMargin + r52.bottomMargin, 0));
    }

    public final boolean n(View r3, int r4, int r5) {
        Rect r0 = this.c;
        r3.getDrawingRect(r0);
        offsetDescendantRectToMyCoords(r3, r0);
        if ((r0.bottom + r4) >= getScrollY()) goto L5;
        return false;
    L5:
        if ((r0.top - r4) > (getScrollY() + r5)) goto L10;
        return true;
    L10:
        return false;
    }

    public final void o(int r11, int r12, int[] r13) {
        int r0 = getScrollY();
        scrollBy(0, r11);
        int r4 = getScrollY() - r0;
        if (r13 == null) goto L5;
        r13[1] = r13[1] + r4;
    L5:
        iw r2 = this.y;
        r2.d(0, r4, 0, r11 - r4, null, r12, r13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent r9) {
        int r2 = 0;
        if (r9.getAction() == 8) goto L5;
    L41:
        return false;
    L5:
        if (this.k == true) goto L41;
        if (zt.B(r9, 2) == false) goto L10;
        float r0 = r9.getAxisValue(9);
    L14:
        if (r0 == 0.0f) goto L41;
        int r02 = (int) (r0 * getVerticalScrollFactorCompat());
        int r1 = getScrollRange();
        int r3 = getScrollY();
        int r03 = r3 - r02;
        if (r03 >= 0) goto L26;
        int r12 = getOverScrollMode();
        if (r12 == 0) goto L23;
        if (r12 == 1) goto L21;
    L25:
        boolean r92 = 0;
    L37:
        if (r2 == r3) goto L40;
        super.scrollTo(getScrollX(), r2);
        return true;
    L40:
        return r92;
    L21:
        if (getScrollRange() <= 0) goto L25;
    L23:
        if (zt.B(r9, 8194) == true) goto L25;
        float r93 = (-r03) / getHeight();
        EdgeEffect r04 = this.e;
        a80.w(r04, r93, 0.5f);
        r04.onRelease();
        invalidate();
        r92 = 1;
        goto L37
    L26:
        if (r03 <= r1) goto L36;
        int r7 = getOverScrollMode();
        if (r7 == 0) goto L33;
        if (r7 == 1) goto L31;
    L35:
        r92 = r2;
        r2 = r1;
        goto L37
    L31:
        if (getScrollRange() <= 0) goto L35;
    L33:
        if (zt.B(r9, 8194) == true) goto L35;
        float r94 = (r03 - r1) / getHeight();
        EdgeEffect r05 = this.f;
        a80.w(r05, r94, 0.5f);
        r05.onRelease();
        invalidate();
        r2 = 1;
        goto L35
    L36:
        r92 = 0;
        r2 = r03;
        goto L37
    L10:
        if (zt.B(r9, 4194304) == false) goto L12;
        r0 = r9.getAxisValue(26);
        goto L14
    L12:
        r0 = 0.0f;
        goto L14
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r13) {
        int r0 = r13.getAction();
        boolean r1 = true;
        if (r0 == 2) goto L5;
    L7:
        int r02 = r0 & 255;
        if (r02 != 0) goto L10;
        int r03 = (int) r13.getY();
        int r5 = (int) r13.getX();
        int r6 = getChildCount();
        OverScroller r7 = this.d;
        if (r6 <= 0) goto L63;
        int r62 = getScrollY();
        View r8 = getChildAt(0);
        if (r03 < (r8.getTop() - r62)) goto L63;
        if (r03 >= (r8.getBottom() - r62)) goto L63;
        if (r5 < r8.getLeft()) goto L63;
        if (r5 >= r8.getRight()) goto L63;
        this.g = r03;
        this.r = r13.getPointerId(0);
        VelocityTracker r04 = this.l;
        if (r04 != null) goto L54;
        this.l = VelocityTracker.obtain();
    L55:
        this.l.addMovement(r13);
        r7.computeScrollOffset();
        if (u(r13) == false) goto L58;
    L61:
        this.k = r1;
        this.y.g(2, 0);
    L72:
        return this.k;
    L58:
        if (r7.isFinished() == false) goto L61;
        r1 = false;
        goto L61
    L54:
        r04.clear();
    L63:
        if (u(r13) == false) goto L65;
    L68:
        this.k = r1;
        VelocityTracker r132 = this.l;
        if (r132 == null) goto L72;
        r132.recycle();
        this.l = null;
        goto L72
    L65:
        if (r7.isFinished() == false) goto L68;
        r1 = false;
        goto L68
    L10:
        if (r02 == 1) goto L34;
        if (r02 != 2) goto L13;
        int r05 = this.r;
        if (r05 == (-1)) goto L72;
        int r3 = r13.findPointerIndex(r05);
        if (r3 != (-1)) goto L24;
        Log.e("NestedScrollView", "Invalid pointerId=" + r05 + " in onInterceptTouchEvent");
        goto L72
    L24:
        int r06 = (int) r13.getY(r3);
        if (Math.abs(r06 - this.g) <= this.o) goto L72;
        if ((2 & getNestedScrollAxes()) != 0) goto L72;
        this.k = true;
        this.g = r06;
        if (this.l != null) goto L31;
        this.l = VelocityTracker.obtain();
    L31:
        this.l.addMovement(r13);
        this.u = 0;
        ViewParent r133 = getParent();
        if (r133 == null) goto L72;
        r133.requestDisallowInterceptTouchEvent(true);
        goto L72
    L13:
        if (r02 == 3) goto L34;
        if (r02 != 6) goto L72;
        p(r13);
    L34:
        this.k = false;
        this.r = -1;
        VelocityTracker r134 = this.l;
        if (r134 == null) goto L38;
        r134.recycle();
        this.l = null;
    L38:
        if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L40;
        WeakHashMap r135 = ja0.a;
        s90.k(this);
    L40:
        v(0);
        goto L72
    L5:
        if (this.k == false) goto L7;
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        super.onLayout(r3, r4, r5, r6, r7);
        int r42 = 0;
        this.h = false;
        View r62 = this.j;
        if (r62 != null) goto L5;
    L9:
        this.j = null;
        if (this.i == false) goto L12;
    L28:
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
        return;
    L12:
        if (this.w == null) goto L15;
        scrollTo(getScrollX(), this.w.a);
        this.w = null;
    L15:
        if (getChildCount() <= 0) goto L17;
        View r63 = getChildAt(0);
        FrameLayout.LayoutParams r0 = (FrameLayout.LayoutParams) r63.getLayoutParams();
        int r64 = (r63.getMeasuredHeight() + r0.topMargin) + r0.bottomMargin;
    L18:
        int r72 = ((r7 - r5) - getPaddingTop()) - getPaddingBottom();
        int r52 = getScrollY();
        if (r72 >= r64) goto L26;
        if (r52 < 0) goto L26;
        if ((r72 + r52) <= r64) goto L25;
        r42 = r64 - r72;
        goto L26
    L25:
        r42 = r52;
    L26:
        if (r42 == r52) goto L28;
        scrollTo(getScrollX(), r42);
        goto L28
    L17:
        r64 = 0;
        goto L18
    L5:
        if (m(r62, this) == false) goto L9;
        View r65 = this.j;
        Rect r02 = this.c;
        r65.getDrawingRect(r02);
        offsetDescendantRectToMyCoords(r65, r02);
        int r66 = h(r02);
        if (r66 == 0) goto L9;
        scrollBy(0, r66);
        goto L9
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        if (this.m == true) goto L6;
        return;
    L6:
        if (View.MeasureSpec.getMode(r6) != 0) goto L9;
        return;
    L9:
        if (getChildCount() <= 0) goto L14;
        View r62 = getChildAt(0);
        FrameLayout.LayoutParams r0 = (FrameLayout.LayoutParams) r62.getLayoutParams();
        int r1 = r62.getMeasuredHeight();
        int r2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - r0.topMargin) - r0.bottomMargin;
        if (r1 >= r2) goto L15;
        int r12 = getPaddingLeft();
        r62.measure(ViewGroup.getChildMeasureSpec(r5, ((getPaddingRight() + r12) + r0.leftMargin) + r0.rightMargin, r0.width), View.MeasureSpec.makeMeasureSpec(r2, 1073741824));
        return;
    L15:
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View r1, float r2, float r3, boolean r4) {
        if (r4 == true) goto L5;
        dispatchNestedFling(0.0f, r3, true);
        k((int) r3);
        return true;
    L5:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View r1, float r2, float r3) {
        return this.y.b(r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r7, int r8, int r9, int[] r10) {
        this.y.c(r8, r9, r10, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r1, int r2, int r3, int r4, int r5) {
        o(r5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r2, View r3, int r4) {
        a(r2, r3, r4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
        super.scrollTo(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, Rect r5) {
        if (r4 != 2) goto L6;
        r4 = 130;
    L8:
        if (r5 != null) goto L10;
        View r0 = FocusFinder.getInstance().findNextFocus(this, null, r4);
    L12:
        if (r0 != null) goto L15;
    L16:
        return false;
    L15:
        if (n(r0, 0, getHeight()) == false) goto L16;
        return r0.requestFocus(r4, r5);
    L10:
        r0 = FocusFinder.getInstance().findNextFocusFromRect(this, r5, r4);
        goto L12
    L6:
        if (r4 != 1) goto L8;
        r4 = 33;
        goto L8
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof hw) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        hw r22 = (hw) r2;
        super.onRestoreInstanceState(r22.getSuperState());
        this.w = r22;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        hw r1 = new hw(super.onSaveInstanceState());
        r1.a = getScrollY();
        return r1;
    }

    @Override // android.view.View
    public final void onScrollChanged(int r1, int r2, int r3, int r4) {
        super.onScrollChanged(r1, r2, r3, r4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        View r12 = findFocus();
        if (r12 == null) goto L10;
        if (this != r12) goto L7;
        return;
    L7:
        if (n(r12, 0, r4) == false) goto L11;
        Rect r22 = this.c;
        r12.getDrawingRect(r22);
        offsetDescendantRectToMyCoords(r12, r22);
        i(h(r22));
        return;
    L11:
        return;
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
    public final boolean onTouchEvent(MotionEvent r28) {
        if (this.l != null) goto L5;
        this.l = VelocityTracker.obtain();
    L5:
        int r2 = r28.getActionMasked();
        if (r2 != 0) goto L8;
        this.u = 0;
    L8:
        MotionEvent r4 = MotionEvent.obtain(r28);
        float r6 = 0.0f;
        r4.offsetLocation(0.0f, this.u);
        iw r5 = this.y;
        if (r2 == 0) goto L128;
        EdgeEffect r11 = this.e;
        EdgeEffect r12 = this.f;
        if (r2 == 1) goto L100;
        if (r2 != 2) goto L14;
        int r22 = r28.findPointerIndex(this.r);
        if (r22 != (-1)) goto L36;
        Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
    L139:
        VelocityTracker r1 = this.l;
        if (r1 == null) goto L142;
        r1.addMovement(r4);
    L142:
        r4.recycle();
        return true;
    L36:
        int r7 = (int) r28.getY(r22);
        int r9 = this.g - r7;
        float r10 = r28.getX(r22) / getWidth();
        float r13 = r9 / getHeight();
        if (a80.k(r11) == 0.0f) goto L43;
        float r102 = -a80.w(r11, -r13, r10);
        if (a80.k(r11) != 0.0f) goto L41;
        r11.onRelease();
    L41:
        r6 = r102;
    L47:
        int r62 = Math.round(r6 * getHeight());
        if (r62 == 0) goto L50;
        invalidate();
    L50:
        int r92 = r9 - r62;
        if (this.k == true) goto L60;
        int r63 = Math.abs(r92);
        int r103 = this.o;
        if (r63 <= r103) goto L60;
        ViewParent r64 = getParent();
        if (r64 == null) goto L57;
        r64.requestDisallowInterceptTouchEvent(true);
    L57:
        this.k = true;
        if (r92 <= 0) goto L61;
        r92 = r92 - r103;
        goto L60
    L61:
        r92 = r92 + r103;
    L60:
        int r18 = r92;
        if (this.k == false) goto L139;
        boolean r65 = this.y.c(0, r18, this.t, this.s, 0);
        int[] r93 = this.t;
        int[] r104 = this.s;
        if (r65 == false) goto L67;
        r18 = r18 - r93[1];
        this.u += r104[1];
    L67:
        int r66 = r18;
        this.g = r7 - r104[1];
        int r72 = getScrollY();
        int r132 = getScrollRange();
        int r14 = getOverScrollMode();
        if (r14 == 0) goto L74;
        if (r14 != 1) goto L72;
        if (r132 > 0) goto L74;
    L72:
        boolean r142 = false;
    L76:
        if (q(r66, 0, getScrollY(), r132) == true) goto L78;
    L80:
        boolean r52 = false;
    L81:
        int r21 = getScrollY() - r72;
        r93[1] = 0;
        this.y.d(0, r21, 0, r66 - r21, this.s, 0, r93);
        int r3 = this.g;
        int r94 = r104[1];
        this.g = r3 - r94;
        this.u += r94;
        if (r142 == false) goto L97;
        int r67 = r66 - r93[1];
        int r73 = r72 + r67;
        if (r73 >= 0) goto L88;
        a80.w(r11, (-r67) / getHeight(), r28.getX(r22) / getWidth());
        if (r12.isFinished() == true) goto L93;
        r12.onRelease();
    L93:
        if (r11.isFinished() == true) goto L95;
    L96:
        WeakHashMap r15 = ja0.a;
        s90.k(this);
        boolean r32 = false;
    L98:
        if (r32 == false) goto L139;
        this.l.clear();
        goto L139
    L95:
        if (r12.isFinished() == true) goto L97;
    L88:
        if (r73 <= r132) goto L93;
        a80.w(r12, r67 / getHeight(), 1.0f - (r28.getX(r22) / getWidth()));
        if (r11.isFinished() == true) goto L93;
        r11.onRelease();
    L97:
        r32 = r52;
        goto L98
    L78:
        if (r5.f(0) == true) goto L80;
        r52 = true;
    L74:
        r142 = true;
        goto L76
    L43:
        if (a80.k(r12) == 0.0f) goto L47;
        r102 = a80.w(r12, r13, 1.0f - r10);
        if (a80.k(r12) != 0.0f) goto L41;
        r12.onRelease();
        goto L41
    L14:
        if (r2 == 3) goto L23;
        if (r2 != 5) goto L18;
        int r23 = r28.getActionIndex();
        this.g = (int) r28.getY(r23);
        this.r = r28.getPointerId(r23);
        goto L139
    L18:
        if (r2 != 6) goto L139;
        p(r28);
        this.g = (int) r28.getY(r28.findPointerIndex(this.r));
        goto L139
    L23:
        if (this.k == true) goto L25;
    L29:
        this.r = -1;
        this.k = false;
        VelocityTracker r16 = this.l;
        if (r16 == null) goto L32;
        r16.recycle();
        this.l = null;
    L32:
        v(0);
        r11.onRelease();
        r12.onRelease();
        goto L139
    L25:
        if (getChildCount() <= 0) goto L29;
        if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L29;
        WeakHashMap r17 = ja0.a;
        s90.k(this);
        goto L29
    L100:
        VelocityTracker r19 = this.l;
        r19.computeCurrentVelocity(1000, this.q);
        int r110 = (int) r19.getYVelocity(this.r);
        if (Math.abs(r110) < this.p) goto L121;
        if (a80.k(r11) == 0.0f) goto L110;
        if (s(r11, r110) == false) goto L108;
        r11.onAbsorb(r110);
    L107:
        boolean r24 = true;
    L116:
        if (r24 == true) goto L123;
        int r111 = -r110;
        float r25 = r111;
        if (r5.b(0.0f, r25) == true) goto L123;
        dispatchNestedFling(0.0f, r25, true);
        k(r111);
    L123:
        this.r = -1;
        this.k = false;
        VelocityTracker r112 = this.l;
        if (r112 == null) goto L126;
        r112.recycle();
        this.l = null;
    L126:
        v(0);
        r11.onRelease();
        r12.onRelease();
        goto L139
    L108:
        k(-r110);
        goto L107
    L110:
        if (a80.k(r12) == 0.0f) goto L115;
        int r26 = -r110;
        if (s(r12, r26) == false) goto L114;
        r12.onAbsorb(r26);
        goto L107
    L114:
        k(r26);
        goto L107
    L115:
        r24 = false;
        goto L116
    L121:
        if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L123;
        WeakHashMap r113 = ja0.a;
        s90.k(this);
        goto L123
    L128:
        if (getChildCount() != 0) goto L131;
        return false;
    L131:
        if (this.k == false) goto L135;
        ViewParent r27 = getParent();
        if (r27 == null) goto L135;
        r27.requestDisallowInterceptTouchEvent(true);
    L135:
        OverScroller r29 = this.d;
        if (r29.isFinished() == true) goto L138;
        r29.abortAnimation();
        v(1);
    L138:
        this.g = (int) r28.getY();
        this.r = r28.getPointerId(0);
        r5.g(2, 0);
        goto L139
    }

    public final void p(MotionEvent r4) {
        int r0 = r4.getActionIndex();
        if (r4.getPointerId(r0) != this.r) goto L11;
        if (r0 != 0) goto L6;
        int r02 = 1;
    L7:
        this.g = (int) r4.getY(r02);
        this.r = r4.getPointerId(r02);
        VelocityTracker r42 = this.l;
        if (r42 == null) goto L12;
        r42.clear();
        return;
    L12:
        return;
    L6:
        r02 = 0;
        goto L7
    }

    public final boolean q(int r10, int r11, int r12, int r13) {
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int r122 = r12 + r10;
        if (r11 <= 0) goto L5;
    L4:
        int r3 = 0;
        boolean r112 = true;
    L8:
        if (r122 <= r13) goto L11;
        int r4 = r13;
    L10:
        boolean r123 = true;
    L14:
        if (r123 == true) goto L16;
    L18:
        super.scrollTo(r3, r4);
        if (r112 == true) goto L23;
        if (r123 == true) goto L23;
        return false;
    L23:
        return true;
    L16:
        if (this.y.f(1) == true) goto L18;
        this.d.springBack(r3, r4, 0, 0, 0, getScrollRange());
        goto L18
    L11:
        if (r122 >= 0) goto L13;
        r4 = 0;
        goto L10
    L13:
        r4 = r122;
        r123 = false;
        goto L14
    L5:
        if (r11 < 0) goto L4;
        r3 = r11;
        r112 = false;
        goto L8
    }

    public final boolean r(int r18, int r19, int r20) {
        int r4 = getHeight();
        int r5 = getScrollY();
        int r42 = r4 + r5;
        if (r18 != 33) goto L5;
        boolean r6 = true;
    L6:
        ArrayList<View> r9 = getFocusables(2);
        int r10 = r9.size();
        View r11 = null;
        int r12 = 0;
        boolean r13 = false;
    L7:
        if (r12 >= r10) goto L34;
        View r14 = r9.get(r12);
        int r15 = r14.getTop();
        int r7 = r14.getBottom();
        if (r19 >= r7) goto L33;
        if (r15 >= r20) goto L33;
        if (r19 >= r15) goto L14;
        if (r7 >= r20) goto L14;
        boolean r16 = true;
    L15:
        if (r11 != null) goto L17;
        r11 = r14;
        r13 = r16;
        goto L33
    L17:
        if (r6 == true) goto L19;
    L20:
        if (r6 == false) goto L22;
    L24:
        boolean r72 = false;
    L25:
        if (r13 == false) goto L29;
        if (r16 == false) goto L33;
        if (r72 == false) goto L33;
    L32:
        r11 = r14;
        goto L33
    L29:
        if (r16 == false) goto L31;
        r11 = r14;
        r13 = true;
        goto L33
    L31:
        if (r72 == false) goto L33;
    L22:
        if (r7 <= r11.getBottom()) goto L24;
    L23:
        r72 = true;
        goto L25
    L19:
        if (r15 < r11.getTop()) goto L23;
    L14:
        r16 = false;
    L33:
        r12 = r12 + 1;
        goto L7
    L34:
        if (r11 != null) goto L36;
        r11 = this;
    L36:
        if (r19 < r5) goto L39;
        if (r20 > r42) goto L39;
        boolean r73 = false;
    L44:
        if (r11 == findFocus()) goto L46;
        r11.requestFocus(r18);
    L46:
        return r73;
    L39:
        if (r6 == false) goto L41;
        int r2 = r19 - r5;
    L42:
        i(r2);
        r73 = true;
        goto L44
    L41:
        r2 = r20 - r42;
        goto L42
    L5:
        r6 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View r3, View r4) {
        if (this.h == true) goto L7;
        Rect r0 = this.c;
        r4.getDrawingRect(r0);
        offsetDescendantRectToMyCoords(r4, r0);
        int r02 = h(r0);
        if (r02 == 0) goto L8;
        scrollBy(0, r02);
    L8:
        super.requestChildFocus(r3, r4);
        return;
    L7:
        this.j = r4;
        goto L8
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r3, Rect r4, boolean r5) {
        r4.offset(r3.getLeft() - r3.getScrollX(), r3.getTop() - r3.getScrollY());
        int r32 = h(r4);
        if (r32 == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        if (r5 == false) goto L10;
        scrollBy(0, r32);
        return r0;
    L10:
        t(0, r32, false);
    L11:
        return r0;
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
        if (r2 == false) goto L6;
        VelocityTracker r0 = this.l;
        if (r0 == null) goto L6;
        r0.recycle();
        this.l = null;
    L6:
        super.requestDisallowInterceptTouchEvent(r2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect r10, int r11) {
        if (r11 <= 0) goto L5;
        return true;
    L5:
        float r102 = a80.k(r10) * getHeight();
        float r112 = Math.abs(-r11) * 0.35f;
        float r2 = this.a * 0.015f;
        double r3 = Math.log(r112 / r2);
        double r5 = A;
        if (((float) (Math.exp((r5 / (r5 - 1.0d)) * r3) * ((double) r2))) >= r102) goto L8;
        return true;
    L8:
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int r8, int r9) {
        if (getChildCount() <= 0) goto L25;
        View r1 = getChildAt(0);
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) r1.getLayoutParams();
        int r3 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int r4 = (r1.getWidth() + r2.leftMargin) + r2.rightMargin;
        int r5 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int r12 = (r1.getHeight() + r2.topMargin) + r2.bottomMargin;
        if (r3 >= r4) goto L11;
        if (r8 < 0) goto L11;
        if ((r3 + r8) <= r4) goto L12;
        r8 = r4 - r3;
    L12:
        if (r5 >= r12) goto L18;
        if (r9 < 0) goto L18;
        if ((r5 + r9) <= r12) goto L20;
        r9 = r12 - r5;
    L20:
        if (r8 == getScrollX()) goto L22;
    L23:
        super.scrollTo(r8, r9);
        return;
    L22:
        if (r9 != getScrollY()) goto L23;
        return;
    L18:
        r9 = 0;
    L11:
        r8 = 0;
        goto L12
    }

    public void setFillViewport(boolean r2) {
        if (r2 == this.m) goto L6;
        this.m = r2;
        requestLayout();
        return;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
        iw r0 = this.y;
        if (r0.d == false) goto L5;
        ViewGroup r1 = r0.c;
        WeakHashMap r2 = ja0.a;
        y90.z(r1);
    L5:
        r0.d = r4;
    }

    public void setSmoothScrollingEnabled(boolean r1) {
        this.n = r1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return this.y.g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int r10, int r11, boolean r12) {
        if (getChildCount() != 0) goto L6;
        return;
    L6:
        if ((AnimationUtils.currentAnimationTimeMillis() - this.b) <= 250) goto L12;
        View r0 = getChildAt(0);
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        int r02 = (r0.getHeight() + r2.topMargin) + r2.bottomMargin;
        int r22 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int r5 = getScrollY();
        int r112 = r11 + r5;
        int r7 = Math.max(0, Math.min(r112, Math.max(0, r02 - r22))) - r5;
        int r4 = getScrollX();
        this.d.startScroll(r4, r5, 0, r7, 250);
        if (r12 == false) goto L10;
        this.y.g(2, 1);
    L11:
        this.v = getScrollY();
        WeakHashMap r102 = ja0.a;
        s90.k(this);
    L16:
        this.b = AnimationUtils.currentAnimationTimeMillis();
        return;
    L10:
        v(1);
        goto L11
    L12:
        OverScroller r122 = this.d;
        if (r122.isFinished() == true) goto L15;
        r122.abortAnimation();
        v(1);
    L15:
        scrollBy(r10, r11);
        goto L16
    }

    public final boolean u(MotionEvent r6) {
        EdgeEffect r0 = this.e;
        if (a80.k(r0) == 0.0f) goto L5;
        a80.w(r0, 0.0f, r6.getX() / getWidth());
        boolean r02 = true;
    L6:
        EdgeEffect r1 = this.f;
        if (a80.k(r1) == 0.0f) goto L10;
        a80.w(r1, 0.0f, 1.0f - (r6.getX() / getWidth()));
        return true;
    L10:
        return r02;
    L5:
        r02 = false;
        goto L6
    }

    public final void v(int r2) {
        this.y.h(r2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2, r3);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View r2, ViewGroup.LayoutParams r3) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2, r3);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        if (getChildCount() > 0) goto L7;
        super.addView(r2, r3, r4);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(gw r1) {
    }
}
