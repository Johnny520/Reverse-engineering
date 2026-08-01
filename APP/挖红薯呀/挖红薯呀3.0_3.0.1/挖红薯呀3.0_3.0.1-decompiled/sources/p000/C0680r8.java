package p000;

import java.util.concurrent.Executors;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0680r8 extends u50 {

    /* JADX INFO: renamed from: b */
    public static volatile C0680r8 f5321b;

    /* JADX INFO: renamed from: a */
    public final Object f5322a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0680r8(int i) {
        switch (i) {
            case 1:
                this.f5322a = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0556om());
                break;
            default:
                this.f5322a = new C0680r8(1);
                break;
        }
    }
}
