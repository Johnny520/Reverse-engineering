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
import p303.AbstractC9234;
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
                    if (!((Boolean) c6758.f16461.m12399(Boolean.TRUE, AbstractC9234.m14531(1062))).booleanValue()) {
                    }
                }
                if (i2 == 1024) {
                    if (!((Boolean) c6758.f16461.m12399(Boolean.FALSE, AbstractC9234.m14531(1063))).booleanValue()) {
                    }
                }
                String str3 = (String) c6758.f16461.m12399(null, AbstractC9234.m14531(1056));
                if (TextUtils.isEmpty(str3) || !str.matches(str3.replace(AbstractC9234.m14532("喵呜喵呜喵喵呜呜"), ""))) {
                    String strM721 = (String) c6758.f16461.m12399(null, AbstractC9234.m14531(1057));
                    if (!TextUtils.isEmpty(strM721)) {
                        if (strM721.endsWith(AbstractC9234.m14532("喵喵喵喵呜呜呜呜"))) {
                            strM721 = AbstractC0900.m721(1, 0, strM721);
                        }
                        for (String str4 : strM721.split(AbstractC9234.m14532("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"))) {
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
                    clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1115));
                } catch (Exception unused) {
                    AbstractC7014.m12151(AbstractC9234.m14531(1116));
                    clsM12425 = null;
                }
                if (clsM12425 != null) {
                    Object objM12146 = AbstractC7012.m12146(397);
                    C7164 c7164M12413 = C7164.m12413(objM12146.getClass());
                    c7164M12413.f17803.f3962 = String.class;
                    c7164M12413.f17803.f3963 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
                    String str5 = (String) c7164M12413.m12415(objM12146, new Object[0]);
                    String pSkey = QQEnvTool.getPSkey(AbstractC9234.m14531(398));
                    String currentUin = QQEnvTool.getCurrentUin();
                    String str6 = AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵") + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + c9634.f25126 + AbstractC9234.m14531(1105) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + c9634.f25128 + AbstractC9234.m14531(1106) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + c9634.f25125 + AbstractC9234.m14531(1107) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + AbstractC9234.m14532("喵呜喵喵喵喵呜喵") + AbstractC9234.m14531(1108) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + c9634.f25125 + AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵") + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + QQEnvTool.getCurrentAccountNickName() + AbstractC9234.m14531(1109) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + AbstractC9234.m14532("喵呜喵喵喵喵呜呜") + AbstractC9234.m14531(1110) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + c9634.f25127 + AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵") + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + currentUin + AbstractC9234.m14531(1111) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + c9634.f25124 + AbstractC9234.m14531(1112) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + AbstractC9234.m14532("喵呜喵喵喵喵呜喵") + AbstractC9234.m14531(1113) + AbstractC9234.m14532("喵呜喵喵呜呜呜喵") + AbstractC9234.m14532("喵呜喵喵喵喵呜呜");
                    Object objM6845 = AbstractC3738.m6845(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, AbstractC7166.m12425(AbstractC9234.m14531(396)));
                    C7164 c7164M124132 = C7164.m12413(objM6845.getClass());
                    Class cls = Integer.TYPE;
                    c7164M124132.f17803.f3964 = new Class[]{String.class, String.class, cls, String.class, String.class, String.class};
                    c7164M124132.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(1114));
                    c7164M124132.f17803.f3963 = AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵");
                    String strM14531 = AbstractC9234.m14531(474);
                    int i3 = C9634.f25122;
                    String str7 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), c7164M124132.m12415(objM6845, currentUin, strM14531, Integer.valueOf(i3), str6, pSkey, str5));
                    Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(415)), new Object[0]);
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC9234.m14531(418)});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{str7});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{Integer.toString(i3)});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{cls}, new Object[]{0});
                    byte[] bArrM7214 = AbstractC3887.m7214((byte[]) XposedHelpers.callMethod(objM6846, AbstractC9234.m14531(419), new Object[0]));
                    intent = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(332)), null, AbstractC9234.m14531(402)), clsM12425}, new Class[]{Context.class, Class.class}, AbstractC7166.m12425(AbstractC9234.m14531(401)));
                    intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC9234.m14531(404));
                    intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM7214);
                    intent.putExtra(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
                    XposedHelpers.callMethod(intent, AbstractC9234.m14531(421), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new C3494(c9634, 5))});
                }
                if (intent != null) {
                    XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC9234.m14531(423), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(401))}, new Object[]{intent});
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
