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
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0113;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p190.C7799;
import p190.InterfaceC7787;
import p190.InterfaceC7788;
import p190.InterfaceC7796;
import p190.InterfaceC7800;
import p190.MenuC7801;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0166 implements InterfaceC7800, InterfaceC7787 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final int f450;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC0200 f451;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f452;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC7796 f453;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int f454;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int f455;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C0064 f456;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0197 f457;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f458;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f459;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public Context f460;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public MenuC7801 f461;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f454 = (int) (56.0f * f);
        this.f450 = (int) (f * 4.0f);
        this.f460 = context;
        this.f459 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C0199 m481(ViewGroup.LayoutParams layoutParams) {
        C0199 c0199;
        if (layoutParams == null) {
            return m482();
        }
        if (layoutParams instanceof C0199) {
            C0199 c01992 = (C0199) layoutParams;
            c0199 = new C0199(c01992);
            c0199.f803 = c01992.f803;
        } else {
            c0199 = new C0199(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0199).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0199).gravity = 16;
        }
        return c0199;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C0199 m482() {
        C0199 c0199 = new C0199(-2, -2);
        c0199.f803 = false;
        ((LinearLayout.LayoutParams) c0199).gravity = 16;
        return c0199;
    }

    @Override // androidx.appcompat.widget.AbstractC0166, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0199;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0166, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m482();
    }

    @Override // androidx.appcompat.widget.AbstractC0166, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0199(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f461 == null) {
            Context context = getContext();
            MenuC7801 menuC7801 = new MenuC7801(context);
            this.f461 = menuC7801;
            menuC7801.f21264 = new C0113(this, 2);
            C0197 c0197 = new C0197(context);
            this.f457 = c0197;
            c0197.f779 = true;
            c0197.f778 = true;
            InterfaceC7788 c0202 = this.f456;
            if (c0202 == null) {
                c0202 = new C0202();
            }
            c0197.f788 = c0202;
            this.f461.m13127(c0197, this.f460);
            C0197 c01972 = this.f457;
            c01972.f790 = this;
            this.f461 = c01972.f795;
        }
        return this.f461;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0197 c0197 = this.f457;
        C0206 c0206 = c0197.f791;
        if (c0206 != null) {
            return c0206.getDrawable();
        }
        if (c0197.f780) {
            return c0197.f781;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f459;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0197 c0197 = this.f457;
        if (c0197 != null) {
            c0197.mo613();
            if (this.f457.m701()) {
                this.f457.m703();
                this.f457.m702();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0197 c0197 = this.f457;
        if (c0197 != null) {
            c0197.m703();
            C0203 c0203 = c0197.f783;
            if (c0203 == null || !c0203.m13117()) {
                return;
            }
            c0203.f21198.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0166, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f452) {
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
                C0199 c0199 = (C0199) childAt.getLayoutParams();
                if (c0199.f803) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m486(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0199).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0199).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0199).leftMargin) + ((LinearLayout.LayoutParams) c0199).rightMargin;
                    m486(i9);
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
                C0199 c01992 = (C0199) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c01992.f803) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c01992).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c01992).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0199 c01993 = (C0199) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c01993.f803) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c01993).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c01993).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.AbstractC0166, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC7801 menuC7801;
        boolean z = this.f452;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f452 = z2;
        if (z != z2) {
            this.f455 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f452 && (menuC7801 = this.f461) != null && size != this.f455) {
            this.f455 = size;
            menuC7801.m13136(true);
        }
        int childCount = getChildCount();
        if (!this.f452 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0199 c0199 = (C0199) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0199).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0199).leftMargin = 0;
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
        int i9 = this.f454;
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
            i3 = this.f450;
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
                C0199 c01992 = (C0199) childAt.getLayoutParams();
                c01992.f798 = false;
                c01992.f801 = 0;
                c01992.f802 = 0;
                c01992.f800 = false;
                ((LinearLayout.LayoutParams) c01992).leftMargin = 0;
                ((LinearLayout.LayoutParams) c01992).rightMargin = 0;
                c01992.f799 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c01992.f803 ? 1 : i10;
                C0199 c01993 = (C0199) childAt.getLayoutParams();
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
                c01993.f800 = !c01993.f803 && z6;
                c01993.f802 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c01992.f800) {
                    i15++;
                }
                if (c01992.f803) {
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
                C0199 c01994 = (C0199) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c01994.f800) {
                    int i28 = c01994.f802;
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
                C0199 c01995 = (C0199) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c01995.f799) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c01995.f802 += r11;
                    c01995.f798 = r11;
                    i23--;
                } else if (c01995.f802 == i29) {
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
                if ((j & 1) != 0 && !((C0199) getChildAt(0).getLayoutParams()).f799) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C0199) getChildAt(i31).getLayoutParams()).f799) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0199 c01996 = (C0199) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c01996.f801 = i32;
                        c01996.f798 = true;
                        if (i33 == 0 && !c01996.f799) {
                            ((LinearLayout.LayoutParams) c01996).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c01996.f803) {
                        c01996.f801 = i32;
                        c01996.f798 = true;
                        ((LinearLayout.LayoutParams) c01996).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c01996).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c01996).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C0199 c01997 = (C0199) childAt4.getLayoutParams();
                if (c01997.f798) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c01997.f802 * i22) + c01997.f801, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f457.f786 = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0200 interfaceC0200) {
        this.f451 = interfaceC0200;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0197 c0197 = this.f457;
        C0206 c0206 = c0197.f791;
        if (c0206 != null) {
            c0206.setImageDrawable(drawable);
        } else {
            c0197.f780 = true;
            c0197.f781 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f458 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f459 != i) {
            this.f459 = i;
            if (i == 0) {
                this.f460 = getContext();
            } else {
                this.f460 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0197 c0197) {
        this.f457 = c0197;
        c0197.f790 = this;
        this.f461 = c0197.f795;
    }

    @Override // androidx.appcompat.widget.AbstractC0166
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0163 generateDefaultLayoutParams() {
        return m482();
    }

    @Override // p190.InterfaceC7800
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo458(C7799 c7799) {
        return this.f461.m13134(c7799, null, 0);
    }

    @Override // p190.InterfaceC7787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo459(MenuC7801 menuC7801) {
        this.f461 = menuC7801;
    }

    @Override // androidx.appcompat.widget.AbstractC0166
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0163 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m481(layoutParams);
    }

    @Override // androidx.appcompat.widget.AbstractC0166
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0163 generateLayoutParams(AttributeSet attributeSet) {
        return new C0199(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m486(int i) {
        boolean zMo455 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0201)) {
            zMo455 = ((InterfaceC0201) childAt).mo455();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0201)) ? zMo455 : ((InterfaceC0201) childAt2).mo454() | zMo455;
    }

    @Override // androidx.appcompat.widget.AbstractC0166, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m481(layoutParams);
    }
}
