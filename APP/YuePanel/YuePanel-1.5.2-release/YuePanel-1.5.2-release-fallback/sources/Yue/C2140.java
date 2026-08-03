package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2140 implements Yue.InterfaceC3235 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f6727;

    public C2140(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f6727 = r1
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Empty{"
            r0.append(r1)
            boolean r1 = r2.mo10054()
            if (r1 == 0) goto L13
            java.lang.String r1 = "Active"
            goto L15
        L13:
            java.lang.String r1 = "New"
        L15:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3235
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo10054() {
            r1 = this;
            boolean r0 = r1.f6727
            return r0
    }

    @Override // Yue.InterfaceC3235
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Yue.C4403 mo10055() {
            r1 = this;
            r0 = 0
            return r0
    }
}
