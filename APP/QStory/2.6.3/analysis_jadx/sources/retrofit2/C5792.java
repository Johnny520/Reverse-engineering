package retrofit2;

import kotlin.coroutines.InterfaceC4357;
import p007.C6127;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5792 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f15888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5796 f15889;

    public C5792(C5756 c5756, C6127 c6127, InterfaceC5789 interfaceC5789, InterfaceC5796 interfaceC5796, boolean z) {
        super(c5756, c6127, interfaceC5789);
        this.f15889 = interfaceC5796;
        this.f15888 = z;
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo11174(C5768 c5768, Object[] objArr) {
        InterfaceC5778 interfaceC5778 = (InterfaceC5778) this.f15889.mo9754(c5768);
        InterfaceC4357 interfaceC4357 = (InterfaceC4357) objArr[objArr.length - 1];
        try {
            try {
                if (!this.f15888) {
                    return AbstractC5785.m11179(interfaceC5778, interfaceC4357);
                }
                try {
                    interfaceC5778.getClass();
                    return AbstractC5785.m11178(interfaceC5778, interfaceC4357);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                return AbstractC5785.m11183(th, interfaceC4357);
            }
        } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
            throw e3;
        }
    }
}
