package bsh;

import java.util.Iterator;

/* JADX INFO: renamed from: bsh.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1220n extends AbstractC1195i4 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: A */
    public String f3701A;

    /* JADX INFO: renamed from: B */
    public boolean f3702B;

    /* JADX INFO: renamed from: y */
    public final int f3703y;

    /* JADX INFO: renamed from: z */
    public String f3704z;

    public C1220n(int i10) {
        super(i10);
        this.f3702B = false;
        this.f3703y = C1257t0.f3810O.incrementAndGet();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        InterfaceC1188h3 interfaceC1188h3Mo4051s;
        Class cls;
        String str;
        C1283x2 c1283x2 = new C1283x2(4);
        if (this.f3702B) {
            c1283x2.m5193b("final");
        }
        C1182g3 c1182g3M4319h = c1174f1.m4319h();
        InterfaceC1188h3 interfaceC1188h3Mo4051s2 = mo4051s(0);
        int iMo4050r = mo4050r();
        if (interfaceC1188h3Mo4051s2 instanceof C1221n0) {
            Class clsM4927v = ((C1221n0) interfaceC1188h3Mo4051s2).m4927v(c1174f1, runnableC1205k2);
            InterfaceC1188h3 interfaceC1188h3Mo4051s3 = mo4051s(1);
            InterfaceC1188h3 interfaceC1188h3Mo4051s4 = iMo4050r > 2 ? mo4051s(2) : null;
            cls = clsM4927v;
            interfaceC1188h3Mo4051s2 = interfaceC1188h3Mo4051s3;
            interfaceC1188h3Mo4051s = interfaceC1188h3Mo4051s4;
        } else {
            interfaceC1188h3Mo4051s = iMo4050r > 1 ? mo4051s(1) : null;
            cls = null;
        }
        Iterator itM5215h = C1288y1.m5208l().m5215h(interfaceC1188h3Mo4051s2.mo4048p(c1174f1, runnableC1205k2));
        try {
            C1182g3 c1182g3M5090A0 = C1257t0.m5090A0(c1182g3M4319h, this.f3703y);
            c1174f1.m4318g(c1182g3M5090A0);
            while (!Thread.interrupted() && itM5215h.hasNext()) {
                try {
                    Object next = itM5215h.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    c1182g3M5090A0.m4378k();
                    c1182g3M5090A0.m4393r0(this.f3704z, cls, next, c1283x2);
                    if (interfaceC1188h3Mo4051s != null) {
                        Object objM4439k = interfaceC1188h3Mo4051s instanceof C1196j ? ((C1196j) interfaceC1188h3Mo4051s).m4439k(c1174f1, runnableC1205k2, null) : interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2);
                        if (objM4439k instanceof C1171e4) {
                            C1171e4 c1171e4 = (C1171e4) objM4439k;
                            String str2 = c1171e4.f3542r;
                            if (str2 != null && ((str = this.f3701A) == null || !str.equals(str2))) {
                                c1174f1.m4318g(c1182g3M4319h);
                                return objM4439k;
                            }
                            int i10 = c1171e4.f3541q;
                            if (i10 == 47) {
                                c1174f1.m4318g(c1182g3M4319h);
                                return objM4439k;
                            }
                            if (i10 == 13) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (C1279w4 e10) {
                    throw e10.mo5168b("for loop iterator variable:" + this.f3704z, this, c1174f1);
                }
            }
            Primitive primitive = Primitive.VOID;
            c1174f1.m4318g(c1182g3M4319h);
            return primitive;
        } catch (Throwable th) {
            c1174f1.m4318g(c1182g3M4319h);
            throw th;
        }
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3701A + ": " + this.f3704z + ", final=" + this.f3702B;
    }
}
