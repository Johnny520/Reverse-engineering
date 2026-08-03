package p000a;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: a.jf */
/* JADX INFO: loaded from: classes.dex */
public final class C0656jf {

    /* JADX INFO: renamed from: c */
    public static volatile C0675kf f2464c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f2465d;

    /* JADX INFO: renamed from: a */
    public static final C0656jf f2462a = new C0656jf();

    /* JADX INFO: renamed from: b */
    public static final List<String> f2463b = C0739o3.m1757d0("tinker", "tinker_temp", "tinker_server", "patch-", "wc_tinker_dir", "app_tinker", "tinker_patch", "hotpatch");

    /* JADX INFO: renamed from: e */
    public static volatile String f2466e = "NONE";

    /* JADX INFO: renamed from: a */
    public static File m1520a() {
        return new File(new File(C0601gh.m1440b(), "shared_prefs"), "tinker_symbols_v1.json");
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: b */
    public static C0675kf m1521b() {
        Object objM2206a;
        if (f2465d) {
            return f2464c;
        }
        try {
            objM2206a = m1522c();
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2197e("[TinkerLocator] locateNow failed", thM2189a);
            objM2206a = null;
        }
        C0675kf c0675kf = (C0675kf) objM2206a;
        if (c0675kf == null) {
            f2465d = true;
            return null;
        }
        f2464c = c0675kf;
        f2466e = "DEXKIT";
        try {
            File parentFile = m1520a().getParentFile();
            if (parentFile != null && (parentFile.isDirectory() || parentFile.mkdirs())) {
                File fileM1520a = m1520a();
                String string = c0675kf.m1544b().toString();
                C0631i9.m1481d(string, "toString(...)");
                Charset charset = C0382V2.f1441a;
                C0631i9.m1482e(charset, "charset");
                FileOutputStream fileOutputStream = new FileOutputStream(fileM1520a);
                try {
                    C0889w1.m2138Y(fileOutputStream, string, charset);
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                    fileOutputStream.close();
                } finally {
                }
            }
        } catch (Throwable th2) {
            C0908x1.m2197e("[TinkerLocator] saveToFile failed", th2);
        }
        if (C0889w1.f3488p != null) {
            try {
                C0475a5.m1160i(c0675kf);
            } catch (Throwable th3) {
                C0908x1.m2197e("[TinkerLocator] saveToSp failed", th3);
            }
        }
        return c0675kf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r3v21, resolved type: A */
    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: A */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108 A[PHI: r7
  0x0108: PHI (r7v24 a.lb) = (r7v5 a.lb), (r7v9 a.lb) binds: [B:42:0x0106, B:59:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0675kf m1522c() {
        Object next;
        Object next2;
        C0690lb c0690lb;
        Object next3;
        C0690lb c0690lb2;
        C0710mc c0710mc;
        C0690lb c0690lb3;
        List list;
        Iterator it;
        Object obj;
        Object next4;
        String str;
        Object next5;
        Object next6;
        Iterator it2 = C0889w1.m2165x(null, "android.content.Intent", null, "tryLoad test test", 5).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((C0690lb) next).f2559f.size() == 1) {
                break;
            }
        }
        C0690lb c0690lb4 = (C0690lb) next;
        if (c0690lb4 == null) {
            Iterator it3 = C0889w1.m2165x(null, "android.content.Intent", null, "tryLoad", 5).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it3.next();
                if (((C0690lb) next5).f2559f.size() == 1) {
                    break;
                }
            }
            c0690lb4 = (C0690lb) next5;
            if (c0690lb4 == null) {
                Iterator it4 = C0889w1.m2165x(null, "android.content.Intent", C0889w1.m2124K(null), null, 9).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it4.next();
                    C0690lb c0690lb5 = (C0690lb) next6;
                    if (C0034Be.m94I(c0690lb5.m1551b().f2126a, "Tinker", true) && C0034Be.m94I(c0690lb5.m1551b().f2126a, "Loader", true)) {
                        break;
                    }
                }
                c0690lb4 = (C0690lb) next6;
                if (c0690lb4 == null) {
                    C0908x1.m2197e("[TinkerLocator] R1 FAILED: tryLoad not located (no fallback)");
                    c0690lb4 = null;
                }
            }
        }
        if (c0690lb4 == null) {
            return null;
        }
        String str2 = c0690lb4.m1551b().f2126a;
        String str3 = c0690lb4.m1551b().f2127b;
        String str4 = (String) C0834t3.m1950n0(c0690lb4.m1551b().f2128c);
        if (str4 == null) {
            C0908x1.m2197e("[TinkerLocator] R2 failed: tryLoad(" + c0690lb4.m1551b().f2126a + "." + c0690lb4.m1551b().f2127b + ") has no param type");
            return null;
        }
        C0690lb c0690lb6 = (C0690lb) C0834t3.m1950n0(C0889w1.m2165x(str4, "void", C0739o3.m1757d0("android.content.Context", "long", "long"), null, 8));
        if (c0690lb6 != null) {
            c0690lb = c0690lb6;
        } else {
            Iterator it5 = C0889w1.m2165x(str4, null, null, null, 14).iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
                C0690lb c0690lb7 = (C0690lb) next2;
                if (Modifier.isPublic(c0690lb7.f2556c) && C0631i9.m1478a(c0690lb7.m1551b().f2129d, "void") && c0690lb7.f2559f.size() == 3 && C0631i9.m1478a(C0834t3.m1950n0(c0690lb7.m1551b().f2128c), "android.content.Context")) {
                    break;
                }
            }
            c0690lb6 = (C0690lb) next2;
            if (c0690lb6 == null) {
                C0908x1.m2197e("[TinkerLocator] R3 FAILED: onBaseContextAttached not located in ".concat(str4));
                c0690lb = null;
            }
        }
        Iterator it6 = C0889w1.m2165x(null, "boolean", null, "Tinker.SecurityCheck", 5).iterator();
        while (true) {
            if (!it6.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it6.next();
            C0690lb c0690lb8 = (C0690lb) next3;
            if (c0690lb8.f2559f.size() == 1 && C0631i9.m1478a(C0834t3.m1950n0(c0690lb8.m1551b().f2128c), "java.io.File")) {
                break;
            }
        }
        C0690lb c0690lb9 = (C0690lb) next3;
        if (c0690lb9 == null && (c0690lb9 = (C0690lb) C0834t3.m1950n0(C0889w1.m2165x(null, "boolean", C0889w1.m2124K("java.io.File"), null, 9))) == null) {
            C0908x1.m2197e("[TinkerLocator] R4 FAILED: verifyPatchMetaSignature not located");
            c0690lb2 = null;
        } else {
            c0690lb2 = c0690lb9;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listM2160s = C0889w1.m2160s("patch-", "LegacyTinkerCore");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM2160s) {
            C0690lb c0690lb10 = c0690lb;
            if (C0015Ae.m45D((String) obj2, "$PatchService")) {
                arrayList.add(obj2);
            }
            c0690lb = c0690lb10;
        }
        C0690lb c0690lb11 = c0690lb;
        linkedHashSet.addAll(arrayList);
        if (linkedHashSet.isEmpty()) {
            List listM2160s2 = C0889w1.m2160s("patch-");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listM2160s2) {
                if (C0015Ae.m45D((String) obj3, "$PatchService")) {
                    arrayList2.add(obj3);
                }
            }
            linkedHashSet.addAll(arrayList2);
        }
        if (linkedHashSet.isEmpty()) {
            List listM2160s3 = C0889w1.m2160s("LegacyTinkerCore");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : listM2160s3) {
                if (C0015Ae.m45D((String) obj4, "$PatchService")) {
                    arrayList3.add(obj4);
                }
            }
            linkedHashSet.addAll(arrayList3);
        }
        Iterator it7 = linkedHashSet.iterator();
        C0631i9.m1481d(it7, "iterator(...)");
        while (true) {
            if (!it7.hasNext()) {
                C0908x1.m2194b("[TinkerLocator] R5: patch service not located (wx<8.0.71 or structure changed) candidates=" + C0834t3.m1955s0(3, linkedHashSet));
                c0710mc = null;
                break;
            }
            String str5 = (String) it7.next();
            List listM2165x = C0889w1.m2165x(str5, null, null, null, 14);
            Iterator it8 = listM2165x.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    it = it7;
                    obj = null;
                    break;
                }
                Object next7 = it8.next();
                C0690lb c0690lb12 = (C0690lb) next7;
                if (Modifier.isPublic(c0690lb12.f2556c) && C0631i9.m1478a(c0690lb12.m1551b().f2129d, "void")) {
                    it = it7;
                    if (c0690lb12.f2559f.size() == 1 && C0631i9.m1478a(C0834t3.m1950n0(c0690lb12.m1551b().f2128c), "android.content.Intent")) {
                        obj = next7;
                        break;
                    }
                } else {
                    it = it7;
                }
                it7 = it;
            }
            C0690lb c0690lb13 = (C0690lb) obj;
            if (c0690lb13 != null) {
                str = c0690lb13.m1551b().f2127b;
            } else {
                Iterator it9 = listM2165x.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it9.next();
                    C0690lb c0690lb14 = (C0690lb) next4;
                    if (Modifier.isPublic(c0690lb14.f2556c) && c0690lb14.f2559f.size() == 3 && C0631i9.m1478a(C0834t3.m1950n0(c0690lb14.m1551b().f2128c), "android.content.Intent")) {
                        break;
                    }
                }
                C0690lb c0690lb15 = (C0690lb) next4;
                str = c0690lb15 != null ? c0690lb15.m1551b().f2127b : null;
            }
            if (str != null) {
                c0710mc = new C0710mc(str5, str);
                break;
            }
            it7 = it;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (String str6 : f2463b) {
            if (!C0889w1.m2159r(str6, null).isEmpty()) {
                linkedHashSet2.add(str6);
            }
        }
        Iterator it10 = ((List) c0690lb4.f2561h.m625a()).iterator();
        while (it10.hasNext()) {
            linkedHashSet2.add((String) it10.next());
        }
        if (c0690lb2 != null && (list = (List) c0690lb2.f2561h.m625a()) != null) {
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                linkedHashSet2.add((String) it11.next());
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it12 = linkedHashSet2.iterator();
        while (true) {
            if (!it12.hasNext()) {
                break;
            }
            Object next8 = it12.next();
            String str7 = (String) next8;
            C0631i9.m1482e(str7, "s");
            int length = str7.length();
            if (3 <= length && length < 41) {
                int i = 0;
                while (true) {
                    if (i < str7.length()) {
                        char cCharAt = str7.charAt(i);
                        if (Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        i++;
                    } else if (C0034Be.m95J(str7, '/') || C0034Be.m95J(str7, '\\') || C0034Be.m95J(str7, '_') || C0034Be.m95J(str7, '-')) {
                        for (int i2 = 0; i2 < str7.length(); i2++) {
                            if (!Character.isLetterOrDigit(str7.charAt(i2))) {
                                arrayList4.add(next8);
                                break;
                            }
                        }
                    }
                }
            }
        }
        List listM1959w0 = C0834t3.m1959w0(new LinkedHashSet(arrayList4));
        C0908x1.m2194b("[TinkerLocator] R7: raw=" + linkedHashSet2.size() + " pathSegments=" + listM1959w0.size() + " segments=" + listM1959w0);
        String str8 = c0690lb11 != null ? c0690lb11.m1551b().f2127b : null;
        String str9 = c0690lb2 != null ? c0690lb2.m1551b().f2126a : null;
        String str10 = c0690lb2 != null ? c0690lb2.m1551b().f2127b : null;
        String str11 = c0710mc != null ? (String) c0710mc.f2680a : null;
        String str12 = c0710mc != null ? (String) c0710mc.f2681b : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = C0601gh.f2227a;
        Context context = C0889w1.f3488p;
        long j = 0;
        if (context == null) {
            c0690lb3 = c0690lb2;
        } else {
            try {
                c0690lb3 = c0690lb2;
                j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (Throwable unused) {
                c0690lb3 = c0690lb2;
            }
        }
        C0675kf c0675kf = new C0675kf(str2, str3, str4, str4, str8, str9, str10, str11, str12, listM1959w0, jCurrentTimeMillis, j);
        String str13 = c0690lb11 != null ? c0690lb11.m1551b().f2127b : null;
        String str14 = c0690lb3 != null ? c0690lb3.m1551b().f2126a : null;
        String str15 = c0690lb3 != null ? c0690lb3.m1551b().f2127b : null;
        String str16 = c0710mc != null ? (String) c0710mc.f2680a : null;
        String str17 = c0710mc != null ? (String) c0710mc.f2681b : null;
        int size = listM1959w0.size();
        StringBuilder sbM2229i = C0944z.m2229i("[TinkerLocator] located: loader=", str2, ".", str3, " app=");
        sbM2229i.append(str4);
        sbM2229i.append(" appEntry=");
        sbM2229i.append(str13);
        sbM2229i.append(" security=");
        sbM2229i.append(str14);
        sbM2229i.append(".");
        sbM2229i.append(str15);
        sbM2229i.append(" patchSvc=");
        sbM2229i.append(str16);
        sbM2229i.append(".");
        sbM2229i.append(str17);
        sbM2229i.append(" pathSegments=");
        sbM2229i.append(size);
        C0908x1.m2194b(sbM2229i.toString());
        return c0675kf;
    }
}
