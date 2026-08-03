package Yue;

import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4042 extends C4041 {
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final <T> T m11454(T t, T t2, T t3, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(comparator, "comparator");
        return (T) m11455(t, m11455(t2, t3, comparator), comparator);
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final <T> T m11455(T t, T t2, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(comparator, "comparator");
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final <T> T m11456(T t, @InterfaceC6399 T[] tArr, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(tArr, "other");
        C5499.m17103(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final <T> T m11457(T t, T t2, T t3, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(comparator, "comparator");
        return (T) m11458(t, m11458(t2, t3, comparator), comparator);
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final <T> T m11458(T t, T t2, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(comparator, "comparator");
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final <T> T m11459(T t, @InterfaceC6399 T[] tArr, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(tArr, "other");
        C5499.m17103(comparator, "comparator");
        for (T t2 : tArr) {
            if (comparator.compare(t, t2) > 0) {
                t = t2;
            }
        }
        return t;
    }
}
