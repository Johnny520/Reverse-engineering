package top.suzhelan.qstory.hook.item;

import android.text.TextUtils;
import androidx.appcompat.app.RunnableC0099;
import androidx.fragment.app.RunnableC2346;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.math.BigDecimal;
import java.math.RoundingMode;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQNTTroopTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p028.C6302;
import p337.C8809;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5923 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8809 f16108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5922 f16109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16110;

    public /* synthetic */ C5923(C5922 c5922, C8809 c8809, int i) {
        this.f16110 = i;
        this.f16109 = c5922;
        this.f16108 = c8809;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11258(String str) {
        int i = this.f16110;
        C8809 c8809 = this.f16108;
        C5922 c5922 = this.f16109;
        switch (i) {
            case 0:
                new Thread(new RunnableC2346(c5922, str, c8809, 4)).start();
                break;
            default:
                JSONObject jSONObjectM6316 = InterfaceC2915.m6316(str);
                if (jSONObjectM6316.getIntValue("state") == 0) {
                    String string = jSONObjectM6316.getJSONObject("send_object").getString("send_name");
                    String string2 = jSONObjectM6316.getJSONObject("recv_object").getString("amount");
                    String str2 = c8809.f24787;
                    String strReplace = c8809.f24788.replace("[QQ\u7ea2\u5305]", "");
                    String groupName = QQNTTroopTool.getGroupName(str2);
                    String string3 = new BigDecimal(string2).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP).toString();
                    StringBuilder sb = new StringBuilder();
                    AbstractC6136.m11544(-3937661278739498407L, sb, string3);
                    AbstractC6136.m11544(-3937661201430087079L, sb, strReplace);
                    AbstractC6136.m11544(-3937661265854596519L, sb, string);
                    String strM11557 = AbstractC6136.m11557(-3937661154185446823L, sb, groupName);
                    C6302 c6302 = c5922.f16107;
                    String strM6668 = "grabToast";
                    Boolean bool = Boolean.TRUE;
                    if (((Boolean) c6302.m11812(bool, strM6668)).booleanValue()) {
                        AbstractC6154.m11561(strM11557);
                    }
                    if (!TextUtils.isEmpty((CharSequence) c5922.f16107.m11812(null, "replyText"))) {
                        new Thread(new RunnableC0099(c5922, 6, str2)).start();
                    }
                    if (((Boolean) c5922.f16107.m11812(bool, "grabHbLog")).booleanValue()) {
                        QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin()), strM11557);
                    }
                    break;
                }
                break;
        }
    }
}
