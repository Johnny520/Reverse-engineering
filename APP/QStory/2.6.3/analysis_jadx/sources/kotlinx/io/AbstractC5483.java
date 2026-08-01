package kotlinx.io;

import io.ktor.util.C4211;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5483 {

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
    public static final C5479 f15161 = new C5479(new byte[0], 0, 0, null);

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
        String property = System.getProperty("kotlinx.io.pool.size.bytes", AbstractC4395.m8907(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        property.getClass();
        Integer numM10140 = AbstractC5139.m10140(property);
        if (numM10140 != null && (iIntValue = numM10140.intValue()) >= 0) {
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
    public static final C5479 m10639() {
        AtomicReferenceArray atomicReferenceArray;
        C5479 c5479;
        C5479 c54792;
        int id = (int) ((((long) f15160) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f15156;
            c5479 = f15161;
            c54792 = (C5479) atomicReferenceArray.getAndSet(id, c5479);
        } while (AbstractC4395.m8907(c54792, c5479));
        if (c54792 != null) {
            atomicReferenceArray.set(id, c54792.f15145);
            c54792.f15145 = null;
            c54792.f15148 = 0;
            return c54792;
        }
        atomicReferenceArray.set(id, null);
        if (f15158 <= 0) {
            return new C5479();
        }
        int i = f15159;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = f15162;
            C5479 c54793 = (C5479) atomicReferenceArray2.getAndSet(id2, c5479);
            if (!AbstractC4395.m8907(c54793, c5479)) {
                if (c54793 != null) {
                    atomicReferenceArray2.set(id2, c54793.f15145);
                    c54793.f15145 = null;
                    c54793.f15148 = 0;
                    return c54793;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new C5479();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10640(C5479 c5479) {
        C5479 c54792 = f15161;
        c5479.getClass();
        if (c5479.f15145 != null || c5479.f15151 != null) {
            C5925.m11310("Failed requirement.");
            return;
        }
        C5480 c5480 = c5479.f15147;
        if (c5480 != null && c5480.f15153 != 0) {
            int iDecrementAndGet = C5480.f15152.decrementAndGet(c5480);
            if (iDecrementAndGet >= 0) {
                return;
            }
            if (iDecrementAndGet != -1) {
                C4211.m8612(iDecrementAndGet + 1, "Shared copies count is negative: ");
                return;
            }
            c5480.f15153 = 0;
        }
        AtomicReferenceArray atomicReferenceArray = f15156;
        int id = (int) ((((long) f15160) - 1) & Thread.currentThread().getId());
        c5479.f15149 = 0;
        c5479.f15146 = true;
        while (true) {
            C5479 c54793 = (C5479) atomicReferenceArray.get(id);
            if (c54793 != c54792) {
                int i = c54793 != null ? c54793.f15148 : 0;
                if (i < 65536) {
                    c5479.f15145 = c54793;
                    c5479.f15148 = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, c54793, c5479)) {
                        if (atomicReferenceArray.get(id) != c54793) {
                            break;
                        }
                    }
                    return;
                }
                if (f15158 <= 0) {
                    return;
                }
                c5479.f15149 = 0;
                c5479.f15146 = true;
                int id2 = (int) ((((long) f15159) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f15162;
                int i2 = 0;
                while (true) {
                    C5479 c54794 = (C5479) atomicReferenceArray2.get(id2);
                    if (c54794 != c54792) {
                        int i3 = (c54794 != null ? c54794.f15148 : 0) + 8192;
                        if (i3 <= f15157) {
                            c5479.f15145 = c54794;
                            c5479.f15148 = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, c54794, c5479)) {
                                if (atomicReferenceArray2.get(id2) != c54794) {
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
