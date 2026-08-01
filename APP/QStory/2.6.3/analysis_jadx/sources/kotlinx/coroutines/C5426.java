package kotlinx.coroutines;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5426 implements InterfaceC5446 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5427[] f15066;

    public C5426(C5427[] c5427Arr) {
        this.f15066 = c5427Arr;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f15066 + ']';
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo10415(Throwable th) {
        m10520();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10520() {
        for (C5427 c5427 : this.f15066) {
            InterfaceC5398 interfaceC5398 = c5427.f15071;
            if (interfaceC5398 == null) {
                AbstractC4395.m8908("handle");
                throw null;
            }
            interfaceC5398.dispose();
        }
    }
}
