package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public enum aq extends java.lang.Enum<com.tendcloud.tenddata.aq> {
    public static final com.tendcloud.tenddata.aq a = null;
    public static final com.tendcloud.tenddata.aq b = null;
    private static final /* synthetic */ com.tendcloud.tenddata.aq[] d = null;
    private final boolean c;

    static {
            com.tendcloud.tenddata.aq r0 = new com.tendcloud.tenddata.aq
            java.lang.String r1 = "GET"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.tendcloud.tenddata.aq.a = r0
            com.tendcloud.tenddata.aq r1 = new com.tendcloud.tenddata.aq
            java.lang.String r3 = "POST"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.tendcloud.tenddata.aq.b = r1
            r3 = 2
            com.tendcloud.tenddata.aq[] r3 = new com.tendcloud.tenddata.aq[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.tendcloud.tenddata.aq.d = r3
            return
    }

    aq(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.c = r3
            return
    }

    public static com.tendcloud.tenddata.aq valueOf(java.lang.String r1) {
            java.lang.Class<com.tendcloud.tenddata.aq> r0 = com.tendcloud.tenddata.aq.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tendcloud.tenddata.aq r1 = (com.tendcloud.tenddata.aq) r1
            return r1
    }

    public static com.tendcloud.tenddata.aq[] values() {
            com.tendcloud.tenddata.aq[] r0 = com.tendcloud.tenddata.aq.d
            java.lang.Object r0 = r0.clone()
            com.tendcloud.tenddata.aq[] r0 = (com.tendcloud.tenddata.aq[]) r0
            return r0
    }

    public final void a(java.net.HttpURLConnection r2) {
            r1 = this;
            java.lang.String r0 = r1.name()     // Catch: java.lang.Throwable -> L10
            r2.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L10
            boolean r0 = r1.c     // Catch: java.lang.Throwable -> L10
            r2.setDoOutput(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 1
            r2.setDoInput(r0)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }
}
