package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import p015.AbstractC6206;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5765 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5788 f15823;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f15824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f15825;

    public C5765(Method method, int i, InterfaceC5788 interfaceC5788) {
        this.f15825 = method;
        this.f15824 = i;
        this.f15823 = interfaceC5788;
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11094(C5758 c5758, Object obj) {
        int i = this.f15824;
        Method method = this.f15825;
        if (obj == null) {
            throw AbstractC5784.m11124(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c5758.f15783 = (AbstractC6206) this.f15823.mo4149(obj);
        } catch (IOException e) {
            throw AbstractC5784.m11128(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
