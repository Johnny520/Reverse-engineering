package p071n;

import java.util.ArrayList;
import p069m.C0983c;
import p069m.C0985e;
import p069m.C0989i;

/* JADX INFO: renamed from: n.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1005j {

    /* JADX INFO: renamed from: a */
    public static final boolean[] f3715a = null;

    static {
        f3715a = new boolean[3];
    }

    /* JADX INFO: renamed from: a */
    public static void m2437a(C1000e r37, C0985e r38, int r39) {
        C1000e r02 = r37;
        int r11 = 2;
        if (r39 != 0) goto L5;
        int r13 = r02.f3647l0;
        C0997b[] r14 = r02.f3650o0;
        int r15 = 0;
    L6:
        int r9 = 0;
    L7:
        if (r9 >= r13) goto L419;
        C0997b r1 = r14[r9];
        boolean r2 = r1.f3576q;
        C0999d r8 = r1.f3560a;
        int r3 = 3;
        int r4 = 1;
        int r7 = 8;
        C0989i r16 = null;
        if (r2 == true) goto L96;
        int r22 = r1.f3571l;
        int r6 = r22 * 2;
        C0999d r12 = r8;
        C0999d r19 = r12;
        boolean r17 = false;
    L11:
        if (r17 == true) goto L77;
        r1.f3568i += r4;
        r12.f3613b0[r22] = null;
        r12.f3611a0[r22] = null;
        int r5 = r12.f3605V;
        C0998c[] r42 = r12.f3589F;
        if (r5 == r7) goto L63;
        r12.m2403h(r22);
        r42[r6].m2390c();
        int r52 = r6 + 1;
        r42[r52].m2390c();
        r42[r6].m2390c();
        r42[r52].m2390c();
        if (r1.f3561b != null) goto L17;
        r1.f3561b = r12;
    L17:
        r1.f3563d = r12;
        int r53 = r12.f3615c0[r22];
        if (r53 != r3) goto L63;
        int r72 = r12.f3624l[r22];
        if (r72 == 0) goto L25;
        if (r72 == r3) goto L25;
        if (r72 == r11) goto L25;
        int r24 = r9;
    L49:
        if (r22 != 0) goto L57;
        if (r12.f3622j == 0) goto L54;
    L62:
        C0999d r32 = r19;
        if (r32 == r12) goto L66;
        r32.f3613b0[r22] = r12;
    L66:
        C0998c r33 = r42[r6 + 1].f3580d;
        if (r33 == null) goto L72;
        C0999d r34 = r33.f3578b;
        C0998c r43 = r34.f3589F[r6].f3580d;
        if (r43 == null) goto L72;
        if (r43.f3578b != r12) goto L72;
    L73:
        if (r34 != null) goto L76;
        r34 = r12;
        r17 = true;
    L76:
        r19 = r12;
        r9 = r24;
        r4 = 1;
        r7 = 8;
        r11 = 2;
        r12 = r34;
        r3 = 3;
    L72:
        r34 = null;
        goto L73
    L54:
        if (r12.f3625m != 0) goto L62;
        int r35 = r12.f3626n;
        goto L62
    L57:
        if (r12.f3623k != 0) goto L62;
        if (r12.f3628p != 0) goto L62;
        int r36 = r12.f3629q;
    L25:
        r1.f3569j++;
        float r112 = r12.f3609Z[r22];
        if (r112 <= 0.0f) goto L28;
        r1.f3570k += r112;
    L28:
        r24 = r9;
        if (r12.f3605V == 8) goto L43;
        if (r53 != 3) goto L43;
        if (r72 == 0) goto L35;
        if (r72 != 3) goto L43;
    L35:
        if (r112 >= 0.0f) goto L37;
        r1.f3573n = true;
    L39:
        if (r1.f3567h != null) goto L41;
        r1.f3567h = new ArrayList();
    L41:
        r1.f3567h.add(r12);
        goto L43
    L37:
        r1.f3574o = true;
    L43:
        if (r1.f3565f != null) goto L45;
        r1.f3565f = r12;
    L45:
        C0999d r310 = r1.f3566g;
        if (r310 == null) goto L48;
        r310.f3611a0[r22] = r12;
    L48:
        r1.f3566g = r12;
    L63:
        r24 = r9;
        goto L62
    L77:
        int r242 = r9;
        C0999d r311 = r1.f3561b;
        if (r311 == null) goto L80;
        r311.f3589F[r6].m2390c();
    L80:
        C0999d r312 = r1.f3563d;
        if (r312 == null) goto L83;
        r312.f3589F[r6 + 1].m2390c();
    L83:
        r1.f3562c = r12;
        if (r22 == 0) goto L86;
    L88:
        r1.f3564e = r8;
    L90:
        if (r1.f3574o == true) goto L92;
    L94:
        boolean r23 = false;
    L95:
        r1.f3575p = r23;
        boolean r25 = true;
    L97:
        r1.f3576q = r25;
        C0999d r113 = r1.f3562c;
        C0999d r122 = r1.f3561b;
        C0999d r92 = r1.f3563d;
        C0999d r26 = r1.f3564e;
        float r313 = r1.f3570k;
        if (r02.f3615c0[r39] != 2) goto L100;
        boolean r44 = true;
    L101:
        if (r39 != 0) goto L114;
        int r54 = r26.f3607X;
        if (r54 != 0) goto L105;
        boolean r21 = true;
    L106:
        if (r54 != 1) goto L108;
        boolean r172 = true;
    L109:
        if (r54 != 2) goto L111;
        boolean r55 = true;
    L112:
        float r252 = r313;
        C0999d r73 = r8;
        boolean r192 = r21;
    L113:
        boolean r62 = false;
    L125:
        C0998c[] r314 = r02.f3589F;
        int r262 = r13;
        if (r62 == true) goto L178;
        C0998c r132 = r73.f3589F[r15];
        if (r55 == false) goto L130;
        int r27 = 1;
    L131:
        int r28 = r132.m2390c();
        boolean r29 = r62;
        int[] r63 = r73.f3615c0;
        C0997b[] r30 = r14;
        C0999d r31 = r26;
        if (r63[r39] == 3) goto L134;
    L136:
        boolean r210 = false;
    L137:
        C0998c r142 = r132.f3580d;
        if (r142 == null) goto L141;
        if (r73 == r8) goto L141;
        r28 = r142.m2390c() + r28;
    L141:
        int r143 = r28;
        if (r55 == false) goto L146;
        if (r73 == r8) goto L146;
        if (r73 == r122) goto L146;
        C0999d r282 = r8;
        r27 = 5;
    L147:
        C0998c r82 = r132.f3580d;
        if (r82 == null) goto L157;
        if (r73 != r122) goto L151;
        C0999d r322 = r122;
        C0997b r332 = r1;
        r38.m2358f(r132.f3583g, r82.f3583g, r143, 6);
    L152:
        if (r210 == false) goto L155;
        if (r55 == true) goto L155;
        int r18 = 5;
    L156:
        r38.m2357e(r132.f3583g, r132.f3580d.f3583g, r143, r18);
    L158:
        C0998c[] r110 = r73.f3589F;
        if (r44 == true) goto L161;
    L167:
        C0998c r111 = r110[r15 + 1].f3580d;
        if (r111 == null) goto L173;
        C0999d r114 = r111.f3578b;
        C0998c r211 = r114.f3589F[r15].f3580d;
        if (r211 == null) goto L173;
        if (r211.f3578b != r73) goto L173;
    L174:
        if (r114 == null) goto L176;
        r73 = r114;
        r62 = r29;
    L177:
        r13 = r262;
        r8 = r282;
        r14 = r30;
        r26 = r31;
        r122 = r322;
        r1 = r332;
        goto L125
    L176:
        r62 = true;
    L173:
        r114 = null;
        goto L174
    L161:
        if (r73.f3605V != 8) goto L163;
    L165:
        int r83 = 0;
    L166:
        r38.m2358f(r110[r15].f3583g, r314[r15].f3583g, r83, 8);
        goto L167
    L163:
        if (r63[r39] != 3) goto L165;
        r83 = 0;
        r38.m2358f(r110[r15 + 1].f3583g, r110[r15].f3583g, 0, 5);
    L155:
        r18 = r27;
        goto L156
    L151:
        r332 = r1;
        r322 = r122;
        r38.m2358f(r132.f3583g, r82.f3583g, r143, 8);
        goto L152
    L157:
        r332 = r1;
        r322 = r122;
    L146:
        r282 = r8;
        goto L147
    L134:
        if (r73.f3624l[r39] != 0) goto L136;
        r210 = true;
        goto L137
    L130:
        r27 = 4;
        goto L131
    L178:
        C0997b r333 = r1;
        C0999d r315 = r26;
        C0999d r283 = r8;
        C0999d r323 = r122;
        C0997b[] r302 = r14;
        if (r92 == null) goto L197;
        int r212 = r15 + 1;
        if (r113.f3589F[r212].f3580d == null) goto L197;
        C0998c r115 = r92.f3589F[r212];
        if (r92.f3615c0[r39] != 3) goto L191;
        if (r92.f3624l[r39] != 0) goto L191;
        if (r55 == true) goto L191;
        C0998c r64 = r115.f3580d;
        if (r64.f3578b != r02) goto L191;
        r38.m2357e(r115.f3583g, r64.f3583g, -r115.m2390c(), 5);
    L195:
        r38.m2359g(r115.f3583g, r113.f3589F[r212].f3580d.f3583g, -r115.m2390c(), 6);
    L191:
        if (r55 == false) goto L195;
        C0998c r65 = r115.f3580d;
        if (r65.f3578b != r02) goto L195;
        r38.m2357e(r115.f3583g, r65.f3583g, -r115.m2390c(), 4);
    L197:
        if (r44 == false) goto L199;
        int r116 = r15 + 1;
        C0989i r213 = r314[r116].f3583g;
        C0998c r117 = r113.f3589F[r116];
        r38.m2358f(r213, r117.f3583g, r117.m2390c(), 8);
    L199:
        ArrayList r214 = r333.f3567h;
        if (r214 == null) goto L244;
        int r316 = r214.size();
        if (r316 <= 1) goto L244;
        if (r333.f3573n == true) goto L206;
    L208:
        float r66 = r252;
    L209:
        C0999d r133 = null;
        float r74 = 0.0f;
        int r84 = 0;
    L210:
        if (r84 >= r316) goto L244;
        C0999d r144 = (C0999d) r214.get(r84);
        float r45 = r144.f3609Z[r39];
        C0998c[] r123 = r144.f3589F;
        if (r45 >= 0.0f) goto L220;
        if (r333.f3575p == false) goto L216;
        C0989i r03 = r123[r15 + 1].f3583g;
        C0989i r46 = r123[r15].f3583g;
        boolean r124 = false;
        r38.m2357e(r03, r46, 0, 4);
    L222:
        ArrayList r292 = r214;
        int r272 = r316;
    L242:
        r84 = r84 + 1;
        r316 = r272;
        r214 = r292;
        goto L210
    L216:
        r45 = 1.0f;
    L220:
        if (r45 != 0.0f) goto L224;
        C0989i r04 = r123[r15 + 1].f3583g;
        C0989i r47 = r123[r15].f3583g;
        r124 = false;
        r38.m2357e(r04, r47, 0, 8);
        goto L222
    L224:
        if (r133 == null) goto L240;
        C0998c[] r134 = r133.f3589F;
        C0989i r05 = r134[r15].f3583g;
        int r273 = r15 + 1;
        C0989i r135 = r134[r273].f3583g;
        r292 = r214;
        C0989i r215 = r123[r15].f3583g;
        C0989i r125 = r123[r273].f3583g;
        r272 = r316;
        C0983c r317 = r38.m2363k();
        C0999d r334 = r144;
        r317.f3480b = 0.0f;
        if (r66 != 0.0f) goto L228;
    L229:
        float r253 = r45;
        r317.f3482d.mo2335c(r05, 1.0f);
        r317.f3482d.mo2335c(r135, -1.0f);
        r317.f3482d.mo2335c(r125, 1.0f);
        r317.f3482d.mo2335c(r215, -1.0f);
    L239:
        r38.m2355c(r317);
    L241:
        r74 = r253;
        r133 = r334;
        goto L242
    L228:
        if (r74 == r45) goto L229;
        if (r74 != 0.0f) goto L235;
        r317.f3482d.mo2335c(r05, 1.0f);
        r317.f3482d.mo2335c(r135, -1.0f);
    L233:
        r253 = r45;
        goto L239
    L235:
        if (r45 != 0.0f) goto L237;
        r317.f3482d.mo2335c(r215, 1.0f);
        r317.f3482d.mo2335c(r125, -1.0f);
        goto L233
    L237:
        float r75 = (r74 / r66) / (r45 / r66);
        r253 = r45;
        r317.f3482d.mo2335c(r05, 1.0f);
        r317.f3482d.mo2335c(r135, -1.0f);
        r317.f3482d.mo2335c(r125, r75);
        r317.f3482d.mo2335c(r215, -r75);
        goto L239
    L240:
        r292 = r214;
        r272 = r316;
        r253 = r45;
        r334 = r144;
        goto L241
    L206:
        if (r333.f3575p == true) goto L208;
        r66 = r333.f3569j;
    L244:
        if (r323 == null) goto L268;
        C0999d r06 = r323;
        if (r06 == r92) goto L250;
        if (r55 == true) goto L250;
        C0999d r145 = r92;
        int r126 = r242;
        C0999d r85 = r283;
    L269:
        if (r192 == false) goto L333;
        if (r06 == null) goto L333;
        int r216 = r333.f3569j;
        if (r216 > 0) goto L274;
    L276:
        boolean r217 = false;
    L277:
        C0999d r93 = r06;
        C0999d r136 = r93;
    L278:
        if (r136 == null) goto L267;
        C0999d r76 = r136.f3613b0[r39];
    L280:
        if (r76 == null) goto L285;
        if (r76.f3605V != 8) goto L285;
        r76 = r76.f3613b0[r39];
    L285:
        if (r76 != null) goto L289;
        if (r136 == r145) goto L289;
        C0999d r222 = r76;
        C0999d r352 = r85;
        C0999d r20 = r93;
    L329:
        if (r136.f3605V != 8) goto L332;
        r136 = r20;
    L332:
        r93 = r136;
        r136 = r222;
        r85 = r352;
    L289:
        C0998c[] r118 = r136.f3589F;
        C0998c r218 = r118[r15];
        C0989i r318 = r218.f3583g;
        C0998c r48 = r218.f3580d;
        if (r48 == null) goto L292;
        C0989i r49 = r48.f3583g;
    L293:
        if (r93 == r136) goto L295;
        r49 = r93.f3589F[r15 + 1].f3583g;
    L301:
        int r219 = r218.m2390c();
        int r56 = r15 + 1;
        int r202 = r118[r56].m2390c();
        if (r76 == null) goto L305;
        C0998c r67 = r76.f3589F[r15];
        C0999d r232 = r76;
        C0989i r77 = r67.f3583g;
        C0989i r119 = r118[r56].f3583g;
    L304:
        C0989i r243 = r119;
        if (r67 == null) goto L312;
        r202 = r67.m2390c() + r202;
    L312:
        if (r93 == null) goto L314;
        r219 = r219 + r93.f3589F[r56].m2390c();
    L314:
        if (r318 == null) goto L327;
        if (r49 == null) goto L327;
        if (r77 == null) goto L327;
        if (r243 == null) goto L327;
        if (r136 != r06) goto L320;
        int r68 = r06.f3589F[r15].m2390c();
    L321:
        if (r136 != r145) goto L323;
        r202 = r145.f3589F[r56].m2390c();
    L323:
        if (r217 == false) goto L325;
        int r254 = 8;
    L326:
        r222 = r232;
        r352 = r85;
        int r86 = r202;
        r20 = r93;
        r38.m2354b(r318, r49, r68, 0.5f, r77, r243, r86, r254);
        goto L329
    L325:
        r254 = 5;
        goto L326
    L320:
        r68 = r219;
    L327:
        r352 = r85;
        r20 = r93;
        r222 = r232;
        goto L329
    L305:
        r232 = r76;
        r67 = r113.f3589F[r56].f3580d;
        if (r67 == null) goto L308;
        r77 = r67.f3583g;
    L309:
        r119 = r118[r56].f3583g;
        goto L304
    L308:
        r77 = null;
        goto L309
    L295:
        if (r136 != r06) goto L301;
        if (r93 != r136) goto L301;
        C0998c r410 = r85.f3589F[r15].f3580d;
        if (r410 == null) goto L300;
        r49 = r410.f3583g;
        goto L301
    L300:
        r49 = null;
        goto L301
    L292:
        r49 = null;
    L267:
        int r223 = r126;
    L396:
        if (r192 == true) goto L398;
        if (r172 == true) goto L398;
    L418:
        r9 = r223 + 1;
        r11 = 2;
        r02 = r37;
        r13 = r262;
        r14 = r302;
    L398:
        if (r06 == null) goto L418;
        if (r06 == r145) goto L418;
        C0998c[] r120 = r06.f3589F;
        C0998c r220 = r120[r15];
        int r411 = r15 + 1;
        C0998c r319 = r145.f3589F[r411];
        C0998c r57 = r220.f3580d;
        if (r57 == null) goto L403;
        C0989i r58 = r57.f3583g;
    L404:
        C0998c r69 = r319.f3580d;
        if (r69 == null) goto L407;
        C0989i r610 = r69.f3583g;
    L408:
        if (r113 == r145) goto L413;
        C0998c r611 = r113.f3589F[r411].f3580d;
        if (r611 == null) goto L412;
        r16 = r611.f3583g;
    L412:
        r610 = r16;
    L413:
        if (r06 != r145) goto L415;
        r319 = r120[r411];
    L415:
        if (r58 == null) goto L418;
        if (r610 == null) goto L418;
        int r07 = r220.m2390c();
        int r87 = r145.f3589F[r411].m2390c();
        r38.m2354b(r220.f3583g, r58, r07, 0.5f, r610, r319.f3583g, r87, 5);
        goto L418
    L407:
        r610 = null;
        goto L408
    L403:
        r58 = null;
        goto L404
    L274:
        if (r333.f3568i != r216) goto L276;
        r217 = true;
    L333:
        C0999d r353 = r85;
        int r94 = 8;
        if (r172 == false) goto L267;
        if (r06 == null) goto L267;
        int r221 = r333.f3569j;
        if (r221 > 0) goto L339;
    L341:
        boolean r2110 = false;
    L342:
        C0999d r88 = r06;
        C0999d r137 = r88;
    L343:
        if (r137 == null) goto L386;
        C0999d r121 = r137.f3613b0[r39];
    L345:
        if (r121 == null) goto L349;
        if (r121.f3605V != r94) goto L349;
        r121 = r121.f3613b0[r39];
    L349:
        if (r137 == r06) goto L380;
        if (r137 == r145) goto L380;
        if (r121 == null) goto L380;
        if (r121 != r145) goto L354;
        C0999d r78 = null;
    L355:
        C0998c[] r127 = r137.f3589F;
        C0998c r224 = r127[r15];
        C0989i r320 = r224.f3583g;
        int r59 = r15 + 1;
        C0989i r412 = r88.f3589F[r59].f3583g;
        int r225 = r224.m2390c();
        int r612 = r127[r59].m2390c();
        if (r78 == null) goto L361;
        C0998c r128 = r78.f3589F[r15];
        C0989i r95 = r128.f3583g;
        C0999d r203 = r78;
        C0998c r79 = r128.f3580d;
        if (r79 == null) goto L360;
        C0989i r710 = r79.f3583g;
    L366:
        if (r128 == null) goto L368;
        int r226 = r128.m2390c() + r612;
    L369:
        int r510 = r88.f3589F[r59].m2390c() + r225;
        if (r2110 == false) goto L372;
        int r244 = 8;
    L373:
        if (r320 == null) goto L378;
        if (r412 == null) goto L378;
        if (r95 == null) goto L378;
        if (r710 == null) goto L378;
        C0999d r255 = r88;
        int r89 = r226;
        int r227 = r126;
        int r129 = 8;
        r38.m2354b(r320, r412, r510, 0.5f, r95, r710, r89, r244);
    L379:
        r121 = r203;
    L382:
        if (r137.f3605V == r129) goto L384;
        r88 = r137;
    L385:
        r137 = r121;
        r94 = r129;
        r126 = r227;
        goto L343
    L384:
        r88 = r255;
    L378:
        r255 = r88;
        r227 = r126;
        r129 = 8;
        goto L379
    L372:
        r244 = 4;
        goto L373
    L368:
        r226 = r612;
        goto L369
    L360:
        r710 = null;
        goto L366
    L361:
        r203 = r78;
        C0998c r711 = r145.f3589F[r15];
        if (r711 == null) goto L364;
        r95 = r711.f3583g;
    L365:
        r710 = r127[r59].f3583g;
        r128 = r711;
        goto L366
    L364:
        r95 = null;
        goto L365
    L354:
        r78 = r121;
    L380:
        r255 = r88;
        r227 = r126;
        r129 = r94;
        goto L382
    L386:
        r223 = r126;
        C0998c r130 = r06.f3589F[r15];
        C0998c r228 = r353.f3589F[r15].f3580d;
        int r413 = r15 + 1;
        C0998c r1210 = r145.f3589F[r413];
        C0998c r138 = r113.f3589F[r413].f3580d;
        if (r228 == null) goto L390;
        if (r06 == r145) goto L391;
        r38.m2357e(r130.f3583g, r228.f3583g, r130.m2390c(), 5);
        goto L390
    L391:
        if (r138 == null) goto L390;
        int r204 = 5;
        r38.m2354b(r130.f3583g, r228.f3583g, r130.m2390c(), 0.5f, r1210.f3583g, r138.f3583g, r1210.m2390c(), 5);
    L393:
        if (r138 == null) goto L396;
        if (r06 == r145) goto L396;
        r38.m2357e(r1210.f3583g, r138.f3583g, -r1210.m2390c(), r204);
    L390:
        r204 = 5;
        goto L393
    L339:
        if (r333.f3568i != r221) goto L341;
        r2110 = true;
    L250:
        C0998c r131 = r283.f3589F[r15];
        int r321 = r15 + 1;
        C0998c r229 = r113.f3589F[r321];
        C0998c r139 = r131.f3580d;
        if (r139 == null) goto L253;
        C0989i r414 = r139.f3583g;
    L254:
        C0998c r140 = r229.f3580d;
        if (r140 == null) goto L257;
        C0989i r613 = r140.f3583g;
    L258:
        C0998c r141 = r06.f3589F[r15];
        C0998c r230 = r92.f3589F[r321];
        if (r414 == null) goto L266;
        if (r613 == null) goto L266;
        if (r39 != 0) goto L264;
        float r324 = r315.f3602S;
    L263:
        float r511 = r324;
        C0989i r325 = r414;
        r145 = r92;
        r126 = r242;
        r38.m2354b(r141.f3583g, r325, r141.m2390c(), r511, r613, r230.f3583g, r230.m2390c(), 7);
        goto L267
    L264:
        r324 = r315.f3603T;
    L266:
        r145 = r92;
        r126 = r242;
        goto L267
    L257:
        r613 = null;
        goto L258
    L253:
        r414 = null;
        goto L254
    L268:
        r145 = r92;
        r126 = r242;
        r85 = r283;
        r06 = r323;
        goto L269
    L111:
        r55 = false;
        goto L112
    L108:
        r172 = false;
        goto L109
    L105:
        r21 = false;
        goto L106
    L114:
        int r512 = r26.f3608Y;
        if (r512 != 0) goto L117;
        boolean r173 = true;
    L118:
        if (r512 != 1) goto L120;
        boolean r614 = true;
    L121:
        if (r512 != 2) goto L123;
        r55 = true;
    L124:
        r252 = r313;
        r73 = r8;
        r192 = r173;
        r172 = r614;
        goto L113
    L123:
        r55 = false;
        goto L124
    L120:
        r614 = false;
        goto L121
    L117:
        r173 = false;
        goto L118
    L100:
        r44 = false;
        goto L101
    L92:
        if (r1.f3573n == false) goto L94;
        r23 = true;
        goto L95
    L86:
        if (r1.f3572m == false) goto L88;
        r1.f3564e = r12;
        goto L90
    L96:
        r242 = r9;
        r25 = true;
        goto L97
    L419:
        return;
    L5:
        r13 = r02.f3648m0;
        r14 = r02.f3649n0;
        r15 = 2;
        goto L6
    }
}
