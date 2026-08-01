package androidx.concurrent.futures;

import io.ktor.client.plugins.AbstractC4765;

/* JADX INFO: renamed from: androidx.concurrent.futures.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2970 extends AbstractC4765 {
    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo4428(C2969 c2969, Thread thread) {
        c2969.f6648 = thread;
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo4429(C2969 c2969, C2969 c29692) {
        c2969.f6647 = c29692;
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo4430(AbstractFutureC2976 abstractFutureC2976, C2969 c2969, C2969 c29692) {
        synchronized (abstractFutureC2976) {
            try {
                if (abstractFutureC2976.f6664 != c2969) {
                    return false;
                }
                abstractFutureC2976.f6664 = c29692;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo4431(AbstractFutureC2976 abstractFutureC2976, Object obj, Object obj2) {
        synchronized (abstractFutureC2976) {
            try {
                if (abstractFutureC2976.f6665 != obj) {
                    return false;
                }
                abstractFutureC2976.f6665 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo4432(AbstractFutureC2976 abstractFutureC2976, C2972 c2972) {
        C2972 c29722 = C2972.f6654;
        synchronized (abstractFutureC2976) {
            try {
                if (abstractFutureC2976.f6663 != c2972) {
                    return false;
                }
                abstractFutureC2976.f6663 = c29722;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
