package bsh;

/* JADX INFO: renamed from: bsh.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1203k0 extends AbstractC1195i4 {
    public C1203k0(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1231o4, C1169e2 {
        Object objMo4048p = mo4051s(0).mo4048p(c1174f1, runnableC1205k2);
        if (objMo4048p instanceof Throwable) {
            throw new C1231o4((Throwable) objMo4048p, this, c1174f1);
        }
        throw new C1169e2("Expression in 'throw' must be Throwable type", this, c1174f1);
    }
}
