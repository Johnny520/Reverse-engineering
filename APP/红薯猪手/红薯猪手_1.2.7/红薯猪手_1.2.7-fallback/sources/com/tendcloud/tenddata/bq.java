package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class bq extends android.telephony.PhoneStateListener {
    public static final long a = 180000;
    public long b;
    public long c;
    public int d;
    public int e;


    public bq() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            r2.c = r0
            r0 = 0
            r2.e = r0
            return
    }

    private void a() {
            r2 = this;
            android.os.Handler r0 = com.tendcloud.tenddata.bm.a     // Catch: java.lang.Throwable -> La
            com.tendcloud.tenddata.bq$1 r1 = new com.tendcloud.tenddata.bq$1     // Catch: java.lang.Throwable -> La
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La
            r0.post(r1)     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(android.telephony.CellLocation r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<android.telephony.gsm.GsmCellLocation> r1 = android.telephony.gsm.GsmCellLocation.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L18
            android.telephony.gsm.GsmCellLocation r3 = (android.telephony.gsm.GsmCellLocation) r3     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.getLac()     // Catch: java.lang.Throwable -> L2b
        L12:
            r2.d = r3     // Catch: java.lang.Throwable -> L2b
            r2.a()     // Catch: java.lang.Throwable -> L2b
            goto L2b
        L18:
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<android.telephony.cdma.CdmaCellLocation> r1 = android.telephony.cdma.CdmaCellLocation.class
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2b
            android.telephony.cdma.CdmaCellLocation r3 = (android.telephony.cdma.CdmaCellLocation) r3     // Catch: java.lang.Throwable -> L2b
            int r3 = r3.getNetworkId()     // Catch: java.lang.Throwable -> L2b
            goto L12
        L2b:
            return
    }
}
