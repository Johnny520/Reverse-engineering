package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f14523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f14524;

    public C5707() {
        this.f14523 = new ConcurrentHashMap();
        this.f14524 = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5706 m10326(List list) {
        return list.isEmpty() ? C5706.f14521 : new C5706(list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m10327(String str, String str2) {
        "md5";
        str.getClass();
        "cachePath";
        this.f14523.put(str, str2);
        this.f14524.decrementAndGet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m10328(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = this.f14523;
        concurrentHashMap.getClass();
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = this.f14524.getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    public C5707(int i) {
        this.f14524 = new AtomicInteger(i);
        this.f14523 = new ConcurrentHashMap();
    }
}
