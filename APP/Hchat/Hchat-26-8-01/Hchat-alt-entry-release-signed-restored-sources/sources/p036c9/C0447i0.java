package p036c9;

import bi.AbstractC0316d;
import bi.C0314b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p222p.AbstractC3241o;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p266s0.C3878h;
import p276sf.C3967n;
import p308v1.InterfaceC4412n0;
import p332wb.AbstractC4955ho;
import p332wb.C5274rf;
import p332wb.C5408vh;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: c9.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0447i0 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1310g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f1311h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f1312i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0447i0(int i9, String str, String str2) {
        this.f1310g = i9;
        this.f1311h = str;
        this.f1312i = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        boolean z9;
        InterfaceC1235p interfaceC1235p;
        C1836h0 c1836h0;
        switch (this.f1310g) {
            case 0:
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                interfaceC1235p2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h02.m4538h(interfaceC1235p2) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, false);
                    int iHashCode = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, C5850l.f23787a);
                    InterfaceC5605g.f22815f.getClass();
                    InterfaceC1220a interfaceC1220a = C5601f.f22758b;
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(interfaceC1220a);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, interfaceC4412n0M6930d);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
                    if (this.f1311h.length() == 0) {
                        c1836h02.m4525a0(-897639683);
                        z9 = true;
                        AbstractC4045s.m8250n(this.f1312i, null, ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(15), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h02, 24576, 0, 262122);
                        c1836h02.m4553p(false);
                    } else {
                        z9 = true;
                        c1836h02.m4525a0(-897393667);
                        c1836h02.m4553p(false);
                    }
                    interfaceC1235p2.invoke(c1836h02, Integer.valueOf(iIntValue & 14));
                    c1836h02.m4553p(z9);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1829654377, new C5408vh(this.f1311h, this.f1312i, 0, (byte) 0), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 2:
                InterfaceC1235p interfaceC1235p3 = (InterfaceC1235p) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                interfaceC1235p3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h04.m4538h(interfaceC1235p3) ? 4 : 2;
                }
                int i9 = iIntValue3;
                if (c1836h04.m4516S(i9 & 1, (i9 & 19) != 18)) {
                    InterfaceC4412n0 interfaceC4412n0M6930d2 = AbstractC3241o.m6930d(C5840b.f23764j, false);
                    int iHashCode2 = Long.hashCode(c1836h04.f6095T);
                    C3878h c3878hM4546l2 = c1836h04.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h04, C5850l.f23787a);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h04.m4531d0();
                    if (c1836h04.f6094S) {
                        c1836h04.m4544k(c5660y);
                    } else {
                        c1836h04.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h04, interfaceC4412n0M6930d2);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h04, c3878hM4546l2);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h04, Integer.valueOf(iHashCode2));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h04);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h04, interfaceC5853oM10543c2);
                    if (this.f1311h.length() == 0) {
                        c1836h04.m4525a0(-585908205);
                        interfaceC1235p = interfaceC1235p3;
                        AbstractC4045s.m8250n(this.f1312i, null, ((C0314b) c1836h04.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h04, 24576, 0, 262122);
                        c1836h04 = c1836h04;
                        c1836h04.m4553p(false);
                    } else {
                        interfaceC1235p = interfaceC1235p3;
                        c1836h04.m4525a0(-585639125);
                        c1836h04.m4553p(false);
                    }
                    interfaceC1235p.invoke(c1836h04, Integer.valueOf(i9 & 14));
                    c1836h04.m4553p(true);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 3:
                InterfaceC1235p interfaceC1235p4 = (InterfaceC1235p) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                interfaceC1235p4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c1836h05.m4538h(interfaceC1235p4) ? 4 : 2;
                }
                int i10 = iIntValue4;
                if (c1836h05.m4516S(i10 & 1, (i10 & 19) != 18)) {
                    InterfaceC4412n0 interfaceC4412n0M6930d3 = AbstractC3241o.m6930d(C5840b.f23761g, false);
                    int iHashCode3 = Long.hashCode(c1836h05.f6095T);
                    C3878h c3878hM4546l3 = c1836h05.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h05, C5850l.f23787a);
                    InterfaceC5605g.f22815f.getClass();
                    InterfaceC1220a interfaceC1220a2 = C5601f.f22758b;
                    c1836h05.m4531d0();
                    if (c1836h05.f6094S) {
                        c1836h05.m4544k(interfaceC1220a2);
                    } else {
                        c1836h05.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h05, interfaceC4412n0M6930d3);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h05, c3878hM4546l3);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h05, Integer.valueOf(iHashCode3));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h05);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h05, interfaceC5853oM10543c3);
                    if (AbstractC3149m.m6721t0(this.f1311h)) {
                        c1836h05.m4525a0(1139870914);
                        AbstractC4045s.m8250n(AbstractC3149m.m6721t0(this.f1312i) ? "当前微信账号资料尚未就绪" : "填写评论内容", null, ((C0314b) c1836h05.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h05, 24576, 0, 262122);
                        C1836h0 c1836h06 = c1836h05;
                        c1836h06.m4553p(false);
                        c1836h0 = c1836h06;
                    } else {
                        c1836h05.m4525a0(1140139994);
                        c1836h05.m4553p(false);
                        c1836h0 = c1836h05;
                    }
                    interfaceC1235p4.invoke(c1836h0, Integer.valueOf(i10 & 14));
                    c1836h0.m4553p(true);
                } else {
                    c1836h05.m4519V();
                }
                break;
            default:
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) obj;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC1220a3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h07.m4538h(interfaceC1220a3) ? 4 : 2;
                }
                if (c1836h07.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    AbstractC3165h.m6777d(null, this.f1311h, 0L, 0L, 0L, false, interfaceC1220a3, 0L, 0L, false, AbstractC3879i.m8071e(-1725369821, new C5274rf(this.f1312i, interfaceC1220a3, 2), c1836h07), c1836h07, ((iIntValue5 << 24) & 234881024) | 6, 3072);
                } else {
                    c1836h07.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
