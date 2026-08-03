package Yue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3884 extends C3883 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final <T> void m10764(List<T> list, T t) {
        C5499.m17103(list, "<this>");
        Collections.fill(list, t);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final <T> void m10765(List<T> list) {
        C5499.m17103(list, "<this>");
        Collections.shuffle(list);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final <T> void m10766(List<T> list, Random random) {
        C5499.m17103(list, "<this>");
        C5499.m17103(random, "random");
        Collections.shuffle(list, random);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static <T extends Comparable<? super T>> void m10767(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8971, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @InterfaceC7097(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final <T> void m10768(List<T> list, InterfaceC5138<? super T, ? super T, Integer> interfaceC5138) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5138, "comparison");
        throw new C6398(null, 1, null);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8971, message = "Use sortWith(comparator) instead.", replaceWith = @InterfaceC7097(expression = "this.sortWith(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <T> void m10769(List<T> list, Comparator<? super T> comparator) {
        C5499.m17103(list, "<this>");
        C5499.m17103(comparator, "comparator");
        throw new C6398(null, 1, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static <T> void m10770(@InterfaceC6399 List<T> list, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(list, "<this>");
        C5499.m17103(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
