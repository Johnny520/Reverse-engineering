package io.ktor.utils.io;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.C5477;
import kotlinx.io.InterfaceC5481;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4242 implements InterfaceC4252 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f12746;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f12747;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5477 f12748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4252 f12749;

    public C4242(InterfaceC4252 interfaceC4252) {
        interfaceC4252.getClass();
        this.f12749 = interfaceC4252;
        this.f12748 = new C5477();
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5477 mo8643() {
        m8656();
        InterfaceC5481 interfaceC5481Mo8643 = this.f12749.mo8643();
        C5477 c5477 = this.f12748;
        this.f12747 += c5477.m10613(interfaceC5481Mo8643);
        return c5477;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8641() {
        return this.f12748.mo10604() && this.f12749.mo8641();
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo8642(int i, ContinuationImpl continuationImpl) {
        return mo8643().f15142 < ((long) i) ? this.f12749.mo8642(i, continuationImpl) : Boolean.TRUE;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo8644() {
        return this.f12749.mo8644();
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8645(Throwable th) {
        this.f12749.mo8645(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8656() {
        long j = this.f12746;
        long j2 = this.f12747;
        long j3 = this.f12748.f15142;
        this.f12746 = (j2 - j3) + j;
        this.f12747 = j3;
    }
}
