package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: m7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2221m7 extends AbstractC1449gF {

    /* JADX INFO: renamed from: k */
    public final ArrayList f7717k;

    /* JADX INFO: renamed from: l */
    public int f7718l;

    public C2221m7(C2454rb r5, int r6) {
        super(r5);
        ArrayList r52 = new ArrayList();
        this.f7717k = r52;
        this.f5062f = r6;
        C2454rb r0 = this.f5058b;
        C2454rb r62 = r0.m4935m(r6);
    L3:
        C2454rb r3 = r0;
        r0 = r62;
        if (r0 == null) goto L6;
        r62 = r0.m4935m(this.f5062f);
        goto L3
    L6:
        this.f5058b = r3;
        int r02 = this.f5062f;
        if (r02 != 0) goto L9;
        InterfaceC2542td r03 = r3.f8612d;
    L12:
        r52.add(r03);
        C2454rb r63 = r3.m4934l(this.f5062f);
    L13:
        if (r63 == null) goto L21;
        int r04 = this.f5062f;
        if (r04 != 0) goto L17;
        InterfaceC2542td r05 = r63.f8612d;
    L20:
        r52.add(r05);
        r63 = r63.m4934l(this.f5062f);
        goto L13
    L17:
        if (r04 != 1) goto L19;
        r05 = r63.f8614e;
        goto L20
    L19:
        r05 = null;
        goto L20
    L21:
        Iterator r64 = r52.iterator();
    L23:
        if (r64.hasNext() == false) goto L30;
        AbstractC1449gF r06 = (AbstractC1449gF) r64.next();
        int r1 = this.f5062f;
        if (r1 == 0) goto L26;
        if (r1 != 1) goto L23;
        r06.f5058b.f8610c = this;
        goto L23
    L26:
        r06.f5058b.f8608b = this;
        goto L23
    L30:
        if (this.f5062f != 0) goto L37;
        if (((C2497sb) this.f5058b.f8599T).f8779v0 == false) goto L37;
        if (r52.size() <= 1) goto L37;
        this.f5058b = ((AbstractC1449gF) r52.get(r52.size() - 1)).f5058b;
    L37:
        if (this.f5062f != 0) goto L39;
        int r53 = this.f5058b.f8623i0;
    L40:
        this.f7718l = r53;
        return;
    L39:
        r53 = this.f5058b.f8625j0;
        goto L40
    L9:
        if (r02 != 1) goto L11;
        r03 = r3.f8614e;
        goto L12
    L11:
        r03 = null;
        goto L12
    }

    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td r28) {
        C2628vd r1 = this.f5064h;
        if (r1.f9119j == false) goto L280;
        C2628vd r2 = this.f5065i;
        if (r2.f9119j == false) goto L322;
        C2454rb r3 = this.f5058b.f8599T;
        if ((r3 instanceof C2497sb) == false) goto L10;
        boolean r32 = ((C2497sb) r3).f8779v0;
    L11:
        int r4 = r2.f9116g - r1.f9116g;
        ArrayList r6 = this.f7717k;
        int r7 = r6.size();
        int r8 = 0;
    L12:
        int r9 = -1;
        int r10 = 8;
        if (r8 >= r7) goto L17;
        if (((AbstractC1449gF) r6.get(r8)).f5058b.f8619g0 != 8) goto L18;
        r8 = r8 + 1;
    L18:
        int r11 = r7 - 1;
        int r12 = r11;
    L19:
        if (r12 < 0) goto L24;
        if (((AbstractC1449gF) r6.get(r12)).f5058b.f8619g0 != 8) goto L23;
        r12 = r12 - 1;
        goto L19
    L23:
        r9 = r12;
    L24:
        int r122 = 0;
    L26:
        if (r122 >= 2) goto L76;
        float r19 = 0.0f;
        int r5 = 0;
        int r15 = 0;
        int r17 = 0;
        int r18 = 0;
    L28:
        if (r5 >= r7) goto L70;
        AbstractC1449gF r13 = (AbstractC1449gF) r6.get(r5);
        C2454rb r14 = r13.f5058b;
        boolean r22 = r32;
        if (r14.f8619g0 != r10) goto L32;
        int r24 = r122;
    L69:
        r5 = r5 + 1;
        r32 = r22;
        r122 = r24;
        r10 = 8;
        goto L28
    L32:
        r18 = r18 + 1;
        if (r5 <= 0) goto L36;
        if (r5 < r8) goto L36;
        r15 = r15 + r13.f5064h.f9115f;
    L36:
        C0750Rd r33 = r13.f5061e;
        int r102 = r33.f9116g;
        r24 = r122;
        if (r13.f5060d == 3) goto L39;
        boolean r103 = true;
    L40:
        if (r103 == false) goto L52;
        int r34 = this.f5062f;
        if (r34 != 0) goto L47;
        if (r14.f8612d.f5061e.f9119j == true) goto L47;
        return;
    L47:
        if (r34 == 1) goto L49;
    L51:
        boolean r25 = r103;
    L60:
        int r104 = r102;
    L61:
        if (r25 == true) goto L65;
        r17 = r17 + 1;
        float r35 = r14.f8627k0[this.f5062f];
        if (r35 < 0.0f) goto L66;
        r19 = r19 + r35;
    L66:
        if (r5 >= r11) goto L69;
        if (r5 >= r9) goto L69;
        r15 = r15 + (-r13.f5065i.f9115f);
        goto L69
    L65:
        r15 = r15 + r104;
        goto L66
    L49:
        if (r14.f8614e.f5061e.f9119j == true) goto L51;
        return;
    L52:
        r25 = r103;
        if (r13.f5057a != 1) goto L58;
        if (r24 != 0) goto L58;
        r104 = r33.f2386m;
        r17 = r17 + 1;
    L56:
        r25 = true;
    L58:
        if (r33.f9119j == false) goto L60;
        r104 = r102;
        goto L56
    L39:
        r103 = false;
        goto L40
    L70:
        boolean r222 = r32;
        int r242 = r122;
        if (r15 < r4) goto L75;
        if (r17 == 0) goto L75;
        r122 = r242 + 1;
        r32 = r222;
        r10 = 8;
    L75:
        int r36 = r17;
        int r52 = r18;
    L77:
        int r16 = r1.f9116g;
        if (r222 == false) goto L80;
        r16 = r2.f9116g;
    L80:
        float r23 = 0.5f;
        if (r15 > r4) goto L83;
    L86:
        if (r36 <= 0) goto L136;
        float r105 = r4 - r15;
        int r123 = (int) ((r105 / r36) + 0.5f);
        int r132 = 0;
        int r142 = 0;
    L88:
        if (r132 >= r7) goto L115;
        float r182 = r23;
        AbstractC1449gF r26 = (AbstractC1449gF) r6.get(r132);
        int r172 = r16;
        C2454rb r110 = r26.f5058b;
        int r232 = r36;
        C0750Rd r37 = r26.f5061e;
        float r243 = r105;
        int r252 = r123;
        if (r110.f8619g0 != 8) goto L93;
    L91:
        int r262 = r132;
    L114:
        r132 = r262 + 1;
        r16 = r172;
        r23 = r182;
        r36 = r232;
        r105 = r243;
        r123 = r252;
        goto L88
    L93:
        if (r26.f5060d != 3) goto L91;
        if (r37.f9119j == true) goto L91;
        if (r19 <= 0.0f) goto L99;
        int r106 = (int) (((r110.f8627k0[this.f5062f] * r243) / r19) + r182);
    L101:
        if (this.f5062f != 0) goto L103;
        int r124 = r110.f8643v;
        int r111 = r110.f8642u;
    L104:
        r262 = r132;
        if (r26.f5057a != 1) goto L107;
        int r27 = Math.min(r106, r37.f2386m);
    L108:
        int r112 = Math.max(r111, r27);
        if (r124 <= 0) goto L111;
        r112 = Math.min(r124, r112);
    L111:
        if (r112 == r106) goto L113;
        r142 = r142 + 1;
        r106 = r112;
    L113:
        r37.mo1539d(r106);
        goto L114
    L107:
        r27 = r106;
        goto L108
    L103:
        r124 = r110.f8646y;
        r111 = r110.f8645x;
        goto L104
    L99:
        r106 = r252;
        goto L101
    L115:
        int r173 = r16;
        float r183 = r23;
        int r233 = r36;
        if (r142 <= 0) goto L130;
        r36 = r233 - r142;
        int r113 = 0;
        r15 = 0;
    L118:
        if (r113 >= r7) goto L131;
        AbstractC1449gF r29 = (AbstractC1449gF) r6.get(r113);
        if (r29.f5058b.f8619g0 == 8) goto L129;
        if (r113 <= 0) goto L125;
        if (r113 < r8) goto L125;
        r15 = r15 + r29.f5064h.f9115f;
    L125:
        r15 = r15 + r29.f5061e.f9116g;
        if (r113 >= r11) goto L129;
        if (r113 >= r9) goto L129;
        r15 = r15 + (-r29.f5065i.f9115f);
    L129:
        r113 = r113 + 1;
    L131:
        int r210 = 2;
        if (this.f7718l != 2) goto L135;
        if (r142 != 0) goto L135;
        int r114 = 0;
        this.f7718l = 0;
    L137:
        if (r15 <= r4) goto L139;
        this.f7718l = r210;
    L139:
        if (r52 <= 0) goto L143;
        if (r36 != 0) goto L143;
        if (r8 != r9) goto L143;
        this.f7718l = r210;
    L143:
        int r211 = this.f7718l;
        if (r211 != 1) goto L191;
        if (r52 <= 1) goto L147;
        int r42 = (r4 - r15) / (r52 - 1);
    L150:
        if (r36 <= 0) goto L152;
        r42 = r114;
    L152:
        int r53 = r114;
        int r115 = r173;
    L153:
        if (r53 >= r7) goto L325;
        if (r222 == false) goto L156;
        int r212 = r7 - (r53 + 1);
    L157:
        AbstractC1449gF r213 = (AbstractC1449gF) r6.get(r212);
        C2454rb r38 = r213.f5058b;
        C2628vd r107 = r213.f5065i;
        C2628vd r125 = r213.f5064h;
        if (r38.f8619g0 != 8) goto L160;
        r125.mo1539d(r115);
        r107.mo1539d(r115);
    L190:
        r53 = r53 + 1;
        goto L153
    L160:
        if (r53 <= 0) goto L164;
        if (r222 == false) goto L163;
        r115 = r115 - r42;
        goto L164
    L163:
        r115 = r115 + r42;
    L164:
        if (r53 <= 0) goto L169;
        if (r53 < r8) goto L169;
        if (r222 == false) goto L168;
        r115 = r115 - r125.f9115f;
        goto L169
    L168:
        r115 = r115 + r125.f9115f;
    L169:
        if (r222 == false) goto L171;
        r107.mo1539d(r115);
    L172:
        C0750Rd r39 = r213.f5061e;
        int r133 = r39.f9116g;
        if (r213.f5060d == 3) goto L175;
    L177:
        if (r222 == false) goto L179;
        r115 = r115 - r133;
    L180:
        if (r222 == false) goto L183;
        r125.mo1539d(r115);
    L184:
        r213.f5063g = true;
        if (r53 >= r11) goto L190;
        if (r53 >= r9) goto L190;
        if (r222 == false) goto L189;
        r115 = r115 - (-r107.f9115f);
        goto L190
    L189:
        r115 = r115 + (-r107.f9115f);
        goto L190
    L183:
        r107.mo1539d(r115);
        goto L184
    L179:
        r115 = r115 + r133;
        goto L180
    L175:
        if (r213.f5057a != 1) goto L177;
        r133 = r39.f2386m;
        goto L177
    L171:
        r125.mo1539d(r115);
        goto L172
    L156:
        r212 = r53;
        goto L157
    L325:
        return;
    L147:
        if (r52 != 1) goto L149;
        r42 = (r4 - r15) / 2;
        goto L150
    L149:
        r42 = r114;
        goto L150
    L191:
        if (r211 != 0) goto L232;
        int r43 = (r4 - r15) / (r52 + 1);
        if (r36 <= 0) goto L195;
        r43 = r114;
    L195:
        int r54 = r114;
        int r116 = r173;
    L196:
        if (r54 >= r7) goto L326;
        if (r222 == false) goto L199;
        int r214 = r7 - (r54 + 1);
    L200:
        AbstractC1449gF r215 = (AbstractC1449gF) r6.get(r214);
        C2454rb r310 = r215.f5058b;
        C2628vd r108 = r215.f5065i;
        C2628vd r126 = r215.f5064h;
        if (r310.f8619g0 != 8) goto L203;
        r126.mo1539d(r116);
        r108.mo1539d(r116);
    L230:
        r54 = r54 + 1;
        goto L196
    L203:
        if (r222 == false) goto L205;
        int r117 = r116 - r43;
    L206:
        if (r54 <= 0) goto L211;
        if (r54 < r8) goto L211;
        if (r222 == false) goto L210;
        r117 = r117 - r126.f9115f;
        goto L211
    L210:
        r117 = r117 + r126.f9115f;
    L211:
        if (r222 == false) goto L213;
        r108.mo1539d(r117);
    L214:
        C0750Rd r311 = r215.f5061e;
        int r134 = r311.f9116g;
        if (r215.f5060d == 3) goto L217;
    L219:
        if (r222 == false) goto L221;
        r116 = r117 - r134;
    L222:
        if (r222 == false) goto L224;
        r126.mo1539d(r116);
    L225:
        if (r54 >= r11) goto L230;
        if (r54 >= r9) goto L230;
        if (r222 == false) goto L229;
        r116 = r116 - (-r108.f9115f);
        goto L230
    L229:
        r116 = r116 + (-r108.f9115f);
        goto L230
    L224:
        r108.mo1539d(r116);
        goto L225
    L221:
        r116 = r117 + r134;
        goto L222
    L217:
        if (r215.f5057a != 1) goto L219;
        r134 = Math.min(r134, r311.f2386m);
        goto L219
    L213:
        r126.mo1539d(r117);
        goto L214
    L205:
        r117 = r116 + r43;
        goto L206
    L199:
        r214 = r54;
        goto L200
    L326:
        return;
    L232:
        if (r211 == 2) goto L234;
        return;
    L234:
        if (this.f5062f != 0) goto L236;
        float r216 = this.f5058b.f8613d0;
    L237:
        if (r222 == false) goto L239;
        r216 = 1.0f - r216;
    L239:
        int r217 = (int) (((r4 - r15) * r216) + r183);
        if (r217 < 0) goto L242;
        if (r36 > 0) goto L242;
    L243:
        if (r222 == false) goto L245;
        int r218 = r173 - r217;
    L246:
        int r55 = r114;
    L247:
        if (r55 >= r7) goto L327;
        if (r222 == false) goto L250;
        int r118 = r7 - (r55 + 1);
    L251:
        AbstractC1449gF r119 = (AbstractC1449gF) r6.get(r118);
        C2454rb r312 = r119.f5058b;
        C2628vd r44 = r119.f5065i;
        C2628vd r109 = r119.f5064h;
        if (r312.f8619g0 != 8) goto L254;
        r109.mo1539d(r218);
        r44.mo1539d(r218);
    L279:
        r55 = r55 + 1;
        goto L247
    L254:
        if (r55 <= 0) goto L259;
        if (r55 < r8) goto L259;
        if (r222 == false) goto L258;
        r218 = r218 - r109.f9115f;
        goto L259
    L258:
        r218 = r218 + r109.f9115f;
    L259:
        if (r222 == false) goto L261;
        r44.mo1539d(r218);
    L262:
        C0750Rd r313 = r119.f5061e;
        int r135 = r313.f9116g;
        if (r119.f5060d != 3) goto L268;
        if (r119.f5057a != 1) goto L268;
        r135 = r313.f2386m;
    L268:
        if (r222 == false) goto L270;
        r218 = r218 - r135;
    L271:
        if (r222 == false) goto L273;
        r109.mo1539d(r218);
    L274:
        if (r55 >= r11) goto L279;
        if (r55 >= r9) goto L279;
        if (r222 == false) goto L278;
        r218 = r218 - (-r44.f9115f);
        goto L279
    L278:
        r218 = r218 + (-r44.f9115f);
        goto L279
    L273:
        r44.mo1539d(r218);
        goto L274
    L270:
        r218 = r218 + r135;
        goto L271
    L261:
        r109.mo1539d(r218);
        goto L262
    L250:
        r118 = r55;
        goto L251
    L327:
        return;
    L245:
        r218 = r173 + r217;
    L242:
        r217 = r114;
        goto L243
    L236:
        r216 = this.f5058b.f8615e0;
    L135:
        r114 = 0;
        goto L137
    L130:
        r36 = r233;
        goto L131
    L136:
        r173 = r16;
        r183 = 0.5f;
        r114 = 0;
        r210 = 2;
        goto L137
    L83:
        if (r222 == false) goto L85;
        r16 = r16 + ((int) (((r15 - r4) / 2.0f) + 0.5f));
        goto L86
    L85:
        r16 = r16 - ((int) (((r15 - r4) / 2.0f) + 0.5f));
        goto L86
    L76:
        r222 = r32;
        r19 = 0.0f;
        r36 = 0;
        r52 = 0;
        r15 = 0;
        goto L77
    L17:
        r8 = -1;
        goto L18
    L10:
        r32 = false;
        goto L11
    L322:
        return;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        ArrayList r0 = this.f7717k;
        Iterator r1 = r0.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((AbstractC1449gF) r1.next()).mo1547d();
        goto L4
    L6:
        int r12 = r0.size();
        if (r12 >= 1) goto L9;
        return;
    L9:
        C2454rb r4 = ((AbstractC1449gF) r0.get(0)).f5058b;
        C2454rb r02 = ((AbstractC1449gF) r0.get(r12 - 1)).f5058b;
        int r13 = this.f5062f;
        C2628vd r5 = this.f5065i;
        C2628vd r6 = this.f5064h;
        if (r13 != 0) goto L21;
        C1259cb r14 = r4.f8588I;
        C1259cb r03 = r02.f8590K;
        C2628vd r2 = AbstractC1449gF.m2776i(r14, 0);
        int r15 = r14.m2384e();
        C2454rb r42 = m4472m();
        if (r42 == null) goto L14;
        r15 = r42.f8588I.m2384e();
    L14:
        if (r2 == null) goto L16;
        AbstractC1449gF.m2774b(r6, r2, r15);
    L16:
        C2628vd r16 = AbstractC1449gF.m2776i(r03, 0);
        int r04 = r03.m2384e();
        C2454rb r22 = m4473n();
        if (r22 == null) goto L19;
        r04 = r22.f8590K.m2384e();
    L19:
        if (r16 == null) goto L31;
        AbstractC1449gF.m2774b(r5, r16, -r04);
    L31:
        r6.f9110a = this;
        r5.f9110a = this;
        return;
    L21:
        C1259cb r17 = r4.f8589J;
        C1259cb r05 = r02.f8591L;
        C2628vd r3 = AbstractC1449gF.m2776i(r17, 1);
        int r18 = r17.m2384e();
        C2454rb r43 = m4472m();
        if (r43 == null) goto L24;
        r18 = r43.f8589J.m2384e();
    L24:
        if (r3 == null) goto L26;
        AbstractC1449gF.m2774b(r6, r3, r18);
    L26:
        C2628vd r19 = AbstractC1449gF.m2776i(r05, 1);
        int r06 = r05.m2384e();
        C2454rb r23 = m4473n();
        if (r23 == null) goto L29;
        r06 = r23.f8591L.m2384e();
    L29:
        if (r19 == null) goto L31;
        AbstractC1449gF.m2774b(r5, r19, -r06);
        goto L31
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f7717k;
        if (r0 >= r1.size()) goto L6;
        ((AbstractC1449gF) r1.get(r0)).mo1548e();
        r0 = r0 + 1;
        goto L3
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        Iterator r0 = this.f7717k.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((AbstractC1449gF) r0.next()).mo1549f();
        goto L4
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: j */
    public final long mo2779j() {
        ArrayList r0 = this.f7717k;
        int r1 = r0.size();
        long r2 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L5;
        AbstractC1449gF r5 = (AbstractC1449gF) r0.get(r4);
        long r22 = r2 + ((long) r5.f5064h.f9115f);
        long r6 = r5.mo2779j() + r22;
        r2 = ((long) r5.f5065i.f9115f) + r6;
        r4 = r4 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        ArrayList r0 = this.f7717k;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((AbstractC1449gF) r0.get(r3)).mo1550k() == false) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C2454rb m4472m() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f7717k;
        if (r0 >= r1.size()) goto L9;
        C2454rb r12 = ((AbstractC1449gF) r1.get(r0)).f5058b;
        if (r12.f8619g0 != 8) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final C2454rb m4473n() {
        ArrayList r0 = this.f7717k;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L8;
        C2454rb r2 = ((AbstractC1449gF) r0.get(r1)).f5058b;
        if (r2.f8619g0 != 8) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ChainRun ");
        if (this.f5062f != 0) goto L5;
        String r1 = "horizontal : ";
    L6:
        r0.append(r1);
        Iterator r12 = this.f7717k.iterator();
    L8:
        if (r12.hasNext() == false) goto L11;
        AbstractC1449gF r2 = (AbstractC1449gF) r12.next();
        r0.append("<");
        r0.append(r2);
        r0.append("> ");
        goto L8
    L11:
        return r0.toString();
    L5:
        r1 = "vertical : ";
        goto L6
    }
}
