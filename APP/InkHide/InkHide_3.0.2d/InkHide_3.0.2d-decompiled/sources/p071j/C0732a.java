package p071j;

import java.util.concurrent.Executors;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0732a extends AbstractC0503h {

    /* JADX INFO: renamed from: q */
    public static volatile C0732a f2485q;

    /* JADX INFO: renamed from: p */
    public final Object f2486p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0732a(int i2) {
        switch (i2) {
            case 1:
                this.f2486p = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0733b(0));
                break;
            default:
                this.f2486p = new C0732a(1);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static C0732a m1388Q() {
        if (f2485q != null) {
            return f2485q;
        }
        synchronized (C0732a.class) {
            try {
                if (f2485q == null) {
                    f2485q = new C0732a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2485q;
    }
}
