package bsh;

/* JADX INFO: renamed from: bsh.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1245r0 extends AbstractC1195i4 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: y */
    public boolean f3793y;

    /* JADX INFO: renamed from: z */
    public String f3794z;

    public C1245r0(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        InterfaceC1188h3 interfaceC1188h3Mo4051s;
        InterfaceC1188h3 interfaceC1188h3Mo4051s2;
        int i10;
        String str;
        int iMo4050r = mo4050r();
        if (this.f3793y) {
            interfaceC1188h3Mo4051s2 = mo4051s(1);
            interfaceC1188h3Mo4051s = mo4051s(0);
        } else {
            InterfaceC1188h3 interfaceC1188h3Mo4051s3 = mo4051s(0);
            interfaceC1188h3Mo4051s = iMo4050r > 1 ? mo4051s(1) : null;
            interfaceC1188h3Mo4051s2 = interfaceC1188h3Mo4051s3;
        }
        for (boolean z10 = this.f3793y; !Thread.interrupted() && (z10 || C1250s.m5081k(interfaceC1188h3Mo4051s2, c1174f1, runnableC1205k2)); z10 = false) {
            if (interfaceC1188h3Mo4051s != null) {
                Object objM4439k = interfaceC1188h3Mo4051s instanceof C1196j ? ((C1196j) interfaceC1188h3Mo4051s).m4439k(c1174f1, runnableC1205k2, null) : interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2);
                if (objM4439k instanceof C1171e4) {
                    C1171e4 c1171e4 = (C1171e4) objM4439k;
                    String str2 = c1171e4.f3542r;
                    if ((str2 != null && ((str = this.f3794z) == null || !str.equals(str2))) || (i10 = c1171e4.f3541q) == 47) {
                        return objM4439k;
                    }
                    if (i10 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3794z + ": do=" + this.f3793y;
    }
}
