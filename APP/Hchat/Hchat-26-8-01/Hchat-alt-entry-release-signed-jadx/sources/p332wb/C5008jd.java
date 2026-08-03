package p332wb;

import android.content.Context;
import bi.AbstractC0316d;
import bi.C0314b;
import p011ab.C0045e;
import p028c1.AbstractC0378h;
import p071f1.AbstractC0996c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p144k.AbstractC2192n;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3256t;
import p266s0.C3878h;
import p276sf.C3967n;
import p306v.AbstractC4360e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.jd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5008jd implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18098g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f18099h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f18100i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f18101j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5008jd(Context context, String str, InterfaceC1220a interfaceC1220a, int i9) {
        this.f18099h = context;
        this.f18100i = str;
        this.f18101j = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18098g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h0, 0);
                    int iHashCode = Long.hashCode(c1836h0.f6095T);
                    C3878h c3878hM4546l = c1836h0.m4546l();
                    C5850l c5850l = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, c5850l);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(c5660y);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c3256tM6935a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                    C1858m2 c1858m2 = AbstractC0316d.f944a;
                    long jM1237g = ((C0314b) c1836h0.m4542j(c1858m2)).m1237g();
                    long jM10248D = AbstractC5700d.m10248D(13);
                    float f3 = 8;
                    float f10 = 12;
                    InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC2192n.m5430g(AbstractC0378h.m1337b(AbstractC3208d.m6884n(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f3, 1), AbstractC4360e.m8800a(f3)), ((C0314b) c1836h0.m4542j(c1858m2)).m1244n(), AbstractC0996c0.f3162b), f10, 10);
                    String str = this.f18100i;
                    AbstractC4045s.m8250n(str, interfaceC5853oM6883m, jM1237g, jM10248D, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24576, 0, 262120);
                    Context context = this.f18099h;
                    boolean zM4538h = c1836h0.m4538h(context) | c1836h0.m4534f(str);
                    InterfaceC1220a interfaceC1220a = this.f18101j;
                    boolean zM4534f = zM4538h | c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C0045e(context, str, interfaceC1220a, 23);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4045s.m8251o("复制路径", (InterfaceC1220a) objM4514P, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f10, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 390, 1912);
                    AbstractC4045s.m8251o("关闭", interfaceC1220a, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f3, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h0, 390, 1912);
                    c1836h0.m4553p(true);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9642q3(this.f18099h, this.f18100i, this.f18101j, (C1836h0) obj, AbstractC1874r.m4617C(3121));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5008jd(String str, Context context, InterfaceC1220a interfaceC1220a) {
        this.f18100i = str;
        this.f18099h = context;
        this.f18101j = interfaceC1220a;
    }
}
