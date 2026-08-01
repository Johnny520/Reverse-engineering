package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.content.Intent;
import bsh.C3494;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3897;
import de.robv.android.xposed.XposedHelpers;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7014;
import p052.AbstractC7187;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p342.C9571;
import p342.C9572;
import p342.C9573;
import p342.C9574;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9917;
import p405.C9920;
import p405.C9921;
import p407.C9924;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.NewAutoGrabHb$pares$1", m556f = "NewAutoGrabHb.kt", m557l = {194, Opcodes.AND_INT_LIT16}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class NewAutoGrabHb$pares$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $authkey;
    final /* synthetic */ String $billNo;
    final /* synthetic */ String $notice;
    final /* synthetic */ Ref$ObjectRef<String> $peerUid;
    final /* synthetic */ int $redChannel;
    final /* synthetic */ Ref$ObjectRef<String> $senderName;
    final /* synthetic */ long $senderUin;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C6784 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAutoGrabHb$pares$1(int i, String str, String str2, Ref$ObjectRef<String> ref$ObjectRef, long j, C6784 c6784, String str3, Ref$ObjectRef<String> ref$ObjectRef2, InterfaceC5189<? super NewAutoGrabHb$pares$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$redChannel = i;
        this.$authkey = str;
        this.$billNo = str2;
        this.$peerUid = ref$ObjectRef;
        this.$senderUin = j;
        this.this$0 = c6784;
        this.$notice = str3;
        this.$senderName = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new NewAutoGrabHb$pares$1(this.$redChannel, this.$authkey, this.$billNo, this.$peerUid, this.$senderUin, this.this$0, this.$notice, this.$senderName, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((NewAutoGrabHb$pares$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x065b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws ExecutionException, InterruptedException, TimeoutException {
        String string;
        int i;
        String str;
        String strConcat;
        Collection collectionM9358;
        Object objM11058;
        String string2;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            int i3 = this.$redChannel;
            String str2 = this.$authkey;
            str2.getClass();
            String str3 = this.$billNo;
            str3.getClass();
            C9572 c9572 = new C9572(str2, str3, this.$peerUid.element, i3, String.valueOf(this.$senderUin));
            C9571.f24981.getClass();
            Class clsM14997 = C9571.m14997();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC9919.m15228("com.tencent.mobileqq.qwallet.api.INewQWalletApi"));
            C9921 c9921M15231 = C9921.m15231(qRouteApi.getClass());
            c9921M15231.f25828 = String.class;
            c9921M15231.f25826 = "hexGuid";
            String str4 = (String) c9921M15231.m15235(qRouteApi, new Object[0]);
            String pSkey = QQEnvTool.getPSkey("tenpay.com");
            String currentUin = QQEnvTool.getCurrentUin();
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            StringBuilder sb = new StringBuilder();
            sb.append("listid");
            sb.append("=");
            sb.append(c9572.f24985);
            sb.append("&channel");
            sb.append("=");
            sb.append(c9572.f24987);
            sb.append("&groupid");
            sb.append("=");
            String str5 = c9572.f24984;
            sb.append(str5);
            sb.append("&grouptype");
            sb.append("=");
            sb.append("1");
            sb.append("&groupuin");
            sb.append("=");
            sb.append(str5);
            sb.append("&name");
            sb.append("=");
            sb.append(currentAccountNickName);
            sb.append("&pay_flag");
            sb.append("=");
            sb.append("0");
            sb.append("&authkey");
            sb.append("=");
            sb.append(c9572.f24986);
            sb.append("&uin");
            sb.append("=");
            sb.append(currentUin);
            sb.append("&senderuin");
            sb.append("=");
            sb.append(c9572.f24983);
            sb.append("&trans_seq");
            sb.append("=");
            sb.append("1");
            sb.append("&hb_from");
            sb.append("=");
            sb.append("0");
            String string3 = sb.toString();
            "toString(...)";
            Object objM15225 = C9917.m15225(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, AbstractC9919.m15228("com.tenpay.sdk.basebl.EncryptRequest"));
            objM15225.getClass();
            C9921 c9921M152312 = C9921.m15231(objM15225.getClass());
            Class cls = Integer.TYPE;
            c9921M152312.m15234(String.class, String.class, cls, String.class, String.class, String.class);
            c9921M152312.f25828 = AbstractC9919.m15228("com.tenpay.sdk.basebl.EncryptRequest$Encrypt");
            c9921M152312.f25826 = "encypt";
            String strM14531 = "hb_pre_grapver=2.0&chv=3";
            int i4 = c9572.f24982;
            String str6 = (String) C9915.m15222(String.class, "encText", c9921M152312.m15235(objM15225, currentUin, strM14531, Integer.valueOf(i4), string3, pSkey, str4));
            str6.getClass();
            Object objM15226 = C9917.m15226(AbstractC9919.m15228("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
            objM15226.getClass();
            XposedHelpers.callMethod(C9915.m15222(null, "cgiName", objM15226), "set", new Class[]{String.class}, new Object[]{"hb_pre_grap"});
            XposedHelpers.callMethod(C9915.m15222(null, "reqText", objM15226), "set", new Class[]{String.class}, new Object[]{str6});
            XposedHelpers.callMethod(C9915.m15222(null, "random", objM15226), "set", new Class[]{String.class}, new Object[]{String.valueOf(i4)});
            XposedHelpers.callMethod(C9915.m15222(null, "enType", objM15226), "set", new Class[]{cls}, new Object[]{0});
            Object objCallMethod = XposedHelpers.callMethod(objM15226, "toByteArray", new Object[0]);
            "null cannot be cast to non-null type kotlin.ByteArray";
            objCallMethod.getClass();
            byte[] bArrM14998 = C9571.m14998((byte[]) objCallMethod);
            C9915 c9915M15221 = C9915.m15221(AbstractC9919.m15228("mqq.app.MobileQQ"));
            c9915M15221.f25815 = "sMobileQQ";
            Object objM152252 = C9917.m15225(new Object[]{(Context) c9915M15221.m15224(null), clsM14997}, new Class[]{Context.class, Class.class}, AbstractC9919.m15228("mqq.app.NewIntent"));
            "null cannot be cast to non-null type android.content.Intent";
            objM152252.getClass();
            Intent intent = (Intent) objM152252;
            intent.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
            intent.putExtra("data", bArrM14998);
            intent.putExtra("timeout", 30000L);
            C9921 c9921M152313 = C9921.m15231(intent.getClass());
            c9921M152313.f25826 = "setObserver";
            c9921M152313.m15234(AbstractC9919.m15228("mqq.observer.BusinessObserver"));
            C9920 c9920 = AbstractC9919.f25822;
            Class clsM15228 = AbstractC9919.m15228("mqq.observer.BusinessObserver");
            "findClass(...)";
            clsM15228.getClass();
            Object objNewProxyInstance = Proxy.newProxyInstance(c9920, new Class[]{clsM15228}, new C3494(c9572, 4));
            "newProxyInstance(...)";
            objNewProxyInstance.getClass();
            c9921M152313.m15235(intent, objNewProxyInstance);
            Object appRuntime = QQEnvTool.getAppRuntime();
            appRuntime.getClass();
            AbstractC3897.m7397(appRuntime, "startServlet", intent);
            Object obj2 = c9572.f24988.get(10L, TimeUnit.SECONDS);
            "get(...)";
            obj2.getClass();
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934((String) obj2);
            "parseObject(...)";
            jSONObjectM6934.getClass();
            string = jSONObjectM6934.getString("pre_grap_token");
            if (string == null) {
                C9573.f24990.getClass();
                C9924 c9924 = C9573.f24989;
                String strM145312 = "grabFailToast";
                c9924.getClass();
                if (c9924.f25834.getBoolean(strM145312, false)) {
                    C6784 c6784 = this.this$0;
                    String strM145313 = "红包预处理失败: 红包已被抢光";
                    String str7 = this.$notice;
                    str7.getClass();
                    String str8 = this.$senderName.element;
                    "element";
                    str8.getClass();
                    String str9 = this.$peerUid.element;
                    c6784.getClass();
                    AbstractC7014.m12151(C6784.m11886(strM145313, str7, str8, str9));
                    C6784 c67842 = this.this$0;
                    String strM145314 = "红包预处理失败: 红包已被抢光";
                    String str10 = this.$notice;
                    str10.getClass();
                    String str11 = this.$senderName.element;
                    "element";
                    str11.getClass();
                    String str12 = this.$peerUid.element;
                    c67842.getClass();
                    C6784.m11885(strM145314, str10, str11, str12);
                    return c6008;
                }
            } else {
                JSONObject jSONObject = jSONObjectM6934.getJSONObject("send_object");
                String string4 = jSONObject.getString("total_num");
                String string5 = jSONObject.getString("total_amount");
                string5.getClass();
                int i5 = Integer.parseInt(string5);
                string4.getClass();
                i = i5 / Integer.parseInt(string4);
                C6784 c67843 = this.this$0;
                String str13 = this.$notice;
                str13.getClass();
                String str14 = this.$peerUid.element;
                c67843.getClass();
                C9573.f24990.getClass();
                C9924 c99242 = C9573.f24989;
                String strM15237 = c99242.m15237("blacklistTroop", "");
                if (strM15237.length() > 0) {
                    str = "element";
                    if (new Regex(AbstractC5971.m10696(strM15237, " ", "")).matches(str14)) {
                        strConcat = "群号在黑名单中";
                    }
                    if (strConcat != null) {
                        C6784 c67844 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = string;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i;
                        this.label = 1;
                        c67844.getClass();
                        C9573.f24990.getClass();
                        C9924 c99243 = C9573.f24989;
                        String strM14532 = "delay";
                        c99243.getClass();
                        int i6 = c99243.f25834.getInt(strM14532, 0);
                        if (i6 <= 0 || (objM11058 = AbstractC6231.m11058(i6, this)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM11058 = c6008;
                        }
                        if (objM11058 != coroutineSingletons) {
                        }
                    }
                    C9573.f24990.getClass();
                    C9924 c99244 = C9573.f24989;
                    String strM145315 = "grabFailToast";
                    c99244.getClass();
                    if (c99244.f25834.getBoolean(strM145315, false)) {
                        C6784 c67845 = this.this$0;
                        String strConcat2 = "红包跳过领取: ".concat(strConcat);
                        String str15 = this.$notice;
                        str15.getClass();
                        String str16 = this.$senderName.element;
                        str16.getClass();
                        String str17 = this.$peerUid.element;
                        c67845.getClass();
                        AbstractC7014.m12151(C6784.m11886(strConcat2, str15, str16, str17));
                        C6784 c67846 = this.this$0;
                        String strConcat3 = "红包跳过领取: ".concat(strConcat);
                        String str18 = this.$notice;
                        str18.getClass();
                        String str19 = this.$senderName.element;
                        str19.getClass();
                        String str20 = this.$peerUid.element;
                        c67846.getClass();
                        C6784.m11885(strConcat3, str18, str19, str20);
                        return c6008;
                    }
                } else {
                    str = "element";
                }
                String strM152372 = c99242.m15237("blacklistText", "");
                if (strM152372.length() > 0) {
                    if (strM152372.endsWith("|")) {
                        strM152372 = AbstractC5976.m10720(1, strM152372);
                    }
                    List<String> listSplit = new Regex("\\|").split(strM152372, 0);
                    if (!listSplit.isEmpty()) {
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                collectionM9358 = AbstractC5176.m9358(listIterator.nextIndex() + 1, listSplit);
                                break;
                            }
                        }
                    }
                    collectionM9358 = EmptyList.INSTANCE;
                    int i7 = 0;
                    String[] strArr = (String[]) collectionM9358.toArray(new String[0]);
                    int length = strArr.length;
                    while (i7 < length) {
                        String[] strArr2 = strArr;
                        String str21 = strArr2[i7];
                        int i8 = length;
                        if (AbstractC5976.m10735(str13, str21, false)) {
                            strConcat = "红包描述包含关键词: ".concat(str21);
                            break;
                        }
                        i7++;
                        strArr = strArr2;
                        length = i8;
                    }
                }
                int i9 = c99242.f25834.getInt("expectAmount", 0);
                if (i9 <= 0 || i >= i9) {
                    strConcat = null;
                } else {
                    BigDecimal bigDecimalDivide = new BigDecimal(i9).divide(new BigDecimal(100));
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    String string6 = bigDecimalDivide.setScale(2, roundingMode).toString();
                    "toString(...)";
                    string6.getClass();
                    String string7 = new BigDecimal(i).divide(new BigDecimal(100)).setScale(2, roundingMode).toString();
                    "toString(...)";
                    string7.getClass();
                    strConcat = "红包平均金额" + string7 + "元，未达到期望值" + string6 + (char) 20803;
                }
                if (strConcat != null) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            return c6008;
        }
        i = this.I$0;
        string = (String) this.L$3;
        AbstractC6017.m10769(obj);
        String str22 = string;
        int i10 = this.$redChannel;
        String str23 = this.$authkey;
        str23.getClass();
        String str24 = this.$billNo;
        str24.getClass();
        String str25 = this.$notice;
        str25.getClass();
        C9574 c9574 = new C9574(str23, i10, str24, str25, this.$peerUid.element, String.valueOf(this.$senderUin), str22);
        C9571.f24981.getClass();
        Class clsM149972 = C9571.m14997();
        String currentUin2 = QQEnvTool.getCurrentUin();
        String currentAccountNickName2 = QQEnvTool.getCurrentAccountNickName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subchanne", null);
        linkedHashMap.put("authkey", c9574.f24995);
        linkedHashMap.put("hb_from", "0");
        linkedHashMap.put("agreement", "0");
        linkedHashMap.put("pay_flag", "0");
        linkedHashMap.put("groupid", c9574.f24992);
        linkedHashMap.put("channel", String.valueOf(c9574.f24996));
        linkedHashMap.put("pre_grap_token", c9574.f24999);
        String strM145316 = "senderuin";
        String str26 = c9574.f24991;
        linkedHashMap.put(strM145316, str26);
        linkedHashMap.put("listid", c9574.f24994);
        linkedHashMap.put("grouptype", "1");
        linkedHashMap.put("sub_guild_id", null);
        linkedHashMap.put("answer", c9574.f24993);
        linkedHashMap.put("groupuin", str26);
        linkedHashMap.put("tinyid", null);
        linkedHashMap.put("guild_id", null);
        linkedHashMap.put("name", currentAccountNickName2);
        linkedHashMap.put("uin", currentUin2);
        linkedHashMap.put("msg_md5", null);
        linkedHashMap.put("msg_seq", null);
        linkedHashMap.put("msg_id", null);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str27 = (String) entry.getValue();
            if (str27 != null) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append((String) entry.getKey());
                sb2.append("=");
                sb2.append(str27);
            }
        }
        Class clsM152282 = AbstractC9919.m15228("com.tenpay.sdk.net.core.processor.PsKeyProcessor");
        clsM152282.getClass();
        String strM145317 = "INSTANCE";
        C9915 c9915M152212 = C9915.m15221(clsM152282);
        c9915M152212.f25815 = strM145317;
        c9915M152212.f25814 = null;
        String str28 = (String) AbstractC3897.m7397(c9915M152212.m15224(null), "getPsKey", c9574.f25002);
        String currentUin3 = QQEnvTool.getCurrentUin();
        Class clsM152283 = AbstractC9919.m15228("com.tenpay.sdk.net.core.comm.SessionKey");
        String str29 = c9574.f24998;
        Object objM152253 = C9917.m15225(new Object[]{str29, str28, currentUin3}, new Class[]{String.class, String.class, String.class}, clsM152283);
        "newInstance(...)";
        objM152253.getClass();
        c9574.f25000 = objM152253;
        Class clsM152284 = AbstractC9919.m15228("com.tenpay.sdk.net.core.comm.SessionKey");
        Class clsM152285 = AbstractC9919.m15228("com.tenpay.sdk.net.core.statistic.StatisticInfo");
        Class clsM152286 = AbstractC9919.m15228("com.tenpay.sdk.net.core.processor.EncryptProcessor$ProcessResult");
        Object obj3 = c9574.f25003;
        C9921 c9921M15230 = C9921.m15230(obj3);
        c9921M15230.f25826 = "processEncrypt";
        Class cls2 = Boolean.TYPE;
        c9921M15230.m15234(String.class, clsM152284, Map.class, cls2, cls2, clsM152285);
        c9921M15230.f25828 = clsM152286;
        Boolean bool = Boolean.TRUE;
        Object objM15235 = c9921M15230.m15235(obj3, c9574.f25002, objM152253, linkedHashMap, bool, bool, null);
        objM15235.getClass();
        c9574.f25001 = objM15235;
        C9921 c9921M152314 = C9921.m15231(objM15235.getClass());
        c9921M152314.f25826 = "getBodyData";
        c9921M152314.f25828 = Map.class;
        Object obj4 = c9574.f25001;
        if (obj4 == null) {
            AbstractC5227.m9467("processEncrypt");
            throw null;
        }
        Object objM152352 = c9921M152314.m15235(obj4, new Object[0]);
        "invokeFirst(...)";
        objM152352.getClass();
        Map map = (Map) objM152352;
        Object objM152262 = C9917.m15226(AbstractC9919.m15228("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
        objM152262.getClass();
        C9921 c9921M152315 = C9921.m15231(AbstractC9919.m15228("com.tencent.mobileqq.pb.ByteStringMicro"));
        c9921M152315.f25826 = "copyFromUtf8";
        c9921M152315.m15234(String.class);
        try {
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                String str30 = (String) entry2.getValue();
                if (str30 != null) {
                    if (sb3.length() > 0) {
                        it = it2;
                        sb3.append("&");
                    } else {
                        it = it2;
                    }
                    sb3.append((String) entry2.getKey());
                    sb3.append("=");
                    sb3.append(URLEncoder.encode(str30, "UTF-8"));
                    it2 = it;
                }
            }
            string2 = sb3.toString();
            "toString(...)";
        } catch (UnsupportedEncodingException unused) {
            string2 = "";
        }
        try {
            Object objInvoke = ((Method) c9921M152315.m15164()).invoke(null, string2);
            AbstractC3897.m7397(AbstractC3897.m7385(null, "cgiName", objM152262), "set", str29);
            AbstractC3897.m7397(AbstractC3897.m7385(null, "reqBody", objM152262), "set", objInvoke);
            byte[] bArr = (byte[]) AbstractC3897.m7397(objM152262, "toByteArray", new Object[0]);
            C9571.f24981.getClass();
            byte[] bArrM149982 = C9571.m14998(bArr);
            C9915 c9915M152213 = C9915.m15221(AbstractC9919.m15228("mqq.app.MobileQQ"));
            c9915M152213.f25815 = "sMobileQQ";
            Object objM152254 = C9917.m15225(new Object[]{(Context) c9915M152213.m15224(null), clsM149972}, new Class[]{Context.class, Class.class}, AbstractC9919.m15228("mqq.app.NewIntent"));
            "null cannot be cast to non-null type android.content.Intent";
            objM152254.getClass();
            Intent intent2 = (Intent) objM152254;
            intent2.putExtra("cmd", "trpc.qqhb.qqhb_proxy.Handler.sso_handle");
            intent2.putExtra("data", bArrM149982);
            intent2.putExtra("timeout", 30000L);
            C9921 c9921M152316 = C9921.m15231(intent2.getClass());
            c9921M152316.f25826 = "setObserver";
            c9921M152316.m15234(AbstractC9919.m15228("mqq.observer.BusinessObserver"));
            C9920 c99202 = AbstractC9919.f25822;
            Class clsM152287 = AbstractC9919.m15228("mqq.observer.BusinessObserver");
            "findClass(...)";
            clsM152287.getClass();
            Object objNewProxyInstance2 = Proxy.newProxyInstance(c99202, new Class[]{clsM152287}, new C3494(c9574, 3));
            "newProxyInstance(...)";
            objNewProxyInstance2.getClass();
            c9921M152316.m15235(intent2, objNewProxyInstance2);
            Object appRuntime2 = QQEnvTool.getAppRuntime();
            appRuntime2.getClass();
            AbstractC3897.m7397(appRuntime2, "startServlet", intent2);
            Object obj5 = c9574.f24997.get();
            "get(...)";
            obj5.getClass();
            C9573.f24990.getClass();
            C9924 c99245 = C9573.f24989;
            String strM152373 = c99245.m15237("replyText", "");
            int i11 = c99245.f25834.getInt("delayReply", 0);
            C6784 c67847 = this.this$0;
            String str31 = this.$peerUid.element;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.I$0 = i;
            this.I$1 = i11;
            this.label = 2;
            return c67847.m11888((String) obj5, str31, strM152373, i11, this) == coroutineSingletons ? coroutineSingletons : c6008;
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }
}
