package Yue;

import Yue.C7060;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
public class C5221 {
    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ */
    public static final <T, K> Map<K, Integer> m1988(@InterfaceC6399 InterfaceC5218<T, ? extends K> interfaceC5218) {
        C5499.m17103(interfaceC5218, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itMo501 = interfaceC5218.mo501();
        while (itMo501.hasNext()) {
            K kMo500 = interfaceC5218.mo500(itMo501.next());
            Object c7064 = linkedHashMap.get(kMo500);
            if (c7064 == null && !linkedHashMap.containsKey(kMo500)) {
                c7064 = new C7060.C7064();
            }
            C7060.C7064 c70642 = (C7060.C7064) c7064;
            c70642.f21351++;
            linkedHashMap.put(kMo500, c70642);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C5499.m17101(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            C8012.m25261(entry).setValue(Integer.valueOf(((C7060.C7064) entry.getValue()).f21351));
        }
        return C8012.m25259(linkedHashMap);
    }

    @InterfaceC5438
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <K, V, R> Map<K, R> m1989(Map<K, V> map, InterfaceC5124<? super Map.Entry<? extends K, ? extends V>, ? extends R> interfaceC5124) {
        C5499.m17103(map, "<this>");
        C5499.m17103(interfaceC5124, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C5499.m17101(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            C8012.m25261(entry).setValue(interfaceC5124.invoke(entry));
        }
        return C8012.m25259(map);
    }
}
