package p004;

import java.util.concurrent.atomic.AtomicReference;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6102 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AtomicReference[] f16674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f16675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6098 f16676 = new C6098(new byte[0], 0, 0, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16675 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f16674 = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6098 m11504() {
        AtomicReference atomicReference = f16674[(int) (Thread.currentThread().getId() & (((long) f16675) - 1))];
        C6098 c6098 = f16676;
        C6098 c60982 = (C6098) atomicReference.getAndSet(c6098);
        if (c60982 == c6098) {
            return new C6098();
        }
        if (c60982 == null) {
            atomicReference.set(null);
            return new C6098();
        }
        atomicReference.set(c60982.f16664);
        c60982.f16664 = null;
        c60982.f16667 = 0;
        return c60982;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11505(C6098 c6098) {
        c6098.getClass();
        if (c6098.f16664 != null || c6098.f16670 != null) {
            C5925.m11310("Failed requirement.");
            return;
        }
        if (c6098.f16666) {
            return;
        }
        AtomicReference atomicReference = f16674[(int) (Thread.currentThread().getId() & (((long) f16675) - 1))];
        C6098 c60982 = f16676;
        C6098 c60983 = (C6098) atomicReference.getAndSet(c60982);
        if (c60983 == c60982) {
            return;
        }
        int i = c60983 != null ? c60983.f16667 : 0;
        if (i >= 65536) {
            atomicReference.set(c60983);
            return;
        }
        c6098.f16664 = c60983;
        c6098.f16668 = 0;
        c6098.f16667 = i + 8192;
        atomicReference.set(c6098);
    }
}
