package p332wb;

import bi.AbstractC0316d;
import bi.C0314b;
import gg.AbstractC1416l;
import java.util.List;
import p028c1.AbstractC0378h;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1237r;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p144k.AbstractC2192n;
import p177m2.C2767k;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p251r.C3619d;
import p266s0.C3878h;
import p276sf.C3967n;
import p306v.AbstractC4360e;
import p308v1.InterfaceC4412n0;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.ov */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5191ov implements InterfaceC1237r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f19530g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f19531h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f19532i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5191ov(List list, String str, InterfaceC1231l interfaceC1231l) {
        this.f19530g = list;
        this.f19531h = str;
        this.f19532i = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i9;
        long jM2634b;
        long jM1238h;
        C3619d c3619d = (C3619d) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1836h0 c1836h0 = (C1836h0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i9 = (c1836h0.m4534f(c3619d) ? 4 : 2) | iIntValue2;
        } else {
            i9 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i9 |= c1836h0.m4530d(iIntValue) ? 32 : 16;
        }
        if (c1836h0.m4516S(i9 & 1, (i9 & 147) != 146)) {
            String str = (String) this.f19530g.get(iIntValue);
            c1836h0.m4525a0(1928632006);
            boolean zM3825a = AbstractC1416l.m3825a(str, this.f19531h);
            float f3 = 12;
            InterfaceC5853o interfaceC5853oM1337b = AbstractC0378h.m1337b(AbstractC3222h1.m6902e(C5850l.f23787a, 34), AbstractC4360e.m8800a(f3));
            if (zM3825a) {
                c1836h0.m4525a0(1928865590);
                jM2634b = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1240j();
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(1928965472);
                jM2634b = C1034w.m2634b(((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1237g(), 0.06f);
                c1836h0.m4553p(false);
            }
            InterfaceC5853o interfaceC5853oM5430g = AbstractC2192n.m5430g(interfaceC5853oM1337b, jM2634b, AbstractC0996c0.f3162b);
            InterfaceC1231l interfaceC1231l = this.f19532i;
            boolean zM4534f = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4534f(str);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = new C5125mv(interfaceC1231l, str);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC5853o interfaceC5853oM6884n = AbstractC3208d.m6884n(AbstractC2192n.m5433j(interfaceC5853oM5430g, false, null, null, (InterfaceC1220a) objM4514P, 15), f3, 0.0f, 2);
            InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23765k, false);
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6884n);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0M6930d);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            if (zM3825a) {
                c1836h0.m4525a0(-398460115);
                c1836h0.m4553p(false);
                jM1238h = C1034w.f3259c;
            } else {
                c1836h0.m4525a0(-398459009);
                jM1238h = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1238h();
                c1836h0.m4553p(false);
            }
            AbstractC4045s.m8250n(str, null, jM1238h, AbstractC5700d.m10248D(13), zM3825a ? C2767k.f9000j : C2767k.f8999i, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24576, 0, 262058);
            c1836h0.m4553p(true);
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }
}
