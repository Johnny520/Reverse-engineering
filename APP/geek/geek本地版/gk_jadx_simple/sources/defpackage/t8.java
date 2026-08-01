package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends tu implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList g;
    public final ArrayList h;
    public final k4 i;
    public final q8 j;
    public final l0 k;
    public int l;
    public int m;
    public View n;
    public View o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public cv w;
    public ViewTreeObserver x;
    public PopupWindow.OnDismissListener y;
    public boolean z;

    public t8(Context r5, View r6, int r7, boolean r8) {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new k4(2, this);
        int r2 = 0;
        this.j = new q8(r2, this);
        this.k = new l0(5, this);
        this.l = 0;
        this.m = 0;
        this.b = r5;
        this.n = r6;
        this.d = r7;
        this.e = r8;
        this.u = false;
        WeakHashMap r72 = ja0.a;
        if (t90.d(r6) == 1) goto L6;
        r2 = 1;
    L6:
        this.p = r2;
        Resources r52 = r5.getResources();
        this.c = Math.max(r52.getDisplayMetrics().widthPixels / 2, r52.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // defpackage.dv
    public final void a(ku r8, boolean r9) {
        ArrayList r0 = this.h;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r8 == ((s8) r0.get(r3)).b) goto L9;
        r3 = r3 + 1;
    L9:
        if (r3 < 0) goto L43;
        int r12 = r3 + 1;
        if (r12 >= r0.size()) goto L14;
        ((s8) r0.get(r12)).b.c(false);
    L14:
        s8 r13 = (s8) r0.remove(r3);
        ku r32 = r13.b;
        bv r14 = r13.a;
        c4 r4 = r14.z;
        r32.r(this);
        if (this.z == false) goto L17;
        xu.b(r4, null);
        r4.setAnimationStyle(0);
    L17:
        r14.dismiss();
        int r15 = r0.size();
        if (r15 <= 0) goto L20;
        this.p = ((s8) r0.get(r15 - 1)).c;
    L25:
        if (r15 != 0) goto L37;
        dismiss();
        cv r92 = this.w;
        if (r92 == null) goto L29;
        r92.a(r8, true);
    L29:
        ViewTreeObserver r82 = this.x;
        if (r82 != null) goto L32;
    L35:
        this.o.removeOnAttachStateChangeListener(this.j);
        this.y.onDismiss();
        return;
    L32:
        if (r82.isAlive() == false) goto L34;
        this.x.removeGlobalOnLayoutListener(this.i);
    L34:
        this.x = null;
        goto L35
    L37:
        if (r9 == false) goto L42;
        ((s8) r0.get(0)).b.c(false);
        return;
    L42:
        return;
    L20:
        View r42 = this.n;
        WeakHashMap r6 = ja0.a;
        if (t90.d(r42) != 1) goto L23;
        int r43 = 0;
    L24:
        this.p = r43;
        goto L25
    L23:
        r43 = 1;
        goto L24
    L43:
        return;
    L8:
        r3 = -1;
        goto L9
    }

    @Override // defpackage.r30
    public final boolean b() {
        ArrayList r0 = this.h;
        if (r0.size() > 0) goto L5;
    L8:
        return false;
    L5:
        if (((s8) r0.get(0)).a.z.isShowing() == false) goto L8;
        return true;
    }

    @Override // defpackage.dv
    public final boolean c() {
        return false;
    }

    @Override // defpackage.r30
    public final void dismiss() {
        ArrayList r0 = this.h;
        int r1 = r0.size();
        if (r1 <= 0) goto L10;
        s8[] r02 = (s8[]) r0.toArray(new s8[r1]);
        int r12 = r1 - 1;
    L5:
        if (r12 < 0) goto L14;
        s8 r2 = r02[r12];
        if (r2.a.z.isShowing() == false) goto L9;
        r2.a.dismiss();
    L9:
        r12 = r12 - 1;
        goto L5
    L14:
        return;
    }

    @Override // defpackage.dv
    public final void e(cv r1) {
        this.w = r1;
    }

    @Override // defpackage.r30
    public final void f() {
        if (b() == true) goto L20;
        ArrayList r0 = this.g;
        int r1 = r0.size();
        boolean r2 = false;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L8;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        u((ku) r4);
        goto L6
    L8:
        r0.clear();
        View r02 = this.n;
        this.o = r02;
        if (r02 != null) goto L11;
        return;
    L11:
        if (this.x != null) goto L13;
        r2 = true;
    L13:
        ViewTreeObserver r03 = r02.getViewTreeObserver();
        this.x = r03;
        if (r2 == false) goto L16;
        r03.addOnGlobalLayoutListener(this.i);
    L16:
        this.o.addOnAttachStateChangeListener(this.j);
        return;
    }

    @Override // defpackage.dv
    public final void h() {
        ArrayList r0 = this.h;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ListAdapter r32 = ((s8) r3).a.c.getAdapter();
        if ((r32 instanceof HeaderViewListAdapter) == false) goto L8;
        r32 = ((HeaderViewListAdapter) r32).getWrappedAdapter();
    L8:
        ((hu) r32).notifyDataSetChanged();
        goto L3
    }

    @Override // defpackage.r30
    public final kh j() {
        ArrayList r0 = this.h;
        if (r0.isEmpty() == false) goto L7;
        return null;
    L7:
        return ((s8) r0.get(r0.size() - 1)).a.c;
    }

    @Override // defpackage.dv
    public final boolean k(c50 r8) {
        ArrayList r0 = this.h;
        int r1 = r0.size();
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L10;
        Object r5 = r0.get(r3);
        r3 = r3 + 1;
        s8 r52 = (s8) r5;
        if (r8 != r52.b) goto L4;
        r52.a.c.requestFocus();
        return true;
    L10:
        if (r8.hasVisibleItems() == false) goto L15;
        l(r8);
        cv r02 = this.w;
        if (r02 == null) goto L14;
        r02.q(r8);
    L14:
        return true;
    L15:
        return false;
    }

    @Override // defpackage.tu
    public final void l(ku r2) {
        r2.b(this, this.b);
        if (b() == false) goto L6;
        u(r2);
        return;
    L6:
        this.g.add(r2);
    }

    @Override // defpackage.tu
    public final void n(View r3) {
        if (this.n == r3) goto L6;
        this.n = r3;
        int r0 = this.l;
        WeakHashMap r1 = ja0.a;
        this.m = Gravity.getAbsoluteGravity(r0, t90.d(r3));
        return;
    }

    @Override // defpackage.tu
    public final void o(boolean r1) {
        this.u = r1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ArrayList r0 = this.h;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        s8 r4 = (s8) r0.get(r3);
        if (r4.a.z.isShowing() == false) goto L9;
        r3 = r3 + 1;
    L9:
        if (r4 == null) goto L14;
        r4.b.c(false);
        return;
    L14:
        return;
    L8:
        r4 = null;
        goto L9
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View r1, int r2, KeyEvent r3) {
        if (r3.getAction() == 1) goto L5;
        return false;
    L5:
        if (r2 != 82) goto L10;
        dismiss();
        return true;
    L10:
        return false;
    }

    @Override // defpackage.tu
    public final void p(int r3) {
        if (this.l == r3) goto L6;
        this.l = r3;
        View r0 = this.n;
        WeakHashMap r1 = ja0.a;
        this.m = Gravity.getAbsoluteGravity(r3, t90.d(r0));
        return;
    }

    @Override // defpackage.tu
    public final void q(int r2) {
        this.q = true;
        this.s = r2;
    }

    @Override // defpackage.tu
    public final void r(PopupWindow.OnDismissListener r1) {
        this.y = r1;
    }

    @Override // defpackage.tu
    public final void s(boolean r1) {
        this.v = r1;
    }

    @Override // defpackage.tu
    public final void t(int r2) {
        this.r = true;
        this.t = r2;
    }

    public final void u(ku r18) {
        Context r2 = this.b;
        LayoutInflater r3 = LayoutInflater.from(r2);
        hu r4 = new hu(r18, r3, this.e, R.layout.abc_cascading_menu_item_layout);
        if (b() == true) goto L8;
        if (this.u == false) goto L8;
        r4.c = true;
    L19:
        int r5 = tu.m(r4, r2, this.c);
        bv r8 = new bv(r2, null, this.d, 0);
        r8.C = this.k;
        r8.p = this;
        r8.z.setOnDismissListener(this);
        r8.o = this.n;
        r8.l = this.m;
        r8.y = true;
        r8.z.setFocusable(true);
        r8.z.setInputMethodMode(2);
        r8.n(r4);
        r8.q(r5);
        r8.l = this.m;
        ArrayList r22 = this.h;
        if (r22.size() <= 0) goto L52;
        s8 r42 = (s8) r22.get(r22.size() - 1);
        ku r11 = r42.b;
        int r12 = r11.f.size();
        int r13 = 0;
    L22:
        if (r13 >= r12) goto L29;
        MenuItem r14 = r11.getItem(r13);
        if (r14.hasSubMenu() == false) goto L28;
        if (r18 != r14.getSubMenu()) goto L28;
    L30:
        if (r14 != null) goto L32;
        int r16 = 1;
        View r7 = null;
    L54:
        if (r7 == null) goto L85;
        int r9 = Build.VERSION.SDK_INT;
        c4 r112 = r8.z;
        if (r9 > 28) goto L62;
        Method r92 = bv.D;
        if (r92 != null) goto L103;
    L63:
        xu.a(r8.z, null);
        kh r93 = ((s8) r22.get(r22.size() - 1)).a.c;
        int[] r10 = new int[2];
        r93.getLocationOnScreen(r10);
        Rect r113 = new Rect();
        this.o.getWindowVisibleDisplayFrame(r113);
        if (this.p != r16) goto L70;
        if (((r93.getWidth() + r10[0]) + r5) <= r113.right) goto L68;
    L67:
        int r132 = 0;
        int r94 = 1;
    L72:
        if (r132 != r94) goto L74;
        boolean r95 = true;
    L75:
        this.p = r132;
        r8.o = r7;
        if ((this.m & 5) != 5) goto L80;
        if (r95 == true) goto L83;
        r5 = 0 - r7.getWidth();
    L83:
        r8.f = r5;
        r8.k = true;
        r8.j = true;
        r8.m(0);
    L95:
        r22.add(new s8(r8, r18, this.p));
        r8.f();
        kh r23 = r8.c;
        r23.setOnKeyListener(this);
        if (r42 == null) goto L98;
        return;
    L98:
        if (this.v == true) goto L100;
        return;
    L100:
        if (r18.m == null) goto L117;
        FrameLayout r32 = (FrameLayout) r3.inflate(R.layout.abc_popup_menu_header_item_layout, r23, false);
        TextView r43 = (TextView) r32.findViewById(android.R.id.title);
        r32.setEnabled(false);
        r43.setText(r18.m);
        r23.addHeaderView(r32, null, false);
        r8.f();
        return;
    L117:
        return;
    L80:
        if (r95 == false) goto L82;
        r5 = r7.getWidth();
        goto L83
    L82:
        r5 = 0 - r5;
        goto L83
    L74:
        r95 = false;
    L68:
        r94 = 1;
        r132 = 1;
        goto L72
    L70:
        if ((r10[0] - r5) >= 0) goto L67;
    L103:
        r92.invoke(r112, new Object[]{Boolean.FALSE});     // Catch: Exception -> L61
    L61:
        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
        goto L63
    L62:
        yu.a(r112, false);
        goto L63
    L85:
        if (this.q == false) goto L88;
        r8.f = this.s;
    L88:
        if (this.r == false) goto L90;
        r8.m(this.t);
    L90:
        Rect r52 = this.a;
        if (r52 == null) goto L93;
        Rect r102 = new Rect(r52);
    L94:
        r8.x = r102;
        goto L95
    L93:
        r102 = null;
        goto L94
    L32:
        kh r114 = r42.a.c;
        ListAdapter r122 = r114.getAdapter();
        if ((r122 instanceof HeaderViewListAdapter) == false) goto L35;
        HeaderViewListAdapter r123 = (HeaderViewListAdapter) r122;
        int r133 = r123.getHeadersCount();
        hu r124 = (hu) r123.getWrappedAdapter();
    L36:
        int r15 = r124.getCount();
        r16 = 1;
        int r72 = 0;
    L38:
        if (r72 >= r15) goto L43;
        if (r14 == r124.b(r72)) goto L44;
        r72 = r72 + 1;
    L44:
        if (r72 == (-1)) goto L53;
        int r73 = (r72 + r133) - r114.getFirstVisiblePosition();
        if (r73 < 0) goto L53;
        if (r73 >= r114.getChildCount()) goto L53;
        r7 = r114.getChildAt(r73);
    L53:
        r7 = null;
        goto L54
    L43:
        r72 = -1;
        goto L44
    L35:
        r124 = (hu) r122;
        r133 = 0;
    L28:
        r13 = r13 + 1;
        goto L22
    L29:
        r14 = null;
        goto L30
    L52:
        r16 = 1;
        r42 = null;
    L8:
        if (b() == false) goto L19;
        int r53 = r18.f.size();
        int r82 = 0;
    L10:
        if (r82 >= r53) goto L17;
        MenuItem r96 = r18.getItem(r82);
        if (r96.isVisible() == false) goto L16;
        if (r96.getIcon() == null) goto L16;
        boolean r54 = true;
    L18:
        r4.c = r54;
    L16:
        r82 = r82 + 1;
        goto L10
    L17:
        r54 = false;
        goto L18
    }
}
