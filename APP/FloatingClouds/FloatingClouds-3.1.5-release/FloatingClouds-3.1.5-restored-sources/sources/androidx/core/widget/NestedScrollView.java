package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
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
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.C1066R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0038C;
import p000a.C0116G5;
import p000a.C0146I;
import p000a.C0176Jb;
import p000a.C0181Jg;
import p000a.C0230Mb;
import p000a.C0581fg;
import p000a.C0600gg;
import p000a.C0665k5;
import p000a.C0866ug;
import p000a.C0942yg;
import p000a.InterfaceC0158Ib;
import p000a.InterfaceC0212Lb;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0212Lb, InterfaceC0158Ib {

    /* JADX INFO: renamed from: B */
    public static final float f4446B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: C */
    public static final C1073a f4447C = new C1073a();

    /* JADX INFO: renamed from: D */
    public static final int[] f4448D = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public final C0665k5 f4449A;

    /* JADX INFO: renamed from: a */
    public final float f4450a;

    /* JADX INFO: renamed from: b */
    public long f4451b;

    /* JADX INFO: renamed from: c */
    public final Rect f4452c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f4453d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f4454e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f4455f;

    /* JADX INFO: renamed from: g */
    public int f4456g;

    /* JADX INFO: renamed from: h */
    public boolean f4457h;

    /* JADX INFO: renamed from: i */
    public boolean f4458i;

    /* JADX INFO: renamed from: j */
    public View f4459j;

    /* JADX INFO: renamed from: k */
    public boolean f4460k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f4461l;

    /* JADX INFO: renamed from: m */
    public boolean f4462m;

    /* JADX INFO: renamed from: n */
    public boolean f4463n;

    /* JADX INFO: renamed from: o */
    public final int f4464o;

    /* JADX INFO: renamed from: p */
    public final int f4465p;

    /* JADX INFO: renamed from: q */
    public final int f4466q;

    /* JADX INFO: renamed from: r */
    public int f4467r;

    /* JADX INFO: renamed from: s */
    public final int[] f4468s;

    /* JADX INFO: renamed from: t */
    public final int[] f4469t;

    /* JADX INFO: renamed from: u */
    public int f4470u;

    /* JADX INFO: renamed from: v */
    public int f4471v;

    /* JADX INFO: renamed from: w */
    public C1077e f4472w;

    /* JADX INFO: renamed from: x */
    public final C0230Mb f4473x;

    /* JADX INFO: renamed from: y */
    public final C0176Jb f4474y;

    /* JADX INFO: renamed from: z */
    public float f4475z;

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C1073a extends C0038C {
        @Override // p000a.C0038C
        /* JADX INFO: renamed from: c */
        public final void mo114c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo114c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: d */
        public final void mo115d(View view, C0146I c0146i) {
            int scrollRange;
            this.f137a.onInitializeAccessibilityNodeInfo(view, c0146i.f505a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0146i.m382h(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0146i.m383i(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0146i.m377b(C0146I.a.f509g);
                c0146i.m377b(C0146I.a.f513k);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0146i.m377b(C0146I.a.f508f);
                c0146i.m377b(C0146I.a.f514l);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        @Override // p000a.C0038C
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo118g(View view, int i, Bundle bundle) {
            if (super.mo118g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i == 4096) {
                    int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.m2495u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax != nestedScrollView.getScrollY()) {
                        nestedScrollView.m2495u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i == 16908346) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C1074b {
        /* JADX INFO: renamed from: a */
        public static boolean m2499a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    public class C1075c {
        public C1075c() {
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$d */
    public interface InterfaceC1076d {
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$e */
    public static class C1077e extends View.BaseSavedState {
        public static final Parcelable.Creator<C1077e> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f4477a;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$e$a */
        public class a implements Parcelable.Creator<C1077e> {
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final C1077e createFromParcel(Parcel parcel) {
                C1077e c1077e = new C1077e(parcel);
                c1077e.f4477a = parcel.readInt();
                return c1077e;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final C1077e[] newArray(int i) {
                return new C1077e[i];
            }
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4477a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4477a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        int i = C1066R.attr.nestedScrollViewStyle;
        super(context, attributeSet, i);
        this.f4452c = new Rect();
        this.f4457h = true;
        this.f4458i = false;
        this.f4459j = null;
        this.f4460k = false;
        this.f4463n = true;
        this.f4467r = -1;
        this.f4468s = new int[2];
        this.f4469t = new int[2];
        this.f4449A = new C0665k5(getContext(), new C1075c());
        int i2 = Build.VERSION.SDK_INT;
        this.f4454e = i2 >= 31 ? C0116G5.b.m309a(context, attributeSet) : new EdgeEffect(context);
        this.f4455f = i2 >= 31 ? C0116G5.b.m309a(context, attributeSet) : new EdgeEffect(context);
        this.f4450a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4453d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4464o = viewConfiguration.getScaledTouchSlop();
        this.f4465p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4466q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4448D, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f4473x = new C0230Mb();
        this.f4474y = new C0176Jb(this);
        setNestedScrollingEnabled(true);
        C0866ug.m2003j(this, f4447C);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2481g(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m2481g((View) parent, nestedScrollView);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2482a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m2487h(viewFindNextFocus, maxScrollAmount, getHeight())) {
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
            m2493s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f4452c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m2493s(m2483b(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m2487h(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public final int m2483b(Rect rect) {
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

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: c */
    public final void mo528c(View view, View view2, int i, int i2) {
        C0230Mb c0230Mb = this.f4473x;
        if (i2 == 1) {
            c0230Mb.f768b = i;
        } else {
            c0230Mb.f767a = i;
        }
        m2496v(2, i2);
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i;
        if (this.f4453d.isFinished()) {
            return;
        }
        this.f4453d.computeScrollOffset();
        int currY = this.f4453d.getCurrY();
        int i2 = currY - this.f4471v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f4455f;
        EdgeEffect edgeEffect2 = this.f4454e;
        if (i2 <= 0 || C0116G5.m306a(edgeEffect2) == 0.0f) {
            if (i2 < 0 && C0116G5.m306a(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(C0116G5.m307b(edgeEffect, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect.finish();
                }
            }
            int i3 = i2;
            this.f4471v = currY;
            int[] iArr = this.f4469t;
            iArr[1] = 0;
            this.f4474y.m479c(0, i3, iArr, null, 1);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                m2490p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.f4474y.m480d(0, scrollY2, 0, i4, this.f4468s, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f4453d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f4453d.getCurrVelocity());
                    }
                }
                this.f4453d.abortAnimation();
                m2498x(1);
            }
            if (this.f4453d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m2498x(1);
                return;
            }
        }
        iRound = Math.round(C0116G5.m307b(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect2.finish();
        }
        i2 -= iRound;
        int i32 = i2;
        this.f4471v = currY;
        int[] iArr2 = this.f4469t;
        iArr2[1] = 0;
        this.f4474y.m479c(0, i32, iArr2, null, 1);
        i = i32 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.f4453d.isFinished()) {
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
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2484d(KeyEvent keyEvent) {
        this.f4452c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m2486f(33) : m2482a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m2486f(130) : m2482a(130);
                    }
                    if (keyCode == 62) {
                        m2491q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m2486f(33);
                    }
                    if (keyCode == 93) {
                        return m2486f(130);
                    }
                    if (keyCode == 122) {
                        m2491q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m2491q(130);
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

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2484d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f4474y.m477a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f4474y.m478b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f4474y.m479c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f4474y.m480d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4454e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C1074b.m2499a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C1074b.m2499a(this)) {
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
        EdgeEffect edgeEffect2 = this.f4455f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C1074b.m2499a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (C1074b.m2499a(this)) {
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

    /* JADX INFO: renamed from: e */
    public final void m2485e(int i) {
        if (getChildCount() > 0) {
            this.f4453d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2496v(2, 1);
            this.f4471v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2486f(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f4452c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m2492r(i, rect.top, rect.bottom);
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
        C0230Mb c0230Mb = this.f4473x;
        return c0230Mb.f768b | c0230Mb.f767a;
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
        if (this.f4475z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4475z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4475z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2487h(View view, int i, int i2) {
        Rect rect = this.f4452c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4474y.m482f(0);
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: i */
    public final void mo529i(View view, int i) {
        C0230Mb c0230Mb = this.f4473x;
        if (i == 1) {
            c0230Mb.f768b = 0;
        } else {
            c0230Mb.f767a = 0;
        }
        m2498x(i);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4474y.f618d;
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: j */
    public final void mo530j(View view, int i, int i2, int[] iArr, int i3) {
        this.f4474y.m479c(i, i2, iArr, null, i3);
    }

    /* JADX INFO: renamed from: k */
    public final void m2488k(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4474y.m480d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: l */
    public final void m2489l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4467r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4456g = (int) motionEvent.getY(i);
            this.f4467r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4461l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // p000a.InterfaceC0212Lb
    /* JADX INFO: renamed from: m */
    public final void mo591m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m2488k(i4, i5, iArr);
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

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: n */
    public final void mo531n(View view, int i, int i2, int i3, int i4, int i5) {
        m2488k(i4, i5, null);
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: o */
    public final boolean mo532o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4458i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        int width;
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f;
        long j;
        float f2;
        float fSqrt;
        int i4;
        float f3;
        VelocityTracker velocityTracker2;
        int i5;
        float f4;
        if (motionEvent.getAction() != 8 || this.f4460k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i = 26;
        } else {
            axisValue = 0.0f;
            i = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        m2493s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0665k5 c0665k5 = this.f4449A;
        c0665k5.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i6 = c0665k5.f2484f;
        int[] iArr = c0665k5.f2486h;
        int i7 = 1;
        if (i6 == source && c0665k5.f2485g == deviceId && c0665k5.f2483e == i) {
            z = false;
            i2 = 20;
            i3 = 0;
        } else {
            Context context = c0665k5.f2479a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i2 = 20;
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i3 = 0;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                scaledMinimumFlingVelocity = C0942yg.m2220b(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
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
            if (i8 >= 34) {
                scaledMaximumFlingVelocity = C0942yg.m2219a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
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
            c0665k5.f2484f = source;
            c0665k5.f2485g = deviceId;
            c0665k5.f2483e = i;
            z = true;
        }
        if (iArr[i3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0665k5.f2481c;
            if (velocityTracker3 == null) {
                return true;
            }
            velocityTracker3.recycle();
            c0665k5.f2481c = null;
            return true;
        }
        if (c0665k5.f2481c == null) {
            c0665k5.f2481c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker4 = c0665k5.f2481c;
        Map<VelocityTracker, C0600gg> map = C0581fg.f2148a;
        velocityTracker4.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map<VelocityTracker, C0600gg> map2 = C0581fg.f2148a;
            if (!map2.containsKey(velocityTracker4)) {
                map2.put(velocityTracker4, new C0600gg());
            }
            C0600gg c0600gg = map2.get(velocityTracker4);
            c0600gg.getClass();
            long eventTime = motionEvent.getEventTime();
            int i9 = c0600gg.f2225d;
            long[] jArr = c0600gg.f2223b;
            if (i9 != 0 && eventTime - jArr[c0600gg.f2226e] > 40) {
                c0600gg.f2225d = i3;
                c0600gg.f2224c = 0.0f;
            }
            int i10 = (c0600gg.f2226e + 1) % 20;
            c0600gg.f2226e = i10;
            int i11 = c0600gg.f2225d;
            if (i11 != i2) {
                c0600gg.f2225d = i11 + 1;
            }
            c0600gg.f2222a[i10] = motionEvent.getAxisValue(26);
            jArr[c0600gg.f2226e] = eventTime;
        }
        float f5 = Float.MAX_VALUE;
        velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0600gg c0600gg2 = C0581fg.f2148a.get(velocityTracker4);
        if (c0600gg2 != null) {
            int i12 = c0600gg2.f2225d;
            if (i12 < 2) {
                velocityTracker = velocityTracker4;
                f2 = Float.MAX_VALUE;
                i4 = 1000;
                fSqrt = 0.0f;
                f4 = fSqrt * i4;
                c0600gg2.f2224c = f4;
                if (f4 >= (-Math.abs(f2))) {
                    c0600gg2.f2224c = -Math.abs(f2);
                } else if (c0600gg2.f2224c > Math.abs(f2)) {
                    c0600gg2.f2224c = Math.abs(f2);
                }
            } else {
                int i13 = c0600gg2.f2226e;
                int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                long[] jArr2 = c0600gg2.f2223b;
                long j2 = jArr2[i13];
                while (true) {
                    j = jArr2[i14];
                    if (j2 - j <= 100) {
                        break;
                    }
                    c0600gg2.f2225d--;
                    i14 = (i14 + 1) % 20;
                }
                int i15 = c0600gg2.f2225d;
                if (i15 >= 2) {
                    float[] fArr = c0600gg2.f2222a;
                    if (i15 == 2) {
                        int i16 = (i14 + 1) % 20;
                        if (j != jArr2[i16]) {
                            velocityTracker = velocityTracker4;
                            f2 = Float.MAX_VALUE;
                            i4 = 1000;
                            fSqrt = fArr[i16] / (r7 - j);
                        }
                    } else {
                        float f6 = 0.0f;
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            if (i17 >= c0600gg2.f2225d - 1) {
                                break;
                            }
                            int i19 = i17 + i14;
                            long j3 = jArr2[i19 % 20];
                            int i20 = (i19 + 1) % 20;
                            if (jArr2[i20] == j3) {
                                velocityTracker2 = velocityTracker4;
                                f3 = f5;
                                i5 = i7;
                            } else {
                                i18++;
                                f3 = f5;
                                velocityTracker2 = velocityTracker4;
                                float fSqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                float f7 = fArr[i20] / (jArr2[i20] - j3);
                                float fAbs = (Math.abs(f7) * (f7 - fSqrt2)) + f6;
                                i5 = i7;
                                if (i18 == i5) {
                                    fAbs *= 0.5f;
                                }
                                f6 = fAbs;
                            }
                            i17 += i5;
                            f5 = f3;
                            i7 = i5;
                            velocityTracker4 = velocityTracker2;
                        }
                        velocityTracker = velocityTracker4;
                        f2 = f5;
                        fSqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                        i4 = 1000;
                    }
                    f4 = fSqrt * i4;
                    c0600gg2.f2224c = f4;
                    if (f4 >= (-Math.abs(f2))) {
                    }
                }
            }
        } else {
            velocityTracker = velocityTracker4;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = C0581fg.a.m1417a(velocityTracker, i);
        } else {
            VelocityTracker velocityTracker5 = velocityTracker;
            if (i == 0) {
                yVelocity = velocityTracker5.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTracker5.getYVelocity();
            } else {
                C0600gg c0600gg3 = C0581fg.f2148a.get(velocityTracker5);
                yVelocity = (c0600gg3 == null || i != 26) ? 0.0f : c0600gg3.f2224c;
            }
        }
        NestedScrollView nestedScrollView = NestedScrollView.this;
        float f8 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f8);
        if (z || (fSignum != Math.signum(c0665k5.f2482d) && fSignum != 0.0f)) {
            nestedScrollView.f4453d.abortAnimation();
        }
        if (Math.abs(f8) < iArr[0]) {
            return true;
        }
        float fMax = Math.max(-r3, Math.min(f8, iArr[1]));
        if (fMax == 0.0f) {
            f = 0.0f;
        } else {
            nestedScrollView.f4453d.abortAnimation();
            nestedScrollView.m2485e((int) fMax);
            f = fMax;
        }
        c0665k5.f2482d = f;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f4460k) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m2497w(motionEvent) && this.f4453d.isFinished()) {
                        z = false;
                    }
                    this.f4460k = z;
                    VelocityTracker velocityTracker = this.f4461l;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f4461l = null;
                    }
                } else {
                    this.f4456g = y;
                    this.f4467r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f4461l;
                    if (velocityTracker2 == null) {
                        this.f4461l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f4461l.addMovement(motionEvent);
                    this.f4453d.computeScrollOffset();
                    if (!m2497w(motionEvent) && this.f4453d.isFinished()) {
                        z = false;
                    }
                    this.f4460k = z;
                    m2496v(2, 0);
                }
            }
        } else if (i == 1) {
            this.f4460k = false;
            this.f4467r = -1;
            VelocityTracker velocityTracker3 = this.f4461l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f4461l = null;
            }
            if (this.f4453d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m2498x(0);
        } else if (i == 2) {
            int i2 = this.f4467r;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f4456g) > this.f4464o && (2 & getNestedScrollAxes()) == 0) {
                        this.f4460k = true;
                        this.f4456g = y2;
                        if (this.f4461l == null) {
                            this.f4461l = VelocityTracker.obtain();
                        }
                        this.f4461l.addMovement(motionEvent);
                        this.f4470u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i != 3) {
            if (i == 6) {
                m2489l(motionEvent);
            }
        }
        return this.f4460k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f4457h = false;
        View view = this.f4459j;
        if (view != null && m2481g(view, this)) {
            View view2 = this.f4459j;
            Rect rect = this.f4452c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2483b = m2483b(rect);
            if (iM2483b != 0) {
                scrollBy(0, iM2483b);
            }
        }
        this.f4459j = null;
        if (!this.f4458i) {
            if (this.f4472w != null) {
                scrollTo(getScrollX(), this.f4472w.f4477a);
                this.f4472w = null;
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
        this.f4458i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4462m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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
        m2485e((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f4474y.m478b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f4474y.m479c(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m2488k(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo528c(view, view2, i, 0);
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
        if (viewFindNextFocus != null && m2487h(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1077e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1077e c1077e = (C1077e) parcelable;
        super.onRestoreInstanceState(c1077e.getSuperState());
        this.f4472w = c1077e;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1077e c1077e = new C1077e(super.onSaveInstanceState());
        c1077e.f4477a = getScrollY();
        return c1077e;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m2487h(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f4452c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM2483b = m2483b(rect);
        if (iM2483b != 0) {
            if (this.f4463n) {
                m2495u(0, iM2483b, false);
            } else {
                scrollBy(0, iM2483b);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo532o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo529i(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f4461l == null) {
            this.f4461l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4470u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f4470u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4455f;
            EdgeEffect edgeEffect2 = this.f4454e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4461l;
                velocityTracker.computeCurrentVelocity(1000, this.f4466q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4467r);
                if (Math.abs(yVelocity) >= this.f4465p) {
                    if (C0116G5.m306a(edgeEffect2) != 0.0f) {
                        if (m2494t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m2485e(-yVelocity);
                        }
                    } else if (C0116G5.m306a(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (m2494t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            m2485e(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!this.f4474y.m478b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m2485e(i2);
                        }
                    }
                } else if (this.f4453d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4467r = -1;
                this.f4460k = false;
                VelocityTracker velocityTracker2 = this.f4461l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4461l = null;
                }
                m2498x(0);
                this.f4454e.onRelease();
                this.f4455f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4467r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4467r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f4456g - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (C0116G5.m306a(edgeEffect2) != 0.0f) {
                        float f3 = -C0116G5.m307b(edgeEffect2, -height, x);
                        if (C0116G5.m306a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (C0116G5.m306a(edgeEffect) != 0.0f) {
                        float fM307b = C0116G5.m307b(edgeEffect, height, 1.0f - x);
                        if (C0116G5.m306a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fM307b;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.f4460k && Math.abs(i4) > this.f4464o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4460k = true;
                        i4 = i4 > 0 ? i4 - this.f4464o : i4 + this.f4464o;
                    }
                    if (this.f4460k) {
                        int iM2493s = m2493s(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f4456g = y - iM2493s;
                        this.f4470u += iM2493s;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4460k && getChildCount() > 0 && this.f4453d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4467r = -1;
                this.f4460k = false;
                VelocityTracker velocityTracker3 = this.f4461l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4461l = null;
                }
                m2498x(0);
                this.f4454e.onRelease();
                this.f4455f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4456g = (int) motionEvent.getY(actionIndex);
                this.f4467r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2489l(motionEvent);
                this.f4456g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4467r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4460k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4453d.isFinished()) {
                this.f4453d.abortAnimation();
                m2498x(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4456g = y2;
            this.f4467r = pointerId;
            m2496v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4461l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2490p(int i, int i2, int i3, int i4) {
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
                if (z2 && !this.f4474y.m482f(1)) {
                    this.f4453d.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.f4453d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2491q(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f4452c;
        if (z) {
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
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m2492r(i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2492r(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top2 = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top2 < i3) {
                boolean z4 = i2 < top2 && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top2 < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2493s(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4457h) {
            this.f4459j = view2;
        } else {
            Rect rect = this.f4452c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM2483b = m2483b(rect);
            if (iM2483b != 0) {
                scrollBy(0, iM2483b);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM2483b = m2483b(rect);
        boolean z2 = iM2483b != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM2483b);
                return z2;
            }
            m2495u(0, iM2483b, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f4461l) != null) {
            velocityTracker.recycle();
            this.f4461l = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4457h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final int m2493s(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            m2496v(2, i3);
        }
        boolean zM479c = this.f4474y.m479c(0, i, this.f4469t, this.f4468s, i3);
        int[] iArr = this.f4469t;
        int[] iArr2 = this.f4468s;
        if (zM479c) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = m2490p(i4, 0, scrollY, scrollRange) && !this.f4474y.m482f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f4474y.m480d(0, scrollY2, 0, i4 - scrollY2, this.f4468s, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f4455f;
        EdgeEffect edgeEffect2 = this.f4454e;
        if (i8 < 0) {
            if (z3) {
                C0116G5.m307b(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            C0116G5.m307b(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2 && i3 == 0 && (velocityTracker = this.f4461l) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m2498x(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
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
        if (z != this.f4462m) {
            this.f4462m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0176Jb c0176Jb = this.f4474y;
        if (c0176Jb.f618d) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.d.m2034z(c0176Jb.f617c);
        }
        c0176Jb.f618d = z;
    }

    public void setOnScrollChangeListener(InterfaceC1076d interfaceC1076d) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f4463n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f4474y.m483g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m2498x(0);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2494t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM306a = C0116G5.m306a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f4450a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f4446B;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM306a;
    }

    /* JADX INFO: renamed from: u */
    public final void m2495u(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4451b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4453d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                m2496v(2, 1);
            } else {
                m2498x(1);
            }
            this.f4471v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4453d.isFinished()) {
                this.f4453d.abortAnimation();
                m2498x(1);
            }
            scrollBy(i, i2);
        }
        this.f4451b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public final void m2496v(int i, int i2) {
        this.f4474y.m483g(2, i2);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2497w(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f4454e;
        if (C0116G5.m306a(edgeEffect) != 0.0f) {
            C0116G5.m307b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f4455f;
        if (C0116G5.m306a(edgeEffect2) == 0.0f) {
            return z;
        }
        C0116G5.m307b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m2498x(int i) {
        this.f4474y.m484h(i);
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
}
