package p337;

import android.content.Context;
import android.content.Intent;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.XposedHelpers;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p000.AbstractC6087;
import p010.AbstractC6154;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p042.C6443;
import top.suzhelan.qstory.hook.item.C5923;

/* JADX INFO: renamed from: 飘花落叶言苏世楪哲兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8809 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f24787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f24788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f24789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f24790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f24792 = AbstractC6087.m11392(AbstractC6318.m11838("com.tenpay.sdk.net.core.processor.EncryptProcessor"), new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f24793;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f24794;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C5923 f24795;

    static {
        "qpay_hb_na_grap";
        "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14453(C5923 c5923) {
        Class clsM11838;
        long j;
        String strM6668;
        long j2;
        this.f24795 = c5923;
        try {
            clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.qwallet.e.p");
        } catch (Exception unused) {
            AbstractC6154.m11561("[QStory]\u672a\u9002\u914d\u6b64QQ\u7248\u672c\u62a2\u7ea2\u5305");
            clsM11838 = null;
        }
        String currentUin = QQEnvTool.getCurrentUin();
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subchanne", null);
        linkedHashMap.put("authkey", this.f24790);
        linkedHashMap.put("hb_from", "0");
        linkedHashMap.put("agreement", "0");
        linkedHashMap.put("pay_flag", "0");
        linkedHashMap.put("groupid", this.f24787);
        linkedHashMap.put("channel", String.valueOf(this.f24791));
        linkedHashMap.put("pre_grap_token", this.f24793);
        linkedHashMap.put("senderuin", this.f24794);
        linkedHashMap.put("listid", this.f24789);
        linkedHashMap.put("grouptype", "1");
        linkedHashMap.put("sub_guild_id", null);
        linkedHashMap.put("answer", this.f24788);
        linkedHashMap.put("groupuin", this.f24794);
        linkedHashMap.put("tinyid", null);
        linkedHashMap.put("guild_id", null);
        linkedHashMap.put("name", currentAccountNickName);
        linkedHashMap.put("uin", currentUin);
        linkedHashMap.put("msg_md5", null);
        linkedHashMap.put("msg_seq", null);
        linkedHashMap.put("msg_id", null);
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            j = -3937589638685001127L;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
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
        Class clsM118382 = AbstractC6318.m11838("com.tenpay.sdk.net.core.processor.PsKeyProcessor");
        String str2 = (String) AbstractC6314.m11819(AbstractC6317.m11829(clsM118382, clsM118382, "INSTANCE"), "getPsKey", String.class, new Class[]{String.class}, "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?");
        String myuin = Hook_cookie.getMyuin();
        Object objM11389 = AbstractC6087.m11389(new Object[]{"qpay_hb_na_grap", str2, myuin}, new Class[]{String.class, String.class, String.class}, AbstractC6318.m11838("com.tenpay.sdk.net.core.comm.SessionKey"));
        Class clsM118383 = AbstractC6318.m11838("com.tenpay.sdk.net.core.comm.SessionKey");
        Class clsM118384 = AbstractC6318.m11838("com.tenpay.sdk.net.core.statistic.StatisticInfo");
        Class clsM118385 = AbstractC6318.m11838("com.tenpay.sdk.net.core.processor.EncryptProcessor$ProcessResult");
        String strM66682 = "processEncrypt";
        Class cls = Boolean.TYPE;
        String strM66683 = "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?";
        Boolean bool = Boolean.TRUE;
        Object objM11819 = AbstractC6314.m11819(this.f24792, strM66682, clsM118385, new Class[]{String.class, clsM118383, Map.class, cls, cls, clsM118384}, strM66683, objM11389, linkedHashMap, bool, bool, null);
        Map map = (Map) AbstractC6314.m11818(Map.class, "getBodyData", objM11819);
        Object objM11392 = AbstractC6087.m11392(AbstractC6318.m11838("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
        Class clsM118386 = AbstractC6318.m11838("com.tencent.mobileqq.pb.ByteStringMicro");
        String strM66684 = "copyFromUtf8";
        Class[] clsArr = {String.class};
        try {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry2 : map.entrySet()) {
                String str3 = (String) entry2.getValue();
                if (str3 != null) {
                    if (sb2.length() > 0) {
                        j2 = j;
                        sb2.append(AbstractC3056.m6668(j2));
                    } else {
                        j2 = j;
                    }
                    sb2.append((String) entry2.getKey());
                    sb2.append("=");
                    sb2.append(URLEncoder.encode(str3, "UTF-8"));
                    j = j2;
                }
            }
            strM6668 = sb2.toString();
        } catch (UnsupportedEncodingException unused2) {
            strM6668 = "";
        }
        Object objInvoke = AbstractC6314.m11815(clsM118386, clsM118386, strM66684, clsArr).invoke(null, strM6668);
        XposedHelpers.callMethod(AbstractC6317.m11831(null, "cgiName", objM11392), "set", new Class[]{String.class}, new Object[]{"qpay_hb_na_grap"});
        XposedHelpers.callMethod(AbstractC6317.m11831(null, "reqBody", objM11392), "set", new Class[]{clsM118386}, new Object[]{objInvoke});
        byte[] bArrM6834 = AbstractC3065.m6834((byte[]) AbstractC6314.m11818(byte[].class, "toByteArray", objM11392));
        Intent intent = (Intent) AbstractC6087.m11389(new Object[]{AbstractC6317.m11829(AbstractC6318.m11838("mqq.app.MobileQQ"), null, "sMobileQQ"), clsM11838}, new Class[]{Context.class, Class.class}, AbstractC6318.m11838("mqq.app.NewIntent"));
        intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
        intent.putExtra("data", bArrM6834);
        intent.putExtra("timeout", 30000L);
        XposedHelpers.callMethod(intent, "setObserver", new Class[]{AbstractC6318.m11838("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("mqq.observer.BusinessObserver")}, new C6443(this, clsM118386, objM11389, objM11819, 1))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC6318.m11838("mqq.app.NewIntent")}, new Object[]{intent});
    }
}
