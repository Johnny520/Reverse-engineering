package p039;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C1245;
import p019.C6263;
import p033.AbstractC6333;
import p033.C6335;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6402 extends AbstractC8803 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        try {
            m11830(AbstractC6333.m11850(AbstractC8405.m13972(198), AbstractC8405.m13972(93), Boolean.TYPE, new Class[]{Bundle.class}), new C6263(15));
        } catch (Exception unused) {
            C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(196));
            String strM13972 = AbstractC8405.m13972(197);
            C1245 c1245 = c6335M11853.f17458;
            c1245.f3618 = strM13972;
            c1245.f3617 = Void.TYPE;
            c1245.f3619 = new Class[]{View.class, Bundle.class};
            m11830(c6335M11853.m11855(), new C6263(14));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(195);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
