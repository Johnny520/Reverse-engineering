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
import android.util.Log;
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
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p004C.C0066j;
import p006D.AbstractC0078g;
import p006D.AbstractC0079h;
import p006D.AbstractC0083l;
import p006D.C0082k;
import p006D.C0086o;
import p006D.InterfaceC0084m;
import p099y.AbstractC1038B;
import p099y.AbstractC1048L;
import p099y.AbstractC1050N;
import p099y.AbstractC1051O;
import p099y.AbstractC1052P;
import p099y.AbstractC1088t;
import p099y.AbstractC1089u;
import p099y.C1076h;
import p099y.C1080l;
import p099y.C1083o;
import p099y.C1090v;
import p099y.InterfaceC1081m;
import p099y.InterfaceC1082n;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1082n {

    /* JADX INFO: renamed from: C */
    public static final float f1133C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: D */
    public static final C0082k f1134D = new C0082k();

    /* JADX INFO: renamed from: E */
    public static final int[] f1135E = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public float f1136A;

    /* JADX INFO: renamed from: B */
    public final C1076h f1137B;

    /* JADX INFO: renamed from: b */
    public final float f1138b;

    /* JADX INFO: renamed from: c */
    public long f1139c;

    /* JADX INFO: renamed from: d */
    public final Rect f1140d;

    /* JADX INFO: renamed from: e */
    public final OverScroller f1141e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f1142f;

    /* JADX INFO: renamed from: g */
    public final EdgeEffect f1143g;

    /* JADX INFO: renamed from: h */
    public int f1144h;

    /* JADX INFO: renamed from: i */
    public boolean f1145i;

    /* JADX INFO: renamed from: j */
    public boolean f1146j;

    /* JADX INFO: renamed from: k */
    public View f1147k;

    /* JADX INFO: renamed from: l */
    public boolean f1148l;

    /* JADX INFO: renamed from: m */
    public VelocityTracker f1149m;

    /* JADX INFO: renamed from: n */
    public boolean f1150n;

    /* JADX INFO: renamed from: o */
    public boolean f1151o;

    /* JADX INFO: renamed from: p */
    public final int f1152p;

    /* JADX INFO: renamed from: q */
    public final int f1153q;

    /* JADX INFO: renamed from: r */
    public final int f1154r;

    /* JADX INFO: renamed from: s */
    public int f1155s;

    /* JADX INFO: renamed from: t */
    public final int[] f1156t;

    /* JADX INFO: renamed from: u */
    public final int[] f1157u;

    /* JADX INFO: renamed from: v */
    public int f1158v;

    /* JADX INFO: renamed from: w */
    public int f1159w;

    /* JADX INFO: renamed from: x */
    public C0086o f1160x;

    /* JADX INFO: renamed from: y */
    public final C1083o f1161y;

    /* JADX INFO: renamed from: z */
    public final C1080l f1162z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.p055lu.wxmask272.R.attr.nestedScrollViewStyle);
        this.f1140d = new Rect();
        this.f1145i = true;
        this.f1146j = false;
        this.f1147k = null;
        this.f1148l = false;
        this.f1151o = true;
        this.f1155s = -1;
        this.f1156t = new int[2];
        this.f1157u = new int[2];
        this.f1137B = new C1076h(getContext(), new C0066j(1, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1142f = i2 >= 31 ? AbstractC0078g.m161a(context, attributeSet) : new EdgeEffect(context);
        this.f1143g = i2 >= 31 ? AbstractC0078g.m161a(context, attributeSet) : new EdgeEffect(context);
        this.f1138b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1141e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1152p = viewConfiguration.getScaledTouchSlop();
        this.f1153q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1154r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1135E, com.p055lu.wxmask272.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1161y = new C1083o();
        this.f1162z = new C1080l(this);
        setNestedScrollingEnabled(true);
        AbstractC1048L.m2290i(this, f1134D);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m717m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m717m((View) parent, nestedScrollView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: a */
    public final void mo660a(int i2, int i3, int[] iArr, int i4) {
        m720i(i2, i3, iArr, null, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: b */
    public final void mo661b(View view, View view2, int i2, int i3) {
        C1083o c1083o = this.f1161y;
        if (i3 == 1) {
            c1083o.f3721b = i2;
        } else {
            c1083o.f3720a = i2;
        }
        m733w(2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: c */
    public final void mo662c(View view, int i2) {
        C1083o c1083o = this.f1161y;
        if (i2 == 1) {
            c1083o.f3721b = 0;
        } else {
            c1083o.f3720a = 0;
        }
        m735y(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i2;
        int i3;
        if (this.f1141e.isFinished()) {
            return;
        }
        this.f1141e.computeScrollOffset();
        int currY = this.f1141e.getCurrY();
        int i4 = currY - this.f1159w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1143g;
        EdgeEffect edgeEffect2 = this.f1142f;
        if (i4 <= 0 || AbstractC0079h.m193s(edgeEffect2) == 0.0f) {
            if (i4 < 0 && AbstractC0079h.m193s(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(AbstractC0079h.m168J(edgeEffect, (i4 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i4) {
                    edgeEffect.finish();
                }
            }
            this.f1159w = currY;
            int[] iArr = this.f1157u;
            iArr[1] = 0;
            m720i(0, i4, iArr, null, 1);
            i2 = i4 - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 == 0) {
                int scrollY = getScrollY();
                m727q(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i5 = i2 - scrollY2;
                iArr[1] = 0;
                i3 = 1;
                this.f1162z.m2358b(0, scrollY2, 0, i5, this.f1156t, 1, iArr);
                i2 = i5 - iArr[1];
            } else {
                i3 = 1;
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i3 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f1141e.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1141e.getCurrVelocity());
                    }
                }
                this.f1141e.abortAnimation();
                m735y(i3);
            }
            if (this.f1141e.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m735y(i3);
                return;
            }
        }
        iRound = Math.round(AbstractC0079h.m168J(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i4) {
            edgeEffect2.finish();
        }
        i4 -= iRound;
        this.f1159w = currY;
        int[] iArr2 = this.f1157u;
        iArr2[1] = 0;
        m720i(0, i4, iArr2, null, 1);
        i2 = i4 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i2 == 0) {
        }
        if (i2 != 0) {
        }
        if (this.f1141e.isFinished()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1082n
    /* JADX INFO: renamed from: d */
    public final void mo663d(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m725o(i5, i6, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m721j(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        ViewParent viewParentM2359c;
        C1080l c1080l = this.f1162z;
        if (c1080l.f3718d && (viewParentM2359c = c1080l.m2359c(0)) != null) {
            try {
                return AbstractC1052P.m2296a(viewParentM2359c, c1080l.f3717c, f, f2, z2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2359c + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1162z.m2357a(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return m720i(i2, i3, iArr, iArr2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1162z.m2358b(i2, i3, i4, i5, iArr, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1142f;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AbstractC0083l.m223a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AbstractC0083l.m223a(this)) {
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
        EdgeEffect edgeEffect2 = this.f1143g;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC0083l.m223a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (AbstractC0083l.m223a(this)) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: e */
    public final void mo664e(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6) {
        m725o(i5, i6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1081m
    /* JADX INFO: renamed from: f */
    public final boolean mo665f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m718g(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m724n(viewFindNextFocus, maxScrollAmount, getHeight())) {
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
            m730t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1140d;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m730t(m719h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m724n(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1083o c1083o = this.f1161y;
        return c1083o.f3721b | c1083o.f3720a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getVerticalScrollFactorCompat() {
        if (this.f1136A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1136A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1136A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m719h(Rect rect) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1162z.m2359c(0) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m720i(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentM2359c;
        int i5;
        int i6;
        C1080l c1080l = this.f1162z;
        if (!c1080l.f3718d || (viewParentM2359c = c1080l.m2359c(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        NestedScrollView nestedScrollView = c1080l.f3717c;
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (c1080l.f3719e == null) {
                c1080l.f3719e = new int[2];
            }
            iArr = c1080l.f3719e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentM2359c instanceof InterfaceC1081m) {
            ((InterfaceC1081m) viewParentM2359c).mo660a(i2, i3, iArr, i4);
        } else if (i4 == 0) {
            try {
                AbstractC1052P.m2298c(viewParentM2359c, nestedScrollView, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2359c + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1162z.f3718d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m721j(KeyEvent keyEvent) {
        this.f1140d.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m723l(33) : m718g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m723l(130) : m718g(130);
                    }
                    if (keyCode == 62) {
                        m728r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m723l(33);
                    }
                    if (keyCode == 93) {
                        return m723l(130);
                    }
                    if (keyCode == 122) {
                        m728r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m728r(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m722k(int i2) {
        if (getChildCount() > 0) {
            this.f1141e.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m733w(2, 1);
            this.f1159w = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m723l(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1140d;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m729s(i2, rect.top, rect.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m724n(View view, int i2, int i3) {
        Rect rect = this.f1140d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m725o(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1162z.m2358b(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1146j = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i2;
        int width;
        int i3;
        int i4;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f;
        long j2;
        float f2;
        float fSqrt;
        int i5;
        float f3;
        VelocityTracker velocityTracker2;
        int i6;
        float f4;
        if (motionEvent.getAction() != 8 || this.f1148l) {
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
        m730t(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        C1076h c1076h = this.f1137B;
        c1076h.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i7 = c1076h.f3711f;
        int[] iArr = c1076h.f3713h;
        int i8 = 1;
        if (i7 == source && c1076h.f3712g == deviceId && c1076h.f3710e == i2) {
            z2 = false;
            i3 = 20;
            i4 = 0;
        } else {
            Context context = c1076h.f3706a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i3 = 20;
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i4 = 0;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                int i10 = AbstractC1051O.f3667a;
                scaledMinimumFlingVelocity = AbstractC1050N.m2295b(viewConfiguration, deviceId2, i2, source2);
            } else {
                int i11 = AbstractC1051O.f3667a;
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
            if (i9 >= 34) {
                scaledMaximumFlingVelocity = AbstractC1050N.m2294a(viewConfiguration, deviceId3, i2, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c1076h.f3711f = source;
            c1076h.f3712g = deviceId;
            c1076h.f3710e = i2;
            z2 = true;
        }
        if (iArr[i4] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c1076h.f3708c;
            if (velocityTracker3 == null) {
                return true;
            }
            velocityTracker3.recycle();
            c1076h.f3708c = null;
            return true;
        }
        if (c1076h.f3708c == null) {
            c1076h.f3708c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker4 = c1076h.f3708c;
        Map map = AbstractC1089u.f3725a;
        velocityTracker4.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC1089u.f3725a;
            if (!map2.containsKey(velocityTracker4)) {
                map2.put(velocityTracker4, new C1090v());
            }
            C1090v c1090v = (C1090v) map2.get(velocityTracker4);
            c1090v.getClass();
            long eventTime = motionEvent.getEventTime();
            int i12 = c1090v.f3729d;
            long[] jArr = c1090v.f3727b;
            if (i12 != 0 && eventTime - jArr[c1090v.f3730e] > 40) {
                c1090v.f3729d = i4;
                c1090v.f3728c = 0.0f;
            }
            int i13 = (c1090v.f3730e + 1) % 20;
            c1090v.f3730e = i13;
            int i14 = c1090v.f3729d;
            if (i14 != i3) {
                c1090v.f3729d = i14 + 1;
            }
            c1090v.f3726a[i13] = motionEvent.getAxisValue(26);
            jArr[c1090v.f3730e] = eventTime;
        }
        float f5 = Float.MAX_VALUE;
        velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C1090v c1090v2 = (C1090v) AbstractC1089u.f3725a.get(velocityTracker4);
        if (c1090v2 != null) {
            int i15 = c1090v2.f3729d;
            if (i15 < 2) {
                velocityTracker = velocityTracker4;
                f2 = Float.MAX_VALUE;
                i5 = 1000;
                fSqrt = 0.0f;
                f4 = fSqrt * i5;
                c1090v2.f3728c = f4;
                if (f4 >= (-Math.abs(f2))) {
                    c1090v2.f3728c = -Math.abs(f2);
                } else if (c1090v2.f3728c > Math.abs(f2)) {
                    c1090v2.f3728c = Math.abs(f2);
                }
            } else {
                int i16 = c1090v2.f3730e;
                int i17 = ((i16 + 20) - (i15 - 1)) % 20;
                long[] jArr2 = c1090v2.f3727b;
                long j3 = jArr2[i16];
                while (true) {
                    j2 = jArr2[i17];
                    if (j3 - j2 <= 100) {
                        break;
                    }
                    c1090v2.f3729d--;
                    i17 = (i17 + 1) % 20;
                }
                int i18 = c1090v2.f3729d;
                if (i18 >= 2) {
                    float[] fArr = c1090v2.f3726a;
                    if (i18 == 2) {
                        int i19 = (i17 + 1) % 20;
                        if (j2 != jArr2[i19]) {
                            velocityTracker = velocityTracker4;
                            f2 = Float.MAX_VALUE;
                            i5 = 1000;
                            fSqrt = fArr[i19] / (r17 - j2);
                        }
                    } else {
                        float f6 = 0.0f;
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            if (i20 >= c1090v2.f3729d - 1) {
                                break;
                            }
                            int i22 = i20 + i17;
                            long j4 = jArr2[i22 % 20];
                            int i23 = (i22 + 1) % 20;
                            if (jArr2[i23] == j4) {
                                velocityTracker2 = velocityTracker4;
                                f3 = f5;
                                i6 = i8;
                            } else {
                                i21++;
                                f3 = f5;
                                velocityTracker2 = velocityTracker4;
                                float fSqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                float f7 = fArr[i23] / (jArr2[i23] - j4);
                                float fAbs = (Math.abs(f7) * (f7 - fSqrt2)) + f6;
                                i6 = i8;
                                if (i21 == i6) {
                                    fAbs *= 0.5f;
                                }
                                f6 = fAbs;
                            }
                            i20 += i6;
                            f5 = f3;
                            i8 = i6;
                            velocityTracker4 = velocityTracker2;
                        }
                        velocityTracker = velocityTracker4;
                        f2 = f5;
                        fSqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                        i5 = 1000;
                    }
                    f4 = fSqrt * i5;
                    c1090v2.f3728c = f4;
                    if (f4 >= (-Math.abs(f2))) {
                    }
                }
            }
        } else {
            velocityTracker = velocityTracker4;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC1088t.m2361a(velocityTracker, i2);
        } else {
            VelocityTracker velocityTracker5 = velocityTracker;
            if (i2 == 0) {
                yVelocity = velocityTracker5.getXVelocity();
            } else if (i2 == 1) {
                yVelocity = velocityTracker5.getYVelocity();
            } else {
                C1090v c1090v3 = (C1090v) AbstractC1089u.f3725a.get(velocityTracker5);
                yVelocity = (c1090v3 == null || i2 != 26) ? 0.0f : c1090v3.f3728c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c1076h.f3707b.f312c;
        float f8 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f8);
        if (z2 || (fSignum != Math.signum(c1076h.f3709d) && fSignum != 0.0f)) {
            nestedScrollView.f1141e.abortAnimation();
        }
        if (Math.abs(f8) < iArr[0]) {
            return true;
        }
        float fMax = Math.max(-r3, Math.min(f8, iArr[1]));
        if (fMax == 0.0f) {
            f = 0.0f;
        } else {
            nestedScrollView.f1141e.abortAnimation();
            nestedScrollView.m722k((int) fMax);
            f = fMax;
        }
        c1076h.f3709d = f;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1148l) {
            return true;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int y2 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x2 < childAt.getLeft() || x2 >= childAt.getRight()) {
                    if (!m734x(motionEvent) && this.f1141e.isFinished()) {
                        z2 = false;
                    }
                    this.f1148l = z2;
                    VelocityTracker velocityTracker = this.f1149m;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1149m = null;
                    }
                } else {
                    this.f1144h = y2;
                    this.f1155s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1149m;
                    if (velocityTracker2 == null) {
                        this.f1149m = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1149m.addMovement(motionEvent);
                    this.f1141e.computeScrollOffset();
                    if (!m734x(motionEvent) && this.f1141e.isFinished()) {
                        z2 = false;
                    }
                    this.f1148l = z2;
                    m733w(2, 0);
                }
            }
        } else if (i2 == 1) {
            this.f1148l = false;
            this.f1155s = -1;
            VelocityTracker velocityTracker3 = this.f1149m;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1149m = null;
            }
            if (this.f1141e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m735y(0);
        } else if (i2 == 2) {
            int i3 = this.f1155s;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f1144h) > this.f1152p && (2 & getNestedScrollAxes()) == 0) {
                        this.f1148l = true;
                        this.f1144h = y3;
                        if (this.f1149m == null) {
                            this.f1149m = VelocityTracker.obtain();
                        }
                        this.f1149m.addMovement(motionEvent);
                        this.f1158v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i2 != 3) {
            if (i2 == 6) {
                m726p(motionEvent);
            }
        }
        return this.f1148l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f1145i = false;
        View view = this.f1147k;
        if (view != null && m717m(view, this)) {
            View view2 = this.f1147k;
            Rect rect = this.f1140d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM719h = m719h(rect);
            if (iM719h != 0) {
                scrollBy(0, iM719h);
            }
        }
        this.f1147k = null;
        if (!this.f1146j) {
            if (this.f1160x != null) {
                scrollTo(getScrollX(), this.f1160x.f359a);
                this.f1160x = null;
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
        this.f1146j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1150n && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m722k((int) f2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f1162z.m2357a(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        m720i(i2, i3, iArr, null, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        m725o(i5, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo661b(view, view2, i2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus != null && m724n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0086o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0086o c0086o = (C0086o) parcelable;
        super.onRestoreInstanceState(c0086o.getSuperState());
        this.f1160x = c0086o;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0086o c0086o = new C0086o(super.onSaveInstanceState());
        c0086o.f359a = getScrollY();
        return c0086o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m724n(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1140d;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM719h = m719h(rect);
        if (iM719h != 0) {
            if (this.f1151o) {
                m732v(0, iM719h, false);
            } else {
                scrollBy(0, iM719h);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo665f(view, view2, i2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo662c(view, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1149m == null) {
            this.f1149m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1158v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1158v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1143g;
            EdgeEffect edgeEffect2 = this.f1142f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1149m;
                velocityTracker.computeCurrentVelocity(1000, this.f1154r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1155s);
                if (Math.abs(yVelocity) >= this.f1153q) {
                    if (AbstractC0079h.m193s(edgeEffect2) != 0.0f) {
                        if (m731u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m722k(-yVelocity);
                        }
                    } else if (AbstractC0079h.m193s(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (m731u(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            m722k(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!this.f1162z.m2357a(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m722k(i3);
                        }
                    }
                } else if (this.f1141e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1155s = -1;
                this.f1148l = false;
                VelocityTracker velocityTracker2 = this.f1149m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1149m = null;
                }
                m735y(0);
                this.f1142f.onRelease();
                this.f1143g.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1155s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1155s + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f1144h - y2;
                    float x2 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC0079h.m193s(edgeEffect2) != 0.0f) {
                        float f3 = -AbstractC0079h.m168J(edgeEffect2, -height, x2);
                        if (AbstractC0079h.m193s(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (AbstractC0079h.m193s(edgeEffect) != 0.0f) {
                        float fM168J = AbstractC0079h.m168J(edgeEffect, height, 1.0f - x2);
                        if (AbstractC0079h.m193s(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fM168J;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i5 = i4 - iRound;
                    if (!this.f1148l && Math.abs(i5) > this.f1152p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1148l = true;
                        i5 = i5 > 0 ? i5 - this.f1152p : i5 + this.f1152p;
                    }
                    if (this.f1148l) {
                        int iM730t = m730t(i5, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1144h = y2 - iM730t;
                        this.f1158v += iM730t;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1148l && getChildCount() > 0 && this.f1141e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1155s = -1;
                this.f1148l = false;
                VelocityTracker velocityTracker3 = this.f1149m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1149m = null;
                }
                m735y(0);
                this.f1142f.onRelease();
                this.f1143g.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1144h = (int) motionEvent.getY(actionIndex);
                this.f1155s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m726p(motionEvent);
                this.f1144h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1155s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1148l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1141e.isFinished()) {
                this.f1141e.abortAnimation();
                m735y(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1144h = y3;
            this.f1155s = pointerId;
            m733w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1149m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m726p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1155s) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1144h = (int) motionEvent.getY(i2);
            this.f1155s = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1149m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m727q(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            i6 = i3;
            z2 = false;
        } else {
            i6 = 0;
            z2 = true;
        }
        if (i8 > i5) {
            i7 = i5;
        } else {
            if (i8 >= 0) {
                i7 = i8;
                z3 = false;
                if (z3 && this.f1162z.m2359c(1) == null) {
                    this.f1141e.springBack(i6, i7, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i6, i7);
                return !z2 || z3;
            }
            i7 = 0;
        }
        z3 = true;
        if (z3) {
            this.f1141e.springBack(i6, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i6, i7);
        if (z2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m728r(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1140d;
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
        m729s(i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1145i) {
            this.f1147k = view2;
        } else {
            Rect rect = this.f1140d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM719h = m719h(rect);
            if (iM719h != 0) {
                scrollBy(0, iM719h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM719h = m719h(rect);
        boolean z3 = iM719h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM719h);
                return z3;
            }
            m732v(0, iM719h, false);
        }
        return z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1149m) != null) {
            velocityTracker.recycle();
            this.f1149m = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1145i = true;
        super.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m729s(int i2, int i3, int i4) {
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
            m730t(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFillViewport(boolean z2) {
        if (z2 != this.f1150n) {
            this.f1150n = z2;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C1080l c1080l = this.f1162z;
        if (c1080l.f3718d) {
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            AbstractC1038B.m2251z(c1080l.f3717c);
        }
        c1080l.f3718d = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1151o = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return m733w(i2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void stopNestedScroll() {
        m735y(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m730t(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            m733w(2, i4);
        }
        boolean zM720i = m720i(0, i2, this.f1157u, this.f1156t, i4);
        int[] iArr = this.f1157u;
        int[] iArr2 = this.f1156t;
        if (zM720i) {
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
        boolean z5 = m727q(i5, 0, scrollY, scrollRange) && this.f1162z.m2359c(i4) == null;
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1162z.m2358b(0, scrollY2, 0, i5 - scrollY2, this.f1156t, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1143g;
        EdgeEffect edgeEffect2 = this.f1142f;
        if (i9 < 0) {
            if (z4) {
                AbstractC0079h.m168J(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            AbstractC0079h.m168J(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
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
        if (z3 && i4 == 0 && (velocityTracker = this.f1149m) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            m735y(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final boolean m731u(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fM193s = AbstractC0079h.m193s(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2) * 0.35f;
        float f = this.f1138b * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d2 = f1133C;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f))) < fM193s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m732v(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1139c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1141e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                m733w(2, 1);
            } else {
                m735y(1);
            }
            this.f1159w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1141e.isFinished()) {
                this.f1141e.abortAnimation();
                m735y(1);
            }
            scrollBy(i2, i3);
        }
        this.f1139c = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m733w(int i2, int i3) {
        boolean zM2301f;
        C1080l c1080l = this.f1162z;
        if (c1080l.m2359c(i3) != null) {
            return true;
        }
        if (!c1080l.f3718d) {
            return false;
        }
        NestedScrollView nestedScrollView = c1080l.f3717c;
        View view = nestedScrollView;
        for (ViewParent parent = nestedScrollView.getParent(); parent != null; parent = parent.getParent()) {
            boolean z2 = parent instanceof InterfaceC1081m;
            if (z2) {
                zM2301f = ((InterfaceC1081m) parent).mo665f(view, nestedScrollView, i2, i3);
            } else if (i3 == 0) {
                try {
                    zM2301f = AbstractC1052P.m2301f(parent, view, nestedScrollView, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                    zM2301f = false;
                }
            } else {
                zM2301f = false;
            }
            if (zM2301f) {
                if (i3 == 0) {
                    c1080l.f3715a = parent;
                } else if (i3 == 1) {
                    c1080l.f3716b = parent;
                }
                if (z2) {
                    ((InterfaceC1081m) parent).mo661b(view, nestedScrollView, i2, i3);
                } else if (i3 == 0) {
                    try {
                        AbstractC1052P.m2300e(parent, view, nestedScrollView, i2);
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                    }
                }
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m734x(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1142f;
        if (AbstractC0079h.m193s(edgeEffect) != 0.0f) {
            AbstractC0079h.m168J(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1143g;
        if (AbstractC0079h.m193s(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0079h.m168J(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m735y(int i2) {
        C1080l c1080l = this.f1162z;
        ViewParent viewParentM2359c = c1080l.m2359c(i2);
        if (viewParentM2359c != null) {
            boolean z2 = viewParentM2359c instanceof InterfaceC1081m;
            NestedScrollView nestedScrollView = c1080l.f3717c;
            if (z2) {
                ((InterfaceC1081m) viewParentM2359c).mo662c(nestedScrollView, i2);
            } else if (i2 == 0) {
                try {
                    AbstractC1052P.m2302g(viewParentM2359c, nestedScrollView);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM2359c + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                c1080l.f3715a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                c1080l.f3716b = null;
            }
        }
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

    public void setOnScrollChangeListener(InterfaceC0084m interfaceC0084m) {
    }
}
