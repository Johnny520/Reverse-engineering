package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.tendcloud.tenddata.C0020ab;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.o */
/* JADX INFO: loaded from: classes.dex */
public class C0122o {

    /* JADX INFO: renamed from: a */
    public static final String f557a = "www.talkingdata.net";

    /* JADX INFO: renamed from: b */
    public static final int f558b = 80;

    /* JADX INFO: renamed from: c */
    private static TelephonyManager f559c = null;

    /* JADX INFO: renamed from: d */
    private static final HashMap<String, String> f560d;

    /* JADX INFO: renamed from: e */
    private static final String[] f561e;

    /* JADX INFO: renamed from: f */
    private static final String[] f562f;

    /* JADX INFO: renamed from: g */
    private static a f563g = null;

    /* JADX INFO: renamed from: h */
    private static boolean f564h = false;

    /* JADX INFO: renamed from: i */
    private static final long f565i = 300000;

    /* JADX INFO: renamed from: j */
    private static long f566j;

    /* JADX INFO: renamed from: k */
    private static volatile boolean f567k;

    /* JADX INFO: renamed from: l */
    private static volatile boolean f568l;

    /* JADX INFO: renamed from: m */
    private static JSONArray f569m;

    /* JADX INFO: renamed from: n */
    private static JSONArray f570n;

    /* JADX INFO: renamed from: o */
    private static volatile boolean f571o;

    /* JADX INFO: renamed from: p */
    private static volatile boolean f572p;

    /* JADX INFO: renamed from: q */
    private static volatile boolean f573q;

    /* JADX INFO: renamed from: r */
    private static JSONArray f574r;

    /* JADX INFO: renamed from: s */
    private static JSONArray f575s;

    /* JADX INFO: renamed from: t */
    private static JSONArray f576t;

    /* JADX INFO: renamed from: u */
    private static boolean f577u;

    /* JADX INFO: renamed from: v */
    private static b f578v;

    /* JADX INFO: renamed from: w */
    private static JSONArray f579w;

    /* JADX INFO: renamed from: x */
    private static volatile boolean f580x;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.o$a */
    public static class a implements Runnable {
        private Context context;
        private Object lock;
        private BroadcastReceiver receiver;

        public a(Context context, Object obj, BroadcastReceiver broadcastReceiver) {
            this.context = context;
            this.lock = obj;
            this.receiver = broadcastReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            BroadcastReceiver broadcastReceiver;
            try {
                synchronized (this.lock) {
                    try {
                        this.lock.notifyAll();
                        context = this.context;
                        broadcastReceiver = this.receiver;
                    } catch (Throwable unused) {
                        context = this.context;
                        broadcastReceiver = this.receiver;
                    }
                    context.unregisterReceiver(broadcastReceiver);
                }
            } catch (Throwable unused2) {
            }
        }

        public void unRegisterReceiver() {
            BroadcastReceiver broadcastReceiver = this.receiver;
            if (broadcastReceiver != null) {
                try {
                    this.context.unregisterReceiver(broadcastReceiver);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.o$b */
    public static class b extends BroadcastReceiver {
        private CountDownLatch latch = new CountDownLatch(1);

        public void await() {
            try {
                this.latch.await(2000L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                C0115h.eForInternal(th);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!"android.net.wifi.SCAN_RESULTS".equals(intent.getAction()) || this.latch.getCount() <= 0) {
                return;
            }
            this.latch.countDown();
        }

        public void reset() {
            this.latch = new CountDownLatch(1);
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        f560d = map;
        f561e = new String[]{"UNKNOWN", "GPRS", "EDGE", "UMTS", "CDMA", "EVDO_0", "EVDO_A", "1xRTT", "HSDPA", "HSUPA", "HSPA", "IDEN", "EVDO_B", "LTE", "EHRPD", "HSPAP"};
        f562f = new String[]{"NONE", "GSM", "CDMA", "SIP"};
        f563g = null;
        if (C0020ab.f132g != null) {
            String[] strArrM682a = m682a();
            map.put("ip", strArrM682a[0]);
            map.put("ipv6", strArrM682a[1]);
            map.put("cell_ip", strArrM682a[2]);
            map.put("cell_ipv6", strArrM682a[3]);
            map.put("bssid", m708q(C0020ab.f132g));
            map.put("ssid", m714w(C0020ab.f132g));
        }
        f564h = false;
        f566j = -300000L;
        f567k = false;
        f568l = false;
        f569m = new JSONArray();
        f571o = false;
        f572p = false;
        f573q = false;
        f574r = new JSONArray();
        f577u = false;
        f578v = new b();
        f579w = new JSONArray();
        f580x = false;
    }

    /* JADX INFO: renamed from: A */
    public static JSONArray m662A(Context context) {
        if (f579w.length() > 0 || f580x) {
            return f579w;
        }
        if (!C0131y.m766b(context, "android.permission.READ_PHONE_STATE")) {
            return f579w;
        }
        m665D(context);
        return f579w;
    }

    /* JADX INFO: renamed from: B */
    public static int m663B(Context context) {
        try {
            if (!C0131y.m754a(23)) {
                return m662A(context).length();
            }
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getPhoneCount();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: C */
    public static Map<String, Object> m664C(Context context) {
        DatagramSocket datagramSocket;
        if (m695d(context)) {
            try {
                String str = f560d.get("ip");
                if (str != null) {
                    String strSubstring = str.substring(0, str.lastIndexOf(46) + 1);
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[0], 0, 0);
                    datagramSocket = new DatagramSocket();
                    for (int i = 1; i < 255; i++) {
                        try {
                            try {
                                datagramPacket.setAddress(InetAddress.getByName(strSubstring + i));
                                datagramSocket.send(datagramPacket);
                                if (i == 125) {
                                    datagramSocket.close();
                                    datagramSocket = new DatagramSocket();
                                }
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            if (datagramSocket != null) {
                                try {
                                    datagramSocket.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            return null;
                        }
                    }
                    datagramSocket.close();
                } else {
                    datagramSocket = null;
                }
                Thread.sleep(5000L);
                Map<String, Object> mapM692c = m692c();
                if (datagramSocket != null) {
                    try {
                        datagramSocket.close();
                    } catch (Throwable unused4) {
                    }
                }
                return mapM692c;
            } catch (Throwable unused5) {
                datagramSocket = null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    private static void m665D(Context context) {
        if (C0020ab.f110T.isIMEIAndMEIDEnabled()) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                ArrayList arrayList = new ArrayList();
                if (C0131y.m754a(22)) {
                    SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                    try {
                        JSONObject jSONObjectM677a = m677a(context, subscriptionManager, 0);
                        if (C0131y.m754a(26)) {
                            try {
                                jSONObjectM677a.put("imei", C0119l.m640a("imei1"));
                                jSONObjectM677a.put("imei5", C0119l.m644b(0));
                            } catch (Throwable unused) {
                            }
                            try {
                                jSONObjectM677a.put("meid", C0119l.m640a("meid1"));
                                jSONObjectM677a.put("meid5", C0119l.m648c(0));
                            } catch (Throwable unused2) {
                            }
                        } else {
                            jSONObjectM677a.put("imei", C0119l.m640a("imei1"));
                            jSONObjectM677a.put("imei5", C0119l.m644b(0));
                        }
                        if (jSONObjectM677a.length() > 0) {
                            f579w.put(jSONObjectM677a);
                        }
                    } catch (Throwable unused3) {
                    }
                    JSONObject jSONObjectM677a2 = m677a(context, subscriptionManager, 1);
                    if (telephonyManager != null) {
                        if (C0131y.m754a(26)) {
                            try {
                                jSONObjectM677a2.put("imei", C0119l.m640a("imei2"));
                                jSONObjectM677a2.put("imei5", C0119l.m644b(1));
                            } catch (Throwable unused4) {
                            }
                            try {
                                jSONObjectM677a2.put("meid", C0119l.m640a("meid2"));
                                jSONObjectM677a2.put("meid5", C0119l.m648c(1));
                            } catch (Throwable unused5) {
                            }
                        } else {
                            jSONObjectM677a2.put("imei", C0119l.m640a("imei2"));
                            jSONObjectM677a2.put("imei5", C0119l.m644b(1));
                        }
                    }
                    if (jSONObjectM677a2.length() > 0) {
                        f579w.put(jSONObjectM677a2);
                    }
                } else {
                    String deviceId = telephonyManager != null ? telephonyManager.getDeviceId() : "";
                    if (m689c(deviceId.trim()).booleanValue()) {
                        arrayList.add(deviceId.trim());
                        JSONObject jSONObjectM678a = m678a(telephonyManager, deviceId);
                        if (jSONObjectM678a != null) {
                            f579w.put(jSONObjectM678a);
                        }
                    }
                    try {
                        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone1");
                        String deviceId2 = telephonyManager2 != null ? telephonyManager2.getDeviceId() : "";
                        if (deviceId2 != null && m689c(deviceId2).booleanValue() && !arrayList.contains(deviceId2)) {
                            arrayList.add(deviceId2);
                            JSONObject jSONObjectM678a2 = m678a(telephonyManager2, deviceId2);
                            if (jSONObjectM678a2 != null) {
                                f579w.put(jSONObjectM678a2);
                            }
                        }
                    } catch (Throwable unused6) {
                    }
                    try {
                        TelephonyManager telephonyManager3 = (TelephonyManager) context.getSystemService("phone2");
                        String deviceId3 = telephonyManager3 != null ? telephonyManager3.getDeviceId() : "";
                        if (deviceId3 != null && m689c(deviceId3).booleanValue() && !arrayList.contains(deviceId3)) {
                            arrayList.add(deviceId3);
                            JSONObject jSONObjectM678a3 = m678a(telephonyManager3, deviceId3);
                            if (jSONObjectM678a3 != null) {
                                f579w.put(jSONObjectM678a3);
                            }
                        }
                    } catch (Throwable unused7) {
                    }
                    JSONArray jSONArrayM669H = m669H(context);
                    JSONArray jSONArrayM668G = m668G(context);
                    if (jSONArrayM668G != null) {
                        jSONArrayM669H = jSONArrayM668G;
                    }
                    JSONArray jSONArrayM667F = m667F(context);
                    if (jSONArrayM667F != null) {
                        jSONArrayM669H = jSONArrayM667F;
                    }
                    JSONArray jSONArrayM666E = m666E(context);
                    if (jSONArrayM666E != null) {
                        jSONArrayM669H = jSONArrayM666E;
                    }
                    if (jSONArrayM669H != null && jSONArrayM669H.length() > 0) {
                        for (int i = 0; i < jSONArrayM669H.length(); i++) {
                            JSONObject jSONObject = jSONArrayM669H.getJSONObject(i);
                            String string = jSONObject.getString("imei");
                            if (!arrayList.contains(string)) {
                                arrayList.add(string);
                                f579w.put(jSONObject);
                            }
                        }
                    }
                }
            } catch (Throwable unused8) {
            }
            f580x = true;
        }
    }

    /* JADX INFO: renamed from: E */
    private static JSONArray m666E(Context context) {
        int i;
        int i2;
        try {
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            Class<?> cls = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field = cls.getField("GEMINI_SIM_1");
                field.setAccessible(true);
                i = (Integer) field.get(null);
                Field field2 = cls.getField("GEMINI_SIM_2");
                field2.setAccessible(true);
                i2 = (Integer) field2.get(null);
            } catch (Throwable unused) {
                i = 0;
                i2 = 1;
            }
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getDeviceIdGemini", Integer.TYPE);
            if (telephonyManager != null && declaredMethod != null) {
                String strTrim = ((String) declaredMethod.invoke(telephonyManager, i)).trim();
                String strTrim2 = ((String) declaredMethod.invoke(telephonyManager, i2)).trim();
                if (m689c(strTrim).booleanValue()) {
                    jSONArray.put(m679a(TelephonyManager.class, telephonyManager, i, strTrim, "Gemini"));
                }
                if (m689c(strTrim2).booleanValue()) {
                    jSONArray.put(m679a(TelephonyManager.class, telephonyManager, i2, strTrim2, "Gemini"));
                }
                return jSONArray;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    private static JSONArray m667F(Context context) {
        int i;
        int i2;
        JSONObject jSONObjectM678a;
        JSONObject jSONObjectM678a2;
        try {
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            Class<?> cls = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field = cls.getField("GEMINI_SIM_1");
                field.setAccessible(true);
                i = (Integer) field.get(null);
                Field field2 = cls.getField("GEMINI_SIM_2");
                field2.setAccessible(true);
                i2 = (Integer) field2.get(null);
            } catch (Throwable unused) {
                i = 0;
                i2 = 1;
            }
            Method method = TelephonyManager.class.getMethod("getDefault", Integer.TYPE);
            TelephonyManager telephonyManager2 = (TelephonyManager) method.invoke(telephonyManager, i);
            TelephonyManager telephonyManager3 = (TelephonyManager) method.invoke(telephonyManager, i2);
            String strTrim = telephonyManager2.getDeviceId().trim();
            String strTrim2 = telephonyManager3.getDeviceId().trim();
            if (m689c(strTrim).booleanValue() && (jSONObjectM678a2 = m678a(telephonyManager2, strTrim)) != null) {
                jSONArray.put(jSONObjectM678a2);
            }
            if (m689c(strTrim2).booleanValue() && (jSONObjectM678a = m678a(telephonyManager3, strTrim2)) != null) {
                jSONArray.put(jSONObjectM678a);
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    private static JSONArray m668G(Context context) {
        JSONObject jSONObjectM678a;
        JSONObject jSONObjectM678a2;
        try {
            JSONArray jSONArray = new JSONArray();
            Class<?> cls = Class.forName("com.android.internal.telephony.PhoneFactory");
            String str = (String) cls.getMethod("getServiceName", String.class, Integer.TYPE).invoke(cls, "phone", 1);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String strTrim = telephonyManager.getDeviceId().trim();
            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService(str);
            String strTrim2 = telephonyManager2.getDeviceId().trim();
            if (m689c(strTrim).booleanValue() && (jSONObjectM678a2 = m678a(telephonyManager, strTrim)) != null) {
                jSONArray.put(jSONObjectM678a2);
            }
            if (m689c(strTrim2).booleanValue() && (jSONObjectM678a = m678a(telephonyManager2, strTrim2)) != null) {
                jSONArray.put(jSONObjectM678a);
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: H */
    private static JSONArray m669H(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            Class<?> cls = Class.forName("android.telephony.MSimTelephonyManager");
            Object systemService = context.getSystemService("phone_msim");
            Method method = cls.getMethod("getDeviceId", Integer.TYPE);
            String strTrim = ((String) method.invoke(systemService, 0)).trim();
            String strTrim2 = ((String) method.invoke(systemService, 1)).trim();
            if (m689c(strTrim).booleanValue()) {
                jSONArray.put(m679a(cls, systemService, 0, strTrim, ""));
            }
            if (m689c(strTrim2).booleanValue()) {
                jSONArray.put(m679a(cls, systemService, 1, strTrim2, ""));
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m670a(int i) {
        if (i >= 0) {
            String[] strArr = f561e;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: a */
    public static String m671a(String str) {
        return f560d.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m672a(Context context, boolean z) {
        CdmaCellLocation cdmaCellLocation;
        if (context == null) {
            try {
                context = C0020ab.f132g;
                if (context == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        if (f569m.length() <= 0 && !f567k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", m705n(context));
            jSONObject.put("mcc", m706o(context));
            jSONObject.put("operator", m710s(context));
            jSONObject.put("country", m709r(context));
            boolean zIsLocationEnabled = C0020ab.f110T.isLocationEnabled();
            if (zIsLocationEnabled && !C0131y.m766b(context, "android.permission.ACCESS_COARSE_LOCATION") && !C0131y.m766b(context, "android.permission.ACCESS_FINE_LOCATION")) {
                zIsLocationEnabled = false;
            }
            if (zIsLocationEnabled) {
                if (f559c == null) {
                    m680a(context);
                }
                if ((C0131y.f631c || z) && !C0020ab.f106P) {
                    CellLocation cellLocation = f559c.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        if (gsmCellLocation != null) {
                            jSONObject.put("systemId", gsmCellLocation.getLac());
                            jSONObject.put("networkId", gsmCellLocation.getCid());
                            if (C0131y.m754a(9)) {
                                jSONObject.put("basestationId", gsmCellLocation.getPsc());
                            }
                        }
                    } else if ((cellLocation instanceof CdmaCellLocation) && (cdmaCellLocation = (CdmaCellLocation) cellLocation) != null) {
                        jSONObject.put("systemId", cdmaCellLocation.getSystemId());
                        jSONObject.put("networkId", cdmaCellLocation.getNetworkId());
                        jSONObject.put("basestationId", cdmaCellLocation.getBaseStationId());
                        jSONObject.put("location", m676a(cdmaCellLocation.getBaseStationLatitude(), cdmaCellLocation.getBaseStationLongitude()));
                    }
                }
            }
            f567k = true;
            f569m.put(jSONObject);
            return f569m;
        }
        return f569m;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m673a(ArrayList arrayList, int i) {
        try {
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.o.4
                /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject2.getInt("level") - jSONObject.getInt("level");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i) {
                i = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONArray m674a(BitSet bitSet) {
        if (bitSet == null || bitSet.cardinality() < 1) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit < 0) {
                return jSONArray;
            }
            jSONArray.put(iNextSetBit);
            i = iNextSetBit + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m675a(JSONArray jSONArray, int i) {
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.optJSONObject(i2));
            }
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.o.2
                /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject2.getInt("asuLevel") - jSONObject.getInt("asuLevel");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i) {
                i = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m676a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lat", i);
            jSONObject.put("lng", i2);
            jSONObject.put("unit", "qd");
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m677a(Context context, SubscriptionManager subscriptionManager, int i) {
        SubscriptionInfo activeSubscriptionInfoForSimSlotIndex;
        String countryIso = "";
        JSONObject jSONObject = new JSONObject();
        if (!C0020ab.f110T.isIMEIAndMEIDEnabled()) {
            return jSONObject;
        }
        try {
            if (C0131y.m754a(22) && (activeSubscriptionInfoForSimSlotIndex = subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(i)) != null) {
                jSONObject.put("simSerialNumber", "");
                jSONObject.put("simOperator", activeSubscriptionInfoForSimSlotIndex.getMcc() + "0" + activeSubscriptionInfoForSimSlotIndex.getMnc());
                jSONObject.put("simOperatorName", activeSubscriptionInfoForSimSlotIndex.getCarrierName() == null ? "" : activeSubscriptionInfoForSimSlotIndex.getCarrierName());
                if (activeSubscriptionInfoForSimSlotIndex.getCountryIso() != null) {
                    countryIso = activeSubscriptionInfoForSimSlotIndex.getCountryIso();
                }
                jSONObject.put("simCountryIso", countryIso);
                jSONObject.put("subscriberId", C0119l.m640a("imsi"));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m678a(TelephonyManager telephonyManager, String str) {
        if (!C0020ab.f110T.isIMEIAndMEIDEnabled()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imei", str.trim());
            jSONObject.put("imei5", C0131y.m771c(str.trim()));
            jSONObject.put("dataState", telephonyManager.getDataState());
            jSONObject.put("networkType", m670a(telephonyManager.getNetworkType()));
            jSONObject.put("networkOperator", telephonyManager.getNetworkOperator());
            jSONObject.put("phoneType", m690c(telephonyManager.getPhoneType()));
            String simCountryIso = "";
            jSONObject.put("simOperator", telephonyManager.getSimOperator() == null ? "" : telephonyManager.getSimOperator());
            jSONObject.put("simOperatorName", telephonyManager.getSimOperatorName() == null ? "" : telephonyManager.getSimOperatorName());
            if (telephonyManager.getSimCountryIso() != null) {
                simCountryIso = telephonyManager.getSimCountryIso();
            }
            jSONObject.put("simCountryIso", simCountryIso);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m679a(Class<?> cls, Object obj, Integer num, String str, String str2) throws JSONException {
        String strTrim = "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imei", str);
        jSONObject.put("imei5", C0131y.m771c(str));
        try {
            jSONObject.put("dataState", (Integer) cls.getMethod("getDataState" + str2, Integer.TYPE).invoke(obj, num));
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("networkType", m670a(((Integer) cls.getMethod("getNetworkType" + str2, Integer.TYPE).invoke(obj, num)).intValue()));
        } catch (Throwable unused2) {
        }
        try {
            jSONObject.put("networkOperator", (String) cls.getMethod("getNetworkOperator" + str2, Integer.TYPE).invoke(obj, num));
        } catch (Throwable unused3) {
        }
        try {
            jSONObject.put("phoneType", m690c(((Integer) cls.getMethod("getPhoneType" + str2, Integer.TYPE).invoke(obj, num)).intValue()));
        } catch (Throwable unused4) {
        }
        try {
            Method method = cls.getMethod("getSimOperator" + str2, Integer.TYPE);
            jSONObject.put("simOperator", method.invoke(obj, num) == null ? "" : ((String) method.invoke(obj, num)).trim());
        } catch (Throwable unused5) {
        }
        try {
            Method method2 = cls.getMethod("getSimOperatorName" + str2, Integer.TYPE);
            if (method2.invoke(obj, num) != null) {
                strTrim = ((String) method2.invoke(obj, num)).trim();
            }
            jSONObject.put("simOperatorName", strTrim);
        } catch (Throwable unused6) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m680a(Context context) {
        try {
            f559c = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m681a(String[] strArr) throws SocketException {
        Enumeration<InetAddress> inetAddresses;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            if (!networkInterfaceNextElement.isLoopback()) {
                String lowerCase = networkInterfaceNextElement.getName().toLowerCase();
                if (!lowerCase.startsWith("wlan") && !lowerCase.startsWith("eth") && !lowerCase.startsWith("dummy") && (inetAddresses = networkInterfaceNextElement.getInetAddresses()) != null && inetAddresses.hasMoreElements()) {
                    arrayList.add(Collections.list(inetAddresses));
                }
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        Collections.sort(arrayList, new Comparator<List<InetAddress>>() { // from class: com.tendcloud.tenddata.o.1
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            public int compare(List<InetAddress> list, List<InetAddress> list2) {
                return list.size() - list2.size();
            }
        });
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            for (InetAddress inetAddress : (List) arrayList.get(size)) {
                if (!inetAddress.isLinkLocalAddress() && !inetAddress.isLoopbackAddress()) {
                    if (inetAddress instanceof Inet4Address) {
                        strArr[2] = inetAddress.getHostAddress();
                    } else if (inetAddress instanceof Inet6Address) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (!hostAddress.contains("ff:fe")) {
                            strArr[3] = hostAddress;
                        }
                    }
                }
            }
            if (strArr[2] != null || strArr[3] != null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String[] m682a() {
        String[] strArr = {null, null, null, null};
        if (C0020ab.f108R) {
            return strArr;
        }
        boolean zM700i = m700i(C0020ab.f132g);
        boolean zM701j = m701j(C0020ab.f132g);
        if (!zM700i && !zM701j) {
            C0115h.iForInternal("no-network");
            return strArr;
        }
        if (!zM700i) {
            if (zM701j) {
                m681a(strArr);
            }
            return strArr;
        }
        m686b(strArr);
        return strArr;
    }

    /* JADX INFO: renamed from: b */
    private static Boolean m683b(String str) {
        try {
            char cCharAt = str.length() > 0 ? str.charAt(0) : '0';
            Boolean bool = Boolean.TRUE;
            for (int i = 0; i < str.length(); i++) {
                if (cCharAt != str.charAt(i)) {
                    return Boolean.FALSE;
                }
            }
            return bool;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m684b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case C0020ab.b.API_TYPE_ACCOUNT /* 9 */:
            case 10:
            case 12:
            case 14:
            case 15:
            case C0020ab.b.API_TYPE_INDUSTRY /* 17 */:
                return "3G";
            case 13:
            case 18:
                return "4G";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m685b(JSONArray jSONArray, int i) {
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.optJSONObject(i2));
            }
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.o.3
                /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject.getInt("networkId") - jSONObject2.getInt("networkId");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i) {
                i = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m686b(String[] strArr) throws SocketException {
        Enumeration<InetAddress> inetAddresses;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return;
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            if (networkInterfaceNextElement.getName().toLowerCase().startsWith("wlan") && (inetAddresses = networkInterfaceNextElement.getInetAddresses()) != null) {
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (inetAddressNextElement != null && !inetAddressNextElement.isLoopbackAddress()) {
                        String hostAddress = inetAddressNextElement.getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress)) {
                            if (inetAddressNextElement instanceof Inet4Address) {
                                strArr[0] = hostAddress;
                            } else if (inetAddressNextElement instanceof Inet6Address) {
                                int iIndexOf = hostAddress.indexOf("%");
                                if (iIndexOf > 0) {
                                    hostAddress = hostAddress.substring(0, iIndexOf);
                                }
                                strArr[1] = hostAddress;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m687b() {
        try {
            return C0131y.m754a(11) ? !TextUtils.isEmpty(System.getProperty("http.proxyHost")) : !TextUtils.isEmpty(Proxy.getDefaultHost());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m688b(Context context) {
        ConnectivityManager connectivityManager;
        try {
            if (C0131y.m766b(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
                if (C0131y.m754a(29)) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                        return networkCapabilities != null && networkCapabilities.hasCapability(12);
                    }
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.isConnected();
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                    if (networkInfo == null || !networkInfo.getState().equals(NetworkInfo.State.UNKNOWN)) {
                        return false;
                    }
                }
            }
            if (SystemClock.elapsedRealtime() - f566j > f565i) {
                f566j = SystemClock.elapsedRealtime();
                Socket socket = null;
                try {
                    try {
                        socket = m687b() ? new Socket(Proxy.getDefaultHost(), Proxy.getDefaultPort()) : new Socket(f557a, 80);
                        f564h = true;
                    } catch (Throwable th) {
                        if (socket != null) {
                            try {
                                socket.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable unused2) {
                    f564h = false;
                    if (socket != null) {
                    }
                    return f564h;
                }
                socket.close();
            }
        } catch (Throwable unused3) {
        }
        return f564h;
    }

    /* JADX INFO: renamed from: c */
    private static Boolean m689c(String str) {
        try {
            Integer numValueOf = Integer.valueOf(str.length());
            if (numValueOf.intValue() > 10 && numValueOf.intValue() < 20 && !m683b(str.trim()).booleanValue()) {
                return Boolean.TRUE;
            }
        } catch (Throwable unused) {
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: c */
    private static String m690c(int i) {
        if (i >= 0) {
            String[] strArr = f562f;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: c */
    private static String m691c(String[] strArr) {
        if (strArr != null && strArr.length >= 6) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                }
                if ("lladdr".equalsIgnoreCase(strArr[i2])) {
                    i = i2 + 1;
                    break;
                }
                i2++;
            }
            if (i > 0 && i < strArr.length) {
                String str = strArr[i];
                if (str.matches("([\\da-fA-F]{2}:){5}([\\da-fA-F]{2}){1}") && !str.equals("00:00:00:00:00:00")) {
                    return str;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static Map<String, Object> m692c() {
        try {
            if (C0131y.m754a(29)) {
                return m694d();
            }
            HashMap map = new HashMap();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/net/arp")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return map;
                }
                String[] strArrSplit = line.split("[ ]+");
                if (!strArrSplit[0].matches("IP")) {
                    String str = strArrSplit[0];
                    String str2 = strArrSplit[3];
                    if (!map.containsKey(str) && !str2.equals("00:00:00:00:00:00")) {
                        map.put(str, str2);
                    }
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m693c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            if (!C0131y.m766b(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|43|3|41|4|37|5|(5:39|6|(3:8|(1:60)(3:52|14|(3:56|21|63))|57)(1:49)|24|33)|22|47|23|24|33|(1:(0))) */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Map<String, Object> m694d() {
        Process processExec;
        HashMap map;
        BufferedReader bufferedReader;
        String[] strArrSplit;
        BufferedReader bufferedReader2 = null;
        try {
            processExec = Runtime.getRuntime().exec("ip n");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                try {
                    map = new HashMap();
                } catch (Throwable unused) {
                    map = null;
                }
            } catch (Throwable unused2) {
                map = null;
            }
        } catch (Throwable unused3) {
            processExec = null;
            map = null;
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.indexOf("lladdr") > -1 && (strArrSplit = line.split(" ")) != null && strArrSplit.length > 5) {
                    String str = strArrSplit[0];
                    String strM691c = m691c(strArrSplit);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strM691c) && !map.containsKey(str)) {
                        map.put(str, strM691c);
                    }
                }
            } catch (Throwable unused4) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused5) {
                    }
                }
                if (processExec != null) {
                }
                return map;
            }
            processExec.destroy();
            return map;
        }
        processExec.waitFor();
        bufferedReader.close();
        processExec.destroy();
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m695d(Context context) {
        try {
            if (m700i(context)) {
                return true;
            }
            return ((WifiManager) context.getSystemService("wifi")).isWifiEnabled();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m696e(Context context) {
        try {
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getSimState() == 5;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m697f(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m698g(Context context) {
        try {
            return C0131y.m754a(17) ? Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m699h(Context context) {
        try {
            if (f559c == null) {
                m680a(context);
            }
            int simState = f559c.getSimState();
            return (1 == simState || simState == 0) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m700i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            if (!C0131y.m766b(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            if (C0131y.m754a(29)) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) ? false : true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && 1 == activeNetworkInfo.getType() && activeNetworkInfo.isConnected();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m701j(Context context) {
        if (context == null && (context = C0020ab.f132g) == null) {
            return false;
        }
        try {
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getDataState() == 2;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m702k(Context context) {
        return !m688b(context) ? "OFFLINE" : m700i(context) ? "WIFI" : m670a(m705n(context));
    }

    /* JADX INFO: renamed from: l */
    public static String m703l(Context context) {
        return !m688b(context) ? "offline" : m700i(context) ? "wifi" : "cellular";
    }

    /* JADX INFO: renamed from: m */
    public static String m704m(Context context) {
        return (!(context == null && (context = C0020ab.f132g) == null) && m688b(context)) ? m700i(context) ? "WIFI" : m684b(m705n(context)) : "UNKNOWN";
    }

    /* JADX INFO: renamed from: n */
    public static int m705n(Context context) {
        if (context == null) {
            try {
                context = C0020ab.f132g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        if (f559c == null) {
            m680a(context);
        }
        return f559c.getNetworkType();
    }

    /* JADX INFO: renamed from: o */
    public static String m706o(Context context) {
        try {
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getNetworkOperator();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m707p(Context context) {
        try {
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getSimOperator();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m708q(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        if (C0020ab.f107Q || !C0020ab.f110T.isWiFiEnable() || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || !C0131y.m766b(context, "android.permission.ACCESS_WIFI_STATE") || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return connectionInfo.getBSSID();
    }

    /* JADX INFO: renamed from: r */
    public static String m709r(Context context) {
        try {
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getNetworkCountryIso();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m710s(Context context) {
        try {
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getNetworkOperatorName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m711t(Context context) {
        try {
            if (f559c == null) {
                m680a(context);
            }
            return f559c.getSimOperatorName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void tryGetDoubleSimInfoReCheck(Context context) {
        try {
            if (f579w.length() <= 0 && !f580x) {
                m665D(context);
            }
        } catch (Throwable th) {
            C0115h.eForInternal(th);
        }
    }

    /* JADX INFO: renamed from: u */
    public static JSONArray m712u(Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "wifi");
            jSONObject.put("available", m695d(context));
            jSONObject.put("connected", m700i(context));
            jSONObject.put("current", m716y(context));
            jSONObject.put("scannable", m717z(context));
            jSONObject.put("configured", m715x(context));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "cellular");
            jSONObject2.put("available", m696e(context));
            jSONObject2.put("connected", m701j(context));
            jSONObject2.put("current", m672a(context, false));
            jSONObject2.put("scannable", m713v(context));
            jSONArray.put(jSONObject2);
        } catch (Throwable unused2) {
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: v */
    public static JSONArray m713v(Context context) {
        List<CellInfo> allCellInfo;
        CellSignalStrength cellSignalStrength;
        String str;
        int mnc;
        int tac;
        int pci;
        int ci;
        int mcc;
        if (!C0020ab.f110T.isLocationEnabled() || C0020ab.f106P) {
            return null;
        }
        if (context == null && (context = C0020ab.f132g) == null) {
            return null;
        }
        JSONArray jSONArray = f570n;
        if (jSONArray != null && (jSONArray.length() > 0 || f568l)) {
            return f570n;
        }
        if (!C0131y.m766b(context, "android.permission.ACCESS_COARSE_LOCATION") && !C0131y.m766b(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        }
        try {
            if (f559c == null) {
                m680a(context);
            }
            JSONArray jSONArray2 = new JSONArray();
            if (C0131y.m754a(17) && (allCellInfo = f559c.getAllCellInfo()) != null) {
                for (CellInfo cellInfo : allCellInfo) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("registered", cellInfo.isRegistered());
                        jSONObject.put("ts", cellInfo.getTimeStamp());
                        if (cellInfo instanceof CellInfoGsm) {
                            str = "GSM";
                            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
                            tac = cellIdentity.getLac();
                            pci = cellIdentity.getCid();
                            int mcc2 = cellIdentity.getMcc();
                            mnc = cellIdentity.getMnc();
                            mcc = mcc2;
                            ci = -1;
                            cellSignalStrength = cellInfoGsm.getCellSignalStrength();
                        } else if (cellInfo instanceof CellInfoCdma) {
                            str = "CDMA";
                            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                            tac = cellIdentity2.getSystemId();
                            pci = cellIdentity2.getNetworkId();
                            ci = cellIdentity2.getBasestationId();
                            CellSignalStrengthCdma cellSignalStrength2 = cellInfoCdma.getCellSignalStrength();
                            jSONObject.put("cdmaDbm", cellSignalStrength2.getCdmaDbm());
                            jSONObject.put("cdmaDbm", cellSignalStrength2.getCdmaDbm());
                            jSONObject.put("cdmaEcio", cellSignalStrength2.getCdmaEcio());
                            jSONObject.put("evdoDbm", cellSignalStrength2.getEvdoDbm());
                            jSONObject.put("evdoEcio", cellSignalStrength2.getEvdoEcio());
                            jSONObject.put("evdoSnr", cellSignalStrength2.getEvdoSnr());
                            jSONObject.put("location", m676a(cellIdentity2.getLatitude(), cellIdentity2.getLongitude()));
                            mnc = -1;
                            mcc = -1;
                            cellSignalStrength = cellSignalStrength2;
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            str = "WCDMA";
                            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                            tac = cellIdentity3.getLac();
                            pci = cellIdentity3.getCid();
                            ci = cellIdentity3.getPsc();
                            mcc = cellIdentity3.getMcc();
                            mnc = cellIdentity3.getMnc();
                            cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
                        } else if (cellInfo instanceof CellInfoLte) {
                            str = "LTE";
                            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                            CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                            tac = cellIdentity4.getTac();
                            pci = cellIdentity4.getPci();
                            ci = cellIdentity4.getCi();
                            mcc = cellIdentity4.getMcc();
                            mnc = cellIdentity4.getMnc();
                            cellSignalStrength = cellInfoLte.getCellSignalStrength();
                        } else {
                            cellSignalStrength = null;
                            str = null;
                            mnc = -1;
                            tac = -1;
                            pci = -1;
                            ci = -1;
                            mcc = -1;
                        }
                        if (tac != -1) {
                            jSONObject.put("systemId", tac);
                        }
                        if (pci != -1) {
                            jSONObject.put("networkId", pci);
                        }
                        if (ci != -1) {
                            jSONObject.put("basestationId", ci);
                        }
                        if (mcc != -1) {
                            jSONObject.put("mcc", mcc);
                        }
                        if (mnc != -1) {
                            jSONObject.put("mnc", mnc);
                        }
                        if (cellSignalStrength != null) {
                            jSONObject.put("asuLevel", cellSignalStrength.getAsuLevel());
                            jSONObject.put("dbm", cellSignalStrength.getDbm());
                        }
                        jSONObject.put("type", str);
                        jSONArray2.put(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
            f568l = true;
            JSONArray jSONArrayM675a = m675a(jSONArray2, 20);
            f570n = jSONArrayM675a;
            return jSONArrayM675a;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m714w(Context context) {
        WifiInfo connectionInfo;
        if (C0020ab.f107Q || !C0020ab.f110T.isWiFiEnable()) {
            return null;
        }
        try {
            if (!C0131y.m766b(context, "android.permission.ACCESS_WIFI_STATE")) {
                return null;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager.isWifiEnabled() && m700i(context) && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                return connectionInfo.getSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static JSONArray m715x(Context context) {
        List<WifiConfiguration> configuredNetworks;
        if (C0020ab.f107Q || !C0020ab.f110T.isWiFiEnable()) {
            return null;
        }
        JSONArray jSONArray = f575s;
        if (jSONArray != null && (jSONArray.length() > 0 || f572p)) {
            return f575s;
        }
        try {
            if (C0131y.m766b(context, "android.permission.ACCESS_WIFI_STATE") && (configuredNetworks = ((WifiManager) context.getSystemService("wifi")).getConfiguredNetworks()) != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkId", wifiConfiguration.networkId);
                        jSONObject.put("priority", wifiConfiguration.priority);
                        jSONObject.put("name", wifiConfiguration.SSID);
                        jSONObject.put("id", wifiConfiguration.BSSID);
                        jSONArray2.put(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
                f572p = true;
                JSONArray jSONArrayM685b = m685b(jSONArray2, 30);
                f575s = jSONArrayM685b;
                return jSONArrayM685b;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static JSONArray m716y(Context context) {
        WifiInfo connectionInfo;
        if (C0020ab.f107Q) {
            return null;
        }
        if (f574r.length() > 0 || f571o) {
            return f574r;
        }
        try {
            if (C0131y.m766b(context, "android.permission.ACCESS_WIFI_STATE")) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager.isWifiEnabled() && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    String strM671a = m671a("bssid");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", m671a("ssid"));
                        jSONObject.put("id", strM671a);
                        jSONObject.put("level", connectionInfo.getRssi());
                        jSONObject.put("hidden", connectionInfo.getHiddenSSID());
                        jSONObject.put("ip", connectionInfo.getIpAddress());
                        jSONObject.put("speed", connectionInfo.getLinkSpeed());
                        jSONObject.put("networkId", connectionInfo.getNetworkId());
                        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                        if (dhcpInfo != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("dns1", dhcpInfo.dns1);
                            jSONObject2.put("dns2", dhcpInfo.dns2);
                            jSONObject2.put("gw", dhcpInfo.gateway);
                            jSONObject2.put("ip", dhcpInfo.ipAddress);
                            jSONObject2.put("mask", dhcpInfo.netmask);
                            jSONObject2.put("server", dhcpInfo.serverAddress);
                            jSONObject2.put("leaseDuration", dhcpInfo.leaseDuration);
                            jSONObject.put("dhcp", jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                    f571o = true;
                    f574r.put(jSONObject);
                    return f574r;
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static synchronized JSONArray m717z(Context context) {
        if (!C0131y.f631c) {
            return null;
        }
        if (C0020ab.f107Q) {
            return null;
        }
        if (!C0020ab.f110T.isWiFiEnable()) {
            return null;
        }
        JSONArray jSONArray = f576t;
        if (jSONArray != null && (jSONArray.length() > 0 || f573q)) {
            return f576t;
        }
        try {
            if (C0131y.m766b(context, "android.permission.ACCESS_WIFI_STATE")) {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager.isWifiEnabled() || wifiManager.isScanAlwaysAvailable()) {
                    if (C0131y.m766b(context, "android.permission.CHANGE_WIFI_STATE") && !f577u) {
                        try {
                            context.registerReceiver(f578v, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                        } catch (Throwable unused) {
                        }
                        f577u = true;
                    }
                    wifiManager.startScan();
                    f578v.await();
                    List<ScanResult> scanResults = wifiManager.getScanResults();
                    f578v.reset();
                    if (scanResults != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ScanResult scanResult : scanResults) {
                            if (scanResult.level >= -85) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("id", scanResult.BSSID);
                                    jSONObject.put("name", scanResult.SSID);
                                    jSONObject.put("level", scanResult.level);
                                    jSONObject.put("freq", scanResult.frequency);
                                    if (C0131y.m754a(17)) {
                                        jSONObject.put("ts", scanResult.timestamp);
                                        jSONObject.put("scanTs", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.timestamp / 1000));
                                    }
                                    arrayList.add(jSONObject);
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        f573q = true;
                        JSONArray jSONArrayM673a = m673a(arrayList, 20);
                        f576t = jSONArrayM673a;
                        return jSONArrayM673a;
                    }
                }
            }
        } catch (Throwable unused3) {
        }
        return null;
    }
}
