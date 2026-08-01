package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5425 implements InterfaceC5445 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5426[] f15066;

    public C5425(C5426[] c5426Arr) {
        this.f15066 = c5426Arr;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f15066 + ']';
    }

    @Override // kotlinx.coroutines.InterfaceC5445
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10411(Throwable th) {
        m10516();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10516() {
        for (C5426 c5426 : this.f15066) {
            InterfaceC5397 interfaceC5397 = c5426.f15071;
            if (interfaceC5397 == null) {
                AbstractC4394.m8918("handle");
                throw null;
            }
            interfaceC5397.dispose();
        }
    }
}
