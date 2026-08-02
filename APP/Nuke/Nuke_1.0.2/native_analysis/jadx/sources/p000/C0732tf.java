package p000;

import java.util.concurrent.Executors;

/* JADX INFO: renamed from: tf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0732tf extends ci0 {

    /* JADX INFO: renamed from: B */
    public static volatile C0732tf f10709B;

    /* JADX INFO: renamed from: A */
    public final Object f10710A;

    public C0732tf(int i) {
        switch (i) {
            case 1:
                this.f10710A = new Object();
                Executors.newFixedThreadPool(4, new h60());
                break;
            default:
                this.f10710A = new C0732tf(1);
                break;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static C0732tf m5248Y() {
        if (f10709B != null) {
            return f10709B;
        }
        synchronized (C0732tf.class) {
            try {
                if (f10709B == null) {
                    f10709B = new C0732tf(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10709B;
    }
}
