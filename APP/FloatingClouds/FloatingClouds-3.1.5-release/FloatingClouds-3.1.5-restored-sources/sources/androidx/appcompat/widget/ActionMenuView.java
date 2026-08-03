package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.view.menu.InterfaceC1003k;
import androidx.appcompat.widget.C1038a;
import androidx.appcompat.widget.C1039b;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import p000a.C0865uf;
import p000a.InterfaceC0595gb;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends C1039b implements C0998f.b, InterfaceC1003k {

    /* JADX INFO: renamed from: A */
    public InterfaceC1017e f3934A;

    /* JADX INFO: renamed from: p */
    public C0998f f3935p;

    /* JADX INFO: renamed from: q */
    public Context f3936q;

    /* JADX INFO: renamed from: r */
    public int f3937r;

    /* JADX INFO: renamed from: s */
    public boolean f3938s;

    /* JADX INFO: renamed from: t */
    public C1038a f3939t;

    /* JADX INFO: renamed from: u */
    public C0865uf.c f3940u;

    /* JADX INFO: renamed from: v */
    public C0998f.a f3941v;

    /* JADX INFO: renamed from: w */
    public boolean f3942w;

    /* JADX INFO: renamed from: x */
    public int f3943x;

    /* JADX INFO: renamed from: y */
    public final int f3944y;

    /* JADX INFO: renamed from: z */
    public final int f3945z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC1013a {
        /* JADX INFO: renamed from: a */
        boolean mo2299a();

        /* JADX INFO: renamed from: c */
        boolean mo2301c();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C1014b implements InterfaceC1002j.a {
        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: a */
        public final void mo818a(C0998f c0998f, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: b */
        public final boolean mo819b(C0998f c0998f) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C1015c extends C1039b.a {

        /* JADX INFO: renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f3946a;

        /* JADX INFO: renamed from: b */
        @ViewDebug.ExportedProperty
        public int f3947b;

        /* JADX INFO: renamed from: c */
        @ViewDebug.ExportedProperty
        public int f3948c;

        /* JADX INFO: renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f3949d;

        /* JADX INFO: renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f3950e;

        /* JADX INFO: renamed from: f */
        public boolean f3951f;
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C1016d implements C0998f.a {
        public C1016d() {
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo816a(C0998f c0998f, MenuItem menuItem) {
            boolean z;
            boolean zOnMenuItemSelected;
            InterfaceC1017e interfaceC1017e = ActionMenuView.this.f3934A;
            if (interfaceC1017e != null) {
                Toolbar toolbar = Toolbar.this;
                Iterator<InterfaceC0595gb> it = toolbar.f4031G.f1803b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (it.next().mo1389c(menuItem)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    zOnMenuItemSelected = true;
                } else {
                    Toolbar.InterfaceC1035h interfaceC1035h = toolbar.f4033I;
                    zOnMenuItemSelected = interfaceC1035h != null ? C0865uf.this.f3382b.onMenuItemSelected(0, menuItem) : false;
                }
                if (zOnMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: b */
        public final void mo817b(C0998f c0998f) {
            C0998f.a aVar = ActionMenuView.this.f3941v;
            if (aVar != null) {
                aVar.mo817b(c0998f);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC1017e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3944y = (int) (56.0f * f);
        this.f3945z = (int) (f * 4.0f);
        this.f3936q = context;
        this.f3937r = 0;
    }

    /* JADX INFO: renamed from: l */
    public static C1015c m2355l() {
        C1015c c1015c = new C1015c(-2, -2);
        c1015c.f3946a = false;
        ((LinearLayout.LayoutParams) c1015c).gravity = 16;
        return c1015c;
    }

    /* JADX INFO: renamed from: m */
    public static C1015c m2356m(ViewGroup.LayoutParams layoutParams) {
        C1015c c1015c;
        if (layoutParams == null) {
            return m2355l();
        }
        if (layoutParams instanceof C1015c) {
            C1015c c1015c2 = (C1015c) layoutParams;
            c1015c = new C1015c(c1015c2);
            c1015c.f3946a = c1015c2.f3946a;
        } else {
            c1015c = new C1015c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1015c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1015c).gravity = 16;
        }
        return c1015c;
    }

    @Override // androidx.appcompat.view.menu.C0998f.b
    /* JADX INFO: renamed from: a */
    public final boolean mo2304a(C1000h c1000h) {
        return this.f3935p.m2332q(c1000h, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k
    /* JADX INFO: renamed from: c */
    public final void mo2305c(C0998f c0998f) {
        this.f3935p = c0998f;
    }

    @Override // androidx.appcompat.widget.C1039b, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1015c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.C1039b, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2355l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.appcompat.widget.C1039b, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2356m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3935p == null) {
            Context context = getContext();
            C0998f c0998f = new C0998f(context);
            this.f3935p = c0998f;
            c0998f.f3788e = new C1016d();
            C1038a c1038a = new C1038a(context);
            this.f3939t = c1038a;
            c1038a.f4088l = true;
            c1038a.f4089m = true;
            InterfaceC1002j.a c1014b = this.f3940u;
            if (c1014b == null) {
                c1014b = new C1014b();
            }
            c1038a.f3728e = c1014b;
            this.f3935p.m2317b(c1038a, this.f3936q);
            C1038a c1038a2 = this.f3939t;
            c1038a2.f3731h = this;
            this.f3935p = c1038a2.f3726c;
        }
        return this.f3935p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1038a c1038a = this.f3939t;
        C1038a.d dVar = c1038a.f4085i;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (c1038a.f4087k) {
            return c1038a.f4086j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3937r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.C1039b
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C1039b.a generateDefaultLayoutParams() {
        return m2355l();
    }

    @Override // androidx.appcompat.widget.C1039b
    /* JADX INFO: renamed from: i */
    public final C1039b.a generateLayoutParams(AttributeSet attributeSet) {
        return new C1015c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C1039b
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C1039b.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2356m(layoutParams);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2360n(int i) {
        boolean zMo2299a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1013a)) {
            zMo2299a = ((InterfaceC1013a) childAt).mo2299a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1013a)) ? zMo2299a : ((InterfaceC1013a) childAt2).mo2301c() | zMo2299a;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1038a c1038a = this.f3939t;
        if (c1038a != null) {
            c1038a.mo2308g();
            if (this.f3939t.m2399k()) {
                this.f3939t.m2398f();
                this.f3939t.m2400l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1038a c1038a = this.f3939t;
        if (c1038a != null) {
            c1038a.m2398f();
            C1038a.a aVar = c1038a.f4096t;
            if (aVar == null || !aVar.m2344b()) {
                return;
            }
            aVar.f3849i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.C1039b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f3942w) {
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
                C1015c c1015c = (C1015c) childAt.getLayoutParams();
                if (c1015c.f3946a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m2360n(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1015c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1015c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1015c).leftMargin) + ((LinearLayout.LayoutParams) c1015c).rightMargin;
                    m2360n(i9);
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
                C1015c c1015c2 = (C1015c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1015c2.f3946a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c1015c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1015c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C1015c c1015c3 = (C1015c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1015c3.f3946a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c1015c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1015c3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // androidx.appcompat.widget.C1039b, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        C0998f c0998f;
        boolean z = this.f3942w;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f3942w = z2;
        if (z != z2) {
            this.f3943x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f3942w && (c0998f = this.f3935p) != null && size != this.f3943x) {
            this.f3943x = size;
            c0998f.m2331p(true);
        }
        int childCount = getChildCount();
        if (!this.f3942w || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C1015c c1015c = (C1015c) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c1015c).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1015c).leftMargin = 0;
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
        int i9 = this.f3944y;
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
            i3 = this.f3945z;
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
                C1015c c1015c2 = (C1015c) childAt.getLayoutParams();
                c1015c2.f3951f = false;
                c1015c2.f3948c = 0;
                c1015c2.f3947b = 0;
                c1015c2.f3949d = false;
                ((LinearLayout.LayoutParams) c1015c2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1015c2).rightMargin = 0;
                c1015c2.f3950e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c1015c2.f3946a ? 1 : i10;
                C1015c c1015c3 = (C1015c) childAt.getLayoutParams();
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
                c1015c3.f3949d = !c1015c3.f3946a && z6;
                c1015c3.f3947b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c1015c2.f3949d) {
                    i15++;
                }
                if (c1015c2.f3946a) {
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
                boolean z9 = z7;
                C1015c c1015c4 = (C1015c) getChildAt(i26).getLayoutParams();
                int i27 = iMax;
                if (c1015c4.f3949d) {
                    int i28 = c1015c4.f3947b;
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
                iMax = i27;
                z7 = z9;
            }
            boolean z10 = z7;
            i4 = iMax;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C1015c c1015c5 = (C1015c) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c1015c5.f3950e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1015c5.f3947b += r11;
                    c1015c5.f3951f = r11;
                    i23--;
                } else if (c1015c5.f3947b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            iMax = i4;
            z7 = z10;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C1015c) getChildAt(0).getLayoutParams()).f3950e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C1015c) getChildAt(i31).getLayoutParams()).f3950e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C1015c c1015c6 = (C1015c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1015c6.f3948c = i32;
                        c1015c6.f3951f = true;
                        if (i33 == 0 && !c1015c6.f3950e) {
                            ((LinearLayout.LayoutParams) c1015c6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c1015c6.f3946a) {
                        c1015c6.f3948c = i32;
                        c1015c6.f3951f = true;
                        ((LinearLayout.LayoutParams) c1015c6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c1015c6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1015c6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C1015c c1015c7 = (C1015c) childAt4.getLayoutParams();
                if (c1015c7.f3951f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1015c7.f3947b * i22) + c1015c7.f3948c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f3939t.f4093q = z;
    }

    public void setOnMenuItemClickListener(InterfaceC1017e interfaceC1017e) {
        this.f3934A = interfaceC1017e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1038a c1038a = this.f3939t;
        C1038a.d dVar = c1038a.f4085i;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            c1038a.f4087k = true;
            c1038a.f4086j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f3938s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f3937r != i) {
            this.f3937r = i;
            if (i == 0) {
                this.f3936q = getContext();
            } else {
                this.f3936q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1038a c1038a) {
        this.f3939t = c1038a;
        c1038a.f3731h = this;
        this.f3935p = c1038a.f3726c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // androidx.appcompat.widget.C1039b, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1015c(getContext(), attributeSet);
    }
}
