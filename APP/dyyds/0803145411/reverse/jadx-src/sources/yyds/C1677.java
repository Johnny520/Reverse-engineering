package yyds;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛷᲈᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1677 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static Method f8552;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static volatile String f8553;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static WeakReference f8556;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1677 f8554 = new C1677();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final LinkedHashMap f8555 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final LinkedHashMap f8557 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final LinkedHashMap f8559 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static volatile LinkedHashMap f8558 = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v2, types: [yyds.ᲈᛵᛵᛴ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap m3419(String str) {
        ?? c2658;
        ?? linkedHashMap;
        Throwable thM4249;
        AbstractC0517 abstractC0517M4343;
        AbstractC2328.m4341(-580477287826286L);
        if (AbstractC0473.m1313(str)) {
            return new LinkedHashMap();
        }
        try {
            abstractC0517M4343 = AbstractC2328.m4343(str);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (!(abstractC0517M4343 instanceof C0568)) {
            linkedHashMap = new LinkedHashMap();
            thM4249 = C2248.m4249(linkedHashMap);
            ?? linkedHashMap2 = linkedHashMap;
            if (thM4249 != null) {
                linkedHashMap2 = new LinkedHashMap();
            }
            return (LinkedHashMap) linkedHashMap2;
        }
        c2658 = new LinkedHashMap();
        Set setEntrySet = ((C0568) abstractC0517M4343).f2744.entrySet();
        AbstractC2328.m4341(-580494467695470L);
        for (Map.Entry entry : (C0628) setEntrySet) {
            String str2 = (String) entry.getKey();
            AbstractC0517 abstractC0517 = (AbstractC0517) entry.getValue();
            abstractC0517.getClass();
            if ((abstractC0517 instanceof C0754) && (((C0754) abstractC0517).f3466 instanceof String)) {
                String string = AbstractC0473.m1314(str2).toString();
                String strMo1363 = abstractC0517.mo1363();
                AbstractC2328.m4341(-580554597237614L);
                String string2 = AbstractC0473.m1314(strMo1363).toString();
                if (string.length() > 0 && string2.length() > 0) {
                    c2658.put(string, string2);
                }
            }
        }
        linkedHashMap = c2658;
        thM4249 = C2248.m4249(linkedHashMap);
        ?? linkedHashMap22 = linkedHashMap;
        if (thM4249 != null) {
        }
        return (LinkedHashMap) linkedHashMap22;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String m3420(String str, String str2) {
        LinkedHashMap linkedHashMapM3422 = m3422();
        String str3 = null;
        String string = str != null ? AbstractC0473.m1314(str).toString() : null;
        if (string == null) {
            string = AbstractC2328.m4341(-580734985864046L);
        }
        if (string.length() == 0) {
            return null;
        }
        String string2 = str2 != null ? AbstractC0473.m1314(str2).toString() : null;
        if (string2 == null) {
            string2 = AbstractC2328.m4341(-580739280831342L);
        }
        String str4 = (String) linkedHashMapM3422.get(string);
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = f8557;
                String str5 = (String) linkedHashMap.get(string);
                if (str4 != null) {
                    if (string2.length() > 0 && !string2.equals(str4) && !string2.equals(str5)) {
                        f8555.put(string, string2);
                    }
                    linkedHashMap.put(string, str4);
                    str3 = str4;
                } else if (str5 != null && string2.equals(str5)) {
                    linkedHashMap.remove(string);
                    str3 = (String) f8555.get(string);
                } else if (string2.length() > 0) {
                    f8555.put(string, string2);
                    linkedHashMap.remove(string);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3421(Object obj, Method method) {
        if (obj == null || method == null) {
            return;
        }
        method.setAccessible(true);
        synchronized (this) {
            f8556 = new WeakReference(obj);
            f8552 = method;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final LinkedHashMap m3422() {
        LinkedHashMap linkedHashMap;
        C1509.f7142.getClass();
        String str = (String) C1509.f7127.m1579(C1509.f7179[2]);
        if (AbstractC1544.m3188(str, f8553)) {
            return new LinkedHashMap(f8558);
        }
        synchronized (this) {
            try {
                if (!AbstractC1544.m3188(str, f8553)) {
                    f8558 = m3419(str);
                    f8553 = str;
                }
                linkedHashMap = new LinkedHashMap(f8558);
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3423(String str, String str2) {
        LinkedHashMap linkedHashMap;
        C2498 c2498;
        Object c2658;
        AbstractC2328.m4341(-580825180177262L);
        String string = str != null ? AbstractC0473.m1314(str).toString() : null;
        if (string == null) {
            string = AbstractC2328.m4341(-580850949981038L);
        }
        if (string.length() == 0) {
            return;
        }
        synchronized (this) {
            linkedHashMap = f8559;
            c2498 = (C2498) linkedHashMap.get(string);
        }
        if (c2498 == null) {
            return;
        }
        Object obj = c2498.f12307.get();
        if (obj == null) {
            synchronized (this) {
                if (linkedHashMap.get(string) == c2498) {
                    linkedHashMap.remove(string);
                }
            }
            return;
        }
        try {
            c2498.f12308.set(obj, str2);
            c2658 = Boolean.TRUE;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-580855244948334L).concat(string), thM4249);
            c2658 = Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String m3424(String str) {
        String str2;
        String string = str != null ? AbstractC0473.m1314(str).toString() : null;
        if (string == null) {
            string = AbstractC2328.m4341(-580816590242670L);
        }
        if (string.length() == 0) {
            return null;
        }
        synchronized (this) {
            str2 = (String) f8555.get(string);
        }
        return str2;
    }
}
