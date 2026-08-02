package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 implements ThreadFactory {
    public final z4 a;
    public final String b;
    public final gd3 c;
    public final boolean d;
    public final AtomicInteger e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zp0(z4 z4Var, String str, boolean z) {
        gd3 gd3Var = gd3.x;
        this.e = new AtomicInteger();
        this.a = z4Var;
        this.b = str;
        this.c = gd3Var;
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        yp0 yp0Var = new yp0(this, runnable, 0);
        this.a.getClass();
        vg vgVar = new vg(yp0Var);
        vgVar.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return vgVar;
    }
}
