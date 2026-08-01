package bsh;

/* JADX INFO: renamed from: bsh.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1191i0 extends AbstractC1195i4 implements InterfaceC1230o3 {
    public C1191i0(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4437k(Object obj, Object obj2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) throws C1163d2 {
        if (obj2 == Primitive.VOID) {
            return false;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(AbstractC1200j3.m4446f(obj, obj2, 91)).equals(Boolean.TRUE);
        } catch (C1279w4 e10) {
            throw e10.mo5168b("Switch value: " + interfaceC1188h3.getText() + ": ", this, c1174f1);
        }
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1169e2 {
        int i10;
        int iMo4050r = mo4050r();
        InterfaceC1188h3 interfaceC1188h3Mo4051s = mo4051s(0);
        Object objMo4048p = interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2);
        if (Primitive.unwrap(objMo4048p) != null && objMo4048p.getClass().isEnum()) {
            c1174f1.m4319h().m4362X(objMo4048p.getClass());
        }
        if (1 >= iMo4050r) {
            throw new C1169e2("Empty switch statement.", this, c1174f1);
        }
        C1185h0 c1185h0 = (C1185h0) mo4051s(1);
        C1171e4 c1171e4 = null;
        int i11 = 2;
        while (i11 < iMo4050r && c1171e4 == null) {
            if (c1185h0.f3591y || m4437k(objMo4048p, c1185h0.mo4048p(c1174f1, runnableC1205k2), c1174f1, interfaceC1188h3Mo4051s)) {
                while (i11 < iMo4050r) {
                    i10 = i11 + 1;
                    InterfaceC1188h3 interfaceC1188h3Mo4051s2 = mo4051s(i11);
                    if (!(interfaceC1188h3Mo4051s2 instanceof C1185h0)) {
                        Object objMo4048p2 = interfaceC1188h3Mo4051s2.mo4048p(c1174f1, runnableC1205k2);
                        if (objMo4048p2 instanceof C1171e4) {
                            c1171e4 = (C1171e4) objMo4048p2;
                            i11 = i10;
                            break;
                        }
                    }
                    i11 = i10;
                }
            } else {
                while (i11 < iMo4050r) {
                    i10 = i11 + 1;
                    InterfaceC1188h3 interfaceC1188h3Mo4051s3 = mo4051s(i11);
                    if (interfaceC1188h3Mo4051s3 instanceof C1185h0) {
                        c1185h0 = (C1185h0) interfaceC1188h3Mo4051s3;
                        i11 = i10;
                        break;
                        break;
                    }
                    i11 = i10;
                }
            }
        }
        return (c1171e4 == null || c1171e4.f3541q != 47) ? Primitive.VOID : c1171e4;
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": switch";
    }
}
