package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0065 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.net.Proxy f357;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.net.InetSocketAddress f358;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0526 f359;

    public C0065(xhss.C0526 r1, java.net.Proxy r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r0.<init>()
            r0.f359 = r1
            r0.f357 = r2
            r0.f358 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.C0065
            if (r0 == 0) goto L26
            xhss.ᛱᛷᲁᛶ r3 = (xhss.C0065) r3
            xhss.ᛵᲈᛱᛳ r0 = r3.f359
            xhss.ᛵᲈᛱᛳ r1 = r2.f359
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.f357
            java.net.Proxy r1 = r2.f357
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.f358
            java.net.InetSocketAddress r2 = r2.f358
            boolean r2 = xhss.AbstractC0007.m97(r3, r2)
            if (r2 == 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            xhss.ᛵᲈᛱᛳ r0 = r2.f359
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.net.Proxy r1 = r2.f357
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r2 = r2.f358
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.ᛵᲈᛱᛳ r1 = r11.f359
            xhss.ᛷᛶᲁᛵ r1 = r1.f1924
            java.lang.String r2 = r1.f2288
            java.net.InetSocketAddress r3 = r11.f358
            java.net.InetAddress r4 = r3.getAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = r4.getHostAddress()
            if (r4 == 0) goto L1e
            java.lang.String r4 = xhss.AbstractC0898.m1458(r4)
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r5 = 58
            boolean r6 = xhss.AbstractC0120.m338(r2, r5)
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
            int r6 = r1.f2284
            int r9 = r3.getPort()
            java.lang.String r10 = ":"
            if (r6 != r9) goto L48
            boolean r6 = r2.equals(r4)
            if (r6 == 0) goto L50
        L48:
            r0.append(r10)
            int r1 = r1.f2284
            r0.append(r1)
        L50:
            boolean r1 = r2.equals(r4)
            if (r1 != 0) goto L90
            java.net.Proxy r11 = r11.f357
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
            boolean r11 = xhss.AbstractC0120.m338(r4, r5)
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
