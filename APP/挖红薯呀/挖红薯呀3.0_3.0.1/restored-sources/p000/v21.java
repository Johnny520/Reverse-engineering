package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class v21 extends f41 {

    /* JADX INFO: renamed from: c */
    public int f6390c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v21(int i, long j) {
        super(j);
        this.f6390c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public final void mo485a(f41 f41Var) {
        f41Var.getClass();
        this.f6390c = ((v21) f41Var).f6390c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: b */
    public final f41 mo486b(long j) {
        return new v21(this.f6390c, j);
    }
}
