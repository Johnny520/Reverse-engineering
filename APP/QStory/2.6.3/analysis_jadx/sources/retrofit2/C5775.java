package retrofit2;

import androidx.compose.ui.graphics.vector.C1562;
import java.lang.reflect.Method;
import p007.C6151;
import p175.AbstractC7739;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5775 extends AbstractC5785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f15854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f15855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15856;

    public /* synthetic */ C5775(Method method, int i, int i2) {
        this.f15856 = i2;
        this.f15855 = method;
        this.f15854 = i;
    }

    @Override // retrofit2.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11151(C5759 c5759, Object obj) {
        int i = this.f15856;
        int i2 = this.f15854;
        Method method = this.f15855;
        switch (i) {
            case 0:
                C6151 c6151 = (C6151) obj;
                if (c6151 == null) {
                    throw AbstractC5785.m11181(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                C1562 c1562 = c5759.f15775;
                c1562.getClass();
                int size = c6151.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC7739.m13082(c1562, c6151.m11550(i3), c6151.m11552(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw AbstractC5785.m11181(method, i2, "@Url parameter is null.", new Object[0]);
                }
                c5759.f15778 = obj.toString();
                return;
        }
    }
}
