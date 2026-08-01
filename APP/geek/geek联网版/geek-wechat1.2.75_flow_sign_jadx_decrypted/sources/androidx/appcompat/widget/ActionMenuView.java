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
import p000.AbstractC0902xq;
import p000.C0208f1;
import p000.C0319i1;
import p000.C0358j1;
import p000.C0431l0;
import p000.C0432l1;
import p000.C0865wq;
import p000.C0869wu;
import p000.C0893xh;
import p000.InterfaceC0395k1;
import p000.InterfaceC0469m1;
import p000.InterfaceC0536nv;
import p000.InterfaceC0609pu;
import p000.MenuC0646qu;
import p000.hb0;
import p000.j70;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0902xq implements InterfaceC0609pu, InterfaceC0536nv {

    /* JADX INFO: renamed from: p */
    public MenuC0646qu f244p;

    /* JADX INFO: renamed from: q */
    public Context f245q;

    /* JADX INFO: renamed from: r */
    public int f246r;

    /* JADX INFO: renamed from: s */
    public boolean f247s;

    /* JADX INFO: renamed from: t */
    public C0358j1 f248t;

    /* JADX INFO: renamed from: u */
    public j70 f249u;

    /* JADX INFO: renamed from: v */
    public boolean f250v;

    /* JADX INFO: renamed from: w */
    public int f251w;

    /* JADX INFO: renamed from: x */
    public final int f252x;

    /* JADX INFO: renamed from: y */
    public final int f253y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0469m1 f254z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f252x = (int) (56.0f * f);
        this.f253y = (int) (f * 4.0f);
        this.f245q = context;
        this.f246r = 0;
    }

    /* JADX INFO: renamed from: j */
    public static C0432l1 m145j() {
        C0432l1 c0432l1 = new C0432l1(-2, -2);
        c0432l1.f2888a = false;
        ((LinearLayout.LayoutParams) c0432l1).gravity = 16;
        return c0432l1;
    }

    /* JADX INFO: renamed from: k */
    public static C0432l1 m146k(ViewGroup.LayoutParams layoutParams) {
        C0432l1 c0432l1;
        if (layoutParams == null) {
            return m145j();
        }
        if (layoutParams instanceof C0432l1) {
            C0432l1 c0432l12 = (C0432l1) layoutParams;
            c0432l1 = new C0432l1(c0432l12);
            c0432l1.f2888a = c0432l12.f2888a;
        } else {
            c0432l1 = new C0432l1(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0432l1).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0432l1).gravity = 16;
        }
        return c0432l1;
    }

    @Override // p000.InterfaceC0609pu
    /* JADX INFO: renamed from: a */
    public final boolean mo122a(C0869wu c0869wu) {
        return this.f244p.m2173q(c0869wu, null, 0);
    }

    @Override // p000.InterfaceC0536nv
    /* JADX INFO: renamed from: b */
    public final void mo123b(MenuC0646qu menuC0646qu) {
        this.f244p = menuC0646qu;
    }

    @Override // p000.AbstractC0902xq, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0432l1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.AbstractC0902xq
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C0865wq generateDefaultLayoutParams() {
        return m145j();
    }

    @Override // p000.AbstractC0902xq
    /* JADX INFO: renamed from: g */
    public final C0865wq generateLayoutParams(AttributeSet attributeSet) {
        return new C0432l1(getContext(), attributeSet);
    }

    @Override // p000.AbstractC0902xq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m145j();
    }

    @Override // p000.AbstractC0902xq, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m146k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f244p == null) {
            Context context = getContext();
            MenuC0646qu menuC0646qu = new MenuC0646qu(context);
            this.f244p = menuC0646qu;
            menuC0646qu.f3955e = new C0431l0(2, this);
            C0358j1 c0358j1 = new C0358j1(context);
            this.f248t = c0358j1;
            c0358j1.f2634l = true;
            c0358j1.f2635m = true;
            c0358j1.f2627e = new C0893xh(15);
            this.f244p.m2166b(c0358j1, this.f245q);
            C0358j1 c0358j12 = this.f248t;
            c0358j12.f2630h = this;
            this.f244p = c0358j12.f2625c;
        }
        return this.f244p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0358j1 c0358j1 = this.f248t;
        C0319i1 c0319i1 = c0358j1.f2631i;
        if (c0319i1 != null) {
            return c0319i1.getDrawable();
        }
        if (c0358j1.f2633k) {
            return c0358j1.f2632j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f246r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p000.AbstractC0902xq
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C0865wq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m146k(layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m150l(int i) {
        boolean zMo117a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0395k1)) {
            zMo117a = ((InterfaceC0395k1) childAt).mo117a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0395k1)) ? zMo117a : ((InterfaceC0395k1) childAt2).mo118b() | zMo117a;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0358j1 c0358j1 = this.f248t;
        if (c0358j1 != null) {
            c0358j1.mo977h();
            if (this.f248t.m1561j()) {
                this.f248t.m1560f();
                this.f248t.m1562l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0358j1 c0358j1 = this.f248t;
        if (c0358j1 != null) {
            c0358j1.m1560f();
            C0208f1 c0208f1 = c0358j1.f2642t;
            if (c0208f1 == null || !c0208f1.m1029b()) {
                return;
            }
            c0208f1.f1669i.dismiss();
        }
    }

    @Override // p000.AbstractC0902xq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f250v) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM1385a = hb0.m1385a(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0432l1 c0432l1 = (C0432l1) childAt.getLayoutParams();
                if (c0432l1.f2888a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m150l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM1385a) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0432l1).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0432l1).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0432l1).leftMargin) + ((LinearLayout.LayoutParams) c0432l1).rightMargin;
                    m150l(i9);
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
        if (zM1385a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0432l1 c0432l12 = (C0432l1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0432l12.f2888a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c0432l12).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0432l12).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0432l1 c0432l13 = (C0432l1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0432l13.f2888a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c0432l13).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0432l13).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p000.AbstractC0902xq, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC0646qu menuC0646qu;
        boolean z = this.f250v;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f250v = z2;
        if (z != z2) {
            this.f251w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f250v && (menuC0646qu = this.f244p) != null && size != this.f251w) {
            this.f251w = size;
            menuC0646qu.m2172p(true);
        }
        int childCount = getChildCount();
        if (!this.f250v || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0432l1 c0432l1 = (C0432l1) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0432l1).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0432l1).leftMargin = 0;
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
        int i9 = this.f252x;
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
            i3 = this.f253y;
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
                C0432l1 c0432l12 = (C0432l1) childAt.getLayoutParams();
                c0432l12.f2893f = false;
                c0432l12.f2890c = 0;
                c0432l12.f2889b = 0;
                c0432l12.f2891d = false;
                ((LinearLayout.LayoutParams) c0432l12).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0432l12).rightMargin = 0;
                c0432l12.f2892e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c0432l12.f2888a ? 1 : i10;
                C0432l1 c0432l13 = (C0432l1) childAt.getLayoutParams();
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
                c0432l13.f2891d = !c0432l13.f2888a && z6;
                c0432l13.f2889b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c0432l12.f2891d) {
                    i15++;
                }
                if (c0432l12.f2888a) {
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
                C0432l1 c0432l14 = (C0432l1) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c0432l14.f2891d) {
                    int i28 = c0432l14.f2889b;
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
                C0432l1 c0432l15 = (C0432l1) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c0432l15.f2892e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0432l15.f2889b += r11;
                    c0432l15.f2893f = r11;
                    i23--;
                } else if (c0432l15.f2889b == i29) {
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
                if ((j & 1) != 0 && !((C0432l1) getChildAt(0).getLayoutParams()).f2892e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C0432l1) getChildAt(i31).getLayoutParams()).f2892e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0432l1 c0432l16 = (C0432l1) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0432l16.f2890c = i32;
                        c0432l16.f2893f = true;
                        if (i33 == 0 && !c0432l16.f2892e) {
                            ((LinearLayout.LayoutParams) c0432l16).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c0432l16.f2888a) {
                        c0432l16.f2890c = i32;
                        c0432l16.f2893f = true;
                        ((LinearLayout.LayoutParams) c0432l16).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c0432l16).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0432l16).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C0432l1 c0432l17 = (C0432l1) childAt4.getLayoutParams();
                if (c0432l17.f2893f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0432l17.f2889b * i22) + c0432l17.f2890c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f248t.f2639q = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0469m1 interfaceC0469m1) {
        this.f254z = interfaceC0469m1;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0358j1 c0358j1 = this.f248t;
        C0319i1 c0319i1 = c0358j1.f2631i;
        if (c0319i1 != null) {
            c0319i1.setImageDrawable(drawable);
        } else {
            c0358j1.f2633k = true;
            c0358j1.f2632j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f247s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f246r != i) {
            this.f246r = i;
            if (i == 0) {
                this.f245q = getContext();
            } else {
                this.f245q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0358j1 c0358j1) {
        this.f248t = c0358j1;
        c0358j1.f2630h = this;
        this.f244p = c0358j1.f2625c;
    }

    @Override // p000.AbstractC0902xq, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0432l1(getContext(), attributeSet);
    }
}
