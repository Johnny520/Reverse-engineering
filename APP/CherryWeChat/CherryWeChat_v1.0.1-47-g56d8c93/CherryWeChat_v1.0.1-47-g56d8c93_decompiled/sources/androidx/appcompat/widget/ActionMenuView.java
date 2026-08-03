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
import p000.AbstractC1465go;
import p000.C0087C0;
import p000.C0130D0;
import p000.C0132D2;
import p000.C0216F0;
import p000.C1037Y5;
import p000.C1421fo;
import p000.C1456gf;
import p000.C2427qr;
import p000.C2781z0;
import p000.InterfaceC0120Cr;
import p000.InterfaceC0173E0;
import p000.InterfaceC0259G0;
import p000.InterfaceC0292Gr;
import p000.InterfaceC2113jr;
import p000.InterfaceC2161kr;
import p000.MenuC2204lr;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1465go implements InterfaceC2161kr, InterfaceC0292Gr {

    /* JADX INFO: renamed from: A */
    public InterfaceC0259G0 f3776A;

    /* JADX INFO: renamed from: p */
    public MenuC2204lr f3777p;

    /* JADX INFO: renamed from: q */
    public Context f3778q;

    /* JADX INFO: renamed from: r */
    public int f3779r;

    /* JADX INFO: renamed from: s */
    public boolean f3780s;

    /* JADX INFO: renamed from: t */
    public C0130D0 f3781t;

    /* JADX INFO: renamed from: u */
    public C1037Y5 f3782u;

    /* JADX INFO: renamed from: v */
    public InterfaceC2113jr f3783v;

    /* JADX INFO: renamed from: w */
    public boolean f3784w;

    /* JADX INFO: renamed from: x */
    public int f3785x;

    /* JADX INFO: renamed from: y */
    public final int f3786y;

    /* JADX INFO: renamed from: z */
    public final int f3787z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3786y = (int) (56.0f * f);
        this.f3787z = (int) (f * 4.0f);
        this.f3778q = context;
        this.f3779r = 0;
    }

    /* JADX INFO: renamed from: j */
    public static C0216F0 m2090j() {
        C0216F0 c0216f0 = new C0216F0(-2, -2);
        c0216f0.f635a = false;
        ((LinearLayout.LayoutParams) c0216f0).gravity = 16;
        return c0216f0;
    }

    /* JADX INFO: renamed from: k */
    public static C0216F0 m2091k(ViewGroup.LayoutParams layoutParams) {
        C0216F0 c0216f0;
        if (layoutParams == null) {
            return m2090j();
        }
        if (layoutParams instanceof C0216F0) {
            C0216F0 c0216f02 = (C0216F0) layoutParams;
            c0216f0 = new C0216F0(c0216f02);
            c0216f0.f635a = c0216f02.f635a;
        } else {
            c0216f0 = new C0216F0(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0216f0).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0216f0).gravity = 16;
        }
        return c0216f0;
    }

    @Override // p000.InterfaceC2161kr
    /* JADX INFO: renamed from: a */
    public final boolean mo2074a(C2427qr c2427qr) {
        return this.f3777p.m4436q(c2427qr, null, 0);
    }

    @Override // p000.InterfaceC0292Gr
    /* JADX INFO: renamed from: b */
    public final void mo591b(MenuC2204lr menuC2204lr) {
        this.f3777p = menuC2204lr;
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0216F0;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.AbstractC1465go
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C1421fo generateDefaultLayoutParams() {
        return m2090j();
    }

    @Override // p000.AbstractC1465go
    /* JADX INFO: renamed from: g */
    public final C1421fo generateLayoutParams(AttributeSet attributeSet) {
        return new C0216F0(getContext(), attributeSet);
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2090j();
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2091k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3777p == null) {
            Context context = getContext();
            MenuC2204lr menuC2204lr = new MenuC2204lr(context);
            this.f3777p = menuC2204lr;
            menuC2204lr.f7664e = new C0132D2(4, this);
            C0130D0 c0130d0 = new C0130D0(context);
            this.f3781t = c0130d0;
            c0130d0.f313l = true;
            c0130d0.f314m = true;
            InterfaceC0120Cr c1456gf = this.f3782u;
            if (c1456gf == null) {
                c1456gf = new C1456gf(19);
            }
            c0130d0.f306e = c1456gf;
            this.f3777p.m4429b(c0130d0, this.f3778q);
            C0130D0 c0130d02 = this.f3781t;
            c0130d02.f309h = this;
            this.f3777p = c0130d02.f304c;
        }
        return this.f3777p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0130D0 c0130d0 = this.f3781t;
        C0087C0 c0087c0 = c0130d0.f310i;
        if (c0087c0 != null) {
            return c0087c0.getDrawable();
        }
        if (c0130d0.f312k) {
            return c0130d0.f311j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3779r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p000.AbstractC1465go
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C1421fo generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2091k(layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2095l(int i) {
        boolean zMo135a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0173E0)) {
            zMo135a = ((InterfaceC0173E0) childAt).mo135a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0173E0)) ? zMo135a : ((InterfaceC0173E0) childAt2).mo136b() | zMo135a;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0130D0 c0130d0 = this.f3781t;
        if (c0130d0 != null) {
            c0130d0.mo218g();
            if (this.f3781t.m219h()) {
                this.f3781t.m214c();
                this.f3781t.m223l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0130D0 c0130d0 = this.f3781t;
        if (c0130d0 != null) {
            c0130d0.m214c();
            C2781z0 c2781z0 = c0130d0.f321t;
            if (c2781z0 == null || !c2781z0.m5291b()) {
                return;
            }
            c2781z0.f9323i.dismiss();
        }
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f3784w) {
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
                C0216F0 c0216f0 = (C0216F0) childAt.getLayoutParams();
                if (c0216f0.f635a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m2095l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0216f0).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0216f0).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0216f0).leftMargin) + ((LinearLayout.LayoutParams) c0216f0).rightMargin;
                    m2095l(i9);
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
                C0216F0 c0216f02 = (C0216F0) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0216f02.f635a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c0216f02).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0216f02).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0216F0 c0216f03 = (C0216F0) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0216f03.f635a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c0216f03).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0216f03).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p000.AbstractC1465go, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC2204lr menuC2204lr;
        boolean z = this.f3784w;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f3784w = z2;
        if (z != z2) {
            this.f3785x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f3784w && (menuC2204lr = this.f3777p) != null && size != this.f3785x) {
            this.f3785x = size;
            menuC2204lr.m4435p(true);
        }
        int childCount = getChildCount();
        if (!this.f3784w || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0216F0 c0216f0 = (C0216F0) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0216f0).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0216f0).leftMargin = 0;
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
        int i9 = this.f3786y;
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
            i3 = this.f3787z;
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
                C0216F0 c0216f02 = (C0216F0) childAt.getLayoutParams();
                c0216f02.f640f = false;
                c0216f02.f637c = 0;
                c0216f02.f636b = 0;
                c0216f02.f638d = false;
                ((LinearLayout.LayoutParams) c0216f02).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0216f02).rightMargin = 0;
                c0216f02.f639e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c0216f02.f635a ? 1 : i10;
                C0216F0 c0216f03 = (C0216F0) childAt.getLayoutParams();
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
                c0216f03.f638d = !c0216f03.f635a && z6;
                c0216f03.f636b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c0216f02.f638d) {
                    i15++;
                }
                if (c0216f02.f635a) {
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
                C0216F0 c0216f04 = (C0216F0) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c0216f04.f638d) {
                    int i28 = c0216f04.f636b;
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
                C0216F0 c0216f05 = (C0216F0) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c0216f05.f639e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0216f05.f636b += r11;
                    c0216f05.f640f = r11;
                    i23--;
                } else if (c0216f05.f636b == i29) {
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
                if ((j & 1) != 0 && !((C0216F0) getChildAt(0).getLayoutParams()).f639e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C0216F0) getChildAt(i31).getLayoutParams()).f639e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0216F0 c0216f06 = (C0216F0) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0216f06.f637c = i32;
                        c0216f06.f640f = true;
                        if (i33 == 0 && !c0216f06.f639e) {
                            ((LinearLayout.LayoutParams) c0216f06).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c0216f06.f635a) {
                        c0216f06.f637c = i32;
                        c0216f06.f640f = true;
                        ((LinearLayout.LayoutParams) c0216f06).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c0216f06).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0216f06).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C0216F0 c0216f07 = (C0216F0) childAt4.getLayoutParams();
                if (c0216f07.f640f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0216f07.f636b * i22) + c0216f07.f637c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f3781t.f318q = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0259G0 interfaceC0259G0) {
        this.f3776A = interfaceC0259G0;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0130D0 c0130d0 = this.f3781t;
        C0087C0 c0087c0 = c0130d0.f310i;
        if (c0087c0 != null) {
            c0087c0.setImageDrawable(drawable);
        } else {
            c0130d0.f312k = true;
            c0130d0.f311j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f3780s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f3779r != i) {
            this.f3779r = i;
            if (i == 0) {
                this.f3778q = getContext();
            } else {
                this.f3778q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0130D0 c0130d0) {
        this.f3781t = c0130d0;
        c0130d0.f309h = this;
        this.f3777p = c0130d0.f304c;
    }

    @Override // p000.AbstractC1465go, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0216F0(getContext(), attributeSet);
    }
}
