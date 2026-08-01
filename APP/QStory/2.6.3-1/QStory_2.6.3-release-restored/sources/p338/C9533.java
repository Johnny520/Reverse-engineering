package p338;

import android.util.Pair;
import androidx.activity.AbstractC0900;
import androidx.compose.material.ripple.RunnableC1945;
import bsh.C3466;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p053.AbstractC7199;
import p348.C9614;
import p353.AbstractC9632;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9533 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f24878 = new C9924("QZone", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24879 = Executors.newSingleThreadScheduledExecutor();

    static {
        "AutoSendQZOne";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m14984(String str, String str2) {
        String str3 = "https://h5.qzone.qq.com/proxy/domain/w.qzone.qq.com/cgi-bin/likes/internal_dolike_app?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM700 = AbstractC0900.m700("uin=o" + QQEnvTool.getCurrentUin());
        sbM700.append("; p_uin=o=");
        sbM700.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append("; skey=");
        sbM7002.append(Hook_cookie.getSkey());
        StringBuilder sbM7003 = AbstractC0900.m700(sbM7002.toString());
        sbM7003.append("; p_skey=");
        sbM7003.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string = sbM7003.toString();
        HashMap map = new HashMap();
        map.put("opuin", QQEnvTool.getCurrentUin());
        map.put("unikey", str);
        map.put("curkey", str2);
        map.put("appid", "311");
        map.put("opr_type", "like");
        map.put("format", "purejson");
        return InterfaceC3749.m6934(AbstractC7199.m12506(str3, string, map)).getIntValue("ret") == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Pair m14985() {
        String str = "https://h5.qzone.qq.com/webapp/json/mqzone_feeds/getActiveFeeds?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM700 = AbstractC0900.m700("uin=o" + QQEnvTool.getCurrentUin());
        sbM700.append("; p_uin=o=");
        sbM700.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append("; skey=");
        sbM7002.append(Hook_cookie.getSkey());
        StringBuilder sbM7003 = AbstractC0900.m700(sbM7002.toString());
        sbM7003.append("; p_skey=");
        sbM7003.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string = sbM7003.toString();
        HashMap map = new HashMap();
        map.put("res_type", "0");
        map.put("refresh_type", "1");
        map.put("format", "json");
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7199.m12506(str, string, map));
        if (jSONObjectM6934.getIntValue("ret", -1) != 0) {
            throw new RuntimeException("获取QQ空间列表失败:" + jSONObjectM6934);
        }
        JSONArray jSONArray = jSONObjectM6934.getJSONObject("data").getJSONArray("vFeeds");
        if (jSONArray.isEmpty()) {
            C3466.m5899("空间列表为0");
            return null;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0).getJSONObject("comm");
        return new Pair(jSONObject.getString("orglikekey"), jSONObject.getString("curlikekey"));
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f24879.scheduleWithFixedDelay(new RunnableC1945(this, 27), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "每天自动点赞空间,+0.5天成长值";
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
}
