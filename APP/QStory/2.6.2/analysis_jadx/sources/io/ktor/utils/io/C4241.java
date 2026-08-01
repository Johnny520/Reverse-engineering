package io.ktor.utils.io;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.io.C5476;
import kotlinx.io.InterfaceC5480;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C4241 implements InterfaceC4251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f12742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f12743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5476 f12744;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4251 f12745;

    public C4241(InterfaceC4251 interfaceC4251) {
        interfaceC4251.getClass();
        this.f12745 = interfaceC4251;
        this.f12744 = new C5476();
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5476 mo8653() {
        m8666();
        InterfaceC5480 interfaceC5480Mo8653 = this.f12745.mo8653();
        C5476 c5476 = this.f12744;
        this.f12743 += c5476.m10609(interfaceC5480Mo8653);
        return c5476;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8651() {
        return this.f12744.mo10601() && this.f12745.mo8651();
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo8652(int i, ContinuationImpl continuationImpl) {
        return mo8653().f15142 < ((long) i) ? this.f12745.mo8652(i, continuationImpl) : Boolean.TRUE;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo8654() {
        return this.f12745.mo8654();
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8655(Throwable th) {
        this.f12745.mo8655(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8666() {
        long j = this.f12742;
        long j2 = this.f12743;
        long j3 = this.f12744.f15142;
        this.f12742 = (j2 - j3) + j;
        this.f12743 = j3;
    }
}
