package p039;

import java.util.HashMap;
import p026.AbstractC6311;
import p034.AbstractC6344;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5818;
import top.suzhelan.qstory.hook.item.chat.C5837;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6432 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C5837 c5837 = new C5837(this, 1);
        HashMap map = C5818.f15949;
        AbstractC6344.m11874(this, c5837);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(157);
    }
}
