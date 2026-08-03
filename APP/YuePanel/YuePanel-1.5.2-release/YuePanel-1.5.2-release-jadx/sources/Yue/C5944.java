package Yue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5944 extends C5943 {
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m18648(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        Map.Entry<K, V> entry;
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = interfaceC5124.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = interfaceC5124.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final /* synthetic */ <K, V> Map.Entry<K, V> m18649(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        return (Map.Entry) C3888.m10958(map.entrySet(), comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m18650(Map<? extends K, ? extends V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        Map.Entry<K, V> entry;
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = interfaceC5124.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = interfaceC5124.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final /* synthetic */ Map.Entry m18651(Map map, Comparator comparator) {
        C5499.m17103(map, "<this>");
        C5499.m17103(comparator, "comparator");
        return (Map.Entry) C3888.m10976(map.entrySet(), comparator);
    }
}
