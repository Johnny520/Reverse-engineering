package p056;

import android.view.View;
import androidx.compose.runtime.internal.C2080;
import java.lang.reflect.Method;
import p035.C7092;
import p049.C7164;
import p052.AbstractC7187;
import p348.C9614;
import p353.AbstractC9632;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7269 extends AbstractC9632 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method methodM12414;
        if (AbstractC7187.f17853 > 5028) {
            C7164 c7164M12412 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
            String strM14532 = "setMenu";
            C2080 c2080 = c7164M12412.f17803;
            c2080.f3963 = strM14532;
            c2080.f3964 = new Class[]{Object.class, View.class};
            methodM12414 = c7164M12412.m12414();
        } else {
            C7164 c7164M124122 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
            String strM145322 = "setMenu";
            C2080 c20802 = c7164M124122.f17803;
            c20802.f3963 = strM145322;
            c20802.f3964 = new Class[]{Object.class};
            methodM12414 = c7164M124122.m12414();
        }
        m12390(methodM12414, new C7092(this));
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return c9614.f25085.intValue() >= 2;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 2;
    }
}
