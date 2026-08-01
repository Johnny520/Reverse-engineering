package p352;

import android.os.Bundle;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import java.util.HashSet;
import java.util.List;
import p042.AbstractC7140;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "弃用")
public class C9621 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashSet f25103 = new HashSet();

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(326));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        m12390(c7164M12412.m12414(), new C3191(this, 29));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1133);
    }
}
