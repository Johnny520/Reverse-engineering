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
import p000.AbstractC0205ez;
import p000.AbstractC0259gf;
import p000.AbstractC0423kt;
import p000.C0005a4;
import p000.C0138d4;
import p000.C0249g5;
import p000.C0358j1;
import p000.C0658r5;
import p000.C0869wu;
import p000.C0916y3;
import p000.InterfaceC0372jf;
import p000.MenuC0646qu;
import p000.RunnableC0325i7;
import p000.ViewOnClickListenerC0756tt;
import p000.ViewOnClickListenerC0876x0;
import p000.g40;
import p000.hb0;
import p000.i70;
import p000.j70;
import p000.l70;
import p000.m70;
import p000.n70;
import p000.o70;
import p000.oa0;
import p000.p10;
import p000.q70;
import p000.r50;
import p000.r70;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f312A;

    /* JADX INFO: renamed from: B */
    public boolean f313B;

    /* JADX INFO: renamed from: C */
    public boolean f314C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f315D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f316E;

    /* JADX INFO: renamed from: F */
    public final int[] f317F;

    /* JADX INFO: renamed from: G */
    public final C0138d4 f318G;

    /* JADX INFO: renamed from: H */
    public ArrayList f319H;

    /* JADX INFO: renamed from: I */
    public final j70 f320I;

    /* JADX INFO: renamed from: J */
    public q70 f321J;

    /* JADX INFO: renamed from: K */
    public C0358j1 f322K;

    /* JADX INFO: renamed from: L */
    public l70 f323L;

    /* JADX INFO: renamed from: M */
    public boolean f324M;

    /* JADX INFO: renamed from: N */
    public OnBackInvokedCallback f325N;

    /* JADX INFO: renamed from: O */
    public OnBackInvokedDispatcher f326O;

    /* JADX INFO: renamed from: P */
    public boolean f327P;

    /* JADX INFO: renamed from: Q */
    public final RunnableC0325i7 f328Q;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f329a;

    /* JADX INFO: renamed from: b */
    public C0249g5 f330b;

    /* JADX INFO: renamed from: c */
    public C0249g5 f331c;

    /* JADX INFO: renamed from: d */
    public C0916y3 f332d;

    /* JADX INFO: renamed from: e */
    public C0005a4 f333e;

    /* JADX INFO: renamed from: f */
    public final Drawable f334f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f335g;

    /* JADX INFO: renamed from: h */
    public C0916y3 f336h;

    /* JADX INFO: renamed from: i */
    public View f337i;

    /* JADX INFO: renamed from: j */
    public Context f338j;

    /* JADX INFO: renamed from: k */
    public int f339k;

    /* JADX INFO: renamed from: l */
    public int f340l;

    /* JADX INFO: renamed from: m */
    public int f341m;

    /* JADX INFO: renamed from: n */
    public final int f342n;

    /* JADX INFO: renamed from: o */
    public final int f343o;

    /* JADX INFO: renamed from: p */
    public int f344p;

    /* JADX INFO: renamed from: q */
    public int f345q;

    /* JADX INFO: renamed from: r */
    public int f346r;

    /* JADX INFO: renamed from: s */
    public int f347s;

    /* JADX INFO: renamed from: t */
    public p10 f348t;

    /* JADX INFO: renamed from: u */
    public int f349u;

    /* JADX INFO: renamed from: v */
    public int f350v;

    /* JADX INFO: renamed from: w */
    public final int f351w;

    /* JADX INFO: renamed from: x */
    public CharSequence f352x;

    /* JADX INFO: renamed from: y */
    public CharSequence f353y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f354z;

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
        return new r50(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static m70 m167h() {
        m70 m70Var = new m70(-2, -2);
        m70Var.f3098b = 0;
        m70Var.f3097a = 8388627;
        return m70Var;
    }

    /* JADX INFO: renamed from: i */
    public static m70 m168i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof m70;
        if (z) {
            m70 m70Var = (m70) layoutParams;
            m70 m70Var2 = new m70(m70Var);
            m70Var2.f3098b = 0;
            m70Var2.f3098b = m70Var.f3098b;
            return m70Var2;
        }
        if (z) {
            m70 m70Var3 = new m70((m70) layoutParams);
            m70Var3.f3098b = 0;
            return m70Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            m70 m70Var4 = new m70(layoutParams);
            m70Var4.f3098b = 0;
            return m70Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        m70 m70Var5 = new m70(marginLayoutParams);
        m70Var5.f3098b = 0;
        ((ViewGroup.MarginLayoutParams) m70Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) m70Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) m70Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) m70Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return m70Var5;
    }

    /* JADX INFO: renamed from: k */
    public static int m169k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0423kt.m1709b(marginLayoutParams) + AbstractC0423kt.m1710c(marginLayoutParams);
    }

    /* JADX INFO: renamed from: l */
    public static int m170l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m171a(ArrayList arrayList, int i) {
        WeakHashMap weakHashMap = oa0.f3426a;
        boolean z = y90.m2732d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, y90.m2732d(this));
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                m70 m70Var = (m70) childAt.getLayoutParams();
                if (m70Var.f3098b == 0 && m186t(childAt)) {
                    int i3 = m70Var.f3097a;
                    WeakHashMap weakHashMap2 = oa0.f3426a;
                    int iM2732d = y90.m2732d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, iM2732d) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = iM2732d == 1 ? 5 : 3;
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
            m70 m70Var2 = (m70) childAt2.getLayoutParams();
            if (m70Var2.f3098b == 0 && m186t(childAt2)) {
                int i5 = m70Var2.f3097a;
                WeakHashMap weakHashMap3 = oa0.f3426a;
                int iM2732d2 = y90.m2732d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, iM2732d2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = iM2732d2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m172b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m70 m70VarM167h = layoutParams == null ? m167h() : !checkLayoutParams(layoutParams) ? m168i(layoutParams) : (m70) layoutParams;
        m70VarM167h.f3098b = 1;
        if (!z || this.f337i == null) {
            addView(view, m70VarM167h);
        } else {
            view.setLayoutParams(m70VarM167h);
            this.f316E.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m173c() {
        if (this.f336h == null) {
            C0916y3 c0916y3 = new C0916y3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f336h = c0916y3;
            c0916y3.setImageDrawable(this.f334f);
            this.f336h.setContentDescription(this.f335g);
            m70 m70VarM167h = m167h();
            m70VarM167h.f3097a = (this.f342n & 112) | 8388611;
            m70VarM167h.f3098b = 2;
            this.f336h.setLayoutParams(m70VarM167h);
            this.f336h.setOnClickListener(new ViewOnClickListenerC0876x0(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof m70);
    }

    /* JADX INFO: renamed from: d */
    public final void m174d() {
        if (this.f348t == null) {
            p10 p10Var = new p10();
            p10Var.f3563a = 0;
            p10Var.f3564b = 0;
            p10Var.f3565c = Integer.MIN_VALUE;
            p10Var.f3566d = Integer.MIN_VALUE;
            p10Var.f3567e = 0;
            p10Var.f3568f = 0;
            p10Var.f3569g = false;
            p10Var.f3570h = false;
            this.f348t = p10Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m175e() {
        m176f();
        ActionMenuView actionMenuView = this.f329a;
        if (actionMenuView.f244p == null) {
            MenuC0646qu menuC0646qu = (MenuC0646qu) actionMenuView.getMenu();
            if (this.f323L == null) {
                this.f323L = new l70(this);
            }
            this.f329a.setExpandedActionViewsExclusive(true);
            menuC0646qu.m2166b(this.f323L, this.f338j);
            m187u();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m176f() {
        if (this.f329a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f329a = actionMenuView;
            actionMenuView.setPopupTheme(this.f339k);
            this.f329a.setOnMenuItemClickListener(this.f320I);
            ActionMenuView actionMenuView2 = this.f329a;
            j70 j70Var = new j70(this);
            actionMenuView2.getClass();
            actionMenuView2.f249u = j70Var;
            m70 m70VarM167h = m167h();
            m70VarM167h.f3097a = (this.f342n & 112) | 8388613;
            this.f329a.setLayoutParams(m70VarM167h);
            m172b(this.f329a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m177g() {
        if (this.f332d == null) {
            this.f332d = new C0916y3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            m70 m70VarM167h = m167h();
            m70VarM167h.f3097a = (this.f342n & 112) | 8388611;
            this.f332d.setLayoutParams(m70VarM167h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m167h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m168i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0916y3 c0916y3 = this.f336h;
        if (c0916y3 != null) {
            return c0916y3.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0916y3 c0916y3 = this.f336h;
        if (c0916y3 != null) {
            return c0916y3.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p10 p10Var = this.f348t;
        if (p10Var != null) {
            return p10Var.f3569g ? p10Var.f3563a : p10Var.f3564b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f350v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p10 p10Var = this.f348t;
        if (p10Var != null) {
            return p10Var.f3563a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p10 p10Var = this.f348t;
        if (p10Var != null) {
            return p10Var.f3564b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p10 p10Var = this.f348t;
        if (p10Var != null) {
            return p10Var.f3569g ? p10Var.f3564b : p10Var.f3563a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f349u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0646qu menuC0646qu;
        ActionMenuView actionMenuView = this.f329a;
        return (actionMenuView == null || (menuC0646qu = actionMenuView.f244p) == null || !menuC0646qu.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f350v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = oa0.f3426a;
        return y90.m2732d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = oa0.f3426a;
        return y90.m2732d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f349u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0005a4 c0005a4 = this.f333e;
        if (c0005a4 != null) {
            return c0005a4.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0005a4 c0005a4 = this.f333e;
        if (c0005a4 != null) {
            return c0005a4.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m175e();
        return this.f329a.getMenu();
    }

    public View getNavButtonView() {
        return this.f332d;
    }

    public CharSequence getNavigationContentDescription() {
        C0916y3 c0916y3 = this.f332d;
        if (c0916y3 != null) {
            return c0916y3.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0916y3 c0916y3 = this.f332d;
        if (c0916y3 != null) {
            return c0916y3.getDrawable();
        }
        return null;
    }

    public C0358j1 getOuterActionMenuPresenter() {
        return this.f322K;
    }

    public Drawable getOverflowIcon() {
        m175e();
        return this.f329a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f338j;
    }

    public int getPopupTheme() {
        return this.f339k;
    }

    public CharSequence getSubtitle() {
        return this.f353y;
    }

    public final TextView getSubtitleTextView() {
        return this.f331c;
    }

    public CharSequence getTitle() {
        return this.f352x;
    }

    public int getTitleMarginBottom() {
        return this.f347s;
    }

    public int getTitleMarginEnd() {
        return this.f345q;
    }

    public int getTitleMarginStart() {
        return this.f344p;
    }

    public int getTitleMarginTop() {
        return this.f346r;
    }

    public final TextView getTitleTextView() {
        return this.f330b;
    }

    public InterfaceC0372jf getWrapper() {
        Drawable drawable;
        if (this.f321J == null) {
            q70 q70Var = new q70();
            q70Var.f3862n = 0;
            q70Var.f3849a = this;
            q70Var.f3856h = getTitle();
            q70Var.f3857i = getSubtitle();
            q70Var.f3855g = q70Var.f3856h != null;
            q70Var.f3854f = getNavigationIcon();
            C0658r5 c0658r5M2226y = C0658r5.m2226y(getContext(), null, AbstractC0205ez.f1677a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
            q70Var.f3863o = c0658r5M2226y.m2241m(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                q70Var.f3855g = true;
                q70Var.f3856h = text;
                if ((q70Var.f3850b & 8) != 0) {
                    setTitle(text);
                    if (q70Var.f3855g) {
                        oa0.m2013m(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                q70Var.f3857i = text2;
                if ((q70Var.f3850b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM2241m = c0658r5M2226y.m2241m(20);
            if (drawableM2241m != null) {
                q70Var.f3853e = drawableM2241m;
                q70Var.m2131c();
            }
            Drawable drawableM2241m2 = c0658r5M2226y.m2241m(17);
            if (drawableM2241m2 != null) {
                q70Var.f3852d = drawableM2241m2;
                q70Var.m2131c();
            }
            if (q70Var.f3854f == null && (drawable = q70Var.f3863o) != null) {
                q70Var.f3854f = drawable;
                if ((q70Var.f3850b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            q70Var.m2129a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = q70Var.f3851c;
                if (view != null && (q70Var.f3850b & 16) != 0) {
                    removeView(view);
                }
                q70Var.f3851c = viewInflate;
                if (viewInflate != null && (q70Var.f3850b & 16) != 0) {
                    addView(viewInflate);
                }
                q70Var.m2129a(q70Var.f3850b | 16);
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
                m174d();
                this.f348t.m2061a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f340l = resourceId2;
                C0249g5 c0249g5 = this.f330b;
                if (c0249g5 != null) {
                    c0249g5.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f341m = resourceId3;
                C0249g5 c0249g52 = this.f331c;
                if (c0249g52 != null) {
                    c0249g52.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0658r5M2226y.m2252z();
            if (R.string.abc_action_bar_up_description != q70Var.f3862n) {
                q70Var.f3862n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = q70Var.f3862n;
                    q70Var.f3858j = i != 0 ? getContext().getString(i) : null;
                    q70Var.m2130b();
                }
            }
            q70Var.f3858j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0756tt(q70Var));
            this.f321J = q70Var;
        }
        return this.f321J;
    }

    /* JADX INFO: renamed from: j */
    public final int m178j(View view, int i) {
        m70 m70Var = (m70) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = m70Var.f3097a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f351w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) m70Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) m70Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) m70Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public void mo179m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* JADX INFO: renamed from: n */
    public final void m180n() {
        ArrayList arrayList = this.f319H;
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
        Iterator it = ((CopyOnWriteArrayList) this.f318G.f1298c).iterator();
        if (it.hasNext()) {
            throw g40.m1145h(it);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f319H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m181o(View view) {
        return view.getParent() == this || this.f316E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m187u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f328Q);
        m187u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f314C = false;
        }
        if (!this.f314C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f314C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f314C = false;
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
        int iM169k;
        int iMax;
        int iCombineMeasuredStates;
        int iM169k2;
        int iM170l;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zM1385a = hb0.m1385a(this);
        int i3 = !zM1385a ? 1 : 0;
        int i4 = 0;
        if (m186t(this.f332d)) {
            m185s(this.f332d, i, 0, i2, this.f343o);
            iM169k = m169k(this.f332d) + this.f332d.getMeasuredWidth();
            iMax = Math.max(0, m170l(this.f332d) + this.f332d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f332d.getMeasuredState());
        } else {
            iM169k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m186t(this.f336h)) {
            m185s(this.f336h, i, 0, i2, this.f343o);
            iM169k = m169k(this.f336h) + this.f336h.getMeasuredWidth();
            iMax = Math.max(iMax, m170l(this.f336h) + this.f336h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f336h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM169k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM169k);
        int[] iArr = this.f317F;
        iArr[zM1385a ? 1 : 0] = iMax4;
        if (m186t(this.f329a)) {
            m185s(this.f329a, i, iMax3, i2, this.f343o);
            iM169k2 = m169k(this.f329a) + this.f329a.getMeasuredWidth();
            iMax = Math.max(iMax, m170l(this.f329a) + this.f329a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f329a.getMeasuredState());
        } else {
            iM169k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM169k2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iM169k2);
        if (m186t(this.f337i)) {
            iMax5 += m184r(this.f337i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m170l(this.f337i) + this.f337i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f337i.getMeasuredState());
        }
        if (m186t(this.f333e)) {
            iMax5 += m184r(this.f333e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m170l(this.f333e) + this.f333e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f333e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((m70) childAt.getLayoutParams()).f3098b == 0 && m186t(childAt)) {
                iMax5 += m184r(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m170l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.f346r + this.f347s;
        int i8 = this.f344p + this.f345q;
        if (m186t(this.f330b)) {
            m184r(this.f330b, i, i6 + i8, i2, i7, iArr);
            int iM169k3 = m169k(this.f330b) + this.f330b.getMeasuredWidth();
            iM170l = m170l(this.f330b) + this.f330b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f330b.getMeasuredState());
            iMax2 = iM169k3;
        } else {
            iM170l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m186t(this.f331c)) {
            iMax2 = Math.max(iMax2, m184r(this.f331c, i, i6 + i8, i2, i7 + iM170l, iArr));
            iM170l += m170l(this.f331c) + this.f331c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f331c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM170l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f324M) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (m186t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof o70)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o70 o70Var = (o70) parcelable;
        super.onRestoreInstanceState(o70Var.f1274a);
        ActionMenuView actionMenuView = this.f329a;
        MenuC0646qu menuC0646qu = actionMenuView != null ? actionMenuView.f244p : null;
        int i = o70Var.f3411c;
        if (i != 0 && this.f323L != null && menuC0646qu != null && (menuItemFindItem = menuC0646qu.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (o70Var.f3412d) {
            RunnableC0325i7 runnableC0325i7 = this.f328Q;
            removeCallbacks(runnableC0325i7);
            post(runnableC0325i7);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m174d();
        p10 p10Var = this.f348t;
        boolean z = i == 1;
        if (z == p10Var.f3569g) {
            return;
        }
        p10Var.f3569g = z;
        if (!p10Var.f3570h) {
            p10Var.f3563a = p10Var.f3567e;
            p10Var.f3564b = p10Var.f3568f;
            return;
        }
        if (z) {
            int i2 = p10Var.f3566d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = p10Var.f3567e;
            }
            p10Var.f3563a = i2;
            int i3 = p10Var.f3565c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = p10Var.f3568f;
            }
            p10Var.f3564b = i3;
            return;
        }
        int i4 = p10Var.f3565c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = p10Var.f3567e;
        }
        p10Var.f3563a = i4;
        int i5 = p10Var.f3566d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = p10Var.f3568f;
        }
        p10Var.f3564b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0358j1 c0358j1;
        C0869wu c0869wu;
        o70 o70Var = new o70(super.onSaveInstanceState());
        l70 l70Var = this.f323L;
        if (l70Var != null && (c0869wu = l70Var.f2966b) != null) {
            o70Var.f3411c = c0869wu.f5112a;
        }
        ActionMenuView actionMenuView = this.f329a;
        o70Var.f3412d = (actionMenuView == null || (c0358j1 = actionMenuView.f248t) == null || !c0358j1.m1561j()) ? false : true;
        return o70Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f313B = false;
        }
        if (!this.f313B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f313B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f313B = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m182p(View view, int i, int i2, int[] iArr) {
        m70 m70Var = (m70) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) m70Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM178j = m178j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM178j, iMax + measuredWidth, view.getMeasuredHeight() + iM178j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) m70Var).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m183q(View view, int i, int i2, int[] iArr) {
        m70 m70Var = (m70) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) m70Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM178j = m178j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM178j, iMax, view.getMeasuredHeight() + iM178j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) m70Var).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m184r(View view, int i, int i2, int i3, int i4, int[] iArr) {
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
    public final void m185s(View view, int i, int i2, int i3, int i4) {
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
        if (this.f327P != z) {
            this.f327P = z;
            m187u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0259gf.m1261w(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f324M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f350v) {
            this.f350v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f349u) {
            this.f349u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0259gf.m1261w(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0259gf.m1261w(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m177g();
        this.f332d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m175e();
        this.f329a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f339k != i) {
            this.f339k = i;
            if (i == 0) {
                this.f338j = getContext();
            } else {
                this.f338j = new ContextThemeWrapper(getContext(), i);
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
        this.f347s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f345q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f344p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f346r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m186t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m187u() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4f
            android.window.OnBackInvokedDispatcher r0 = p000.k70.m1657a(r4)
            l70 r1 = r4.f323L
            r2 = 0
            if (r1 == 0) goto L23
            wu r1 = r1.f2966b
            if (r1 == 0) goto L23
            if (r0 == 0) goto L23
            java.util.WeakHashMap r1 = p000.oa0.f3426a
            boolean r1 = p000.aa0.m39b(r4)
            if (r1 == 0) goto L23
            boolean r1 = r4.f327P
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.f326O
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r1 = r4.f325N
            if (r1 != 0) goto L39
            i70 r1 = new i70
            r1.<init>(r4, r2)
            android.window.OnBackInvokedCallback r1 = p000.k70.m1658b(r1)
            r4.f325N = r1
        L39:
            android.window.OnBackInvokedCallback r1 = r4.f325N
            p000.k70.m1659c(r0, r1)
            r4.f326O = r0
            return
        L41:
            if (r1 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.f326O
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.f325N
            p000.k70.m1660d(r0, r1)
            r0 = 0
            r4.f326O = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.m187u():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f351w = 8388627;
        this.f315D = new ArrayList();
        this.f316E = new ArrayList();
        this.f317F = new int[2];
        this.f318G = new C0138d4(new i70(this, 1));
        this.f319H = new ArrayList();
        this.f320I = new j70(this);
        this.f328Q = new RunnableC0325i7(11, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0205ez.f1700x;
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context2, attributeSet, iArr, R.attr.toolbarStyle);
        oa0.m2011k(this, context, iArr, attributeSet, (TypedArray) c0658r5M2226y.f4064b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        this.f340l = typedArray.getResourceId(28, 0);
        this.f341m = typedArray.getResourceId(19, 0);
        this.f351w = typedArray.getInteger(0, 8388627);
        this.f342n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f347s = dimensionPixelOffset;
        this.f346r = dimensionPixelOffset;
        this.f345q = dimensionPixelOffset;
        this.f344p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f344p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f345q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f346r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f347s = dimensionPixelOffset5;
        }
        this.f343o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m174d();
        p10 p10Var = this.f348t;
        p10Var.f3570h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p10Var.f3567e = dimensionPixelSize;
            p10Var.f3563a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p10Var.f3568f = dimensionPixelSize2;
            p10Var.f3564b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p10Var.m2061a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f349u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f350v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f334f = c0658r5M2226y.m2241m(4);
        this.f335g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f338j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM2241m = c0658r5M2226y.m2241m(16);
        if (drawableM2241m != null) {
            setNavigationIcon(drawableM2241m);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM2241m2 = c0658r5M2226y.m2241m(11);
        if (drawableM2241m2 != null) {
            setLogo(drawableM2241m2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0658r5M2226y.m2240l(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0658r5M2226y.m2240l(20));
        }
        if (typedArray.hasValue(14)) {
            mo179m(typedArray.getResourceId(14, 0));
        }
        c0658r5M2226y.m2252z();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        m70 m70Var = new m70(context, attributeSet);
        m70Var.f3097a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1678b);
        m70Var.f3097a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        m70Var.f3098b = 0;
        return m70Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m173c();
        }
        C0916y3 c0916y3 = this.f336h;
        if (c0916y3 != null) {
            c0916y3.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m173c();
            this.f336h.setImageDrawable(drawable);
        } else {
            C0916y3 c0916y3 = this.f336h;
            if (c0916y3 != null) {
                c0916y3.setImageDrawable(this.f334f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f333e == null) {
                this.f333e = new C0005a4(getContext(), null, 0);
            }
            if (!m181o(this.f333e)) {
                m172b(this.f333e, true);
            }
        } else {
            C0005a4 c0005a4 = this.f333e;
            if (c0005a4 != null && m181o(c0005a4)) {
                removeView(this.f333e);
                this.f316E.remove(this.f333e);
            }
        }
        C0005a4 c0005a42 = this.f333e;
        if (c0005a42 != null) {
            c0005a42.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f333e == null) {
            this.f333e = new C0005a4(getContext(), null, 0);
        }
        C0005a4 c0005a4 = this.f333e;
        if (c0005a4 != null) {
            c0005a4.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m177g();
        }
        C0916y3 c0916y3 = this.f332d;
        if (c0916y3 != null) {
            c0916y3.setContentDescription(charSequence);
            r70.m2264a(this.f332d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m177g();
            if (!m181o(this.f332d)) {
                m172b(this.f332d, true);
            }
        } else {
            C0916y3 c0916y3 = this.f332d;
            if (c0916y3 != null && m181o(c0916y3)) {
                removeView(this.f332d);
                this.f316E.remove(this.f332d);
            }
        }
        C0916y3 c0916y32 = this.f332d;
        if (c0916y32 != null) {
            c0916y32.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0249g5 c0249g5 = this.f331c;
            if (c0249g5 != null && m181o(c0249g5)) {
                removeView(this.f331c);
                this.f316E.remove(this.f331c);
            }
        } else {
            if (this.f331c == null) {
                Context context = getContext();
                C0249g5 c0249g52 = new C0249g5(context, null);
                this.f331c = c0249g52;
                c0249g52.setSingleLine();
                this.f331c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f341m;
                if (i != 0) {
                    this.f331c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f312A;
                if (colorStateList != null) {
                    this.f331c.setTextColor(colorStateList);
                }
            }
            if (!m181o(this.f331c)) {
                m172b(this.f331c, true);
            }
        }
        C0249g5 c0249g53 = this.f331c;
        if (c0249g53 != null) {
            c0249g53.setText(charSequence);
        }
        this.f353y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f312A = colorStateList;
        C0249g5 c0249g5 = this.f331c;
        if (c0249g5 != null) {
            c0249g5.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0249g5 c0249g5 = this.f330b;
            if (c0249g5 != null && m181o(c0249g5)) {
                removeView(this.f330b);
                this.f316E.remove(this.f330b);
            }
        } else {
            if (this.f330b == null) {
                Context context = getContext();
                C0249g5 c0249g52 = new C0249g5(context, null);
                this.f330b = c0249g52;
                c0249g52.setSingleLine();
                this.f330b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f340l;
                if (i != 0) {
                    this.f330b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f354z;
                if (colorStateList != null) {
                    this.f330b.setTextColor(colorStateList);
                }
            }
            if (!m181o(this.f330b)) {
                m172b(this.f330b, true);
            }
        }
        C0249g5 c0249g53 = this.f330b;
        if (c0249g53 != null) {
            c0249g53.setText(charSequence);
        }
        this.f352x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f354z = colorStateList;
        C0249g5 c0249g5 = this.f330b;
        if (c0249g5 != null) {
            c0249g5.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(n70 n70Var) {
    }
}
