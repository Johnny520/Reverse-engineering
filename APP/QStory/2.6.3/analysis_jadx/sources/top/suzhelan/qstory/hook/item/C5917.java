package top.suzhelan.qstory.hook.item;

import android.os.Environment;
import p026.AbstractC6311;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5917 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        m11830(Class.forName(AbstractC8405.m13972(1085), false, classLoader).getDeclaredMethod(AbstractC8405.m13972(1086), String.class), new C5925(this, 0));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1084).concat(Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC8405.m13972(1082));
    }
}
