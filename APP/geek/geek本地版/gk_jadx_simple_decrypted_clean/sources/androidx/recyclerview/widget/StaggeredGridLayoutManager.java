package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ai;
import defpackage.bn;
import defpackage.d4;
import defpackage.dq;
import defpackage.i0;
import defpackage.j0;
import defpackage.j40;
import defpackage.ja0;
import defpackage.k40;
import defpackage.l40;
import defpackage.m40;
import defpackage.mz;
import defpackage.n40;
import defpackage.nz;
import defpackage.oz;
import defpackage.s90;
import defpackage.tz;
import defpackage.xz;
import defpackage.y6;
import defpackage.yq;
import defpackage.yz;
import defpackage.zt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends nz implements xz {
    public int A;
    public final d4 B;
    public final int C;
    public boolean D;
    public boolean E;
    public m40 F;
    public final Rect G;
    public final j40 H;
    public final boolean I;
    public int[] J;
    public final y6 K;
    public final int p;
    public final n40[] q;
    public final ai r;
    public final ai s;
    public final int t;
    public int u;
    public final dq v;
    public boolean w;
    public boolean x;
    public final BitSet y;
    public int z;

    public StaggeredGridLayoutManager(Context r7, AttributeSet r8, int r9, int r10) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        d4 r2 = new d4(17, false);
        this.B = r2;
        this.C = 2;
        this.G = new Rect();
        this.H = new j40(this);
        this.I = true;
        this.K = new y6(9, this);
        mz r72 = nz.G(r7, r8, r9, r10);
        int r82 = r72.a;
        if (r82 == 0) goto L8;
        if (r82 == 1) goto L8;
        throw new IllegalArgumentException("invalid orientation.");
    L8:
        c(null);
        if (r82 == this.t) goto L12;
        this.t = r82;
        ai r83 = this.r;
        this.r = this.s;
        this.s = r83;
        j0();
    L12:
        int r84 = r72.b;
        c(null);
        if (r84 == this.p) goto L22;
        int[] r102 = (int[]) r2.b;
        if (r102 == null) goto L17;
        Arrays.fill(r102, -1);
    L17:
        r2.c = null;
        j0();
        this.p = r84;
        this.y = new BitSet(this.p);
        this.q = new n40[this.p];
        int r85 = 0;
    L19:
        if (r85 >= this.p) goto L21;
        this.q[r85] = new n40(this, r85);
        r85 = r85 + 1;
        goto L19
    L21:
        j0();
    L22:
        boolean r73 = r72.c;
        c(null);
        m40 r86 = this.F;
        if (r86 != null) goto L25;
    L27:
        this.w = r73;
        j0();
        dq r74 = new dq();
        r74.a = true;
        r74.f = 0;
        r74.g = 0;
        this.v = r74;
        this.r = ai.a(this, this.t);
        this.s = ai.a(this, 1 - this.t);
        return;
    L25:
        if (r86.h == r73) goto L27;
        r86.h = r73;
        goto L27
    }

    public static int Y0(int r2, int r3, int r4) {
        if (r3 != 0) goto L5;
        if (r4 != 0) goto L5;
    L10:
        return r2;
    L5:
        int r0 = View.MeasureSpec.getMode(r2);
        if (r0 == Integer.MIN_VALUE) goto L12;
        if (r0 != 1073741824) goto L10;
    L12:
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(r2) - r3) - r4), r0);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int A0(tz r20, dq r21, yz r22) {
        int r4 = 0;
        int r6 = 1;
        this.y.set(0, this.p, true);
        dq r3 = this.v;
        if (r3.i == false) goto L9;
        if (r21.e != 1) goto L7;
        int r5 = Integer.MAX_VALUE;
    L12:
        int r9 = r21.e;
        int r10 = 0;
    L14:
        if (r10 >= this.p) goto L21;
        if (this.q[r10].a.isEmpty() == true) goto L19;
        X0(this.q[r10], r9, r5);
    L19:
        r10 = r10 + 1;
        goto L14
    L21:
        if (this.x == false) goto L23;
        int r92 = this.r.g();
    L24:
        boolean r102 = false;
    L25:
        int r11 = r21.c;
        if (r11 < 0) goto L109;
        if (r11 >= r22.b()) goto L109;
        if (r3.i == false) goto L32;
    L33:
        View r103 = r20.i(r21.c, Long.MAX_VALUE).a;
        r21.c += r21.d;
        k40 r112 = (k40) r103.getLayoutParams();
        int r13 = r112.a.b();
        d4 r14 = this.B;
        int[] r15 = (int[]) r14.b;
        if (r15 != null) goto L36;
    L39:
        int r8 = -1;
    L40:
        if (r8 == (-1)) goto L42;
        n40 r42 = this.q[r8];
    L62:
        r112.e = r42;
        if (r21.e != 1) goto L65;
        ?? r82 = 0;
        b(r103, -1, false);
    L67:
        if (this.t != 1) goto L69;
        M0(r103, nz.w(r82, this.u, this.l, r82, ((ViewGroup.MarginLayoutParams) r112).width), nz.w(true, this.o, this.m, B() + E(), ((ViewGroup.MarginLayoutParams) r112).height));
    L71:
        if (r21.e != 1) goto L73;
        int r62 = r42.f(r92);
        int r7 = this.r.c(r103) + r62;
    L75:
        if (r21.e != 1) goto L85;
        n40 r83 = r112.e;
        r83.getClass();
        k40 r113 = (k40) r103.getLayoutParams();
        r113.e = r83;
        ArrayList r132 = r83.a;
        r132.add(r103);
        r83.c = Integer.MIN_VALUE;
        if (r132.size() != 1) goto L80;
        r83.b = Integer.MIN_VALUE;
    L80:
        if (r113.a.h() == false) goto L82;
    L83:
        r83.d = r83.f.r.c(r103) + r83.d;
    L94:
        if (L0() == true) goto L96;
    L98:
        int r114 = this.s.k() + (r42.e * this.u);
        int r84 = this.s.c(r103) + r114;
    L100:
        if (this.t != 1) goto L102;
        nz.L(r103, r114, r62, r84, r7);
    L103:
        X0(r42, r3.e, r5);
        Q0(r20, r3);
        if (r3.h == false) goto L108;
        if (r103.hasFocusable() == false) goto L108;
        this.y.set(r42.e, false);
    L108:
        r6 = 1;
        r102 = true;
        r4 = 0;
        goto L25
    L102:
        nz.L(r103, r62, r114, r7, r84);
        goto L103
    L96:
        if (this.t != 1) goto L98;
        r84 = this.s.g() - (((this.p - 1) - r42.e) * this.u);
        r114 = r84 - this.s.c(r103);
        goto L100
    L82:
        if (r113.a.k() == false) goto L94;
    L85:
        n40 r85 = r112.e;
        r85.getClass();
        k40 r115 = (k40) r103.getLayoutParams();
        r115.e = r85;
        ArrayList r12 = r85.a;
        r12.add(0, r103);
        r85.b = Integer.MIN_VALUE;
        if (r12.size() != 1) goto L89;
        r85.c = Integer.MIN_VALUE;
    L89:
        if (r115.a.h() == false) goto L91;
    L92:
        r85.d = r85.f.r.c(r103) + r85.d;
        goto L94
    L91:
        if (r115.a.k() == false) goto L94;
    L73:
        r7 = r42.h(r92);
        r62 = r7 - this.r.c(r103);
        goto L75
    L69:
        M0(r103, nz.w(true, this.n, this.l, D() + C(), ((ViewGroup.MarginLayoutParams) r112).width), nz.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) r112).height));
        goto L71
    L65:
        r82 = 0;
        b(r103, 0, false);
        goto L67
    L42:
        if (O0(r21.e) == false) goto L44;
        int r86 = this.p - r6;
        int r152 = -1;
        int r16 = -1;
    L45:
        n40 r17 = null;
        if (r21.e != r6) goto L54;
        int r72 = this.r.k();
        int r43 = Integer.MAX_VALUE;
    L48:
        if (r86 == r152) goto L53;
        n40 r122 = this.q[r86];
        int r63 = r122.f(r72);
        if (r63 >= r43) goto L52;
        r43 = r63;
        r17 = r122;
    L52:
        r86 = r86 + r16;
    L53:
        r42 = r17;
        r14.r(r13);
        ((int[]) r14.b)[r13] = r42.e;
        goto L62
    L54:
        int r44 = this.r.g();
        int r64 = Integer.MIN_VALUE;
    L55:
        if (r86 == r152) goto L53;
        n40 r73 = this.q[r86];
        int r123 = r73.h(r44);
        if (r123 <= r64) goto L59;
        r17 = r73;
        r64 = r123;
    L59:
        r86 = r86 + r16;
        goto L55
    L44:
        r16 = r6;
        r152 = this.p;
        r86 = r4;
        goto L45
    L36:
        if (r13 >= r15.length) goto L39;
        r8 = r15[r13];
        goto L40
    L32:
        if (this.y.isEmpty() == false) goto L33;
    L109:
        if (r102 == true) goto L112;
        Q0(r20, r3);
    L112:
        if (r3.e != (-1)) goto L114;
        int r32 = this.r.k() - I0(this.r.k());
    L115:
        if (r32 > 0) goto L117;
        return 0;
    L117:
        return Math.min(r21.b, r32);
    L114:
        r32 = H0(this.r.g()) - this.r.g();
        goto L115
    L23:
        r92 = this.r.k();
        goto L24
    L7:
        r5 = Integer.MIN_VALUE;
        goto L12
    L9:
        if (r21.e != 1) goto L11;
        r5 = r21.g + r21.b;
        goto L12
    L11:
        r5 = r21.f - r21.b;
        goto L12
    }

    public final View B0(boolean r8) {
        int r0 = this.r.k();
        int r1 = this.r.g();
        int r2 = v() - 1;
        View r3 = null;
    L3:
        if (r2 < 0) goto L15;
        View r4 = u(r2);
        int r5 = this.r.e(r4);
        int r6 = this.r.b(r4);
        if (r6 <= r0) goto L14;
        if (r5 >= r1) goto L14;
        if (r6 <= r1) goto L13;
        if (r8 == false) goto L13;
        if (r3 != null) goto L14;
        r3 = r4;
    L13:
        return r4;
    L14:
        r2 = r2 - 1;
        goto L3
    L15:
        return r3;
    }

    public final View C0(boolean r9) {
        int r0 = this.r.k();
        int r1 = this.r.g();
        int r2 = v();
        View r3 = null;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L15;
        View r5 = u(r4);
        int r6 = this.r.e(r5);
        if (this.r.b(r5) <= r0) goto L14;
        if (r6 >= r1) goto L14;
        if (r6 >= r0) goto L13;
        if (r9 == false) goto L13;
        if (r3 != null) goto L14;
        r3 = r5;
    L13:
        return r5;
    L14:
        r4 = r4 + 1;
        goto L3
    L15:
        return r3;
    }

    public final void D0(tz r3, yz r4, boolean r5) {
        int r1 = H0(Integer.MIN_VALUE);
        if (r1 == Integer.MIN_VALUE) goto L15;
        int r0 = this.r.g() - r1;
        if (r0 <= 0) goto L12;
        int r02 = r0 - (-U0(-r0, r3, r4));
        if (r5 == false) goto L13;
        if (r02 <= 0) goto L14;
        this.r.o(r02);
        return;
    L14:
        return;
    L13:
        return;
    L12:
        return;
    }

    public final void E0(tz r3, yz r4, boolean r5) {
        int r1 = I0(Integer.MAX_VALUE);
        if (r1 == Integer.MAX_VALUE) goto L15;
        int r12 = r1 - this.r.k();
        if (r12 <= 0) goto L12;
        int r13 = r12 - U0(r12, r3, r4);
        if (r5 == false) goto L13;
        if (r13 <= 0) goto L14;
        this.r.o(-r13);
        return;
    L14:
        return;
    L13:
        return;
    L12:
        return;
    }

    public final int F0() {
        if (v() != 0) goto L6;
        return 0;
    L6:
        return nz.F(u(0));
    }

    public final int G0() {
        int r0 = v();
        if (r0 != 0) goto L7;
        return 0;
    L7:
        return nz.F(u(r0 - 1));
    }

    @Override // defpackage.nz
    public final int H(tz r2, yz r3) {
        if (this.t != 0) goto L7;
        return this.p;
    L7:
        return super.H(r2, r3);
    }

    public final int H0(int r4) {
        int r0 = this.q[0].f(r4);
        int r1 = 1;
    L4:
        if (r1 >= this.p) goto L9;
        int r2 = this.q[r1].f(r4);
        if (r2 <= r0) goto L8;
        r0 = r2;
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r0;
    }

    public final int I0(int r4) {
        int r0 = this.q[0].h(r4);
        int r1 = 1;
    L4:
        if (r1 >= this.p) goto L9;
        int r2 = this.q[r1].h(r4);
        if (r2 >= r0) goto L8;
        r0 = r2;
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r0;
    }

    @Override // defpackage.nz
    public final boolean J() {
        if (this.C == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void J0(int r10, int r11, int r12) {
        if (this.x == false) goto L5;
        int r0 = G0();
    L7:
        if (r12 != 8) goto L12;
        if (r10 >= r11) goto L11;
        int r2 = r11 + 1;
    L10:
        int r3 = r10;
    L13:
        d4 r4 = this.B;
        int[] r5 = (int[]) r4.b;
        if (r5 == null) goto L46;
        if (r3 >= r5.length) goto L46;
        ArrayList r52 = (ArrayList) r4.c;
        if (r52 != null) goto L22;
    L21:
        int r53 = -1;
    L42:
        if (r53 != (-1)) goto L44;
        int[] r54 = (int[]) r4.b;
        Arrays.fill(r54, r3, r54.length, -1);
        int r55 = ((int[]) r4.b).length;
        goto L46
    L44:
        Arrays.fill((int[]) r4.b, r3, r53 + 1, -1);
        goto L46
    L22:
        if (r52 == null) goto L30;
        int r56 = r52.size() - 1;
    L25:
        if (r56 < 0) goto L30;
        l40 r7 = (l40) ((ArrayList) r4.c).get(r56);
        if (r7.a == r3) goto L31;
        r56 = r56 - 1;
    L31:
        if (r7 == null) goto L33;
        ((ArrayList) r4.c).remove(r7);
    L33:
        int r57 = ((ArrayList) r4.c).size();
        int r72 = 0;
    L34:
        if (r72 >= r57) goto L39;
        if (((l40) ((ArrayList) r4.c).get(r72)).a >= r3) goto L40;
        r72 = r72 + 1;
    L40:
        if (r72 == (-1)) goto L21;
        l40 r58 = (l40) ((ArrayList) r4.c).get(r72);
        ((ArrayList) r4.c).remove(r72);
        r53 = r58.a;
        goto L42
    L39:
        r72 = -1;
    L30:
        r7 = null;
    L46:
        if (r12 != 1) goto L48;
        r4.A(r10, r11);
    L54:
        if (r2 > r0) goto L57;
        return;
    L57:
        if (this.x == false) goto L59;
        int r102 = F0();
    L60:
        if (r3 > r102) goto L67;
        j0();
        return;
    L67:
        return;
    L59:
        r102 = G0();
        goto L60
    L48:
        if (r12 == 2) goto L52;
        if (r12 != 8) goto L54;
        r4.B(r10, 1);
        r4.A(r11, 1);
        goto L54
    L52:
        r4.B(r10, r11);
        goto L54
    L11:
        r2 = r10 + 1;
        r3 = r11;
        goto L13
    L12:
        r2 = r10 + r11;
        goto L10
    L5:
        r0 = F0();
        goto L7
    }

    public final View K0() {
        int r0 = v();
        int r1 = r0 - 1;
        BitSet r2 = new BitSet(this.p);
        r2.set(0, this.p, true);
        int r6 = -1;
        if (this.t == 1) goto L5;
    L7:
        byte r3 = -1;
    L9:
        if (this.x == false) goto L11;
        r0 = -1;
    L12:
        if (r1 >= r0) goto L14;
        r6 = 1;
    L14:
        if (r1 == r0) goto L58;
        View r7 = u(r1);
        k40 r8 = (k40) r7.getLayoutParams();
        if (r2.get(r8.e.e) == false) goto L36;
        n40 r9 = r8.e;
        if (this.x == false) goto L27;
        int r10 = r9.c;
        if (r10 != Integer.MIN_VALUE) goto L24;
        r9.a();
        r10 = r9.c;
    L24:
        if (r10 < this.r.g()) goto L25;
    L35:
        r2.clear(r8.e.e);
        goto L36
    L25:
        ArrayList r02 = r9.a;
        ((k40) ((View) r02.get(r02.size() - 1)).getLayoutParams()).getClass();
        return r7;
    L27:
        int r102 = r9.b;
        ArrayList r12 = r9.a;
        if (r102 != Integer.MIN_VALUE) goto L32;
        View r103 = (View) r12.get(0);
        k40 r11 = (k40) r103.getLayoutParams();
        r9.b = r9.f.r.e(r103);
        r11.getClass();
        r102 = r9.b;
    L32:
        if (r102 <= this.r.k()) goto L35;
        ((k40) ((View) r12.get(0)).getLayoutParams()).getClass();
        return r7;
    L36:
        r1 = r1 + r6;
        if (r1 == r0) goto L14;
        View r92 = u(r1);
        if (this.x == true) goto L40;
        int r104 = this.r.e(r7);
        int r112 = this.r.e(r92);
        if (r104 > r112) goto L57;
        if (r104 != r112) goto L14;
    L50:
        if ((r8.e.e - ((k40) r92.getLayoutParams()).e.e) >= 0) goto L52;
        boolean r82 = true;
    L53:
        if (r3 >= 0) goto L55;
        boolean r93 = true;
    L56:
        if (r82 == r93) goto L14;
    L55:
        r93 = false;
        goto L56
    L52:
        r82 = false;
    L57:
        return r7;
    L40:
        int r105 = this.r.b(r7);
        int r113 = this.r.b(r92);
        if (r105 < r113) goto L57;
        if (r105 != r113) goto L14;
    L58:
        return null;
    L11:
        r1 = 0;
        goto L12
    L5:
        if (L0() == false) goto L7;
        r3 = 1;
        goto L9
    }

    public final boolean L0() {
        if (A() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // defpackage.nz
    public final void M(int r5) {
        super.M(r5);
        int r0 = 0;
    L4:
        if (r0 >= this.p) goto L12;
        n40 r1 = this.q[r0];
        int r2 = r1.b;
        if (r2 == Integer.MIN_VALUE) goto L8;
        r1.b = r2 + r5;
    L8:
        int r22 = r1.c;
        if (r22 == Integer.MIN_VALUE) goto L11;
        r1.c = r22 + r5;
    L11:
        r0 = r0 + 1;
        goto L4
    }

    public final void M0(View r6, int r7, int r8) {
        RecyclerView r0 = this.b;
        Rect r1 = this.G;
        if (r0 != null) goto L5;
        r1.set(0, 0, 0, 0);
    L6:
        k40 r02 = (k40) r6.getLayoutParams();
        int r72 = Y0(r7, ((ViewGroup.MarginLayoutParams) r02).leftMargin + r1.left, ((ViewGroup.MarginLayoutParams) r02).rightMargin + r1.right);
        int r82 = Y0(r8, ((ViewGroup.MarginLayoutParams) r02).topMargin + r1.top, ((ViewGroup.MarginLayoutParams) r02).bottomMargin + r1.bottom);
        if (s0(r6, r72, r82, r02) == false) goto L10;
        r6.measure(r72, r82);
        return;
    L10:
        return;
    L5:
        r1.set(r0.J(r6));
        goto L6
    }

    @Override // defpackage.nz
    public final void N(int r5) {
        super.N(r5);
        int r0 = 0;
    L4:
        if (r0 >= this.p) goto L12;
        n40 r1 = this.q[r0];
        int r2 = r1.b;
        if (r2 == Integer.MIN_VALUE) goto L8;
        r1.b = r2 + r5;
    L8:
        int r22 = r1.c;
        if (r22 == Integer.MIN_VALUE) goto L11;
        r1.c = r22 + r5;
    L11:
        r0 = r0 + 1;
        goto L4
    }

    public final void N0(tz r17, yz r18, boolean r19) {
        m40 r3 = this.F;
        j40 r5 = this.H;
        if (r3 != null) goto L7;
        if (this.z != (-1)) goto L7;
    L10:
        boolean r32 = r5.e;
        StaggeredGridLayoutManager r6 = r5.g;
        boolean r8 = true;
        if (r32 == true) goto L13;
    L18:
        boolean r33 = true;
    L19:
        d4 r10 = this.B;
        if (r33 == false) goto L141;
        r5.a();
        m40 r12 = this.F;
        if (r12 == null) goto L51;
        int r13 = r12.c;
        if (r13 > 0) goto L26;
    L39:
        m40 r122 = this.F;
        this.E = r122.j;
        boolean r123 = r122.h;
        c(null);
        m40 r132 = this.F;
        if (r132 != null) goto L42;
    L44:
        this.w = r123;
        j0();
        T0();
        m40 r124 = this.F;
        int r133 = r124.a;
        if (r133 == (-1)) goto L47;
        this.z = r133;
        r5.c = r124.i;
    L49:
        if (r124.e <= 1) goto L53;
        r10.b = r124.f;
        r10.c = r124.g;
    L53:
        if (r18.g == true) goto L122;
        int r125 = this.z;
        if (r125 == (-1)) goto L122;
        if (r125 >= 0) goto L59;
    L120:
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        goto L122
    L59:
        if (r125 >= r18.b()) goto L120;
        m40 r126 = this.F;
        if (r126 != null) goto L64;
    L69:
        View r127 = q(this.z);
        if (r127 != null) goto L72;
        int r128 = this.z;
        r5.a = r128;
        int r134 = this.A;
        if (r134 != Integer.MIN_VALUE) goto L116;
        if (v() != 0) goto L103;
        if (this.x == true) goto L109;
    L108:
        boolean r129 = false;
    L110:
        r5.c = r129;
        if (r129 == false) goto L113;
        int r1210 = r6.r.g();
    L114:
        r5.b = r1210;
    L119:
        r5.d = true;
    L139:
        r5.e = true;
        goto L141
    L113:
        r1210 = r6.r.k();
    L109:
        r129 = true;
        goto L110
    L103:
        if (r128 >= F0()) goto L105;
        boolean r1211 = true;
    L107:
        if (r1211 == this.x) goto L109;
    L105:
        r1211 = false;
        goto L107
    L116:
        if (r5.c == false) goto L118;
        r5.b = r6.r.g() - r134;
        goto L119
    L118:
        r5.b = r6.r.k() + r134;
        goto L119
    L72:
        if (this.x == false) goto L74;
        int r135 = G0();
    L75:
        r5.a = r135;
        if (this.A == Integer.MIN_VALUE) goto L82;
        if (r5.c == false) goto L80;
        r5.b = (this.r.g() - this.A) - this.r.b(r127);
        goto L139
    L80:
        r5.b = (this.r.k() + this.A) - this.r.e(r127);
        goto L139
    L82:
        if (this.r.c(r127) > this.r.l()) goto L84;
        int r136 = this.r.e(r127) - this.r.k();
        if (r136 >= 0) goto L91;
        r5.b = -r136;
        goto L139
    L91:
        int r137 = this.r.g() - this.r.b(r127);
        if (r137 >= 0) goto L94;
        r5.b = r137;
        goto L139
    L94:
        r5.b = Integer.MIN_VALUE;
        goto L139
    L84:
        if (r5.c == false) goto L86;
        int r1212 = this.r.g();
    L87:
        r5.b = r1212;
        goto L139
    L86:
        r1212 = this.r.k();
        goto L87
    L74:
        r135 = F0();
        goto L75
    L64:
        if (r126.a == (-1)) goto L69;
        if (r126.c < 1) goto L69;
        r5.b = Integer.MIN_VALUE;
        r5.a = this.z;
    L122:
        if (this.D == false) goto L131;
        int r1213 = r18.b();
        int r138 = v() - 1;
    L124:
        if (r138 < 0) goto L130;
        int r14 = nz.F(u(r138));
        if (r14 < 0) goto L129;
        if (r14 >= r1213) goto L129;
    L138:
        r5.a = r14;
        r5.b = Integer.MIN_VALUE;
    L129:
        r138 = r138 - 1;
    L130:
        r14 = 0;
        goto L138
    L131:
        int r1214 = r18.b();
        int r139 = v();
        int r142 = 0;
    L132:
        if (r142 >= r139) goto L130;
        int r15 = nz.F(u(r142));
        if (r15 < 0) goto L137;
        if (r15 >= r1214) goto L137;
        r14 = r15;
    L137:
        r142 = r142 + 1;
        goto L132
    L47:
        r5.c = this.x;
        goto L49
    L42:
        if (r132.h == r123) goto L44;
        r132.h = r123;
        goto L44
    L26:
        if (r13 != this.p) goto L38;
        int r1215 = 0;
    L29:
        if (r1215 >= this.p) goto L39;
        this.q[r1215].b();
        m40 r1310 = this.F;
        int r143 = r1310.d[r1215];
        if (r143 == Integer.MIN_VALUE) goto L37;
        if (r1310.i == false) goto L36;
        int r1311 = this.r.g();
    L35:
        r143 = r143 + r1311;
        goto L37
    L36:
        r1311 = this.r.k();
    L37:
        n40 r1312 = this.q[r1215];
        r1312.b = r143;
        r1312.c = r143;
        r1215 = r1215 + 1;
        goto L29
    L38:
        r12.d = null;
        r12.c = 0;
        r12.e = 0;
        r12.f = null;
        r12.g = null;
        r12.a = r12.b;
        goto L39
    L51:
        T0();
        r5.c = this.x;
    L141:
        if (this.F != null) goto L153;
        if (this.z != (-1)) goto L153;
        if (r5.c == this.D) goto L147;
    L148:
        int[] r1216 = (int[]) r10.b;
        if (r1216 == null) goto L151;
        Arrays.fill(r1216, -1);
    L151:
        r10.c = null;
        r5.d = true;
        goto L153
    L147:
        if (L0() != this.E) goto L148;
    L153:
        if (v() <= 0) goto L204;
        m40 r9 = this.F;
        if (r9 == null) goto L159;
        if (r9.c >= 1) goto L204;
    L159:
        if (r5.d == false) goto L167;
        int r34 = 0;
    L162:
        if (r34 >= this.p) goto L204;
        this.q[r34].b();
        int r62 = r5.b;
        if (r62 == Integer.MIN_VALUE) goto L166;
        n40 r92 = this.q[r34];
        r92.b = r62;
        r92.c = r62;
    L166:
        r34 = r34 + 1;
        goto L162
    L167:
        if (r33 == false) goto L169;
    L175:
        int r35 = 0;
    L177:
        if (r35 >= this.p) goto L196;
        n40 r93 = this.q[r35];
        boolean r102 = this.x;
        int r1217 = r5.b;
        StaggeredGridLayoutManager r1313 = r93.f;
        if (r102 == false) goto L181;
        int r144 = r93.f(Integer.MIN_VALUE);
    L182:
        r93.b();
        if (r144 == Integer.MIN_VALUE) goto L195;
        if (r102 == true) goto L187;
    L188:
        if (r102 == false) goto L190;
    L192:
        if (r1217 == Integer.MIN_VALUE) goto L194;
        r144 = r144 + r1217;
    L194:
        r93.c = r144;
        r93.b = r144;
        goto L195
    L190:
        if (r144 <= r1313.r.k()) goto L192;
    L187:
        if (r144 >= r1313.r.g()) goto L188;
    L195:
        r35 = r35 + 1;
        goto L177
    L181:
        r144 = r93.h(Integer.MIN_VALUE);
        goto L182
    L196:
        n40[] r36 = this.q;
        int r94 = r36.length;
        int[] r103 = r5.f;
        if (r103 != null) goto L199;
    L200:
        r5.f = new int[r6.q.length];
    L201:
        int r63 = 0;
    L202:
        if (r63 >= r94) goto L204;
        r5.f[r63] = r36[r63].h(Integer.MIN_VALUE);
        r63 = r63 + 1;
        goto L202
    L199:
        if (r103.length >= r94) goto L201;
    L169:
        if (r5.f == null) goto L175;
        int r37 = 0;
    L173:
        if (r37 >= this.p) goto L204;
        n40 r64 = this.q[r37];
        r64.b();
        int r95 = r5.f[r37];
        r64.b = r95;
        r64.c = r95;
        r37 = r37 + 1;
    L204:
        p(r17);
        dq r38 = this.v;
        r38.a = false;
        int r65 = this.s.l();
        this.u = r65 / this.p;
        View.MeasureSpec.makeMeasureSpec(r65, this.s.i());
        W0(r5.a, r18);
        if (r5.c == false) goto L207;
        V0(-1);
        A0(r17, r38, r18);
        V0(1);
        r38.c = r5.a + r38.d;
        A0(r17, r38, r18);
    L209:
        if (this.s.i() == 1073741824) goto L237;
        int r39 = v();
        float r4 = 0.0f;
        int r66 = 0;
    L212:
        if (r66 >= r39) goto L218;
        View r96 = u(r66);
        float r104 = this.s.c(r96);
        if (r104 < r4) goto L217;
        ((k40) r96.getLayoutParams()).getClass();
        r4 = Math.max(r4, r104);
    L217:
        r66 = r66 + 1;
        goto L212
    L218:
        int r67 = this.u;
        int r42 = Math.round(r4 * this.p);
        if (this.s.i() != Integer.MIN_VALUE) goto L221;
        r42 = Math.min(r42, this.s.l());
    L221:
        this.u = r42 / this.p;
        View.MeasureSpec.makeMeasureSpec(r42, this.s.i());
        if (this.u == r67) goto L237;
        int r43 = 0;
    L225:
        if (r43 >= r39) goto L237;
        View r97 = u(r43);
        k40 r105 = (k40) r97.getLayoutParams();
        r105.getClass();
        if (L0() == true) goto L229;
    L231:
        int r106 = r105.e.e;
        int r11 = this.u * r106;
        int r107 = r106 * r67;
        if (this.t != 1) goto L234;
        r97.offsetLeftAndRight(r11 - r107);
    L235:
        r43 = r43 + 1;
        goto L225
    L234:
        r97.offsetTopAndBottom(r11 - r107);
        goto L235
    L229:
        if (this.t != 1) goto L231;
        int r108 = -((this.p - 1) - r105.e.e);
        r97.offsetLeftAndRight((this.u * r108) - (r108 * r67));
    L237:
        if (v() > 0) goto L239;
    L242:
        if (r19 == true) goto L244;
    L257:
        r8 = false;
    L259:
        if (r18.g == false) goto L261;
        r5.a();
    L261:
        this.D = r5.c;
        this.E = L0();
        if (r8 == false) goto L293;
        r5.a();
        N0(r17, r18, false);
        return;
    L293:
        return;
    L244:
        if (r18.g == true) goto L257;
        if (this.C == 0) goto L257;
        if (v() <= 0) goto L257;
        if (K0() == null) goto L257;
        RecyclerView r310 = this.b;
        if (r310 == null) goto L255;
        r310.removeCallbacks(this.K);
    L255:
        if (y0() == false) goto L257;
    L239:
        if (this.x == false) goto L241;
        D0(r17, r18, true);
        E0(r17, r18, false);
        goto L242
    L241:
        E0(r17, r18, true);
        D0(r17, r18, false);
        goto L242
    L207:
        V0(1);
        A0(r17, r38, r18);
        V0(-1);
        r38.c = r5.a + r38.d;
        A0(r17, r38, r18);
        goto L209
    L13:
        if (this.z != (-1)) goto L18;
        if (this.F != null) goto L18;
        r33 = false;
    L7:
        if (r18.b() != 0) goto L10;
        e0(r17);
        r5.a();
    }

    public final boolean O0(int r5) {
        if (this.t != 0) goto L11;
        if (r5 != (-1)) goto L6;
        boolean r52 = true;
    L8:
        if (r52 == this.x) goto L10;
        return true;
    L10:
        return false;
    L6:
        r52 = false;
        goto L8
    L11:
        if (r5 != (-1)) goto L13;
        boolean r53 = true;
    L15:
        if (r53 != this.x) goto L17;
        boolean r54 = true;
    L19:
        if (r54 != L0()) goto L21;
        return true;
    L21:
        return false;
    L17:
        r54 = false;
        goto L19
    L13:
        r53 = false;
        goto L15
    }

    @Override // defpackage.nz
    public final void P(RecyclerView r3) {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L5;
        r0.removeCallbacks(this.K);
    L5:
        int r02 = 0;
    L7:
        if (r02 >= this.p) goto L9;
        this.q[r02].b();
        r02 = r02 + 1;
        goto L7
    L9:
        r3.requestLayout();
    }

    public final void P0(int r5, yz r6) {
        if (r5 <= 0) goto L5;
        int r1 = G0();
        int r2 = 1;
    L6:
        dq r3 = this.v;
        r3.a = true;
        W0(r1, r6);
        V0(r2);
        r3.c = r1 + r3.d;
        r3.b = Math.abs(r5);
        return;
    L5:
        r1 = F0();
        r2 = -1;
        goto L6
    }

    @Override // defpackage.nz
    public final View Q(View r9, int r10, tz r11, yz r12) {
        if (v() == 0) goto L119;
        RecyclerView r0 = this.b;
        if (r0 == null) goto L13;
        View r92 = r0.A(r9);
        if (r92 == null) goto L13;
        if (((ArrayList) this.a.d).contains(r92) == true) goto L13;
    L14:
        if (r92 == null) goto L119;
        T0();
        if (r10 == 1) goto L48;
        if (r10 == 2) goto L42;
        if (r10 == 17) goto L39;
        if (r10 == 33) goto L36;
        if (r10 == 66) goto L33;
        if (r10 == 130) goto L30;
    L28:
        int r102 = Integer.MIN_VALUE;
    L53:
        if (r102 == Integer.MIN_VALUE) goto L119;
        k40 r02 = (k40) r92.getLayoutParams();
        r02.getClass();
        n40 r03 = r02.e;
        if (r102 != 1) goto L58;
        int r4 = G0();
    L59:
        W0(r4, r12);
        V0(r102);
        dq r5 = this.v;
        r5.c = r5.d + r4;
        r5.b = (int) (this.r.l() * 0.33333334f);
        r5.h = true;
        int r6 = 0;
        r5.a = false;
        A0(r11, r5, r12);
        this.D = this.x;
        View r112 = r03.g(r4, r102);
        if (r112 == null) goto L64;
        if (r112 == r92) goto L64;
        return r112;
    L64:
        if (O0(r102) == false) goto L72;
        int r113 = this.p - 1;
    L66:
        if (r113 < 0) goto L80;
        View r122 = this.q[r113].g(r4, r102);
        if (r122 == null) goto L71;
        if (r122 == r92) goto L71;
        return r122;
    L71:
        r113 = r113 - 1;
    L80:
        boolean r114 = !this.w;
        if (r102 != (-1)) goto L83;
        boolean r123 = true;
    L84:
        if (r114 != r123) goto L86;
        boolean r115 = true;
    L87:
        if (r115 == false) goto L89;
        int r124 = r03.c();
    L90:
        View r125 = q(r124);
        if (r125 == null) goto L95;
        if (r125 == r92) goto L95;
        return r125;
    L95:
        if (O0(r102) == false) goto L110;
        int r103 = this.p - 1;
    L97:
        if (r103 < 0) goto L119;
        if (r103 == r03.e) goto L108;
        if (r115 == false) goto L103;
        int r126 = this.q[r103].c();
    L104:
        View r127 = q(r126);
        if (r127 == null) goto L108;
        if (r127 == r92) goto L108;
        return r127;
    L103:
        r126 = this.q[r103].d();
    L108:
        r103 = r103 - 1;
    L110:
        if (r6 >= this.p) goto L119;
        if (r115 == false) goto L113;
        int r104 = this.q[r6].c();
    L114:
        View r105 = q(r104);
        if (r105 == null) goto L118;
        if (r105 == r92) goto L118;
        return r105;
    L118:
        r6 = r6 + 1;
        goto L110
    L113:
        r104 = this.q[r6].d();
        goto L114
    L89:
        r124 = r03.d();
        goto L90
    L86:
        r115 = false;
        goto L87
    L83:
        r123 = false;
        goto L84
    L72:
        int r116 = 0;
    L74:
        if (r116 >= this.p) goto L80;
        View r128 = this.q[r116].g(r4, r102);
        if (r128 == null) goto L79;
        if (r128 == r92) goto L79;
        return r128;
    L79:
        r116 = r116 + 1;
        goto L74
    L58:
        r4 = F0();
        goto L59
    L30:
        if (this.t != 1) goto L28;
    L31:
        r102 = 1;
        goto L53
    L33:
        if (this.t != 0) goto L28;
    L36:
        if (this.t != 1) goto L28;
    L37:
        r102 = -1;
        goto L53
    L39:
        if (this.t != 0) goto L28;
    L42:
        if (this.t == 1) goto L31;
        if (L0() == false) goto L31;
    L48:
        if (this.t == 1) goto L37;
        if (L0() == false) goto L37;
    L13:
        r92 = null;
    L119:
        return null;
    }

    public final void Q0(tz r5, dq r6) {
        if (r6.a == true) goto L5;
        return;
    L5:
        if (r6.i == false) goto L8;
        return;
    L8:
        if (r6.b == 0) goto L10;
        int r2 = 1;
        if (r6.e != (-1)) goto L30;
        int r0 = r6.f;
        int r1 = this.q[0].h(r0);
    L19:
        if (r2 >= this.p) goto L24;
        int r3 = this.q[r2].h(r0);
        if (r3 <= r1) goto L23;
        r1 = r3;
    L23:
        r2 = r2 + 1;
        goto L19
    L24:
        int r02 = r0 - r1;
        if (r02 >= 0) goto L27;
        int r62 = r6.g;
    L28:
        R0(r5, r62);
        return;
    L27:
        r62 = r6.g - Math.min(r02, r6.b);
        goto L28
    L30:
        int r03 = r6.g;
        int r12 = this.q[0].f(r03);
    L32:
        if (r2 >= this.p) goto L37;
        int r32 = this.q[r2].f(r03);
        if (r32 >= r12) goto L36;
        r12 = r32;
    L36:
        r2 = r2 + 1;
        goto L32
    L37:
        int r13 = r12 - r6.g;
        if (r13 >= 0) goto L40;
        int r63 = r6.f;
    L41:
        S0(r5, r63);
        return;
    L40:
        int r04 = r6.f;
        r63 = Math.min(r13, r6.b) + r04;
        goto L41
    L10:
        if (r6.e != (-1)) goto L13;
        R0(r5, r6.g);
        return;
    L13:
        S0(r5, r6.f);
    }

    @Override // defpackage.nz
    public final void R(AccessibilityEvent r3) {
        super.R(r3);
        if (v() <= 0) goto L14;
        View r1 = C0(false);
        View r0 = B0(false);
        if (r1 == null) goto L15;
        if (r0 == null) goto L16;
        int r12 = nz.F(r1);
        int r02 = nz.F(r0);
        if (r12 >= r02) goto L12;
        r3.setFromIndex(r12);
        r3.setToIndex(r02);
        return;
    L12:
        r3.setFromIndex(r02);
        r3.setToIndex(r12);
        return;
    L16:
        return;
    L15:
        return;
    }

    public final void R0(tz r9, int r10) {
        int r0 = v() - 1;
    L3:
        if (r0 < 0) goto L20;
        View r2 = u(r0);
        if (this.r.e(r2) < r10) goto L27;
        if (this.r.n(r2) < r10) goto L28;
        k40 r3 = (k40) r2.getLayoutParams();
        r3.getClass();
        if (r3.e.a.size() == 1) goto L29;
        n40 r32 = r3.e;
        ArrayList r4 = r32.a;
        int r5 = r4.size();
        View r42 = (View) r4.remove(r5 - 1);
        k40 r6 = (k40) r42.getLayoutParams();
        r6.e = null;
        if (r6.a.h() == false) goto L14;
    L15:
        r32.d -= r32.f.r.c(r42);
    L17:
        if (r5 != 1) goto L19;
        r32.b = Integer.MIN_VALUE;
    L19:
        r32.c = Integer.MIN_VALUE;
        g0(r2, r9);
        r0 = r0 - 1;
        goto L3
    L14:
        if (r6.a.k() == false) goto L17;
    L29:
        return;
    L28:
        return;
    L27:
        return;
    }

    @Override // defpackage.nz
    public final void S(tz r3, yz r4, View r5, j0 r6) {
        ViewGroup.LayoutParams r32 = r5.getLayoutParams();
        if ((r32 instanceof k40) == true) goto L6;
        T(r5, r6);
        return;
    L6:
        k40 r33 = (k40) r32;
        if (this.t != 0) goto L14;
        n40 r34 = r33.e;
        if (r34 != null) goto L11;
        int r35 = -1;
    L12:
        r6.f(i0.a(false, r35, 1, -1, -1));
        return;
    L11:
        r35 = r34.e;
        goto L12
    L14:
        n40 r36 = r33.e;
        if (r36 != null) goto L17;
        int r37 = -1;
    L18:
        r6.f(i0.a(false, -1, -1, r37, 1));
        return;
    L17:
        r37 = r36.e;
        goto L18
    }

    public final void S0(tz r7, int r8) {
    L3:
        if (v() <= 0) goto L20;
        View r1 = u(0);
        if (this.r.b(r1) > r8) goto L27;
        if (this.r.m(r1) > r8) goto L28;
        k40 r2 = (k40) r1.getLayoutParams();
        r2.getClass();
        if (r2.e.a.size() == 1) goto L29;
        n40 r22 = r2.e;
        ArrayList r3 = r22.a;
        View r0 = (View) r3.remove(0);
        k40 r4 = (k40) r0.getLayoutParams();
        r4.e = null;
        if (r3.size() != 0) goto L15;
        r22.c = Integer.MIN_VALUE;
    L15:
        if (r4.a.h() == false) goto L17;
    L18:
        r22.d -= r22.f.r.c(r0);
    L19:
        r22.b = Integer.MIN_VALUE;
        g0(r1, r7);
        goto L3
    L17:
        if (r4.a.k() == false) goto L19;
    L29:
        return;
    L28:
        return;
    L27:
        return;
    }

    public final void T0() {
        if (this.t != 1) goto L5;
    L9:
        this.x = this.w;
        return;
    L5:
        if (L0() == false) goto L9;
        this.x = !this.w;
    }

    @Override // defpackage.nz
    public final void U(int r2, int r3) {
        J0(r2, r3, 1);
    }

    public final int U0(int r4, tz r5, yz r6) {
        if (v() == 0) goto L14;
        if (r4 == 0) goto L14;
        P0(r4, r6);
        dq r0 = this.v;
        int r62 = A0(r5, r0, r6);
        if (r0.b < r62) goto L12;
        if (r4 >= 0) goto L11;
        r4 = -r62;
        goto L12
    L11:
        r4 = r62;
    L12:
        this.r.o(-r4);
        this.D = this.x;
        r0.b = 0;
        Q0(r5, r0);
        return r4;
    L14:
        return 0;
    }

    @Override // defpackage.nz
    public final void V() {
        d4 r0 = this.B;
        int[] r1 = (int[]) r0.b;
        if (r1 == null) goto L5;
        Arrays.fill(r1, -1);
    L5:
        r0.c = null;
        j0();
    }

    public final void V0(int r5) {
        dq r0 = this.v;
        r0.e = r5;
        boolean r1 = this.x;
        int r2 = 1;
        if (r5 != (-1)) goto L5;
        boolean r52 = true;
    L6:
        if (r1 == r52) goto L9;
        r2 = -1;
    L9:
        r0.d = r2;
        return;
    L5:
        r52 = false;
        goto L6
    }

    @Override // defpackage.nz
    public final void W(int r2, int r3) {
        J0(r2, r3, 8);
    }

    public final void W0(int r5, yz r6) {
        dq r0 = this.v;
        boolean r1 = false;
        r0.b = 0;
        r0.c = r5;
        yq r2 = this.e;
        if (r2 != null) goto L5;
    L15:
        int r52 = 0;
        int r62 = 0;
    L16:
        RecyclerView r22 = this.b;
        if (r22 != null) goto L19;
    L21:
        r0.g = this.r.f() + r52;
        r0.f = -r62;
    L22:
        r0.h = false;
        r0.a = true;
        if (this.r.i() == 0) goto L25;
    L27:
        r0.i = r1;
        return;
    L25:
        if (this.r.f() != 0) goto L27;
        r1 = true;
        goto L27
    L19:
        if (r22.g == false) goto L21;
        r0.f = this.r.k() - r62;
        r0.g = this.r.g() + r52;
        goto L22
    L5:
        if (r2.e == false) goto L15;
        int r63 = r6.a;
        if (r63 == (-1)) goto L15;
        boolean r23 = this.x;
        if (r63 >= r5) goto L11;
        boolean r53 = true;
    L12:
        if (r23 != r53) goto L14;
        r52 = this.r.l();
        r62 = 0;
        goto L16
    L14:
        r62 = this.r.l();
        r52 = 0;
        goto L16
    L11:
        r53 = false;
        goto L12
    }

    @Override // defpackage.nz
    public final void X(int r2, int r3) {
        J0(r2, r3, 2);
    }

    public final void X0(n40 r6, int r7, int r8) {
        int r0 = r6.d;
        int r1 = r6.e;
        if (r7 != (-1)) goto L12;
        int r72 = r6.b;
        if (r72 != Integer.MIN_VALUE) goto L9;
        View r73 = (View) r6.a.get(0);
        k40 r2 = (k40) r73.getLayoutParams();
        r6.b = r6.f.r.e(r73);
        r2.getClass();
        r72 = r6.b;
    L9:
        if ((r72 + r0) > r8) goto L20;
        this.y.set(r1, false);
        return;
    L20:
        return;
    L12:
        int r74 = r6.c;
        if (r74 != Integer.MIN_VALUE) goto L17;
        r6.a();
        r74 = r6.c;
    L17:
        if ((r74 - r0) < r8) goto L21;
        this.y.set(r1, false);
        return;
    }

    @Override // defpackage.nz
    public final void Y(int r2, int r3) {
        J0(r2, r3, 4);
    }

    @Override // defpackage.nz
    public final void Z(tz r2, yz r3) {
        N0(r2, r3, true);
    }

    @Override // defpackage.xz
    public final PointF a(int r4) {
        int r1 = -1;
        if (v() != 0) goto L8;
        if (this.x == false) goto L13;
    L6:
        r1 = 1;
    L13:
        PointF r42 = new PointF();
        if (r1 != 0) goto L18;
        return null;
    L18:
        if (this.t != 0) goto L21;
        r42.x = r1;
        r42.y = 0.0f;
        return r42;
    L21:
        r42.x = 0.0f;
        r42.y = r1;
        return r42;
    L8:
        if (r4 >= F0()) goto L10;
        boolean r43 = true;
    L12:
        if (r43 == this.x) goto L6;
    L10:
        r43 = false;
        goto L12
    }

    @Override // defpackage.nz
    public final void a0(yz r1) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.nz
    public final void b0(Parcelable r2) {
        if ((r2 instanceof m40) == false) goto L6;
        this.F = (m40) r2;
        j0();
        return;
    }

    @Override // defpackage.nz
    public final void c(String r2) {
        if (this.F != null) goto L6;
        super.c(r2);
        return;
    }

    @Override // defpackage.nz
    public final Parcelable c0() {
        m40 r0 = this.F;
        if (r0 == null) goto L6;
        m40 r1 = new m40();
        r1.c = r0.c;
        r1.a = r0.a;
        r1.b = r0.b;
        r1.d = r0.d;
        r1.e = r0.e;
        r1.f = r0.f;
        r1.h = r0.h;
        r1.i = r0.i;
        r1.j = r0.j;
        r1.g = r0.g;
        return r1;
    L6:
        m40 r02 = new m40();
        r02.h = this.w;
        r02.i = this.D;
        r02.j = this.E;
        int r12 = 0;
        d4 r2 = this.B;
        if (r2 == null) goto L11;
        int[] r3 = (int[]) r2.b;
        if (r3 == null) goto L11;
        r02.f = r3;
        r02.e = r3.length;
        r02.g = (ArrayList) r2.c;
    L12:
        int r32 = -1;
        if (v() > 0) goto L15;
        r02.a = -1;
        r02.b = -1;
        r02.c = 0;
        return r02;
    L15:
        if (this.D == false) goto L17;
        int r22 = G0();
    L18:
        r02.a = r22;
        if (this.x == false) goto L21;
        View r23 = B0(true);
    L22:
        if (r23 == null) goto L25;
        r32 = nz.F(r23);
    L25:
        r02.b = r32;
        int r24 = this.p;
        r02.c = r24;
        r02.d = new int[r24];
    L27:
        if (r12 >= this.p) goto L38;
        if (this.D == false) goto L34;
        int r25 = this.q[r12].f(Integer.MIN_VALUE);
        if (r25 == Integer.MIN_VALUE) goto L37;
        int r33 = this.r.g();
    L33:
        r25 = r25 - r33;
    L37:
        r02.d[r12] = r25;
        r12 = r12 + 1;
        goto L27
    L34:
        r25 = this.q[r12].h(Integer.MIN_VALUE);
        if (r25 == Integer.MIN_VALUE) goto L37;
        r33 = this.r.k();
        goto L33
    L38:
        return r02;
    L21:
        r23 = C0(true);
        goto L22
    L17:
        r22 = F0();
    L11:
        r02.e = 0;
        goto L12
    }

    @Override // defpackage.nz
    public final boolean d() {
        if (this.t != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.nz
    public final void d0(int r1) {
        if (r1 != 0) goto L5;
        y0();
        return;
    }

    @Override // defpackage.nz
    public final boolean e() {
        if (this.t != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // defpackage.nz
    public final boolean f(oz r1) {
        return r1 instanceof k40;
    }

    @Override // defpackage.nz
    public final void h(int r5, int r6, yz r7, bn r8) {
        if (this.t == 0) goto L7;
        r5 = r6;
    L7:
        if (v() == 0) goto L33;
        if (r5 == 0) goto L40;
        P0(r5, r7);
        int[] r52 = this.J;
        if (r52 != null) goto L13;
    L14:
        this.J = new int[this.p];
    L15:
        int r53 = 0;
        int r62 = 0;
        int r0 = 0;
    L16:
        int r1 = this.p;
        dq r2 = this.v;
        if (r62 >= r1) goto L26;
        if (r2.d != (-1)) goto L22;
        int r12 = r2.f;
        int r22 = this.q[r62].h(r12);
    L21:
        int r13 = r12 - r22;
        if (r13 < 0) goto L25;
        this.J[r0] = r13;
        r0 = r0 + 1;
    L25:
        r62 = r62 + 1;
        goto L16
    L22:
        r12 = this.q[r62].f(r2.g);
        r22 = r2.g;
        goto L21
    L26:
        Arrays.sort(this.J, 0, r0);
    L27:
        if (r53 >= r0) goto L41;
        int r63 = r2.c;
        if (r63 < 0) goto L42;
        if (r63 >= r7.b()) goto L43;
        r8.a(r2.c, this.J[r53]);
        r2.c += r2.d;
        r53 = r53 + 1;
        goto L27
    L43:
        return;
    L42:
        return;
    L41:
        return;
    L13:
        if (r52.length >= this.p) goto L15;
    L40:
        return;
    }

    @Override // defpackage.nz
    public final int j(yz r8) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.I;
        return zt.g(r8, this.r, C0(r0), B0(r0), this, this.I);
    }

    @Override // defpackage.nz
    public final int k(yz r1) {
        return z0(r1);
    }

    @Override // defpackage.nz
    public final int k0(int r1, tz r2, yz r3) {
        return U0(r1, r2, r3);
    }

    @Override // defpackage.nz
    public final int l(yz r8) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.I;
        return zt.i(r8, this.r, C0(r0), B0(r0), this, this.I);
    }

    @Override // defpackage.nz
    public final void l0(int r3) {
        m40 r0 = this.F;
        if (r0 != null) goto L5;
    L7:
        this.z = r3;
        this.A = Integer.MIN_VALUE;
        j0();
        return;
    L5:
        if (r0.a == r3) goto L7;
        r0.d = null;
        r0.c = 0;
        r0.a = -1;
        r0.b = -1;
        goto L7
    }

    @Override // defpackage.nz
    public final int m(yz r8) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.I;
        return zt.g(r8, this.r, C0(r0), B0(r0), this, this.I);
    }

    @Override // defpackage.nz
    public final int m0(int r1, tz r2, yz r3) {
        return U0(r1, r2, r3);
    }

    @Override // defpackage.nz
    public final int n(yz r1) {
        return z0(r1);
    }

    @Override // defpackage.nz
    public final int o(yz r8) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.I;
        return zt.i(r8, this.r, C0(r0), B0(r0), this, this.I);
    }

    @Override // defpackage.nz
    public final void p0(Rect r6, int r7, int r8) {
        int r0 = C();
        int r1 = D() + r0;
        int r02 = E();
        int r2 = B() + r02;
        int r03 = this.t;
        int r4 = this.p;
        if (r03 != 1) goto L5;
        int r62 = r6.height() + r2;
        RecyclerView r04 = this.b;
        WeakHashMap r22 = ja0.a;
        int r63 = nz.g(r8, r62, s90.d(r04));
        int r72 = nz.g(r7, (this.u * r4) + r1, s90.e(this.b));
    L6:
        RecyclerView.e(this.b, r72, r63);
        return;
    L5:
        int r64 = r6.width() + r1;
        RecyclerView r05 = this.b;
        WeakHashMap r12 = ja0.a;
        r72 = nz.g(r7, r64, s90.e(r05));
        r63 = nz.g(r8, (this.u * r4) + r2, s90.d(this.b));
        goto L6
    }

    @Override // defpackage.nz
    public final oz r() {
        if (this.t != 0) goto L7;
        return new k40(-2, -1);
    L7:
        return new k40(-1, -2);
    }

    @Override // defpackage.nz
    public final oz s(Context r2, AttributeSet r3) {
        return new k40(r2, r3);
    }

    @Override // defpackage.nz
    public final oz t(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L7;
        return new k40((ViewGroup.MarginLayoutParams) r2);
    L7:
        return new k40(r2);
    }

    @Override // defpackage.nz
    public final void v0(RecyclerView r2, int r3) {
        yq r0 = new yq(r2.getContext());
        r0.a = r3;
        w0(r0);
    }

    @Override // defpackage.nz
    public final int x(tz r3, yz r4) {
        if (this.t != 1) goto L7;
        return this.p;
    L7:
        return super.x(r3, r4);
    }

    @Override // defpackage.nz
    public final boolean x0() {
        if (this.F != null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean y0() {
        if (v() != 0) goto L5;
    L21:
        return false;
    L5:
        if (this.C == 0) goto L21;
        if (this.g == false) goto L21;
        if (this.x == false) goto L12;
        int r0 = G0();
        F0();
    L13:
        if (r0 != 0) goto L21;
        if (K0() == null) goto L21;
        d4 r02 = this.B;
        int[] r1 = (int[]) r02.b;
        if (r1 == null) goto L19;
        Arrays.fill(r1, -1);
    L19:
        r02.c = null;
        this.f = true;
        j0();
        return true;
    L12:
        r0 = F0();
        G0();
        goto L13
    }

    public final int z0(yz r9) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.I;
        return zt.h(r9, this.r, C0(r0), B0(r0), this, this.I, this.x);
    }
}
