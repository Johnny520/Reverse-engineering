package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p004C.C0066j;
import p012G.C0140d;
import p068h.C0596o;
import p068h.InterfaceC0577B;
import p068h.InterfaceC0593l;
import p068h.MenuC0594m;
import p069i.AbstractC0718t1;
import p069i.AbstractC0728y0;
import p069i.C0677g;
import p069i.C0686j;
import p069i.C0689k;
import p069i.C0695m;
import p069i.C0726x0;
import p069i.InterfaceC0692l;
import p069i.InterfaceC0698n;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0728y0 implements InterfaceC0593l, InterfaceC0577B {

    /* JADX INFO: renamed from: q */
    public MenuC0594m f1002q;

    /* JADX INFO: renamed from: r */
    public Context f1003r;

    /* JADX INFO: renamed from: s */
    public int f1004s;

    /* JADX INFO: renamed from: t */
    public boolean f1005t;

    /* JADX INFO: renamed from: u */
    public C0689k f1006u;

    /* JADX INFO: renamed from: v */
    public boolean f1007v;

    /* JADX INFO: renamed from: w */
    public int f1008w;

    /* JADX INFO: renamed from: x */
    public final int f1009x;

    /* JADX INFO: renamed from: y */
    public final int f1010y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0698n f1011z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1009x = (int) (56.0f * f);
        this.f1010y = (int) (f * 4.0f);
        this.f1003r = context;
        this.f1004s = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C0695m m671k() {
        C0695m c0695m = new C0695m(-2, -2);
        c0695m.f2345a = false;
        ((LinearLayout.LayoutParams) c0695m).gravity = 16;
        return c0695m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C0695m m672l(ViewGroup.LayoutParams layoutParams) {
        C0695m c0695m;
        if (layoutParams == null) {
            return m671k();
        }
        if (layoutParams instanceof C0695m) {
            C0695m c0695m2 = (C0695m) layoutParams;
            c0695m = new C0695m(c0695m2);
            c0695m.f2345a = c0695m2.f2345a;
        } else {
            c0695m = new C0695m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0695m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0695m).gravity = 16;
        }
        return c0695m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0577B
    /* JADX INFO: renamed from: b */
    public final void mo648b(MenuC0594m menuC0594m) {
        this.f1002q = menuC0594m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0695m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0593l
    /* JADX INFO: renamed from: d */
    public final boolean mo649d(C0596o c0596o) {
        return this.f1002q.m1190q(c0596o, null, 0);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C0726x0 generateDefaultLayoutParams() {
        return m671k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m671k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m672l(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Menu getMenu() {
        if (this.f1002q == null) {
            Context context = getContext();
            MenuC0594m menuC0594m = new MenuC0594m(context);
            this.f1002q = menuC0594m;
            menuC0594m.f2034e = new C0066j(18, this);
            C0689k c0689k = new C0689k(context);
            this.f1006u = c0689k;
            c0689k.f2313m = true;
            c0689k.f2314n = true;
            c0689k.f2306f = new C0140d(24);
            this.f1002q.m1183b(c0689k, this.f1003r);
            C0689k c0689k2 = this.f1006u;
            c0689k2.f2309i = this;
            this.f1002q = c0689k2.f2304d;
        }
        return this.f1002q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getOverflowIcon() {
        getMenu();
        C0689k c0689k = this.f1006u;
        C0686j c0686j = c0689k.f2310j;
        if (c0686j != null) {
            return c0686j.getDrawable();
        }
        if (c0689k.f2312l) {
            return c0689k.f2311k;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getPopupTheme() {
        return this.f1004s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0
    /* JADX INFO: renamed from: h */
    public final C0726x0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0695m(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ C0726x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m672l(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m676m(int i2) {
        boolean zMo644b = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0692l)) {
            zMo644b = ((InterfaceC0692l) childAt).mo644b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0692l)) ? zMo644b : ((InterfaceC0692l) childAt2).mo643a() | zMo644b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0689k c0689k = this.f1006u;
        if (c0689k != null) {
            c0689k.mo1148c();
            if (this.f1006u.m1310h()) {
                this.f1006u.m1309f();
                this.f1006u.m1311l();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0689k c0689k = this.f1006u;
        if (c0689k != null) {
            c0689k.m1309f();
            C0677g c0677g = c0689k.f2321u;
            if (c0677g == null || !c0677g.m1206b()) {
                return;
            }
            c0677g.f2106i.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f1007v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zM1366a = AbstractC0718t1.m1366a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0695m c0695m = (C0695m) childAt.getLayoutParams();
                if (c0695m.f2345a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m676m(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM1366a) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0695m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0695m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0695m).leftMargin) + ((LinearLayout.LayoutParams) c0695m).rightMargin;
                    m676m(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zM1366a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0695m c0695m2 = (C0695m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0695m2.f2345a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0695m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0695m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0695m c0695m3 = (C0695m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0695m3.f2345a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c0695m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0695m3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // p069i.AbstractC0728y0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        ?? r11;
        int i6;
        int i7;
        MenuC0594m menuC0594m;
        boolean z2 = this.f1007v;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1007v = z3;
        if (z2 != z3) {
            this.f1008w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1007v && (menuC0594m = this.f1002q) != null && size != this.f1008w) {
            this.f1008w = size;
            menuC0594m.m1189p(true);
        }
        int childCount = getChildCount();
        if (!this.f1007v || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C0695m c0695m = (C0695m) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c0695m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0695m).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f1009x;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        boolean z4 = false;
        int i16 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f1010y;
            if (i15 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i15);
            int i17 = size3;
            int i18 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i6 = i13;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z5) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0695m c0695m2 = (C0695m) childAt.getLayoutParams();
                c0695m2.f2350f = false;
                c0695m2.f2347c = 0;
                c0695m2.f2346b = 0;
                c0695m2.f2348d = false;
                ((LinearLayout.LayoutParams) c0695m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0695m2).rightMargin = 0;
                c0695m2.f2349e = z5 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i19 = c0695m2.f2345a ? 1 : i11;
                C0695m c0695m3 = (C0695m) childAt.getLayoutParams();
                int i20 = i11;
                i6 = i13;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i18, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z7 = z6;
                if (i19 <= 0 || (z6 && i19 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i6;
                    if (measuredWidth % i6 != 0) {
                        i7++;
                    }
                    if (z7 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c0695m3.f2348d = !c0695m3.f2345a && z7;
                c0695m3.f2346b = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i6, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i7);
                if (c0695m2.f2348d) {
                    i16++;
                }
                if (c0695m2.f2345a) {
                    z4 = true;
                }
                i11 = i20 - i7;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j2 |= (long) (1 << i15);
                }
            }
            i15++;
            size3 = i17;
            paddingBottom = i18;
            i13 = i6;
        }
        int i21 = size3;
        int i22 = i11;
        int i23 = i13;
        boolean z8 = z4 && i14 == 2;
        int i24 = i22;
        boolean z9 = false;
        while (i16 > 0 && i24 > 0) {
            int i25 = Integer.MAX_VALUE;
            long j3 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i27 < childCount2) {
                boolean z10 = z8;
                C0695m c0695m4 = (C0695m) getChildAt(i27).getLayoutParams();
                int i28 = iMax;
                if (c0695m4.f2348d) {
                    int i29 = c0695m4.f2346b;
                    if (i29 < i25) {
                        j3 = 1 << i27;
                        i25 = i29;
                        i26 = 1;
                    } else if (i29 == i25) {
                        j3 |= 1 << i27;
                        i26++;
                    }
                }
                i27++;
                iMax = i28;
                z8 = z10;
            }
            boolean z11 = z8;
            i5 = iMax;
            j2 |= j3;
            if (i26 > i24) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                C0695m c0695m5 = (C0695m) childAt2.getLayoutParams();
                boolean z12 = z4;
                long j4 = 1 << i31;
                if ((j3 & j4) != 0) {
                    if (z11 && c0695m5.f2349e) {
                        r11 = 1;
                        r11 = 1;
                        if (i24 == 1) {
                            childAt2.setPadding(i4 + i23, 0, i4, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0695m5.f2346b += r11;
                    c0695m5.f2350f = r11;
                    i24--;
                } else if (c0695m5.f2346b == i30) {
                    j2 |= j4;
                }
                i31++;
                z4 = z12;
            }
            iMax = i5;
            z8 = z11;
            z9 = true;
        }
        i5 = iMax;
        boolean z13 = !z4 && i14 == 1;
        if (i24 > 0 && j2 != 0 && (i24 < i14 - 1 || z13 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j2);
            if (!z13) {
                if ((j2 & 1) != 0 && !((C0695m) getChildAt(0).getLayoutParams()).f2349e) {
                    fBitCount -= 0.5f;
                }
                int i32 = childCount2 - 1;
                if ((j2 & ((long) (1 << i32))) != 0 && !((C0695m) getChildAt(i32).getLayoutParams()).f2349e) {
                    fBitCount -= 0.5f;
                }
            }
            int i33 = fBitCount > 0.0f ? (int) ((i24 * i23) / fBitCount) : 0;
            boolean z14 = z9;
            for (int i34 = 0; i34 < childCount2; i34++) {
                if ((j2 & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0695m c0695m6 = (C0695m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0695m6.f2347c = i33;
                        c0695m6.f2350f = true;
                        if (i34 == 0 && !c0695m6.f2349e) {
                            ((LinearLayout.LayoutParams) c0695m6).leftMargin = (-i33) / 2;
                        }
                        z14 = true;
                    } else if (c0695m6.f2345a) {
                        c0695m6.f2347c = i33;
                        c0695m6.f2350f = true;
                        ((LinearLayout.LayoutParams) c0695m6).rightMargin = (-i33) / 2;
                        z14 = true;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) c0695m6).leftMargin = i33 / 2;
                        }
                        if (i34 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0695m6).rightMargin = i33 / 2;
                        }
                    }
                }
            }
            z9 = z14;
        }
        if (z9) {
            for (int i35 = 0; i35 < childCount2; i35++) {
                View childAt4 = getChildAt(i35);
                C0695m c0695m7 = (C0695m) childAt4.getLayoutParams();
                if (c0695m7.f2350f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0695m7.f2346b * i23) + c0695m7.f2347c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? i5 : i21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1006u.f2318r = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnMenuItemClickListener(InterfaceC0698n interfaceC0698n) {
        this.f1011z = interfaceC0698n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0689k c0689k = this.f1006u;
        C0686j c0686j = c0689k.f2310j;
        if (c0686j != null) {
            c0686j.setImageDrawable(drawable);
        } else {
            c0689k.f2312l = true;
            c0689k.f2311k = drawable;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverflowReserved(boolean z2) {
        this.f1005t = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPopupTheme(int i2) {
        if (this.f1004s != i2) {
            this.f1004s = i2;
            if (i2 == 0) {
                this.f1003r = getContext();
            } else {
                this.f1003r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPresenter(C0689k c0689k) {
        this.f1006u = c0689k;
        c0689k.f2309i = this;
        this.f1002q = c0689k.f2304d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p069i.AbstractC0728y0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0695m(getContext(), attributeSet);
    }
}
