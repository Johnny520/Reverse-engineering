package androidx.appcompat.widget;

import android.R;
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
import androidx.appcompat.app.C0958;
import androidx.compose.foundation.text.C1804;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3056;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3053;
import androidx.core.view.C3054;
import androidx.core.view.C3058;
import androidx.core.view.C3064;
import androidx.core.view.C3065;
import androidx.core.view.C3066;
import androidx.core.view.C3067;
import androidx.core.view.C3068;
import androidx.core.view.C3071;
import androidx.core.view.InterfaceC3039;
import androidx.core.view.InterfaceC3084;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import java.util.WeakHashMap;
import p180.C8494;
import p206.InterfaceC8618;
import p206.MenuC8631;
import p208.C8647;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC3084, InterfaceC3039 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final int[] f763 = {C0328R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final Rect f764;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final C3058 f765;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C1051 f766;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final RunnableC1034 f767;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C1804 f768;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ViewPropertyAnimator f769;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public OverScroller f770;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final RunnableC1034 f771;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1035 f772;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Rect f773;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Rect f774;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Rect f775;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f776;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f777;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f778;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC1033 f779;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C3058 f780;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C3058 f781;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C3058 f782;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C3058 f783;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Rect f784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC1067 f785;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ActionBarContainer f786;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Drawable f789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f791;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ContentFrameLayout f792;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f793;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC3056 c3053 = i >= 36 ? new C3053() : i >= 35 ? new C3054() : i >= 34 ? new C3066() : i >= 31 ? new C3065() : i >= 30 ? new C3068() : i >= 29 ? new C3067() : new C3064();
        c3053.mo4618(C8494.m13498(0, 1, 0, 1));
        f765 = c3053.mo4616();
        f764 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f791 = 0;
        this.f775 = new Rect();
        this.f774 = new Rect();
        this.f773 = new Rect();
        this.f784 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C3058 c3058 = C3058.f6865;
        this.f783 = c3058;
        this.f782 = c3058;
        this.f781 = c3058;
        this.f780 = c3058;
        this.f772 = new C1035(this, 0);
        this.f771 = new RunnableC1034(this, 0);
        this.f767 = new RunnableC1034(this, 1);
        m1040(context);
        this.f768 = new C1804();
        C1051 c1051 = new C1051(context);
        c1051.setWillNotDraw(true);
        this.f766 = c1051;
        addView(c1051);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m1030(View view, Rect rect, boolean z) {
        boolean z2;
        C1032 c1032 = (C1032) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1032).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1032).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1032).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1032).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1032).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1032).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1032).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1032).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1032;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f789 != null) {
            if (this.f786.getVisibility() == 0) {
                translationY = (int) (this.f786.getTranslationY() + this.f786.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f789.setBounds(0, translationY, getWidth(), this.f789.getIntrinsicHeight() + translationY);
            this.f789.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1032(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1032(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f786;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1804 c1804 = this.f768;
        return c1804.f3100 | c1804.f3101;
    }

    public CharSequence getTitle() {
        m1038();
        return ((C0993) this.f785).f957.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1038();
        C3058 c3058M4623 = C3058.m4623(this, windowInsets);
        boolean zM1030 = m1030(this.f786, new Rect(c3058M4623.m4627(), c3058M4623.m4625(), c3058M4623.m4626(), c3058M4623.m4628()), false);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        Rect rect = this.f775;
        AbstractC3026.m4565(this, c3058M4623, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C3071 c3071 = c3058M4623.f6866;
        C3058 c3058Mo4609 = c3071.mo4609(i, i2, i3, i4);
        this.f783 = c3058Mo4609;
        boolean z = true;
        if (!this.f782.equals(c3058Mo4609)) {
            this.f782 = this.f783;
            zM1030 = true;
        }
        Rect rect2 = this.f774;
        if (rect2.equals(rect)) {
            z = zM1030;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c3071.mo4581().f6866.mo4577().f6866.mo4578().m4629();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1040(getContext());
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1035();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1032 c1032 = (C1032) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1032).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1032).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m1038();
        measureChildWithMargins(this.f786, i, 0, i2, 0);
        C1032 c1032 = (C1032) this.f786.getLayoutParams();
        int iMax = Math.max(0, this.f786.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1032).leftMargin + ((ViewGroup.MarginLayoutParams) c1032).rightMargin);
        int iMax2 = Math.max(0, this.f786.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1032).topMargin + ((ViewGroup.MarginLayoutParams) c1032).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f786.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f793;
            if (this.f787 && this.f786.getTabContainer() != null) {
                measuredHeight += this.f793;
            }
        } else {
            measuredHeight = this.f786.getVisibility() != 8 ? this.f786.getMeasuredHeight() : 0;
        }
        Rect rect = this.f775;
        Rect rect2 = this.f773;
        rect2.set(rect);
        this.f781 = this.f783;
        if (this.f790 || z) {
            C8494 c8494M13498 = C8494.m13498(this.f781.m4627(), this.f781.m4625() + measuredHeight, this.f781.m4626(), this.f781.m4628());
            C3058 c3058 = this.f781;
            int i3 = Build.VERSION.SDK_INT;
            AbstractC3056 c3053 = i3 >= 36 ? new C3053(c3058) : i3 >= 35 ? new C3054(c3058) : i3 >= 34 ? new C3066(c3058) : i3 >= 31 ? new C3065(c3058) : i3 >= 30 ? new C3068(c3058) : i3 >= 29 ? new C3067(c3058) : new C3064(c3058);
            c3053.mo4618(c8494M13498);
            this.f781 = c3053.mo4616();
        } else {
            C1051 c1051 = this.f766;
            C3058 c30582 = f765;
            Rect rect3 = this.f784;
            AbstractC3026.m4565(c1051, c30582, rect3);
            if (!rect3.equals(f764)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f781 = this.f781.f6866.mo4609(0, measuredHeight, 0, 0);
            }
        }
        m1030(this.f792, rect2, true);
        if (!this.f780.equals(this.f781)) {
            C3058 c30583 = this.f781;
            this.f780 = c30583;
            AbstractC3103.m4796(this.f792, c30583);
        }
        measureChildWithMargins(this.f792, i, 0, i2, 0);
        C1032 c10322 = (C1032) this.f792.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f792.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c10322).leftMargin + ((ViewGroup.MarginLayoutParams) c10322).rightMargin);
        int iMax4 = Math.max(iMax2, this.f792.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c10322).topMargin + ((ViewGroup.MarginLayoutParams) c10322).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f792.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f788 || !z) {
            return false;
        }
        this.f770.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f770.getFinalY() > this.f786.getHeight()) {
            m1035();
            this.f767.run();
        } else {
            m1035();
            this.f771.run();
        }
        this.f778 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f777 + i2;
        this.f777 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0958 c0958;
        C8647 c8647;
        this.f768.f3101 = i;
        this.f777 = getActionBarHideOffset();
        m1035();
        InterfaceC1033 interfaceC1033 = this.f779;
        if (interfaceC1033 == null || (c8647 = (c0958 = (C0958) interfaceC1033).f683) == null) {
            return;
        }
        c8647.m13740();
        c0958.f683 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f786.getVisibility() != 0) {
            return false;
        }
        return this.f788;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f788 || this.f778) {
            return;
        }
        if (this.f777 <= this.f786.getHeight()) {
            m1035();
            postDelayed(this.f771, 600L);
        } else {
            m1035();
            postDelayed(this.f767, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m1038();
        int i2 = this.f776 ^ i;
        this.f776 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC1033 interfaceC1033 = this.f779;
        if (interfaceC1033 != null) {
            C0958 c0958 = (C0958) interfaceC1033;
            c0958.f692 = !z2;
            if (z || !z2) {
                if (c0958.f693) {
                    c0958.f693 = false;
                    c0958.m980(true);
                }
            } else if (!c0958.f693) {
                c0958.f693 = true;
                c0958.m980(true);
            }
        }
        if ((i2 & 256) == 0 || this.f779 == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f791 = i;
        InterfaceC1033 interfaceC1033 = this.f779;
        if (interfaceC1033 != null) {
            ((C0958) interfaceC1033).f688 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m1035();
        this.f786.setTranslationY(-Math.max(0, Math.min(i, this.f786.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1033 interfaceC1033) {
        this.f779 = interfaceC1033;
        if (getWindowToken() != null) {
            ((C0958) this.f779).f688 = this.f791;
            int i = this.f776;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f787 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f788) {
            this.f788 = z;
            if (z) {
                return;
            }
            m1035();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m1038();
        C0993 c0993 = (C0993) this.f785;
        c0993.f954 = i != 0 ? AbstractC4765.m8871(c0993.f957.getContext(), i) : null;
        c0993.m1158();
    }

    public void setLogo(int i) {
        m1038();
        C0993 c0993 = (C0993) this.f785;
        c0993.f953 = i != 0 ? AbstractC4765.m8871(c0993.f957.getContext(), i) : null;
        c0993.m1158();
    }

    public void setOverlayMode(boolean z) {
        this.f790 = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        m1038();
        ((C0993) this.f785).f963 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m1038();
        C0993 c0993 = (C0993) this.f785;
        if (c0993.f962) {
            return;
        }
        Toolbar toolbar = c0993.f957;
        c0993.f961 = charSequence;
        if ((c0993.f956 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0993.f962) {
                AbstractC3103.m4801(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo1031(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo1032(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1033(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.view.InterfaceC3039
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1034(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1033(view, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1035() {
        removeCallbacks(this.f771);
        removeCallbacks(this.f767);
        ViewPropertyAnimator viewPropertyAnimator = this.f769;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo1037(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1038() {
        InterfaceC1067 wrapper;
        if (this.f792 == null) {
            this.f792 = (ContentFrameLayout) findViewById(C0328R.id.action_bar_activity_content);
            this.f786 = (ActionBarContainer) findViewById(C0328R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(C0328R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1067) {
                wrapper = (InterfaceC1067) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    C6755.m11870("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f785 = wrapper;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m1039(Menu menu, InterfaceC8618 interfaceC8618) {
        m1038();
        C0993 c0993 = (C0993) this.f785;
        Toolbar toolbar = c0993.f957;
        if (c0993.f959 == null) {
            c0993.f959 = new C1044(toolbar.getContext());
        }
        C1044 c1044 = c0993.f959;
        c1044.f1133 = interfaceC8618;
        MenuC8631 menuC8631 = (MenuC8631) menu;
        if (menuC8631 == null && toolbar.f856 == null) {
            return;
        }
        toolbar.m1053();
        MenuC8631 menuC86312 = toolbar.f856.f806;
        if (menuC86312 == menuC8631) {
            return;
        }
        if (menuC86312 != null) {
            menuC86312.m13722(toolbar.f866);
            menuC86312.m13722(toolbar.f867);
        }
        if (toolbar.f867 == null) {
            toolbar.f867 = new C1006(toolbar);
        }
        c1044.f1131 = true;
        Context context = toolbar.f841;
        if (menuC8631 != null) {
            menuC8631.m13714(c1044, context);
            menuC8631.m13714(toolbar.f867, toolbar.f841);
        } else {
            c1044.mo1171(context, null);
            toolbar.f867.mo1171(toolbar.f841, null);
            c1044.mo1174();
            toolbar.f867.mo1174();
        }
        toolbar.f856.setPopupTheme(toolbar.f840);
        toolbar.f856.setPresenter(c1044);
        toolbar.f866 = c1044;
        toolbar.m1062();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1040(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f763);
        this.f793 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f789 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f770 = new OverScroller(context);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1041(int i) {
        m1038();
        if (i == 2) {
            ((C0993) this.f785).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C0993) this.f785).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1032(layoutParams);
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(Drawable drawable) {
        m1038();
        C0993 c0993 = (C0993) this.f785;
        c0993.f954 = drawable;
        c0993.m1158();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1036(View view, int i, int i2, int[] iArr, int i3) {
    }
}
