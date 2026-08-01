package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0363j6 extends AbstractC0126ct {

    /* JADX INFO: renamed from: e */
    public static volatile C0363j6 f2585e;

    /* JADX INFO: renamed from: d */
    public final Object f2586d;

    public C0363j6(int i) {
        switch (i) {
            case Base64.NO_PADDING /* 1 */:
                this.f2586d = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0150dg());
                break;
            default:
                this.f2586d = new C0363j6(1);
                break;
        }
    }

    /* JADX INFO: renamed from: z */
    public static C0363j6 m1550z() {
        if (f2585e != null) {
            return f2585e;
        }
        synchronized (C0363j6.class) {
            try {
                if (f2585e == null) {
                    f2585e = new C0363j6(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2585e;
    }
}
