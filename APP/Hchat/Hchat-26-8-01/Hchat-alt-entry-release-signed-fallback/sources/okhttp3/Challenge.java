package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Challenge {
    private final java.util.Map<java.lang.String, java.lang.String> authParams;
    private final java.lang.String scheme;

    public Challenge(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "realm"
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r3.getClass()
            r1.<init>(r2, r3)
            return
    }

    public Challenge(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r3.<init>()
            r3.scheme = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L39
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = j8.b.l(r2, r1, r2)
            goto L3a
        L39:
            r1 = 0
        L3a:
            r4.put(r1, r0)
            goto L18
        L3e:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            r4.getClass()
            r3.authParams = r4
            return
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final java.util.Map<java.lang.String, java.lang.String> m39deprecated_authParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.authParams
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final java.nio.charset.Charset m40deprecated_charset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final java.lang.String m41deprecated_realm() {
            r1 = this;
            java.lang.String r0 = r1.realm()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final java.lang.String m42deprecated_scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.String> authParams() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.authParams
            return r0
    }

    public final java.nio.charset.Charset charset() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            java.lang.String r1 = "charset"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L14
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Exception -> L14
            r0.getClass()     // Catch: java.lang.Exception -> L14
            return r0
        L14:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            r0.getClass()
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Challenge
            if (r0 == 0) goto L1c
            okhttp3.Challenge r3 = (okhttp3.Challenge) r3
            java.lang.String r0 = r3.scheme
            java.lang.String r1 = r2.scheme
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L1c
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.authParams
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.scheme
            r1 = 31
            r2 = 899(0x383, float:1.26E-42)
            int r0 = eh.a.g(r2, r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.authParams
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String realm() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            java.lang.String r1 = "realm"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.lang.String scheme() {
            r1 = this;
            java.lang.String r0 = r1.scheme
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.scheme
            r0.append(r1)
            java.lang.String r1 = " authParams="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.authParams
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okhttp3.Challenge withCharset(java.nio.charset.Charset r3) {
            r2 = this;
            r3.getClass()
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.authParams
            r0.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.lang.String r3 = r3.name()
            r3.getClass()
            java.lang.String r0 = "charset"
            r1.put(r0, r3)
            okhttp3.Challenge r3 = new okhttp3.Challenge
            java.lang.String r0 = r2.scheme
            r3.<init>(r0, r1)
            return r3
    }
}
