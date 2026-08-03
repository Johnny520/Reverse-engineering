package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public enum di extends java.lang.Enum<com.tendcloud.tenddata.di> {
    public static final com.tendcloud.tenddata.di a = null;
    public static final com.tendcloud.tenddata.di b = null;
    public static final com.tendcloud.tenddata.di c = null;
    private static final /* synthetic */ com.tendcloud.tenddata.di[] e = null;
    private java.lang.String d;

    static {
            com.tendcloud.tenddata.di r0 = new com.tendcloud.tenddata.di
            java.lang.String r1 = "WIFI"
            r2 = 0
            java.lang.String r3 = "wifi"
            r0.<init>(r1, r2, r3)
            com.tendcloud.tenddata.di.a = r0
            com.tendcloud.tenddata.di r1 = new com.tendcloud.tenddata.di
            java.lang.String r3 = "CELLULAR"
            r4 = 1
            java.lang.String r5 = "cellular"
            r1.<init>(r3, r4, r5)
            com.tendcloud.tenddata.di.b = r1
            com.tendcloud.tenddata.di r3 = new com.tendcloud.tenddata.di
            java.lang.String r5 = "BLUETOOTH"
            r6 = 2
            java.lang.String r7 = "bluetooth"
            r3.<init>(r5, r6, r7)
            com.tendcloud.tenddata.di.c = r3
            r5 = 3
            com.tendcloud.tenddata.di[] r5 = new com.tendcloud.tenddata.di[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.tendcloud.tenddata.di.e = r5
            return
    }

    di(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.d = r3
            return
    }

    public static com.tendcloud.tenddata.di valueOf(java.lang.String r1) {
            java.lang.Class<com.tendcloud.tenddata.di> r0 = com.tendcloud.tenddata.di.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tendcloud.tenddata.di r1 = (com.tendcloud.tenddata.di) r1
            return r1
    }

    public static com.tendcloud.tenddata.di[] values() {
            com.tendcloud.tenddata.di[] r0 = com.tendcloud.tenddata.di.e
            java.lang.Object r0 = r0.clone()
            com.tendcloud.tenddata.di[] r0 = (com.tendcloud.tenddata.di[]) r0
            return r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }
}
