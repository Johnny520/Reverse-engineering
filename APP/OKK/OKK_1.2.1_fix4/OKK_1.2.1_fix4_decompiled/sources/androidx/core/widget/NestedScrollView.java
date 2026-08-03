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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.luckypray.dexkit.C1031R;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.AbstractC0083U;
import p006D.AbstractC0132x;
import p006D.AbstractC0133y;
import p006D.C0095d;
import p006D.C0105i;
import p006D.C0113m;
import p006D.C0119p;
import p006D.C0134z;
import p006D.InterfaceC0117o;
import p017J.AbstractC0216e;
import p017J.AbstractC0220i;
import p017J.C0219h;
import p017J.C0223l;
import p017J.InterfaceC0221j;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0117o {

    /* JADX INFO: renamed from: B */
    public static final float f1314B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: C */
    public static final C0219h f1315C = new C0219h(0);

    /* JADX INFO: renamed from: D */
    public static final int[] f1316D = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public final C0105i f1317A;

    /* JADX INFO: renamed from: a */
    public final float f1318a;

    /* JADX INFO: renamed from: b */
    public long f1319b;

    /* JADX INFO: renamed from: c */
    public final Rect f1320c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f1321d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f1322e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f1323f;

    /* JADX INFO: renamed from: g */
    public int f1324g;

    /* JADX INFO: renamed from: h */
    public boolean f1325h;

    /* JADX INFO: renamed from: i */
    public boolean f1326i;

    /* JADX INFO: renamed from: j */
    public View f1327j;

    /* JADX INFO: renamed from: k */
    public boolean f1328k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f1329l;

    /* JADX INFO: renamed from: m */
    public boolean f1330m;

    /* JADX INFO: renamed from: n */
    public boolean f1331n;

    /* JADX INFO: renamed from: o */
    public final int f1332o;

    /* JADX INFO: renamed from: p */
    public final int f1333p;

    /* JADX INFO: renamed from: q */
    public final int f1334q;

    /* JADX INFO: renamed from: r */
    public int f1335r;

    /* JADX INFO: renamed from: s */
    public final int[] f1336s;

    /* JADX INFO: renamed from: t */
    public final int[] f1337t;

    /* JADX INFO: renamed from: u */
    public int f1338u;

    /* JADX INFO: renamed from: v */
    public int f1339v;

    /* JADX INFO: renamed from: w */
    public C0223l f1340w;

    /* JADX INFO: renamed from: x */
    public final C0119p f1341x;

    /* JADX INFO: renamed from: y */
    public final C0113m f1342y;

    /* JADX INFO: renamed from: z */
    public float f1343z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.nestedScrollViewStyle);
        this.f1320c = new Rect();
        this.f1325h = true;
        this.f1326i = false;
        this.f1327j = null;
        this.f1328k = false;
        this.f1331n = true;
        this.f1335r = -1;
        this.f1336s = new int[2];
        this.f1337t = new int[2];
        this.f1317A = new C0105i(getContext(), new C0095d(7, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1322e = i2 >= 31 ? AbstractC0216e.m599a(context, attributeSet) : new EdgeEffect(context);
        this.f1323f = i2 >= 31 ? AbstractC0216e.m599a(context, attributeSet) : new EdgeEffect(context);
        this.f1318a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1321d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1332o = viewConfiguration.getScaledTouchSlop();
        this.f1333p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1334q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1316D, C1031R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1341x = new C0119p();
        this.f1342y = new C0113m(this);
        setNestedScrollingEnabled(true);
        AbstractC0080Q.m291j(this, f1315C);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1179k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1179k((View) parent, view2);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: a */
    public final void mo421a(View view, View view2, int i2, int i3) {
        C0119p c0119p = this.f1341x;
        if (i3 == 1) {
            c0119p.f307b = i2;
        } else {
            c0119p.f306a = i2;
        }
        this.f1342y.m416h(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p006D.InterfaceC0117o
    /* JADX INFO: renamed from: b */
    public final void mo426b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m1185m(i5, i6, iArr);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: c */
    public final void mo422c(View view, int i2, int i3, int i4, int i5, int i6) {
        m1185m(i5, i6, null);
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i2;
        if (this.f1321d.isFinished()) {
            return;
        }
        this.f1321d.computeScrollOffset();
        int currY = this.f1321d.getCurrY();
        int i3 = currY - this.f1339v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1323f;
        EdgeEffect edgeEffect2 = this.f1322e;
        if (i3 <= 0 || AbstractC0040p.m117v(edgeEffect2) == 0.0f) {
            if (i3 < 0 && AbstractC0040p.m117v(edgeEffect) != 0.0f) {
                float f2 = height;
                iRound = Math.round(AbstractC0040p.m85J(edgeEffect, (i3 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (iRound != i3) {
                    edgeEffect.finish();
                }
            }
            this.f1339v = currY;
            int[] iArr = this.f1337t;
            iArr[1] = 0;
            this.f1342y.m411c(0, i3, iArr, null, 1);
            i2 = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                m1187o(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i2 - scrollY2;
                iArr[1] = 0;
                this.f1342y.m413e(0, scrollY2, 0, i4, this.f1336s, 1, iArr);
                i2 = i4 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1321d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1321d.getCurrVelocity());
                    }
                }
                this.f1321d.abortAnimation();
                m1194v(1);
            }
            if (this.f1321d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m1194v(1);
                return;
            }
        }
        iRound = Math.round(AbstractC0040p.m85J(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect2.finish();
        }
        i3 -= iRound;
        this.f1339v = currY;
        int[] iArr2 = this.f1337t;
        iArr2[1] = 0;
        this.f1342y.m411c(0, i3, iArr2, null, 1);
        i2 = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.f1321d.isFinished()) {
        }
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
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: d */
    public final void mo423d(View view, int i2) {
        C0119p c0119p = this.f1341x;
        if (i2 == 1) {
            c0119p.f307b = 0;
        } else {
            c0119p.f306a = 0;
        }
        m1194v(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM1183j;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f1320c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    zM1183j = false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        zM1183j = keyEvent.isAltPressed() ? m1183j(33) : m1180g(33);
                    } else if (keyCode != 20) {
                        if (keyCode == 62) {
                            m1188p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            zM1183j = m1183j(33);
                        } else if (keyCode == 93) {
                            zM1183j = m1183j(130);
                        } else if (keyCode == 122) {
                            m1188p(33);
                        } else if (keyCode == 123) {
                            m1188p(130);
                        }
                        zM1183j = false;
                    } else {
                        zM1183j = keyEvent.isAltPressed() ? m1183j(130) : m1180g(130);
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    zM1183j = true;
                }
            }
        }
        return zM1183j;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1342y.m409a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1342y.m410b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1342y.m411c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1342y.m413e(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1322e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC0220i.m611a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC0220i.m611a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1323f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0220i.m611a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC0220i.m611a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: e */
    public final void mo424e(View view, int i2, int i3, int[] iArr, int i4) {
        this.f1342y.m411c(i2, i3, iArr, null, i4);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: f */
    public final boolean mo425f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1180g(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m1184l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1190r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1320c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m1190r(m1181h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m1184l(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(MethodData.ACC_DECLARED_SYNCHRONIZED);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
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
        C0119p c0119p = this.f1341x;
        return c0119p.f307b | c0119p.f306a;
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

    public float getVerticalScrollFactorCompat() {
        if (this.f1343z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1343z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1343z;
    }

    /* JADX INFO: renamed from: h */
    public final int m1181h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1342y.m415g(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1182i(int i2) {
        if (getChildCount() > 0) {
            this.f1321d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1342y.m416h(2, 1);
            this.f1339v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1342y.f298d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1183j(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1320c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m1189q(i2, rect.top, rect.bottom);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1184l(View view, int i2, int i3) {
        Rect rect = this.f1320c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    /* JADX INFO: renamed from: m */
    public final void m1185m(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1342y.m412d(scrollY2, i2 - scrollY2, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final void m1186n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1335r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1324g = (int) motionEvent.getY(i2);
            this.f1335r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1329l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1187o(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 > i5) {
            z3 = true;
        } else if (i6 < 0) {
            i5 = 0;
            z3 = true;
        } else {
            i5 = i6;
            z3 = false;
        }
        if (z3 && !this.f1342y.m415g(1)) {
            this.f1321d.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        return z2 || z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1326i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i2;
        int width;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c;
        boolean z2;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f2;
        long j2;
        float fSqrt;
        int i3;
        VelocityTracker velocityTracker2;
        int i4;
        float f3;
        if (motionEvent.getAction() != 8 || this.f1328k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i2 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i2 = 26;
        } else {
            axisValue = 0.0f;
            i2 = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        m1190r(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        C0105i c0105i = this.f1317A;
        c0105i.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i5 = c0105i.f278h;
        int[] iArr = c0105i.f280j;
        if (i5 == source && c0105i.f279i == deviceId && c0105i.f277g == i2) {
            c = 0;
            z2 = false;
        } else {
            c0105i.f273c.getClass();
            Context context = c0105i.f271a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                scaledMinimumFlingVelocity = AbstractC0083U.m298b(viewConfiguration, deviceId2, i2, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i2, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i6 >= 34) {
                scaledMaximumFlingVelocity = AbstractC0083U.m297a(viewConfiguration, deviceId3, i2, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                int i7 = Integer.MIN_VALUE;
                if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 != -1) {
                        if (identifier2 != 0 && (dimensionPixelSize = resources2.getDimensionPixelSize(identifier2)) >= 0) {
                            i7 = dimensionPixelSize;
                        }
                        scaledMaximumFlingVelocity = i7;
                    } else {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                } else {
                    scaledMaximumFlingVelocity = i7;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0105i.f278h = source;
            c0105i.f279i = deviceId;
            c0105i.f277g = i2;
            c = 0;
            z2 = true;
        }
        if (iArr[c] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0105i.f275e;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0105i.f275e = null;
            }
        } else {
            if (c0105i.f275e == null) {
                c0105i.f275e = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0105i.f275e;
            c0105i.f274d.getClass();
            Map map = AbstractC0133y.f322a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0133y.f322a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C0134z());
                }
                C0134z c0134z = (C0134z) map2.get(velocityTracker4);
                c0134z.getClass();
                long eventTime = motionEvent.getEventTime();
                int i8 = c0134z.f326d;
                long[] jArr = c0134z.f324b;
                if (i8 != 0 && eventTime - jArr[c0134z.f327e] > 40) {
                    c0134z.f326d = 0;
                    c0134z.f325c = 0.0f;
                }
                int i9 = (c0134z.f327e + 1) % 20;
                c0134z.f327e = i9;
                int i10 = c0134z.f326d;
                if (i10 != 20) {
                    c0134z.f326d = i10 + 1;
                }
                c0134z.f323a[i9] = motionEvent.getAxisValue(26);
                jArr[c0134z.f327e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C0134z c0134z2 = (C0134z) AbstractC0133y.f322a.get(velocityTracker4);
            if (c0134z2 != null) {
                int i11 = c0134z2.f326d;
                if (i11 < 2) {
                    velocityTracker = velocityTracker4;
                    i3 = 1000;
                    fSqrt = 0.0f;
                    f3 = fSqrt * i3;
                    c0134z2.f325c = f3;
                    if (f3 >= (-Math.abs(Float.MAX_VALUE))) {
                        c0134z2.f325c = -Math.abs(Float.MAX_VALUE);
                    } else if (c0134z2.f325c > Math.abs(Float.MAX_VALUE)) {
                        c0134z2.f325c = Math.abs(Float.MAX_VALUE);
                    }
                } else {
                    int i12 = c0134z2.f327e;
                    int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                    long[] jArr2 = c0134z2.f324b;
                    long j3 = jArr2[i12];
                    while (true) {
                        j2 = jArr2[i13];
                        if (j3 - j2 <= 100) {
                            break;
                        }
                        c0134z2.f326d--;
                        i13 = (i13 + 1) % 20;
                    }
                    int i14 = c0134z2.f326d;
                    if (i14 >= 2) {
                        float[] fArr = c0134z2.f323a;
                        if (i14 == 2) {
                            int i15 = (i13 + 1) % 20;
                            if (j2 != jArr2[i15]) {
                                velocityTracker = velocityTracker4;
                                i3 = 1000;
                                fSqrt = fArr[i15] / (r13 - j2);
                            }
                        } else {
                            float f4 = 0.0f;
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                if (i16 >= c0134z2.f326d - 1) {
                                    break;
                                }
                                int i18 = i16 + i13;
                                long j4 = jArr2[i18 % 20];
                                int i19 = (i18 + 1) % 20;
                                if (jArr2[i19] == j4) {
                                    velocityTracker2 = velocityTracker4;
                                    i4 = 1;
                                } else {
                                    i17++;
                                    velocityTracker2 = velocityTracker4;
                                    float fSqrt2 = (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
                                    float f5 = fArr[i19] / (jArr2[i19] - j4);
                                    float fAbs = (Math.abs(f5) * (f5 - fSqrt2)) + f4;
                                    i4 = 1;
                                    if (i17 == 1) {
                                        fAbs *= 0.5f;
                                    }
                                    f4 = fAbs;
                                }
                                i16 += i4;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            fSqrt = ((float) Math.sqrt(Math.abs(f4) * 2.0f)) * (f4 < 0.0f ? -1.0f : 1.0f);
                            i3 = 1000;
                        }
                        f3 = fSqrt * i3;
                        c0134z2.f325c = f3;
                        if (f3 >= (-Math.abs(Float.MAX_VALUE))) {
                        }
                    }
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = AbstractC0132x.m462a(velocityTracker, i2);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i2 == 0) {
                    yVelocity = velocityTracker5.getXVelocity();
                } else if (i2 == 1) {
                    yVelocity = velocityTracker5.getYVelocity();
                } else {
                    C0134z c0134z3 = (C0134z) AbstractC0133y.f322a.get(velocityTracker5);
                    yVelocity = (c0134z3 == null || i2 != 26) ? 0.0f : c0134z3.f325c;
                }
            }
            C0095d c0095d = c0105i.f272b;
            float f6 = yVelocity * (-((NestedScrollView) c0095d.f251b).getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f6);
            NestedScrollView nestedScrollView = (NestedScrollView) c0095d.f251b;
            if (z2 || (fSignum != Math.signum(c0105i.f276f) && fSignum != 0.0f)) {
                nestedScrollView.f1321d.abortAnimation();
            }
            if (Math.abs(f6) >= iArr[0]) {
                float fMax = Math.max(-r4, Math.min(f6, iArr[1]));
                if (fMax == 0.0f) {
                    f2 = 0.0f;
                } else {
                    nestedScrollView.f1321d.abortAnimation();
                    nestedScrollView.m1182i((int) fMax);
                    f2 = fMax;
                }
                c0105i.f276f = f2;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1328k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m1193u(motionEvent) && this.f1321d.isFinished()) {
                        z2 = false;
                    }
                    this.f1328k = z2;
                    VelocityTracker velocityTracker = this.f1329l;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1329l = null;
                    }
                } else {
                    this.f1324g = y;
                    this.f1335r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1329l;
                    if (velocityTracker2 == null) {
                        this.f1329l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1329l.addMovement(motionEvent);
                    this.f1321d.computeScrollOffset();
                    if (!m1193u(motionEvent) && this.f1321d.isFinished()) {
                        z2 = false;
                    }
                    this.f1328k = z2;
                    this.f1342y.m416h(2, 0);
                }
            }
        } else if (i2 == 1) {
            this.f1328k = false;
            this.f1335r = -1;
            VelocityTracker velocityTracker3 = this.f1329l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1329l = null;
            }
            if (this.f1321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m1194v(0);
        } else if (i2 == 2) {
            int i3 = this.f1335r;
            if (i3 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i3)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f1324g) > this.f1332o && (2 & getNestedScrollAxes()) == 0) {
                    this.f1328k = true;
                    this.f1324g = y2;
                    if (this.f1329l == null) {
                        this.f1329l = VelocityTracker.obtain();
                    }
                    this.f1329l.addMovement(motionEvent);
                    this.f1338u = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i2 != 3) {
            if (i2 == 6) {
                m1186n(motionEvent);
            }
        }
        return this.f1328k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f1325h = false;
        View view = this.f1327j;
        if (view != null && m1179k(view, this)) {
            View view2 = this.f1327j;
            Rect rect = this.f1320c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1181h = m1181h(rect);
            if (iM1181h != 0) {
                scrollBy(0, iM1181h);
            }
        }
        this.f1327j = null;
        if (!this.f1326i) {
            if (this.f1340w != null) {
                scrollTo(getScrollX(), this.f1340w.f464a);
                this.f1340w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i6 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1326i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1330m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        m1182i((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1342y.m410b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1342y.m411c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m1185m(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo421a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || (true ^ m1184l(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0223l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0223l c0223l = (C0223l) parcelable;
        super.onRestoreInstanceState(c0223l.getSuperState());
        this.f1340w = c0223l;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0223l c0223l = new C0223l(super.onSaveInstanceState());
        c0223l.f464a = getScrollY();
        return c0223l;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m1184l(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1320c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM1181h = m1181h(rect);
        if (iM1181h != 0) {
            if (this.f1331n) {
                m1192t(0, iM1181h, false);
            } else {
                scrollBy(0, iM1181h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo425f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo423d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1329l == null) {
            this.f1329l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1338u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1338u);
        C0113m c0113m = this.f1342y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1323f;
            EdgeEffect edgeEffect2 = this.f1322e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1329l;
                velocityTracker.computeCurrentVelocity(1000, this.f1334q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1335r);
                if (Math.abs(yVelocity) >= this.f1333p) {
                    if (AbstractC0040p.m117v(edgeEffect2) != 0.0f) {
                        if (m1191s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m1182i(-yVelocity);
                        }
                    } else if (AbstractC0040p.m117v(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m1191s(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            m1182i(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!c0113m.m410b(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            m1182i(i3);
                        }
                    }
                } else if (this.f1321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1335r = -1;
                this.f1328k = false;
                VelocityTracker velocityTracker2 = this.f1329l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1329l = null;
                }
                m1194v(0);
                this.f1322e.onRelease();
                this.f1323f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1335r);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f1324g - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC0040p.m117v(edgeEffect2) != 0.0f) {
                        float f4 = -AbstractC0040p.m85J(edgeEffect2, -height, x);
                        if (AbstractC0040p.m117v(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (AbstractC0040p.m117v(edgeEffect) != 0.0f) {
                        float fM85J = AbstractC0040p.m85J(edgeEffect, height, 1.0f - x);
                        if (AbstractC0040p.m117v(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = fM85J;
                    }
                    int iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i5 = i4 - iRound;
                    if (!this.f1328k && Math.abs(i5) > this.f1332o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1328k = true;
                        i5 = i5 > 0 ? i5 - this.f1332o : i5 + this.f1332o;
                    }
                    if (this.f1328k) {
                        int iM1190r = m1190r(i5, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1324g = y - iM1190r;
                        this.f1338u += iM1190r;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1328k && getChildCount() > 0 && this.f1321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1335r = -1;
                this.f1328k = false;
                VelocityTracker velocityTracker3 = this.f1329l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1329l = null;
                }
                m1194v(0);
                this.f1322e.onRelease();
                this.f1323f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1324g = (int) motionEvent.getY(actionIndex);
                this.f1335r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1186n(motionEvent);
                this.f1324g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1335r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1328k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1321d.isFinished()) {
                this.f1321d.abortAnimation();
                m1194v(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1324g = y2;
            this.f1335r = pointerId;
            c0113m.m416h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1329l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m1188p(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1320c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
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
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        m1189q(i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1189q(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            m1190r(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    /* JADX INFO: renamed from: r */
    public final int m1190r(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        C0113m c0113m = this.f1342y;
        if (i4 == 1) {
            c0113m.m416h(2, i4);
        }
        boolean zM411c = this.f1342y.m411c(0, i2, this.f1337t, this.f1336s, i4);
        int[] iArr = this.f1337t;
        int[] iArr2 = this.f1336s;
        if (zM411c) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m1187o(i5, 0, scrollY, scrollRange) && !c0113m.m415g(i4);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1342y.m413e(0, scrollY2, 0, i5 - scrollY2, this.f1336s, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1323f;
        EdgeEffect edgeEffect2 = this.f1322e;
        if (i9 < 0) {
            if (z4) {
                AbstractC0040p.m85J(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            AbstractC0040p.m85J(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i4 == 0 && (velocityTracker = this.f1329l) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m1194v(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1325h) {
            this.f1327j = view2;
        } else {
            Rect rect = this.f1320c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM1181h = m1181h(rect);
            if (iM1181h != 0) {
                scrollBy(0, iM1181h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM1181h = m1181h(rect);
        boolean z3 = iM1181h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM1181h);
            } else {
                m1192t(0, iM1181h, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1329l) != null) {
            velocityTracker.recycle();
            this.f1329l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1325h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1191s(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fM117v = AbstractC0040p.m117v(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.f1318a * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = f1314B;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fM117v;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1330m) {
            this.f1330m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0113m c0113m = this.f1342y;
        if (c0113m.f298d) {
            Field field = AbstractC0080Q.f219a;
            AbstractC0070G.m236z(c0113m.f297c);
        }
        c0113m.f298d = z2;
    }

    public void setOnScrollChangeListener(InterfaceC0221j interfaceC0221j) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1331n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1342y.m416h(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1194v(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m1192t(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1319b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1321d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1342y.m416h(2, 1);
            } else {
                m1194v(1);
            }
            this.f1339v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1321d.isFinished()) {
                this.f1321d.abortAnimation();
                m1194v(1);
            }
            scrollBy(i2, i3);
        }
        this.f1319b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1193u(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1322e;
        if (AbstractC0040p.m117v(edgeEffect) != 0.0f) {
            AbstractC0040p.m85J(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1323f;
        if (AbstractC0040p.m117v(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0040p.m85J(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m1194v(int i2) {
        this.f1342y.m417i(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
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
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
