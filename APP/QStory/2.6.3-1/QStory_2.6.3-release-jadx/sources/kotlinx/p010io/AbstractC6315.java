package kotlinx.p010io;

import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6315 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AtomicReferenceArray f15501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int f15502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int f15503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f15504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f15505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6311 f15506 = new C6311(new byte[0], 0, 0, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final AtomicReferenceArray f15507;

    static {
        int iIntValue;
        int i = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f15505 = iHighestOneBit;
        int i2 = iHighestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        f15504 = i3;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", AbstractC5227.m9466(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        property.getClass();
        Integer numM10699 = AbstractC5971.m10699(property);
        if (numM10699 != null && (iIntValue = numM10699.intValue()) >= 0) {
            i = iIntValue;
        }
        f15503 = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        f15502 = i4;
        f15501 = new AtomicReferenceArray(iHighestOneBit);
        f15507 = new AtomicReferenceArray(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6311 m11198() {
        AtomicReferenceArray atomicReferenceArray;
        C6311 c6311;
        C6311 c63112;
        int id = (int) ((((long) f15505) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f15501;
            c6311 = f15506;
            c63112 = (C6311) atomicReferenceArray.getAndSet(id, c6311);
        } while (AbstractC5227.m9466(c63112, c6311));
        if (c63112 != null) {
            atomicReferenceArray.set(id, c63112.f15490);
            c63112.f15490 = null;
            c63112.f15493 = 0;
            return c63112;
        }
        atomicReferenceArray.set(id, null);
        if (f15503 <= 0) {
            return new C6311();
        }
        int i = f15504;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = f15507;
            C6311 c63113 = (C6311) atomicReferenceArray2.getAndSet(id2, c6311);
            if (!AbstractC5227.m9466(c63113, c6311)) {
                if (c63113 != null) {
                    atomicReferenceArray2.set(id2, c63113.f15490);
                    c63113.f15490 = null;
                    c63113.f15493 = 0;
                    return c63113;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new C6311();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11199(C6311 c6311) {
        C6311 c63112 = f15506;
        c6311.getClass();
        if (c6311.f15490 != null || c6311.f15496 != null) {
            C6755.m11869("Failed requirement.");
            return;
        }
        C6312 c6312 = c6311.f15492;
        if (c6312 != null && c6312.f15498 != 0) {
            int iDecrementAndGet = C6312.f15497.decrementAndGet(c6312);
            if (iDecrementAndGet >= 0) {
                return;
            }
            if (iDecrementAndGet != -1) {
                C5043.m9171(iDecrementAndGet + 1, "Shared copies count is negative: ");
                return;
            }
            c6312.f15498 = 0;
        }
        AtomicReferenceArray atomicReferenceArray = f15501;
        int id = (int) ((((long) f15505) - 1) & Thread.currentThread().getId());
        c6311.f15494 = 0;
        c6311.f15491 = true;
        while (true) {
            C6311 c63113 = (C6311) atomicReferenceArray.get(id);
            if (c63113 != c63112) {
                int i = c63113 != null ? c63113.f15493 : 0;
                if (i < 65536) {
                    c6311.f15490 = c63113;
                    c6311.f15493 = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, c63113, c6311)) {
                        if (atomicReferenceArray.get(id) != c63113) {
                            break;
                        }
                    }
                    return;
                }
                if (f15503 <= 0) {
                    return;
                }
                c6311.f15494 = 0;
                c6311.f15491 = true;
                int id2 = (int) ((((long) f15504) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f15507;
                int i2 = 0;
                while (true) {
                    C6311 c63114 = (C6311) atomicReferenceArray2.get(id2);
                    if (c63114 != c63112) {
                        int i3 = (c63114 != null ? c63114.f15493 : 0) + 8192;
                        if (i3 <= f15502) {
                            c6311.f15490 = c63114;
                            c6311.f15493 = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, c63114, c6311)) {
                                if (atomicReferenceArray2.get(id2) != c63114) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i4 = f15504;
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
