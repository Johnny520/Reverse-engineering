package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲈᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0526 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final javax.net.SocketFactory f1919;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final javax.net.ssl.SSLSocketFactory f1920;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0191 f1921;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0263 f1922;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final java.util.List f1923;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0669 f1924;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final java.util.List f1925;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.net.ProxySelector f1926;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final javax.net.ssl.HostnameVerifier f1927;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0263 f1928;

    public C0526(java.lang.String r1, int r2, xhss.C0263 r3, javax.net.SocketFactory r4, javax.net.ssl.SSLSocketFactory r5, javax.net.ssl.HostnameVerifier r6, xhss.C0191 r7, xhss.C0263 r8, java.util.List r9, java.util.List r10, java.net.ProxySelector r11) {
            r0 = this;
            r0.<init>()
            r0.f1922 = r3
            r0.f1919 = r4
            r0.f1920 = r5
            r0.f1927 = r6
            r0.f1921 = r7
            r0.f1928 = r8
            r0.f1926 = r11
            xhss.ᛴᲇᛴᛱ r3 = new xhss.ᛴᲇᛴᛱ
            r3.<init>()
            java.lang.String r4 = "http"
            java.lang.String r6 = "https"
            if (r5 == 0) goto L1e
            r5 = r6
            goto L1f
        L1e:
            r5 = r4
        L1f:
            boolean r7 = r5.equalsIgnoreCase(r4)
            r8 = 0
            if (r7 == 0) goto L29
            r3.f1472 = r4
            goto L31
        L29:
            boolean r4 = r5.equalsIgnoreCase(r6)
            if (r4 == 0) goto L6f
            r3.f1472 = r6
        L31:
            r4 = 7
            r5 = 0
            java.lang.String r4 = xhss.C0915.m1496(r5, r5, r4, r1)
            java.lang.String r4 = xhss.AbstractC0898.m1458(r4)
            if (r4 == 0) goto L65
            r3.f1475 = r4
            r1 = 1
            if (r1 > r2) goto L5b
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r1) goto L5b
            r3.f1471 = r2
            xhss.ᛷᛶᲁᛵ r1 = r3.m809()
            r0.f1924 = r1
            java.util.List r1 = xhss.AbstractC0559.m990(r9)
            r0.f1923 = r1
            java.util.List r1 = xhss.AbstractC0559.m990(r10)
            r0.f1925 = r1
            return
        L5b:
            java.lang.String r0 = "unexpected port: "
            java.lang.String r0 = xhss.AbstractC0390.m774(r0, r2)
            xhss.C0532.m946(r0)
            throw r8
        L65:
            java.lang.String r0 = "unexpected host: "
            java.lang.String r0 = r0.concat(r1)
            xhss.C0532.m959(r0)
            throw r8
        L6f:
            java.lang.String r0 = "unexpected scheme: "
            java.lang.String r0 = r0.concat(r5)
            xhss.C0532.m959(r0)
            throw r8
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.C0526
            if (r0 == 0) goto L18
            xhss.ᛵᲈᛱᛳ r3 = (xhss.C0526) r3
            xhss.ᛷᛶᲁᛵ r0 = r3.f1924
            xhss.ᛷᛶᲁᛵ r1 = r2.f1924
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            boolean r2 = r2.m940(r3)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            xhss.ᛷᛶᲁᛵ r0 = r2.f1924
            java.lang.String r0 = r0.f2286
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            xhss.ᛳᛴᲀᲁ r1 = r2.f1922
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            xhss.ᛳᛴᲀᲁ r0 = r2.f1928
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List r1 = r2.f1923
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.f1925
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.net.ProxySelector r1 = r2.f1926
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 961
            javax.net.ssl.SSLSocketFactory r0 = r2.f1920
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            javax.net.ssl.HostnameVerifier r1 = r2.f1927
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            xhss.ᛲᛷᲀᲇ r2 = r2.f1921
            int r2 = java.util.Objects.hashCode(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Address{"
            r0.<init>(r1)
            xhss.ᛷᛶᲁᛵ r1 = r3.f1924
            java.lang.String r2 = r1.f2288
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r1 = r1.f2284
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "proxySelector="
            r1.<init>(r2)
            java.net.ProxySelector r3 = r3.f1926
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m940(xhss.C0526 r3) {
            r2 = this;
            xhss.ᛳᛴᲀᲁ r0 = r2.f1922
            xhss.ᛳᛴᲀᲁ r1 = r3.f1922
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L5c
            xhss.ᛳᛴᲀᲁ r0 = r2.f1928
            xhss.ᛳᛴᲀᲁ r1 = r3.f1928
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L5c
            java.util.List r0 = r2.f1923
            java.util.List r1 = r3.f1923
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            java.util.List r0 = r2.f1925
            java.util.List r1 = r3.f1925
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            java.net.ProxySelector r0 = r2.f1926
            java.net.ProxySelector r1 = r3.f1926
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L5c
            javax.net.ssl.SSLSocketFactory r0 = r2.f1920
            javax.net.ssl.SSLSocketFactory r1 = r3.f1920
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L5c
            javax.net.ssl.HostnameVerifier r0 = r2.f1927
            javax.net.ssl.HostnameVerifier r1 = r3.f1927
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L5c
            xhss.ᛲᛷᲀᲇ r0 = r2.f1921
            xhss.ᛲᛷᲀᲇ r1 = r3.f1921
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L5c
            xhss.ᛷᛶᲁᛵ r2 = r2.f1924
            int r2 = r2.f2284
            xhss.ᛷᛶᲁᛵ r3 = r3.f1924
            int r3 = r3.f2284
            if (r2 != r3) goto L5c
            r2 = 1
            return r2
        L5c:
            r2 = 0
            return r2
    }
}
