package androidx.appcompat.widget;

import Yue.C8370;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.widget.C8754;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends C8754 implements C8694.InterfaceC1604, InterfaceC8700 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String f26171 = "ActionMenuView";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f26172 = 56;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f26173 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8694 f26174;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Context f26175;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f26176;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f26177;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C1628 f26178;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public InterfaceC8699.InterfaceC1607 f26179;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C8694.InterfaceC1603 f26180;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f26181;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f26182;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f26183;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f26184;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public InterfaceC8709 f26185;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC1615 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo4635();

        /* JADX INFO: renamed from: ۥ۟ */
        boolean mo4636();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$ۥ۟ */
    public static class C1616 implements InterfaceC8699.InterfaceC1607 {
        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        public void onCloseMenu(@InterfaceC6391 C8694 c8694, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4617(@InterfaceC6391 C8694 c8694) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$ۥ۟۟, reason: contains not printable characters */
    public static class C8707 extends C8754.C1632 {

        /* JADX INFO: renamed from: ۥ */
        @ViewDebug.ExportedProperty
        public boolean f3653;

        /* JADX INFO: renamed from: ۥ۟ */
        @ViewDebug.ExportedProperty
        public int f3654;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public int f26186;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f26187;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f26188;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f26189;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8707(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8707(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C8707(C8707 c8707) {
            super((ViewGroup.LayoutParams) c8707);
            this.f3653 = c8707.f3653;
        }

        public C8707(int i, int i2) {
            super(i, i2);
            this.f3653 = false;
        }

        public C8707(int i, int i2, boolean z) {
            super(i, i2);
            this.f3653 = z;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$ۥ۟۟۟, reason: contains not printable characters */
    public class C8708 implements C8694.InterfaceC1603 {
        public C8708() {
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
            InterfaceC8709 interfaceC8709 = ActionMenuView.this.f26185;
            return interfaceC8709 != null && interfaceC8709.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public void onMenuModeChange(@InterfaceC6391 C8694 c8694) {
            C8694.InterfaceC1603 interfaceC1603 = ActionMenuView.this.f26180;
            if (interfaceC1603 != null) {
                interfaceC1603.onMenuModeChange(c8694);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8709 {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m29088(View view, int i, int i2, int i3, int i4) {
        int i5;
        C8707 c8707 = (C8707) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m28989();
        if (i2 > 0) {
            i5 = 2;
            if (!z2 || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z2 || i6 >= 2) {
                    i5 = i6;
                }
            } else {
                i5 = 0;
            }
        }
        if (!c8707.f3653 && z2) {
            z = true;
        }
        c8707.f26187 = z;
        c8707.f3654 = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.widget.C8754, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8707;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f26174 == null) {
            Context context = getContext();
            C8694 c8694 = new C8694(context);
            this.f26174 = c8694;
            c8694.setCallback(new C8708());
            C1628 c1628 = new C1628(context);
            this.f26178 = c1628;
            c1628.m29205(true);
            C1628 c16282 = this.f26178;
            InterfaceC8699.InterfaceC1607 c1616 = this.f26179;
            if (c1616 == null) {
                c1616 = new C1616();
            }
            c16282.setCallback(c1616);
            this.f26174.addMenuPresenter(this.f26178, this.f26175);
            this.f26178.m29203(this);
        }
        return this.f26174;
    }

    @InterfaceC6490
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f26178.m29194();
    }

    public int getPopupTheme() {
        return this.f26176;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void initialize(C8694 c8694) {
        this.f26174 = c8694;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1628 c1628 = this.f26178;
        if (c1628 != null) {
            c1628.updateMenuView(false);
            if (this.f26178.m29198()) {
                this.f26178.m29195();
                this.f26178.m29207();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m29089();
    }

    @Override // androidx.appcompat.widget.C8754, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f26181) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM4344 = C8370.m4344(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C8707 c8707 = (C8707) childAt.getLayoutParams();
                if (c8707.f3653) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m29094(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM4344) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c8707).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c8707).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c8707).leftMargin) + ((LinearLayout.LayoutParams) c8707).rightMargin;
                    m29094(i9);
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
        if (zM4344) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C8707 c87072 = (C8707) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c87072.f3653) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c87072).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c87072).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C8707 c87073 = (C8707) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c87073.f3653) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c87073).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((LinearLayout.LayoutParams) c87073).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.C8754, android.view.View
    public void onMeasure(int i, int i2) {
        C8694 c8694;
        boolean z = this.f26181;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f26181 = z2;
        if (z != z2) {
            this.f26182 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f26181 && (c8694 = this.f26174) != null && size != this.f26182) {
            this.f26182 = size;
            c8694.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f26181 && childCount > 0) {
            m29099(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C8707 c8707 = (C8707) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) c8707).rightMargin = 0;
            ((LinearLayout.LayoutParams) c8707).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f26178.m29201(z);
    }

    public void setOnMenuItemClickListener(InterfaceC8709 interfaceC8709) {
        this.f26185 = interfaceC8709;
    }

    public void setOverflowIcon(@InterfaceC6490 Drawable drawable) {
        getMenu();
        this.f26178.m29204(drawable);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f26177 = z;
    }

    public void setPopupTheme(@InterfaceC7651 int i) {
        if (this.f26176 != i) {
            this.f26176 = i;
            if (i == 0) {
                this.f26175 = getContext();
            } else {
                this.f26175 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public void setPresenter(C1628 c1628) {
        this.f26178 = c1628;
        c1628.m29203(this);
    }

    @Override // androidx.appcompat.view.menu.C8694.InterfaceC1604
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ */
    public boolean mo4638(C8697 c8697) {
        return this.f26174.performItemAction(c8697, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29089() {
        C1628 c1628 = this.f26178;
        if (c1628 != null) {
            c1628.m29192();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroidx/appcompat/widget/ۥ۟۟۟$ۥ۟; */
    @Override // androidx.appcompat.widget.C8754, android.view.ViewGroup
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8707 generateDefaultLayoutParams() {
        C8707 c8707 = new C8707(-2, -2);
        ((LinearLayout.LayoutParams) c8707).gravity = 16;
        return c8707;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ۥ۟۟۟$ۥ۟; */
    @Override // androidx.appcompat.widget.C8754, android.view.ViewGroup
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8707 generateLayoutParams(AttributeSet attributeSet) {
        return new C8707(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ۥ۟۟۟$ۥ۟; */
    @Override // androidx.appcompat.widget.C8754, android.view.ViewGroup
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8707 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C8707 c8707 = layoutParams instanceof C8707 ? new C8707((C8707) layoutParams) : new C8707(layoutParams);
        if (((LinearLayout.LayoutParams) c8707).gravity <= 0) {
            ((LinearLayout.LayoutParams) c8707).gravity = 16;
        }
        return c8707;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C8707 m29093() {
        C8707 c8707GenerateDefaultLayoutParams = generateDefaultLayoutParams();
        c8707GenerateDefaultLayoutParams.f3653 = true;
        return c8707GenerateDefaultLayoutParams;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m29094(int i) {
        boolean zMo4635 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1615)) {
            zMo4635 = ((InterfaceC1615) childAt).mo4635();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1615)) ? zMo4635 : zMo4635 | ((InterfaceC1615) childAt2).mo4636();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m29095() {
        C1628 c1628 = this.f26178;
        return c1628 != null && c1628.m29195();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m29096() {
        C1628 c1628 = this.f26178;
        return c1628 != null && c1628.m29197();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m29097() {
        C1628 c1628 = this.f26178;
        return c1628 != null && c1628.m29198();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m29098() {
        return this.f26177;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m29099(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f26183;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i16 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i17 = i14 + 1;
                if (z5) {
                    int i18 = this.f26184;
                    i7 = i17;
                    r14 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    i7 = i17;
                    r14 = 0;
                }
                C8707 c8707 = (C8707) childAt.getLayoutParams();
                c8707.f26189 = r14;
                c8707.f26186 = r14;
                c8707.f3654 = r14;
                c8707.f26187 = r14;
                ((LinearLayout.LayoutParams) c8707).leftMargin = r14;
                ((LinearLayout.LayoutParams) c8707).rightMargin = r14;
                c8707.f26188 = z5 && ((ActionMenuItemView) childAt).m28989();
                int iM29088 = m29088(childAt, i12, c8707.f3653 ? 1 : i10, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM29088);
                if (c8707.f26187) {
                    i15++;
                }
                if (c8707.f3653) {
                    z4 = true;
                }
                i10 -= iM29088;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM29088 == 1) {
                    j |= (long) (1 << i13);
                    iMax = iMax;
                }
                i14 = i7;
            }
            i13++;
            size2 = i16;
        }
        int i19 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i15 > 0 && i10 > 0) {
            int i20 = Integer.MAX_VALUE;
            int i21 = 0;
            int i22 = 0;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                C8707 c87072 = (C8707) getChildAt(i22).getLayoutParams();
                int i23 = iMax;
                if (c87072.f26187) {
                    int i24 = c87072.f3654;
                    if (i24 < i20) {
                        j2 = 1 << i22;
                        i20 = i24;
                        i21 = 1;
                    } else if (i24 == i20) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                iMax = i23;
                z7 = z8;
            }
            z = z7;
            i5 = iMax;
            j |= j2;
            if (i21 > i10) {
                i3 = mode;
                i4 = i8;
                break;
            }
            int i25 = i20 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                C8707 c87073 = (C8707) childAt2.getLayoutParams();
                int i27 = i8;
                int i28 = mode;
                long j3 = 1 << i26;
                if ((j2 & j3) == 0) {
                    if (c87073.f3654 == i25) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c87073.f26188 && i10 == 1) {
                        int i29 = this.f26184;
                        z3 = z6;
                        childAt2.setPadding(i29 + i12, 0, i29, 0);
                    } else {
                        z3 = z6;
                    }
                    c87073.f3654++;
                    c87073.f26189 = true;
                    i10--;
                }
                i26++;
                mode = i28;
                i8 = i27;
                z6 = z3;
            }
            iMax = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i8;
        z = z7;
        i5 = iMax;
        boolean z9 = !z4 && i14 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i14 - 1 && !z9 && iMax2 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z9) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j & 1) != 0 && !((C8707) getChildAt(0).getLayoutParams()).f26188) {
                    fBitCount -= 0.5f;
                }
                int i30 = childCount - 1;
                if ((j & ((long) (1 << i30))) != 0 && !((C8707) getChildAt(i30).getLayoutParams()).f26188) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : i6;
            z2 = z;
            for (int i32 = i6; i32 < childCount; i32++) {
                if ((j & ((long) (1 << i32))) != 0) {
                    View childAt3 = getChildAt(i32);
                    C8707 c87074 = (C8707) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c87074.f26186 = i31;
                        c87074.f26189 = true;
                        if (i32 == 0 && !c87074.f26188) {
                            ((LinearLayout.LayoutParams) c87074).leftMargin = (-i31) / 2;
                        }
                        z2 = true;
                    } else if (c87074.f3653) {
                        c87074.f26186 = i31;
                        c87074.f26189 = true;
                        ((LinearLayout.LayoutParams) c87074).rightMargin = (-i31) / 2;
                        z2 = true;
                    } else {
                        if (i32 != 0) {
                            ((LinearLayout.LayoutParams) c87074).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c87074).rightMargin = i31 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i33 = i6; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                C8707 c87075 = (C8707) childAt4.getLayoutParams();
                if (c87075.f26189) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c87075.f3654 * i12) + c87075.f26186, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i19);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C8694 m29100() {
        return this.f26174;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29101(InterfaceC8699.InterfaceC1607 interfaceC1607, C8694.InterfaceC1603 interfaceC1603) {
        this.f26179 = interfaceC1607;
        this.f26180 = interfaceC1603;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m29102() {
        C1628 c1628 = this.f26178;
        return c1628 != null && c1628.m29207();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionMenuView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f26183 = (int) (56.0f * f);
        this.f26184 = (int) (f * 4.0f);
        this.f26175 = context;
        this.f26176 = 0;
    }
}
