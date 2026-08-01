package p095;

import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC7211 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f19247;

    static {
        int[] iArr = new int[CoroutineScheduler$WorkerState.values().length];
        try {
            iArr[CoroutineScheduler$WorkerState.PARKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.BLOCKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.CPU_ACQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.DORMANT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f19247 = iArr;
    }
}
