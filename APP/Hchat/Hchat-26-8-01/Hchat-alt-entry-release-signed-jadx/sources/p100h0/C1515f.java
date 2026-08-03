package p100h0;

import p015b0.C0146l;
import p028c1.AbstractC0378h;
import p028c1.C0374d;
import p049d9.C0747h;
import p063e9.C0832c;
import p071f1.C1017n;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p174m.AbstractC2574a2;
import p174m.C2646r;
import p174m.EnumC2640p1;
import p174m.InterfaceC2613i2;
import p198nb.C2924a;
import p219oh.AbstractC3165h;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p321w.C4606i1;
import p321w.C4609j1;
import p321w.C4640v;
import p332wb.AbstractC4955ho;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;

/* JADX INFO: renamed from: h0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1515f implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5063g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f5064h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5065i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1515f(Object obj, boolean z9, int i9) {
        this.f5063g = i9;
        this.f5065i = obj;
        this.f5064h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f5063g) {
            case 0:
                final InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f5065i;
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                c1836h0.m4525a0(-196777734);
                final long j3 = ((C1532k1) c1836h0.m4542j(AbstractC1535l1.f5116a)).f5111a;
                boolean zM4532e = c1836h0.m4532e(j3) | c1836h0.m4534f(interfaceC1220a);
                final boolean z9 = this.f5064h;
                boolean zM4536g = zM4532e | c1836h0.m4536g(z9);
                Object objM4514P = c1836h0.m4514P();
                if (zM4536g || objM4514P == C1851l.f6155a) {
                    objM4514P = new InterfaceC1231l() { // from class: h0.g
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj4) {
                            C0374d c0374d = (C0374d) obj4;
                            return c0374d.m1334e(new C0747h(1, interfaceC1220a, AbstractC3165h.m6791r(c0374d, Float.intBitsToFloat((int) (c0374d.f1051g.mo1324a() >> 32)) / 2.0f), new C1017n(j3, 5), z9));
                        }
                    };
                    c1836h0.m4545k0(objM4514P);
                }
                InterfaceC5853o interfaceC5853oM1340e = AbstractC0378h.m1340e(interfaceC5853o, (InterfaceC1231l) objM4514P);
                c1836h0.m4553p(false);
                break;
            case 1:
                C4609j1 c4609j1 = (C4609j1) this.f5065i;
                C1845j1 c1845j1 = c4609j1.f15211f;
                C1836h0 c1836h02 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                c1836h02.m4525a0(-2137546592);
                boolean z10 = ((EnumC2640p1) c1845j1.getValue()) == EnumC2640p1.f8622g || !(c1836h02.m4542j(AbstractC5888h1.f23932n) == EnumC4243m.f13920h);
                boolean zM4534f = c1836h02.m4534f(c4609j1);
                Object objM4514P2 = c1836h02.m4514P();
                C1823e c1823e = C1851l.f6155a;
                if (zM4534f || objM4514P2 == c1823e) {
                    objM4514P2 = new C2924a(c4609j1, 21);
                    c1836h02.m4545k0(objM4514P2);
                }
                InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y((InterfaceC1231l) objM4514P2, c1836h02);
                Object objM4514P3 = c1836h02.m4514P();
                if (objM4514P3 == c1823e) {
                    C2646r c2646r = new C2646r(new C0146l(interfaceC1809a1M4643y, 9));
                    c1836h02.m4545k0(c2646r);
                    objM4514P3 = c2646r;
                }
                InterfaceC2613i2 interfaceC2613i2 = (InterfaceC2613i2) objM4514P3;
                boolean zM4534f2 = c1836h02.m4534f(interfaceC2613i2) | c1836h02.m4534f(c4609j1);
                Object objM4514P4 = c1836h02.m4514P();
                if (zM4534f2 || objM4514P4 == c1823e) {
                    objM4514P4 = new C4606i1(interfaceC2613i2, c4609j1);
                    c1836h02.m4545k0(objM4514P4);
                }
                InterfaceC5853o interfaceC5853oM6041b = AbstractC2574a2.m6041b((C4606i1) objM4514P4, (EnumC2640p1) c1845j1.getValue(), this.f5064h && c4609j1.f15207b.m4488g() != 0.0f, z10);
                c1836h02.m4553p(false);
                break;
            case 2:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f5065i;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(711082021, new C4640v(this.f5064h, interfaceC1231l, 1), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C0832c c0832c = (C0832c) this.f5065i;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1291853221, new C4640v(this.f5064h, c0832c, 3), c1836h04), c1836h04, 48, 1);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                String str = (String) this.f5065i;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1469901301, new C4640v(this.f5064h, str, 2), c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f5065i;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1381669988, new C4640v(this.f5064h, interfaceC1809a1, 4), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1515f(boolean z9, Object obj, int i9) {
        this.f5063g = i9;
        this.f5064h = z9;
        this.f5065i = obj;
    }
}
