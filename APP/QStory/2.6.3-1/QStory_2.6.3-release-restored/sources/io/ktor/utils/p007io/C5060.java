package io.ktor.utils.p007io;

import java.io.IOException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5060 implements InterfaceC5084 {
    private volatile C5069 closed;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6309 f13074;

    public C5060(C6309 c6309) {
        this.f13074 = c6309;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo9200() {
        return this.f13074.mo11163();
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo9201(int i, ContinuationImpl continuationImpl) throws Throwable {
        Throwable thMo9203 = mo9203();
        if (thMo9203 == null) {
            return Boolean.valueOf(this.f13074.f15487 >= ((long) i));
        }
        throw thMo9203;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC6313 mo9202() throws Throwable {
        Throwable thMo9203 = mo9203();
        if (thMo9203 == null) {
            return this.f13074;
        }
        throw thMo9203;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo9203() {
        C5069 c5069 = this.closed;
        if (c5069 != null) {
            return c5069.m9211();
        }
        return null;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9204(Throwable th) {
        String message;
        if (this.closed != null) {
            return;
        }
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new C5069(new IOException(message, th));
    }
}
