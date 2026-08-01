package io.ktor.utils.io;

import java.io.IOException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.C5476;
import kotlinx.io.InterfaceC5480;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4227 implements InterfaceC4251 {
    private volatile C4236 closed;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5476 f12725;

    public C4227(C5476 c5476) {
        this.f12725 = c5476;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8651() {
        return this.f12725.mo10601();
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo8652(int i, ContinuationImpl continuationImpl) throws Throwable {
        Throwable thMo8654 = mo8654();
        if (thMo8654 == null) {
            return Boolean.valueOf(this.f12725.f15142 >= ((long) i));
        }
        throw thMo8654;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5480 mo8653() throws Throwable {
        Throwable thMo8654 = mo8654();
        if (thMo8654 == null) {
            return this.f12725;
        }
        throw thMo8654;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo8654() {
        C4236 c4236 = this.closed;
        if (c4236 != null) {
            return c4236.m8662();
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8655(Throwable th) {
        String message;
        if (this.closed != null) {
            return;
        }
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new C4236(new IOException(message, th));
    }
}
