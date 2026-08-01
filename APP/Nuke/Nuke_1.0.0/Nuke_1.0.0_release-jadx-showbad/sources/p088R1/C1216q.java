package p088R1;

import java.util.concurrent.Executor;
import p171h2.C2239f;

/* JADX INFO: renamed from: R1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1216q {

    /* JADX INFO: renamed from: a */
    public final C2239f f4044a;

    /* JADX INFO: renamed from: b */
    public final Executor f4045b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1216q(C2239f c2239f, Executor executor) {
        this.f4044a = c2239f;
        this.f4045b = executor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1216q) {
            return this.f4044a.equals(((C1216q) obj).f4044a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4044a.hashCode();
    }
}
