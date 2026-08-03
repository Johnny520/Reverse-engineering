package p322w0;

import p202o0.AbstractC3031c;

/* JADX INFO: renamed from: w0.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4669t extends AbstractC4672w {

    /* JADX INFO: renamed from: c */
    public AbstractC3031c f15546c;

    /* JADX INFO: renamed from: d */
    public int f15547d;

    /* JADX INFO: renamed from: e */
    public int f15548e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4669t(long j3, AbstractC3031c abstractC3031c) {
        super(j3);
        this.f15546c = abstractC3031c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: a */
    public final void mo4494a(AbstractC4672w abstractC4672w) {
        synchronized (AbstractC4666q.f15522a) {
            abstractC4672w.getClass();
            this.f15546c = ((C4669t) abstractC4672w).f15546c;
            this.f15547d = ((C4669t) abstractC4672w).f15547d;
            this.f15548e = ((C4669t) abstractC4672w).f15548e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4672w
    /* JADX INFO: renamed from: b */
    public final AbstractC4672w mo4495b(long j3) {
        return new C4669t(j3, this.f15546c);
    }
}
