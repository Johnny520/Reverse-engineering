package p322;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.InterfaceC2916;
import java.util.HashMap;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p037.AbstractC6370;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8701 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f24527 = 0;

    static {
        AbstractC8405.m13972(1170);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14423(String str) {
        int iIndexOf = str.indexOf(AbstractC8405.m13972(1194));
        if (iIndexOf == -1) {
            C5925.m11310(AbstractC8405.m13972(1195));
            return;
        }
        String string = InterfaceC2916.m6374(str.substring(str.indexOf(123, iIndexOf), str.lastIndexOf(125) + 1)).getString(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵呜喵喵喵呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"));
        String str2 = AbstractC8405.m13972(1196) + Hook_cookie.getG_TK(AbstractC8405.m13972(946));
        StringBuilder sbM140 = AbstractC0053.m140(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM140.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM140.append(Hook_cookie.getSkey());
        StringBuilder sbM1402 = AbstractC0053.m140(sbM140.toString());
        sbM1402.append(AbstractC8405.m13972(948));
        sbM1402.append(Hook_cookie.getPskey(AbstractC8405.m13972(946)));
        String string2 = sbM1402.toString();
        HashMap map = new HashMap();
        map.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵"), string);
        map.put(AbstractC8405.m13972(1197), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"), QQEnvTool.getCurrentUin());
        map.put(AbstractC8405.m13972(1183), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"));
        map.put(AbstractC8405.m13972(1184), AbstractC8405.m13972(1185) + QQEnvTool.getCurrentUin() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"));
        AbstractC6370.m11947(str2, string2, map);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1198);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
    }
}
