package p000;

import android.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000.C0695rn;

/* JADX INFO: renamed from: hn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0289hn {

    /* JADX INFO: renamed from: A */
    private static boolean f2295A = false;

    /* JADX INFO: renamed from: B */
    private static volatile String f2296B = null;

    /* JADX INFO: renamed from: C */
    private static volatile DexKitBridge f2297C = null;

    /* JADX INFO: renamed from: D */
    public static final int f2298D;

    /* JADX INFO: renamed from: a */
    public static final C0289hn f2299a = new C0289hn();

    /* JADX INFO: renamed from: b */
    private static final u60 f2300b = new x51(new C0003a2(27));

    /* JADX INFO: renamed from: c */
    private static final String f2301c = "xp1_dexkit_cache.json";

    /* JADX INFO: renamed from: d */
    private static final u60 f2302d;

    /* JADX INFO: renamed from: e */
    private static final u60 f2303e;

    /* JADX INFO: renamed from: f */
    private static final u60 f2304f;

    /* JADX INFO: renamed from: g */
    private static final u60 f2305g;

    /* JADX INFO: renamed from: h */
    private static final u60 f2306h;

    /* JADX INFO: renamed from: i */
    private static final u60 f2307i;

    /* JADX INFO: renamed from: j */
    private static final u60 f2308j;

    /* JADX INFO: renamed from: k */
    private static final u60 f2309k;

    /* JADX INFO: renamed from: l */
    private static final u60 f2310l;

    /* JADX INFO: renamed from: m */
    private static final u60 f2311m;

    /* JADX INFO: renamed from: n */
    private static final u60 f2312n;

    /* JADX INFO: renamed from: o */
    private static final u60 f2313o;

    /* JADX INFO: renamed from: p */
    private static final u60 f2314p;

    /* JADX INFO: renamed from: q */
    private static final u60 f2315q;

    /* JADX INFO: renamed from: r */
    private static final u60 f2316r;

    /* JADX INFO: renamed from: s */
    private static final String f2317s = "xp1_dexkit_salt_2024";

    /* JADX INFO: renamed from: t */
    private static volatile C0695rn.a f2318t;

    /* JADX INFO: renamed from: u */
    private static int f2319u;

    /* JADX INFO: renamed from: v */
    private static long f2320v;

    /* JADX INFO: renamed from: w */
    private static String f2321w;

    /* JADX INFO: renamed from: x */
    private static String f2322x;

    /* JADX INFO: renamed from: y */
    private static volatile boolean f2323y;

    /* JADX INFO: renamed from: z */
    private static volatile long f2324z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            System.loadLibrary("dexkit");
        } catch (Exception e) {
            lb0.f3404a.m2015b(f2299a.m1382P(), e);
        }
        f2302d = new x51(new C0252gn(10));
        f2303e = new x51(new C0252gn(11));
        f2304f = new x51(new C0252gn(12));
        f2305g = new x51(new C0003a2(28));
        f2306h = new x51(new C0003a2(29));
        f2307i = new x51(new C0252gn(0));
        f2308j = new x51(new C0252gn(1));
        f2309k = new x51(new C0252gn(2));
        f2310l = new x51(new C0252gn(3));
        f2311m = new x51(new C0252gn(4));
        f2312n = new x51(new C0252gn(5));
        f2313o = new x51(new C0252gn(6));
        f2314p = new x51(new C0252gn(7));
        f2315q = new x51(new C0252gn(8));
        f2316r = new x51(new C0252gn(9));
        f2319u = -1;
        f2320v = -1L;
        f2321w = "";
        f2322x = "";
        f2298D = 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0289hn() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final String m1373A() {
        return "longPressDialog";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m1374B() {
        return "menuBuilder";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final String m1375C() {
        return "module_version_code";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m1376D() {
        return "noteDetailActivity";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m1377E() {
        return "pzu";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m1378F() {
        return "videoNoteController";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final String m1379H(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        bArrDecode.getClass();
        return new String(m1411j0(bArrDecode), AbstractC0959yd.f7611a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final String m1380I(String str) {
        byte[] bytes = str.getBytes(AbstractC0959yd.f7611a);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(m1411j0(bytes), 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    private final String m1382P() {
        return (String) f2300b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    private final String m1383Q() {
        return (String) f2313o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    private final String m1384R() {
        return (String) f2312n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    private final String m1385S() {
        return (String) f2303e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    private final String m1386T() {
        return (String) f2304f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final String m1387U() {
        return (String) f2306h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final String m1388V() {
        return (String) f2308j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final String m1389W() {
        return (String) f2314p.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    private final String m1390X() {
        return (String) f2315q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    private final String m1391Y() {
        return (String) f2316r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    private final String m1392Z() {
        return (String) f2307i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    private final String m1394a0() {
        return (String) f2310l.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    private final String m1396b0() {
        return (String) f2302d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    private final String m1398c0() {
        return (String) f2305g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    private final String m1400d0() {
        return (String) f2311m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    private final String m1402e0() {
        return (String) f2309k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    private final Class<?> m1405g0(String str, ClassLoader classLoader) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return classLoader.loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    private final C0695rn.a m1407h0(File file, long j, String str, int i, String str2, ClassLoader classLoader) {
        try {
        } catch (Exception unused) {
            file.delete();
        }
        if (!file.exists()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(m1379H(AbstractC0627pt.m3156c0(file)));
        if (jSONObject.optInt(m1396b0(), 0) != i) {
            file.delete();
            return null;
        }
        if (jSONObject.optLong(m1385S(), 0L) != j) {
            file.delete();
            return null;
        }
        if (!p30.m3002l(jSONObject.optString(m1386T(), ""), str)) {
            file.delete();
            return null;
        }
        String strOptString = jSONObject.optString(m1383Q(), "");
        strOptString.getClass();
        if (strOptString.length() > 0 && str2.length() > 0 && !strOptString.equals(str2)) {
            file.delete();
            return null;
        }
        String strOptString2 = jSONObject.optString(m1398c0(), "");
        if (strOptString2.length() == 0) {
            strOptString2 = null;
        }
        String strOptString3 = jSONObject.optString(m1387U(), "");
        if (strOptString3.length() == 0) {
            strOptString3 = null;
        }
        String strOptString4 = jSONObject.optString(m1392Z(), "");
        if (strOptString4.length() == 0) {
            strOptString4 = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(m1388V());
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArrayOptJSONArray.getString(i2);
                string.getClass();
                arrayList.add(string);
            }
        }
        String strOptString5 = jSONObject.optString(m1402e0(), "");
        if (strOptString5.length() == 0) {
            strOptString5 = null;
        }
        String strOptString6 = jSONObject.optString(m1394a0(), "");
        if (strOptString6.length() == 0) {
            strOptString6 = null;
        }
        String strOptString7 = jSONObject.optString(m1400d0(), "");
        if (strOptString7.length() == 0) {
            strOptString7 = null;
        }
        String strOptString8 = jSONObject.optString(m1384R(), "");
        if (strOptString8.length() == 0) {
            strOptString8 = null;
        }
        String strOptString9 = jSONObject.optString(m1390X(), "");
        if (strOptString9.length() == 0) {
            strOptString9 = null;
        }
        String strOptString10 = jSONObject.optString(m1391Y(), "");
        String str3 = strOptString10.length() == 0 ? null : strOptString10;
        Class<?> clsM1405g0 = m1405g0(strOptString2, classLoader);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class<?> clsM1405g02 = f2299a.m1405g0((String) it.next(), classLoader);
            if (clsM1405g02 != null) {
                arrayList2.add(clsM1405g02);
            }
        }
        C0695rn.a aVar = new C0695rn.a(clsM1405g0, arrayList2, m1405g0(strOptString4, classLoader), m1405g0(strOptString3, classLoader), m1405g0(strOptString5, classLoader), m1405g0(strOptString6, classLoader), m1405g0(strOptString7, classLoader), m1405g0(strOptString8, classLoader), null, null, null, null, null, null, m1405g0(strOptString9, classLoader), str3, null, null, null, null, null, null, 4144896, null);
        if (aVar.m3920B() >= aVar.m3939U()) {
            return aVar;
        }
        file.delete();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    private final void m1409i0(File file, long j, String str, int i, String str2, C0695rn.a aVar) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = aVar.m3924F().iterator();
            while (it.hasNext()) {
                jSONArray.put(((Class) it.next()).getName());
            }
            JSONObject jSONObject = new JSONObject();
            C0289hn c0289hn = f2299a;
            jSONObject.put(c0289hn.m1396b0(), i);
            jSONObject.put(c0289hn.m1385S(), j);
            jSONObject.put(c0289hn.m1386T(), str);
            if (str2.length() > 0) {
                jSONObject.put(c0289hn.m1383Q(), str2);
            }
            String strM1398c0 = c0289hn.m1398c0();
            Class<?> clsM3929K = aVar.m3929K();
            String str3 = "";
            jSONObject.put(strM1398c0, clsM3929K != null ? clsM3929K.getName() : "");
            String strM1387U = c0289hn.m1387U();
            Class<?> clsM3923E = aVar.m3923E();
            jSONObject.put(strM1387U, clsM3923E != null ? clsM3923E.getName() : "");
            String strM1392Z = c0289hn.m1392Z();
            Class<?> clsM3927I = aVar.m3927I();
            jSONObject.put(strM1392Z, clsM3927I != null ? clsM3927I.getName() : "");
            jSONObject.put(c0289hn.m1388V(), jSONArray);
            String strM1402e0 = c0289hn.m1402e0();
            Class<?> clsM3940V = aVar.m3940V();
            jSONObject.put(strM1402e0, clsM3940V != null ? clsM3940V.getName() : "");
            String strM1394a0 = c0289hn.m1394a0();
            Class<?> clsM3928J = aVar.m3928J();
            jSONObject.put(strM1394a0, clsM3928J != null ? clsM3928J.getName() : "");
            String strM1400d0 = c0289hn.m1400d0();
            Class<?> clsM3931M = aVar.m3931M();
            jSONObject.put(strM1400d0, clsM3931M != null ? clsM3931M.getName() : "");
            String strM1384R = c0289hn.m1384R();
            Class<?> clsM3921C = aVar.m3921C();
            jSONObject.put(strM1384R, clsM3921C != null ? clsM3921C.getName() : "");
            String strM1390X = c0289hn.m1390X();
            Class<?> clsM3925G = aVar.m3925G();
            jSONObject.put(strM1390X, clsM3925G != null ? clsM3925G.getName() : "");
            String strM1391Y = c0289hn.m1391Y();
            String strM3926H = aVar.m3926H();
            if (strM3926H != null) {
                str3 = strM3926H;
            }
            jSONObject.put(strM1391Y, str3);
            String string = jSONObject.toString();
            string.getClass();
            AbstractC0627pt.m3157d0(m1380I(string), file);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    private final byte[] m1411j0(byte[] bArr) {
        byte[] bytes = f2317s.getBytes(AbstractC0959yd.f7611a);
        bytes.getClass();
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ bytes[i % bytes.length]);
        }
        return bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m1418q() {
        return "DK";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m1419r() {
        return "gmsaol";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final String m1420s() {
        return "homeNavigationView";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m1421t() {
        return "host_version_code";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final String m1422u() {
        return "host_version_name";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final String m1423v() {
        return "imageBean";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final String m1424w() {
        return "imageLongClickHandlers";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final String m1425x() {
        return "~mutxig";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final String m1426y() {
        return "leftEntranceConfigClass";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final String m1427z() {
        return "leftEntranceConfigMethod";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m1428G() {
        String str = f2296B;
        if (str != null) {
            try {
                new File(str.concat("/files/xp1_dexkit_cache.json")).delete();
            } catch (Exception unused) {
            }
            try {
                new File(str.concat("/files/xp1_scan_suppress")).delete();
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final DexKitBridge m1429J() {
        return f2297C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final C0695rn.a m1430K() {
        return f2318t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final boolean m1431L() {
        return f2323y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final synchronized C0695rn.a m1432M(String str, String str2, ClassLoader classLoader, long j, String str3, int i, String str4) {
        C0695rn.a aVar;
        str.getClass();
        str2.getClass();
        classLoader.getClass();
        str3.getClass();
        str4.getClass();
        C0695rn.a aVar2 = f2318t;
        if (aVar2 != null && f2319u == i && f2320v == j && p30.m3002l(f2321w, str3) && p30.m3002l(f2322x, str4)) {
            return aVar2;
        }
        f2296B = str2;
        if (f2295A) {
            return new C0695rn.a(null, C0294hs.f2354d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 3932160, null);
        }
        File file = new File(str2.concat("/files/xp1_dexkit_cache.json"));
        C0695rn.a aVarM1407h0 = m1407h0(file, j, str3, i, str4, classLoader);
        if (aVarM1407h0 != null) {
            f2318t = aVarM1407h0;
            f2319u = i;
            f2320v = j;
            f2321w = str3;
            f2322x = str4;
            f2323y = false;
            return aVarM1407h0;
        }
        f2295A = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            DexKitBridge dexKitBridgeCreate = f2297C;
            if (dexKitBridgeCreate == null) {
                dexKitBridgeCreate = DexKitBridge.Companion.create(str);
                f2297C = dexKitBridgeCreate;
            }
            try {
                aVar = C0695rn.f5457a.m3915Y2(dexKitBridgeCreate, classLoader);
            } catch (Throwable th) {
                lb0.f3404a.m2014a(m1382P(), "scan ".concat(th.getClass().getSimpleName()));
                aVar = new C0695rn.a(null, C0294hs.f2354d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 3932160, null);
            }
            f2324z = System.currentTimeMillis() - jCurrentTimeMillis;
            m1409i0(file, j, str3, i, str4, aVar);
            f2318t = aVar;
            f2319u = i;
            f2320v = j;
            f2321w = str3;
            f2322x = str4;
            f2323y = true;
            return aVar;
        } finally {
            f2295A = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final long m1433O() {
        return f2324z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final boolean m1434f0() {
        return f2295A;
    }
}
