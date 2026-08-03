package p057g;

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
import p006D.AbstractC0080Q;
import p018J0.C0234d;
import p048b.AbstractC0550a;

/* JADX INFO: renamed from: g.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0903g0 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f3186a;

    /* JADX INFO: renamed from: b */
    public int f3187b;

    /* JADX INFO: renamed from: c */
    public int f3188c;

    /* JADX INFO: renamed from: d */
    public int f3189d;

    /* JADX INFO: renamed from: e */
    public int f3190e;

    /* JADX INFO: renamed from: f */
    public int f3191f;

    /* JADX INFO: renamed from: g */
    public float f3192g;

    /* JADX INFO: renamed from: h */
    public boolean f3193h;

    /* JADX INFO: renamed from: i */
    public int[] f3194i;

    /* JADX INFO: renamed from: j */
    public int[] f3195j;

    /* JADX INFO: renamed from: k */
    public Drawable f3196k;

    /* JADX INFO: renamed from: l */
    public int f3197l;

    /* JADX INFO: renamed from: m */
    public int f3198m;

    /* JADX INFO: renamed from: n */
    public int f3199n;

    /* JADX INFO: renamed from: o */
    public int f3200o;

    public AbstractC0903g0(Context r11, AttributeSet r12) {
        super(r11, r12, 0);
        this.f3186a = true;
        this.f3187b = -1;
        this.f3188c = 0;
        this.f3190e = 8388659;
        int[] r2 = AbstractC0550a.f1626k;
        C0234d r9 = C0234d.m638s(r11, r12, r2, 0, 0);
        AbstractC0080Q.m290i(this, r11, r2, r12, (TypedArray) r9.f475c, 0);
        TypedArray r112 = (TypedArray) r9.f475c;
        int r122 = r112.getInt(1, -1);
        if (r122 < 0) goto L5;
        setOrientation(r122);
    L5:
        int r123 = r112.getInt(0, -1);
        if (r123 < 0) goto L8;
        setGravity(r123);
    L8:
        boolean r124 = r112.getBoolean(2, true);
        if (r124 == true) goto L11;
        setBaselineAligned(r124);
    L11:
        this.f3192g = r112.getFloat(4, -1.0f);
        this.f3187b = r112.getInt(3, -1);
        this.f3193h = r112.getBoolean(7, false);
        setDividerDrawable(r9.m646i(5));
        this.f3199n = r112.getInt(8, 0);
        this.f3200o = r112.getDimensionPixelSize(6, 0);
        r9.m657u();
    }

    /* JADX INFO: renamed from: b */
    public final void m2231b(Canvas r5, int r6) {
        this.f3196k.setBounds(getPaddingLeft() + this.f3200o, r6, (getWidth() - getPaddingRight()) - this.f3200o, this.f3198m + r6);
        this.f3196k.draw(r5);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C0901f0;
    }

    /* JADX INFO: renamed from: d */
    public final void m2232d(Canvas r6, int r7) {
        this.f3196k.setBounds(r7, getPaddingTop() + this.f3200o, this.f3197l + r7, (getHeight() - getPaddingBottom()) - this.f3200o);
        this.f3196k.draw(r6);
    }

    /* JADX INFO: renamed from: e */
    public C0901f0 mo1126e() {
        int r02 = this.f3189d;
        if (r02 != 0) goto L7;
        return new C0901f0(-2, -2);
    L7:
        if (r02 == 1) goto L9;
        return null;
    L9:
        return new C0901f0(-1, -2);
    }

    /* JADX INFO: renamed from: f */
    public C0901f0 mo1127f(AttributeSet r3) {
        return new C0901f0(getContext(), r3);
    }

    /* JADX INFO: renamed from: g */
    public C0901f0 mo1128g(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C0901f0) == false) goto L7;
        return new C0901f0((C0901f0) r2);
    L7:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new C0901f0((ViewGroup.MarginLayoutParams) r2);
    L11:
        return new C0901f0(r2);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return mo1126e();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet r1) {
        return mo1127f(r1);
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.f3187b < 0) goto L5;
        int r02 = getChildCount();
        int r1 = this.f3187b;
        if (r02 <= r1) goto L29;
        View r03 = getChildAt(r1);
        int r12 = r03.getBaseline();
        if (r12 == (-1)) goto L11;
        int r2 = this.f3188c;
        if (this.f3189d != 1) goto L27;
        int r3 = this.f3190e & 112;
        if (r3 == 48) goto L27;
        if (r3 != 16) goto L22;
        r2 = r2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3191f) / 2);
        goto L27
    L22:
        if (r3 != 80) goto L27;
        r2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3191f;
    L27:
        return (r2 + ((LinearLayout.LayoutParams) ((C0901f0) r03.getLayoutParams())).topMargin) + r12;
    L11:
        if (this.f3187b != 0) goto L14;
        return -1;
    L14:
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    L29:
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    L5:
        return super.getBaseline();
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3187b;
    }

    public Drawable getDividerDrawable() {
        return this.f3196k;
    }

    public int getDividerPadding() {
        return this.f3200o;
    }

    public int getDividerWidth() {
        return this.f3197l;
    }

    public int getGravity() {
        return this.f3190e;
    }

    public int getOrientation() {
        return this.f3189d;
    }

    public int getShowDividers() {
        return this.f3199n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3192g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2233h(int r5) {
        if (r5 != 0) goto L9;
        if ((this.f3199n & 1) != 0) goto L7;
        return false;
    L7:
        return true;
    L9:
        if (r5 != getChildCount()) goto L15;
        if ((this.f3199n & 4) != 0) goto L13;
        return false;
    L13:
        return true;
    L15:
        if ((this.f3199n & 2) == 0) goto L22;
        int r52 = r5 - 1;
    L17:
        if (r52 < 0) goto L28;
        if (getChildAt(r52).getVisibility() != 8) goto L27;
        r52 = r52 - 1;
        goto L17
    L27:
        return true;
    L28:
        return false;
    L22:
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r8) {
        if (this.f3196k != null) goto L5;
        return;
    L5:
        int r3 = 0;
        if (this.f3189d != 1) goto L24;
        int r1 = getVirtualChildCount();
    L8:
        if (r3 >= r1) goto L18;
        View r4 = getChildAt(r3);
        if (r4 == null) goto L16;
        if (r4.getVisibility() == 8) goto L16;
        if (m2233h(r3) == false) goto L16;
        m2231b(r8, (r4.getTop() - ((LinearLayout.LayoutParams) ((C0901f0) r4.getLayoutParams())).topMargin) - this.f3198m);
    L16:
        r3 = r3 + 1;
        goto L8
    L18:
        if (m2233h(r1) == false) goto L66;
        View r02 = getChildAt(r1 - 1);
        if (r02 != null) goto L22;
        int r03 = (getHeight() - getPaddingBottom()) - this.f3198m;
    L23:
        m2231b(r8, r03);
        return;
    L22:
        r03 = r02.getBottom() + ((LinearLayout.LayoutParams) ((C0901f0) r02.getLayoutParams())).bottomMargin;
        goto L23
    L66:
        return;
    L24:
        int r12 = getVirtualChildCount();
        boolean r42 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L27;
        boolean r43 = true;
    L28:
        if (r3 >= r12) goto L42;
        View r5 = getChildAt(r3);
        if (r5 == null) goto L40;
        if (r5.getVisibility() == 8) goto L40;
        if (m2233h(r3) == false) goto L40;
        C0901f0 r6 = (C0901f0) r5.getLayoutParams();
        if (r43 == false) goto L38;
        int r52 = r5.getRight() + ((LinearLayout.LayoutParams) r6).rightMargin;
    L39:
        m2232d(r8, r52);
        goto L40
    L38:
        r52 = (r5.getLeft() - ((LinearLayout.LayoutParams) r6).leftMargin) - this.f3197l;
    L40:
        r3 = r3 + 1;
        goto L28
    L42:
        if (m2233h(r12) == false) goto L68;
        View r04 = getChildAt(r12 - 1);
        if (r04 != null) goto L49;
        if (r43 == false) goto L47;
        int r05 = getPaddingLeft();
    L53:
        m2232d(r8, r05);
        return;
    L47:
        int r06 = getWidth() - getPaddingRight();
        int r13 = this.f3197l;
    L48:
        r05 = r06 - r13;
        goto L53
    L49:
        C0901f0 r14 = (C0901f0) r04.getLayoutParams();
        if (r43 == false) goto L52;
        r06 = r04.getLeft() - ((LinearLayout.LayoutParams) r14).leftMargin;
        r13 = this.f3197l;
        goto L48
    L52:
        r05 = r04.getRight() + ((LinearLayout.LayoutParams) r14).rightMargin;
        goto L53
    L68:
        return;
    L27:
        r43 = false;
        goto L28
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        r2.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        int r3 = 8;
        if (this.f3189d != 1) goto L32;
        int r1 = getPaddingLeft();
        int r10 = r26 - r24;
        int r11 = r10 - getPaddingRight();
        int r102 = (r10 - r1) - getPaddingRight();
        int r12 = getVirtualChildCount();
        int r13 = this.f3190e;
        int r14 = r13 & 112;
        int r8 = 8388615 & r13;
        if (r14 == 16) goto L9;
        if (r14 == 80) goto L8;
        int r5 = getPaddingTop();
    L10:
        int r4 = 0;
    L11:
        if (r4 >= r12) goto L83;
        View r7 = getChildAt(r4);
        if (r7 == null) goto L31;
        if (r7.getVisibility() == r3) goto L31;
        int r132 = r7.getMeasuredWidth();
        int r142 = r7.getMeasuredHeight();
        C0901f0 r15 = (C0901f0) r7.getLayoutParams();
        int r32 = ((LinearLayout.LayoutParams) r15).gravity;
        if (r32 >= 0) goto L20;
        r32 = r8;
    L20:
        int r33 = Gravity.getAbsoluteGravity(r32, getLayoutDirection()) & 7;
        if (r33 == 1) goto L26;
        if (r33 == 5) goto L24;
        int r34 = ((LinearLayout.LayoutParams) r15).leftMargin + r1;
    L28:
        if (m2233h(r4) == false) goto L30;
        r5 = r5 + this.f3198m;
    L30:
        int r52 = r5 + ((LinearLayout.LayoutParams) r15).topMargin;
        r7.layout(r34, r52, r132 + r34, r52 + r142);
        r5 = (r142 + ((LinearLayout.LayoutParams) r15).bottomMargin) + r52;
        goto L31
    L24:
        int r35 = r11 - r132;
        int r6 = ((LinearLayout.LayoutParams) r15).rightMargin;
    L25:
        r34 = r35 - r6;
        goto L28
    L26:
        r35 = (((r102 - r132) / 2) + r1) + ((LinearLayout.LayoutParams) r15).leftMargin;
        r6 = ((LinearLayout.LayoutParams) r15).rightMargin;
    L31:
        r4 = r4 + 1;
        r3 = 8;
        goto L11
    L83:
        return;
    L8:
        r5 = ((getPaddingTop() + r27) - r25) - this.f3191f;
        goto L10
    L9:
        r5 = getPaddingTop() + (((r27 - r25) - this.f3191f) / 2);
        goto L10
    L32:
        boolean r16 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L35;
        boolean r17 = true;
    L36:
        int r36 = getPaddingTop();
        int r62 = r27 - r25;
        int r103 = r62 - getPaddingBottom();
        int r63 = (r62 - r36) - getPaddingBottom();
        int r112 = getVirtualChildCount();
        int r122 = this.f3190e;
        int r82 = 8388615 & r122;
        int r123 = r122 & 112;
        boolean r133 = this.f3186a;
        int[] r143 = this.f3194i;
        int[] r152 = this.f3195j;
        int r42 = Gravity.getAbsoluteGravity(r82, getLayoutDirection());
        if (r42 == 1) goto L41;
        if (r42 == 5) goto L40;
        int r2 = getPaddingLeft();
    L42:
        if (r17 == false) goto L44;
        int r18 = r112 - 1;
        int r83 = -1;
    L45:
        int r9 = 0;
    L46:
        if (r9 >= r112) goto L91;
        int r53 = (r83 * r9) + r18;
        View r72 = getChildAt(r53);
        if (r72 != null) goto L50;
        int r252 = r18;
        int r262 = r83;
        int r272 = r112;
        int r19 = r123;
        int r110 = 1;
    L82:
        r9 = r9 + r110;
        r18 = r252;
        r83 = r262;
        r112 = r272;
        r123 = r19;
        goto L46
    L50:
        r252 = r18;
        if (r72.getVisibility() == 8) goto L81;
        int r43 = r72.getMeasuredWidth();
        int r182 = r72.getMeasuredHeight();
        C0901f0 r111 = (C0901f0) r72.getLayoutParams();
        r262 = r83;
        if (r133 == false) goto L57;
        r272 = r112;
        if (((LinearLayout.LayoutParams) r111).height == (-1)) goto L58;
        int r113 = r72.getBaseline();
    L59:
        int r84 = ((LinearLayout.LayoutParams) r111).gravity;
        if (r84 >= 0) goto L62;
        r84 = r123;
    L62:
        int r85 = r84 & 112;
        r19 = r123;
        if (r85 != 16) goto L65;
        int r86 = ((((r63 - r182) / 2) + r36) + ((LinearLayout.LayoutParams) r111).topMargin) - ((LinearLayout.LayoutParams) r111).bottomMargin;
    L77:
        if (m2233h(r53) == false) goto L79;
        r2 = r2 + this.f3197l;
    L79:
        int r22 = r2 + ((LinearLayout.LayoutParams) r111).leftMargin;
        r72.layout(r22, r86, r22 + r43, r86 + r182);
        r2 = (r43 + ((LinearLayout.LayoutParams) r111).rightMargin) + r22;
    L80:
        r110 = 1;
        goto L82
    L65:
        if (r85 != 48) goto L67;
        r86 = ((LinearLayout.LayoutParams) r111).topMargin + r36;
        if (r113 == (-1)) goto L77;
        r86 = (r143[1] - r113) + r86;
        goto L77
    L67:
        if (r85 == 80) goto L69;
        r86 = r36;
        goto L77
    L69:
        r86 = (r103 - r182) - ((LinearLayout.LayoutParams) r111).bottomMargin;
        if (r113 == (-1)) goto L77;
        r86 = r86 - (r152[2] - (r72.getMeasuredHeight() - r113));
    L58:
        r113 = -1;
        goto L59
    L57:
        r272 = r112;
        goto L58
    L81:
        r262 = r83;
        r272 = r112;
        r19 = r123;
        goto L80
    L91:
        return;
    L44:
        r83 = 1;
        r18 = 0;
        goto L45
    L40:
        r2 = ((getPaddingLeft() + r26) - r24) - this.f3191f;
        goto L42
    L41:
        r2 = getPaddingLeft() + (((r26 - r24) - this.f3191f) / 2);
        goto L42
    L35:
        r17 = false;
        goto L36
    }

    @Override // android.view.View
    public void onMeasure(int r38, int r39) {
        int r10 = -2;
        int r11 = 1073741824;
        int r12 = 8;
        int r14 = Integer.MIN_VALUE;
        float r15 = 0.0f;
        boolean r4 = true;
        if (this.f3189d != 1) goto L172;
        this.f3191f = 0;
        int r3 = getVirtualChildCount();
        int r2 = View.MeasureSpec.getMode(r38);
        int r1 = View.MeasureSpec.getMode(r39);
        int r02 = this.f3187b;
        boolean r9 = this.f3193h;
        boolean r24 = true;
        int r13 = 0;
        int r18 = 0;
        int r19 = 0;
        boolean r20 = false;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        boolean r25 = false;
        float r17 = 0.0f;
    L5:
        if (r13 >= r3) goto L74;
        View r26 = getChildAt(r13);
        if (r26 != null) goto L11;
        this.f3191f = this.f3191f;
    L9:
        int r102 = r02;
        int r29 = r1;
        int r16 = r2;
        int r31 = r3;
        int r32 = r22;
        boolean r27 = true;
    L73:
        r13 = r13 + 1;
        r2 = r16;
        r22 = r32;
        r02 = r102;
        r4 = r27;
        r1 = r29;
        r3 = r31;
        r10 = -2;
        r11 = 1073741824;
        r12 = 8;
        r14 = Integer.MIN_VALUE;
        r15 = 0.0f;
        goto L5
    L11:
        if (r26.getVisibility() == r12) goto L9;
        if (m2233h(r13) == false) goto L16;
        this.f3191f += this.f3198m;
    L16:
        C0901f0 r5 = (C0901f0) r26.getLayoutParams();
        float r42 = ((LinearLayout.LayoutParams) r5).weight;
        r17 = r17 + r42;
        if (r1 != r11) goto L24;
        if (((LinearLayout.LayoutParams) r5).height != 0) goto L24;
        if (r42 <= r15) goto L24;
        int r43 = this.f3191f;
        this.f3191f = Math.max(r43, (((LinearLayout.LayoutParams) r5).topMargin + r43) + ((LinearLayout.LayoutParams) r5).bottomMargin);
        r102 = r02;
        r29 = r1;
        int r30 = r2;
        r31 = r3;
        C0901f0 r152 = r5;
        boolean r44 = true;
        r27 = true;
    L40:
        if (r102 >= 0) goto L42;
    L44:
        if (r13 < r102) goto L46;
    L47:
        r16 = r30;
        if (r16 != 1073741824) goto L52;
    L54:
        boolean r52 = false;
    L55:
        int r03 = ((LinearLayout.LayoutParams) r152).leftMargin + ((LinearLayout.LayoutParams) r152).rightMargin;
        int r28 = r26.getMeasuredWidth() + r03;
        r32 = Math.max(r22, r28);
        int r112 = View.combineMeasuredStates(r23, r26.getMeasuredState());
        if (r24 == true) goto L58;
    L60:
        boolean r122 = false;
    L62:
        if (((LinearLayout.LayoutParams) r152).weight <= 0.0f) goto L67;
        if (r52 == true) goto L66;
        r03 = r28;
    L66:
        r19 = Math.max(r19, r03);
    L72:
        r20 = r44;
        r23 = r112;
        r24 = r122;
        goto L73
    L67:
        int r142 = r19;
        if (r52 == true) goto L71;
        r03 = r28;
    L71:
        r18 = Math.max(r18, r03);
        r19 = r142;
        goto L72
    L58:
        if (((LinearLayout.LayoutParams) r152).width != (-1)) goto L60;
        r122 = r27;
        goto L62
    L52:
        if (((LinearLayout.LayoutParams) r152).width != (-1)) goto L54;
        r52 = r27;
        r25 = r52;
        goto L55
    L46:
        if (((LinearLayout.LayoutParams) r152).weight <= 0.0f) goto L47;
        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
    L42:
        if (r102 != (r13 + 1)) goto L44;
        this.f3188c = this.f3191f;
    L24:
        if (((LinearLayout.LayoutParams) r5).height == 0) goto L26;
    L28:
        int r113 = r14;
    L30:
        if (r17 != r15) goto L32;
        int r123 = this.f3191f;
    L33:
        r102 = r02;
        r29 = r1;
        r30 = r2;
        r31 = r3;
        r27 = true;
        r152 = r5;
        measureChildWithMargins(r26, r38, 0, r39, r123);
        if (r113 == r14) goto L36;
        ((LinearLayout.LayoutParams) r152).height = r113;
    L36:
        int r04 = r26.getMeasuredHeight();
        int r110 = this.f3191f;
        this.f3191f = Math.max(r110, ((r110 + r04) + ((LinearLayout.LayoutParams) r152).topMargin) + ((LinearLayout.LayoutParams) r152).bottomMargin);
        int r53 = r21;
        if (r9 == false) goto L39;
        r21 = Math.max(r04, r53);
    L39:
        r44 = r20;
        goto L40
    L32:
        r123 = 0;
        goto L33
    L26:
        if (r42 <= r15) goto L28;
        ((LinearLayout.LayoutParams) r5).height = r10;
        r113 = 0;
        goto L30
    L74:
        int r292 = r1;
        int r111 = r2;
        int r312 = r3;
        boolean r272 = r4;
        int r210 = r18;
        int r143 = r19;
        int r54 = r21;
        int r33 = r22;
        int r124 = r23;
        if (this.f3191f > 0) goto L77;
    L79:
        int r45 = r292;
        if (r9 == true) goto L82;
    L94:
        int r132 = (getPaddingBottom() + getPaddingTop()) + this.f3191f;
        this.f3191f = r132;
        int r05 = View.resolveSizeAndState(Math.max(r132, getSuggestedMinimumHeight()), r39, 0);
        int r114 = (16777215 & r05) - this.f3191f;
        if (r20 == true) goto L116;
        if (r114 != 0) goto L98;
    L100:
        r210 = Math.max(r210, r143);
        if (r9 == true) goto L103;
    L115:
        int r222 = r33;
        if (r24 == false) goto L159;
    L161:
        r210 = r222;
    L162:
        setMeasuredDimension(View.resolveSizeAndState(Math.max((getPaddingRight() + getPaddingLeft()) + r210, getSuggestedMinimumWidth()), r38, r124), r05);
        if (r25 == false) goto L400;
        int r7 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int r92 = 0;
    L165:
        if (r92 >= r312) goto L443;
        View r115 = getChildAt(r92);
        if (r115.getVisibility() == 8) goto L171;
        C0901f0 r116 = (C0901f0) r115.getLayoutParams();
        if (((LinearLayout.LayoutParams) r116).width != (-1)) goto L171;
        int r125 = ((LinearLayout.LayoutParams) r116).height;
        ((LinearLayout.LayoutParams) r116).height = r115.getMeasuredHeight();
        measureChildWithMargins(r115, r7, 0, r39, 0);
        ((LinearLayout.LayoutParams) r116).height = r125;
    L171:
        r92 = r92 + 1;
        goto L165
    L443:
        return;
    L400:
        return;
    L159:
        if (r111 == 1073741824) goto L161;
    L103:
        if (r45 == 1073741824) goto L115;
        int r46 = 0;
    L105:
        if (r46 >= r312) goto L115;
        View r93 = getChildAt(r46);
        if (r93 == null) goto L114;
        if (r93.getVisibility() == 8) goto L114;
        if (((LinearLayout.LayoutParams) ((C0901f0) r93.getLayoutParams())).weight <= 0.0f) goto L114;
        r93.measure(View.MeasureSpec.makeMeasureSpec(r93.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r54, 1073741824));
    L114:
        r46 = r46 + 1;
        goto L105
    L98:
        if (r17 <= 0.0f) goto L100;
    L116:
        float r55 = this.f3192g;
        if (r55 <= 0.0f) goto L119;
        r17 = r55;
    L119:
        this.f3191f = 0;
        int r56 = 0;
    L120:
        if (r56 >= r312) goto L156;
        View r94 = getChildAt(r56);
        if (r94.getVisibility() != 8) goto L124;
        int r293 = r45;
    L155:
        r56 = r56 + 1;
        r45 = r293;
        goto L120
    L124:
        C0901f0 r133 = (C0901f0) r94.getLayoutParams();
        float r144 = ((LinearLayout.LayoutParams) r133).weight;
        if (r144 <= 0.0f) goto L141;
        int r153 = (int) ((r114 * r144) / r17);
        r17 = r17 - r144;
        int r117 = r114 - r153;
        int r118 = ViewGroup.getChildMeasureSpec(r38, ((getPaddingRight() + getPaddingLeft()) + ((LinearLayout.LayoutParams) r133).leftMargin) + ((LinearLayout.LayoutParams) r133).rightMargin, ((LinearLayout.LayoutParams) r133).width);
        if (((LinearLayout.LayoutParams) r133).height != 0) goto L135;
        int r145 = 1073741824;
        if (r45 != 1073741824) goto L136;
        if (r153 > 0) goto L134;
        r153 = 0;
    L134:
        r94.measure(r118, View.MeasureSpec.makeMeasureSpec(r153, 1073741824));
    L140:
        r124 = View.combineMeasuredStates(r124, r94.getMeasuredState() & (-256));
        r114 = r117;
    L136:
        int r154 = r94.getMeasuredHeight() + r153;
        if (r154 >= 0) goto L139;
        r154 = 0;
    L139:
        r94.measure(r118, View.MeasureSpec.makeMeasureSpec(r154, r145));
        goto L140
    L135:
        r145 = 1073741824;
    L141:
        int r146 = ((LinearLayout.LayoutParams) r133).leftMargin + ((LinearLayout.LayoutParams) r133).rightMargin;
        int r155 = r94.getMeasuredWidth() + r146;
        int r34 = Math.max(r33, r155);
        if (r111 == 1073741824) goto L146;
        r293 = r45;
        int r47 = -1;
        if (((LinearLayout.LayoutParams) r133).width == (-1)) goto L148;
    L147:
        r146 = r155;
    L148:
        r210 = Math.max(r210, r146);
        if (r24 == true) goto L151;
    L153:
        boolean r35 = false;
    L154:
        int r48 = this.f3191f;
        this.f3191f = Math.max(r48, ((r94.getMeasuredHeight() + r48) + ((LinearLayout.LayoutParams) r133).topMargin) + ((LinearLayout.LayoutParams) r133).bottomMargin);
        r24 = r35;
        r33 = r34;
        goto L155
    L151:
        if (((LinearLayout.LayoutParams) r133).width != r47) goto L153;
        r35 = r272;
        goto L154
    L146:
        r293 = r45;
        r47 = -1;
        goto L147
    L156:
        this.f3191f = (getPaddingBottom() + getPaddingTop()) + this.f3191f;
        goto L115
    L82:
        if (r45 == Integer.MIN_VALUE) goto L84;
        if (r45 != 0) goto L94;
    L84:
        this.f3191f = 0;
        int r06 = 0;
    L85:
        if (r06 >= r312) goto L94;
        View r134 = getChildAt(r06);
        if (r134 != null) goto L90;
        this.f3191f = this.f3191f;
    L93:
        r06 = r06 + 1;
        goto L85
    L90:
        if (r134.getVisibility() == 8) goto L93;
        C0901f0 r119 = (C0901f0) r134.getLayoutParams();
        int r135 = this.f3191f;
        this.f3191f = Math.max(r135, ((r135 + r54) + ((LinearLayout.LayoutParams) r119).topMargin) + ((LinearLayout.LayoutParams) r119).bottomMargin);
        goto L93
    L77:
        if (m2233h(r312) == false) goto L79;
        this.f3191f += this.f3198m;
        goto L79
    L172:
        this.f3191f = 0;
        int r95 = getVirtualChildCount();
        int r103 = View.MeasureSpec.getMode(r38);
        int r1110 = View.MeasureSpec.getMode(r39);
        if (this.f3194i != null) goto L175;
    L176:
        this.f3194i = new int[4];
        this.f3195j = new int[4];
    L177:
        int[] r136 = this.f3194i;
        int[] r147 = this.f3195j;
        r136[3] = -1;
        r136[2] = -1;
        r136[1] = -1;
        r136[0] = -1;
        r147[3] = -1;
        r147[2] = -1;
        r147[1] = -1;
        r147[0] = -1;
        boolean r57 = this.f3186a;
        boolean r49 = this.f3193h;
        if (r103 != 1073741824) goto L180;
        boolean r182 = true;
    L181:
        boolean r192 = true;
        int r07 = 0;
        float r120 = 0.0f;
        int r211 = 0;
        int r36 = 0;
        int r8 = 0;
        int r126 = 0;
        int r156 = 0;
        boolean r212 = false;
        boolean r242 = false;
    L182:
        if (r36 >= r95) goto L257;
        View r72 = getChildAt(r36);
        if (r72 != null) goto L186;
        this.f3191f = this.f3191f;
        int r252 = r36;
        boolean r262 = r49;
        boolean r302 = r57;
    L256:
        r36 = r252 + 1;
        r49 = r262;
        r57 = r302;
        goto L182
    L186:
        int r253 = r07;
        int r263 = r211;
        if (r72.getVisibility() != 8) goto L190;
        r302 = r57;
        r07 = r253;
        r211 = r263;
        r252 = r36;
        r262 = r49;
        goto L256
    L190:
        if (m2233h(r36) == false) goto L192;
        this.f3191f += this.f3197l;
    L192:
        C0901f0 r213 = (C0901f0) r72.getLayoutParams();
        float r08 = ((LinearLayout.LayoutParams) r213).weight;
        float r294 = r120 + r08;
        if (r103 == 1073741824) goto L195;
    L204:
        int r303 = r36;
        if (((LinearLayout.LayoutParams) r213).width != 0) goto L209;
        float r121 = 0.0f;
        if (r08 <= 0.0f) goto L210;
        ((LinearLayout.LayoutParams) r213).width = -2;
        int r37 = 0;
    L212:
        if (r294 != r121) goto L214;
        int r313 = this.f3191f;
    L215:
        int r332 = r253;
        int r342 = r263;
        int r362 = r37;
        r252 = r303;
        r262 = r49;
        r302 = r57;
        measureChildWithMargins(r72, r38, r313, r39, 0);
        if (r362 == Integer.MIN_VALUE) goto L218;
        C0901f0 r09 = r213;
        ((LinearLayout.LayoutParams) r09).width = r362;
    L219:
        int r127 = r72.getMeasuredWidth();
        if (r182 == false) goto L222;
        this.f3191f = ((((LinearLayout.LayoutParams) r09).leftMargin + r127) + ((LinearLayout.LayoutParams) r09).rightMargin) + this.f3191f;
    L223:
        if (r262 == false) goto L225;
        r126 = Math.max(r127, r126);
    L225:
        boolean r410 = r212;
        int r128 = 1073741824;
    L226:
        if (r1110 != r128) goto L228;
    L230:
        boolean r58 = false;
    L231:
        int r129 = ((LinearLayout.LayoutParams) r09).topMargin + ((LinearLayout.LayoutParams) r09).bottomMargin;
        int r214 = r72.getMeasuredHeight() + r129;
        int r310 = View.combineMeasuredStates(r8, r72.getMeasuredState());
        if (r302 == false) goto L240;
        int r73 = r72.getBaseline();
        if (r73 == (-1)) goto L240;
        int r82 = ((LinearLayout.LayoutParams) r09).gravity;
        if (r82 >= 0) goto L238;
        r82 = this.f3190e;
    L238:
        int r83 = (((r82 & 112) >> 4) & (-2)) >> 1;
        int r215 = r129;
        r136[r83] = Math.max(r136[r83], r73);
        r147[r83] = Math.max(r147[r83], r214 - r73);
    L241:
        int r130 = Math.max(r342, r214);
        if (r192 == true) goto L244;
    L246:
        boolean r74 = false;
    L248:
        if (((LinearLayout.LayoutParams) r09).weight <= 0.0f) goto L252;
        if (r58 == false) goto L251;
        r214 = r215;
    L251:
        r156 = Math.max(r156, r214);
        r07 = r332;
    L255:
        r211 = r130;
        r8 = r310;
        r212 = r410;
        r192 = r74;
        r120 = r294;
        goto L256
    L252:
        if (r58 == false) goto L254;
        r214 = r215;
    L254:
        r07 = Math.max(r332, r214);
        goto L255
    L244:
        if (((LinearLayout.LayoutParams) r09).height != (-1)) goto L246;
        r74 = true;
    L240:
        r215 = r129;
        goto L241
    L228:
        if (((LinearLayout.LayoutParams) r09).height != (-1)) goto L230;
        r58 = true;
        r242 = true;
        goto L231
    L222:
        int r216 = this.f3191f;
        this.f3191f = Math.max(r216, ((r216 + r127) + ((LinearLayout.LayoutParams) r09).leftMargin) + ((LinearLayout.LayoutParams) r09).rightMargin);
        goto L223
    L218:
        r09 = r213;
        goto L219
    L214:
        r313 = 0;
    L210:
        r37 = Integer.MIN_VALUE;
        goto L212
    L209:
        r121 = 0.0f;
        goto L210
    L195:
        if (((LinearLayout.LayoutParams) r213).width != 0) goto L204;
        if (r08 <= 0.0f) goto L204;
        if (r182 == false) goto L200;
        int r304 = r36;
        this.f3191f = (((LinearLayout.LayoutParams) r213).leftMargin + ((LinearLayout.LayoutParams) r213).rightMargin) + this.f3191f;
    L201:
        if (r57 == false) goto L203;
        int r131 = View.MeasureSpec.makeMeasureSpec(0, 0);
        r72.measure(r131, r131);
        r09 = r213;
        r332 = r253;
        r342 = r263;
        r252 = r304;
        r262 = r49;
        r302 = r57;
        goto L225
    L203:
        r09 = r213;
        r332 = r253;
        r342 = r263;
        r252 = r304;
        r128 = 1073741824;
        r262 = r49;
        r302 = r57;
        r410 = true;
        goto L226
    L200:
        r304 = r36;
        int r010 = this.f3191f;
        this.f3191f = Math.max(r010, (((LinearLayout.LayoutParams) r213).leftMargin + r010) + ((LinearLayout.LayoutParams) r213).rightMargin);
        goto L201
    L257:
        int r75 = r211;
        boolean r264 = r49;
        boolean r305 = r57;
        if (this.f3191f > 0) goto L260;
    L262:
        int r217 = r136[1];
        if (r217 == (-1)) goto L265;
    L272:
        char r411 = 3;
    L273:
        int r254 = r8;
        int r218 = Math.max(r75, Math.max(r147[3], Math.max(r147[0], Math.max(r147[1], r147[2]))) + Math.max(r136[r411], Math.max(r136[0], Math.max(r217, r136[2]))));
    L274:
        if (r264 == true) goto L276;
    L291:
        int r59 = (getPaddingRight() + getPaddingLeft()) + this.f3191f;
        this.f3191f = r59;
        int r311 = View.resolveSizeAndState(Math.max(r59, getSuggestedMinimumWidth()), r38, 0);
        int r412 = (16777215 & r311) - this.f3191f;
        if (r212 == true) goto L313;
        if (r412 != 0) goto L295;
    L297:
        r07 = Math.max(r07, r156);
        if (r264 == true) goto L300;
    L312:
        int r413 = r39;
        int r223 = r95;
        int r84 = 0;
    L384:
        if (r192 == false) goto L386;
    L388:
        r07 = r218;
    L389:
        setMeasuredDimension((r254 & (-16777216)) | r311, View.resolveSizeAndState(Math.max((getPaddingBottom() + getPaddingTop()) + r07, getSuggestedMinimumHeight()), r413, r254 << 16));
        if (r242 == false) goto L442;
        int r76 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int r96 = r223;
    L392:
        if (r84 >= r96) goto L444;
        View r137 = getChildAt(r84);
        if (r137.getVisibility() == 8) goto L399;
        C0901f0 r1111 = (C0901f0) r137.getLayoutParams();
        if (((LinearLayout.LayoutParams) r1111).height != (-1)) goto L399;
        int r138 = ((LinearLayout.LayoutParams) r1111).width;
        ((LinearLayout.LayoutParams) r1111).width = r137.getMeasuredWidth();
        measureChildWithMargins(r137, r38, 0, r76, 0);
        ((LinearLayout.LayoutParams) r1111).width = r138;
    L399:
        r84 = r84 + 1;
        goto L392
    L444:
        return;
    L442:
        return;
    L386:
        if (r1110 == 1073741824) goto L388;
    L300:
        if (r103 == 1073741824) goto L312;
        int r139 = 0;
    L302:
        if (r139 >= r95) goto L312;
        View r414 = getChildAt(r139);
        if (r414 == null) goto L311;
        if (r414.getVisibility() == 8) goto L311;
        if (((LinearLayout.LayoutParams) ((C0901f0) r414.getLayoutParams())).weight <= 0.0f) goto L311;
        r414.measure(View.MeasureSpec.makeMeasureSpec(r126, 1073741824), View.MeasureSpec.makeMeasureSpec(r414.getMeasuredHeight(), 1073741824));
    L311:
        r139 = r139 + 1;
        goto L302
    L295:
        if (r120 <= 0.0f) goto L297;
    L313:
        float r219 = this.f3192g;
        if (r219 <= 0.0f) goto L316;
        r120 = r219;
    L316:
        r136[3] = -1;
        r136[2] = -1;
        r136[1] = -1;
        r136[0] = -1;
        r147[3] = -1;
        r147[2] = -1;
        r147[1] = -1;
        r147[0] = -1;
        this.f3191f = 0;
        int r1210 = r254;
        r218 = -1;
        int r85 = 0;
    L317:
        if (r85 >= r95) goto L371;
        View r157 = getChildAt(r85);
        if (r157 != null) goto L321;
    L322:
        int r77 = r412;
        int r224 = r95;
    L370:
        r85 = r85 + 1;
        r412 = r77;
        r95 = r224;
        goto L317
    L321:
        if (r157.getVisibility() == 8) goto L322;
        C0901f0 r510 = (C0901f0) r157.getLayoutParams();
        float r78 = ((LinearLayout.LayoutParams) r510).weight;
        if (r78 <= 0.0f) goto L340;
        r224 = r95;
        int r97 = (int) ((r412 * r78) / r120);
        float r140 = r120 - r78;
        int r415 = r412 - r97;
        int r141 = ViewGroup.getChildMeasureSpec(r39, ((getPaddingBottom() + getPaddingTop()) + ((LinearLayout.LayoutParams) r510).topMargin) + ((LinearLayout.LayoutParams) r510).bottomMargin, ((LinearLayout.LayoutParams) r510).height);
        if (((LinearLayout.LayoutParams) r510).width != 0) goto L334;
        int r79 = 1073741824;
        if (r103 != 1073741824) goto L335;
        if (r97 > 0) goto L333;
        r97 = 0;
    L333:
        r157.measure(View.MeasureSpec.makeMeasureSpec(r97, 1073741824), r141);
    L339:
        r1210 = View.combineMeasuredStates(r1210, r157.getMeasuredState() & (-16777216));
        r120 = r140;
        int r710 = r415;
    L341:
        if (r182 == false) goto L344;
        float r265 = r120;
        this.f3191f = ((r157.getMeasuredWidth() + ((LinearLayout.LayoutParams) r510).leftMargin) + ((LinearLayout.LayoutParams) r510).rightMargin) + this.f3191f;
        int r255 = r710;
    L345:
        if (r1110 != 1073741824) goto L347;
    L349:
        boolean r148 = false;
    L350:
        int r711 = ((LinearLayout.LayoutParams) r510).topMargin + ((LinearLayout.LayoutParams) r510).bottomMargin;
        int r98 = r157.getMeasuredHeight() + r711;
        r218 = Math.max(r218, r98);
        if (r148 == true) goto L354;
        r711 = r98;
    L354:
        r07 = Math.max(r07, r711);
        if (r192 == false) goto L359;
        int r712 = -1;
        if (((LinearLayout.LayoutParams) r510).height != (-1)) goto L360;
        boolean r149 = true;
    L361:
        if (r305 == false) goto L369;
        int r158 = r157.getBaseline();
        if (r158 == r712) goto L369;
        int r511 = ((LinearLayout.LayoutParams) r510).gravity;
        if (r511 >= 0) goto L367;
        r511 = this.f3190e;
    L367:
        int r512 = (((r511 & 112) >> 4) & (-2)) >> 1;
        r136[r512] = Math.max(r136[r512], r158);
        r147[r512] = Math.max(r147[r512], r98 - r158);
    L369:
        r192 = r149;
        r77 = r255;
        r120 = r265;
    L360:
        r149 = false;
        goto L361
    L359:
        r712 = -1;
        goto L360
    L347:
        if (((LinearLayout.LayoutParams) r510).height != (-1)) goto L349;
        r148 = true;
        goto L350
    L344:
        r265 = r120;
        int r150 = this.f3191f;
        r255 = r710;
        this.f3191f = Math.max(r150, ((r157.getMeasuredWidth() + r150) + ((LinearLayout.LayoutParams) r510).leftMargin) + ((LinearLayout.LayoutParams) r510).rightMargin);
    L335:
        int r99 = r157.getMeasuredWidth() + r97;
        if (r99 >= 0) goto L338;
        r99 = 0;
    L338:
        r157.measure(View.MeasureSpec.makeMeasureSpec(r99, r79), r141);
        goto L339
    L334:
        r79 = 1073741824;
        goto L335
    L340:
        r710 = r412;
        r224 = r95;
        goto L341
    L371:
        r413 = r39;
        r223 = r95;
        this.f3191f = (getPaddingRight() + getPaddingLeft()) + this.f3191f;
        int r151 = r136[1];
        if (r151 == (-1)) goto L374;
    L381:
        char r713 = 3;
    L382:
        r84 = 0;
        r218 = Math.max(r218, Math.max(r147[r713], Math.max(r147[0], Math.max(r147[1], r147[2]))) + Math.max(r136[r713], Math.max(r136[0], Math.max(r151, r136[2]))));
    L383:
        r254 = r1210;
        goto L384
    L374:
        if (r136[0] != (-1)) goto L381;
        if (r136[2] != (-1)) goto L381;
        r713 = 3;
        if (r136[3] != (-1)) goto L382;
        r84 = 0;
        goto L383
    L276:
        if (r103 == Integer.MIN_VALUE) goto L278;
        if (r103 != 0) goto L291;
    L278:
        this.f3191f = 0;
        int r513 = 0;
    L279:
        if (r513 >= r95) goto L291;
        View r314 = getChildAt(r513);
        if (r314 != null) goto L284;
        this.f3191f = this.f3191f;
    L290:
        r513 = r513 + 1;
        goto L279
    L284:
        if (r314.getVisibility() == 8) goto L290;
        C0901f0 r315 = (C0901f0) r314.getLayoutParams();
        if (r182 == false) goto L289;
        this.f3191f = ((((LinearLayout.LayoutParams) r315).leftMargin + r126) + ((LinearLayout.LayoutParams) r315).rightMargin) + this.f3191f;
        goto L290
    L289:
        int r416 = this.f3191f;
        this.f3191f = Math.max(r416, ((r416 + r126) + ((LinearLayout.LayoutParams) r315).leftMargin) + ((LinearLayout.LayoutParams) r315).rightMargin);
        goto L290
    L265:
        if (r136[0] != (-1)) goto L272;
        if (r136[2] != (-1)) goto L272;
        r411 = 3;
        if (r136[3] != (-1)) goto L273;
        r218 = r75;
        r254 = r8;
        goto L274
    L260:
        if (m2233h(r95) == false) goto L262;
        this.f3191f += this.f3197l;
        goto L262
    L180:
        r182 = false;
        goto L181
    L175:
        if (this.f3195j != null) goto L177;
        goto L176
    }

    public void setBaselineAligned(boolean r1) {
        this.f3186a = r1;
    }

    public void setBaselineAlignedChildIndex(int r3) {
        if (r3 < 0) goto L8;
        if (r3 >= getChildCount()) goto L8;
        this.f3187b = r3;
        return;
    L8:
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable r3) {
        if (r3 != this.f3196k) goto L5;
        return;
    L5:
        this.f3196k = r3;
        boolean r02 = false;
        if (r3 == null) goto L8;
        this.f3197l = r3.getIntrinsicWidth();
        this.f3198m = r3.getIntrinsicHeight();
    L9:
        if (r3 != null) goto L11;
        r02 = true;
    L11:
        setWillNotDraw(r02);
        requestLayout();
        return;
    L8:
        this.f3197l = 0;
        this.f3198m = 0;
        goto L9
    }

    public void setDividerPadding(int r1) {
        this.f3200o = r1;
    }

    public void setGravity(int r2) {
        if (this.f3190e != r2) goto L5;
        return;
    L5:
        if ((8388615 & r2) != 0) goto L8;
        r2 = r2 | 8388611;
    L8:
        if ((r2 & 112) != 0) goto L10;
        r2 = r2 | 48;
    L10:
        this.f3190e = r2;
        requestLayout();
    }

    public void setHorizontalGravity(int r3) {
        int r32 = r3 & 8388615;
        int r1 = this.f3190e;
        if ((8388615 & r1) == r32) goto L6;
        this.f3190e = r32 | ((-8388616) & r1);
        requestLayout();
        return;
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
        this.f3193h = r1;
    }

    public void setOrientation(int r2) {
        if (this.f3189d == r2) goto L6;
        this.f3189d = r2;
        requestLayout();
        return;
    }

    public void setShowDividers(int r2) {
        if (r2 == this.f3199n) goto L5;
        requestLayout();
    L5:
        this.f3199n = r2;
    }

    public void setVerticalGravity(int r3) {
        int r32 = r3 & 112;
        int r02 = this.f3190e;
        if ((r02 & 112) == r32) goto L6;
        this.f3190e = r32 | (r02 & (-113));
        requestLayout();
        return;
    }

    public void setWeightSum(float r2) {
        this.f3192g = Math.max(0.0f, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return mo1128g(r1);
    }
}
