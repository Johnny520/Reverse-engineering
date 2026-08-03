package p000a;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0186K3;

/* JADX INFO: renamed from: a.n6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0723n6 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f2804a;

    /* JADX INFO: renamed from: b */
    public static volatile int f2805b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f2806c;

    /* JADX INFO: renamed from: d */
    public static volatile String f2807d;

    /* JADX INFO: renamed from: e */
    public static volatile ArrayList f2808e;

    /* JADX INFO: renamed from: f */
    public static volatile Boolean f2809f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f2810g;

    /* JADX INFO: renamed from: h */
    public static volatile int f2811h;

    /* JADX INFO: renamed from: i */
    public static volatile int f2812i;

    /* JADX INFO: renamed from: j */
    public static volatile int f2813j;

    /* JADX INFO: renamed from: k */
    public static volatile String f2814k;

    /* JADX INFO: renamed from: l */
    public static volatile int f2815l;

    /* JADX INFO: renamed from: m */
    public static volatile boolean f2816m;

    /* JADX INFO: renamed from: n */
    public static volatile boolean f2817n;

    /* JADX INFO: renamed from: p */
    public static volatile String f2819p;

    /* JADX INFO: renamed from: q */
    public static volatile boolean f2820q;

    /* JADX INFO: renamed from: o */
    public static volatile LinkedHashMap f2818o = new LinkedHashMap();

    /* JADX INFO: renamed from: r */
    public static final LinkedHashMap<String, b> f2821r = new LinkedHashMap<>();

    /* JADX INFO: renamed from: s */
    public static volatile LinkedHashMap f2822s = new LinkedHashMap();

    /* JADX INFO: renamed from: a.n6$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f2823a;

        /* JADX INFO: renamed from: b */
        public final boolean f2824b;

        /* JADX INFO: renamed from: c */
        public final boolean f2825c;

        /* JADX INFO: renamed from: d */
        public final boolean f2826d;

        public a(String str, boolean z, boolean z2, boolean z3) {
            this.f2823a = str;
            this.f2824b = z;
            this.f2825c = z2;
            this.f2826d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C0631i9.m1478a(this.f2823a, aVar.f2823a) && this.f2824b == aVar.f2824b && this.f2825c == aVar.f2825c && this.f2826d == aVar.f2826d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f2826d) + ((Boolean.hashCode(this.f2825c) + ((Boolean.hashCode(this.f2824b) + (this.f2823a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "LayerStatus(name=" + this.f2823a + ", classExists=" + this.f2824b + ", hooked=" + this.f2825c + ", blocked=" + this.f2826d + ")";
        }
    }

    /* JADX INFO: renamed from: a.n6$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f2827a;

        /* JADX INFO: renamed from: b */
        public final long f2828b;

        /* JADX INFO: renamed from: c */
        public final String f2829c;

        public b(String str, long j, String str2) {
            this.f2827a = str;
            this.f2828b = j;
            this.f2829c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C0631i9.m1478a(this.f2827a, bVar.f2827a) && this.f2828b == bVar.f2828b && C0631i9.m1478a(this.f2829c, bVar.f2829c);
        }

        public final int hashCode() {
            int iHashCode = (Long.hashCode(this.f2828b) + (this.f2827a.hashCode() * 31)) * 31;
            String str = this.f2829c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "PartResult(status=" + this.f2827a + ", durationMs=" + this.f2828b + ", error=" + this.f2829c + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1653a(Context context) {
        int i;
        Map mapM1232H;
        int i2;
        int i3;
        Map mapM1232H2;
        int i4;
        int i5;
        int i6;
        Map mapM1232H3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C0908x1.m2194b("[DIAG-HEALTH] ===============================");
        C0908x1.m2194b("[DIAG-HEALTH] Feature Health Report START");
        C0908x1.m2194b("[DIAG-HEALTH] ===============================");
        int length = 0;
        if (C0601gh.f2228b.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = C0601gh.m1439a().iterator();
            i = 0;
            while (it.hasNext()) {
                File[] fileArrListFiles = ((File) it.next()).listFiles();
                if (fileArrListFiles != null) {
                    i11 = 0;
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        C0631i9.m1481d(name, "getName(...)");
                        if (C0601gh.m1441c(name)) {
                            i11++;
                        }
                    }
                } else {
                    i11 = 0;
                }
                i += i11;
            }
        }
        C0908x1.m2194b("[DIAG-HEALTH] module=TinkerFix status=" + (f2807d != null ? "FAIL" : i > 0 ? "WARN" : "OK") + " hadPatch=" + f2804a + " deleted=" + f2805b + " blockEnabled=" + f2806c + " remainingPatches=" + i + " error=" + f2807d);
        ArrayList<a> arrayList = f2808e;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                i9 = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                i9 = 0;
                while (it2.hasNext()) {
                    if (((a) it2.next()).f2825c && (i9 = i9 + 1) < 0) {
                        C0739o3.m1759f0();
                        throw null;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (a aVar : arrayList) {
                    if (aVar.f2824b && !aVar.f2825c && (i10 = i10 + 1) < 0) {
                        C0739o3.m1759f0();
                        throw null;
                    }
                }
            }
            C0908x1.m2194b("[DIAG-HEALTH] module=TinkerFixLayers(healthCheck) status=" + (i10 > 0 ? "WARN" : "OK") + " ok=" + i9 + " fail=" + i10);
        }
        Boolean bool = f2809f;
        if (bool != null) {
            C0908x1.m2194b("[DIAG-HEALTH] module=TinkerFixTiming(healthCheck) status=".concat(bool.booleanValue() ? "OK" : "FAIL"));
        }
        String str = "WARN";
        if (f2810g && f2812i <= 0) {
            str = "OK";
        }
        C0908x1.m2194b("[DIAG-HEALTH] module=RCR status=" + str + " ready=" + f2810g + " total=" + f2813j + " cached=" + f2811h + " fallback=" + f2812i + " diag=" + f2814k);
        int i12 = f2815l;
        boolean z = f2816m;
        StringBuilder sb = new StringBuilder("[DIAG-HEALTH] module=DexKitCache selfKeys=");
        sb.append(i12);
        sb.append(" inkKeys=0 ready=");
        sb.append(z);
        C0908x1.m2194b(sb.toString());
        synchronized (f2818o) {
            mapM1232H = C0499ba.m1232H(f2818o);
        }
        Collection collectionValues = mapM1232H.values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            Iterator it3 = collectionValues.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (C0631i9.m1478a((String) it3.next(), "OK") && (i2 = i2 + 1) < 0) {
                    C0739o3.m1759f0();
                    throw null;
                }
            }
        } else {
            i2 = 0;
        }
        Collection collectionValues2 = mapM1232H.values();
        if (collectionValues2 == null || !collectionValues2.isEmpty()) {
            Iterator it4 = collectionValues2.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if (C0631i9.m1478a((String) it4.next(), "FAIL") && (i3 = i3 + 1) < 0) {
                    C0739o3.m1759f0();
                    throw null;
                }
            }
        } else {
            i3 = 0;
        }
        C0908x1.m2194b("[DIAG-HEALTH] module=DexKitScan status=" + (!f2817n ? "PENDING" : i3 > 0 ? "WARN" : i2 == 0 ? "FAIL" : "OK") + " completed=" + f2817n + " tasksTotal=" + mapM1232H.size() + " ok=" + i2 + " fail=" + i3 + " error=" + f2819p + " details=" + C0834t3.m1952p0(mapM1232H.entrySet(), ",", new C0586g2(16), 30));
        LinkedHashMap<String, b> linkedHashMap = f2821r;
        synchronized (linkedHashMap) {
            mapM1232H2 = C0499ba.m1232H(linkedHashMap);
        }
        Collection collectionValues3 = mapM1232H2.values();
        if (collectionValues3 == null || !collectionValues3.isEmpty()) {
            Iterator it5 = collectionValues3.iterator();
            i4 = 0;
            while (it5.hasNext()) {
                if (((b) it5.next()).f2827a.equals("OK") && (i4 = i4 + 1) < 0) {
                    C0739o3.m1759f0();
                    throw null;
                }
            }
        } else {
            i4 = 0;
        }
        Collection collectionValues4 = mapM1232H2.values();
        if (collectionValues4 == null || !collectionValues4.isEmpty()) {
            Iterator it6 = collectionValues4.iterator();
            i5 = 0;
            while (it6.hasNext()) {
                if (((b) it6.next()).f2827a.equals("FAIL") && (i5 = i5 + 1) < 0) {
                    C0739o3.m1759f0();
                    throw null;
                }
            }
        } else {
            i5 = 0;
        }
        Collection collectionValues5 = mapM1232H2.values();
        if (collectionValues5 == null || !collectionValues5.isEmpty()) {
            Iterator it7 = collectionValues5.iterator();
            i6 = 0;
            while (it7.hasNext()) {
                if (((b) it7.next()).f2827a.equals("TIMEOUT") && (i6 = i6 + 1) < 0) {
                    C0739o3.m1759f0();
                    throw null;
                }
            }
        } else {
            i6 = 0;
        }
        String str2 = !f2820q ? "PENDING" : i5 > 0 ? "FAIL" : (i6 <= 0 && i4 == mapM1232H2.size()) ? "OK" : "WARN";
        String strM1952p0 = C0834t3.m1952p0(mapM1232H2.entrySet(), ";", new C0586g2(17), 30);
        int size = mapM1232H2.size();
        boolean z2 = f2820q;
        String strM143X = C0053Ce.m143X(strM1952p0, 200);
        StringBuilder sb2 = new StringBuilder("[DIAG-HEALTH] module=PartsInit status=");
        sb2.append(str2);
        sb2.append(" total=");
        sb2.append(size);
        sb2.append(" ok=");
        sb2.append(i4);
        sb2.append(" fail=");
        sb2.append(i5);
        sb2.append(" timeout=");
        sb2.append(i6);
        sb2.append(" complete=");
        sb2.append(z2);
        sb2.append(" [");
        C0908x1.m2194b(C0944z.m2228h(sb2, strM143X, "]"));
        synchronized (f2822s) {
            mapM1232H3 = C0499ba.m1232H(f2822s);
        }
        if (mapM1232H3.isEmpty()) {
            i7 = 0;
        } else {
            Iterator it8 = mapM1232H3.entrySet().iterator();
            i7 = 0;
            while (it8.hasNext()) {
                if (C0015Ae.m49H((String) ((Map.Entry) it8.next()).getValue(), "FOUND", false)) {
                    i7++;
                }
            }
        }
        if (mapM1232H3.isEmpty()) {
            i8 = 0;
        } else {
            Iterator it9 = mapM1232H3.entrySet().iterator();
            i8 = 0;
            while (it9.hasNext()) {
                if (C0631i9.m1478a(((Map.Entry) it9.next()).getValue(), "MISSING")) {
                    i8++;
                }
            }
        }
        String str3 = i8 > 0 ? "WARN" : i7 > 0 ? "OK" : "PENDING";
        int size2 = mapM1232H3.size();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : mapM1232H3.entrySet()) {
            if (C0631i9.m1478a(entry.getValue(), "MISSING")) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        C0908x1.m2194b("[DIAG-HEALTH] module=ClassResolver status=" + str3 + " version=null total=" + size2 + " found=" + i7 + " miss=" + i8 + " missing=" + C0834t3.m1952p0(linkedHashMap2.keySet(), ",", null, 62));
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("top.mmjz.floatingclouds_preferences", 0);
            String string = sharedPreferences.getString("options", null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                List<String> listM1757d0 = C0739o3.m1757d0("masterEnabled", "blockHotUpdate", "hideConversation", "hideMainConvList", "hideContactList", "hideMainSearch", "hideRecentForward", "hideSnsEntry", "blockEnterChat", "blockContactInfo");
                ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(listM1757d0, 10));
                for (String str4 : listM1757d0) {
                    arrayList2.add(str4 + "=" + jSONObject.optBoolean(str4, false));
                }
                C0908x1.m2194b("[DIAG-HEALTH] module=Config status=OK " + C0834t3.m1952p0(arrayList2, " ", null, 62));
            } else {
                C0908x1.m2197e("[DIAG-HEALTH] module=Config status=WARN options=null");
            }
            String string2 = sharedPreferences.getString("maskList", null);
            if (string2 != null) {
                try {
                    JSONArray jSONArrayOptJSONArray = new JSONObject("{a:" + string2 + "}").optJSONArray("a");
                    if (jSONArrayOptJSONArray != null) {
                        length = jSONArrayOptJSONArray.length();
                    }
                } catch (Exception unused) {
                }
            }
            C0908x1.m2194b("[DIAG-HEALTH] module=Config maskCount=" + length);
        } catch (Exception e) {
            C0908x1.m2197e(C0944z.m2231k("[DIAG-HEALTH] module=Config status=FAIL error=", e.getMessage()));
        }
        try {
            C0186K3.f638a.getClass();
            C0638ig c0638igM504e = C0186K3.a.m504e();
            C0638ig c0638igM503d = C0186K3.a.m503d();
            if (c0638igM504e != null) {
                String str5 = c0638igM504e.f2331b;
                if (str5.length() == 0) {
                    C0908x1.m2194b("[DIAG-HEALTH] module=VersionSnapshot status=WARN reason=no_snapshot_collected");
                } else {
                    String str6 = "WARN";
                    if (!c0638igM504e.m1497a() && (c0638igM503d == null || c0638igM503d.f2331b.equals(str5))) {
                        str6 = "OK";
                    }
                    C0908x1.m2194b("[DIAG-HEALTH] module=VersionSnapshot status=" + str6 + " ver=" + str5 + "(" + c0638igM504e.f2332c + ") hotUpdated=" + c0638igM504e.m1497a() + " drift=" + c0638igM504e.m1497a() + " patchEnabled=" + c0638igM504e.f2341l + " initial=" + (c0638igM503d != null ? c0638igM503d.f2331b : "none"));
                }
            } else {
                C0908x1.m2194b("[DIAG-HEALTH] module=VersionSnapshot status=WARN reason=no_snapshot_collected");
            }
        } catch (Exception e2) {
            C0908x1.m2197e(C0944z.m2231k("[DIAG-HEALTH] module=VersionSnapshot status=FAIL error=", e2.getMessage()));
        }
        C0908x1.m2194b("[DIAG-HEALTH] ===============================");
        C0908x1.m2194b("[DIAG-HEALTH] Feature Health Report END");
        C0908x1.m2194b("[DIAG-HEALTH] ===============================");
    }

    /* JADX INFO: renamed from: b */
    public static void m1654b(String str, String str2, boolean z) {
        String str3;
        C0631i9.m1482e(str, "key");
        synchronized (f2822s) {
            try {
                LinkedHashMap linkedHashMap = f2822s;
                if (z) {
                    str3 = "FOUND:" + str2;
                } else {
                    str3 = "MISSING";
                }
                linkedHashMap.put(str, str3);
                C0413Wf c0413Wf = C0413Wf.f1577a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        C0908x1.m2197e("[DIAG-HEALTH] module=ClassResolver key=" + str + " status=MISSING class=" + str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m1655c(String str, String str2, String str3) {
        C0631i9.m1482e(str3, "detail");
        synchronized (f2818o) {
            f2818o.put(str, str2);
            C0413Wf c0413Wf = C0413Wf.f1577a;
        }
        StringBuilder sbM2229i = C0944z.m2229i("[DIAG-HEALTH] module=DexKitScan task=", str, " status=", str2, " ");
        sbM2229i.append(str3);
        C0908x1.m2194b(sbM2229i.toString());
    }

    /* JADX INFO: renamed from: d */
    public static void m1656d(String str, String str2, long j, String str3) {
        C0631i9.m1482e(str, "partName");
        LinkedHashMap<String, b> linkedHashMap = f2821r;
        synchronized (linkedHashMap) {
            linkedHashMap.put(str, new b(str2, j, str3));
            C0413Wf c0413Wf = C0413Wf.f1577a;
        }
        if (str2.equals("FAIL") || str2.equals("TIMEOUT")) {
            StringBuilder sbM2229i = C0944z.m2229i("[DIAG-HEALTH] module=PartsInit part=", str, " status=", str2, " duration=");
            sbM2229i.append(j);
            sbM2229i.append("ms error=");
            sbM2229i.append(str3);
            C0908x1.m2197e(sbM2229i.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1657e(boolean z, int i, int i2, int i3, String str) {
        f2810g = z;
        f2811h = i;
        f2812i = i2;
        f2813j = i3;
        f2814k = str;
        C0908x1.m2194b("[DIAG-HEALTH] module=RCR status=" + (z ? "OK" : "WARN") + " total=" + i3 + " cached=" + i + " fallback=" + i2);
    }

    /* JADX INFO: renamed from: f */
    public static void m1658f(boolean z, int i, boolean z2, String str) {
        f2804a = z;
        f2805b = i;
        f2806c = z2;
        f2807d = str;
        C0908x1.m2194b("[DIAG-HEALTH] module=TinkerFix status=" + (str != null ? "FAIL" : "OK") + " hadPatch=" + z + " deleted=" + i + " blockEnabled=" + z2 + " error=" + str);
    }
}
