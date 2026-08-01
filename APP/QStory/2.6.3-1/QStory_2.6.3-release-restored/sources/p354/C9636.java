package p354;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3887;
import de.robv.android.xposed.XposedHelpers;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7014;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p059.C7282;
import p303.RestoredStrings;
import top.suzhelan.qstory.hook.item.C6759;

/* JADX INFO: renamed from: 飘花落叶言苏世楪哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f25130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f25131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f25132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f25133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f25134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f25135 = AbstractC3738.m6846(AbstractC7166.m12425("com.tenpay.sdk.net.core.processor.EncryptProcessor"), new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f25136;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f25137;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6759 f25138;

    static {
        "qpay_hb_na_grap";
        "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m15035(C6759 c6759) {
        Class clsM12425;
        int i;
        String string;
        this.f25138 = c6759;
        try {
            clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.qwallet.e.p");
        } catch (Exception unused) {
            AbstractC7014.m12151("[QStory]未适配此QQ版本抢红包");
            clsM12425 = null;
        }
        String currentUin = QQEnvTool.getCurrentUin();
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subchanne", null);
        linkedHashMap.put("authkey", this.f25133);
        linkedHashMap.put("hb_from", "0");
        linkedHashMap.put("agreement", "0");
        linkedHashMap.put("pay_flag", "0");
        linkedHashMap.put("groupid", this.f25130);
        linkedHashMap.put("channel", String.valueOf(this.f25134));
        linkedHashMap.put("pre_grap_token", this.f25136);
        linkedHashMap.put("senderuin", this.f25137);
        linkedHashMap.put("listid", this.f25132);
        linkedHashMap.put("grouptype", "1");
        linkedHashMap.put("sub_guild_id", null);
        linkedHashMap.put("answer", this.f25131);
        linkedHashMap.put("groupuin", this.f25137);
        linkedHashMap.put("tinyid", null);
        linkedHashMap.put("guild_id", null);
        linkedHashMap.put("name", currentAccountNickName);
        linkedHashMap.put("uin", currentUin);
        linkedHashMap.put("msg_md5", null);
        linkedHashMap.put("msg_seq", null);
        linkedHashMap.put("msg_id", null);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append(str);
            }
        }
        Class clsM124252 = AbstractC7166.m12425("com.tenpay.sdk.net.core.processor.PsKeyProcessor");
        String str2 = (String) AbstractC7162.m12406(AbstractC7165.m12416(clsM124252, clsM124252, "INSTANCE"), "getPsKey", String.class, new Class[]{String.class}, "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?");
        String myuin = Hook_cookie.getMyuin();
        int i2 = 436;
        Object objM6845 = AbstractC3738.m6845(new Object[]{"qpay_hb_na_grap", str2, myuin}, new Class[]{String.class, String.class, String.class}, AbstractC7166.m12425("com.tenpay.sdk.net.core.comm.SessionKey"));
        Class clsM124253 = AbstractC7166.m12425("com.tenpay.sdk.net.core.comm.SessionKey");
        Class clsM124254 = AbstractC7166.m12425("com.tenpay.sdk.net.core.statistic.StatisticInfo");
        Class clsM124255 = AbstractC7166.m12425("com.tenpay.sdk.net.core.processor.EncryptProcessor$ProcessResult");
        String strM14531 = "processEncrypt";
        Class cls = Boolean.TYPE;
        String strM145312 = "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";
        Boolean bool = Boolean.TRUE;
        Object objM12406 = AbstractC7162.m12406(this.f25135, strM14531, clsM124255, new Class[]{String.class, clsM124253, Map.class, cls, cls, clsM124254}, strM145312, objM6845, linkedHashMap, bool, bool, null);
        Map map = (Map) AbstractC7162.m12405(Map.class, "getBodyData", objM12406);
        Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
        Class clsM124256 = AbstractC7166.m12425("com.tencent.mobileqq.pb.ByteStringMicro");
        String strM145313 = "copyFromUtf8";
        Class[] clsArr = {String.class};
        try {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry2 : map.entrySet()) {
                i = i2;
                try {
                    String str3 = (String) entry2.getValue();
                    if (str3 == null) {
                        i2 = i;
                    } else {
                        if (sb2.length() > 0) {
                            sb2.append("&");
                        }
                        sb2.append((String) entry2.getKey());
                        sb2.append("=");
                        sb2.append(URLEncoder.encode(str3, "UTF-8"));
                        i2 = i;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    string = "";
                    Object objInvoke = AbstractC7162.m12402(clsM124256, clsM124256, strM145313, clsArr).invoke(null, string);
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, "cgiName", objM6846), "set", new Class[]{String.class}, new Object[]{RestoredStrings.get(i)});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, "reqBody", objM6846), "set", new Class[]{clsM124256}, new Object[]{objInvoke});
                    byte[] bArrM7214 = AbstractC3887.m7214((byte[]) AbstractC7162.m12405(byte[].class, "toByteArray", objM6846));
                    Intent intent = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425("mqq.app.MobileQQ"), null, "sMobileQQ"), clsM12425}, new Class[]{Context.class, Class.class}, AbstractC7166.m12425("mqq.app.NewIntent"));
                    intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
                    intent.putExtra("data", bArrM7214);
                    intent.putExtra("timeout", 30000L);
                    XposedHelpers.callMethod(intent, "setObserver", new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new C7282(this, clsM124256, objM6845, objM12406, 1))});
                    XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC7166.m12425("mqq.app.NewIntent")}, new Object[]{intent});
                }
            }
            i = i2;
            string = sb2.toString();
        } catch (UnsupportedEncodingException unused3) {
            i = i2;
        }
        Object objInvoke2 = AbstractC7162.m12402(clsM124256, clsM124256, strM145313, clsArr).invoke(null, string);
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "cgiName", objM6846), "set", new Class[]{String.class}, new Object[]{RestoredStrings.get(i)});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "reqBody", objM6846), "set", new Class[]{clsM124256}, new Object[]{objInvoke2});
        byte[] bArrM72142 = AbstractC3887.m7214((byte[]) AbstractC7162.m12405(byte[].class, "toByteArray", objM6846));
        Intent intent2 = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425("mqq.app.MobileQQ"), null, "sMobileQQ"), clsM12425}, new Class[]{Context.class, Class.class}, AbstractC7166.m12425("mqq.app.NewIntent"));
        intent2.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
        intent2.putExtra("data", bArrM72142);
        intent2.putExtra("timeout", 30000L);
        XposedHelpers.callMethod(intent2, "setObserver", new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new C7282(this, clsM124256, objM6845, objM12406, 1))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC7166.m12425("mqq.app.NewIntent")}, new Object[]{intent2});
    }
}
