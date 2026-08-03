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
    public static final C0122q0 f1113A;

    /* JADX INFO: renamed from: B */
    public static final Rect f1114B;

    /* JADX INFO: renamed from: z */
    public static final int[] f1115z = {C1031R.attr.actionBarSize, R.attr.windowContentOverlay};

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
        int i2 = Build.VERSION.SDK_INT;
        AbstractC0106i0 c0104h0 = i2 >= 30 ? new C0104h0() : i2 >= 29 ? new C0102g0() : new C0100f0();
        c0104h0.mo364g(C1102c.m2598b(0, 1, 0, 1));
        f1113A = c0104h0.mo362b();
        f1114B = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1126k = new Rect();
        this.f1127l = new Rect();
        this.f1128m = new Rect();
        this.f1129n = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0122q0 c0122q0 = C0122q0.f308b;
        this.f1130o = c0122q0;
        this.f1131p = c0122q0;
        this.f1132q = c0122q0;
        this.f1133r = c0122q0;
        this.f1136u = new C0038n(2, this);
        this.f1137v = new RunnableC0892b(this, 0);
        this.f1138w = new RunnableC0892b(this, 1);
        m1122i(context);
        this.f1139x = new C0119p();
        C0898e c0898e = new C0898e(context);
        c0898e.setWillNotDraw(true);
        this.f1140y = c0898e;
        addView(c0898e);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1120g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0896d c0896d = (C0896d) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0896d).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0896d).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0896d).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0896d).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0896d).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0896d).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0896d).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0896d).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: a */
    public final void mo421a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // p006D.InterfaceC0117o
    /* JADX INFO: renamed from: b */
    public final void mo426b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        mo422c(view, i2, i3, i4, i5, i6);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: c */
    public final void mo422c(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0896d;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: d */
    public final void mo423d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1120e != null) {
            if (this.f1118c.getVisibility() == 0) {
                translationY = (int) (this.f1118c.getTranslationY() + this.f1118c.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f1120e.setBounds(0, translationY, getWidth(), this.f1120e.getIntrinsicHeight() + translationY);
            this.f1120e.draw(canvas);
        }
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: e */
    public final void mo424e(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: f */
    public final boolean mo425f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0896d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0896d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1118c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0119p c0119p = this.f1139x;
        return c0119p.f307b | c0119p.f306a;
    }

    public CharSequence getTitle() {
        m1123j();
        return ((C0873M0) this.f1119d).f3122a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m1121h() {
        removeCallbacks(this.f1137v);
        removeCallbacks(this.f1138w);
        ViewPropertyAnimator viewPropertyAnimator = this.f1135t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1122i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1115z);
        this.f1116a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1120e = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1134s = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m1123j() {
        InterfaceC0882S wrapper;
        if (this.f1117b == null) {
            this.f1117b = (ContentFrameLayout) findViewById(C1031R.id.action_bar_activity_content);
            this.f1118c = (ActionBarContainer) findViewById(C1031R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(C1031R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0882S) {
                wrapper = (InterfaceC0882S) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1119d = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1123j();
        C0122q0 c0122q0M429d = C0122q0.m429d(this, windowInsets);
        C0118o0 c0118o0 = c0122q0M429d.f309a;
        boolean zM1120g = m1120g(this.f1118c, new Rect(c0118o0.mo382j().f4249a, c0122q0M429d.m430a(), c0118o0.mo382j().f4251c, c0118o0.mo382j().f4252d), false);
        Field field = AbstractC0080Q.f219a;
        Rect rect = this.f1126k;
        AbstractC0070G.m212b(this, c0122q0M429d, rect);
        C0122q0 c0122q0Mo383l = c0118o0.mo383l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1130o = c0122q0Mo383l;
        boolean z2 = true;
        if (!this.f1131p.equals(c0122q0Mo383l)) {
            this.f1131p = this.f1130o;
            zM1120g = true;
        }
        Rect rect2 = this.f1127l;
        if (rect2.equals(rect)) {
            z2 = zM1120g;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0118o0.mo407a().f309a.mo390c().f309a.mo389b().m431c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1122i(getContext());
        Field field = AbstractC0080Q.f219a;
        AbstractC0068E.m210c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1121h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0896d c0896d = (C0896d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0896d).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0896d).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        m1123j();
        measureChildWithMargins(this.f1118c, i2, 0, i3, 0);
        C0896d c0896d = (C0896d) this.f1118c.getLayoutParams();
        int iMax = Math.max(0, this.f1118c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0896d).leftMargin + ((ViewGroup.MarginLayoutParams) c0896d).rightMargin);
        int iMax2 = Math.max(0, this.f1118c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0896d).topMargin + ((ViewGroup.MarginLayoutParams) c0896d).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1118c.getMeasuredState());
        Field field = AbstractC0080Q.f219a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1116a;
            if (this.f1122g && this.f1118c.getTabContainer() != null) {
                measuredHeight += this.f1116a;
            }
        } else {
            measuredHeight = this.f1118c.getVisibility() != 8 ? this.f1118c.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1126k;
        Rect rect2 = this.f1128m;
        rect2.set(rect);
        this.f1132q = this.f1130o;
        if (this.f1121f || z2) {
            C1102c c1102cM2598b = C1102c.m2598b(this.f1132q.f309a.mo382j().f4249a, this.f1132q.m430a() + measuredHeight, this.f1132q.f309a.mo382j().f4251c, this.f1132q.f309a.mo382j().f4252d);
            C0122q0 c0122q0 = this.f1132q;
            int i4 = Build.VERSION.SDK_INT;
            AbstractC0106i0 c0104h0 = i4 >= 30 ? new C0104h0(c0122q0) : i4 >= 29 ? new C0102g0(c0122q0) : new C0100f0(c0122q0);
            c0104h0.mo364g(c1102cM2598b);
            this.f1132q = c0104h0.mo362b();
        } else {
            AbstractC0070G.m212b(this.f1140y, f1113A, this.f1129n);
            if (!r9.equals(f1114B)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1132q = this.f1132q.f309a.mo383l(0, measuredHeight, 0, 0);
            }
        }
        m1120g(this.f1117b, rect2, true);
        if (!this.f1133r.equals(this.f1132q)) {
            C0122q0 c0122q02 = this.f1132q;
            this.f1133r = c0122q02;
            ContentFrameLayout contentFrameLayout = this.f1117b;
            WindowInsets windowInsetsM431c = c0122q02.m431c();
            if (windowInsetsM431c != null) {
                WindowInsets windowInsetsM208a = AbstractC0068E.m208a(contentFrameLayout, windowInsetsM431c);
                if (!windowInsetsM208a.equals(windowInsetsM431c)) {
                    C0122q0.m429d(contentFrameLayout, windowInsetsM208a);
                }
            }
        }
        measureChildWithMargins(this.f1117b, i2, 0, i3, 0);
        C0896d c0896d2 = (C0896d) this.f1117b.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1117b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0896d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0896d2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1117b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0896d2).topMargin + ((ViewGroup.MarginLayoutParams) c0896d2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1117b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f1123h || !z2) {
            return false;
        }
        this.f1134s.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1134s.getFinalY() > this.f1118c.getHeight()) {
            m1121h();
            this.f1138w.run();
        } else {
            m1121h();
            this.f1137v.run();
        }
        this.f1124i = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1125j + i3;
        this.f1125j = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1139x.f306a = i2;
        this.f1125j = getActionBarHideOffset();
        m1121h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f1118c.getVisibility() != 0) {
            return false;
        }
        return this.f1123h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1123h || this.f1124i) {
            return;
        }
        if (this.f1125j <= this.f1118c.getHeight()) {
            m1121h();
            postDelayed(this.f1137v, 600L);
        } else {
            m1121h();
            postDelayed(this.f1138w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        m1123j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        m1121h();
        this.f1118c.setTranslationY(-Math.max(0, Math.min(i2, this.f1118c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0894c interfaceC0894c) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f1122g = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f1123h) {
            this.f1123h = z2;
            if (z2) {
                return;
            }
            m1121h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        m1123j();
        C0873M0 c0873m0 = (C0873M0) this.f1119d;
        c0873m0.f3125d = i2 != 0 ? AbstractC0358S.m916w(c0873m0.f3122a.getContext(), i2) : null;
        c0873m0.m2197c();
    }

    public void setLogo(int i2) {
        m1123j();
        C0873M0 c0873m0 = (C0873M0) this.f1119d;
        c0873m0.f3126e = i2 != 0 ? AbstractC0358S.m916w(c0873m0.f3122a.getContext(), i2) : null;
        c0873m0.m2197c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1121f = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        m1123j();
        ((C0873M0) this.f1119d).f3132k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m1123j();
        C0873M0 c0873m0 = (C0873M0) this.f1119d;
        if (c0873m0.f3128g) {
            return;
        }
        c0873m0.f3129h = charSequence;
        if ((c0873m0.f3123b & 8) != 0) {
            Toolbar toolbar = c0873m0.f3122a;
            toolbar.setTitle(charSequence);
            if (c0873m0.f3128g) {
                AbstractC0080Q.m292k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0896d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m1123j();
        C0873M0 c0873m0 = (C0873M0) this.f1119d;
        c0873m0.f3125d = drawable;
        c0873m0.m2197c();
    }
}
