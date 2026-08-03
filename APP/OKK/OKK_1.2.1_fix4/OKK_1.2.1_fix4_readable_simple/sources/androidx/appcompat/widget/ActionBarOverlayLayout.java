package androidx.appcompat.widget;

import android.R;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p001A0.C0038n;
import p006D.AbstractC0068E;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.AbstractC0106i0;
import p006D.C0100f0;
import p006D.C0102g0;
import p006D.C0104h0;
import p006D.C0118o0;
import p006D.C0119p;
import p006D.C0122q0;
import p006D.InterfaceC0115n;
import p006D.InterfaceC0117o;
import p037U.AbstractC0358S;
import p057g.C0873M0;
import p057g.C0896d;
import p057g.C0898e;
import p057g.InterfaceC0882S;
import p057g.InterfaceC0894c;
import p057g.RunnableC0892b;
import p085v.C1102c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0115n, InterfaceC0117o {

    /* JADX INFO: renamed from: A */
    public static final C0122q0 f1113A = null;

    /* JADX INFO: renamed from: B */
    public static final Rect f1114B = null;

    /* JADX INFO: renamed from: z */
    public static final int[] f1115z = null;

    /* JADX INFO: renamed from: a */
    public int f1116a;

    /* JADX INFO: renamed from: b */
    public ContentFrameLayout f1117b;

    /* JADX INFO: renamed from: c */
    public ActionBarContainer f1118c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0882S f1119d;

    /* JADX INFO: renamed from: e */
    public Drawable f1120e;

    /* JADX INFO: renamed from: f */
    public boolean f1121f;

    /* JADX INFO: renamed from: g */
    public boolean f1122g;

    /* JADX INFO: renamed from: h */
    public boolean f1123h;

    /* JADX INFO: renamed from: i */
    public boolean f1124i;

    /* JADX INFO: renamed from: j */
    public int f1125j;

    /* JADX INFO: renamed from: k */
    public final Rect f1126k;

    /* JADX INFO: renamed from: l */
    public final Rect f1127l;

    /* JADX INFO: renamed from: m */
    public final Rect f1128m;

    /* JADX INFO: renamed from: n */
    public final Rect f1129n;

    /* JADX INFO: renamed from: o */
    public C0122q0 f1130o;

    /* JADX INFO: renamed from: p */
    public C0122q0 f1131p;

    /* JADX INFO: renamed from: q */
    public C0122q0 f1132q;

    /* JADX INFO: renamed from: r */
    public C0122q0 f1133r;

    /* JADX INFO: renamed from: s */
    public OverScroller f1134s;

    /* JADX INFO: renamed from: t */
    public ViewPropertyAnimator f1135t;

    /* JADX INFO: renamed from: u */
    public final C0038n f1136u;

    /* JADX INFO: renamed from: v */
    public final RunnableC0892b f1137v;

    /* JADX INFO: renamed from: w */
    public final RunnableC0892b f1138w;

    /* JADX INFO: renamed from: x */
    public final C0119p f1139x;

    /* JADX INFO: renamed from: y */
    public final C0898e f1140y;

    static {
        f1115z = new int[]{C1031R.attr.actionBarSize, R.attr.windowContentOverlay};
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 30) goto L6;
        AbstractC0106i0 r03 = new C0104h0();
    L9:
        r03.mo364g(C1102c.m2598b(0, 1, 0, 1));
        f1113A = r03.mo362b();
        f1114B = new Rect();
        return;
    L6:
        if (r02 < 29) goto L8;
        r03 = new C0102g0();
        goto L9
    L8:
        r03 = new C0100f0();
        goto L9
    }

    public ActionBarOverlayLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f1126k = new Rect();
        this.f1127l = new Rect();
        this.f1128m = new Rect();
        this.f1129n = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0122q0 r32 = C0122q0.f308b;
        this.f1130o = r32;
        this.f1131p = r32;
        this.f1132q = r32;
        this.f1133r = r32;
        this.f1136u = new C0038n(2, this);
        this.f1137v = new RunnableC0892b(this, 0);
        this.f1138w = new RunnableC0892b(this, 1);
        m1122i(r2);
        this.f1139x = new C0119p();
        C0898e r33 = new C0898e(r2);
        r33.setWillNotDraw(true);
        this.f1140y = r33;
        addView(r33);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1120g(View r4, Rect r5, boolean r6) {
        C0896d r42 = (C0896d) r4.getLayoutParams();
        int r02 = ((ViewGroup.MarginLayoutParams) r42).leftMargin;
        int r1 = r5.left;
        if (r02 == r1) goto L5;
        ((ViewGroup.MarginLayoutParams) r42).leftMargin = r1;
        boolean r03 = true;
    L6:
        int r12 = ((ViewGroup.MarginLayoutParams) r42).topMargin;
        int r3 = r5.top;
        if (r12 == r3) goto L9;
        ((ViewGroup.MarginLayoutParams) r42).topMargin = r3;
        r03 = true;
    L9:
        int r13 = ((ViewGroup.MarginLayoutParams) r42).rightMargin;
        int r32 = r5.right;
        if (r13 == r32) goto L12;
        ((ViewGroup.MarginLayoutParams) r42).rightMargin = r32;
        r03 = true;
    L12:
        if (r6 == false) goto L17;
        int r62 = ((ViewGroup.MarginLayoutParams) r42).bottomMargin;
        int r52 = r5.bottom;
        if (r62 == r52) goto L17;
        ((ViewGroup.MarginLayoutParams) r42).bottomMargin = r52;
        return true;
    L17:
        return r03;
    L5:
        r03 = false;
        goto L6
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: a */
    public final void mo421a(View r1, View r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        onNestedScrollAccepted(r1, r2, r3);
        return;
    }

    @Override // p006D.InterfaceC0117o
    /* JADX INFO: renamed from: b */
    public final void mo426b(View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
        mo422c(r1, r2, r3, r4, r5, r6);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: c */
    public final void mo422c(View r1, int r2, int r3, int r4, int r5, int r6) {
        if (r6 != 0) goto L5;
        onNestedScroll(r1, r2, r3, r4, r5);
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C0896d;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: d */
    public final void mo423d(View r1, int r2) {
        if (r2 != 0) goto L5;
        onStopNestedScroll(r1);
        return;
    }

    @Override // android.view.View
    public final void draw(Canvas r6) {
        super.draw(r6);
        if (this.f1120e != null) goto L5;
        return;
    L5:
        if (this.f1118c.getVisibility() != 0) goto L7;
        int r02 = (int) ((this.f1118c.getTranslationY() + this.f1118c.getBottom()) + 0.5f);
    L8:
        this.f1120e.setBounds(0, r02, getWidth(), this.f1120e.getIntrinsicHeight() + r02);
        this.f1120e.draw(r6);
        return;
    L7:
        r02 = 0;
        goto L8
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: e */
    public final void mo424e(View r1, int r2, int r3, int[] r4, int r5) {
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: f */
    public final boolean mo425f(View r1, View r2, int r3, int r4) {
        if (r4 == 0) goto L4;
    L6:
        return false;
    L4:
        if (onStartNestedScroll(r1, r2, r3) == false) goto L6;
        return true;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect r1) {
        return super.fitSystemWindows(r1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0896d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new C0896d(getContext(), r3);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer r02 = this.f1118c;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return -((int) r02.getTranslationY());
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0119p r02 = this.f1139x;
        int r1 = r02.f306a;
        return r02.f307b | r1;
    }

    public CharSequence getTitle() {
        m1123j();
        return ((C0873M0) this.f1119d).f3122a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m1121h() {
        removeCallbacks(this.f1137v);
        removeCallbacks(this.f1138w);
        ViewPropertyAnimator r02 = this.f1135t;
        if (r02 == null) goto L6;
        r02.cancel();
        return;
    }

    /* JADX INFO: renamed from: i */
    public final void m1122i(Context r5) {
        TypedArray r02 = getContext().getTheme().obtainStyledAttributes(f1115z);
        boolean r1 = false;
        this.f1116a = r02.getDimensionPixelSize(0, 0);
        Drawable r3 = r02.getDrawable(1);
        this.f1120e = r3;
        if (r3 != null) goto L5;
        r1 = true;
    L5:
        setWillNotDraw(r1);
        r02.recycle();
        this.f1134s = new OverScroller(r5);
    }

    /* JADX INFO: renamed from: j */
    public final void m1123j() {
        if (this.f1117b != null) goto L13;
        this.f1117b = (ContentFrameLayout) findViewById(C1031R.id.action_bar_activity_content);
        this.f1118c = (ActionBarContainer) findViewById(C1031R.id.action_bar_container);
        KeyEvent.Callback r02 = findViewById(C1031R.id.action_bar);
        if ((r02 instanceof InterfaceC0882S) == false) goto L8;
        InterfaceC0882S r03 = (InterfaceC0882S) r02;
    L10:
        this.f1119d = r03;
        return;
    L8:
        if ((r02 instanceof Toolbar) == false) goto L12;
        r03 = ((Toolbar) r02).getWrapper();
        goto L10
    L12:
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(r02.getClass().getSimpleName()));
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets r7) {
        m1123j();
        C0122q0 r72 = C0122q0.m429d(this, r7);
        C0118o0 r1 = r72.f309a;
        boolean r02 = m1120g(this.f1118c, new Rect(r1.mo382j().f4249a, r72.m430a(), r1.mo382j().f4251c, r1.mo382j().f4252d), false);
        Field r2 = AbstractC0080Q.f219a;
        Rect r22 = this.f1126k;
        AbstractC0070G.m212b(this, r72, r22);
        C0122q0 r73 = r1.mo383l(r22.left, r22.top, r22.right, r22.bottom);
        this.f1130o = r73;
        boolean r3 = true;
        if (this.f1131p.equals(r73) == true) goto L5;
        this.f1131p = this.f1130o;
        r02 = true;
    L5:
        Rect r74 = this.f1127l;
        if (r74.equals(r22) == true) goto L8;
        r74.set(r22);
    L9:
        if (r3 == false) goto L12;
        requestLayout();
    L12:
        return r1.mo407a().f309a.mo390c().f309a.mo389b().m431c();
    L8:
        r3 = r02;
        goto L9
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        m1122i(getContext());
        Field r12 = AbstractC0080Q.f219a;
        AbstractC0068E.m210c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1121h();
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
        C0896d r02 = (C0896d) r92.getLayoutParams();
        int r1 = r92.getMeasuredWidth();
        int r2 = r92.getMeasuredHeight();
        int r3 = ((ViewGroup.MarginLayoutParams) r02).leftMargin + r62;
        int r03 = ((ViewGroup.MarginLayoutParams) r02).topMargin + r72;
        r92.layout(r3, r03, r1 + r3, r2 + r03);
    L7:
        r82 = r82 + 1;
        goto L3
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
        m1123j();
        measureChildWithMargins(this.f1118c, r13, 0, r14, 0);
        C0896d r02 = (C0896d) this.f1118c.getLayoutParams();
        int r1 = Math.max(0, (this.f1118c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r02).leftMargin) + ((ViewGroup.MarginLayoutParams) r02).rightMargin);
        int r03 = Math.max(0, (this.f1118c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r02).topMargin) + ((ViewGroup.MarginLayoutParams) r02).bottomMargin);
        int r3 = View.combineMeasuredStates(0, this.f1118c.getMeasuredState());
        Field r4 = AbstractC0080Q.f219a;
        if ((getWindowSystemUiVisibility() & 256) == 0) goto L5;
        boolean r42 = true;
    L6:
        if (r42 == false) goto L13;
        int r6 = this.f1116a;
        if (this.f1122g == true) goto L10;
    L16:
        Rect r7 = this.f1126k;
        Rect r8 = this.f1128m;
        r8.set(r7);
        this.f1132q = this.f1130o;
        if (this.f1121f == true) goto L22;
        if (r42 == true) goto L22;
        AbstractC0070G.m212b(this.f1140y, f1113A, this.f1129n);
        if ((!r9.equals(f1114B)) == false) goto L22;
        r8.top += r6;
        r8.bottom = r8.bottom;
        this.f1132q = this.f1132q.f309a.mo383l(0, r6, 0, 0);
    L30:
        m1120g(this.f1117b, r8, true);
        if (this.f1133r.equals(this.f1132q) == true) goto L37;
        C0122q0 r2 = this.f1132q;
        this.f1133r = r2;
        ContentFrameLayout r43 = this.f1117b;
        WindowInsets r22 = r2.m431c();
        if (r22 == null) goto L37;
        WindowInsets r5 = AbstractC0068E.m208a(r43, r22);
        if (r5.equals(r22) == true) goto L37;
        C0122q0.m429d(r43, r5);
    L37:
        measureChildWithMargins(this.f1117b, r13, 0, r14, 0);
        C0896d r23 = (C0896d) this.f1117b.getLayoutParams();
        int r12 = Math.max(r1, (this.f1117b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r23).leftMargin) + ((ViewGroup.MarginLayoutParams) r23).rightMargin);
        int r04 = Math.max(r03, (this.f1117b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r23).topMargin) + ((ViewGroup.MarginLayoutParams) r23).bottomMargin);
        int r24 = View.combineMeasuredStates(r3, this.f1117b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max((getPaddingRight() + getPaddingLeft()) + r12, getSuggestedMinimumWidth()), r13, r24), View.resolveSizeAndState(Math.max((getPaddingBottom() + getPaddingTop()) + r04, getSuggestedMinimumHeight()), r14, r24 << 16));
        return;
    L22:
        C1102c r25 = C1102c.m2598b(this.f1132q.f309a.mo382j().f4249a, this.f1132q.m430a() + r6, this.f1132q.f309a.mo382j().f4251c, this.f1132q.f309a.mo382j().f4252d);
        C0122q0 r44 = this.f1132q;
        int r62 = Build.VERSION.SDK_INT;
        if (r62 < 30) goto L26;
        AbstractC0106i0 r63 = new C0104h0(r44);
    L29:
        r63.mo364g(r25);
        this.f1132q = r63.mo362b();
        goto L30
    L26:
        if (r62 < 29) goto L28;
        r63 = new C0102g0(r44);
        goto L29
    L28:
        r63 = new C0100f0(r44);
        goto L29
    L10:
        if (this.f1118c.getTabContainer() == null) goto L16;
        r6 = r6 + this.f1116a;
        goto L16
    L13:
        if (this.f1118c.getVisibility() == 8) goto L15;
        r6 = this.f1118c.getMeasuredHeight();
        goto L16
    L15:
        r6 = 0;
        goto L16
    L5:
        r42 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View r10, float r11, float r12, boolean r13) {
        if (this.f1123h == false) goto L12;
        if (r13 == false) goto L14;
        this.f1134s.fling(0, 0, 0, (int) r12, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1134s.getFinalY() <= this.f1118c.getHeight()) goto L9;
        m1121h();
        this.f1138w.run();
    L10:
        this.f1124i = true;
        return true;
    L9:
        m1121h();
        this.f1137v.run();
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
        int r12 = this.f1125j + r3;
        this.f1125j = r12;
        setActionBarHideOffset(r12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r1, View r2, int r3) {
        this.f1139x.f306a = r3;
        this.f1125j = getActionBarHideOffset();
        m1121h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r1, View r2, int r3) {
        if ((r3 & 2) != 0) goto L5;
        return false;
    L5:
        if (this.f1118c.getVisibility() == 0) goto L8;
        return false;
    L8:
        return this.f1123h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r4) {
        if (this.f1123h == true) goto L5;
        return;
    L5:
        if (this.f1124i == false) goto L7;
        return;
    L7:
        if (this.f1125j > this.f1118c.getHeight()) goto L9;
        m1121h();
        postDelayed(this.f1137v, 600);
        return;
    L9:
        m1121h();
        postDelayed(this.f1138w, 600);
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r1) {
        super.onWindowSystemUiVisibilityChanged(r1);
        m1123j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r1) {
        super.onWindowVisibilityChanged(r1);
    }

    public void setActionBarHideOffset(int r3) {
        m1121h();
        int r32 = Math.max(0, Math.min(r3, this.f1118c.getHeight()));
        this.f1118c.setTranslationY(-r32);
    }

    public void setActionBarVisibilityCallback(InterfaceC0894c r1) {
        if (getWindowToken() != null) goto L6;
        return;
    L6:
        throw null;
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
        this.f1122g = r1;
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
        if (r2 == this.f1123h) goto L8;
        this.f1123h = r2;
        if (r2 == true) goto L9;
        m1121h();
        setActionBarHideOffset(0);
        return;
    L9:
        return;
    }

    public void setIcon(int r3) {
        m1123j();
        C0873M0 r02 = (C0873M0) this.f1119d;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC0358S.m916w(r02.f3122a.getContext(), r3);
    L6:
        r02.f3125d = r32;
        r02.m2197c();
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setLogo(int r3) {
        m1123j();
        C0873M0 r02 = (C0873M0) this.f1119d;
        if (r3 == 0) goto L5;
        Drawable r32 = AbstractC0358S.m916w(r02.f3122a.getContext(), r3);
    L6:
        r02.f3126e = r32;
        r02.m2197c();
        return;
    L5:
        r32 = null;
        goto L6
    }

    public void setOverlayMode(boolean r1) {
        this.f1121f = r1;
    }

    public void setShowingForActionMode(boolean r1) {
    }

    public void setUiOptions(int r1) {
    }

    public void setWindowCallback(Window.Callback r2) {
        m1123j();
        ((C0873M0) this.f1119d).f3132k = r2;
    }

    public void setWindowTitle(CharSequence r3) {
        m1123j();
        C0873M0 r02 = (C0873M0) this.f1119d;
        if (r02.f3128g == true) goto L10;
        r02.f3129h = r3;
        if ((r02.f3123b & 8) == 0) goto L11;
        Toolbar r1 = r02.f3122a;
        r1.setTitle(r3);
        if (r02.f3128g == false) goto L12;
        AbstractC0080Q.m292k(r1.getRootView(), r3);
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
        return new C0896d(r2);
    }

    public void setIcon(Drawable r2) {
        m1123j();
        C0873M0 r02 = (C0873M0) this.f1119d;
        r02.f3125d = r2;
        r02.m2197c();
    }
}
