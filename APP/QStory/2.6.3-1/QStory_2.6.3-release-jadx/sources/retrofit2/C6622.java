package retrofit2;

import kotlin.coroutines.InterfaceC5189;
import p023.C6956;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6622 extends AbstractC6614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f16233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6626 f16234;

    public C6622(C6586 c6586, C6956 c6956, InterfaceC6619 interfaceC6619, InterfaceC6626 interfaceC6626, boolean z) {
        super(c6586, c6956, interfaceC6619);
        this.f16234 = interfaceC6626;
        this.f16233 = z;
    }

    @Override // retrofit2.AbstractC6614
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo11733(C6598 c6598, Object[] objArr) {
        InterfaceC6608 interfaceC6608 = (InterfaceC6608) this.f16234.mo10313(c6598);
        InterfaceC5189 interfaceC5189 = (InterfaceC5189) objArr[objArr.length - 1];
        try {
            try {
                if (!this.f16233) {
                    return AbstractC6615.m11738(interfaceC6608, interfaceC5189);
                }
                try {
                    interfaceC6608.getClass();
                    return AbstractC6615.m11737(interfaceC6608, interfaceC5189);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                return AbstractC6615.m11742(th, interfaceC5189);
            }
        } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
            throw e3;
        }
    }
}
