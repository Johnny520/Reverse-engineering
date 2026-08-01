package top.suzhelan.qstory.hook.item;

import androidx.compose.material.ripple.RunnableC1107;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import p026.AbstractC6311;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5916 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f16104 = {AbstractC3933.m8315().concat(AbstractC8405.m13972(1087)), AbstractC3933.m8315().concat(AbstractC8405.m13972(1088))};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16105 = AbstractC3933.m8315().concat(AbstractC8405.m13972(1089));

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1107(this, 11)).start();
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1090) + this.f16105 + AbstractC8405.m13972(1091);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m11298() {
        File file = new File(this.f16105);
        for (String str : this.f16104) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
        return file.exists() && file.isFile();
    }
}
