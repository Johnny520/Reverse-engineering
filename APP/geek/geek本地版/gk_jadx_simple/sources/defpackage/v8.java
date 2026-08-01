package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v8 extends qb0 {
    public final ArrayList k;
    public int l;

    public v8(pc r6, int r7) {
        super(r6);
        ArrayList r62 = new ArrayList();
        this.k = r62;
        this.f = r7;
        pc r0 = this.b;
        pc r72 = r0.k(r7);
    L3:
        pc r4 = r0;
        r0 = r72;
        if (r0 == null) goto L6;
        r72 = r0.k(this.f);
        goto L3
    L6:
        this.b = r4;
        int r02 = this.f;
        if (r02 != 0) goto L9;
        Object r03 = r4.d;
    L12:
        r62.add(r03);
        pc r73 = r4.j(this.f);
    L13:
        if (r73 == null) goto L21;
        int r04 = this.f;
        if (r04 != 0) goto L17;
        Object r05 = r73.d;
    L20:
        r62.add(r05);
        r73 = r73.j(this.f);
        goto L13
    L17:
        if (r04 != 1) goto L19;
        r05 = r73.e;
        goto L20
    L19:
        r05 = null;
        goto L20
    L21:
        int r74 = r62.size();
        int r06 = 0;
    L22:
        if (r06 >= r74) goto L29;
        Object r1 = r62.get(r06);
        r06 = r06 + 1;
        qb0 r12 = (qb0) r1;
        int r3 = this.f;
        if (r3 == 0) goto L25;
        if (r3 != 1) goto L22;
        r12.b.c = this;
        goto L22
    L25:
        r12.b.b = this;
        goto L22
    L29:
        if (this.f != 0) goto L36;
        if (((qc) this.b.I).h0 == false) goto L36;
        if (r62.size() <= 1) goto L36;
        this.b = ((qb0) r62.get(r62.size() - 1)).b;
    L36:
        if (this.f != 0) goto L38;
        int r63 = this.b.X;
    L39:
        this.l = r63;
        return;
    L38:
        r63 = this.b.Y;
        goto L39
    L9:
        if (r02 != 1) goto L11;
        r03 = r4.e;
        goto L12
    L11:
        r03 = null;
        goto L12
    }

    @Override // defpackage.hg
    public final void a(hg r28) {
        jg r1 = this.h;
        if (r1.j == false) goto L289;
        jg r2 = this.i;
        if (r2.j == false) goto L331;
        pc r3 = this.b.I;
        if (r3 != null) goto L10;
    L12:
        boolean r32 = false;
    L13:
        int r5 = r2.g - r1.g;
        ArrayList r6 = this.k;
        int r7 = r6.size();
        int r8 = 0;
    L14:
        int r9 = -1;
        int r10 = 8;
        if (r8 >= r7) goto L19;
        if (((qb0) r6.get(r8)).b.V != 8) goto L20;
        r8 = r8 + 1;
    L20:
        int r11 = r7 - 1;
        int r12 = r11;
    L21:
        if (r12 < 0) goto L26;
        if (((qb0) r6.get(r12)).b.V != 8) goto L25;
        r12 = r12 - 1;
        goto L21
    L25:
        r9 = r12;
    L26:
        int r122 = 0;
    L28:
        if (r122 >= 2) goto L78;
        float r19 = 0.0f;
        int r4 = 0;
        int r15 = 0;
        int r17 = 0;
        int r18 = 0;
    L30:
        if (r4 >= r7) goto L72;
        qb0 r13 = (qb0) r6.get(r4);
        pc r14 = r13.b;
        boolean r22 = r32;
        if (r14.V != r10) goto L34;
        int r24 = r122;
    L71:
        r4 = r4 + 1;
        r32 = r22;
        r122 = r24;
        r10 = 8;
        goto L30
    L34:
        r18 = r18 + 1;
        if (r4 <= 0) goto L38;
        if (r4 < r8) goto L38;
        r15 = r15 + r13.h.f;
    L38:
        sg r33 = r13.e;
        int r102 = r33.g;
        r24 = r122;
        if (r13.d == 3) goto L41;
        boolean r103 = true;
    L42:
        if (r103 == false) goto L54;
        int r34 = this.f;
        if (r34 != 0) goto L49;
        if (r14.d.e.j == true) goto L49;
        return;
    L49:
        if (r34 == 1) goto L51;
    L53:
        boolean r25 = r103;
    L62:
        int r104 = r102;
    L63:
        if (r25 == true) goto L67;
        r17 = r17 + 1;
        float r35 = r14.Z[this.f];
        if (r35 < 0.0f) goto L68;
        r19 = r19 + r35;
    L68:
        if (r4 >= r11) goto L71;
        if (r4 >= r9) goto L71;
        r15 = r15 + (-r13.i.f);
        goto L71
    L67:
        r15 = r15 + r104;
        goto L68
    L51:
        if (r14.e.e.j == true) goto L53;
        return;
    L54:
        r25 = r103;
        if (r13.a != 1) goto L60;
        if (r24 != 0) goto L60;
        r104 = r33.m;
        r17 = r17 + 1;
    L58:
        r25 = true;
    L60:
        if (r33.j == false) goto L62;
        r104 = r102;
        goto L58
    L41:
        r103 = false;
        goto L42
    L72:
        boolean r222 = r32;
        int r242 = r122;
        if (r15 < r5) goto L77;
        if (r17 == 0) goto L77;
        r122 = r242 + 1;
        r32 = r222;
        r10 = 8;
    L77:
        int r36 = r17;
        int r42 = r18;
    L79:
        int r16 = r1.g;
        if (r222 == false) goto L82;
        r16 = r2.g;
    L82:
        float r23 = 0.5f;
        if (r15 > r5) goto L85;
    L88:
        if (r36 <= 0) goto L145;
        float r105 = r5 - r15;
        int r123 = (int) ((r105 / r36) + 0.5f);
        int r132 = 0;
        int r142 = 0;
    L90:
        if (r132 >= r7) goto L124;
        float r182 = r23;
        qb0 r26 = (qb0) r6.get(r132);
        int r172 = r16;
        pc r110 = r26.b;
        int r232 = r36;
        sg r37 = r26.e;
        float r243 = r105;
        int r252 = r123;
        if (r110.V != 8) goto L95;
    L93:
        int r262 = r132;
    L123:
        r132 = r262 + 1;
        r16 = r172;
        r23 = r182;
        r36 = r232;
        r105 = r243;
        r123 = r252;
        goto L90
    L95:
        if (r26.d != 3) goto L93;
        if (r37.j == true) goto L93;
        if (r19 <= 0.0f) goto L101;
        int r106 = (int) (((r110.Z[this.f] * r243) / r19) + r182);
    L103:
        if (this.f != 0) goto L113;
        int r124 = r110.n;
        int r111 = r110.m;
        r262 = r132;
        if (r26.a != 1) goto L107;
        int r27 = Math.min(r106, r37.m);
    L108:
        int r112 = Math.max(r111, r27);
        if (r124 <= 0) goto L111;
        r112 = Math.min(r124, r112);
    L111:
        if (r112 != r106) goto L121;
    L122:
        r37.d(r106);
    L121:
        r142 = r142 + 1;
        r106 = r112;
        goto L122
    L107:
        r27 = r106;
        goto L108
    L113:
        r262 = r132;
        int r125 = r110.q;
        int r113 = r110.p;
        if (r26.a != 1) goto L116;
        int r29 = Math.min(r106, r37.m);
    L117:
        r112 = Math.max(r113, r29);
        if (r125 <= 0) goto L120;
        r112 = Math.min(r125, r112);
    L120:
        if (r112 == r106) goto L122;
    L116:
        r29 = r106;
        goto L117
    L101:
        r106 = r252;
        goto L103
    L124:
        int r173 = r16;
        float r183 = r23;
        int r233 = r36;
        if (r142 <= 0) goto L139;
        r36 = r233 - r142;
        int r114 = 0;
        r15 = 0;
    L127:
        if (r114 >= r7) goto L140;
        qb0 r210 = (qb0) r6.get(r114);
        if (r210.b.V == 8) goto L138;
        if (r114 <= 0) goto L134;
        if (r114 < r8) goto L134;
        r15 = r15 + r210.h.f;
    L134:
        r15 = r15 + r210.e.g;
        if (r114 >= r11) goto L138;
        if (r114 >= r9) goto L138;
        r15 = r15 + (-r210.i.f);
    L138:
        r114 = r114 + 1;
    L140:
        int r211 = 2;
        if (this.l != 2) goto L144;
        if (r142 != 0) goto L144;
        int r115 = 0;
        this.l = 0;
    L146:
        if (r15 <= r5) goto L148;
        this.l = r211;
    L148:
        if (r42 <= 0) goto L152;
        if (r36 != 0) goto L152;
        if (r8 != r9) goto L152;
        this.l = r211;
    L152:
        int r212 = this.l;
        if (r212 != 1) goto L200;
        if (r42 <= 1) goto L156;
        int r52 = (r5 - r15) / (r42 - 1);
    L159:
        if (r36 <= 0) goto L161;
        r52 = r115;
    L161:
        int r43 = r115;
        int r116 = r173;
    L162:
        if (r43 >= r7) goto L334;
        if (r222 == false) goto L165;
        int r213 = r7 - (r43 + 1);
    L166:
        qb0 r214 = (qb0) r6.get(r213);
        pc r38 = r214.b;
        jg r107 = r214.i;
        jg r126 = r214.h;
        if (r38.V != 8) goto L169;
        r126.d(r116);
        r107.d(r116);
    L199:
        r43 = r43 + 1;
        goto L162
    L169:
        if (r43 <= 0) goto L173;
        if (r222 == false) goto L172;
        r116 = r116 - r52;
        goto L173
    L172:
        r116 = r116 + r52;
    L173:
        if (r43 <= 0) goto L178;
        if (r43 < r8) goto L178;
        if (r222 == false) goto L177;
        r116 = r116 - r126.f;
        goto L178
    L177:
        r116 = r116 + r126.f;
    L178:
        if (r222 == false) goto L180;
        r107.d(r116);
    L181:
        sg r39 = r214.e;
        int r133 = r39.g;
        if (r214.d == 3) goto L184;
    L186:
        if (r222 == false) goto L188;
        r116 = r116 - r133;
    L189:
        if (r222 == false) goto L192;
        r126.d(r116);
    L193:
        r214.g = true;
        if (r43 >= r11) goto L199;
        if (r43 >= r9) goto L199;
        if (r222 == false) goto L198;
        r116 = r116 - (-r107.f);
        goto L199
    L198:
        r116 = r116 + (-r107.f);
        goto L199
    L192:
        r107.d(r116);
        goto L193
    L188:
        r116 = r116 + r133;
        goto L189
    L184:
        if (r214.a != 1) goto L186;
        r133 = r39.m;
        goto L186
    L180:
        r126.d(r116);
        goto L181
    L165:
        r213 = r43;
        goto L166
    L334:
        return;
    L156:
        if (r42 != 1) goto L158;
        r52 = (r5 - r15) / 2;
        goto L159
    L158:
        r52 = r115;
        goto L159
    L200:
        if (r212 != 0) goto L241;
        int r53 = (r5 - r15) / (r42 + 1);
        if (r36 <= 0) goto L204;
        r53 = r115;
    L204:
        int r44 = r115;
        int r117 = r173;
    L205:
        if (r44 >= r7) goto L335;
        if (r222 == false) goto L208;
        int r215 = r7 - (r44 + 1);
    L209:
        qb0 r216 = (qb0) r6.get(r215);
        pc r310 = r216.b;
        jg r108 = r216.i;
        jg r127 = r216.h;
        if (r310.V != 8) goto L212;
        r127.d(r117);
        r108.d(r117);
    L239:
        r44 = r44 + 1;
        goto L205
    L212:
        if (r222 == false) goto L214;
        int r118 = r117 - r53;
    L215:
        if (r44 <= 0) goto L220;
        if (r44 < r8) goto L220;
        if (r222 == false) goto L219;
        r118 = r118 - r127.f;
        goto L220
    L219:
        r118 = r118 + r127.f;
    L220:
        if (r222 == false) goto L222;
        r108.d(r118);
    L223:
        sg r311 = r216.e;
        int r134 = r311.g;
        if (r216.d == 3) goto L226;
    L228:
        if (r222 == false) goto L230;
        r117 = r118 - r134;
    L231:
        if (r222 == false) goto L233;
        r127.d(r117);
    L234:
        if (r44 >= r11) goto L239;
        if (r44 >= r9) goto L239;
        if (r222 == false) goto L238;
        r117 = r117 - (-r108.f);
        goto L239
    L238:
        r117 = r117 + (-r108.f);
        goto L239
    L233:
        r108.d(r117);
        goto L234
    L230:
        r117 = r118 + r134;
        goto L231
    L226:
        if (r216.a != 1) goto L228;
        r134 = Math.min(r134, r311.m);
        goto L228
    L222:
        r127.d(r118);
        goto L223
    L214:
        r118 = r117 + r53;
        goto L215
    L208:
        r215 = r44;
        goto L209
    L335:
        return;
    L241:
        if (r212 == 2) goto L243;
        return;
    L243:
        if (this.f != 0) goto L245;
        float r217 = this.b.S;
    L246:
        if (r222 == false) goto L248;
        r217 = 1.0f - r217;
    L248:
        int r218 = (int) (((r5 - r15) * r217) + r183);
        if (r218 < 0) goto L251;
        if (r36 > 0) goto L251;
    L252:
        if (r222 == false) goto L254;
        int r219 = r173 - r218;
    L255:
        int r45 = r115;
    L256:
        if (r45 >= r7) goto L336;
        if (r222 == false) goto L259;
        int r119 = r7 - (r45 + 1);
    L260:
        qb0 r120 = (qb0) r6.get(r119);
        pc r312 = r120.b;
        jg r54 = r120.i;
        jg r109 = r120.h;
        if (r312.V != 8) goto L263;
        r109.d(r219);
        r54.d(r219);
    L288:
        r45 = r45 + 1;
        goto L256
    L263:
        if (r45 <= 0) goto L268;
        if (r45 < r8) goto L268;
        if (r222 == false) goto L267;
        r219 = r219 - r109.f;
        goto L268
    L267:
        r219 = r219 + r109.f;
    L268:
        if (r222 == false) goto L270;
        r54.d(r219);
    L271:
        sg r313 = r120.e;
        int r135 = r313.g;
        if (r120.d != 3) goto L277;
        if (r120.a != 1) goto L277;
        r135 = r313.m;
    L277:
        if (r222 == false) goto L279;
        r219 = r219 - r135;
    L280:
        if (r222 == false) goto L282;
        r109.d(r219);
    L283:
        if (r45 >= r11) goto L288;
        if (r45 >= r9) goto L288;
        if (r222 == false) goto L287;
        r219 = r219 - (-r54.f);
        goto L288
    L287:
        r219 = r219 + (-r54.f);
        goto L288
    L282:
        r54.d(r219);
        goto L283
    L279:
        r219 = r219 + r135;
        goto L280
    L270:
        r109.d(r219);
        goto L271
    L259:
        r119 = r45;
        goto L260
    L336:
        return;
    L254:
        r219 = r173 + r218;
    L251:
        r218 = r115;
        goto L252
    L245:
        r217 = this.b.T;
    L144:
        r115 = 0;
        goto L146
    L139:
        r36 = r233;
        goto L140
    L145:
        r173 = r16;
        r183 = 0.5f;
        r115 = 0;
        r211 = 2;
        goto L146
    L85:
        if (r222 == false) goto L87;
        r16 = r16 + ((int) (((r15 - r5) / 2.0f) + 0.5f));
        goto L88
    L87:
        r16 = r16 - ((int) (((r15 - r5) / 2.0f) + 0.5f));
        goto L88
    L78:
        r222 = r32;
        r19 = 0.0f;
        r36 = 0;
        r42 = 0;
        r15 = 0;
        goto L79
    L19:
        r8 = -1;
        goto L20
    L10:
        if ((r3 instanceof qc) == false) goto L12;
        r32 = ((qc) r3).h0;
        goto L13
    L331:
        return;
    }

    @Override // defpackage.qb0
    public final void d() {
        ArrayList r0 = this.k;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        ((qb0) r4).d();
        goto L3
    L5:
        int r12 = r0.size();
        if (r12 >= 1) goto L8;
        return;
    L8:
        pc r42 = ((qb0) r0.get(0)).b;
        pc r02 = ((qb0) r0.get(r12 - 1)).b;
        int r13 = this.f;
        jg r5 = this.i;
        jg r6 = this.h;
        if (r13 != 0) goto L20;
        cc r14 = r42.x;
        cc r03 = r02.z;
        jg r32 = qb0.i(r14, 0);
        int r15 = r14.c();
        pc r43 = m();
        if (r43 == null) goto L13;
        r15 = r43.x.c();
    L13:
        if (r32 == null) goto L15;
        qb0.b(r6, r32, r15);
    L15:
        jg r16 = qb0.i(r03, 0);
        int r04 = r03.c();
        pc r2 = n();
        if (r2 == null) goto L18;
        r04 = r2.z.c();
    L18:
        if (r16 == null) goto L30;
        qb0.b(r5, r16, -r04);
    L30:
        r6.a = this;
        r5.a = this;
        return;
    L20:
        cc r17 = r42.y;
        cc r05 = r02.A;
        jg r22 = qb0.i(r17, 1);
        int r18 = r17.c();
        pc r44 = m();
        if (r44 == null) goto L23;
        r18 = r44.y.c();
    L23:
        if (r22 == null) goto L25;
        qb0.b(r6, r22, r18);
    L25:
        jg r19 = qb0.i(r05, 1);
        int r06 = r05.c();
        pc r23 = n();
        if (r23 == null) goto L28;
        r06 = r23.A.c();
    L28:
        if (r19 == null) goto L30;
        qb0.b(r5, r19, -r06);
        goto L30
    }

    @Override // defpackage.qb0
    public final void e() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.k;
        if (r0 >= r1.size()) goto L6;
        ((qb0) r1.get(r0)).e();
        r0 = r0 + 1;
        goto L3
    }

    @Override // defpackage.qb0
    public final void f() {
        this.c = null;
        ArrayList r0 = this.k;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((qb0) r3).f();
        goto L3
    }

    @Override // defpackage.qb0
    public final long j() {
        ArrayList r0 = this.k;
        int r1 = r0.size();
        long r2 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L5;
        qb0 r5 = (qb0) r0.get(r4);
        long r22 = r2 + ((long) r5.h.f);
        long r6 = r5.j() + r22;
        r2 = ((long) r5.i.f) + r6;
        r4 = r4 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // defpackage.qb0
    public final boolean k() {
        ArrayList r0 = this.k;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((qb0) r0.get(r3)).k() == false) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    public final pc m() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.k;
        if (r0 >= r1.size()) goto L9;
        pc r12 = ((qb0) r1.get(r0)).b;
        if (r12.V != 8) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    public final pc n() {
        ArrayList r0 = this.k;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L8;
        pc r2 = ((qb0) r0.get(r1)).b;
        if (r2.V != 8) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    public final String toString() {
        if (this.f != 0) goto L5;
        String r0 = "horizontal : ";
    L6:
        String r02 = "ChainRun ".concat(r0);
        ArrayList r1 = this.k;
        int r2 = r1.size();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        r02 = z30.i(z30.i(r02, "<") + ((qb0) r4), "> ");
        goto L7
    L9:
        return r02;
    L5:
        r0 = "vertical : ";
        goto L6
    }
}
