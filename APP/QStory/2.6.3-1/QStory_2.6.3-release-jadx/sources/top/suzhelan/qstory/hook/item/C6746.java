package top.suzhelan.qstory.hook.item;

import androidx.compose.material.ripple.RunnableC1945;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import p042.AbstractC7140;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6746 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f16449 = {AbstractC4765.m8874().concat(AbstractC9234.m14531(1087)), AbstractC4765.m8874().concat(AbstractC9234.m14531(1088))};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16450 = AbstractC4765.m8874().concat(AbstractC9234.m14531(1089));

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1945(this, 11)).start();
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1090) + this.f16450 + AbstractC9234.m14531(1091);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m11857() {
        File file = new File(this.f16450);
        for (String str : this.f16449) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
        return file.exists() && file.isFile();
    }
}
