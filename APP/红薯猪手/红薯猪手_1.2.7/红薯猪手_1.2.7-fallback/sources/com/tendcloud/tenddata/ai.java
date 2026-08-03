package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class ai {
    public static final java.util.Queue<java.lang.String> a = null;

    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.tendcloud.tenddata.ai.a = r0
            java.lang.String r1 = "tdsdk.xdrig.com"
            r0.add(r1)
            java.lang.String r1 = "tdsdk-ip6.xdrig.com"
            r0.add(r1)
            java.lang.String r1 = "tdsdk-ip6.cpatrk.com"
            r0.add(r1)
            return
    }

    public ai() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            java.util.Queue<java.lang.String> r0 = com.tendcloud.tenddata.ai.a
            java.lang.Object r0 = r0.poll()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static java.net.URL a(java.net.URL r3, java.lang.String r4) {
            boolean r0 = com.tendcloud.tenddata.o.b()
            if (r0 == 0) goto L7
            return r3
        L7:
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r3.getProtocol()
            int r2 = r3.getPort()
            java.lang.String r3 = r3.getFile()
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    public static void a(java.lang.String r2) {
            java.util.Queue<java.lang.String> r0 = com.tendcloud.tenddata.ai.a
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L12
            java.lang.String r2 = "host existed..."
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.tendcloud.tenddata.h.eForInternal(r2)
            return
        L12:
            r0.add(r2)
            return
    }
}
