package retrofit2;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5781 f15812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5781 f15813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ExecutorC5782 f15814;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f15814 = null;
            f15813 = new C5781(7);
            f15812 = new C5781(6);
        } else if (property.equals("Dalvik")) {
            f15814 = new ExecutorC5782();
            f15813 = new C5764(0);
            f15812 = new C5779(6);
        } else {
            f15814 = null;
            f15813 = new C5764(1);
            f15812 = new C5779(6);
        }
    }
}
