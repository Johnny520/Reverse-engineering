package bsh;

/* JADX INFO: renamed from: bsh.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1185h0 extends AbstractC1195i4 {

    /* JADX INFO: renamed from: y */
    public boolean f3591y;

    public C1185h0(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        return mo4051s(0).mo4048p(c1174f1, runnableC1205k2);
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(": ");
        sb2.append(this.f3591y ? "default" : "case");
        return sb2.toString();
    }
}
