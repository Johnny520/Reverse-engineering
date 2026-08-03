package p332wb;

import bi.AbstractC0316d;
import bi.C0314b;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3256t;
import p266s0.C3878h;
import p276sf.C3967n;
import p280t2.C4095k;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.rf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5274rf implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20453g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20454h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1220a f20455i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5274rf(String str, InterfaceC1220a interfaceC1220a, int i9) {
        this.f20453g = i9;
        this.f20454h = str;
        this.f20455i = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20453g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9503b("转发好友", this.f20454h, this.f20455i, c1836h0, 6);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C5850l c5850l = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
                    int iHashCode = Long.hashCode(c1836h02.f6095T);
                    C3878h c3878hM4546l = c1836h02.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6901d);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h02.m4531d0();
                    if (c1836h02.f6094S) {
                        c1836h02.m4544k(c5660y);
                    } else {
                        c1836h02.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, c3256tM6935a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
                    String str = this.f20454h;
                    if (AbstractC3149m.m6721t0(str)) {
                        c1836h02.m4525a0(-977873523);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(-978218367);
                        AbstractC4045s.m8250n(str, AbstractC3208d.m6883m(AbstractC3222h1.m6901d(c5850l, 1.0f), 4, 8), ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h02, 24624, 0, 262120);
                        c1836h02 = c1836h02;
                        c1836h02.m4553p(false);
                    }
                    C5491y2.f22068p.m9899k("确定", this.f20455i, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 10, 0.0f, 6, 5), true, c1836h02, 28038, 0);
                    c1836h02.m4553p(true);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C5850l c5850l2 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6901d2 = AbstractC3222h1.m6901d(c5850l2, 1.0f);
                    C3256t c3256tM6935a2 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h03, 0);
                    int iHashCode2 = Long.hashCode(c1836h03.f6095T);
                    C3878h c3878hM4546l2 = c1836h03.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM6901d2);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h03.m4531d0();
                    if (c1836h03.f6094S) {
                        c1836h03.m4544k(c5660y2);
                    } else {
                        c1836h03.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h03, c3256tM6935a2);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h03, c3878hM4546l2);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h03, Integer.valueOf(iHashCode2));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h03);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h03, interfaceC5853oM10543c2);
                    AbstractC4045s.m8250n(this.f20454h, AbstractC3208d.m6884n(AbstractC3222h1.m6901d(c5850l2, 1.0f), 0.0f, 10, 1), ((C0314b) c1836h03.m4542j(AbstractC0316d.f944a)).m1238h(), 0L, null, null, 0L, new C4095k(3), 0L, 0, false, 0, 0, null, null, c1836h03, 48, 0, 261112);
                    AbstractC4045s.m8251o("取消", this.f20455i, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l2, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, null, null, c1836h03, 390, 2040);
                    c1836h03.m4553p(true);
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
