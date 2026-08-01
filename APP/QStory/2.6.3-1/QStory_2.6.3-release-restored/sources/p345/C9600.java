package p345;

import com.alibaba.fastjson2.AbstractC3738;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p104.AbstractC8005;
import p104.C7981;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9600 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9600 f25056 = new C9600();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f25055 = "get_current_account_info";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25054 = "获取当前QQ和昵称";

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f25053 = "读取当前登录账号的 QQ 号与昵称";

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7981 f25052 = AbstractC3738.m6897(3, null);

    @Override // p345.InterfaceC9598
    public final String getId() {
        return f25055;
    }

    @Override // p345.InterfaceC9598
    public final String getTitle() {
        return f25054;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo15010(C7981 c7981, AbstractC8005 abstractC8005) {
        String currentUin = QQEnvTool.getCurrentUin();
        String string = currentUin != null ? AbstractC5976.m10714(currentUin).toString() : null;
        if (string == null) {
            string = "";
        }
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        String string2 = currentAccountNickName != null ? AbstractC5976.m10714(currentAccountNickName).toString() : null;
        String str = string2 != null ? string2 : "";
        boolean z = (AbstractC5976.m10731(string) && AbstractC5976.m10731(str)) ? false : true;
        "block";
        C9595 c9595 = new C9595();
        "$this$jsonObject";
        c9595.m15027(string, "QQ号");
        c9595.m15027(str, "昵称");
        return AbstractC3738.m6891(AbstractC9594.m15023(new C7981(c9595.f25048)), abstractC8005, !z);
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7981 mo15011() {
        return f25052;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15012() {
        return f25053;
    }
}
