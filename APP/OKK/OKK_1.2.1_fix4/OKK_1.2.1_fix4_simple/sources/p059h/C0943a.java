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

    public C0943a(int r2) {
        switch(r2) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.f3352b = new C0943a(1);
        return;
    L5:
        this.f3352b = new Object();
        Executors.newFixedThreadPool(4, new ThreadFactoryC0944b());
    }
}
