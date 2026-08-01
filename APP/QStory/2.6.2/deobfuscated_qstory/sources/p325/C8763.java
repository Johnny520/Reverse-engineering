package p325;

import com.bumptech.glide.AbstractC3056;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.util.qq.QQEnvTool;
import p088.AbstractC7175;
import p088.C7151;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8763 implements InterfaceC8761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8763 f24686 = new C8763();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24685 = "get_current_account_info";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24684 = "\u83b7\u53d6\u5f53\u524dQQ\u548c\u6635\u79f0";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24683 = "\u8bfb\u53d6\u5f53\u524d\u767b\u5f55\u8d26\u53f7\u7684 QQ \u53f7\u4e0e\u6635\u79f0";

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7151 f24682 = AbstractC3056.m6655(3, null);

    @Override // p325.InterfaceC8761
    public final String getId() {
        return f24685;
    }

    @Override // p325.InterfaceC8761
    public final String getTitle() {
        return f24684;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14417(C7151 c7151, AbstractC7175 abstractC7175) {
        String currentUin = QQEnvTool.getCurrentUin();
        String string = currentUin != null ? AbstractC5143.m10150(currentUin).toString() : null;
        if (string == null) {
            string = "";
        }
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        String string2 = currentAccountNickName != null ? AbstractC5143.m10150(currentAccountNickName).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        boolean z = (AbstractC5143.m10164(string) && AbstractC5143.m10164(string2)) ? false : true;
        "block";
        C8758 c8758 = new C8758();
        "$this$jsonObject";
        c8758.m14434(string, "QQ\u53f7");
        c8758.m14434(string2, "\u6635\u79f0");
        return AbstractC3056.m6699(AbstractC8757.m14430(new C7151(c8758.f24678)), abstractC7175, !z);
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7151 mo14418() {
        return f24682;
    }

    @Override // p325.InterfaceC8761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14419() {
        return f24683;
    }
}
