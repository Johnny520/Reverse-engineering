package p039;

import android.content.Intent;
import androidx.compose.runtime.internal.C1245;
import p019.C6263;
import p026.AbstractC6311;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6419 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(193));
        String strM13972 = AbstractC8405.m13972(194);
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3618 = strM13972;
        c1245.f3619 = new Class[]{Intent.class};
        m11831(c6335M11853.m11855(), new C6263(13));
    }
}
