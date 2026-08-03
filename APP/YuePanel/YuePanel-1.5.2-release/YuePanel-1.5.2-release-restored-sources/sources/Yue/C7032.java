package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7032 extends AbstractC7142 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f21229;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long f21230;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f21231;

    public C7032(@InterfaceC6489 String str, long j, @InterfaceC6399 InterfaceC3604 interfaceC3604) {
        C5499.m17103(interfaceC3604, "source");
        this.f21229 = str;
        this.f21230 = j;
        this.f21231 = interfaceC3604;
    }

    @Override // Yue.AbstractC7142
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public long mo9917() {
        return this.f21230;
    }

    @Override // Yue.AbstractC7142
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public C6149 mo9918() {
        String str = this.f21229;
        if (str != null) {
            return C6149.f15045.m18956(str);
        }
        return null;
    }

    @Override // Yue.AbstractC7142
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public InterfaceC3604 mo9919() {
        return this.f21231;
    }
}
