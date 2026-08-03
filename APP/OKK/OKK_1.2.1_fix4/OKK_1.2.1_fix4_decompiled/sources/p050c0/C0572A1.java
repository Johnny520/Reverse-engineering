package p050c0;

import java.util.concurrent.ConcurrentHashMap;
import p009E0.C0180k;
import p040V0.C0400c;
import p040V0.C0401d;
import p040V0.C0402e;

/* JADX INFO: renamed from: c0.A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0572A1 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f1693a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m1384a(long[] jArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap concurrentHashMap = f1693a;
        concurrentHashMap.entrySet().removeIf(new C0715z1(new C0712y1(jCurrentTimeMillis)));
        C0401d c0401d = new C0401d(new C0402e(jArr.length == 0 ? C0400c.f890a : new C0180k(1, jArr), true, new C0570A(25)));
        while (c0401d.hasNext()) {
            concurrentHashMap.put(Long.valueOf(((Number) c0401d.next()).longValue()), Long.valueOf(jCurrentTimeMillis));
        }
    }
}
