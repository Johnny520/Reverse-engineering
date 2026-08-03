package androidx.appcompat.widget;

import Yue.C5450;
import Yue.C6370;
import Yue.C6898;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC4329;
import Yue.InterfaceC4330;
import Yue.InterfaceC6367;
import Yue.InterfaceC6368;
import Yue.InterfaceC6369;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC8699;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC4329, InterfaceC6369, InterfaceC6367, InterfaceC6368 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f26132 = "ActionBarOverlayLayout";

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f26133 = 600;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int[] f26134 = {C6898.C1110.f18353, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final C8472 f26135 = new C8472.C1543().m28316(C5450.m16958(0, 1, 0, 1)).m4466();

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final Rect f26136 = new Rect();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f26137;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f26138;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public ContentFrameLayout f26139;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ActionBarContainer f26140;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public InterfaceC4330 f26141;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Drawable f26142;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f26143;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f26144;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f26145;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f26146;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f26147;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f26148;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final Rect f26149;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final Rect f26150;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final Rect f26151;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final Rect f26152;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final Rect f26153;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final Rect f26154;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final Rect f26155;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final Rect f26156;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    @InterfaceC6391
    public C8472 f26157;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    @InterfaceC6391
    public C8472 f26158;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6391
    public C8472 f26159;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    @InterfaceC6391
    public C8472 f26160;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public InterfaceC8704 f26161;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public OverScroller f26162;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public ViewPropertyAnimator f26163;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final AnimatorListenerAdapter f26164;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final Runnable f26165;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Runnable f26166;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C6370 f26167;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final C8706 f26168;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ */
    public class C1613 extends AnimatorListenerAdapter {
        public C1613() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26163 = null;
            actionBarOverlayLayout.f26146 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26163 = null;
            actionBarOverlayLayout.f26146 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟ */
    public class RunnableC1614 implements Runnable {
        public RunnableC1614() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m29080();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26163 = actionBarOverlayLayout.f26140.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f26164);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC8703 implements Runnable {
        public RunnableC8703() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m29080();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f26163 = actionBarOverlayLayout.f26140.animate().translationY(-ActionBarOverlayLayout.this.f26140.getHeight()).setListener(ActionBarOverlayLayout.this.f26164);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8704 {
        /* JADX INFO: renamed from: ۥ */
        void mo4633();

        /* JADX INFO: renamed from: ۥ۟ */
        void mo4634();

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo28963(boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo28964();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        void mo28965();

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo28966(int i);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8705 extends ViewGroup.MarginLayoutParams {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8705(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8705(int i, int i2) {
            super(i, i2);
        }

        public C8705(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C8705(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C8706 extends View {
        public C8706(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarOverlayLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    private void m29073(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f26134);
        this.f26137 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f26142 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f26162 = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8705;
    }

    @Override // android.view.View
    public void draw(@InterfaceC6391 Canvas canvas) {
        super.draw(canvas);
        if (this.f26142 != null) {
            int bottom = this.f26140.getVisibility() == 0 ? (int) (this.f26140.getBottom() + this.f26140.getTranslationY() + 0.5f) : 0;
            this.f26142.setBounds(0, bottom, getWidth(), this.f26142.getIntrinsicHeight() + bottom);
            this.f26142.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f26140;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, Yue.InterfaceC6369
    public int getNestedScrollAxes() {
        return this.f26167.m2825();
    }

    @Override // Yue.InterfaceC4329
    public CharSequence getTitle() {
        m29085();
        return this.f26141.getTitle();
    }

    @Override // android.view.View
    @InterfaceC7113(21)
    public WindowInsets onApplyWindowInsets(@InterfaceC6391 WindowInsets windowInsets) {
        m29085();
        C8472 c8472M28277 = C8472.m28277(windowInsets, this);
        boolean zM29075 = m29075(this.f26140, new Rect(c8472M28277.m28291(), c8472M28277.m28293(), c8472M28277.m28292(), c8472M28277.m28290()), true, true, false, true);
        C8273.m27316(this, c8472M28277, this.f26149);
        Rect rect = this.f26149;
        C8472 c8472M28299 = c8472M28277.m28299(rect.left, rect.top, rect.right, rect.bottom);
        this.f26157 = c8472M28299;
        boolean z = true;
        if (!this.f26158.equals(c8472M28299)) {
            this.f26158 = this.f26157;
            zM29075 = true;
        }
        if (this.f26150.equals(this.f26149)) {
            z = zM29075;
        } else {
            this.f26150.set(this.f26149);
        }
        if (z) {
            requestLayout();
        }
        return c8472M28277.m4463().m28278().m4464().m28310();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m29073(getContext());
        C8273.m27433(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m29080();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C8705 c8705 = (C8705) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c8705).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c8705).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        m29085();
        measureChildWithMargins(this.f26140, i, 0, i2, 0);
        C8705 c8705 = (C8705) this.f26140.getLayoutParams();
        int iMax = Math.max(0, this.f26140.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c8705).leftMargin + ((ViewGroup.MarginLayoutParams) c8705).rightMargin);
        int iMax2 = Math.max(0, this.f26140.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c8705).topMargin + ((ViewGroup.MarginLayoutParams) c8705).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f26140.getMeasuredState());
        boolean z = (C8273.m27385(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f26137;
            if (this.f26144 && this.f26140.getTabContainer() != null) {
                measuredHeight += this.f26137;
            }
        } else {
            measuredHeight = this.f26140.getVisibility() != 8 ? this.f26140.getMeasuredHeight() : 0;
        }
        this.f26151.set(this.f26149);
        this.f26159 = this.f26157;
        if (this.f26143 || z || !m29076()) {
            this.f26159 = new C8472.C1543(this.f26159).m28316(C5450.m16958(this.f26159.m28291(), this.f26159.m28293() + measuredHeight, this.f26159.m28292(), this.f26159.m28290())).m4466();
        } else {
            Rect rect = this.f26151;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f26159 = this.f26159.m28299(0, measuredHeight, 0, 0);
        }
        m29075(this.f26139, this.f26151, true, true, true, true);
        if (!this.f26160.equals(this.f26159)) {
            C8472 c8472 = this.f26159;
            this.f26160 = c8472;
            C8273.m27317(this.f26139, c8472);
        }
        measureChildWithMargins(this.f26139, i, 0, i2, 0);
        C8705 c87052 = (C8705) this.f26139.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f26139.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c87052).leftMargin + ((ViewGroup.MarginLayoutParams) c87052).rightMargin);
        int iMax4 = Math.max(iMax2, this.f26139.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c87052).topMargin + ((ViewGroup.MarginLayoutParams) c87052).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f26139.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f26145 || !z) {
            return false;
        }
        if (m29087(f2)) {
            m29074();
        } else {
            m29086();
        }
        this.f26146 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6368
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6367
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6367
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6367
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m29085();
        int i2 = this.f26148 ^ i;
        this.f26148 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC8704 interfaceC8704 = this.f26161;
        if (interfaceC8704 != null) {
            interfaceC8704.mo28963(!z2);
            if (z || !z2) {
                this.f26161.mo4633();
            } else {
                this.f26161.mo28964();
            }
        }
        if ((i2 & 256) == 0 || this.f26161 == null) {
            return;
        }
        C8273.m27433(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f26138 = i;
        InterfaceC8704 interfaceC8704 = this.f26161;
        if (interfaceC8704 != null) {
            interfaceC8704.mo28966(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m29080();
        this.f26140.setTranslationY(-Math.max(0, Math.min(i, this.f26140.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC8704 interfaceC8704) {
        this.f26161 = interfaceC8704;
        if (getWindowToken() != null) {
            this.f26161.mo28966(this.f26138);
            int i = this.f26148;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C8273.m27433(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f26144 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f26145) {
            this.f26145 = z;
            if (z) {
                return;
            }
            m29080();
            setActionBarHideOffset(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC4329
    public void setIcon(int i) {
        m29085();
        this.f26141.setIcon(i);
    }

    @Override // Yue.InterfaceC4329
    public void setLogo(int i) {
        m29085();
        this.f26141.setLogo(i);
    }

    public void setOverlayMode(boolean z) {
        this.f26143 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // Yue.InterfaceC4329
    public void setUiOptions(int i) {
    }

    @Override // Yue.InterfaceC4329
    public void setWindowCallback(Window.Callback callback) {
        m29085();
        this.f26141.setWindowCallback(callback);
    }

    @Override // Yue.InterfaceC4329
    public void setWindowTitle(CharSequence charSequence) {
        m29085();
        this.f26141.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ */
    public void mo1294(Menu menu, InterfaceC8699.InterfaceC1607 interfaceC1607) {
        m29085();
        this.f26141.mo1296(menu, interfaceC1607);
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1295() {
        m29085();
        return this.f26141.mo1297();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo12526() {
        m29085();
        this.f26141.mo12537();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo12527() {
        m29085();
        return this.f26141.mo12538();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo12528() {
        m29085();
        return this.f26141.mo12539();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo12529() {
        m29085();
        return this.f26141.mo12540();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo12530() {
        m29085();
        return this.f26141.mo12541();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo12531() {
        m29085();
        return this.f26141.mo12542();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo12532() {
        m29085();
        return this.f26141.mo12543();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo12533(SparseArray<Parcelable> sparseArray) {
        m29085();
        this.f26141.mo12555(sparseArray);
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo12534(int i) {
        m29085();
        if (i == 2) {
            this.f26141.mo12574();
        } else if (i == 5) {
            this.f26141.mo12576();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo12535() {
        m29085();
        this.f26141.mo12545();
    }

    @Override // Yue.InterfaceC4329
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo12536(SparseArray<Parcelable> sparseArray) {
        m29085();
        this.f26141.mo12568(sparseArray);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29074() {
        m29080();
        this.f26166.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m29075(@InterfaceC6391 View view, @InterfaceC6391 Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        C8705 c8705 = (C8705) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) c8705).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) c8705).leftMargin = i2;
                z5 = true;
            } else {
                z5 = false;
            }
        }
        if (z2) {
            int i3 = ((ViewGroup.MarginLayoutParams) c8705).topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                ((ViewGroup.MarginLayoutParams) c8705).topMargin = i4;
                z5 = true;
            }
        }
        if (z4) {
            int i5 = ((ViewGroup.MarginLayoutParams) c8705).rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) c8705).rightMargin = i6;
                z5 = true;
            }
        }
        if (z3) {
            int i7 = ((ViewGroup.MarginLayoutParams) c8705).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c8705).bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m29076() {
        C8273.m27316(this.f26168, f26135, this.f26152);
        return !this.f26152.equals(f26136);
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8705 generateDefaultLayoutParams() {
        return new C8705(-1, -1);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8705 generateLayoutParams(AttributeSet attributeSet) {
        return new C8705(getContext(), attributeSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final InterfaceC4330 m29079(View view) {
        if (view instanceof InterfaceC4330) {
            return (InterfaceC4330) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29080() {
        removeCallbacks(this.f26165);
        removeCallbacks(this.f26166);
        ViewPropertyAnimator viewPropertyAnimator = this.f26163;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m29081() {
        return this.f26145;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m29082() {
        return this.f26143;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m29083() {
        m29080();
        postDelayed(this.f26166, 600L);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m29084() {
        m29080();
        postDelayed(this.f26165, 600L);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m29085() {
        if (this.f26139 == null) {
            this.f26139 = (ContentFrameLayout) findViewById(C6898.C6903.f2449);
            this.f26140 = (ActionBarContainer) findViewById(C6898.C6903.f18887);
            this.f26141 = m29079(findViewById(C6898.C6903.f2448));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m29086() {
        m29080();
        this.f26165.run();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean m29087(float f) {
        this.f26162.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f26162.getFinalY() > this.f26140.getHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionBarOverlayLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26138 = 0;
        this.f26149 = new Rect();
        this.f26150 = new Rect();
        this.f26151 = new Rect();
        this.f26152 = new Rect();
        this.f26153 = new Rect();
        this.f26154 = new Rect();
        this.f26155 = new Rect();
        this.f26156 = new Rect();
        C8472 c8472 = C8472.f25308;
        this.f26157 = c8472;
        this.f26158 = c8472;
        this.f26159 = c8472;
        this.f26160 = c8472;
        this.f26164 = new C1613();
        this.f26165 = new RunnableC1614();
        this.f26166 = new RunnableC8703();
        m29073(context);
        this.f26167 = new C6370(this);
        C8706 c8706 = new C8706(context);
        this.f26168 = c8706;
        addView(c8706);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C8705(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f26167.m2826(view, view2, i);
        this.f26147 = getActionBarHideOffset();
        m29080();
        InterfaceC8704 interfaceC8704 = this.f26161;
        if (interfaceC8704 != null) {
            interfaceC8704.mo28965();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f26140.getVisibility() != 0) {
            return false;
        }
        return this.f26145;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onStopNestedScroll(View view) {
        if (this.f26145 && !this.f26146) {
            if (this.f26147 <= this.f26140.getHeight()) {
                m29084();
            } else {
                m29083();
            }
        }
        InterfaceC8704 interfaceC8704 = this.f26161;
        if (interfaceC8704 != null) {
            interfaceC8704.mo4634();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f26147 + i2;
        this.f26147 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // Yue.InterfaceC4329
    public void setIcon(Drawable drawable) {
        m29085();
        this.f26141.setIcon(drawable);
    }
}
