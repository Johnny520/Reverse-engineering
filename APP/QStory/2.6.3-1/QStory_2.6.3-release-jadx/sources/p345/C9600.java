package p345;

import com.alibaba.fastjson2.AbstractC3738;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p104.AbstractC8005;
import p104.C7981;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9600 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9600 f25056 = new C9600();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f25055 = AbstractC9234.m14531(2496);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25054 = AbstractC9234.m14531(2497);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f25053 = AbstractC9234.m14531(2498);

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
        AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C9595 c9595 = new C9595();
        AbstractC9234.m14531(2295);
        c9595.m15027(string, AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜喵喵~呜喵喵呜呜呜呜呜~呜呜呜喵喵呜呜呜~呜呜喵呜喵喵呜喵"));
        c9595.m15027(str, AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵呜呜呜呜~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵呜喵~呜呜喵呜呜呜喵喵"));
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
