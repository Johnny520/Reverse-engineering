package p069i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p004C.C0064h;
import p058d.AbstractC0515a;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0728y0 extends ViewGroup {

    /* JADX INFO: renamed from: b */
    public boolean f2464b;

    /* JADX INFO: renamed from: c */
    public int f2465c;

    /* JADX INFO: renamed from: d */
    public int f2466d;

    /* JADX INFO: renamed from: e */
    public int f2467e;

    /* JADX INFO: renamed from: f */
    public int f2468f;

    /* JADX INFO: renamed from: g */
    public int f2469g;

    /* JADX INFO: renamed from: h */
    public float f2470h;

    /* JADX INFO: renamed from: i */
    public boolean f2471i;

    /* JADX INFO: renamed from: j */
    public int[] f2472j;

    /* JADX INFO: renamed from: k */
    public int[] f2473k;

    /* JADX INFO: renamed from: l */
    public Drawable f2474l;

    /* JADX INFO: renamed from: m */
    public int f2475m;

    /* JADX INFO: renamed from: n */
    public int f2476n;

    /* JADX INFO: renamed from: o */
    public int f2477o;

    /* JADX INFO: renamed from: p */
    public int f2478p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0728y0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2464b = true;
        this.f2465c = -1;
        this.f2466d = 0;
        this.f2468f = 8388659;
        int[] iArr = AbstractC0515a.f1650n;
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, iArr, i2);
        AbstractC1048L.m2289h(this, context, iArr, attributeSet, (TypedArray) c0064hM114t.f309c, i2);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f2470h = typedArray.getFloat(4, -1.0f);
        this.f2465c = typedArray.getInt(3, -1);
        this.f2471i = typedArray.getBoolean(7, false);
        setDividerDrawable(c0064hM114t.m123m(5));
        this.f2477o = typedArray.getInt(8, 0);
        this.f2478p = typedArray.getDimensionPixelSize(6, 0);
        c0064hM114t.m130v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0726x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1378e(Canvas canvas, int i2) {
        this.f2474l.setBounds(getPaddingLeft() + this.f2478p, i2, (getWidth() - getPaddingRight()) - this.f2478p, this.f2476n + i2);
        this.f2474l.draw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1379f(Canvas canvas, int i2) {
        this.f2474l.setBounds(i2, getPaddingTop() + this.f2478p, this.f2475m + i2, (getHeight() - getPaddingBottom()) - this.f2478p);
        this.f2474l.draw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0726x0 generateDefaultLayoutParams() {
        int i2 = this.f2467e;
        if (i2 == 0) {
            return new C0726x0(-2, -2);
        }
        if (i2 == 1) {
            return new C0726x0(-1, -2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f2465c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2465c;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2465c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f2466d;
        if (this.f2467e == 1 && (i2 = this.f2468f & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2469g) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2469g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0726x0) childAt.getLayoutParams())).topMargin + baseline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getBaselineAlignedChildIndex() {
        return this.f2465c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getDividerDrawable() {
        return this.f2474l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getDividerPadding() {
        return this.f2478p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getDividerWidth() {
        return this.f2475m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getGravity() {
        return this.f2468f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getOrientation() {
        return this.f2467e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getShowDividers() {
        return this.f2477o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getWeightSum() {
        return this.f2470h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0726x0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0726x0(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0726x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0726x0(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m1380j(int i2) {
        if (i2 == 0) {
            return (this.f2477o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f2477o & 4) != 0;
        }
        if ((this.f2477o & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f2474l == null) {
            return;
        }
        int i3 = 0;
        if (this.f2467e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && m1380j(i3)) {
                    m1378e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0726x0) childAt.getLayoutParams())).topMargin) - this.f2476n);
                }
                i3++;
            }
            if (m1380j(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m1378e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2476n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0726x0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM1366a = AbstractC0718t1.m1366a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m1380j(i3)) {
                C0726x0 c0726x0 = (C0726x0) childAt3.getLayoutParams();
                m1379f(canvas, zM1366a ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0726x0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0726x0).leftMargin) - this.f2475m);
            }
            i3++;
        }
        if (m1380j(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0726x0 c0726x02 = (C0726x0) childAt4.getLayoutParams();
                if (zM1366a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0726x02).leftMargin;
                    i2 = this.f2475m;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0726x02).rightMargin;
                }
            } else if (zM1366a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2475m;
                right = left - i2;
            }
            m1379f(canvas, right);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("i.y0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("i.y0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int measuredHeight;
        char c2;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        char c3 = 2;
        if (this.f2467e == 1) {
            int paddingLeft = getPaddingLeft();
            int i17 = i4 - i2;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.f2468f;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            int paddingTop = i19 != 16 ? i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f2469g : getPaddingTop() + (((i5 - i3) - this.f2469g) / 2);
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt == null || childAt.getVisibility() == i16) {
                    c2 = c3;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0726x0 c0726x0 = (C0726x0) childAt.getLayoutParams();
                    c2 = c3;
                    int i22 = ((LinearLayout.LayoutParams) c0726x0).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0726x0).leftMargin;
                        i14 = ((LinearLayout.LayoutParams) c0726x0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i15 = ((LinearLayout.LayoutParams) c0726x0).leftMargin + paddingLeft;
                        if (m1380j(i21)) {
                            paddingTop += this.f2476n;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) c0726x0).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0726x0).bottomMargin + i23;
                    } else {
                        i13 = paddingRight - measuredWidth;
                        i14 = ((LinearLayout.LayoutParams) c0726x0).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (m1380j(i21)) {
                    }
                    int i232 = paddingTop + ((LinearLayout.LayoutParams) c0726x0).topMargin;
                    childAt.layout(i15, i232, measuredWidth + i15, i232 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0726x0).bottomMargin + i232;
                }
                i21++;
                c3 = c2;
                i16 = 8;
            }
            return;
        }
        boolean zM1366a = AbstractC0718t1.m1366a(this);
        int paddingTop2 = getPaddingTop();
        int i24 = i5 - i3;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i25 = this.f2468f;
        int i26 = 8388615 & i25;
        int i27 = i25 & 112;
        boolean z3 = this.f2464b;
        int[] iArr = this.f2472j;
        int[] iArr2 = this.f2473k;
        WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i26, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f2469g : getPaddingLeft() + (((i4 - i2) - this.f2469g) / 2);
        if (zM1366a) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = 1;
            i7 = 0;
        }
        int i28 = 0;
        while (i28 < virtualChildCount2) {
            int i29 = (i6 * i28) + i7;
            View childAt2 = getChildAt(i29);
            if (childAt2 == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0726x0 c0726x02 = (C0726x0) childAt2.getLayoutParams();
                    int i30 = paddingLeft2;
                    if (z3) {
                        i9 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) c0726x02).height != -1 ? childAt2.getBaseline() : -1;
                        i10 = ((LinearLayout.LayoutParams) c0726x02).gravity;
                        if (i10 < 0) {
                            i10 = i27;
                        }
                        i11 = i10 & 112;
                        if (i11 == 16) {
                            if (i11 == 48) {
                                i12 = i9 + ((LinearLayout.LayoutParams) c0726x02).topMargin;
                                if (baseline != -1) {
                                    i12 = (iArr[1] - baseline) + i12;
                                }
                            } else if (i11 != 80) {
                                i12 = i9;
                            } else {
                                i12 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0726x02).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i31 = (m1380j(i29) ? i30 + this.f2475m : i30) + ((LinearLayout.LayoutParams) c0726x02).leftMargin;
                            childAt2.layout(i31, i12, i31 + measuredWidth2, i12 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0726x02).rightMargin + i31;
                            i28++;
                            i7 = i8;
                            paddingTop2 = i9;
                        } else {
                            i12 = ((paddingBottom2 - measuredHeight3) / 2) + i9 + ((LinearLayout.LayoutParams) c0726x02).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c0726x02).bottomMargin;
                        }
                        i12 -= measuredHeight;
                        int i312 = (m1380j(i29) ? i30 + this.f2475m : i30) + ((LinearLayout.LayoutParams) c0726x02).leftMargin;
                        childAt2.layout(i312, i12, i312 + measuredWidth2, i12 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0726x02).rightMargin + i312;
                        i28++;
                        i7 = i8;
                        paddingTop2 = i9;
                    } else {
                        i9 = paddingTop2;
                    }
                    i10 = ((LinearLayout.LayoutParams) c0726x02).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= measuredHeight;
                    int i3122 = (m1380j(i29) ? i30 + this.f2475m : i30) + ((LinearLayout.LayoutParams) c0726x02).leftMargin;
                    childAt2.layout(i3122, i12, i3122 + measuredWidth2, i12 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0726x02).rightMargin + i3122;
                    i28++;
                    i7 = i8;
                    paddingTop2 = i9;
                }
            }
            i9 = paddingTop2;
            i28++;
            i7 = i8;
            paddingTop2 = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int iMax;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        C0726x0 c0726x0;
        int i13;
        int[] iArr2;
        int i14;
        View view;
        int i15;
        boolean z4;
        boolean z5;
        int iMax2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z6;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z7;
        AbstractC0728y0 abstractC0728y0 = this;
        int i27 = -2;
        int i28 = 1073741824;
        int i29 = 8;
        int iMax3 = 0;
        if (abstractC0728y0.f2467e == 1) {
            abstractC0728y0.f2469g = 0;
            int virtualChildCount = abstractC0728y0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i30 = abstractC0728y0.f2465c;
            boolean z8 = abstractC0728y0.f2471i;
            int i31 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z9 = false;
            int i32 = 0;
            boolean z10 = false;
            boolean z11 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i31 < virtualChildCount) {
                int i33 = mode;
                View childAt = abstractC0728y0.getChildAt(i31);
                if (childAt == null) {
                    abstractC0728y0.f2469g = abstractC0728y0.f2469g;
                } else {
                    if (childAt.getVisibility() != i29) {
                        if (abstractC0728y0.m1380j(i31)) {
                            abstractC0728y0.f2469g += abstractC0728y0.f2476n;
                        }
                        C0726x0 c0726x02 = (C0726x0) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) c0726x02).weight;
                        f += f2;
                        if (mode2 == i28 && ((LinearLayout.LayoutParams) c0726x02).height == 0 && f2 > 0.0f) {
                            int i34 = abstractC0728y0.f2469g;
                            abstractC0728y0.f2469g = Math.max(i34, ((LinearLayout.LayoutParams) c0726x02).topMargin + i34 + ((LinearLayout.LayoutParams) c0726x02).bottomMargin);
                            view2 = childAt;
                            i23 = mode2;
                            i24 = i30;
                            z6 = z8;
                            i25 = i31;
                            z9 = true;
                            i26 = i33;
                        } else {
                            if (((LinearLayout.LayoutParams) c0726x02).height != 0 || f2 <= 0.0f) {
                                i20 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c0726x02).height = i27;
                                i20 = 0;
                            }
                            if (f == 0.0f) {
                                i21 = i31;
                                i22 = abstractC0728y0.f2469g;
                            } else {
                                i21 = i31;
                                i22 = 0;
                            }
                            i23 = mode2;
                            z6 = z8;
                            i24 = i30;
                            i25 = i21;
                            i26 = i33;
                            abstractC0728y0.measureChildWithMargins(childAt, i2, 0, i3, i22);
                            if (i20 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c0726x02).height = i20;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i35 = abstractC0728y0.f2469g;
                            view2 = childAt;
                            abstractC0728y0.f2469g = Math.max(i35, i35 + measuredHeight + ((LinearLayout.LayoutParams) c0726x02).topMargin + ((LinearLayout.LayoutParams) c0726x02).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i24 >= 0 && i24 == i25 + 1) {
                            abstractC0728y0.f2466d = abstractC0728y0.f2469g;
                        }
                        if (i25 < i24 && ((LinearLayout.LayoutParams) c0726x02).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i26 == 1073741824 || ((LinearLayout.LayoutParams) c0726x02).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i36 = ((LinearLayout.LayoutParams) c0726x02).leftMargin + ((LinearLayout.LayoutParams) c0726x02).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i36;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i32, measuredState);
                        if (z11) {
                            i32 = iCombineMeasuredStates;
                            boolean z13 = ((LinearLayout.LayoutParams) c0726x02).width == -1;
                            if (((LinearLayout.LayoutParams) c0726x02).weight <= 0.0f) {
                                if (!z12) {
                                    i36 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i36);
                            } else {
                                if (!z12) {
                                    i36 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i36);
                            }
                            z11 = z13;
                            iMax3 = iMax7;
                        } else {
                            i32 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c0726x02).weight <= 0.0f) {
                        }
                        z11 = z13;
                        iMax3 = iMax7;
                    }
                    i31 = i25 + 1;
                    i30 = i24;
                    mode = i26;
                    z8 = z6;
                    mode2 = i23;
                    i27 = -2;
                    i28 = 1073741824;
                    i29 = 8;
                }
                i23 = mode2;
                i24 = i30;
                z6 = z8;
                i25 = i31;
                i26 = i33;
                i31 = i25 + 1;
                i30 = i24;
                mode = i26;
                z8 = z6;
                mode2 = i23;
                i27 = -2;
                i28 = 1073741824;
                i29 = 8;
            }
            int i37 = mode;
            int i38 = mode2;
            boolean z14 = z8;
            int i39 = i32;
            int i40 = i3;
            if (abstractC0728y0.f2469g > 0 && abstractC0728y0.m1380j(virtualChildCount)) {
                abstractC0728y0.f2469g += abstractC0728y0.f2476n;
            }
            if (z14 && (i38 == Integer.MIN_VALUE || i38 == 0)) {
                abstractC0728y0.f2469g = 0;
                for (int i41 = 0; i41 < virtualChildCount; i41++) {
                    View childAt2 = abstractC0728y0.getChildAt(i41);
                    if (childAt2 == null) {
                        abstractC0728y0.f2469g = abstractC0728y0.f2469g;
                    } else if (childAt2.getVisibility() != 8) {
                        C0726x0 c0726x03 = (C0726x0) childAt2.getLayoutParams();
                        int i42 = abstractC0728y0.f2469g;
                        abstractC0728y0.f2469g = Math.max(i42, i42 + iMax6 + ((LinearLayout.LayoutParams) c0726x03).topMargin + ((LinearLayout.LayoutParams) c0726x03).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC0728y0.getPaddingBottom() + abstractC0728y0.getPaddingTop() + abstractC0728y0.f2469g;
            abstractC0728y0.f2469g = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC0728y0.getSuggestedMinimumHeight()), i40, 0);
            int i43 = (iResolveSizeAndState & 16777215) - abstractC0728y0.f2469g;
            if (z9 || (i43 != 0 && f > 0.0f)) {
                float f3 = abstractC0728y0.f2470h;
                if (f3 > 0.0f) {
                    f = f3;
                }
                abstractC0728y0.f2469g = 0;
                int iCombineMeasuredStates2 = i39;
                int i44 = 0;
                while (i44 < virtualChildCount) {
                    View childAt3 = abstractC0728y0.getChildAt(i44);
                    if (childAt3.getVisibility() == 8) {
                        i17 = i44;
                    } else {
                        C0726x0 c0726x04 = (C0726x0) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) c0726x04).weight;
                        if (f4 > 0.0f) {
                            int i45 = (int) ((i43 * f4) / f);
                            f -= f4;
                            i43 -= i45;
                            i17 = i44;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, abstractC0728y0.getPaddingRight() + abstractC0728y0.getPaddingLeft() + ((LinearLayout.LayoutParams) c0726x04).leftMargin + ((LinearLayout.LayoutParams) c0726x04).rightMargin, ((LinearLayout.LayoutParams) c0726x04).width);
                            if (((LinearLayout.LayoutParams) c0726x04).height == 0) {
                                i19 = 1073741824;
                                if (i38 == 1073741824) {
                                    if (i45 <= 0) {
                                        i45 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i45, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i45;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i19));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        } else {
                            i17 = i44;
                        }
                        int i46 = ((LinearLayout.LayoutParams) c0726x04).leftMargin + ((LinearLayout.LayoutParams) c0726x04).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i46;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i37 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) c0726x04).width == -1) {
                                measuredWidth2 = i46;
                            }
                        } else {
                            i18 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((LinearLayout.LayoutParams) c0726x04).width == i18;
                        int i47 = abstractC0728y0.f2469g;
                        abstractC0728y0.f2469g = Math.max(i47, childAt3.getMeasuredHeight() + i47 + ((LinearLayout.LayoutParams) c0726x04).topMargin + ((LinearLayout.LayoutParams) c0726x04).bottomMargin);
                        z11 = z15;
                    }
                    i44 = i17 + 1;
                }
                abstractC0728y0.f2469g = abstractC0728y0.getPaddingBottom() + abstractC0728y0.getPaddingTop() + abstractC0728y0.f2469g;
                i39 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i38 != 1073741824) {
                    for (int i48 = 0; i48 < virtualChildCount; i48++) {
                        View childAt4 = abstractC0728y0.getChildAt(i48);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0726x0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i37 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC0728y0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC0728y0.getPaddingRight() + abstractC0728y0.getPaddingLeft() + iMax4, abstractC0728y0.getSuggestedMinimumWidth()), i2, i39), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC0728y0.getMeasuredWidth(), 1073741824);
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt5 = abstractC0728y0.getChildAt(i49);
                    if (childAt5.getVisibility() != 8) {
                        C0726x0 c0726x05 = (C0726x0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0726x05).width == -1) {
                            int i50 = ((LinearLayout.LayoutParams) c0726x05).height;
                            ((LinearLayout.LayoutParams) c0726x05).height = childAt5.getMeasuredHeight();
                            abstractC0728y0.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i40, 0);
                            ((LinearLayout.LayoutParams) c0726x05).height = i50;
                        }
                    }
                    i49++;
                    i40 = i3;
                }
                return;
            }
            return;
        }
        int i51 = i2;
        abstractC0728y0.f2469g = 0;
        int virtualChildCount2 = abstractC0728y0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i51);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (abstractC0728y0.f2472j == null || abstractC0728y0.f2473k == null) {
            abstractC0728y0.f2472j = new int[4];
            abstractC0728y0.f2473k = new int[4];
        }
        int[] iArr3 = abstractC0728y0.f2472j;
        int[] iArr4 = abstractC0728y0.f2473k;
        iArr3[3] = -1;
        char c2 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = abstractC0728y0.f2464b;
        boolean z17 = abstractC0728y0.f2471i;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i52 < virtualChildCount2) {
            char c3 = c2;
            View childAt6 = abstractC0728y0.getChildAt(i52);
            if (childAt6 == null) {
                abstractC0728y0.f2469g = abstractC0728y0.f2469g;
                i12 = i52;
                i16 = i54;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z16;
                z3 = z17;
            } else {
                int i55 = i53;
                if (childAt6.getVisibility() == 8) {
                    i51 = i2;
                    i12 = i52;
                    i16 = i54;
                    iArr = iArr4;
                    z2 = z16;
                    z3 = z17;
                    i53 = i55;
                    iArr2 = iArr3;
                } else {
                    if (abstractC0728y0.m1380j(i52)) {
                        abstractC0728y0.f2469g += abstractC0728y0.f2475m;
                    }
                    C0726x0 c0726x06 = (C0726x0) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c0726x06).weight;
                    f5 += f6;
                    int i56 = i52;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0726x06).width == 0 && f6 > 0.0f) {
                        if (z18) {
                            abstractC0728y0.f2469g = ((LinearLayout.LayoutParams) c0726x06).leftMargin + ((LinearLayout.LayoutParams) c0726x06).rightMargin + abstractC0728y0.f2469g;
                        } else {
                            int i57 = abstractC0728y0.f2469g;
                            abstractC0728y0.f2469g = Math.max(i57, ((LinearLayout.LayoutParams) c0726x06).leftMargin + i57 + ((LinearLayout.LayoutParams) c0726x06).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i13 = i55;
                            i12 = i56;
                            c0726x0 = c0726x06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i51 = i2;
                            i14 = i54;
                            i11 = iMax8;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i13 = i55;
                            i12 = i56;
                            i15 = 1073741824;
                            c0726x0 = c0726x06;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i51 = i2;
                            i14 = i54;
                            i11 = iMax8;
                            if (mode4 == i15 && ((LinearLayout.LayoutParams) c0726x0).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i58 = ((LinearLayout.LayoutParams) c0726x0).topMargin + ((LinearLayout.LayoutParams) c0726x0).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i58;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i59 = ((LinearLayout.LayoutParams) c0726x0).gravity;
                                    if (i59 < 0) {
                                        i59 = abstractC0728y0.f2468f;
                                    }
                                    int i60 = (((i59 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i60] = Math.max(iArr2[i60], baseline2);
                                    iArr[i60] = Math.max(iArr[i60], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax10 = Math.max(i13, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) c0726x0).height == -1;
                            if (((LinearLayout.LayoutParams) c0726x0).weight <= 0.0f) {
                                if (!z5) {
                                    i58 = measuredHeight3;
                                }
                                iMax8 = Math.max(i11, i58);
                                iMax2 = i14;
                            } else {
                                if (!z5) {
                                    i58 = measuredHeight3;
                                }
                                iMax2 = Math.max(i14, i58);
                                iMax8 = i11;
                            }
                            int i61 = iMax2;
                            i53 = iMax10;
                            i16 = i61;
                            z19 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c0726x06).width != 0 || f6 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0726x06).width = -2;
                            i10 = 0;
                        }
                        iArr = iArr4;
                        i11 = iMax8;
                        i12 = i56;
                        z2 = z16;
                        z3 = z17;
                        int i62 = i10;
                        c0726x0 = c0726x06;
                        i13 = i55;
                        i51 = i2;
                        iArr2 = iArr3;
                        i14 = i54;
                        abstractC0728y0.measureChildWithMargins(childAt6, i51, f5 == 0.0f ? abstractC0728y0.f2469g : 0, i3, 0);
                        if (i62 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0726x0).width = i62;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z18) {
                            view = childAt6;
                            abstractC0728y0.f2469g = ((LinearLayout.LayoutParams) c0726x0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0726x0).rightMargin + abstractC0728y0.f2469g;
                        } else {
                            view = childAt6;
                            int i63 = abstractC0728y0.f2469g;
                            abstractC0728y0.f2469g = Math.max(i63, i63 + measuredWidth3 + ((LinearLayout.LayoutParams) c0726x0).leftMargin + ((LinearLayout.LayoutParams) c0726x0).rightMargin);
                        }
                        if (z3) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i15 = 1073741824;
                    if (mode4 == i15) {
                        z4 = false;
                        int i582 = ((LinearLayout.LayoutParams) c0726x0).topMargin + ((LinearLayout.LayoutParams) c0726x0).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i582;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z2) {
                        }
                        int iMax102 = Math.max(i13, measuredHeight32);
                        if (z19) {
                            if (((LinearLayout.LayoutParams) c0726x0).weight <= 0.0f) {
                            }
                            int i612 = iMax2;
                            i53 = iMax102;
                            i16 = i612;
                            z19 = z22;
                        }
                    }
                }
            }
            i54 = i16;
            i52 = i12 + 1;
            c2 = c3;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c4 = c2;
        boolean z23 = z16;
        boolean z24 = z17;
        int i64 = i53;
        int i65 = i54;
        int i66 = iMax8;
        if (abstractC0728y0.f2469g > 0 && abstractC0728y0.m1380j(virtualChildCount2)) {
            abstractC0728y0.f2469g += abstractC0728y0.f2475m;
        }
        int i67 = iArr5[1];
        int iMax11 = (i67 == -1 && iArr5[0] == -1 && iArr5[c4] == -1 && iArr5[3] == -1) ? i64 : Math.max(i64, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c4]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i67, iArr5[c4]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC0728y0.f2469g = 0;
            for (int i68 = 0; i68 < virtualChildCount2; i68++) {
                View childAt7 = abstractC0728y0.getChildAt(i68);
                if (childAt7 == null) {
                    abstractC0728y0.f2469g = abstractC0728y0.f2469g;
                } else if (childAt7.getVisibility() != 8) {
                    C0726x0 c0726x07 = (C0726x0) childAt7.getLayoutParams();
                    if (z18) {
                        abstractC0728y0.f2469g = ((LinearLayout.LayoutParams) c0726x07).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0726x07).rightMargin + abstractC0728y0.f2469g;
                    } else {
                        int i69 = abstractC0728y0.f2469g;
                        abstractC0728y0.f2469g = Math.max(i69, i69 + iMax9 + ((LinearLayout.LayoutParams) c0726x07).leftMargin + ((LinearLayout.LayoutParams) c0726x07).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC0728y0.getPaddingRight() + abstractC0728y0.getPaddingLeft() + abstractC0728y0.f2469g;
        abstractC0728y0.f2469g = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC0728y0.getSuggestedMinimumWidth()), i51, 0);
        int i70 = (iResolveSizeAndState2 & 16777215) - abstractC0728y0.f2469g;
        if (z21 || (i70 != 0 && f5 > 0.0f)) {
            float f7 = abstractC0728y0.f2470h;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c4] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c4] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC0728y0.f2469g = 0;
            iMax11 = -1;
            int i71 = 0;
            while (i71 < virtualChildCount2) {
                View childAt8 = abstractC0728y0.getChildAt(i71);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = iResolveSizeAndState2;
                } else {
                    C0726x0 c0726x08 = (C0726x0) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c0726x08).weight;
                    if (f8 > 0.0f) {
                        int i72 = (int) ((i70 * f8) / f5);
                        f5 -= f8;
                        i70 -= i72;
                        i7 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, abstractC0728y0.getPaddingBottom() + abstractC0728y0.getPaddingTop() + ((LinearLayout.LayoutParams) c0726x08).topMargin + ((LinearLayout.LayoutParams) c0726x08).bottomMargin, ((LinearLayout.LayoutParams) c0726x08).height);
                        if (((LinearLayout.LayoutParams) c0726x08).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i72 <= 0) {
                                    i72 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i72, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i72;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i7 = iResolveSizeAndState2;
                    }
                    if (z18) {
                        abstractC0728y0.f2469g = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0726x08).leftMargin + ((LinearLayout.LayoutParams) c0726x08).rightMargin + abstractC0728y0.f2469g;
                    } else {
                        int i73 = abstractC0728y0.f2469g;
                        abstractC0728y0.f2469g = Math.max(i73, childAt8.getMeasuredWidth() + i73 + ((LinearLayout.LayoutParams) c0726x08).leftMargin + ((LinearLayout.LayoutParams) c0726x08).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0726x08).height == -1;
                    int i74 = ((LinearLayout.LayoutParams) c0726x08).topMargin + ((LinearLayout.LayoutParams) c0726x08).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i74;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z25) {
                        i74 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i65, i74);
                    if (z19) {
                        i8 = -1;
                        boolean z26 = ((LinearLayout.LayoutParams) c0726x08).height == -1;
                        if (!z23 && (baseline = childAt8.getBaseline()) != i8) {
                            int i75 = ((LinearLayout.LayoutParams) c0726x08).gravity;
                            if (i75 < 0) {
                                i75 = abstractC0728y0.f2468f;
                            }
                            int i76 = (((i75 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i76] = Math.max(iArr5[i76], baseline);
                            iArr6[i76] = Math.max(iArr6[i76], measuredHeight4 - baseline);
                        }
                        z19 = z26;
                        i65 = iMax12;
                    } else {
                        i8 = -1;
                    }
                    if (!z23) {
                        z19 = z26;
                        i65 = iMax12;
                    }
                }
                i71++;
                iResolveSizeAndState2 = i7;
            }
            i4 = iResolveSizeAndState2;
            i5 = -16777216;
            abstractC0728y0.f2469g = abstractC0728y0.getPaddingRight() + abstractC0728y0.getPaddingLeft() + abstractC0728y0.f2469g;
            int i77 = iArr5[1];
            if (i77 == -1 && iArr5[0] == -1 && iArr5[c4] == -1 && iArr5[3] == -1) {
                i6 = 0;
            } else {
                i6 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c4]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i77, iArr5[c4]))));
            }
            iMax = i65;
        } else {
            iMax = Math.max(i65, i66);
            if (z24 && mode3 != 1073741824) {
                for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                    View childAt9 = abstractC0728y0.getChildAt(i78);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0726x0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = iResolveSizeAndState2;
            i5 = -16777216;
            i6 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        abstractC0728y0.setMeasuredDimension(i4 | (iCombineMeasuredStates3 & i5), View.resolveSizeAndState(Math.max(abstractC0728y0.getPaddingBottom() + abstractC0728y0.getPaddingTop() + iMax11, abstractC0728y0.getSuggestedMinimumHeight()), i3, iCombineMeasuredStates3 << 16));
        if (z20) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC0728y0.getMeasuredHeight(), 1073741824);
            int i79 = i6;
            while (i79 < virtualChildCount2) {
                View childAt10 = abstractC0728y0.getChildAt(i79);
                if (childAt10.getVisibility() != 8) {
                    C0726x0 c0726x09 = (C0726x0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0726x09).height == -1) {
                        int i80 = ((LinearLayout.LayoutParams) c0726x09).width;
                        ((LinearLayout.LayoutParams) c0726x09).width = childAt10.getMeasuredWidth();
                        abstractC0728y0.measureChildWithMargins(childAt10, i51, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c0726x09).width = i80;
                    }
                }
                i79++;
                abstractC0728y0 = this;
                i51 = i2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBaselineAligned(boolean z2) {
        this.f2464b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2465c = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2474l) {
            return;
        }
        this.f2474l = drawable;
        if (drawable != null) {
            this.f2475m = drawable.getIntrinsicWidth();
            this.f2476n = drawable.getIntrinsicHeight();
        } else {
            this.f2475m = 0;
            this.f2476n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDividerPadding(int i2) {
        this.f2478p = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setGravity(int i2) {
        if (this.f2468f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2468f = i2;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2468f;
        if ((8388615 & i4) != i3) {
            this.f2468f = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2471i = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOrientation(int i2) {
        if (this.f2467e != i2) {
            this.f2467e = i2;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowDividers(int i2) {
        if (i2 != this.f2477o) {
            requestLayout();
        }
        this.f2477o = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2468f;
        if ((i4 & 112) != i3) {
            this.f2468f = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setWeightSum(float f) {
        this.f2470h = Math.max(0.0f, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
