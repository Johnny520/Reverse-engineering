package p073o;

import java.util.ArrayList;
import java.util.Iterator;
import p034S.AbstractC0324d;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1000e;

/* JADX INFO: renamed from: o.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1014c extends AbstractC1024m {

    /* JADX INFO: renamed from: k */
    public final ArrayList f3734k;

    /* JADX INFO: renamed from: l */
    public int f3735l;

    public C1014c(C0999d r5, int r6) {
        super(r5);
        this.f3734k = new ArrayList();
        this.f3767f = r6;
        C0999d r52 = this.f3763b;
        C0999d r62 = r52.m2406k(r6);
    L3:
        C0999d r3 = r62;
        C0999d r63 = r52;
        r52 = r3;
        if (r52 == null) goto L6;
        r62 = r52.m2406k(this.f3767f);
        goto L3
    L6:
        this.f3763b = r63;
        int r53 = this.f3767f;
        if (r53 != 0) goto L9;
        InterfaceC1015d r54 = r63.f3616d;
    L12:
        ArrayList r2 = this.f3734k;
        r2.add(r54);
        C0999d r55 = r63.m2405j(this.f3767f);
    L13:
        if (r55 == null) goto L21;
        int r64 = this.f3767f;
        if (r64 != 0) goto L17;
        InterfaceC1015d r65 = r55.f3616d;
    L20:
        r2.add(r65);
        r55 = r55.m2405j(this.f3767f);
        goto L13
    L17:
        if (r64 != 1) goto L19;
        r65 = r55.f3617e;
        goto L20
    L19:
        r65 = null;
        goto L20
    L21:
        Iterator r56 = r2.iterator();
    L23:
        if (r56.hasNext() == false) goto L30;
        AbstractC1024m r66 = (AbstractC1024m) r56.next();
        int r02 = this.f3767f;
        if (r02 == 0) goto L26;
        if (r02 != 1) goto L23;
        r66.f3763b.f3614c = this;
        goto L23
    L26:
        r66.f3763b.f3612b = this;
        goto L23
    L30:
        if (this.f3767f != 0) goto L37;
        if (((C1000e) this.f3763b.f3592I).f3643h0 == false) goto L37;
        if (r2.size() <= 1) goto L37;
        this.f3763b = ((AbstractC1024m) r2.get(r2.size() - 1)).f3763b;
    L37:
        if (this.f3767f != 0) goto L39;
        int r57 = this.f3763b.f3607X;
    L40:
        this.f3735l = r57;
        return;
    L39:
        r57 = this.f3763b.f3608Y;
        goto L40
    L9:
        if (r53 != 1) goto L11;
        r54 = r63.f3617e;
        goto L12
    L11:
        r54 = null;
        goto L12
    }

    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d r27) {
        C1017f r1 = this.f3769h;
        if (r1.f3753j == false) goto L291;
        C1017f r2 = this.f3770i;
        if (r2.f3753j == false) goto L333;
        C0999d r3 = this.f3763b.f3592I;
        if (r3 != null) goto L10;
    L12:
        boolean r32 = false;
    L13:
        int r5 = r2.f3750g - r1.f3750g;
        ArrayList r6 = this.f3734k;
        int r7 = r6.size();
        int r8 = 0;
    L14:
        int r9 = -1;
        int r10 = 8;
        if (r8 >= r7) goto L19;
        if (((AbstractC1024m) r6.get(r8)).f3763b.f3605V != 8) goto L20;
        r8 = r8 + 1;
    L20:
        int r11 = r7 - 1;
        int r12 = r11;
    L21:
        if (r12 < 0) goto L26;
        if (((AbstractC1024m) r6.get(r12)).f3763b.f3605V != 8) goto L25;
        r12 = r12 - 1;
        goto L21
    L25:
        r9 = r12;
    L26:
        int r122 = 0;
    L28:
        if (r122 >= 2) goto L78;
        int r4 = 0;
        int r14 = 0;
        int r17 = 0;
        int r18 = 0;
        float r19 = 0.0f;
    L30:
        if (r4 >= r7) goto L72;
        AbstractC1024m r13 = (AbstractC1024m) r6.get(r4);
        C0999d r15 = r13.f3763b;
        ArrayList r21 = r6;
        if (r15.f3605V != r10) goto L34;
        int r23 = r8;
    L71:
        r4 = r4 + 1;
        r6 = r21;
        r8 = r23;
        r10 = 8;
        goto L30
    L34:
        r18 = r18 + 1;
        if (r4 <= 0) goto L38;
        if (r4 < r8) goto L38;
        r14 = r14 + r13.f3769h.f3749f;
    L38:
        C1018g r62 = r13.f3766e;
        int r102 = r62.f3750g;
        r23 = r8;
        if (r13.f3765d == 3) goto L41;
        boolean r82 = true;
    L42:
        if (r82 == false) goto L54;
        int r63 = this.f3767f;
        if (r63 != 0) goto L49;
        if (r15.f3616d.f3766e.f3753j == true) goto L49;
        return;
    L49:
        if (r63 == 1) goto L51;
    L53:
        boolean r24 = r82;
    L62:
        int r103 = r102;
    L63:
        if (r24 == true) goto L67;
        r17 = r17 + 1;
        float r64 = r15.f3609Z[this.f3767f];
        if (r64 < 0.0f) goto L68;
        r19 = r19 + r64;
    L68:
        if (r4 >= r11) goto L71;
        if (r4 >= r9) goto L71;
        r14 = r14 + (-r13.f3770i.f3749f);
        goto L71
    L67:
        r14 = r14 + r103;
        goto L68
    L51:
        if (r15.f3617e.f3766e.f3753j == true) goto L53;
        return;
    L54:
        r24 = r82;
        if (r13.f3762a != 1) goto L60;
        if (r122 != 0) goto L60;
        r103 = r62.f3756m;
        r17 = r17 + 1;
    L58:
        r24 = true;
    L60:
        if (r62.f3753j == false) goto L62;
        r103 = r102;
        goto L58
    L41:
        r82 = false;
        goto L42
    L72:
        ArrayList r212 = r6;
        int r232 = r8;
        if (r14 < r5) goto L77;
        if (r17 == 0) goto L77;
        r122 = r122 + 1;
        r6 = r212;
        r8 = r232;
        r10 = 8;
    L77:
        int r42 = r17;
        int r65 = r18;
    L79:
        int r16 = r1.f3750g;
        if (r32 == false) goto L83;
        r16 = r2.f3750g;
    L83:
        if (r14 > r5) goto L85;
    L88:
        if (r42 <= 0) goto L147;
        float r83 = r5 - r14;
        int r104 = (int) ((r83 / r42) + 0.5f);
        int r123 = 0;
        int r132 = 0;
    L90:
        if (r123 >= r7) goto L124;
        ArrayList r152 = r212;
        AbstractC1024m r22 = (AbstractC1024m) r152.get(r123);
        int r172 = r104;
        C0999d r105 = r22.f3763b;
        int r213 = r14;
        int r222 = r16;
        if (r105.f3605V != 8) goto L95;
    L93:
        boolean r242 = r32;
        float r25 = r83;
    L123:
        r123 = r123 + 1;
        r104 = r172;
        r14 = r213;
        r16 = r222;
        r32 = r242;
        r83 = r25;
        r212 = r152;
        goto L90
    L95:
        if (r22.f3765d != 3) goto L93;
        C1018g r110 = r22.f3766e;
        if (r110.f3753j == true) goto L93;
        if (r19 <= 0.0f) goto L101;
        r242 = r32;
        int r33 = (int) (((r105.f3609Z[this.f3767f] * r83) / r19) + 0.5f);
    L103:
        if (this.f3767f != 0) goto L113;
        int r142 = r105.f3626n;
        int r106 = r105.f3625m;
        r25 = r83;
        if (r22.f3762a != 1) goto L107;
        int r26 = Math.min(r33, r110.f3756m);
    L108:
        int r28 = Math.max(r106, r26);
        if (r142 <= 0) goto L111;
        r28 = Math.min(r142, r28);
    L111:
        if (r28 != r33) goto L121;
    L122:
        r110.mo2462d(r33);
    L121:
        r132 = r132 + 1;
        r33 = r28;
        goto L122
    L107:
        r26 = r33;
        goto L108
    L113:
        r25 = r83;
        int r84 = r105.f3629q;
        int r107 = r105.f3628p;
        if (r22.f3762a != 1) goto L116;
        int r29 = Math.min(r33, r110.f3756m);
    L117:
        r28 = Math.max(r107, r29);
        if (r84 <= 0) goto L120;
        r28 = Math.min(r84, r28);
    L120:
        if (r28 == r33) goto L122;
    L116:
        r29 = r33;
        goto L117
    L101:
        r242 = r32;
        r33 = r172;
        goto L103
    L124:
        int r223 = r16;
        boolean r243 = r32;
        ArrayList r153 = r212;
        int r214 = r14;
        if (r132 <= 0) goto L141;
        r42 = r42 - r132;
        int r111 = 0;
        r14 = 0;
    L127:
        if (r111 >= r7) goto L140;
        AbstractC1024m r210 = (AbstractC1024m) r153.get(r111);
        if (r210.f3763b.f3605V != 8) goto L131;
        int r85 = r232;
    L139:
        r111 = r111 + 1;
        r232 = r85;
        goto L127
    L131:
        r85 = r232;
        if (r111 <= 0) goto L135;
        if (r111 < r85) goto L135;
        r14 = r14 + r210.f3769h.f3749f;
    L135:
        r14 = r14 + r210.f3766e.f3750g;
        if (r111 >= r11) goto L139;
        if (r111 >= r9) goto L139;
        r14 = r14 + (-r210.f3770i.f3749f);
        goto L139
    L140:
        int r86 = r232;
    L142:
        int r211 = 2;
        if (this.f3735l != 2) goto L146;
        if (r132 != 0) goto L146;
        int r112 = 0;
        this.f3735l = 0;
    L148:
        if (r14 <= r5) goto L150;
        this.f3735l = r211;
    L150:
        if (r65 <= 0) goto L154;
        if (r42 != 0) goto L154;
        if (r86 != r9) goto L154;
        this.f3735l = r211;
    L154:
        int r215 = this.f3735l;
        if (r215 != 1) goto L202;
        if (r65 <= 1) goto L158;
        int r52 = (r5 - r14) / (r65 - 1);
    L161:
        if (r42 <= 0) goto L163;
        r52 = r112;
    L163:
        int r43 = r112;
        int r113 = r223;
    L164:
        if (r43 >= r7) goto L334;
        if (r243 == false) goto L167;
        int r216 = r7 - (r43 + 1);
    L168:
        AbstractC1024m r217 = (AbstractC1024m) r153.get(r216);
        int r34 = r217.f3763b.f3605V;
        C1017f r66 = r217.f3770i;
        C1017f r108 = r217.f3769h;
        if (r34 != 8) goto L171;
        r108.mo2462d(r113);
        r66.mo2462d(r113);
    L201:
        r43 = r43 + 1;
        goto L164
    L171:
        if (r43 <= 0) goto L175;
        if (r243 == false) goto L174;
        r113 = r113 - r52;
        goto L175
    L174:
        r113 = r113 + r52;
    L175:
        if (r43 <= 0) goto L180;
        if (r43 < r86) goto L180;
        if (r243 == false) goto L179;
        r113 = r113 - r108.f3749f;
        goto L180
    L179:
        r113 = r113 + r108.f3749f;
    L180:
        if (r243 == false) goto L182;
        r66.mo2462d(r113);
    L183:
        C1018g r35 = r217.f3766e;
        int r124 = r35.f3750g;
        if (r217.f3765d == 3) goto L186;
    L188:
        if (r243 == false) goto L190;
        r113 = r113 - r124;
    L191:
        if (r243 == false) goto L194;
        r108.mo2462d(r113);
    L195:
        r217.f3768g = true;
        if (r43 >= r11) goto L201;
        if (r43 >= r9) goto L201;
        if (r243 == false) goto L200;
        r113 = r113 - (-r66.f3749f);
        goto L201
    L200:
        r113 = r113 + (-r66.f3749f);
        goto L201
    L194:
        r66.mo2462d(r113);
        goto L195
    L190:
        r113 = r113 + r124;
        goto L191
    L186:
        if (r217.f3762a != 1) goto L188;
        r124 = r35.f3756m;
        goto L188
    L182:
        r108.mo2462d(r113);
        goto L183
    L167:
        r216 = r43;
        goto L168
    L334:
        return;
    L158:
        if (r65 != 1) goto L160;
        r52 = (r5 - r14) / 2;
        goto L161
    L160:
        r52 = r112;
        goto L161
    L202:
        if (r215 != 0) goto L243;
        int r53 = (r5 - r14) / (r65 + 1);
        if (r42 <= 0) goto L206;
        r53 = r112;
    L206:
        int r44 = r112;
        int r114 = r223;
    L207:
        if (r44 >= r7) goto L335;
        if (r243 == false) goto L210;
        int r218 = r7 - (r44 + 1);
    L211:
        AbstractC1024m r219 = (AbstractC1024m) r153.get(r218);
        int r36 = r219.f3763b.f3605V;
        C1017f r67 = r219.f3770i;
        C1017f r109 = r219.f3769h;
        if (r36 != 8) goto L214;
        r109.mo2462d(r114);
        r67.mo2462d(r114);
    L241:
        r44 = r44 + 1;
        goto L207
    L214:
        if (r243 == false) goto L216;
        int r115 = r114 - r53;
    L217:
        if (r44 <= 0) goto L222;
        if (r44 < r86) goto L222;
        if (r243 == false) goto L221;
        r115 = r115 - r109.f3749f;
        goto L222
    L221:
        r115 = r115 + r109.f3749f;
    L222:
        if (r243 == false) goto L224;
        r67.mo2462d(r115);
    L225:
        C1018g r37 = r219.f3766e;
        int r125 = r37.f3750g;
        if (r219.f3765d == 3) goto L228;
    L230:
        if (r243 == false) goto L232;
        r114 = r115 - r125;
    L233:
        if (r243 == false) goto L235;
        r109.mo2462d(r114);
    L236:
        if (r44 >= r11) goto L241;
        if (r44 >= r9) goto L241;
        if (r243 == false) goto L240;
        r114 = r114 - (-r67.f3749f);
        goto L241
    L240:
        r114 = r114 + (-r67.f3749f);
        goto L241
    L235:
        r67.mo2462d(r114);
        goto L236
    L232:
        r114 = r115 + r125;
        goto L233
    L228:
        if (r219.f3762a != 1) goto L230;
        r125 = Math.min(r125, r37.f3756m);
        goto L230
    L224:
        r109.mo2462d(r115);
        goto L225
    L216:
        r115 = r114 + r53;
        goto L217
    L210:
        r218 = r44;
        goto L211
    L335:
        return;
    L243:
        if (r215 == 2) goto L245;
        return;
    L245:
        if (this.f3767f != 0) goto L247;
        float r220 = this.f3763b.f3602S;
    L248:
        if (r243 == false) goto L250;
        r220 = 1.0f - r220;
    L250:
        int r221 = (int) (((r5 - r14) * r220) + 0.5f);
        if (r221 < 0) goto L253;
        if (r42 > 0) goto L253;
    L254:
        if (r243 == false) goto L256;
        int r224 = r223 - r221;
    L257:
        int r45 = r112;
    L258:
        if (r45 >= r7) goto L336;
        if (r243 == false) goto L261;
        int r116 = r7 - (r45 + 1);
    L262:
        AbstractC1024m r117 = (AbstractC1024m) r153.get(r116);
        int r38 = r117.f3763b.f3605V;
        C1017f r54 = r117.f3770i;
        C1017f r68 = r117.f3769h;
        if (r38 != 8) goto L265;
        r68.mo2462d(r224);
        r54.mo2462d(r224);
    L290:
        r45 = r45 + 1;
        goto L258
    L265:
        if (r45 <= 0) goto L270;
        if (r45 < r86) goto L270;
        if (r243 == false) goto L269;
        r224 = r224 - r68.f3749f;
        goto L270
    L269:
        r224 = r224 + r68.f3749f;
    L270:
        if (r243 == false) goto L272;
        r54.mo2462d(r224);
    L273:
        C1018g r39 = r117.f3766e;
        int r126 = r39.f3750g;
        if (r117.f3765d != 3) goto L279;
        if (r117.f3762a != 1) goto L279;
        r126 = r39.f3756m;
    L279:
        if (r243 == false) goto L281;
        r224 = r224 - r126;
    L282:
        if (r243 == false) goto L284;
        r68.mo2462d(r224);
    L285:
        if (r45 >= r11) goto L290;
        if (r45 >= r9) goto L290;
        if (r243 == false) goto L289;
        r224 = r224 - (-r54.f3749f);
        goto L290
    L289:
        r224 = r224 + (-r54.f3749f);
        goto L290
    L284:
        r54.mo2462d(r224);
        goto L285
    L281:
        r224 = r224 + r126;
        goto L282
    L272:
        r68.mo2462d(r224);
        goto L273
    L261:
        r116 = r45;
        goto L262
    L336:
        return;
    L256:
        r224 = r223 + r221;
    L253:
        r221 = r112;
        goto L254
    L247:
        r220 = this.f3763b.f3603T;
    L146:
        r112 = 0;
        goto L148
    L141:
        r86 = r232;
        r14 = r214;
        goto L142
    L147:
        r223 = r16;
        r243 = r32;
        r153 = r212;
        r86 = r232;
        r112 = 0;
        r211 = 2;
        goto L148
    L85:
        if (r32 == false) goto L87;
        r16 = r16 + ((int) (((r14 - r5) / 2.0f) + 0.5f));
        goto L88
    L87:
        r16 = r16 - ((int) (((r14 - r5) / 2.0f) + 0.5f));
        goto L88
    L78:
        r212 = r6;
        r232 = r8;
        r42 = 0;
        r65 = 0;
        r14 = 0;
        r19 = 0.0f;
        goto L79
    L19:
        r8 = -1;
        goto L20
    L10:
        if ((r3 instanceof C1000e) == false) goto L12;
        r32 = ((C1000e) r3).f3643h0;
        goto L13
    L333:
        return;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        ArrayList r02 = this.f3734k;
        Iterator r1 = r02.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((AbstractC1024m) r1.next()).mo2446d();
        goto L4
    L6:
        int r12 = r02.size();
        if (r12 >= 1) goto L9;
        return;
    L9:
        C0999d r4 = ((AbstractC1024m) r02.get(0)).f3763b;
        C0999d r03 = ((AbstractC1024m) r02.get(r12 - 1)).f3763b;
        int r13 = this.f3767f;
        C1017f r5 = this.f3770i;
        C1017f r6 = this.f3769h;
        if (r13 != 0) goto L21;
        C0998c r14 = r4.f3636x;
        C0998c r04 = r03.f3638z;
        C1017f r2 = AbstractC1024m.m2472i(r14, 0);
        int r15 = r14.m2390c();
        C0999d r42 = m2451m();
        if (r42 == null) goto L14;
        r15 = r42.f3636x.m2390c();
    L14:
        if (r2 == null) goto L16;
        AbstractC1024m.m2470b(r6, r2, r15);
    L16:
        C1017f r16 = AbstractC1024m.m2472i(r04, 0);
        int r05 = r04.m2390c();
        C0999d r22 = m2452n();
        if (r22 == null) goto L19;
        r05 = r22.f3638z.m2390c();
    L19:
        if (r16 == null) goto L31;
        AbstractC1024m.m2470b(r5, r16, -r05);
    L31:
        r6.f3744a = this;
        r5.f3744a = this;
        return;
    L21:
        C0998c r17 = r4.f3637y;
        C0998c r06 = r03.f3584A;
        C1017f r3 = AbstractC1024m.m2472i(r17, 1);
        int r18 = r17.m2390c();
        C0999d r43 = m2451m();
        if (r43 == null) goto L24;
        r18 = r43.f3637y.m2390c();
    L24:
        if (r3 == null) goto L26;
        AbstractC1024m.m2470b(r6, r3, r18);
    L26:
        C1017f r19 = AbstractC1024m.m2472i(r06, 1);
        int r07 = r06.m2390c();
        C0999d r23 = m2452n();
        if (r23 == null) goto L29;
        r07 = r23.f3584A.m2390c();
    L29:
        if (r19 == null) goto L31;
        AbstractC1024m.m2470b(r5, r19, -r07);
        goto L31
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        int r02 = 0;
    L3:
        ArrayList r1 = this.f3734k;
        if (r02 >= r1.size()) goto L6;
        ((AbstractC1024m) r1.get(r02)).mo2447e();
        r02 = r02 + 1;
        goto L3
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3764c = null;
        Iterator r02 = this.f3734k.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((AbstractC1024m) r02.next()).mo2448f();
        goto L4
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: j */
    public final long mo2449j() {
        ArrayList r02 = this.f3734k;
        int r1 = r02.size();
        long r2 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L5;
        AbstractC1024m r5 = (AbstractC1024m) r02.get(r4);
        long r22 = r2 + ((long) r5.f3769h.f3749f);
        long r6 = r5.mo2449j() + r22;
        r2 = ((long) r5.f3770i.f3749f) + r6;
        r4 = r4 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        ArrayList r02 = this.f3734k;
        int r1 = r02.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (((AbstractC1024m) r02.get(r3)).mo2450k() == false) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C0999d m2451m() {
        int r02 = 0;
    L3:
        ArrayList r1 = this.f3734k;
        if (r02 >= r1.size()) goto L9;
        C0999d r12 = ((AbstractC1024m) r1.get(r02)).f3763b;
        if (r12.f3605V != 8) goto L7;
        r02 = r02 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final C0999d m2452n() {
        ArrayList r02 = this.f3734k;
        int r1 = r02.size() - 1;
    L3:
        if (r1 < 0) goto L8;
        C0999d r2 = ((AbstractC1024m) r02.get(r1)).f3763b;
        if (r2.f3605V != 8) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    public final String toString() {
        if (this.f3767f != 0) goto L5;
        String r02 = "horizontal : ";
    L6:
        String r03 = "ChainRun ".concat(r02);
        Iterator r1 = this.f3734k.iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        AbstractC1024m r2 = (AbstractC1024m) r1.next();
        r03 = AbstractC0324d.m722e(AbstractC0324d.m722e(r03, "<") + r2, "> ");
        goto L8
    L10:
        return r03;
    L5:
        r02 = "vertical : ";
        goto L6
    }
}
