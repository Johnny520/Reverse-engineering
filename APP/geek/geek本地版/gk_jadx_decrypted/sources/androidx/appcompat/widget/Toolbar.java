package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0199et;
import p000.AbstractC0222ff;
import p000.AbstractC0910xy;
import p000.C0005a4;
import p000.C0138d4;
import p000.C0249g5;
import p000.C0358j1;
import p000.C0572ou;
import p000.C0659r5;
import p000.C0916y3;
import p000.InterfaceC0296hf;
import p000.MenuC0424ku;
import p000.RunnableC0919y6;
import p000.ViewOnClickListenerC0609pt;
import p000.ViewOnClickListenerC0876x0;
import p000.c70;
import p000.cb0;
import p000.d70;
import p000.f70;
import p000.g70;
import p000.h70;
import p000.i10;
import p000.i70;
import p000.ja0;
import p000.k50;
import p000.k70;
import p000.l70;
import p000.t90;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f349A;

    /* JADX INFO: renamed from: B */
    public boolean f350B;

    /* JADX INFO: renamed from: C */
    public boolean f351C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f352D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f353E;

    /* JADX INFO: renamed from: F */
    public final int[] f354F;

    /* JADX INFO: renamed from: G */
    public final C0138d4 f355G;

    /* JADX INFO: renamed from: H */
    public ArrayList f356H;

    /* JADX INFO: renamed from: I */
    public final d70 f357I;

    /* JADX INFO: renamed from: J */
    public k70 f358J;

    /* JADX INFO: renamed from: K */
    public C0358j1 f359K;

    /* JADX INFO: renamed from: L */
    public f70 f360L;

    /* JADX INFO: renamed from: M */
    public boolean f361M;

    /* JADX INFO: renamed from: N */
    public OnBackInvokedCallback f362N;

    /* JADX INFO: renamed from: O */
    public OnBackInvokedDispatcher f363O;

    /* JADX INFO: renamed from: P */
    public boolean f364P;

    /* JADX INFO: renamed from: Q */
    public final RunnableC0919y6 f365Q;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f366a;

    /* JADX INFO: renamed from: b */
    public C0249g5 f367b;

    /* JADX INFO: renamed from: c */
    public C0249g5 f368c;

    /* JADX INFO: renamed from: d */
    public C0916y3 f369d;

    /* JADX INFO: renamed from: e */
    public C0005a4 f370e;

    /* JADX INFO: renamed from: f */
    public final Drawable f371f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f372g;

    /* JADX INFO: renamed from: h */
    public C0916y3 f373h;

    /* JADX INFO: renamed from: i */
    public View f374i;

    /* JADX INFO: renamed from: j */
    public Context f375j;

    /* JADX INFO: renamed from: k */
    public int f376k;

    /* JADX INFO: renamed from: l */
    public int f377l;

    /* JADX INFO: renamed from: m */
    public int f378m;

    /* JADX INFO: renamed from: n */
    public final int f379n;

    /* JADX INFO: renamed from: o */
    public final int f380o;

    /* JADX INFO: renamed from: p */
    public int f381p;

    /* JADX INFO: renamed from: q */
    public int f382q;

    /* JADX INFO: renamed from: r */
    public int f383r;

    /* JADX INFO: renamed from: s */
    public int f384s;

    /* JADX INFO: renamed from: t */
    public i10 f385t;

    /* JADX INFO: renamed from: u */
    public int f386u;

    /* JADX INFO: renamed from: v */
    public int f387v;

    /* JADX INFO: renamed from: w */
    public final int f388w;

    /* JADX INFO: renamed from: x */
    public CharSequence f389x;

    /* JADX INFO: renamed from: y */
    public CharSequence f390y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f391z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k50(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static g70 m182h() {
        g70 g70Var = new g70(-2, -2);
        g70Var.f2034b = 0;
        g70Var.f2033a = 8388627;
        return g70Var;
    }

    /* JADX INFO: renamed from: i */
    public static g70 m183i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof g70;
        if (z) {
            g70 g70Var = (g70) layoutParams;
            g70 g70Var2 = new g70(g70Var);
            g70Var2.f2034b = 0;
            g70Var2.f2034b = g70Var.f2034b;
            return g70Var2;
        }
        if (z) {
            g70 g70Var3 = new g70((g70) layoutParams);
            g70Var3.f2034b = 0;
            return g70Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            g70 g70Var4 = new g70(layoutParams);
            g70Var4.f2034b = 0;
            return g70Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        g70 g70Var5 = new g70(marginLayoutParams);
        g70Var5.f2034b = 0;
        ((ViewGroup.MarginLayoutParams) g70Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) g70Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) g70Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) g70Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return g70Var5;
    }

    /* JADX INFO: renamed from: k */
    public static int m184k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0199et.m1070b(marginLayoutParams) + AbstractC0199et.m1071c(marginLayoutParams);
    }

    /* JADX INFO: renamed from: l */
    public static int m185l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m186a(ArrayList arrayList, int i) {
        WeakHashMap weakHashMap = ja0.f2600a;
        boolean z = t90.m2367d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, t90.m2367d(this));
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                g70 g70Var = (g70) childAt.getLayoutParams();
                if (g70Var.f2034b == 0 && m201t(childAt)) {
                    int i3 = g70Var.f2033a;
                    WeakHashMap weakHashMap2 = ja0.f2600a;
                    int iM2367d = t90.m2367d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, iM2367d) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = iM2367d == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            g70 g70Var2 = (g70) childAt2.getLayoutParams();
            if (g70Var2.f2034b == 0 && m201t(childAt2)) {
                int i5 = g70Var2.f2033a;
                WeakHashMap weakHashMap3 = ja0.f2600a;
                int iM2367d2 = t90.m2367d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, iM2367d2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = iM2367d2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m187b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g70 g70VarM182h = layoutParams == null ? m182h() : !checkLayoutParams(layoutParams) ? m183i(layoutParams) : (g70) layoutParams;
        g70VarM182h.f2034b = 1;
        if (!z || this.f374i == null) {
            addView(view, g70VarM182h);
        } else {
            view.setLayoutParams(g70VarM182h);
            this.f353E.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m188c() {
        if (this.f373h == null) {
            C0916y3 c0916y3 = new C0916y3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f373h = c0916y3;
            c0916y3.setImageDrawable(this.f371f);
            this.f373h.setContentDescription(this.f372g);
            g70 g70VarM182h = m182h();
            g70VarM182h.f2033a = (this.f379n & 112) | 8388611;
            g70VarM182h.f2034b = 2;
            this.f373h.setLayoutParams(g70VarM182h);
            this.f373h.setOnClickListener(new ViewOnClickListenerC0876x0(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g70);
    }

    /* JADX INFO: renamed from: d */
    public final void m189d() {
        if (this.f385t == null) {
            i10 i10Var = new i10();
            i10Var.f2328a = 0;
            i10Var.f2329b = 0;
            i10Var.f2330c = Integer.MIN_VALUE;
            i10Var.f2331d = Integer.MIN_VALUE;
            i10Var.f2332e = 0;
            i10Var.f2333f = 0;
            i10Var.f2334g = false;
            i10Var.f2335h = false;
            this.f385t = i10Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m190e() {
        m191f();
        ActionMenuView actionMenuView = this.f366a;
        if (actionMenuView.f281p == null) {
            MenuC0424ku menuC0424ku = (MenuC0424ku) actionMenuView.getMenu();
            if (this.f360L == null) {
                this.f360L = new f70(this);
            }
            this.f366a.setExpandedActionViewsExclusive(true);
            menuC0424ku.m1717b(this.f360L, this.f375j);
            m202u();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m191f() {
        if (this.f366a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f366a = actionMenuView;
            actionMenuView.setPopupTheme(this.f376k);
            this.f366a.setOnMenuItemClickListener(this.f357I);
            ActionMenuView actionMenuView2 = this.f366a;
            d70 d70Var = new d70(this);
            actionMenuView2.getClass();
            actionMenuView2.f286u = d70Var;
            g70 g70VarM182h = m182h();
            g70VarM182h.f2033a = (this.f379n & 112) | 8388613;
            this.f366a.setLayoutParams(g70VarM182h);
            m187b(this.f366a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m192g() {
        if (this.f369d == null) {
            this.f369d = new C0916y3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g70 g70VarM182h = m182h();
            g70VarM182h.f2033a = (this.f379n & 112) | 8388611;
            this.f369d.setLayoutParams(g70VarM182h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m182h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m183i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0916y3 c0916y3 = this.f373h;
        if (c0916y3 != null) {
            return c0916y3.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0916y3 c0916y3 = this.f373h;
        if (c0916y3 != null) {
            return c0916y3.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        i10 i10Var = this.f385t;
        if (i10Var != null) {
            return i10Var.f2334g ? i10Var.f2328a : i10Var.f2329b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f387v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        i10 i10Var = this.f385t;
        if (i10Var != null) {
            return i10Var.f2328a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        i10 i10Var = this.f385t;
        if (i10Var != null) {
            return i10Var.f2329b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        i10 i10Var = this.f385t;
        if (i10Var != null) {
            return i10Var.f2334g ? i10Var.f2329b : i10Var.f2328a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f386u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0424ku menuC0424ku;
        ActionMenuView actionMenuView = this.f366a;
        return (actionMenuView == null || (menuC0424ku = actionMenuView.f281p) == null || !menuC0424ku.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f387v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = ja0.f2600a;
        return t90.m2367d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = ja0.f2600a;
        return t90.m2367d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f386u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0005a4 c0005a4 = this.f370e;
        if (c0005a4 != null) {
            return c0005a4.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0005a4 c0005a4 = this.f370e;
        if (c0005a4 != null) {
            return c0005a4.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m190e();
        return this.f366a.getMenu();
    }

    public View getNavButtonView() {
        return this.f369d;
    }

    public CharSequence getNavigationContentDescription() {
        C0916y3 c0916y3 = this.f369d;
        if (c0916y3 != null) {
            return c0916y3.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0916y3 c0916y3 = this.f369d;
        if (c0916y3 != null) {
            return c0916y3.getDrawable();
        }
        return null;
    }

    public C0358j1 getOuterActionMenuPresenter() {
        return this.f359K;
    }

    public Drawable getOverflowIcon() {
        m190e();
        return this.f366a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f375j;
    }

    public int getPopupTheme() {
        return this.f376k;
    }

    public CharSequence getSubtitle() {
        return this.f390y;
    }

    public final TextView getSubtitleTextView() {
        return this.f368c;
    }

    public CharSequence getTitle() {
        return this.f389x;
    }

    public int getTitleMarginBottom() {
        return this.f384s;
    }

    public int getTitleMarginEnd() {
        return this.f382q;
    }

    public int getTitleMarginStart() {
        return this.f381p;
    }

    public int getTitleMarginTop() {
        return this.f383r;
    }

    public final TextView getTitleTextView() {
        return this.f367b;
    }

    public InterfaceC0296hf getWrapper() {
        Drawable drawable;
        if (this.f358J == null) {
            k70 k70Var = new k70();
            k70Var.f2730n = 0;
            k70Var.f2717a = this;
            k70Var.f2724h = getTitle();
            k70Var.f2725i = getSubtitle();
            k70Var.f2723g = k70Var.f2724h != null;
            k70Var.f2722f = getNavigationIcon();
            C0659r5 c0659r5M2219y = C0659r5.m2219y(getContext(), null, AbstractC0910xy.f5217a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
            k70Var.f2731o = c0659r5M2219y.m2234m(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                k70Var.f2723g = true;
                k70Var.f2724h = text;
                if ((k70Var.f2718b & 8) != 0) {
                    setTitle(text);
                    if (k70Var.f2723g) {
                        ja0.m1576m(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                k70Var.f2725i = text2;
                if ((k70Var.f2718b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM2234m = c0659r5M2219y.m2234m(20);
            if (drawableM2234m != null) {
                k70Var.f2721e = drawableM2234m;
                k70Var.m1642c();
            }
            Drawable drawableM2234m2 = c0659r5M2219y.m2234m(17);
            if (drawableM2234m2 != null) {
                k70Var.f2720d = drawableM2234m2;
                k70Var.m1642c();
            }
            if (k70Var.f2722f == null && (drawable = k70Var.f2731o) != null) {
                k70Var.f2722f = drawable;
                if ((k70Var.f2718b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            k70Var.m1640a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = k70Var.f2719c;
                if (view != null && (k70Var.f2718b & 16) != 0) {
                    removeView(view);
                }
                k70Var.f2719c = viewInflate;
                if (viewInflate != null && (k70Var.f2718b & 16) != 0) {
                    addView(viewInflate);
                }
                k70Var.m1640a(k70Var.f2718b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m189d();
                this.f385t.m1384a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f377l = resourceId2;
                C0249g5 c0249g5 = this.f367b;
                if (c0249g5 != null) {
                    c0249g5.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f378m = resourceId3;
                C0249g5 c0249g52 = this.f368c;
                if (c0249g52 != null) {
                    c0249g52.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0659r5M2219y.m2245z();
            if (R.string.abc_action_bar_up_description != k70Var.f2730n) {
                k70Var.f2730n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = k70Var.f2730n;
                    k70Var.f2726j = i != 0 ? getContext().getString(i) : null;
                    k70Var.m1641b();
                }
            }
            k70Var.f2726j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0609pt(k70Var));
            this.f358J = k70Var;
        }
        return this.f358J;
    }

    /* JADX INFO: renamed from: j */
    public final int m193j(View view, int i) {
        g70 g70Var = (g70) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = g70Var.f2033a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f388w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) g70Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) g70Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) g70Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public void mo194m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* JADX INFO: renamed from: n */
    public final void m195n() {
        ArrayList arrayList = this.f356H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f355G.f1364c).iterator();
        if (it.hasNext()) {
            throw z30.m2763h(it);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f356H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m196o(View view) {
        return view.getParent() == this || this.f353E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m202u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f365Q);
        m202u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f351C = false;
        }
        if (!this.f351C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f351C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f351C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iM184k;
        int iMax;
        int iCombineMeasuredStates;
        int iM184k2;
        int iM185l;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zM658a = cb0.m658a(this);
        int i3 = !zM658a ? 1 : 0;
        int i4 = 0;
        if (m201t(this.f369d)) {
            m200s(this.f369d, i, 0, i2, this.f380o);
            iM184k = m184k(this.f369d) + this.f369d.getMeasuredWidth();
            iMax = Math.max(0, m185l(this.f369d) + this.f369d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f369d.getMeasuredState());
        } else {
            iM184k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m201t(this.f373h)) {
            m200s(this.f373h, i, 0, i2, this.f380o);
            iM184k = m184k(this.f373h) + this.f373h.getMeasuredWidth();
            iMax = Math.max(iMax, m185l(this.f373h) + this.f373h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f373h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM184k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM184k);
        int[] iArr = this.f354F;
        iArr[zM658a ? 1 : 0] = iMax4;
        if (m201t(this.f366a)) {
            m200s(this.f366a, i, iMax3, i2, this.f380o);
            iM184k2 = m184k(this.f366a) + this.f366a.getMeasuredWidth();
            iMax = Math.max(iMax, m185l(this.f366a) + this.f366a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f366a.getMeasuredState());
        } else {
            iM184k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM184k2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iM184k2);
        if (m201t(this.f374i)) {
            iMax5 += m199r(this.f374i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m185l(this.f374i) + this.f374i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f374i.getMeasuredState());
        }
        if (m201t(this.f370e)) {
            iMax5 += m199r(this.f370e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m185l(this.f370e) + this.f370e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f370e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((g70) childAt.getLayoutParams()).f2034b == 0 && m201t(childAt)) {
                iMax5 += m199r(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m185l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.f383r + this.f384s;
        int i8 = this.f381p + this.f382q;
        if (m201t(this.f367b)) {
            m199r(this.f367b, i, i6 + i8, i2, i7, iArr);
            int iM184k3 = m184k(this.f367b) + this.f367b.getMeasuredWidth();
            iM185l = m185l(this.f367b) + this.f367b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f367b.getMeasuredState());
            iMax2 = iM184k3;
        } else {
            iM185l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m201t(this.f368c)) {
            iMax2 = Math.max(iMax2, m199r(this.f368c, i, i6 + i8, i2, i7 + iM185l, iArr));
            iM185l += m185l(this.f368c) + this.f368c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f368c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM185l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f361M) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (m201t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i70)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i70 i70Var = (i70) parcelable;
        super.onRestoreInstanceState(i70Var.f1344a);
        ActionMenuView actionMenuView = this.f366a;
        MenuC0424ku menuC0424ku = actionMenuView != null ? actionMenuView.f281p : null;
        int i = i70Var.f2361c;
        if (i != 0 && this.f360L != null && menuC0424ku != null && (menuItemFindItem = menuC0424ku.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (i70Var.f2362d) {
            RunnableC0919y6 runnableC0919y6 = this.f365Q;
            removeCallbacks(runnableC0919y6);
            post(runnableC0919y6);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m189d();
        i10 i10Var = this.f385t;
        boolean z = i == 1;
        if (z == i10Var.f2334g) {
            return;
        }
        i10Var.f2334g = z;
        if (!i10Var.f2335h) {
            i10Var.f2328a = i10Var.f2332e;
            i10Var.f2329b = i10Var.f2333f;
            return;
        }
        if (z) {
            int i2 = i10Var.f2331d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = i10Var.f2332e;
            }
            i10Var.f2328a = i2;
            int i3 = i10Var.f2330c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = i10Var.f2333f;
            }
            i10Var.f2329b = i3;
            return;
        }
        int i4 = i10Var.f2330c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = i10Var.f2332e;
        }
        i10Var.f2328a = i4;
        int i5 = i10Var.f2331d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = i10Var.f2333f;
        }
        i10Var.f2329b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0358j1 c0358j1;
        C0572ou c0572ou;
        i70 i70Var = new i70(super.onSaveInstanceState());
        f70 f70Var = this.f360L;
        if (f70Var != null && (c0572ou = f70Var.f1901b) != null) {
            i70Var.f2361c = c0572ou.f3586a;
        }
        ActionMenuView actionMenuView = this.f366a;
        i70Var.f2362d = (actionMenuView == null || (c0358j1 = actionMenuView.f285t) == null || !c0358j1.m1541j()) ? false : true;
        return i70Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f350B = false;
        }
        if (!this.f350B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f350B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f350B = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m197p(View view, int i, int i2, int[] iArr) {
        g70 g70Var = (g70) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) g70Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM193j = m193j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM193j, iMax + measuredWidth, view.getMeasuredHeight() + iM193j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) g70Var).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m198q(View view, int i, int i2, int[] iArr) {
        g70 g70Var = (g70) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) g70Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM193j = m193j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM193j, iMax, view.getMeasuredHeight() + iM193j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) g70Var).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m199r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: s */
    public final void m200s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f364P != z) {
            this.f364P = z;
            m202u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0222ff.m1196r(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f361M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f387v) {
            this.f387v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f386u) {
            this.f386u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0222ff.m1196r(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0222ff.m1196r(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m192g();
        this.f369d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m190e();
        this.f366a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f376k != i) {
            this.f376k = i;
            if (i == 0) {
                this.f375j = getContext();
            } else {
                this.f375j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f384s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f382q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f381p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f383r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m201t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m202u() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4f
            android.window.OnBackInvokedDispatcher r0 = p000.e70.m998a(r4)
            f70 r1 = r4.f360L
            r2 = 0
            if (r1 == 0) goto L23
            ou r1 = r1.f1901b
            if (r1 == 0) goto L23
            if (r0 == 0) goto L23
            java.util.WeakHashMap r1 = p000.ja0.f2600a
            boolean r1 = p000.v90.m2495b(r4)
            if (r1 == 0) goto L23
            boolean r1 = r4.f364P
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.f363O
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r1 = r4.f362N
            if (r1 != 0) goto L39
            c70 r1 = new c70
            r1.<init>(r4, r2)
            android.window.OnBackInvokedCallback r1 = p000.e70.m999b(r1)
            r4.f362N = r1
        L39:
            android.window.OnBackInvokedCallback r1 = r4.f362N
            p000.e70.m1000c(r0, r1)
            r4.f363O = r0
            return
        L41:
            if (r1 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.f363O
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.f362N
            p000.e70.m1001d(r0, r1)
            r0 = 0
            r4.f363O = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.m202u():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f388w = 8388627;
        this.f352D = new ArrayList();
        this.f353E = new ArrayList();
        this.f354F = new int[2];
        this.f355G = new C0138d4(new c70(this, 1));
        this.f356H = new ArrayList();
        this.f357I = new d70(this);
        this.f365Q = new RunnableC0919y6(11, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0910xy.f5240x;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context2, attributeSet, iArr, R.attr.toolbarStyle);
        ja0.m1574k(this, context, iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        this.f377l = typedArray.getResourceId(28, 0);
        this.f378m = typedArray.getResourceId(19, 0);
        this.f388w = typedArray.getInteger(0, 8388627);
        this.f379n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f384s = dimensionPixelOffset;
        this.f383r = dimensionPixelOffset;
        this.f382q = dimensionPixelOffset;
        this.f381p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f381p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f382q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f383r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f384s = dimensionPixelOffset5;
        }
        this.f380o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m189d();
        i10 i10Var = this.f385t;
        i10Var.f2335h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            i10Var.f2332e = dimensionPixelSize;
            i10Var.f2328a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            i10Var.f2333f = dimensionPixelSize2;
            i10Var.f2329b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            i10Var.m1384a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f386u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f387v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f371f = c0659r5M2219y.m2234m(4);
        this.f372g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f375j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM2234m = c0659r5M2219y.m2234m(16);
        if (drawableM2234m != null) {
            setNavigationIcon(drawableM2234m);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM2234m2 = c0659r5M2219y.m2234m(11);
        if (drawableM2234m2 != null) {
            setLogo(drawableM2234m2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0659r5M2219y.m2233l(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0659r5M2219y.m2233l(20));
        }
        if (typedArray.hasValue(14)) {
            mo194m(typedArray.getResourceId(14, 0));
        }
        c0659r5M2219y.m2245z();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g70 g70Var = new g70(context, attributeSet);
        g70Var.f2033a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5218b);
        g70Var.f2033a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        g70Var.f2034b = 0;
        return g70Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m188c();
        }
        C0916y3 c0916y3 = this.f373h;
        if (c0916y3 != null) {
            c0916y3.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m188c();
            this.f373h.setImageDrawable(drawable);
        } else {
            C0916y3 c0916y3 = this.f373h;
            if (c0916y3 != null) {
                c0916y3.setImageDrawable(this.f371f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f370e == null) {
                this.f370e = new C0005a4(getContext(), null, 0);
            }
            if (!m196o(this.f370e)) {
                m187b(this.f370e, true);
            }
        } else {
            C0005a4 c0005a4 = this.f370e;
            if (c0005a4 != null && m196o(c0005a4)) {
                removeView(this.f370e);
                this.f353E.remove(this.f370e);
            }
        }
        C0005a4 c0005a42 = this.f370e;
        if (c0005a42 != null) {
            c0005a42.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f370e == null) {
            this.f370e = new C0005a4(getContext(), null, 0);
        }
        C0005a4 c0005a4 = this.f370e;
        if (c0005a4 != null) {
            c0005a4.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m192g();
        }
        C0916y3 c0916y3 = this.f369d;
        if (c0916y3 != null) {
            c0916y3.setContentDescription(charSequence);
            l70.m1753a(this.f369d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m192g();
            if (!m196o(this.f369d)) {
                m187b(this.f369d, true);
            }
        } else {
            C0916y3 c0916y3 = this.f369d;
            if (c0916y3 != null && m196o(c0916y3)) {
                removeView(this.f369d);
                this.f353E.remove(this.f369d);
            }
        }
        C0916y3 c0916y32 = this.f369d;
        if (c0916y32 != null) {
            c0916y32.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0249g5 c0249g5 = this.f368c;
            if (c0249g5 != null && m196o(c0249g5)) {
                removeView(this.f368c);
                this.f353E.remove(this.f368c);
            }
        } else {
            if (this.f368c == null) {
                Context context = getContext();
                C0249g5 c0249g52 = new C0249g5(context, null);
                this.f368c = c0249g52;
                c0249g52.setSingleLine();
                this.f368c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f378m;
                if (i != 0) {
                    this.f368c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f349A;
                if (colorStateList != null) {
                    this.f368c.setTextColor(colorStateList);
                }
            }
            if (!m196o(this.f368c)) {
                m187b(this.f368c, true);
            }
        }
        C0249g5 c0249g53 = this.f368c;
        if (c0249g53 != null) {
            c0249g53.setText(charSequence);
        }
        this.f390y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f349A = colorStateList;
        C0249g5 c0249g5 = this.f368c;
        if (c0249g5 != null) {
            c0249g5.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0249g5 c0249g5 = this.f367b;
            if (c0249g5 != null && m196o(c0249g5)) {
                removeView(this.f367b);
                this.f353E.remove(this.f367b);
            }
        } else {
            if (this.f367b == null) {
                Context context = getContext();
                C0249g5 c0249g52 = new C0249g5(context, null);
                this.f367b = c0249g52;
                c0249g52.setSingleLine();
                this.f367b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f377l;
                if (i != 0) {
                    this.f367b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f391z;
                if (colorStateList != null) {
                    this.f367b.setTextColor(colorStateList);
                }
            }
            if (!m196o(this.f367b)) {
                m187b(this.f367b, true);
            }
        }
        C0249g5 c0249g53 = this.f367b;
        if (c0249g53 != null) {
            c0249g53.setText(charSequence);
        }
        this.f389x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f391z = colorStateList;
        C0249g5 c0249g5 = this.f367b;
        if (c0249g5 != null) {
            c0249g5.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(h70 h70Var) {
    }
}
