package p338;

import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.compose.material.ripple.RunnableC1945;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
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

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9531 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24873 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f24874 = new C9924("QZone", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24875 = Executors.newSingleThreadScheduledExecutor();

    static {
        "AutoSendQZOne";
        "仅自己可见";
        "公开";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m14983(String str, boolean z) {
        String strM14532 = z ? "1" : "64";
        String str2 = "https://user.qzone.qq.com/proxy/domain/taotao.qzone.qq.com/cgi-bin/emotion_cgi_publish_v6?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM700 = AbstractC0900.m700("uin=o" + QQEnvTool.getCurrentUin());
        sbM700.append("; skey=");
        sbM700.append(Hook_cookie.getSkey());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append("; p_skey=");
        sbM7002.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string = sbM7002.toString();
        HashMap map = new HashMap();
        map.put("syn_tweet_verson", "1");
        map.put("paramstr", "1");
        map.put("pic_template", "");
        map.put("richtype", "");
        map.put("richval", "");
        map.put("special_url", "");
        map.put("subrichtype", "");
        map.put("con", str);
        map.put("feedversion", "1");
        map.put("ver", "1");
        map.put("ugc_right", strM14532);
        map.put("to_sign", "0");
        map.put("hostuin", QQEnvTool.getCurrentUin());
        map.put("code_version", "1");
        map.put("format", "fs");
        map.put("qzreferrer", "https://user.qzone.qq.com/" + QQEnvTool.getCurrentUin() + "/main");
        return AbstractC7199.m12506(str2, string, map);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f24875.scheduleWithFixedDelay(new RunnableC1945(this, 28), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "每天自动发QQ空间,+0.5天成长值,点击可进行手动发送测试";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 23);
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
