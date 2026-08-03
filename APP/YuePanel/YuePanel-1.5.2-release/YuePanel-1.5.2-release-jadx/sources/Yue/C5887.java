package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5887 extends AbstractC6792<long[]> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final long[] f14605;

    public C5887(int i) {
        super(i);
        this.f14605 = new long[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m18248(long j) {
        long[] jArr = this.f14605;
        int iM3255 = m3255();
        m21491(iM3255 + 1);
        jArr[iM3255] = j;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/lang/Object;)I */
    @Override // Yue.AbstractC6792
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo9559(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "<this>");
        return jArr.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final long[] m18250() {
        return m21493(this.f14605, new long[m21492()]);
    }
}
