package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.d f4381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.i f4382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.d f4383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f4384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f4385e;

    public j(o8.d r2, g8.i r3, g1.d r4) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f4384d = r0
            r1.f4381a = r2
            r1.f4382b = r3
            r1.f4383c = r4
            return
    }

    public static java.lang.String a(android.content.ContentValues r1, java.lang.String r2) {
            if (r1 == 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1a
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L1a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        L1a:
            java.lang.String r1 = ""
            return r1
    }
}
