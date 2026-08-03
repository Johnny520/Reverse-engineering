package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0982Wu;
import p000.AbstractC1406fG;
import p000.AbstractC2185lE;
import p000.AbstractC2311oB;
import p000.AbstractC2706xB;
import p000.C0130D0;
import p000.C0434K3;
import p000.C0515Lz;
import p000.C0520M3;
import p000.C0727Qw;
import p000.C1037Y5;
import p000.C2268nB;
import p000.C2304o4;
import p000.C2354pB;
import p000.C2405qB;
import p000.C2427qr;
import p000.C2491sB;
import p000.C2504si;
import p000.C2534tB;
import p000.C2656w4;
import p000.C2663wB;
import p000.InterfaceC0206Er;
import p000.InterfaceC0492Lc;
import p000.InterfaceC2448rB;
import p000.MenuC2204lr;
import p000.RunnableC0431K0;
import p000.RunnableC2225mB;
import p000.ViewOnClickListenerC2343p0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f3803A;

    /* JADX INFO: renamed from: B */
    public boolean f3804B;

    /* JADX INFO: renamed from: C */
    public boolean f3805C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f3806D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f3807E;

    /* JADX INFO: renamed from: F */
    public final int[] f3808F;

    /* JADX INFO: renamed from: G */
    public final C2656w4 f3809G;

    /* JADX INFO: renamed from: H */
    public ArrayList f3810H;

    /* JADX INFO: renamed from: I */
    public InterfaceC2448rB f3811I;

    /* JADX INFO: renamed from: J */
    public final C2268nB f3812J;

    /* JADX INFO: renamed from: K */
    public C2663wB f3813K;

    /* JADX INFO: renamed from: L */
    public C0130D0 f3814L;

    /* JADX INFO: renamed from: M */
    public C2354pB f3815M;

    /* JADX INFO: renamed from: N */
    public C1037Y5 f3816N;

    /* JADX INFO: renamed from: O */
    public C2534tB f3817O;

    /* JADX INFO: renamed from: P */
    public boolean f3818P;

    /* JADX INFO: renamed from: Q */
    public OnBackInvokedCallback f3819Q;

    /* JADX INFO: renamed from: R */
    public OnBackInvokedDispatcher f3820R;

    /* JADX INFO: renamed from: S */
    public boolean f3821S;

    /* JADX INFO: renamed from: T */
    public final RunnableC0431K0 f3822T;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f3823a;

    /* JADX INFO: renamed from: b */
    public C2304o4 f3824b;

    /* JADX INFO: renamed from: c */
    public C2304o4 f3825c;

    /* JADX INFO: renamed from: d */
    public C0434K3 f3826d;

    /* JADX INFO: renamed from: e */
    public C0520M3 f3827e;

    /* JADX INFO: renamed from: f */
    public final Drawable f3828f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f3829g;

    /* JADX INFO: renamed from: h */
    public C0434K3 f3830h;

    /* JADX INFO: renamed from: i */
    public View f3831i;

    /* JADX INFO: renamed from: j */
    public Context f3832j;

    /* JADX INFO: renamed from: k */
    public int f3833k;

    /* JADX INFO: renamed from: l */
    public int f3834l;

    /* JADX INFO: renamed from: m */
    public int f3835m;

    /* JADX INFO: renamed from: n */
    public final int f3836n;

    /* JADX INFO: renamed from: o */
    public final int f3837o;

    /* JADX INFO: renamed from: p */
    public int f3838p;

    /* JADX INFO: renamed from: q */
    public int f3839q;

    /* JADX INFO: renamed from: r */
    public int f3840r;

    /* JADX INFO: renamed from: s */
    public int f3841s;

    /* JADX INFO: renamed from: t */
    public C0727Qw f3842t;

    /* JADX INFO: renamed from: u */
    public int f3843u;

    /* JADX INFO: renamed from: v */
    public int f3844v;

    /* JADX INFO: renamed from: w */
    public final int f3845w;

    /* JADX INFO: renamed from: x */
    public CharSequence f3846x;

    /* JADX INFO: renamed from: y */
    public CharSequence f3847y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f3848z;

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
        return new C0515Lz(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C2405qB m2097h() {
        C2405qB c2405qB = new C2405qB(-2, -2);
        c2405qB.f8439b = 0;
        c2405qB.f8438a = 8388627;
        return c2405qB;
    }

    /* JADX INFO: renamed from: i */
    public static C2405qB m2098i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C2405qB;
        if (z) {
            C2405qB c2405qB = (C2405qB) layoutParams;
            C2405qB c2405qB2 = new C2405qB(c2405qB);
            c2405qB2.f8439b = 0;
            c2405qB2.f8439b = c2405qB.f8439b;
            return c2405qB2;
        }
        if (z) {
            C2405qB c2405qB3 = new C2405qB((C2405qB) layoutParams);
            c2405qB3.f8439b = 0;
            return c2405qB3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C2405qB c2405qB4 = new C2405qB(layoutParams);
            c2405qB4.f8439b = 0;
            return c2405qB4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C2405qB c2405qB5 = new C2405qB(marginLayoutParams);
        c2405qB5.f8439b = 0;
        ((ViewGroup.MarginLayoutParams) c2405qB5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c2405qB5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c2405qB5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c2405qB5).bottomMargin = marginLayoutParams.bottomMargin;
        return c2405qB5;
    }

    /* JADX INFO: renamed from: k */
    public static int m2099k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: l */
    public static int m2100l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m2101a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C2405qB c2405qB = (C2405qB) childAt.getLayoutParams();
                if (c2405qB.f8439b == 0 && m2116t(childAt)) {
                    int i3 = c2405qB.f8438a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
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
            C2405qB c2405qB2 = (C2405qB) childAt2.getLayoutParams();
            if (c2405qB2.f8439b == 0 && m2116t(childAt2)) {
                int i5 = c2405qB2.f8438a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2102b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C2405qB c2405qBM2097h = layoutParams == null ? m2097h() : !checkLayoutParams(layoutParams) ? m2098i(layoutParams) : (C2405qB) layoutParams;
        c2405qBM2097h.f8439b = 1;
        if (!z || this.f3831i == null) {
            addView(view, c2405qBM2097h);
        } else {
            view.setLayoutParams(c2405qBM2097h);
            this.f3807E.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2103c() {
        if (this.f3830h == null) {
            C0434K3 c0434k3 = new C0434K3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f3830h = c0434k3;
            c0434k3.setImageDrawable(this.f3828f);
            this.f3830h.setContentDescription(this.f3829g);
            C2405qB c2405qBM2097h = m2097h();
            c2405qBM2097h.f8438a = (this.f3836n & 112) | 8388611;
            c2405qBM2097h.f8439b = 2;
            this.f3830h.setLayoutParams(c2405qBM2097h);
            this.f3830h.setOnClickListener(new ViewOnClickListenerC2343p0(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2405qB);
    }

    /* JADX INFO: renamed from: d */
    public final void m2104d() {
        if (this.f3842t == null) {
            C0727Qw c0727Qw = new C0727Qw();
            c0727Qw.f2316a = 0;
            c0727Qw.f2317b = 0;
            c0727Qw.f2318c = Integer.MIN_VALUE;
            c0727Qw.f2319d = Integer.MIN_VALUE;
            c0727Qw.f2320e = 0;
            c0727Qw.f2321f = 0;
            c0727Qw.f2322g = false;
            c0727Qw.f2323h = false;
            this.f3842t = c0727Qw;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2105e() {
        m2106f();
        ActionMenuView actionMenuView = this.f3823a;
        if (actionMenuView.f3777p == null) {
            MenuC2204lr menuC2204lr = (MenuC2204lr) actionMenuView.getMenu();
            if (this.f3815M == null) {
                this.f3815M = new C2354pB(this);
            }
            this.f3823a.setExpandedActionViewsExclusive(true);
            menuC2204lr.m4429b(this.f3815M, this.f3832j);
            m2118v();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2106f() {
        if (this.f3823a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3823a = actionMenuView;
            actionMenuView.setPopupTheme(this.f3833k);
            this.f3823a.setOnMenuItemClickListener(this.f3812J);
            ActionMenuView actionMenuView2 = this.f3823a;
            C1037Y5 c1037y5 = this.f3816N;
            C2268nB c2268nB = new C2268nB(this);
            actionMenuView2.f3782u = c1037y5;
            actionMenuView2.f3783v = c2268nB;
            C2405qB c2405qBM2097h = m2097h();
            c2405qBM2097h.f8438a = (this.f3836n & 112) | 8388613;
            this.f3823a.setLayoutParams(c2405qBM2097h);
            m2102b(this.f3823a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2107g() {
        if (this.f3826d == null) {
            this.f3826d = new C0434K3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C2405qB c2405qBM2097h = m2097h();
            c2405qBM2097h.f8438a = (this.f3836n & 112) | 8388611;
            this.f3826d.setLayoutParams(c2405qBM2097h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2097h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2098i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0434K3 c0434k3 = this.f3830h;
        if (c0434k3 != null) {
            return c0434k3.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0434K3 c0434k3 = this.f3830h;
        if (c0434k3 != null) {
            return c0434k3.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0727Qw c0727Qw = this.f3842t;
        if (c0727Qw != null) {
            return c0727Qw.f2322g ? c0727Qw.f2316a : c0727Qw.f2317b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f3844v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0727Qw c0727Qw = this.f3842t;
        if (c0727Qw != null) {
            return c0727Qw.f2316a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0727Qw c0727Qw = this.f3842t;
        if (c0727Qw != null) {
            return c0727Qw.f2317b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0727Qw c0727Qw = this.f3842t;
        if (c0727Qw != null) {
            return c0727Qw.f2322g ? c0727Qw.f2317b : c0727Qw.f2316a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f3843u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC2204lr menuC2204lr;
        ActionMenuView actionMenuView = this.f3823a;
        return (actionMenuView == null || (menuC2204lr = actionMenuView.f3777p) == null || !menuC2204lr.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3844v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3843u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0520M3 c0520m3 = this.f3827e;
        if (c0520m3 != null) {
            return c0520m3.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0520M3 c0520m3 = this.f3827e;
        if (c0520m3 != null) {
            return c0520m3.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2105e();
        return this.f3823a.getMenu();
    }

    public View getNavButtonView() {
        return this.f3826d;
    }

    public CharSequence getNavigationContentDescription() {
        C0434K3 c0434k3 = this.f3826d;
        if (c0434k3 != null) {
            return c0434k3.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0434K3 c0434k3 = this.f3826d;
        if (c0434k3 != null) {
            return c0434k3.getDrawable();
        }
        return null;
    }

    public C0130D0 getOuterActionMenuPresenter() {
        return this.f3814L;
    }

    public Drawable getOverflowIcon() {
        m2105e();
        return this.f3823a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3832j;
    }

    public int getPopupTheme() {
        return this.f3833k;
    }

    public CharSequence getSubtitle() {
        return this.f3847y;
    }

    public final TextView getSubtitleTextView() {
        return this.f3825c;
    }

    public CharSequence getTitle() {
        return this.f3846x;
    }

    public int getTitleMarginBottom() {
        return this.f3841s;
    }

    public int getTitleMarginEnd() {
        return this.f3839q;
    }

    public int getTitleMarginStart() {
        return this.f3838p;
    }

    public int getTitleMarginTop() {
        return this.f3840r;
    }

    public final TextView getTitleTextView() {
        return this.f3824b;
    }

    public InterfaceC0492Lc getWrapper() {
        if (this.f3813K == null) {
            this.f3813K = new C2663wB(this, true);
        }
        return this.f3813K;
    }

    /* JADX INFO: renamed from: j */
    public final int m2108j(View view, int i) {
        C2405qB c2405qB = (C2405qB) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c2405qB.f8438a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f3845w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c2405qB).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c2405qB).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c2405qB).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public final void m2109m() {
        Iterator it = this.f3810H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f3809G.f9198d).iterator();
        while (it2.hasNext()) {
            ((C2504si) ((InterfaceC0206Er) it2.next())).f8791a.m5412j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3810H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2110n(View view) {
        return view.getParent() == this || this.f3807E.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2111o() {
        C0130D0 c0130d0;
        ActionMenuView actionMenuView = this.f3823a;
        return (actionMenuView == null || (c0130d0 = actionMenuView.f3781t) == null || !c0130d0.m219h()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2118v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3822T);
        m2118v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3805C = false;
        }
        if (!this.f3805C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3805C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3805C = false;
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
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM2112p;
        int iM2113q;
        int iMax;
        boolean zM2116t;
        boolean zM2116t2;
        boolean z2;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int size;
        int iM2112p2;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int i13;
        int i14;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.f3808F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!m2116t(this.f3826d)) {
            iM2112p = paddingLeft;
        } else {
            if (z3) {
                iM2113q = m2113q(this.f3826d, i15, iMin, iArr);
                iM2112p = paddingLeft;
                if (m2116t(this.f3830h)) {
                    if (z3) {
                        iM2113q = m2113q(this.f3830h, iM2113q, iMin, iArr);
                    } else {
                        iM2112p = m2112p(this.f3830h, iM2112p, iMin, iArr);
                    }
                }
                if (m2116t(this.f3823a)) {
                    if (z3) {
                        iM2112p = m2112p(this.f3823a, iM2112p, iMin, iArr);
                    } else {
                        iM2113q = m2113q(this.f3823a, iM2113q, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM2112p);
                iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iM2113q));
                iMax = Math.max(iM2112p, currentContentInsetLeft);
                int iMin2 = Math.min(iM2113q, i15 - currentContentInsetRight);
                if (m2116t(this.f3831i)) {
                    if (z3) {
                        iMin2 = m2113q(this.f3831i, iMin2, iMin, iArr);
                    } else {
                        iMax = m2112p(this.f3831i, iMax, iMin, iArr);
                    }
                }
                if (m2116t(this.f3827e)) {
                    if (z3) {
                        iMin2 = m2113q(this.f3827e, iMin2, iMin, iArr);
                    } else {
                        iMax = m2112p(this.f3827e, iMax, iMin, iArr);
                    }
                }
                zM2116t = m2116t(this.f3824b);
                zM2116t2 = m2116t(this.f3825c);
                if (zM2116t) {
                    z2 = z3;
                    measuredHeight = 0;
                } else {
                    C2405qB c2405qB = (C2405qB) this.f3824b.getLayoutParams();
                    z2 = z3;
                    measuredHeight = this.f3824b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2405qB).topMargin + ((ViewGroup.MarginLayoutParams) c2405qB).bottomMargin;
                }
                if (!zM2116t2) {
                    C2405qB c2405qB2 = (C2405qB) this.f3825c.getLayoutParams();
                    measuredHeight = this.f3825c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2405qB2).topMargin + ((ViewGroup.MarginLayoutParams) c2405qB2).bottomMargin + measuredHeight;
                }
                if (!zM2116t || zM2116t2) {
                    C2304o4 c2304o4 = !zM2116t ? this.f3824b : this.f3825c;
                    C2304o4 c2304o42 = !zM2116t2 ? this.f3825c : this.f3824b;
                    C2405qB c2405qB3 = (C2405qB) c2304o4.getLayoutParams();
                    C2405qB c2405qB4 = (C2405qB) c2304o42.getLayoutParams();
                    int i16 = measuredHeight;
                    boolean z4 = (zM2116t && this.f3824b.getMeasuredWidth() > 0) || (zM2116t2 && this.f3825c.getMeasuredWidth() > 0);
                    i5 = this.f3845w & 112;
                    int i17 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2405qB3).topMargin + this.f3840r;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) c2405qB3).topMargin + this.f3840r;
                        if (iMax2 < i18) {
                            iMax2 = i18;
                        } else {
                            int i19 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
                            int i20 = ((ViewGroup.MarginLayoutParams) c2405qB3).bottomMargin;
                            int i21 = this.f3841s;
                            if (i19 < i20 + i21) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c2405qB4).bottomMargin + i21) - i19));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c2405qB4).bottomMargin) - this.f3841s) - i16;
                    }
                    if (z2) {
                        int i22 = (z4 ? this.f3838p : 0) - iArr[1];
                        iMin2 -= Math.max(0, i22);
                        iArr[1] = Math.max(0, -i22);
                        if (zM2116t) {
                            C2405qB c2405qB5 = (C2405qB) this.f3824b.getLayoutParams();
                            int measuredWidth = iMin2 - this.f3824b.getMeasuredWidth();
                            int measuredHeight2 = this.f3824b.getMeasuredHeight() + paddingTop;
                            this.f3824b.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i8 = measuredWidth - this.f3839q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c2405qB5).bottomMargin;
                        } else {
                            i8 = iMin2;
                        }
                        if (zM2116t2) {
                            int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2405qB) this.f3825c.getLayoutParams())).topMargin;
                            this.f3825c.layout(iMin2 - this.f3825c.getMeasuredWidth(), i23, iMin2, this.f3825c.getMeasuredHeight() + i23);
                            i9 = iMin2 - this.f3839q;
                        } else {
                            i9 = iMin2;
                        }
                        if (z4) {
                            iMin2 = Math.min(i8, i9);
                        }
                        iMax = i17;
                    } else {
                        int i24 = (z4 ? this.f3838p : 0) - iArr[0];
                        iMax = Math.max(0, i24) + i17;
                        iArr[0] = Math.max(0, -i24);
                        if (zM2116t) {
                            C2405qB c2405qB6 = (C2405qB) this.f3824b.getLayoutParams();
                            int measuredWidth2 = this.f3824b.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f3824b.getMeasuredHeight() + paddingTop;
                            this.f3824b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i6 = measuredWidth2 + this.f3839q;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c2405qB6).bottomMargin;
                        } else {
                            i6 = iMax;
                        }
                        if (zM2116t2) {
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2405qB) this.f3825c.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f3825c.getMeasuredWidth() + iMax;
                            this.f3825c.layout(iMax, i25, measuredWidth3, this.f3825c.getMeasuredHeight() + i25);
                            i7 = measuredWidth3 + this.f3839q;
                        } else {
                            i7 = iMax;
                        }
                        if (z4) {
                            iMax = Math.max(i6, i7);
                        }
                    }
                }
                ArrayList arrayList = this.f3806D;
                m2101a(arrayList, 3);
                size = arrayList.size();
                iM2112p2 = iMax;
                for (i10 = 0; i10 < size; i10++) {
                    iM2112p2 = m2112p((View) arrayList.get(i10), iM2112p2, iMin, iArr);
                }
                m2101a(arrayList, 5);
                size2 = arrayList.size();
                for (i11 = 0; i11 < size2; i11++) {
                    iMin2 = m2113q((View) arrayList.get(i11), iMin2, iMin, iArr);
                }
                m2101a(arrayList, 1);
                int i26 = iArr[0];
                int i27 = iArr[1];
                size3 = arrayList.size();
                int i28 = i26;
                i12 = 0;
                int measuredWidth4 = 0;
                while (i12 < size3) {
                    View view = (View) arrayList.get(i12);
                    C2405qB c2405qB7 = (C2405qB) view.getLayoutParams();
                    int i29 = i27;
                    int i30 = ((ViewGroup.MarginLayoutParams) c2405qB7).leftMargin - i28;
                    int i31 = ((ViewGroup.MarginLayoutParams) c2405qB7).rightMargin - i29;
                    int iMax3 = Math.max(0, i30);
                    int iMax4 = Math.max(0, i31);
                    int iMax5 = Math.max(0, -i30);
                    int iMax6 = Math.max(0, -i31);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i12++;
                    i28 = iMax5;
                    i27 = iMax6;
                }
                i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i32 = measuredWidth4 + i14;
                if (i14 >= iM2112p2) {
                    iM2112p2 = i32 > iMin2 ? i14 - (i32 - iMin2) : i14;
                }
                size4 = arrayList.size();
                for (i13 = 0; i13 < size4; i13++) {
                    iM2112p2 = m2112p((View) arrayList.get(i13), iM2112p2, iMin, iArr);
                }
                arrayList.clear();
            }
            iM2112p = m2112p(this.f3826d, paddingLeft, iMin, iArr);
        }
        iM2113q = i15;
        if (m2116t(this.f3830h)) {
        }
        if (m2116t(this.f3823a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM2112p);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iM2113q));
        iMax = Math.max(iM2112p, currentContentInsetLeft2);
        int iMin22 = Math.min(iM2113q, i15 - currentContentInsetRight2);
        if (m2116t(this.f3831i)) {
        }
        if (m2116t(this.f3827e)) {
        }
        zM2116t = m2116t(this.f3824b);
        zM2116t2 = m2116t(this.f3825c);
        if (zM2116t) {
        }
        if (!zM2116t2) {
        }
        if (!zM2116t) {
            if (!zM2116t) {
            }
            if (!zM2116t2) {
            }
            C2405qB c2405qB32 = (C2405qB) c2304o4.getLayoutParams();
            C2405qB c2405qB42 = (C2405qB) c2304o42.getLayoutParams();
            int i162 = measuredHeight;
            if (zM2116t) {
                i5 = this.f3845w & 112;
                int i172 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            } else {
                i5 = this.f3845w & 112;
                int i1722 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            }
        }
        ArrayList arrayList2 = this.f3806D;
        m2101a(arrayList2, 3);
        size = arrayList2.size();
        iM2112p2 = iMax;
        while (i10 < size) {
        }
        m2101a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i11 < size2) {
        }
        m2101a(arrayList2, 1);
        int i262 = iArr[0];
        int i272 = iArr[1];
        size3 = arrayList2.size();
        int i282 = i262;
        i12 = 0;
        int measuredWidth42 = 0;
        while (i12 < size3) {
        }
        i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i322 = measuredWidth42 + i14;
        if (i14 >= iM2112p2) {
        }
        size4 = arrayList2.size();
        while (i13 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM2099k;
        int iMax;
        int iCombineMeasuredStates;
        int iM2099k2;
        int iM2100l;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (m2116t(this.f3826d)) {
            m2115s(this.f3826d, i, 0, i2, this.f3837o);
            iM2099k = m2099k(this.f3826d) + this.f3826d.getMeasuredWidth();
            iMax = Math.max(0, m2100l(this.f3826d) + this.f3826d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3826d.getMeasuredState());
        } else {
            iM2099k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m2116t(this.f3830h)) {
            m2115s(this.f3830h, i, 0, i2, this.f3837o);
            iM2099k = m2099k(this.f3830h) + this.f3830h.getMeasuredWidth();
            iMax = Math.max(iMax, m2100l(this.f3830h) + this.f3830h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3830h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM2099k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM2099k);
        Object[] objArr2 = objArr;
        int[] iArr = this.f3808F;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m2116t(this.f3823a)) {
            m2115s(this.f3823a, i, iMax3, i2, this.f3837o);
            iM2099k2 = m2099k(this.f3823a) + this.f3823a.getMeasuredWidth();
            iMax = Math.max(iMax, m2100l(this.f3823a) + this.f3823a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3823a.getMeasuredState());
        } else {
            iM2099k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM2099k2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM2099k2);
        if (m2116t(this.f3831i)) {
            iMax5 += m2114r(this.f3831i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m2100l(this.f3831i) + this.f3831i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3831i.getMeasuredState());
        }
        if (m2116t(this.f3827e)) {
            iMax5 += m2114r(this.f3827e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m2100l(this.f3827e) + this.f3827e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3827e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C2405qB) childAt.getLayoutParams()).f8439b == 0 && m2116t(childAt)) {
                iMax5 += m2114r(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m2100l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f3840r + this.f3841s;
        int i7 = this.f3838p + this.f3839q;
        if (m2116t(this.f3824b)) {
            m2114r(this.f3824b, i, i5 + i7, i2, i6, iArr);
            int iM2099k3 = m2099k(this.f3824b) + this.f3824b.getMeasuredWidth();
            iM2100l = m2100l(this.f3824b) + this.f3824b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3824b.getMeasuredState());
            iMax2 = iM2099k3;
        } else {
            iM2100l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m2116t(this.f3825c)) {
            iMax2 = Math.max(iMax2, m2114r(this.f3825c, i, i5 + i7, i2, i6 + iM2100l, iArr));
            iM2100l += m2100l(this.f3825c) + this.f3825c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f3825c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM2100l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f3818P) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m2116t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C2491sB)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2491sB c2491sB = (C2491sB) parcelable;
        super.onRestoreInstanceState(c2491sB.f8397a);
        ActionMenuView actionMenuView = this.f3823a;
        MenuC2204lr menuC2204lr = actionMenuView != null ? actionMenuView.f3777p : null;
        int i = c2491sB.f8753c;
        if (i != 0 && this.f3815M != null && menuC2204lr != null && (menuItemFindItem = menuC2204lr.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c2491sB.f8754d) {
            RunnableC0431K0 runnableC0431K0 = this.f3822T;
            removeCallbacks(runnableC0431K0);
            post(runnableC0431K0);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m2104d();
        C0727Qw c0727Qw = this.f3842t;
        boolean z = i == 1;
        if (z == c0727Qw.f2322g) {
            return;
        }
        c0727Qw.f2322g = z;
        if (!c0727Qw.f2323h) {
            c0727Qw.f2316a = c0727Qw.f2320e;
            c0727Qw.f2317b = c0727Qw.f2321f;
            return;
        }
        if (z) {
            int i2 = c0727Qw.f2319d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0727Qw.f2320e;
            }
            c0727Qw.f2316a = i2;
            int i3 = c0727Qw.f2318c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0727Qw.f2321f;
            }
            c0727Qw.f2317b = i3;
            return;
        }
        int i4 = c0727Qw.f2318c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0727Qw.f2320e;
        }
        c0727Qw.f2316a = i4;
        int i5 = c0727Qw.f2319d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0727Qw.f2321f;
        }
        c0727Qw.f2317b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2427qr c2427qr;
        C2491sB c2491sB = new C2491sB(super.onSaveInstanceState());
        C2354pB c2354pB = this.f3815M;
        if (c2354pB != null && (c2427qr = c2354pB.f8238b) != null) {
            c2491sB.f8753c = c2427qr.f8492a;
        }
        c2491sB.f8754d = m2111o();
        return c2491sB;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3804B = false;
        }
        if (!this.f3804B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3804B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3804B = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m2112p(View view, int i, int i2, int[] iArr) {
        C2405qB c2405qB = (C2405qB) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c2405qB).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM2108j = m2108j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM2108j, iMax + measuredWidth, view.getMeasuredHeight() + iM2108j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c2405qB).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m2113q(View view, int i, int i2, int[] iArr) {
        C2405qB c2405qB = (C2405qB) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c2405qB).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM2108j = m2108j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM2108j, iMax, view.getMeasuredHeight() + iM2108j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c2405qB).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m2114r(View view, int i, int i2, int i3, int i4, int[] iArr) {
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
    public final void m2115s(View view, int i, int i2, int i3, int i4) {
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
        if (this.f3821S != z) {
            this.f3821S = z;
            m2118v();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f3818P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3844v) {
            this.f3844v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3843u) {
            this.f3843u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC1406fG.m2695U(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m2107g();
        this.f3826d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC2448rB interfaceC2448rB) {
        this.f3811I = interfaceC2448rB;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2105e();
        this.f3823a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f3833k != i) {
            this.f3833k = i;
            if (i == 0) {
                this.f3832j = getContext();
            } else {
                this.f3832j = new ContextThemeWrapper(getContext(), i);
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
        this.f3841s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f3839q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f3838p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f3840r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2116t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2117u() {
        C0130D0 c0130d0;
        ActionMenuView actionMenuView = this.f3823a;
        return (actionMenuView == null || (c0130d0 = actionMenuView.f3781t) == null || !c0130d0.m223l()) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final void m2118v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM4720a = AbstractC2311oB.m4720a(this);
            C2354pB c2354pB = this.f3815M;
            boolean z = (c2354pB == null || c2354pB.f8238b == null || onBackInvokedDispatcherM4720a == null || !isAttachedToWindow() || !this.f3821S) ? false : true;
            if (z && this.f3820R == null) {
                if (this.f3819Q == null) {
                    this.f3819Q = AbstractC2311oB.m4721b(new RunnableC2225mB(this, 0));
                }
                AbstractC2311oB.m4722c(onBackInvokedDispatcherM4720a, this.f3819Q);
                this.f3820R = onBackInvokedDispatcherM4720a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f3820R) == null) {
                return;
            }
            AbstractC2311oB.m4723d(onBackInvokedDispatcher, this.f3819Q);
            this.f3820R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3845w = 8388627;
        this.f3806D = new ArrayList();
        this.f3807E = new ArrayList();
        this.f3808F = new int[2];
        this.f3809G = new C2656w4(new RunnableC2225mB(this, 1));
        this.f3810H = new ArrayList();
        this.f3812J = new C2268nB(this);
        this.f3822T = new RunnableC0431K0(16, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0982Wu.f3089x;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC2185lE.m4398k(this, context, iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        this.f3834l = typedArray.getResourceId(28, 0);
        this.f3835m = typedArray.getResourceId(19, 0);
        this.f3845w = typedArray.getInteger(0, 8388627);
        this.f3836n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3841s = dimensionPixelOffset;
        this.f3840r = dimensionPixelOffset;
        this.f3839q = dimensionPixelOffset;
        this.f3838p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3838p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3839q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3840r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3841s = dimensionPixelOffset5;
        }
        this.f3837o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m2104d();
        C0727Qw c0727Qw = this.f3842t;
        c0727Qw.f2323h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0727Qw.f2320e = dimensionPixelSize;
            c0727Qw.f2316a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0727Qw.f2321f = dimensionPixelSize2;
            c0727Qw.f2317b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0727Qw.m1510a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3843u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3844v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3828f = c2656w4M5186A.m5210q(4);
        this.f3829g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3832j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM5210q = c2656w4M5186A.m5210q(16);
        if (drawableM5210q != null) {
            setNavigationIcon(drawableM5210q);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM5210q2 = c2656w4M5186A.m5210q(11);
        if (drawableM5210q2 != null) {
            setLogo(drawableM5210q2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c2656w4M5186A.m5209p(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c2656w4M5186A.m5209p(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c2656w4M5186A.m5195E();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C2405qB c2405qB = new C2405qB(context, attributeSet);
        c2405qB.f8438a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3067b);
        c2405qB.f8438a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c2405qB.f8439b = 0;
        return c2405qB;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2103c();
        }
        C0434K3 c0434k3 = this.f3830h;
        if (c0434k3 != null) {
            c0434k3.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m2103c();
            this.f3830h.setImageDrawable(drawable);
        } else {
            C0434K3 c0434k3 = this.f3830h;
            if (c0434k3 != null) {
                c0434k3.setImageDrawable(this.f3828f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3827e == null) {
                this.f3827e = new C0520M3(getContext(), null, 0);
            }
            if (!m2110n(this.f3827e)) {
                m2102b(this.f3827e, true);
            }
        } else {
            C0520M3 c0520m3 = this.f3827e;
            if (c0520m3 != null && m2110n(c0520m3)) {
                removeView(this.f3827e);
                this.f3807E.remove(this.f3827e);
            }
        }
        C0520M3 c0520m32 = this.f3827e;
        if (c0520m32 != null) {
            c0520m32.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3827e == null) {
            this.f3827e = new C0520M3(getContext(), null, 0);
        }
        C0520M3 c0520m3 = this.f3827e;
        if (c0520m3 != null) {
            c0520m3.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2107g();
        }
        C0434K3 c0434k3 = this.f3826d;
        if (c0434k3 != null) {
            c0434k3.setContentDescription(charSequence);
            AbstractC2706xB.m5280a(this.f3826d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2107g();
            if (!m2110n(this.f3826d)) {
                m2102b(this.f3826d, true);
            }
        } else {
            C0434K3 c0434k3 = this.f3826d;
            if (c0434k3 != null && m2110n(c0434k3)) {
                removeView(this.f3826d);
                this.f3807E.remove(this.f3826d);
            }
        }
        C0434K3 c0434k32 = this.f3826d;
        if (c0434k32 != null) {
            c0434k32.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2304o4 c2304o4 = this.f3825c;
            if (c2304o4 != null && m2110n(c2304o4)) {
                removeView(this.f3825c);
                this.f3807E.remove(this.f3825c);
            }
        } else {
            if (this.f3825c == null) {
                Context context = getContext();
                C2304o4 c2304o42 = new C2304o4(context, null);
                this.f3825c = c2304o42;
                c2304o42.setSingleLine();
                this.f3825c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3835m;
                if (i != 0) {
                    this.f3825c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3803A;
                if (colorStateList != null) {
                    this.f3825c.setTextColor(colorStateList);
                }
            }
            if (!m2110n(this.f3825c)) {
                m2102b(this.f3825c, true);
            }
        }
        C2304o4 c2304o43 = this.f3825c;
        if (c2304o43 != null) {
            c2304o43.setText(charSequence);
        }
        this.f3847y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3803A = colorStateList;
        C2304o4 c2304o4 = this.f3825c;
        if (c2304o4 != null) {
            c2304o4.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2304o4 c2304o4 = this.f3824b;
            if (c2304o4 != null && m2110n(c2304o4)) {
                removeView(this.f3824b);
                this.f3807E.remove(this.f3824b);
            }
        } else {
            if (this.f3824b == null) {
                Context context = getContext();
                C2304o4 c2304o42 = new C2304o4(context, null);
                this.f3824b = c2304o42;
                c2304o42.setSingleLine();
                this.f3824b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3834l;
                if (i != 0) {
                    this.f3824b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3848z;
                if (colorStateList != null) {
                    this.f3824b.setTextColor(colorStateList);
                }
            }
            if (!m2110n(this.f3824b)) {
                m2102b(this.f3824b, true);
            }
        }
        C2304o4 c2304o43 = this.f3824b;
        if (c2304o43 != null) {
            c2304o43.setText(charSequence);
        }
        this.f3846x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3848z = colorStateList;
        C2304o4 c2304o4 = this.f3824b;
        if (c2304o4 != null) {
            c2304o4.setTextColor(colorStateList);
        }
    }
}
