package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements dv {
    public final Context a;
    public Context b;
    public ku c;
    public final LayoutInflater d;
    public cv e;
    public final int f;
    public final int g;
    public fv h;
    public i1 i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final SparseBooleanArray r;
    public f1 s;
    public f1 t;
    public h1 u;
    public g1 v;
    public final l0 w;

    public j1(Context r2) {
        this.a = r2;
        this.d = LayoutInflater.from(r2);
        this.f = R.layout.abc_action_menu_layout;
        this.g = R.layout.abc_action_menu_item_layout;
        this.r = new SparseBooleanArray();
        this.w = new l0(1, this);
    }

    @Override // defpackage.dv
    public final void a(ku r3, boolean r4) {
        f();
        f1 r0 = this.t;
        if (r0 != null) goto L5;
    L7:
        cv r02 = this.e;
        if (r02 == null) goto L11;
        r02.a(r3, r4);
        return;
    L11:
        return;
    L5:
        if (r0.b() == false) goto L7;
        r0.i.dismiss();
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(ou r4, View r5, ViewGroup r6) {
        View r0 = r4.getActionView();
        int r1 = 0;
        if (r0 == null) goto L7;
        if (r4.e() == true) goto L7;
    L15:
        if (r4.C == false) goto L17;
        r1 = 8;
    L17:
        r0.setVisibility(r1);
        ViewGroup.LayoutParams r42 = r0.getLayoutParams();
        ((ActionMenuView) r6).getClass();
        if ((r42 instanceof l1) == true) goto L20;
        r0.setLayoutParams(ActionMenuView.k(r42));
    L20:
        return r0;
    L7:
        if ((r5 instanceof ev) == false) goto L9;
        ev r52 = (ev) r5;
    L10:
        r52.c(r4);
        ActionMenuItemView r2 = (ActionMenuItemView) r52;
        r2.setItemInvoker((ActionMenuView) this.h);
        if (this.v != null) goto L13;
        this.v = new g1(this);
    L13:
        r2.setPopupCallback(this.v);
        r0 = (View) r52;
        goto L15
    L9:
        r52 = (ev) this.d.inflate(this.g, r6, false);
        goto L10
    }

    @Override // defpackage.dv
    public final boolean c() {
        j1 r0 = this;
        ku r1 = r0.c;
        if (r1 == null) goto L5;
        ArrayList r12 = r1.l();
        int r4 = r12.size();
    L6:
        int r5 = r0.p;
        int r6 = r0.o;
        int r7 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup r8 = (ViewGroup) r0.h;
        int r9 = 0;
        boolean r10 = false;
        int r11 = 0;
        int r122 = 0;
    L7:
        int r13 = 2;
        boolean r14 = true;
        if (r9 >= r4) goto L23;
        ou r15 = (ou) r12.get(r9);
        int r3 = r15.y;
        if ((r3 & 2) != 2) goto L13;
        r11 = r11 + 1;
    L17:
        if (r0.q == false) goto L21;
        if (r15.C == false) goto L21;
        r5 = 0;
    L21:
        r9 = r9 + 1;
        goto L7
    L13:
        if ((r3 & 1) != 1) goto L15;
        r122 = r122 + 1;
        goto L17
    L15:
        r10 = true;
        goto L17
    L23:
        if (r0.l == false) goto L28;
        if (r10 == false) goto L26;
    L27:
        r5 = r5 - 1;
        goto L28
    L26:
        if ((r122 + r11) > r5) goto L27;
    L28:
        int r52 = r5 - r11;
        SparseBooleanArray r2 = r0.r;
        r2.clear();
        int r32 = 0;
        int r92 = 0;
    L29:
        if (r32 >= r4) goto L80;
        ou r102 = (ou) r12.get(r32);
        int r112 = r102.y;
        if ((r112 & 2) != r13) goto L33;
        boolean r123 = r14;
    L34:
        int r152 = r102.b;
        if (r123 == false) goto L44;
        View r113 = r0.b(r102, null, r8);
        r113.measure(r7, r7);
        int r114 = r113.getMeasuredWidth();
        r6 = r6 - r114;
        if (r92 != 0) goto L39;
        r92 = r114;
    L39:
        if (r152 == 0) goto L41;
        r2.put(r152, r14);
    L41:
        r102.f(r14);
    L78:
        r32 = r32 + 1;
        r13 = 2;
        r0 = this;
        r14 = true;
        goto L29
    L44:
        if ((r112 & 1) != r14) goto L77;
        boolean r115 = r2.get(r152);
        if (r52 > 0) goto L48;
        if (r115 == true) goto L48;
    L50:
        boolean r124 = false;
    L52:
        if (r124 == false) goto L61;
        View r142 = r0.b(r102, null, r8);
        r142.measure(r7, r7);
        int r143 = r142.getMeasuredWidth();
        r6 = r6 - r143;
        if (r92 != 0) goto L57;
        r92 = r143;
    L57:
        if ((r6 + r92) <= 0) goto L59;
        boolean r144 = true;
    L60:
        r124 = r124 & r144;
        goto L61
    L59:
        r144 = false;
    L61:
        if (r124 == false) goto L64;
        if (r152 == 0) goto L64;
        r2.put(r152, true);
    L74:
        if (r124 == false) goto L76;
        r52 = r52 - 1;
    L76:
        r102.f(r124);
    L64:
        if (r115 == false) goto L74;
        r2.put(r152, false);
        int r116 = 0;
    L66:
        if (r116 >= r32) goto L74;
        ou r145 = (ou) r12.get(r116);
        if (r145.b != r152) goto L73;
        if ((r145.x & 32) != 32) goto L72;
        r52 = r52 + 1;
    L72:
        r145.f(false);
    L73:
        r116 = r116 + 1;
    L48:
        if (r6 <= 0) goto L50;
        r124 = r14;
        goto L52
    L77:
        r102.f(false);
        goto L78
    L33:
        r123 = false;
        goto L34
    L80:
        return r14;
    L5:
        r4 = 0;
        r12 = null;
        goto L6
    }

    @Override // defpackage.dv
    public final boolean d(ou r1) {
        return false;
    }

    @Override // defpackage.dv
    public final void e(cv r1) {
        throw null;
    }

    public final boolean f() {
        h1 r0 = this.u;
        if (r0 == null) goto L8;
        Object r2 = this.h;
        if (r2 == null) goto L8;
        ((View) r2).removeCallbacks(r0);
        this.u = null;
        return true;
    L8:
        f1 r02 = this.s;
        if (r02 != null) goto L11;
        return false;
    L11:
        if (r02.b() == false) goto L13;
        r02.i.dismiss();
    L13:
        return true;
    }

    @Override // defpackage.dv
    public final boolean g(ou r1) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dv
    public final void h() {
        ViewGroup r0 = (ViewGroup) this.h;
        ArrayList r1 = null;
        boolean r2 = false;
        if (r0 == null) goto L32;
        ku r3 = this.c;
        if (r3 == null) goto L25;
        r3.i();
        ArrayList r32 = this.c.l();
        int r4 = r32.size();
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r5 >= r4) goto L27;
        ou r7 = (ou) r32.get(r5);
        if ((r7.x & 32) != 32) goto L24;
        View r8 = r0.getChildAt(r6);
        if ((r8 instanceof ev) == false) goto L14;
        ou r9 = ((ev) r8).getItemData();
    L15:
        View r10 = b(r7, r8, r0);
        if (r7 == r9) goto L18;
        r10.setPressed(false);
        r10.jumpDrawablesToCurrentState();
    L18:
        if (r10 == r8) goto L23;
        ViewGroup r72 = (ViewGroup) r10.getParent();
        if (r72 == null) goto L22;
        r72.removeView(r10);
    L22:
        ((ViewGroup) this.h).addView(r10, r6);
    L23:
        r6 = r6 + 1;
        goto L24
    L14:
        r9 = null;
    L24:
        r5 = r5 + 1;
    L27:
        if (r6 >= r0.getChildCount()) goto L32;
        if (r0.getChildAt(r6) == this.i) goto L30;
        r0.removeViewAt(r6);
        goto L27
    L30:
        r6 = r6 + 1;
        goto L27
    L25:
        r6 = 0;
    L32:
        ((View) this.h).requestLayout();
        ku r02 = this.c;
        if (r02 == null) goto L37;
        r02.i();
        ArrayList r03 = r02.i;
        int r33 = r03.size();
        int r42 = 0;
    L35:
        if (r42 >= r33) goto L37;
        pu r52 = ((ou) r03.get(r42)).A;
        r42 = r42 + 1;
    L37:
        ku r04 = this.c;
        if (r04 == null) goto L41;
        r04.i();
        r1 = r04.j;
    L41:
        if (this.l == false) goto L48;
        if (r1 == null) goto L48;
        int r05 = r1.size();
        if (r05 != 1) goto L46;
        r2 = !((ou) r1.get(0)).C;
        goto L48
    L46:
        if (r05 <= 0) goto L48;
        r2 = true;
    L48:
        if (r2 == true) goto L50;
        i1 r06 = this.i;
        if (r06 == null) goto L62;
        Object r07 = r06.getParent();
        Object r12 = this.h;
        if (r07 != r12) goto L62;
        ((ViewGroup) r12).removeView(this.i);
    L62:
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
        return;
    L50:
        if (this.i != null) goto L52;
        this.i = new i1(this, this.a);
    L52:
        ViewGroup r08 = (ViewGroup) this.i.getParent();
        if (r08 == this.h) goto L62;
        if (r08 == null) goto L56;
        r08.removeView(this.i);
    L56:
        ActionMenuView r09 = (ActionMenuView) this.h;
        i1 r13 = this.i;
        r09.getClass();
        l1 r22 = ActionMenuView.j();
        r22.a = true;
        r09.addView(r13, r22);
        goto L62
    }

    @Override // defpackage.dv
    public final void i(Context r5, ku r6) {
        this.b = r5;
        LayoutInflater.from(r5);
        this.c = r6;
        Resources r62 = r5.getResources();
        if (this.m == true) goto L5;
        this.l = true;
    L5:
        int r1 = 2;
        this.n = r5.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration r52 = r5.getResources().getConfiguration();
        int r0 = r52.screenWidthDp;
        int r2 = r52.screenHeightDp;
        if (r52.smallestScreenWidthDp > 600) goto L26;
        if (r0 > 600) goto L26;
        if (r0 <= 960) goto L11;
        if (r2 > 720) goto L26;
    L11:
        if (r0 <= 720) goto L15;
        if (r2 > 960) goto L26;
    L15:
        if (r0 < 500) goto L17;
    L25:
        r1 = 4;
    L27:
        this.p = r1;
        int r53 = this.n;
        if (this.l == true) goto L30;
        this.i = null;
    L37:
        this.o = r53;
        float r54 = r62.getDisplayMetrics().density;
        return;
    L30:
        if (this.i != null) goto L35;
        i1 r02 = new i1(this, this.a);
        this.i = r02;
        if (this.k == false) goto L34;
        r02.setImageDrawable(this.j);
        this.j = null;
        this.k = false;
    L34:
        int r03 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.i.measure(r03, r03);
    L35:
        r53 = r53 - this.i.getMeasuredWidth();
        goto L37
    L17:
        if (r0 <= 640) goto L19;
        if (r2 > 480) goto L25;
    L19:
        if (r0 <= 480) goto L23;
        if (r2 > 640) goto L25;
    L23:
        if (r0 < 360) goto L27;
        r1 = 3;
    L26:
        r1 = 5;
        goto L27
    }

    public final boolean j() {
        f1 r0 = this.s;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.b() == false) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dv
    public final boolean k(c50 r9) {
        if (r9.hasVisibleItems() == false) goto L21;
        c50 r0 = r9;
    L6:
        ku r2 = r0.z;
        if (r2 == this.c) goto L9;
        r0 = (c50) r2;
        goto L6
    L9:
        ou r02 = r0.A;
        ViewGroup r22 = (ViewGroup) this.h;
        View r3 = null;
        r3 = null;
        if (r22 == null) goto L20;
        int r4 = r22.getChildCount();
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L20;
        View r6 = r22.getChildAt(r5);
        if ((r6 instanceof ev) == false) goto L19;
        if (((ev) r6).getItemData() != r02) goto L19;
        r3 = r6;
    L19:
        r5 = r5 + 1;
    L20:
        if (r3 == null) goto L21;
        r9.A.getClass();
        int r03 = r9.f.size();
        int r23 = 0;
    L24:
        if (r23 >= r03) goto L31;
        MenuItem r52 = r9.getItem(r23);
        if (r52.isVisible() == false) goto L30;
        if (r52.getIcon() == null) goto L30;
        boolean r04 = true;
    L32:
        f1 r24 = new f1(this, this.b, r9, r3);
        this.t = r24;
        r24.g = r04;
        tu r25 = r24.i;
        if (r25 == null) goto L35;
        r25.o(r04);
    L35:
        f1 r05 = this.t;
        if (r05.b() == false) goto L39;
    L41:
        cv r06 = this.e;
        if (r06 == null) goto L44;
        r06.q(r9);
    L44:
        return true;
    L39:
        if (r05.e == null) goto L46;
        r05.d(0, 0, false, false);
        goto L41
    L46:
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    L30:
        r23 = r23 + 1;
        goto L24
    L31:
        r04 = false;
    L21:
        return false;
    }

    public final boolean l() {
        if (this.l == true) goto L5;
        return false;
    L5:
        if (j() == true) goto L18;
        ku r0 = this.c;
        if (r0 != null) goto L9;
        return false;
    L9:
        if (this.h != null) goto L11;
        return false;
    L11:
        if (this.u != null) goto L21;
        r0.i();
        if (r0.j.isEmpty() == true) goto L22;
        f1 r02 = new f1(this, this.b, this.c, this.i);
        h1 r1 = new h1(this, 0, r02);
        this.u = r1;
        ((View) this.h).post(r1);
        return true;
    L22:
        return false;
    L21:
        return false;
    L18:
        return false;
    }
}
