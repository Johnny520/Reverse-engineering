package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p287.AbstractC8405;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f14178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f14179;

    public C4875() {
        this.f14178 = new ConcurrentHashMap();
        this.f14179 = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4874 m9767(List list) {
        return list.isEmpty() ? C4874.f14176 : new C4874(list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m9768(String str, String str2) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵呜~喵呜喵喵呜呜呜呜");
        str.getClass();
        AbstractC8405.m13972(2752);
        this.f14178.put(str, str2);
        this.f14179.decrementAndGet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m9769(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = this.f14178;
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
                    andIncrement = this.f14179.getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    public C4875(int i) {
        this.f14179 = new AtomicInteger(i);
        this.f14178 = new ConcurrentHashMap();
    }
}
