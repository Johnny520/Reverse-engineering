package yyds;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᲀᛴᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1988 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final C0078 f9984;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final Set f9985;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final Map f9986;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final Set f9987;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final C0078 f9988;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static final C0078 f9989;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final C0078 f9990;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Set f9991;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final AtomicBoolean f9992;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final Map f9993;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final Set f9994;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final C0078 f9995;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final C0078 f9996;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1988 f9997;

    static {
        AbstractC2328.m4341(-1067616773505902L);
        AbstractC2328.m4341(-1067694082917230L);
        AbstractC2328.m4341(-1067913126249326L);
        f9997 = new C1988();
        f9991 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        f9985 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        f9987 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        f9994 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        f9992 = new AtomicBoolean(false);
        f9993 = AbstractC0897.m1993();
        f9986 = AbstractC0897.m1993();
        f9984 = new C0078(new C0824(1));
        f9988 = new C0078(new C0824(2));
        f9996 = new C0078(new C0824(3));
        f9990 = new C0078(new C0824(4));
        f9989 = new C0078(new C0824(5));
        f9995 = new C0078(new C0824(6));
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static void m3852(ArrayList arrayList, String str, Object obj) {
        String strM3863 = m3863(obj);
        if (strM3863 != null) {
            arrayList.add(new Pair(str, strM3863));
        }
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public static String m3853(Object obj) {
        long j;
        Object c2658;
        Long lValueOf = obj instanceof Number ? Long.valueOf(((Number) obj).longValue()) : obj instanceof String ? AbstractC0733.m1692((String) obj) : null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (jLongValue > 0) {
                if (jLongValue < 10000000000L) {
                    j = 1000 * jLongValue;
                } else {
                    if (jLongValue < 1000000000000L) {
                        return String.valueOf(jLongValue);
                    }
                    j = jLongValue;
                }
                try {
                    c2658 = new SimpleDateFormat(AbstractC2328.m4341(-1064146439930734L), Locale.getDefault()).format(new Date(j));
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (C2248.m4249(c2658) != null) {
                    c2658 = String.valueOf(jLongValue);
                }
                return (String) c2658;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public static boolean m3854(String str) {
        Object c2658;
        boolean z = false;
        if (str.length() < 16 || !AbstractC0473.m1302(str).toString().startsWith(AbstractC2328.m4341(-1056394023961454L))) {
            return false;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(AbstractC2328.m4341(-1056402613896046L));
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                z = true;
            }
            c2658 = Boolean.valueOf(z);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Object obj = Boolean.FALSE;
        if (c2658 instanceof C2658) {
            c2658 = obj;
        }
        return ((Boolean) c2658).booleanValue();
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public static C2578 m3855(JSONObject jSONObject) {
        C2578 c2578M3296 = AbstractC0024.m3296();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC2328.m4341(-1064700490711918L);
            c2578M3296.add(next);
        }
        return AbstractC0024.m3305(c2578M3296);
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public static final void m3856(C0412 c0412, C0412 c04122, JSONObject jSONObject, int i) {
        Object c2658;
        if (i > 5) {
            return;
        }
        f9997.getClass();
        ListIterator listIterator = m3855(jSONObject).listIterator(0);
        while (true) {
            C0368 c0368 = (C0368) listIterator;
            if (!c0368.hasNext()) {
                return;
            }
            String str = (String) c0368.next();
            String strM3857 = m3857(str);
            Object objOpt = jSONObject.opt(str);
            if (objOpt instanceof JSONObject) {
                m3856(c0412, c04122, (JSONObject) objOpt, i + 1);
            } else if (objOpt instanceof Number) {
                long jLongValue = ((Number) objOpt).longValue();
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                if (AbstractC0473.m1301(strM3857, AbstractC2328.m4341(-1067225931481966L), false)) {
                    c0412.f2148 = Math.max(c0412.f2148, jLongValue);
                } else if (AbstractC0068.m441(AbstractC2328.m4341(-1067260291220334L), AbstractC2328.m4341(-1067290355991406L), AbstractC2328.m4341(-1067341895598958L), AbstractC2328.m4341(-1067367665402734L)).contains(strM3857)) {
                    c04122.f2148 = Math.max(c04122.f2148, jLongValue);
                }
            } else if (objOpt instanceof String) {
                Comparable comparable = null;
                if (strM3857.equals(AbstractC2328.m4341(-1067414910042990L)) && ((String) objOpt).startsWith(AbstractC2328.m4341(-1067457859715950L))) {
                    try {
                        c2658 = new JSONObject((String) objOpt);
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    if (c2658 instanceof C2658) {
                        c2658 = null;
                    }
                    JSONObject jSONObject2 = (JSONObject) c2658;
                    if (jSONObject2 != null) {
                        m3856(c0412, c04122, jSONObject2, i + 1);
                    }
                }
                if (AbstractC0473.m1301(strM3857, AbstractC2328.m4341(-1067466449650542L), false)) {
                    Matcher matcher = Pattern.compile(AbstractC2328.m4341(-1067513694290798L)).matcher((CharSequence) objOpt);
                    C0644 c0644 = !matcher.find(0) ? null : new C0644(matcher);
                    if (c0644 != null) {
                        List listM3264 = AbstractC1595.m3264(1, c0644.m1559());
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listM3264.iterator();
                        while (it.hasNext()) {
                            Long lM1692 = AbstractC0733.m1692((String) it.next());
                            if (lM1692 != null) {
                                arrayList.add(lM1692);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            Comparable comparable2 = (Comparable) it2.next();
                            while (true) {
                                comparable = comparable2;
                                while (it2.hasNext()) {
                                    comparable2 = (Comparable) it2.next();
                                    if (comparable.compareTo(comparable2) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        Long l = (Long) comparable;
                        if (l != null) {
                            c04122.f2148 = Math.max(c04122.f2148, l.longValue());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static String m3857(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC2328.m4341(-1064743440384878L);
        Pattern patternCompile = Pattern.compile(AbstractC2328.m4341(-1064816454828910L));
        return patternCompile.matcher(lowerCase).replaceAll(AbstractC2328.m4341(-1064859404501870L));
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public static String m3858(Object obj) {
        Object c2658;
        JSONObject jSONObject;
        Object c26582;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            if (obj instanceof String) {
                try {
                    c2658 = new JSONObject((String) obj);
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                jSONObject = (JSONObject) (c2658 instanceof C2658 ? null : c2658);
            } else {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            return m3863(obj);
        }
        try {
            c26582 = jSONObject.toString(2);
        } catch (Throwable th2) {
            c26582 = new C2658(th2);
        }
        if (C2248.m4249(c26582) != null) {
            c26582 = jSONObject.toString();
        }
        return (String) c26582;
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public static ArrayList m3859(Object obj) {
        Object c2658;
        ArrayList arrayList = new ArrayList();
        Class<?> cls = obj.getClass();
        C1728 c1728 = new C1728();
        C0941 c0941 = new C0941(cls, c1728);
        c0941.f4335 = c1728;
        c1728.f8730 = c0941;
        while (c1728.hasNext()) {
            Field field = (Field) c1728.next();
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    c2658 = field.get(obj);
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                if (c2658 != null) {
                    arrayList.add(c2658);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static JSONObject m3860(Object obj) {
        Object c2658;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            c2658 = new JSONObject((String) obj);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        return (JSONObject) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public static C0479 m3861(Object obj) {
        Field field;
        Method method;
        Method method2;
        Object c2658;
        Object c26582;
        boolean zBooleanValue;
        Object c26583;
        Field field2;
        Class<?> superclass = obj.getClass();
        Method[] methods = superclass.getMethods();
        AbstractC2328.m4341(-1052889330647918L);
        int length = methods.length;
        int i = 0;
        while (true) {
            field = null;
            if (i >= length) {
                method = null;
                break;
            }
            method = methods[i];
            if (AbstractC1544.m3188(method.getName(), AbstractC2328.m4341(-1052958050124654L))) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC2328.m4341(-1052992409863022L);
                if (parameterTypes.length == 0 && AbstractC1544.m3188(method.getReturnType(), String.class)) {
                    break;
                }
            }
            i++;
        }
        if (method != null) {
            Method[] methods2 = superclass.getMethods();
            AbstractC2328.m4341(-1053091194110830L);
            int length2 = methods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    method2 = null;
                    break;
                }
                method2 = methods2[i2];
                if (AbstractC1544.m3188(method2.getName(), AbstractC2328.m4341(-1053159913587566L))) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    AbstractC2328.m4341(-1053198568293230L);
                    if (parameterTypes2.length == 0 && AbstractC1544.m3188(method2.getReturnType(), Integer.TYPE)) {
                        break;
                    }
                }
                i2++;
            }
            if (method2 != null) {
                try {
                    Object objInvoke = method.invoke(obj, null);
                    c2658 = objInvoke instanceof String ? (String) objInvoke : null;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                String str = (String) c2658;
                if (str != null) {
                    if (AbstractC0473.m1313(str)) {
                        str = null;
                    }
                    if (str != null) {
                        try {
                            Object objInvoke2 = method2.invoke(obj, null);
                            c26582 = objInvoke2 instanceof Integer ? (Integer) objInvoke2 : null;
                        } catch (Throwable th2) {
                            c26582 = new C2658(th2);
                        }
                        if (c26582 instanceof C2658) {
                            c26582 = null;
                        }
                        Integer num = (Integer) c26582;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            String strM4341 = AbstractC2328.m4341(-1053297352541038L);
                            while (true) {
                                zBooleanValue = true;
                                if (superclass == null || superclass.equals(Object.class)) {
                                    break;
                                }
                                Field[] declaredFields = superclass.getDeclaredFields();
                                AbstractC2328.m4341(-1053327417312110L);
                                int length3 = declaredFields.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length3) {
                                        field2 = null;
                                        break;
                                    }
                                    field2 = declaredFields[i3];
                                    if (AbstractC1544.m3188(field2.getName(), strM4341) && AbstractC1544.m3188(field2.getType(), Boolean.TYPE)) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (field2 != null) {
                                    field2.setAccessible(true);
                                    field = field2;
                                    break;
                                }
                                superclass = superclass.getSuperclass();
                            }
                            if (field != null) {
                                try {
                                    c26583 = Boolean.valueOf(field.getBoolean(obj));
                                } catch (Throwable th3) {
                                    c26583 = new C2658(th3);
                                }
                                Object obj2 = Boolean.TRUE;
                                if (c26583 instanceof C2658) {
                                    c26583 = obj2;
                                }
                                zBooleanValue = ((Boolean) c26583).booleanValue();
                            }
                            return new C0479(obj, str, iIntValue, zBooleanValue);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public static Object m3862(Object obj, String str) {
        Object c2658;
        Method method;
        if (obj == null) {
            return null;
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            AbstractC2328.m4341(-1064863699469166L);
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods[i];
                if (AbstractC1544.m3188(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC2328.m4341(-1064932418945902L);
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i++;
            }
            c2658 = method != null ? method.invoke(obj, null) : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            return null;
        }
        return c2658;
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static String m3863(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                if (AbstractC0473.m1313((String) obj)) {
                    obj = null;
                }
                return (String) obj;
            }
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).toString(2);
            }
            String string = obj.toString();
            if (!AbstractC0473.m1313(string)) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public static ArrayList m3864(JSONObject jSONObject) {
        C0172 c0172 = new C0172();
        c0172.f997 = C1860.f9345;
        m3868(c0172, jSONObject, 0);
        Iterable iterable = (Iterable) c0172.f997;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (hashSet.add(((C0985) obj).f4490)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static void m3865(JSONObject jSONObject, LinkedHashMap linkedHashMap, int i) {
        JSONObject jSONObjectM3860;
        if (i > 6) {
            return;
        }
        Set setM441 = AbstractC0068.m441(AbstractC2328.m4341(-1063536554574702L), AbstractC2328.m4341(-1063583799214958L), AbstractC2328.m4341(-1063609569018734L), AbstractC2328.m4341(-1063639633789806L), AbstractC2328.m4341(-1063686878430062L), AbstractC2328.m4341(-1063738418037614L), AbstractC2328.m4341(-1063772777775982L), AbstractC2328.m4341(-1063858677121902L), AbstractC2328.m4341(-1063875856991086L), AbstractC2328.m4341(-1063905921762158L), AbstractC2328.m4341(-1063931691565934L));
        ListIterator listIterator = m3855(jSONObject).listIterator(0);
        while (true) {
            C0368 c0368 = (C0368) listIterator;
            if (!c0368.hasNext()) {
                return;
            }
            String str = (String) c0368.next();
            Object objOpt = jSONObject.opt(str);
            f9997.getClass();
            String strM3857 = m3857(str);
            if (objOpt instanceof JSONObject) {
                m3865((JSONObject) objOpt, linkedHashMap, i + 1);
            } else if (objOpt instanceof Number) {
                if (setM441.contains(strM3857)) {
                    linkedHashMap.putIfAbsent(str, ((Number) objOpt).toString());
                }
            } else if (objOpt instanceof String) {
                if (setM441.contains(strM3857) && !AbstractC0473.m1313((CharSequence) objOpt)) {
                    linkedHashMap.putIfAbsent(str, objOpt);
                }
                if (AbstractC0473.m1302((String) objOpt).toString().startsWith(AbstractC2328.m4341(-1063948871435118L)) && (jSONObjectM3860 = m3860(objOpt)) != null) {
                    m3865(jSONObjectM3860, linkedHashMap, i + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static void m3866(JSONObject jSONObject, String str, ArrayList arrayList, int i) {
        JSONObject jSONObjectM3860;
        if (i > 6) {
            return;
        }
        ListIterator listIterator = m3855(jSONObject).listIterator(0);
        while (true) {
            C0368 c0368 = (C0368) listIterator;
            if (!c0368.hasNext()) {
                return;
            }
            String str2 = (String) c0368.next();
            Object objOpt = jSONObject.opt(str2);
            String str3 = str + AbstractC2328.m4341(-1063510784770926L) + str2;
            boolean z = objOpt instanceof JSONObject;
            C1988 c1988 = f9997;
            if (z) {
                c1988.getClass();
                m3866((JSONObject) objOpt, str3, arrayList, i + 1);
            } else if (objOpt instanceof String) {
                String str4 = (String) objOpt;
                c1988.getClass();
                if (m3867(str4)) {
                    arrayList.add(new Pair(str3, objOpt));
                } else if (AbstractC0473.m1302(str4).toString().startsWith(AbstractC2328.m4341(-1063527964640110L)) && (jSONObjectM3860 = m3860(objOpt)) != null) {
                    m3866(jSONObjectM3860, str3, arrayList, i + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public static boolean m3867(String str) {
        String lowerCase = AbstractC0473.m1314(str).toString().toLowerCase(Locale.ROOT);
        AbstractC2328.m4341(-1064232339276654L);
        return lowerCase.startsWith(AbstractC2328.m4341(-1064305353720686L)) || lowerCase.startsWith(AbstractC2328.m4341(-1064339713459054L)) || lowerCase.startsWith(AbstractC2328.m4341(-1064378368164718L)) || lowerCase.startsWith(AbstractC2328.m4341(-1064417022870382L)) || lowerCase.startsWith(AbstractC2328.m4341(-1064451382608750L)) || lowerCase.startsWith(AbstractC2328.m4341(-1064490037314414L));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3868(C0172 c0172, JSONObject jSONObject, int i) {
        C0985 c0985;
        if (i > 5) {
            return;
        }
        C1988 c1988 = f9997;
        c1988.getClass();
        C2578 c2578M3855 = m3855(jSONObject);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c2578M3855.listIterator(0);
        while (true) {
            C0368 c0368 = (C0368) listIterator;
            int i2 = 1;
            if (!c0368.hasNext()) {
                break;
            }
            String str = (String) c0368.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                c0985 = null;
            } else {
                Set setM3154 = AbstractC1529.m3154(new C1125(new C0558(i2, m3855(jSONObjectOptJSONObject)), new C2635(1, c1988, C1988.class, AbstractC2328.m4341(-1018018491171694L), AbstractC2328.m4341(-1018091505615726L), 0, 11)));
                if (!setM3154.isEmpty()) {
                    Iterator it = setM3154.iterator();
                    while (it.hasNext()) {
                        if (AbstractC0068.m441(AbstractC2328.m4341(-1064520102085486L), AbstractC2328.m4341(-1064541576921966L), AbstractC2328.m4341(-1064571641693038L), AbstractC2328.m4341(-1064614591365998L), AbstractC2328.m4341(-1064631771235182L), AbstractC2328.m4341(-1064648951104366L), AbstractC2328.m4341(-1064666130973550L)).contains((String) it.next())) {
                            C0412 c0412 = new C0412();
                            C0412 c04122 = new C0412();
                            m3856(c0412, c04122, jSONObjectOptJSONObject, 0);
                            c0985 = new C0985((c0412.f2148 * 1000000) + c04122.f2148, str);
                            break;
                        }
                    }
                    c0985 = null;
                }
            }
            if (c0985 != null) {
                arrayList.add(c0985);
            }
        }
        if (arrayList.size() > ((List) c0172.f997).size()) {
            c0172.f997 = arrayList;
        }
        ListIterator listIterator2 = c2578M3855.listIterator(0);
        while (true) {
            C0368 c03682 = (C0368) listIterator2;
            if (!c03682.hasNext()) {
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject((String) c03682.next());
            if (jSONObjectOptJSONObject2 != null) {
                m3868(c0172, jSONObjectOptJSONObject2, i + 1);
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public final String m3869(Object... objArr) {
        String str = (String) AbstractC1529.m3161(AbstractC1529.m3164(AbstractC2070.m3935(objArr), new C2635(1, this, C1988.class, AbstractC2328.m4341(-843093063140206L), AbstractC2328.m4341(-843144602747758L), 0, 10)));
        return str == null ? AbstractC2328.m4341(-1064142144963438L) : str;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final void m3870(Class cls) {
        Set set = f9991;
        if (set.add(cls)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC2328.m4341(-1050866401051502L);
            int length = declaredMethods.length;
            int i = 0;
            boolean z = false;
            Method method = null;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                } else {
                    Method method2 = declaredMethods[i];
                    if (AbstractC1544.m3188(method2.getName(), AbstractC2328.m4341(-1050969480266606L))) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC2328.m4341(-1051008134972270L);
                        if (parameterTypes.length != 0) {
                            continue;
                        } else {
                            if (z) {
                                break;
                            }
                            z = true;
                            method = method2;
                        }
                    }
                    i++;
                }
            }
            method = null;
            if (method == null) {
                set.remove(cls);
            } else {
                method.setAccessible(true);
                m673(method, null, new C0583(13));
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final void m3871(ClassLoader classLoader, C0757 c0757, C0757 c07572, String str) {
        Object c2658;
        Object c26582;
        if (c0757 == null || c07572 == null) {
            C2336.f11496.m4354(AbstractC2328.m4341(-1051905783137134L));
            return;
        }
        try {
            c2658 = C0757.m1702(c0757, classLoader);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = null;
        }
        Method method = (Method) c2658;
        try {
            c26582 = C0757.m1702(c07572, classLoader);
        } catch (Throwable th2) {
            c26582 = new C2658(th2);
        }
        Method method2 = (Method) (c26582 instanceof C2658 ? null : c26582);
        if (method == null || method2 == null) {
            C2336.f11496.m4354(AbstractC2328.m4341(-1052017452286830L) + str + AbstractC2328.m4341(-1052064696927086L));
            return;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (f9985.add(declaringClass)) {
            f9992.set(true);
            method.setAccessible(true);
            method2.setAccessible(true);
            m673(method, EnumC1543.f7451, new C2001(declaringClass, 10, method2));
            m673(method2, EnumC1543.f7642, new C0583(14));
        }
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final void m3872(ClassLoader classLoader) {
        Object c2658;
        try {
            C0757 c0757 = (C0757) f9995.getValue();
            c2658 = c0757 != null ? C0757.m1702(c0757, classLoader) : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Method method = (Method) (c2658 instanceof C2658 ? null : c2658);
        if (method == null) {
            return;
        }
        if (f9994.add(method.getDeclaringClass())) {
            method.setAccessible(true);
            m673(method, EnumC1543.f7679, new C0583(12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1323 m3873(Object obj) {
        Method method;
        Object c2658;
        Object obj2;
        Method method2;
        ArrayList arrayList;
        Object next;
        Object next2;
        Object c26582;
        String strOptString;
        String strOptString2;
        JSONObject jSONObjectOptJSONObject;
        String strOptString3;
        List list;
        Object c26583;
        Object next3;
        String strM4341 = AbstractC2328.m4341(-1056424088732526L);
        if (obj == null) {
            obj2 = null;
        } else {
            Method[] methods = obj.getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods[i];
                if (AbstractC1544.m3188(method.getName(), AbstractC2328.m4341(-1064107785225070L)) && method.getParameterTypes().length == 2 && AbstractC1544.m3188(method.getParameterTypes()[0], String.class)) {
                    break;
                }
                i++;
            }
            if (method != null) {
                try {
                    c2658 = method.invoke(obj, strM4341, null);
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (c2658 instanceof C2658) {
                    c2658 = null;
                }
                obj2 = c2658;
            } else {
                int length2 = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        method2 = null;
                        break;
                    }
                    method2 = methods[i2];
                    if (AbstractC1544.m3188(method2.getName(), AbstractC2328.m4341(-1064124965094254L)) && Arrays.equals(method2.getParameterTypes(), new Class[]{String.class})) {
                        break;
                    }
                    i2++;
                }
                if (method2 != null) {
                    try {
                        c2658 = method2.invoke(obj, strM4341);
                    } catch (Throwable th2) {
                        c2658 = new C2658(th2);
                    }
                    if (c2658 instanceof C2658) {
                    }
                    obj2 = c2658;
                }
                obj2 = null;
            }
        }
        String strM3869 = m3869(m3862(obj2, AbstractC2328.m4341(-1056467038405486L)), m3862(obj2, AbstractC2328.m4341(-1056509988078446L)), m3862(obj2, AbstractC2328.m4341(-1056535757882222L)));
        Map map = f9986;
        AbstractC2328.m4341(-1056574412587886L);
        synchronized (map) {
            Set<Map.Entry> setEntrySet = map.entrySet();
            arrayList = new ArrayList(AbstractC0055.m419(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                C0753 c0753 = (C0753) entry.getValue();
                String str = c0753.f3463;
                String str2 = c0753.f3464;
                long j = c0753.f3465;
                AbstractC2328.m4341(-1016601151964014L);
                AbstractC2328.m4341(-1016648396604270L);
                arrayList.add(new Pair(key, new C0753(j, str, str2)));
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Object objComponent1 = ((Pair) next).component1();
            C1988 c1988 = f9997;
            String strM43412 = AbstractC2328.m4341(-1056634542130030L);
            c1988.getClass();
            Object objM3862 = m3862(objComponent1, strM43412);
            String string = objM3862 != null ? objM3862.toString() : null;
            if (string == null) {
                string = AbstractC2328.m4341(-1056703261606766L);
            }
            if (!AbstractC0473.m1313(strM3869) && string.equals(strM3869)) {
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair == null) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next3 = it2.next();
                if (it2.hasNext()) {
                    long j2 = ((C0753) ((Pair) next3).getSecond()).f3465;
                    do {
                        Object next4 = it2.next();
                        long j3 = ((C0753) ((Pair) next4).getSecond()).f3465;
                        if (j2 < j3) {
                            next3 = next4;
                            j2 = j3;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next3 = null;
            }
            pair = (Pair) next3;
        }
        Object first = pair != null ? pair.getFirst() : null;
        C0753 c07532 = pair != null ? (C0753) pair.getSecond() : null;
        String str3 = c07532 != null ? c07532.f3463 : null;
        Object objM38622 = m3862(first, AbstractC2328.m4341(-1056707556574062L));
        String str4 = objM38622 instanceof String ? (String) objM38622 : null;
        Object objM38623 = m3862(first, AbstractC2328.m4341(-1056793455919982L));
        String str5 = objM38623 instanceof String ? (String) objM38623 : null;
        Object objM38624 = m3862(obj2, AbstractC2328.m4341(-1056870765331310L));
        String str6 = objM38624 instanceof String ? (String) objM38624 : null;
        Object objM38625 = m3862(obj2, AbstractC2328.m4341(-1056952369709934L));
        Iterator it3 = AbstractC2070.m3935(new String[]{str3, str4, str5, str6, objM38625 instanceof String ? (String) objM38625 : null}).iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            String str7 = (String) next2;
            if (str7 != null && !AbstractC0473.m1313(str7)) {
                break;
            }
        }
        String strM43413 = (String) next2;
        if (strM43413 == null) {
            strM43413 = AbstractC2328.m4341(-1057089808663406L);
        }
        String strM38692 = m3869(m3862(obj2, AbstractC2328.m4341(-1057094103630702L)), m3862(obj2, AbstractC2328.m4341(-1057132758336366L)), AbstractC2328.m4341(-1057192887878510L));
        Object objM38626 = m3862(obj2, AbstractC2328.m4341(-1057214362714990L));
        if (objM38626 == null) {
            objM38626 = m3862(obj2, AbstractC2328.m4341(-1057253017420654L));
        }
        String strM38693 = m3869(m3862(objM38626, AbstractC2328.m4341(-1057300262060910L)), m3862(objM38626, AbstractC2328.m4341(-1057351801668462L)), m3862(objM38626, AbstractC2328.m4341(-1057403341276014L)));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C1988 c19882 = f9997;
        String strM43414 = AbstractC2328.m4341(-1057459175850862L);
        c19882.getClass();
        m3852(arrayList3, strM43414, strM3869);
        m3852(arrayList3, AbstractC2328.m4341(-1057484945654638L), c19882.m3869(m3862(obj2, AbstractC2328.m4341(-1057527895327598L)), m3862(obj2, AbstractC2328.m4341(-1057592319837038L)), m3862(first, AbstractC2328.m4341(-1057643859444590L))));
        AbstractC0897.m2004(-1057734053757806L, obj2, arrayList3, AbstractC2328.m4341(-1057721168855918L));
        AbstractC0897.m2004(-1057789888332654L, obj2, arrayList3, AbstractC2328.m4341(-1057772708463470L));
        AbstractC0897.m2004(-1057862902776686L, obj2, arrayList3, AbstractC2328.m4341(-1057850017874798L));
        AbstractC0897.m2004(-1057953097089902L, obj2, arrayList3, AbstractC2328.m4341(-1057931622253422L));
        AbstractC0897.m2004(-1058017521599342L, obj2, arrayList3, AbstractC2328.m4341(-1057996046762862L));
        AbstractC0897.m2004(-1058103420945262L, obj2, arrayList3, AbstractC2328.m4341(-1058086241076078L));
        AbstractC0897.m2004(-1058176435389294L, obj2, arrayList3, AbstractC2328.m4341(-1058163550487406L));
        AbstractC0897.m2004(-1058253744800622L, obj2, arrayList3, AbstractC2328.m4341(-1058240859898734L));
        m3852(arrayList3, AbstractC2328.m4341(-1058296694473582L), m3853(m3862(obj2, AbstractC2328.m4341(-1058318169310062L))));
        m3852(arrayList3, AbstractC2328.m4341(-1058378298852206L), m3853(m3862(obj2, AbstractC2328.m4341(-1058399773688686L))));
        m3852(arrayList3, AbstractC2328.m4341(-1058472788132718L), m3862(obj2, AbstractC2328.m4341(-1058485673034606L)));
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            arrayList2.add(new C1653(AbstractC2328.m4341(-1058528622707566L), arrayList3));
        }
        ArrayList arrayList4 = new ArrayList();
        m3852(arrayList4, AbstractC2328.m4341(-1058541507609454L), strM38693);
        m3852(arrayList4, AbstractC2328.m4341(-1058554392511342L), c19882.m3869(m3862(obj2, AbstractC2328.m4341(-1058584457282414L)), m3862(obj2, AbstractC2328.m4341(-1058674651595630L)), m3862(obj2, AbstractC2328.m4341(-1058773435843438L)), m3862(objM38626, AbstractC2328.m4341(-1058824975450990L)), m3862(objM38626, AbstractC2328.m4341(-1058863630156654L))));
        AbstractC0897.m2004(-1058906579829614L, objM38626, arrayList4, AbstractC2328.m4341(-1058889399960430L));
        AbstractC0897.m2004(-1058983889240942L, obj2, arrayList4, AbstractC2328.m4341(-1058962414404462L));
        AbstractC0897.m2004(-1059061198652270L, obj2, arrayList4, AbstractC2328.m4341(-1059039723815790L));
        AbstractC0897.m2004(-1059151392965486L, obj2, arrayList4, AbstractC2328.m4341(-1059134213096302L));
        AbstractC0897.m2004(-1059224407409518L, obj2, arrayList4, AbstractC2328.m4341(-1059207227540334L));
        AbstractC0897.m2004(-1059301716820846L, obj2, arrayList4, AbstractC2328.m4341(-1059284536951662L));
        AbstractC0897.m2004(-1059387616166766L, obj2, arrayList4, AbstractC2328.m4341(-1059366141330286L));
        AbstractC0897.m2004(-1059477810479982L, obj2, arrayList4, AbstractC2328.m4341(-1059456335643502L));
        AbstractC0897.m2004(-1059572299760494L, obj2, arrayList4, AbstractC2328.m4341(-1059550824924014L));
        AbstractC0897.m2004(-1059675378975598L, obj2, arrayList4, AbstractC2328.m4341(-1059653904139118L));
        m3852(arrayList4, AbstractC2328.m4341(-1059735508517742L), m3862(obj2, AbstractC2328.m4341(-1059756983354222L)));
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        if (arrayList4 != null) {
            arrayList2.add(new C1653(AbstractC2328.m4341(-1059838587732846L), arrayList4));
        }
        ArrayList arrayList5 = new ArrayList();
        AbstractC0897.m2004(-1059890127340398L, first, arrayList5, AbstractC2328.m4341(-1059864357536622L));
        AbstractC0897.m2004(-1060001796490094L, first, arrayList5, AbstractC2328.m4341(-1059980321653614L));
        m3852(arrayList5, AbstractC2328.m4341(-1060070515966830L), c07532 != null ? c07532.f3464 : null);
        AbstractC0897.m2004(-1060139235443566L, first, arrayList5, AbstractC2328.m4341(-1060113465639790L));
        AbstractC0897.m2004(-1060238019691374L, first, arrayList5, AbstractC2328.m4341(-1060203659953006L));
        AbstractC0897.m2004(-1060366868710254L, first, arrayList5, AbstractC2328.m4341(-1060319624069998L));
        AbstractC0897.m2004(-1060461357990766L, first, arrayList5, AbstractC2328.m4341(-1060422703285102L));
        AbstractC0897.m2004(-1060551552303982L, first, arrayList5, AbstractC2328.m4341(-1060530077467502L));
        AbstractC0897.m2004(-1060628861715310L, first, arrayList5, AbstractC2328.m4341(-1060607386878830L));
        AbstractC0897.m2004(-1060723350995822L, first, arrayList5, AbstractC2328.m4341(-1060701876159342L));
        AbstractC0897.m2004(-1060813545309038L, first, arrayList5, AbstractC2328.m4341(-1060783480537966L));
        AbstractC0897.m2004(-1060908034589550L, first, arrayList5, AbstractC2328.m4341(-1060886559753070L));
        m3852(arrayList5, AbstractC2328.m4341(-1060955279229806L), m3853(m3862(first, AbstractC2328.m4341(-1060985344000878L))));
        if (arrayList5.isEmpty()) {
            arrayList5 = null;
        }
        if (arrayList5 != null) {
            arrayList2.add(new C1653(AbstractC2328.m4341(-1061109898052462L), arrayList5));
        }
        ArrayList arrayList6 = new ArrayList();
        AbstractC0897.m2004(-1061148552758126L, first, arrayList6, AbstractC2328.m4341(-1061127077921646L));
        m3852(arrayList6, AbstractC2328.m4341(-1061238747071342L), c07532 != null ? c07532.f3464 : null);
        C1860 c1860 = C1860.f9345;
        List listM3270 = c1860;
        if (!AbstractC0473.m1313(strM43413)) {
            try {
                c26582 = new JSONObject(strM43413);
            } catch (Throwable th3) {
                c26582 = new C2658(th3);
            }
            if (c26582 instanceof C2658) {
                c26582 = null;
            }
            JSONObject jSONObject = (JSONObject) c26582;
            listM3270 = c1860;
            if (jSONObject != null) {
                ArrayList arrayList7 = new ArrayList();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(AbstractC2328.m4341(-1063184367256430L));
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(AbstractC2328.m4341(-1063214432027502L))) != null && (strOptString3 = jSONObjectOptJSONObject.optString(AbstractC2328.m4341(-1063235906863982L))) != null) {
                    if (AbstractC0473.m1313(strOptString3)) {
                        strOptString3 = null;
                    }
                    if (strOptString3 != null) {
                        arrayList7.add(new Pair(AbstractC2328.m4341(-1063270266602350L), strOptString3));
                    }
                }
                if (jSONObjectOptJSONObject2 != null && (strOptString2 = jSONObjectOptJSONObject2.optString(AbstractC2328.m4341(-1063291741438830L))) != null) {
                    if (AbstractC0473.m1313(strOptString2)) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        arrayList7.add(new Pair(AbstractC2328.m4341(-1063321806209902L), strOptString2));
                    }
                }
                if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString(AbstractC2328.m4341(-1063343281046382L))) != null) {
                    if (AbstractC0473.m1313(strOptString)) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        arrayList7.add(new Pair(AbstractC2328.m4341(-1063364755882862L), strOptString));
                    }
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(AbstractC2328.m4341(-1063381935752046L));
                listM3270 = arrayList7;
                if (jSONObjectOptJSONObject3 != null) {
                    ListIterator listIterator = m3855(jSONObjectOptJSONObject3).listIterator(0);
                    while (true) {
                        C0368 c0368 = (C0368) listIterator;
                        if (!c0368.hasNext()) {
                            break;
                        }
                        String str8 = (String) c0368.next();
                        C1988 c19883 = f9997;
                        Object objOpt = jSONObjectOptJSONObject3.opt(str8);
                        c19883.getClass();
                        JSONObject jSONObjectM3860 = m3860(objOpt);
                        if (jSONObjectM3860 != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            m3865(jSONObjectM3860, linkedHashMap, 0);
                            if (!linkedHashMap.isEmpty()) {
                                String str9 = str8 + AbstractC2328.m4341(-1063403410588526L);
                                Set setEntrySet2 = linkedHashMap.entrySet();
                                AbstractC2328.m4341(-1063420590457710L);
                                arrayList7.add(new Pair(str9, AbstractC1595.m3285(setEntrySet2, AbstractC2328.m4341(-1063502194836334L), null, null, new C0583(15), 30)));
                            }
                            ArrayList arrayList8 = new ArrayList();
                            m3866(jSONObjectM3860, str8, arrayList8, 0);
                            arrayList7.addAll(arrayList8);
                        }
                    }
                    listM3270 = AbstractC1595.m3270(arrayList7);
                }
            }
        }
        arrayList6.addAll(listM3270);
        if (!AbstractC0473.m1313(strM43413)) {
            arrayList6.add(new Pair(AbstractC2328.m4341(-1061268811842414L), strM43413.length() + AbstractC2328.m4341(-1061328941384558L)));
        }
        String strM43415 = AbstractC2328.m4341(-1061384775959406L);
        boolean zIsEmpty = arrayList6.isEmpty();
        List listSingletonList = arrayList6;
        if (zIsEmpty) {
            listSingletonList = Collections.singletonList(new Pair(AbstractC2328.m4341(-1061410545763182L), AbstractC2328.m4341(-1061423430665070L)));
        }
        arrayList2.add(new C1653(strM43415, listSingletonList));
        Object objM38627 = m3862(obj2, AbstractC2328.m4341(-1061500740076398L));
        C1988 c19884 = f9997;
        boolean z = true;
        if (objM38627 == null) {
            list = C1860.f9345;
        } else {
            ArrayList arrayList9 = new ArrayList();
            Class<?> cls = objM38627.getClass();
            C1728 c1728 = new C1728();
            C0941 c0941 = new C0941(cls, c1728);
            c0941.f4335 = c1728;
            c1728.f8730 = c0941;
            while (c1728.hasNext()) {
                Field field = (Field) c1728.next();
                field.setAccessible(z);
                try {
                    c26583 = field.get(objM38627);
                } catch (Throwable th4) {
                    c26583 = new C2658(th4);
                }
                if (c26583 instanceof C2658) {
                    c26583 = null;
                }
                String name = field.getName();
                AbstractC2328.m4341(-1063957461369710L);
                String lowerCase = name.toLowerCase(Locale.ROOT);
                AbstractC2328.m4341(-1064013295944558L);
                if (c26583 instanceof String) {
                    if (AbstractC0473.m1301(lowerCase, AbstractC2328.m4341(-1064086310388590L), false)) {
                        c19884.getClass();
                        if (m3867((String) c26583)) {
                            arrayList9.add(new Pair(field.getName(), c26583));
                        }
                    }
                } else if (c26583 instanceof List) {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj3 : (Iterable) c26583) {
                        if (obj3 instanceof String) {
                            arrayList10.add(obj3);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj4 : arrayList10) {
                        c19884.getClass();
                        if (m3867((String) obj4)) {
                            arrayList11.add(obj4);
                        }
                    }
                    Iterator it4 = arrayList11.iterator();
                    int i3 = 0;
                    while (it4.hasNext()) {
                        Object next5 = it4.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC2725.m4853();
                            throw null;
                        }
                        arrayList9.add(new Pair(field.getName() + '[' + i3 + ']', (String) next5));
                        it4 = it4;
                        i3 = i4;
                    }
                } else {
                    continue;
                }
                z = true;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList12 = new ArrayList();
            for (Object obj5 : arrayList9) {
                if (hashSet.add((String) ((Pair) obj5).getSecond())) {
                    arrayList12.add(obj5);
                }
            }
            list = arrayList12;
        }
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            arrayList2.add(new C1653(AbstractC2328.m4341(-1061556574651246L), list));
        }
        ArrayList arrayList13 = new ArrayList();
        C1988 c19885 = f9997;
        String strM43416 = AbstractC2328.m4341(-1061603819291502L);
        String strM43417 = AbstractC2328.m4341(-1061625294127982L);
        c19885.getClass();
        m3852(arrayList13, strM43416, m3862(obj2, strM43417));
        AbstractC0897.m2004(-1061736963277678L, obj2, arrayList13, AbstractC2328.m4341(-1061711193473902L));
        AbstractC0897.m2004(-1061827157590894L, obj2, arrayList13, AbstractC2328.m4341(-1061805682754414L));
        m3852(arrayList13, AbstractC2328.m4341(-1061908761969518L), Boolean.valueOf(m3862(obj2, AbstractC2328.m4341(-1061930236805998L)) != null));
        m3852(arrayList13, AbstractC2328.m4341(-1061998956282734L), Boolean.valueOf(m3862(obj2, AbstractC2328.m4341(-1062020431119214L)) != null));
        m3852(arrayList13, AbstractC2328.m4341(-1062080560661358L), Boolean.valueOf(m3862(obj2, AbstractC2328.m4341(-1062102035497838L)) != null));
        m3852(arrayList13, AbstractC2328.m4341(-1062153575105390L), Boolean.valueOf(m3862(obj2, AbstractC2328.m4341(-1062170754974574L)) != null));
        m3852(arrayList13, AbstractC2328.m4341(-1062222294582126L), Boolean.valueOf(m3862(obj2, AbstractC2328.m4341(-1062243769418606L)) != null));
        AbstractC0897.m2004(-1062321078829934L, obj2, arrayList13, AbstractC2328.m4341(-1062295309026158L));
        AbstractC0897.m2004(-1062389798306670L, obj2, arrayList13, AbstractC2328.m4341(-1062364028502894L));
        AbstractC0897.m2004(-1062527237260142L, obj2, arrayList13, AbstractC2328.m4341(-1062479992619886L));
        AbstractC0897.m2004(-1062638906409838L, obj2, arrayList13, AbstractC2328.m4341(-1062583071834990L));
        AbstractC0897.m2004(-1062720510788462L, obj2, arrayList13, AbstractC2328.m4341(-1062699035951982L));
        m3852(arrayList13, AbstractC2328.m4341(-1062772050396014L), m3862(obj2, AbstractC2328.m4341(-1062793525232494L)));
        if (arrayList13.isEmpty()) {
            arrayList13 = null;
        }
        if (arrayList13 != null) {
            arrayList2.add(new C1653(AbstractC2328.m4341(-1062845064840046L), arrayList13));
        }
        String strM3858 = m3858(m3862(first, AbstractC2328.m4341(-1062870834643822L)));
        String strM38582 = m3858(m3862(first, AbstractC2328.m4341(-1062922374251374L)));
        ArrayList arrayList14 = new ArrayList();
        m3852(arrayList14, AbstractC2328.m4341(-1063068403139438L), strM3858);
        m3852(arrayList14, AbstractC2328.m4341(-1063094172943214L), strM38582);
        ArrayList arrayList15 = !arrayList14.isEmpty() ? arrayList14 : null;
        if (arrayList15 != null) {
            arrayList2.add(new C1653(AbstractC2328.m4341(-1063119942746990L), arrayList15));
        }
        String strM43418 = AbstractC2328.m4341(-1063141417583470L);
        List listM4854 = AbstractC2725.m4854(strM38692, strM38693);
        ArrayList arrayList16 = new ArrayList();
        for (Object obj6 : listM4854) {
            if (!AbstractC0473.m1313((String) obj6)) {
                arrayList16.add(obj6);
            }
        }
        return new C1323(strM43418, AbstractC1595.m3285(AbstractC1595.m3270(arrayList16), AbstractC2328.m4341(-1063167187387246L), null, null, null, 62), arrayList2, strM43413);
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public final void m3874(Class cls) {
        C1988 c1988;
        Object c2658;
        Object c26582;
        Method method;
        if (f9987.add(cls)) {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AbstractC2328.m4341(-1053524985807726L);
            int length = declaredConstructors.length;
            int i = 0;
            while (true) {
                c1988 = f9997;
                if (i < length) {
                    Constructor<?> constructor = declaredConstructors[i];
                    constructor.setAccessible(true);
                    c1988.m673(constructor, null, new C0583(18));
                    i++;
                } else {
                    try {
                        break;
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                }
            }
            C0757 c0757 = (C0757) f9990.getValue();
            if (c0757 != null) {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = m678();
                }
                c2658 = C0757.m1702(c0757, classLoader);
            } else {
                c2658 = null;
            }
            if (c2658 instanceof C2658) {
                c2658 = null;
            }
            Method method2 = (Method) c2658;
            if (method2 == null || !AbstractC1544.m3188(method2.getDeclaringClass(), cls)) {
                method2 = null;
            }
            if (method2 == null) {
                C2336.f11496.m4354(AbstractC2328.m4341(-1053649539859310L));
            } else {
                method2.setAccessible(true);
                m673(method2, EnumC1543.f7789, new C0583(19));
            }
            try {
                C0757 c07572 = (C0757) f9989.getValue();
                if (c07572 != null) {
                    ClassLoader classLoader2 = cls.getClassLoader();
                    if (classLoader2 == null) {
                        classLoader2 = m678();
                    }
                    c26582 = C0757.m1702(c07572, classLoader2);
                } else {
                    c26582 = null;
                }
            } catch (Throwable th2) {
                c26582 = new C2658(th2);
            }
            if (c26582 instanceof C2658) {
                c26582 = null;
            }
            Method method3 = (Method) c26582;
            if (method3 == null || !AbstractC1544.m3188(method3.getDeclaringClass(), cls)) {
                method3 = null;
            }
            if (method3 == null) {
                C2336.f11496.m4354(AbstractC2328.m4341(-1053774093910894L));
            } else {
                method3.setAccessible(true);
                m688(method3, EnumC1543.f7781, new C0583(8));
            }
            Method[] methods = cls.getMethods();
            AbstractC2328.m4341(-1053920122798958L);
            int length2 = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (AbstractC1544.m3188(method.getName(), AbstractC2328.m4341(-1053988842275694L)) && Arrays.equals(method.getParameterTypes(), new Class[]{String.class, String.class, Map.class}) && AbstractC1544.m3188(method.getReturnType(), Void.TYPE)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method != null) {
                method.setAccessible(true);
                c1988.m673(method, null, new C0583(9));
            }
            Method[] methods2 = cls.getMethods();
            AbstractC2328.m4341(-1054061856719726L);
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method4 : methods2) {
                if (AbstractC0068.m441(AbstractC2328.m4341(-1054130576196462L), AbstractC2328.m4341(-1054152051032942L)).contains(method4.getName())) {
                    Class<?>[] parameterTypes = method4.getParameterTypes();
                    AbstractC2328.m4341(-1054186410771310L);
                    if (parameterTypes.length == 0) {
                        arrayList.add(method4);
                    }
                }
            }
            for (Method method5 : arrayList) {
                method5.setAccessible(true);
                c1988.m673(method5, null, new C0583(10));
            }
        }
    }

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() {
        Object c2658;
        C1988 c1988;
        Object c26582;
        C2701.f13261.getClass();
        if (AbstractC1544.m3188(C2701.m4808(), C2701.m4804().packageName)) {
            ClassLoader classLoaderM678 = m678();
            String strM4341 = AbstractC2328.m4341(-1049058219819886L);
            m3871(classLoaderM678, (C0757) f9984.getValue(), (C0757) f9988.getValue(), strM4341);
            String str = (String) f9996.getValue();
            if (str == null) {
                C2336.f11496.m4354(AbstractC2328.m4341(-1049526371255150L));
            } else {
                try {
                    c2658 = Class.forName(str, false, classLoaderM678);
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (!(c2658 instanceof C2658)) {
                    m3874((Class) c2658);
                }
                if (C2248.m4249(c2658) != null) {
                    C2336.f11496.m4354(AbstractC2328.m4341(-1049612270601070L) + strM4341 + AbstractC2328.m4341(-1049655220274030L));
                }
            }
            Iterator it = AbstractC2725.m4854(AbstractC2328.m4341(-1049702464914286L), AbstractC2328.m4341(-1049921508246382L)).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c1988 = f9997;
                if (!zHasNext) {
                    break;
                }
                try {
                    c26582 = Class.forName((String) it.next(), false, classLoaderM678);
                } catch (Throwable th2) {
                    c26582 = new C2658(th2);
                }
                Class cls = (Class) (c26582 instanceof C2658 ? null : c26582);
                if (cls != null) {
                    c1988.m3870(cls);
                }
            }
            m3872(classLoaderM678);
            String strM43412 = AbstractC2328.m4341(-1049118349362030L);
            String strM43413 = AbstractC2328.m4341(-1049298737988462L);
            try {
                Class clsM2792 = AbstractC1371.m2792(strM43412, null, 3);
                if (clsM2792 == null) {
                    AbstractC0145.m667(AbstractC2328.m4341(-1049337392694126L) + strM43412);
                    return;
                }
                int i = AbstractC2293.f11258;
                C2014 c2014M1326 = AbstractC0476.m1326(clsM2792);
                ((C0903) c2014M1326.f10074).f4118 = 2;
                C1189 c1189M3892 = c2014M1326.m3892();
                c1189M3892.m4478();
                c1189M3892.m2391(EnumC2298.f11300);
                c1189M3892.f12003 = AbstractC2328.m4341(-1049414702105454L);
                c1189M3892.m4189(Arrays.copyOf(new Object[]{AbstractC1700.m3448(String.class)}, 1));
                c1189M3892.f5455 = AbstractC1700.m3448(Class.class);
                C0536 c0536 = (C0536) AbstractC1595.m3280(c1189M3892.mo736());
                c1988.getClass();
                AbstractC2328.m4341(-989955174859630L);
                if (c0536 == null) {
                    C2336.f11496.m4359(AbstractC2328.m4341(-989976649696110L));
                } else {
                    C0213 c0213 = new C0213();
                    AbstractC2328.m4341(-1065082742801262L);
                    c0213.m870(new C0583(11));
                    c1988.m682(c0536.f2572, null, new C0052(26, c0213));
                }
                C1329 c1329 = C1329.f6114;
            } catch (Exception e) {
                C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-1049457651778414L)), strM43412, -1049496306484078L), e);
                AbstractC2104.m4010(strM43412, strM43413, C1329.f6115);
            }
        }
    }
}
