package fun.box001.internal.dexformat;

import fun.box001.internal.dexformat.writer.AbstractC0156g;
import fun.box001.internal.dexformat.writer.AbstractC0167r;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0166q;
import fun.box001.internal.dexformat.writer.C0169t;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import java.util.HashMap;

/* JADX INFO: renamed from: e.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0017A {

    /* JADX INFO: renamed from: a */
    private static final HashMap f65a = null;

    static {
        HashMap r0 = new HashMap(400);
        f65a = r0;
        r0.put(AbstractC0167r.f600a, AbstractC0036m.f191c);
        C0166q r1 = AbstractC0167r.f604b;
        C0035l r2 = AbstractC0036m.f194d;
        r0.put(r1, r2);
        C0166q r12 = AbstractC0167r.f608c;
        C0035l r3 = AbstractC0036m.f203g;
        r0.put(r12, r3);
        r0.put(AbstractC0167r.f612d, r2);
        r0.put(AbstractC0167r.f615e, r3);
        C0166q r13 = AbstractC0167r.f618f;
        C0035l r4 = AbstractC0036m.f212j;
        r0.put(r13, r4);
        r0.put(AbstractC0167r.f621g, r2);
        r0.put(AbstractC0167r.f624h, r3);
        r0.put(AbstractC0167r.f627i, r2);
        r0.put(AbstractC0167r.f630j, r3);
        r0.put(AbstractC0167r.f633k, r4);
        C0166q r14 = AbstractC0167r.f636l;
        C0035l r22 = AbstractC0036m.f245u;
        r0.put(r14, r22);
        C0166q r15 = AbstractC0167r.f639m;
        C0035l r32 = AbstractC0036m.f248v;
        r0.put(r15, r32);
        r0.put(AbstractC0167r.f642n, r22);
        r0.put(AbstractC0167r.f645o, r32);
        r0.put(AbstractC0167r.f651q, r22);
        r0.put(AbstractC0167r.f654r, AbstractC0036m.f137I);
        C0166q r16 = AbstractC0167r.f657s;
        C0035l r23 = AbstractC0036m.f175V;
        r0.put(r16, r23);
        C0166q r17 = AbstractC0167r.f660t;
        C0035l r33 = AbstractC0036m.f177W;
        r0.put(r17, r33);
        r0.put(AbstractC0167r.f663u, AbstractC0036m.f179X);
        r0.put(AbstractC0167r.f666v, AbstractC0036m.f181Y);
        r0.put(AbstractC0167r.f669w, AbstractC0036m.f186a0);
        r0.put(AbstractC0167r.f672x, AbstractC0036m.f183Z);
        r0.put(AbstractC0167r.f675y, r23);
        r0.put(AbstractC0167r.f678z, r33);
        C0166q r18 = AbstractC0167r.f522A;
        C0035l r24 = AbstractC0036m.f158P;
        r0.put(r18, r24);
        C0166q r19 = AbstractC0167r.f525B;
        C0035l r34 = AbstractC0036m.f161Q;
        r0.put(r19, r34);
        r0.put(AbstractC0167r.f528C, AbstractC0036m.f164R);
        r0.put(AbstractC0167r.f531D, AbstractC0036m.f167S);
        r0.put(AbstractC0167r.f534E, AbstractC0036m.f173U);
        r0.put(AbstractC0167r.f537F, AbstractC0036m.f170T);
        r0.put(AbstractC0167r.f540G, r24);
        r0.put(AbstractC0167r.f543H, r34);
        r0.put(AbstractC0167r.f546I, AbstractC0036m.f140J);
        r0.put(AbstractC0167r.f549J, AbstractC0036m.f190b1);
        r0.put(AbstractC0167r.f552K, AbstractC0036m.f223m1);
        r0.put(AbstractC0167r.f555L, AbstractC0036m.f256x1);
        r0.put(AbstractC0167r.f558M, AbstractC0036m.f121C1);
        r0.put(AbstractC0167r.f561N, AbstractC0036m.f193c1);
        r0.put(AbstractC0167r.f564O, AbstractC0036m.f226n1);
        r0.put(AbstractC0167r.f567P, AbstractC0036m.f259y1);
        r0.put(AbstractC0167r.f570Q, AbstractC0036m.f124D1);
        r0.put(AbstractC0167r.f573R, AbstractC0036m.f196d1);
        r0.put(AbstractC0167r.f576S, AbstractC0036m.f229o1);
        r0.put(AbstractC0167r.f579T, AbstractC0036m.f262z1);
        r0.put(AbstractC0167r.f582U, AbstractC0036m.f127E1);
        r0.put(AbstractC0167r.f585V, AbstractC0036m.f199e1);
        r0.put(AbstractC0167r.f588W, AbstractC0036m.f232p1);
        r0.put(AbstractC0167r.f591X, AbstractC0036m.f115A1);
        r0.put(AbstractC0167r.f594Y, AbstractC0036m.f130F1);
        r0.put(AbstractC0167r.f597Z, AbstractC0036m.f202f1);
        r0.put(AbstractC0167r.f601a0, AbstractC0036m.f235q1);
        r0.put(AbstractC0167r.f605b0, AbstractC0036m.f118B1);
        r0.put(AbstractC0167r.f609c0, AbstractC0036m.f133G1);
        r0.put(AbstractC0167r.f613d0, AbstractC0036m.f132G0);
        r0.put(AbstractC0167r.f616e0, AbstractC0036m.f138I0);
        r0.put(AbstractC0167r.f619f0, AbstractC0036m.f144K0);
        r0.put(AbstractC0167r.f622g0, AbstractC0036m.f147L0);
        r0.put(AbstractC0167r.f625h0, AbstractC0036m.f205g1);
        r0.put(AbstractC0167r.f628i0, AbstractC0036m.f238r1);
        r0.put(AbstractC0167r.f631j0, AbstractC0036m.f208h1);
        r0.put(AbstractC0167r.f634k0, AbstractC0036m.f241s1);
        r0.put(AbstractC0167r.f637l0, AbstractC0036m.f211i1);
        r0.put(AbstractC0167r.f640m0, AbstractC0036m.f244t1);
        r0.put(AbstractC0167r.f643n0, AbstractC0036m.f214j1);
        r0.put(AbstractC0167r.f646o0, AbstractC0036m.f247u1);
        r0.put(AbstractC0167r.f649p0, AbstractC0036m.f217k1);
        r0.put(AbstractC0167r.f652q0, AbstractC0036m.f250v1);
        r0.put(AbstractC0167r.f655r0, AbstractC0036m.f220l1);
        r0.put(AbstractC0167r.f658s0, AbstractC0036m.f253w1);
        r0.put(AbstractC0167r.f661t0, AbstractC0036m.f135H0);
        r0.put(AbstractC0167r.f664u0, AbstractC0036m.f141J0);
        r0.put(AbstractC0167r.f667v0, AbstractC0036m.f136H1);
        r0.put(AbstractC0167r.f670w0, AbstractC0036m.f139I1);
        r0.put(AbstractC0167r.f673x0, AbstractC0036m.f142J1);
        r0.put(AbstractC0167r.f676y0, AbstractC0036m.f145K1);
        r0.put(AbstractC0167r.f679z0, AbstractC0036m.f148L1);
        r0.put(AbstractC0167r.f523A0, AbstractC0036m.f151M1);
        r0.put(AbstractC0167r.f526B0, AbstractC0036m.f154N1);
        r0.put(AbstractC0167r.f529C0, AbstractC0036m.f157O1);
        r0.put(AbstractC0167r.f532D0, AbstractC0036m.f160P1);
        r0.put(AbstractC0167r.f535E0, AbstractC0036m.f163Q1);
        r0.put(AbstractC0167r.f538F0, AbstractC0036m.f166R1);
        r0.put(AbstractC0167r.f541G0, AbstractC0036m.f155O);
        r0.put(AbstractC0167r.f544H0, AbstractC0036m.f143K);
        r0.put(AbstractC0167r.f547I0, AbstractC0036m.f149M);
        r0.put(AbstractC0167r.f550J0, AbstractC0036m.f146L);
        r0.put(AbstractC0167r.f553K0, AbstractC0036m.f152N);
        r0.put(AbstractC0167r.f556L0, AbstractC0036m.f159P0);
        r0.put(AbstractC0167r.f559M0, AbstractC0036m.f168S0);
        r0.put(AbstractC0167r.f562N0, AbstractC0036m.f176V0);
        r0.put(AbstractC0167r.f565O0, AbstractC0036m.f150M0);
        r0.put(AbstractC0167r.f568P0, AbstractC0036m.f171T0);
        r0.put(AbstractC0167r.f571Q0, AbstractC0036m.f178W0);
        r0.put(AbstractC0167r.f574R0, AbstractC0036m.f153N0);
        r0.put(AbstractC0167r.f577S0, AbstractC0036m.f162Q0);
        r0.put(AbstractC0167r.f580T0, AbstractC0036m.f180X0);
        r0.put(AbstractC0167r.f583U0, AbstractC0036m.f156O0);
        r0.put(AbstractC0167r.f586V0, AbstractC0036m.f165R0);
        r0.put(AbstractC0167r.f589W0, AbstractC0036m.f174U0);
        r0.put(AbstractC0167r.f592X0, AbstractC0036m.f182Y0);
        r0.put(AbstractC0167r.f595Y0, AbstractC0036m.f184Z0);
        r0.put(AbstractC0167r.f598Z0, AbstractC0036m.f187a1);
        r0.put(AbstractC0167r.f602a1, AbstractC0036m.f233q);
        C0166q r110 = AbstractC0167r.f606b1;
        C0035l r25 = AbstractC0036m.f236r;
        r0.put(r110, r25);
        C0166q r111 = AbstractC0167r.f610c1;
        C0035l r35 = AbstractC0036m.f239s;
        r0.put(r111, r35);
        r0.put(AbstractC0167r.f614d1, r25);
        r0.put(AbstractC0167r.f617e1, r35);
        r0.put(AbstractC0167r.f620f1, AbstractC0036m.f242t);
        r0.put(AbstractC0167r.f623g1, AbstractC0036m.f119C);
        r0.put(AbstractC0167r.f626h1, AbstractC0036m.f134H);
        r0.put(AbstractC0167r.f629i1, AbstractC0036m.f257y);
        r0.put(AbstractC0167r.f632j1, AbstractC0036m.f260z);
        C0166q r112 = AbstractC0167r.f635k1;
        C0035l r26 = AbstractC0036m.f189b0;
        r0.put(r112, r26);
        C0166q r113 = AbstractC0167r.f638l1;
        C0035l r36 = AbstractC0036m.f192c0;
        r0.put(r113, r36);
        r0.put(AbstractC0167r.f641m1, r26);
        r0.put(AbstractC0167r.f644n1, r36);
        r0.put(AbstractC0167r.f647o1, AbstractC0036m.f195d0);
        r0.put(AbstractC0167r.f650p1, AbstractC0036m.f198e0);
        r0.put(AbstractC0167r.f653q1, AbstractC0036m.f201f0);
        r0.put(AbstractC0167r.f656r1, AbstractC0036m.f204g0);
        r0.put(AbstractC0167r.f659s1, AbstractC0036m.f207h0);
        C0166q r114 = AbstractC0167r.f662t1;
        C0035l r27 = AbstractC0036m.f210i0;
        r0.put(r114, r27);
        C0166q r115 = AbstractC0167r.f665u1;
        C0035l r37 = AbstractC0036m.f213j0;
        r0.put(r115, r37);
        r0.put(AbstractC0167r.f668v1, r27);
        r0.put(AbstractC0167r.f671w1, r37);
        r0.put(AbstractC0167r.f674x1, AbstractC0036m.f216k0);
        r0.put(AbstractC0167r.f677y1, AbstractC0036m.f219l0);
        r0.put(AbstractC0167r.f680z1, AbstractC0036m.f222m0);
        r0.put(AbstractC0167r.f524A1, AbstractC0036m.f225n0);
        r0.put(AbstractC0167r.f527B1, AbstractC0036m.f228o0);
        r0.put(AbstractC0167r.f530C1, AbstractC0036m.f122D);
        r0.put(AbstractC0167r.f557L1, AbstractC0036m.f113A);
        r0.put(AbstractC0167r.f560M1, AbstractC0036m.f116B);
        C0166q r116 = AbstractC0167r.f563N1;
        C0035l r28 = AbstractC0036m.f234q0;
        r0.put(r116, r28);
        r0.put(AbstractC0167r.f566O1, AbstractC0036m.f231p0);
        r0.put(AbstractC0167r.f569P1, r28);
        r0.put(AbstractC0167r.f572Q1, AbstractC0036m.f237r0);
        C0166q r117 = AbstractC0167r.f575R1;
        C0035l r29 = AbstractC0036m.f252w0;
        r0.put(r117, r29);
        r0.put(AbstractC0167r.f578S1, AbstractC0036m.f249v0);
        r0.put(AbstractC0167r.f581T1, r29);
        r0.put(AbstractC0167r.f584U1, AbstractC0036m.f255x0);
        C0166q r118 = AbstractC0167r.f587V1;
        C0035l r210 = AbstractC0036m.f243t0;
        r0.put(r118, r210);
        r0.put(AbstractC0167r.f590W1, AbstractC0036m.f240s0);
        r0.put(AbstractC0167r.f593X1, r210);
        r0.put(AbstractC0167r.f596Y1, AbstractC0036m.f246u0);
        C0166q r119 = AbstractC0167r.f599Z1;
        C0035l r211 = AbstractC0036m.f261z0;
        r0.put(r119, r211);
        r0.put(AbstractC0167r.f603a2, AbstractC0036m.f258y0);
        r0.put(AbstractC0167r.f607b2, r211);
        r0.put(AbstractC0167r.f611c2, AbstractC0036m.f114A0);
    }

    /* JADX INFO: renamed from: a */
    public static C0035l m70a(AbstractC0156g r3) {
        C0166q r0 = r3.m366h();
        C0035l r1 = (C0035l) f65a.get(r0);
        if (r1 == null) goto L5;
        return r1;
    L5:
        int r12 = r0.m414d();
        if (r12 == 4) goto L73;
        if (r12 != 5) goto L10;
        AbstractC0171a r32 = ((C0169t) r3).m362l();
        if ((r32 instanceof C0191u) == false) goto L67;
        return AbstractC0036m.f254x;
    L67:
        if ((r32 instanceof C0190t) == false) goto L71;
        return AbstractC0036m.f251w;
    L71:
        throw new RuntimeException("Unexpected constant type");
    L10:
        if (r12 == 41) goto L61;
        if (r12 == 42) goto L59;
        if (r12 != 55) goto L16;
        C0162m r33 = r3.m368j();
        if (r33 != null) goto L49;
        return AbstractC0036m.f191c;
    L49:
        switch(r33.mo380d()) {
            case 1: goto L57;
            case 2: goto L57;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L57;
            case 6: goto L57;
            case 7: goto L55;
            case 8: goto L57;
            case 9: goto L53;
            default: goto L51;
        };
    L51:
        throw new RuntimeException("Unexpected basic type");
    L53:
        return AbstractC0036m.f227o;
    L55:
        return AbstractC0036m.f224n;
    L57:
        return AbstractC0036m.f221m;
    L16:
        switch(r12) {
            case 45: goto L36;
            case 46: goto L34;
            case 47: goto L32;
            case 48: goto L30;
            case 49: goto L29;
            case 50: goto L27;
            case 51: goto L25;
            case 52: goto L23;
            case 53: goto L21;
            default: goto L17;
        };
    L17:
        switch(r12) {
            case 57: goto L43;
            case 58: goto L41;
            case 59: goto L39;
            default: goto L19;
        };
    L19:
        throw new RuntimeException("unknown rop: " + r0);
    L39:
        return AbstractC0036m.f172T1;
    L41:
        return AbstractC0036m.f169S1;
    L43:
        return AbstractC0036m.f131G;
    L30:
        AbstractC0040q.m182a(((C0169t) r3).m362l());
        throw null;
    L32:
        AbstractC0040q.m182a(((C0169t) r3).m362l());
        throw null;
    L34:
        AbstractC0040q.m182a(((C0169t) r3).m362l());
        throw null;
    L36:
        AbstractC0040q.m182a(((C0169t) r3).m362l());
        throw null;
    L21:
        return AbstractC0036m.f129F0;
    L23:
        return AbstractC0036m.f123D0;
    L25:
        return AbstractC0036m.f120C0;
    L27:
        return AbstractC0036m.f117B0;
    L29:
        return AbstractC0036m.f126E0;
    L59:
        return AbstractC0036m.f128F;
    L61:
        return AbstractC0036m.f125E;
    L73:
        return AbstractC0036m.f230p;
    }
}
