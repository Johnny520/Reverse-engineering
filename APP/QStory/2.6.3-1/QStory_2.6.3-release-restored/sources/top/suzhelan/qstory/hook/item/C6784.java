package top.suzhelan.qstory.hook.item;

import android.text.TextUtils;
import android.view.View;
import bsh.C3466;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQNTTroopTool;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7014;
import p043.InterfaceC7146;
import p052.AbstractC7187;
import p111.C8036;
import p111.ExecutorC8037;
import p332.C9496;
import p342.C9571;
import p342.C9573;
import p348.C9614;
import p353.AbstractC9632;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9921;
import p407.C9924;
import p408.C9931;
import top.suzhelan.plugin.sdk.online.presenter.C6638;
import top.suzhelan.qstory.hook.api.C6646;
import top.suzhelan.qstory.hook.api.C6647;
import top.suzhelan.qstory.hook.api.C6651;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰世哲;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6784 extends AbstractC9632 implements InterfaceC7146 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m11885(String str, String str2, String str3, String str4) {
        QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin()), m11886(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m11886(String str, String str2, String str3, String str4) {
        String groupName = QQNTTroopTool.getGroupName(str4);
        StringBuilder sb = new StringBuilder();
        sb.append("[QStory]: " + str + '\n');
        sb.append("红包描述:");
        sb.append(str2);
        sb.append("\n");
        sb.append("发送者:");
        sb.append(str3);
        sb.append("\n");
        sb.append("来自群聊:");
        sb.append(groupName);
        sb.append("(");
        sb.append(str4);
        sb.append(")");
        String string = sb.toString();
        "toString(...)";
        return string;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        C9571.f24981.getClass();
        if (AbstractC7187.f17853 > 14200) {
            C3466.m5899("不支持的QQ版本");
            return;
        }
        int i = 1;
        if (LocalDate.now().isAfter(LocalDate.of(2026, 7, 1))) {
            C3466.m5899("版本已过期");
            return;
        }
        C6651 c6651 = C6647.f16291;
        C6743 c6743 = new C6743(this, i);
        "hookItem";
        "onMsgListener";
        C6647.f16288.add(new C6646(this, c6743));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "新版QQ抢红包，在9.2.0 ~ 9.2.95通过测试，点击可配置参数";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        C9571.f24981.getClass();
        C9931 c9931 = new C9931();
        c9931.m15254("GatewayRequestConfig(isSecure=");
        Class clsM15255 = c9931.m15255();
        "first(...)";
        clsM15255.getClass();
        C9571.m14997();
        String strM14531 = "com.tenpay.sdk.net.gateway.QWalletGatewayServlet";
        int i = C9915.f25813;
        C9915 c9915M15221 = C9915.m15221(AbstractC9919.m15228(strM14531));
        c9915M15221.f25815 = "INSTANCE";
        C9921 c9921M15231 = C9921.m15231(c9915M15221.m15224(null).getClass());
        c9921M15231.f25826 = "sendRequest";
        c9921M15231.m15234(String.class, String.class, C9496.class, C9496.class, C9496.class, C9496.class);
        Class<?> cls = ((Method) c9921M15231.m15164()).getParameterTypes()[r6.getParameterTypes().length - 1];
        "get(...)";
        cls.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11887(Object obj, Object obj2) {
        String strM14531;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? M15222 = C9915.m15222(String.class, "peerUid", obj);
        "getField(...)";
        M15222.getClass();
        ref$ObjectRef.element = M15222;
        Object objM15222 = C9915.m15222(Long.TYPE, "senderUin", obj);
        "getField(...)";
        objM15222.getClass();
        long jLongValue = ((Number) objM15222).longValue();
        Object objCallMethod = XposedHelpers.callMethod(obj, "getChatType", new Object[0]);
        "null cannot be cast to non-null type kotlin.Int";
        objCallMethod.getClass();
        int iIntValue = ((Integer) objCallMethod).intValue();
        if (iIntValue == 1 || iIntValue == 100) {
            ?? uinFromUid = QQEnvTool.getUinFromUid((String) ref$ObjectRef.element);
            "getUinFromUid(...)";
            uinFromUid.getClass();
            ref$ObjectRef.element = uinFromUid;
        }
        String str = (String) C9915.m15222(String.class, "authkey", obj2);
        String str2 = (String) C9915.m15222(String.class, "billNo", obj2);
        Object objM152222 = C9915.m15222(Integer.TYPE, "redChannel", obj2);
        "getField(...)";
        objM152222.getClass();
        int iIntValue2 = ((Number) objM152222).intValue();
        String str3 = (String) C9915.m15222(String.class, "notice", C9915.m15222(null, "receiver", obj2));
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? M152222 = C9915.m15222(String.class, "sendMemberName", obj);
        ref$ObjectRef2.element = M152222;
        if (TextUtils.isEmpty((CharSequence) M152222)) {
            ref$ObjectRef2.element = C9915.m15222(String.class, "sendNickName", obj);
        }
        C9573.f24990.getClass();
        C9924 c9924 = C9573.f24989;
        if (iIntValue2 == 1) {
            String strM145312 = "ordinary";
            c9924.getClass();
            if (!c9924.f25834.getBoolean(strM145312, true)) {
                strM14531 = "不领取普通红包";
            } else if (iIntValue2 == 1024) {
                String strM145313 = "exclusiveRedEnvelopes";
                c9924.getClass();
                strM14531 = !c9924.f25834.getBoolean(strM145313, false) ? "不领取专属红包" : null;
            }
        }
        if (strM14531 == null) {
            C8036 c8036 = AbstractC6227.f15375;
            AbstractC6231.m11036(AbstractC6231.m11048(ExecutorC8037.f19570.plus(new C6638(this))), null, null, new NewAutoGrabHb$pares$1(iIntValue2, str, str2, ref$ObjectRef, jLongValue, this, str3, ref$ObjectRef2, null), 3);
            return;
        }
        String strM145314 = "grabFailToast";
        c9924.getClass();
        if (c9924.f25834.getBoolean(strM145314, false)) {
            String strConcat = "红包跳过领取: ".concat(strM14531);
            str3.getClass();
            T t = ref$ObjectRef2.element;
            "element";
            t.getClass();
            AbstractC7014.m12151(m11886(strConcat, str3, (String) t, (String) ref$ObjectRef.element));
            String strConcat2 = "红包跳过领取: ".concat(strM14531);
            T t2 = ref$ObjectRef2.element;
            "element";
            t2.getClass();
            m11885(strConcat2, str3, (String) t2, (String) ref$ObjectRef.element);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11888(String str, String str2, String str3, int i, ContinuationImpl continuationImpl) {
        NewAutoGrabHb$onGrabSuccess$1 newAutoGrabHb$onGrabSuccess$1;
        String str4;
        Object contact;
        String str5;
        String str6;
        String str7 = str2;
        String strM10720 = str3;
        if (continuationImpl instanceof NewAutoGrabHb$onGrabSuccess$1) {
            newAutoGrabHb$onGrabSuccess$1 = (NewAutoGrabHb$onGrabSuccess$1) continuationImpl;
            int i2 = newAutoGrabHb$onGrabSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                newAutoGrabHb$onGrabSuccess$1.label = i2 - Integer.MIN_VALUE;
            } else {
                newAutoGrabHb$onGrabSuccess$1 = new NewAutoGrabHb$onGrabSuccess$1(this, continuationImpl);
            }
        }
        Object obj = newAutoGrabHb$onGrabSuccess$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = newAutoGrabHb$onGrabSuccess$1.label;
        C6008 c6008 = C6008.f15084;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(str);
            "parseObject(...)";
            jSONObjectM6934.getClass();
            int intValue = jSONObjectM6934.getIntValue("state");
            JSONObject jSONObject = jSONObjectM6934.getJSONObject("send_object");
            String string = jSONObject.getString("send_name");
            "getString(...)";
            string.getClass();
            String string2 = jSONObject.getString("wishing");
            String groupName = QQNTTroopTool.getGroupName(str7);
            if (intValue != 0) {
                C9573.f24990.getClass();
                C9924 c9924 = C9573.f24989;
                String strM14531 = "grabFailToast";
                c9924.getClass();
                if (c9924.f25834.getBoolean(strM14531, false)) {
                    String strM145312 = "红包领取失败: 红包已被抢光了";
                    string2.getClass();
                    AbstractC7014.m12151(m11886(strM145312, string2, string, str7));
                    m11885("红包领取失败: 红包已被抢光了", string2, string, str7);
                }
                return c6008;
            }
            String string3 = jSONObjectM6934.getJSONObject("recv_object").getString("amount");
            "getString(...)";
            string3.getClass();
            String string4 = new BigDecimal(string3).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP).toString();
            "toString(...)";
            string4.getClass();
            str4 = "[QStory]领取成功:" + string4 + "\n" + "红包描述:" + string2 + "\n" + "发送者:" + string + "\n" + "来自群聊:" + groupName + "(" + str7 + ")";
            "toString(...)";
            contact = QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin());
            C9573.f24990.getClass();
            C9924 c99242 = C9573.f24989;
            String strM145313 = "grabToast";
            c99242.getClass();
            if (c99242.f25834.getBoolean(strM145313, true)) {
                AbstractC7014.m12151(str4);
            }
            if (strM10720.length() > 0) {
                if (strM10720.endsWith("|")) {
                    strM10720 = AbstractC5976.m10720(1, strM10720);
                }
                List listM9405 = AbstractC5179.m9405((String[]) new Regex("\\|").split(strM10720, 0).toArray(new String[0]));
                int iNextInt = new Random().nextInt(listM9405.size());
                str5 = (String) listM9405.get(iNextInt);
                if (i > 0) {
                    newAutoGrabHb$onGrabSuccess$1.L$0 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$1 = str7;
                    newAutoGrabHb$onGrabSuccess$1.L$2 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$3 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$4 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$5 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$6 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$7 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$8 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$9 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$10 = str4;
                    newAutoGrabHb$onGrabSuccess$1.L$11 = contact;
                    newAutoGrabHb$onGrabSuccess$1.L$12 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$13 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$14 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$15 = null;
                    newAutoGrabHb$onGrabSuccess$1.L$16 = str5;
                    newAutoGrabHb$onGrabSuccess$1.I$0 = i;
                    newAutoGrabHb$onGrabSuccess$1.I$1 = intValue;
                    newAutoGrabHb$onGrabSuccess$1.I$2 = iNextInt;
                    newAutoGrabHb$onGrabSuccess$1.label = 1;
                    if (AbstractC6231.m11058(i, newAutoGrabHb$onGrabSuccess$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str6 = str4;
                }
                QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str7), str5);
            }
            QQNTSendMsgUtils.sendText(contact, str4);
            return c6008;
        }
        if (i3 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str8 = (String) newAutoGrabHb$onGrabSuccess$1.L$16;
        Object obj2 = newAutoGrabHb$onGrabSuccess$1.L$11;
        str6 = (String) newAutoGrabHb$onGrabSuccess$1.L$10;
        String str9 = (String) newAutoGrabHb$onGrabSuccess$1.L$1;
        AbstractC6017.m10769(obj);
        contact = obj2;
        str5 = str8;
        str7 = str9;
        str4 = str6;
        QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str7), str5);
        QQNTSendMsgUtils.sendText(contact, str4);
        return c6008;
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC6365(9);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        "user";
        return c9614.f25085.intValue() >= 1;
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
    }
}
