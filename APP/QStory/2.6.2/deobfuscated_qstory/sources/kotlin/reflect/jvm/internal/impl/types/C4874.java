package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p007.AbstractC6136;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4874 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f14174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f14175;

    public C4874() {
        this.f14174 = new ConcurrentHashMap();
        this.f14175 = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4873 m9773(List list) {
        return list.isEmpty() ? C4873.f14172 : new C4873(list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m9774(String str, String str2) {
        AbstractC6136.m11546(-3937641959976600999L, -3937830045184427431L, str);
        this.f14174.put(str, str2);
        this.f14175.decrementAndGet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m9775(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = this.f14174;
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
                    andIncrement = this.f14175.getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    public C4874(int i) {
        this.f14175 = new AtomicInteger(i);
        this.f14174 = new ConcurrentHashMap();
    }
}
