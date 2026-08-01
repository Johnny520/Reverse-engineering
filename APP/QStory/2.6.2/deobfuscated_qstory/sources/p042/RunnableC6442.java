package p042;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import lin.xposed.hook.util.qq.Hook_cookie;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p034.C6335;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6442 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final String f17658 = "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f17659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f17660;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f17661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String f17662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f17664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f17665 = AbstractC6087.m11392(AbstractC6318.m11838("com.tenpay.sdk.net.core.processor.EncryptProcessor"), new Object[0]);

    public RunnableC6442() {
        "\u9700\u8981\u4e00\u4e2a\u4e3apre_grap_token=rand=6e5f10e97975a3d35589a1b12c071c68&sign=267dcb90416a4c908da80c47802cfbf8&ts=1706363819&ver=1\u7684\u666e\u901a\u53c2\u6570 \u6211\u67e5\u627e\u4e0d\u5230";
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            m11939();
        } catch (Exception e) {
            String strM6668 = "Hb";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OpenHbNetClient{encryptProcessor=");
        sb.append(this.f17665);
        sb.append(", redPacketType=");
        AbstractC6136.m11533(sb, this.f17663, -3937614308977149351L);
        sb.append(this.f17664);
        sb.append('\'');
        sb.append(", redPacketID='");
        sb.append(this.f17660);
        sb.append('\'');
        sb.append(", redPacketDesc='");
        sb.append(this.f17659);
        sb.append('\'');
        sb.append(", troopUin='");
        sb.append(this.f17661);
        sb.append('\'');
        sb.append(", senderUin='");
        sb.append(this.f17662);
        sb.append('\'');
        sb.append(", msgMd5='");
        sb.append("null'");
        sb.append(", msgSeq='");
        sb.append("null'");
        return AbstractC6136.m11557(-3937613892365321639L, sb, "null'}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11939() throws Throwable {
        String strEncode;
        String myuin = Hook_cookie.getMyuin();
        String name = Hook_cookie.getName(myuin);
        HashMap map = new HashMap();
        map.put("subchanne", null);
        map.put("authkey", this.f17664);
        map.put("hb_from", "0");
        map.put("agreement", "0");
        map.put("pay_flag", "0");
        map.put("groupid", this.f17661);
        map.put("channel", String.valueOf(this.f17663));
        map.put("senderuin", this.f17662);
        map.put("listid", this.f17660);
        map.put("grouptype", "1");
        map.put("sub_guild_id", null);
        map.put("answer", this.f17659);
        map.put("groupuin", this.f17662);
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
                AbstractC6136.m11531(sb, (String) entry.getKey(), -3937597597259400615L);
                sb.append(URLEncoder.encode(str, "UTF-8"));
            }
        }
        String strM6668 = "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";
        Class clsM11838 = AbstractC6318.m11838("com.tenpay.sdk.net.core.processor.PsKeyProcessor");
        Object objM11829 = AbstractC6317.m11829(clsM11838, clsM11838, "INSTANCE");
        Object[] objArr = {"qpay_hb_na_grap", (String) AbstractC6314.m11819(objM11829, "getPsKey", String.class, new Class[]{String.class}, strM6668), Hook_cookie.getMyuin()};
        Object objM11389 = AbstractC6087.m11389(objArr, new Class[]{String.class, String.class, String.class}, AbstractC6318.m11838("com.tenpay.sdk.net.core.comm.SessionKey"));
        Class clsM118382 = AbstractC6318.m11838("com.tenpay.sdk.net.core.comm.SessionKey");
        Class clsM118383 = AbstractC6318.m11838("com.tenpay.sdk.net.core.statistic.StatisticInfo");
        Class clsM118384 = AbstractC6318.m11838("com.tenpay.sdk.net.core.processor.EncryptProcessor$ProcessResult");
        String strM66682 = "processEncrypt";
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.TRUE;
        Object[] objArr2 = {f17658, objM11389, map, bool, bool, null};
        Object objM11819 = AbstractC6314.m11819(this.f17665, strM66682, clsM118384, new Class[]{String.class, clsM118382, Map.class, cls, cls, clsM118383}, objArr2);
        Map map2 = (Map) AbstractC6314.m11818(Map.class, "getBodyData", objM11819);
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
        Object objM11392 = AbstractC6087.m11392(AbstractC6318.m11838("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
        Class clsM118385 = AbstractC6318.m11838("com.tencent.mobileqq.pb.ByteStringMicro");
        Object objInvoke = AbstractC6314.m11815(clsM118385, clsM118385, "copyFromUtf8", new Class[]{String.class}).invoke(null, string);
        XposedHelpers.callMethod(AbstractC6317.m11831(null, "cgiName", objM11392), "set", new Class[]{String.class}, new Object[]{"hb_pre_grap"});
        XposedHelpers.callMethod(AbstractC6317.m11831(null, "reqBody", objM11392), "set", new Class[]{clsM118385}, new Object[]{objInvoke});
        XposedHelpers.callMethod(AbstractC6317.m11831(null, "enType", objM11392), "set", new Class[]{Integer.TYPE}, new Object[]{1});
        byte[] bArrM11893 = C6335.m11893((byte[]) AbstractC6314.m11818(byte[].class, "toByteArray", objM11392));
        Class clsM118386 = AbstractC6318.m11838("mqq.app.NewIntent");
        Intent intent = (Intent) AbstractC6087.m11389(new Object[]{AbstractC6317.m11829(AbstractC6318.m11838("mqq.app.MobileQQ"), null, "sMobileQQ"), AbstractC6318.m11838("com.tencent.mobileqq.qwallet.e.g")}, new Class[]{Context.class, Class.class}, clsM118386);
        intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
        intent.putExtra("data", bArrM11893);
        XposedHelpers.callMethod(intent, "setObserver", new Class[]{AbstractC6318.m11838("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("mqq.observer.BusinessObserver")}, new C6443(this, clsM118385, objM11389, objM11819, 0))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC6318.m11838("mqq.app.NewIntent")}, new Object[]{intent});
    }
}
