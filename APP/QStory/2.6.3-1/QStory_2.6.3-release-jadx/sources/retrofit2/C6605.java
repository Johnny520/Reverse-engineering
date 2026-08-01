package retrofit2;

import androidx.compose.p001ui.graphics.vector.C2397;
import java.lang.reflect.Method;
import p023.C6980;
import p191.AbstractC8568;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6605 extends AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f16199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f16200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f16201;

    public /* synthetic */ C6605(Method method, int i, int i2) {
        this.f16201 = i2;
        this.f16200 = method;
        this.f16199 = i;
    }

    @Override // retrofit2.AbstractC6615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11710(C6589 c6589, Object obj) {
        int i = this.f16201;
        int i2 = this.f16199;
        Method method = this.f16200;
        switch (i) {
            case 0:
                C6980 c6980 = (C6980) obj;
                if (c6980 == null) {
                    throw AbstractC6615.m11740(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                C2397 c2397 = c6589.f16120;
                c2397.getClass();
                int size = c6980.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC8568.m13641(c2397, c6980.m12109(i3), c6980.m12111(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw AbstractC6615.m11740(method, i2, "@Url parameter is null.", new Object[0]);
                }
                c6589.f16123 = obj.toString();
                return;
        }
    }
}
