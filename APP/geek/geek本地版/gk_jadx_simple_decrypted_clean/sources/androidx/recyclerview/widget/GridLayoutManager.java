package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bn;
import defpackage.d4;
import defpackage.eo;
import defpackage.i0;
import defpackage.j0;
import defpackage.ja0;
import defpackage.nz;
import defpackage.oz;
import defpackage.s90;
import defpackage.tz;
import defpackage.uq;
import defpackage.vq;
import defpackage.wq;
import defpackage.yz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final d4 K;
    public final Rect L;

    public GridLayoutManager(Context r3, AttributeSet r4, int r5, int r6) {
        super(r3, r4, r5, r6);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new d4(13);
        this.L = new Rect();
        j1(nz.G(r3, r4, r5, r6).b);
    }

    @Override // defpackage.nz
    public final int H(tz r3, yz r4) {
        if (this.p != 0) goto L7;
        return this.F;
    L7:
        if (r4.b() >= 1) goto L11;
        return 0;
    L11:
        return f1(r4.b() - 1, r3, r4) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View L0(tz r8, yz r9, int r10, int r11, int r12) {
        E0();
        int r0 = this.r.k();
        int r1 = this.r.g();
        if (r11 <= r10) goto L5;
        int r2 = 1;
    L6:
        View r3 = null;
        View r4 = null;
    L7:
        if (r10 == r11) goto L27;
        View r5 = u(r10);
        int r6 = nz.F(r5);
        if (r6 < 0) goto L26;
        if (r6 >= r12) goto L26;
        if (g1(r6, r8, r9) != 0) goto L26;
        if (((oz) r5.getLayoutParams()).a.h() == false) goto L19;
        if (r4 != null) goto L26;
        r4 = r5;
        goto L26
    L19:
        if (this.r.e(r5) < r1) goto L21;
    L24:
        if (r3 != null) goto L26;
        r3 = r5;
        goto L26
    L21:
        if (this.r.b(r5) < r0) goto L24;
        return r5;
    L26:
        r10 = r10 + r2;
        goto L7
    L27:
        if (r3 == null) goto L29;
        return r3;
    L29:
        return r4;
    L5:
        r2 = -1;
        goto L6
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final View Q(View r23, int r24, tz r25, yz r26) {
        tz r1 = r25;
        yz r2 = r26;
        RecyclerView r3 = this.b;
        if (r3 == null) goto L10;
        View r32 = r3.A(r23);
        if (r32 == null) goto L10;
        if (((ArrayList) this.a.d).contains(r32) == true) goto L10;
    L11:
        if (r32 == null) goto L15;
        eo r6 = (eo) r32.getLayoutParams();
        int r7 = r6.e;
        int r62 = r6.f + r7;
        if (super.Q(r23, r24, r25, r26) == null) goto L15;
        if (D0(r24) != 1) goto L19;
        boolean r5 = true;
    L21:
        if (r5 == this.u) goto L23;
        int r52 = v() - 1;
        int r10 = -1;
        int r12 = -1;
    L25:
        if (this.p == 1) goto L27;
    L29:
        boolean r13 = false;
    L30:
        int r14 = f1(r52, r1, r2);
        View r16 = null;
        int r8 = -1;
        int r15 = -1;
        int r9 = 0;
        int r11 = r52;
        int r4 = 0;
        View r53 = null;
    L31:
        View r17 = r53;
        if (r11 == r10) goto L84;
        int r54 = f1(r11, r1, r2);
        View r18 = u(r11);
        if (r18 == r32) goto L84;
        if (r18.hasFocusable() == false) goto L42;
        if (r54 == r14) goto L42;
        if (r16 != null) goto L84;
        View r182 = r32;
        int r19 = r9;
        int r21 = r10;
    L82:
        r53 = r17;
        r9 = r19;
    L83:
        r11 = r11 + r12;
        r1 = r25;
        r2 = r26;
        r32 = r182;
        r10 = r21;
    L42:
        eo r55 = (eo) r18.getLayoutParams();
        int r22 = r55.e;
        r182 = r32;
        int r33 = r55.f + r22;
        if (r18.hasFocusable() == false) goto L48;
        if (r22 != r7) goto L48;
        if (r33 != r62) goto L48;
        return r18;
    L48:
        if (r18.hasFocusable() == false) goto L51;
        if (r16 != null) goto L51;
    L53:
        r19 = r9;
        r21 = r10;
    L79:
        if (r18.hasFocusable() == false) goto L81;
        int r56 = r55.e;
        r9 = Math.min(r33, r62) - Math.max(r22, r7);
        r16 = r18;
        r15 = r56;
        r53 = r17;
        goto L83
    L81:
        int r42 = r55.e;
        r53 = r18;
        r8 = r42;
        r9 = r19;
        r4 = Math.min(r33, r62) - Math.max(r22, r7);
    L51:
        if (r18.hasFocusable() == true) goto L54;
        if (r17 == null) goto L53;
    L54:
        r21 = r10;
        int r102 = Math.min(r33, r62) - Math.max(r22, r7);
        if (r18.hasFocusable() == false) goto L65;
        if (r102 <= r9) goto L58;
    L57:
        r19 = r9;
        goto L79
    L58:
        if (r102 != r9) goto L64;
        if (r22 <= r15) goto L61;
        boolean r103 = true;
    L62:
        if (r13 != r103) goto L64;
    L61:
        r103 = false;
    L64:
        r19 = r9;
        goto L82
    L65:
        if (r16 != null) goto L64;
        r19 = r9;
        if (this.c.y(r18) == true) goto L69;
    L71:
        if (r102 > r4) goto L79;
        if (r102 != r4) goto L82;
        if (r22 <= r8) goto L76;
        boolean r92 = true;
    L77:
        if (r13 != r92) goto L82;
    L76:
        r92 = false;
        goto L77
    L69:
        if (this.d.y(r18) == false) goto L71;
    L84:
        if (r16 == null) goto L86;
        return r16;
    L86:
        return r17;
    L27:
        if (Q0() == false) goto L29;
        r13 = true;
        goto L30
    L23:
        r10 = v();
        r12 = 1;
        r52 = 0;
        goto L25
    L19:
        r5 = false;
    L15:
        return null;
    L10:
        r32 = null;
        goto L11
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(tz r19, yz r20, wq r21, vq r22) {
        int r5 = this.r.j();
        if (r5 == 1073741824) goto L5;
        boolean r9 = true;
    L7:
        if (v() <= 0) goto L9;
        int r10 = this.G[this.F];
    L10:
        if (r9 == false) goto L13;
        k1();
    L13:
        if (r21.e != 1) goto L15;
        boolean r11 = true;
    L16:
        int r12 = this.F;
        if (r11 == true) goto L19;
        r12 = g1(r21.d, r19, r20) + h1(r21.d, r19, r20);
    L19:
        int r13 = 0;
    L21:
        if (r13 >= this.F) goto L38;
        int r14 = r21.d;
        if (r14 < 0) goto L38;
        if (r14 >= r20.b()) goto L38;
        if (r12 <= 0) goto L38;
        int r142 = r21.d;
        int r15 = h1(r142, r19, r20);
        if (r15 > this.F) goto L37;
        r12 = r12 - r15;
        if (r12 < 0) goto L38;
        View r8 = r21.b(r19);
        if (r8 == null) goto L38;
        this.H[r13] = r8;
        r13 = r13 + 1;
        goto L21
    L37:
        throw new IllegalArgumentException("Item at position " + r142 + " requires " + r15 + " spans but GridLayoutManager has only " + this.F + " spans.");
    L38:
        if (r13 != 0) goto L41;
        r22.b = true;
        return;
    L41:
        if (r11 == false) goto L43;
        int r152 = 1;
        int r143 = r13;
        int r122 = 0;
    L44:
        int r6 = 0;
    L45:
        if (r122 == r143) goto L47;
        View r7 = this.H[r122];
        eo r82 = (eo) r7.getLayoutParams();
        int r72 = h1(nz.F(r7), r19, r20);
        r82.f = r72;
        r82.e = r6;
        r6 = r6 + r72;
        r122 = r122 + r152;
        goto L45
    L47:
        float r1 = 0.0f;
        int r2 = 0;
        int r62 = 0;
    L48:
        if (r2 >= r13) goto L69;
        View r73 = this.H[r2];
        if (r21.k != null) goto L54;
        if (r11 == false) goto L53;
        ?? r123 = 0;
        b(r73, -1, false);
    L58:
        RecyclerView r83 = this.b;
        Rect r144 = this.L;
        if (r83 != null) goto L61;
        r144.set(r123, r123, r123, r123);
    L62:
        i1(r73, r5, r123);
        int r84 = this.r.c(r73);
        if (r84 <= r62) goto L65;
        r62 = r84;
    L65:
        eo r85 = (eo) r73.getLayoutParams();
        float r74 = (this.r.d(r73) * 1.0f) / r85.f;
        if (r74 <= r1) goto L68;
        r1 = r74;
    L68:
        r2 = r2 + 1;
        goto L48
    L61:
        r144.set(r83.J(r73));
        goto L62
    L53:
        r123 = 0;
        b(r73, 0, false);
        goto L58
    L54:
        r123 = 0;
        r123 = 0;
        if (r11 == false) goto L57;
        b(r73, -1, true);
        goto L58
    L57:
        b(r73, 0, true);
        goto L58
    L69:
        if (r9 == false) goto L76;
        c1(Math.max(Math.round(r1 * this.F), r10));
        r62 = 0;
        int r124 = 0;
    L71:
        if (r124 >= r13) goto L76;
        View r16 = this.H[r124];
        i1(r16, 1073741824, true);
        int r17 = this.r.c(r16);
        if (r17 <= r62) goto L75;
        r62 = r17;
    L75:
        r124 = r124 + 1;
    L76:
        int r125 = 0;
    L77:
        if (r125 >= r13) goto L89;
        View r18 = this.H[r125];
        if (this.r.c(r18) == r62) goto L88;
        eo r23 = (eo) r18.getLayoutParams();
        Rect r52 = r23.b;
        int r75 = ((r52.top + r52.bottom) + ((ViewGroup.MarginLayoutParams) r23).topMargin) + ((ViewGroup.MarginLayoutParams) r23).bottomMargin;
        int r86 = ((r52.left + r52.right) + ((ViewGroup.MarginLayoutParams) r23).leftMargin) + ((ViewGroup.MarginLayoutParams) r23).rightMargin;
        int r53 = e1(r23.e, r23.f);
        if (this.p != 1) goto L83;
        int r24 = nz.w(false, r53, 1073741824, r86, ((ViewGroup.MarginLayoutParams) r23).width);
        int r54 = View.MeasureSpec.makeMeasureSpec(r62 - r75, 1073741824);
    L85:
        if (u0(r18, r24, r54, (oz) r18.getLayoutParams()) == false) goto L88;
        r18.measure(r24, r54);
        goto L88
    L83:
        int r87 = View.MeasureSpec.makeMeasureSpec(r62 - r86, 1073741824);
        r54 = nz.w(false, r53, 1073741824, r75, ((ViewGroup.MarginLayoutParams) r23).height);
        r24 = r87;
    L88:
        r125 = r125 + 1;
        goto L77
    L89:
        r22.a = r62;
        if (this.p != 1) goto L97;
        if (r21.f != (-1)) goto L95;
        int r126 = r21.b;
        int r127 = r126 - r62;
        int r110 = r126;
    L94:
        int r25 = 0;
        int r3 = 0;
    L101:
        int r76 = 0;
    L102:
        if (r76 >= r13) goto L118;
        View r55 = this.H[r76];
        eo r63 = (eo) r55.getLayoutParams();
        if (this.p == 1) goto L106;
        int r111 = E() + this.G[r63.e];
        r127 = r111;
        r110 = this.r.d(r55) + r111;
    L110:
        nz.L(r55, r25, r127, r3, r110);
        if (r63.a.h() == true) goto L116;
        if (r63.a.k() == true) goto L116;
    L117:
        r22.d = r55.hasFocusable() | r22.d;
        r76 = r76 + 1;
    L116:
        r22.c = true;
        goto L117
    L106:
        if (Q0() == false) goto L108;
        int r26 = C() + this.G[this.F - r63.e];
        r3 = r26;
        r25 = r26 - this.r.d(r55);
        goto L110
    L108:
        r25 = C() + this.G[r63.e];
        r3 = this.r.d(r55) + r25;
        goto L110
    L118:
        Arrays.fill(this.H, null);
        return;
    L95:
        r127 = r21.b;
        r110 = r127 + r62;
        goto L94
    L97:
        if (r21.f != (-1)) goto L100;
        int r128 = r21.b;
        r25 = r128 - r62;
        r110 = 0;
        r3 = r128;
    L99:
        r127 = r110;
        goto L101
    L100:
        int r129 = r21.b;
        r3 = r129 + r62;
        r110 = 0;
        r25 = r129;
        goto L99
    L43:
        r122 = r13 - 1;
        r143 = -1;
        r152 = -1;
        goto L44
    L15:
        r11 = false;
        goto L16
    L9:
        r10 = 0;
        goto L10
    L5:
        r9 = false;
        goto L7
    }

    @Override // defpackage.nz
    public final void S(tz r3, yz r4, View r5, j0 r6) {
        ViewGroup.LayoutParams r0 = r5.getLayoutParams();
        if ((r0 instanceof eo) == true) goto L6;
        T(r5, r6);
        return;
    L6:
        eo r02 = (eo) r0;
        int r32 = f1(r02.a.b(), r3, r4);
        if (this.p != 0) goto L10;
        r6.f(i0.a(false, r02.e, r02.f, r32, 1));
        return;
    L10:
        r6.f(i0.a(false, r32, 1, r02.e, r02.f));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void S0(tz r5, yz r6, uq r7, int r8) {
        k1();
        if (r6.b() > 0) goto L5;
    L22:
        d1();
        return;
    L5:
        if (r6.g == true) goto L22;
        if (r8 != 1) goto L9;
        boolean r82 = true;
    L10:
        int r1 = g1(r7.b, r5, r6);
        if (r82 == false) goto L16;
    L12:
        if (r1 <= 0) goto L22;
        int r83 = r7.b;
        if (r83 <= 0) goto L22;
        int r84 = r83 - 1;
        r7.b = r84;
        r1 = g1(r84, r5, r6);
        goto L12
    L16:
        int r85 = r6.b() - 1;
        int r0 = r7.b;
    L17:
        if (r0 >= r85) goto L21;
        int r2 = r0 + 1;
        int r3 = g1(r2, r5, r6);
        if (r3 <= r1) goto L21;
        r0 = r2;
        r1 = r3;
    L21:
        r7.b = r0;
        goto L22
    L9:
        r82 = false;
        goto L10
    }

    @Override // defpackage.nz
    public final void U(int r1, int r2) {
        d4 r12 = this.K;
        r12.x();
        ((SparseIntArray) r12.c).clear();
    }

    @Override // defpackage.nz
    public final void V() {
        d4 r0 = this.K;
        r0.x();
        ((SparseIntArray) r0.c).clear();
    }

    @Override // defpackage.nz
    public final void W(int r1, int r2) {
        d4 r12 = this.K;
        r12.x();
        ((SparseIntArray) r12.c).clear();
    }

    @Override // defpackage.nz
    public final void X(int r1, int r2) {
        d4 r12 = this.K;
        r12.x();
        ((SparseIntArray) r12.c).clear();
    }

    @Override // defpackage.nz
    public final void Y(int r1, int r2) {
        d4 r12 = this.K;
        r12.x();
        ((SparseIntArray) r12.c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(boolean r2) {
        if (r2 == true) goto L6;
        super.Y0(false);
        return;
    L6:
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void Z(tz r8, yz r9) {
        boolean r0 = r9.g;
        SparseIntArray r1 = this.J;
        SparseIntArray r2 = this.I;
        if (r0 == false) goto L7;
        int r02 = v();
        int r3 = 0;
    L5:
        if (r3 >= r02) goto L7;
        eo r4 = (eo) u(r3).getLayoutParams();
        int r5 = r4.a.b();
        r2.put(r5, r4.f);
        r1.put(r5, r4.e);
        r3 = r3 + 1;
    L7:
        super.Z(r8, r9);
        r2.clear();
        r1.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final void a0(yz r1) {
        super.a0(r1);
        this.E = false;
    }

    public final void c1(int r8) {
        int[] r0 = this.G;
        int r1 = this.F;
        int r2 = 1;
        if (r0 != null) goto L5;
    L8:
        r0 = new int[r1 + 1];
    L9:
        int r3 = 0;
        r0[0] = 0;
        int r4 = r8 / r1;
        int r82 = r8 % r1;
        int r5 = 0;
    L10:
        if (r2 > r1) goto L18;
        r3 = r3 + r82;
        if (r3 > 0) goto L14;
    L16:
        int r6 = r4;
    L17:
        r5 = r5 + r6;
        r0[r2] = r5;
        r2 = r2 + 1;
        goto L10
    L14:
        if ((r1 - r3) >= r82) goto L16;
        r6 = r4 + 1;
        r3 = r3 - r1;
        goto L17
    L18:
        this.G = r0;
        return;
    L5:
        if (r0.length != (r1 + 1)) goto L8;
        if (r0[r0.length - 1] == r8) goto L9;
        goto L8
    }

    public final void d1() {
        View[] r0 = this.H;
        if (r0 != null) goto L5;
    L8:
        this.H = new View[this.F];
        return;
    L5:
        if (r0.length != this.F) goto L8;
    }

    public final int e1(int r4, int r5) {
        if (this.p == 1) goto L5;
    L8:
        int[] r0 = this.G;
        return r0[r5 + r4] - r0[r4];
    L5:
        if (Q0() == false) goto L8;
        int[] r02 = this.G;
        int r1 = this.F;
        return r02[r1 - r4] - r02[(r1 - r4) - r5];
    }

    @Override // defpackage.nz
    public final boolean f(oz r1) {
        return r1 instanceof eo;
    }

    public final int f1(int r2, tz r3, yz r4) {
        boolean r42 = r4.g;
        d4 r0 = this.K;
        if (r42 == true) goto L6;
        int r32 = this.F;
        r0.getClass();
        return d4.v(r2, r32);
    L6:
        int r33 = r3.b(r2);
        if (r33 != (-1)) goto L10;
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + r2);
        return 0;
    L10:
        int r22 = this.F;
        r0.getClass();
        return d4.v(r33, r22);
    }

    public final int g1(int r3, tz r4, yz r5) {
        boolean r52 = r5.g;
        d4 r0 = this.K;
        if (r52 == true) goto L6;
        int r42 = this.F;
        r0.getClass();
        return r3 % r42;
    L6:
        int r53 = this.J.get(r3, -1);
        if (r53 == (-1)) goto L9;
        return r53;
    L9:
        int r43 = r4.b(r3);
        if (r43 != (-1)) goto L13;
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + r3);
        return 0;
    L13:
        int r32 = this.F;
        r0.getClass();
        return r43 % r32;
    }

    public final int h1(int r4, tz r5, yz r6) {
        boolean r62 = r6.g;
        d4 r0 = this.K;
        if (r62 == true) goto L6;
        r0.getClass();
        return 1;
    L6:
        int r63 = this.I.get(r4, -1);
        if (r63 == (-1)) goto L10;
        return r63;
    L10:
        if (r5.b(r4) != (-1)) goto L13;
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + r4);
        return 1;
    L13:
        r0.getClass();
        return 1;
    }

    public final void i1(View r9, int r10, boolean r11) {
        eo r0 = (eo) r9.getLayoutParams();
        Rect r1 = r0.b;
        int r2 = ((r1.top + r1.bottom) + ((ViewGroup.MarginLayoutParams) r0).topMargin) + ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
        int r3 = ((r1.left + r1.right) + ((ViewGroup.MarginLayoutParams) r0).leftMargin) + ((ViewGroup.MarginLayoutParams) r0).rightMargin;
        int r12 = e1(r0.e, r0.f);
        if (this.p != 1) goto L5;
        int r102 = nz.w(false, r12, r10, r3, ((ViewGroup.MarginLayoutParams) r0).width);
        int r02 = nz.w(true, this.r.l(), this.m, r2, ((ViewGroup.MarginLayoutParams) r0).height);
    L6:
        oz r13 = (oz) r9.getLayoutParams();
        if (r11 == false) goto L9;
        boolean r112 = u0(r9, r102, r02, r13);
    L10:
        if (r112 == false) goto L13;
        r9.measure(r102, r02);
        return;
    L13:
        return;
    L9:
        r112 = s0(r9, r102, r02, r13);
        goto L10
    L5:
        int r103 = nz.w(false, r12, r10, r2, ((ViewGroup.MarginLayoutParams) r0).height);
        int r03 = nz.w(true, this.r.l(), this.l, r3, ((ViewGroup.MarginLayoutParams) r0).width);
        r02 = r103;
        r102 = r03;
        goto L6
    }

    public final void j1(int r4) {
        if (r4 != this.F) goto L5;
        return;
    L5:
        this.E = true;
        if (r4 < 1) goto L10;
        this.F = r4;
        this.K.x();
        j0();
        return;
    L10:
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + r4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int k(yz r1) {
        return B0(r1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int k0(int r1, tz r2, yz r3) {
        k1();
        d1();
        return super.k0(r1, r2, r3);
    }

    public final void k1() {
        if (this.p != 1) goto L6;
        int r0 = this.n - D();
        int r1 = C();
    L7:
        c1(r0 - r1);
        return;
    L6:
        r0 = this.o - B();
        r1 = E();
        goto L7
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int l(yz r1) {
        return C0(r1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int m0(int r1, tz r2, yz r3) {
        k1();
        d1();
        return super.m0(r1, r2, r3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int n(yz r1) {
        return B0(r1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final int o(yz r1) {
        return C0(r1);
    }

    @Override // defpackage.nz
    public final void p0(Rect r5, int r6, int r7) {
        if (this.G != null) goto L5;
        super.p0(r5, r6, r7);
    L5:
        int r0 = C();
        int r1 = D() + r0;
        int r02 = E();
        int r2 = B() + r02;
        if (this.p != 1) goto L8;
        int r52 = r5.height() + r2;
        RecyclerView r03 = this.b;
        WeakHashMap r22 = ja0.a;
        int r53 = nz.g(r7, r52, s90.d(r03));
        int[] r72 = this.G;
        int r62 = nz.g(r6, r72[r72.length - 1] + r1, s90.e(this.b));
    L9:
        RecyclerView.e(this.b, r62, r53);
        return;
    L8:
        int r54 = r5.width() + r1;
        RecyclerView r04 = this.b;
        WeakHashMap r12 = ja0.a;
        r62 = nz.g(r6, r54, s90.e(r04));
        int[] r55 = this.G;
        r53 = nz.g(r7, r55[r55.length - 1] + r2, s90.d(this.b));
        goto L9
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final oz r() {
        if (this.p != 0) goto L7;
        return new eo(-2, -1);
    L7:
        return new eo(-1, -2);
    }

    @Override // defpackage.nz
    public final oz s(Context r2, AttributeSet r3) {
        eo r0 = new eo(r2, r3);
        r0.e = -1;
        r0.f = 0;
        return r0;
    }

    @Override // defpackage.nz
    public final oz t(ViewGroup.LayoutParams r4) {
        if ((r4 instanceof ViewGroup.MarginLayoutParams) == false) goto L6;
        eo r0 = new eo((ViewGroup.MarginLayoutParams) r4);
        r0.e = -1;
        r0.f = 0;
        return r0;
    L6:
        eo r02 = new eo(r4);
        r02.e = -1;
        r02.f = 0;
        return r02;
    }

    @Override // defpackage.nz
    public final int x(tz r3, yz r4) {
        if (this.p != 1) goto L7;
        return this.F;
    L7:
        if (r4.b() >= 1) goto L11;
        return 0;
    L11:
        return f1(r4.b() - 1, r3, r4) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.nz
    public final boolean x0() {
        if (this.z == null) goto L5;
        return false;
    L5:
        if (this.E == true) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(yz r6, wq r7, bn r8) {
        int r0 = this.F;
        int r2 = 0;
    L4:
        if (r2 >= this.F) goto L11;
        int r3 = r7.d;
        if (r3 < 0) goto L16;
        if (r3 >= r6.b()) goto L17;
        if (r0 <= 0) goto L18;
        r8.a(r7.d, Math.max(0, r7.g));
        this.K.getClass();
        r0 = r0 - 1;
        r7.d += r7.e;
        r2 = r2 + 1;
        goto L4
    L18:
        return;
    L17:
        return;
    L16:
        return;
    }

    public GridLayoutManager(int r3) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new d4(13);
        this.L = new Rect();
        j1(r3);
    }
}
