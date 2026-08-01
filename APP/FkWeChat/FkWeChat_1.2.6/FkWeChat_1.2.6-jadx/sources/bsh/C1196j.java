package bsh;

import java.util.ArrayList;

/* JADX INFO: renamed from: bsh.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1196j extends AbstractC1195i4 {

    /* JADX INFO: renamed from: A */
    public boolean f3622A;

    /* JADX INFO: renamed from: B */
    public boolean f3623B;

    /* JADX INFO: renamed from: C */
    public boolean f3624C;

    /* JADX INFO: renamed from: y */
    public final int f3625y;

    /* JADX INFO: renamed from: z */
    public boolean f3626z;

    /* JADX INFO: renamed from: bsh.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo4421a(InterfaceC1188h3 interfaceC1188h3);
    }

    public C1196j(int i10) {
        super(i10);
        this.f3626z = false;
        this.f3622A = false;
        this.f3623B = false;
        this.f3624C = true;
        this.f3625y = C1257t0.f3810O.incrementAndGet();
    }

    /* JADX INFO: renamed from: k */
    public Object m4439k(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2, Boolean bool) {
        Object objM4440l;
        if (!this.f3626z) {
            return m4440l(c1174f1, runnableC1205k2, bool, null);
        }
        synchronized (mo4051s(0).mo4048p(c1174f1, runnableC1205k2)) {
            objM4440l = m4440l(c1174f1, runnableC1205k2, bool, null);
        }
        return objM4440l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [bsh.i4, bsh.j] */
    /* JADX INFO: renamed from: l */
    public Object m4440l(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2, Boolean bool, a aVar) {
        Object objMo4048p = Primitive.VOID;
        ArrayList arrayList = null;
        C1182g3 c1182g3M4318g = bool == null ? c1174f1.m4318g(C1257t0.m5090A0(c1174f1.m4319h(), this.f3625y)) : !bool.booleanValue() ? c1174f1.m4318g(new C1257t0(c1174f1.m4319h(), this.f3625y)) : null;
        ?? r22 = this.f3626z;
        int iMo4050r = mo4050r();
        try {
            if (this.f3624C || this.f3623B) {
                for (?? r52 = r22; r52 < iMo4050r; r52++) {
                    InterfaceC1188h3 interfaceC1188h3Mo4051s = mo4051s(r52);
                    if ((aVar == null || aVar.mo4421a(interfaceC1188h3Mo4051s)) && (interfaceC1188h3Mo4051s instanceof C1214m)) {
                        this.f3623B = true;
                        interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2);
                    }
                }
            }
            while (r22 < iMo4050r) {
                InterfaceC1188h3 interfaceC1188h3Mo4051s2 = mo4051s(r22);
                if (!(interfaceC1188h3Mo4051s2 instanceof C1214m) && (aVar == null || aVar.mo4421a(interfaceC1188h3Mo4051s2))) {
                    if (!(interfaceC1188h3Mo4051s2 instanceof C1226o)) {
                        objMo4048p = interfaceC1188h3Mo4051s2.mo4048p(c1174f1, runnableC1205k2);
                        if (objMo4048p instanceof C1171e4) {
                            break;
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(interfaceC1188h3Mo4051s2);
                    }
                }
                r22++;
            }
            if (arrayList != null) {
                while (!arrayList.isEmpty()) {
                    ((InterfaceC1188h3) arrayList.remove(0)).mo4048p(c1174f1, runnableC1205k2);
                }
            }
            this.f3624C = false;
            if (c1182g3M4318g != null) {
                c1174f1.m4318g(c1182g3M4318g);
            }
            return objMo4048p;
        } catch (Throwable th) {
            this.f3624C = false;
            if (c1182g3M4318g != null) {
                c1174f1.m4318g(c1182g3M4318g);
            }
            throw th;
        }
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        return m4439k(c1174f1, runnableC1205k2, Boolean.FALSE);
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": static=" + this.f3622A + ", synchronized=" + this.f3626z;
    }
}
