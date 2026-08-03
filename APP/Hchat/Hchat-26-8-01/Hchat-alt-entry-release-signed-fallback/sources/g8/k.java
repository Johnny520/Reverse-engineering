package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8.a f4386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.i f4387b;

    public k(g8.a r1, g8.i r2) {
            r0 = this;
            r0.<init>()
            r0.f4386a = r1
            r0.f4387b = r2
            return
    }

    public final java.lang.String a(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L19
        L7:
            g8.i r0 = r2.f4387b
            java.lang.String r0 = r0.r(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            if (r0 == 0) goto L19
            return r0
        L16:
            if (r3 == 0) goto L19
            return r3
        L19:
            java.lang.String r3 = ""
            return r3
    }
}
