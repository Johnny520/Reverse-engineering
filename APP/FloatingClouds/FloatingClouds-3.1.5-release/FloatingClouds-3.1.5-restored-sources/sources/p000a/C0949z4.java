package p000a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: a.z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0949z4 {
    /* JADX INFO: renamed from: a */
    public static void m2240a() {
        ConcurrentHashMap<String, C0742o6> concurrentHashMap = C0106Fd.f365a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0480aa.m1169C(concurrentHashMap.size()));
        Iterator<T> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            C0742o6 c0742o6 = (C0742o6) entry.getValue();
            linkedHashMap.put(key, new C0761p6(c0742o6.f2930a, c0742o6.f2931b, c0742o6.f2934e.get(), c0742o6.f2933d.get(), c0742o6.f2932c.get(), c0742o6.f2938i, c0742o6.f2935f, c0742o6.f2936g, c0742o6.f2937h));
        }
        C0053Ce.m143X(C0834t3.m1952p0(linkedHashMap.entrySet(), "; ", new C0586g2(10), 30), 1000);
    }
}
