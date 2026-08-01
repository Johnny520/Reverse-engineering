package retrofit2;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6591 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6611 f16157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6611 f16158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ExecutorC6612 f16159;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f16159 = null;
            f16158 = new C6611(7);
            f16157 = new C6611(6);
        } else if (property.equals("Dalvik")) {
            f16159 = new ExecutorC6612();
            f16158 = new C6594(0);
            f16157 = new C6609(6);
        } else {
            f16159 = null;
            f16158 = new C6594(1);
            f16157 = new C6609(6);
        }
    }
}
