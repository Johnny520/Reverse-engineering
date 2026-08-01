package top.suzhelan.qstory.hook.item;

import android.text.TextUtils;
import androidx.appcompat.app.RunnableC0099;
import androidx.fragment.app.RunnableC2346;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQNTTroopTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p010.AbstractC6185;
import p029.C6321;
import p287.AbstractC8405;
import p338.C8807;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5929 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8807 f16117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5928 f16118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16119;

    public /* synthetic */ C5929(C5928 c5928, C8807 c8807, int i) {
        this.f16119 = i;
        this.f16118 = c5928;
        this.f16117 = c8807;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11317(String str) {
        int i = this.f16119;
        C8807 c8807 = this.f16117;
        C5928 c5928 = this.f16118;
        switch (i) {
            case 0:
                new Thread(new RunnableC2346(c5928, str, c8807, 4)).start();
                break;
            default:
                JSONObject jSONObjectM6374 = InterfaceC2916.m6374(str);
                if (jSONObjectM6374.getIntValue(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵")) == 0) {
                    String string = jSONObjectM6374.getJSONObject(AbstractC8405.m13972(478)).getString(AbstractC8405.m13972(1071));
                    String string2 = jSONObjectM6374.getJSONObject(AbstractC8405.m13972(1072)).getString(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵"));
                    String str2 = c8807.f24785;
                    String strReplace = c8807.f24786.replace(AbstractC8405.m13972(482), "");
                    String groupName = QQNTTroopTool.getGroupName(str2);
                    String str3 = AbstractC8405.m13972(1073) + new BigDecimal(string2).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP).toString() + AbstractC8405.m13972(1074) + strReplace + AbstractC8405.m13972(1075) + string + AbstractC8405.m13972(1076) + groupName;
                    C6321 c6321 = c5928.f16116;
                    String strM13972 = AbstractC8405.m13972(1061);
                    Boolean bool = Boolean.TRUE;
                    if (((Boolean) c6321.m11840(bool, strM13972)).booleanValue()) {
                        AbstractC6185.m11592(str3);
                    }
                    if (!TextUtils.isEmpty((CharSequence) c5928.f16116.m11840(null, AbstractC8405.m13972(1058)))) {
                        new Thread(new RunnableC0099(c5928, 6, str2)).start();
                    }
                    if (((Boolean) c5928.f16116.m11840(bool, AbstractC8405.m13972(1077))).booleanValue()) {
                        QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin()), str3);
                    }
                    break;
                }
                break;
        }
    }
}
