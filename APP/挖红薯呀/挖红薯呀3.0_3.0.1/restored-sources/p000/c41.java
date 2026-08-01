package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class c41 extends f41 {

    /* JADX INFO: renamed from: c */
    public AbstractC0112d0 f689c;

    /* JADX INFO: renamed from: d */
    public int f690d;

    /* JADX INFO: renamed from: e */
    public int f691e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c41(long j, AbstractC0112d0 abstractC0112d0) {
        super(j);
        this.f689c = abstractC0112d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public final void mo485a(f41 f41Var) {
        synchronized (p30.f4745l) {
            f41Var.getClass();
            this.f689c = ((c41) f41Var).f689c;
            this.f690d = ((c41) f41Var).f690d;
            this.f691e = ((c41) f41Var).f691e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: b */
    public final f41 mo486b(long j) {
        return new c41(j, this.f689c);
    }
}
