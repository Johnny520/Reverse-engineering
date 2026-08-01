package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cc;
import defpackage.go;
import defpackage.hb0;
import defpackage.hc;
import defpackage.k7;
import defpackage.pc;
import defpackage.qc;
import defpackage.qk;
import defpackage.rk;
import defpackage.ry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends hb0 {
    public final rk i;

    public Flow(Context r9, AttributeSet r10) {
        super(r9, r10);
        this.a = new int[32];
        this.f = new HashMap();
        this.c = r9;
        super.e(r10);
        rk r92 = new rk();
        r92.f0 = 0;
        r92.g0 = 0;
        r92.h0 = 0;
        r92.i0 = 0;
        r92.j0 = 0;
        r92.k0 = 0;
        r92.l0 = false;
        r92.m0 = 0;
        r92.n0 = 0;
        r92.o0 = new k7();
        r92.p0 = null;
        r92.q0 = -1;
        r92.r0 = -1;
        r92.s0 = -1;
        r92.t0 = -1;
        r92.u0 = -1;
        r92.v0 = -1;
        r92.w0 = 0.5f;
        r92.x0 = 0.5f;
        r92.y0 = 0.5f;
        r92.z0 = 0.5f;
        r92.A0 = 0.5f;
        r92.B0 = 0.5f;
        r92.C0 = 0;
        r92.D0 = 0;
        r92.E0 = 2;
        r92.F0 = 2;
        r92.G0 = 0;
        r92.H0 = -1;
        r92.I0 = 0;
        r92.J0 = new ArrayList();
        r92.K0 = null;
        r92.L0 = null;
        r92.M0 = null;
        r92.O0 = 0;
        this.i = r92;
        if (r10 == null) goto L83;
        TypedArray r93 = getContext().obtainStyledAttributes(r10, ry.b);
        int r102 = r93.getIndexCount();
        int r2 = 0;
    L5:
        if (r2 >= r102) goto L83;
        int r6 = r93.getIndex(r2);
        if (r6 != 0) goto L10;
        this.i.I0 = r93.getInt(r6, 0);
    L82:
        r2 = r2 + 1;
        goto L5
    L10:
        if (r6 != 1) goto L13;
        rk r7 = this.i;
        int r62 = r93.getDimensionPixelSize(r6, 0);
        r7.f0 = r62;
        r7.g0 = r62;
        r7.h0 = r62;
        r7.i0 = r62;
        goto L82
    L13:
        if (r6 != 11) goto L16;
        rk r72 = this.i;
        int r63 = r93.getDimensionPixelSize(r6, 0);
        r72.h0 = r63;
        r72.j0 = r63;
        r72.k0 = r63;
        goto L82
    L16:
        if (r6 != 12) goto L18;
        this.i.i0 = r93.getDimensionPixelSize(r6, 0);
        goto L82
    L18:
        if (r6 != 2) goto L21;
        this.i.j0 = r93.getDimensionPixelSize(r6, 0);
        goto L82
    L21:
        if (r6 != 3) goto L24;
        this.i.f0 = r93.getDimensionPixelSize(r6, 0);
        goto L82
    L24:
        if (r6 != 4) goto L27;
        this.i.k0 = r93.getDimensionPixelSize(r6, 0);
        goto L82
    L27:
        if (r6 != 5) goto L30;
        this.i.g0 = r93.getDimensionPixelSize(r6, 0);
        goto L82
    L30:
        if (r6 != 37) goto L33;
        this.i.G0 = r93.getInt(r6, 0);
        goto L82
    L33:
        if (r6 != 27) goto L36;
        this.i.q0 = r93.getInt(r6, 0);
        goto L82
    L36:
        if (r6 != 36) goto L39;
        this.i.r0 = r93.getInt(r6, 0);
        goto L82
    L39:
        if (r6 != 21) goto L42;
        this.i.s0 = r93.getInt(r6, 0);
        goto L82
    L42:
        if (r6 != 29) goto L45;
        this.i.u0 = r93.getInt(r6, 0);
        goto L82
    L45:
        if (r6 != 23) goto L48;
        this.i.t0 = r93.getInt(r6, 0);
        goto L82
    L48:
        if (r6 != 31) goto L51;
        this.i.v0 = r93.getInt(r6, 0);
        goto L82
    L51:
        if (r6 != 25) goto L54;
        this.i.w0 = r93.getFloat(r6, 0.5f);
        goto L82
    L54:
        if (r6 != 20) goto L57;
        this.i.y0 = r93.getFloat(r6, 0.5f);
        goto L82
    L57:
        if (r6 != 28) goto L60;
        this.i.A0 = r93.getFloat(r6, 0.5f);
        goto L82
    L60:
        if (r6 != 22) goto L63;
        this.i.z0 = r93.getFloat(r6, 0.5f);
        goto L82
    L63:
        if (r6 != 30) goto L66;
        this.i.B0 = r93.getFloat(r6, 0.5f);
        goto L82
    L66:
        if (r6 != 34) goto L69;
        this.i.x0 = r93.getFloat(r6, 0.5f);
        goto L82
    L69:
        if (r6 != 24) goto L72;
        this.i.E0 = r93.getInt(r6, 2);
        goto L82
    L72:
        if (r6 != 33) goto L75;
        this.i.F0 = r93.getInt(r6, 2);
        goto L82
    L75:
        if (r6 != 26) goto L78;
        this.i.C0 = r93.getDimensionPixelSize(r6, 0);
        goto L82
    L78:
        if (r6 != 35) goto L80;
        this.i.D0 = r93.getDimensionPixelSize(r6, 0);
        goto L82
    L80:
        if (r6 != 32) goto L82;
        this.i.H0 = r93.getInt(r6, -1);
    L83:
        this.d = this.i;
        g();
    }

    @Override // defpackage.ec
    public final void f(pc r3, boolean r4) {
        rk r32 = this.i;
        int r0 = r32.h0;
        if (r0 <= 0) goto L5;
    L8:
        if (r4 == false) goto L11;
        r32.j0 = r32.i0;
        r32.k0 = r0;
        return;
    L11:
        r32.j0 = r0;
        r32.k0 = r32.i0;
        return;
    L5:
        if (r32.i0 > 0) goto L8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hb0
    public final void h(rk r37, int r38, int r39) {
        int r9 = View.MeasureSpec.getMode(r38);
        int r10 = View.MeasureSpec.getSize(r38);
        int r11 = View.MeasureSpec.getMode(r39);
        int r12 = View.MeasureSpec.getSize(r39);
        int r13 = 0;
        if (r37 == null) goto L331;
        ArrayList r14 = r37.J0;
        if (r37.e0 <= 0) goto L39;
        k7 r1 = r37.o0;
        pc r6 = r37.I;
        if (r6 == null) goto L9;
        hc r62 = ((qc) r6).g0;
    L10:
        if (r62 != null) goto L12;
        r37.m0 = 0;
        r37.n0 = 0;
        r37.l0 = false;
    L329:
        setMeasuredDimension(r37.m0, r37.n0);
        return;
    L12:
        int r7 = 0;
    L14:
        if (r7 >= r37.e0) goto L39;
        pc r8 = r37.d0[r7];
        if (r8 == null) goto L38;
        if ((r8 instanceof go) == true) goto L38;
        int r5 = r8.h(r13);
        int r132 = r8.h(1);
        if (r5 == 3) goto L24;
    L29:
        if (r5 != 3) goto L31;
        r5 = 2;
    L31:
        if (r132 != 3) goto L33;
        r132 = 2;
    L33:
        r1.a = r5;
        r1.b = r132;
        r1.c = r8.l();
        r1.d = r8.i();
        r62.a(r8, r1);
        r8.y(r1.e);
        r8.v(r1.f);
        int r3 = r1.g;
        r8.P = r3;
        if (r3 <= 0) goto L36;
        boolean r32 = true;
    L37:
        r8.w = r32;
        goto L38
    L36:
        r32 = false;
        goto L37
    L24:
        if (r8.j == 1) goto L29;
        if (r132 != 3) goto L29;
        if (r8.k == 1) goto L29;
    L38:
        r7 = r7 + 1;
        r13 = 0;
        goto L14
    L9:
        r62 = null;
    L39:
        int r133 = r37.j0;
        int r15 = r37.k0;
        int r33 = r37.f0;
        int r52 = r37.g0;
        int[] r72 = new int[2];
        int r63 = (r10 - r133) - r15;
        int r82 = r37.I0;
        if (r82 != 1) goto L43;
        r63 = (r12 - r33) - r52;
    L43:
        if (r82 != 0) goto L52;
        if (r37.q0 != (-1)) goto L47;
        int r83 = 0;
        r37.q0 = 0;
    L49:
        if (r37.r0 != (-1)) goto L57;
        r37.r0 = r83;
    L57:
        pc[] r4 = r37.d0;
        int r84 = 0;
        int r152 = 0;
    L58:
        int r16 = r37.e0;
        int r19 = r33;
        if (r84 >= r16) goto L64;
        if (r37.d0[r84].V != 8) goto L63;
        r152 = r152 + 1;
    L63:
        r84 = r84 + 1;
        r33 = r19;
        goto L58
    L64:
        if (r152 <= 0) goto L74;
        r4 = new pc[r16 - r152];
        int r17 = 0;
        int r85 = 0;
    L67:
        if (r17 >= r37.e0) goto L72;
        pc r153 = r37.d0[r17];
        int r20 = r17;
        if (r153.V == 8) goto L71;
        r4[r85] = r153;
        r85 = r85 + 1;
    L71:
        r17 = r20 + 1;
        goto L67
    L72:
        int r154 = r85;
    L73:
        pc[] r18 = r4;
        r37.N0 = r18;
        r37.O0 = r154;
        int r34 = r37.G0;
        if (r34 != 0) goto L78;
        int r322 = r52;
        int r86 = r63;
        int[] r332 = r72;
        int r35 = r133;
        int r30 = r15;
        int r31 = r19;
        int r36 = r37.I0;
        if (r154 != 0) goto L302;
    L82:
        char r202 = 0;
        char r28 = 1;
    L309:
        int r0 = (r332[r202] + r35) + r30;
        int r110 = (r332[r28] + r31) + r322;
        if (r9 == 1073741824) goto L317;
        if (r9 != Integer.MIN_VALUE) goto L314;
        r10 = Math.min(r0, r10);
        goto L317
    L314:
        if (r9 != 0) goto L316;
        r10 = r0;
        goto L317
    L316:
        r10 = 0;
    L317:
        if (r11 == 1073741824) goto L324;
        if (r11 != Integer.MIN_VALUE) goto L321;
        r12 = Math.min(r110, r12);
        goto L324
    L321:
        if (r11 != 0) goto L323;
        r12 = r110;
        goto L324
    L323:
        r12 = 0;
    L324:
        r37.m0 = r10;
        r37.n0 = r12;
        r37.y(r10);
        r37.v(r12);
        if (r37.e0 <= 0) goto L327;
        boolean r134 = r28;
    L328:
        r37.l0 = r134;
        goto L329
    L327:
        r134 = 0;
        goto L328
    L302:
        if (r14.size() != 0) goto L304;
        qk r111 = new qk(r37, r36, r37.x, r37.y, r37.z, r37.A, r86);
        r14.add(r111);
    L305:
        int r02 = 0;
    L306:
        if (r02 >= r154) goto L308;
        r111.a(r18[r02]);
        r02 = r02 + 1;
        goto L306
    L308:
        r202 = 0;
        r332[0] = r111.d();
        r28 = 1;
        r332[1] = r111.c();
        goto L309
    L304:
        qk r03 = (qk) r14.get(0);
        r03.c = 0;
        r03.b = null;
        r03.l = 0;
        r03.m = 0;
        r03.n = 0;
        r03.o = 0;
        r03.p = 0;
        r03.f(r36, r37.x, r37.y, r37.z, r37.A, r37.j0, r37.f0, r37.k0, r37.g0, r86);
        r111 = r03;
        goto L305
    L78:
        if (r34 != 1) goto L80;
        int r310 = r37.I0;
        cc r112 = r37.A;
        cc r42 = r37.z;
        if (r154 != 0) goto L203;
        r332 = r72;
        r35 = r133;
        r30 = r15;
        r31 = r19;
        r322 = r52;
        goto L82
    L203:
        r14.clear();
        int r27 = r63;
        r35 = r133;
        r30 = r15;
        r31 = r19;
        r322 = r52;
        r332 = r72;
        int r135 = 3;
        qk r113 = new qk(r37, r310, r37.x, r37.y, r37.z, r37.A, r27);
        r14.add(r113);
        if (r310 != 0) goto L232;
        qk r64 = r113;
        int r114 = 0;
        int r43 = 0;
        int r53 = 0;
    L206:
        if (r114 >= r154) goto L260;
        pc r73 = r18[r114];
        int r182 = r37.D(r73, r27);
        int r192 = r114;
        if (r73.c0[0] != r135) goto L210;
        r43 = r43 + 1;
    L210:
        int r203 = r43;
        if (r53 == r27) goto L215;
        if (((r37.C0 + r53) + r182) > r27) goto L215;
    L217:
        boolean r115 = false;
    L218:
        if (r115 == true) goto L225;
        if (r192 <= 0) goto L225;
        int r44 = r37.H0;
        if (r44 <= 0) goto L225;
        if ((r192 % r44) != 0) goto L225;
        r115 = true;
    L225:
        if (r115 == false) goto L228;
        int r136 = r192;
        pc r04 = r73;
        qk r116 = new qk(r37, r310, r37.x, r37.y, r37.z, r37.A, r27);
        r116.n = r136;
        r14.add(r116);
        r64 = r116;
    L227:
        r53 = r182;
    L231:
        r64.a(r04);
        r114 = r136 + 1;
        r43 = r203;
        r135 = 3;
        goto L206
    L228:
        r04 = r73;
        r136 = r192;
        if (r136 <= 0) goto L227;
        r53 = (r37.C0 + r182) + r53;
    L215:
        if (r64.b == null) goto L217;
        r115 = true;
    L260:
        int r05 = r14.size();
        cc r117 = r37.x;
        cc r54 = r37.y;
        int r65 = r37.j0;
        int r74 = r37.f0;
        int r137 = r37.k0;
        int r155 = r37.g0;
        int[] r118 = r37.c0;
        int r382 = r310;
        if (r118[0] != 2) goto L263;
    L266:
        boolean r119 = true;
    L267:
        if (r43 <= 0) goto L276;
        if (r119 == false) goto L276;
        int r120 = 0;
    L270:
        if (r120 >= r05) goto L276;
        qk r311 = (qk) r14.get(r120);
        if (r382 != 0) goto L274;
        r311.e(r27 - r311.d());
    L275:
        r120 = r120 + 1;
        goto L270
    L274:
        r311.e(r27 - r311.c());
    L276:
        cc r204 = r54;
        int r23 = r65;
        int r24 = r74;
        int r25 = r137;
        int r26 = r155;
        cc r22 = r112;
        cc r193 = r117;
        cc r21 = r42;
        int r121 = 0;
        int r312 = 0;
        int r45 = 0;
    L277:
        if (r121 >= r05) goto L297;
        qk r55 = (qk) r14.get(r121);
        if (r382 == 0) goto L281;
        int r183 = r382;
        if (r121 >= (r05 - 1)) goto L291;
        r21 = ((qk) r14.get(r121 + 1)).b.x;
        r25 = 0;
    L292:
        cc r66 = r55.b.z;
        r55.f(r183, r193, r204, r21, r22, r23, r24, r25, r26, r27);
        int r56 = r55.d() + r312;
        int r313 = Math.max(r45, r55.c());
        if (r121 <= 0) goto L295;
        r56 = r56 + r37.C0;
    L295:
        r45 = r313;
        r312 = r56;
        r193 = r66;
        r23 = 0;
    L296:
        r121 = r121 + 1;
        r382 = r183;
        goto L277
    L291:
        r25 = r37.k0;
        r21 = r42;
        goto L292
    L281:
        if (r121 >= (r05 - 1)) goto L283;
        r22 = ((qk) r14.get(r121 + 1)).b.y;
        r26 = 0;
    L284:
        cc r67 = r55.b.A;
        r183 = r382;
        r55.f(r183, r193, r204, r21, r22, r23, r24, r25, r26, r27);
        r312 = Math.max(r312, r55.d());
        int r57 = r55.c() + r45;
        if (r121 <= 0) goto L287;
        r57 = r57 + r37.D0;
    L287:
        r45 = r57;
        r204 = r67;
        r24 = 0;
        goto L296
    L283:
        r26 = r37.g0;
        r22 = r112;
        goto L284
    L297:
        r332[0] = r312;
        r332[1] = r45;
        goto L82
    L263:
        if (r118[1] == 2) goto L266;
        r119 = false;
        goto L267
    L232:
        qk r58 = r113;
        int r06 = 0;
        int r122 = 0;
        int r46 = 0;
    L233:
        if (r06 >= r154) goto L259;
        pc r138 = r18[r06];
        int r184 = r37.C(r138, r27);
        if (r138.c0[1] != 3) goto L237;
        r122 = r122 + 1;
    L237:
        int r194 = r122;
        if (r46 == r27) goto L242;
        if (((r37.D0 + r46) + r184) > r27) goto L242;
    L244:
        boolean r123 = false;
    L245:
        if (r123 == true) goto L252;
        if (r06 <= 0) goto L252;
        int r68 = r37.H0;
        if (r68 <= 0) goto L252;
        if ((r06 % r68) != 0) goto L252;
        r123 = true;
    L252:
        if (r123 == false) goto L256;
        qk r124 = new qk(r37, r310, r37.x, r37.y, r37.z, r37.A, r27);
        r124.n = r06;
        r14.add(r124);
        r58 = r124;
    L254:
        r46 = r184;
    L258:
        r58.a(r138);
        r06 = r06 + 1;
        r122 = r194;
        goto L233
    L256:
        if (r06 <= 0) goto L254;
        r46 = (r37.D0 + r184) + r46;
    L242:
        if (r58.b == null) goto L244;
        r123 = true;
        goto L245
    L259:
        r43 = r122;
        goto L260
    L80:
        if (r34 == 2) goto L83;
        r322 = r52;
        r332 = r72;
        r35 = r133;
        r30 = r15;
        r31 = r19;
        goto L82
    L83:
        int r314 = r37.I0;
        if (r314 != 0) goto L102;
        int r47 = r37.H0;
        if (r47 > 0) goto L101;
        int r48 = 0;
        int r87 = 0;
        int r142 = 0;
    L88:
        if (r48 >= r154) goto L100;
        int r172 = r48;
        if (r48 <= 0) goto L92;
        r87 = r87 + r37.C0;
    L92:
        pc r49 = r18[r172];
        if (r49 == null) goto L99;
        int r410 = r37.D(r49, r63) + r87;
        if (r410 > r63) goto L100;
        r142 = r142 + 1;
        r87 = r410;
    L99:
        r48 = r172 + 1;
    L100:
        r47 = r142;
    L101:
        int r143 = 0;
    L120:
        if (r37.M0 != null) goto L122;
        r37.M0 = new int[2];
    L122:
        if (r143 == 0) goto L124;
    L125:
        if (r47 != 0) goto L128;
        if (r314 != 0) goto L128;
    L127:
        int r88 = r47;
        boolean r411 = true;
    L129:
        if (r411 == true) goto L199;
        if (r314 != 0) goto L132;
        boolean r162 = r411;
        int r205 = r52;
        r143 = (int) Math.ceil(r154 / r88);
    L133:
        pc[] r412 = r37.L0;
        if (r412 == null) goto L139;
        if (r412.length < r88) goto L139;
        Arrays.fill(r412, null);
    L140:
        pc[] r413 = r37.K0;
        if (r413 != null) goto L143;
    L146:
        r37.K0 = new pc[r143];
    L147:
        int r414 = 0;
    L148:
        if (r414 >= r88) goto L172;
        int r59 = 0;
    L150:
        if (r59 >= r143) goto L171;
        int r173 = (r59 * r88) + r414;
        int r212 = r414;
        if (r314 != 1) goto L154;
        r173 = (r212 * r143) + r59;
    L154:
        int r415 = r173;
        int r174 = r314;
        if (r415 < r18.length) goto L157;
    L156:
        pc[] r222 = r18;
    L170:
        r59 = r59 + 1;
        r314 = r174;
        r414 = r212;
        r18 = r222;
        goto L150
    L157:
        pc r315 = r18[r415];
        if (r315 == null) goto L156;
        int r416 = r37.D(r315, r63);
        r222 = r18;
        pc r125 = r37.L0[r212];
        if (r125 != null) goto L163;
    L164:
        r37.L0[r212] = r315;
    L165:
        int r126 = r37.C(r315, r63);
        pc r417 = r37.K0[r59];
        if (r417 != null) goto L168;
    L169:
        r37.K0[r59] = r315;
        goto L170
    L168:
        if (r417.i() >= r126) goto L170;
    L163:
        if (r125.l() >= r416) goto L165;
    L171:
        r414 = r414 + 1;
        goto L148
    L172:
        pc[] r223 = r18;
        int r175 = r314;
        int r127 = 0;
        int r316 = 0;
    L173:
        if (r127 >= r88) goto L180;
        pc r418 = r37.L0[r127];
        if (r418 == null) goto L179;
        if (r127 <= 0) goto L178;
        r316 = r316 + r37.C0;
    L178:
        r316 = r37.D(r418, r63) + r316;
    L179:
        r127 = r127 + 1;
        goto L173
    L180:
        int r128 = 0;
        int r419 = 0;
    L181:
        if (r128 >= r143) goto L188;
        pc r510 = r37.K0[r128];
        int r213 = r128;
        if (r510 == null) goto L187;
        if (r128 <= 0) goto L186;
        r419 = r419 + r37.D0;
    L186:
        r419 = r37.C(r510, r63) + r419;
    L187:
        r128 = r213 + 1;
        goto L181
    L188:
        r72[0] = r316;
        r72[1] = r419;
        if (r175 != 0) goto L195;
        if (r316 <= r63) goto L194;
        if (r88 <= 1) goto L194;
        r88 = r88 - 1;
    L193:
        r411 = r162;
    L198:
        r314 = r175;
        r52 = r205;
        r18 = r223;
    L194:
        r411 = true;
        goto L198
    L195:
        if (r419 <= r63) goto L194;
        if (r143 <= 1) goto L194;
        r143 = r143 - 1;
        goto L193
    L143:
        if (r413.length < r143) goto L146;
        Arrays.fill(r413, null);
    L139:
        r37.L0 = new pc[r88];
        goto L140
    L132:
        r162 = r411;
        r205 = r52;
        r88 = (int) Math.ceil(r154 / r143);
        goto L133
    L199:
        int[] r317 = r37.M0;
        r317[0] = r88;
        r317[1] = r143;
        r28 = 1;
        r332 = r72;
        r35 = r133;
        r30 = r15;
        r31 = r19;
        r322 = r52;
        r202 = 0;
    L128:
        r88 = r47;
        r411 = false;
        goto L129
    L124:
        if (r314 == 1) goto L127;
    L102:
        int r420 = r37.H0;
        if (r420 > 0) goto L118;
        int r421 = 0;
        int r89 = 0;
        r143 = 0;
    L105:
        if (r421 >= r154) goto L117;
        int r176 = r421;
        if (r421 <= 0) goto L109;
        r89 = r89 + r37.D0;
    L109:
        pc r422 = r18[r176];
        if (r422 == null) goto L116;
        int r423 = r37.C(r422, r63) + r89;
        if (r423 > r63) goto L117;
        r143 = r143 + 1;
        r89 = r423;
    L116:
        r421 = r176 + 1;
    L117:
        r47 = 0;
        goto L120
    L118:
        r143 = r420;
        goto L117
    L74:
        r154 = r16;
        goto L73
    L47:
        r83 = 0;
        goto L49
    L52:
        if (r37.q0 != (-1)) goto L55;
        r37.q0 = 0;
    L55:
        if (r37.r0 != (-1)) goto L57;
        r37.r0 = 0;
        goto L57
    L331:
        setMeasuredDimension(0, 0);
    }

    @Override // defpackage.ec, android.view.View
    public final void onMeasure(int r2, int r3) {
        h(this.i, r2, r3);
    }

    public void setFirstHorizontalBias(float r2) {
        this.i.y0 = r2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int r2) {
        this.i.s0 = r2;
        requestLayout();
    }

    public void setFirstVerticalBias(float r2) {
        this.i.z0 = r2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int r2) {
        this.i.t0 = r2;
        requestLayout();
    }

    public void setHorizontalAlign(int r2) {
        this.i.E0 = r2;
        requestLayout();
    }

    public void setHorizontalBias(float r2) {
        this.i.w0 = r2;
        requestLayout();
    }

    public void setHorizontalGap(int r2) {
        this.i.C0 = r2;
        requestLayout();
    }

    public void setHorizontalStyle(int r2) {
        this.i.q0 = r2;
        requestLayout();
    }

    public void setMaxElementsWrap(int r2) {
        this.i.H0 = r2;
        requestLayout();
    }

    public void setOrientation(int r2) {
        this.i.I0 = r2;
        requestLayout();
    }

    public void setPadding(int r2) {
        rk r0 = this.i;
        r0.f0 = r2;
        r0.g0 = r2;
        r0.h0 = r2;
        r0.i0 = r2;
        requestLayout();
    }

    public void setPaddingBottom(int r2) {
        this.i.g0 = r2;
        requestLayout();
    }

    public void setPaddingLeft(int r2) {
        this.i.j0 = r2;
        requestLayout();
    }

    public void setPaddingRight(int r2) {
        this.i.k0 = r2;
        requestLayout();
    }

    public void setPaddingTop(int r2) {
        this.i.f0 = r2;
        requestLayout();
    }

    public void setVerticalAlign(int r2) {
        this.i.F0 = r2;
        requestLayout();
    }

    public void setVerticalBias(float r2) {
        this.i.x0 = r2;
        requestLayout();
    }

    public void setVerticalGap(int r2) {
        this.i.D0 = r2;
        requestLayout();
    }

    public void setVerticalStyle(int r2) {
        this.i.r0 = r2;
        requestLayout();
    }

    public void setWrapMode(int r2) {
        this.i.G0 = r2;
        requestLayout();
    }
}
