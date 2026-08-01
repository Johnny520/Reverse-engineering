package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import p023.AbstractC6962;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6596 extends AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6619 f16168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16169;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Method f16170;

    public C6596(Method method, int i, InterfaceC6619 interfaceC6619) {
        this.f16170 = method;
        this.f16169 = i;
        this.f16168 = interfaceC6619;
    }

    @Override // retrofit2.AbstractC6615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11710(C6589 c6589, Object obj) {
        int i = this.f16169;
        Method method = this.f16170;
        if (obj == null) {
            throw AbstractC6615.m11740(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            c6589.f16128 = (AbstractC6962) this.f16168.mo4719(obj);
        } catch (IOException e) {
            throw AbstractC6615.m11744(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
