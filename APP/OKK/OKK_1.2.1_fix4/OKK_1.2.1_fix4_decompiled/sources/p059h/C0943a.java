package p059h;

import java.util.concurrent.Executors;
import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0943a extends AbstractC0805P {

    /* JADX INFO: renamed from: c */
    public static volatile C0943a f3351c;

    /* JADX INFO: renamed from: b */
    public final Object f3352b;

    public C0943a(int i2) {
        switch (i2) {
            case 1:
                this.f3352b = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0944b());
                break;
            default:
                this.f3352b = new C0943a(1);
                break;
        }
    }
}
