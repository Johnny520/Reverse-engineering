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
import p006D.C0095d;
import p055f.InterfaceC0777h;
import p055f.InterfaceC0778i;
import p055f.InterfaceC0784o;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p057g.AbstractC0881Q0;
import p057g.AbstractC0903g0;
import p057g.C0900f;
import p057g.C0901f0;
import p057g.C0904h;
import p057g.C0906i;
import p057g.C0910k;
import p057g.InterfaceC0908j;
import p057g.InterfaceC0912l;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0903g0 implements InterfaceC0778i {

    /* JADX INFO: renamed from: p */
    public MenuC0779j f1141p;

    /* JADX INFO: renamed from: q */
    public Context f1142q;

    /* JADX INFO: renamed from: r */
    public int f1143r;

    /* JADX INFO: renamed from: s */
    public C0906i f1144s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0784o f1145t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0777h f1146u;

    /* JADX INFO: renamed from: v */
    public boolean f1147v;

    /* JADX INFO: renamed from: w */
    public int f1148w;

    /* JADX INFO: renamed from: x */
    public final int f1149x;

    /* JADX INFO: renamed from: y */
    public final int f1150y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0912l f1151z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1149x = (int) (56.0f * f2);
        this.f1150y = (int) (f2 * 4.0f);
        this.f1142q = context;
        this.f1143r = 0;
    }

    /* JADX INFO: renamed from: i */
    public static C0910k m1124i() {
        C0910k c0910k = new C0910k(-2, -2);
        c0910k.f3225a = false;
        ((LinearLayout.LayoutParams) c0910k).gravity = 16;
        return c0910k;
    }

    /* JADX INFO: renamed from: j */
    public static C0910k m1125j(ViewGroup.LayoutParams layoutParams) {
        C0910k c0910k;
        if (layoutParams == null) {
            return m1124i();
        }
        if (layoutParams instanceof C0910k) {
            C0910k c0910k2 = (C0910k) layoutParams;
            c0910k = new C0910k(c0910k2);
            c0910k.f3225a = c0910k2.f3225a;
        } else {
            c0910k = new C0910k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0910k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0910k).gravity = 16;
        }
        return c0910k;
    }

    @Override // p055f.InterfaceC0778i
    /* JADX INFO: renamed from: a */
    public final boolean mo1116a(MenuItemC0780k menuItemC0780k) {
        return this.f1141p.m2010p(menuItemC0780k, null, 0);
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0910k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p057g.AbstractC0903g0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C0901f0 generateDefaultLayoutParams() {
        return m1124i();
    }

    @Override // p057g.AbstractC0903g0
    /* JADX INFO: renamed from: f */
    public final C0901f0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0910k(getContext(), attributeSet);
    }

    @Override // p057g.AbstractC0903g0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C0901f0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1125j(layoutParams);
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1124i();
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1125j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1141p == null) {
            Context context = getContext();
            MenuC0779j menuC0779j = new MenuC0779j(context);
            this.f1141p = menuC0779j;
            menuC0779j.f2789e = new C0095d(18, this);
            C0906i c0906i = new C0906i(context);
            this.f1144s = c0906i;
            c0906i.f3213k = true;
            c0906i.f3214l = true;
            InterfaceC0784o c1121e = this.f1145t;
            if (c1121e == null) {
                c1121e = new C1121e(29);
            }
            c0906i.f3207e = c1121e;
            this.f1141p.m1996b(c0906i, this.f1142q);
            C0906i c0906i2 = this.f1144s;
            c0906i2.f3209g = this;
            this.f1141p = c0906i2.f3205c;
        }
        return this.f1141p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0906i c0906i = this.f1144s;
        C0904h c0904h = c0906i.f3210h;
        if (c0904h != null) {
            return c0904h.getDrawable();
        }
        if (c0906i.f3212j) {
            return c0906i.f3211i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1143r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1129k(int i2) {
        boolean zMo1112b = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0908j)) {
            zMo1112b = ((InterfaceC0908j) childAt).mo1112b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0908j)) ? zMo1112b : zMo1112b | ((InterfaceC0908j) childAt2).mo1111a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0906i c0906i = this.f1144s;
        if (c0906i != null) {
            c0906i.mo1977b();
            C0900f c0900f = this.f1144s.f3220r;
            if (c0900f == null || !c0900f.m2027b()) {
                return;
            }
            this.f1144s.m2235e();
            this.f1144s.m2236f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0906i c0906i = this.f1144s;
        if (c0906i != null) {
            c0906i.m2235e();
            C0900f c0900f = c0906i.f3221s;
            if (c0900f == null || !c0900f.m2027b()) {
                return;
            }
            c0900f.f2844j.dismiss();
        }
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f1147v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = AbstractC0881Q0.f3149a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0910k c0910k = (C0910k) childAt.getLayoutParams();
                if (c0910k.f3225a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1129k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0910k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0910k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0910k).leftMargin) + ((LinearLayout.LayoutParams) c0910k).rightMargin;
                    m1129k(i10);
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
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0910k c0910k2 = (C0910k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0910k2.f3225a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0910k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0910k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0910k c0910k3 = (C0910k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0910k3.f3225a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c0910k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0910k3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // p057g.AbstractC0903g0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r1;
        int i11;
        int i12;
        int i13;
        MenuC0779j menuC0779j;
        boolean z3 = this.f1147v;
        boolean z4 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1147v = z4;
        if (z3 != z4) {
            this.f1148w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1147v && (menuC0779j = this.f1141p) != null && size != this.f1148w) {
            this.f1148w = size;
            menuC0779j.m2009o(true);
        }
        int childCount = getChildCount();
        if (!this.f1147v || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                C0910k c0910k = (C0910k) getChildAt(i14).getLayoutParams();
                ((LinearLayout.LayoutParams) c0910k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0910k).leftMargin = 0;
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
        int i15 = size2 - paddingRight;
        int i16 = this.f1149x;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int iMax = 0;
        int i21 = 0;
        boolean z5 = false;
        int i22 = 0;
        int iMax2 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f1150y;
            if (i21 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i21);
            int i23 = size3;
            if (childAt.getVisibility() == 8) {
                i11 = i15;
                i12 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i24 = i20 + 1;
                if (z6) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0910k c0910k2 = (C0910k) childAt.getLayoutParams();
                c0910k2.f3230f = false;
                c0910k2.f3227c = 0;
                c0910k2.f3226b = 0;
                c0910k2.f3228d = false;
                ((LinearLayout.LayoutParams) c0910k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0910k2).rightMargin = 0;
                c0910k2.f3229e = z6 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i25 = c0910k2.f3225a ? 1 : i17;
                C0910k c0910k3 = (C0910k) childAt.getLayoutParams();
                i11 = i15;
                i12 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i25 <= 0 || (z7 && i25 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z7 && i13 < 2) {
                        i13 = 2;
                    }
                }
                c0910k3.f3228d = !c0910k3.f3225a && z7;
                c0910k3.f3226b = i13;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i13);
                if (c0910k2.f3228d) {
                    i22++;
                }
                if (c0910k2.f3225a) {
                    z5 = true;
                }
                i17 -= i13;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i13 == 1) {
                    j2 |= (long) (1 << i21);
                }
                i20 = i24;
            }
            i21++;
            size3 = i23;
            paddingBottom = i12;
            i15 = i11;
        }
        int i26 = i15;
        int i27 = size3;
        int i28 = iMax2;
        boolean z8 = z5 && i20 == 2;
        boolean z9 = false;
        while (i22 > 0 && i17 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j3 = 0;
            while (i31 < childCount2) {
                int i32 = i28;
                C0910k c0910k4 = (C0910k) getChildAt(i31).getLayoutParams();
                boolean z10 = z9;
                if (c0910k4.f3228d) {
                    int i33 = c0910k4.f3226b;
                    if (i33 < i29) {
                        j3 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        i30++;
                        j3 |= 1 << i31;
                    }
                }
                i31++;
                z9 = z10;
                i28 = i32;
            }
            i6 = i28;
            z2 = z9;
            j2 |= j3;
            if (i30 > i17) {
                i5 = mode;
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C0910k c0910k5 = (C0910k) childAt2.getLayoutParams();
                int i36 = mode;
                int i37 = childMeasureSpec;
                int i38 = childCount2;
                long j4 = 1 << i35;
                if ((j3 & j4) != 0) {
                    if (z8 && c0910k5.f3229e) {
                        r1 = 1;
                        r1 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i4 + i19, 0, i4, 0);
                        }
                    } else {
                        r1 = 1;
                    }
                    c0910k5.f3226b += r1;
                    c0910k5.f3230f = r1;
                    i17--;
                } else if (c0910k5.f3226b == i34) {
                    j2 |= j4;
                }
                i35++;
                childMeasureSpec = i37;
                mode = i36;
                childCount2 = i38;
            }
            i28 = i6;
            z9 = true;
        }
        i5 = mode;
        i6 = i28;
        z2 = z9;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z11 = !z5 && i20 == 1;
        if (i17 <= 0 || j2 == 0 || (i17 >= i20 - 1 && !z11 && iMax <= 1)) {
            i7 = i40;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z11) {
                if ((j2 & 1) != 0 && !((C0910k) getChildAt(0).getLayoutParams()).f3229e) {
                    fBitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & ((long) (1 << i41))) != 0 && !((C0910k) getChildAt(i41).getLayoutParams()).f3229e) {
                    fBitCount -= 0.5f;
                }
            }
            int i42 = fBitCount > 0.0f ? (int) ((i17 * i19) / fBitCount) : 0;
            i7 = i40;
            for (int i43 = 0; i43 < i7; i43++) {
                if ((j2 & ((long) (1 << i43))) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0910k c0910k6 = (C0910k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0910k6.f3227c = i42;
                        c0910k6.f3230f = true;
                        if (i43 == 0 && !c0910k6.f3229e) {
                            ((LinearLayout.LayoutParams) c0910k6).leftMargin = (-i42) / 2;
                        }
                        z2 = true;
                    } else if (c0910k6.f3225a) {
                        c0910k6.f3227c = i42;
                        c0910k6.f3230f = true;
                        ((LinearLayout.LayoutParams) c0910k6).rightMargin = (-i42) / 2;
                        z2 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) c0910k6).leftMargin = i42 / 2;
                        }
                        if (i43 != i7 - 1) {
                            ((LinearLayout.LayoutParams) c0910k6).rightMargin = i42 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i44 = 0;
            while (i44 < i7) {
                View childAt4 = getChildAt(i44);
                C0910k c0910k7 = (C0910k) childAt4.getLayoutParams();
                if (c0910k7.f3230f) {
                    i10 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0910k7.f3226b * i19) + c0910k7.f3227c, 1073741824), i10);
                } else {
                    i10 = i39;
                }
                i44++;
                i39 = i10;
            }
        }
        if (i5 != 1073741824) {
            i9 = i26;
            i8 = i6;
        } else {
            i8 = i27;
            i9 = i26;
        }
        setMeasuredDimension(i9, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1144s.f3218p = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0912l interfaceC0912l) {
        this.f1151z = interfaceC0912l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0906i c0906i = this.f1144s;
        C0904h c0904h = c0906i.f3210h;
        if (c0904h != null) {
            c0904h.setImageDrawable(drawable);
        } else {
            c0906i.f3212j = true;
            c0906i.f3211i = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
    }

    public void setPopupTheme(int i2) {
        if (this.f1143r != i2) {
            this.f1143r = i2;
            if (i2 == 0) {
                this.f1142q = getContext();
            } else {
                this.f1142q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0906i c0906i) {
        this.f1144s = c0906i;
        c0906i.f3209g = this;
        this.f1141p = c0906i.f3205c;
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0910k(getContext(), attributeSet);
    }
}
