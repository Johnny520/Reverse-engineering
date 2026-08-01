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
import p303.AbstractC9234;
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
        sb.append(AbstractC9234.m14531(1972) + str + '\n');
        sb.append(AbstractC9234.m14531(1973));
        sb.append(str2);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(1136));
        sb.append(str3);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(1974));
        sb.append(groupName);
        sb.append(AbstractC9234.m14532("喵呜喵呜呜喵呜呜"));
        sb.append(str4);
        sb.append(AbstractC9234.m14532("喵呜喵呜呜喵呜喵"));
        String string = sb.toString();
        AbstractC9234.m14531(1296);
        return string;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        C9571.f24981.getClass();
        if (AbstractC7187.f17853 > 14200) {
            C3466.m5899(AbstractC9234.m14531(2640));
            return;
        }
        int i = 1;
        if (LocalDate.now().isAfter(LocalDate.of(2026, 7, 1))) {
            C3466.m5899(AbstractC9234.m14531(1066));
            return;
        }
        C6651 c6651 = C6647.f16291;
        C6743 c6743 = new C6743(this, i);
        AbstractC9234.m14531(1562);
        AbstractC9234.m14531(1566);
        C6647.f16288.add(new C6646(this, c6743));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1964);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        C9571.f24981.getClass();
        C9931 c9931 = new C9931();
        c9931.m15254(AbstractC9234.m14531(2642));
        Class clsM15255 = c9931.m15255();
        AbstractC9234.m14531(1549);
        clsM15255.getClass();
        C9571.m14997();
        String strM14531 = AbstractC9234.m14531(1097);
        int i = C9915.f25813;
        C9915 c9915M15221 = C9915.m15221(AbstractC9919.m15228(strM14531));
        c9915M15221.f25815 = AbstractC9234.m14531(435);
        C9921 c9921M15231 = C9921.m15231(c9915M15221.m15224(null).getClass());
        c9921M15231.f25826 = AbstractC9234.m14531(1098);
        c9921M15231.m15234(String.class, String.class, C9496.class, C9496.class, C9496.class, C9496.class);
        Class<?> cls = ((Method) c9921M15231.m15164()).getParameterTypes()[r6.getParameterTypes().length - 1];
        AbstractC9234.m14531(1548);
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
        ?? M15222 = C9915.m15222(String.class, AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
        AbstractC9234.m14531(1588);
        M15222.getClass();
        ref$ObjectRef.element = M15222;
        Object objM15222 = C9915.m15222(Long.TYPE, AbstractC9234.m14531(483), obj);
        AbstractC9234.m14531(1588);
        objM15222.getClass();
        long jLongValue = ((Number) objM15222).longValue();
        Object objCallMethod = XposedHelpers.callMethod(obj, AbstractC9234.m14531(511), new Object[0]);
        AbstractC9234.m14531(1866);
        objCallMethod.getClass();
        int iIntValue = ((Integer) objCallMethod).intValue();
        if (iIntValue == 1 || iIntValue == 100) {
            ?? uinFromUid = QQEnvTool.getUinFromUid((String) ref$ObjectRef.element);
            AbstractC9234.m14531(1965);
            uinFromUid.getClass();
            ref$ObjectRef.element = uinFromUid;
        }
        String str = (String) C9915.m15222(String.class, AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), obj2);
        String str2 = (String) C9915.m15222(String.class, AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵呜喵呜喵呜呜~喵喵喵喵喵喵呜呜"), obj2);
        Object objM152222 = C9915.m15222(Integer.TYPE, AbstractC9234.m14531(1069), obj2);
        AbstractC9234.m14531(1588);
        objM152222.getClass();
        int iIntValue2 = ((Number) objM152222).intValue();
        String str3 = (String) C9915.m15222(String.class, AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜"), C9915.m15222(null, AbstractC9234.m14531(1070), obj2));
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? M152222 = C9915.m15222(String.class, AbstractC9234.m14531(585), obj);
        ref$ObjectRef2.element = M152222;
        if (TextUtils.isEmpty((CharSequence) M152222)) {
            ref$ObjectRef2.element = C9915.m15222(String.class, AbstractC9234.m14531(586), obj);
        }
        C9573.f24990.getClass();
        C9924 c9924 = C9573.f24989;
        if (iIntValue2 == 1) {
            String strM145312 = AbstractC9234.m14531(1062);
            c9924.getClass();
            if (!c9924.f25834.getBoolean(strM145312, true)) {
                strM14531 = AbstractC9234.m14531(1966);
            } else if (iIntValue2 == 1024) {
                String strM145313 = AbstractC9234.m14531(1063);
                c9924.getClass();
                strM14531 = !c9924.f25834.getBoolean(strM145313, false) ? AbstractC9234.m14531(1967) : null;
            }
        }
        if (strM14531 == null) {
            C8036 c8036 = AbstractC6227.f15375;
            AbstractC6231.m11036(AbstractC6231.m11048(ExecutorC8037.f19570.plus(new C6638(this))), null, null, new NewAutoGrabHb$pares$1(iIntValue2, str, str2, ref$ObjectRef, jLongValue, this, str3, ref$ObjectRef2, null), 3);
            return;
        }
        String strM145314 = AbstractC9234.m14531(1960);
        c9924.getClass();
        if (c9924.f25834.getBoolean(strM145314, false)) {
            String strConcat = AbstractC9234.m14531(1962).concat(strM14531);
            str3.getClass();
            T t = ref$ObjectRef2.element;
            AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜");
            t.getClass();
            AbstractC7014.m12151(m11886(strConcat, str3, (String) t, (String) ref$ObjectRef.element));
            String strConcat2 = AbstractC9234.m14531(1962).concat(strM14531);
            T t2 = ref$ObjectRef2.element;
            AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜");
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
            AbstractC9234.m14531(1959);
            jSONObjectM6934.getClass();
            int intValue = jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵"));
            JSONObject jSONObject = jSONObjectM6934.getJSONObject(AbstractC9234.m14531(478));
            String string = jSONObject.getString(AbstractC9234.m14531(1071));
            AbstractC9234.m14531(1305);
            string.getClass();
            String string2 = jSONObject.getString(AbstractC9234.m14532("喵喵喵喵喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"));
            String groupName = QQNTTroopTool.getGroupName(str7);
            if (intValue != 0) {
                C9573.f24990.getClass();
                C9924 c9924 = C9573.f24989;
                String strM14531 = AbstractC9234.m14531(1960);
                c9924.getClass();
                if (c9924.f25834.getBoolean(strM14531, false)) {
                    String strM145312 = AbstractC9234.m14531(1975);
                    string2.getClass();
                    AbstractC7014.m12151(m11886(strM145312, string2, string, str7));
                    m11885(AbstractC9234.m14531(1975), string2, string, str7);
                }
                return c6008;
            }
            String string3 = jSONObjectM6934.getJSONObject(AbstractC9234.m14531(1072)).getString(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵"));
            AbstractC9234.m14531(1305);
            string3.getClass();
            String string4 = new BigDecimal(string3).divide(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP).toString();
            AbstractC9234.m14531(1296);
            string4.getClass();
            str4 = AbstractC9234.m14531(1073) + string4 + AbstractC9234.m14532("喵呜呜呜呜喵喵呜") + AbstractC9234.m14531(1973) + string2 + AbstractC9234.m14532("喵呜呜呜呜喵喵呜") + AbstractC9234.m14531(1136) + string + AbstractC9234.m14532("喵呜呜呜呜喵喵呜") + AbstractC9234.m14531(1974) + groupName + AbstractC9234.m14532("喵呜喵呜呜喵呜呜") + str7 + AbstractC9234.m14532("喵呜喵呜呜喵呜喵");
            AbstractC9234.m14531(1296);
            contact = QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin());
            C9573.f24990.getClass();
            C9924 c99242 = C9573.f24989;
            String strM145313 = AbstractC9234.m14531(1061);
            c99242.getClass();
            if (c99242.f25834.getBoolean(strM145313, true)) {
                AbstractC7014.m12151(str4);
            }
            if (strM10720.length() > 0) {
                if (strM10720.endsWith(AbstractC9234.m14532("喵喵喵喵呜呜呜呜"))) {
                    strM10720 = AbstractC5976.m10720(1, strM10720);
                }
                List listM9405 = AbstractC5179.m9405((String[]) new Regex(AbstractC9234.m14532("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜")).split(strM10720, 0).toArray(new String[0]));
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
            C6755.m11870(AbstractC9234.m14531(1261));
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
        AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵");
        return c9614.f25085.intValue() >= 1;
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
    }
}
