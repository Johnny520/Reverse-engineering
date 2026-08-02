package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yz1 {
    public static final o9 a;
    public static final i51 b;
    public static final eb c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new i51(17);
            c = new eb(5);
        } else if (property.equals("Dalvik")) {
            a = new o9();
            b = new c72(0);
            c = new un(5);
        } else {
            a = null;
            b = new c72(1);
            c = new un(5);
        }
    }
}
