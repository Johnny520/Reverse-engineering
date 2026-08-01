package kotlinx.io;

import io.ktor.util.C4210;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5482 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AtomicReferenceArray f15156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int f15157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f15158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f15159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f15160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5478 f15161 = new C5478(new byte[0], 0, 0, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AtomicReferenceArray f15162;

    static {
        int iIntValue;
        int i = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f15160 = iHighestOneBit;
        int i2 = iHighestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        f15159 = i3;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", AbstractC4394.m8917(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        property.getClass();
        Integer numM10136 = AbstractC5138.m10136(property);
        if (numM10136 != null && (iIntValue = numM10136.intValue()) >= 0) {
            i = iIntValue;
        }
        f15158 = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        f15157 = i4;
        f15156 = new AtomicReferenceArray(iHighestOneBit);
        f15162 = new AtomicReferenceArray(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5478 m10635() {
        AtomicReferenceArray atomicReferenceArray;
        C5478 c5478;
        C5478 c54782;
        int id = (int) ((((long) f15160) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f15156;
            c5478 = f15161;
            c54782 = (C5478) atomicReferenceArray.getAndSet(id, c5478);
        } while (AbstractC4394.m8917(c54782, c5478));
        if (c54782 != null) {
            atomicReferenceArray.set(id, c54782.f15145);
            c54782.f15145 = null;
            c54782.f15148 = 0;
            return c54782;
        }
        atomicReferenceArray.set(id, null);
        if (f15158 <= 0) {
            return new C5478();
        }
        int i = f15159;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = f15162;
            C5478 c54783 = (C5478) atomicReferenceArray2.getAndSet(id2, c5478);
            if (!AbstractC4394.m8917(c54783, c5478)) {
                if (c54783 != null) {
                    atomicReferenceArray2.set(id2, c54783.f15145);
                    c54783.f15145 = null;
                    c54783.f15148 = 0;
                    return c54783;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new C5478();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10636(C5478 c5478) {
        C5478 c54782 = f15161;
        c5478.getClass();
        if (c5478.f15145 != null || c5478.f15151 != null) {
            C5919.m11249("Failed requirement.");
            return;
        }
        C5479 c5479 = c5478.f15147;
        if (c5479 != null && c5479.f15153 != 0) {
            int iDecrementAndGet = C5479.f15152.decrementAndGet(c5479);
            if (iDecrementAndGet >= 0) {
                return;
            }
            if (iDecrementAndGet != -1) {
                C4210.m8622(iDecrementAndGet + 1, "Shared copies count is negative: ");
                return;
            }
            c5479.f15153 = 0;
        }
        AtomicReferenceArray atomicReferenceArray = f15156;
        int id = (int) ((((long) f15160) - 1) & Thread.currentThread().getId());
        c5478.f15149 = 0;
        c5478.f15146 = true;
        while (true) {
            C5478 c54783 = (C5478) atomicReferenceArray.get(id);
            if (c54783 != c54782) {
                int i = c54783 != null ? c54783.f15148 : 0;
                if (i < 65536) {
                    c5478.f15145 = c54783;
                    c5478.f15148 = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, c54783, c5478)) {
                        if (atomicReferenceArray.get(id) != c54783) {
                            break;
                        }
                    }
                    return;
                }
                if (f15158 <= 0) {
                    return;
                }
                c5478.f15149 = 0;
                c5478.f15146 = true;
                int id2 = (int) ((((long) f15159) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f15162;
                int i2 = 0;
                while (true) {
                    C5478 c54784 = (C5478) atomicReferenceArray2.get(id2);
                    if (c54784 != c54782) {
                        int i3 = (c54784 != null ? c54784.f15148 : 0) + 8192;
                        if (i3 <= f15157) {
                            c5478.f15145 = c54784;
                            c5478.f15148 = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, c54784, c5478)) {
                                if (atomicReferenceArray2.get(id2) != c54784) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i4 = f15159;
                        if (i2 >= i4) {
                            return;
                        }
                        i2++;
                        id2 = (id2 + 1) & (i4 - 1);
                    }
                }
            }
        }
    }
}
