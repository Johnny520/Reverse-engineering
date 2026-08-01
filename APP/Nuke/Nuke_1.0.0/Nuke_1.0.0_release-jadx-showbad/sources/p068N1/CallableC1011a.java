package p068N1;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: N1.a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1011a implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1015e f3127a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CallableC1011a(C1015e c1015e) {
        this.f3127a = c1015e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f3127a) {
            try {
                C1015e c1015e = this.f3127a;
                if (c1015e.f3147l == null) {
                    return null;
                }
                c1015e.m2094A();
                if (this.f3127a.m2097l()) {
                    this.f3127a.m2101w();
                    this.f3127a.f3149n = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
