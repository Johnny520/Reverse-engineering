package pa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f10449a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            pa.a.f10449a = r0
            return
    }

    public static void a(android.content.ContentValues r4) {
            java.util.concurrent.ConcurrentHashMap r0 = pa.a.f10449a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto L3b
        L9:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3b
            java.util.Set r1 = r4.keySet()     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3b
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r4.get(r1)     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L2b
            goto L16
        L2b:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = c(r2)     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L16
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L3b
            goto L16
        L3b:
            return
    }

    public static void b(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "%40"
            java.lang.String r1 = "@"
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L5d
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L5d
            boolean r2 = r4.equals(r5)
            if (r2 == 0) goto L17
            goto L5d
        L17:
            java.lang.String r2 = "@chatroom"
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L28
            java.lang.String r2 = "%40chatroom"
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L28
            goto L5d
        L28:
            java.util.concurrent.ConcurrentHashMap r2 = pa.a.f10449a
            r2.put(r5, r4)
            java.lang.String r3 = r4.replace(r1, r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r5.replace(r1, r0)     // Catch: java.lang.Throwable -> L44
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L41
            boolean r4 = r0.equals(r5)     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L44
        L41:
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L44
        L44:
            int r4 = r2.size()
            r5 = 20
            if (r4 <= r5) goto L5d
            java.util.Set r4 = r2.keySet()     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r4.next()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5d
            r2.remove(r4)     // Catch: java.lang.Throwable -> L5d
        L5d:
            return
    }

    public static java.lang.String c(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L42
            java.util.concurrent.ConcurrentHashMap r0 = pa.a.f10449a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            goto L42
        Lf:
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
            r1 = r5
        L18:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L42
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L42
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L18
            java.lang.String r1 = r1.replace(r3, r2)     // Catch: java.lang.Throwable -> L42
            goto L18
        L41:
            return r1
        L42:
            return r5
    }
}
