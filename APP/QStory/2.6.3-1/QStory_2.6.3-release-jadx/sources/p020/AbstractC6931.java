package p020;

import java.util.concurrent.atomic.AtomicReference;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6931 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AtomicReference[] f17019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f17020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6927 f17021 = new C6927(new byte[0], 0, 0, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f17020 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f17019 = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6927 m12063() {
        AtomicReference atomicReference = f17019[(int) (Thread.currentThread().getId() & (((long) f17020) - 1))];
        C6927 c6927 = f17021;
        C6927 c69272 = (C6927) atomicReference.getAndSet(c6927);
        if (c69272 == c6927) {
            return new C6927();
        }
        if (c69272 == null) {
            atomicReference.set(null);
            return new C6927();
        }
        atomicReference.set(c69272.f17009);
        c69272.f17009 = null;
        c69272.f17012 = 0;
        return c69272;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m12064(C6927 c6927) {
        c6927.getClass();
        if (c6927.f17009 != null || c6927.f17015 != null) {
            C6755.m11869("Failed requirement.");
            return;
        }
        if (c6927.f17011) {
            return;
        }
        AtomicReference atomicReference = f17019[(int) (Thread.currentThread().getId() & (((long) f17020) - 1))];
        C6927 c69272 = f17021;
        C6927 c69273 = (C6927) atomicReference.getAndSet(c69272);
        if (c69273 == c69272) {
            return;
        }
        int i = c69273 != null ? c69273.f17012 : 0;
        if (i >= 65536) {
            atomicReference.set(c69273);
            return;
        }
        c6927.f17009 = c69273;
        c6927.f17013 = 0;
        c6927.f17012 = i + 8192;
        atomicReference.set(c6927);
    }
}
