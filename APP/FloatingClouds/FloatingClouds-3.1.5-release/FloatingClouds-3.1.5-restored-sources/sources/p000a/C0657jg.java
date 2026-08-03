package p000a;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONObject;
import p000a.C0475a5;

/* JADX INFO: renamed from: a.jg */
/* JADX INFO: loaded from: classes.dex */
public final class C0657jg {

    /* JADX INFO: renamed from: a */
    public static final C0657jg f2467a = new C0657jg();

    /* JADX INFO: renamed from: a */
    public static C0676kg m1523a(String str, String str2) {
        List listM1530h;
        C0690lb c0690lbM1524b = m1524b(str);
        String str3 = c0690lbM1524b != null ? c0690lbM1524b.m1551b().f2127b : null;
        ArrayList arrayListM1530h = m1530h(str);
        if (str2 != null) {
            f2467a.getClass();
            listM1530h = m1530h(str2);
        } else {
            listM1530h = C0439Y5.f1645a;
        }
        return new C0676kg(str, str3, str2, arrayListM1530h, listM1530h);
    }

    /* JADX INFO: renamed from: b */
    public static C0690lb m1524b(String str) {
        Object next;
        Object next2;
        Iterator it = C0889w1.m2165x(str, "java.lang.String", null, "[b.ver]", 4).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0690lb c0690lb = (C0690lb) next;
            if (c0690lb.f2559f.size() == 0 && Modifier.isStatic(c0690lb.f2556c)) {
                break;
            }
        }
        C0690lb c0690lb2 = (C0690lb) next;
        if (c0690lb2 != null) {
            return c0690lb2;
        }
        Iterator it2 = C0889w1.m2165x(str, null, null, null, 14).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            C0690lb c0690lb3 = (C0690lb) next2;
            if (Modifier.isStatic(c0690lb3.f2556c) && c0690lb3.f2559f.size() == 0 && C0631i9.m1478a(c0690lb3.m1551b().f2129d, "java.lang.String") && ((List) c0690lb3.f2561h.m625a()).contains("[b.ver]")) {
                break;
            }
        }
        C0690lb c0690lb4 = (C0690lb) next2;
        if (c0690lb4 != null) {
            return c0690lb4;
        }
        C0908x1.m2197e("[VersionLocator] V2 FAILED: format method not located in ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1525c(String str) {
        List<C0690lb> listM2165x = C0889w1.m2165x(str, "java.lang.String", null, null, 12);
        if (listM2165x != null && listM2165x.isEmpty()) {
            return false;
        }
        for (C0690lb c0690lb : listM2165x) {
            if (c0690lb.f2559f.size() == 0 && Modifier.isStatic(c0690lb.f2556c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0676kg m1526d() {
        JSONObject jSONObject;
        C0475a5.k kVar;
        C0676kg c0676kgM1523a;
        String str;
        ?? r0 = C0475a5.f1753a;
        if (r0 == 0 || (str = (String) r0.get("version_info_v1")) == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            kVar = null;
        } else {
            String strOptString = jSONObject.optString("versionFormatClass", "");
            String strOptString2 = jSONObject.optString("baselineInfoClass", "");
            C0631i9.m1479b(strOptString);
            if (C0034Be.m101P(strOptString)) {
                C0631i9.m1479b(strOptString2);
                if (C0034Be.m101P(strOptString2)) {
                }
            }
            C0631i9.m1479b(strOptString2);
            kVar = new C0475a5.k(strOptString, strOptString2);
        }
        if (kVar == null) {
            c0676kgM1523a = null;
        } else {
            String str2 = kVar.f1786a;
            if (!C0034Be.m101P(str2)) {
                String str3 = kVar.f1787b;
                if (C0034Be.m101P(str3)) {
                    str3 = null;
                }
                c0676kgM1523a = m1523a(str2, str3);
            }
        }
        if (c0676kgM1523a != null) {
            return c0676kgM1523a;
        }
        if (C0889w1.f3484l != null) {
            return m1527e();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static C0676kg m1527e() {
        Object objM2206a;
        try {
            objM2206a = m1528f();
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e("[VersionLocator] locateNow failed", thM2189a);
            objM2206a = null;
        }
        C0676kg c0676kg = (C0676kg) objM2206a;
        if (c0676kg == null) {
            C0908x1.m2197e("[VersionLocator] locate FAILED (no fallback)");
        }
        return c0676kg;
    }

    /* JADX INFO: renamed from: f */
    public static C0676kg m1528f() {
        C0657jg c0657jg;
        String str;
        Object next;
        C0690lb c0690lbM1524b;
        Object next2;
        Object next3;
        Iterator it = C0889w1.m2160s("[b.ver]", "[p.rev]").iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0657jg = f2467a;
            str = null;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            c0657jg.getClass();
            if (m1525c((String) next)) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 == null) {
            List listM2159r = C0889w1.m2159r("[b.ver]", null);
            List listM2159r2 = C0889w1.m2159r("[p.rev]", null);
            Iterator it2 = listM2159r.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
                String str3 = (String) next3;
                if (listM2159r2.contains(str3)) {
                    c0657jg.getClass();
                    if (m1525c(str3)) {
                        break;
                    }
                }
            }
            str2 = (String) next3;
            if (str2 == null) {
                List listM2159r3 = C0889w1.m2159r("[b.ver]", null);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM2159r3) {
                    String str4 = (String) obj;
                    c0657jg.getClass();
                    if (m1530h(str4).size() >= 5 && m1525c(str4)) {
                        arrayList.add(obj);
                    }
                }
                str2 = (String) C0834t3.m1950n0(arrayList);
                if (str2 == null) {
                    C0908x1.m2197e("[VersionLocator] V1 FAILED: z class not located");
                    str2 = null;
                }
            }
        }
        if (str2 == null || (c0690lbM1524b = m1524b(str2)) == null) {
            return null;
        }
        List list = (List) c0690lbM1524b.f2562i.m625a();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            String str5 = ((C0449Yf) it3.next()).f1693a.m1856b().f1640a;
            if (C0034Be.m95J(str5, '$')) {
                str5 = null;
            }
            if (str5 != null) {
                arrayList2.add(str5);
            }
        }
        List listM1959w0 = C0834t3.m1959w0(new LinkedHashSet(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM1959w0) {
            if (!C0631i9.m1478a((String) obj2, c0690lbM1524b.m1551b().f2126a)) {
                arrayList3.add(obj2);
            }
        }
        Iterator it4 = C0834t3.m1954r0(arrayList3, new C0456Z4(3)).iterator();
        while (true) {
            if (it4.hasNext()) {
                String str6 = (String) it4.next();
                if (m1529g(str6) >= 6) {
                    C0908x1.m2194b(C0944z.m2231k("[VersionLocator] V3: mp0 class located via usingFields: ", str6));
                    str = str6;
                    break;
                }
            } else {
                List listM2158q = C0889w1.m2158q(C0034Be.m106U(c0690lbM1524b.m1551b().f2126a, ""));
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : listM2158q) {
                    String str7 = (String) obj3;
                    if (!C0631i9.m1478a(str7, c0690lbM1524b.m1551b().f2126a)) {
                        c0657jg.getClass();
                        if (m1529g(str7) >= 6) {
                            arrayList4.add(obj3);
                        }
                    }
                }
                Iterator it5 = arrayList4.iterator();
                if (it5.hasNext()) {
                    next2 = it5.next();
                    if (it5.hasNext()) {
                        c0657jg.getClass();
                        int iM1529g = m1529g((String) next2);
                        do {
                            Object next4 = it5.next();
                            int iM1529g2 = m1529g((String) next4);
                            if (iM1529g < iM1529g2) {
                                next2 = next4;
                                iM1529g = iM1529g2;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next2 = null;
                }
                String str8 = (String) next2;
                if (str8 != null) {
                    C0908x1.m2194b("[VersionLocator] V3': mp0 class located via package structure scan: ".concat(str8));
                    str = str8;
                } else {
                    C0908x1.m2197e("[VersionLocator] V3 FAILED: mp0 class not located (baseline falls back to composite parsing)");
                }
            }
        }
        return m1523a(str2, str);
    }

    /* JADX INFO: renamed from: g */
    public static int m1529g(String str) {
        return m1530h(str).size();
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m1530h(String str) {
        List listM2161t = C0889w1.m2161t(str, "java.lang.String", Boolean.TRUE, Boolean.FALSE);
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(listM2161t, 10));
        Iterator it = listM2161t.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0799r6) it.next()).m1856b().f1641b);
        }
        return arrayList;
    }
}
