package top.suzhelan.qstory.hook.item;

import android.os.Environment;
import p042.AbstractC7140;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6747 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        m12389(Class.forName(AbstractC9234.m14531(1085), false, classLoader).getDeclaredMethod(AbstractC9234.m14531(1086), String.class), new C6755(this, 0));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1084).concat(Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC9234.m14531(1082));
    }
}
