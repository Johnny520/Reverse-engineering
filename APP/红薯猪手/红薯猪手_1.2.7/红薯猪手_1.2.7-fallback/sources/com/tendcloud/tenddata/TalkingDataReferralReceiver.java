package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataReferralReceiver extends android.content.BroadcastReceiver {
    public TalkingDataReferralReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX DEBUG: Throwable added to exception handler: 'Exception', keep only Throwable */
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            android.os.Bundle r0 = r5.getExtras()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto La
            r1 = 0
            r0.containsKey(r1)     // Catch: java.lang.Throwable -> L80
        La:
            java.lang.String r0 = r5.getAction()
            java.lang.String r1 = "com.android.vending.INSTALL_REFERRER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L17
            return
        L17:
            java.lang.String r0 = "referrer"
            java.lang.String r5 = r5.getStringExtra(r0)
            if (r5 == 0) goto L80
            int r0 = r5.length()
            if (r0 != 0) goto L26
            goto L80
        L26:
            java.lang.String r0 = "UTF-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r0)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L36
            android.content.Context r4 = r4.getApplicationContext()
            com.tendcloud.tenddata.ab.g = r4
        L36:
            com.tendcloud.tenddata.zz$a r4 = new com.tendcloud.tenddata.zz$a
            r4.<init>()
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.paraMap
            java.lang.String r1 = "domain"
            java.lang.String r2 = "app"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.paraMap
            java.lang.String r1 = "apiType"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.paraMap
            java.lang.String r1 = "action"
            java.lang.String r2 = "install"
            r0.put(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.paraMap
            java.lang.String r1 = "service"
            com.tendcloud.tenddata.a r2 = com.tendcloud.tenddata.a.UNIVERSAL
            r0.put(r1, r2)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "referer"
            r0.put(r1, r5)
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = r4.paraMap
            java.lang.String r1 = "data"
            r5.put(r1, r0)
            android.os.Handler r5 = com.tendcloud.tenddata.zz.c()
            r0 = 102(0x66, float:1.43E-43)
            android.os.Message r4 = r5.obtainMessage(r0, r4)
            r4.sendToTarget()
        L80:
            return
    }
}
