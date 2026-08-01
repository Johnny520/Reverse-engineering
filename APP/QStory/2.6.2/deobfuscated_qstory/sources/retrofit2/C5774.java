package retrofit2;

import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.AbstractC3065;
import java.lang.reflect.Method;
import p015.C6224;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5774 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f15854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f15855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15856;

    public /* synthetic */ C5774(Method method, int i, int i2) {
        this.f15856 = i2;
        this.f15855 = method;
        this.f15854 = i;
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11094(C5758 c5758, Object obj) {
        int i = this.f15856;
        int i2 = this.f15854;
        Method method = this.f15855;
        switch (i) {
            case 0:
                C6224 c6224 = (C6224) obj;
                if (c6224 == null) {
                    throw AbstractC5784.m11124(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                C1562 c1562 = c5758.f15775;
                c1562.getClass();
                int size = c6224.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC3065.m6839(c1562, c6224.m11679(i3), c6224.m11681(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw AbstractC5784.m11124(method, i2, "@Url parameter is null.", new Object[0]);
                }
                c5758.f15778 = obj.toString();
                return;
        }
    }
}
