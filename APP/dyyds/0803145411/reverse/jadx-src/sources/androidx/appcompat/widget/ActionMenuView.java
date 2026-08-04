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
import yyds.AbstractC1423;
import yyds.AbstractC1603;
import yyds.C0052;
import yyds.C0469;
import yyds.C0550;
import yyds.C0640;
import yyds.C0977;
import yyds.C1148;
import yyds.C1154;
import yyds.C1313;
import yyds.C1534;
import yyds.InterfaceC0665;
import yyds.InterfaceC1200;
import yyds.InterfaceC1632;
import yyds.InterfaceC2494;
import yyds.MenuC0836;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1423 implements InterfaceC1632, InterfaceC0665 {

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final int f133;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public boolean f134;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public int f135;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public MenuC0836 f136;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final int f137;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public C1154 f138;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public C1313 f139;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f140;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public InterfaceC2494 f141;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public Context f142;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public int f143;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f137 = (int) (56.0f * f);
        this.f133 = (int) (f * 4.0f);
        this.f142 = context;
        this.f135 = 0;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static C1534 m53() {
        C1534 c1534 = new C1534(-2, -2);
        c1534.f7372 = false;
        ((LinearLayout.LayoutParams) c1534).gravity = 16;
        return c1534;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static C1534 m54(ViewGroup.LayoutParams layoutParams) {
        C1534 c1534;
        if (layoutParams == null) {
            return m53();
        }
        if (layoutParams instanceof C1534) {
            C1534 c15342 = (C1534) layoutParams;
            c1534 = new C1534(c15342);
            c1534.f7372 = c15342.f7372;
        } else {
            c1534 = new C1534(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1534).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1534).gravity = 16;
        }
        return c1534;
    }

    @Override // yyds.AbstractC1423, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1534;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // yyds.AbstractC1423, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m53();
    }

    @Override // yyds.AbstractC1423, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1534(getContext(), attributeSet);
    }

    public Menu getMenu() {
        MenuC0836 menuC0836 = this.f136;
        if (menuC0836 != null) {
            return menuC0836;
        }
        Context context = getContext();
        MenuC0836 menuC08362 = new MenuC0836(context);
        this.f136 = menuC08362;
        menuC08362.f3834 = new C0052(3, this);
        C1313 c1313 = new C1313(context);
        this.f139 = c1313;
        c1313.f6000 = true;
        c1313.f6007 = true;
        c1313.f6011 = new C0469(6);
        this.f136.m1904(c1313, this.f142);
        C1313 c13132 = this.f139;
        c13132.f6016 = this;
        MenuC0836 menuC08363 = c13132.f6004;
        this.f136 = menuC08363;
        return menuC08363;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1313 c1313 = this.f139;
        C0977 c0977 = c1313.f6014;
        if (c0977 != null) {
            return c0977.getDrawable();
        }
        if (c1313.f6002) {
            return c1313.f6015;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f135;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1313 c1313 = this.f139;
        if (c1313 != null) {
            c1313.mo1503();
            if (this.f139.m2603()) {
                this.f139.m2605();
                this.f139.m2604();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1313 c1313 = this.f139;
        if (c1313 != null) {
            c1313.m2605();
            C0640 c0640 = c1313.f6012;
            if (c0640 == null || !c0640.m3361()) {
                return;
            }
            c0640.f8390.dismiss();
        }
    }

    @Override // yyds.AbstractC1423, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f134) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM3289 = AbstractC1603.m3289(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1534 c1534 = (C1534) childAt.getLayoutParams();
                if (c1534.f7372) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m57(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM3289) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1534).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1534).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1534).leftMargin) + ((LinearLayout.LayoutParams) c1534).rightMargin;
                    m57(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zM3289) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C1534 c15342 = (C1534) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c15342.f7372) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c15342).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c15342).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C1534 c15343 = (C1534) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c15343.f7372) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c15343).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c15343).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // yyds.AbstractC1423, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC0836 menuC0836;
        boolean z = this.f134;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f134 = z2;
        if (z != z2) {
            this.f143 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f134 && (menuC0836 = this.f136) != null && size != this.f143) {
            this.f143 = size;
            menuC0836.m1915(true);
        }
        int childCount = getChildCount();
        if (!this.f134 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C1534 c1534 = (C1534) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c1534).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1534).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f137;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f133;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C1534 c15342 = (C1534) childAt.getLayoutParams();
                c15342.f7375 = false;
                c15342.f7374 = 0;
                c15342.f7373 = 0;
                c15342.f7376 = false;
                ((LinearLayout.LayoutParams) c15342).leftMargin = 0;
                ((LinearLayout.LayoutParams) c15342).rightMargin = 0;
                c15342.f7371 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c15342.f7372 ? 1 : i10;
                C1534 c15343 = (C1534) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c15343.f7376 = !c15343.f7372 && z6;
                c15343.f7373 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c15342.f7376) {
                    i15++;
                }
                if (c15342.f7372) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C1534 c15344 = (C1534) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c15344.f7376) {
                    int i28 = c15344.f7373;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C1534 c15345 = (C1534) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c15345.f7371) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c15345.f7373 += r11;
                    c15345.f7375 = r11;
                    i23--;
                } else if (c15345.f7373 == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C1534) getChildAt(0).getLayoutParams()).f7371) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C1534) getChildAt(i31).getLayoutParams()).f7371) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C1534 c15346 = (C1534) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c15346.f7374 = i32;
                        c15346.f7375 = true;
                        if (i33 == 0 && !c15346.f7371) {
                            ((LinearLayout.LayoutParams) c15346).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c15346.f7372) {
                        c15346.f7374 = i32;
                        c15346.f7375 = true;
                        ((LinearLayout.LayoutParams) c15346).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c15346).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c15346).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C1534 c15347 = (C1534) childAt4.getLayoutParams();
                if (c15347.f7375) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c15347.f7373 * i22) + c15347.f7374, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f139.f6017 = z;
    }

    public void setOnMenuItemClickListener(InterfaceC2494 interfaceC2494) {
        this.f141 = interfaceC2494;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1313 c1313 = this.f139;
        C0977 c0977 = c1313.f6014;
        if (c0977 != null) {
            c0977.setImageDrawable(drawable);
        } else {
            c1313.f6002 = true;
            c1313.f6015 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f140 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f135 != i) {
            this.f135 = i;
            if (i == 0) {
                this.f142 = getContext();
            } else {
                this.f142 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1313 c1313) {
        this.f139 = c1313;
        c1313.f6016 = this;
        this.f136 = c1313.f6004;
    }

    @Override // yyds.AbstractC1423
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0550 generateDefaultLayoutParams() {
        return m53();
    }

    @Override // yyds.InterfaceC1632
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo30(C1148 c1148) {
        return this.f136.m1906(c1148, null, 0);
    }

    @Override // yyds.InterfaceC0665
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo31(MenuC0836 menuC0836) {
        this.f136 = menuC0836;
    }

    @Override // yyds.AbstractC1423
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0550 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m54(layoutParams);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean m57(int i) {
        boolean zMo27 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1200)) {
            zMo27 = ((InterfaceC1200) childAt).mo27();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1200)) ? zMo27 : ((InterfaceC1200) childAt2).mo28() | zMo27;
    }

    @Override // yyds.AbstractC1423
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0550 generateLayoutParams(AttributeSet attributeSet) {
        return new C1534(getContext(), attributeSet);
    }

    @Override // yyds.AbstractC1423, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m54(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
