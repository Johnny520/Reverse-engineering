package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC0639Ou;
import p000.AbstractC0960WE;
import p000.C0178E5;
import p000.C0325Hh;
import p000.C0368Ih;
import p000.C1259cb;
import p000.C1496hb;
import p000.C2150kk;
import p000.C2454rb;
import p000.C2497sb;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC0960WE {

    /* JADX INFO: renamed from: j */
    public final C0368Ih f3853j;

    public Flow(Context r8, AttributeSet r9) {
        super(r8, r9);
        this.f4872a = new int[32];
        this.f4878g = new HashMap();
        this.f4874c = r8;
        super.mo1835g(r9);
        C0368Ih r82 = new C0368Ih();
        r82.f1276s0 = 0;
        r82.f1277t0 = 0;
        r82.f1278u0 = 0;
        r82.f1279v0 = 0;
        r82.f1280w0 = 0;
        r82.f1281x0 = 0;
        r82.f1282y0 = false;
        r82.f1283z0 = 0;
        r82.f1248A0 = 0;
        r82.f1249B0 = new C0178E5();
        r82.f1250C0 = null;
        r82.f1251D0 = -1;
        r82.f1252E0 = -1;
        r82.f1253F0 = -1;
        r82.f1254G0 = -1;
        r82.f1255H0 = -1;
        r82.f1256I0 = -1;
        r82.f1257J0 = 0.5f;
        r82.f1258K0 = 0.5f;
        r82.f1259L0 = 0.5f;
        r82.f1260M0 = 0.5f;
        r82.f1261N0 = 0.5f;
        r82.f1262O0 = 0.5f;
        r82.f1263P0 = 0;
        r82.f1264Q0 = 0;
        r82.f1265R0 = 2;
        r82.f1266S0 = 2;
        r82.f1267T0 = 0;
        r82.f1268U0 = -1;
        r82.f1269V0 = 0;
        r82.f1270W0 = new ArrayList();
        r82.f1271X0 = null;
        r82.f1272Y0 = null;
        r82.f1273Z0 = null;
        r82.f1275b1 = 0;
        this.f3853j = r82;
        if (r9 == null) goto L85;
        TypedArray r83 = getContext().obtainStyledAttributes(r9, AbstractC0639Ou.f2035b);
        int r92 = r83.getIndexCount();
        int r1 = 0;
    L5:
        if (r1 >= r92) goto L84;
        int r5 = r83.getIndex(r1);
        if (r5 != 0) goto L10;
        this.f3853j.f1269V0 = r83.getInt(r5, 0);
    L83:
        r1 = r1 + 1;
        goto L5
    L10:
        if (r5 != 1) goto L13;
        C0368Ih r6 = this.f3853j;
        int r52 = r83.getDimensionPixelSize(r5, 0);
        r6.f1276s0 = r52;
        r6.f1277t0 = r52;
        r6.f1278u0 = r52;
        r6.f1279v0 = r52;
        goto L83
    L13:
        if (r5 != 18) goto L16;
        C0368Ih r62 = this.f3853j;
        int r53 = r83.getDimensionPixelSize(r5, 0);
        r62.f1278u0 = r53;
        r62.f1280w0 = r53;
        r62.f1281x0 = r53;
        goto L83
    L16:
        if (r5 != 19) goto L18;
        this.f3853j.f1279v0 = r83.getDimensionPixelSize(r5, 0);
        goto L83
    L18:
        if (r5 != 2) goto L21;
        this.f3853j.f1280w0 = r83.getDimensionPixelSize(r5, 0);
        goto L83
    L21:
        if (r5 != 3) goto L24;
        this.f3853j.f1276s0 = r83.getDimensionPixelSize(r5, 0);
        goto L83
    L24:
        if (r5 != 4) goto L27;
        this.f3853j.f1281x0 = r83.getDimensionPixelSize(r5, 0);
        goto L83
    L27:
        if (r5 != 5) goto L30;
        this.f3853j.f1277t0 = r83.getDimensionPixelSize(r5, 0);
        goto L83
    L30:
        if (r5 != 54) goto L33;
        this.f3853j.f1267T0 = r83.getInt(r5, 0);
        goto L83
    L33:
        if (r5 != 44) goto L36;
        this.f3853j.f1251D0 = r83.getInt(r5, 0);
        goto L83
    L36:
        if (r5 != 53) goto L39;
        this.f3853j.f1252E0 = r83.getInt(r5, 0);
        goto L83
    L39:
        if (r5 != 38) goto L42;
        this.f3853j.f1253F0 = r83.getInt(r5, 0);
        goto L83
    L42:
        if (r5 != 46) goto L45;
        this.f3853j.f1255H0 = r83.getInt(r5, 0);
        goto L83
    L45:
        if (r5 != 40) goto L48;
        this.f3853j.f1254G0 = r83.getInt(r5, 0);
        goto L83
    L48:
        if (r5 != 48) goto L51;
        this.f3853j.f1256I0 = r83.getInt(r5, 0);
        goto L83
    L51:
        if (r5 != 42) goto L54;
        this.f3853j.f1257J0 = r83.getFloat(r5, 0.5f);
        goto L83
    L54:
        if (r5 != 37) goto L57;
        this.f3853j.f1259L0 = r83.getFloat(r5, 0.5f);
        goto L83
    L57:
        if (r5 != 45) goto L60;
        this.f3853j.f1261N0 = r83.getFloat(r5, 0.5f);
        goto L83
    L60:
        if (r5 != 39) goto L63;
        this.f3853j.f1260M0 = r83.getFloat(r5, 0.5f);
        goto L83
    L63:
        if (r5 != 47) goto L66;
        this.f3853j.f1262O0 = r83.getFloat(r5, 0.5f);
        goto L83
    L66:
        if (r5 != 51) goto L69;
        this.f3853j.f1258K0 = r83.getFloat(r5, 0.5f);
        goto L83
    L69:
        if (r5 != 41) goto L72;
        this.f3853j.f1265R0 = r83.getInt(r5, 2);
        goto L83
    L72:
        if (r5 != 50) goto L75;
        this.f3853j.f1266S0 = r83.getInt(r5, 2);
        goto L83
    L75:
        if (r5 != 43) goto L78;
        this.f3853j.f1263P0 = r83.getDimensionPixelSize(r5, 0);
        goto L83
    L78:
        if (r5 != 52) goto L81;
        this.f3853j.f1264Q0 = r83.getDimensionPixelSize(r5, 0);
        goto L83
    L81:
        if (r5 != 49) goto L83;
        this.f3853j.f1268U0 = r83.getInt(r5, -1);
        goto L83
    L84:
        r83.recycle();
    L85:
        this.f4875d = this.f3853j;
        m2654i();
    }

    @Override // p000.AbstractC1364eb
    /* JADX INFO: renamed from: h */
    public final void mo2120h(C2454rb r3, boolean r4) {
        C0368Ih r32 = this.f3853j;
        int r0 = r32.f1278u0;
        if (r0 <= 0) goto L5;
    L8:
        if (r4 == false) goto L11;
        r32.f1280w0 = r32.f1279v0;
        r32.f1281x0 = r0;
        return;
    L11:
        r32.f1280w0 = r0;
        r32.f1281x0 = r32.f1279v0;
        return;
    L5:
        if (r32.f1279v0 > 0) goto L8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0960WE
    /* JADX INFO: renamed from: j */
    public final void mo1836j(C0368Ih r39, int r40, int r41) {
        int r9 = View.MeasureSpec.getMode(r40);
        int r10 = View.MeasureSpec.getSize(r40);
        int r11 = View.MeasureSpec.getMode(r41);
        int r12 = View.MeasureSpec.getSize(r41);
        if (r39 == null) goto L424;
        int[] r14 = r39.f8637p0;
        C1259cb r15 = r39.f8589J;
        C1259cb r1 = r39.f8588I;
        C1259cb r3 = r39.f8590K;
        C1259cb r4 = r39.f8591L;
        ArrayList r5 = r39.f1270W0;
        if (r39.f8966r0 <= 0) goto L37;
        C0178E5 r6 = r39.f1249B0;
        C2454rb r7 = r39.f8599T;
        if (r7 == null) goto L9;
        C1496hb r72 = ((C2497sb) r7).f8778u0;
    L10:
        if (r72 != null) goto L12;
        r39.f1283z0 = 0;
        r39.f1248A0 = 0;
        r39.f1282y0 = false;
    L422:
        setMeasuredDimension(r39.f1283z0, r39.f1248A0);
        return;
    L12:
        int r8 = 0;
    L14:
        if (r8 >= r39.f8966r0) goto L37;
        C2454rb r13 = r39.f8965q0[r8];
        if (r13 != null) goto L19;
        C1259cb r19 = r1;
    L18:
        C1259cb r20 = r3;
        C1259cb r21 = r4;
        ArrayList r22 = r5;
        int r23 = r8;
    L36:
        r8 = r23 + 1;
        r1 = r19;
        r3 = r20;
        r4 = r21;
        r5 = r22;
        goto L14
    L19:
        r19 = r1;
        if ((r13 instanceof C2150kk) == true) goto L18;
        r20 = r3;
        int r32 = r13.m4932j(0);
        r21 = r4;
        int r42 = r13.m4932j(1);
        r22 = r5;
        if (r32 != 3) goto L30;
        r23 = r8;
        if (r13.f8639r == 1) goto L31;
        if (r42 != 3) goto L31;
        if (r13.f8640s != 1) goto L36;
    L31:
        if (r32 != 3) goto L33;
        r32 = 2;
    L33:
        if (r42 != 3) goto L35;
        r42 = 2;
    L35:
        r6.f520a = r32;
        r6.f521b = r42;
        r6.f522c = r13.m4937q();
        r6.f523d = r13.m4933k();
        r72.m2865b(r13, r6);
        r13.m4924O(r6.f524e);
        r13.m4921L(r6.f525f);
        r13.m4918I(r6.f526g);
        goto L36
    L30:
        r23 = r8;
        goto L31
    L9:
        r72 = null;
    L37:
        C1259cb r192 = r1;
        C1259cb r202 = r3;
        C1259cb r212 = r4;
        ArrayList r222 = r5;
        int r132 = r39.f1280w0;
        int r16 = r39.f1281x0;
        int r33 = r39.f1276s0;
        int r43 = r39.f1277t0;
        int[] r62 = new int[2];
        int r52 = (r10 - r132) - r16;
        int r73 = r39.f1269V0;
        if (r73 != 1) goto L40;
        r52 = (r12 - r33) - r43;
    L40:
        int r82 = r52;
        if (r73 == 0) goto L43;
        int r232 = r16;
        if (r39.f1251D0 != (-1)) goto L54;
        r39.f1251D0 = 0;
    L54:
        if (r39.f1252E0 != (-1)) goto L56;
        r39.f1252E0 = 0;
    L56:
        C2454rb[] r17 = r39.f8965q0;
        int r53 = 0;
        int r74 = 0;
    L57:
        int r18 = r39.f8966r0;
        int r25 = r33;
        if (r53 >= r18) goto L63;
        if (r39.f8965q0[r53].f8619g0 != 8) goto L62;
        r74 = r74 + 1;
    L62:
        r53 = r53 + 1;
        r33 = r25;
        goto L57
    L63:
        if (r74 <= 0) goto L72;
        C2454rb[] r110 = new C2454rb[r18 - r74];
        int r54 = 0;
        int r75 = 0;
    L66:
        if (r54 >= r39.f8966r0) goto L71;
        C2454rb r34 = r39.f8965q0[r54];
        C2454rb[] r24 = r110;
        if (r34.f8619g0 == 8) goto L70;
        r24[r75] = r34;
        r75 = r75 + 1;
    L70:
        r54 = r54 + 1;
        r110 = r24;
        goto L66
    L71:
        int r35 = r75;
    L73:
        r39.f1274a1 = r110;
        r39.f1275b1 = r35;
        int r55 = r39.f1267T0;
        if (r55 != 0) goto L76;
        C2454rb[] r142 = r110;
        int r152 = r35;
        int r352 = r43;
        int[] r36 = r62;
        int r37 = r12;
        int r172 = r132;
        int r223 = r232;
        int r342 = r25;
        int r38 = r39.f1269V0;
        if (r152 != 0) goto L395;
    L82:
        char r122 = 1;
    L83:
        char r182 = 0;
    L402:
        int r0 = (r36[r182] + r172) + r223;
        int r111 = (r36[r122] + r342) + r352;
        if (r9 == 1073741824) goto L410;
        if (r9 != Integer.MIN_VALUE) goto L407;
        r10 = Math.min(r0, r10);
        goto L410
    L407:
        if (r9 != 0) goto L409;
        r10 = r0;
        goto L410
    L409:
        r10 = 0;
    L410:
        if (r11 != 1073741824) goto L412;
        int r02 = r37;
    L417:
        r39.f1283z0 = r10;
        r39.f1248A0 = r02;
        r39.m4924O(r10);
        r39.m4921L(r02);
        if (r39.f8966r0 <= 0) goto L420;
        boolean r133 = r122;
    L421:
        r39.f1282y0 = r133;
        goto L422
    L420:
        r133 = 0;
        goto L421
    L412:
        if (r11 != Integer.MIN_VALUE) goto L414;
        r02 = Math.min(r111, r37);
        goto L417
    L414:
        if (r11 != 0) goto L416;
        r02 = r111;
        goto L417
    L416:
        r02 = 0;
        goto L417
    L395:
        if (r222.size() != 0) goto L397;
        C0325Hh r112 = new C0325Hh(r39, r38, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r82);
        r222.add(r112);
    L398:
        int r03 = 0;
    L399:
        if (r03 >= r152) goto L401;
        r112.m688a(r142[r03]);
        r03 = r03 + 1;
        goto L399
    L401:
        r182 = 0;
        r36[0] = r112.m691d();
        r122 = 1;
        r36[1] = r112.m690c();
        goto L402
    L397:
        C0325Hh r04 = (C0325Hh) r222.get(0);
        r04.f1092c = 0;
        r04.f1091b = null;
        r04.f1101l = 0;
        r04.f1102m = 0;
        r04.f1103n = 0;
        r04.f1104o = 0;
        r04.f1105p = 0;
        r04.m693f(r38, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r39.f1280w0, r39.f1276s0, r39.f1281x0, r39.f1277t0, r82);
        r112 = r04;
        goto L398
    L76:
        if (r55 != 1) goto L78;
        r352 = r43;
        r36 = r62;
        r37 = r12;
        r172 = r132;
        r223 = r232;
        r342 = r25;
        int r153 = r35;
        C2454rb[] r143 = r110;
        int r310 = r39.f1269V0;
        if (r153 == 0) goto L82;
        r222.clear();
        C0325Hh r113 = new C0325Hh(r39, r310, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r82);
        r222.add(r113);
        if (r310 != 0) goto L326;
        int r05 = 0;
        int r44 = 0;
        int r56 = 0;
    L301:
        if (r05 >= r153) goto L353;
        C2454rb r123 = r143[r05];
        int r162 = r39.m811U(r123, r82);
        if (r123.f8637p0[0] != 3) goto L305;
        r44 = r44 + 1;
    L305:
        int r26 = r44;
        if (r56 == r82) goto L310;
        if (((r39.f1263P0 + r56) + r162) > r82) goto L310;
    L312:
        boolean r45 = false;
    L313:
        if (r45 == true) goto L320;
        if (r05 <= 0) goto L320;
        int r63 = r39.f1268U0;
        if (r63 <= 0) goto L320;
        if ((r05 % r63) != 0) goto L320;
        r45 = true;
    L320:
        if (r45 == false) goto L323;
        r113 = new C0325Hh(r39, r310, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r82);
        r113.f1103n = r05;
        r222.add(r113);
    L322:
        r56 = r162;
    L325:
        r113.m688a(r123);
        r05 = r05 + 1;
        r44 = r26;
        goto L301
    L323:
        if (r05 <= 0) goto L322;
        r56 = (r39.f1263P0 + r162) + r56;
    L310:
        if (r113.f1091b == null) goto L312;
        r45 = true;
    L353:
        int r06 = r222.size();
        int r114 = r39.f1280w0;
        int r57 = r39.f1276s0;
        int r64 = r39.f1281x0;
        int r76 = r39.f1277t0;
        if (r14[0] != 2) goto L356;
    L359:
        boolean r124 = true;
    L360:
        if (r44 <= 0) goto L369;
        if (r124 == false) goto L369;
        int r46 = 0;
    L363:
        if (r46 >= r06) goto L369;
        C0325Hh r125 = (C0325Hh) r222.get(r46);
        if (r310 != 0) goto L367;
        r125.m692e(r82 - r125.m691d());
    L368:
        r46 = r46 + 1;
        goto L363
    L367:
        r125.m692e(r82 - r125.m690c());
    L369:
        int r29 = r114;
        int r30 = r57;
        int r31 = r64;
        int r322 = r76;
        C1259cb r252 = r192;
        C1259cb r27 = r202;
        C1259cb r28 = r212;
        C1259cb r262 = r15;
        int r115 = 0;
        int r47 = 0;
        int r58 = 0;
    L370:
        if (r115 >= r06) goto L390;
        C0325Hh r65 = (C0325Hh) r222.get(r115);
        if (r310 != 0) goto L382;
        if (r115 >= (r06 - 1)) goto L376;
        r28 = ((C0325Hh) r222.get(r115 + 1)).f1091b.f8589J;
        r322 = 0;
    L377:
        C1259cb r77 = r65.f1091b.f8591L;
        r65.m693f(r310, r252, r262, r27, r28, r29, r30, r31, r322, r82);
        r47 = Math.max(r47, r65.m691d());
        int r66 = r65.m690c() + r58;
        if (r115 <= 0) goto L380;
        r66 = r66 + r39.f1264Q0;
    L380:
        r58 = r66;
        r262 = r77;
        r30 = 0;
    L389:
        r115 = r115 + 1;
        goto L370
    L376:
        r322 = r39.f1277t0;
        r28 = r212;
        goto L377
    L382:
        if (r115 >= (r06 - 1)) goto L384;
        r27 = ((C0325Hh) r222.get(r115 + 1)).f1091b.f8588I;
        r31 = 0;
    L385:
        C1259cb r78 = r65.f1091b.f8590K;
        r65.m693f(r310, r252, r262, r27, r28, r29, r30, r31, r322, r82);
        int r67 = r65.m691d() + r47;
        int r48 = Math.max(r58, r65.m690c());
        if (r115 <= 0) goto L388;
        r67 = r67 + r39.f1263P0;
    L388:
        r58 = r48;
        r47 = r67;
        r252 = r78;
        r29 = 0;
        goto L389
    L384:
        r31 = r39.f1281x0;
        r27 = r202;
        goto L385
    L390:
        r36[0] = r47;
        r36[1] = r58;
        goto L82
    L356:
        if (r14[1] == 2) goto L359;
        r124 = false;
        goto L360
    L326:
        int r07 = 0;
        r44 = 0;
        int r59 = 0;
    L327:
        if (r07 >= r153) goto L353;
        C2454rb r126 = r143[r07];
        int r163 = r39.m810T(r126, r82);
        if (r126.f8637p0[1] != 3) goto L331;
        r44 = r44 + 1;
    L331:
        int r263 = r44;
        if (r59 == r82) goto L336;
        if (((r39.f1264Q0 + r59) + r163) > r82) goto L336;
    L338:
        boolean r49 = false;
    L339:
        if (r49 == true) goto L346;
        if (r07 <= 0) goto L346;
        int r68 = r39.f1268U0;
        if (r68 <= 0) goto L346;
        if ((r07 % r68) != 0) goto L346;
        r49 = true;
    L346:
        if (r49 == false) goto L350;
        r113 = new C0325Hh(r39, r310, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r82);
        r113.f1103n = r07;
        r222.add(r113);
    L348:
        r59 = r163;
    L352:
        r113.m688a(r126);
        r07 = r07 + 1;
        r44 = r263;
        goto L327
    L350:
        if (r07 <= 0) goto L348;
        r59 = (r39.f1264Q0 + r163) + r59;
    L336:
        if (r113.f1091b == null) goto L338;
        r49 = true;
        goto L339
    L78:
        if (r55 != 2) goto L80;
        C2454rb[] r144 = r110;
        int r154 = r35;
        r352 = r43;
        r36 = r62;
        r37 = r12;
        r172 = r132;
        r223 = r232;
        r342 = r25;
        int r08 = r39.f1269V0;
        if (r08 != 0) goto L200;
        int r116 = r39.f1268U0;
        if (r116 > 0) goto L199;
        int r117 = 0;
        int r311 = 0;
        int r410 = 0;
    L187:
        if (r117 >= r154) goto L198;
        if (r117 <= 0) goto L190;
        r311 = r311 + r39.f1263P0;
    L190:
        C2454rb r510 = r144[r117];
        if (r510 == null) goto L197;
        int r511 = r39.m811U(r510, r82) + r311;
        if (r511 > r82) goto L198;
        r410 = r410 + 1;
        r311 = r511;
    L197:
        r117 = r117 + 1;
    L198:
        int r118 = 0;
    L217:
        if (r39.f1273Z0 != null) goto L219;
        r39.f1273Z0 = new int[2];
    L219:
        if (r118 == 0) goto L221;
    L222:
        if (r410 != 0) goto L225;
        if (r08 != 0) goto L225;
    L224:
        boolean r312 = true;
    L226:
        if (r312 == true) goto L294;
        if (r08 != 0) goto L229;
        r118 = (int) Math.ceil(r154 / r410);
    L230:
        C2454rb[] r512 = r39.f1272Y0;
        if (r512 != null) goto L233;
    L234:
        Object r69 = null;
        r39.f1272Y0 = new C2454rb[r410];
    L237:
        C2454rb[] r513 = r39.f1271X0;
        if (r513 != null) goto L240;
    L243:
        r39.f1271X0 = new C2454rb[r118];
    L244:
        int r514 = 0;
    L245:
        if (r514 >= r410) goto L269;
        int r610 = 0;
    L247:
        if (r610 >= r118) goto L268;
        int r79 = (r610 * r410) + r514;
        if (r08 != 1) goto L252;
        r79 = (r514 * r118) + r610;
    L252:
        if (r79 >= r144.length) goto L267;
        C2454rb r710 = r144[r79];
        if (r710 == null) goto L267;
        int r127 = r39.m811U(r710, r82);
        C2454rb r134 = r39.f1272Y0[r514];
        if (r134 != null) goto L260;
    L261:
        r39.f1272Y0[r514] = r710;
    L262:
        int r128 = r39.m810T(r710, r82);
        C2454rb r135 = r39.f1271X0[r610];
        if (r135 != null) goto L265;
    L266:
        r39.f1271X0[r610] = r710;
        goto L267
    L265:
        if (r135.m4933k() >= r128) goto L267;
    L260:
        if (r134.m4937q() >= r127) goto L262;
    L267:
        r610 = r610 + 1;
        goto L247
    L268:
        r514 = r514 + 1;
        goto L245
    L269:
        int r515 = 0;
        int r611 = 0;
    L270:
        if (r515 >= r410) goto L277;
        C2454rb r711 = r39.f1272Y0[r515];
        if (r711 == null) goto L276;
        if (r515 <= 0) goto L275;
        r611 = r611 + r39.f1263P0;
    L275:
        r611 = r39.m811U(r711, r82) + r611;
    L276:
        r515 = r515 + 1;
        goto L270
    L277:
        int r516 = 0;
        int r712 = 0;
    L278:
        if (r516 >= r118) goto L285;
        C2454rb r129 = r39.f1271X0[r516];
        if (r129 == null) goto L284;
        if (r516 <= 0) goto L283;
        r712 = r712 + r39.f1264Q0;
    L283:
        r712 = r39.m810T(r129, r82) + r712;
    L284:
        r516 = r516 + 1;
        goto L278
    L285:
        r36[0] = r611;
        r36[1] = r712;
        if (r08 == 0) goto L287;
        if (r712 <= r82) goto L290;
        if (r118 <= 1) goto L290;
        r118 = r118 - 1;
    L290:
        r312 = true;
        goto L226
    L287:
        if (r611 <= r82) goto L290;
        if (r410 <= 1) goto L290;
        r410 = r410 - 1;
        goto L226
    L240:
        if (r513.length < r118) goto L243;
        Arrays.fill(r513, r69);
        goto L244
    L233:
        if (r512.length < r410) goto L234;
        r69 = null;
        Arrays.fill(r512, null);
        goto L237
    L229:
        r410 = (int) Math.ceil(r154 / r118);
        goto L230
    L294:
        r122 = 1;
        int[] r09 = r39.f1273Z0;
        r09[0] = r410;
        r09[1] = r118;
    L225:
        r312 = false;
        goto L226
    L221:
        if (r08 == 1) goto L224;
    L199:
        r410 = r116;
        goto L198
    L200:
        r118 = r39.f1268U0;
        if (r118 > 0) goto L215;
        int r119 = 0;
        int r313 = 0;
        int r411 = 0;
    L203:
        if (r119 >= r154) goto L214;
        if (r119 <= 0) goto L206;
        r313 = r313 + r39.f1264Q0;
    L206:
        C2454rb r517 = r144[r119];
        if (r517 == null) goto L213;
        int r518 = r39.m810T(r517, r82) + r313;
        if (r518 > r82) goto L214;
        r411 = r411 + 1;
        r313 = r518;
    L213:
        r119 = r119 + 1;
    L214:
        r118 = r411;
    L215:
        r410 = 0;
        goto L217
    L80:
        if (r55 == 3) goto L84;
        r352 = r43;
        r36 = r62;
        r37 = r12;
        r172 = r132;
        r223 = r232;
        r342 = r25;
        goto L82
    L84:
        int r519 = r35;
        int r314 = r39.f1269V0;
        if (r519 != 0) goto L87;
        r352 = r43;
        r36 = r62;
        r37 = r12;
        r172 = r132;
        r223 = r232;
        r342 = r25;
        char r402 = 1;
    L181:
        r122 = r402;
        goto L83
    L87:
        r222.clear();
        C2454rb[] r242 = r110;
        r172 = r132;
        r352 = r43;
        r223 = r232;
        r342 = r25;
        r36 = r62;
        r402 = 1;
        C0325Hh r120 = new C0325Hh(r39, r314, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r82);
        r222.add(r120);
        if (r314 != 0) goto L116;
        int r412 = 0;
        int r520 = 0;
        int r612 = 0;
        int r713 = 0;
    L90:
        if (r412 >= r519) goto L115;
        r520 = r520 + 1;
        C2454rb r010 = r242[r412];
        int r164 = r39.m811U(r010, r82);
        int r264 = r314;
        int r272 = r412;
        if (r010.f8637p0[0] != 3) goto L94;
        r612 = r612 + 1;
    L94:
        int r282 = r612;
        if (r713 == r82) goto L99;
        if (((r39.f1263P0 + r713) + r164) > r82) goto L99;
    L101:
        boolean r315 = false;
    L102:
        if (r315 == true) goto L108;
        if (r272 <= 0) goto L108;
        int r413 = r39.f1268U0;
        if (r413 <= 0) goto L108;
        if (r520 <= r413) goto L108;
        r315 = true;
    L108:
        if (r315 == false) goto L111;
        int r372 = r12;
        r314 = r264;
        int r1210 = r272;
        r120 = new C0325Hh(r39, r314, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r82);
        r120.f1103n = r1210;
        r222.add(r120);
        r520 = 1;
    L110:
        r713 = r164;
    L114:
        r120.m688a(r010);
        r412 = r1210 + 1;
        r612 = r282;
        r12 = r372;
        goto L90
    L111:
        r372 = r12;
        r314 = r264;
        r1210 = r272;
        if (r1210 <= 0) goto L110;
        r713 = (r39.f1263P0 + r164) + r713;
    L99:
        if (r120.f1091b == null) goto L101;
        r315 = true;
        goto L102
    L115:
        r37 = r12;
    L143:
        int r011 = r222.size();
        int r121 = r39.f1280w0;
        int r414 = r39.f1276s0;
        int r521 = r39.f1281x0;
        int r714 = r39.f1277t0;
        if (r14[0] != 2) goto L146;
    L149:
        boolean r1211 = true;
    L150:
        if (r612 <= 0) goto L159;
        if (r1211 == false) goto L159;
        int r613 = 0;
    L153:
        if (r613 >= r011) goto L159;
        C0325Hh r1212 = (C0325Hh) r222.get(r613);
        if (r314 != 0) goto L157;
        r1212.m692e(r82 - r1212.m691d());
    L158:
        r613 = r613 + 1;
        goto L153
    L157:
        r1212.m692e(r82 - r1212.m690c());
    L159:
        int r292 = r121;
        int r302 = r414;
        int r316 = r521;
        int r323 = r714;
        C1259cb r253 = r192;
        C1259cb r273 = r202;
        C1259cb r283 = r212;
        C1259cb r265 = r15;
        int r130 = 0;
        int r415 = 0;
        int r522 = 0;
    L160:
        if (r130 >= r011) goto L180;
        C0325Hh r614 = (C0325Hh) r222.get(r130);
        if (r314 != 0) goto L172;
        if (r130 >= (r011 - 1)) goto L166;
        r283 = ((C0325Hh) r222.get(r130 + 1)).f1091b.f8589J;
        r323 = 0;
    L167:
        C1259cb r715 = r614.f1091b.f8591L;
        r614.m693f(r314, r253, r265, r273, r283, r292, r302, r316, r323, r82);
        r415 = Math.max(r415, r614.m691d());
        int r615 = r614.m690c() + r522;
        if (r130 <= 0) goto L170;
        r615 = r615 + r39.f1264Q0;
    L170:
        r522 = r615;
        r265 = r715;
        r302 = 0;
    L179:
        r130 = r130 + 1;
        goto L160
    L166:
        r323 = r39.f1277t0;
        r283 = r212;
        goto L167
    L172:
        if (r130 >= (r011 - 1)) goto L174;
        r273 = ((C0325Hh) r222.get(r130 + 1)).f1091b.f8588I;
        r316 = 0;
    L175:
        C1259cb r716 = r614.f1091b.f8590K;
        r614.m693f(r314, r253, r265, r273, r283, r292, r302, r316, r323, r82);
        int r616 = r614.m691d() + r415;
        int r416 = Math.max(r522, r614.m690c());
        if (r130 <= 0) goto L178;
        r616 = r616 + r39.f1263P0;
    L178:
        r522 = r416;
        r415 = r616;
        r253 = r716;
        r292 = 0;
        goto L179
    L174:
        r316 = r39.f1281x0;
        r273 = r202;
        goto L175
    L180:
        r36[0] = r415;
        r36[1] = r522;
        goto L181
    L146:
        if (r14[1] == 2) goto L149;
        r1211 = false;
        goto L150
    L116:
        r37 = r12;
        int r012 = 0;
        int r417 = 0;
        int r523 = 0;
        int r617 = 0;
    L117:
        if (r012 >= r519) goto L142;
        r417 = r417 + 1;
        C2454rb r1213 = r242[r012];
        int r165 = r39.m810T(r1213, r82);
        int r266 = r314;
        if (r1213.f8637p0[1] != 3) goto L121;
        r523 = r523 + 1;
    L121:
        int r274 = r523;
        if (r617 == r82) goto L126;
        if (((r39.f1264Q0 + r617) + r165) > r82) goto L126;
    L128:
        boolean r317 = false;
    L129:
        if (r317 == true) goto L135;
        if (r012 <= 0) goto L135;
        int r524 = r39.f1268U0;
        if (r524 <= 0) goto L135;
        if (r417 <= r524) goto L135;
        r317 = true;
    L135:
        if (r317 == false) goto L138;
        r314 = r266;
        r120 = new C0325Hh(r39, r314, r39.f8588I, r39.f8589J, r39.f8590K, r39.f8591L, r82);
        r120.f1103n = r012;
        r222.add(r120);
        r417 = 1;
    L137:
        r617 = r165;
    L141:
        r120.m688a(r1213);
        r012 = r012 + 1;
        r523 = r274;
        goto L117
    L138:
        r314 = r266;
        if (r012 <= 0) goto L137;
        r617 = (r39.f1264Q0 + r165) + r617;
    L126:
        if (r120.f1091b == null) goto L128;
        r317 = true;
        goto L129
    L142:
        r612 = r523;
        goto L143
    L72:
        r35 = r18;
        r110 = r17;
        goto L73
    L43:
        if (r39.f1251D0 != (-1)) goto L46;
        int r717 = 0;
        r39.f1251D0 = 0;
    L45:
        r232 = r16;
        if (r39.f1252E0 != (-1)) goto L56;
        r39.f1252E0 = r717;
        goto L56
    L46:
        r717 = 0;
        goto L45
    L424:
        setMeasuredDimension(0, 0);
    }

    @Override // p000.AbstractC1364eb, android.view.View
    public final void onMeasure(int r2, int r3) {
        mo1836j(this.f3853j, r2, r3);
    }

    public void setFirstHorizontalBias(float r2) {
        this.f3853j.f1259L0 = r2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int r2) {
        this.f3853j.f1253F0 = r2;
        requestLayout();
    }

    public void setFirstVerticalBias(float r2) {
        this.f3853j.f1260M0 = r2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int r2) {
        this.f3853j.f1254G0 = r2;
        requestLayout();
    }

    public void setHorizontalAlign(int r2) {
        this.f3853j.f1265R0 = r2;
        requestLayout();
    }

    public void setHorizontalBias(float r2) {
        this.f3853j.f1257J0 = r2;
        requestLayout();
    }

    public void setHorizontalGap(int r2) {
        this.f3853j.f1263P0 = r2;
        requestLayout();
    }

    public void setHorizontalStyle(int r2) {
        this.f3853j.f1251D0 = r2;
        requestLayout();
    }

    public void setLastHorizontalBias(float r2) {
        this.f3853j.f1261N0 = r2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int r2) {
        this.f3853j.f1255H0 = r2;
        requestLayout();
    }

    public void setLastVerticalBias(float r2) {
        this.f3853j.f1262O0 = r2;
        requestLayout();
    }

    public void setLastVerticalStyle(int r2) {
        this.f3853j.f1256I0 = r2;
        requestLayout();
    }

    public void setMaxElementsWrap(int r2) {
        this.f3853j.f1268U0 = r2;
        requestLayout();
    }

    public void setOrientation(int r2) {
        this.f3853j.f1269V0 = r2;
        requestLayout();
    }

    public void setPadding(int r2) {
        C0368Ih r0 = this.f3853j;
        r0.f1276s0 = r2;
        r0.f1277t0 = r2;
        r0.f1278u0 = r2;
        r0.f1279v0 = r2;
        requestLayout();
    }

    public void setPaddingBottom(int r2) {
        this.f3853j.f1277t0 = r2;
        requestLayout();
    }

    public void setPaddingLeft(int r2) {
        this.f3853j.f1280w0 = r2;
        requestLayout();
    }

    public void setPaddingRight(int r2) {
        this.f3853j.f1281x0 = r2;
        requestLayout();
    }

    public void setPaddingTop(int r2) {
        this.f3853j.f1276s0 = r2;
        requestLayout();
    }

    public void setVerticalAlign(int r2) {
        this.f3853j.f1266S0 = r2;
        requestLayout();
    }

    public void setVerticalBias(float r2) {
        this.f3853j.f1258K0 = r2;
        requestLayout();
    }

    public void setVerticalGap(int r2) {
        this.f3853j.f1264Q0 = r2;
        requestLayout();
    }

    public void setVerticalStyle(int r2) {
        this.f3853j.f1252E0 = r2;
        requestLayout();
    }

    public void setWrapMode(int r2) {
        this.f3853j.f1267T0 = r2;
        requestLayout();
    }
}
