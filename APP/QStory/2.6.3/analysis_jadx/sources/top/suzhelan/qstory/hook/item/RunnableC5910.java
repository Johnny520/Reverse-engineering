package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.AbstractC0053;
import bsh.C2661;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3055;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Proxy;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p009.AbstractC6183;
import p010.AbstractC6185;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p338.C8805;
import p338.C8806;
import p338.C8807;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5910 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8807 f16082;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C5928 f16083;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8805 f16084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16085 = 1;

    public /* synthetic */ RunnableC5910(C5928 c5928, C8806 c8806, C8805 c8805, C8807 c8807) {
        this.f16083 = c5928;
        this.f16084 = c8805;
        this.f16082 = c8807;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Class clsM11866;
        int i = this.f16085;
        Intent intent = null;
        C8807 c8807 = this.f16082;
        C8805 c8805 = this.f16084;
        C5928 c5928 = this.f16083;
        switch (i) {
            case 0:
                int i2 = c8807.f24789;
                String str = c8807.f24785;
                String str2 = c8807.f24786;
                if (i2 == 1) {
                    if (!((Boolean) c5928.f16116.m11840(Boolean.TRUE, AbstractC8405.m13972(1062))).booleanValue()) {
                    }
                }
                if (i2 == 1024) {
                    if (!((Boolean) c5928.f16116.m11840(Boolean.FALSE, AbstractC8405.m13972(1063))).booleanValue()) {
                    }
                }
                String str3 = (String) c5928.f16116.m11840(null, AbstractC8405.m13972(1056));
                if (TextUtils.isEmpty(str3) || !str.matches(str3.replace(AbstractC8405.m13973("喵呜喵呜喵喵呜呜"), ""))) {
                    String strM161 = (String) c5928.f16116.m11840(null, AbstractC8405.m13972(1057));
                    if (!TextUtils.isEmpty(strM161)) {
                        if (strM161.endsWith(AbstractC8405.m13973("喵喵喵喵呜呜呜呜"))) {
                            strM161 = AbstractC0053.m161(1, 0, strM161);
                        }
                        for (String str4 : strM161.split(AbstractC8405.m13973("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜"))) {
                            if (str2.contains(str4)) {
                            }
                        }
                    }
                    new Thread(new RunnableC5910(c5928, c8805, c8807)).start();
                }
                break;
            default:
                c8805.f24778 = new C5929(c5928, c8807, 0);
                try {
                    clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1115));
                } catch (Exception unused) {
                    AbstractC6185.m11592(AbstractC8405.m13972(1116));
                    clsM11866 = null;
                }
                if (clsM11866 != null) {
                    Object objM11587 = AbstractC6183.m11587(397);
                    C6335 c6335M11854 = C6335.m11854(objM11587.getClass());
                    c6335M11854.f17458.f3617 = String.class;
                    c6335M11854.f17458.f3618 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
                    String str5 = (String) c6335M11854.m11856(objM11587, new Object[0]);
                    String pSkey = QQEnvTool.getPSkey(AbstractC8405.m13972(398));
                    String currentUin = QQEnvTool.getCurrentUin();
                    String str6 = AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵") + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + c8805.f24781 + AbstractC8405.m13972(1105) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + c8805.f24783 + AbstractC8405.m13972(1106) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + c8805.f24780 + AbstractC8405.m13972(1107) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + AbstractC8405.m13973("喵呜喵喵喵喵呜喵") + AbstractC8405.m13972(1108) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + c8805.f24780 + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵") + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + QQEnvTool.getCurrentAccountNickName() + AbstractC8405.m13972(1109) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + AbstractC8405.m13973("喵呜喵喵喵喵呜呜") + AbstractC8405.m13972(1110) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + c8805.f24782 + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵") + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + currentUin + AbstractC8405.m13972(1111) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + c8805.f24779 + AbstractC8405.m13972(1112) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + AbstractC8405.m13973("喵呜喵喵喵喵呜喵") + AbstractC8405.m13972(1113) + AbstractC8405.m13973("喵呜喵喵呜呜呜喵") + AbstractC8405.m13973("喵呜喵喵喵喵呜呜");
                    Object objM6285 = AbstractC2905.m6285(new Object[]{AbstractC6358.f17507}, new Class[]{Context.class}, AbstractC6337.m11866(AbstractC8405.m13972(396)));
                    C6335 c6335M118542 = C6335.m11854(objM6285.getClass());
                    Class cls = Integer.TYPE;
                    c6335M118542.f17458.f3619 = new Class[]{String.class, String.class, cls, String.class, String.class, String.class};
                    c6335M118542.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(1114));
                    c6335M118542.f17458.f3618 = AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵");
                    String strM13972 = AbstractC8405.m13972(474);
                    int i3 = C8805.f24777;
                    String str7 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), c6335M118542.m11856(objM6285, currentUin, strM13972, Integer.valueOf(i3), str6, pSkey, str5));
                    Object objM6286 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(415)), new Object[0]);
                    XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC8405.m13972(418)});
                    XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{str7});
                    XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{Integer.toString(i3)});
                    XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{cls}, new Object[]{0});
                    byte[] bArrM6654 = AbstractC3055.m6654((byte[]) XposedHelpers.callMethod(objM6286, AbstractC8405.m13972(419), new Object[0]));
                    intent = (Intent) AbstractC2905.m6285(new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(332)), null, AbstractC8405.m13972(402)), clsM11866}, new Class[]{Context.class, Class.class}, AbstractC6337.m11866(AbstractC8405.m13972(401)));
                    intent.putExtra(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC8405.m13972(404));
                    intent.putExtra(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM6654);
                    intent.putExtra(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
                    XposedHelpers.callMethod(intent, AbstractC8405.m13972(421), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new Object[]{Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new C2661(c8805, 5))});
                }
                if (intent != null) {
                    XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(423), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(401))}, new Object[]{intent});
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC5910(C5928 c5928, C8805 c8805, C8807 c8807) {
        this.f16083 = c5928;
        this.f16084 = c8805;
        this.f16082 = c8807;
    }
}
