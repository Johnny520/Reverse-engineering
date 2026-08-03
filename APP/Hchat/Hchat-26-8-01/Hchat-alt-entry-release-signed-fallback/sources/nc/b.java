package nc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f9345c;

    public b(int r1, java.lang.String r2, java.util.LinkedHashMap r3) {
            r0 = this;
            r0.<init>()
            r0.f9343a = r1
            r0.f9344b = r2
            r0.f9345c = r3
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            r0 = 1
            int r1 = r6.f9343a
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 3
            if (r1 == r0) goto Le
            java.lang.String r0 = "null"
            goto L16
        Le:
            java.lang.String r0 = "SYSTEM"
            goto L16
        L11:
            java.lang.String r0 = "RUNTIME"
            goto L16
        L14:
            java.lang.String r0 = "BUILD"
        L16:
            java.util.LinkedHashMap r1 = r6.f9345c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", type="
            java.lang.String r3 = ", values="
            java.lang.String r4 = "Annotation{"
            java.lang.String r5 = r6.f9344b
            java.lang.StringBuilder r0 = bc.e.p(r4, r0, r2, r5, r3)
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
