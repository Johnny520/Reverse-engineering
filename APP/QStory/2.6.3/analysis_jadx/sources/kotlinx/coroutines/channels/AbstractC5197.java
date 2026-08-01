package kotlinx.coroutines.channels;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5197 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f14786;

    static {
        int[] iArr = new int[TickerMode.values().length];
        try {
            iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f14786 = iArr;
    }
}
