package io.ktor.utils.io;

import java.io.IOException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.C5477;
import kotlinx.io.InterfaceC5481;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4228 implements InterfaceC4252 {
    private volatile C4237 closed;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5477 f12729;

    public C4228(C5477 c5477) {
        this.f12729 = c5477;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8641() {
        return this.f12729.mo10604();
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo8642(int i, ContinuationImpl continuationImpl) throws Throwable {
        Throwable thMo8644 = mo8644();
        if (thMo8644 == null) {
            return Boolean.valueOf(this.f12729.f15142 >= ((long) i));
        }
        throw thMo8644;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5481 mo8643() throws Throwable {
        Throwable thMo8644 = mo8644();
        if (thMo8644 == null) {
            return this.f12729;
        }
        throw thMo8644;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo8644() {
        C4237 c4237 = this.closed;
        if (c4237 != null) {
            return c4237.m8652();
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8645(Throwable th) {
        String message;
        if (this.closed != null) {
            return;
        }
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new C4237(new IOException(message, th));
    }
}
