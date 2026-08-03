package Yue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: Yue.ۥۡۨۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7386 {
    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static <E> Set<E> m3593(@InterfaceC6399 Set<E> set) {
        C5499.m17103(set, "builder");
        return ((C7381) set).m3590();
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E> Set<E> m3594(int i, InterfaceC5124<? super Set<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Set setM23119 = m23119(i);
        interfaceC5124.invoke(setM23119);
        return m3593(setM23119);
    }

    @InterfaceC5438
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> Set<E> m23117(InterfaceC5124<? super Set<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        Set setM23118 = m23118();
        interfaceC5124.invoke(setM23118);
        return m3593(setM23118);
    }

    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> Set<E> m23118() {
        return new C7381();
    }

    @InterfaceC6399
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <E> Set<E> m23119(int i) {
        return new C7381(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static <T> Set<T> m23120(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        C5499.m17102(setSingleton, "singleton(element)");
        return setSingleton;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> TreeSet<T> m23121(@InterfaceC6399 Comparator<? super T> comparator, @InterfaceC6399 T... tArr) {
        C5499.m17103(comparator, "comparator");
        C5499.m17103(tArr, "elements");
        return (TreeSet) C3411.m8905(tArr, new TreeSet(comparator));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> TreeSet<T> m23122(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return (TreeSet) C3411.m8905(tArr, new TreeSet());
    }
}
