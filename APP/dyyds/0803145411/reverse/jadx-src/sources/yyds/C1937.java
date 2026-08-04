package yyds;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᲀᛲᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1937 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static volatile Map f9739;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static volatile Map f9740;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final AtomicBoolean f9741;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1937 f9742;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0114 f9743;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Object f9744;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final ConcurrentHashMap f9745;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Object f9746;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final ConcurrentHashMap f9747;

    static {
        AbstractC2328.m4341(-604232751940462L);
        AbstractC2328.m4341(-604340126122862L);
        f9742 = new C1937();
        f9743 = new C0114();
        f9745 = new ConcurrentHashMap();
        f9747 = new ConcurrentHashMap();
        f9741 = new AtomicBoolean(false);
        f9746 = new Object();
        f9744 = new Object();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static void m3729(C2565 c2565, String str) {
        Object c2658;
        AbstractC2328.m4341(-601995073979246L);
        String string = AbstractC0473.m1314(c2565.f12649).toString();
        if (AbstractC0473.m1313(string)) {
            C0188.m806(AbstractC2328.m4341(-602016548815726L));
            return;
        }
        EnumC1841 enumC1841 = c2565.f12650;
        String str2 = c2565.f12651;
        AbstractC2328.m4341(-602102448161646L);
        AbstractC2328.m4341(-602123922998126L);
        switch (enumC1841.ordinal()) {
            case 0:
                if (m3734(str2) == null) {
                    C0188.m798(AbstractC2328.m4341(-602149692801902L));
                    return;
                }
                break;
            case 1:
                if (m3738(str2) == null) {
                    C0188.m798(AbstractC2328.m4341(-602265656918894L));
                    return;
                }
                break;
            case 2:
                if (m3731(str2) == null) {
                    C0188.m798(AbstractC2328.m4341(-602368736133998L));
                    return;
                }
                break;
            case 3:
                if (AbstractC1448.m2947(AbstractC0473.m1314(str2).toString()) == null) {
                    C0188.m798(AbstractC2328.m4341(-602476110316398L));
                    return;
                }
                break;
            case 4:
                String string2 = AbstractC0473.m1314(str2).toString();
                Double dValueOf = null;
                try {
                    if (AbstractC1448.m2946(string2)) {
                        dValueOf = Double.valueOf(Double.parseDouble(string2));
                    }
                    break;
                } catch (NumberFormatException unused) {
                }
                if (dValueOf == null) {
                    C0188.m798(AbstractC2328.m4341(-602523354956654L));
                    return;
                }
                break;
            case 5:
                break;
            case 6:
                try {
                    C0114 c0114 = f9743;
                    c0114.getClass();
                    c2658 = c0114.m517(str2, new C2805(Object.class));
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C1693.m3436(thM4249.getMessage(), AbstractC2328.m4341(-602574894564206L));
                    return;
                }
                break;
            default:
                C0188.m801();
                return;
        }
        synchronized (f9746) {
            try {
                f9742.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m3733());
                if (str != null && !AbstractC0473.m1313(str) && !str.equals(string)) {
                    linkedHashMap.remove(str);
                }
                linkedHashMap.put(string, C2565.m4642(c2565, string, false, 0L, 30));
                m3735(linkedHashMap);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static String m3730(Object obj, EnumC1841 enumC1841) {
        Object c2658;
        if (obj == null) {
            return AbstractC2328.m4341(-603979348869998L);
        }
        try {
            int iOrdinal = enumC1841.ordinal();
            if (iOrdinal == 5) {
                c2658 = obj instanceof String ? (String) obj : null;
                if (c2658 == null) {
                    c2658 = obj.toString();
                }
            } else if (iOrdinal != 6) {
                c2658 = obj.toString();
            } else {
                boolean zIsArray = obj.getClass().isArray();
                C0114 c0114 = f9743;
                if (zIsArray) {
                    int length = Array.getLength(obj);
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Array.get(obj, i));
                    }
                    c2658 = c0114.m515(arrayList);
                } else {
                    c2658 = c0114.m515(obj);
                }
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Object string = obj.toString();
        if (c2658 instanceof C2658) {
            c2658 = string;
        }
        return (String) c2658;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static Long m3731(String str) {
        Object c2658;
        try {
            c2658 = Long.decode(AbstractC0473.m1314(str).toString());
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        return (Long) c2658;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Map m3732() {
        Object c2658;
        Map map;
        Map map2 = f9740;
        if (map2 != null) {
            return map2;
        }
        synchronized (f9744) {
            try {
                Map map3 = f9740;
                if (map3 != null) {
                    return map3;
                }
                String string = AbstractC0027.m3912().getString(AbstractC2328.m4341(-603549852140398L), AbstractC2328.m4341(-603657226322798L));
                if (string == null) {
                    string = AbstractC2328.m4341(-603661521290094L);
                }
                if (AbstractC0473.m1313(string)) {
                    map = C0704.f3312;
                } else {
                    try {
                        f9742.getClass();
                        c2658 = m3736(string);
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    Throwable thM4249 = C2248.m4249(c2658);
                    if (thM4249 != null) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-603665816257390L), thM4249);
                        c2658 = C0704.f3312;
                    }
                    map = (Map) c2658;
                }
                Map mapM4381 = AbstractC2366.m4381(map);
                f9740 = mapM4381;
                return mapM4381;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Map m3733() {
        Object c2658;
        Map map;
        Map map2 = f9739;
        if (map2 != null) {
            return map2;
        }
        synchronized (f9746) {
            try {
                Map map3 = f9739;
                if (map3 != null) {
                    return map3;
                }
                C1509.f7142.getClass();
                String str = (String) C1509.f7260.m1579(C1509.f7179[208]);
                if (AbstractC0473.m1313(str)) {
                    map = C0704.f3312;
                } else {
                    try {
                        f9742.getClass();
                        c2658 = m3737(str);
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    Throwable thM4249 = C2248.m4249(c2658);
                    if (thM4249 != null) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-603485427630958L), thM4249);
                        c2658 = C0704.f3312;
                    }
                    map = (Map) c2658;
                }
                Map mapM4381 = AbstractC2366.m4381(map);
                f9739 = mapM4381;
                return mapM4381;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Boolean m3734(String str) {
        String string = AbstractC0473.m1314(str).toString();
        Locale locale = Locale.ROOT;
        AbstractC2328.m4341(-604000823706478L);
        String lowerCase = string.toLowerCase(locale);
        AbstractC2328.m4341(-604022298542958L);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 3569038) {
                    if (iHashCode != 97196323 || !lowerCase.equals(AbstractC2328.m4341(-604133967692654L))) {
                        return null;
                    }
                } else if (!lowerCase.equals(AbstractC2328.m4341(-604112492856174L))) {
                    return null;
                }
            } else if (!lowerCase.equals(AbstractC2328.m4341(-604103902921582L))) {
                return null;
            }
            return Boolean.TRUE;
        }
        if (!lowerCase.equals(AbstractC2328.m4341(-604095312986990L))) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static void m3735(LinkedHashMap linkedHashMap) {
        Map mapM4381 = AbstractC2366.m4381(linkedHashMap);
        C1509 c1509 = C1509.f7142;
        String strM4341 = mapM4381.isEmpty() ? AbstractC2328.m4341(-603545557173102L) : f9743.m515(AbstractC1595.m3272(mapM4381.values(), new C1300(2)));
        c1509.getClass();
        AbstractC2328.m4341(-28951947412334L);
        C1509.f7260.m1581(C1509.f7179[208], strM4341);
        f9739 = mapM4381;
        f9747.clear();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static LinkedHashMap m3736(String str) {
        Object c2658;
        Object c26582;
        Object c26583;
        Object c26584;
        Object c26585;
        Object c26586;
        AbstractC2328.m4341(-603914924360558L);
        Iterable<C1938> iterable = (List) f9743.m516(str, new C0713().f13683);
        if (iterable == null) {
            iterable = C1860.f9345;
        }
        ArrayList arrayList = new ArrayList();
        for (C1938 c1938 : iterable) {
            if (c1938 != null) {
                try {
                    c2658 = AbstractC0473.m1314(c1938.f9749).toString();
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                String str2 = (String) c2658;
                if (str2 != null) {
                    String str3 = str2.length() > 0 ? str2 : null;
                    if (str3 != null) {
                        try {
                            c26582 = c1938.f9750;
                        } catch (Throwable th2) {
                            c26582 = new C2658(th2);
                        }
                        if (c26582 instanceof C2658) {
                            c26582 = null;
                        }
                        EnumC1841 enumC1841 = (EnumC1841) c26582;
                        if (enumC1841 != null) {
                            try {
                                c26583 = c1938.f9752;
                            } catch (Throwable th3) {
                                c26583 = new C2658(th3);
                            }
                            if (c26583 instanceof C2658) {
                                c26583 = null;
                            }
                            String strM4341 = (String) c26583;
                            if (strM4341 == null) {
                                strM4341 = AbstractC2328.m4341(-603936399197038L);
                            }
                            String str4 = strM4341;
                            try {
                                c26584 = c1938.f9754;
                            } catch (Throwable th4) {
                                c26584 = new C2658(th4);
                            }
                            if (c26584 instanceof C2658) {
                                c26584 = null;
                            }
                            String strM43412 = (String) c26584;
                            if (strM43412 == null) {
                                strM43412 = AbstractC2328.m4341(-603957874033518L);
                            }
                            String str5 = strM43412;
                            try {
                                c26585 = c1938.f9748;
                            } catch (Throwable th5) {
                                c26585 = new C2658(th5);
                            }
                            if (c26585 instanceof C2658) {
                                c26585 = null;
                            }
                            String str6 = (String) c26585;
                            long j = c1938.f9753;
                            try {
                                c26586 = c1938.f9751;
                            } catch (Throwable th6) {
                                c26586 = new C2658(th6);
                            }
                            c1938 = new C1938(str3, enumC1841, str4, str5, str6, j, (String) (c26586 instanceof C2658 ? null : c26586));
                        }
                    }
                }
            }
            if (c1938 != null) {
                arrayList.add(c1938);
            }
        }
        int iM4382 = AbstractC2366.m4382(AbstractC0055.m419(arrayList, 10));
        if (iM4382 < 16) {
            iM4382 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM4382);
        for (Object obj : arrayList) {
            linkedHashMap.put(((C1938) obj).f9749, obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static LinkedHashMap m3737(String str) {
        Object c2658;
        Object c26582;
        Object c26583;
        AbstractC2328.m4341(-603893449524078L);
        Iterable<C2565> iterable = (List) f9743.m516(str, new C2376().f13683);
        if (iterable == null) {
            iterable = C1860.f9345;
        }
        ArrayList arrayList = new ArrayList();
        for (C2565 c2565 : iterable) {
            C2565 c25652 = null;
            if (c2565 != null) {
                try {
                    c2658 = AbstractC0473.m1314(c2565.f12649).toString();
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                String str2 = (String) c2658;
                if (str2 != null) {
                    String str3 = str2.length() > 0 ? str2 : null;
                    if (str3 != null) {
                        try {
                            c26582 = c2565.f12650;
                        } catch (Throwable th2) {
                            c26582 = new C2658(th2);
                        }
                        if (c26582 instanceof C2658) {
                            c26582 = null;
                        }
                        EnumC1841 enumC1841 = (EnumC1841) c26582;
                        if (enumC1841 != null) {
                            try {
                                c26583 = c2565.f12651;
                            } catch (Throwable th3) {
                                c26583 = new C2658(th3);
                            }
                            if (c26583 instanceof C2658) {
                                c26583 = null;
                            }
                            String str4 = (String) c26583;
                            if (str4 != null) {
                                c25652 = new C2565(str3, enumC1841, str4, c2565.f12652, c2565.f12648);
                            }
                        }
                    }
                }
            }
            if (c25652 != null) {
                arrayList.add(c25652);
            }
        }
        int iM4382 = AbstractC2366.m4382(AbstractC0055.m419(arrayList, 10));
        if (iM4382 < 16) {
            iM4382 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM4382);
        for (Object obj : arrayList) {
            linkedHashMap.put(((C2565) obj).f12649, obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static Integer m3738(String str) {
        Object c2658;
        try {
            c2658 = Integer.decode(AbstractC0473.m1314(str).toString());
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        return (Integer) c2658;
    }
}
