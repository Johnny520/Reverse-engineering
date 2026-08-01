package p000;

/* JADX INFO: renamed from: p */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0669p {

    /* JADX INFO: renamed from: α */
    public final p000.C0966x f8364;

    /* JADX INFO: renamed from: β */
    public final javax.net.SocketFactory f8365;

    /* JADX INFO: renamed from: γ */
    public final javax.net.ssl.SSLSocketFactory f8366;

    /* JADX INFO: renamed from: δ */
    public final javax.net.ssl.HostnameVerifier f8367;

    /* JADX INFO: renamed from: ε */
    public final p000.C0428je f8368;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0966x f8369;

    /* JADX INFO: renamed from: η */
    public final java.net.ProxySelector f8370;

    /* JADX INFO: renamed from: θ */
    public final p000.og0 f8371;

    /* JADX INFO: renamed from: ι */
    public final java.util.List f8372;

    /* JADX INFO: renamed from: κ */
    public final java.util.List f8373;

    public C0669p(java.lang.String r1, int r2, p000.C0966x r3, javax.net.SocketFactory r4, javax.net.ssl.SSLSocketFactory r5, p000.r41 r6, p000.C0428je r7, p000.C0966x r8, java.util.List r9, java.util.List r10, java.net.ProxySelector r11) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.f8364 = r3
            r0.f8365 = r4
            r0.f8366 = r5
            r0.f8367 = r6
            r0.f8368 = r7
            r0.f8369 = r8
            r0.f8370 = r11
            ng0 r3 = new ng0
            r3.<init>()
            java.lang.String r4 = "http"
            java.lang.String r6 = "https"
            if (r5 == 0) goto L33
            r5 = r6
            goto L34
        L33:
            r5 = r4
        L34:
            boolean r7 = r5.equalsIgnoreCase(r4)
            if (r7 == 0) goto L3d
            r3.f7608 = r4
            goto L45
        L3d:
            boolean r4 = r5.equalsIgnoreCase(r6)
            if (r4 == 0) goto L85
            r3.f7608 = r6
        L45:
            r4 = 7
            r5 = 0
            java.lang.String r4 = p000.AbstractC0073bd.m855(r5, r5, r4, r1)
            java.lang.String r4 = p000.qd2.m4868(r4)
            if (r4 == 0) goto L7a
            r3.f7611 = r4
            r1 = 1
            if (r1 > r2) goto L6f
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r1) goto L6f
            r3.f7612 = r2
            og0 r1 = r3.m4040()
            r0.f8371 = r1
            java.util.List r1 = p000.ud2.m5851(r9)
            r0.f8372 = r1
            java.util.List r1 = p000.ud2.m5851(r10)
            r0.f8373 = r1
            return
        L6f:
            java.lang.String r0 = "unexpected port: "
            java.lang.String r0 = p000.a12.m17(r0, r2)
            p000.C1080.m7266(r0)
            r0 = 0
            throw r0
        L7a:
            java.lang.String r0 = "unexpected host: "
            java.lang.String r0 = r0.concat(r1)
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
        L85:
            java.lang.String r0 = "unexpected scheme: "
            java.lang.String r0 = r0.concat(r5)
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0669p
            if (r0 == 0) goto L18
            p r3 = (p000.C0669p) r3
            og0 r0 = r3.f8371
            og0 r1 = r2.f8371
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto L18
            boolean r2 = r2.m4339(r3)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            og0 r0 = r3.f8371
            java.lang.String r0 = r0.f8097
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = p000.a12.m15(r1, r2, r0)
            x r1 = r3.f8364
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            x r0 = r3.f8369
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.util.List r1 = r3.f8372
            int r0 = p000.a12.m16(r1, r0, r2)
            java.util.List r1 = r3.f8373
            int r0 = p000.a12.m16(r1, r0, r2)
            java.net.ProxySelector r1 = r3.f8370
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 961
            javax.net.ssl.SSLSocketFactory r0 = r3.f8366
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            javax.net.ssl.HostnameVerifier r1 = r3.f8367
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * r2
            je r3 = r3.f8368
            int r3 = java.util.Objects.hashCode(r3)
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Address{"
            r0.<init>(r1)
            og0 r1 = r3.f8371
            java.lang.String r2 = r1.f8093
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r1 = r1.f8094
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "proxySelector="
            r1.<init>(r2)
            java.net.ProxySelector r3 = r3.f8370
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final boolean m4339(p000.C0669p r3) {
            r2 = this;
            r3.getClass()
            x r0 = r2.f8364
            x r1 = r3.f8364
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            x r0 = r2.f8369
            x r1 = r3.f8369
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            java.util.List r0 = r2.f8372
            java.util.List r1 = r3.f8372
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            java.util.List r0 = r2.f8373
            java.util.List r1 = r3.f8373
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            java.net.ProxySelector r0 = r2.f8370
            java.net.ProxySelector r1 = r3.f8370
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            javax.net.ssl.SSLSocketFactory r0 = r2.f8366
            javax.net.ssl.SSLSocketFactory r1 = r3.f8366
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            javax.net.ssl.HostnameVerifier r0 = r2.f8367
            javax.net.ssl.HostnameVerifier r1 = r3.f8367
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            je r0 = r2.f8368
            je r1 = r3.f8368
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L5f
            og0 r2 = r2.f8371
            int r2 = r2.f8094
            og0 r3 = r3.f8371
            int r3 = r3.f8094
            if (r2 != r3) goto L5f
            r2 = 1
            return r2
        L5f:
            r2 = 0
            return r2
    }
}
