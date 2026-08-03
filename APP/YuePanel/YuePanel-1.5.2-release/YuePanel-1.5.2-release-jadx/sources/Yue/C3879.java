package Yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public class C3879 {
    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static <E> List<E> m917(@InterfaceC6399 List<E> list) {
        C5499.m17103(list, "builder");
        return ((C5723) list).m17707();
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E> List<E> m918(int i, InterfaceC5124<? super List<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        List listM10714 = m10714(i);
        interfaceC5124.invoke(listM10714);
        return m917(listM10714);
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> List<E> m10707(InterfaceC5124<? super List<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        List listM10713 = m10713();
        interfaceC5124.invoke(listM10713);
        return m917(listM10713);
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m10708(int i) {
        if (i < 0) {
            if (!C6671.m3162(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            C3880.m10752();
        }
        return i;
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m10709(int i) {
        if (i < 0) {
            if (!C6671.m3162(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            C3880.m10753();
        }
        return i;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Object[] m10710(Collection<?> collection) {
        C5499.m17103(collection, "collection");
        return C3876.m913(collection);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> T[] m10711(Collection<?> collection, T[] tArr) {
        C5499.m17103(collection, "collection");
        C5499.m17103(tArr, "array");
        return (T[]) C3876.m914(collection, tArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Object[] m10712(@InterfaceC6399 T[] tArr, boolean z) {
        C5499.m17103(tArr, "<this>");
        if (z && C5499.m17094(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C5499.m17102(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static <E> List<E> m10713() {
        return new C5723();
    }

    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static <E> List<E> m10714(int i) {
        return new C5723(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> List<T> m10715(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        C5499.m17102(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> List<T> m10716(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        List<T> listM11064 = C3888.m11064(iterable);
        Collections.shuffle(listM11064);
        return listM11064;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> List<T> m10717(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Random random) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(random, "random");
        List<T> listM11064 = C3888.m11064(iterable);
        Collections.shuffle(listM11064, random);
        return listM11064;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> List<T> m10718(Enumeration<T> enumeration) {
        C5499.m17103(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        C5499.m17102(list, "list(this)");
        return list;
    }
}
