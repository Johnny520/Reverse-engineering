package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0363j6 extends AbstractC0274gu {

    /* JADX INFO: renamed from: g */
    public static volatile C0363j6 f2662g;

    /* JADX INFO: renamed from: f */
    public final Object f2663f;

    public C0363j6(int i) {
        switch (i) {
            case Base64.NO_PADDING /* 1 */:
                this.f2663f = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0186eg());
                break;
            default:
                this.f2663f = new C0363j6(1);
                break;
        }
    }

    /* JADX INFO: renamed from: P */
    public static C0363j6 m1574P() {
        if (f2662g != null) {
            return f2662g;
        }
        synchronized (C0363j6.class) {
            try {
                if (f2662g == null) {
                    f2662g = new C0363j6(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2662g;
    }
}
