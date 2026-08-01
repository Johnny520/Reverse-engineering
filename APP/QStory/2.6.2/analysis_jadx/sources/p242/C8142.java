package p242;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractC4338;
import p089.C7179;
import p240.C8134;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8142 {
    private volatile /* synthetic */ Object current = AbstractC4338.m8781();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22464 = AtomicReferenceFieldUpdater.newUpdater(C8142.class, Object.class, "current");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f22463 = AbstractC8501.f23600.objectFieldOffset(C8142.class.getDeclaredField("current"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m13568(C8134 c8134) {
        return ((Map) this.current).get(c8134);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13569(C8134 c8134, C7179 c7179) {
        C8142 c8142;
        while (true) {
            Map map = (Map) this.current;
            Object obj = map.get(c8134);
            if (obj != null) {
                return obj;
            }
            HashMap map2 = new HashMap(map);
            Object objInvoke = c7179.invoke(c8134);
            map2.put(c8134, objInvoke);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22464;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f22463;
                c8142 = this;
                if (unsafe.compareAndSwapObject(c8142, j, map, map2)) {
                    return objInvoke;
                }
                if (unsafe.getObjectVolatile(c8142, j) != map) {
                    break;
                }
                this = c8142;
            }
            this = c8142;
        }
    }
}
