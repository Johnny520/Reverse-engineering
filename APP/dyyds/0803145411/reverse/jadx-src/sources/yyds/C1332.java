package yyds;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛶᛵᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1332 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static volatile Field f6151;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static volatile Field f6152;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static volatile Class f6153;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static volatile Field f6154;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static volatile Constructor f6156;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static volatile Method f6158;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static volatile Method f6159;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static volatile Field f6160;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static volatile Field f6162;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static volatile Field f6163;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static volatile Field f6164;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static volatile C2219 f6165;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static volatile Method f6166;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static volatile Method f6167;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static volatile Method f6168;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static volatile Method f6169;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static volatile Class f6170;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static volatile Field f6171;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static volatile Field f6173;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static volatile Field f6176;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1332 f6157 = new C1332();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Handler f6161 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final Object f6172 = new Object();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0255 f6175 = new C0255(128, 0.75f, true);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final Map f6155 = AbstractC0897.m1993();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Map f6174 = AbstractC0897.m1993();

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static Comment m2725(Object obj) {
        Comment c2658;
        Class cls = f6153;
        if (cls == null || !cls.isInstance(obj)) {
            return null;
        }
        try {
            Field field = f6151;
            Object obj2 = field != null ? field.get(obj) : null;
            c2658 = obj2 instanceof Comment ? (Comment) obj2 : null;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        return c2658 instanceof C2658 ? null : c2658;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2726(Object obj, C1783 c1783, Object obj2, String str) {
        C1783 c17832;
        boolean z;
        Method method;
        Object objM2738;
        Map map = f6155;
        AbstractC2328.m4341(-795071033803630L);
        synchronized (map) {
            c17832 = (C1783) map.get(obj);
        }
        if (c17832 == c1783) {
            synchronized (c1783) {
                if (c1783.f8984.equals(str)) {
                    z = c1783.f8987.get() == obj2;
                }
            }
            if (z && (method = f6159) != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC2328.m4341(-795139753280366L);
                Class cls = (Class) AbstractC2070.m3941(parameterTypes);
                if (cls != null && (objM2738 = m2738(obj, cls)) != null && objM2738 == obj2) {
                    Comment commentM2725 = m2725(objM2738);
                    return AbstractC1544.m3188(commentM2725 != null ? m2734(commentM2725.cid) : null, str);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static Object m2727(Field field, Object obj) {
        Object c2658;
        if (field == null) {
            return null;
        }
        try {
            field.setAccessible(true);
            c2658 = field.get(obj);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            return null;
        }
        return c2658;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static boolean m2728(String str) {
        boolean z;
        synchronized (f6172) {
            C1047 c1047 = (C1047) f6175.get(str);
            z = false;
            if (c1047 != null) {
                if (c1047.f4753) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static List m2729(List list) {
        Comment c2658;
        Comment comment;
        Object c26582;
        Integer num;
        AbstractC2328.m4341(-793675169432430L);
        if (!list.isEmpty()) {
            C2219 c2219M2736 = m2736();
            m2739(c2219M2736);
            if (c2219M2736.m4209()) {
                ArrayList arrayList = new ArrayList(list.size());
                boolean z = false;
                for (Object obj : list) {
                    Comment commentM2725 = m2725(obj);
                    if (commentM2725 != null) {
                        String strM2734 = m2734(commentM2725.cid);
                        if (m2735(commentM2725, c2219M2736) || (strM2734 != null && m2728(strM2734))) {
                            z = true;
                        } else {
                            arrayList.add(obj);
                        }
                    } else {
                        Class cls = f6170;
                        if (cls != null && cls.isInstance(obj)) {
                            try {
                                Method method = f6168;
                                Object objInvoke = method != null ? method.invoke(obj, null) : null;
                                c2658 = objInvoke instanceof Comment ? (Comment) objInvoke : null;
                            } catch (Throwable th) {
                                c2658 = new C2658(th);
                            }
                            if (c2658 instanceof C2658) {
                                c2658 = null;
                            }
                            comment = c2658;
                        } else {
                            comment = null;
                        }
                        if (comment == null) {
                            arrayList.add(obj);
                        } else {
                            Class cls2 = f6170;
                            if (cls2 != null && cls2.isInstance(obj)) {
                                try {
                                    Method method2 = f6169;
                                    Object objInvoke2 = method2 != null ? method2.invoke(obj, null) : null;
                                    c26582 = objInvoke2 instanceof Integer ? (Integer) objInvoke2 : null;
                                } catch (Throwable th2) {
                                    c26582 = new C2658(th2);
                                }
                                if (c26582 instanceof C2658) {
                                    c26582 = null;
                                }
                                num = (Integer) c26582;
                            } else {
                                num = null;
                            }
                            C1332 c1332 = f6157;
                            if ((num != null && num.intValue() == 1) || ((num == null || num.intValue() != 2) && ((num == null || num.intValue() != 306) && c1332.m2740(comment) == null))) {
                                String strM27342 = m2734(comment.cid);
                                boolean zM2735 = m2735(comment, c2219M2736);
                                if (strM27342 != null) {
                                    synchronized (f6172) {
                                        try {
                                            C0255 c0255 = f6175;
                                            C1047 c1047 = (C1047) c0255.get(strM27342);
                                            c0255.put(strM27342, new C1047(zM2735, c1047 != null ? c1047.f4754 : null));
                                        } finally {
                                        }
                                    }
                                }
                                if (zM2735) {
                                    z = true;
                                } else {
                                    arrayList.add(obj);
                                }
                            } else {
                                String strM2740 = c1332.m2740(comment);
                                if (m2735(comment, c2219M2736) || (strM2740 != null && m2728(strM2740))) {
                                    z = true;
                                } else {
                                    if (strM2740 != null) {
                                        synchronized (f6172) {
                                            try {
                                                C0255 c02552 = f6175;
                                                C1047 c10472 = (C1047) c02552.get(strM2740);
                                                c02552.put(strM2740, new C1047(c10472 != null ? c10472.f4753 : false, Boolean.TRUE));
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        m2737(strM2740);
                                    }
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                }
                if (z) {
                    C2336.f11496.m4354(AbstractC2328.m4341(-793696644268910L) + list.size() + AbstractC2328.m4341(-793795428516718L) + arrayList.size());
                    return arrayList;
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2730(Object obj) {
        C1783 c1783;
        Map map = f6155;
        AbstractC2328.m4341(-794658716943214L);
        synchronized (map) {
            c1783 = (C1783) map.remove(obj);
        }
        if (c1783 != null) {
            m2731(c1783, false);
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static void m2731(C1783 c1783, boolean z) {
        synchronized (c1783) {
            try {
                c1783.f8982 = false;
                c1783.f8988 = 3;
                c1783.f8985 = false;
                c1783.f8980 = false;
                if (z) {
                    c1783.f8981 = false;
                }
                c1783.f8986++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m2732(Field field, Field field2, Class cls, Method method, Method method2, Class cls2, Field field3, Method method3, Field field4, Field field5, Field field6, Field field7, Method method4, Method method5, Method method6, Field field8, Constructor constructor, Field field9, Field field10) {
        Field field11;
        Field field12 = field;
        Field field13 = field2;
        Method method7 = method;
        Method method8 = method2;
        Field field14 = field3;
        Method method9 = method3;
        Field field15 = field4;
        Field field16 = field5;
        Field field17 = field6;
        Field field18 = field7;
        Method method10 = method4;
        Method method11 = method5;
        Method method12 = method6;
        Field field19 = field8;
        Constructor constructor2 = constructor;
        if (field12 != null) {
            field12.setAccessible(true);
        } else {
            field12 = null;
        }
        f6152 = field12;
        if (field13 != null) {
            field13.setAccessible(true);
        } else {
            field13 = null;
        }
        f6154 = field13;
        f6170 = cls;
        if (method7 != null) {
            method7.setAccessible(true);
        } else {
            method7 = null;
        }
        f6168 = method7;
        if (method8 != null) {
            method8.setAccessible(true);
        } else {
            method8 = null;
        }
        f6169 = method8;
        f6153 = cls2;
        if (field14 != null) {
            field14.setAccessible(true);
        } else {
            field14 = null;
        }
        f6151 = field14;
        if (method9 != null) {
            method9.setAccessible(true);
        } else {
            method9 = null;
        }
        f6159 = method9;
        if (field15 != null) {
            field15.setAccessible(true);
        } else {
            field15 = null;
        }
        f6173 = field15;
        if (field16 != null) {
            field16.setAccessible(true);
        } else {
            field16 = null;
        }
        f6164 = field16;
        if (field17 != null) {
            field17.setAccessible(true);
        } else {
            field17 = null;
        }
        f6160 = field17;
        if (field18 != null) {
            field18.setAccessible(true);
        } else {
            field18 = null;
        }
        f6171 = field18;
        if (method10 != null) {
            method10.setAccessible(true);
        } else {
            method10 = null;
        }
        f6158 = method10;
        if (method11 != null) {
            method11.setAccessible(true);
        } else {
            method11 = null;
        }
        f6167 = method11;
        if (method12 != null) {
            method12.setAccessible(true);
        } else {
            method12 = null;
        }
        f6166 = method12;
        if (field19 != null) {
            field19.setAccessible(true);
        } else {
            field19 = null;
        }
        f6163 = field19;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        } else {
            constructor2 = null;
        }
        f6156 = constructor2;
        if (field9 != null) {
            field11 = field9;
            field11.setAccessible(true);
        } else {
            field11 = null;
        }
        f6176 = field11;
        Field field20 = field10;
        if (field20 != null) {
            field20.setAccessible(true);
        } else {
            field20 = null;
        }
        f6162 = field20;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m2733(Object obj, C1783 c1783, Object obj2, String str) {
        Method method;
        Method method2;
        Class cls;
        Object objM2738;
        Object c2658;
        int iIntValue;
        Object c26582;
        if (!m2726(obj, c1783, obj2, str) || (method = f6167) == null || (method2 = f6166) == null) {
            return;
        }
        Class<?> declaringClass = method2.getDeclaringClass();
        AbstractC2328.m4341(-794315119559534L);
        Object objM27382 = m2738(obj, declaringClass);
        if (objM27382 == null || (cls = f6153) == null || (objM2738 = m2738(objM27382, cls)) == null) {
            return;
        }
        Comment commentM2725 = m2725(objM2738);
        String strM2734 = commentM2725 != null ? m2734(commentM2725.cid) : null;
        if (objM2738 == obj2 && AbstractC1544.m3188(strM2734, str)) {
            try {
                Object objInvoke = method.invoke(objM27382, null);
                c2658 = objInvoke instanceof Integer ? (Integer) objInvoke : null;
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Integer num = (Integer) (c2658 instanceof C2658 ? null : c2658);
            if (num == null || (iIntValue = num.intValue()) == 4) {
                return;
            }
            try {
                method2.invoke(objM27382, 4);
                Map map = f6174;
                AbstractC2328.m4341(-794413903807342L);
                map.put(obj2, new C2533(str, iIntValue, new WeakReference(objM27382)));
                c26582 = C2746.f13459;
            } catch (Throwable th2) {
                c26582 = new C2658(th2);
            }
            Throwable thM4249 = C2248.m4249(c26582);
            if (thM4249 != null) {
                C2336.f11496.m4355(AbstractC2328.m4341(-794495508185966L), thM4249);
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static String m2734(String str) {
        String string;
        if (str == null || (string = AbstractC0473.m1314(str).toString()) == null || string.length() <= 0 || string.equals(AbstractC2328.m4341(-795049558967150L)) || string.equals(AbstractC2328.m4341(-795058148901742L))) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static boolean m2735(Comment comment, C2219 c2219) {
        if (c2219.f10978 && comment.getClass().getName().equals(AbstractC2328.m4341(-794796155896686L))) {
            return true;
        }
        String str = comment.text;
        if (str != null) {
            Set set = c2219.f10977;
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (AbstractC0473.m1301(str, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C2219 m2736() {
        C1509.f7142.getClass();
        return new C2219(AbstractC1529.m3154(AbstractC1529.m3163(new C1125(new C0558(1, (Set) C1509.f7199.m1579(C1509.f7179[79])), C0543.f2599), C1398.f6524)), C1509.m3129());
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static void m2737(String str) {
        ArrayList arrayList;
        Map map = f6174;
        AbstractC2328.m4341(-795238537528174L);
        synchronized (map) {
            try {
                Set setEntrySet = map.entrySet();
                ArrayList<Map.Entry> arrayList2 = new ArrayList();
                for (Object obj : setEntrySet) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (str == null || ((C2533) entry.getValue()).f12472.equals(str)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC0055.m419(arrayList2, 10));
                for (Map.Entry entry2 : arrayList2) {
                    arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f6174.remove(((Pair) it.next()).component1());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        RunnableC0309 runnableC0309 = new RunnableC0309(2, arrayList);
        if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC0309.run();
        } else {
            f6161.post(runnableC0309);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static Object m2738(Object obj, Class cls) {
        Object objM2727;
        C1119 c1119 = new C1119(AbstractC1529.m3160(new C2722(AbstractC1529.m3159(obj.getClass(), new C0061(26)), new C0061(27), 2), new C0061(28)));
        while (c1119.hasNext()) {
            Field field = (Field) c1119.next();
            if (!Modifier.isStatic(field.getModifiers()) && (objM2727 = m2727(field, obj)) != null && cls.isInstance(objM2727)) {
                return objM2727;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m2739(C2219 c2219) {
        boolean z;
        if (AbstractC1544.m3188(f6165, c2219)) {
            return;
        }
        synchronized (f6172) {
            if (AbstractC1544.m3188(f6165, c2219)) {
                z = false;
            } else {
                f6165 = c2219;
                f6175.clear();
                z = true;
            }
        }
        if (z) {
            Map map = f6155;
            AbstractC2328.m4341(-794727436419950L);
            synchronized (map) {
                map.clear();
            }
            m2737(null);
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final String m2740(Comment comment) {
        Object next;
        String strM2734 = m2734(comment.cid);
        C1119 c1119 = new C1119(AbstractC1529.m3164(AbstractC2070.m3935(new String[]{comment.replyId, comment.rootCommentId}), new C2635(1, this, C1332.class, AbstractC2328.m4341(-611074634842990L), AbstractC2328.m4341(-611160534188910L), 0, 7)));
        while (true) {
            if (!c1119.hasNext()) {
                next = null;
                break;
            }
            next = c1119.next();
            if (!AbstractC1544.m3188((String) next, strM2734)) {
                break;
            }
        }
        return (String) next;
    }
}
