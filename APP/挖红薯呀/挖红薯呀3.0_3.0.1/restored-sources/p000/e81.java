package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 {

    /* JADX INFO: renamed from: a */
    public final ug0 f1343a;

    /* JADX INFO: renamed from: b */
    public d81 f1344b;

    /* JADX INFO: renamed from: c */
    public long f1345c;

    /* JADX INFO: renamed from: d */
    public long f1346d;

    /* JADX INFO: renamed from: e */
    public long f1347e;

    /* JADX INFO: renamed from: f */
    public long f1348f;

    /* JADX INFO: renamed from: g */
    public float[] f1349g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e81() {
        ug0 ug0Var = v20.f6389a;
        this.f1343a = new ug0();
        this.f1345c = -1L;
        this.f1346d = 0L;
        this.f1347e = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m801a(d81 d81Var, long j, long j2, float[] fArr, long j3) {
        long j4 = d81Var.f1001g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            d81Var.f1001g = j3;
            d81Var.m661a(d81Var.f999e, d81Var.f1000f, j, j2, fArr);
        }
    }
}
