package p005;

import java.util.concurrent.atomic.AtomicReference;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6111 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AtomicReference[] f16684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f16685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6107 f16686 = new C6107(new byte[0], 0, 0, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16685 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f16684 = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6107 m11511() {
        AtomicReference atomicReference = f16684[(int) (Thread.currentThread().getId() & (((long) f16685) - 1))];
        C6107 c6107 = f16686;
        C6107 c61072 = (C6107) atomicReference.getAndSet(c6107);
        if (c61072 == c6107) {
            return new C6107();
        }
        if (c61072 == null) {
            atomicReference.set(null);
            return new C6107();
        }
        atomicReference.set(c61072.f16674);
        c61072.f16674 = null;
        c61072.f16677 = 0;
        return c61072;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11512(C6107 c6107) {
        c6107.getClass();
        if (c6107.f16674 != null || c6107.f16680 != null) {
            C5919.m11249("Failed requirement.");
            return;
        }
        if (c6107.f16676) {
            return;
        }
        AtomicReference atomicReference = f16684[(int) (Thread.currentThread().getId() & (((long) f16685) - 1))];
        C6107 c61072 = f16686;
        C6107 c61073 = (C6107) atomicReference.getAndSet(c61072);
        if (c61073 == c61072) {
            return;
        }
        int i = c61073 != null ? c61073.f16677 : 0;
        if (i >= 65536) {
            atomicReference.set(c61073);
            return;
        }
        c6107.f16674 = c61073;
        c6107.f16678 = 0;
        c6107.f16677 = i + 8192;
        atomicReference.set(c6107);
    }
}
