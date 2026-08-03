package sh;

import ca.C0512c;
import java.util.concurrent.atomic.AtomicInteger;
import p028c1.AbstractC0378h;
import p071f1.AbstractC0996c0;
import p071f1.C1017n;
import p072f2.AbstractC1052o;
import p072f2.C1040c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1854l2;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.C3213e1;
import p222p.C3216f1;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3967n;
import p306v.C4359d;
import p307v0.C4361a;
import p322w0.C4661l;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p348xb.C5769o;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import th.AbstractC4211c;
import th.C4218j;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: sh.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3991b0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13050g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f13051h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f13052i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3874d f13053j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13054k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f13055l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f13056m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f13057n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f13058o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3991b0(long j3, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, C4007f0 c4007f0, long j4, InterfaceC5853o interfaceC5853o, C3874d c3874d, int i9) {
        this.f13051h = j3;
        this.f13054k = interfaceC1231l;
        this.f13055l = interfaceC1220a;
        this.f13056m = interfaceC1220a2;
        this.f13057n = c4007f0;
        this.f13052i = j4;
        this.f13058o = interfaceC5853o;
        this.f13053j = c3874d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC5853o interfaceC5853o;
        int i9 = this.f13050g;
        C3967n c3967n = C3967n.f12976a;
        Object obj3 = this.f13058o;
        Object obj4 = this.f13057n;
        Object obj5 = this.f13056m;
        Object obj6 = this.f13055l;
        Object obj7 = this.f13054k;
        switch (i9) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4045s.m8244h(this.f13051h, (InterfaceC1231l) obj7, (InterfaceC1220a) obj6, (InterfaceC1220a) obj5, (C4007f0) obj4, this.f13052i, (InterfaceC5853o) obj3, this.f13053j, (C1836h0) obj, AbstractC1874r.m4617C(12582961));
                break;
            default:
                C4218j c4218j = (C4218j) obj7;
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) obj6;
                InterfaceC4209a interfaceC4209a = (InterfaceC4209a) obj5;
                C5769o c5769o = (C5769o) obj4;
                C4359d c4359d = (C4359d) obj3;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                } else {
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P == c1823e) {
                        objM4514P = new C4661l(3);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AtomicInteger atomicInteger = AbstractC1052o.f3345a;
                    InterfaceC5853o interfaceC5853oM8478d = AbstractC4211c.m8478d(AbstractC0378h.m1336a(new C1040c((InterfaceC1231l) objM4514P), 0.0f), c4218j);
                    boolean zM4534f = c1836h0.m4534f(interfaceC1854l2);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f || objM4514P2 == c1823e) {
                        objM4514P2 = new C4064y0(interfaceC1854l2, 8);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    InterfaceC5853o interfaceC5853oM2516m = AbstractC0996c0.m2516m(interfaceC5853oM8478d, (InterfaceC1231l) objM4514P2);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (objM4514P3 == c1823e) {
                        objM4514P3 = new C4361a(c4359d, 8);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P3;
                    Object objM4514P4 = c1836h0.m4514P();
                    if (objM4514P4 == c1823e) {
                        objM4514P4 = new C4661l(4);
                        c1836h0.m4545k0(objM4514P4);
                    }
                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P4;
                    long j3 = this.f13051h;
                    boolean zM4532e = c1836h0.m4532e(j3);
                    Object objM4514P5 = c1836h0.m4514P();
                    if (zM4532e || objM4514P5 == c1823e) {
                        objM4514P5 = new C0512c(j3, 17);
                        c1836h0.m4545k0(objM4514P5);
                    }
                    InterfaceC5853o interfaceC5853oM8476b = AbstractC4211c.m8476b(interfaceC5853oM2516m, interfaceC4209a, interfaceC1220a, interfaceC1231l, null, null, (InterfaceC1231l) objM4514P5, 1912);
                    if (c5769o == null || (interfaceC5853o = c5769o.f23499i) == null) {
                        interfaceC5853o = C5850l.f23787a;
                    }
                    InterfaceC5853o interfaceC5853oM2517n = AbstractC0996c0.m2517n(AbstractC3208d.m6884n(AbstractC3222h1.m6902e(interfaceC5853oM8476b.mo10549d(interfaceC5853o), 56), 4, 0.0f, 2), 0.0f, 0.0f, null, false, new C1017n(this.f13052i, 5), 262143);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.f10298a, C5840b.f23771q, c1836h0, 48);
                    int iHashCode = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l = c1836h0.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM2517n);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c3213e1M6892a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                    this.f13053j.mo734b(C3216f1.f10272a, c1836h0, 6);
                    c1836h0.m4553p(true);
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C3991b0(C4218j c4218j, InterfaceC1854l2 interfaceC1854l2, InterfaceC4209a interfaceC4209a, long j3, C5769o c5769o, long j4, C3874d c3874d, C4359d c4359d) {
        this.f13054k = c4218j;
        this.f13055l = interfaceC1854l2;
        this.f13056m = interfaceC4209a;
        this.f13051h = j3;
        this.f13057n = c5769o;
        this.f13052i = j4;
        this.f13053j = c3874d;
        this.f13058o = c4359d;
    }
}
