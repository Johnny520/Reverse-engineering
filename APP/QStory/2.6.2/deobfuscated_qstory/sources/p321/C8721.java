package p321;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
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

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8721 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24585 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f24586 = new C9114("QZone", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24587 = Executors.newSingleThreadScheduledExecutor();

    static {
        "AutoSendQZOne";
        "\u4ec5\u81ea\u5df1\u53ef\u89c1";
        "\u516c\u5f00";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m14397(String str, boolean z) {
        String strM6668 = z ? "1" : "64";
        String str2 = "https://user.qzone.qq.com/proxy/domain/taotao.qzone.qq.com/cgi-bin/emotion_cgi_publish_v6?g_tk=" + Hook_cookie.getG_TK("qzone.qq.com");
        StringBuilder sbM149 = AbstractC0053.m149("uin=o" + QQEnvTool.getCurrentUin());
        sbM149.append("; skey=");
        sbM149.append(Hook_cookie.getSkey());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append("; p_skey=");
        sbM1492.append(Hook_cookie.getPskey("qzone.qq.com"));
        String string = sbM1492.toString();
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
        map.put("ugc_right", strM6668);
        map.put("to_sign", "0");
        map.put("hostuin", QQEnvTool.getCurrentUin());
        map.put("code_version", "1");
        map.put("format", "fs");
        map.put("qzreferrer", "https://user.qzone.qq.com/" + QQEnvTool.getCurrentUin() + "/main");
        return AbstractC6353.m11899(str2, string, map);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f24587.scheduleWithFixedDelay(new RunnableC1107(this, 27), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u6bcf\u5929\u81ea\u52a8\u53d1QQ\u7a7a\u95f4,+0.5\u5929\u6210\u957f\u503c,\u70b9\u51fb\u53ef\u8fdb\u884c\u624b\u52a8\u53d1\u9001\u6d4b\u8bd5";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 23);
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
