package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class C6646 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3604 f17072;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3600 f17073;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public C7275 f17074;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f17075;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f17076;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public long f17077;

    public C6646(@InterfaceC6399 InterfaceC3604 interfaceC3604) {
        C5499.m17103(interfaceC3604, "upstream");
        this.f17072 = interfaceC3604;
        C3600 c3600Mo9605 = interfaceC3604.mo9605();
        this.f17073 = c3600Mo9605;
        C7275 c7275 = c3600Mo9605.f6209;
        this.f17074 = c7275;
        this.f17075 = c7275 != null ? c7275.f2779 : -1;
    }

    @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17076 = true;
    }

    @Override // Yue.InterfaceC7506
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public C7827 mo518() {
        return this.f17072.mo518();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3 == r4.f2779) goto L15;
     */
    @Override // Yue.InterfaceC7506
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo9103(@InterfaceC6399 C3600 c3600, long j) {
        C7275 c7275;
        C5499.m17103(c3600, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.f17076)) {
            throw new IllegalStateException("closed".toString());
        }
        C7275 c72752 = this.f17074;
        if (c72752 != null) {
            C7275 c72753 = this.f17073.f6209;
            if (c72752 == c72753) {
                int i = this.f17075;
                C5499.m17100(c72753);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f17072.mo9651(this.f17077 + 1)) {
            return -1L;
        }
        if (this.f17074 == null && (c7275 = this.f17073.f6209) != null) {
            this.f17074 = c7275;
            C5499.m17100(c7275);
            this.f17075 = c7275.f2779;
        }
        long jMin = Math.min(j, this.f17073.m9684() - this.f17077);
        this.f17073.m9620(c3600, this.f17077, jMin);
        this.f17077 += jMin;
        return jMin;
    }
}
