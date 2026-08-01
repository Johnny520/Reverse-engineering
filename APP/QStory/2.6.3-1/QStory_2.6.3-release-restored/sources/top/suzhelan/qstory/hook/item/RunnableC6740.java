package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.AbstractC0900;
import bsh.C3494;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3887;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Proxy;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p025.AbstractC7012;
import p026.AbstractC7014;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p354.C9634;
import p354.C9635;
import p354.C9636;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6740 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C9636 f16427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6758 f16428;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C9634 f16429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16430 = 1;

    public /* synthetic */ RunnableC6740(C6758 c6758, C9635 c9635, C9634 c9634, C9636 c9636) {
        this.f16428 = c6758;
        this.f16429 = c9634;
        this.f16427 = c9636;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Class clsM12425;
        int i = this.f16430;
        Intent intent = null;
        C9636 c9636 = this.f16427;
        C9634 c9634 = this.f16429;
        C6758 c6758 = this.f16428;
        switch (i) {
            case 0:
                int i2 = c9636.f25134;
                String str = c9636.f25130;
                String str2 = c9636.f25131;
                if (i2 == 1) {
                    if (!((Boolean) c6758.f16461.m12399(Boolean.TRUE, "ordinary")).booleanValue()) {
                    }
                }
                if (i2 == 1024) {
                    if (!((Boolean) c6758.f16461.m12399(Boolean.FALSE, "exclusiveRedEnvelopes")).booleanValue()) {
                    }
                }
                String str3 = (String) c6758.f16461.m12399(null, "blacklistTroop");
                if (TextUtils.isEmpty(str3) || !str.matches(str3.replace(" ", ""))) {
                    String strM721 = (String) c6758.f16461.m12399(null, "blacklistText");
                    if (!TextUtils.isEmpty(strM721)) {
                        if (strM721.endsWith("|")) {
                            strM721 = AbstractC0900.m721(1, 0, strM721);
                        }
                        for (String str4 : strM721.split("\\|")) {
                            if (str2.contains(str4)) {
                            }
                        }
                    }
                    new Thread(new RunnableC6740(c6758, c9634, c9636)).start();
                }
                break;
            default:
                c9634.f25123 = new C6759(c6758, c9636, 0);
                try {
                    clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.qwallet.e.p");
                } catch (Exception unused) {
                    AbstractC7014.m12151("[QStory]未适配此QQ版本抢红包");
                    clsM12425 = null;
                }
                if (clsM12425 != null) {
                    Object objM12146 = AbstractC7012.m12146(397);
                    C7164 c7164M12413 = C7164.m12413(objM12146.getClass());
                    c7164M12413.f17803.f3962 = String.class;
                    c7164M12413.f17803.f3963 = "hexGuid";
                    String str5 = (String) c7164M12413.m12415(objM12146, new Object[0]);
                    String pSkey = QQEnvTool.getPSkey("tenpay.com");
                    String currentUin = QQEnvTool.getCurrentUin();
                    String str6 = "listid" + "=" + c9634.f25126 + "&channel" + "=" + c9634.f25128 + "&groupid" + "=" + c9634.f25125 + "&grouptype" + "=" + "1" + "&groupuin" + "=" + c9634.f25125 + "&name" + "=" + QQEnvTool.getCurrentAccountNickName() + "&pay_flag" + "=" + "0" + "&authkey" + "=" + c9634.f25127 + "&uin" + "=" + currentUin + "&senderuin" + "=" + c9634.f25124 + "&trans_seq" + "=" + "1" + "&hb_from" + "=" + "0";
                    Object objM6845 = AbstractC3738.m6845(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, AbstractC7166.m12425("com.tenpay.sdk.basebl.EncryptRequest"));
                    C7164 c7164M124132 = C7164.m12413(objM6845.getClass());
                    Class cls = Integer.TYPE;
                    c7164M124132.f17803.f3964 = new Class[]{String.class, String.class, cls, String.class, String.class, String.class};
                    c7164M124132.f17803.f3962 = AbstractC7166.m12425("com.tenpay.sdk.basebl.EncryptRequest$Encrypt");
                    c7164M124132.f17803.f3963 = "encypt";
                    String strM14531 = "hb_pre_grapver=2.0&chv=3";
                    int i3 = C9634.f25122;
                    String str7 = (String) AbstractC7165.m12418(String.class, "encText", c7164M124132.m12415(objM6845, currentUin, strM14531, Integer.valueOf(i3), str6, pSkey, str5));
                    Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, "cgiName", objM6846), "set", new Class[]{String.class}, new Object[]{"hb_pre_grap"});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, "reqText", objM6846), "set", new Class[]{String.class}, new Object[]{str7});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, "random", objM6846), "set", new Class[]{String.class}, new Object[]{Integer.toString(i3)});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, "enType", objM6846), "set", new Class[]{cls}, new Object[]{0});
                    byte[] bArrM7214 = AbstractC3887.m7214((byte[]) XposedHelpers.callMethod(objM6846, "toByteArray", new Object[0]));
                    intent = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425("mqq.app.MobileQQ"), null, "sMobileQQ"), clsM12425}, new Class[]{Context.class, Class.class}, AbstractC7166.m12425("mqq.app.NewIntent"));
                    intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
                    intent.putExtra("data", bArrM7214);
                    intent.putExtra("timeout", 30000L);
                    XposedHelpers.callMethod(intent, "setObserver", new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new C3494(c9634, 5))});
                }
                if (intent != null) {
                    XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC7166.m12425("mqq.app.NewIntent")}, new Object[]{intent});
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC6740(C6758 c6758, C9634 c9634, C9636 c9636) {
        this.f16428 = c6758;
        this.f16429 = c9634;
        this.f16427 = c9636;
    }
}
