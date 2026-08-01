package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6258 implements InterfaceC6278 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6259[] f15411;

    public C6258(C6259[] c6259Arr) {
        this.f15411 = c6259Arr;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f15411 + ']';
    }

    @Override // kotlinx.coroutines.InterfaceC6278
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10974(Throwable th) {
        m11079();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11079() {
        for (C6259 c6259 : this.f15411) {
            InterfaceC6230 interfaceC6230 = c6259.f15416;
            if (interfaceC6230 == null) {
                AbstractC5227.m9467("handle");
                throw null;
            }
            interfaceC6230.dispose();
        }
    }
}
