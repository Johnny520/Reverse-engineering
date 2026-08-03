package p227p4;

import bsh.C0353j;
import bsh.ParserConstants;
import java.util.HashMap;
import okio.C3193a;
import p295u4.AbstractC4259i;
import p295u4.AbstractC4269s;
import p295u4.C4265o;
import p295u4.C4268r;
import p295u4.C4272v;
import p311v4.AbstractC4446a;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4464m;
import p311v4.C4475x;

/* JADX INFO: renamed from: p4.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3319x {

    /* JADX INFO: renamed from: a */
    public static final HashMap f10690a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap(400);
        f10690a = map;
        map.put(AbstractC4269s.f14076a, AbstractC3306k.f10583c);
        C4268r c4268r = AbstractC4269s.f14080b;
        C3305j c3305j = AbstractC3306k.f10587d;
        map.put(c4268r, c3305j);
        C4268r c4268r2 = AbstractC4269s.f14084c;
        C3305j c3305j2 = AbstractC3306k.f10599g;
        map.put(c4268r2, c3305j2);
        map.put(AbstractC4269s.f14088d, c3305j);
        map.put(AbstractC4269s.f14092e, c3305j2);
        C4268r c4268r3 = AbstractC4269s.f14096f;
        C3305j c3305j3 = AbstractC3306k.f10611j;
        map.put(c4268r3, c3305j3);
        map.put(AbstractC4269s.f14104h, c3305j);
        map.put(AbstractC4269s.f14108i, c3305j2);
        map.put(AbstractC4269s.f14112j, c3305j);
        map.put(AbstractC4269s.f14116k, c3305j2);
        map.put(AbstractC4269s.f14120l, c3305j3);
        C4268r c4268r4 = AbstractC4269s.f14124m;
        C3305j c3305j4 = AbstractC3306k.f10648u;
        map.put(c4268r4, c3305j4);
        C4268r c4268r5 = AbstractC4269s.f14128n;
        C3305j c3305j5 = AbstractC3306k.f10651v;
        map.put(c4268r5, c3305j5);
        map.put(AbstractC4269s.f14132o, c3305j4);
        map.put(AbstractC4269s.f14136p, c3305j5);
        map.put(AbstractC4269s.f14144r, c3305j4);
        map.put(AbstractC4269s.f14148s, AbstractC3306k.f10521I);
        C4268r c4268r6 = AbstractC4269s.f14152t;
        C3305j c3305j6 = AbstractC3306k.f10563W;
        map.put(c4268r6, c3305j6);
        C4268r c4268r7 = AbstractC4269s.f14156u;
        C3305j c3305j7 = AbstractC3306k.f10566X;
        map.put(c4268r7, c3305j7);
        map.put(AbstractC4269s.f14160v, AbstractC3306k.f10569Y);
        map.put(AbstractC4269s.f14164w, AbstractC3306k.f10572Z);
        map.put(AbstractC4269s.f14168x, AbstractC3306k.f10580b0);
        map.put(AbstractC4269s.f14172y, AbstractC3306k.f10576a0);
        map.put(AbstractC4269s.f14176z, c3305j6);
        map.put(AbstractC4269s.f13978A, c3305j7);
        C4268r c4268r8 = AbstractC4269s.f13982B;
        C3305j c3305j8 = AbstractC3306k.f10545Q;
        map.put(c4268r8, c3305j8);
        C4268r c4268r9 = AbstractC4269s.f13986C;
        C3305j c3305j9 = AbstractC3306k.f10548R;
        map.put(c4268r9, c3305j9);
        map.put(AbstractC4269s.f13990D, AbstractC3306k.f10551S);
        map.put(AbstractC4269s.f13994E, AbstractC3306k.f10554T);
        map.put(AbstractC4269s.f13998F, AbstractC3306k.f10560V);
        map.put(AbstractC4269s.f14002G, AbstractC3306k.f10557U);
        map.put(AbstractC4269s.f14006H, c3305j8);
        map.put(AbstractC4269s.f14010I, c3305j9);
        map.put(AbstractC4269s.f14014J, AbstractC3306k.f10527K);
        map.put(AbstractC4269s.f14018K, AbstractC3306k.f10644s1);
        map.put(AbstractC4269s.f14022L, AbstractC3306k.f10508D1);
        map.put(AbstractC4269s.f14026M, AbstractC3306k.f10541O1);
        map.put(AbstractC4269s.f14030N, AbstractC3306k.f10556T1);
        map.put(AbstractC4269s.f14034O, AbstractC3306k.f10647t1);
        map.put(AbstractC4269s.f14038P, AbstractC3306k.f10511E1);
        map.put(AbstractC4269s.f14042Q, AbstractC3306k.f10544P1);
        map.put(AbstractC4269s.f14046R, AbstractC3306k.f10559U1);
        map.put(AbstractC4269s.f14050S, AbstractC3306k.f10650u1);
        map.put(AbstractC4269s.f14054T, AbstractC3306k.f10514F1);
        map.put(AbstractC4269s.f14058U, AbstractC3306k.f10547Q1);
        map.put(AbstractC4269s.f14061V, AbstractC3306k.f10562V1);
        map.put(AbstractC4269s.f14064W, AbstractC3306k.f10653v1);
        map.put(AbstractC4269s.f14067X, AbstractC3306k.f10517G1);
        map.put(AbstractC4269s.f14070Y, AbstractC3306k.f10550R1);
        map.put(AbstractC4269s.f14073Z, AbstractC3306k.f10565W1);
        map.put(AbstractC4269s.f14077a0, AbstractC3306k.f10656w1);
        map.put(AbstractC4269s.f14081b0, AbstractC3306k.f10520H1);
        map.put(AbstractC4269s.f14085c0, AbstractC3306k.f10553S1);
        map.put(AbstractC4269s.f14089d0, AbstractC3306k.f10568X1);
        map.put(AbstractC4269s.f14093e0, AbstractC3306k.f10567X0);
        map.put(AbstractC4269s.f14097f0, AbstractC3306k.f10573Z0);
        map.put(AbstractC4269s.f14101g0, AbstractC3306k.f10581b1);
        map.put(AbstractC4269s.f14105h0, AbstractC3306k.f10585c1);
        map.put(AbstractC4269s.f14109i0, AbstractC3306k.f10659x1);
        map.put(AbstractC4269s.f14113j0, AbstractC3306k.f10523I1);
        map.put(AbstractC4269s.f14117k0, AbstractC3306k.f10662y1);
        map.put(AbstractC4269s.f14121l0, AbstractC3306k.f10526J1);
        map.put(AbstractC4269s.f14125m0, AbstractC3306k.f10665z1);
        map.put(AbstractC4269s.f14129n0, AbstractC3306k.f10529K1);
        map.put(AbstractC4269s.f14133o0, AbstractC3306k.f10499A1);
        map.put(AbstractC4269s.f14137p0, AbstractC3306k.f10532L1);
        map.put(AbstractC4269s.f14141q0, AbstractC3306k.f10502B1);
        map.put(AbstractC4269s.f14145r0, AbstractC3306k.f10535M1);
        map.put(AbstractC4269s.f14149s0, AbstractC3306k.f10505C1);
        map.put(AbstractC4269s.f14153t0, AbstractC3306k.f10538N1);
        map.put(AbstractC4269s.f14157u0, AbstractC3306k.f10570Y0);
        map.put(AbstractC4269s.f14161v0, AbstractC3306k.f10577a1);
        map.put(AbstractC4269s.f14165w0, AbstractC3306k.f10571Y1);
        map.put(AbstractC4269s.f13979A0, AbstractC3306k.f10574Z1);
        map.put(AbstractC4269s.f13995E0, AbstractC3306k.f10578a2);
        map.put(AbstractC4269s.f14011I0, AbstractC3306k.f10582b2);
        map.put(AbstractC4269s.f14027M0, AbstractC3306k.f10586c2);
        map.put(AbstractC4269s.f14043Q0, AbstractC3306k.f10590d2);
        map.put(AbstractC4269s.f14051S0, AbstractC3306k.f10594e2);
        map.put(AbstractC4269s.f14059U0, AbstractC3306k.f10598f2);
        map.put(AbstractC4269s.f14065W0, AbstractC3306k.f10602g2);
        map.put(AbstractC4269s.f14071Y0, AbstractC3306k.f10606h2);
        map.put(AbstractC4269s.f14078a1, AbstractC3306k.f10610i2);
        map.put(AbstractC4269s.f14086c1, AbstractC3306k.f10542P);
        map.put(AbstractC4269s.f14090d1, AbstractC3306k.f10530L);
        map.put(AbstractC4269s.f14094e1, AbstractC3306k.f10536N);
        map.put(AbstractC4269s.f14098f1, AbstractC3306k.f10533M);
        map.put(AbstractC4269s.f14102g1, AbstractC3306k.f10539O);
        map.put(AbstractC4269s.f14106h1, AbstractC3306k.f10601g1);
        map.put(AbstractC4269s.f14110i1, AbstractC3306k.f10613j1);
        map.put(AbstractC4269s.f14114j1, AbstractC3306k.f10625m1);
        map.put(AbstractC4269s.f14118k1, AbstractC3306k.f10589d1);
        map.put(AbstractC4269s.f14122l1, AbstractC3306k.f10617k1);
        map.put(AbstractC4269s.f14126m1, AbstractC3306k.f10629n1);
        map.put(AbstractC4269s.f14130n1, AbstractC3306k.f10593e1);
        map.put(AbstractC4269s.f14134o1, AbstractC3306k.f10605h1);
        map.put(AbstractC4269s.f14138p1, AbstractC3306k.f10632o1);
        map.put(AbstractC4269s.f14142q1, AbstractC3306k.f10597f1);
        map.put(AbstractC4269s.f14146r1, AbstractC3306k.f10609i1);
        map.put(AbstractC4269s.f14150s1, AbstractC3306k.f10621l1);
        map.put(AbstractC4269s.f14154t1, AbstractC3306k.f10635p1);
        map.put(AbstractC4269s.f14158u1, AbstractC3306k.f10638q1);
        map.put(AbstractC4269s.f14162v1, AbstractC3306k.f10641r1);
        map.put(AbstractC4269s.f14166w1, AbstractC3306k.f10636q);
        C4268r c4268r10 = AbstractC4269s.f14170x1;
        C3305j c3305j10 = AbstractC3306k.f10639r;
        map.put(c4268r10, c3305j10);
        C4268r c4268r11 = AbstractC4269s.f14174y1;
        C3305j c3305j11 = AbstractC3306k.f10642s;
        map.put(c4268r11, c3305j11);
        map.put(AbstractC4269s.f14178z1, c3305j10);
        map.put(AbstractC4269s.f13980A1, c3305j11);
        map.put(AbstractC4269s.f13984B1, AbstractC3306k.f10645t);
        map.put(AbstractC4269s.f13988C1, AbstractC3306k.f10503C);
        map.put(AbstractC4269s.f13992D1, AbstractC3306k.f10518H);
        map.put(AbstractC4269s.f13996E1, AbstractC3306k.f10660y);
        map.put(AbstractC4269s.f14000F1, AbstractC3306k.f10663z);
        C4268r c4268r12 = AbstractC4269s.f14004G1;
        C3305j c3305j12 = AbstractC3306k.f10584c0;
        map.put(c4268r12, c3305j12);
        C4268r c4268r13 = AbstractC4269s.f14008H1;
        C3305j c3305j13 = AbstractC3306k.f10588d0;
        map.put(c4268r13, c3305j13);
        map.put(AbstractC4269s.f14012I1, c3305j12);
        map.put(AbstractC4269s.f14016J1, c3305j13);
        map.put(AbstractC4269s.f14020K1, AbstractC3306k.f10592e0);
        map.put(AbstractC4269s.f14024L1, AbstractC3306k.f10596f0);
        map.put(AbstractC4269s.f14028M1, AbstractC3306k.f10600g0);
        map.put(AbstractC4269s.f14032N1, AbstractC3306k.f10604h0);
        map.put(AbstractC4269s.f14036O1, AbstractC3306k.f10608i0);
        C4268r c4268r14 = AbstractC4269s.f14040P1;
        C3305j c3305j14 = AbstractC3306k.f10612j0;
        map.put(c4268r14, c3305j14);
        C4268r c4268r15 = AbstractC4269s.f14044Q1;
        C3305j c3305j15 = AbstractC3306k.f10616k0;
        map.put(c4268r15, c3305j15);
        map.put(AbstractC4269s.f14048R1, c3305j14);
        map.put(AbstractC4269s.f14052S1, c3305j15);
        map.put(AbstractC4269s.f14056T1, AbstractC3306k.f10620l0);
        map.put(AbstractC4269s.f14060U1, AbstractC3306k.f10624m0);
        map.put(AbstractC4269s.f14063V1, AbstractC3306k.f10628n0);
        map.put(AbstractC4269s.f14066W1, AbstractC3306k.f10631o0);
        map.put(AbstractC4269s.f14069X1, AbstractC3306k.f10634p0);
        map.put(AbstractC4269s.f14072Y1, AbstractC3306k.f10506D);
        map.put(AbstractC4269s.f14107h2, AbstractC3306k.f10497A);
        map.put(AbstractC4269s.f14111i2, AbstractC3306k.f10500B);
        C4268r c4268r16 = AbstractC4269s.f14119k2;
        C3305j c3305j16 = AbstractC3306k.f10640r0;
        map.put(c4268r16, c3305j16);
        map.put(AbstractC4269s.f14123l2, AbstractC3306k.f10637q0);
        map.put(AbstractC4269s.f14127m2, c3305j16);
        map.put(AbstractC4269s.f14131n2, AbstractC3306k.f10643s0);
        C4268r c4268r17 = AbstractC4269s.f14155t2;
        C3305j c3305j17 = AbstractC3306k.f10513F0;
        map.put(c4268r17, c3305j17);
        map.put(AbstractC4269s.f14159u2, AbstractC3306k.f10510E0);
        map.put(AbstractC4269s.f14163v2, c3305j17);
        map.put(AbstractC4269s.f14167w2, AbstractC3306k.f10516G0);
        C4268r c4268r18 = AbstractC4269s.f13989C2;
        C3305j c3305j18 = AbstractC3306k.f10661y0;
        map.put(c4268r18, c3305j18);
        map.put(AbstractC4269s.f13993D2, AbstractC3306k.f10658x0);
        map.put(AbstractC4269s.f13997E2, c3305j18);
        map.put(AbstractC4269s.f14001F2, AbstractC3306k.f10664z0);
        C4268r c4268r19 = AbstractC4269s.f14025L2;
        C3305j c3305j19 = AbstractC3306k.f10534M0;
        map.put(c4268r19, c3305j19);
        map.put(AbstractC4269s.f14029M2, AbstractC3306k.f10531L0);
        map.put(AbstractC4269s.f14033N2, c3305j19);
        map.put(AbstractC4269s.f14037O2, AbstractC3306k.f10537N0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3305j m7038a(AbstractC4259i abstractC4259i) {
        C4268r c4268r = abstractC4259i.f13947g;
        C3305j c3305j = (C3305j) f10690a.get(c4268r);
        if (c3305j != null) {
            return c3305j;
        }
        int i9 = c4268r.f13971a;
        if (i9 == 4) {
            return AbstractC3306k.f10633p;
        }
        if (i9 == 5) {
            AbstractC4446a abstractC4446a = ((C4272v) abstractC4259i).f13935k;
            if (abstractC4446a instanceof C4453d0) {
                return AbstractC3306k.f10657x;
            }
            if (abstractC4446a instanceof C4451c0) {
                return AbstractC3306k.f10654w;
            }
            if (abstractC4446a instanceof C4475x) {
                return AbstractC3306k.f10622l2;
            }
            if (abstractC4446a instanceof C4447a0) {
                return AbstractC3306k.f10626m2;
            }
            C0353j.m1309g("Unexpected constant type");
            return null;
        }
        if (i9 == 41) {
            return AbstractC3306k.f10509E;
        }
        if (i9 == 42) {
            return AbstractC3306k.f10512F;
        }
        if (i9 == 55) {
            C4265o c4265o = abstractC4259i.f13949i;
            if (c4265o == null) {
                return AbstractC3306k.f10583c;
            }
            switch (c4265o.f13966h.mo4905b()) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                    return AbstractC3306k.f10623m;
                case 4:
                case 7:
                    return AbstractC3306k.f10627n;
                case 9:
                    return AbstractC3306k.f10630o;
                default:
                    C0353j.m1309g("Unexpected basic type");
                    return null;
            }
        }
        switch (i9) {
            case ParserConstants.PROTECTED /* 45 */:
                int i10 = ((C4464m) ((C4272v) abstractC4259i).f13935k).f14822h.m8917k().f15649h;
                if (i10 == 1) {
                    return AbstractC3306k.f10646t0;
                }
                if (i10 == 2) {
                    return AbstractC3306k.f10649u0;
                }
                if (i10 == 3) {
                    return AbstractC3306k.f10652v0;
                }
                if (i10 == 6) {
                    return AbstractC3306k.f10637q0;
                }
                if (i10 == 8) {
                    return AbstractC3306k.f10655w0;
                }
                break;
            case 46:
                int i11 = ((C4464m) ((C4272v) abstractC4259i).f13935k).f14822h.m8917k().f15649h;
                if (i11 == 1) {
                    return AbstractC3306k.f10519H0;
                }
                if (i11 == 2) {
                    return AbstractC3306k.f10522I0;
                }
                if (i11 == 3) {
                    return AbstractC3306k.f10525J0;
                }
                if (i11 == 6) {
                    return AbstractC3306k.f10510E0;
                }
                if (i11 == 8) {
                    return AbstractC3306k.f10528K0;
                }
                break;
            case 47:
                int i12 = ((C4464m) ((C4272v) abstractC4259i).f13935k).f14822h.m8917k().f15649h;
                if (i12 == 1) {
                    return AbstractC3306k.f10498A0;
                }
                if (i12 == 2) {
                    return AbstractC3306k.f10501B0;
                }
                if (i12 == 3) {
                    return AbstractC3306k.f10504C0;
                }
                if (i12 == 6) {
                    return AbstractC3306k.f10658x0;
                }
                if (i12 == 8) {
                    return AbstractC3306k.f10507D0;
                }
                break;
            case 48:
                int i13 = ((C4464m) ((C4272v) abstractC4259i).f13935k).f14822h.m8917k().f15649h;
                if (i13 == 1) {
                    return AbstractC3306k.f10540O0;
                }
                if (i13 == 2) {
                    return AbstractC3306k.f10543P0;
                }
                if (i13 == 3) {
                    return AbstractC3306k.f10546Q0;
                }
                if (i13 == 6) {
                    return AbstractC3306k.f10531L0;
                }
                if (i13 == 8) {
                    return AbstractC3306k.f10549R0;
                }
                break;
            case 49:
                return AbstractC3306k.f10561V0;
            case 50:
                return AbstractC3306k.f10552S0;
            case 51:
                return AbstractC3306k.f10555T0;
            case 52:
                return AbstractC3306k.f10558U0;
            case 53:
                return AbstractC3306k.f10564W0;
            default:
                switch (i9) {
                    case 57:
                        return AbstractC3306k.f10515G;
                    case 58:
                        return AbstractC3306k.f10614j2;
                    case ParserConstants.VOLATILE /* 59 */:
                        return AbstractC3306k.f10618k2;
                }
        }
        C3193a.m6825o(c4268r, "unknown rop: ");
        return null;
    }
}
