package f5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Map f3276a = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "static-put"
            r0.put(r1, r2)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "static-get"
            r0.put(r1, r2)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "instance-put"
            r0.put(r1, r2)
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "instance-get"
            r0.put(r1, r2)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "invoke-static"
            r0.put(r1, r2)
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "invoke-instance"
            r0.put(r1, r2)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "invoke-constructor"
            r0.put(r1, r2)
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "invoke-direct"
            r0.put(r1, r2)
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "invoke-interface"
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            f5.d.f3276a = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L73:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1.put(r3, r2)
            goto L73
        L8f:
            java.util.Collections.unmodifiableMap(r1)
            return
    }
}
