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
import p303.AbstractC9234;
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
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC9919.m15228(AbstractC9234.m14531(397)));
            C9921 c9921M15231 = C9921.m15231(qRouteApi.getClass());
            c9921M15231.f25828 = String.class;
            c9921M15231.f25826 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
            String str4 = (String) c9921M15231.m15235(qRouteApi, new Object[0]);
            String pSkey = QQEnvTool.getPSkey(AbstractC9234.m14531(398));
            String currentUin = QQEnvTool.getCurrentUin();
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(c9572.f24985);
            sb.append(AbstractC9234.m14531(1105));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(c9572.f24987);
            sb.append(AbstractC9234.m14531(1106));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            String str5 = c9572.f24984;
            sb.append(str5);
            sb.append(AbstractC9234.m14531(1107));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
            sb.append(AbstractC9234.m14531(1108));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(str5);
            sb.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵"));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(currentAccountNickName);
            sb.append(AbstractC9234.m14531(1109));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
            sb.append(AbstractC9234.m14531(1110));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(c9572.f24986);
            sb.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵"));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(currentUin);
            sb.append(AbstractC9234.m14531(1111));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(c9572.f24983);
            sb.append(AbstractC9234.m14531(1112));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
            sb.append(AbstractC9234.m14531(1113));
            sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
            sb.append(AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
            String string3 = sb.toString();
            AbstractC9234.m14531(1296);
            Object objM15225 = C9917.m15225(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, AbstractC9919.m15228(AbstractC9234.m14531(396)));
            objM15225.getClass();
            C9921 c9921M152312 = C9921.m15231(objM15225.getClass());
            Class cls = Integer.TYPE;
            c9921M152312.m15234(String.class, String.class, cls, String.class, String.class, String.class);
            c9921M152312.f25828 = AbstractC9919.m15228(AbstractC9234.m14531(1114));
            c9921M152312.f25826 = AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵");
            String strM14531 = AbstractC9234.m14531(474);
            int i4 = c9572.f24982;
            String str6 = (String) C9915.m15222(String.class, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), c9921M152312.m15235(objM15225, currentUin, strM14531, Integer.valueOf(i4), string3, pSkey, str4));
            str6.getClass();
            Object objM15226 = C9917.m15226(AbstractC9919.m15228(AbstractC9234.m14531(415)), new Object[0]);
            objM15226.getClass();
            XposedHelpers.callMethod(C9915.m15222(null, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM15226), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC9234.m14531(418)});
            XposedHelpers.callMethod(C9915.m15222(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), objM15226), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{str6});
            XposedHelpers.callMethod(C9915.m15222(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜"), objM15226), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{String.valueOf(i4)});
            XposedHelpers.callMethod(C9915.m15222(null, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM15226), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{cls}, new Object[]{0});
            Object objCallMethod = XposedHelpers.callMethod(objM15226, AbstractC9234.m14531(419), new Object[0]);
            AbstractC9234.m14531(1560);
            objCallMethod.getClass();
            byte[] bArrM14998 = C9571.m14998((byte[]) objCallMethod);
            C9915 c9915M15221 = C9915.m15221(AbstractC9919.m15228(AbstractC9234.m14531(332)));
            c9915M15221.f25815 = AbstractC9234.m14531(402);
            Object objM152252 = C9917.m15225(new Object[]{(Context) c9915M15221.m15224(null), clsM14997}, new Class[]{Context.class, Class.class}, AbstractC9919.m15228(AbstractC9234.m14531(401)));
            AbstractC9234.m14531(1918);
            objM152252.getClass();
            Intent intent = (Intent) objM152252;
            intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC9234.m14531(404));
            intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM14998);
            intent.putExtra(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
            C9921 c9921M152313 = C9921.m15231(intent.getClass());
            c9921M152313.f25826 = AbstractC9234.m14531(421);
            c9921M152313.m15234(AbstractC9919.m15228(AbstractC9234.m14531(422)));
            C9920 c9920 = AbstractC9919.f25822;
            Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(422));
            AbstractC9234.m14531(2630);
            clsM15228.getClass();
            Object objNewProxyInstance = Proxy.newProxyInstance(c9920, new Class[]{clsM15228}, new C3494(c9572, 4));
            AbstractC9234.m14531(1582);
            objNewProxyInstance.getClass();
            c9921M152313.m15235(intent, objNewProxyInstance);
            Object appRuntime = QQEnvTool.getAppRuntime();
            appRuntime.getClass();
            AbstractC3897.m7397(appRuntime, AbstractC9234.m14531(423), intent);
            Object obj2 = c9572.f24988.get(10L, TimeUnit.SECONDS);
            AbstractC9234.m14531(1548);
            obj2.getClass();
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934((String) obj2);
            AbstractC9234.m14531(1959);
            jSONObjectM6934.getClass();
            string = jSONObjectM6934.getString(AbstractC9234.m14531(477));
            if (string == null) {
                C9573.f24990.getClass();
                C9924 c9924 = C9573.f24989;
                String strM145312 = AbstractC9234.m14531(1960);
                c9924.getClass();
                if (c9924.f25834.getBoolean(strM145312, false)) {
                    C6784 c6784 = this.this$0;
                    String strM145313 = AbstractC9234.m14531(1961);
                    String str7 = this.$notice;
                    str7.getClass();
                    String str8 = this.$senderName.element;
                    AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜");
                    str8.getClass();
                    String str9 = this.$peerUid.element;
                    c6784.getClass();
                    AbstractC7014.m12151(C6784.m11886(strM145313, str7, str8, str9));
                    C6784 c67842 = this.this$0;
                    String strM145314 = AbstractC9234.m14531(1961);
                    String str10 = this.$notice;
                    str10.getClass();
                    String str11 = this.$senderName.element;
                    AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜");
                    str11.getClass();
                    String str12 = this.$peerUid.element;
                    c67842.getClass();
                    C6784.m11885(strM145314, str10, str11, str12);
                    return c6008;
                }
            } else {
                JSONObject jSONObject = jSONObjectM6934.getJSONObject(AbstractC9234.m14531(478));
                String string4 = jSONObject.getString(AbstractC9234.m14531(1078));
                String string5 = jSONObject.getString(AbstractC9234.m14531(1079));
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
                String strM15237 = c99242.m15237(AbstractC9234.m14531(1056), "");
                if (strM15237.length() > 0) {
                    str = "喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜";
                    if (new Regex(AbstractC5971.m10696(strM15237, AbstractC9234.m14532("喵呜喵呜喵喵呜呜"), "")).matches(str14)) {
                        strConcat = AbstractC9234.m14531(1968);
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
                        String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
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
                    String strM145315 = AbstractC9234.m14531(1960);
                    c99244.getClass();
                    if (c99244.f25834.getBoolean(strM145315, false)) {
                        C6784 c67845 = this.this$0;
                        String strConcat2 = AbstractC9234.m14531(1962).concat(strConcat);
                        String str15 = this.$notice;
                        str15.getClass();
                        String str16 = this.$senderName.element;
                        AbstractC9234.m14532(str);
                        str16.getClass();
                        String str17 = this.$peerUid.element;
                        c67845.getClass();
                        AbstractC7014.m12151(C6784.m11886(strConcat2, str15, str16, str17));
                        C6784 c67846 = this.this$0;
                        String strConcat3 = AbstractC9234.m14531(1962).concat(strConcat);
                        String str18 = this.$notice;
                        str18.getClass();
                        String str19 = this.$senderName.element;
                        AbstractC9234.m14532(str);
                        str19.getClass();
                        String str20 = this.$peerUid.element;
                        c67846.getClass();
                        C6784.m11885(strConcat3, str18, str19, str20);
                        return c6008;
                    }
                } else {
                    str = "喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜";
                }
                String strM152372 = c99242.m15237(AbstractC9234.m14531(1057), "");
                if (strM152372.length() > 0) {
                    if (strM152372.endsWith(AbstractC9234.m14532("喵喵喵喵呜呜呜呜"))) {
                        strM152372 = AbstractC5976.m10720(1, strM152372);
                    }
                    List<String> listSplit = new Regex(AbstractC9234.m14532("喵喵呜喵呜呜呜呜~喵喵喵喵呜喵喵呜")).split(strM152372, 0);
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
                            strConcat = AbstractC9234.m14531(1969).concat(str21);
                            break;
                        }
                        i7++;
                        strArr = strArr2;
                        length = i8;
                    }
                }
                int i9 = c99242.f25834.getInt(AbstractC9234.m14531(1060), 0);
                if (i9 <= 0 || i >= i9) {
                    strConcat = null;
                } else {
                    BigDecimal bigDecimalDivide = new BigDecimal(i9).divide(new BigDecimal(100));
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    String string6 = bigDecimalDivide.setScale(2, roundingMode).toString();
                    AbstractC9234.m14531(1296);
                    string6.getClass();
                    String string7 = new BigDecimal(i).divide(new BigDecimal(100)).setScale(2, roundingMode).toString();
                    AbstractC9234.m14531(1296);
                    string7.getClass();
                    strConcat = AbstractC9234.m14531(1970) + string7 + AbstractC9234.m14531(1971) + string6 + (char) 20803;
                }
                if (strConcat != null) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870(AbstractC9234.m14531(1261));
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
        linkedHashMap.put(AbstractC9234.m14531(424), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), c9574.f24995);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜~喵喵呜喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵"), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC9234.m14531(425), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC9234.m14531(426), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), c9574.f24992);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵呜"), String.valueOf(c9574.f24996));
        linkedHashMap.put(AbstractC9234.m14531(477), c9574.f24999);
        String strM145316 = AbstractC9234.m14531(427);
        String str26 = c9574.f24991;
        linkedHashMap.put(strM145316, str26);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), c9574.f24994);
        linkedHashMap.put(AbstractC9234.m14531(428), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        linkedHashMap.put(AbstractC9234.m14531(429), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"), c9574.f24993);
        linkedHashMap.put(AbstractC9234.m14531(430), str26);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        linkedHashMap.put(AbstractC9234.m14531(431), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), currentAccountNickName2);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), currentUin2);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵喵~喵呜喵呜喵呜喵喵"), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵"), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str27 = (String) entry.getValue();
            if (str27 != null) {
                if (sb2.length() > 0) {
                    sb2.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜"));
                }
                sb2.append((String) entry.getKey());
                sb2.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
                sb2.append(str27);
            }
        }
        Class clsM152282 = AbstractC9919.m15228(AbstractC9234.m14531(434));
        clsM152282.getClass();
        String strM145317 = AbstractC9234.m14531(435);
        C9915 c9915M152212 = C9915.m15221(clsM152282);
        c9915M152212.f25815 = strM145317;
        c9915M152212.f25814 = null;
        String str28 = (String) AbstractC3897.m7397(c9915M152212.m15224(null), AbstractC9234.m14531(437), c9574.f25002);
        String currentUin3 = QQEnvTool.getCurrentUin();
        Class clsM152283 = AbstractC9919.m15228(AbstractC9234.m14531(407));
        String str29 = c9574.f24998;
        Object objM152253 = C9917.m15225(new Object[]{str29, str28, currentUin3}, new Class[]{String.class, String.class, String.class}, clsM152283);
        AbstractC9234.m14531(2627);
        objM152253.getClass();
        c9574.f25000 = objM152253;
        Class clsM152284 = AbstractC9919.m15228(AbstractC9234.m14531(407));
        Class clsM152285 = AbstractC9919.m15228(AbstractC9234.m14531(408));
        Class clsM152286 = AbstractC9919.m15228(AbstractC9234.m14531(432));
        Object obj3 = c9574.f25003;
        C9921 c9921M15230 = C9921.m15230(obj3);
        c9921M15230.f25826 = AbstractC9234.m14531(433);
        Class cls2 = Boolean.TYPE;
        c9921M15230.m15234(String.class, clsM152284, Map.class, cls2, cls2, clsM152285);
        c9921M15230.f25828 = clsM152286;
        Boolean bool = Boolean.TRUE;
        Object objM15235 = c9921M15230.m15235(obj3, c9574.f25002, objM152253, linkedHashMap, bool, bool, null);
        objM15235.getClass();
        c9574.f25001 = objM15235;
        C9921 c9921M152314 = C9921.m15231(objM15235.getClass());
        c9921M152314.f25826 = AbstractC9234.m14531(414);
        c9921M152314.f25828 = Map.class;
        Object obj4 = c9574.f25001;
        if (obj4 == null) {
            AbstractC5227.m9467(AbstractC9234.m14531(433));
            throw null;
        }
        Object objM152352 = c9921M152314.m15235(obj4, new Object[0]);
        AbstractC9234.m14531(2628);
        objM152352.getClass();
        Map map = (Map) objM152352;
        Object objM152262 = C9917.m15226(AbstractC9919.m15228(AbstractC9234.m14531(415)), new Object[0]);
        objM152262.getClass();
        C9921 c9921M152315 = C9921.m15231(AbstractC9919.m15228(AbstractC9234.m14531(416)));
        c9921M152315.f25826 = AbstractC9234.m14531(417);
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
                        sb3.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜"));
                    } else {
                        it = it2;
                    }
                    sb3.append((String) entry2.getKey());
                    sb3.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
                    sb3.append(URLEncoder.encode(str30, AbstractC9234.m14532("喵喵呜喵喵呜呜喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜呜喵喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜呜喵呜")));
                    it2 = it;
                }
            }
            string2 = sb3.toString();
            AbstractC9234.m14531(1296);
        } catch (UnsupportedEncodingException unused) {
            string2 = "";
        }
        try {
            Object objInvoke = ((Method) c9921M152315.m15164()).invoke(null, string2);
            AbstractC3897.m7397(AbstractC3897.m7385(null, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM152262), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), str29);
            AbstractC3897.m7397(AbstractC3897.m7385(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵"), objM152262), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), objInvoke);
            byte[] bArr = (byte[]) AbstractC3897.m7397(objM152262, AbstractC9234.m14531(419), new Object[0]);
            C9571.f24981.getClass();
            byte[] bArrM149982 = C9571.m14998(bArr);
            C9915 c9915M152213 = C9915.m15221(AbstractC9919.m15228(AbstractC9234.m14531(332)));
            c9915M152213.f25815 = AbstractC9234.m14531(402);
            Object objM152254 = C9917.m15225(new Object[]{(Context) c9915M152213.m15224(null), clsM149972}, new Class[]{Context.class, Class.class}, AbstractC9919.m15228(AbstractC9234.m14531(401)));
            AbstractC9234.m14531(1918);
            objM152254.getClass();
            Intent intent2 = (Intent) objM152254;
            intent2.putExtra(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC9234.m14531(404));
            intent2.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM149982);
            intent2.putExtra(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
            C9921 c9921M152316 = C9921.m15231(intent2.getClass());
            c9921M152316.f25826 = AbstractC9234.m14531(421);
            c9921M152316.m15234(AbstractC9919.m15228(AbstractC9234.m14531(422)));
            C9920 c99202 = AbstractC9919.f25822;
            Class clsM152287 = AbstractC9919.m15228(AbstractC9234.m14531(422));
            AbstractC9234.m14531(2630);
            clsM152287.getClass();
            Object objNewProxyInstance2 = Proxy.newProxyInstance(c99202, new Class[]{clsM152287}, new C3494(c9574, 3));
            AbstractC9234.m14531(1582);
            objNewProxyInstance2.getClass();
            c9921M152316.m15235(intent2, objNewProxyInstance2);
            Object appRuntime2 = QQEnvTool.getAppRuntime();
            appRuntime2.getClass();
            AbstractC3897.m7397(appRuntime2, AbstractC9234.m14531(423), intent2);
            Object obj5 = c9574.f24997.get();
            AbstractC9234.m14531(1548);
            obj5.getClass();
            C9573.f24990.getClass();
            C9924 c99245 = C9573.f24989;
            String strM152373 = c99245.m15237(AbstractC9234.m14531(1058), "");
            int i11 = c99245.f25834.getInt(AbstractC9234.m14531(1963), 0);
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
