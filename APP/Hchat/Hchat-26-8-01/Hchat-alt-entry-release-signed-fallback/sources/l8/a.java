package l8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.ContentValues f7895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f7896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f7897f;

    public a(java.lang.String r1, java.lang.String r2, android.content.ContentValues r3, java.lang.String r4, java.lang.String[] r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.f7892a = r1
            r0.f7893b = r2
            r0.f7894c = r6
            r1 = 0
            if (r3 == 0) goto L12
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>(r3)
            goto L13
        L12:
            r2 = r1
        L13:
            r0.f7895d = r2
            r0.f7896e = r4
            if (r5 == 0) goto L1f
            java.lang.Object r1 = r5.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
        L1f:
            r0.f7897f = r1
            return
    }
}
