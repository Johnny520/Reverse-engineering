package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w21 extends f41 {

    /* JADX INFO: renamed from: c */
    public long f6905c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w21(long j, long j2) {
        super(j);
        this.f6905c = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public final void mo485a(f41 f41Var) {
        f41Var.getClass();
        this.f6905c = ((w21) f41Var).f6905c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f41
    /* JADX INFO: renamed from: b */
    public final f41 mo486b(long j) {
        return new w21(j, this.f6905c);
    }
}
