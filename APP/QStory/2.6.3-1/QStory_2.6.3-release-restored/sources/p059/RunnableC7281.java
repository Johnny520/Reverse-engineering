package p059;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.alibaba.fastjson2.AbstractC3738;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import p025.AbstractC7012;
import p026.AbstractC7017;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p051.C7182;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7281 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final String f18023 = "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f18024;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f18025;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f18026;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String f18027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18028;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f18029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f18030 = AbstractC3738.m6846(AbstractC7166.m12425("com.tenpay.sdk.net.core.processor.EncryptProcessor"), new Object[0]);

    public RunnableC7281() {
        "需要一个为pre_grap_token=rand=6e5f10e97975a3d35589a1b12c071c68&sign=267dcb90416a4c908da80c47802cfbf8&ts=1706363819&ver=1的普通参数 我查找不到";
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            m12542();
        } catch (Exception e) {
            String strM14532 = "Hb";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OpenHbNetClient{encryptProcessor=");
        sb.append(this.f18030);
        sb.append(", redPacketType=");
        AbstractC7012.m12137(sb, this.f18028, 440);
        sb.append(this.f18029);
        sb.append('\'');
        sb.append(", redPacketID='");
        sb.append(this.f18025);
        sb.append('\'');
        sb.append(", redPacketDesc='");
        sb.append(this.f18024);
        sb.append('\'');
        sb.append(", troopUin='");
        sb.append(this.f18026);
        sb.append('\'');
        sb.append(", senderUin='");
        sb.append(this.f18027);
        sb.append('\'');
        sb.append(", msgMd5='");
        sb.append("null'");
        sb.append(", msgSeq='");
        sb.append("null'");
        sb.append(", msgId='");
        sb.append("null'}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12542() throws Throwable {
        String strEncode;
        String myuin = Hook_cookie.getMyuin();
        String name = Hook_cookie.getName(myuin);
        HashMap map = new HashMap();
        map.put("subchanne", null);
        map.put("authkey", this.f18029);
        map.put("hb_from", "0");
        map.put("agreement", "0");
        map.put("pay_flag", "0");
        map.put("groupid", this.f18026);
        map.put("channel", String.valueOf(this.f18028));
        map.put("senderuin", this.f18027);
        map.put("listid", this.f18025);
        map.put("grouptype", "1");
        map.put("sub_guild_id", null);
        map.put("answer", this.f18024);
        map.put("groupuin", this.f18027);
        map.put("tinyid", null);
        map.put("guild_id", null);
        map.put("name", name);
        map.put("uin", myuin);
        map.put("msg_md5", null);
        map.put("msg_seq", null);
        map.put("msg_id", null);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append(URLEncoder.encode(str, "UTF-8"));
            }
        }
        String strM14531 = "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";
        Class clsM12425 = AbstractC7166.m12425("com.tenpay.sdk.net.core.processor.PsKeyProcessor");
        Object objM12416 = AbstractC7165.m12416(clsM12425, clsM12425, "INSTANCE");
        Object[] objArr = {"qpay_hb_na_grap", (String) AbstractC7162.m12406(objM12416, "getPsKey", String.class, new Class[]{String.class}, strM14531), Hook_cookie.getMyuin()};
        Object objM6845 = AbstractC3738.m6845(objArr, new Class[]{String.class, String.class, String.class}, AbstractC7166.m12425("com.tenpay.sdk.net.core.comm.SessionKey"));
        Class clsM124252 = AbstractC7166.m12425("com.tenpay.sdk.net.core.comm.SessionKey");
        Class clsM124253 = AbstractC7166.m12425("com.tenpay.sdk.net.core.statistic.StatisticInfo");
        Class clsM124254 = AbstractC7166.m12425("com.tenpay.sdk.net.core.processor.EncryptProcessor$ProcessResult");
        String strM145312 = "processEncrypt";
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.TRUE;
        Object[] objArr2 = {f18023, objM6845, map, bool, bool, null};
        Object objM12406 = AbstractC7162.m12406(this.f18030, strM145312, clsM124254, new Class[]{String.class, clsM124252, Map.class, cls, cls, clsM124253}, objArr2);
        Map map2 = (Map) AbstractC7162.m12405(Map.class, "getBodyData", objM12406);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : map2.entrySet()) {
            String str2 = (String) entry2.getValue();
            if (str2 != null) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    Charset charset = StandardCharsets.UTF_8;
                    strEncode = URLEncoder.encode(str2, StandardCharsets.UTF_8);
                } else {
                    strEncode = URLEncoder.encode(str2, "UTF-8");
                }
                sb2.append((String) entry2.getKey());
                sb2.append("=");
                sb2.append(strEncode);
            }
        }
        String string = sb2.toString();
        Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
        Class clsM124255 = AbstractC7166.m12425("com.tencent.mobileqq.pb.ByteStringMicro");
        Object objInvoke = AbstractC7162.m12402(clsM124255, clsM124255, "copyFromUtf8", new Class[]{String.class}).invoke(null, string);
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "cgiName", objM6846), "set", new Class[]{String.class}, new Object[]{"hb_pre_grap"});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "reqBody", objM6846), "set", new Class[]{clsM124255}, new Object[]{objInvoke});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "enType", objM6846), "set", new Class[]{Integer.TYPE}, new Object[]{1});
        byte[] bArrM12500 = C7182.m12500((byte[]) AbstractC7162.m12405(byte[].class, "toByteArray", objM6846));
        Class clsM124256 = AbstractC7166.m12425("mqq.app.NewIntent");
        Intent intent = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425("mqq.app.MobileQQ"), null, "sMobileQQ"), AbstractC7166.m12425("com.tencent.mobileqq.qwallet.e.g")}, new Class[]{Context.class, Class.class}, clsM124256);
        intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
        intent.putExtra("data", bArrM12500);
        XposedHelpers.callMethod(intent, "setObserver", new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new C7282(this, clsM124255, objM6845, objM12406, 0))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC7166.m12425("mqq.app.NewIntent")}, new Object[]{intent});
    }
}
