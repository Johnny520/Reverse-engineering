package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
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
import androidx.core.view.ScrollingView;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC0164Ds;
import p000.AbstractC0616OD;
import p000.AbstractC0671Pj;
import p000.AbstractC1031Y;
import p000.AbstractC1140af;
import p000.AbstractC1360eE;
import p000.AbstractC2185lE;
import p000.C0250Fs;
import p000.C0293Gs;
import p000.C0377Iq;
import p000.C0422Js;
import p000.C0659PD;
import p000.C0708Qd;
import p000.C1017Xm;
import p000.C2519sx;
import p000.InterfaceC0207Es;
import p000.InterfaceC0379Is;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0379Is, ScrollingView {

    /* JADX INFO: renamed from: C */
    public static final float f3929C = 0.0f;

    /* JADX INFO: renamed from: D */
    public static final C0377Iq f3930D = null;

    /* JADX INFO: renamed from: E */
    public static final int[] f3931E = null;

    /* JADX INFO: renamed from: A */
    public float f3932A;

    /* JADX INFO: renamed from: B */
    public final C0708Qd f3933B;

    /* JADX INFO: renamed from: a */
    public final float f3934a;

    /* JADX INFO: renamed from: b */
    public long f3935b;

    /* JADX INFO: renamed from: c */
    public final Rect f3936c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f3937d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f3938e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f3939f;

    /* JADX INFO: renamed from: g */
    public C2519sx f3940g;

    /* JADX INFO: renamed from: h */
    public int f3941h;

    /* JADX INFO: renamed from: i */
    public boolean f3942i;

    /* JADX INFO: renamed from: j */
    public boolean f3943j;

    /* JADX INFO: renamed from: k */
    public View f3944k;

    /* JADX INFO: renamed from: l */
    public boolean f3945l;

    /* JADX INFO: renamed from: m */
    public VelocityTracker f3946m;

    /* JADX INFO: renamed from: n */
    public boolean f3947n;

    /* JADX INFO: renamed from: o */
    public boolean f3948o;

    /* JADX INFO: renamed from: p */
    public final int f3949p;

    /* JADX INFO: renamed from: q */
    public final int f3950q;

    /* JADX INFO: renamed from: r */
    public final int f3951r;

    /* JADX INFO: renamed from: s */
    public int f3952s;

    /* JADX INFO: renamed from: t */
    public final int[] f3953t;

    /* JADX INFO: renamed from: u */
    public final int[] f3954u;

    /* JADX INFO: renamed from: v */
    public int f3955v;

    /* JADX INFO: renamed from: w */
    public int f3956w;

    /* JADX INFO: renamed from: x */
    public C0250Fs f3957x;

    /* JADX INFO: renamed from: y */
    public final C0422Js f3958y;

    /* JADX INFO: renamed from: z */
    public final C0293Gs f3959z;

    static {
        f3929C = (float) (Math.log(0.78d) / Math.log(0.9d));
        f3930D = new C0377Iq(3);
        f3931E = new int[]{R.attr.fillViewport};
    }

    public NestedScrollView(Context r7, AttributeSet r8) {
        super(r7, r8, io.github.cherrywechat.R.attr.nestedScrollViewStyle);
        this.f3936c = new Rect();
        this.f3942i = true;
        this.f3943j = false;
        this.f3944k = null;
        this.f3945l = false;
        this.f3948o = true;
        this.f3952s = -1;
        this.f3953t = new int[2];
        this.f3954u = new int[2];
        C1017Xm r3 = new C1017Xm(9, this);
        this.f3933B = new C0708Qd(getContext(), r3);
        int r32 = Build.VERSION.SDK_INT;
        if (r32 < 31) goto L5;
        EdgeEffect r5 = AbstractC1140af.m2055a(r7, r8);
    L6:
        this.f3938e = r5;
        if (r32 < 31) goto L9;
        EdgeEffect r33 = AbstractC1140af.m2055a(r7, r8);
    L10:
        this.f3939f = r33;
        this.f3934a = ((r7.getResources().getDisplayMetrics().density * 160.0f) * 386.0878f) * 0.84f;
        this.f3937d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration r34 = ViewConfiguration.get(getContext());
        this.f3949p = r34.getScaledTouchSlop();
        this.f3950q = r34.getScaledMinimumFlingVelocity();
        this.f3951r = r34.getScaledMaximumFlingVelocity();
        TypedArray r72 = r7.obtainStyledAttributes(r8, f3931E, io.github.cherrywechat.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(r72.getBoolean(0, false));
        r72.recycle();
        this.f3958y = new C0422Js();
        this.f3959z = new C0293Gs(this);
        setNestedScrollingEnabled(true);
        AbstractC2185lE.m4399l(this, f3930D);
        return;
    L9:
        r33 = new EdgeEffect(r7);
        goto L10
    L5:
        r5 = new EdgeEffect(r7);
        goto L6
    }

    private C2519sx getScrollFeedbackProvider() {
        if (this.f3940g != null) goto L6;
        this.f3940g = new C2519sx(this);
    L6:
        return this.f3940g;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m2145m(View r1, NestedScrollView r2) {
        if (r1 == r2) goto L12;
        Object r12 = r1.getParent();
        if ((r12 instanceof ViewGroup) == true) goto L7;
        return false;
    L7:
        if (m2145m((View) r12, r2) == false) goto L13;
        return true;
    L13:
        return false;
    L12:
        return true;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: a */
    public final void mo720a(View r1, View r2, int r3, int r4) {
        C0422Js r22 = this.f3958y;
        if (r4 != 1) goto L5;
        r22.f1404b = r3;
    L6:
        m2161w(2, r4);
        return;
    L5:
        r22.f1403a = r3;
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

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: b */
    public final void mo721b(View r3, int r4) {
        C0422Js r0 = this.f3958y;
        if (r4 != 1) goto L5;
        r0.f1404b = 0;
    L6:
        m2163y(r4);
        return;
    L5:
        r0.f1403a = 0;
        goto L6
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: c */
    public final void mo722c(View r7, int r8, int r9, int[] r10, int r11) {
        m2148i(r8, r9, r10, null, r11);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f3937d.isFinished() == false) goto L5;
        return;
    L5:
        this.f3937d.computeScrollOffset();
        int r1 = this.f3937d.getCurrY();
        int r2 = r1 - this.f3956w;
        int r3 = getHeight();
        EdgeEffect r6 = this.f3938e;
        EdgeEffect r7 = this.f3939f;
        if (r2 > 0) goto L8;
    L13:
        if (r2 < 0) goto L15;
    L19:
        this.f3956w = r1;
        int[] r15 = this.f3954u;
        r15[1] = 0;
        m2148i(0, r2, r15, null, 1);
        int r22 = r2 - r15[1];
        int r12 = getScrollRange();
        if (Build.VERSION.SDK_INT < 35) goto L22;
        AbstractC0164Ds.m312a(this, Math.abs(this.f3937d.getCurrVelocity()));
    L22:
        if (r22 == 0) goto L24;
        int r32 = getScrollY();
        m2155q(r22, getScrollX(), r32, r12);
        int r10 = getScrollY() - r32;
        int r122 = r22 - r10;
        r15[1] = 0;
        int r33 = 1;
        this.f3959z.m595d(0, r10, 0, r122, this.f3953t, 1, r15);
        r22 = r122 - r15[1];
    L25:
        if (r22 == 0) goto L39;
        int r4 = getOverScrollMode();
        if (r4 == 0) goto L30;
        if (r4 != r33) goto L37;
        if (r12 > 0) goto L30;
    L37:
        this.f3937d.abortAnimation();
        m2163y(r33);
    L30:
        if (r22 >= 0) goto L35;
        if (r6.isFinished() == false) goto L37;
        r6.onAbsorb((int) this.f3937d.getCurrVelocity());
        goto L37
    L35:
        if (r7.isFinished() == false) goto L37;
        r7.onAbsorb((int) this.f3937d.getCurrVelocity());
    L39:
        if (this.f3937d.isFinished() == true) goto L42;
        postInvalidateOnAnimation();
        return;
    L42:
        m2163y(r33);
        return;
    L24:
        r33 = 1;
        goto L25
    L15:
        if (AbstractC0671Pj.m1352l(r7) == 0.0f) goto L19;
        float r34 = r3;
        int r35 = Math.round(AbstractC0671Pj.m1355t(r7, (r2 * 4.0f) / r34, 0.5f) * (r34 / 4.0f));
        if (r35 != r2) goto L18;
    L12:
        r2 = r2 - r35;
        goto L19
    L18:
        r7.finish();
        goto L12
    L8:
        if (AbstractC0671Pj.m1352l(r6) == 0.0f) goto L13;
        r35 = Math.round(AbstractC0671Pj.m1355t(r6, ((-r2) * 4.0f) / r3, 0.5f) * ((-r3) / 4.0f));
        if (r35 == r2) goto L12;
        r6.finish();
        goto L12
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
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

    @Override // p000.InterfaceC0379Is
    /* JADX INFO: renamed from: d */
    public final void mo820d(View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        m2153o(r5, r6, r7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        if (super.dispatchKeyEvent(r2) == false) goto L5;
        return true;
    L5:
        if (m2149j(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
        return this.f3959z.m592a(r2, r3, r4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
        return this.f3959z.m593b(r2, r3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return this.f3959z.m594c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return this.f3959z.m595d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas r11) {
        super.draw(r11);
        int r0 = getScrollY();
        EdgeEffect r1 = this.f3938e;
        int r3 = 0;
        if (r1.isFinished() == true) goto L15;
        int r2 = r11.save();
        int r4 = getWidth();
        int r5 = getHeight();
        int r6 = Math.min(0, r0);
        if (getClipToPadding() == false) goto L7;
        r4 = r4 - (getPaddingRight() + getPaddingLeft());
        int r7 = getPaddingLeft();
    L9:
        if (getClipToPadding() == false) goto L11;
        r5 = r5 - (getPaddingBottom() + getPaddingTop());
        r6 = r6 + getPaddingTop();
    L11:
        r11.translate(r7, r6);
        r1.setSize(r4, r5);
        if (r1.draw(r11) == false) goto L14;
        postInvalidateOnAnimation();
    L14:
        r11.restoreToCount(r2);
        goto L15
    L7:
        r7 = 0;
    L15:
        EdgeEffect r12 = this.f3939f;
        if (r12.isFinished() == true) goto L28;
        int r22 = r11.save();
        int r42 = getWidth();
        int r52 = getHeight();
        int r02 = Math.max(getScrollRange(), r0) + r52;
        if (getClipToPadding() == false) goto L21;
        r42 = r42 - (getPaddingRight() + getPaddingLeft());
        r3 = getPaddingLeft();
    L21:
        if (getClipToPadding() == false) goto L23;
        r52 = r52 - (getPaddingBottom() + getPaddingTop());
        r02 = r02 - getPaddingBottom();
    L23:
        r11.translate(r3 - r42, r02);
        r11.rotate(180.0f, r42, 0.0f);
        r12.setSize(r42, r52);
        if (r12.draw(r11) == false) goto L26;
        postInvalidateOnAnimation();
    L26:
        r11.restoreToCount(r22);
        return;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: e */
    public final void mo723e(View r1, int r2, int r3, int r4, int r5, int r6) {
        m2153o(r5, r6, null);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: f */
    public final boolean mo724f(View r1, View r2, int r3, int r4) {
        if ((r3 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2146g(int r11) {
        View r1 = findFocus();
        if (r1 != this) goto L5;
        r1 = null;
    L5:
        View r7 = r1;
        View r8 = FocusFinder.getInstance().findNextFocus(this, r7, r11);
        int r12 = getMaxScrollAmount();
        if (r8 == null) goto L11;
        if (m2152n(r8, r12, getHeight()) == false) goto L11;
        Rect r13 = this.f3936c;
        r8.getDrawingRect(r13);
        offsetDescendantRectToMyCoords(r8, r13);
        m2158t(m2147h(r13), -1, null, 0, 1, true);
        r8.requestFocus(r11);
    L26:
        if (r7 != null) goto L28;
    L32:
        return true;
    L28:
        if (r7.isFocused() == false) goto L32;
        if (m2152n(r7, 0, getHeight()) == true) goto L32;
        int r2 = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(r2);
    L11:
        if (r11 == 33) goto L13;
    L15:
        if (r11 == 130) goto L17;
    L19:
        if (r12 != 0) goto L21;
        return false;
    L21:
        if (r11 == 130) goto L24;
        r12 = -r12;
    L24:
        m2158t(r12, -1, null, 0, 1, true);
        goto L26
    L17:
        if (getChildCount() <= 0) goto L19;
        View r22 = getChildAt(0);
        FrameLayout.LayoutParams r4 = (FrameLayout.LayoutParams) r22.getLayoutParams();
        int r23 = r22.getBottom() + r4.bottomMargin;
        int r42 = getScrollY();
        r12 = Math.min(r23 - ((getHeight() + r42) - getPaddingBottom()), r12);
        goto L19
    L13:
        if (getScrollY() >= r12) goto L15;
        r12 = getScrollY();
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
        C0422Js r0 = this.f3958y;
        int r1 = r0.f1403a;
        return r0.f1404b | r1;
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

    public float getVerticalScrollFactorCompat() {
        if (this.f3932A != 0.0f) goto L10;
        TypedValue r0 = new TypedValue();
        Context r1 = getContext();
        if (r1.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, r0, true) == false) goto L8;
        this.f3932A = r0.getDimension(r1.getResources().getDisplayMetrics());
        goto L10
    L8:
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    L10:
        return this.f3932A;
    }

    /* JADX INFO: renamed from: h */
    public final int m2147h(Rect r11) {
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
        return this.f3959z.m597f(0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2148i(int r7, int r8, int[] r9, int[] r10, int r11) {
        return this.f3959z.m594c(r7, r8, r9, null, r11);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3959z.f992d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2149j(KeyEvent r6) {
        this.f3936c.setEmpty();
        int r1 = 130;
        if (getChildCount() <= 0) goto L49;
        View r0 = getChildAt(0);
        FrameLayout.LayoutParams r3 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        if (((r0.getHeight() + r3.topMargin) + r3.bottomMargin) <= ((getHeight() - getPaddingTop()) - getPaddingBottom())) goto L49;
        if (r6.getAction() != 0) goto L62;
        int r02 = r6.getKeyCode();
        if (r02 == 19) goto L43;
        if (r02 == 20) goto L37;
        if (r02 == 62) goto L32;
        if (r02 == 92) goto L30;
        if (r02 == 93) goto L28;
        if (r02 != 122) goto L21;
        m2156r(33);
        return false;
    L21:
        if (r02 != 123) goto L62;
        m2156r(130);
        return false;
    L28:
        return m2151l(130);
    L30:
        return m2151l(33);
    L32:
        if (r6.isShiftPressed() == false) goto L34;
        r1 = 33;
    L34:
        m2156r(r1);
        return false;
    L37:
        if (r6.isAltPressed() == false) goto L41;
        return m2151l(130);
    L41:
        return m2146g(130);
    L43:
        if (r6.isAltPressed() == false) goto L47;
        return m2151l(33);
    L47:
        return m2146g(33);
    L62:
        return false;
    L49:
        if (isFocused() == false) goto L62;
        if (r6.getKeyCode() == 4) goto L62;
        View r62 = findFocus();
        if (r62 != this) goto L55;
        r62 = null;
    L55:
        View r63 = FocusFinder.getInstance().findNextFocus(this, r62, 130);
        if (r63 == null) goto L62;
        if (r63 == this) goto L62;
        if (r63.requestFocus(130) == false) goto L62;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m2150k(int r13) {
        if (getChildCount() <= 0) goto L8;
        int r2 = getScrollX();
        int r3 = getScrollY();
        this.f3937d.fling(r2, r3, 0, r13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        m2161w(2, 1);
        this.f3956w = getScrollY();
        postInvalidateOnAnimation();
        if (Build.VERSION.SDK_INT < 35) goto L9;
        AbstractC0164Ds.m312a(this, Math.abs(this.f3937d.getCurrVelocity()));
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2151l(int r6) {
        if (r6 != 130) goto L5;
        boolean r0 = true;
    L6:
        int r3 = getHeight();
        Rect r4 = this.f3936c;
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
        return m2157s(r6, r4.top, r4.bottom);
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

    /* JADX INFO: renamed from: n */
    public final boolean m2152n(View r3, int r4, int r5) {
        Rect r0 = this.f3936c;
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

    /* JADX INFO: renamed from: o */
    public final void m2153o(int r11, int r12, int[] r13) {
        int r0 = getScrollY();
        scrollBy(0, r11);
        int r4 = getScrollY() - r0;
        if (r13 == null) goto L5;
        r13[1] = r13[1] + r4;
    L5:
        C0293Gs r2 = this.f3959z;
        r2.m595d(0, r4, 0, r11 - r4, null, r12, r13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3943j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent r31) {
        if (r31.getAction() == 8) goto L5;
        return false;
    L5:
        if (this.f3945l == false) goto L7;
        return false;
    L7:
        if ((r31.getSource() & 2) != 2) goto L10;
        float r2 = r31.getAxisValue(9);
        int r4 = (int) r31.getX();
        int r22 = 9;
        float r1 = r2;
    L14:
        if (r1 == 0.0f) goto L182;
        int r12 = (int) (getVerticalScrollFactorCompat() * r1);
        if ((r31.getSource() & 8194) != 8194) goto L18;
        boolean r6 = true;
    L19:
        m2158t(-r12, r22, r31, r4, 1, r6);
        if (r22 == 0) goto L166;
        C0708Qd r13 = this.f3933B;
        NestedScrollView r42 = (NestedScrollView) r13.f2275b.f3226b;
        int[] r5 = r13.f2281h;
        int r62 = r31.getSource();
        int r132 = r31.getDeviceId();
        int r16 = 1;
        if (r13.f2279f == r62) goto L24;
    L29:
        Context r14 = r13.f2274a;
        ViewConfiguration r8 = ViewConfiguration.get(r14);
        int r10 = r31.getDeviceId();
        int r19 = 0;
        int r7 = r31.getSource();
        int r122 = Build.VERSION.SDK_INT;
        if (r122 < 34) goto L32;
        int r72 = AbstractC1031Y.m1958f(r8, r10, r22, r7);
    L50:
        r5[0] = r72;
        int r73 = r31.getDeviceId();
        int r102 = r31.getSource();
        if (r122 < 34) goto L53;
        int r0 = AbstractC1031Y.m1957e(r8, r73, r22, r102);
    L71:
        r5[1] = r0;
        r13.f2279f = r62;
        r13.f2280g = r132;
        r13.f2278e = r22;
        boolean r74 = true;
    L73:
        if (r5[r19] != Integer.MAX_VALUE) goto L79;
        VelocityTracker r02 = r13.f2276c;
        if (r02 == null) goto L179;
        r02.recycle();
        r13.f2276c = null;
        return true;
    L179:
        return true;
    L79:
        if (r13.f2276c != null) goto L81;
        r13.f2276c = VelocityTracker.obtain();
    L81:
        VelocityTracker r03 = r13.f2276c;
        Map r63 = AbstractC0616OD.f1978a;
        r03.addMovement(r31);
        int r82 = 20;
        if (Build.VERSION.SDK_INT < 34) goto L85;
    L98:
        r03.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0659PD r9 = (C0659PD) AbstractC0616OD.f1978a.get(r03);
        if (r9 == null) goto L139;
        float[] r103 = r9.f2106a;
        long[] r11 = r9.f2107b;
        int r123 = r9.f2109d;
        if (r123 >= 2) goto L103;
    L102:
        NestedScrollView r25 = r42;
        float r312 = Float.MAX_VALUE;
        int r43 = 1000;
        float r3 = 0.0f;
    L133:
        float r32 = r3 * r43;
        r9.f2108c = r32;
        if (r32 >= (-Math.abs(r312))) goto L137;
        r9.f2108c = -Math.abs(r312);
    L141:
        if (Build.VERSION.SDK_INT < 34) goto L143;
        float r04 = AbstractC1031Y.m1954b(r03, r22);
    L155:
        float r05 = r04 * (-r25.getVerticalScrollFactorCompat());
        float r23 = Math.signum(r05);
        if (r74 == false) goto L158;
    L161:
        NestedScrollView r44 = r25;
        r44.f3937d.abortAnimation();
    L165:
        if (Math.abs(r05) < r5[0]) goto L166;
        float r06 = Math.max(-r2, Math.min(r05, r5[1]));
        if (r06 != 0.0f) goto L170;
        float r104 = 0.0f;
    L171:
        r13.f2277d = r104;
        return true;
    L170:
        r44.f3937d.abortAnimation();
        r44.m2150k((int) r06);
        r104 = r06;
        goto L171
    L158:
        if (r23 != Math.signum(r13.f2277d)) goto L160;
    L162:
        r44 = r25;
        goto L165
    L160:
        if (r23 == 0.0f) goto L162;
    L143:
        if (r22 != 0) goto L146;
        r04 = r03.getXVelocity();
        goto L155
    L146:
        if (r22 != 1) goto L148;
        r04 = r03.getYVelocity();
        goto L155
    L148:
        C0659PD r07 = (C0659PD) AbstractC0616OD.f1978a.get(r03);
        if (r07 != null) goto L151;
    L154:
        r04 = 0.0f;
        goto L155
    L151:
        if (r22 != 26) goto L154;
        r04 = r07.f2108c;
        goto L155
    L137:
        if (r9.f2108c <= Math.abs(r312)) goto L141;
        r9.f2108c = Math.abs(r312);
        goto L141
    L103:
        int r133 = r9.f2110e;
        int r142 = ((r133 + 20) - (r123 - 1)) % 20;
        long r124 = r11[r133];
    L104:
        long r222 = r11[r142];
        if ((r124 - r222) <= 100) goto L107;
        r9.f2109d--;
        r142 = (r142 + 1) % 20;
        goto L104
    L107:
        int r125 = r9.f2109d;
        if (r125 < 2) goto L102;
        if (r125 != 2) goto L115;
        int r143 = (r142 + 1) % 20;
        if (r222 == r11[r143]) goto L102;
        r25 = r42;
        r312 = Float.MAX_VALUE;
        r43 = 1000;
        r3 = r103[r143] / (r11 - r222);
        goto L133
    L115:
        r312 = Float.MAX_VALUE;
        float r126 = 0.0f;
        int r134 = 0;
        int r15 = 0;
    L116:
        float r20 = 1.0f;
        if (r134 >= (r9.f2109d - 1)) goto L129;
        int r64 = r134 + r142;
        long r223 = r11[r64 % 20];
        int r65 = (r64 + 1) % r82;
        if (r11[r65] != r223) goto L121;
        NestedScrollView r252 = r42;
    L128:
        r134 = r134 + 1;
        r42 = r252;
        r82 = 20;
        r16 = 1;
        goto L116
    L121:
        r15 = r15 + 1;
        if (r126 >= 0.0f) goto L124;
        r20 = -1.0f;
    L124:
        r252 = r42;
        float r202 = r20 * ((float) Math.sqrt(Math.abs(r126) * 2.0f));
        float r33 = r103[r65] / (r11[r65] - r223);
        float r34 = (Math.abs(r33) * (r33 - r202)) + r126;
        if (r15 != r16) goto L127;
        r34 = r34 * 0.5f;
    L127:
        r126 = r34;
        goto L128
    L129:
        r25 = r42;
        if (r126 >= 0.0f) goto L132;
        r20 = -1.0f;
    L132:
        r3 = ((float) Math.sqrt(Math.abs(r126) * 2.0f)) * r20;
        r43 = 1000;
        goto L133
    L139:
        r25 = r42;
        goto L141
    L85:
        if (r31.getSource() != 4194304) goto L98;
        Map r66 = AbstractC0616OD.f1978a;
        if (r66.containsKey(r03) == true) goto L89;
        r66.put(r03, new C0659PD());
    L89:
        C0659PD r67 = (C0659PD) r66.get(r03);
        long[] r92 = r67.f2107b;
        long r105 = r31.getEventTime();
        if (r67.f2109d != 0) goto L92;
    L94:
        int r127 = (r67.f2110e + 1) % 20;
        r67.f2110e = r127;
        int r135 = r67.f2109d;
        if (r135 == 20) goto L97;
        r67.f2109d = r135 + 1;
    L97:
        r67.f2106a[r127] = r31.getAxisValue(26);
        r92[r67.f2110e] = r105;
        goto L98
    L92:
        if ((r105 - r92[r67.f2110e]) <= 40) goto L94;
        r67.f2109d = r19;
        r67.f2108c = 0.0f;
        goto L94
    L53:
        InputDevice r75 = InputDevice.getDevice(r73);
        if (r75 != null) goto L56;
    L70:
        r0 = Integer.MIN_VALUE;
        goto L71
    L56:
        if (r75.getMotionRange(r22, r102) == null) goto L70;
        Resources r76 = r14.getResources();
        if (r102 == 4194304) goto L60;
    L62:
        int r93 = -1;
    L63:
        Objects.requireNonNull(r8);
        if (r93 == (-1)) goto L69;
        if (r93 == 0) goto L70;
        r0 = r76.getDimensionPixelSize(r93);
        if (r0 >= 0) goto L71;
    L69:
        r0 = r8.getScaledMaximumFlingVelocity();
        goto L71
    L60:
        if (r22 != 26) goto L62;
        r93 = r76.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
        goto L63
    L32:
        InputDevice r106 = InputDevice.getDevice(r10);
        if (r106 != null) goto L35;
    L49:
        r72 = Integer.MAX_VALUE;
        goto L50
    L35:
        if (r106.getMotionRange(r22, r7) == null) goto L49;
        Resources r107 = r14.getResources();
        if (r7 == 4194304) goto L39;
    L41:
        int r77 = -1;
    L42:
        Objects.requireNonNull(r8);
        if (r77 == (-1)) goto L48;
        if (r77 == 0) goto L49;
        r72 = r107.getDimensionPixelSize(r77);
        if (r72 >= 0) goto L50;
    L48:
        r72 = r8.getScaledMinimumFlingVelocity();
        goto L50
    L39:
        if (r22 != 26) goto L41;
        r77 = r107.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
        goto L42
    L24:
        if (r13.f2280g != r132) goto L29;
        if (r13.f2278e != r22) goto L29;
        r74 = false;
        r19 = 0;
    L166:
        return true;
    L18:
        r6 = false;
        goto L19
    L182:
        return false;
    L10:
        if ((r31.getSource() & 4194304) != 4194304) goto L12;
        float r24 = r31.getAxisValue(26);
        r4 = getWidth() / 2;
        r1 = r24;
        r22 = 26;
        goto L14
    L12:
        r1 = 0.0f;
        r22 = 0;
        r4 = 0;
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
        if (getChildCount() <= 0) goto L63;
        int r6 = getScrollY();
        View r7 = getChildAt(0);
        if (r03 < (r7.getTop() - r6)) goto L63;
        if (r03 >= (r7.getBottom() - r6)) goto L63;
        if (r5 < r7.getLeft()) goto L63;
        if (r5 >= r7.getRight()) goto L63;
        this.f3941h = r03;
        this.f3952s = r13.getPointerId(0);
        VelocityTracker r04 = this.f3946m;
        if (r04 != null) goto L54;
        this.f3946m = VelocityTracker.obtain();
    L55:
        this.f3946m.addMovement(r13);
        this.f3937d.computeScrollOffset();
        if (m2162x(r13) == false) goto L58;
    L61:
        this.f3945l = r1;
        m2161w(2, 0);
    L72:
        return this.f3945l;
    L58:
        if (this.f3937d.isFinished() == false) goto L61;
        r1 = false;
        goto L61
    L54:
        r04.clear();
    L63:
        if (m2162x(r13) == false) goto L65;
    L68:
        this.f3945l = r1;
        VelocityTracker r132 = this.f3946m;
        if (r132 == null) goto L72;
        r132.recycle();
        this.f3946m = null;
        goto L72
    L65:
        if (this.f3937d.isFinished() == false) goto L68;
        r1 = false;
        goto L68
    L10:
        if (r02 == 1) goto L34;
        if (r02 != 2) goto L13;
        int r05 = this.f3952s;
        if (r05 == (-1)) goto L72;
        int r06 = r13.findPointerIndex(r05);
        if (r06 == (-1)) goto L72;
        int r07 = (int) r13.getY(r06);
        if (Math.abs(r07 - this.f3941h) <= this.f3949p) goto L72;
        if ((2 & getNestedScrollAxes()) != 0) goto L72;
        this.f3945l = true;
        this.f3941h = r07;
        if (this.f3946m != null) goto L31;
        this.f3946m = VelocityTracker.obtain();
    L31:
        this.f3946m.addMovement(r13);
        this.f3955v = 0;
        ViewParent r133 = getParent();
        if (r133 == null) goto L72;
        r133.requestDisallowInterceptTouchEvent(true);
        goto L72
    L13:
        if (r02 == 3) goto L34;
        if (r02 != 6) goto L72;
        m2154p(r13);
    L34:
        this.f3945l = false;
        this.f3952s = -1;
        VelocityTracker r134 = this.f3946m;
        if (r134 == null) goto L38;
        r134.recycle();
        this.f3946m = null;
    L38:
        if (this.f3937d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L40;
        postInvalidateOnAnimation();
    L40:
        m2163y(0);
        goto L72
    L5:
        if (this.f3945l == false) goto L7;
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        super.onLayout(r3, r4, r5, r6, r7);
        int r42 = 0;
        this.f3942i = false;
        View r62 = this.f3944k;
        if (r62 != null) goto L5;
    L9:
        this.f3944k = null;
        if (this.f3943j == false) goto L12;
    L28:
        scrollTo(getScrollX(), getScrollY());
        this.f3943j = true;
        return;
    L12:
        if (this.f3957x == null) goto L15;
        scrollTo(getScrollX(), this.f3957x.f817a);
        this.f3957x = null;
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
        if (m2145m(r62, this) == false) goto L9;
        View r65 = this.f3944k;
        Rect r02 = this.f3936c;
        r65.getDrawingRect(r02);
        offsetDescendantRectToMyCoords(r65, r02);
        int r66 = m2147h(r02);
        if (r66 == 0) goto L9;
        scrollBy(0, r66);
        goto L9
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        if (this.f3947n == true) goto L6;
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
        m2150k((int) r3);
        return true;
    L5:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View r1, float r2, float r3) {
        return this.f3959z.m593b(r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r7, int r8, int r9, int[] r10) {
        m2148i(r8, r9, r10, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r1, int r2, int r3, int r4, int r5) {
        m2153o(r5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r2, View r3, int r4) {
        mo720a(r2, r3, r4, 0);
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
        if (m2152n(r0, 0, getHeight()) == false) goto L16;
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
        if ((r2 instanceof C0250Fs) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C0250Fs r22 = (C0250Fs) r2;
        super.onRestoreInstanceState(r22.getSuperState());
        this.f3957x = r22;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0250Fs r1 = new C0250Fs(super.onSaveInstanceState());
        r1.f817a = getScrollY();
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
        if (r12 == null) goto L16;
        if (this != r12) goto L7;
        return;
    L7:
        if (m2152n(r12, 0, r4) == false) goto L17;
        Rect r32 = this.f3936c;
        r12.getDrawingRect(r32);
        offsetDescendantRectToMyCoords(r12, r32);
        int r13 = m2147h(r32);
        if (r13 != 0) goto L11;
        return;
    L11:
        if (this.f3948o == false) goto L14;
        m2160v(0, r13, false);
        return;
    L14:
        scrollBy(0, r13);
        return;
    L17:
        return;
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
    public final boolean onTouchEvent(MotionEvent r20) {
        if (this.f3946m != null) goto L5;
        this.f3946m = VelocityTracker.obtain();
    L5:
        int r1 = r20.getActionMasked();
        if (r1 != 0) goto L8;
        this.f3955v = 0;
    L8:
        MotionEvent r7 = MotionEvent.obtain(r20);
        float r5 = 0.0f;
        r7.offsetLocation(0.0f, this.f3955v);
        if (r1 == 0) goto L89;
        EdgeEffect r10 = this.f3938e;
        EdgeEffect r11 = this.f3939f;
        if (r1 == 1) goto L64;
        if (r1 != 2) goto L14;
        int r12 = r20.findPointerIndex(this.f3952s);
        if (r12 == (-1)) goto L100;
        int r9 = (int) r20.getY(r12);
        int r2 = this.f3941h - r9;
        float r4 = r20.getX(r12) / getWidth();
        float r6 = r2 / getHeight();
        if (AbstractC0671Pj.m1352l(r10) == 0.0f) goto L43;
        float r42 = -AbstractC0671Pj.m1355t(r10, -r6, r4);
        if (AbstractC0671Pj.m1352l(r10) != 0.0f) goto L41;
        r10.onRelease();
    L41:
        r5 = r42;
    L47:
        int r43 = Math.round(r5 * getHeight());
        if (r43 == 0) goto L50;
        invalidate();
    L50:
        int r22 = r2 - r43;
        if (this.f3945l == true) goto L62;
        if (Math.abs(r22) <= this.f3949p) goto L62;
        ViewParent r44 = getParent();
        if (r44 == null) goto L57;
        r44.requestDisallowInterceptTouchEvent(true);
    L57:
        this.f3945l = true;
        if (r22 <= 0) goto L60;
        r22 = r22 - this.f3949p;
        goto L62
    L60:
        r22 = r22 + this.f3949p;
    L62:
        if (this.f3945l == false) goto L100;
        int r13 = m2158t(r22, 1, r20, (int) r20.getX(r12), 0, false);
        this.f3941h = r9 - r13;
        this.f3955v += r13;
        goto L100
    L43:
        if (AbstractC0671Pj.m1352l(r11) == 0.0f) goto L47;
        r42 = AbstractC0671Pj.m1355t(r11, r6, 1.0f - r4);
        if (AbstractC0671Pj.m1352l(r11) != 0.0f) goto L41;
        r11.onRelease();
    L100:
        VelocityTracker r14 = this.f3946m;
        if (r14 == null) goto L103;
        r14.addMovement(r7);
    L103:
        r7.recycle();
        return true;
    L14:
        if (r1 == 3) goto L23;
        if (r1 != 5) goto L18;
        int r15 = r20.getActionIndex();
        this.f3941h = (int) r20.getY(r15);
        this.f3952s = r20.getPointerId(r15);
        goto L100
    L18:
        if (r1 != 6) goto L100;
        m2154p(r20);
        this.f3941h = (int) r20.getY(r20.findPointerIndex(this.f3952s));
        goto L100
    L23:
        if (this.f3945l == true) goto L25;
    L29:
        this.f3952s = -1;
        this.f3945l = false;
        VelocityTracker r16 = this.f3946m;
        if (r16 == null) goto L32;
        r16.recycle();
        this.f3946m = null;
    L32:
        m2163y(0);
        r10.onRelease();
        r11.onRelease();
        goto L100
    L25:
        if (getChildCount() <= 0) goto L29;
        if (this.f3937d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L29;
        postInvalidateOnAnimation();
        goto L29
    L64:
        VelocityTracker r17 = this.f3946m;
        r17.computeCurrentVelocity(1000, this.f3951r);
        int r18 = (int) r17.getYVelocity(this.f3952s);
        if (Math.abs(r18) < this.f3950q) goto L82;
        if (AbstractC0671Pj.m1352l(r10) == 0.0f) goto L73;
        if (m2159u(r10, r18) == false) goto L71;
        r10.onAbsorb(r18);
    L84:
        this.f3952s = -1;
        this.f3945l = false;
        VelocityTracker r19 = this.f3946m;
        if (r19 == null) goto L87;
        r19.recycle();
        this.f3946m = null;
    L87:
        m2163y(0);
        r10.onRelease();
        r11.onRelease();
        goto L100
    L71:
        m2150k(-r18);
        goto L84
    L73:
        if (AbstractC0671Pj.m1352l(r11) == 0.0f) goto L78;
        int r110 = -r18;
        if (m2159u(r11, r110) == false) goto L77;
        r11.onAbsorb(r110);
        goto L84
    L77:
        m2150k(r110);
        goto L84
    L78:
        int r111 = -r18;
        float r3 = r111;
        if (this.f3959z.m593b(0.0f, r3) == true) goto L84;
        dispatchNestedFling(0.0f, r3, true);
        m2150k(r111);
        goto L84
    L82:
        if (this.f3937d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L84;
        postInvalidateOnAnimation();
        goto L84
    L89:
        if (getChildCount() != 0) goto L92;
        return false;
    L92:
        if (this.f3945l == false) goto L97;
        ViewParent r112 = getParent();
        if (r112 == null) goto L97;
        r112.requestDisallowInterceptTouchEvent(true);
    L97:
        if (this.f3937d.isFinished() == true) goto L99;
        this.f3937d.abortAnimation();
        m2163y(1);
    L99:
        int r113 = (int) r20.getY();
        int r32 = r20.getPointerId(0);
        this.f3941h = r113;
        this.f3952s = r32;
        m2161w(2, 0);
        goto L100
    }

    /* JADX INFO: renamed from: p */
    public final void m2154p(MotionEvent r4) {
        int r0 = r4.getActionIndex();
        if (r4.getPointerId(r0) != this.f3952s) goto L11;
        if (r0 != 0) goto L6;
        int r02 = 1;
    L7:
        this.f3941h = (int) r4.getY(r02);
        this.f3952s = r4.getPointerId(r02);
        VelocityTracker r42 = this.f3946m;
        if (r42 == null) goto L12;
        r42.clear();
        return;
    L12:
        return;
    L6:
        r02 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2155q(int r10, int r11, int r12, int r13) {
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
        if (this.f3959z.m597f(1) == true) goto L18;
        this.f3937d.springBack(r3, r4, 0, 0, 0, getScrollRange());
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

    /* JADX INFO: renamed from: r */
    public final void m2156r(int r6) {
        if (r6 != 130) goto L5;
        boolean r0 = true;
    L6:
        int r3 = getHeight();
        Rect r4 = this.f3936c;
        if (r0 == false) goto L13;
        r4.top = getScrollY() + r3;
        int r02 = getChildCount();
        if (r02 <= 0) goto L16;
        View r03 = getChildAt(r02 - 1);
        int r1 = getPaddingBottom() + (r03.getBottom() + ((FrameLayout.LayoutParams) r03.getLayoutParams()).bottomMargin);
        if ((r4.top + r3) <= r1) goto L16;
        r4.top = r1 - r3;
    L16:
        int r04 = r4.top;
        int r32 = r3 + r04;
        r4.bottom = r32;
        m2157s(r6, r04, r32);
        return;
    L13:
        int r05 = getScrollY() - r3;
        r4.top = r05;
        if (r05 >= 0) goto L16;
        r4.top = 0;
        goto L16
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View r3, View r4) {
        if (this.f3942i == true) goto L7;
        Rect r0 = this.f3936c;
        r4.getDrawingRect(r0);
        offsetDescendantRectToMyCoords(r4, r0);
        int r02 = m2147h(r0);
        if (r02 == 0) goto L8;
        scrollBy(0, r02);
    L8:
        super.requestChildFocus(r3, r4);
        return;
    L7:
        this.f3944k = r4;
        goto L8
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r3, Rect r4, boolean r5) {
        r4.offset(r3.getLeft() - r3.getScrollX(), r3.getTop() - r3.getScrollY());
        int r32 = m2147h(r4);
        if (r32 == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        if (r5 == false) goto L10;
        scrollBy(0, r32);
        return r0;
    L10:
        m2160v(0, r32, false);
    L11:
        return r0;
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
        if (r2 == false) goto L6;
        VelocityTracker r0 = this.f3946m;
        if (r0 == null) goto L6;
        r0.recycle();
        this.f3946m = null;
    L6:
        super.requestDisallowInterceptTouchEvent(r2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3942i = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2157s(int r19, int r20, int r21) {
        int r3 = getHeight();
        int r4 = getScrollY();
        int r32 = r3 + r4;
        if (r19 != 33) goto L5;
        boolean r5 = true;
    L6:
        ArrayList<View> r8 = getFocusables(2);
        int r10 = r8.size();
        View r11 = null;
        int r12 = 0;
        boolean r13 = false;
    L7:
        if (r12 >= r10) goto L34;
        View r14 = r8.get(r12);
        int r15 = r14.getTop();
        int r6 = r14.getBottom();
        if (r20 >= r6) goto L33;
        if (r15 >= r21) goto L33;
        if (r20 >= r15) goto L14;
        if (r6 >= r21) goto L14;
        boolean r17 = true;
    L15:
        if (r11 != null) goto L17;
        r11 = r14;
        r13 = r17;
        goto L33
    L17:
        if (r5 == true) goto L19;
    L20:
        if (r5 == false) goto L22;
    L24:
        boolean r62 = false;
    L25:
        if (r13 == false) goto L29;
        if (r17 == false) goto L33;
        if (r62 == false) goto L33;
    L32:
        r11 = r14;
        goto L33
    L29:
        if (r17 == false) goto L31;
        r11 = r14;
        r13 = true;
        goto L33
    L31:
        if (r62 == false) goto L33;
    L22:
        if (r6 <= r11.getBottom()) goto L24;
    L23:
        r62 = true;
        goto L25
    L19:
        if (r15 < r11.getTop()) goto L23;
    L14:
        r17 = false;
    L33:
        r12 = r12 + 1;
        goto L7
    L34:
        if (r11 != null) goto L36;
        View r63 = this;
    L37:
        if (r20 < r4) goto L40;
        if (r21 > r32) goto L40;
        boolean r16 = false;
    L46:
        if (r63 == findFocus()) goto L48;
        r63.requestFocus(r19);
    L48:
        return r16;
    L40:
        if (r5 == false) goto L43;
        int r1 = r20 - r4;
    L44:
        m2158t(r1, -1, null, 0, 1, true);
        r16 = true;
        goto L46
    L43:
        r1 = r21 - r32;
        goto L44
    L36:
        r63 = r11;
        goto L37
    L5:
        r5 = false;
        goto L6
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
        if (r2 == this.f3947n) goto L6;
        this.f3947n = r2;
        requestLayout();
        return;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
        C0293Gs r0 = this.f3959z;
        if (r0.f992d == false) goto L5;
        ViewGroup r1 = r0.f991c;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2641m(r1);
    L5:
        r0.f992d = r4;
    }

    public void setOnScrollChangeListener(InterfaceC0207Es r1) {
    }

    public void setSmoothScrollingEnabled(boolean r1) {
        this.f3948o = r1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return this.f3959z.m598g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m2163y(0);
    }

    /* JADX INFO: renamed from: t */
    public final int m2158t(int r21, int r22, MotionEvent r23, int r24, int r25, boolean r26) {
        if (r25 != 1) goto L5;
        m2161w(2, r25);
    L5:
        boolean r3 = this.f3959z.m594c(0, r21, this.f3954u, this.f3953t, r25);
        int[] r12 = this.f3953t;
        int[] r10 = this.f3954u;
        if (r3 == false) goto L8;
        int r14 = r21 - r10[1];
        int r15 = r12[1];
    L9:
        int r32 = getScrollY();
        int r4 = getScrollRange();
        int r5 = getOverScrollMode();
        if (r5 == 0) goto L14;
        if (r5 == 1) goto L13;
    L16:
        boolean r16 = false;
    L18:
        if (m2155q(r14, 0, r32, r4) == true) goto L20;
    L22:
        boolean r17 = false;
    L23:
        int r52 = getScrollY() - r32;
        if (r23 == null) goto L27;
        if (r52 == 0) goto L27;
        C2519sx r6 = getScrollFeedbackProvider();
        r6.f8815a.onScrollProgress(r23.getDeviceId(), r23.getSource(), r22, r52);
    L27:
        r10[1] = 0;
        this.f3959z.m595d(0, r52, 0, r14 - r52, this.f3953t, r25, r10);
        int r152 = r15 + r12[1];
        int r142 = r14 - r10[1];
        int r33 = r32 + r142;
        EdgeEffect r42 = this.f3939f;
        EdgeEffect r53 = this.f3938e;
        if (r33 >= 0) goto L37;
        if (r16 == false) goto L36;
        AbstractC0671Pj.m1355t(r53, (-r142) / getHeight(), r24 / getWidth());
        if (r23 == null) goto L34;
        C2519sx r2 = getScrollFeedbackProvider();
        r2.f8815a.onScrollLimit(r23.getDeviceId(), r23.getSource(), r22, true);
    L34:
        if (r42.isFinished() == true) goto L36;
        r42.onRelease();
    L36:
        boolean r7 = false;
    L47:
        if (r53.isFinished() == true) goto L49;
    L52:
        postInvalidateOnAnimation();
        boolean r13 = r7;
    L53:
        if (r13 == false) goto L58;
        if (r25 != 0) goto L58;
        VelocityTracker r1 = this.f3946m;
        if (r1 == null) goto L58;
        r1.clear();
    L58:
        if (r25 != 1) goto L60;
        m2163y(r25);
        r53.onRelease();
        r42.onRelease();
    L60:
        return r152;
    L49:
        if (r42.isFinished() == false) goto L52;
        r13 = r17;
        goto L53
    L37:
        if (r33 <= r4) goto L36;
        if (r16 == false) goto L36;
        AbstractC0671Pj.m1355t(r42, r142 / getHeight(), 1.0f - (r24 / getWidth()));
        if (r23 == null) goto L42;
        C2519sx r27 = getScrollFeedbackProvider();
        r7 = false;
        r27.f8815a.onScrollLimit(r23.getDeviceId(), r23.getSource(), r22, false);
    L44:
        if (r53.isFinished() == true) goto L47;
        r53.onRelease();
        goto L47
    L42:
        r7 = false;
        goto L44
    L20:
        if (this.f3959z.m597f(r25) == true) goto L22;
        r17 = true;
        goto L23
    L13:
        if (getScrollRange() <= 0) goto L16;
    L14:
        if (r26 == true) goto L16;
        r16 = true;
        goto L18
    L8:
        r14 = r21;
        r15 = 0;
        goto L9
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2159u(EdgeEffect r10, int r11) {
        if (r11 <= 0) goto L5;
        return true;
    L5:
        float r102 = AbstractC0671Pj.m1352l(r10) * getHeight();
        float r112 = Math.abs(-r11) * 0.35f;
        float r2 = this.f3934a * 0.015f;
        double r3 = Math.log(r112 / r2);
        double r5 = f3929C;
        if (((float) (Math.exp((r5 / (r5 - 1.0d)) * r3) * ((double) r2))) >= r102) goto L8;
        return true;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m2160v(int r10, int r11, boolean r12) {
        if (getChildCount() != 0) goto L6;
        return;
    L6:
        if ((AnimationUtils.currentAnimationTimeMillis() - this.f3935b) <= 250) goto L13;
        View r0 = getChildAt(0);
        FrameLayout.LayoutParams r2 = (FrameLayout.LayoutParams) r0.getLayoutParams();
        int r02 = (r0.getHeight() + r2.topMargin) + r2.bottomMargin;
        int r22 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int r5 = getScrollY();
        int r112 = r11 + r5;
        int r7 = Math.max(0, Math.min(r112, Math.max(0, r02 - r22))) - r5;
        int r4 = getScrollX();
        this.f3937d.startScroll(r4, r5, 0, r7, 250);
        if (r12 == false) goto L10;
        m2161w(2, 1);
    L11:
        this.f3956w = getScrollY();
        postInvalidateOnAnimation();
    L16:
        this.f3935b = AnimationUtils.currentAnimationTimeMillis();
        return;
    L10:
        m2163y(1);
        goto L11
    L13:
        if (this.f3937d.isFinished() == true) goto L15;
        this.f3937d.abortAnimation();
        m2163y(1);
    L15:
        scrollBy(r10, r11);
        goto L16
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2161w(int r2, int r3) {
        return this.f3959z.m598g(2, r3);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2162x(MotionEvent r6) {
        EdgeEffect r0 = this.f3938e;
        if (AbstractC0671Pj.m1352l(r0) == 0.0f) goto L5;
        AbstractC0671Pj.m1355t(r0, 0.0f, r6.getX() / getWidth());
        boolean r02 = true;
    L6:
        EdgeEffect r1 = this.f3939f;
        if (AbstractC0671Pj.m1352l(r1) == 0.0f) goto L10;
        AbstractC0671Pj.m1355t(r1, 0.0f, 1.0f - (r6.getX() / getWidth()));
        return true;
    L10:
        return r02;
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: y */
    public final void m2163y(int r2) {
        this.f3959z.m599h(r2);
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
}
