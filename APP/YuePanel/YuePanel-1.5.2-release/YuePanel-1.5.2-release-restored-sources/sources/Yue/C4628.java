package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4628 implements InterfaceC5424 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f9939;

    public C4628(boolean z) {
        this.f9939 = z;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo13919() ? "Active" : "New");
        sb.append(C6193.f1885);
        return sb.toString();
    }

    @Override // Yue.InterfaceC5424
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo13919() {
        return this.f9939;
    }

    @Override // Yue.InterfaceC5424
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C6384 mo13920() {
        return null;
    }
}
