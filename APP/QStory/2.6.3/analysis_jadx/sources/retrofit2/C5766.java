package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import p007.AbstractC6133;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5766 extends AbstractC5785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5789 f15823;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f15824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f15825;

    public C5766(Method method, int i, InterfaceC5789 interfaceC5789) {
        this.f15825 = method;
        this.f15824 = i;
        this.f15823 = interfaceC5789;
    }

    @Override // retrofit2.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11151(C5759 c5759, Object obj) {
        int i = this.f15824;
        Method method = this.f15825;
        if (obj == null) {
            throw AbstractC5785.m11181(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c5759.f15783 = (AbstractC6133) this.f15823.mo4159(obj);
        } catch (IOException e) {
            throw AbstractC5785.m11185(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
