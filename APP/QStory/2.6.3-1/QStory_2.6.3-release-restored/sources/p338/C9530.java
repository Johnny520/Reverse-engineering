package p338;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.InterfaceC3749;
import java.util.HashMap;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p053.AbstractC7199;
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
        "AutoSendQZOne";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14982(String str) {
        int iIndexOf = str.indexOf("frameElement.callback(");
        if (iIndexOf == -1) {
            C6755.m11869("未找到 callback 函数");
            return;
        }
        String string = InterfaceC3749.m6934(str.substring(str.indexOf(123, iIndexOf), str.lastIndexOf(125) + 1)).getString("t1_tid");
        String str2 = "https://user.qzone.qq.com/proxy/domain/taotao.qzone.qq.com/cgi-bin/emotion_cgi_delete_v6?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM700 = AbstractC0900.m700("uin=o" + QQEnvTool.getCurrentUin());
        sbM700.append("; skey=");
        sbM700.append(Hook_cookie.getSkey());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append("; p_skey=");
        sbM7002.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string2 = sbM7002.toString();
        HashMap map = new HashMap();
        map.put("tid", string);
        map.put("t1_source", "1");
        map.put("hostuin", QQEnvTool.getCurrentUin());
        map.put("code_version", "1");
        map.put("format", "fs");
        map.put("qzreferrer", "https://user.qzone.qq.com/" + QQEnvTool.getCurrentUin() + "/main");
        AbstractC7199.m12506(str2, string2, map);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "配合自动发送QQ空间使用,发表空间后自动删除自己发布的空间";
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
