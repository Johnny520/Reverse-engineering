package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends java.lang.IllegalStateException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f4421g;

    public f(java.lang.String r3, int r4, java.lang.String r5, java.lang.Throwable r6) {
            r2 = this;
            r0 = r4 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r6 = r1
        L6:
            r4 = r4 & 8
            if (r4 == 0) goto Lb
            r5 = r1
        Lb:
            r2.<init>(r3, r6)
            r2.f4421g = r5
            return
    }
}
