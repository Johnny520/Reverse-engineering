package io.ktor.utils.p007io;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5074 implements InterfaceC5084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f13091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f13092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6309 f13093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5084 f13094;

    public C5074(InterfaceC5084 interfaceC5084) {
        interfaceC5084.getClass();
        this.f13094 = interfaceC5084;
        this.f13093 = new C6309();
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6309 mo9202() {
        m9215();
        InterfaceC6313 interfaceC6313Mo9202 = this.f13094.mo9202();
        C6309 c6309 = this.f13093;
        this.f13092 += c6309.m11172(interfaceC6313Mo9202);
        return c6309;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo9200() {
        return this.f13093.mo11163() && this.f13094.mo9200();
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo9201(int i, ContinuationImpl continuationImpl) {
        return mo9202().f15487 < ((long) i) ? this.f13094.mo9201(i, continuationImpl) : Boolean.TRUE;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo9203() {
        return this.f13094.mo9203();
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9204(Throwable th) {
        this.f13094.mo9204(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m9215() {
        long j = this.f13091;
        long j2 = this.f13092;
        long j3 = this.f13093.f15487;
        this.f13091 = (j2 - j3) + j;
        this.f13092 = j3;
    }
}
