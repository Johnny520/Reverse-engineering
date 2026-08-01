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
import defpackage.b00;
import defpackage.bn;
import defpackage.mz;
import defpackage.nz;
import defpackage.oz;
import defpackage.tz;
import defpackage.uq;
import defpackage.vq;
import defpackage.wq;
import defpackage.xq;
import defpackage.xz;
import defpackage.yq;
import defpackage.yz;
import defpackage.zt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends nz implements xz {
    public final uq A;
    public final vq B;
    public final int C;
    public final int[] D;
    public int p;
    public wq q;
    public ai r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public xq z;

    public LinearLayoutManager(int r4) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new uq();
        this.B = new vq();
        this.C = 2;
        this.D = new int[2];
        X0(r4);
        c(null);
        if (this.t == true) goto L5;
        return;
    L5:
        this.t = false;
        j0();
    }

    public final int A0(yz r7) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        E0();
        ai r1 = this.r;
        boolean r0 = !this.w;
        return zt.g(r7, r1, H0(r0), G0(r0), this, this.w);
    }

    public final int B0(yz r8) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        E0();
        ai r1 = this.r;
        boolean r0 = !this.w;
        return zt.h(r8, r1, H0(r0), G0(r0), this, this.w, this.u);
    }

    public final int C0(yz r7) {
        if (v() != 0) goto L6;
        return 0;
    L6:
        E0();
        ai r1 = this.r;
        boolean r0 = !this.w;
        return zt.i(r7, r1, H0(r0), G0(r0), this, this.w);
    }

    public final int D0(int r5) {
        if (r5 == 1) goto L39;
        if (r5 == 2) goto L32;
        if (r5 == 17) goto L28;
        if (r5 == 33) goto L24;
        if (r5 == 66) goto L20;
        if (r5 == 130) goto L16;
        return Integer.MIN_VALUE;
    L16:
        if (this.p != 1) goto L18;
        return 1;
    L18:
        return Integer.MIN_VALUE;
    L20:
        if (this.p != 0) goto L22;
        return 1;
    L22:
        return Integer.MIN_VALUE;
    L24:
        if (this.p != 1) goto L26;
        return -1;
    L26:
        return Integer.MIN_VALUE;
    L28:
        if (this.p != 0) goto L30;
        return -1;
    L30:
        return Integer.MIN_VALUE;
    L32:
        if (this.p != 1) goto L35;
        return 1;
    L35:
        if (Q0() == false) goto L37;
        return -1;
    L37:
        return 1;
    L39:
        if (this.p != 1) goto L42;
        return -1;
    L42:
        if (Q0() == false) goto L44;
        return 1;
    L44:
        return -1;
    }

    public final void E0() {
        if (this.q != null) goto L6;
        wq r0 = new wq();
        r0.a = true;
        r0.h = 0;
        r0.i = 0;
        r0.k = null;
        this.q = r0;
        return;
    }

    public final int F0(tz r8, wq r9, yz r10, boolean r11) {
        int r0 = r9.c;
        int r1 = r9.g;
        if (r1 == Integer.MIN_VALUE) goto L7;
        if (r0 >= 0) goto L6;
        r9.g = r1 + r0;
    L6:
        T0(r8, r9);
    L7:
        int r12 = r9.c + r9.h;
    L9:
        if (r9.l == true) goto L11;
        if (r12 > 0) goto L11;
    L35:
        return r0 - r9.c;
    L11:
        int r3 = r9.d;
        if (r3 < 0) goto L35;
        if (r3 >= r10.b()) goto L35;
        vq r32 = this.B;
        r32.a = 0;
        r32.b = false;
        r32.c = false;
        r32.d = false;
        R0(r8, r10, r9, r32);
        if (r32.b == true) goto L35;
        int r4 = r9.b;
        int r5 = r32.a;
        r9.b = (r9.f * r5) + r4;
        if (r32.c == true) goto L21;
    L24:
        r9.c -= r5;
        r12 = r12 - r5;
    L25:
        int r42 = r9.g;
        if (r42 == Integer.MIN_VALUE) goto L31;
        int r43 = r42 + r5;
        r9.g = r43;
        int r52 = r9.c;
        if (r52 >= 0) goto L30;
        r9.g = r43 + r52;
    L30:
        T0(r8, r9);
    L31:
        if (r11 == false) goto L9;
        if (r32.d == false) goto L9;
    L21:
        if (r9.k != null) goto L24;
        if (r10.g == true) goto L25;
        goto L24
    }

    public final View G0(boolean r3) {
        if (this.u == false) goto L7;
        return K0(0, v(), r3);
    L7:
        return K0(v() - 1, -1, r3);
    }

    public final View H0(boolean r3) {
        if (this.u == false) goto L7;
        return K0(v() - 1, -1, r3);
    L7:
        return K0(0, v(), r3);
    }

    public final int I0() {
        View r0 = K0(v() - 1, -1, false);
        if (r0 != null) goto L6;
        return -1;
    L6:
        return nz.F(r0);
    }

    @Override // defpackage.nz
    public final boolean J() {
        return true;
    }

    public final View J0(int r4, int r5) {
        E0();
        if (r5 > r4) goto L7;
        if (r5 < r4) goto L7;
        return u(r4);
    L7:
        if (this.r.e(u(r4)) >= this.r.k()) goto L9;
        int r0 = 16644;
        int r1 = 16388;
    L11:
        if (this.p != 0) goto L15;
        return this.c.s(r4, r5, r0, r1);
    L15:
        return this.d.s(r4, r5, r0, r1);
    L9:
        r0 = 4161;
        r1 = 4097;
        goto L11
    }

    public final View K0(int r3, int r4, boolean r5) {
        E0();
        if (r5 == false) goto L5;
        int r52 = 24579;
    L7:
        if (this.p != 0) goto L11;
        return this.c.s(r3, r4, r52, 320);
    L11:
        return this.d.s(r3, r4, r52, 320);
    L5:
        r52 = 320;
        goto L7
    }

    public View L0(tz r6, yz r7, int r8, int r9, int r10) {
        E0();
        int r62 = this.r.k();
        int r72 = this.r.g();
        if (r9 <= r8) goto L5;
        int r0 = 1;
    L6:
        View r1 = null;
        View r2 = null;
    L7:
        if (r8 == r9) goto L24;
        View r3 = u(r8);
        int r4 = nz.F(r3);
        if (r4 < 0) goto L23;
        if (r4 >= r10) goto L23;
        if (((oz) r3.getLayoutParams()).a.h() == false) goto L16;
        if (r2 != null) goto L23;
        r2 = r3;
        goto L23
    L16:
        if (this.r.e(r3) < r72) goto L18;
    L21:
        if (r1 != null) goto L23;
        r1 = r3;
        goto L23
    L18:
        if (this.r.b(r3) < r62) goto L21;
        return r3;
    L23:
        r8 = r8 + r0;
        goto L7
    L24:
        if (r1 == null) goto L26;
        return r1;
    L26:
        return r2;
    L5:
        r0 = -1;
        goto L6
    }

    public final int M0(int r2, tz r3, yz r4, boolean r5) {
        int r0 = this.r.g() - r2;
        if (r0 <= 0) goto L11;
        int r32 = -W0(-r0, r3, r4);
        int r22 = r2 + r32;
        if (r5 == false) goto L10;
        int r42 = this.r.g() - r22;
        if (r42 <= 0) goto L10;
        this.r.o(r42);
        return r42 + r32;
    L10:
        return r32;
    L11:
        return 0;
    }

    public final int N0(int r2, tz r3, yz r4, boolean r5) {
        int r0 = r2 - this.r.k();
        if (r0 <= 0) goto L10;
        int r32 = -W0(r0, r3, r4);
        int r22 = r2 + r32;
        if (r5 == false) goto L12;
        int r23 = r22 - this.r.k();
        if (r23 <= 0) goto L13;
        this.r.o(-r23);
        return r32 - r23;
    L13:
        return r32;
    L12:
        return r32;
    L10:
        return 0;
    }

    public final View O0() {
        if (this.u == false) goto L5;
        int r0 = 0;
    L7:
        return u(r0);
    L5:
        r0 = v() - 1;
        goto L7
    }

    public final View P0() {
        if (this.u == false) goto L5;
        int r0 = v() - 1;
    L7:
        return u(r0);
    L5:
        r0 = 0;
        goto L7
    }

    @Override // defpackage.nz
    public View Q(View r3, int r4, tz r5, yz r6) {
        V0();
        if (v() == 0) goto L24;
        int r32 = D0(r4);
        if (r32 == Integer.MIN_VALUE) goto L24;
        E0();
        Z0(r32, (int) (this.r.l() * 0.33333334f), false, r6);
        wq r0 = this.q;
        r0.g = Integer.MIN_VALUE;
        r0.a = false;
        F0(r5, r0, r6, true);
        if (r32 != (-1)) goto L15;
        if (this.u == false) goto L13;
        View r42 = J0(v() - 1, -1);
    L18:
        if (r32 != (-1)) goto L20;
        View r33 = P0();
    L22:
        if (r33.hasFocusable() == false) goto L26;
        if (r42 == null) goto L24;
        return r33;
    L26:
        return r42;
    L20:
        r33 = O0();
        goto L22
    L13:
        r42 = J0(0, v());
        goto L18
    L15:
        if (this.u == false) goto L17;
        r42 = J0(0, v());
        goto L18
    L17:
        r42 = J0(v() - 1, -1);
    L24:
        return null;
    }

    public final boolean Q0() {
        if (A() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // defpackage.nz
    public final void R(AccessibilityEvent r3) {
        super.R(r3);
        if (v() <= 0) goto L10;
        View r0 = K0(0, v(), false);
        if (r0 != null) goto L7;
        int r02 = -1;
    L8:
        r3.setFromIndex(r02);
        r3.setToIndex(I0());
        return;
    L7:
        r02 = nz.F(r0);
        goto L8
    }

    public void R0(tz r11, yz r12, wq r13, vq r14) {
        View r112 = r13.b(r11);
        if (r112 != null) goto L6;
        r14.b = true;
        return;
    L6:
        oz r0 = (oz) r112.getLayoutParams();
        if (r13.k != null) goto L15;
        boolean r1 = this.u;
        if (r13.f != (-1)) goto L11;
        boolean r4 = true;
    L12:
        if (r1 != r4) goto L14;
        b(r112, -1, false);
    L22:
        oz r15 = (oz) r112.getLayoutParams();
        Rect r3 = this.b.J(r112);
        int r42 = r3.left + r3.right;
        int r5 = r3.top + r3.bottom;
        int r32 = nz.w(d(), this.n, this.l, (((D() + C()) + ((ViewGroup.MarginLayoutParams) r15).leftMargin) + ((ViewGroup.MarginLayoutParams) r15).rightMargin) + r42, ((ViewGroup.MarginLayoutParams) r15).width);
        int r43 = nz.w(e(), this.o, this.m, (((B() + E()) + ((ViewGroup.MarginLayoutParams) r15).topMargin) + ((ViewGroup.MarginLayoutParams) r15).bottomMargin) + r5, ((ViewGroup.MarginLayoutParams) r15).height);
        if (s0(r112, r32, r43, r15) == false) goto L25;
        r112.measure(r32, r43);
    L25:
        r14.a = this.r.c(r112);
        if (this.p == 1) goto L28;
        int r16 = E();
        int r33 = this.r.d(r112) + r16;
        if (r13.f != (-1)) goto L38;
        int r132 = r13.b;
        int r2 = r132 - r14.a;
        int r17 = r132;
        int r133 = r33;
        int r34 = r2;
        int r22 = r16;
    L39:
        nz.L(r112, r34, r22, r17, r133);
        if (r0.a.h() == false) goto L42;
    L43:
        r14.c = true;
    L44:
        r14.d = r112.hasFocusable();
        return;
    L42:
        if (r0.a.k() == false) goto L44;
    L38:
        int r134 = r13.b;
        int r23 = r14.a + r134;
        r34 = r134;
        r133 = r33;
        r22 = r16;
        r17 = r23;
        goto L39
    L28:
        if (Q0() == false) goto L30;
        r17 = this.n - D();
        r34 = r17 - this.r.d(r112);
    L32:
        if (r13.f != (-1)) goto L34;
        r133 = r13.b;
        r22 = r133 - r14.a;
        goto L39
    L34:
        r22 = r13.b;
        r133 = r14.a + r22;
        goto L39
    L30:
        r34 = C();
        r17 = this.r.d(r112) + r34;
        goto L32
    L14:
        b(r112, 0, false);
        goto L22
    L11:
        r4 = false;
        goto L12
    L15:
        boolean r18 = this.u;
        if (r13.f != (-1)) goto L18;
        boolean r44 = true;
    L19:
        if (r18 != r44) goto L21;
        b(r112, -1, true);
        goto L22
    L21:
        b(r112, 0, true);
        goto L22
    L18:
        r44 = false;
        goto L19
    }

    public final void T0(tz r6, wq r7) {
        if (r7.a == true) goto L5;
        return;
    L5:
        if (r7.l == true) goto L71;
        int r0 = r7.g;
        int r1 = r7.i;
        if (r7.f != (-1)) goto L34;
        int r72 = v();
        if (r0 < 0) goto L72;
        int r3 = (this.r.f() - r0) + r1;
        if (this.u == false) goto L24;
        int r02 = 0;
    L15:
        if (r02 >= r72) goto L74;
        View r12 = u(r02);
        if (this.r.e(r12) < r3) goto L22;
        if (this.r.n(r12) < r3) goto L22;
        r02 = r02 + 1;
    L22:
        U0(r6, 0, r02);
        return;
    L74:
        return;
    L24:
        int r73 = r72 - 1;
        int r03 = r73;
    L25:
        if (r03 < 0) goto L75;
        View r13 = u(r03);
        if (this.r.e(r13) < r3) goto L32;
        if (this.r.n(r13) < r3) goto L32;
        r03 = r03 - 1;
    L32:
        U0(r6, r73, r03);
        return;
    L75:
        return;
    L72:
        return;
    L34:
        if (r0 < 0) goto L73;
        int r04 = r0 - r1;
        int r74 = v();
        if (this.u == false) goto L48;
        int r75 = r74 - 1;
        int r14 = r75;
    L39:
        if (r14 < 0) goto L76;
        View r2 = u(r14);
        if (this.r.b(r2) > r04) goto L46;
        if (this.r.m(r2) > r04) goto L46;
        r14 = r14 - 1;
    L46:
        U0(r6, r75, r14);
        return;
    L76:
        return;
    L48:
        int r15 = 0;
    L49:
        if (r15 >= r74) goto L77;
        View r32 = u(r15);
        if (this.r.b(r32) > r04) goto L56;
        if (this.r.m(r32) > r04) goto L56;
        r15 = r15 + 1;
    L56:
        U0(r6, 0, r15);
        return;
    L77:
        return;
    L73:
        return;
    }

    public final void U0(tz r2, int r3, int r4) {
        if (r3 == r4) goto L10;
        if (r4 <= r3) goto L8;
        int r42 = r4 - 1;
    L6:
        if (r42 < r3) goto L13;
        View r0 = u(r42);
        h0(r42);
        r2.f(r0);
        r42 = r42 - 1;
        goto L6
    L13:
        return;
    L8:
        if (r3 <= r4) goto L14;
        View r02 = u(r3);
        h0(r3);
        r2.f(r02);
        r3 = r3 - 1;
        goto L8
    L14:
        return;
    }

    public final void V0() {
        if (this.p != 1) goto L5;
    L9:
        this.u = this.t;
        return;
    L5:
        if (Q0() == false) goto L9;
        this.u = !this.t;
    }

    public final int W0(int r6, tz r7, yz r8) {
        if (v() == 0) goto L17;
        if (r6 == 0) goto L17;
        E0();
        this.q.a = true;
        if (r6 <= 0) goto L9;
        int r0 = 1;
    L10:
        int r3 = Math.abs(r6);
        Z0(r0, r3, true, r8);
        wq r2 = this.q;
        int r72 = F0(r7, r2, r8, false) + r2.g;
        if (r72 < 0) goto L17;
        if (r3 <= r72) goto L15;
        r6 = r0 * r72;
    L15:
        this.r.o(-r6);
        this.q.j = r6;
        return r6;
    L9:
        r0 = -1;
    L17:
        return 0;
    }

    public final void X0(int r4) {
        if (r4 != 0) goto L4;
    L8:
        c(null);
        if (r4 == this.p) goto L11;
    L14:
        ai r0 = ai.a(this, r4);
        this.r = r0;
        this.A.a = r0;
        this.p = r4;
        j0();
        return;
    L11:
        if (this.r == null) goto L14;
        return;
    L4:
        if (r4 == 1) goto L8;
        throw new IllegalArgumentException("invalid orientation:" + r4);
    }

    public void Y0(boolean r2) {
        c(null);
        if (this.v != r2) goto L5;
        return;
    L5:
        this.v = r2;
        j0();
    }

    @Override // defpackage.nz
    public void Z(tz r18, yz r19) {
        LinearLayoutManager r0 = this;
        yz r2 = r19;
        int r6 = -1;
        if (r0.z != null) goto L7;
        if (r0.x != (-1)) goto L7;
    L10:
        xq r1 = r0.z;
        if (r1 == null) goto L15;
        int r12 = r1.a;
        if (r12 < 0) goto L15;
        r0.x = r12;
    L15:
        r0.E0();
        r0.q.a = false;
        r0.V0();
        RecyclerView r13 = r0.b;
        if (r13 == null) goto L22;
        View r14 = r13.getFocusedChild();
        if (r14 == null) goto L22;
        if (((ArrayList) r0.a.d).contains(r14) == true) goto L22;
    L23:
        uq r9 = r0.A;
        if (r9.e == true) goto L26;
    L38:
        r9.d();
        r9.d = r0.u ^ r0.v;
        if (r2.g == true) goto L96;
        int r15 = r0.x;
        if (r15 == (-1)) goto L96;
        if (r15 >= 0) goto L45;
    L94:
        r0.x = -1;
        r0.y = Integer.MIN_VALUE;
        goto L96
    L45:
        if (r15 >= r2.b()) goto L94;
        int r16 = r0.x;
        r9.b = r16;
        xq r3 = r0.z;
        if (r3 == null) goto L57;
        if (r3.a < 0) goto L57;
        boolean r17 = r3.c;
        r9.d = r17;
        if (r17 == false) goto L55;
        r9.c = r0.r.g() - r0.z.b;
    L54:
        tz r110 = r18;
    L147:
        r9.e = true;
    L148:
        wq r32 = r0.q;
        if (r32.j < 0) goto L151;
        int r4 = 1;
    L152:
        r32.f = r4;
        int[] r33 = r0.D;
        r33[0] = 0;
        r33[1] = 0;
        r0.y0(r2, r33);
        int r5 = r0.r.k() + Math.max(0, r33[0]);
        int r42 = r0.r.h() + Math.max(0, r33[1]);
        if (r2.g == false) goto L169;
        int r34 = r0.x;
        if (r34 == (-1)) goto L169;
        if (r0.y == Integer.MIN_VALUE) goto L169;
        View r35 = r0.q(r34);
        if (r35 == null) goto L169;
        if (r0.u == false) goto L164;
        int r10 = r0.r.g() - r0.r.b(r35);
        int r36 = r0.y;
    L163:
        int r102 = r10 - r36;
        if (r102 <= 0) goto L167;
        r5 = r5 + r102;
        goto L169
    L167:
        r42 = r42 - r102;
        goto L169
    L164:
        r36 = r0.r.e(r35) - r0.r.k();
        r10 = r0.y;
    L169:
        if (r9.d == false) goto L174;
        if (r0.u == false) goto L175;
    L172:
        r6 = 1;
    L175:
        r0.S0(r110, r2, r9, r6);
        p(r18);
        wq r37 = r0.q;
        if (r0.r.i() == 0) goto L178;
    L180:
        boolean r62 = false;
    L181:
        r37.l = r62;
        r0.q.getClass();
        r0.q.i = 0;
        if (r9.d == false) goto L189;
        r0.b1(r9.b, r9.c);
        wq r38 = r0.q;
        r38.h = r5;
        r0.F0(r110, r38, r2, false);
        wq r39 = r0.q;
        int r52 = r39.b;
        int r63 = r39.d;
        int r310 = r39.c;
        if (r310 <= 0) goto L186;
        r42 = r42 + r310;
    L186:
        r0.a1(r9.b, r9.c);
        wq r311 = r0.q;
        r311.h = r42;
        r311.d += r311.e;
        r0.F0(r110, r311, r2, false);
        wq r312 = r0.q;
        int r43 = r312.b;
        int r313 = r312.c;
        if (r313 <= 0) goto L196;
        r0.b1(r63, r52);
        wq r53 = r0.q;
        r53.h = r313;
        r0.F0(r110, r53, r2, false);
        r52 = r0.q.b;
    L196:
        if (r0.v() <= 0) goto L203;
        if ((r0.u ^ r0.v) == false) goto L201;
        int r314 = r0.M0(r43, r110, r2, true);
        int r54 = r52 + r314;
        int r44 = r43 + r314;
        int r315 = r0.N0(r54, r110, r2, false);
    L200:
        r52 = r54 + r315;
        r43 = r44 + r315;
        goto L203
    L201:
        int r316 = r0.N0(r52, r110, r2, true);
        r54 = r52 + r316;
        r44 = r43 + r316;
        r315 = r0.M0(r44, r110, r2, false);
    L203:
        if (r2.k == false) goto L233;
        if (r0.v() == 0) goto L233;
        if (r2.g == true) goto L233;
        if (r0.x0() == false) goto L233;
        List r317 = r110.d;
        int r64 = r317.size();
        int r103 = nz.F(r0.u(0));
        int r122 = 0;
        int r132 = 0;
        int r142 = 0;
    L212:
        if (r122 >= r64) goto L225;
        b00 r152 = (b00) r317.get(r122);
        boolean r162 = r152.h();
        View r11 = r152.a;
        if (r162 == true) goto L224;
        if (r152.b() >= r103) goto L219;
        boolean r153 = true;
    L221:
        if (r153 == r0.u) goto L223;
        r132 = r132 + r0.r.c(r11);
        goto L224
    L223:
        r142 = r142 + r0.r.c(r11);
        goto L224
    L219:
        r153 = false;
    L224:
        r122 = r122 + 1;
        goto L212
    L225:
        r0.q.k = r317;
        if (r132 <= 0) goto L228;
        r0.b1(nz.F(r0.P0()), r52);
        wq r318 = r0.q;
        r318.h = r132;
        r318.c = 0;
        r318.a(null);
        r0.F0(r110, r0.q, r2, false);
    L228:
        if (r142 <= 0) goto L230;
        r0.a1(nz.F(r0.O0()), r43);
        wq r319 = r0.q;
        r319.h = r142;
        r319.c = 0;
        List r55 = null;
        r319.a(null);
        r0.F0(r110, r0.q, r2, false);
    L231:
        r0.q.k = r55;
        goto L233
    L230:
        r55 = null;
    L233:
        if (r2.g == true) goto L235;
        ai r111 = r0.r;
        r111.a = r111.l();
    L236:
        r0.s = r0.v;
        return;
    L235:
        r9.d();
        goto L236
    L189:
        r0.a1(r9.b, r9.c);
        wq r320 = r0.q;
        r320.h = r42;
        r0.F0(r110, r320, r2, false);
        wq r321 = r0.q;
        r43 = r321.b;
        int r65 = r321.d;
        int r322 = r321.c;
        if (r322 <= 0) goto L192;
        r5 = r5 + r322;
    L192:
        r0.b1(r9.b, r9.c);
        wq r323 = r0.q;
        r323.h = r5;
        r323.d += r323.e;
        r0.F0(r110, r323, r2, false);
        wq r324 = r0.q;
        r52 = r324.b;
        int r325 = r324.c;
        if (r325 <= 0) goto L196;
        r0.a1(r65, r43);
        wq r45 = r0.q;
        r45.h = r325;
        r0.F0(r110, r45, r2, false);
        r43 = r0.q.b;
        goto L196
    L178:
        if (r0.r.f() != 0) goto L180;
        r62 = true;
        goto L181
    L174:
        if (r0.u == false) goto L172;
    L151:
        r4 = -1;
        goto L152
    L55:
        r9.c = r0.r.k() + r0.z.b;
    L57:
        if (r0.y != Integer.MIN_VALUE) goto L90;
        View r112 = r0.q(r16);
        if (r112 == null) goto L79;
        if (r0.r.c(r112) <= r0.r.l()) goto L64;
        r9.a();
        goto L54
    L64:
        if ((r0.r.e(r112) - r0.r.k()) >= 0) goto L67;
        r9.c = r0.r.k();
        r9.d = false;
        goto L54
    L67:
        if ((r0.r.g() - r0.r.b(r112)) >= 0) goto L70;
        r9.c = r0.r.g();
        r9.d = true;
        goto L54
    L70:
        if (r9.d == false) goto L76;
        int r113 = r0.r.b(r112);
        ai r326 = r0.r;
        if (Integer.MIN_VALUE != r326.a) goto L74;
        int r46 = 0;
    L75:
        int r47 = r46 + r113;
    L77:
        r9.c = r47;
        goto L54
    L74:
        r46 = r326.l() - r326.a;
        goto L75
    L76:
        r47 = r0.r.e(r112);
        goto L77
    L79:
        if (r0.v() > 0) goto L81;
    L89:
        r9.a();
        goto L54
    L81:
        if (r0.x >= nz.F(r0.u(0))) goto L83;
        boolean r114 = true;
    L85:
        if (r114 != r0.u) goto L87;
        boolean r115 = true;
    L88:
        r9.d = r115;
        goto L89
    L87:
        r115 = false;
        goto L88
    L83:
        r114 = false;
        goto L85
    L90:
        boolean r116 = r0.u;
        r9.d = r116;
        if (r116 == false) goto L93;
        r9.c = r0.r.g() - r0.y;
        goto L54
    L93:
        r9.c = r0.r.k() + r0.y;
    L96:
        if (r0.v() != 0) goto L98;
    L97:
        r110 = r18;
    L142:
        r9.a();
        if (r0.v == false) goto L145;
        int r327 = r2.b() - 1;
    L146:
        r9.b = r327;
        goto L147
    L145:
        r327 = 0;
        goto L146
    L98:
        RecyclerView r117 = r0.b;
        if (r117 == null) goto L105;
        View r118 = r117.getFocusedChild();
        if (r118 == null) goto L105;
        if (((ArrayList) r0.a.d).contains(r118) == true) goto L105;
    L106:
        if (r118 == null) goto L115;
        oz r328 = (oz) r118.getLayoutParams();
        if (r328.a.h() == true) goto L115;
        if (r328.a.b() < 0) goto L115;
        if (r328.a.b() >= r2.b()) goto L115;
        r9.c(r118, nz.F(r118));
    L115:
        if (r0.s != r0.v) goto L97;
        if (r9.d == false) goto L125;
        if (r0.u == false) goto L122;
        View r329 = r0.L0(r18, r2, 0, r0.v(), r2.b());
        r0 = this;
    L123:
        r110 = r18;
        r2 = r19;
    L128:
        if (r329 == null) goto L142;
        r9.b(r329, nz.F(r329));
        if (r2.g == true) goto L147;
        if (r0.x0() == false) goto L147;
        if (r0.r.e(r329) >= r0.r.g()) goto L138;
        if (r0.r.b(r329) >= r0.r.k()) goto L147;
    L138:
        if (r9.d == false) goto L140;
        int r330 = r0.r.g();
    L141:
        r9.c = r330;
        goto L147
    L140:
        r330 = r0.r.k();
        goto L141
    L122:
        r0 = this;
        r329 = r0.L0(r18, r19, v() - 1, -1, r19.b());
        goto L123
    L125:
        if (r0.u == false) goto L127;
        r110 = r18;
        r2 = r19;
        r329 = r0.L0(r110, r2, r0.v() - 1, -1, r19.b());
        r0 = this;
        goto L128
    L127:
        r0 = this;
        r110 = r18;
        r2 = r19;
        r329 = r0.L0(r110, r2, 0, v(), r19.b());
    L105:
        r118 = null;
        goto L106
    L26:
        if (r0.x != (-1)) goto L38;
        if (r0.z != null) goto L38;
        if (r14 != null) goto L32;
    L36:
        r110 = r18;
        goto L148
    L32:
        if (r0.r.e(r14) < r0.r.g()) goto L34;
    L37:
        r9.c(r14, nz.F(r14));
        goto L36
    L34:
        if (r0.r.b(r14) > r0.r.k()) goto L36;
    L22:
        r14 = null;
    L7:
        if (r2.b() != 0) goto L10;
        e0(r18);
    }

    public final void Z0(int r5, int r6, boolean r7, yz r8) {
        wq r0 = this.q;
        boolean r2 = false;
        int r3 = 1;
        if (this.r.i() == 0) goto L5;
    L7:
        boolean r1 = false;
    L8:
        r0.l = r1;
        this.q.f = r5;
        int[] r02 = this.D;
        r02[0] = 0;
        r02[1] = 0;
        y0(r8, r02);
        int r82 = Math.max(0, r02[0]);
        int r03 = Math.max(0, r02[1]);
        if (r5 != 1) goto L11;
        r2 = true;
    L11:
        wq r52 = this.q;
        if (r2 == false) goto L14;
        int r12 = r03;
    L15:
        r52.h = r12;
        if (r2 == true) goto L19;
        r82 = r03;
    L19:
        r52.i = r82;
        if (r2 == false) goto L25;
        r52.h = this.r.h() + r12;
        View r53 = O0();
        wq r04 = this.q;
        if (this.u == false) goto L24;
        r3 = -1;
    L24:
        r04.e = r3;
        int r83 = nz.F(r53);
        wq r13 = this.q;
        r04.d = r83 + r13.e;
        r13.b = this.r.b(r53);
        int r54 = this.r.b(r53) - this.r.g();
    L30:
        wq r84 = this.q;
        r84.c = r6;
        if (r7 == false) goto L33;
        r84.c = r6 - r54;
    L33:
        r84.g = r54;
        return;
    L25:
        View r55 = P0();
        wq r05 = this.q;
        r05.h = this.r.k() + r05.h;
        wq r06 = this.q;
        if (this.u == true) goto L29;
        r3 = -1;
    L29:
        r06.e = r3;
        int r85 = nz.F(r55);
        wq r14 = this.q;
        r06.d = r85 + r14.e;
        r14.b = this.r.e(r55);
        r54 = (-this.r.e(r55)) + this.r.k();
        goto L30
    L14:
        r12 = r82;
        goto L15
    L5:
        if (this.r.f() != 0) goto L7;
        r1 = true;
        goto L8
    }

    @Override // defpackage.xz
    public final PointF a(int r4) {
        if (v() != 0) goto L6;
        return null;
    L6:
        boolean r0 = false;
        int r2 = 1;
        if (r4 >= nz.F(u(0))) goto L10;
        r0 = true;
    L10:
        if (r0 == this.u) goto L13;
        r2 = -1;
    L13:
        if (this.p != 0) goto L17;
        return new PointF(r2, 0.0f);
    L17:
        return new PointF(0.0f, r2);
    }

    @Override // defpackage.nz
    public void a0(yz r1) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void a1(int r4, int r5) {
        this.q.c = this.r.g() - r5;
        wq r0 = this.q;
        if (this.u == false) goto L5;
        int r1 = -1;
    L6:
        r0.e = r1;
        r0.d = r4;
        r0.f = 1;
        r0.b = r5;
        r0.g = Integer.MIN_VALUE;
        return;
    L5:
        r1 = 1;
        goto L6
    }

    @Override // defpackage.nz
    public final void b0(Parcelable r2) {
        if ((r2 instanceof xq) == false) goto L6;
        this.z = (xq) r2;
        j0();
        return;
    }

    public final void b1(int r3, int r4) {
        this.q.c = r4 - this.r.k();
        wq r0 = this.q;
        r0.d = r3;
        if (this.u == false) goto L5;
        int r32 = 1;
    L6:
        r0.e = r32;
        r0.f = -1;
        r0.b = r4;
        r0.g = Integer.MIN_VALUE;
        return;
    L5:
        r32 = -1;
        goto L6
    }

    @Override // defpackage.nz
    public final void c(String r2) {
        if (this.z != null) goto L6;
        super.c(r2);
        return;
    }

    @Override // defpackage.nz
    public final Parcelable c0() {
        xq r0 = this.z;
        if (r0 == null) goto L6;
        xq r1 = new xq();
        r1.a = r0.a;
        r1.b = r0.b;
        r1.c = r0.c;
        return r1;
    L6:
        xq r02 = new xq();
        if (v() <= 0) goto L14;
        E0();
        boolean r12 = this.s ^ this.u;
        r02.c = r12;
        if (r12 == false) goto L12;
        View r13 = O0();
        r02.b = this.r.g() - this.r.b(r13);
        r02.a = nz.F(r13);
        return r02;
    L12:
        View r14 = P0();
        r02.a = nz.F(r14);
        r02.b = this.r.e(r14) - this.r.k();
        return r02;
    L14:
        r02.a = -1;
        return r02;
    }

    @Override // defpackage.nz
    public final boolean d() {
        if (this.p != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.nz
    public final boolean e() {
        if (this.p != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // defpackage.nz
    public final void h(int r2, int r3, yz r4, bn r5) {
        if (this.p == 0) goto L7;
        r2 = r3;
    L7:
        if (v() == 0) goto L16;
        if (r2 == 0) goto L17;
        E0();
        if (r2 <= 0) goto L13;
        int r0 = 1;
    L14:
        Z0(r0, Math.abs(r2), true, r4);
        z0(r4, this.q, r5);
        return;
    L13:
        r0 = -1;
        goto L14
    L17:
        return;
    }

    @Override // defpackage.nz
    public final void i(int r6, bn r7) {
        xq r0 = this.z;
        int r1 = -1;
        if (r0 == null) goto L7;
        int r3 = r0.a;
        if (r3 < 0) goto L7;
        boolean r02 = r0.c;
    L12:
        if (r02 == true) goto L15;
        r1 = 1;
    L15:
        int r03 = 0;
    L17:
        if (r03 >= this.C) goto L21;
        if (r3 < 0) goto L25;
        if (r3 >= r6) goto L26;
        r7.a(r3, 0);
        r3 = r3 + r1;
        r03 = r03 + 1;
        goto L17
    L26:
        return;
    L25:
        return;
    L21:
        return;
    L7:
        V0();
        r02 = this.u;
        r3 = this.x;
        if (r3 != (-1)) goto L12;
        if (r02 == false) goto L11;
        r3 = r6 - 1;
        goto L12
    L11:
        r3 = 0;
        goto L12
    }

    @Override // defpackage.nz
    public final int j(yz r1) {
        return A0(r1);
    }

    @Override // defpackage.nz
    public int k(yz r1) {
        return B0(r1);
    }

    @Override // defpackage.nz
    public int k0(int r3, tz r4, yz r5) {
        if (this.p != 1) goto L7;
        return 0;
    L7:
        return W0(r3, r4, r5);
    }

    @Override // defpackage.nz
    public int l(yz r1) {
        return C0(r1);
    }

    @Override // defpackage.nz
    public final void l0(int r2) {
        this.x = r2;
        this.y = Integer.MIN_VALUE;
        xq r22 = this.z;
        if (r22 == null) goto L5;
        r22.a = -1;
    L5:
        j0();
    }

    @Override // defpackage.nz
    public final int m(yz r1) {
        return A0(r1);
    }

    @Override // defpackage.nz
    public int m0(int r2, tz r3, yz r4) {
        if (this.p != 0) goto L7;
        return 0;
    L7:
        return W0(r2, r3, r4);
    }

    @Override // defpackage.nz
    public int n(yz r1) {
        return B0(r1);
    }

    @Override // defpackage.nz
    public int o(yz r1) {
        return C0(r1);
    }

    @Override // defpackage.nz
    public final View q(int r3) {
        int r0 = v();
        if (r0 != 0) goto L6;
        return null;
    L6:
        int r1 = r3 - nz.F(u(0));
        if (r1 < 0) goto L13;
        if (r1 >= r0) goto L13;
        View r02 = u(r1);
        if (nz.F(r02) != r3) goto L13;
        return r02;
    L13:
        return super.q(r3);
    }

    @Override // defpackage.nz
    public oz r() {
        return new oz(-2, -2);
    }

    @Override // defpackage.nz
    public final boolean t0() {
        if (this.m != 1073741824) goto L5;
    L15:
        return false;
    L5:
        if (this.l == 1073741824) goto L15;
        int r0 = v();
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L15;
        ViewGroup.LayoutParams r3 = u(r2).getLayoutParams();
        if (r3.width >= 0) goto L14;
        if (r3.height >= 0) goto L14;
        return true;
    L14:
        r2 = r2 + 1;
        goto L7
    }

    @Override // defpackage.nz
    public void v0(RecyclerView r2, int r3) {
        yq r0 = new yq(r2.getContext());
        r0.a = r3;
        w0(r0);
    }

    @Override // defpackage.nz
    public boolean x0() {
        if (this.z == null) goto L5;
        return false;
    L5:
        if (this.s != this.v) goto L10;
        return true;
    L10:
        return false;
    }

    public void y0(yz r4, int[] r5) {
        if (r4.a == (-1)) goto L5;
        int r42 = this.r.l();
    L7:
        if (this.q.f != (-1)) goto L9;
        int r1 = 0;
    L10:
        r5[0] = r42;
        r5[1] = r1;
        return;
    L9:
        r1 = r42;
        r42 = 0;
        goto L10
    L5:
        r42 = 0;
        goto L7
    }

    public void z0(yz r2, wq r3, bn r4) {
        int r0 = r3.d;
        if (r0 >= 0) goto L5;
        return;
    L5:
        if (r0 >= r2.b()) goto L9;
        r4.a(r0, Math.max(0, r3.g));
        return;
    }

    public LinearLayoutManager(Context r3, AttributeSet r4, int r5, int r6) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new uq();
        this.B = new vq();
        this.C = 2;
        this.D = new int[2];
        mz r32 = nz.G(r3, r4, r5, r6);
        X0(r32.a);
        boolean r42 = r32.c;
        c(null);
        if (r42 == this.t) goto L6;
        this.t = r42;
        j0();
    L6:
        Y0(r32.d);
    }

    @Override // defpackage.nz
    public final void P(RecyclerView r1) {
    }

    public void S0(tz r1, yz r2, uq r3, int r4) {
    }
}
