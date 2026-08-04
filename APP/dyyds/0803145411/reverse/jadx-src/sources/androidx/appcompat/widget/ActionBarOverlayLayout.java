package androidx.appcompat.widget;

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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;
import yyds.AbstractC0588;
import yyds.AbstractC0821;
import yyds.AbstractC1367;
import yyds.AbstractC1640;
import yyds.AbstractC2709;
import yyds.C0018;
import yyds.C0021;
import yyds.C0188;
import yyds.C0273;
import yyds.C0528;
import yyds.C1193;
import yyds.C1313;
import yyds.C1370;
import yyds.C1459;
import yyds.C1870;
import yyds.C2116;
import yyds.C2205;
import yyds.C2292;
import yyds.C2610;
import yyds.C2693;
import yyds.C2780;
import yyds.C2784;
import yyds.InterfaceC0127;
import yyds.InterfaceC1379;
import yyds.InterfaceC1503;
import yyds.InterfaceC1567;
import yyds.InterfaceC2407;
import yyds.InterfaceC2742;
import yyds.MenuC0836;
import yyds.RunnableC1337;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2742, InterfaceC1503, InterfaceC1567 {

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static final int[] f105 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final C2292 f106;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f107;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Drawable f108;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f109;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final RunnableC1337 f110;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f111;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public ContentFrameLayout f112;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public OverScroller f113;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public C2693 f114;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f115;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final Rect f116;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final C2116 f117;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public InterfaceC1379 f118;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final Rect f119;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC0127 f120;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public C2693 f121;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public C2693 f122;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f123;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f124;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final RunnableC1337 f125;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f126;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public C2693 f127;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f128;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final Rect f129;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public ActionBarContainer f130;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f131;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public ViewPropertyAnimator f132;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131 = 0;
        this.f129 = new Rect();
        this.f119 = new Rect();
        this.f116 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C2693 c2693 = C2693.f13241;
        this.f127 = c2693;
        this.f114 = c2693;
        this.f122 = c2693;
        this.f121 = c2693;
        this.f117 = new C2116(0, this);
        this.f110 = new RunnableC1337(this, 0);
        this.f125 = new RunnableC1337(this, 1);
        m43(context);
        this.f106 = new C2292();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static boolean m41(View view, Rect rect, boolean z) {
        boolean z2;
        C0273 c0273 = (C0273) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0273).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0273).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0273).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0273).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0273).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0273).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0273).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0273).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0273;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f108 == null || this.f111) {
            return;
        }
        if (this.f130.getVisibility() == 0) {
            translationY = (int) (this.f130.getTranslationY() + this.f130.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f108.setBounds(0, translationY, getWidth(), this.f108.getIntrinsicHeight() + translationY);
        this.f108.draw(canvas);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0273(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0273(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f130;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C2292 c2292 = this.f106;
        return c2292.f11257 | c2292.f11256;
    }

    public CharSequence getTitle() {
        m47();
        return ((C2780) this.f120).f13571.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m47();
        C2693 c2693M4783 = C2693.m4783(this, windowInsets);
        C2610 c2610 = c2693M4783.f13242;
        boolean zM41 = m41(this.f130, new Rect(c2610.mo4551().f9413, c2610.mo4551().f9414, c2610.mo4551().f9415, c2610.mo4551().f9416), false);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        Rect rect = this.f129;
        AbstractC2709.m4819(this, c2693M4783, rect);
        C2693 c2693Mo3450 = c2610.mo3450(rect.left, rect.top, rect.right, rect.bottom);
        this.f127 = c2693Mo3450;
        boolean z = true;
        if (!this.f114.equals(c2693Mo3450)) {
            this.f114 = this.f127;
            zM41 = true;
        }
        Rect rect2 = this.f119;
        if (rect2.equals(rect)) {
            z = zM41;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c2610.mo4693().f13242.mo3674().f13242.mo3673().m4784();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m43(getContext());
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m42();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0273 c0273 = (C0273) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0273).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0273).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m47();
        measureChildWithMargins(this.f130, i, 0, i2, 0);
        C0273 c0273 = (C0273) this.f130.getLayoutParams();
        int iMax = Math.max(0, this.f130.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0273).leftMargin + ((ViewGroup.MarginLayoutParams) c0273).rightMargin);
        int iMax2 = Math.max(0, this.f130.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0273).topMargin + ((ViewGroup.MarginLayoutParams) c0273).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f130.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f128;
            if (this.f123 && this.f130.getTabContainer() != null) {
                measuredHeight += this.f128;
            }
        } else {
            measuredHeight = this.f130.getVisibility() != 8 ? this.f130.getMeasuredHeight() : 0;
        }
        Rect rect = this.f129;
        Rect rect2 = this.f116;
        rect2.set(rect);
        C2693 c2693 = this.f127;
        this.f122 = c2693;
        if (this.f126 || z) {
            C1870 c1870M3654 = C1870.m3654(c2693.f13242.mo4551().f9413, this.f122.f13242.mo4551().f9414 + measuredHeight, this.f122.f13242.mo4551().f9415, this.f122.f13242.mo4551().f9416);
            C2693 c26932 = this.f122;
            int i3 = Build.VERSION.SDK_INT;
            AbstractC0821 c1193 = i3 >= 36 ? new C1193(c26932) : i3 >= 35 ? new C1459(c26932) : i3 >= 34 ? new C0018(c26932) : i3 >= 31 ? new C0021(c26932) : new C1370(c26932);
            c1193.m1890(c1870M3654);
            this.f122 = c1193.mo1889();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f122 = c2693.f13242.mo3450(0, measuredHeight, 0, 0);
        }
        m41(this.f112, rect2, true);
        if (!this.f121.equals(this.f122)) {
            C2693 c26933 = this.f122;
            this.f121 = c26933;
            ContentFrameLayout contentFrameLayout = this.f112;
            WindowInsets windowInsetsM4784 = c26933.m4784();
            if (windowInsetsM4784 != null) {
                WindowInsets windowInsetsM1467 = AbstractC0588.m1467(contentFrameLayout, windowInsetsM4784);
                if (!windowInsetsM1467.equals(windowInsetsM4784)) {
                    C2693.m4783(contentFrameLayout, windowInsetsM1467);
                }
            }
        }
        measureChildWithMargins(this.f112, i, 0, i2, 0);
        C0273 c02732 = (C0273) this.f112.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f112.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c02732).leftMargin + ((ViewGroup.MarginLayoutParams) c02732).rightMargin);
        int iMax4 = Math.max(iMax2, this.f112.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c02732).topMargin + ((ViewGroup.MarginLayoutParams) c02732).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f112.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f124 || !z) {
            return false;
        }
        this.f113.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f113.getFinalY() > this.f130.getHeight()) {
            m42();
            this.f125.run();
        } else {
            m42();
            this.f110.run();
        }
        this.f109 = true;
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
        int i5 = this.f107 + i2;
        this.f107 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0528 c0528;
        C2205 c2205;
        this.f106.f11256 = i;
        this.f107 = getActionBarHideOffset();
        m42();
        InterfaceC1379 interfaceC1379 = this.f118;
        if (interfaceC1379 == null || (c2205 = (c0528 = (C0528) interfaceC1379).f2549) == null) {
            return;
        }
        c2205.m4190();
        c0528.f2549 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f130.getVisibility() != 0) {
            return false;
        }
        return this.f124;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f124 || this.f109) {
            return;
        }
        if (this.f107 <= this.f130.getHeight()) {
            m42();
            postDelayed(this.f110, 600L);
        } else {
            m42();
            postDelayed(this.f125, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m47();
        int i2 = this.f115 ^ i;
        this.f115 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC1379 interfaceC1379 = this.f118;
        if (interfaceC1379 != null) {
            C0528 c0528 = (C0528) interfaceC1379;
            c0528.f2538 = !z2;
            if (z || !z2) {
                if (c0528.f2551) {
                    c0528.f2551 = false;
                    c0528.m1365(true);
                }
            } else if (!c0528.f2551) {
                c0528.f2551 = true;
                c0528.m1365(true);
            }
        }
        if ((i2 & 256) == 0 || this.f118 == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f131 = i;
        InterfaceC1379 interfaceC1379 = this.f118;
        if (interfaceC1379 != null) {
            ((C0528) interfaceC1379).f2530 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m42();
        this.f130.setTranslationY(-Math.max(0, Math.min(i, this.f130.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1379 interfaceC1379) {
        this.f118 = interfaceC1379;
        if (getWindowToken() != null) {
            ((C0528) this.f118).f2530 = this.f131;
            int i = this.f115;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f123 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f124) {
            this.f124 = z;
            if (z) {
                return;
            }
            m42();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m47();
        C2780 c2780 = (C2780) this.f120;
        c2780.f13580 = i != 0 ? AbstractC1367.m2767(c2780.f13571.getContext(), i) : null;
        c2780.m4903();
    }

    public void setLogo(int i) {
        m47();
        C2780 c2780 = (C2780) this.f120;
        c2780.f13570 = i != 0 ? AbstractC1367.m2767(c2780.f13571.getContext(), i) : null;
        c2780.m4903();
    }

    public void setOverlayMode(boolean z) {
        this.f126 = z;
        this.f111 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        m47();
        ((C2780) this.f120).f13575 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m47();
        C2780 c2780 = (C2780) this.f120;
        if (c2780.f13574) {
            return;
        }
        Toolbar toolbar = c2780.f13571;
        c2780.f13567 = charSequence;
        if ((c2780.f13573 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c2780.f13574) {
                AbstractC1640.m3342(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m42() {
        removeCallbacks(this.f110);
        removeCallbacks(this.f125);
        ViewPropertyAnimator viewPropertyAnimator = this.f132;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m43(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f105);
        this.f128 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f108 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f111 = context.getApplicationInfo().targetSdkVersion < 19;
        this.f113 = new OverScroller(context);
    }

    @Override // yyds.InterfaceC1567
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo44(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo46(viewGroup, i, i2, i3, i4, i5);
    }

    @Override // yyds.InterfaceC1503
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo45(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // yyds.InterfaceC1503
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo46(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(viewGroup, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m47() {
        InterfaceC0127 wrapper;
        if (this.f112 == null) {
            this.f112 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f130 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0127) {
                wrapper = (InterfaceC0127) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    C0188.m800("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f120 = wrapper;
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m48(MenuC0836 menuC0836, InterfaceC2407 interfaceC2407) {
        m47();
        C2780 c2780 = (C2780) this.f120;
        Toolbar toolbar = c2780.f13571;
        C1313 c1313 = c2780.f13568;
        if (c1313 == null) {
            c1313 = new C1313(toolbar.getContext());
            c2780.f13568 = c1313;
        }
        c1313.f6011 = interfaceC2407;
        if (menuC0836 == null && toolbar.f234 == null) {
            return;
        }
        toolbar.m91();
        MenuC0836 menuC08362 = toolbar.f234.f136;
        if (menuC08362 == menuC0836) {
            return;
        }
        if (menuC08362 != null) {
            menuC08362.m1903(toolbar.f236);
            menuC08362.m1903(toolbar.f221);
        }
        if (toolbar.f221 == null) {
            toolbar.f221 = new C2784(toolbar);
        }
        c1313.f6017 = true;
        Context context = toolbar.f225;
        if (menuC0836 != null) {
            menuC0836.m1904(c1313, context);
            menuC0836.m1904(toolbar.f221, toolbar.f225);
        } else {
            c1313.mo1507(context, null);
            toolbar.f221.mo1507(toolbar.f225, null);
            c1313.mo1503();
            toolbar.f221.mo1503();
        }
        toolbar.f234.setPopupTheme(toolbar.f205);
        toolbar.f234.setPresenter(c1313);
        toolbar.f236 = c1313;
        toolbar.m81();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m49(int i) {
        m47();
        if (i == 2) {
            ((C2780) this.f120).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C2780) this.f120).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // yyds.InterfaceC1503
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo50(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // yyds.InterfaceC1503
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean mo51(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // yyds.InterfaceC1503
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo52(int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0273(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m47();
        C2780 c2780 = (C2780) this.f120;
        c2780.f13580 = drawable;
        c2780.m4903();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
