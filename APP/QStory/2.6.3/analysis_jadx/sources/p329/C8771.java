package p329;

import com.alibaba.fastjson2.AbstractC2905;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.util.qq.QQEnvTool;
import p088.AbstractC7176;
import p088.C7152;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8771 implements InterfaceC8769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8771 f24711 = new C8771();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24710 = AbstractC8405.m13972(2496);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24709 = AbstractC8405.m13972(2497);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24708 = AbstractC8405.m13972(2498);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7152 f24707 = AbstractC2905.m6337(3, null);

    @Override // p329.InterfaceC8769
    public final String getId() {
        return f24710;
    }

    @Override // p329.InterfaceC8769
    public final String getTitle() {
        return f24709;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14451(C7152 c7152, AbstractC7176 abstractC7176) {
        String currentUin = QQEnvTool.getCurrentUin();
        String string = currentUin != null ? AbstractC5144.m10155(currentUin).toString() : null;
        if (string == null) {
            string = "";
        }
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        String string2 = currentAccountNickName != null ? AbstractC5144.m10155(currentAccountNickName).toString() : null;
        String str = string2 != null ? string2 : "";
        boolean z = (AbstractC5144.m10172(string) && AbstractC5144.m10172(str)) ? false : true;
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C8766 c8766 = new C8766();
        AbstractC8405.m13972(2295);
        c8766.m14468(string, AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜喵喵~呜喵喵呜呜呜呜呜~呜呜呜喵喵呜呜呜~呜呜喵呜喵喵呜喵"));
        c8766.m14468(str, AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵呜呜呜呜~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵呜喵~呜呜喵呜呜呜喵喵"));
        return AbstractC2905.m6331(AbstractC8765.m14464(new C7152(c8766.f24703)), abstractC7176, !z);
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7152 mo14452() {
        return f24707;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14453() {
        return f24708;
    }
}
