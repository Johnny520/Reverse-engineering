package kotlinx.coroutines.sync;

import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.internal.AbstractC5353;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4485 f14999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4485 f15000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4485 f15001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4485 f15002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f15003 = AbstractC5353.m10373(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int f14998 = AbstractC5353.m10373(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i = 1;
        f15002 = new C4485("PERMIT", i);
        f15001 = new C4485("TAKEN", i);
        f15000 = new C4485("BROKEN", i);
        f14999 = new C4485("CANCELLED", i);
    }
}
