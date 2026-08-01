package p352;

import android.text.TextUtils;
import android.view.View;
import androidx.activity.AbstractC0900;
import de.robv.android.xposed.XposedHelpers;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7014;
import p045.C7150;
import p049.AbstractC7165;
import p052.AbstractC7187;
import p059.RunnableC7281;
import p348.C9614;
import p353.AbstractC9632;
import top.suzhelan.qstory.hook.api.C6646;
import top.suzhelan.qstory.hook.api.C6647;
import top.suzhelan.qstory.hook.api.C6651;
import top.suzhelan.qstory.hook.item.C6743;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9631 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7150 f25120;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC7187.f17853 >= 5626) {
            return;
        }
        this.f25120 = new C7150("grabRedEnvelope", "LIN_XPOSED_QQ");
        C6743 c6743 = new C6743(this, 4);
        C6651 c6651 = C6647.f16291;
        "hookItem";
        "onMsgListener";
        C6647.f16288.add(new C6646(this, c6743));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "点击可以设置一些参数 适配9.0.8及以下的QQNT版本";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC6365(19);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m15034(Object obj, Object obj2) {
        String uinFromUid = (String) AbstractC7165.m12418(String.class, "peerUid", obj);
        long jLongValue = ((Long) AbstractC7165.m12418(Long.TYPE, "senderUin", obj)).longValue();
        int iIntValue = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue();
        if (iIntValue == 100 || iIntValue == 1) {
            uinFromUid = QQEnvTool.getUinFromUid(uinFromUid);
        }
        String str = (String) AbstractC7165.m12418(String.class, "authkey", obj2);
        String str2 = (String) AbstractC7165.m12418(String.class, "billNo", obj2);
        Integer num = (Integer) AbstractC7165.m12418(Integer.TYPE, "redChannel", obj2);
        String str3 = (String) AbstractC7165.m12418(String.class, "notice", AbstractC7165.m12418(null, "receiver", obj2));
        if (num.intValue() == 1) {
            if (!((Boolean) this.f25120.m12399(Boolean.TRUE, "ordinary")).booleanValue()) {
                return;
            }
        }
        if (num.intValue() == 32) {
            if (!((Boolean) this.f25120.m12399(Boolean.FALSE, "passwordRedEnvelope")).booleanValue()) {
                return;
            }
        }
        if (num.intValue() == 1024) {
            if (!((Boolean) this.f25120.m12399(Boolean.FALSE, "exclusiveRedEnvelopes")).booleanValue()) {
                return;
            }
        }
        String str4 = (String) this.f25120.m12399(null, "blacklistTroop");
        if (str4 == null || !uinFromUid.matches(str4.replace(" ", ""))) {
            String strM721 = (String) this.f25120.m12399(null, "blacklistText");
            if (!TextUtils.isEmpty(strM721)) {
                if (strM721.endsWith("|")) {
                    strM721 = AbstractC0900.m721(1, 0, strM721);
                }
                String[] strArrSplit = strM721.split("\\|");
                if (strArrSplit != null) {
                    for (String str5 : strArrSplit) {
                        if (str3.contains(str5)) {
                            return;
                        }
                    }
                }
            }
            if (((Boolean) this.f25120.m12399(Boolean.TRUE, "grabToast")).booleanValue() && (num.intValue() == 1 || num.intValue() == 32)) {
                AbstractC7014.m12151("红包来自:" + ((String) AbstractC7165.m12418(String.class, "peerName", obj)) + "(" + uinFromUid + ")\n" + ((String) AbstractC7165.m12418(String.class, "sendNickName", obj)) + "(" + jLongValue + ")");
            }
            RunnableC7281 runnableC7281 = new RunnableC7281();
            runnableC7281.f18029 = str;
            runnableC7281.f18025 = str2;
            runnableC7281.f18026 = uinFromUid;
            runnableC7281.f18027 = String.valueOf(jLongValue);
            runnableC7281.f18028 = num.intValue();
            if (num.intValue() == 32) {
                runnableC7281.f18024 = str3.replace("[QQ红包]", "");
            }
            new Thread(new RunnableC9630(this, uinFromUid, jLongValue, str, str2, num, str3)).start();
        }
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }
}
