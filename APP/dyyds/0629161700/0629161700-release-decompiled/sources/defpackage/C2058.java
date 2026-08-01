package defpackage;

/* JADX INFO: renamed from: ᲇᛵᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2058 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.net.InetSocketAddress f8853;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0038 f8854;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.net.Proxy f8855;

    public C2058(defpackage.C0038 r1, java.net.Proxy r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r0.<init>()
            r0.f8854 = r1
            r0.f8855 = r2
            r0.f8853 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C2058
            if (r0 == 0) goto L26
            ᲇᛵᲇᲇ r3 = (defpackage.C2058) r3
            ᛱᛲᛶᲈ r0 = r3.f8854
            ᛱᛲᛶᲈ r1 = r2.f8854
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.f8855
            java.net.Proxy r1 = r2.f8855
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.f8853
            java.net.InetSocketAddress r2 = r2.f8853
            boolean r2 = defpackage.AbstractC0498.m1280(r3, r2)
            if (r2 == 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            ᛱᛲᛶᲈ r0 = r2.f8854
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.net.Proxy r1 = r2.f8855
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r2 = r2.f8853
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ᛱᛲᛶᲈ r1 = r11.f8854
            ᛳᛸᛲ r1 = r1.f538
            java.lang.String r2 = r1.f2563
            java.net.InetSocketAddress r3 = r11.f8853
            java.net.InetAddress r4 = r3.getAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = r4.getHostAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = defpackage.AbstractC0673.m1519(r4)
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r5 = 58
            boolean r6 = defpackage.AbstractC1347.m2510(r2, r5)
            java.lang.String r7 = "]"
            java.lang.String r8 = "["
            if (r6 == 0) goto L35
            r0.append(r8)
            r0.append(r2)
            r0.append(r7)
            goto L38
        L35:
            r0.append(r2)
        L38:
            int r6 = r1.f2562
            int r9 = r3.getPort()
            java.lang.String r10 = ":"
            if (r6 != r9) goto L48
            boolean r6 = r2.equals(r4)
            if (r6 == 0) goto L50
        L48:
            r0.append(r10)
            int r1 = r1.f2562
            r0.append(r1)
        L50:
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L90
            java.net.Proxy r11 = r11.f8855
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L66
            java.lang.String r11 = " at "
            r0.append(r11)
            goto L6b
        L66:
            java.lang.String r11 = " via proxy "
            r0.append(r11)
        L6b:
            if (r4 != 0) goto L73
            java.lang.String r11 = "<unresolved>"
            r0.append(r11)
            goto L86
        L73:
            boolean r11 = defpackage.AbstractC1347.m2510(r4, r5)
            if (r11 == 0) goto L83
            r0.append(r8)
            r0.append(r4)
            r0.append(r7)
            goto L86
        L83:
            r0.append(r4)
        L86:
            r0.append(r10)
            int r11 = r3.getPort()
            r0.append(r11)
        L90:
            java.lang.String r11 = r0.toString()
            return r11
    }
}
