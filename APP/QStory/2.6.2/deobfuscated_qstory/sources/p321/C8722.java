package p321;

import android.util.Pair;
import androidx.activity.AbstractC0053;
import androidx.compose.material.ripple.RunnableC1107;
import bsh.C2632;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p036.AbstractC6353;
import p331.C8799;
import p336.AbstractC8805;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8722 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f24588 = new C9114("QZone", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24589 = Executors.newSingleThreadScheduledExecutor();

    static {
        "AutoSendQZOne";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m14398(String str, String str2) {
        String str3 = "https://h5.qzone.qq.com/proxy/domain/w.qzone.qq.com/cgi-bin/likes/internal_dolike_app?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM149 = AbstractC0053.m149("uin=o" + QQEnvTool.getCurrentUin());
        sbM149.append("; p_uin=o=");
        sbM149.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append("; skey=");
        sbM1492.append(Hook_cookie.getSkey());
        StringBuilder sbM1493 = AbstractC0053.m149(sbM1492.toString());
        sbM1493.append("; p_skey=");
        sbM1493.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string = sbM1493.toString();
        HashMap map = new HashMap();
        map.put("opuin", QQEnvTool.getCurrentUin());
        map.put("unikey", str);
        map.put("curkey", str2);
        map.put("appid", "311");
        map.put("opr_type", "like");
        map.put("format", "purejson");
        return InterfaceC2915.m6316(AbstractC6353.m11899(str3, string, map)).getIntValue("ret") == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Pair m14399() {
        String str = "https://h5.qzone.qq.com/webapp/json/mqzone_feeds/getActiveFeeds?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM149 = AbstractC0053.m149("uin=o" + QQEnvTool.getCurrentUin());
        sbM149.append("; p_uin=o=");
        sbM149.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append("; skey=");
        sbM1492.append(Hook_cookie.getSkey());
        StringBuilder sbM1493 = AbstractC0053.m149(sbM1492.toString());
        sbM1493.append("; p_skey=");
        sbM1493.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string = sbM1493.toString();
        HashMap map = new HashMap();
        map.put("res_type", "0");
        map.put("refresh_type", "1");
        map.put("format", "json");
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6353.m11899(str, string, map));
        if (jSONObjectM6316.getIntValue("ret", -1) != 0) {
            throw new RuntimeException("\u83b7\u53d6QQ\u7a7a\u95f4\u5217\u8868\u5931\u8d25:" + jSONObjectM6316);
        }
        JSONArray jSONArray = jSONObjectM6316.getJSONObject("data").getJSONArray("vFeeds");
        if (jSONArray.isEmpty()) {
            C2632.m5294("\u7a7a\u95f4\u5217\u8868\u4e3a0");
            return null;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0).getJSONObject("comm");
        return new Pair(jSONObject.getString("orglikekey"), jSONObject.getString("curlikekey"));
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f24589.scheduleWithFixedDelay(new RunnableC1107(this, 26), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u6bcf\u5929\u81ea\u52a8\u70b9\u8d5e\u7a7a\u95f4,+0.5\u5929\u6210\u957f\u503c";
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
}
