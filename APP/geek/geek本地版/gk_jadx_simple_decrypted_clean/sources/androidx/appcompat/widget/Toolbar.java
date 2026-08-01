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
import defpackage.a4;
import defpackage.c70;
import defpackage.cb0;
import defpackage.d4;
import defpackage.d70;
import defpackage.e70;
import defpackage.et;
import defpackage.f70;
import defpackage.ff;
import defpackage.g5;
import defpackage.g70;
import defpackage.h70;
import defpackage.hf;
import defpackage.i10;
import defpackage.i70;
import defpackage.j1;
import defpackage.ja0;
import defpackage.k50;
import defpackage.k70;
import defpackage.ku;
import defpackage.l70;
import defpackage.ou;
import defpackage.pt;
import defpackage.r5;
import defpackage.s90;
import defpackage.t90;
import defpackage.v90;
import defpackage.x0;
import defpackage.xy;
import defpackage.y3;
import defpackage.y6;
import defpackage.z30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final d4 G;
    public ArrayList H;
    public final d70 I;
    public k70 J;
    public j1 K;
    public f70 L;
    public boolean M;
    public OnBackInvokedCallback N;
    public OnBackInvokedDispatcher O;
    public boolean P;
    public final y6 Q;
    public ActionMenuView a;
    public g5 b;
    public g5 c;
    public y3 d;
    public a4 e;
    public final Drawable f;
    public final CharSequence g;
    public y3 h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public i10 t;
    public int u;
    public int v;
    public final int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

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
        return new k50(getContext());
    }

    public static g70 h() {
        g70 r0 = new g70(-2, -2);
        r0.b = 0;
        r0.a = 8388627;
        return r0;
    }

    public static g70 i(ViewGroup.LayoutParams r2) {
        boolean r0 = r2 instanceof g70;
        if (r0 == false) goto L6;
        g70 r22 = (g70) r2;
        g70 r02 = new g70(r22);
        r02.b = 0;
        r02.b = r22.b;
        return r02;
    L6:
        if (r0 == false) goto L10;
        g70 r03 = new g70((g70) r2);
        r03.b = 0;
        return r03;
    L10:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L13;
        ViewGroup.MarginLayoutParams r23 = (ViewGroup.MarginLayoutParams) r2;
        g70 r04 = new g70(r23);
        r04.b = 0;
        ((ViewGroup.MarginLayoutParams) r04).leftMargin = r23.leftMargin;
        ((ViewGroup.MarginLayoutParams) r04).topMargin = r23.topMargin;
        ((ViewGroup.MarginLayoutParams) r04).rightMargin = r23.rightMargin;
        ((ViewGroup.MarginLayoutParams) r04).bottomMargin = r23.bottomMargin;
        return r04;
    L13:
        g70 r05 = new g70(r2);
        r05.b = 0;
        return r05;
    }

    public static int k(View r1) {
        ViewGroup.MarginLayoutParams r12 = (ViewGroup.MarginLayoutParams) r1.getLayoutParams();
        int r0 = et.c(r12);
        return et.b(r12) + r0;
    }

    public static int l(View r1) {
        ViewGroup.MarginLayoutParams r12 = (ViewGroup.MarginLayoutParams) r1.getLayoutParams();
        return r12.topMargin + r12.bottomMargin;
    }

    public final void a(ArrayList r9, int r10) {
        WeakHashMap r0 = ja0.a;
        int r1 = 0;
        if (t90.d(this) != 1) goto L5;
        boolean r02 = true;
    L6:
        int r3 = getChildCount();
        int r102 = Gravity.getAbsoluteGravity(r10, t90.d(this));
        r9.clear();
        if (r02 == false) goto L24;
        int r32 = r3 - 1;
    L9:
        if (r32 < 0) goto L39;
        View r03 = getChildAt(r32);
        g70 r12 = (g70) r03.getLayoutParams();
        if (r12.b != 0) goto L23;
        if (t(r03) == false) goto L23;
        int r13 = r12.a;
        WeakHashMap r6 = ja0.a;
        int r62 = t90.d(this);
        int r14 = Gravity.getAbsoluteGravity(r13, r62) & 7;
        if (r14 == 1) goto L21;
        if (r14 == 3) goto L21;
        if (r14 == 5) goto L21;
        if (r62 != 1) goto L20;
        r14 = 5;
        goto L21
    L20:
        r14 = 3;
    L21:
        if (r14 != r102) goto L23;
        r9.add(r03);
    L23:
        r32 = r32 - 1;
        goto L9
    L39:
        return;
    L24:
        if (r1 >= r3) goto L50;
        View r04 = getChildAt(r1);
        g70 r63 = (g70) r04.getLayoutParams();
        if (r63.b != 0) goto L38;
        if (t(r04) == false) goto L38;
        int r64 = r63.a;
        WeakHashMap r7 = ja0.a;
        int r72 = t90.d(this);
        int r65 = Gravity.getAbsoluteGravity(r64, r72) & 7;
        if (r65 == 1) goto L36;
        if (r65 == 3) goto L36;
        if (r65 == 5) goto L36;
        if (r72 != 1) goto L35;
        r65 = 5;
        goto L36
    L35:
        r65 = 3;
    L36:
        if (r65 != r102) goto L38;
        r9.add(r04);
    L38:
        r1 = r1 + 1;
        goto L24
    L50:
        return;
    L5:
        r02 = false;
        goto L6
    }

    public final void b(View r3, boolean r4) {
        ViewGroup.LayoutParams r0 = r3.getLayoutParams();
        if (r0 != null) goto L6;
        g70 r02 = h();
    L9:
        r02.b = 1;
        if (r4 == true) goto L12;
    L15:
        addView(r3, r02);
        return;
    L12:
        if (this.i == null) goto L15;
        r3.setLayoutParams(r02);
        this.E.add(r3);
        return;
    L6:
        if (checkLayoutParams(r0) == true) goto L8;
        r02 = i(r0);
        goto L9
    L8:
        r02 = (g70) r0;
        goto L9
    }

    public final void c() {
        if (this.h != null) goto L6;
        y3 r0 = new y3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
        this.h = r0;
        r0.setImageDrawable(this.f);
        this.h.setContentDescription(this.g);
        g70 r02 = h();
        r02.a = (this.n & 112) | 8388611;
        r02.b = 2;
        this.h.setLayoutParams(r02);
        this.h.setOnClickListener(new x0(3, this));
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if (super.checkLayoutParams(r2) == true) goto L5;
        return false;
    L5:
        if ((r2 instanceof g70) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void d() {
        if (this.t != null) goto L6;
        i10 r0 = new i10();
        r0.a = 0;
        r0.b = 0;
        r0.c = Integer.MIN_VALUE;
        r0.d = Integer.MIN_VALUE;
        r0.e = 0;
        r0.f = 0;
        r0.g = false;
        r0.h = false;
        this.t = r0;
        return;
    }

    public final void e() {
        f();
        ActionMenuView r0 = this.a;
        if (r0.p != null) goto L9;
        ku r02 = (ku) r0.getMenu();
        if (this.L != null) goto L7;
        this.L = new f70(this);
    L7:
        this.a.setExpandedActionViewsExclusive(true);
        r02.b(this.L, this.j);
        u();
        return;
    }

    public final void f() {
        if (this.a != null) goto L6;
        ActionMenuView r0 = new ActionMenuView(getContext(), null);
        this.a = r0;
        r0.setPopupTheme(this.k);
        this.a.setOnMenuItemClickListener(this.I);
        ActionMenuView r02 = this.a;
        d70 r1 = new d70(this);
        r02.getClass();
        r02.u = r1;
        g70 r03 = h();
        r03.a = (this.n & 112) | 8388613;
        this.a.setLayoutParams(r03);
        b(this.a, false);
        return;
    }

    public final void g() {
        if (this.d != null) goto L6;
        this.d = new y3(getContext(), null, R.attr.toolbarNavigationButtonStyle);
        g70 r0 = h();
        r0.a = (this.n & 112) | 8388611;
        this.d.setLayoutParams(r0);
        return;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return i(r1);
    }

    public CharSequence getCollapseContentDescription() {
        y3 r0 = this.h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getContentDescription();
    }

    public Drawable getCollapseIcon() {
        y3 r0 = this.h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getDrawable();
    }

    public int getContentInsetEnd() {
        i10 r0 = this.t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.g == false) goto L9;
        return r0.a;
    L9:
        return r0.b;
    }

    public int getContentInsetEndWithActions() {
        int r0 = this.v;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        i10 r0 = this.t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.a;
    }

    public int getContentInsetRight() {
        i10 r0 = this.t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.b;
    }

    public int getContentInsetStart() {
        i10 r0 = this.t;
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.g == false) goto L9;
        return r0.b;
    L9:
        return r0.a;
    }

    public int getContentInsetStartWithNavigation() {
        int r0 = this.u;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ActionMenuView r0 = this.a;
        if (r0 == null) goto L11;
        ku r02 = r0.p;
        if (r02 == null) goto L11;
        if (r02.hasVisibleItems() == false) goto L11;
        return Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    L11:
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap r0 = ja0.a;
        if (t90.d(this) != 1) goto L7;
        return getCurrentContentInsetEnd();
    L7:
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap r0 = ja0.a;
        if (t90.d(this) != 1) goto L7;
        return getCurrentContentInsetStart();
    L7:
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() == null) goto L7;
        return Math.max(getContentInsetStart(), Math.max(this.u, 0));
    L7:
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        a4 r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getDrawable();
    }

    public CharSequence getLogoDescription() {
        a4 r0 = this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getContentDescription();
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        y3 r0 = this.d;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getContentDescription();
    }

    public Drawable getNavigationIcon() {
        y3 r0 = this.d;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.getDrawable();
    }

    public j1 getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public hf getWrapper() {
        if (this.J != null) goto L79;
        k70 r0 = new k70();
        r0.n = 0;
        r0.a = this;
        r0.h = getTitle();
        r0.i = getSubtitle();
        if (r0.h == null) goto L7;
        boolean r2 = true;
    L8:
        r0.g = r2;
        r0.f = getNavigationIcon();
        String r6 = null;
        r5 r22 = r5.y(getContext(), null, xy.a, R.attr.actionBarStyle);
        TypedArray r4 = (TypedArray) r22.b;
        r0.o = r22.m(15);
        CharSequence r5 = r4.getText(27);
        if (TextUtils.isEmpty(r5) == true) goto L15;
        r0.g = true;
        r0.h = r5;
        if ((r0.b & 8) == 0) goto L15;
        setTitle(r5);
        if (r0.g == false) goto L15;
        ja0.m(getRootView(), r5);
    L15:
        CharSequence r3 = r4.getText(25);
        if (TextUtils.isEmpty(r3) == true) goto L20;
        r0.i = r3;
        if ((r0.b & 8) == 0) goto L20;
        setSubtitle(r3);
    L20:
        Drawable r32 = r22.m(20);
        if (r32 == null) goto L23;
        r0.e = r32;
        r0.c();
    L23:
        Drawable r33 = r22.m(17);
        if (r33 == null) goto L27;
        r0.d = r33;
        r0.c();
    L27:
        if (r0.f != null) goto L34;
        Drawable r34 = r0.o;
        if (r34 == null) goto L34;
        r0.f = r34;
        if ((r0.b & 4) == 0) goto L33;
        setNavigationIcon(r34);
        goto L34
    L33:
        setNavigationIcon(null);
    L34:
        r0.a(r4.getInt(10, 0));
        int r35 = r4.getResourceId(9, 0);
        if (r35 == 0) goto L47;
        View r36 = LayoutInflater.from(getContext()).inflate(r35, this, false);
        View r52 = r0.c;
        if (r52 != null) goto L39;
    L41:
        r0.c = r36;
        if (r36 != null) goto L44;
    L46:
        r0.a(r0.b | 16);
        goto L47
    L44:
        if ((r0.b & 16) == 0) goto L46;
        addView(r36);
        goto L46
    L39:
        if ((r0.b & 16) == 0) goto L41;
        removeView(r52);
    L47:
        int r37 = r4.getLayoutDimension(13, 0);
        if (r37 <= 0) goto L50;
        ViewGroup.LayoutParams r53 = getLayoutParams();
        r53.height = r37;
        setLayoutParams(r53);
    L50:
        int r38 = r4.getDimensionPixelOffset(7, -1);
        int r54 = r4.getDimensionPixelOffset(3, -1);
        if (r38 >= 0) goto L53;
        if (r54 >= 0) goto L53;
    L54:
        int r39 = r4.getResourceId(28, 0);
        if (r39 == 0) goto L59;
        Context r55 = getContext();
        this.l = r39;
        g5 r7 = this.b;
        if (r7 == null) goto L59;
        r7.setTextAppearance(r55, r39);
    L59:
        int r310 = r4.getResourceId(26, 0);
        if (r310 == 0) goto L64;
        Context r56 = getContext();
        this.m = r310;
        g5 r72 = this.c;
        if (r72 == null) goto L64;
        r72.setTextAppearance(r56, r310);
    L64:
        int r1 = r4.getResourceId(22, 0);
        if (r1 == 0) goto L67;
        setPopupTheme(r1);
    L67:
        r22.z();
        if (R.string.abc_action_bar_up_description == r0.n) goto L77;
        r0.n = R.string.abc_action_bar_up_description;
        if (TextUtils.isEmpty(getNavigationContentDescription()) == false) goto L77;
        int r12 = r0.n;
        if (r12 == 0) goto L76;
        r6 = getContext().getString(r12);
    L76:
        r0.j = r6;
        r0.b();
    L77:
        r0.j = getNavigationContentDescription();
        setNavigationOnClickListener(new pt(r0));
        this.J = r0;
    L53:
        int r311 = Math.max(r38, 0);
        int r57 = Math.max(r54, 0);
        d();
        this.t.a(r311, r57);
        goto L54
    L7:
        r2 = false;
    L79:
        return this.J;
    }

    public final int j(View r7, int r8) {
        g70 r0 = (g70) r7.getLayoutParams();
        int r72 = r7.getMeasuredHeight();
        if (r8 <= 0) goto L5;
        int r82 = (r72 - r8) / 2;
    L6:
        int r2 = r0.a & 112;
        if (r2 == 16) goto L11;
        if (r2 == 48) goto L11;
        if (r2 == 80) goto L11;
        r2 = this.w & 112;
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

    public void m(int r3) {
        getMenuInflater().inflate(r3, getMenu());
    }

    public final void n() {
        ArrayList r0 = this.H;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        getMenu().removeItem(((MenuItem) r3).getItemId());
        goto L3
    L5:
        getMenu();
        ArrayList<MenuItem> r02 = getCurrentMenuItems();
        getMenuInflater();
        Iterator r12 = ((CopyOnWriteArrayList) this.G.c).iterator();
        if (r12.hasNext() == true) goto L10;
        ArrayList<MenuItem> r13 = getCurrentMenuItems();
        r13.removeAll(r02);
        this.H = r13;
        return;
    L10:
        throw z30.h(r12);
    }

    public final boolean o(View r2) {
        if (r2.getParent() != this) goto L5;
        return true;
    L5:
        if (this.E.contains(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r6) {
        int r0 = r6.getActionMasked();
        if (r0 != 9) goto L6;
        this.C = false;
    L6:
        if (this.C == true) goto L12;
        boolean r62 = super.onHoverEvent(r6);
        if (r0 != 9) goto L12;
        if (r62 == true) goto L12;
        this.C = true;
    L12:
        if (r0 != 10) goto L14;
    L17:
        this.C = false;
        return true;
    L14:
        if (r0 == 3) goto L17;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        WeakHashMap r1 = ja0.a;
        if (t90.d(this) != 1) goto L5;
        boolean r12 = true;
    L6:
        int r4 = getWidth();
        int r5 = getHeight();
        int r6 = getPaddingLeft();
        int r7 = getPaddingRight();
        int r8 = getPaddingTop();
        int r9 = getPaddingBottom();
        int r10 = r4 - r7;
        int[] r11 = this.F;
        r11[1] = 0;
        r11[0] = 0;
        int r122 = s90.d(this);
        if (r122 < 0) goto L9;
        int r123 = Math.min(r122, r24 - r22);
    L11:
        if (t(this.d) == false) goto L16;
        if (r12 == false) goto L14;
        int r14 = q(this.d, r10, r123, r11);
        int r13 = r6;
    L18:
        if (t(this.h) == false) goto L23;
        if (r12 == false) goto L21;
        r14 = q(this.h, r14, r123, r11);
        goto L23
    L21:
        r13 = p(this.h, r13, r123, r11);
    L23:
        if (t(this.a) == false) goto L27;
        if (r12 == false) goto L26;
        r13 = p(this.a, r13, r123, r11);
        goto L27
    L26:
        r14 = q(this.a, r14, r123, r11);
    L27:
        int r15 = getCurrentContentInsetLeft();
        int r16 = getCurrentContentInsetRight();
        r11[0] = Math.max(0, r15 - r13);
        r11[1] = Math.max(0, r16 - (r10 - r14));
        int r3 = Math.max(r13, r15);
        int r102 = Math.min(r14, r10 - r16);
        if (t(this.i) == false) goto L33;
        if (r12 == false) goto L31;
        r102 = q(this.i, r102, r123, r11);
        goto L33
    L31:
        r3 = p(this.i, r3, r123, r11);
    L33:
        if (t(this.e) == false) goto L37;
        if (r12 == false) goto L36;
        r102 = q(this.e, r102, r123, r11);
        goto L37
    L36:
        r3 = p(this.e, r3, r123, r11);
    L37:
        boolean r132 = t(this.b);
        boolean r142 = t(this.c);
        if (r132 == false) goto L40;
        g70 r152 = (g70) this.b.getLayoutParams();
        boolean r232 = r12;
        int r17 = (this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r152).topMargin) + ((ViewGroup.MarginLayoutParams) r152).bottomMargin;
    L41:
        if (r142 == false) goto L44;
        g70 r2 = (g70) this.c.getLayoutParams();
        int r222 = r17;
        r17 = ((this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r2).topMargin) + ((ViewGroup.MarginLayoutParams) r2).bottomMargin) + r222;
    L44:
        if (r132 == true) goto L46;
        if (r142 == true) goto L46;
    L101:
        ArrayList r25 = this.D;
        a(r25, 3);
        int r18 = r25.size();
        int r52 = r3;
        int r32 = 0;
    L102:
        if (r32 >= r18) goto L104;
        r52 = p((View) r25.get(r32), r52, r123, r11);
        r32 = r32 + 1;
        goto L102
    L104:
        a(r25, 5);
        int r19 = r25.size();
        int r33 = 0;
    L105:
        if (r33 >= r19) goto L107;
        r102 = q((View) r25.get(r33), r102, r123, r11);
        r33 = r33 + 1;
        goto L105
    L107:
        a(r25, 1);
        int r82 = r11[0];
        int r110 = r11[1];
        int r34 = r25.size();
        int r133 = r82;
        int r83 = 0;
        int r92 = 0;
    L108:
        if (r83 >= r34) goto L110;
        View r143 = (View) r25.get(r83);
        g70 r153 = (g70) r143.getLayoutParams();
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
        r52 = p((View) r25.get(r154), r52, r123, r11);
        r154 = r154 + 1;
        goto L117
    L119:
        r25.clear();
        return;
    L46:
        if (r132 == false) goto L48;
        g5 r26 = this.b;
    L49:
        if (r142 == false) goto L51;
        g5 r155 = this.c;
    L52:
        g70 r27 = (g70) r26.getLayoutParams();
        g70 r156 = (g70) r155.getLayoutParams();
        int r223 = r17;
        if (r132 == true) goto L55;
    L56:
        if (r142 == true) goto L58;
    L60:
        boolean r242 = false;
    L61:
        int r114 = this.w & 112;
        int r163 = r3;
        if (r114 != 48) goto L64;
        int r84 = (getPaddingTop() + ((ViewGroup.MarginLayoutParams) r27).topMargin) + this.r;
    L74:
        if (r232 == false) goto L88;
        if (r242 == false) goto L77;
        int r115 = this.p;
    L78:
        int r116 = r115 - r11[1];
        r102 = r102 - Math.max(0, r116);
        r11[1] = Math.max(0, -r116);
        if (r132 == false) goto L81;
        g70 r117 = (g70) this.b.getLayoutParams();
        int r28 = r102 - this.b.getMeasuredWidth();
        int r35 = this.b.getMeasuredHeight() + r84;
        this.b.layout(r28, r84, r102, r35);
        int r29 = r28 - this.q;
        r84 = r35 + ((ViewGroup.MarginLayoutParams) r117).bottomMargin;
    L82:
        if (r142 == false) goto L84;
        int r85 = r84 + ((ViewGroup.MarginLayoutParams) ((g70) this.c.getLayoutParams())).topMargin;
        this.c.layout(r102 - this.c.getMeasuredWidth(), r85, r102, this.c.getMeasuredHeight() + r85);
        int r118 = r102 - this.q;
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
        int r119 = this.p;
    L92:
        int r120 = r119 - r11[0];
        r3 = Math.max(0, r120) + r163;
        r11[0] = Math.max(0, -r120);
        if (r132 == false) goto L95;
        g70 r121 = (g70) this.b.getLayoutParams();
        int r210 = this.b.getMeasuredWidth() + r3;
        int r53 = this.b.getMeasuredHeight() + r84;
        this.b.layout(r3, r84, r210, r53);
        int r211 = r210 + this.q;
        r84 = r53 + ((ViewGroup.MarginLayoutParams) r121).bottomMargin;
    L96:
        if (r142 == false) goto L98;
        int r86 = r84 + ((ViewGroup.MarginLayoutParams) ((g70) this.c.getLayoutParams())).topMargin;
        int r124 = this.c.getMeasuredWidth() + r3;
        this.c.layout(r3, r86, r124, this.c.getMeasuredHeight() + r86);
        int r125 = r124 + this.q;
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
        int r36 = ((ViewGroup.MarginLayoutParams) r27).topMargin + this.r;
        if (r126 >= r36) goto L68;
        r126 = r36;
    L71:
        r84 = r8 + r126;
        goto L74
    L68:
        int r54 = (((r5 - r9) - r223) - r126) - r8;
        int r212 = ((ViewGroup.MarginLayoutParams) r27).bottomMargin;
        int r37 = this.s;
        if (r54 >= (r212 + r37)) goto L71;
        r126 = Math.max(0, r126 - ((((ViewGroup.MarginLayoutParams) r156).bottomMargin + r37) - r54));
        goto L71
    L72:
        r84 = (((r5 - r9) - ((ViewGroup.MarginLayoutParams) r156).bottomMargin) - this.s) - r223;
        goto L74
    L58:
        if (this.c.getMeasuredWidth() <= 0) goto L60;
    L59:
        r242 = true;
        goto L61
    L55:
        if (this.b.getMeasuredWidth() > 0) goto L59;
    L51:
        r155 = this.b;
        goto L52
    L48:
        r26 = this.c;
        goto L49
    L40:
        r232 = r12;
        r17 = 0;
        goto L41
    L14:
        r13 = p(this.d, r6, r123, r11);
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
        r12 = false;
        goto L6
    }

    @Override // android.view.View
    public final void onMeasure(int r15, int r16) {
        boolean r6 = cb0.a(this);
        int r7 = !r6 ? 1 : 0;
        int r8 = 0;
        if (t(this.d) == false) goto L5;
        s(this.d, r15, 0, r16, this.o);
        int r2 = k(this.d) + this.d.getMeasuredWidth();
        int r9 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
        int r10 = View.combineMeasuredStates(0, this.d.getMeasuredState());
    L7:
        if (t(this.h) == false) goto L9;
        s(this.h, r15, 0, r16, this.o);
        r2 = k(this.h) + this.h.getMeasuredWidth();
        r9 = Math.max(r9, l(this.h) + this.h.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.h.getMeasuredState());
    L9:
        int r1 = getCurrentContentInsetStart();
        int r3 = Math.max(r1, r2);
        int r12 = Math.max(0, r1 - r2);
        int[] r62 = this.F;
        r62[r6 ? 1 : 0] = r12;
        if (t(this.a) == false) goto L12;
        s(this.a, r15, r3, r16, this.o);
        int r22 = k(this.a) + this.a.getMeasuredWidth();
        r9 = Math.max(r9, l(this.a) + this.a.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.a.getMeasuredState());
    L13:
        int r13 = getCurrentContentInsetEnd();
        int r32 = r3 + Math.max(r13, r22);
        r62[r7] = Math.max(0, r13 - r22);
        if (t(this.i) == false) goto L17;
        r32 = r32 + r(this.i, r15, r32, r16, 0, r62);
        r9 = Math.max(r9, l(this.i) + this.i.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.i.getMeasuredState());
    L17:
        if (t(this.e) == false) goto L19;
        r32 = r32 + r(this.e, r15, r32, r16, 0, r62);
        r9 = Math.max(r9, l(this.e) + this.e.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, this.e.getMeasuredState());
    L19:
        int r72 = getChildCount();
        int r11 = 0;
    L20:
        if (r11 >= r72) goto L29;
        View r14 = getChildAt(r11);
        if (((g70) r14.getLayoutParams()).b != 0) goto L27;
        if (t(r14) == false) goto L27;
        r32 = r32 + r(r14, r15, r32, r16, 0, r62);
        int r23 = Math.max(r9, l(r14) + r14.getMeasuredHeight());
        r10 = View.combineMeasuredStates(r10, r14.getMeasuredState());
        r9 = r23;
    L28:
        r11 = r11 + 1;
    L27:
        r32 = r32;
        goto L28
    L29:
        int r122 = r32;
        int r5 = this.r + this.s;
        int r73 = this.p + this.q;
        if (t(this.b) == false) goto L32;
        r(this.b, r15, r122 + r73, r16, r5, r62);
        int r24 = k(this.b) + this.b.getMeasuredWidth();
        int r112 = l(this.b) + this.b.getMeasuredHeight();
        int r132 = View.combineMeasuredStates(r10, this.b.getMeasuredState());
        int r102 = r24;
    L34:
        if (t(this.c) == false) goto L36;
        r102 = Math.max(r102, r(this.c, r15, r122 + r73, r16, r5 + r112, r62));
        r112 = r112 + (l(this.c) + this.c.getMeasuredHeight());
        r132 = View.combineMeasuredStates(r132, this.c.getMeasuredState());
    L36:
        int r17 = Math.max(r9, r112);
        int r4 = (getPaddingRight() + getPaddingLeft()) + (r122 + r102);
        int r33 = (getPaddingBottom() + getPaddingTop()) + r17;
        int r18 = View.resolveSizeAndState(Math.max(r4, getSuggestedMinimumWidth()), r15, (-16777216) & r132);
        int r25 = View.resolveSizeAndState(Math.max(r33, getSuggestedMinimumHeight()), r16, r132 << 16);
        if (this.M == false) goto L47;
        int r34 = getChildCount();
        int r42 = 0;
    L40:
        if (r42 >= r34) goto L49;
        View r52 = getChildAt(r42);
        if (t(r52) == false) goto L48;
        if (r52.getMeasuredWidth() <= 0) goto L48;
        if (r52.getMeasuredHeight() > 0) goto L47;
    L48:
        r42 = r42 + 1;
    L49:
        setMeasuredDimension(r18, r8);
        return;
    L47:
        r8 = r25;
        goto L49
    L32:
        r112 = 0;
        r132 = r10;
        r102 = 0;
        goto L34
    L12:
        r22 = 0;
        goto L13
    L5:
        r2 = 0;
        r9 = 0;
        r10 = 0;
        goto L7
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r4) {
        if ((r4 instanceof i70) == true) goto L6;
        super.onRestoreInstanceState(r4);
        return;
    L6:
        i70 r42 = (i70) r4;
        super.onRestoreInstanceState(r42.a);
        ActionMenuView r0 = this.a;
        if (r0 == null) goto L9;
        ku r02 = r0.p;
    L10:
        int r1 = r42.c;
        if (r1 == 0) goto L19;
        if (this.L == null) goto L19;
        if (r02 == null) goto L19;
        MenuItem r03 = r02.findItem(r1);
        if (r03 == null) goto L19;
        r03.expandActionView();
    L19:
        if (r42.d == false) goto L22;
        y6 r43 = this.Q;
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
        d();
        i10 r0 = this.t;
        boolean r1 = true;
        if (r3 == 1) goto L7;
        r1 = false;
    L7:
        if (r1 != r0.g) goto L9;
        return;
    L9:
        r0.g = r1;
        if (r0.h == true) goto L12;
        r0.a = r0.e;
        r0.b = r0.f;
        return;
    L12:
        if (r1 == false) goto L23;
        int r12 = r0.d;
        if (r12 != Integer.MIN_VALUE) goto L17;
        r12 = r0.e;
    L17:
        r0.a = r12;
        int r13 = r0.c;
        if (r13 != Integer.MIN_VALUE) goto L21;
        r13 = r0.f;
    L21:
        r0.b = r13;
        return;
    L23:
        int r14 = r0.c;
        if (r14 != Integer.MIN_VALUE) goto L27;
        r14 = r0.e;
    L27:
        r0.a = r14;
        int r15 = r0.d;
        if (r15 != Integer.MIN_VALUE) goto L31;
        r15 = r0.f;
    L31:
        r0.b = r15;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i70 r0 = new i70(super.onSaveInstanceState());
        f70 r1 = this.L;
        if (r1 == null) goto L7;
        ou r12 = r1.b;
        if (r12 == null) goto L7;
        r0.c = r12.a;
    L7:
        ActionMenuView r13 = this.a;
        if (r13 == null) goto L14;
        j1 r14 = r13.t;
        if (r14 == null) goto L14;
        if (r14.j() == false) goto L14;
        boolean r15 = true;
    L15:
        r0.d = r15;
        return r0;
    L14:
        r15 = false;
        goto L15
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r5) {
        int r0 = r5.getActionMasked();
        if (r0 != 0) goto L6;
        this.B = false;
    L6:
        if (this.B == true) goto L11;
        boolean r52 = super.onTouchEvent(r5);
        if (r0 != 0) goto L11;
        if (r52 == true) goto L11;
        this.B = true;
    L11:
        if (r0 != 1) goto L13;
    L16:
        this.B = false;
        return true;
    L13:
        if (r0 == 3) goto L16;
        return true;
    }

    public final int p(View r5, int r6, int r7, int[] r8) {
        g70 r0 = (g70) r5.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) r0).leftMargin - r8[0];
        int r3 = Math.max(0, r1) + r6;
        r8[0] = Math.max(0, -r1);
        int r62 = j(r5, r7);
        int r72 = r5.getMeasuredWidth();
        r5.layout(r3, r62, r3 + r72, r5.getMeasuredHeight() + r62);
        return (r72 + ((ViewGroup.MarginLayoutParams) r0).rightMargin) + r3;
    }

    public final int q(View r6, int r7, int r8, int[] r9) {
        g70 r0 = (g70) r6.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) r0).rightMargin - r9[1];
        int r72 = r7 - Math.max(0, r1);
        r9[1] = Math.max(0, -r1);
        int r82 = j(r6, r8);
        int r92 = r6.getMeasuredWidth();
        r6.layout(r72 - r92, r82, r72, r6.getMeasuredHeight() + r82);
        return r72 - (r92 + ((ViewGroup.MarginLayoutParams) r0).leftMargin);
    }

    public final int r(View r8, int r9, int r10, int r11, int r12, int[] r13) {
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

    public final void s(View r4, int r5, int r6, int r7, int r8) {
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
        if (this.P == r2) goto L6;
        this.P = r2;
        u();
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
        setCollapseIcon(ff.r(getContext(), r2));
    }

    public void setCollapsible(boolean r1) {
        this.M = r1;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int r2) {
        if (r2 >= 0) goto L5;
        r2 = Integer.MIN_VALUE;
    L5:
        if (r2 == this.v) goto L10;
        this.v = r2;
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
        if (r2 == this.u) goto L10;
        this.u = r2;
        if (getNavigationIcon() == null) goto L11;
        requestLayout();
        return;
    L11:
        return;
    }

    public void setLogo(int r2) {
        setLogo(ff.r(getContext(), r2));
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
        setNavigationIcon(ff.r(getContext(), r2));
    }

    public void setNavigationOnClickListener(View.OnClickListener r2) {
        g();
        this.d.setOnClickListener(r2);
    }

    public void setOverflowIcon(Drawable r2) {
        e();
        this.a.setOverflowIcon(r2);
    }

    public void setPopupTheme(int r3) {
        if (this.k == r3) goto L10;
        this.k = r3;
        if (r3 != 0) goto L8;
        this.j = getContext();
        return;
    L8:
        this.j = new ContextThemeWrapper(getContext(), r3);
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
        this.s = r1;
        requestLayout();
    }

    public void setTitleMarginEnd(int r1) {
        this.q = r1;
        requestLayout();
    }

    public void setTitleMarginStart(int r1) {
        this.p = r1;
        requestLayout();
    }

    public void setTitleMarginTop(int r1) {
        this.r = r1;
        requestLayout();
    }

    public void setTitleTextColor(int r1) {
        setTitleTextColor(ColorStateList.valueOf(r1));
    }

    public final boolean t(View r2) {
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

    public final void u() {
        if (Build.VERSION.SDK_INT < 33) goto L28;
        OnBackInvokedDispatcher r0 = e70.a(this);
        f70 r1 = this.L;
        int r2 = 0;
        if (r1 != null) goto L7;
    L14:
        boolean r12 = false;
    L15:
        if (r12 == true) goto L17;
    L23:
        if (r12 == true) goto L29;
        OnBackInvokedDispatcher r02 = this.O;
        if (r02 == null) goto L30;
        e70.d(r02, this.N);
        this.O = null;
        return;
    L30:
        return;
    L29:
        return;
    L17:
        if (this.O != null) goto L23;
        if (this.N != null) goto L21;
        this.N = e70.b(new c70(this, r2));
    L21:
        e70.c(r0, this.N);
        this.O = r0;
        return;
    L7:
        if (r1.b == null) goto L14;
        if (r0 == null) goto L14;
        WeakHashMap r13 = ja0.a;
        if (v90.b(this) == false) goto L14;
        if (this.P == false) goto L14;
        r12 = true;
        goto L15
    }

    public Toolbar(Context r9, AttributeSet r10, int r11) {
        super(r9, r10, R.attr.toolbarStyle);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new d4(new c70(this, 1));
        this.H = new ArrayList();
        this.I = new d70(this);
        this.Q = new y6(11, this);
        Context r0 = getContext();
        int[] r2 = xy.x;
        r5 r7 = r5.y(r0, r10, r2, R.attr.toolbarStyle);
        ja0.k(this, r9, r2, r10, (TypedArray) r7.b, R.attr.toolbarStyle);
        TypedArray r92 = (TypedArray) r7.b;
        this.l = r92.getResourceId(28, 0);
        this.m = r92.getResourceId(19, 0);
        this.w = r92.getInteger(0, 8388627);
        this.n = r92.getInteger(2, 48);
        int r102 = r92.getDimensionPixelOffset(22, 0);
        if (r92.hasValue(27) == false) goto L5;
        r102 = r92.getDimensionPixelOffset(27, r102);
    L5:
        this.s = r102;
        this.r = r102;
        this.q = r102;
        this.p = r102;
        int r103 = r92.getDimensionPixelOffset(25, -1);
        if (r103 < 0) goto L8;
        this.p = r103;
    L8:
        int r104 = r92.getDimensionPixelOffset(24, -1);
        if (r104 < 0) goto L11;
        this.q = r104;
    L11:
        int r105 = r92.getDimensionPixelOffset(26, -1);
        if (r105 < 0) goto L14;
        this.r = r105;
    L14:
        int r106 = r92.getDimensionPixelOffset(23, -1);
        if (r106 < 0) goto L17;
        this.s = r106;
    L17:
        this.o = r92.getDimensionPixelSize(13, -1);
        int r107 = r92.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int r22 = r92.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int r3 = r92.getDimensionPixelSize(7, 0);
        int r4 = r92.getDimensionPixelSize(8, 0);
        d();
        i10 r5 = this.t;
        r5.h = false;
        if (r3 == Integer.MIN_VALUE) goto L20;
        r5.e = r3;
        r5.a = r3;
    L20:
        if (r4 == Integer.MIN_VALUE) goto L22;
        r5.f = r4;
        r5.b = r4;
    L22:
        if (r107 != Integer.MIN_VALUE) goto L24;
        if (r22 != Integer.MIN_VALUE) goto L24;
    L25:
        this.u = r92.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.v = r92.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = r7.m(4);
        this.g = r92.getText(3);
        CharSequence r108 = r92.getText(21);
        if (TextUtils.isEmpty(r108) == true) goto L28;
        setTitle(r108);
    L28:
        CharSequence r109 = r92.getText(18);
        if (TextUtils.isEmpty(r109) == true) goto L31;
        setSubtitle(r109);
    L31:
        this.j = getContext();
        setPopupTheme(r92.getResourceId(17, 0));
        Drawable r1010 = r7.m(16);
        if (r1010 == null) goto L34;
        setNavigationIcon(r1010);
    L34:
        CharSequence r1011 = r92.getText(15);
        if (TextUtils.isEmpty(r1011) == true) goto L37;
        setNavigationContentDescription(r1011);
    L37:
        Drawable r1012 = r7.m(11);
        if (r1012 == null) goto L40;
        setLogo(r1012);
    L40:
        CharSequence r1013 = r92.getText(12);
        if (TextUtils.isEmpty(r1013) == true) goto L44;
        setLogoDescription(r1013);
    L44:
        if (r92.hasValue(29) == false) goto L47;
        setTitleTextColor(r7.l(29));
    L47:
        if (r92.hasValue(20) == false) goto L50;
        setSubtitleTextColor(r7.l(20));
    L50:
        if (r92.hasValue(14) == false) goto L52;
        m(r92.getResourceId(14, 0));
    L52:
        r7.z();
        return;
    L24:
        r5.a(r107, r22);
        goto L25
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r5) {
        Context r1 = getContext();
        g70 r0 = new g70(r1, r5);
        r0.a = 0;
        TypedArray r52 = r1.obtainStyledAttributes(r5, xy.b);
        r0.a = r52.getInt(0, 0);
        r52.recycle();
        r0.b = 0;
        return r0;
    }

    public void setCollapseContentDescription(CharSequence r2) {
        if (TextUtils.isEmpty(r2) == true) goto L5;
        c();
    L5:
        y3 r0 = this.h;
        if (r0 == null) goto L9;
        r0.setContentDescription(r2);
        return;
    }

    public void setCollapseIcon(Drawable r2) {
        if (r2 == null) goto L5;
        c();
        this.h.setImageDrawable(r2);
        return;
    L5:
        y3 r22 = this.h;
        if (r22 == null) goto L9;
        r22.setImageDrawable(this.f);
        return;
    }

    public void setLogo(Drawable r5) {
        if (r5 != null) goto L4;
        a4 r0 = this.e;
        if (r0 != null) goto L12;
    L14:
        a4 r02 = this.e;
        if (r02 == null) goto L18;
        r02.setImageDrawable(r5);
        return;
    L18:
        return;
    L12:
        if (o(r0) == false) goto L14;
        removeView(this.e);
        this.E.remove(this.e);
        goto L14
    L4:
        if (this.e != null) goto L7;
        this.e = new a4(getContext(), null, 0);
    L7:
        if (o(this.e) == true) goto L14;
        b(this.e, true);
        goto L14
    }

    public void setLogoDescription(CharSequence r5) {
        if (TextUtils.isEmpty(r5) == false) goto L5;
    L7:
        a4 r0 = this.e;
        if (r0 == null) goto L11;
        r0.setContentDescription(r5);
        return;
    L11:
        return;
    L5:
        if (this.e != null) goto L7;
        this.e = new a4(getContext(), null, 0);
        goto L7
    }

    public void setNavigationContentDescription(CharSequence r2) {
        if (TextUtils.isEmpty(r2) == true) goto L5;
        g();
    L5:
        y3 r0 = this.d;
        if (r0 == null) goto L9;
        r0.setContentDescription(r2);
        l70.a(this.d, r2);
        return;
    }

    public void setNavigationIcon(Drawable r3) {
        if (r3 == null) goto L6;
        g();
        if (o(this.d) == true) goto L11;
        b(this.d, true);
    L11:
        y3 r0 = this.d;
        if (r0 == null) goto L15;
        r0.setImageDrawable(r3);
        return;
    L15:
        return;
    L6:
        y3 r02 = this.d;
        if (r02 == null) goto L11;
        if (o(r02) == false) goto L11;
        removeView(this.d);
        this.E.remove(this.d);
        goto L11
    }

    public void setSubtitle(CharSequence r4) {
        if (TextUtils.isEmpty(r4) == false) goto L5;
        g5 r0 = this.c;
        if (r0 != null) goto L18;
    L20:
        g5 r02 = this.c;
        if (r02 == null) goto L23;
        r02.setText(r4);
    L23:
        this.y = r4;
        return;
    L18:
        if (o(r0) == false) goto L20;
        removeView(this.c);
        this.E.remove(this.c);
        goto L20
    L5:
        if (this.c != null) goto L13;
        Context r03 = getContext();
        g5 r1 = new g5(r03, null);
        this.c = r1;
        r1.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        int r12 = this.m;
        if (r12 == 0) goto L9;
        this.c.setTextAppearance(r03, r12);
    L9:
        ColorStateList r04 = this.A;
        if (r04 == null) goto L13;
        this.c.setTextColor(r04);
    L13:
        if (o(this.c) == true) goto L20;
        b(this.c, true);
        goto L20
    }

    public void setSubtitleTextColor(ColorStateList r2) {
        this.A = r2;
        g5 r0 = this.c;
        if (r0 == null) goto L6;
        r0.setTextColor(r2);
        return;
    }

    public void setTitle(CharSequence r4) {
        if (TextUtils.isEmpty(r4) == false) goto L5;
        g5 r0 = this.b;
        if (r0 != null) goto L18;
    L20:
        g5 r02 = this.b;
        if (r02 == null) goto L23;
        r02.setText(r4);
    L23:
        this.x = r4;
        return;
    L18:
        if (o(r0) == false) goto L20;
        removeView(this.b);
        this.E.remove(this.b);
        goto L20
    L5:
        if (this.b != null) goto L13;
        Context r03 = getContext();
        g5 r1 = new g5(r03, null);
        this.b = r1;
        r1.setSingleLine();
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        int r12 = this.l;
        if (r12 == 0) goto L9;
        this.b.setTextAppearance(r03, r12);
    L9:
        ColorStateList r04 = this.z;
        if (r04 == null) goto L13;
        this.b.setTextColor(r04);
    L13:
        if (o(this.b) == true) goto L20;
        b(this.b, true);
        goto L20
    }

    public void setTitleTextColor(ColorStateList r2) {
        this.z = r2;
        g5 r0 = this.b;
        if (r0 == null) goto L6;
        r0.setTextColor(r2);
        return;
    }

    public void setOnMenuItemClickListener(h70 r1) {
    }
}
