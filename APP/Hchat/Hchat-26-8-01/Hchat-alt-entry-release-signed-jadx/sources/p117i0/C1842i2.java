package p117i0;

import p322w0.AbstractC4672w;

/* JADX INFO: renamed from: i0.i2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1842i2 extends AbstractC4672w {

    /* JADX INFO: renamed from: c */
    public long f6132c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1842i2(long j3, long j4) {
        super(j3);
        this.f6132c = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: a */
    public final void mo4494a(AbstractC4672w abstractC4672w) {
        abstractC4672w.getClass();
        this.f6132c = ((C1842i2) abstractC4672w).f6132c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: b */
    public final AbstractC4672w mo4495b(long j3) {
        return new C1842i2(j3, this.f6132c);
    }
}
