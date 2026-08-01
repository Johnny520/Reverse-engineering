package top.suzhelan.qstory.hook.item;

import android.text.TextUtils;
import androidx.appcompat.app.RunnableC0946;
import androidx.fragment.app.RunnableC3179;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQNTTroopTool;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p026.AbstractC7014;
import p045.C7150;
import p303.AbstractC9234;
import p354.C9636;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6759 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C9636 f16462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6758 f16463;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16464;

    public /* synthetic */ C6759(C6758 c6758, C9636 c9636, int i) {
        this.f16464 = i;
        this.f16463 = c6758;
        this.f16462 = c9636;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11876(String str) {
        int i = this.f16464;
        C9636 c9636 = this.f16462;
        C6758 c6758 = this.f16463;
        switch (i) {
            case 0:
                new Thread(new RunnableC3179(c6758, str, c9636, 4)).start();
                break;
            default:
                JSONObject jSONObjectM6934 = InterfaceC3749.m6934(str);
                if (jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵")) == 0) {
                    String string = jSONObjectM6934.getJSONObject(AbstractC9234.m14531(478)).getString(AbstractC9234.m14531(1071));
                    String string2 = jSONObjectM6934.getJSONObject(AbstractC9234.m14531(1072)).getString(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵"));
                    String str2 = c9636.f25130;
                    String strReplace = c9636.f25131.replace(AbstractC9234.m14531(482), "");
                    String groupName = QQNTTroopTool.getGroupName(str2);
                    String str3 = AbstractC9234.m14531(1073) + new BigDecimal(string2).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP).toString() + AbstractC9234.m14531(1074) + strReplace + AbstractC9234.m14531(1075) + string + AbstractC9234.m14531(1076) + groupName;
                    C7150 c7150 = c6758.f16461;
                    String strM14531 = AbstractC9234.m14531(1061);
                    Boolean bool = Boolean.TRUE;
                    if (((Boolean) c7150.m12399(bool, strM14531)).booleanValue()) {
                        AbstractC7014.m12151(str3);
                    }
                    if (!TextUtils.isEmpty((CharSequence) c6758.f16461.m12399(null, AbstractC9234.m14531(1058)))) {
                        new Thread(new RunnableC0946(c6758, 6, str2)).start();
                    }
                    if (((Boolean) c6758.f16461.m12399(bool, AbstractC9234.m14531(1077))).booleanValue()) {
                        QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin()), str3);
                    }
                    break;
                }
                break;
        }
    }
}
