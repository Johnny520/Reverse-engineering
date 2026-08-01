package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q40 extends tu implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final ku c;
    public final hu d;
    public final boolean e;
    public final int f;
    public final int g;
    public final bv h;
    public final k4 i;
    public final q8 j;
    public PopupWindow.OnDismissListener k;
    public View l;
    public View m;
    public cv n;
    public ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;

    public q40(Context r5, ku r6, View r7, int r8, boolean r9) {
        this.i = new k4(3, this);
        this.j = new q8(2, this);
        this.s = 0;
        this.b = r5;
        this.c = r6;
        this.e = r9;
        this.d = new hu(r6, LayoutInflater.from(r5), r9, R.layout.abc_popup_menu_item_layout);
        this.g = r8;
        Resources r92 = r5.getResources();
        this.f = Math.max(r92.getDisplayMetrics().widthPixels / 2, r92.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = r7;
        this.h = new bv(r5, null, r8, 0);
        r6.b(this, r5);
    }

    @Override // defpackage.dv
    public final void a(ku r2, boolean r3) {
        if (r2 != this.c) goto L10;
        dismiss();
        cv r0 = this.n;
        if (r0 == null) goto L9;
        r0.a(r2, r3);
        return;
    L9:
        return;
    }

    @Override // defpackage.r30
    public final boolean b() {
        if (this.p == false) goto L5;
        return false;
    L5:
        if (this.h.z.isShowing() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.dv
    public final boolean c() {
        return false;
    }

    @Override // defpackage.r30
    public final void dismiss() {
        if (b() == false) goto L6;
        this.h.dismiss();
        return;
    }

    @Override // defpackage.dv
    public final void e(cv r1) {
        this.n = r1;
    }

    @Override // defpackage.r30
    public final void f() {
        if (b() == false) goto L6;
        return;
    L6:
        if (this.p == true) goto L34;
        View r0 = this.l;
        if (r0 == null) goto L34;
        this.m = r0;
        bv r02 = this.h;
        c4 r1 = r02.z;
        c4 r2 = r02.z;
        r1.setOnDismissListener(this);
        r02.p = this;
        r02.y = true;
        r2.setFocusable(true);
        View r3 = this.m;
        if (this.o != null) goto L12;
        boolean r4 = true;
    L13:
        ViewTreeObserver r6 = r3.getViewTreeObserver();
        this.o = r6;
        if (r4 == false) goto L16;
        r6.addOnGlobalLayoutListener(this.i);
    L16:
        r3.addOnAttachStateChangeListener(this.j);
        r02.o = r3;
        r02.l = this.s;
        boolean r32 = this.q;
        Context r42 = this.b;
        hu r62 = this.d;
        if (r32 == true) goto L19;
        this.r = tu.m(r62, r42, this.f);
        this.q = true;
    L19:
        r02.q(this.r);
        r2.setInputMethodMode(2);
        Rect r12 = this.a;
        if (r12 == null) goto L22;
        Rect r33 = new Rect(r12);
    L23:
        r02.x = r33;
        r02.f();
        kh r13 = r02.c;
        r13.setOnKeyListener(this);
        if (this.t == false) goto L31;
        ku r34 = this.c;
        if (r34.m == null) goto L31;
        FrameLayout r43 = (FrameLayout) LayoutInflater.from(r42).inflate(R.layout.abc_popup_menu_header_item_layout, r13, false);
        TextView r7 = (TextView) r43.findViewById(android.R.id.title);
        if (r7 == null) goto L30;
        r7.setText(r34.m);
    L30:
        r43.setEnabled(false);
        r13.addHeaderView(r43, null, false);
    L31:
        r02.n(r62);
        r02.f();
        return;
    L22:
        r33 = null;
        goto L23
    L12:
        r4 = false;
    L34:
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.dv
    public final void h() {
        this.q = false;
        hu r0 = this.d;
        if (r0 == null) goto L6;
        r0.notifyDataSetChanged();
        return;
    }

    @Override // defpackage.r30
    public final kh j() {
        return this.h.c;
    }

    @Override // defpackage.dv
    public final boolean k(c50 r10) {
        if (r10.hasVisibleItems() == false) goto L34;
        wu r2 = new wu(this.b, r10, this.m, this.e, this.g, 0);
        cv r102 = this.n;
        r2.h = r102;
        tu r0 = r2.i;
        if (r0 == null) goto L7;
        r0.e(r102);
    L7:
        int r103 = r10.f.size();
        int r02 = 0;
    L9:
        if (r02 >= r103) goto L16;
        MenuItem r5 = r10.getItem(r02);
        if (r5.isVisible() == false) goto L15;
        if (r5.getIcon() == null) goto L15;
        boolean r104 = true;
    L17:
        r2.g = r104;
        tu r03 = r2.i;
        if (r03 == null) goto L20;
        r03.o(r104);
    L20:
        r2.j = this.k;
        this.k = null;
        this.c.c(false);
        bv r105 = this.h;
        int r04 = r105.f;
        int r106 = r105.g();
        int r52 = this.s;
        View r6 = this.l;
        WeakHashMap r7 = ja0.a;
        if ((Gravity.getAbsoluteGravity(r52, t90.d(r6)) & 7) != 5) goto L24;
        r04 = r04 + this.l.getWidth();
    L24:
        if (r2.b() == false) goto L27;
    L30:
        cv r107 = this.n;
        if (r107 == null) goto L33;
        r107.q(r10);
    L33:
        return true;
    L27:
        if (r2.e == null) goto L34;
        r2.d(r04, r106, true, true);
    L15:
        r02 = r02 + 1;
        goto L9
    L16:
        r104 = false;
    L34:
        return false;
    }

    @Override // defpackage.tu
    public final void n(View r1) {
        this.l = r1;
    }

    @Override // defpackage.tu
    public final void o(boolean r2) {
        this.d.c = r2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.c.c(true);
        ViewTreeObserver r0 = this.o;
        if (r0 != null) goto L5;
    L8:
        this.m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener r02 = this.k;
        if (r02 == null) goto L12;
        r02.onDismiss();
        return;
    L12:
        return;
    L5:
        if (r0.isAlive() == true) goto L7;
        this.o = this.m.getViewTreeObserver();
    L7:
        this.o.removeGlobalOnLayoutListener(this.i);
        this.o = null;
        goto L8
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
    public final void p(int r1) {
        this.s = r1;
    }

    @Override // defpackage.tu
    public final void q(int r2) {
        this.h.f = r2;
    }

    @Override // defpackage.tu
    public final void r(PopupWindow.OnDismissListener r1) {
        this.k = r1;
    }

    @Override // defpackage.tu
    public final void s(boolean r1) {
        this.t = r1;
    }

    @Override // defpackage.tu
    public final void t(int r2) {
        this.h.m(r2);
    }

    @Override // defpackage.tu
    public final void l(ku r1) {
    }
}
