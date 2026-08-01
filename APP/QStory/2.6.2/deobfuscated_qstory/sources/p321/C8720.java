package p321;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.InterfaceC2915;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p036.AbstractC6353;
import p331.C8799;
import p336.AbstractC8805;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8720 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f24584 = 0;

    static {
        "AutoSendQZOne";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14396(String str) {
        int iIndexOf = str.indexOf("frameElement.callback(");
        if (iIndexOf == -1) {
            C5919.m11249("\u672a\u627e\u5230 callback \u51fd\u6570");
            return;
        }
        String string = InterfaceC2915.m6316(str.substring(str.indexOf(123, iIndexOf), str.lastIndexOf(125) + 1)).getString("t1_tid");
        String str2 = "https://user.qzone.qq.com/proxy/domain/taotao.qzone.qq.com/cgi-bin/emotion_cgi_delete_v6?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM149 = AbstractC0053.m149("uin=o" + QQEnvTool.getCurrentUin());
        sbM149.append("; skey=");
        sbM149.append(Hook_cookie.getSkey());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append("; p_skey=");
        sbM1492.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string2 = sbM1492.toString();
        HashMap map = new HashMap();
        map.put("tid", string);
        map.put("t1_source", "1");
        map.put("hostuin", QQEnvTool.getCurrentUin());
        map.put("code_version", "1");
        map.put("format", "fs");
        map.put("qzreferrer", "https://user.qzone.qq.com/" + QQEnvTool.getCurrentUin() + "/main");
        AbstractC6353.m11899(str2, string2, map);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u914d\u5408\u81ea\u52a8\u53d1\u9001QQ\u7a7a\u95f4\u4f7f\u7528,\u53d1\u8868\u7a7a\u95f4\u540e\u81ea\u52a8\u5220\u9664\u81ea\u5df1\u53d1\u5e03\u7684\u7a7a\u95f4";
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
    }
}
