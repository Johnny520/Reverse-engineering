package p242;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractC4339;
import p089.C7180;
import p240.C8135;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲世子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8143 {
    private volatile /* synthetic */ Object current = AbstractC4339.m8776();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22462 = AtomicReferenceFieldUpdater.newUpdater(C8143.class, Object.class, "current");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f22461 = AbstractC8493.f23591.objectFieldOffset(C8143.class.getDeclaredField("current"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m13597(C8135 c8135) {
        return ((Map) this.current).get(c8135);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13598(C8135 c8135, C7180 c7180) {
        C8143 c8143;
        while (true) {
            Map map = (Map) this.current;
            Object obj = map.get(c8135);
            if (obj != null) {
                return obj;
            }
            HashMap map2 = new HashMap(map);
            Object objInvoke = c7180.invoke(c8135);
            map2.put(c8135, objInvoke);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22462;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f22461;
                c8143 = this;
                if (unsafe.compareAndSwapObject(c8143, j, map, map2)) {
                    return objInvoke;
                }
                if (unsafe.getObjectVolatile(c8143, j) != map) {
                    break;
                }
                this = c8143;
            }
            this = c8143;
        }
    }
}
