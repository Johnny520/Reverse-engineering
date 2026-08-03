package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bm */
/* JADX INFO: loaded from: classes.dex */
public final class C0058bm {

    /* JADX INFO: renamed from: a */
    public static Handler f301a = null;

    /* JADX INFO: renamed from: b */
    public static HandlerThread f302b = null;

    /* JADX INFO: renamed from: c */
    private static final String f303c = "check_wifi_permission";

    /* JADX INFO: renamed from: d */
    private static final String f304d = "check_bs_permission";

    /* JADX INFO: renamed from: e */
    private static final String f305e = "check_gps_permission";

    /* JADX INFO: renamed from: f */
    private static final int f306f = 1;

    /* JADX INFO: renamed from: g */
    private static final int f307g = 2;

    /* JADX INFO: renamed from: h */
    private static final int f308h = 3;

    /* JADX INFO: renamed from: i */
    private static final int f309i = 4;

    /* JADX INFO: renamed from: j */
    private static final long f310j = 600000;

    /* JADX INFO: renamed from: k */
    private static volatile C0058bm f311k;

    /* JADX INFO: renamed from: l */
    private static WifiManager f312l;

    static {
        try {
            C0132z.m785a().register(m341a());
        } catch (Throwable unused) {
        }
    }

    private C0058bm() {
        try {
            HandlerThread handlerThread = new HandlerThread("locHandlerThread", 10);
            f302b = handlerThread;
            handlerThread.start();
            f301a = new Handler(f302b.getLooper()) { // from class: com.tendcloud.tenddata.bm.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i != 1) {
                        if (i == 3) {
                            C0058bm.this.m345c();
                            return;
                        } else if (i != 4) {
                            return;
                        } else {
                            C0058bm.this.m345c();
                        }
                    }
                    C0058bm.this.m343b();
                }
            };
            m346a(4, 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0058bm m341a() {
        if (f311k == null) {
            synchronized (C0058bm.class) {
                if (f311k == null) {
                    f311k = new C0058bm();
                }
            }
        }
        return f311k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m343b() {
        try {
            if (!m347a(f303c)) {
                m346a(1, C0062bq.f319a);
                return;
            }
            WifiManager wifiManager = (WifiManager) C0020ab.f132g.getSystemService("wifi");
            f312l = wifiManager;
            if (wifiManager.isWifiEnabled()) {
                C0020ab.f132g.registerReceiver(new C0063br(f312l), new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    /* JADX INFO: renamed from: c */
    public void m345c() {
        try {
            if (!m347a(f304d)) {
                m346a(3, C0062bq.f319a);
                return;
            }
            Context context = C0020ab.f132g;
            if (context != null) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager.getSimState() == 5) {
                    telephonyManager.getCellLocation();
                    telephonyManager.listen(new C0062bq(), 16);
                    CellLocation.requestLocationUpdate();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m346a(int i, long j) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            f301a.sendMessageDelayed(messageObtain, j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m347a(String str) {
        try {
            boolean zM766b = C0131y.m766b(C0020ab.f132g, "android.permission.READ_PHONE_STATE");
            boolean z = C0131y.m766b(C0020ab.f132g, "android.permission.ACCESS_COARSE_LOCATION") || C0131y.m766b(C0020ab.f132g, "android.permission.ACCESS_FINE_LOCATION");
            boolean zM766b2 = C0131y.m766b(C0020ab.f132g, "android.permission.ACCESS_WIFI_STATE");
            byte b = -1;
            int iHashCode = str.hashCode();
            if (iHashCode != -1215157370) {
                if (iHashCode != 1219872770) {
                    if (iHashCode == 1355887771 && str.equals(f305e)) {
                        b = 1;
                    }
                } else if (str.equals(f303c)) {
                    b = 2;
                }
            } else if (str.equals(f304d)) {
                b = 0;
            }
            if (b == 0) {
                return z && zM766b;
            }
            if (b == 1) {
                return z;
            }
            if (b != 2) {
                return false;
            }
            return C0131y.m754a(23) ? zM766b2 && z : zM766b2;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void onTDEBEventLocationEvent(C0064bs c0064bs) {
    }
}
