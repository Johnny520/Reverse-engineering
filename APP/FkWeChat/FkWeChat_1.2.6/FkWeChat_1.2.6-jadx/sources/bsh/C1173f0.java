package bsh;

/* JADX INFO: renamed from: bsh.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1173f0 extends AbstractC1195i4 {

    /* JADX INFO: renamed from: y */
    public boolean f3547y;

    public C1173f0(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: k */
    public Class m4309k(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        return this.f3547y ? Void.TYPE : m4311o().m4927v(c1174f1, runnableC1205k2);
    }

    /* JADX INFO: renamed from: l */
    public String m4310l(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2, String str) {
        return this.f3547y ? "V" : m4311o().m4928x(c1174f1, runnableC1205k2, str);
    }

    /* JADX INFO: renamed from: o */
    public C1221n0 m4311o() {
        return (C1221n0) mo4051s(0);
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": void=" + this.f3547y;
    }
}
