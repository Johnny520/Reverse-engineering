package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1625 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f5083 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f5084 = "; ";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f5085 = "Cookie";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f5086 = "Cookie2";

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            Yue.C1625.f5083 = r0
            return
    }

    public C1625() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m7891(Yue.C3157.C3161 r7, java.net.HttpURLConnection r8) throws java.io.IOException {
            java.util.LinkedHashSet r0 = m7893(r7)
            java.net.CookieManager r1 = r7.m13387()
            java.net.URL r7 = r7.f10410
            java.net.URI r7 = m7892(r7)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = Yue.C1625.f5083
            java.util.Map r7 = r1.get(r7, r2)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
        L1d:
            boolean r2 = r7.hasNext()
            java.lang.String r3 = "Cookie2"
            java.lang.String r4 = "Cookie"
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getValue()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L1d
            int r6 = r5.size()
            if (r6 != 0) goto L3c
            goto L1d
        L3c:
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L4b
            r2 = r1
            r1 = r0
            goto L57
        L4b:
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1d
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = r1
        L57:
            r1.addAll(r5)
            r1 = r2
            goto L1d
        L5c:
            int r7 = r0.size()
            java.lang.String r2 = "; "
            if (r7 <= 0) goto L6b
            java.lang.String r7 = Yue.C5973.m22122(r0, r2)
            r8.addRequestProperty(r4, r7)
        L6b:
            if (r1 == 0) goto L7a
            int r7 = r1.size()
            if (r7 <= 0) goto L7a
            java.lang.String r7 = Yue.C5973.m22122(r1, r2)
            r8.addRequestProperty(r3, r7)
        L7a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.net.URI m7892(java.net.URL r2) throws java.io.IOException {
            java.net.URI r2 = r2.toURI()     // Catch: java.net.URISyntaxException -> L5
            return r2
        L5:
            r2 = move-exception
            java.net.MalformedURLException r0 = new java.net.MalformedURLException
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.util.LinkedHashSet<java.lang.String> m7893(Yue.InterfaceC1478.InterfaceC1482 r4) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Map r4 = r4.mo7267()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = "="
            r2.append(r3)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.add(r1)
            goto L11
        L41:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m7894(Yue.C3157.C3161 r0, java.net.URL r1, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2) throws java.io.IOException {
            java.net.CookieManager r0 = r0.m13387()
            java.net.URI r1 = m7892(r1)
            r0.put(r1, r2)
            return
    }
}
