package p336;

import android.os.Bundle;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import java.util.HashSet;
import java.util.List;
import p026.AbstractC6311;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "弃用")
public class C8792 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashSet f24758 = new HashSet();

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(326));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        m11831(c6335M11853.m11855(), new C2358(this, 29));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1133);
    }
}
