package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yz1 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC0535o9 f13682a;

    /* JADX INFO: renamed from: b */
    public static final i51 f13683b;

    /* JADX INFO: renamed from: c */
    public static final C0160eb f13684c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f13682a = null;
            f13683b = new i51(17);
            f13684c = new C0160eb(5);
        } else if (property.equals("Dalvik")) {
            f13682a = new ExecutorC0535o9();
            f13683b = new c72(0);
            f13684c = new C0779un(5);
        } else {
            f13682a = null;
            f13683b = new c72(1);
            f13684c = new C0779un(5);
        }
    }
}
