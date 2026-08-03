package Yue;

import Yue.C2954;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
public class C5222 extends C5221 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T, K, R> Map<K, R> m15985(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 InterfaceC5141<? super K, ? super R, ? super T, ? super Boolean, ? extends R> interfaceC5141) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(interfaceC5141, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            ?? next = itMo501.next();
            Object objMo500 = interfaceC5218.mo500(next);
            C2954.C0002 c0002 = (Object) linkedHashMap.get(objMo500);
            linkedHashMap.put(objMo500, interfaceC5141.mo15381(objMo500, c0002, next, Boolean.valueOf(c0002 == null && !linkedHashMap.containsKey(objMo500))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T, K, R, M extends Map<? super K, R>> M m15986(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5141<? super K, ? super R, ? super T, ? super Boolean, ? extends R> interfaceC5141) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5141, "operation");
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            ?? next = itMo501.next();
            Object objMo500 = interfaceC5218.mo500(next);
            C2954.C0002 c0002 = (Object) m.get(objMo500);
            m.put(objMo500, interfaceC5141.mo15381(objMo500, c0002, next, Boolean.valueOf(c0002 == null && !m.containsKey(objMo500))));
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T, K, M extends Map<? super K, Integer>> M m15987(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 M m) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(m, "destination");
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            K kMo500 = interfaceC5218.mo500(itMo501.next());
            Object obj = m.get(kMo500);
            if (obj == null && !m.containsKey(kMo500)) {
                obj = 0;
            }
            m.put(kMo500, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T, K, R> Map<K, R> m15988(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 InterfaceC5138<? super K, ? super T, ? extends R> interfaceC5138, @InterfaceC6399 InterfaceC5140<? super K, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(interfaceC5138, "initialValueSelector");
        C5499.m17103(interfaceC5140, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            ?? next = itMo501.next();
            Object objMo500 = interfaceC5218.mo500(next);
            R rInvoke = (Object) linkedHashMap.get(objMo500);
            if (rInvoke == null && !linkedHashMap.containsKey(objMo500)) {
                rInvoke = interfaceC5138.invoke(objMo500, next);
            }
            linkedHashMap.put(objMo500, interfaceC5140.mo15350(objMo500, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T, K, R> Map<K, R> m15989(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            ?? next = itMo501.next();
            K kMo500 = interfaceC5218.mo500(next);
            C2954.C0003 c0003 = (Object) linkedHashMap.get(kMo500);
            if (c0003 == null && !linkedHashMap.containsKey(kMo500)) {
                c0003 = (Object) r;
            }
            linkedHashMap.put(kMo500, interfaceC5138.invoke(c0003, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T, K, R, M extends Map<? super K, R>> M m15990(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5138<? super K, ? super T, ? extends R> interfaceC5138, @InterfaceC6399 InterfaceC5140<? super K, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5138, "initialValueSelector");
        C5499.m17103(interfaceC5140, "operation");
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            ?? next = itMo501.next();
            Object objMo500 = interfaceC5218.mo500(next);
            R rInvoke = (Object) m.get(objMo500);
            if (rInvoke == null && !m.containsKey(objMo500)) {
                rInvoke = interfaceC5138.invoke(objMo500, next);
            }
            m.put(objMo500, interfaceC5140.mo15350(objMo500, rInvoke, next));
        }
        return m;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T, K, R, M extends Map<? super K, R>> M m15991(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 M m, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            ?? next = itMo501.next();
            K kMo500 = interfaceC5218.mo500(next);
            C2954.C0003 c0003 = (Object) m.get(kMo500);
            if (c0003 == null && !m.containsKey(kMo500)) {
                c0003 = (Object) r;
            }
            m.put(kMo500, interfaceC5138.invoke(c0003, next));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Yue.ۥ۠ۤ۟۟<T extends S, ? extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <S, T extends S, K> Map<K, S> m15992(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 InterfaceC5140<? super K, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            S sMo15350 = (Object) itMo501.next();
            Object objMo500 = interfaceC5218.mo500(sMo15350);
            C2954.C0002 c0002 = (Object) linkedHashMap.get(objMo500);
            if (!(c0002 == null && !linkedHashMap.containsKey(objMo500))) {
                sMo15350 = interfaceC5140.mo15350(objMo500, c0002, sMo15350);
            }
            linkedHashMap.put(objMo500, sMo15350);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Yue.ۥ۠ۤ۟۟<T extends S, ? extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <S, T extends S, K, M extends Map<? super K, S>> M m15993(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5140<? super K, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(interfaceC5218, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5140, "operation");
        Iterator itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            S sMo15350 = (Object) itMo501.next();
            Object objMo500 = interfaceC5218.mo500(sMo15350);
            C2954.C0002 c0002 = (Object) m.get(objMo500);
            if (!(c0002 == null && !m.containsKey(objMo500))) {
                sMo15350 = interfaceC5140.mo15350(objMo500, c0002, sMo15350);
            }
            m.put(objMo500, sMo15350);
        }
        return m;
    }
}
