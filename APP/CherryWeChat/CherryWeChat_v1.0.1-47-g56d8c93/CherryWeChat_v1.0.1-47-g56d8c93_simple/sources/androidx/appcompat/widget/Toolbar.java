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

    public Toolbar(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> r0 = new ArrayList();
        Menu r1 = getMenu();
        int r2 = 0;
    L4:
        if (r2 >= r1.size()) goto L6;
        r0.add(r1.getItem(r2));
        r2 = r2 + 1;
        goto L4
    L6:
        return r0;
    }

    private MenuInflater getMenuInflater() {
        return new C0515Lz(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C2405qB m2097h() {
        C2405qB r0 = new C2405qB(-2, -2);
        r0.f8439b = 0;
        r0.f8438a = 8388627;
        return r0;
    }

    /* JADX INFO: renamed from: i */
    public static C2405qB m2098i(ViewGroup.LayoutParams r2) {
        boolean r0 = r2 instanceof C2405qB;
        if (r0 == false) goto L6;
        C2405qB r22 = (C2405qB) r2;
        C2405qB r02 = new C2405qB(r22);
        r02.f8439b = 0;
        r02.f8439b = r22.f8439b;
        return r02;
    L6:
        if (r0 == false) goto L10;
        C2405qB r03 = new C2405qB((C2405qB) r2);
        r03.f8439b = 0;
        return r03;
    L10:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L13;
        ViewGroup.MarginLayoutParams r23 = (ViewGroup.MarginLayoutParams) r2;
        C2405qB r04 = new C2405qB(r23);
        r04.f8439b = 0;
        ((ViewGroup.MarginLayoutParams) r04).leftMargin = r23.leftMargin;
        ((ViewGroup.MarginLayoutParams) r04).topMargin = r23.topMargin;
        ((ViewGroup.MarginLayoutParams) r04).rightMargin = r23.rightMargin;
        ((ViewGroup.MarginLayoutParams) r04).bottomMargin = r23.bottomMargin;
        return r04;
    L13:
        C2405qB r05 = new C2405qB(r2);
        r05.f8439b = 0;
        return r05;
    }

    /* JADX INFO: renamed from: k */
    public static int m2099k(View r1) {
        ViewGroup.MarginLayoutParams r12 = (ViewGroup.MarginLayoutParams) r1.getLayoutParams();
        int r0 = r12.getMarginStart();
        return r12.getMarginEnd() + r0;
    }

    /* JADX INFO: renamed from: l */
    public static int m2100l(View r1) {
        ViewGroup.MarginLayoutParams r12 = (ViewGroup.MarginLayoutParams) r1.getLayoutParams();
        return r12.topMargin + r12.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m2101a(ArrayList r9, int r10) {
        int r1 = 0;
        if (getLayoutDirection() != 1) goto L5;
        boolean r0 = true;
    L6:
        int r3 = getChildCount();
        int r102 = Gravity.getAbsoluteGravity(r10, getLayoutDirection());
        r9.clear();
        if (r0 == false) goto L24;
        int r32 = r3 - 1;
    L9:
        if (r32 < 0) goto L39;
        View r02 = getChildAt(r32);
        C2405qB r12 = (C2405qB) r02.getLayoutParams();
        if (r12.f8439b != 0) goto L23;
        if (m2116t(r02) == false) goto L23;
        int r13 = r12.f8438a;
        int r6 = getLayoutDirection();
        int r14 = Gravity.getAbsoluteGravity(r13, r6) & 7;
        if (r14 == 1) goto L21;
        if (r14 == 3) goto L21;
        if (r14 == 5) goto L21;
        if (r6 != 1) goto L20;
        r14 = 5;
        goto L21
    L20:
        r14 = 3;
    L21:
        if (r14 != r102) goto L23;
        r9.add(r02);
    L23:
        r32 = r32 - 1;
        goto L9
    L39:
        return;
    L24:
        if (r1 >= r3) goto L50;
        View r03 = getChildAt(r1);
        C2405qB r62 = (C2405qB) r03.getLayoutParams();
        if (r62.f8439b != 0) goto L38;
        if (m2116t(r03) == false) goto L38;
        int r63 = r62.f8438a;
        int r7 = getLayoutDirection();
        int r64 = Gravity.getAbsoluteGravity(r63, r7) & 7;
        if (r64 == 1) goto L36;
        if (r64 == 3) goto L36;
        if (r64 == 5) goto L36;
        if (r7 != 1) goto L35;
        r64 = 5;
        goto L36
    L35:
        r64 = 3;
    L36:
        if (r64 != r102) goto L38;
        r9.add(r03);
    L38:
        r1 = r1 + 1;
        goto L24
    L50:
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m2102b(View r3, boolean r4) {
        ViewGroup.LayoutParams r0 = r3.getLayoutParams();
        if (r0 != null) goto L6;
        C2405qB r02 = m2097h();
    L9:
        r02.f8439b = 1;
        if (r4 == true) goto L12;
    L15:
        addView(r3, r02);
        return;
    L12:
        if (this.f3831i == null) goto L15;
        r3.setLayoutParams(r02);
        this.f3807E.add(r3);
        return;
    L6:
        if (checkLayoutParams(r0) == true) goto L8;
        r02 = m2098i(r0);
        goto L9
    L8:
        r02 = (C2405qB) r0;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final void m2103c() {
        if (this.f3830h != null) goto L6;
        C0434K3 r0 = new C0434K3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
        this.f3830h = r0;
        r0.setImageDrawable(this.f3828f);
        this.f3830h.setContentDescription(this.f3829g);
        C2405qB r02 = m2097h();
        r02.f8438a = (this.f3836n & 112) | 8388611;
        r02.f8439b = 2;
        this.f3830h.setLayoutParams(r02);
        this.f3830h.setOnClickListener(new ViewOnClickListenerC2343p0(4, this));
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if (super.checkLayoutParams(r2) == true) goto L5;
        return false;
    L5:
        if ((r2 instanceof C2405qB) == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m2104d() {
        if (this.f3842t != null) goto L6;
        C0727Qw r0 = new C0727Qw();
        r0.f2316a = 0;
        r0.f2317b = 0;
        r0.f2318c = Integer.MIN_VALUE;
        r0.f2319d = Integer.MIN_VALUE;
        r0.f2320e = 0;
        r0.f2321f = 0;
        r0.f2322g = false;
        r0.f2323h = false;
        this.f3842t = r0;
        return;
    }

    /* JADX INFO: renamed from: e */
    public final void m2105e() {
        m2106f();
        ActionMenuView r0 = this.f3823a;
        if (r0.f3777p != null) goto L9;
        MenuC2204lr r02 = (MenuC2204lr) r0.getMenu();
        if (this.f3815M != null) goto L7;
        this.f3815M = new C2354pB(this);
    L7:
        this.f3823a.setExpandedActionViewsExclusive(true);
        r02.m4429b(this.f3815M, this.f3832j);
        m2118v();
        return;
    }

    /* JADX INFO: renamed from: f */
    public final void m2106f() {
        if (this.f3823a != null) goto L6;
        ActionMenuView r0 = new ActionMenuView(getContext(), null);
        this.f3823a = r0;
        r0.setPopupTheme(this.f3833k);
        this.f3823a.setOnMenuItemClickListener(this.f3812J);
        ActionMenuView r02 = this.f3823a;
        C1037Y5 r1 = this.f3816N;
        C2268nB r2 = new C2268nB(this);
        r02.f3782u = r1;
        r02.f3783v = r2;
        C2405qB r03 = m2097h();
        r03.f8438a = (this.f3836n & 112) | 8388613;
        this.f3823a.setLayoutParams(r03);
        m2102b(this.f3823a, false);
        return;
    }

    /* JADX INFO: renamed from: g */
    public final void m2107g() {
        if (this.f3826d != null) goto L6;
        this.f3826d = new C0434K3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
        C2405qB r0 = m2097h();
        r0.f8438a = (this.f3836n & 112) | 8388611;
        this.f3826d.setLayoutParams(r0);
        return;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2097h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return m2098i(r1);
    }

    public CharSequence getCollapseContentDescription() {
        C0434K3 r0 = this.f3830h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getContentDescription();
    }

    public Drawable getCollapseIcon() {
        C0434K3 r0 = this.f3830h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getDrawable();
    }

    public int getContentInsetEnd() {
        C0727Qw r0 = this.f3842t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.f2322g == false) goto L9;
        return r0.f2316a;
    L9:
        return r0.f2317b;
    }

    public int getContentInsetEndWithActions() {
        int r0 = this.f3844v;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0727Qw r0 = this.f3842t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.f2316a;
    }

    public int getContentInsetRight() {
        C0727Qw r0 = this.f3842t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.f2317b;
    }

    public int getContentInsetStart() {
        C0727Qw r0 = this.f3842t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.f2322g == false) goto L9;
        return r0.f2317b;
    L9:
        return r0.f2316a;
    }

    public int getContentInsetStartWithNavigation() {
        int r0 = this.f3843u;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ActionMenuView r0 = this.f3823a;
        if (r0 == null) goto L11;
        MenuC2204lr r02 = r0.f3777p;
        if (r02 == null) goto L11;
        if (r02.hasVisibleItems() == false) goto L11;
        return Math.max(getContentInsetEnd(), Math.max(this.f3844v, 0));
    L11:
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() != 1) goto L7;
        return getCurrentContentInsetEnd();
    L7:
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() != 1) goto L7;
        return getCurrentContentInsetStart();
    L7:
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() == null) goto L7;
        return Math.max(getContentInsetStart(), Math.max(this.f3843u, 0));
    L7:
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C0520M3 r0 = this.f3827e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getDrawable();
    }

    public CharSequence getLogoDescription() {
        C0520M3 r0 = this.f3827e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getContentDescription();
    }

    public Menu getMenu() {
        m2105e();
        return this.f3823a.getMenu();
    }

    public View getNavButtonView() {
        return this.f3826d;
    }

    public CharSequence getNavigationContentDescription() {
        C0434K3 r0 = this.f3826d;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getContentDescription();
    }

    public Drawable getNavigationIcon() {
        C0434K3 r0 = this.f3826d;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getDrawable();
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
        if (this.f3813K != null) goto L6;
        this.f3813K = new C2663wB(this, true);
    L6:
        return this.f3813K;
    }

    /* JADX INFO: renamed from: j */
    public final int m2108j(View r7, int r8) {
        C2405qB r0 = (C2405qB) r7.getLayoutParams();
        int r72 = r7.getMeasuredHeight();
        if (r8 <= 0) goto L5;
        int r82 = (r72 - r8) / 2;
    L6:
        int r2 = r0.f8438a & 112;
        if (r2 == 16) goto L11;
        if (r2 == 48) goto L11;
        if (r2 == 80) goto L11;
        r2 = this.f3845w & 112;
    L11:
        if (r2 == 48) goto L24;
        if (r2 == 80) goto L22;
        int r83 = getPaddingTop();
        int r22 = getPaddingBottom();
        int r3 = getHeight();
        int r4 = (((r3 - r83) - r22) - r72) / 2;
        int r5 = ((ViewGroup.MarginLayoutParams) r0).topMargin;
        if (r4 >= r5) goto L16;
        r4 = r5;
    L20:
        return r83 + r4;
    L16:
        int r32 = (((r3 - r22) - r72) - r4) - r83;
        int r73 = ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
        if (r32 >= r73) goto L20;
        r4 = Math.max(0, r4 - (r73 - r32));
        goto L20
    L22:
        return (((getHeight() - getPaddingBottom()) - r72) - ((ViewGroup.MarginLayoutParams) r0).bottomMargin) - r82;
    L24:
        return getPaddingTop() - r82;
    L5:
        r82 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: m */
    public final void m2109m() {
        Iterator r0 = this.f3810H.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        MenuItem r1 = (MenuItem) r0.next();
        getMenu().removeItem(r1.getItemId());
        goto L4
    L6:
        getMenu();
        ArrayList<MenuItem> r02 = getCurrentMenuItems();
        getMenuInflater();
        Iterator r12 = ((CopyOnWriteArrayList) this.f3809G.f9198d).iterator();
    L8:
        if (r12.hasNext() == false) goto L10;
        ((C2504si) ((InterfaceC0206Er) r12.next())).f8791a.m5412j();
        goto L8
    L10:
        ArrayList<MenuItem> r13 = getCurrentMenuItems();
        r13.removeAll(r02);
        this.f3810H = r13;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2110n(View r2) {
        if (r2.getParent() != this) goto L5;
        return true;
    L5:
        if (this.f3807E.contains(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2111o() {
        ActionMenuView r0 = this.f3823a;
        if (r0 == null) goto L10;
        C0130D0 r02 = r0.f3781t;
        if (r02 != null) goto L7;
        return false;
    L7:
        if (r02.m219h() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
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
    public final boolean onHoverEvent(MotionEvent r6) {
        int r0 = r6.getActionMasked();
        if (r0 != 9) goto L6;
        this.f3805C = false;
    L6:
        if (this.f3805C == true) goto L12;
        boolean r62 = super.onHoverEvent(r6);
        if (r0 != 9) goto L12;
        if (r62 == true) goto L12;
        this.f3805C = true;
    L12:
        if (r0 != 10) goto L14;
    L17:
        this.f3805C = false;
        return true;
    L14:
        if (r0 == 3) goto L17;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        if (getLayoutDirection() != 1) goto L5;
        boolean r1 = true;
    L6:
        int r4 = getWidth();
        int r5 = getHeight();
        int r6 = getPaddingLeft();
        int r7 = getPaddingRight();
        int r8 = getPaddingTop();
        int r9 = getPaddingBottom();
        int r10 = r4 - r7;
        int[] r11 = this.f3808F;
        r11[1] = 0;
        r11[0] = 0;
        WeakHashMap r12 = AbstractC2185lE.f7617a;
        int r122 = getMinimumHeight();
        if (r122 < 0) goto L9;
        int r123 = Math.min(r122, r24 - r22);
    L11:
        if (m2116t(this.f3826d) == false) goto L16;
        if (r1 == false) goto L14;
        int r14 = m2113q(this.f3826d, r10, r123, r11);
        int r13 = r6;
    L18:
        if (m2116t(this.f3830h) == false) goto L23;
        if (r1 == false) goto L21;
        r14 = m2113q(this.f3830h, r14, r123, r11);
        goto L23
    L21:
        r13 = m2112p(this.f3830h, r13, r123, r11);
    L23:
        if (m2116t(this.f3823a) == false) goto L27;
        if (r1 == false) goto L26;
        r13 = m2112p(this.f3823a, r13, r123, r11);
        goto L27
    L26:
        r14 = m2113q(this.f3823a, r14, r123, r11);
    L27:
        int r15 = getCurrentContentInsetLeft();
        int r16 = getCurrentContentInsetRight();
        r11[0] = Math.max(0, r15 - r13);
        r11[1] = Math.max(0, r16 - (r10 - r14));
        int r3 = Math.max(r13, r15);
        int r102 = Math.min(r14, r10 - r16);
        if (m2116t(this.f3831i) == false) goto L33;
        if (r1 == false) goto L31;
        r102 = m2113q(this.f3831i, r102, r123, r11);
        goto L33
    L31:
        r3 = m2112p(this.f3831i, r3, r123, r11);
    L33:
        if (m2116t(this.f3827e) == false) goto L37;
        if (r1 == false) goto L36;
        r102 = m2113q(this.f3827e, r102, r123, r11);
        goto L37
    L36:
        r3 = m2112p(this.f3827e, r3, r123, r11);
    L37:
        boolean r132 = m2116t(this.f3824b);
        boolean r142 = m2116t(this.f3825c);
        if (r132 == false) goto L40;
        C2405qB r152 = (C2405qB) this.f3824b.getLayoutParams();
        boolean r232 = r1;
        int r17 = (this.f3824b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r152).topMargin) + ((ViewGroup.MarginLayoutParams) r152).bottomMargin;
    L41:
        if (r142 == false) goto L44;
        C2405qB r2 = (C2405qB) this.f3825c.getLayoutParams();
        int r222 = r17;
        r17 = ((this.f3825c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r2).topMargin) + ((ViewGroup.MarginLayoutParams) r2).bottomMargin) + r222;
    L44:
        if (r132 == true) goto L46;
        if (r142 == true) goto L46;
    L101:
        ArrayList r25 = this.f3806D;
        m2101a(r25, 3);
        int r18 = r25.size();
        int r52 = r3;
        int r32 = 0;
    L102:
        if (r32 >= r18) goto L104;
        r52 = m2112p((View) r25.get(r32), r52, r123, r11);
        r32 = r32 + 1;
        goto L102
    L104:
        m2101a(r25, 5);
        int r19 = r25.size();
        int r33 = 0;
    L105:
        if (r33 >= r19) goto L107;
        r102 = m2113q((View) r25.get(r33), r102, r123, r11);
        r33 = r33 + 1;
        goto L105
    L107:
        m2101a(r25, 1);
        int r82 = r11[0];
        int r110 = r11[1];
        int r34 = r25.size();
        int r133 = r82;
        int r83 = 0;
        int r92 = 0;
    L108:
        if (r83 >= r34) goto L110;
        View r143 = (View) r25.get(r83);
        C2405qB r153 = (C2405qB) r143.getLayoutParams();
        int r202 = r110;
        int r111 = ((ViewGroup.MarginLayoutParams) r153).leftMargin - r133;
        int r134 = ((ViewGroup.MarginLayoutParams) r153).rightMargin - r202;
        int r162 = Math.max(0, r111);
        int r172 = Math.max(0, r134);
        int r112 = Math.max(0, -r111);
        int r135 = Math.max(0, -r134);
        r92 = r92 + ((r143.getMeasuredWidth() + r162) + r172);
        r83 = r83 + 1;
        r133 = r112;
        r110 = r135;
        goto L108
    L110:
        int r154 = 0;
        int r42 = ((((r4 - r6) - r7) / 2) + r6) - (r92 / 2);
        int r93 = r92 + r42;
        if (r42 < r52) goto L116;
        if (r93 <= r102) goto L115;
        r52 = r42 - (r93 - r102);
        goto L116
    L115:
        r52 = r42;
    L116:
        int r113 = r25.size();
    L117:
        if (r154 >= r113) goto L119;
        r52 = m2112p((View) r25.get(r154), r52, r123, r11);
        r154 = r154 + 1;
        goto L117
    L119:
        r25.clear();
        return;
    L46:
        if (r132 == false) goto L48;
        C2304o4 r26 = this.f3824b;
    L49:
        if (r142 == false) goto L51;
        C2304o4 r155 = this.f3825c;
    L52:
        C2405qB r27 = (C2405qB) r26.getLayoutParams();
        C2405qB r156 = (C2405qB) r155.getLayoutParams();
        int r223 = r17;
        if (r132 == true) goto L55;
    L56:
        if (r142 == true) goto L58;
    L60:
        boolean r242 = false;
    L61:
        int r114 = this.f3845w & 112;
        int r163 = r3;
        if (r114 != 48) goto L64;
        int r84 = (getPaddingTop() + ((ViewGroup.MarginLayoutParams) r27).topMargin) + this.f3840r;
    L74:
        if (r232 == false) goto L88;
        if (r242 == false) goto L77;
        int r115 = this.f3838p;
    L78:
        int r116 = r115 - r11[1];
        r102 = r102 - Math.max(0, r116);
        r11[1] = Math.max(0, -r116);
        if (r132 == false) goto L81;
        C2405qB r117 = (C2405qB) this.f3824b.getLayoutParams();
        int r28 = r102 - this.f3824b.getMeasuredWidth();
        int r35 = this.f3824b.getMeasuredHeight() + r84;
        this.f3824b.layout(r28, r84, r102, r35);
        int r29 = r28 - this.f3839q;
        r84 = r35 + ((ViewGroup.MarginLayoutParams) r117).bottomMargin;
    L82:
        if (r142 == false) goto L84;
        int r85 = r84 + ((ViewGroup.MarginLayoutParams) ((C2405qB) this.f3825c.getLayoutParams())).topMargin;
        this.f3825c.layout(r102 - this.f3825c.getMeasuredWidth(), r85, r102, this.f3825c.getMeasuredHeight() + r85);
        int r118 = r102 - this.f3839q;
    L85:
        if (r242 == false) goto L87;
        r102 = Math.min(r29, r118);
    L87:
        r3 = r163;
        goto L101
    L84:
        r118 = r102;
        goto L85
    L81:
        r29 = r102;
        goto L82
    L77:
        r115 = 0;
        goto L78
    L88:
        if (r242 == false) goto L91;
        int r119 = this.f3838p;
    L92:
        int r120 = r119 - r11[0];
        r3 = Math.max(0, r120) + r163;
        r11[0] = Math.max(0, -r120);
        if (r132 == false) goto L95;
        C2405qB r121 = (C2405qB) this.f3824b.getLayoutParams();
        int r210 = this.f3824b.getMeasuredWidth() + r3;
        int r53 = this.f3824b.getMeasuredHeight() + r84;
        this.f3824b.layout(r3, r84, r210, r53);
        int r211 = r210 + this.f3839q;
        r84 = r53 + ((ViewGroup.MarginLayoutParams) r121).bottomMargin;
    L96:
        if (r142 == false) goto L98;
        int r86 = r84 + ((ViewGroup.MarginLayoutParams) ((C2405qB) this.f3825c.getLayoutParams())).topMargin;
        int r124 = this.f3825c.getMeasuredWidth() + r3;
        this.f3825c.layout(r3, r86, r124, this.f3825c.getMeasuredHeight() + r86);
        int r125 = r124 + this.f3839q;
    L99:
        if (r242 == false) goto L101;
        r3 = Math.max(r211, r125);
        goto L101
    L98:
        r125 = r3;
        goto L99
    L95:
        r211 = r3;
        goto L96
    L91:
        r119 = 0;
        goto L92
    L64:
        if (r114 == 80) goto L72;
        int r126 = (((r5 - r8) - r9) - r223) / 2;
        int r36 = ((ViewGroup.MarginLayoutParams) r27).topMargin + this.f3840r;
        if (r126 >= r36) goto L68;
        r126 = r36;
    L71:
        r84 = r8 + r126;
        goto L74
    L68:
        int r54 = (((r5 - r9) - r223) - r126) - r8;
        int r212 = ((ViewGroup.MarginLayoutParams) r27).bottomMargin;
        int r37 = this.f3841s;
        if (r54 >= (r212 + r37)) goto L71;
        r126 = Math.max(0, r126 - ((((ViewGroup.MarginLayoutParams) r156).bottomMargin + r37) - r54));
        goto L71
    L72:
        r84 = (((r5 - r9) - ((ViewGroup.MarginLayoutParams) r156).bottomMargin) - this.f3841s) - r223;
        goto L74
    L58:
        if (this.f3825c.getMeasuredWidth() <= 0) goto L60;
    L59:
        r242 = true;
        goto L61
    L55:
        if (this.f3824b.getMeasuredWidth() > 0) goto L59;
    L51:
        r155 = this.f3824b;
        goto L52
    L48:
        r26 = this.f3825c;
        goto L49
    L40:
        r232 = r1;
        r17 = 0;
        goto L41
    L14:
        r13 = m2112p(this.f3826d, r6, r123, r11);
    L15:
        r14 = r10;
        goto L18
    L16:
        r13 = r6;
        goto L15
    L9:
        r123 = 0;
        goto L11
    L5:
        r1 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int r15, int r16) {
        int r7 = 0;
        if (getLayoutDirection() != 1) goto L5;
        Object[] r6 = true;
        char r8 = 0;
    L7:
        if (m2116t(this.f3826d) == false) goto L9;
        m2115s(this.f3826d, r15, 0, r16, this.f3837o);
        int r2 = m2099k(this.f3826d) + this.f3826d.getMeasuredWidth();
        int r9 = Math.max(0, m2100l(this.f3826d) + this.f3826d.getMeasuredHeight());
        int r10 = View.combineMeasuredStates(0, this.f3826d.getMeasuredState());
    L11:
        if (m2116t(this.f3830h) == false) goto L13;
        m2115s(this.f3830h, r15, 0, r16, this.f3837o);
        r2 = m2099k(this.f3830h) + this.f3830h.getMeasuredWidth();
        r9 = Math.max(r9, m2100l(this.f3830h) + this.f3830h.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.f3830h.getMeasuredState());
    L13:
        int r1 = getCurrentContentInsetStart();
        int r3 = Math.max(r1, r2);
        int r12 = Math.max(0, r1 - r2);
        Object[] r22 = r6;
        int[] r62 = this.f3808F;
        r62[r22 == true ? 1 : 0] = r12;
        if (m2116t(this.f3823a) == false) goto L16;
        m2115s(this.f3823a, r15, r3, r16, this.f3837o);
        int r23 = m2099k(this.f3823a) + this.f3823a.getMeasuredWidth();
        r9 = Math.max(r9, m2100l(this.f3823a) + this.f3823a.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.f3823a.getMeasuredState());
    L17:
        int r13 = getCurrentContentInsetEnd();
        int r32 = r3 + Math.max(r13, r23);
        r62[r8] = Math.max(0, r13 - r23);
        if (m2116t(this.f3831i) == false) goto L21;
        r32 = r32 + m2114r(this.f3831i, r15, r32, r16, 0, r62);
        r9 = Math.max(r9, m2100l(this.f3831i) + this.f3831i.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.f3831i.getMeasuredState());
    L21:
        if (m2116t(this.f3827e) == false) goto L23;
        r32 = r32 + m2114r(this.f3827e, r15, r32, r16, 0, r62);
        r9 = Math.max(r9, m2100l(this.f3827e) + this.f3827e.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.f3827e.getMeasuredState());
    L23:
        int r82 = getChildCount();
        int r11 = 0;
    L24:
        if (r11 >= r82) goto L33;
        View r14 = getChildAt(r11);
        if (((C2405qB) r14.getLayoutParams()).f8439b != 0) goto L31;
        if (m2116t(r14) == false) goto L31;
        r32 = r32 + m2114r(r14, r15, r32, r16, 0, r62);
        int r24 = Math.max(r9, m2100l(r14) + r14.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, r14.getMeasuredState());
        r9 = r24;
    L32:
        r11 = r11 + 1;
    L31:
        r32 = r32;
        goto L32
    L33:
        int r122 = r32;
        int r5 = this.f3840r + this.f3841s;
        int r83 = this.f3838p + this.f3839q;
        if (m2116t(this.f3824b) == false) goto L36;
        m2114r(this.f3824b, r15, r122 + r83, r16, r5, r62);
        int r25 = m2099k(this.f3824b) + this.f3824b.getMeasuredWidth();
        int r112 = m2100l(this.f3824b) + this.f3824b.getMeasuredHeight();
        int r132 = View.combineMeasuredStates(r10, this.f3824b.getMeasuredState());
        int r102 = r25;
    L38:
        if (m2116t(this.f3825c) == false) goto L40;
        r102 = Math.max(r102, m2114r(this.f3825c, r15, r122 + r83, r16, r5 + r112, r62));
        r112 = r112 + (m2100l(this.f3825c) + this.f3825c.getMeasuredHeight());
        r132 = View.combineMeasuredStates(r132, this.f3825c.getMeasuredState());
    L40:
        int r17 = Math.max(r9, r112);
        int r4 = (getPaddingRight() + getPaddingLeft()) + (r122 + r102);
        int r33 = (getPaddingBottom() + getPaddingTop()) + r17;
        int r18 = View.resolveSizeAndState(Math.max(r4, getSuggestedMinimumWidth()), r15, (-16777216) & r132);
        int r26 = View.resolveSizeAndState(Math.max(r33, getSuggestedMinimumHeight()), r16, r132 << 16);
        if (this.f3818P == false) goto L51;
        int r34 = getChildCount();
        int r42 = 0;
    L44:
        if (r42 >= r34) goto L53;
        View r52 = getChildAt(r42);
        if (m2116t(r52) == false) goto L52;
        if (r52.getMeasuredWidth() <= 0) goto L52;
        if (r52.getMeasuredHeight() > 0) goto L51;
    L52:
        r42 = r42 + 1;
    L53:
        setMeasuredDimension(r18, r7);
        return;
    L51:
        r7 = r26;
        goto L53
    L36:
        r112 = 0;
        r132 = r10;
        r102 = 0;
        goto L38
    L16:
        r23 = 0;
        goto L17
    L9:
        r2 = 0;
        r9 = 0;
        r10 = 0;
        goto L11
    L5:
        r8 = 1;
        r6 = false;
        goto L7
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r4) {
        if ((r4 instanceof C2491sB) == true) goto L6;
        super.onRestoreInstanceState(r4);
        return;
    L6:
        C2491sB r42 = (C2491sB) r4;
        super.onRestoreInstanceState(r42.f8397a);
        ActionMenuView r0 = this.f3823a;
        if (r0 == null) goto L9;
        MenuC2204lr r02 = r0.f3777p;
    L10:
        int r1 = r42.f8753c;
        if (r1 == 0) goto L19;
        if (this.f3815M == null) goto L19;
        if (r02 == null) goto L19;
        MenuItem r03 = r02.findItem(r1);
        if (r03 == null) goto L19;
        r03.expandActionView();
    L19:
        if (r42.f8754d == false) goto L22;
        RunnableC0431K0 r43 = this.f3822T;
        removeCallbacks(r43);
        post(r43);
        return;
    L22:
        return;
    L9:
        r02 = null;
        goto L10
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
        super.onRtlPropertiesChanged(r3);
        m2104d();
        C0727Qw r0 = this.f3842t;
        boolean r1 = true;
        if (r3 == 1) goto L7;
        r1 = false;
    L7:
        if (r1 != r0.f2322g) goto L9;
        return;
    L9:
        r0.f2322g = r1;
        if (r0.f2323h == true) goto L12;
        r0.f2316a = r0.f2320e;
        r0.f2317b = r0.f2321f;
        return;
    L12:
        if (r1 == false) goto L23;
        int r12 = r0.f2319d;
        if (r12 != Integer.MIN_VALUE) goto L17;
        r12 = r0.f2320e;
    L17:
        r0.f2316a = r12;
        int r13 = r0.f2318c;
        if (r13 != Integer.MIN_VALUE) goto L21;
        r13 = r0.f2321f;
    L21:
        r0.f2317b = r13;
        return;
    L23:
        int r14 = r0.f2318c;
        if (r14 != Integer.MIN_VALUE) goto L27;
        r14 = r0.f2320e;
    L27:
        r0.f2316a = r14;
        int r15 = r0.f2319d;
        if (r15 != Integer.MIN_VALUE) goto L31;
        r15 = r0.f2321f;
    L31:
        r0.f2317b = r15;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2491sB r0 = new C2491sB(super.onSaveInstanceState());
        C2354pB r1 = this.f3815M;
        if (r1 == null) goto L7;
        C2427qr r12 = r1.f8238b;
        if (r12 == null) goto L7;
        r0.f8753c = r12.f8492a;
    L7:
        r0.f8754d = m2111o();
        return r0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r5) {
        int r0 = r5.getActionMasked();
        if (r0 != 0) goto L6;
        this.f3804B = false;
    L6:
        if (this.f3804B == true) goto L11;
        boolean r52 = super.onTouchEvent(r5);
        if (r0 != 0) goto L11;
        if (r52 == true) goto L11;
        this.f3804B = true;
    L11:
        if (r0 != 1) goto L13;
    L16:
        this.f3804B = false;
        return true;
    L13:
        if (r0 == 3) goto L16;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m2112p(View r5, int r6, int r7, int[] r8) {
        C2405qB r0 = (C2405qB) r5.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) r0).leftMargin - r8[0];
        int r3 = Math.max(0, r1) + r6;
        r8[0] = Math.max(0, -r1);
        int r62 = m2108j(r5, r7);
        int r72 = r5.getMeasuredWidth();
        r5.layout(r3, r62, r3 + r72, r5.getMeasuredHeight() + r62);
        return (r72 + ((ViewGroup.MarginLayoutParams) r0).rightMargin) + r3;
    }

    /* JADX INFO: renamed from: q */
    public final int m2113q(View r6, int r7, int r8, int[] r9) {
        C2405qB r0 = (C2405qB) r6.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) r0).rightMargin - r9[1];
        int r72 = r7 - Math.max(0, r1);
        r9[1] = Math.max(0, -r1);
        int r82 = m2108j(r6, r8);
        int r92 = r6.getMeasuredWidth();
        r6.layout(r72 - r92, r82, r72, r6.getMeasuredHeight() + r82);
        return r72 - (r92 + ((ViewGroup.MarginLayoutParams) r0).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m2114r(View r8, int r9, int r10, int r11, int r12, int[] r13) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) r8.getLayoutParams();
        int r1 = r0.leftMargin - r13[0];
        int r3 = r0.rightMargin - r13[1];
        int r5 = Math.max(0, r1);
        int r6 = Math.max(0, r3) + r5;
        r13[0] = Math.max(0, -r1);
        r13[1] = Math.max(0, -r3);
        int r132 = getPaddingLeft();
        int r92 = ViewGroup.getChildMeasureSpec(r9, ((getPaddingRight() + r132) + r6) + r10, r0.width);
        int r102 = getPaddingTop();
        r8.measure(r92, ViewGroup.getChildMeasureSpec(r11, (((getPaddingBottom() + r102) + r0.topMargin) + r0.bottomMargin) + r12, r0.height));
        return r8.getMeasuredWidth() + r6;
    }

    /* JADX INFO: renamed from: s */
    public final void m2115s(View r4, int r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) r4.getLayoutParams();
        int r1 = getPaddingLeft();
        int r52 = ViewGroup.getChildMeasureSpec(r5, (((getPaddingRight() + r1) + r0.leftMargin) + r0.rightMargin) + r6, r0.width);
        int r62 = getPaddingTop();
        int r63 = ViewGroup.getChildMeasureSpec(r7, ((getPaddingBottom() + r62) + r0.topMargin) + r0.bottomMargin, r0.height);
        int r72 = View.MeasureSpec.getMode(r63);
        if (r72 == 1073741824) goto L8;
        if (r8 < 0) goto L8;
        if (r72 == 0) goto L7;
        r8 = Math.min(View.MeasureSpec.getSize(r63), r8);
    L7:
        r63 = View.MeasureSpec.makeMeasureSpec(r8, 1073741824);
    L8:
        r4.measure(r52, r63);
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
        if (this.f3821S == r2) goto L6;
        this.f3821S = r2;
        m2118v();
        return;
    }

    public void setCollapseContentDescription(int r2) {
        if (r2 == 0) goto L4;
        CharSequence r22 = getContext().getText(r2);
    L5:
        setCollapseContentDescription(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setCollapseIcon(int r2) {
        setCollapseIcon(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setCollapsible(boolean r1) {
        this.f3818P = r1;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int r2) {
        if (r2 >= 0) goto L5;
        r2 = Integer.MIN_VALUE;
    L5:
        if (r2 == this.f3844v) goto L10;
        this.f3844v = r2;
        if (getNavigationIcon() == null) goto L11;
        requestLayout();
        return;
    L11:
        return;
    }

    public void setContentInsetStartWithNavigation(int r2) {
        if (r2 >= 0) goto L5;
        r2 = Integer.MIN_VALUE;
    L5:
        if (r2 == this.f3843u) goto L10;
        this.f3843u = r2;
        if (getNavigationIcon() == null) goto L11;
        requestLayout();
        return;
    L11:
        return;
    }

    public void setLogo(int r2) {
        setLogo(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setLogoDescription(int r2) {
        setLogoDescription(getContext().getText(r2));
    }

    public void setNavigationContentDescription(int r2) {
        if (r2 == 0) goto L4;
        CharSequence r22 = getContext().getText(r2);
    L5:
        setNavigationContentDescription(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setNavigationIcon(int r2) {
        setNavigationIcon(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setNavigationOnClickListener(View.OnClickListener r2) {
        m2107g();
        this.f3826d.setOnClickListener(r2);
    }

    public void setOnMenuItemClickListener(InterfaceC2448rB r1) {
        this.f3811I = r1;
    }

    public void setOverflowIcon(Drawable r2) {
        m2105e();
        this.f3823a.setOverflowIcon(r2);
    }

    public void setPopupTheme(int r3) {
        if (this.f3833k == r3) goto L10;
        this.f3833k = r3;
        if (r3 != 0) goto L8;
        this.f3832j = getContext();
        return;
    L8:
        this.f3832j = new ContextThemeWrapper(getContext(), r3);
        return;
    }

    public void setSubtitle(int r2) {
        setSubtitle(getContext().getText(r2));
    }

    public void setSubtitleTextColor(int r1) {
        setSubtitleTextColor(ColorStateList.valueOf(r1));
    }

    public void setTitle(int r2) {
        setTitle(getContext().getText(r2));
    }

    public void setTitleMarginBottom(int r1) {
        this.f3841s = r1;
        requestLayout();
    }

    public void setTitleMarginEnd(int r1) {
        this.f3839q = r1;
        requestLayout();
    }

    public void setTitleMarginStart(int r1) {
        this.f3838p = r1;
        requestLayout();
    }

    public void setTitleMarginTop(int r1) {
        this.f3840r = r1;
        requestLayout();
    }

    public void setTitleTextColor(int r1) {
        setTitleTextColor(ColorStateList.valueOf(r1));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2116t(View r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (r2.getParent() == this) goto L6;
        return false;
    L6:
        if (r2.getVisibility() == 8) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2117u() {
        ActionMenuView r0 = this.f3823a;
        if (r0 == null) goto L10;
        C0130D0 r02 = r0.f3781t;
        if (r02 != null) goto L7;
        return false;
    L7:
        if (r02.m223l() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m2118v() {
        if (Build.VERSION.SDK_INT < 33) goto L28;
        OnBackInvokedDispatcher r0 = AbstractC2311oB.m4720a(this);
        C2354pB r1 = this.f3815M;
        if (r1 != null) goto L7;
    L14:
        boolean r12 = false;
    L15:
        if (r12 == true) goto L17;
    L23:
        if (r12 == true) goto L29;
        OnBackInvokedDispatcher r02 = this.f3820R;
        if (r02 == null) goto L30;
        AbstractC2311oB.m4723d(r02, this.f3819Q);
        this.f3820R = null;
        return;
    L30:
        return;
    L29:
        return;
    L17:
        if (this.f3820R != null) goto L23;
        if (this.f3819Q != null) goto L21;
        this.f3819Q = AbstractC2311oB.m4721b(new RunnableC2225mB(this, 0));
    L21:
        AbstractC2311oB.m4722c(r0, this.f3819Q);
        this.f3820R = r0;
        return;
    L7:
        if (r1.f8238b == null) goto L14;
        if (r0 == null) goto L14;
        if (isAttachedToWindow() == false) goto L14;
        if (this.f3821S == false) goto L14;
        r12 = true;
        goto L15
    }

    public Toolbar(Context r9, AttributeSet r10, int r11) {
        super(r9, r10, R.attr.toolbarStyle);
        this.f3845w = 8388627;
        this.f3806D = new ArrayList();
        this.f3807E = new ArrayList();
        this.f3808F = new int[2];
        this.f3809G = new C2656w4(new RunnableC2225mB(this, 1));
        this.f3810H = new ArrayList();
        this.f3812J = new C2268nB(this);
        this.f3822T = new RunnableC0431K0(16, this);
        Context r0 = getContext();
        int[] r2 = AbstractC0982Wu.f3089x;
        C2656w4 r7 = C2656w4.m5186A(r0, r10, r2, R.attr.toolbarStyle);
        AbstractC2185lE.m4398k(this, r9, r2, r10, (TypedArray) r7.f9196b, R.attr.toolbarStyle);
        TypedArray r92 = (TypedArray) r7.f9196b;
        this.f3834l = r92.getResourceId(28, 0);
        this.f3835m = r92.getResourceId(19, 0);
        this.f3845w = r92.getInteger(0, 8388627);
        this.f3836n = r92.getInteger(2, 48);
        int r102 = r92.getDimensionPixelOffset(22, 0);
        if (r92.hasValue(27) == false) goto L5;
        r102 = r92.getDimensionPixelOffset(27, r102);
    L5:
        this.f3841s = r102;
        this.f3840r = r102;
        this.f3839q = r102;
        this.f3838p = r102;
        int r103 = r92.getDimensionPixelOffset(25, -1);
        if (r103 < 0) goto L8;
        this.f3838p = r103;
    L8:
        int r104 = r92.getDimensionPixelOffset(24, -1);
        if (r104 < 0) goto L11;
        this.f3839q = r104;
    L11:
        int r105 = r92.getDimensionPixelOffset(26, -1);
        if (r105 < 0) goto L14;
        this.f3840r = r105;
    L14:
        int r106 = r92.getDimensionPixelOffset(23, -1);
        if (r106 < 0) goto L17;
        this.f3841s = r106;
    L17:
        this.f3837o = r92.getDimensionPixelSize(13, -1);
        int r107 = r92.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int r22 = r92.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int r3 = r92.getDimensionPixelSize(7, 0);
        int r4 = r92.getDimensionPixelSize(8, 0);
        m2104d();
        C0727Qw r5 = this.f3842t;
        r5.f2323h = false;
        if (r3 == Integer.MIN_VALUE) goto L20;
        r5.f2320e = r3;
        r5.f2316a = r3;
    L20:
        if (r4 == Integer.MIN_VALUE) goto L22;
        r5.f2321f = r4;
        r5.f2317b = r4;
    L22:
        if (r107 != Integer.MIN_VALUE) goto L24;
        if (r22 != Integer.MIN_VALUE) goto L24;
    L25:
        this.f3843u = r92.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3844v = r92.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3828f = r7.m5210q(4);
        this.f3829g = r92.getText(3);
        CharSequence r108 = r92.getText(21);
        if (TextUtils.isEmpty(r108) == true) goto L28;
        setTitle(r108);
    L28:
        CharSequence r109 = r92.getText(18);
        if (TextUtils.isEmpty(r109) == true) goto L31;
        setSubtitle(r109);
    L31:
        this.f3832j = getContext();
        setPopupTheme(r92.getResourceId(17, 0));
        Drawable r1010 = r7.m5210q(16);
        if (r1010 == null) goto L34;
        setNavigationIcon(r1010);
    L34:
        CharSequence r1011 = r92.getText(15);
        if (TextUtils.isEmpty(r1011) == true) goto L37;
        setNavigationContentDescription(r1011);
    L37:
        Drawable r1012 = r7.m5210q(11);
        if (r1012 == null) goto L40;
        setLogo(r1012);
    L40:
        CharSequence r1013 = r92.getText(12);
        if (TextUtils.isEmpty(r1013) == true) goto L44;
        setLogoDescription(r1013);
    L44:
        if (r92.hasValue(29) == false) goto L47;
        setTitleTextColor(r7.m5209p(29));
    L47:
        if (r92.hasValue(20) == false) goto L50;
        setSubtitleTextColor(r7.m5209p(20));
    L50:
        if (r92.hasValue(14) == false) goto L52;
        int r93 = r92.getResourceId(14, 0);
        getMenuInflater().inflate(r93, getMenu());
    L52:
        r7.m5195E();
        return;
    L24:
        r5.m1510a(r107, r22);
        goto L25
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r5) {
        Context r1 = getContext();
        C2405qB r0 = new C2405qB(r1, r5);
        r0.f8438a = 0;
        TypedArray r52 = r1.obtainStyledAttributes(r5, AbstractC0982Wu.f3067b);
        r0.f8438a = r52.getInt(0, 0);
        r52.recycle();
        r0.f8439b = 0;
        return r0;
    }

    public void setCollapseContentDescription(CharSequence r2) {
        if (TextUtils.isEmpty(r2) == true) goto L5;
        m2103c();
    L5:
        C0434K3 r0 = this.f3830h;
        if (r0 == null) goto L9;
        r0.setContentDescription(r2);
        return;
    }

    public void setCollapseIcon(Drawable r2) {
        if (r2 == null) goto L5;
        m2103c();
        this.f3830h.setImageDrawable(r2);
        return;
    L5:
        C0434K3 r22 = this.f3830h;
        if (r22 == null) goto L9;
        r22.setImageDrawable(this.f3828f);
        return;
    }

    public void setLogo(Drawable r5) {
        if (r5 != null) goto L4;
        C0520M3 r0 = this.f3827e;
        if (r0 != null) goto L12;
    L14:
        C0520M3 r02 = this.f3827e;
        if (r02 == null) goto L18;
        r02.setImageDrawable(r5);
        return;
    L18:
        return;
    L12:
        if (m2110n(r0) == false) goto L14;
        removeView(this.f3827e);
        this.f3807E.remove(this.f3827e);
        goto L14
    L4:
        if (this.f3827e != null) goto L7;
        this.f3827e = new C0520M3(getContext(), null, 0);
    L7:
        if (m2110n(this.f3827e) == true) goto L14;
        m2102b(this.f3827e, true);
        goto L14
    }

    public void setLogoDescription(CharSequence r5) {
        if (TextUtils.isEmpty(r5) == false) goto L5;
    L7:
        C0520M3 r0 = this.f3827e;
        if (r0 == null) goto L11;
        r0.setContentDescription(r5);
        return;
    L11:
        return;
    L5:
        if (this.f3827e != null) goto L7;
        this.f3827e = new C0520M3(getContext(), null, 0);
        goto L7
    }

    public void setNavigationContentDescription(CharSequence r2) {
        if (TextUtils.isEmpty(r2) == true) goto L5;
        m2107g();
    L5:
        C0434K3 r0 = this.f3826d;
        if (r0 == null) goto L9;
        r0.setContentDescription(r2);
        AbstractC2706xB.m5280a(this.f3826d, r2);
        return;
    }

    public void setNavigationIcon(Drawable r3) {
        if (r3 == null) goto L6;
        m2107g();
        if (m2110n(this.f3826d) == true) goto L11;
        m2102b(this.f3826d, true);
    L11:
        C0434K3 r0 = this.f3826d;
        if (r0 == null) goto L15;
        r0.setImageDrawable(r3);
        return;
    L15:
        return;
    L6:
        C0434K3 r02 = this.f3826d;
        if (r02 == null) goto L11;
        if (m2110n(r02) == false) goto L11;
        removeView(this.f3826d);
        this.f3807E.remove(this.f3826d);
        goto L11
    }

    public void setSubtitle(CharSequence r4) {
        if (TextUtils.isEmpty(r4) == false) goto L5;
        C2304o4 r0 = this.f3825c;
        if (r0 != null) goto L18;
    L20:
        C2304o4 r02 = this.f3825c;
        if (r02 == null) goto L23;
        r02.setText(r4);
    L23:
        this.f3847y = r4;
        return;
    L18:
        if (m2110n(r0) == false) goto L20;
        removeView(this.f3825c);
        this.f3807E.remove(this.f3825c);
        goto L20
    L5:
        if (this.f3825c != null) goto L13;
        Context r03 = getContext();
        C2304o4 r1 = new C2304o4(r03, null);
        this.f3825c = r1;
        r1.setSingleLine();
        this.f3825c.setEllipsize(TextUtils.TruncateAt.END);
        int r12 = this.f3835m;
        if (r12 == 0) goto L9;
        this.f3825c.setTextAppearance(r03, r12);
    L9:
        ColorStateList r04 = this.f3803A;
        if (r04 == null) goto L13;
        this.f3825c.setTextColor(r04);
    L13:
        if (m2110n(this.f3825c) == true) goto L20;
        m2102b(this.f3825c, true);
        goto L20
    }

    public void setSubtitleTextColor(ColorStateList r2) {
        this.f3803A = r2;
        C2304o4 r0 = this.f3825c;
        if (r0 == null) goto L6;
        r0.setTextColor(r2);
        return;
    }

    public void setTitle(CharSequence r4) {
        if (TextUtils.isEmpty(r4) == false) goto L5;
        C2304o4 r0 = this.f3824b;
        if (r0 != null) goto L18;
    L20:
        C2304o4 r02 = this.f3824b;
        if (r02 == null) goto L23;
        r02.setText(r4);
    L23:
        this.f3846x = r4;
        return;
    L18:
        if (m2110n(r0) == false) goto L20;
        removeView(this.f3824b);
        this.f3807E.remove(this.f3824b);
        goto L20
    L5:
        if (this.f3824b != null) goto L13;
        Context r03 = getContext();
        C2304o4 r1 = new C2304o4(r03, null);
        this.f3824b = r1;
        r1.setSingleLine();
        this.f3824b.setEllipsize(TextUtils.TruncateAt.END);
        int r12 = this.f3834l;
        if (r12 == 0) goto L9;
        this.f3824b.setTextAppearance(r03, r12);
    L9:
        ColorStateList r04 = this.f3848z;
        if (r04 == null) goto L13;
        this.f3824b.setTextColor(r04);
    L13:
        if (m2110n(this.f3824b) == true) goto L20;
        m2102b(this.f3824b, true);
        goto L20
    }

    public void setTitleTextColor(ColorStateList r2) {
        this.f3848z = r2;
        C2304o4 r0 = this.f3824b;
        if (r0 == null) goto L6;
        r0.setTextColor(r2);
        return;
    }
}
