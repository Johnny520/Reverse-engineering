package androidx.concurrent.futures;

import kotlin.reflect.jvm.internal.AbstractC5061;

/* JADX INFO: renamed from: androidx.concurrent.futures.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2137 extends AbstractC5061 {
    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo3858(C2136 c2136, Thread thread) {
        c2136.f6302 = thread;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void mo3859(C2136 c2136, C2136 c21362) {
        c2136.f6301 = c21362;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo3860(AbstractFutureC2143 abstractFutureC2143, C2139 c2139) {
        C2139 c21392 = C2139.f6308;
        synchronized (abstractFutureC2143) {
            try {
                if (abstractFutureC2143.f6317 != c2139) {
                    return false;
                }
                abstractFutureC2143.f6317 = c21392;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo3861(AbstractFutureC2143 abstractFutureC2143, C2136 c2136, C2136 c21362) {
        synchronized (abstractFutureC2143) {
            try {
                if (abstractFutureC2143.f6318 != c2136) {
                    return false;
                }
                abstractFutureC2143.f6318 = c21362;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo3862(AbstractFutureC2143 abstractFutureC2143, Object obj, Object obj2) {
        synchronized (abstractFutureC2143) {
            try {
                if (abstractFutureC2143.f6319 != obj) {
                    return false;
                }
                abstractFutureC2143.f6319 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
