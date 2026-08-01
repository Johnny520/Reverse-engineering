package p043;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import p022.C6267;
import p032.C6316;
import p035.AbstractC6340;
import p331.C8799;
import p336.AbstractC8805;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6450 extends AbstractC8805 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11827;
        if (AbstractC6340.f17461 > 5028) {
            C6316 c6316M11825 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
            String strM6668 = "setMenu";
            C1245 c1245 = c6316M11825.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{Object.class, View.class};
            methodM11827 = c6316M11825.m11827();
        } else {
            C6316 c6316M118252 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
            String strM66682 = "setMenu";
            C1245 c12452 = c6316M118252.f17409;
            c12452.f3617 = strM66682;
            c12452.f3618 = new Class[]{Object.class};
            methodM11827 = c6316M118252.m11827();
        }
        m11803(methodM11827, new C6267(this));
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return c8799.f24759.intValue() >= 2;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 2;
    }
}
