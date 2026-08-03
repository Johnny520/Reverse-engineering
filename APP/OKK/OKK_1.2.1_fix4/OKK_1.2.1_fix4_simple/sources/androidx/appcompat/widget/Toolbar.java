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
import androidx.fragment.app.AbstractC0507g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.luckypray.dexkit.C1031R;
import p001A0.RunnableC0019E;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p018J0.C0234d;
import p037U.AbstractC0358S;
import p048b.AbstractC0550a;
import p053e.C0766d;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p057g.AbstractC0863H0;
import p057g.AbstractC0875N0;
import p057g.AbstractC0881Q0;
import p057g.C0859F0;
import p057g.C0865I0;
import p057g.C0867J0;
import p057g.C0868K;
import p057g.C0871L0;
import p057g.C0873M0;
import p057g.C0900f;
import p057g.C0906i;
import p057g.C0934w;
import p057g.C0936x;
import p057g.C0937x0;
import p057g.InterfaceC0869K0;
import p057g.InterfaceC0882S;
import p057g.RunnableC0857E0;
import p057g.ViewOnClickListenerC0861G0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f1211A;

    /* JADX INFO: renamed from: B */
    public boolean f1212B;

    /* JADX INFO: renamed from: C */
    public boolean f1213C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f1214D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f1215E;

    /* JADX INFO: renamed from: F */
    public final int[] f1216F;

    /* JADX INFO: renamed from: G */
    public final C0095d f1217G;

    /* JADX INFO: renamed from: H */
    public ArrayList f1218H;

    /* JADX INFO: renamed from: I */
    public final C0859F0 f1219I;

    /* JADX INFO: renamed from: J */
    public C0873M0 f1220J;

    /* JADX INFO: renamed from: K */
    public C0865I0 f1221K;

    /* JADX INFO: renamed from: L */
    public boolean f1222L;

    /* JADX INFO: renamed from: M */
    public OnBackInvokedCallback f1223M;

    /* JADX INFO: renamed from: N */
    public OnBackInvokedDispatcher f1224N;

    /* JADX INFO: renamed from: O */
    public boolean f1225O;

    /* JADX INFO: renamed from: P */
    public final RunnableC0019E f1226P;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f1227a;

    /* JADX INFO: renamed from: b */
    public C0868K f1228b;

    /* JADX INFO: renamed from: c */
    public C0868K f1229c;

    /* JADX INFO: renamed from: d */
    public C0934w f1230d;

    /* JADX INFO: renamed from: e */
    public C0936x f1231e;

    /* JADX INFO: renamed from: f */
    public final Drawable f1232f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f1233g;

    /* JADX INFO: renamed from: h */
    public C0934w f1234h;

    /* JADX INFO: renamed from: i */
    public View f1235i;

    /* JADX INFO: renamed from: j */
    public Context f1236j;

    /* JADX INFO: renamed from: k */
    public int f1237k;

    /* JADX INFO: renamed from: l */
    public int f1238l;

    /* JADX INFO: renamed from: m */
    public int f1239m;

    /* JADX INFO: renamed from: n */
    public final int f1240n;

    /* JADX INFO: renamed from: o */
    public final int f1241o;

    /* JADX INFO: renamed from: p */
    public int f1242p;

    /* JADX INFO: renamed from: q */
    public int f1243q;

    /* JADX INFO: renamed from: r */
    public int f1244r;

    /* JADX INFO: renamed from: s */
    public int f1245s;

    /* JADX INFO: renamed from: t */
    public C0937x0 f1246t;

    /* JADX INFO: renamed from: u */
    public int f1247u;

    /* JADX INFO: renamed from: v */
    public int f1248v;

    /* JADX INFO: renamed from: w */
    public final int f1249w;

    /* JADX INFO: renamed from: x */
    public CharSequence f1250x;

    /* JADX INFO: renamed from: y */
    public CharSequence f1251y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f1252z;

    public Toolbar(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C0867J0 m1135g() {
        C0867J0 r02 = new C0867J0(-2, -2);
        r02.f3112b = 0;
        r02.f3111a = 8388627;
        return r02;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> r02 = new ArrayList();
        Menu r1 = getMenu();
        int r2 = 0;
    L4:
        if (r2 >= r1.size()) goto L6;
        r02.add(r1.getItem(r2));
        r2 = r2 + 1;
        goto L4
    L6:
        return r02;
    }

    private MenuInflater getMenuInflater() {
        return new C0766d(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C0867J0 m1136h(ViewGroup.LayoutParams r2) {
        boolean r02 = r2 instanceof C0867J0;
        if (r02 == false) goto L6;
        C0867J0 r22 = (C0867J0) r2;
        C0867J0 r03 = new C0867J0(r22);
        r03.f3112b = 0;
        r03.f3112b = r22.f3112b;
        return r03;
    L6:
        if (r02 == false) goto L10;
        C0867J0 r04 = new C0867J0((C0867J0) r2);
        r04.f3112b = 0;
        return r04;
    L10:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L13;
        ViewGroup.MarginLayoutParams r23 = (ViewGroup.MarginLayoutParams) r2;
        C0867J0 r05 = new C0867J0(r23);
        r05.f3112b = 0;
        ((ViewGroup.MarginLayoutParams) r05).leftMargin = r23.leftMargin;
        ((ViewGroup.MarginLayoutParams) r05).topMargin = r23.topMargin;
        ((ViewGroup.MarginLayoutParams) r05).rightMargin = r23.rightMargin;
        ((ViewGroup.MarginLayoutParams) r05).bottomMargin = r23.bottomMargin;
        return r05;
    L13:
        C0867J0 r06 = new C0867J0(r2);
        r06.f3112b = 0;
        return r06;
    }

    /* JADX INFO: renamed from: j */
    public static int m1137j(View r1) {
        ViewGroup.MarginLayoutParams r12 = (ViewGroup.MarginLayoutParams) r1.getLayoutParams();
        int r02 = r12.getMarginStart();
        return r12.getMarginEnd() + r02;
    }

    /* JADX INFO: renamed from: k */
    public static int m1138k(View r1) {
        ViewGroup.MarginLayoutParams r12 = (ViewGroup.MarginLayoutParams) r1.getLayoutParams();
        return r12.topMargin + r12.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m1139a(ArrayList r9, int r10) {
        int r1 = 0;
        if (getLayoutDirection() != 1) goto L5;
        boolean r02 = true;
    L6:
        int r3 = getChildCount();
        int r102 = Gravity.getAbsoluteGravity(r10, getLayoutDirection());
        r9.clear();
        if (r02 == false) goto L24;
        int r32 = r3 - 1;
    L9:
        if (r32 < 0) goto L39;
        View r03 = getChildAt(r32);
        C0867J0 r12 = (C0867J0) r03.getLayoutParams();
        if (r12.f3112b != 0) goto L23;
        if (m1153s(r03) == false) goto L23;
        int r13 = r12.f3111a;
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
        r9.add(r03);
    L23:
        r32 = r32 - 1;
        goto L9
    L39:
        return;
    L24:
        if (r1 >= r3) goto L50;
        View r04 = getChildAt(r1);
        C0867J0 r62 = (C0867J0) r04.getLayoutParams();
        if (r62.f3112b != 0) goto L38;
        if (m1153s(r04) == false) goto L38;
        int r63 = r62.f3111a;
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

    /* JADX INFO: renamed from: b */
    public final void m1140b(View r3, boolean r4) {
        ViewGroup.LayoutParams r02 = r3.getLayoutParams();
        if (r02 != null) goto L6;
        C0867J0 r03 = m1135g();
    L9:
        r03.f3112b = 1;
        if (r4 == true) goto L12;
    L14:
        addView(r3, r03);
        return;
    L12:
        if (this.f1235i == null) goto L14;
        r3.setLayoutParams(r03);
        this.f1215E.add(r3);
        return;
    L6:
        if (checkLayoutParams(r02) == true) goto L8;
        r03 = m1136h(r02);
        goto L9
    L8:
        r03 = (C0867J0) r02;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final void m1141c() {
        if (this.f1234h != null) goto L6;
        C0934w r02 = new C0934w(getContext(), null, C1031R.attr.toolbarNavigationButtonStyle);
        this.f1234h = r02;
        r02.setImageDrawable(this.f1232f);
        this.f1234h.setContentDescription(this.f1233g);
        C0867J0 r03 = m1135g();
        r03.f3111a = (this.f1240n & 112) | 8388611;
        r03.f3112b = 2;
        this.f1234h.setLayoutParams(r03);
        this.f1234h.setOnClickListener(new ViewOnClickListenerC0861G0(this));
        return;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if (super.checkLayoutParams(r2) == true) goto L5;
    L7:
        return false;
    L5:
        if ((r2 instanceof C0867J0) == false) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m1142d() {
        if (this.f1246t != null) goto L6;
        C0937x0 r02 = new C0937x0();
        r02.f3321a = 0;
        r02.f3322b = 0;
        r02.f3323c = Integer.MIN_VALUE;
        r02.f3324d = Integer.MIN_VALUE;
        r02.f3325e = 0;
        r02.f3326f = 0;
        r02.f3327g = false;
        r02.f3328h = false;
        this.f1246t = r02;
        return;
    }

    /* JADX INFO: renamed from: e */
    public final void m1143e() {
        if (this.f1227a != null) goto L5;
        ActionMenuView r02 = new ActionMenuView(getContext(), null);
        this.f1227a = r02;
        r02.setPopupTheme(this.f1237k);
        this.f1227a.setOnMenuItemClickListener(this.f1219I);
        ActionMenuView r03 = this.f1227a;
        C0859F0 r1 = new C0859F0(this);
        r03.f1145t = null;
        r03.f1146u = r1;
        C0867J0 r04 = m1135g();
        r04.f3111a = (this.f1240n & 112) | 8388613;
        this.f1227a.setLayoutParams(r04);
        m1140b(this.f1227a, false);
    L5:
        ActionMenuView r05 = this.f1227a;
        if (r05.f1141p != null) goto L12;
        MenuC0779j r06 = (MenuC0779j) r05.getMenu();
        if (this.f1221K != null) goto L10;
        this.f1221K = new C0865I0(this);
    L10:
        this.f1227a.setExpandedActionViewsExclusive(true);
        r06.m1996b(this.f1221K, this.f1236j);
        m1154t();
        return;
    }

    /* JADX INFO: renamed from: f */
    public final void m1144f() {
        if (this.f1230d != null) goto L6;
        this.f1230d = new C0934w(getContext(), null, C1031R.attr.toolbarNavigationButtonStyle);
        C0867J0 r02 = m1135g();
        r02.f3111a = (this.f1240n & 112) | 8388611;
        this.f1230d.setLayoutParams(r02);
        return;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1135g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return m1136h(r1);
    }

    public CharSequence getCollapseContentDescription() {
        C0934w r02 = this.f1234h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getContentDescription();
    }

    public Drawable getCollapseIcon() {
        C0934w r02 = this.f1234h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getDrawable();
    }

    public int getContentInsetEnd() {
        C0937x0 r02 = this.f1246t;
        if (r02 != null) goto L5;
        return 0;
    L5:
        if (r02.f3327g == false) goto L11;
        return r02.f3321a;
    L11:
        return r02.f3322b;
    }

    public int getContentInsetEndWithActions() {
        int r02 = this.f1248v;
        if (r02 == Integer.MIN_VALUE) goto L6;
        return r02;
    L6:
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0937x0 r02 = this.f1246t;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.f3321a;
    }

    public int getContentInsetRight() {
        C0937x0 r02 = this.f1246t;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.f3322b;
    }

    public int getContentInsetStart() {
        C0937x0 r02 = this.f1246t;
        if (r02 != null) goto L5;
        return 0;
    L5:
        if (r02.f3327g == false) goto L11;
        return r02.f3322b;
    L11:
        return r02.f3321a;
    }

    public int getContentInsetStartWithNavigation() {
        int r02 = this.f1247u;
        if (r02 == Integer.MIN_VALUE) goto L6;
        return r02;
    L6:
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ActionMenuView r02 = this.f1227a;
        if (r02 == null) goto L10;
        MenuC0779j r03 = r02.f1141p;
        if (r03 == null) goto L10;
        if (r03.hasVisibleItems() == false) goto L10;
        return Math.max(getContentInsetEnd(), Math.max(this.f1248v, 0));
    L10:
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() != 1) goto L6;
        return getCurrentContentInsetEnd();
    L6:
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() != 1) goto L6;
        return getCurrentContentInsetStart();
    L6:
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() == null) goto L6;
        return Math.max(getContentInsetStart(), Math.max(this.f1247u, 0));
    L6:
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C0936x r02 = this.f1231e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getDrawable();
    }

    public CharSequence getLogoDescription() {
        C0936x r02 = this.f1231e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getContentDescription();
    }

    public Menu getMenu() {
        m1143e();
        return this.f1227a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1230d;
    }

    public CharSequence getNavigationContentDescription() {
        C0934w r02 = this.f1230d;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getContentDescription();
    }

    public Drawable getNavigationIcon() {
        C0934w r02 = this.f1230d;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.getDrawable();
    }

    public C0906i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        m1143e();
        return this.f1227a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1236j;
    }

    public int getPopupTheme() {
        return this.f1237k;
    }

    public CharSequence getSubtitle() {
        return this.f1251y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1229c;
    }

    public CharSequence getTitle() {
        return this.f1250x;
    }

    public int getTitleMarginBottom() {
        return this.f1245s;
    }

    public int getTitleMarginEnd() {
        return this.f1243q;
    }

    public int getTitleMarginStart() {
        return this.f1242p;
    }

    public int getTitleMarginTop() {
        return this.f1244r;
    }

    public final TextView getTitleTextView() {
        return this.f1228b;
    }

    public InterfaceC0882S getWrapper() {
        if (this.f1220J != null) goto L79;
        C0873M0 r02 = new C0873M0();
        r02.f3133l = 0;
        r02.f3122a = this;
        r02.f3129h = getTitle();
        r02.f3130i = getSubtitle();
        if (r02.f3129h == null) goto L7;
        boolean r2 = true;
    L8:
        r02.f3128g = r2;
        r02.f3127f = getNavigationIcon();
        String r6 = null;
        C0234d r22 = C0234d.m638s(getContext(), null, AbstractC0550a.f1616a, C1031R.attr.actionBarStyle, 0);
        r02.f3134m = r22.m646i(15);
        TypedArray r5 = (TypedArray) r22.f475c;
        CharSequence r4 = r5.getText(27);
        if (TextUtils.isEmpty(r4) == true) goto L15;
        r02.f3128g = true;
        r02.f3129h = r4;
        if ((r02.f3123b & 8) == 0) goto L15;
        Toolbar r3 = r02.f3122a;
        r3.setTitle(r4);
        if (r02.f3128g == false) goto L15;
        AbstractC0080Q.m292k(r3.getRootView(), r4);
    L15:
        CharSequence r32 = r5.getText(25);
        if (TextUtils.isEmpty(r32) == true) goto L20;
        r02.f3130i = r32;
        if ((r02.f3123b & 8) == 0) goto L20;
        setSubtitle(r32);
    L20:
        Drawable r33 = r22.m646i(20);
        if (r33 == null) goto L23;
        r02.f3126e = r33;
        r02.m2197c();
    L23:
        Drawable r34 = r22.m646i(17);
        if (r34 == null) goto L27;
        r02.f3125d = r34;
        r02.m2197c();
    L27:
        if (r02.f3127f != null) goto L34;
        Drawable r35 = r02.f3134m;
        if (r35 == null) goto L34;
        r02.f3127f = r35;
        int r42 = r02.f3123b & 4;
        Toolbar r7 = r02.f3122a;
        if (r42 == 0) goto L33;
        r7.setNavigationIcon(r35);
        goto L34
    L33:
        r7.setNavigationIcon(null);
    L34:
        r02.m2195a(r5.getInt(10, 0));
        int r36 = r5.getResourceId(9, 0);
        if (r36 == 0) goto L47;
        View r37 = LayoutInflater.from(getContext()).inflate(r36, this, false);
        View r43 = r02.f3124c;
        if (r43 != null) goto L39;
    L41:
        r02.f3124c = r37;
        if (r37 != null) goto L44;
    L46:
        r02.m2195a(r02.f3123b | 16);
        goto L47
    L44:
        if ((r02.f3123b & 16) == 0) goto L46;
        addView(r37);
        goto L46
    L39:
        if ((r02.f3123b & 16) == 0) goto L41;
        removeView(r43);
    L47:
        int r38 = r5.getLayoutDimension(13, 0);
        if (r38 <= 0) goto L50;
        ViewGroup.LayoutParams r44 = getLayoutParams();
        r44.height = r38;
        setLayoutParams(r44);
    L50:
        int r39 = r5.getDimensionPixelOffset(7, -1);
        int r45 = r5.getDimensionPixelOffset(3, -1);
        if (r39 >= 0) goto L53;
        if (r45 >= 0) goto L53;
    L54:
        int r310 = r5.getResourceId(28, 0);
        if (r310 == 0) goto L59;
        Context r46 = getContext();
        this.f1238l = r310;
        C0868K r72 = this.f1228b;
        if (r72 == null) goto L59;
        r72.setTextAppearance(r46, r310);
    L59:
        int r311 = r5.getResourceId(26, 0);
        if (r311 == 0) goto L64;
        Context r47 = getContext();
        this.f1239m = r311;
        C0868K r73 = this.f1229c;
        if (r73 == null) goto L64;
        r73.setTextAppearance(r47, r311);
    L64:
        int r1 = r5.getResourceId(22, 0);
        if (r1 == 0) goto L67;
        setPopupTheme(r1);
    L67:
        r22.m657u();
        if (C1031R.string.abc_action_bar_up_description == r02.f3133l) goto L77;
        r02.f3133l = C1031R.string.abc_action_bar_up_description;
        if (TextUtils.isEmpty(getNavigationContentDescription()) == false) goto L77;
        int r12 = r02.f3133l;
        if (r12 == 0) goto L76;
        r6 = getContext().getString(r12);
    L76:
        r02.f3131j = r6;
        r02.m2196b();
    L77:
        r02.f3131j = getNavigationContentDescription();
        setNavigationOnClickListener(new ViewOnClickListenerC0861G0(r02));
        this.f1220J = r02;
    L53:
        int r312 = Math.max(r39, 0);
        int r48 = Math.max(r45, 0);
        m1142d();
        this.f1246t.m2272a(r312, r48);
        goto L54
    L7:
        r2 = false;
    L79:
        return this.f1220J;
    }

    /* JADX INFO: renamed from: i */
    public final int m1145i(View r7, int r8) {
        C0867J0 r02 = (C0867J0) r7.getLayoutParams();
        int r72 = r7.getMeasuredHeight();
        if (r8 <= 0) goto L5;
        int r82 = (r72 - r8) / 2;
    L6:
        int r2 = r02.f3111a & 112;
        if (r2 == 16) goto L11;
        if (r2 == 48) goto L11;
        if (r2 == 80) goto L11;
        r2 = this.f1249w & 112;
    L11:
        if (r2 == 48) goto L24;
        if (r2 == 80) goto L22;
        int r83 = getPaddingTop();
        int r22 = getPaddingBottom();
        int r3 = getHeight();
        int r4 = (((r3 - r83) - r22) - r72) / 2;
        int r5 = ((ViewGroup.MarginLayoutParams) r02).topMargin;
        if (r4 >= r5) goto L16;
        r4 = r5;
    L20:
        return r83 + r4;
    L16:
        int r32 = (((r3 - r22) - r72) - r4) - r83;
        int r73 = ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
        if (r32 >= r73) goto L20;
        r4 = Math.max(0, r4 - (r73 - r32));
        goto L20
    L22:
        return (((getHeight() - getPaddingBottom()) - r72) - ((ViewGroup.MarginLayoutParams) r02).bottomMargin) - r82;
    L24:
        return getPaddingTop() - r82;
    L5:
        r82 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public void mo1146l(int r3) {
        getMenuInflater().inflate(r3, getMenu());
    }

    /* JADX INFO: renamed from: m */
    public final void m1147m() {
        Iterator r02 = this.f1218H.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        MenuItem r1 = (MenuItem) r02.next();
        getMenu().removeItem(r1.getItemId());
        goto L4
    L6:
        getMenu();
        ArrayList<MenuItem> r03 = getCurrentMenuItems();
        getMenuInflater();
        Iterator r12 = ((CopyOnWriteArrayList) this.f1217G.f251b).iterator();
        if (r12.hasNext() == true) goto L10;
        ArrayList<MenuItem> r13 = getCurrentMenuItems();
        r13.removeAll(r03);
        this.f1218H = r13;
        return;
    L10:
        ((AbstractC0507g) r12.next()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1148n(View r2) {
        if (r2.getParent() != this) goto L5;
    L8:
        return true;
    L5:
        if (this.f1215E.contains(r2) == true) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final int m1149o(View r5, int r6, int r7, int[] r8) {
        C0867J0 r02 = (C0867J0) r5.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) r02).leftMargin - r8[0];
        int r3 = Math.max(0, r1) + r6;
        r8[0] = Math.max(0, -r1);
        int r62 = m1145i(r5, r7);
        int r72 = r5.getMeasuredWidth();
        r5.layout(r3, r62, r3 + r72, r5.getMeasuredHeight() + r62);
        return (r72 + ((ViewGroup.MarginLayoutParams) r02).rightMargin) + r3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1154t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1226P);
        m1154t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent r6) {
        int r02 = r6.getActionMasked();
        if (r02 != 9) goto L6;
        this.f1213C = false;
    L6:
        if (this.f1213C == true) goto L12;
        boolean r62 = super.onHoverEvent(r6);
        if (r02 != 9) goto L12;
        if (r62 == true) goto L12;
        this.f1213C = true;
    L12:
        if (r02 != 10) goto L14;
    L15:
        this.f1213C = false;
    L16:
        return true;
    L14:
        if (r02 != 3) goto L16;
        goto L15
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
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
        int[] r11 = this.f1216F;
        r11[1] = 0;
        r11[0] = 0;
        Field r12 = AbstractC0080Q.f219a;
        int r122 = getMinimumHeight();
        if (r122 < 0) goto L9;
        int r123 = Math.min(r122, r23 - r21);
    L11:
        if (m1153s(this.f1230d) == false) goto L16;
        if (r1 == false) goto L14;
        int r14 = m1150p(this.f1230d, r10, r123, r11);
        int r13 = r6;
    L18:
        if (m1153s(this.f1234h) == false) goto L23;
        if (r1 == false) goto L21;
        r14 = m1150p(this.f1234h, r14, r123, r11);
        goto L23
    L21:
        r13 = m1149o(this.f1234h, r13, r123, r11);
    L23:
        if (m1153s(this.f1227a) == false) goto L27;
        if (r1 == false) goto L26;
        r13 = m1149o(this.f1227a, r13, r123, r11);
        goto L27
    L26:
        r14 = m1150p(this.f1227a, r14, r123, r11);
    L27:
        int r15 = getCurrentContentInsetLeft();
        int r16 = getCurrentContentInsetRight();
        r11[0] = Math.max(0, r15 - r13);
        r11[1] = Math.max(0, r16 - (r10 - r14));
        int r3 = Math.max(r13, r15);
        int r102 = Math.min(r14, r10 - r16);
        if (m1153s(this.f1235i) == false) goto L33;
        if (r1 == false) goto L31;
        r102 = m1150p(this.f1235i, r102, r123, r11);
        goto L33
    L31:
        r3 = m1149o(this.f1235i, r3, r123, r11);
    L33:
        if (m1153s(this.f1231e) == false) goto L37;
        if (r1 == false) goto L36;
        r102 = m1150p(this.f1231e, r102, r123, r11);
        goto L37
    L36:
        r3 = m1149o(this.f1231e, r3, r123, r11);
    L37:
        boolean r132 = m1153s(this.f1228b);
        boolean r142 = m1153s(this.f1229c);
        if (r132 == false) goto L40;
        C0867J0 r152 = (C0867J0) this.f1228b.getLayoutParams();
        int r222 = r7;
        int r2 = ((ViewGroup.MarginLayoutParams) r152).bottomMargin + (this.f1228b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r152).topMargin);
    L41:
        if (r142 == false) goto L43;
        C0867J0 r72 = (C0867J0) this.f1229c.getLayoutParams();
        int r162 = r4;
        r2 = r2 + ((this.f1229c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r72).topMargin) + ((ViewGroup.MarginLayoutParams) r72).bottomMargin);
    L44:
        if (r132 == true) goto L48;
        if (r142 == true) goto L48;
        int r17 = r6;
        int r212 = r123;
    L104:
        ArrayList r18 = this.f1214D;
        m1139a(r18, 3);
        int r24 = r18.size();
        int r42 = r3;
        int r32 = 0;
    L105:
        if (r32 >= r24) goto L107;
        r42 = m1149o((View) r18.get(r32), r42, r212, r11);
        r32 = r32 + 1;
        goto L105
    L107:
        int r124 = r212;
        m1139a(r18, 5);
        int r25 = r18.size();
        int r33 = 0;
    L108:
        if (r33 >= r25) goto L110;
        r102 = m1150p((View) r18.get(r33), r102, r124, r11);
        r33 = r33 + 1;
        goto L108
    L110:
        m1139a(r18, 1);
        int r34 = r11[0];
        int r26 = r11[1];
        int r52 = r18.size();
        int r62 = r26;
        int r73 = r34;
        int r27 = 0;
        int r35 = 0;
    L111:
        if (r27 >= r52) goto L113;
        View r82 = (View) r18.get(r27);
        C0867J0 r92 = (C0867J0) r82.getLayoutParams();
        int r133 = ((ViewGroup.MarginLayoutParams) r92).leftMargin - r73;
        int r74 = ((ViewGroup.MarginLayoutParams) r92).rightMargin - r62;
        int r93 = Math.max(0, r133);
        int r143 = Math.max(0, r74);
        int r134 = Math.max(0, -r133);
        int r75 = Math.max(0, -r74);
        r35 = r35 + ((r82.getMeasuredWidth() + r93) + r143);
        r27 = r27 + 1;
        r62 = r75;
        r73 = r134;
        goto L111
    L113:
        int r63 = 0;
        int r28 = ((((r162 - r17) - r222) / 2) + r17) - (r35 / 2);
        int r36 = r35 + r28;
        if (r28 < r42) goto L119;
        if (r36 <= r102) goto L118;
        r42 = r28 - (r36 - r102);
        goto L119
    L118:
        r42 = r28;
    L119:
        int r29 = r18.size();
    L120:
        if (r63 >= r29) goto L122;
        r42 = m1149o((View) r18.get(r63), r42, r124, r11);
        r63 = r63 + 1;
        goto L120
    L122:
        r18.clear();
        return;
    L48:
        if (r132 == false) goto L50;
        C0868K r43 = this.f1228b;
    L51:
        if (r142 == false) goto L53;
        C0868K r76 = this.f1229c;
    L54:
        C0867J0 r44 = (C0867J0) r43.getLayoutParams();
        C0867J0 r77 = (C0867J0) r76.getLayoutParams();
        if (r132 == true) goto L57;
    L58:
        if (r142 == true) goto L60;
    L62:
        r17 = r6;
        boolean r153 = false;
    L63:
        int r64 = this.f1249w & 112;
        r212 = r123;
        if (r64 != 48) goto L66;
        int r232 = r3;
        int r83 = (getPaddingTop() + ((ViewGroup.MarginLayoutParams) r44).topMargin) + this.f1244r;
    L76:
        if (r1 == false) goto L91;
        if (r153 == false) goto L80;
        int r110 = this.f1242p;
    L81:
        int r111 = r110 - r11[1];
        r102 = r102 - Math.max(0, r111);
        r11[1] = Math.max(0, -r111);
        if (r132 == false) goto L84;
        C0867J0 r112 = (C0867J0) this.f1228b.getLayoutParams();
        int r210 = r102 - this.f1228b.getMeasuredWidth();
        int r37 = this.f1228b.getMeasuredHeight() + r83;
        this.f1228b.layout(r210, r83, r102, r37);
        int r211 = r210 - this.f1243q;
        r83 = r37 + ((ViewGroup.MarginLayoutParams) r112).bottomMargin;
    L85:
        if (r142 == false) goto L87;
        int r84 = r83 + ((ViewGroup.MarginLayoutParams) ((C0867J0) this.f1229c.getLayoutParams())).topMargin;
        this.f1229c.layout(r102 - this.f1229c.getMeasuredWidth(), r84, r102, this.f1229c.getMeasuredHeight() + r84);
        int r113 = r102 - this.f1243q;
    L88:
        if (r153 == false) goto L90;
        r102 = Math.min(r211, r113);
    L90:
        r3 = r232;
        goto L104
    L87:
        r113 = r102;
        goto L88
    L84:
        r211 = r102;
        goto L85
    L80:
        r110 = 0;
        goto L81
    L91:
        if (r153 == false) goto L94;
        int r114 = this.f1242p;
    L95:
        int r115 = r114 - r11[0];
        r3 = Math.max(0, r115) + r232;
        r11[0] = Math.max(0, -r115);
        if (r132 == false) goto L98;
        C0867J0 r116 = (C0867J0) this.f1228b.getLayoutParams();
        int r213 = this.f1228b.getMeasuredWidth() + r3;
        int r45 = this.f1228b.getMeasuredHeight() + r83;
        this.f1228b.layout(r3, r83, r213, r45);
        int r214 = r213 + this.f1243q;
        r83 = r45 + ((ViewGroup.MarginLayoutParams) r116).bottomMargin;
    L99:
        if (r142 == false) goto L101;
        int r85 = r83 + ((ViewGroup.MarginLayoutParams) ((C0867J0) this.f1229c.getLayoutParams())).topMargin;
        int r117 = this.f1229c.getMeasuredWidth() + r3;
        this.f1229c.layout(r3, r85, r117, this.f1229c.getMeasuredHeight() + r85);
        int r118 = r117 + this.f1243q;
    L102:
        if (r153 == false) goto L104;
        r3 = Math.max(r214, r118);
        goto L104
    L101:
        r118 = r3;
        goto L102
    L98:
        r214 = r3;
        goto L99
    L94:
        r114 = 0;
        goto L95
    L66:
        if (r64 == 80) goto L74;
        int r65 = (((r5 - r8) - r9) - r2) / 2;
        r232 = r3;
        int r125 = ((ViewGroup.MarginLayoutParams) r44).topMargin + this.f1244r;
        if (r65 >= r125) goto L70;
        r65 = r125;
    L73:
        r83 = r8 + r65;
        goto L76
    L70:
        int r53 = (((r5 - r9) - r2) - r65) - r8;
        int r215 = ((ViewGroup.MarginLayoutParams) r44).bottomMargin;
        int r38 = this.f1245s;
        if (r53 >= (r215 + r38)) goto L73;
        r65 = Math.max(0, r65 - ((((ViewGroup.MarginLayoutParams) r77).bottomMargin + r38) - r53));
        goto L73
    L74:
        r232 = r3;
        r83 = (((r5 - r9) - ((ViewGroup.MarginLayoutParams) r77).bottomMargin) - this.f1245s) - r2;
        goto L76
    L60:
        if (this.f1229c.getMeasuredWidth() <= 0) goto L62;
    L61:
        r17 = r6;
        r153 = true;
        goto L63
    L57:
        if (this.f1228b.getMeasuredWidth() > 0) goto L61;
    L53:
        r76 = this.f1228b;
        goto L54
    L50:
        r43 = this.f1229c;
        goto L51
    L43:
        r162 = r4;
        goto L44
    L40:
        r222 = r7;
        r2 = 0;
        goto L41
    L14:
        r13 = m1149o(this.f1230d, r6, r123, r11);
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

    @Override // android.view.View
    public final void onMeasure(int r18, int r19) {
        boolean r02 = AbstractC0881Q0.f3149a;
        int r9 = 0;
        if (getLayoutDirection() != 1) goto L5;
        char r6 = 1;
        char r10 = 0;
    L7:
        if (m1153s(this.f1230d) == false) goto L9;
        m1152r(this.f1230d, r18, 0, r19, this.f1241o);
        int r1 = m1137j(this.f1230d) + this.f1230d.getMeasuredWidth();
        int r12 = Math.max(0, m1138k(this.f1230d) + this.f1230d.getMeasuredHeight());
        int r13 = View.combineMeasuredStates(0, this.f1230d.getMeasuredState());
    L11:
        if (m1153s(this.f1234h) == false) goto L13;
        m1152r(this.f1234h, r18, 0, r19, this.f1241o);
        r1 = m1137j(this.f1234h) + this.f1234h.getMeasuredWidth();
        r12 = Math.max(r12, m1138k(this.f1234h) + this.f1234h.getMeasuredHeight());
        r13 = View.combineMeasuredStates(r13, this.f1234h.getMeasuredState());
    L13:
        int r03 = getCurrentContentInsetStart();
        int r11 = Math.max(r03, r1);
        int r04 = Math.max(0, r03 - r1);
        int[] r14 = this.f1216F;
        r14[r6] = r04;
        if (m1153s(this.f1227a) == false) goto L16;
        m1152r(this.f1227a, r18, r11, r19, this.f1241o);
        int r15 = m1137j(this.f1227a) + this.f1227a.getMeasuredWidth();
        r12 = Math.max(r12, m1138k(this.f1227a) + this.f1227a.getMeasuredHeight());
        r13 = View.combineMeasuredStates(r13, this.f1227a.getMeasuredState());
    L17:
        int r05 = getCurrentContentInsetEnd();
        int r112 = r11 + Math.max(r05, r15);
        r14[r10] = Math.max(0, r05 - r15);
        if (m1153s(this.f1235i) == false) goto L21;
        r112 = r112 + m1151q(this.f1235i, r18, r112, r19, 0, r14);
        r12 = Math.max(r12, m1138k(this.f1235i) + this.f1235i.getMeasuredHeight());
        r13 = View.combineMeasuredStates(r13, this.f1235i.getMeasuredState());
    L21:
        if (m1153s(this.f1231e) == false) goto L23;
        r112 = r112 + m1151q(this.f1231e, r18, r112, r19, 0, r14);
        r12 = Math.max(r12, m1138k(this.f1231e) + this.f1231e.getMeasuredHeight());
        r13 = View.combineMeasuredStates(r13, this.f1231e.getMeasuredState());
    L23:
        int r102 = getChildCount();
        int r152 = 0;
    L24:
        if (r152 >= r102) goto L32;
        View r62 = getChildAt(r152);
        if (((C0867J0) r62.getLayoutParams()).f3112b != 0) goto L31;
        if (m1153s(r62) == false) goto L31;
        r112 = r112 + m1151q(r62, r18, r112, r19, 0, r14);
        r12 = Math.max(r12, m1138k(r62) + r62.getMeasuredHeight());
        r13 = View.combineMeasuredStates(r13, r62.getMeasuredState());
    L31:
        r152 = r152 + 1;
        goto L24
    L32:
        int r103 = this.f1244r + this.f1245s;
        int r153 = this.f1242p + this.f1243q;
        if (m1153s(this.f1228b) == false) goto L35;
        m1151q(this.f1228b, r18, r112 + r153, r19, r103, r14);
        int r16 = m1137j(this.f1228b) + this.f1228b.getMeasuredWidth();
        int r162 = m1138k(this.f1228b) + this.f1228b.getMeasuredHeight();
        int r63 = View.combineMeasuredStates(r13, this.f1228b.getMeasuredState());
        int r132 = r16;
    L37:
        if (m1153s(this.f1229c) == false) goto L41;
        r132 = Math.max(r132, m1151q(this.f1229c, r18, r112 + r153, r19, r162 + r103, r14));
        r162 = (m1138k(this.f1229c) + this.f1229c.getMeasuredHeight()) + r162;
        r63 = View.combineMeasuredStates(r63, this.f1229c.getMeasuredState());
    L41:
        int r06 = Math.max(r12, r162);
        int r2 = getPaddingRight() + getPaddingLeft();
        int r3 = (getPaddingBottom() + getPaddingTop()) + r06;
        int r07 = View.resolveSizeAndState(Math.max(r2 + (r112 + r132), getSuggestedMinimumWidth()), r18, (-16777216) & r63);
        int r17 = View.resolveSizeAndState(Math.max(r3, getSuggestedMinimumHeight()), r19, r63 << 16);
        if (this.f1222L == false) goto L52;
        int r22 = getChildCount();
        int r32 = 0;
    L45:
        if (r32 >= r22) goto L54;
        View r4 = getChildAt(r32);
        if (m1153s(r4) == false) goto L53;
        if (r4.getMeasuredWidth() <= 0) goto L53;
        if (r4.getMeasuredHeight() > 0) goto L52;
    L53:
        r32 = r32 + 1;
    L54:
        setMeasuredDimension(r07, r9);
        return;
    L52:
        r9 = r17;
        goto L54
    L35:
        r162 = 0;
        r63 = r13;
        r132 = 0;
        goto L37
    L16:
        r15 = 0;
        goto L17
    L9:
        r1 = 0;
        r12 = 0;
        r13 = 0;
        goto L11
    L5:
        r10 = 1;
        r6 = 0;
        goto L7
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r4) {
        if ((r4 instanceof C0871L0) == true) goto L6;
        super.onRestoreInstanceState(r4);
        return;
    L6:
        C0871L0 r42 = (C0871L0) r4;
        super.onRestoreInstanceState(r42.f481a);
        ActionMenuView r02 = this.f1227a;
        if (r02 == null) goto L9;
        MenuC0779j r03 = r02.f1141p;
    L10:
        int r1 = r42.f3120c;
        if (r1 == 0) goto L19;
        if (this.f1221K == null) goto L19;
        if (r03 == null) goto L19;
        MenuItem r04 = r03.findItem(r1);
        if (r04 == null) goto L19;
        r04.expandActionView();
    L19:
        if (r42.f3121d == false) goto L22;
        RunnableC0019E r43 = this.f1226P;
        removeCallbacks(r43);
        post(r43);
        return;
    L22:
        return;
    L9:
        r03 = null;
        goto L10
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
        super.onRtlPropertiesChanged(r3);
        m1142d();
        C0937x0 r02 = this.f1246t;
        boolean r1 = true;
        if (r3 == 1) goto L7;
        r1 = false;
    L7:
        if (r1 == r02.f3327g) goto L35;
        r02.f3327g = r1;
        if (r02.f3328h == true) goto L12;
        r02.f3321a = r02.f3325e;
        r02.f3322b = r02.f3326f;
        return;
    L12:
        if (r1 == false) goto L22;
        int r12 = r02.f3324d;
        if (r12 != Integer.MIN_VALUE) goto L17;
        r12 = r02.f3325e;
    L17:
        r02.f3321a = r12;
        int r13 = r02.f3323c;
        if (r13 != Integer.MIN_VALUE) goto L21;
        r13 = r02.f3326f;
    L21:
        r02.f3322b = r13;
        return;
    L22:
        int r14 = r02.f3323c;
        if (r14 != Integer.MIN_VALUE) goto L26;
        r14 = r02.f3325e;
    L26:
        r02.f3321a = r14;
        int r15 = r02.f3324d;
        if (r15 != Integer.MIN_VALUE) goto L30;
        r15 = r02.f3326f;
    L30:
        r02.f3322b = r15;
        return;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0871L0 r02 = new C0871L0(super.onSaveInstanceState());
        C0865I0 r1 = this.f1221K;
        if (r1 == null) goto L7;
        MenuItemC0780k r12 = r1.f3108b;
        if (r12 == null) goto L7;
        r02.f3120c = r12.f2807a;
    L7:
        ActionMenuView r13 = this.f1227a;
        if (r13 == null) goto L16;
        C0906i r14 = r13.f1144s;
        if (r14 == null) goto L16;
        C0900f r15 = r14.f3220r;
        if (r15 == null) goto L16;
        if (r15.m2027b() == false) goto L16;
        boolean r16 = true;
    L17:
        r02.f3121d = r16;
        return r02;
    L16:
        r16 = false;
        goto L17
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r5) {
        int r02 = r5.getActionMasked();
        if (r02 != 0) goto L6;
        this.f1212B = false;
    L6:
        if (this.f1212B == true) goto L11;
        boolean r52 = super.onTouchEvent(r5);
        if (r02 != 0) goto L11;
        if (r52 == true) goto L11;
        this.f1212B = true;
    L11:
        if (r02 != 1) goto L13;
    L14:
        this.f1212B = false;
    L15:
        return true;
    L13:
        if (r02 != 3) goto L15;
        goto L14
    }

    /* JADX INFO: renamed from: p */
    public final int m1150p(View r6, int r7, int r8, int[] r9) {
        C0867J0 r02 = (C0867J0) r6.getLayoutParams();
        int r1 = ((ViewGroup.MarginLayoutParams) r02).rightMargin - r9[1];
        int r72 = r7 - Math.max(0, r1);
        r9[1] = Math.max(0, -r1);
        int r82 = m1145i(r6, r8);
        int r92 = r6.getMeasuredWidth();
        r6.layout(r72 - r92, r82, r72, r6.getMeasuredHeight() + r82);
        return r72 - (r92 + ((ViewGroup.MarginLayoutParams) r02).leftMargin);
    }

    /* JADX INFO: renamed from: q */
    public final int m1151q(View r8, int r9, int r10, int r11, int r12, int[] r13) {
        ViewGroup.MarginLayoutParams r02 = (ViewGroup.MarginLayoutParams) r8.getLayoutParams();
        int r1 = r02.leftMargin - r13[0];
        int r3 = r02.rightMargin - r13[1];
        int r5 = Math.max(0, r1);
        int r6 = Math.max(0, r3) + r5;
        r13[0] = Math.max(0, -r1);
        r13[1] = Math.max(0, -r3);
        int r132 = getPaddingLeft();
        int r92 = ViewGroup.getChildMeasureSpec(r9, ((getPaddingRight() + r132) + r6) + r10, r02.width);
        int r102 = getPaddingTop();
        r8.measure(r92, ViewGroup.getChildMeasureSpec(r11, (((getPaddingBottom() + r102) + r02.topMargin) + r02.bottomMargin) + r12, r02.height));
        return r8.getMeasuredWidth() + r6;
    }

    /* JADX INFO: renamed from: r */
    public final void m1152r(View r4, int r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r02 = (ViewGroup.MarginLayoutParams) r4.getLayoutParams();
        int r1 = getPaddingLeft();
        int r52 = ViewGroup.getChildMeasureSpec(r5, (((getPaddingRight() + r1) + r02.leftMargin) + r02.rightMargin) + r6, r02.width);
        int r62 = getPaddingTop();
        int r63 = ViewGroup.getChildMeasureSpec(r7, ((getPaddingBottom() + r62) + r02.topMargin) + r02.bottomMargin, r02.height);
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

    /* JADX INFO: renamed from: s */
    public final boolean m1153s(View r2) {
        if (r2 != null) goto L4;
    L8:
        return false;
    L4:
        if (r2.getParent() != this) goto L8;
        if (r2.getVisibility() == 8) goto L8;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
        if (this.f1225O == r2) goto L6;
        this.f1225O = r2;
        m1154t();
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
        setCollapseIcon(AbstractC0358S.m916w(getContext(), r2));
    }

    public void setCollapsible(boolean r1) {
        this.f1222L = r1;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int r2) {
        if (r2 >= 0) goto L5;
        r2 = Integer.MIN_VALUE;
    L5:
        if (r2 == this.f1248v) goto L10;
        this.f1248v = r2;
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
        if (r2 == this.f1247u) goto L10;
        this.f1247u = r2;
        if (getNavigationIcon() == null) goto L11;
        requestLayout();
        return;
    L11:
        return;
    }

    public void setLogo(int r2) {
        setLogo(AbstractC0358S.m916w(getContext(), r2));
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
        setNavigationIcon(AbstractC0358S.m916w(getContext(), r2));
    }

    public void setNavigationOnClickListener(View.OnClickListener r2) {
        m1144f();
        this.f1230d.setOnClickListener(r2);
    }

    public void setOnMenuItemClickListener(InterfaceC0869K0 r1) {
    }

    public void setOverflowIcon(Drawable r2) {
        m1143e();
        this.f1227a.setOverflowIcon(r2);
    }

    public void setPopupTheme(int r3) {
        if (this.f1237k == r3) goto L9;
        this.f1237k = r3;
        if (r3 != 0) goto L7;
        this.f1236j = getContext();
        return;
    L7:
        this.f1236j = new ContextThemeWrapper(getContext(), r3);
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
        this.f1245s = r1;
        requestLayout();
    }

    public void setTitleMarginEnd(int r1) {
        this.f1243q = r1;
        requestLayout();
    }

    public void setTitleMarginStart(int r1) {
        this.f1242p = r1;
        requestLayout();
    }

    public void setTitleMarginTop(int r1) {
        this.f1244r = r1;
        requestLayout();
    }

    public void setTitleTextColor(int r1) {
        setTitleTextColor(ColorStateList.valueOf(r1));
    }

    /* JADX INFO: renamed from: t */
    public final void m1154t() {
        if (Build.VERSION.SDK_INT < 33) goto L27;
        OnBackInvokedDispatcher r02 = AbstractC0863H0.m2185a(this);
        C0865I0 r1 = this.f1221K;
        if (r1 != null) goto L7;
    L14:
        boolean r12 = false;
    L15:
        if (r12 == true) goto L17;
    L22:
        if (r12 == true) goto L29;
        OnBackInvokedDispatcher r03 = this.f1224N;
        if (r03 == null) goto L30;
        AbstractC0863H0.m2188d(r03, this.f1223M);
        this.f1224N = null;
        return;
    L30:
        return;
    L29:
        return;
    L17:
        if (this.f1224N != null) goto L22;
        if (this.f1223M != null) goto L21;
        this.f1223M = AbstractC0863H0.m2186b(new RunnableC0857E0(this, 0));
    L21:
        AbstractC0863H0.m2187c(r02, this.f1223M);
        this.f1224N = r02;
        return;
    L7:
        if (r1.f3108b == null) goto L14;
        if (r02 == null) goto L14;
        if (isAttachedToWindow() == false) goto L14;
        if (this.f1225O == false) goto L14;
        r12 = true;
        goto L15
    }

    public Toolbar(Context r10, AttributeSet r11, int r12) {
        super(r10, r11, C1031R.attr.toolbarStyle);
        this.f1249w = 8388627;
        this.f1214D = new ArrayList();
        this.f1215E = new ArrayList();
        this.f1216F = new int[2];
        this.f1217G = new C0095d(new RunnableC0857E0(this, 1));
        this.f1218H = new ArrayList();
        this.f1219I = new C0859F0(this);
        this.f1226P = new RunnableC0019E(10, this);
        Context r02 = getContext();
        int[] r2 = AbstractC0550a.f1635t;
        C0234d r8 = C0234d.m638s(r02, r11, r2, C1031R.attr.toolbarStyle, 0);
        AbstractC0080Q.m290i(this, r10, r2, r11, (TypedArray) r8.f475c, C1031R.attr.toolbarStyle);
        TypedArray r112 = (TypedArray) r8.f475c;
        this.f1238l = r112.getResourceId(28, 0);
        this.f1239m = r112.getResourceId(19, 0);
        this.f1249w = r112.getInteger(0, 8388627);
        this.f1240n = r112.getInteger(2, 48);
        int r102 = r112.getDimensionPixelOffset(22, 0);
        if (r112.hasValue(27) == false) goto L5;
        r102 = r112.getDimensionPixelOffset(27, r102);
    L5:
        this.f1245s = r102;
        this.f1244r = r102;
        this.f1243q = r102;
        this.f1242p = r102;
        int r103 = r112.getDimensionPixelOffset(25, -1);
        if (r103 < 0) goto L8;
        this.f1242p = r103;
    L8:
        int r104 = r112.getDimensionPixelOffset(24, -1);
        if (r104 < 0) goto L11;
        this.f1243q = r104;
    L11:
        int r105 = r112.getDimensionPixelOffset(26, -1);
        if (r105 < 0) goto L14;
        this.f1244r = r105;
    L14:
        int r106 = r112.getDimensionPixelOffset(23, -1);
        if (r106 < 0) goto L17;
        this.f1245s = r106;
    L17:
        this.f1241o = r112.getDimensionPixelSize(13, -1);
        int r107 = r112.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int r03 = r112.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int r1 = r112.getDimensionPixelSize(7, 0);
        int r22 = r112.getDimensionPixelSize(8, 0);
        m1142d();
        C0937x0 r3 = this.f1246t;
        r3.f3328h = false;
        if (r1 == Integer.MIN_VALUE) goto L20;
        r3.f3325e = r1;
        r3.f3321a = r1;
    L20:
        if (r22 == Integer.MIN_VALUE) goto L22;
        r3.f3326f = r22;
        r3.f3322b = r22;
    L22:
        if (r107 != Integer.MIN_VALUE) goto L24;
        if (r03 != Integer.MIN_VALUE) goto L24;
    L25:
        this.f1247u = r112.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1248v = r112.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1232f = r8.m646i(4);
        this.f1233g = r112.getText(3);
        CharSequence r108 = r112.getText(21);
        if (TextUtils.isEmpty(r108) == true) goto L28;
        setTitle(r108);
    L28:
        CharSequence r109 = r112.getText(18);
        if (TextUtils.isEmpty(r109) == true) goto L31;
        setSubtitle(r109);
    L31:
        this.f1236j = getContext();
        setPopupTheme(r112.getResourceId(17, 0));
        Drawable r1010 = r8.m646i(16);
        if (r1010 == null) goto L34;
        setNavigationIcon(r1010);
    L34:
        CharSequence r1011 = r112.getText(15);
        if (TextUtils.isEmpty(r1011) == true) goto L37;
        setNavigationContentDescription(r1011);
    L37:
        Drawable r1012 = r8.m646i(11);
        if (r1012 == null) goto L40;
        setLogo(r1012);
    L40:
        CharSequence r1013 = r112.getText(12);
        if (TextUtils.isEmpty(r1013) == true) goto L44;
        setLogoDescription(r1013);
    L44:
        if (r112.hasValue(29) == false) goto L47;
        setTitleTextColor(r8.m645h(29));
    L47:
        if (r112.hasValue(20) == false) goto L50;
        setSubtitleTextColor(r8.m645h(20));
    L50:
        if (r112.hasValue(14) == false) goto L52;
        mo1146l(r112.getResourceId(14, 0));
    L52:
        r8.m657u();
        return;
    L24:
        r3.m2272a(r107, r03);
        goto L25
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r5) {
        Context r1 = getContext();
        C0867J0 r02 = new C0867J0(r1, r5);
        r02.f3111a = 0;
        TypedArray r52 = r1.obtainStyledAttributes(r5, AbstractC0550a.f1617b);
        r02.f3111a = r52.getInt(0, 0);
        r52.recycle();
        r02.f3112b = 0;
        return r02;
    }

    public void setCollapseContentDescription(CharSequence r2) {
        if (TextUtils.isEmpty(r2) == true) goto L5;
        m1141c();
    L5:
        C0934w r02 = this.f1234h;
        if (r02 == null) goto L9;
        r02.setContentDescription(r2);
        return;
    }

    public void setCollapseIcon(Drawable r2) {
        if (r2 == null) goto L4;
        m1141c();
        this.f1234h.setImageDrawable(r2);
        return;
    L4:
        C0934w r22 = this.f1234h;
        if (r22 == null) goto L9;
        r22.setImageDrawable(this.f1232f);
        return;
    }

    public void setLogo(Drawable r4) {
        if (r4 != null) goto L4;
        C0936x r02 = this.f1231e;
        if (r02 != null) goto L12;
    L14:
        C0936x r03 = this.f1231e;
        if (r03 == null) goto L18;
        r03.setImageDrawable(r4);
        return;
    L18:
        return;
    L12:
        if (m1148n(r02) == false) goto L14;
        removeView(this.f1231e);
        this.f1215E.remove(this.f1231e);
        goto L14
    L4:
        if (this.f1231e != null) goto L7;
        this.f1231e = new C0936x(getContext(), 0);
    L7:
        if (m1148n(this.f1231e) == true) goto L14;
        m1140b(this.f1231e, true);
        goto L14
    }

    public void setLogoDescription(CharSequence r4) {
        if (TextUtils.isEmpty(r4) == false) goto L5;
    L7:
        C0936x r02 = this.f1231e;
        if (r02 == null) goto L11;
        r02.setContentDescription(r4);
        return;
    L11:
        return;
    L5:
        if (this.f1231e != null) goto L7;
        this.f1231e = new C0936x(getContext(), 0);
        goto L7
    }

    public void setNavigationContentDescription(CharSequence r2) {
        if (TextUtils.isEmpty(r2) == true) goto L5;
        m1144f();
    L5:
        C0934w r02 = this.f1230d;
        if (r02 == null) goto L9;
        r02.setContentDescription(r2);
        AbstractC0875N0.m2199a(this.f1230d, r2);
        return;
    }

    public void setNavigationIcon(Drawable r3) {
        if (r3 == null) goto L6;
        m1144f();
        if (m1148n(this.f1230d) == true) goto L11;
        m1140b(this.f1230d, true);
    L11:
        C0934w r02 = this.f1230d;
        if (r02 == null) goto L15;
        r02.setImageDrawable(r3);
        return;
    L15:
        return;
    L6:
        C0934w r03 = this.f1230d;
        if (r03 == null) goto L11;
        if (m1148n(r03) == false) goto L11;
        removeView(this.f1230d);
        this.f1215E.remove(this.f1230d);
        goto L11
    }

    public void setSubtitle(CharSequence r4) {
        if (TextUtils.isEmpty(r4) == false) goto L5;
        C0868K r02 = this.f1229c;
        if (r02 != null) goto L18;
    L20:
        C0868K r03 = this.f1229c;
        if (r03 == null) goto L23;
        r03.setText(r4);
    L23:
        this.f1251y = r4;
        return;
    L18:
        if (m1148n(r02) == false) goto L20;
        removeView(this.f1229c);
        this.f1215E.remove(this.f1229c);
        goto L20
    L5:
        if (this.f1229c != null) goto L13;
        Context r04 = getContext();
        C0868K r1 = new C0868K(r04, null);
        this.f1229c = r1;
        r1.setSingleLine();
        this.f1229c.setEllipsize(TextUtils.TruncateAt.END);
        int r12 = this.f1239m;
        if (r12 == 0) goto L9;
        this.f1229c.setTextAppearance(r04, r12);
    L9:
        ColorStateList r05 = this.f1211A;
        if (r05 == null) goto L13;
        this.f1229c.setTextColor(r05);
    L13:
        if (m1148n(this.f1229c) == true) goto L20;
        m1140b(this.f1229c, true);
        goto L20
    }

    public void setSubtitleTextColor(ColorStateList r2) {
        this.f1211A = r2;
        C0868K r02 = this.f1229c;
        if (r02 == null) goto L6;
        r02.setTextColor(r2);
        return;
    }

    public void setTitle(CharSequence r4) {
        if (TextUtils.isEmpty(r4) == false) goto L5;
        C0868K r02 = this.f1228b;
        if (r02 != null) goto L18;
    L20:
        C0868K r03 = this.f1228b;
        if (r03 == null) goto L23;
        r03.setText(r4);
    L23:
        this.f1250x = r4;
        return;
    L18:
        if (m1148n(r02) == false) goto L20;
        removeView(this.f1228b);
        this.f1215E.remove(this.f1228b);
        goto L20
    L5:
        if (this.f1228b != null) goto L13;
        Context r04 = getContext();
        C0868K r1 = new C0868K(r04, null);
        this.f1228b = r1;
        r1.setSingleLine();
        this.f1228b.setEllipsize(TextUtils.TruncateAt.END);
        int r12 = this.f1238l;
        if (r12 == 0) goto L9;
        this.f1228b.setTextAppearance(r04, r12);
    L9:
        ColorStateList r05 = this.f1252z;
        if (r05 == null) goto L13;
        this.f1228b.setTextColor(r05);
    L13:
        if (m1148n(this.f1228b) == true) goto L20;
        m1140b(this.f1228b, true);
        goto L20
    }

    public void setTitleTextColor(ColorStateList r2) {
        this.f1252z = r2;
        C0868K r02 = this.f1228b;
        if (r02 == null) goto L6;
        r02.setTextColor(r2);
        return;
    }
}
