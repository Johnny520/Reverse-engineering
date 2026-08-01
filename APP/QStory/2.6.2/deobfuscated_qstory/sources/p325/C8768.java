package p325;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p392.AbstractC9124;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8768 implements InterfaceC8761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8768 f24703 = new C8768();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24702 = "get_group_list";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24701 = "\u83b7\u53d6\u7fa4\u804a\u5217\u8868";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24700 = "\u8bfb\u53d6\u5f53\u524d\u8d26\u53f7\u7684\u7fa4\u804a\u5217\u8868\u5e76\u8fd4\u56de\u7fa4\u53f7\u3001\u7fa4\u540d\u3001\u7fa4\u4e3b\u4e0e\u7ba1\u7406\u5458\u4fe1\u606f";

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7151 f24699 = AbstractC3056.m6655(3, null);

    @Override // p325.InterfaceC8761
    public final String getId() {
        return f24702;
    }

    @Override // p325.InterfaceC8761
    public final String getTitle() {
        return f24701;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14417(C7151 c7151, AbstractC7175 abstractC7175) {
        ArrayList arrayListM14671 = AbstractC9124.m14671();
        "block";
        C8766 c8766 = new C8766();
        "$this$jsonArray";
        Iterator it = arrayListM14671.iterator();
        while (it.hasNext()) {
            c8766.m14436(AbstractC8757.m14433(new C6051((GroupInfo) it.next(), 10)));
        }
        return AbstractC3056.m6699(AbstractC8757.m14430(new C7156(c8766.f24693)), abstractC7175, false);
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7151 mo14418() {
        return f24699;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14419() {
        return f24700;
    }
}
