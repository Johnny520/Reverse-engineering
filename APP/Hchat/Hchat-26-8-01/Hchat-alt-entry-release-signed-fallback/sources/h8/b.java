package h8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.d f5139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h8.a f5140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.d f5141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f5142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f5143e;

    public b(o8.d r2, h8.a r3, g1.d r4) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f5142d = r0
            r1.f5139a = r2
            r1.f5140b = r3
            r1.f5141c = r4
            return
    }

    public static int a(android.content.ContentValues r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L14
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L14
            boolean r1 = r2.containsKey(r3)
            if (r1 != 0) goto L10
            goto L14
        L10:
            java.lang.Long r0 = r2.getAsLong(r3)     // Catch: java.lang.Throwable -> L14
        L14:
            if (r0 == 0) goto L1b
            int r2 = r0.intValue()
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public static java.lang.String b(android.content.ContentValues r1, java.lang.String r2) {
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
