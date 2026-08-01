package p338;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.InterfaceC3749;
import java.util.HashMap;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p053.AbstractC7199;
import p303.AbstractC9234;
import p348.C9614;
import p353.AbstractC9632;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9530 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f24872 = 0;

    static {
        AbstractC9234.m14531(1170);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14982(String str) {
        int iIndexOf = str.indexOf(AbstractC9234.m14531(1194));
        if (iIndexOf == -1) {
            C6755.m11869(AbstractC9234.m14531(1195));
            return;
        }
        String string = InterfaceC3749.m6934(str.substring(str.indexOf(123, iIndexOf), str.lastIndexOf(125) + 1)).getString(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵呜喵喵喵呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"));
        String str2 = AbstractC9234.m14531(1196) + Hook_cookie.getG_TK(AbstractC9234.m14531(946));
        StringBuilder sbM700 = AbstractC0900.m700(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM700.append(AbstractC9234.m14532("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM700.append(Hook_cookie.getSkey());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append(AbstractC9234.m14531(948));
        sbM7002.append(Hook_cookie.getPskey(AbstractC9234.m14531(946)));
        String string2 = sbM7002.toString();
        HashMap map = new HashMap();
        map.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵"), string);
        map.put(AbstractC9234.m14531(1197), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"), QQEnvTool.getCurrentUin());
        map.put(AbstractC9234.m14531(1183), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"));
        map.put(AbstractC9234.m14531(1184), AbstractC9234.m14531(1185) + QQEnvTool.getCurrentUin() + AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"));
        AbstractC7199.m12506(str2, string2, map);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1198);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
    }
}
