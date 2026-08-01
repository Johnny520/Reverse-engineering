package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 {

    /* JADX INFO: renamed from: α */
    public final p000.C0669p f13229;

    /* JADX INFO: renamed from: β */
    public final java.net.Proxy f13230;

    /* JADX INFO: renamed from: γ */
    public final java.net.InetSocketAddress f13231;

    public zo1(p000.C0669p r1, java.net.Proxy r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f13229 = r1
            r0.f13230 = r2
            r0.f13231 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.zo1
            if (r0 == 0) goto L26
            zo1 r3 = (p000.zo1) r3
            p r0 = r3.f13229
            p r1 = r2.f13229
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.f13230
            java.net.Proxy r1 = r2.f13230
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.f13231
            java.net.InetSocketAddress r2 = r2.f13231
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            p r0 = r2.f13229
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.net.Proxy r1 = r2.f13230
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r2 = r2.f13231
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            p r1 = r11.f13229
            og0 r1 = r1.f8371
            java.lang.String r2 = r1.f8093
            java.net.InetSocketAddress r3 = r11.f13231
            java.net.InetAddress r4 = r3.getAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = r4.getHostAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = p000.qd2.m4868(r4)
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r5 = 58
            boolean r6 = p000.q02.m4655(r2, r5)
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
            int r6 = r1.f8094
            int r9 = r3.getPort()
            java.lang.String r10 = ":"
            if (r6 != r9) goto L48
            boolean r6 = r2.equals(r4)
            if (r6 == 0) goto L50
        L48:
            r0.append(r10)
            int r1 = r1.f8094
            r0.append(r1)
        L50:
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L90
            java.net.Proxy r11 = r11.f13230
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
            boolean r11 = p000.q02.m4655(r4, r5)
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
