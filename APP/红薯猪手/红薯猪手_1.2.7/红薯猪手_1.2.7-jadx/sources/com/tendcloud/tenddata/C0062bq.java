package com.tendcloud.tenddata;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bq */
/* JADX INFO: loaded from: classes.dex */
final class C0062bq extends PhoneStateListener {

    /* JADX INFO: renamed from: a */
    public static final long f319a = 180000;

    /* JADX INFO: renamed from: d */
    public int f322d;

    /* JADX INFO: renamed from: b */
    public long f320b = 0;

    /* JADX INFO: renamed from: c */
    public long f321c = 0;

    /* JADX INFO: renamed from: e */
    public int f323e = 0;

    /* JADX INFO: renamed from: a */
    private void m364a() {
        try {
            C0058bm.f301a.post(new Runnable() { // from class: com.tendcloud.tenddata.bq.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C0062bq.this.f320b = System.currentTimeMillis();
                        C0062bq c0062bq = C0062bq.this;
                        int i = c0062bq.f322d;
                        if (i == c0062bq.f323e || i <= 1 || c0062bq.f320b - c0062bq.f321c <= C0062bq.f319a) {
                            return;
                        }
                        C0067bv c0067bv = new C0067bv();
                        c0067bv.f353b = "env";
                        c0067bv.f354c = "cellUpdate";
                        c0067bv.f352a = AbstractC0018a.ENV;
                        C0132z.m785a().post(c0067bv);
                        C0062bq c0062bq2 = C0062bq.this;
                        c0062bq2.f321c = c0062bq2.f320b;
                        c0062bq2.f323e = c0062bq2.f322d;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(CellLocation cellLocation) {
        int networkId;
        try {
            if (cellLocation.getClass().equals(GsmCellLocation.class)) {
                networkId = ((GsmCellLocation) cellLocation).getLac();
            } else if (!cellLocation.getClass().equals(CdmaCellLocation.class)) {
                return;
            } else {
                networkId = ((CdmaCellLocation) cellLocation).getNetworkId();
            }
            this.f322d = networkId;
            m364a();
        } catch (Throwable unused) {
        }
    }
}
