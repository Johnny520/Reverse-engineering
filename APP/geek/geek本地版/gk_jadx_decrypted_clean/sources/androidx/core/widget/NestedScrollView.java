package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import p000.AbstractC0239fw;
import p000.AbstractC0782uh;
import p000.AbstractC0979zt;
import p000.C0313hw;
import p000.C0352iw;
import p000.C0463lw;
import p000.C0646qt;
import p000.InterfaceC0276gw;
import p000.InterfaceC0426kw;
import p000.a80;
import p000.ja0;
import p000.s90;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0426kw {

    /* JADX INFO: renamed from: A */
    public static final float f464A = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: B */
    public static final C0646qt f465B = new C0646qt(3);

    /* JADX INFO: renamed from: C */
    public static final int[] f466C = {R.attr.fillViewport};

    /* JADX INFO: renamed from: a */
    public final float f467a;

    /* JADX INFO: renamed from: b */
    public long f468b;

    /* JADX INFO: renamed from: c */
    public final Rect f469c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f470d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f471e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f472f;

    /* JADX INFO: renamed from: g */
    public int f473g;

    /* JADX INFO: renamed from: h */
    public boolean f474h;

    /* JADX INFO: renamed from: i */
    public boolean f475i;

    /* JADX INFO: renamed from: j */
    public View f476j;

    /* JADX INFO: renamed from: k */
    public boolean f477k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f478l;

    /* JADX INFO: renamed from: m */
    public boolean f479m;

    /* JADX INFO: renamed from: n */
    public boolean f480n;

    /* JADX INFO: renamed from: o */
    public final int f481o;

    /* JADX INFO: renamed from: p */
    public final int f482p;

    /* JADX INFO: renamed from: q */
    public final int f483q;

    /* JADX INFO: renamed from: r */
    public int f484r;

    /* JADX INFO: renamed from: s */
    public final int[] f485s;

    /* JADX INFO: renamed from: t */
    public final int[] f486t;

    /* JADX INFO: renamed from: u */
    public int f487u;

    /* JADX INFO: renamed from: v */
    public int f488v;

    /* JADX INFO: renamed from: w */
    public C0313hw f489w;

    /* JADX INFO: renamed from: x */
    public final C0463lw f490x;

    /* JADX INFO: renamed from: y */
    public final C0352iw f491y;

    /* JADX INFO: renamed from: z */
    public float f492z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ljx.wechatmod.R.attr.nestedScrollViewStyle);
        this.f469c = new Rect();
        this.f474h = true;
        this.f475i = false;
        this.f476j = null;
        this.f477k = false;
        this.f480n = true;
        this.f484r = -1;
        this.f485s = new int[2];
        this.f486t = new int[2];
        int i = Build.VERSION.SDK_INT;
        this.f471e = i >= 31 ? AbstractC0782uh.m2455a(context, attributeSet) : new EdgeEffect(context);
        this.f472f = i >= 31 ? AbstractC0782uh.m2455a(context, attributeSet) : new EdgeEffect(context);
        this.f467a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f470d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f481o = viewConfiguration.getScaledTouchSlop();
        this.f482p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f483q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f466C, com.ljx.wechatmod.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f490x = new C0463lw();
        this.f491y = new C0352iw(this);
        setNestedScrollingEnabled(true);
        ja0.m1575l(this, f465B);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f492z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f492z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f492z;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m233m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m233m((View) parent, nestedScrollView);
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: a */
    public final void mo149a(View view, View view2, int i, int i2) {
        C0463lw c0463lw = this.f490x;
        if (i2 == 1) {
            c0463lw.f3118b = i;
        } else {
            c0463lw.f3117a = i;
        }
        this.f491y.m1524g(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: b */
    public final void mo150b(View view, int i) {
        C0463lw c0463lw = this.f490x;
        if (i == 1) {
            c0463lw.f3118b = 0;
        } else {
            c0463lw.f3117a = 0;
        }
        m248v(i);
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: c */
    public final void mo151c(View view, int i, int i2, int[] iArr, int i3) {
        this.f491y.m1520c(i, i2, iArr, null, i3);
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
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
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p000.InterfaceC0426kw
    /* JADX INFO: renamed from: d */
    public final void mo152d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m241o(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m237j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f491y.m1518a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f491y.m1519b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f491y.m1520c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f491y.m1521d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f471e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC0239fw.m1237a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC0239fw.m1237a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = ja0.f2600a;
                s90.m2319k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f472f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0239fw.m1237a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC0239fw.m1237a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap weakHashMap2 = ja0.f2600a;
            s90.m2319k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: e */
    public final void mo153e(View view, int i, int i2, int i3, int i4, int i5) {
        m241o(i4, i5, null);
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: f */
    public final boolean mo154f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m234g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m240n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m236i(maxScrollAmount);
        } else {
            Rect rect = this.f469c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m236i(m235h(rect));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || m240n(viewFindFocus, 0, getHeight())) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0463lw c0463lw = this.f490x;
        return c0463lw.f3118b | c0463lw.f3117a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public final int m235h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f491y.m1523f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m236i(int i) {
        if (i != 0) {
            if (this.f480n) {
                m246t(0, i, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f491y.f2508d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m237j(KeyEvent keyEvent) {
        Rect rect = this.f469c;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return !keyEvent.isAltPressed() ? m234g(33) : m239l(33);
                    }
                    if (keyCode == 20) {
                        return !keyEvent.isAltPressed() ? m234g(130) : m239l(130);
                    }
                    if (keyCode == 62) {
                        int i = keyEvent.isShiftPressed() ? 33 : 130;
                        boolean z = i == 130;
                        int height = getHeight();
                        if (z) {
                            rect.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                                if (rect.top + height > paddingBottom) {
                                    rect.top = paddingBottom - height;
                                }
                            }
                        } else {
                            int scrollY = getScrollY() - height;
                            rect.top = scrollY;
                            if (scrollY < 0) {
                                rect.top = 0;
                            }
                        }
                        int i2 = rect.top;
                        int i3 = height + i2;
                        rect.bottom = i3;
                        m244r(i, i2, i3);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m238k(int i) {
        if (getChildCount() > 0) {
            this.f470d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f491y.m1524g(2, 1);
            this.f488v = getScrollY();
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2319k(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m239l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f469c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m244r(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m240n(View view, int i, int i2) {
        Rect rect = this.f469c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m241o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f491y.m1521d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f475i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.f477k) {
            float axisValue = AbstractC0979zt.m2813B(motionEvent, 2) ? motionEvent.getAxisValue(9) : AbstractC0979zt.m2813B(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    int overScrollMode = getOverScrollMode();
                    if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !AbstractC0979zt.m2813B(motionEvent, 8194)) {
                        float height = (-i2) / getHeight();
                        EdgeEffect edgeEffect = this.f471e;
                        a80.m58w(edgeEffect, height, 0.5f);
                        edgeEffect.onRelease();
                        invalidate();
                        z = 1;
                    } else {
                        z = 0;
                    }
                } else if (i2 > scrollRange) {
                    int overScrollMode2 = getOverScrollMode();
                    if ((overScrollMode2 == 0 || (overScrollMode2 == 1 && getScrollRange() > 0)) && !AbstractC0979zt.m2813B(motionEvent, 8194)) {
                        float height2 = (i2 - scrollRange) / getHeight();
                        EdgeEffect edgeEffect2 = this.f472f;
                        a80.m58w(edgeEffect2, height2, 0.5f);
                        edgeEffect2.onRelease();
                        invalidate();
                        i = 1;
                    }
                    z = i;
                    i = scrollRange;
                } else {
                    z = 0;
                    i = i2;
                }
                if (i == scrollY) {
                    return z;
                }
                super.scrollTo(getScrollX(), i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f474h = false;
        View view = this.f476j;
        if (view != null && m233m(view, this)) {
            View view2 = this.f476j;
            Rect rect = this.f469c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM235h = m235h(rect);
            if (iM235h != 0) {
                scrollBy(0, iM235h);
            }
        }
        this.f476j = null;
        if (!this.f475i) {
            if (this.f489w != null) {
                scrollTo(getScrollX(), this.f489w.f2315a);
                this.f489w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f475i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f479m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m238k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f491y.m1519b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f491y.m1520c(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m241o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo149a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m240n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0313hw)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0313hw c0313hw = (C0313hw) parcelable;
        super.onRestoreInstanceState(c0313hw.getSuperState());
        this.f489w = c0313hw;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0313hw c0313hw = new C0313hw(super.onSaveInstanceState());
        c0313hw.f2315a = getScrollY();
        return c0313hw;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m240n(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f469c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        m236i(m235h(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo154f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo150b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0229  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r28) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public final void m242p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f484r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f473g = (int) motionEvent.getY(i);
            this.f484r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f478l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m243q(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && !this.f491y.m1523f(1)) {
                    this.f470d.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.f470d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m244r(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L7f
        L75:
            if (r6 == 0) goto L79
            int r2 = r2 - r5
            goto L7b
        L79:
            int r2 = r3 - r4
        L7b:
            r0.m236i(r2)
            r7 = 1
        L7f:
            android.view.View r2 = r0.findFocus()
            if (r11 == r2) goto L88
            r11.requestFocus(r1)
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m244r(int, int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f474h) {
            this.f476j = view2;
        } else {
            Rect rect = this.f469c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM235h = m235h(rect);
            if (iM235h != 0) {
                scrollBy(0, iM235h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM235h = m235h(rect);
        boolean z2 = iM235h != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM235h);
                return z2;
            }
            m246t(0, iM235h, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f478l) != null) {
            velocityTracker.recycle();
            this.f478l = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f474h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m245s(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM47k = a80.m47k(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f467a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f464A;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM47k;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f479m) {
            this.f479m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0352iw c0352iw = this.f491y;
        if (c0352iw.f2508d) {
            ViewGroup viewGroup = c0352iw.f2507c;
            WeakHashMap weakHashMap = ja0.f2600a;
            y90.m2680z(viewGroup);
        }
        c0352iw.f2508d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f480n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f491y.m1524g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m248v(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m246t(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f468b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f470d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                this.f491y.m1524g(2, 1);
            } else {
                m248v(1);
            }
            this.f488v = getScrollY();
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2319k(this);
        } else {
            OverScroller overScroller = this.f470d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                m248v(1);
            }
            scrollBy(i, i2);
        }
        this.f468b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m247u(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f471e;
        if (a80.m47k(edgeEffect) != 0.0f) {
            a80.m58w(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f472f;
        if (a80.m47k(edgeEffect2) == 0.0f) {
            return z;
        }
        a80.m58w(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m248v(int i) {
        this.f491y.m1525h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC0276gw interfaceC0276gw) {
    }
}
