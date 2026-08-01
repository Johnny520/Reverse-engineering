package p258;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractC5171;
import p105.C8009;
import p256.C8964;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8972 {
    private volatile /* synthetic */ Object current = AbstractC5171.m9335();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22807 = AtomicReferenceFieldUpdater.newUpdater(C8972.class, Object.class, "current");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f22806 = AbstractC9322.f23936.objectFieldOffset(C8972.class.getDeclaredField("current"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m14156(C8964 c8964) {
        return ((Map) this.current).get(c8964);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m14157(C8964 c8964, C8009 c8009) {
        C8972 c8972;
        while (true) {
            Map map = (Map) this.current;
            Object obj = map.get(c8964);
            if (obj != null) {
                return obj;
            }
            HashMap map2 = new HashMap(map);
            Object objInvoke = c8009.invoke(c8964);
            map2.put(c8964, objInvoke);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22807;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f22806;
                c8972 = this;
                if (unsafe.compareAndSwapObject(c8972, j, map, map2)) {
                    return objInvoke;
                }
                if (unsafe.getObjectVolatile(c8972, j) != map) {
                    break;
                }
                this = c8972;
            }
            this = c8972;
        }
    }
}
