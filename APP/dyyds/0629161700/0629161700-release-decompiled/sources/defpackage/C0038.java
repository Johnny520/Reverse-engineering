package defpackage;

/* JADX INFO: renamed from: ᛱᛲᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0038 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0520 f538;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.util.List f539;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C2209 f540;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final javax.net.ssl.HostnameVerifier f541;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final javax.net.ssl.SSLSocketFactory f542;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1403 f543;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.util.List f544;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final javax.net.SocketFactory f545;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.InterfaceC2365 f546;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.net.ProxySelector f547;

    public C0038(java.lang.String r1, int r2, defpackage.C1403 r3, javax.net.SocketFactory r4, javax.net.ssl.SSLSocketFactory r5, javax.net.ssl.HostnameVerifier r6, defpackage.C2209 r7, defpackage.InterfaceC2365 r8, java.util.List r9, java.util.List r10, java.net.ProxySelector r11) {
            r0 = this;
            r0.<init>()
            r0.f543 = r3
            r0.f545 = r4
            r0.f542 = r5
            r0.f541 = r6
            r0.f540 = r7
            r0.f546 = r8
            r0.f547 = r11
            ᛱᛵᛴᛲ r3 = new ᛱᛵᛴᛲ
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
            r3.f846 = r4
            goto L31
        L29:
            boolean r4 = r5.equalsIgnoreCase(r6)
            if (r4 == 0) goto L6f
            r3.f846 = r6
        L31:
            r4 = 7
            r5 = 0
            java.lang.String r4 = defpackage.AbstractC2346.m3843(r5, r5, r4, r1)
            java.lang.String r4 = defpackage.AbstractC0673.m1519(r4)
            if (r4 == 0) goto L65
            r3.f849 = r4
            r1 = 1
            if (r1 > r2) goto L5b
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r1) goto L5b
            r3.f848 = r2
            ᛳᛸᛲ r1 = r3.m568()
            r0.f538 = r1
            java.util.List r1 = defpackage.AbstractC0508.m1296(r9)
            r0.f539 = r1
            java.util.List r1 = defpackage.AbstractC0508.m1296(r10)
            r0.f544 = r1
            return
        L5b:
            java.lang.String r0 = "unexpected port: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r2, r0)
            defpackage.C2264.m3678(r0)
            throw r8
        L65:
            java.lang.String r0 = "unexpected host: "
            java.lang.String r0 = r0.concat(r1)
            defpackage.C2264.m3684(r0)
            throw r8
        L6f:
            java.lang.String r0 = "unexpected scheme: "
            java.lang.String r0 = r0.concat(r5)
            defpackage.C2264.m3684(r0)
            throw r8
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C0038
            if (r0 == 0) goto L18
            ᛱᛲᛶᲈ r3 = (defpackage.C0038) r3
            ᛳᛸᛲ r0 = r3.f538
            ᛳᛸᛲ r1 = r2.f538
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            boolean r2 = r2.m366(r3)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            ᛳᛸᛲ r0 = r3.f538
            java.lang.String r0 = r0.f2561
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = defpackage.AbstractC1124.m2153(r0, r1, r2)
            ᛷᲈᲀ r1 = r3.f543
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            ᲈᲈᛳᛷ r0 = r3.f546
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.util.List r1 = r3.f539
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            java.util.List r0 = r3.f544
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.net.ProxySelector r1 = r3.f547
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 961
            javax.net.ssl.SSLSocketFactory r0 = r3.f542
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            javax.net.ssl.HostnameVerifier r1 = r3.f541
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * r2
            ᲈᛳᛷ r3 = r3.f540
            int r3 = java.util.Objects.hashCode(r3)
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Address{"
            r0.<init>(r1)
            ᛳᛸᛲ r1 = r3.f538
            java.lang.String r2 = r1.f2563
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r1 = r1.f2562
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "proxySelector="
            r1.<init>(r2)
            java.net.ProxySelector r3 = r3.f547
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m366(defpackage.C0038 r3) {
            r2 = this;
            ᛷᲈᲀ r0 = r2.f543
            ᛷᲈᲀ r1 = r3.f543
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L5c
            ᲈᲈᛳᛷ r0 = r2.f546
            ᲈᲈᛳᛷ r1 = r3.f546
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L5c
            java.util.List r0 = r2.f539
            java.util.List r1 = r3.f539
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            java.util.List r0 = r2.f544
            java.util.List r1 = r3.f544
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5c
            java.net.ProxySelector r0 = r2.f547
            java.net.ProxySelector r1 = r3.f547
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L5c
            javax.net.ssl.SSLSocketFactory r0 = r2.f542
            javax.net.ssl.SSLSocketFactory r1 = r3.f542
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L5c
            javax.net.ssl.HostnameVerifier r0 = r2.f541
            javax.net.ssl.HostnameVerifier r1 = r3.f541
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L5c
            ᲈᛳᛷ r0 = r2.f540
            ᲈᛳᛷ r1 = r3.f540
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L5c
            ᛳᛸᛲ r2 = r2.f538
            int r2 = r2.f2562
            ᛳᛸᛲ r3 = r3.f538
            int r3 = r3.f2562
            if (r2 != r3) goto L5c
            r2 = 1
            return r2
        L5c:
            r2 = 0
            return r2
    }
}
