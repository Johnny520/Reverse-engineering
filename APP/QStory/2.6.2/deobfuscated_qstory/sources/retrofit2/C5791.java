package retrofit2;

import kotlin.coroutines.InterfaceC4356;
import p015.C6200;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5791 extends AbstractC5783 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f15888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5795 f15889;

    public C5791(C5755 c5755, C6200 c6200, InterfaceC5788 interfaceC5788, InterfaceC5795 interfaceC5795, boolean z) {
        super(c5755, c6200, interfaceC5788);
        this.f15889 = interfaceC5795;
        this.f15888 = z;
    }

    @Override // retrofit2.AbstractC5783
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo11117(C5767 c5767, Object[] objArr) {
        InterfaceC5777 interfaceC5777 = (InterfaceC5777) this.f15889.mo9762(c5767);
        InterfaceC4356 interfaceC4356 = (InterfaceC4356) objArr[objArr.length - 1];
        try {
            try {
                if (!this.f15888) {
                    return AbstractC5784.m11122(interfaceC5777, interfaceC4356);
                }
                try {
                    interfaceC5777.getClass();
                    return AbstractC5784.m11121(interfaceC5777, interfaceC4356);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                return AbstractC5784.m11126(th, interfaceC4356);
            }
        } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
            throw e3;
        }
    }
}
