package p056;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p303.AbstractC9234;
import p348.C9614;
import p353.AbstractC9632;
import top.suzhelan.qstory.hook.api.C6646;
import top.suzhelan.qstory.hook.api.C6647;
import top.suzhelan.qstory.hook.api.C6651;
import top.suzhelan.qstory.hook.item.C6743;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7263 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Set f17968;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f17969 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HashMap f17970;

    public C7263() {
        AbstractC9234.m14531(496);
        AbstractC9234.m14531(497);
        this.f17970 = new HashMap();
        this.f17968 = new HashSet();
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Set setM1724 = AbstractC1298.m1724(AbstractC9234.m14531(496));
        this.f17968 = setM1724;
        if (setM1724.size() == 0) {
            this.f17968.add(AbstractC9234.m14531(509));
            this.f17968.add(AbstractC9234.m14531(510));
        }
        this.f17970 = AbstractC1298.m1722(AbstractC9234.m14531(497));
        AbstractC1298.m1711(AbstractC9234.m14531(497), this.f17970);
        AbstractC1298.m1703(AbstractC9234.m14531(496), this.f17968);
        C6743 c6743 = new C6743(this, 3);
        C6651 c6651 = C6647.f16291;
        AbstractC9234.m14531(1562);
        AbstractC9234.m14531(1566);
        C6647.f16288.add(new C6646(this, c6743));
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
