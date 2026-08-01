package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6232 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f15388;

    static {
        int[] iArr = new int[CoroutineStart.values().length];
        try {
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f15388 = iArr;
    }
}
