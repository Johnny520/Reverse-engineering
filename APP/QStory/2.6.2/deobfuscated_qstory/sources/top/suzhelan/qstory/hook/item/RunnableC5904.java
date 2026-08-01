package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.AbstractC0053;
import bsh.C2660;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Proxy;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p337.C8807;
import p337.C8808;
import p337.C8809;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5904 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8809 f16073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5922 f16074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8807 f16075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16076 = 1;

    public /* synthetic */ RunnableC5904(C5922 c5922, C8808 c8808, C8807 c8807, C8809 c8809) {
        this.f16074 = c5922;
        this.f16075 = c8807;
        this.f16073 = c8809;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Class clsM11838;
        long j;
        int i = this.f16076;
        Intent intent = null;
        C8809 c8809 = this.f16073;
        C8807 c8807 = this.f16075;
        C5922 c5922 = this.f16074;
        switch (i) {
            case 0:
                int i2 = c8809.f24791;
                String str = c8809.f24787;
                String str2 = c8809.f24788;
                if (i2 == 1) {
                    if (!((Boolean) c5922.f16107.m11812(Boolean.TRUE, "ordinary")).booleanValue()) {
                    }
                }
                if (i2 == 1024) {
                    if (!((Boolean) c5922.f16107.m11812(Boolean.FALSE, "exclusiveRedEnvelopes")).booleanValue()) {
                    }
                }
                String str3 = (String) c5922.f16107.m11812(null, "blacklistTroop");
                if (TextUtils.isEmpty(str3) || !str.matches(str3.replace(" ", ""))) {
                    String strM160 = (String) c5922.f16107.m11812(null, "blacklistText");
                    if (!TextUtils.isEmpty(strM160)) {
                        if (strM160.endsWith("|")) {
                            strM160 = AbstractC0053.m160(1, 0, strM160);
                        }
                        for (String str4 : strM160.split("\\|")) {
                            if (str2.contains(str4)) {
                            }
                        }
                    }
                    new Thread(new RunnableC5904(c5922, c8807, c8809)).start();
                }
                break;
            default:
                c8807.f24780 = new C5923(c5922, c8809, 0);
                try {
                    clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.qwallet.e.p");
                } catch (Exception unused) {
                    AbstractC6154.m11561("[QStory]\u672a\u9002\u914d\u6b64QQ\u7248\u672c\u62a2\u7ea2\u5305");
                    clsM11838 = null;
                }
                if (clsM11838 == null) {
                    j = -3937601664593429927L;
                } else {
                    Object objM11554 = AbstractC6136.m11554(-3937602154219701671L);
                    C6316 c6316M11826 = C6316.m11826(objM11554.getClass());
                    c6316M11826.f17409.f3616 = String.class;
                    c6316M11826.f17409.f3617 = "hexGuid";
                    String str5 = (String) c6316M11826.m11828(objM11554, new Object[0]);
                    String pSkey = QQEnvTool.getPSkey("tenpay.com");
                    String currentUin = QQEnvTool.getCurrentUin();
                    String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
                    StringBuilder sb = new StringBuilder();
                    j = -3937601664593429927L;
                    AbstractC6136.m11547(-3937598035346064807L, sb, -3937597597259400615L);
                    AbstractC6136.m11531(sb, c8807.f24783, -3937675727009482151L);
                    sb.append("=");
                    AbstractC6136.m11533(sb, c8807.f24785, -3937675765664187815L);
                    sb.append("=");
                    AbstractC6136.m11531(sb, c8807.f24782, -3937675632520201639L);
                    AbstractC6136.m11547(-3937597597259400615L, sb, -3937595638754313639L);
                    AbstractC6136.m11547(-3937675679764841895L, sb, -3937597597259400615L);
                    AbstractC6136.m11531(sb, c8807.f24782, -3937675619635299751L);
                    AbstractC6136.m11544(-3937597597259400615L, sb, currentAccountNickName);
                    AbstractC6136.m11547(-3937675611045365159L, sb, -3937597597259400615L);
                    AbstractC6136.m11547(-3937561652678100391L, sb, -3937675550915823015L);
                    sb.append("=");
                    AbstractC6136.m11531(sb, c8807.f24784, -3937675452131575207L);
                    AbstractC6136.m11544(-3937597597259400615L, sb, currentUin);
                    AbstractC6136.m11547(-3937675439246673319L, sb, -3937597597259400615L);
                    AbstractC6136.m11531(sb, c8807.f24781, -3937675383412098471L);
                    AbstractC6136.m11547(-3937597597259400615L, sb, -3937595638754313639L);
                    AbstractC6136.m11547(-3937675396297000359L, sb, -3937597597259400615L);
                    sb.append("0");
                    String string = sb.toString();
                    Object objM11389 = AbstractC6087.m11389(new Object[]{AbstractC6340.f17460}, new Class[]{Context.class}, AbstractC6318.m11838("com.tenpay.sdk.basebl.EncryptRequest"));
                    C6316 c6316M118262 = C6316.m11826(objM11389.getClass());
                    Class cls = Integer.TYPE;
                    c6316M118262.f17409.f3618 = new Class[]{String.class, String.class, cls, String.class, String.class, String.class};
                    c6316M118262.f17409.f3616 = AbstractC6318.m11838("com.tenpay.sdk.basebl.EncryptRequest$Encrypt");
                    c6316M118262.f17409.f3617 = "encypt";
                    String strM6668 = "hb_pre_grapver=2.0&chv=3";
                    int i3 = C8807.f24779;
                    String str6 = (String) AbstractC6317.m11831(String.class, "encText", c6316M118262.m11828(objM11389, currentUin, strM6668, Integer.valueOf(i3), string, pSkey, str5));
                    Object objM11392 = AbstractC6087.m11392(AbstractC6318.m11838("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
                    XposedHelpers.callMethod(AbstractC6317.m11831(null, "cgiName", objM11392), "set", new Class[]{String.class}, new Object[]{"hb_pre_grap"});
                    XposedHelpers.callMethod(AbstractC6317.m11831(null, "reqText", objM11392), "set", new Class[]{String.class}, new Object[]{str6});
                    XposedHelpers.callMethod(AbstractC6317.m11831(null, "random", objM11392), "set", new Class[]{String.class}, new Object[]{Integer.toString(i3)});
                    XposedHelpers.callMethod(AbstractC6317.m11831(null, "enType", objM11392), "set", new Class[]{cls}, new Object[]{0});
                    byte[] bArrM6834 = AbstractC3065.m6834((byte[]) XposedHelpers.callMethod(objM11392, "toByteArray", new Object[0]));
                    intent = (Intent) AbstractC6087.m11389(new Object[]{AbstractC6317.m11829(AbstractC6318.m11838("mqq.app.MobileQQ"), null, "sMobileQQ"), clsM11838}, new Class[]{Context.class, Class.class}, AbstractC6318.m11838("mqq.app.NewIntent"));
                    intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
                    intent.putExtra("data", bArrM6834);
                    intent.putExtra("timeout", 30000L);
                    XposedHelpers.callMethod(intent, "setObserver", new Class[]{AbstractC6318.m11838("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("mqq.observer.BusinessObserver")}, new C2660(c8807, 4))});
                }
                if (intent != null) {
                    XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(j))}, new Object[]{intent});
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC5904(C5922 c5922, C8807 c8807, C8809 c8809) {
        this.f16074 = c5922;
        this.f16075 = c8807;
        this.f16073 = c8809;
    }
}
