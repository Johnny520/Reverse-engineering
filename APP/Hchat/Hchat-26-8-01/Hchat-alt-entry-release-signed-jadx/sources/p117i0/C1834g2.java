package p117i0;

import p322w0.AbstractC4672w;

/* JADX INFO: renamed from: i0.g2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1834g2 extends AbstractC4672w {

    /* JADX INFO: renamed from: c */
    public float f6075c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1834g2(long j3, float f3) {
        super(j3);
        this.f6075c = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: a */
    public final void mo4494a(AbstractC4672w abstractC4672w) {
        abstractC4672w.getClass();
        this.f6075c = ((C1834g2) abstractC4672w).f6075c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: b */
    public final AbstractC4672w mo4495b(long j3) {
        return new C1834g2(j3, this.f6075c);
    }
}
