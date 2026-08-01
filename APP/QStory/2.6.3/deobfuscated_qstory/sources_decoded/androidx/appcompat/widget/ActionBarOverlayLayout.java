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
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.app.C0111;
import androidx.compose.foundation.text.C0966;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2223;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2220;
import androidx.core.view.C2221;
import androidx.core.view.C2225;
import androidx.core.view.C2231;
import androidx.core.view.C2232;
import androidx.core.view.C2233;
import androidx.core.view.C2234;
import androidx.core.view.C2235;
import androidx.core.view.C2238;
import androidx.core.view.InterfaceC2206;
import androidx.core.view.InterfaceC2251;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import java.util.WeakHashMap;
import p164.C7665;
import p190.InterfaceC7789;
import p190.MenuC7802;
import p192.C7818;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2251, InterfaceC2206 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final int[] f418 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final Rect f419;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final C2225 f420;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C0204 f421;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final RunnableC0187 f422;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C0966 f423;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public ViewPropertyAnimator f424;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public OverScroller f425;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final RunnableC0187 f426;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C0188 f427;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Rect f428;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Rect f429;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Rect f430;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f431;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f432;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f433;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC0186 f434;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C2225 f435;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2225 f436;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C2225 f437;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2225 f438;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Rect f439;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC0220 f440;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ActionBarContainer f441;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f442;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f443;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Drawable f444;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f445;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f446;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ContentFrameLayout f447;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f448;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC2223 c2220 = i >= 36 ? new C2220() : i >= 35 ? new C2221() : i >= 34 ? new C2233() : i >= 31 ? new C2232() : i >= 30 ? new C2235() : i >= 29 ? new C2234() : new C2231();
        c2220.mo4058(C7665.m12939(0, 1, 0, 1));
        f420 = c2220.mo4056();
        f419 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f446 = 0;
        this.f430 = new Rect();
        this.f429 = new Rect();
        this.f428 = new Rect();
        this.f439 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C2225 c2225 = C2225.f6520;
        this.f438 = c2225;
        this.f437 = c2225;
        this.f436 = c2225;
        this.f435 = c2225;
        this.f427 = new C0188(this, 0);
        this.f426 = new RunnableC0187(this, 0);
        this.f422 = new RunnableC0187(this, 1);
        m480(context);
        this.f423 = new C0966();
        C0204 c0204 = new C0204(context);
        c0204.setWillNotDraw(true);
        this.f421 = c0204;
        addView(c0204);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m470(View view, Rect rect, boolean z) {
        boolean z2;
        C0185 c0185 = (C0185) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0185).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0185).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0185).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0185).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0185).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0185).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0185).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0185).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0185;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f444 != null) {
            if (this.f441.getVisibility() == 0) {
                translationY = (int) (this.f441.getTranslationY() + this.f441.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f444.setBounds(0, translationY, getWidth(), this.f444.getIntrinsicHeight() + translationY);
            this.f444.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0185(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0185(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f441;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0966 c0966 = this.f423;
        return c0966.f2755 | c0966.f2756;
    }

    public CharSequence getTitle() {
        m478();
        return ((C0146) this.f440).f612.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m478();
        C2225 c2225M4063 = C2225.m4063(this, windowInsets);
        boolean zM470 = m470(this.f441, new Rect(c2225M4063.m4067(), c2225M4063.m4065(), c2225M4063.m4066(), c2225M4063.m4068()), false);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        Rect rect = this.f430;
        AbstractC2193.m4005(this, c2225M4063, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C2238 c2238 = c2225M4063.f6521;
        C2225 c2225Mo4049 = c2238.mo4049(i, i2, i3, i4);
        this.f438 = c2225Mo4049;
        boolean z = true;
        if (!this.f437.equals(c2225Mo4049)) {
            this.f437 = this.f438;
            zM470 = true;
        }
        Rect rect2 = this.f429;
        if (rect2.equals(rect)) {
            z = zM470;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c2238.mo4021().f6521.mo4017().f6521.mo4018().m4069();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m480(getContext());
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m475();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0185 c0185 = (C0185) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0185).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0185).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f443 || !z) {
            return false;
        }
        this.f425.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f425.getFinalY() > this.f441.getHeight()) {
            m475();
            this.f422.run();
        } else {
            m475();
            this.f426.run();
        }
        this.f433 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f432 + i2;
        this.f432 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0111 c0111;
        C7818 c7818;
        this.f423.f2756 = i;
        this.f432 = getActionBarHideOffset();
        m475();
        InterfaceC0186 interfaceC0186 = this.f434;
        if (interfaceC0186 == null || (c7818 = (c0111 = (C0111) interfaceC0186).f338) == null) {
            return;
        }
        c7818.m13181();
        c0111.f338 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f441.getVisibility() != 0) {
            return false;
        }
        return this.f443;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f443 || this.f433) {
            return;
        }
        if (this.f432 <= this.f441.getHeight()) {
            m475();
            postDelayed(this.f426, 600L);
        } else {
            m475();
            postDelayed(this.f422, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m478();
        int i2 = this.f431 ^ i;
        this.f431 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0186 interfaceC0186 = this.f434;
        if (interfaceC0186 != null) {
            C0111 c0111 = (C0111) interfaceC0186;
            c0111.f347 = !z2;
            if (z || !z2) {
                if (c0111.f348) {
                    c0111.f348 = false;
                    c0111.m420(true);
                }
            } else if (!c0111.f348) {
                c0111.f348 = true;
                c0111.m420(true);
            }
        }
        if ((i2 & 256) == 0 || this.f434 == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f446 = i;
        InterfaceC0186 interfaceC0186 = this.f434;
        if (interfaceC0186 != null) {
            ((C0111) interfaceC0186).f343 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m475();
        this.f441.setTranslationY(-Math.max(0, Math.min(i, this.f441.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0186 interfaceC0186) {
        this.f434 = interfaceC0186;
        if (getWindowToken() != null) {
            ((C0111) this.f434).f343 = this.f446;
            int i = this.f431;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f442 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f443) {
            this.f443 = z;
            if (z) {
                return;
            }
            m475();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m478();
        C0146 c0146 = (C0146) this.f440;
        c0146.f609 = i != 0 ? AbstractC3933.m8312(c0146.f612.getContext(), i) : null;
        c0146.m598();
    }

    public void setLogo(int i) {
        m478();
        C0146 c0146 = (C0146) this.f440;
        c0146.f608 = i != 0 ? AbstractC3933.m8312(c0146.f612.getContext(), i) : null;
        c0146.m598();
    }

    public void setOverlayMode(boolean z) {
        this.f445 = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        m478();
        ((C0146) this.f440).f618 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m478();
        C0146 c0146 = (C0146) this.f440;
        if (c0146.f617) {
            return;
        }
        Toolbar toolbar = c0146.f612;
        c0146.f616 = charSequence;
        if ((c0146.f611 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0146.f617) {
                AbstractC2270.m4241(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo471(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo472(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo473(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.view.InterfaceC2206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo474(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo473(view, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m475() {
        removeCallbacks(this.f426);
        removeCallbacks(this.f422);
        ViewPropertyAnimator viewPropertyAnimator = this.f424;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo477(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m478() {
        InterfaceC0220 wrapper;
        if (this.f447 == null) {
            this.f447 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f441 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0220) {
                wrapper = (InterfaceC0220) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    C5925.m11311("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f440 = wrapper;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m479(Menu menu, InterfaceC7789 interfaceC7789) {
        m478();
        C0146 c0146 = (C0146) this.f440;
        Toolbar toolbar = c0146.f612;
        if (c0146.f614 == null) {
            c0146.f614 = new C0197(toolbar.getContext());
        }
        C0197 c0197 = c0146.f614;
        c0197.f788 = interfaceC7789;
        MenuC7802 menuC7802 = (MenuC7802) menu;
        if (menuC7802 == null && toolbar.f511 == null) {
            return;
        }
        toolbar.m493();
        MenuC7802 menuC78022 = toolbar.f511.f461;
        if (menuC78022 == menuC7802) {
            return;
        }
        if (menuC78022 != null) {
            menuC78022.m13163(toolbar.f521);
            menuC78022.m13163(toolbar.f522);
        }
        if (toolbar.f522 == null) {
            toolbar.f522 = new C0159(toolbar);
        }
        c0197.f786 = true;
        Context context = toolbar.f496;
        if (menuC7802 != null) {
            menuC7802.m13155(c0197, context);
            menuC7802.m13155(toolbar.f522, toolbar.f496);
        } else {
            c0197.mo611(context, null);
            toolbar.f522.mo611(toolbar.f496, null);
            c0197.mo614();
            toolbar.f522.mo614();
        }
        toolbar.f511.setPopupTheme(toolbar.f495);
        toolbar.f511.setPresenter(c0197);
        toolbar.f521 = c0197;
        toolbar.m502();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m480(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f418);
        this.f448 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f444 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f425 = new OverScroller(context);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m481(int i) {
        m478();
        if (i == 2) {
            ((C0146) this.f440).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C0146) this.f440).getClass();
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
        return new C0185(layoutParams);
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(Drawable drawable) {
        m478();
        C0146 c0146 = (C0146) this.f440;
        c0146.f609 = drawable;
        c0146.m598();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo476(View view, int i, int i2, int[] iArr, int i3) {
    }
}
