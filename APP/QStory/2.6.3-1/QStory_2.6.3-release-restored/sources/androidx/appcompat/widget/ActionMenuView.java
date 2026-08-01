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
import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0960;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p206.C8629;
import p206.InterfaceC8617;
import p206.InterfaceC8618;
import p206.InterfaceC8626;
import p206.InterfaceC8630;
import p206.MenuC8631;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1013 implements InterfaceC8630, InterfaceC8617 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final int f795;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1047 f796;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f797;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC8626 f798;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int f799;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f800;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C0911 f801;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1044 f802;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f803;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f804;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Context f805;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public MenuC8631 f806;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f799 = (int) (56.0f * f);
        this.f795 = (int) (f * 4.0f);
        this.f805 = context;
        this.f804 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C1046 m1042(ViewGroup.LayoutParams layoutParams) {
        C1046 c1046;
        if (layoutParams == null) {
            return m1043();
        }
        if (layoutParams instanceof C1046) {
            C1046 c10462 = (C1046) layoutParams;
            c1046 = new C1046(c10462);
            c1046.f1148 = c10462.f1148;
        } else {
            c1046 = new C1046(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1046).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1046).gravity = 16;
        }
        return c1046;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C1046 m1043() {
        C1046 c1046 = new C1046(-2, -2);
        c1046.f1148 = false;
        ((LinearLayout.LayoutParams) c1046).gravity = 16;
        return c1046;
    }

    @Override // androidx.appcompat.widget.AbstractC1013, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1046;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC1013, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1043();
    }

    @Override // androidx.appcompat.widget.AbstractC1013, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1046(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f806 == null) {
            Context context = getContext();
            MenuC8631 menuC8631 = new MenuC8631(context);
            this.f806 = menuC8631;
            menuC8631.f21606 = new C0960(this, 2);
            C1044 c1044 = new C1044(context);
            this.f802 = c1044;
            c1044.f1124 = true;
            c1044.f1123 = true;
            InterfaceC8618 c1049 = this.f801;
            if (c1049 == null) {
                c1049 = new C1049();
            }
            c1044.f1133 = c1049;
            this.f806.m13714(c1044, this.f805);
            C1044 c10442 = this.f802;
            c10442.f1135 = this;
            this.f806 = c10442.f1140;
        }
        return this.f806;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1044 c1044 = this.f802;
        C1053 c1053 = c1044.f1136;
        if (c1053 != null) {
            return c1053.getDrawable();
        }
        if (c1044.f1125) {
            return c1044.f1126;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f804;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1044 c1044 = this.f802;
        if (c1044 != null) {
            c1044.mo1174();
            if (this.f802.m1262()) {
                this.f802.m1264();
                this.f802.m1263();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1044 c1044 = this.f802;
        if (c1044 != null) {
            c1044.m1264();
            C1050 c1050 = c1044.f1128;
            if (c1050 == null || !c1050.m13704()) {
                return;
            }
            c1050.f21540.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1013, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f797) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C1046 c1046 = (C1046) childAt.getLayoutParams();
                if (c1046.f1148) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1047(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1046).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1046).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1046).leftMargin) + ((LinearLayout.LayoutParams) c1046).rightMargin;
                    m1047(i9);
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
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C1046 c10462 = (C1046) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c10462.f1148) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c10462).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c10462).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C1046 c10463 = (C1046) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c10463.f1148) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c10463).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c10463).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.AbstractC1013, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC8631 menuC8631;
        boolean z = this.f797;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f797 = z2;
        if (z != z2) {
            this.f800 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f797 && (menuC8631 = this.f806) != null && size != this.f800) {
            this.f800 = size;
            menuC8631.m13723(true);
        }
        int childCount = getChildCount();
        if (!this.f797 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C1046 c1046 = (C1046) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c1046).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1046).leftMargin = 0;
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
        int i9 = this.f799;
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
            i3 = this.f795;
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
                C1046 c10462 = (C1046) childAt.getLayoutParams();
                c10462.f1143 = false;
                c10462.f1146 = 0;
                c10462.f1147 = 0;
                c10462.f1145 = false;
                ((LinearLayout.LayoutParams) c10462).leftMargin = 0;
                ((LinearLayout.LayoutParams) c10462).rightMargin = 0;
                c10462.f1144 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c10462.f1148 ? 1 : i10;
                C1046 c10463 = (C1046) childAt.getLayoutParams();
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
                c10463.f1145 = !c10463.f1148 && z6;
                c10463.f1147 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c10462.f1145) {
                    i15++;
                }
                if (c10462.f1148) {
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
                C1046 c10464 = (C1046) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c10464.f1145) {
                    int i28 = c10464.f1147;
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
                C1046 c10465 = (C1046) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c10465.f1144) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c10465.f1147 += r11;
                    c10465.f1143 = r11;
                    i23--;
                } else if (c10465.f1147 == i29) {
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
                if ((j & 1) != 0 && !((C1046) getChildAt(0).getLayoutParams()).f1144) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C1046) getChildAt(i31).getLayoutParams()).f1144) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C1046 c10466 = (C1046) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c10466.f1146 = i32;
                        c10466.f1143 = true;
                        if (i33 == 0 && !c10466.f1144) {
                            ((LinearLayout.LayoutParams) c10466).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c10466.f1148) {
                        c10466.f1146 = i32;
                        c10466.f1143 = true;
                        ((LinearLayout.LayoutParams) c10466).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c10466).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c10466).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C1046 c10467 = (C1046) childAt4.getLayoutParams();
                if (c10467.f1143) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c10467.f1147 * i22) + c10467.f1146, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f802.f1131 = z;
    }

    public void setOnMenuItemClickListener(InterfaceC1047 interfaceC1047) {
        this.f796 = interfaceC1047;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1044 c1044 = this.f802;
        C1053 c1053 = c1044.f1136;
        if (c1053 != null) {
            c1053.setImageDrawable(drawable);
        } else {
            c1044.f1125 = true;
            c1044.f1126 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f803 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f804 != i) {
            this.f804 = i;
            if (i == 0) {
                this.f805 = getContext();
            } else {
                this.f805 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1044 c1044) {
        this.f802 = c1044;
        c1044.f1135 = this;
        this.f806 = c1044.f1140;
    }

    @Override // androidx.appcompat.widget.AbstractC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1010 generateDefaultLayoutParams() {
        return m1043();
    }

    @Override // p206.InterfaceC8630
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo1019(C8629 c8629) {
        return this.f806.m13721(c8629, null, 0);
    }

    @Override // p206.InterfaceC8617
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1020(MenuC8631 menuC8631) {
        this.f806 = menuC8631;
    }

    @Override // androidx.appcompat.widget.AbstractC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1010 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1042(layoutParams);
    }

    @Override // androidx.appcompat.widget.AbstractC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1010 generateLayoutParams(AttributeSet attributeSet) {
        return new C1046(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m1047(int i) {
        boolean zMo1016 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1048)) {
            zMo1016 = ((InterfaceC1048) childAt).mo1016();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1048)) ? zMo1016 : ((InterfaceC1048) childAt2).mo1015() | zMo1016;
    }

    @Override // androidx.appcompat.widget.AbstractC1013, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1042(layoutParams);
    }
}
