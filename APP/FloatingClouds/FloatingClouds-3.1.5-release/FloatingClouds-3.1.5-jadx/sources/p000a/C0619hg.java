package p000a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000a.C0676kg;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.hg */
/* JADX INFO: loaded from: classes.dex */
public final class C0619hg {

    /* JADX INFO: renamed from: a */
    public static final C0619hg f2288a = new C0619hg();

    /* JADX INFO: renamed from: a.hg$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f2289a;

        /* JADX INFO: renamed from: b */
        public final String f2290b;

        /* JADX INFO: renamed from: c */
        public final String f2291c;

        /* JADX INFO: renamed from: d */
        public final String f2292d;

        /* JADX INFO: renamed from: e */
        public final String f2293e;

        /* JADX INFO: renamed from: f */
        public final String f2294f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C0631i9.m1478a(this.f2289a, aVar.f2289a) && C0631i9.m1478a(this.f2290b, aVar.f2290b) && C0631i9.m1478a(this.f2291c, aVar.f2291c) && C0631i9.m1478a(this.f2292d, aVar.f2292d) && C0631i9.m1478a(this.f2293e, aVar.f2293e) && C0631i9.m1478a(this.f2294f, aVar.f2294f);
        }

        public final int hashCode() {
            String str = this.f2289a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f2290b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f2291c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f2292d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f2293e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f2294f;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SemanticFields(bVer=");
            sb.append(this.f2289a);
            sb.append(", tag=");
            sb.append(this.f2290b);
            sb.append(", time=");
            sb.append(this.f2291c);
            sb.append(", rev=");
            sb.append(this.f2292d);
            sb.append(", patchEnabled=");
            sb.append(this.f2293e);
            sb.append(", patchAppend=");
            return C0944z.m2228h(sb, this.f2294f, ")");
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2) call: a.hg.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ a(int i) {
            this(null, null, null, null, null, null);
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f2289a = str;
            this.f2290b = str2;
            this.f2291c = str3;
            this.f2292d = str4;
            this.f2293e = str5;
            this.f2294f = str6;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: A */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: B */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static a m1470a(String str) {
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (Map.Entry entry : m1474e(str).entrySet()) {
            String str6 = (String) entry.getKey();
            String str7 = (String) entry.getValue();
            if (str7 != null) {
                String str8 = (String) m1473d(str7).f2681b;
                String str9 = str8 == null ? (String) m1473d(str7).f2680a : str8;
                switch (str6.hashCode()) {
                    case 112803:
                        if (str6.equals("rev") && str5 == null) {
                            str5 = str9;
                        }
                        break;
                    case 114586:
                        if (str6.equals("tag") && str3 == null) {
                            str3 = str9;
                        }
                        break;
                    case 3005409:
                        if (str6.equals("bVer") && str2 == null) {
                            str2 = str9;
                        }
                        break;
                    case 3560141:
                        if (str6.equals("time") && str4 == null) {
                            str4 = str9;
                        }
                        break;
                }
            }
        }
        return new a(str2, str3, str4, str5, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static String m1471b(Class cls, String str) {
        Method method;
        if (str != null) {
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i];
                    if (C0631i9.m1478a(method.getName(), str) && Modifier.isStatic(method.getModifiers())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && C0631i9.m1478a(method.getReturnType(), String.class)) {
                            break;
                        }
                    }
                    i++;
                }
                if (method == null) {
                    C0908x1.m2197e("[VersionCollector] format method not found: " + cls.getName() + "." + str);
                    return null;
                }
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
            } catch (Throwable th) {
                C0908x1.m2197e("[VersionCollector] callFormatMethod failed", th);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0638ig m1472c(ClassLoader classLoader) {
        String str;
        a aVar;
        Boolean bool;
        PackageManager packageManager;
        C0631i9.m1482e(classLoader, "classLoader");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Context context = C0889w1.f3488p;
            int i = 0;
            String str2 = null;
            PackageInfo packageInfo = (context == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.getPackageInfo("com.tencent.mm", 0);
            if (packageInfo == null || (str = packageInfo.versionName) == null) {
                str = "";
            }
            int i2 = packageInfo != null ? packageInfo.versionCode : 0;
            C0657jg.f2467a.getClass();
            C0676kg c0676kgM1526d = C0657jg.m1526d();
            if (c0676kgM1526d != null) {
                String str3 = c0676kgM1526d.f2526a;
                if (c0676kgM1526d.f2527b != null) {
                    Class clsM13b = C0002A1.m13b(classLoader, str3);
                    if (clsM13b == null) {
                        C0908x1.m2197e("[VersionCollector] z class load failed: " + c0676kgM1526d.f2526a + " (no fallback)");
                        return C0638ig.f2329m;
                    }
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[VersionCollector] z class resolved via DexKit: ".concat(c0676kgM1526d.f2526a)}, 1));
                    String str4 = c0676kgM1526d.f2528c;
                    Class clsM13b2 = str4 != null ? C0002A1.m13b(classLoader, str4) : null;
                    String strM1471b = m1471b(clsM13b, c0676kgM1526d.f2527b);
                    if (clsM13b2 != null) {
                        C0619hg c0619hg = f2288a;
                        ?? r13 = c0676kgM1526d.f2530e;
                        c0619hg.getClass();
                        aVar = m1475f(clsM13b2, r13);
                    } else {
                        aVar = new a(i);
                    }
                    if ((aVar.f2289a == null && aVar.f2290b == null && aVar.f2291c == null && aVar.f2292d == null) && strM1471b != null) {
                        aVar = m1470a(strM1471b);
                        C0908x1.m2194b("[VersionCollector] mp0 class missing/invalid, baseline from format output (composite parsing)");
                    }
                    a aVarM1475f = m1475f(clsM13b, c0676kgM1526d.f2529d);
                    if (strM1471b != null) {
                        if (aVar.f2289a == null && aVar.f2290b == null && aVar.f2291c == null && aVar.f2292d == null) {
                            i = 1;
                        }
                        if (i == 0) {
                            m1476g(strM1471b, aVar, aVarM1475f);
                        }
                    }
                    String str5 = aVar.f2293e;
                    if (str5 == null) {
                        bool = null;
                    } else if (str5.equals("true")) {
                        bool = Boolean.TRUE;
                    } else if (str5.equals("false")) {
                        bool = Boolean.FALSE;
                    }
                    if (C0631i9.m1478a(bool, Boolean.TRUE)) {
                        str2 = aVar.f2292d;
                        String str6 = aVar.f2294f;
                        if (str6 != null && str6.length() != 0 && str2 != null) {
                            str2 = str2 + "." + str6;
                        }
                    }
                    String str7 = str2;
                    String str8 = aVarM1475f.f2290b;
                    String str9 = aVar.f2290b;
                    String str10 = aVarM1475f.f2291c;
                    String str11 = aVar.f2291c;
                    String str12 = aVarM1475f.f2292d;
                    String str13 = aVar.f2292d;
                    String str14 = aVar.f2289a;
                    if (str14 == null) {
                        str14 = aVarM1475f.f2289a;
                    }
                    Boolean bool2 = bool;
                    String str15 = str;
                    int i3 = i2;
                    C0638ig c0638ig = new C0638ig(jCurrentTimeMillis, str15, i3, str8, str9, str10, str11, str12, str13, str7, str14, bool2);
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[VersionCollector] collected: ver=" + str15 + "(" + i3 + ") hotUpdated=" + c0638ig.m1497a() + " patchEnabled=" + bool2 + " currentTag=" + aVarM1475f.f2290b + " baselineTag=" + aVar.f2290b}, 1));
                    return c0638ig;
                }
            }
            C0908x1.m2197e("[VersionCollector] symbols not located (no fallback)");
            return C0638ig.f2329m;
        } catch (Throwable th) {
            C0908x1.m2197e("[VersionCollector] collect failed (no fallback)", th);
            return C0638ig.f2329m;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C0710mc m1473d(String str) {
        int iM102Q = C0034Be.m102Q(str, '(');
        if (iM102Q <= 0 || !str.endsWith(")")) {
            return new C0710mc(str, null);
        }
        String strSubstring = str.substring(0, iM102Q);
        C0631i9.m1481d(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(iM102Q + 1, str.length() - 1);
        C0631i9.m1481d(strSubstring2, "substring(...)");
        return new C0710mc(strSubstring, strSubstring2);
    }

    /* JADX INFO: renamed from: e */
    public static LinkedHashMap m1474e(String str) {
        List<String> listM2124K;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0048C9 c0048c9 = new C0048C9(str);
        if (c0048c9.hasNext()) {
            String next = c0048c9.next();
            if (c0048c9.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c0048c9.hasNext()) {
                    arrayList.add(c0048c9.next());
                }
                listM2124K = arrayList;
            } else {
                listM2124K = C0889w1.m2124K(next);
            }
        } else {
            listM2124K = C0439Y5.f1645a;
        }
        for (String str2 : listM2124K) {
            int iM100O = C0034Be.m100O(str2, ']', 0, 6);
            String str3 = null;
            if (iM100O >= 0 && iM100O + 2 < str2.length()) {
                String strSubstring = str2.substring(iM100O + 1);
                C0631i9.m1481d(strSubstring, "substring(...)");
                String string = C0034Be.m107V(strSubstring).toString();
                if (string.length() > 0 && !string.equals("null")) {
                    str3 = string;
                }
            }
            if (str3 != null) {
                if (C0015Ae.m49H(str2, "[b.ver]", false)) {
                    linkedHashMap.put("bVer", str3);
                } else if (C0015Ae.m49H(str2, "[tag", false)) {
                    linkedHashMap.put("tag", str3);
                } else if (C0015Ae.m49H(str2, "[time", false)) {
                    linkedHashMap.put("time", str3);
                } else if (C0015Ae.m49H(str2, "[p.rev]", false)) {
                    linkedHashMap.put("pRev", str3);
                } else if (C0015Ae.m49H(str2, "[rev", false) && !C0015Ae.m49H(str2, "[p.rev", false)) {
                    linkedHashMap.put("rev", str3);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a m1475f(Class cls, List list) {
        Object objM2206a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 == null) {
                    objM2206a = null;
                } else {
                    if (str2.length() <= 0 || str2.equals("null")) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        objM2206a = new C0710mc(str, str2);
                    }
                }
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            C0710mc c0710mc = (C0710mc) (objM2206a instanceof C0901wd.a ? null : objM2206a);
            if (c0710mc != null) {
                arrayList.add(c0710mc);
            }
        }
        Iterator it2 = C0499ba.m1231G(arrayList).entrySet().iterator();
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (it2.hasNext()) {
            String str9 = (String) ((Map.Entry) it2.next()).getValue();
            String strM1546a = C0676kg.a.m1546a(str9);
            if (strM1546a != null) {
                switch (strM1546a.hashCode()) {
                    case 112803:
                        if (strM1546a.equals("rev") && str6 == null) {
                            str6 = str9;
                        }
                        break;
                    case 114586:
                        if (strM1546a.equals("tag") && str4 == null) {
                            str4 = str9;
                        }
                        break;
                    case 3005409:
                        if (strM1546a.equals("bVer") && str3 == null) {
                            str3 = str9;
                        }
                        break;
                    case 3560141:
                        if (strM1546a.equals("time") && str5 == null) {
                            str5 = str9;
                        }
                        break;
                    case 30049666:
                        if (strM1546a.equals("patchAppend") && str8 == null) {
                            str8 = str9;
                        }
                        break;
                    case 115384793:
                        if (strM1546a.equals("patchEnabled") && str7 == null) {
                            str7 = str9;
                        }
                        break;
                }
            }
        }
        return new a(str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: A */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1476g(String str, a aVar, a aVar2) {
        String str2;
        for (Map.Entry entry : m1474e(str).entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            switch (str3.hashCode()) {
                case 112803:
                    str2 = str3.equals("rev") ? aVar.f2292d : null;
                    break;
                case 114586:
                    if (str3.equals("tag")) {
                        str2 = aVar.f2290b;
                        break;
                    }
                    break;
                case 3005409:
                    if (str3.equals("bVer")) {
                        str2 = aVar.f2289a;
                        break;
                    }
                    break;
                case 3560141:
                    if (str3.equals("time")) {
                        str2 = aVar.f2291c;
                        break;
                    }
                    break;
            }
            if (str4 != null && str2 != null) {
                C0710mc c0710mcM1473d = m1473d(str4);
                String str5 = (String) c0710mcM1473d.f2680a;
                String str6 = (String) c0710mcM1473d.f2681b;
                if (str5 != null && !str5.equals(aVar2.f2290b) && !str5.equals(aVar2.f2291c) && !str5.equals(aVar2.f2292d) && !str5.equals(aVar2.f2289a)) {
                    StringBuilder sbM2229i = C0944z.m2229i("[VersionCollector] cross-check [", str3, "]: format=", str5, " differs from current fields, baseline split=");
                    sbM2229i.append(str6);
                    sbM2229i.append(" direct=");
                    sbM2229i.append(str2);
                    C0908x1.m2197e(sbM2229i.toString());
                }
                if (str6 != null && !str6.equals(str2)) {
                    StringBuilder sbM2229i2 = C0944z.m2229i("[VersionCollector] cross-check [", str3, "]: baseline split=", str6, " != mp0 direct=");
                    sbM2229i2.append(str2);
                    C0908x1.m2197e(sbM2229i2.toString());
                }
            }
        }
    }
}
