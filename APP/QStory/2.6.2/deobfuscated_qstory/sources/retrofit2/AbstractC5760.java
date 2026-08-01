package retrofit2;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5760 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5780 f15812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5780 f15813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ExecutorC5781 f15814;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f15814 = null;
            f15813 = new C5780(7);
            f15812 = new C5780(6);
        } else if (property.equals("Dalvik")) {
            f15814 = new ExecutorC5781();
            f15813 = new C5763(0);
            f15812 = new C5778(6);
        } else {
            f15814 = null;
            f15813 = new C5763(1);
            f15812 = new C5778(6);
        }
    }
}
