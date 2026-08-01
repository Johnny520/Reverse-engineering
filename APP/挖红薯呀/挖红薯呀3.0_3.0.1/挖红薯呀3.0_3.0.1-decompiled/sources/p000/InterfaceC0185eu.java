package p000;

/* JADX INFO: renamed from: eu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0185eu extends InterfaceC0830v7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0830v7
    /* JADX INFO: renamed from: a */
    default mb1 mo969a(q91 q91Var) {
        return new C0948y2(this);
    }

    /* JADX INFO: renamed from: b */
    float mo970b(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: c */
    float mo971c(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: d */
    long mo972d(float f, float f2, float f3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    default float mo973e(float f, float f2, float f3) {
        return mo971c(mo972d(f, f2, f3), f, f2, f3);
    }
}
