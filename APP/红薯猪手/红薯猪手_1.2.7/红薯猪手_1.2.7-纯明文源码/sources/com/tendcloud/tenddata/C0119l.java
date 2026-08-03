package com.tendcloud.tenddata;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0119l {

    /* JADX INFO: renamed from: a */
    private static TelephonyManager f551a;

    /* JADX INFO: renamed from: b */
    private static String f552b;

    /* JADX INFO: renamed from: c */
    private static boolean f553c;

    /* JADX INFO: renamed from: d */
    private static final HashMap<String, String> f554d;

    static {
        HashMap<String, String> map = new HashMap<>();
        f554d = map;
        try {
            Context context = C0020ab.f132g;
            if (context != null) {
                f551a = (TelephonyManager) context.getSystemService("phone");
                map.put("imei1", m639a(C0020ab.f132g, 0));
                map.put("meid1", m637a(0));
                if (C0122o.m663B(C0020ab.f132g) == 2) {
                    map.put("imei2", m639a(C0020ab.f132g, 1));
                    map.put("meid2", m637a(1));
                }
                map.put("imsi", m656g(C0020ab.f132g));
                map.put("androidId", m653e(C0020ab.f132g));
                map.put("mac", m651d(C0020ab.f132g));
                map.put("ethMac", m647c());
                map.put("dummy0", m643b());
                map.put("serialNo", m649c(C0020ab.f132g));
            }
        } catch (Throwable unused) {
        }
    }

    private C0119l() {
    }

    /* JADX INFO: renamed from: a */
    public static String m637a(int i) {
        if (!C0020ab.f110T.isIMEIAndMEIDEnabled() || !C0131y.m754a(26)) {
            return "";
        }
        try {
            return f551a.getMeid(i);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m638a(Context context) {
        try {
            String strM640a = m640a("mac");
            if (!C0131y.m767b(strM640a)) {
                strM640a = String.valueOf(Long.parseLong(strM640a.replaceAll(":", ""), 16));
            }
            String strM640a2 = m640a("androidId");
            String strM640a3 = m640a("imeis");
            String strM640a4 = m640a("imsi");
            String strM640a5 = m640a("simId");
            String strM570a = C0117j.m570a(context);
            String strM650d = m650d();
            String strM640a6 = m640a("serialNo");
            StringBuilder sb = new StringBuilder(170);
            sb.append(2);
            sb.append("|");
            sb.append(strM640a);
            sb.append("|");
            sb.append(strM640a2);
            sb.append("|");
            sb.append(strM640a3);
            sb.append("|");
            sb.append(strM640a4);
            sb.append("|");
            sb.append(strM640a5);
            sb.append("|");
            sb.append(strM570a);
            sb.append("|");
            sb.append(strM650d);
            sb.append("|");
            sb.append(strM640a6);
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m639a(Context context, int i) {
        if (!C0020ab.f110T.isIMEIAndMEIDEnabled() || !C0131y.m766b(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (!C0131y.m754a(26)) {
            return C0131y.m754a(23) ? f551a.getDeviceId(i) : f551a.getDeviceId();
        }
        try {
            return f551a.getImei(i);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m640a(String str) {
        return f554d.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m641a() {
        try {
            if (C0131y.m773c(C0020ab.f132g, "android.permission.READ_PHONE_STATE")) {
                C0122o.tryGetDoubleSimInfoReCheck(C0020ab.f132g);
                C0110dk.m504b().m508a();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m643b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.getName().toLowerCase().startsWith("dummy")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        String hostAddress = inetAddresses.nextElement().getHostAddress();
                        if (hostAddress.contains("dummy")) {
                            return hostAddress.split("%")[0];
                        }
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m644b(int i) {
        if (!C0020ab.f110T.isIMEIAndMEIDEnabled()) {
            return null;
        }
        try {
            String strM640a = m640a(i == 1 ? "imei2" : "imei1");
            if (C0131y.m767b(strM640a)) {
                return null;
            }
            return C0131y.m771c(strM640a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m645b(final Context context) {
        try {
            if (!f553c) {
                C0129w.f620a.execute(new Runnable() { // from class: com.tendcloud.tenddata.l.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            boolean unused = C0119l.f553c = true;
                            String unused2 = C0119l.f552b = (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), new Object[0]);
                        } catch (Throwable unused3) {
                        }
                    }
                });
            }
            return f552b;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m647c() {
        if (!C0020ab.f110T.isMACEnabled()) {
            return null;
        }
        try {
            String strM654f = m654f();
            try {
                if (C0131y.m784j(strM654f)) {
                    return null;
                }
            } catch (Throwable unused) {
            }
            return strM654f;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m648c(int i) {
        if (!C0020ab.f110T.isIMEIAndMEIDEnabled()) {
            return null;
        }
        try {
            String strM640a = m640a(i == 1 ? "meid2" : "meid1");
            if (C0131y.m767b(strM640a)) {
                return null;
            }
            return C0131y.m771c(strM640a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m649c(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static String m650d() {
        try {
            return C0105df.m491a().m492c();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m651d(Context context) {
        if (!C0020ab.f110T.isMACEnabled()) {
            return null;
        }
        try {
            String strM652e = C0131y.m754a(23) ? m652e() : m659j(context);
            try {
                if (C0131y.m784j(strM652e)) {
                    return null;
                }
            } catch (Throwable unused) {
            }
            return strM652e;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m652e() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString().toUpperCase().trim();
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m653e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m654f() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("eth0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString().toUpperCase().trim();
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m655f(Context context) {
        HashMap<String, String> map;
        String str;
        if (!C0020ab.f110T.isIMEIAndMEIDEnabled()) {
            return "";
        }
        try {
            if (C0122o.m663B(context) == 2) {
                map = f554d;
                str = "imei2";
            } else {
                map = f554d;
                str = "imei1";
            }
            return map.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m656g(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    private static String m657h(Context context) {
        try {
            if (!C0131y.m766b(context, "android.permission.READ_PHONE_STATE")) {
                return null;
            }
            String str = "";
            if (C0122o.m663B(context) == 2) {
                try {
                    HashMap<String, String> map = f554d;
                    map.get("imei1");
                    str = map.get("imei2");
                } catch (Exception unused) {
                }
            }
            return C0131y.m767b(str) ? f554d.get("imei1") : str;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private static String m658i(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    private static String m659j(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        String macAddress;
        try {
            if (!C0131y.m766b(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null || (macAddress = connectionInfo.getMacAddress()) == null) {
                return null;
            }
            return macAddress.toUpperCase().trim();
        } catch (Throwable unused) {
            return null;
        }
    }
}
