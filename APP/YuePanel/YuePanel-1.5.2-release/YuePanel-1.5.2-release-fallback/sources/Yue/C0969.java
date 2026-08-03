package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0969 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f2762;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Map<java.lang.String, java.lang.String> f2763;

    public C0969(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "scheme"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "realm"
            Yue.C3329.m13906(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            Yue.C3329.m13905(r3, r0)
            r1.<init>(r2, r3)
            return
    }

    public C0969(@Yue.InterfaceC4418 java.lang.String r5, @Yue.InterfaceC4418 java.util.Map<java.lang.String, java.lang.String> r6) {
            r4 = this;
            java.lang.String r0 = "scheme"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "authParams"
            Yue.C3329.m13906(r6, r0)
            r4.<init>()
            r4.f2762 = r5
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L1c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L47
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "US"
            Yue.C3329.m13905(r2, r3)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r1, r2)
            goto L48
        L47:
            r1 = 0
        L48:
            r5.put(r1, r0)
            goto L1c
        L4c:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.lang.String r6 = "unmodifiableMap<String?, String>(newAuthParams)"
            Yue.C3329.m13905(r5, r6)
            r4.f2763 = r5
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C0969
            if (r0 == 0) goto L1c
            Yue.ۥ۟ۤ۠ۡ r3 = (Yue.C0969) r3
            java.lang.String r0 = r3.f2762
            java.lang.String r1 = r2.f2762
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L1c
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f2763
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f2763
            boolean r3 = Yue.C3329.m13897(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f2762
            int r0 = r0.hashCode()
            r1 = 899(0x383, float:1.26E-42)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f2763
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f2762
            r0.append(r1)
            java.lang.String r1 = " authParams="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.f2763
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "authParams", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_authParams")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.String> m5463() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f2763
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "charset", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_charset")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.nio.charset.Charset m5464() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.m5468()
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "realm", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_realm")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String m5465() {
            r1 = this;
            java.lang.String r0 = r1.m5469()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "scheme", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_scheme")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.String m5466() {
            r1 = this;
            java.lang.String r0 = r1.f2762
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "authParams")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.String> m5467() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f2763
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "charset")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.nio.charset.Charset m5468() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f2763
            java.lang.String r1 = "charset"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L16
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "forName(charset)"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r1 = "ISO_8859_1"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC3421(name = "realm")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.lang.String m5469() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f2763
            java.lang.String r1 = "realm"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "scheme")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.lang.String m5470() {
            r1 = this;
            java.lang.String r0 = r1.f2762
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.C0969 m5471(@Yue.InterfaceC4418 java.nio.charset.Charset r4) {
            r3 = this;
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f2763
            java.util.Map r1 = Yue.C3901.m15800(r1)
            java.lang.String r4 = r4.name()
            java.lang.String r2 = "charset.name()"
            Yue.C3329.m13905(r4, r2)
            r1.put(r0, r4)
            Yue.ۥ۟ۤ۠ۡ r4 = new Yue.ۥ۟ۤ۠ۡ
            java.lang.String r0 = r3.f2762
            r4.<init>(r0, r1)
            return r4
    }
}
