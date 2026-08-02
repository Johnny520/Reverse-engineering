package defpackage;

import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tf extends ci0 {
    public static volatile tf B;
    public final Object A;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tf(int i) {
        switch (i) {
            case 1:
                this.A = new Object();
                Executors.newFixedThreadPool(4, new h60());
                break;
            default:
                this.A = new tf(1);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tf Y() {
        if (B != null) {
            return B;
        }
        synchronized (tf.class) {
            try {
                if (B == null) {
                    B = new tf(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return B;
    }
}
