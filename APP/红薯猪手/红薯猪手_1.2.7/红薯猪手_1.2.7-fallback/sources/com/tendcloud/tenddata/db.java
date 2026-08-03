package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class db extends com.tendcloud.tenddata.cy {
    public db() {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = com.tendcloud.tenddata.k.f()
            java.lang.String r1 = "manufacture"
            r5.a(r1, r0)
            java.lang.String r0 = com.tendcloud.tenddata.k.g()
            java.lang.String r1 = "brand"
            r5.a(r1, r0)
            java.lang.String r0 = com.tendcloud.tenddata.k.h()
            java.lang.String r1 = "model"
            r5.a(r1, r0)
            java.lang.String r0 = "dummy0"
            java.lang.String r1 = com.tendcloud.tenddata.l.a(r0)
            r5.a(r0, r1)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String[] r1 = com.tendcloud.tenddata.k.p()
            r2 = 0
            r3 = r2
        L32:
            int r4 = r1.length
            if (r3 >= r4) goto L3d
            r4 = r1[r3]
            r0.put(r4)
            int r3 = r3 + 1
            goto L32
        L3d:
            java.lang.String r1 = "cpuInfo"
            r5.a(r1, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int[] r1 = com.tendcloud.tenddata.k.t()
            r3 = r2
        L4c:
            int r4 = r1.length
            if (r3 >= r4) goto L57
            r4 = r1[r3]
            r0.put(r4)
            int r3 = r3 + 1
            goto L4c
        L57:
            java.lang.String r1 = "memoryInfo"
            r5.a(r1, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int[] r1 = com.tendcloud.tenddata.k.s()
        L65:
            int r3 = r1.length
            if (r2 >= r3) goto L70
            r3 = r1[r2]
            r0.put(r3)
            int r2 = r2 + 1
            goto L65
        L70:
            java.lang.String r1 = "sdCardInfo"
            r5.a(r1, r0)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            org.json.JSONObject r1 = r5.b
            com.tendcloud.tenddata.k.a(r0, r1)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            org.json.JSONObject r1 = r5.b
            com.tendcloud.tenddata.k.b(r0, r1)
            int r0 = a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "totalDiskSpace"
            r5.a(r1, r0)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            org.json.JSONObject r0 = com.tendcloud.tenddata.k.h(r0)
            java.lang.String r1 = "support"
            r5.a(r1, r0)
            org.json.JSONObject r0 = com.tendcloud.tenddata.k.q()
            java.lang.String r1 = "cpu"
            r5.a(r1, r0)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            org.json.JSONObject r0 = com.tendcloud.tenddata.k.b(r0)
            java.lang.String r1 = "nfcHce"
            r5.a(r1, r0)
            return
    }

    public static int a() {
            r0 = 0
            int[] r1 = com.tendcloud.tenddata.k.u()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L16
            boolean r2 = android.os.Environment.isExternalStorageEmulated()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L14
            r2 = r1[r0]     // Catch: java.lang.Throwable -> L16
            r3 = 2
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L16
            int r2 = r2 + r0
            return r2
        L14:
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L16
        L16:
            return r0
    }

    public void setSlots(int r2) {
            r1 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "slots"
            r1.a(r0, r2)
            return
    }
}
