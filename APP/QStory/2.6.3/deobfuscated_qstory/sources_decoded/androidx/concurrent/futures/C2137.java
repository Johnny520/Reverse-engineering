package androidx.concurrent.futures;

import io.ktor.client.plugins.AbstractC3933;

/* JADX INFO: renamed from: androidx.concurrent.futures.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2137 extends AbstractC3933 {
    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo3868(C2136 c2136, Thread thread) {
        c2136.f6303 = thread;
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo3869(C2136 c2136, C2136 c21362) {
        c2136.f6302 = c21362;
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo3870(AbstractFutureC2143 abstractFutureC2143, C2136 c2136, C2136 c21362) {
        synchronized (abstractFutureC2143) {
            try {
                if (abstractFutureC2143.f6319 != c2136) {
                    return false;
                }
                abstractFutureC2143.f6319 = c21362;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo3871(AbstractFutureC2143 abstractFutureC2143, Object obj, Object obj2) {
        synchronized (abstractFutureC2143) {
            try {
                if (abstractFutureC2143.f6320 != obj) {
                    return false;
                }
                abstractFutureC2143.f6320 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo3872(AbstractFutureC2143 abstractFutureC2143, C2139 c2139) {
        C2139 c21392 = C2139.f6309;
        synchronized (abstractFutureC2143) {
            try {
                if (abstractFutureC2143.f6318 != c2139) {
                    return false;
                }
                abstractFutureC2143.f6318 = c21392;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
