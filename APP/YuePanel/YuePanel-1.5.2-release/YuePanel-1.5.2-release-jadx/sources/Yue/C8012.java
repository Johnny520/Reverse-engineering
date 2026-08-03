package Yue;

import Yue.InterfaceC5597;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8012 {
    /* JADX INFO: renamed from: ۥ */
    public static Collection m4026(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5592)) {
            m25287(obj, "kotlin.collections.MutableCollection");
        }
        return m25267(obj);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Collection m4027(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5592)) {
            m25288(str);
        }
        return m25267(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Iterable m25251(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5593)) {
            m25287(obj, "kotlin.collections.MutableIterable");
        }
        return m25268(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Iterable m25252(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5593)) {
            m25288(str);
        }
        return m25268(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Iterator m25253(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5594)) {
            m25287(obj, "kotlin.collections.MutableIterator");
        }
        return m25269(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Iterator m25254(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5594)) {
            m25288(str);
        }
        return m25269(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static List m25255(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5595)) {
            m25287(obj, "kotlin.collections.MutableList");
        }
        return m25270(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static List m25256(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5595)) {
            m25288(str);
        }
        return m25270(obj);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static ListIterator m25257(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5596)) {
            m25287(obj, "kotlin.collections.MutableListIterator");
        }
        return m25271(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static ListIterator m25258(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5596)) {
            m25288(str);
        }
        return m25271(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Map m25259(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5597)) {
            m25287(obj, "kotlin.collections.MutableMap");
        }
        return m25272(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Map m25260(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5597)) {
            m25288(str);
        }
        return m25272(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static Map.Entry m25261(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5597.InterfaceC0801)) {
            m25287(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m25273(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static Map.Entry m25262(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5597.InterfaceC0801)) {
            m25288(str);
        }
        return m25273(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static Set m25263(Object obj) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5602)) {
            m25287(obj, "kotlin.collections.MutableSet");
        }
        return m25274(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static Set m25264(Object obj, String str) {
        if ((obj instanceof InterfaceC5591) && !(obj instanceof InterfaceC5602)) {
            m25288(str);
        }
        return m25274(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Object m25265(Object obj, int i) {
        if (obj != null && !m25276(obj, i)) {
            m25287(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static Object m25266(Object obj, int i, String str) {
        if (obj != null && !m25276(obj, i)) {
            m25288(str);
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static Collection m25267(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static Iterable m25268(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static Iterator m25269(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static List m25270(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static ListIterator m25271(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static Map m25272(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static Map.Entry m25273(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static Set m25274(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m25286(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static int m25275(Object obj) {
        if (obj instanceof InterfaceC5149) {
            return ((InterfaceC5149) obj).getArity();
        }
        if (obj instanceof InterfaceC5122) {
            return 0;
        }
        if (obj instanceof InterfaceC5124) {
            return 1;
        }
        if (obj instanceof InterfaceC5138) {
            return 2;
        }
        if (obj instanceof InterfaceC5140) {
            return 3;
        }
        if (obj instanceof InterfaceC5141) {
            return 4;
        }
        if (obj instanceof InterfaceC5142) {
            return 5;
        }
        if (obj instanceof InterfaceC5143) {
            return 6;
        }
        if (obj instanceof InterfaceC5144) {
            return 7;
        }
        if (obj instanceof InterfaceC5145) {
            return 8;
        }
        if (obj instanceof InterfaceC5146) {
            return 9;
        }
        if (obj instanceof InterfaceC5123) {
            return 10;
        }
        if (obj instanceof InterfaceC5125) {
            return 11;
        }
        if (obj instanceof InterfaceC5126) {
            return 12;
        }
        if (obj instanceof InterfaceC5127) {
            return 13;
        }
        if (obj instanceof InterfaceC5128) {
            return 14;
        }
        if (obj instanceof InterfaceC5129) {
            return 15;
        }
        if (obj instanceof InterfaceC5130) {
            return 16;
        }
        if (obj instanceof InterfaceC5131) {
            return 17;
        }
        if (obj instanceof InterfaceC5132) {
            return 18;
        }
        if (obj instanceof InterfaceC5133) {
            return 19;
        }
        if (obj instanceof InterfaceC5135) {
            return 20;
        }
        if (obj instanceof InterfaceC5136) {
            return 21;
        }
        return obj instanceof InterfaceC5137 ? 22 : -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m25276(Object obj, int i) {
        return (obj instanceof InterfaceC5139) && m25275(obj) == i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static boolean m25277(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5592));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static boolean m25278(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5593));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static boolean m25279(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5594));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static boolean m25280(Object obj) {
        return (obj instanceof List) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5595));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static boolean m25281(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5596));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static boolean m25282(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5597));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static boolean m25283(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5597.InterfaceC0801));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static boolean m25284(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof InterfaceC5591) || (obj instanceof InterfaceC5602));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static <T extends Throwable> T m25285(T t) {
        return (T) C5499.m17115(t, C8012.class.getName());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static ClassCastException m25286(ClassCastException classCastException) {
        throw ((ClassCastException) m25285(classCastException));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static void m25287(Object obj, String str) {
        m25288((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m25288(String str) {
        throw m25286(new ClassCastException(str));
    }
}
