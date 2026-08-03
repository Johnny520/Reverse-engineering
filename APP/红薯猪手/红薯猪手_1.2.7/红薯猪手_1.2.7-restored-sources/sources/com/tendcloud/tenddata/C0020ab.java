package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ab */
/* JADX INFO: loaded from: classes.dex */
public class C0020ab {

    /* JADX INFO: renamed from: A */
    public static final String f91A = "TD_sdk_last_send_time_wifi";

    /* JADX INFO: renamed from: B */
    public static final String f92B = "TD_sdk_last_send_time_mobile_data";

    /* JADX INFO: renamed from: C */
    public static final String f93C = "TD_sdk_last_send_url";

    /* JADX INFO: renamed from: D */
    public static final String f94D = "TD_sdk_last_send_host";

    /* JADX INFO: renamed from: E */
    public static final String f95E = "isDeveloper";

    /* JADX INFO: renamed from: K */
    public static final int f101K = 104857600;

    /* JADX INFO: renamed from: M */
    public static final String f103M = "All";

    /* JADX INFO: renamed from: O */
    public static final String f105O = "v1.0.0";

    /* JADX INFO: renamed from: U */
    public static final String f111U = "Android+TD+V5.0.28 gp";

    /* JADX INFO: renamed from: V */
    public static long f112V = 0;

    /* JADX INFO: renamed from: Y */
    public static final int f115Y = 1800000;

    /* JADX INFO: renamed from: a */
    public static final boolean f117a = false;

    /* JADX INFO: renamed from: aa */
    public static final long f118aa = 30000;

    /* JADX INFO: renamed from: ab */
    public static final int f119ab = 100;

    /* JADX INFO: renamed from: ac */
    public static final String f120ac = "TD_APP_ID";

    /* JADX INFO: renamed from: ad */
    public static final String f121ad = "TD_CHANNEL_ID";

    /* JADX INFO: renamed from: af */
    private static final String f123af = "+V";

    /* JADX INFO: renamed from: ag */
    private static final int f124ag = 120;

    /* JADX INFO: renamed from: ah */
    private static final int f125ah = 30;

    /* JADX INFO: renamed from: ai */
    private static final int f126ai = 1000;

    /* JADX INFO: renamed from: b */
    public static boolean f127b = false;

    /* JADX INFO: renamed from: i */
    public static final int f134i = 1;

    /* JADX INFO: renamed from: j */
    public static final String f135j = "Android+";

    /* JADX INFO: renamed from: k */
    public static FileChannel f136k = null;

    /* JADX INFO: renamed from: r */
    public static String f143r = null;

    /* JADX INFO: renamed from: s */
    public static final String f144s = "TD";

    /* JADX INFO: renamed from: t */
    public static final String f145t = "TDLog";

    /* JADX INFO: renamed from: v */
    public static final String f147v = "2606";

    /* JADX INFO: renamed from: w */
    public static final String f148w = "TD_app_pefercen_profile";

    /* JADX INFO: renamed from: x */
    public static final String f149x = "TD_appId_";

    /* JADX INFO: renamed from: y */
    public static final String f150y = "TD_channelId";

    /* JADX INFO: renamed from: z */
    public static final String f151z = "TD_init_custom";

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f128c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final Map<String, Object> f129d = new TreeMap();

    /* JADX INFO: renamed from: e */
    public static boolean f130e = false;

    /* JADX INFO: renamed from: f */
    public static long f131f = 0;

    /* JADX INFO: renamed from: g */
    public static Context f132g = null;

    /* JADX INFO: renamed from: h */
    public static Handler f133h = null;

    /* JADX INFO: renamed from: l */
    public static long f137l = 0;

    /* JADX INFO: renamed from: m */
    public static boolean f138m = false;

    /* JADX INFO: renamed from: n */
    public static int f139n = -1;

    /* JADX INFO: renamed from: o */
    public static boolean f140o = true;

    /* JADX INFO: renamed from: p */
    public static boolean f141p = true;

    /* JADX INFO: renamed from: q */
    public static long f142q = 5000;

    /* JADX INFO: renamed from: u */
    public static TalkingDataSharingFilter f146u = TalkingDataSharingFilter.SHARE;

    /* JADX INFO: renamed from: ae */
    private static HashMap<String, Object> f122ae = new HashMap<>();

    /* JADX INFO: renamed from: F */
    public static String f96F = "Default";

    /* JADX INFO: renamed from: G */
    public static String f97G = "";

    /* JADX INFO: renamed from: H */
    public static boolean f98H = false;

    /* JADX INFO: renamed from: I */
    public static String f99I = null;

    /* JADX INFO: renamed from: J */
    public static boolean f100J = false;

    /* JADX INFO: renamed from: L */
    public static final String f102L = "WiFi";

    /* JADX INFO: renamed from: N */
    public static String f104N = f102L;

    /* JADX INFO: renamed from: P */
    public static boolean f106P = false;

    /* JADX INFO: renamed from: Q */
    public static boolean f107Q = false;

    /* JADX INFO: renamed from: R */
    public static boolean f108R = false;

    /* JADX INFO: renamed from: S */
    public static boolean f109S = false;

    /* JADX INFO: renamed from: T */
    public static TalkingDataSDKConfig f110T = new TalkingDataSDKConfig();

    /* JADX INFO: renamed from: W */
    public static int f113W = 2;

    /* JADX INFO: renamed from: X */
    public static AtomicInteger f114X = new AtomicInteger(0);

    /* JADX INFO: renamed from: Z */
    public static final AtomicBoolean f116Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ab$a */
    public class a {
        public static final int DST_FILE = 2;
        public static final int DST_SQLITE = 1;

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ab$b */
    public static class b {
        public static final int API_MYNA_INIT = 90;
        public static final int API_MYNA_START = 91;
        public static final int API_MYNA_STOP = 92;
        public static final int API_ON_ERROR = 3;
        public static final int API_ON_EVENT = 2;
        public static final int API_ON_INIT = 1;
        public static final int API_ON_PAGE_END = 5;
        public static final int API_ON_PAGE_START = 4;
        public static final int API_TYPE_ACCOUNT = 9;
        public static final int API_TYPE_BRAND_GROWTH = 16;
        public static final int API_TYPE_CUST_LOCATION = 14;
        public static final int API_TYPE_GAME = 6;
        public static final int API_TYPE_GAME_SESSION_END = 15;
        public static final int API_TYPE_GAME_SESSION_START = 12;
        public static final int API_TYPE_IAP = 8;
        public static final int API_TYPE_INDUSTRY = 17;
        public static final int API_TYPE_SESSION_END = 11;
        public static final int API_TYPE_SESSION_PAUSE = 13;
        public static final int API_TYPE_SESSION_START = 10;
        public static final int API_TYPE_TRACKING = 7;
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ab$c */
    public class c {
        public static final int SDT_JSON = 2;
        public static final int SDT_MP = 1;
        public static final int SDT_PB = 3;
        public static final int SDT_UNKNOWN = -1;

        public c() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m12a(Context context, AbstractC0018a abstractC0018a) {
        if (context == null || abstractC0018a == null) {
            C0115h.dForInternal("Context or Service is null");
            return "";
        }
        String str = (String) f122ae.get(abstractC0018a.name());
        if (!C0131y.m767b(str)) {
            return str;
        }
        StringBuilder sbM1039 = C0167c4.m1039(f149x);
        sbM1039.append(abstractC0018a.name());
        return C0125s.m728b(context, f148w, sbM1039.toString(), "");
    }

    /* JADX INFO: renamed from: a */
    private static void m13a(int i) {
        String str;
        try {
            C0098cz c0098cz = new C0098cz();
            switch (i) {
                case 1:
                    str = "Cocos2d";
                    break;
                case 2:
                    str = "Unity";
                    break;
                case 3:
                    str = "AIR";
                    break;
                case 4:
                    str = "PhoneGap";
                    break;
                case 5:
                    str = "APICloud";
                    break;
                case 6:
                    str = "Hybrid";
                    break;
                case 7:
                    str = "ReactNative";
                    break;
                case 8:
                    str = "Flutter";
                    break;
                default:
                    str = "Native";
                    break;
            }
            c0098cz.setFrameWork(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15a(String str, String str2, AbstractC0018a abstractC0018a) {
        if (f132g != null) {
            f133h = new Handler(f132g.getMainLooper());
        }
        f131f = System.currentTimeMillis();
        if (str != null && !str.trim().isEmpty() && str.contains("-")) {
            try {
                str = str.split("-")[1];
            } catch (Throwable unused) {
                str = null;
            }
        }
        if (str2 != null && !str2.trim().isEmpty()) {
            f96F = str2;
        }
        m14a(str, abstractC0018a);
        m20b(f96F, abstractC0018a);
        C0095cw.m468a().m471a((Object) str, abstractC0018a);
        C0095cw.m468a().m472b(f96F, abstractC0018a);
        m13a(C0111dz.f488a);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m16a(Context context) {
        try {
            return C0114g.m517a().m522d(context) == C0114g.m517a().m523e(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17a(AbstractC0018a abstractC0018a) {
        Context context;
        try {
            context = f132g;
        } catch (Throwable unused) {
        }
        if (context == null || abstractC0018a == null) {
            return false;
        }
        if (m16a(context)) {
            return C0116i.m552e(abstractC0018a) == 1;
        }
        if (C0116i.m552e(abstractC0018a) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C0116i.m549d(abstractC0018a) > f142q * 4) {
                C0116i.m537a(false, abstractC0018a);
            } else {
                if (jCurrentTimeMillis - C0116i.m551e() <= f142q * 4) {
                    return m27d(f132g, abstractC0018a);
                }
                if (m26c(abstractC0018a) || m29e(abstractC0018a) || m28d(abstractC0018a) || m22b(abstractC0018a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m18a() {
        return new int[]{120000, 30000};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m19b(Context context, AbstractC0018a abstractC0018a) {
        if (C0131y.m767b(f96F) || f96F.equals("Default")) {
            StringBuilder sbM1039 = C0167c4.m1039(f150y);
            sbM1039.append(abstractC0018a.name());
            f96F = C0125s.m728b(context, f148w, sbM1039.toString(), "Default");
        }
        return f96F;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21b() {
        try {
            return C0125s.m727b(f132g, f148w, f95E, 0L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m22b(AbstractC0018a abstractC0018a) {
        if (f132g == null || !abstractC0018a.name().equals("SDK")) {
            return false;
        }
        File filesDir = f132g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database0SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, "td_database3SaaS");
            File file4 = new File(filesDir, C0019aa.f87r);
            File file5 = new File(file4, "td_database0SaaS");
            File file6 = new File(file4, "td_database1SaaS");
            File file7 = new File(file4, "td_database3SaaS");
            if ((!file3.exists() && !file7.exists()) || file2.exists() || file6.exists() || file.exists()) {
                return false;
            }
            return !file5.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m23c() {
        try {
            return new C0098cz().m476a();
        } catch (Throwable unused) {
            return "Native";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m24c(Context context, AbstractC0018a abstractC0018a) {
        try {
            if (C0131y.m767b(f97G)) {
                f97G = C0125s.m728b(context, f148w, f151z + abstractC0018a.name(), "");
            }
        } catch (Throwable unused) {
        }
        return f97G;
    }

    /* JADX INFO: renamed from: c */
    public static void m25c(String str, AbstractC0018a abstractC0018a) {
        try {
            C0125s.m726a(f132g, f148w, f151z + abstractC0018a.name(), str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m26c(AbstractC0018a abstractC0018a) {
        if (f132g == null || !abstractC0018a.name().equals("TRACKING")) {
            return false;
        }
        File filesDir = f132g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database3SaaS");
            File file2 = new File(filesDir, "td_database0SaaS");
            File file3 = new File(filesDir, C0019aa.f87r);
            File file4 = new File(file3, "td_database3SaaS");
            File file5 = new File(file3, "td_database0SaaS");
            if (!file.exists() && !file2.exists() && !file4.exists()) {
                if (!file5.exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m27d(Context context, AbstractC0018a abstractC0018a) {
        try {
            if (f132g == null) {
                return true;
            }
            if ((!abstractC0018a.name().equals("TRACKING") && !abstractC0018a.name().equals("SDK")) || !context.getSharedPreferences("talkingdata_file_prefence", 0).getBoolean("actived", false)) {
                return true;
            }
            C0116i.m537a(false, abstractC0018a);
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m28d(AbstractC0018a abstractC0018a) {
        if (f132g == null || !abstractC0018a.name().equals("APP")) {
            return false;
        }
        File filesDir = f132g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database3SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, C0019aa.f87r);
            File file4 = new File(file3, "td_database3SaaS");
            File file5 = new File(file3, "td_database1SaaS");
            if (!file.exists() && !file2.exists() && !file4.exists()) {
                if (!file5.exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m29e(AbstractC0018a abstractC0018a) {
        if (f132g == null || !abstractC0018a.name().equals("GAME")) {
            return false;
        }
        File filesDir = f132g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database0SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, C0019aa.f87r);
            File file4 = new File(file3, "td_database0SaaS");
            File file5 = new File(file3, "td_database1SaaS");
            if (!file2.exists() && !file.exists() && !file5.exists()) {
                if (!file4.exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setCofig(TalkingDataSDKConfig talkingDataSDKConfig) {
        if (talkingDataSDKConfig != null) {
            f110T = talkingDataSDKConfig;
        }
    }

    public static void setConfigurationDisable(int i) {
        try {
            f106P = (i & 1) != 0;
            f107Q = (i & 2) != 0;
            f108R = (i & 4) != 0;
            f109S = (i & 8) != 0;
        } catch (Throwable unused) {
        }
    }

    public static void setDeveloperMode(boolean z) {
        try {
            C0125s.m725a(f132g, f148w, f95E, z ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14a(String str, AbstractC0018a abstractC0018a) {
        if (abstractC0018a != null) {
            f122ae.put(abstractC0018a.name(), str);
            Context context = f132g;
            StringBuilder sbM1039 = C0167c4.m1039(f149x);
            sbM1039.append(abstractC0018a.name());
            C0125s.m726a(context, f148w, sbM1039.toString(), str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20b(String str, AbstractC0018a abstractC0018a) {
        Context context = f132g;
        StringBuilder sbM1039 = C0167c4.m1039(f150y);
        sbM1039.append(abstractC0018a.name());
        C0125s.m726a(context, f148w, sbM1039.toString(), str);
    }
}
