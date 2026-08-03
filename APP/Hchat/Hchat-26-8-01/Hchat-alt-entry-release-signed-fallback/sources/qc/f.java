package qc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.b f10867c;

    public f(int r1, int r2, qc.b r3) {
            r0 = this;
            r0.<init>()
            r0.f10865a = r1
            r0.f10866b = r2
            r0.f10867c = r3
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.f10865a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%04x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            int r2 = r6.f10866b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            qc.b r2 = r6.f10867c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " - "
            java.lang.String r4 = ": "
            java.lang.String r5 = "Try{"
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            java.lang.String r1 = "}"
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
