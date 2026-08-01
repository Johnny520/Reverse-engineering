package ec;

/* JADX INFO: renamed from: ec.h1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2138h1 implements InterfaceC2182s1 {

    /* JADX INFO: renamed from: q */
    public final boolean f5965q;

    public C2138h1(boolean z10) {
        this.f5965q = z10;
    }

    @Override // ec.InterfaceC2182s1
    /* JADX INFO: renamed from: b */
    public C2139h2 mo7629b() {
        return null;
    }

    @Override // ec.InterfaceC2182s1
    /* JADX INFO: renamed from: c */
    public boolean mo7630c() {
        return this.f5965q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(mo7630c() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
