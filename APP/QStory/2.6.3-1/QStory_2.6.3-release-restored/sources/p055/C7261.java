package p055;

import java.util.HashMap;
import p042.AbstractC7140;
import p050.AbstractC7173;
import top.suzhelan.qstory.hook.api.C6648;
import top.suzhelan.qstory.hook.item.chat.C6667;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7261 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C6667 c6667 = new C6667(this, 1);
        HashMap map = C6648.f16294;
        AbstractC7173.m12433(this, c6667);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "仅支持QQNT";
    }
}
