package bsh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3897;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQMsgService;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p336.C9514;
import p342.C9572;
import p342.C9574;
import p354.C9634;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9917;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6759;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3494 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f8313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8314;

    public /* synthetic */ C3494(Object obj, int i) {
        this.f8314 = i;
        this.f8313 = obj;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v5 int, still in use, count: 1, list:
  (r11v5 int) from 0x0444: INVOKE (r0v13 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏兰哲), (r11v5 int), (r2v11 java.lang.String), (r1v11 java.util.ArrayList) VIRTUAL call: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏兰哲.飘花落叶言子楪世苏哲兰(int, java.lang.String, java.util.ArrayList):void A[MD:(int, java.lang.String, java.util.ArrayList):void (m), REMOVE] (LINE:1093)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:271)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.markCodeForRemoval(SwitchOverStringVisitor.java:160)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:124)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        int i = this.f8314;
        Class cls = Integer.TYPE;
        Object obj3 = this.f8313;
        switch (i) {
            case 0:
                AbstractC3484 abstractC3484 = (AbstractC3484) obj3;
                abstractC3484.getClass();
                if (method.getDeclaringClass() == Object.class) {
                    String name = method.getName();
                    name.getClass();
                    switch (name) {
                        case "toString":
                            return "BshLambdaProxy[" + abstractC3484 + "]";
                        case "equals":
                            return Boolean.valueOf(objArr != null && objArr.length == 1 && obj == objArr[0]);
                        case "hashCode":
                            return Integer.valueOf(System.identityHashCode(obj));
                    }
                }
                return abstractC3484.invoke(objArr != null ? objArr : AbstractC3500.f8347, method.getExceptionTypes(), method.getReturnType());
            case 1:
                return QQMsgService.lambda$getMsgsByMsgId$1((QQMsgService.IMsgOperateCallback) obj3, obj, method, objArr);
            case 2:
                C9514 c9514 = (C9514) obj3;
                if (AbstractC5227.m9466(method.getName(), "onResult") && objArr != null && objArr.length >= 1 && (obj2 = objArr[0]) != null) {
                    String str = (String) AbstractC7165.m12418(String.class, "errMsg", obj2);
                    if (str == null) {
                        str = "";
                    }
                    ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "msgList", obj2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    c9514.m14967(r11, str, arrayList);
                }
                return null;
            case 3:
                C9574 c9574 = (C9574) obj3;
                "<unused var>";
                method.getClass();
                "args";
                objArr.getClass();
                Object obj4 = objArr[2];
                "null cannot be cast to non-null type android.os.Bundle";
                obj4.getClass();
                byte[] byteArray = ((Bundle) obj4).getByteArray("rsp_bytes");
                byteArray.getClass();
                Object objM15226 = C9917.m15226(AbstractC9919.m15228("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]);
                "newInstance(...)";
                objM15226.getClass();
                int i2 = C9921.f25825;
                C9921 c9921M15231 = C9921.m15231(objM15226.getClass());
                c9921M15231.f25826 = "mergeFrom";
                c9921M15231.m15234(byte[].class);
                Object objM15235 = c9921M15231.m15235(objM15226, byteArray);
                "invokeFirst(...)";
                objM15235.getClass();
                int i3 = C9915.f25813;
                C9915 c9915M15221 = C9915.m15221(objM15235.getClass());
                c9915M15221.f25815 = "retMsg";
                Object objM15224 = c9915M15221.m15224(objM15235);
                C9921 c9921M15230 = C9921.m15230(objM15224);
                c9921M15230.f25826 = "get";
                c9921M15230.f25828 = String.class;
                String str2 = (String) c9921M15230.m15235(objM15224, new Object[0]);
                C9915 c9915M152212 = C9915.m15221(objM15235.getClass());
                c9915M152212.f25815 = "retCode";
                Object objM152242 = c9915M152212.m15224(objM15235);
                C9921 c9921M152302 = C9921.m15230(objM152242);
                c9921M152302.f25828 = null;
                c9921M152302.f25826 = "get";
                String str3 = (String) c9921M152302.m15235(objM152242, new Object[0]);
                C9915 c9915M152213 = C9915.m15221(objM15235.getClass());
                c9915M152213.f25815 = "rspBody";
                Object objM152243 = c9915M152213.m15224(objM15235);
                C9921 c9921M152303 = C9921.m15230(objM152243);
                c9921M152303.f25826 = "get";
                Object objM152352 = c9921M152303.m15235(objM152243, new Object[0]);
                objM152352.getClass();
                String str4 = (String) AbstractC3897.m7397(objM152352, "toStringUtf8", new Object[0]);
                str2.getClass();
                str3.getClass();
                Object obj5 = c9574.f25000;
                if (obj5 == null) {
                    AbstractC5227.m9467("sessionKey");
                    throw null;
                }
                Object obj6 = c9574.f25001;
                if (obj6 == null) {
                    AbstractC5227.m9467("processEncrypt");
                    throw null;
                }
                Class clsM15228 = AbstractC9919.m15228("com.tenpay.sdk.net.core.comm.SessionKey");
                Class clsM152282 = AbstractC9919.m15228("com.tenpay.sdk.net.core.statistic.StatisticInfo");
                Class clsM152283 = AbstractC9919.m15228("com.tenpay.sdk.net.core.encrypt.EncryptResult");
                Class clsM152284 = AbstractC9919.m15228("com.tenpay.sdk.net.core.encrypt.DecryptResult");
                C9921 c9921M152312 = C9921.m15231(obj6.getClass());
                c9921M152312.f25826 = "getEncryptResult";
                c9921M152312.f25828 = clsM152283;
                Object objM152353 = c9921M152312.m15235(obj6, new Object[0]);
                Object obj7 = c9574.f25003;
                C9921 c9921M152304 = C9921.m15230(obj7);
                c9921M152304.f25826 = "processDecrypt";
                c9921M152304.f25828 = clsM152284;
                Class cls2 = Boolean.TYPE;
                c9921M152304.m15234(cls2, cls2, clsM15228, clsM152283, clsM152282, String.class);
                Boolean bool = Boolean.TRUE;
                Object objM152354 = c9921M152304.m15235(obj7, bool, bool, obj5, objM152353, null, str4);
                C9921 c9921M152305 = C9921.m15230(objM152354);
                c9921M152305.f25826 = "getDecodedPlain";
                c9921M152305.f25828 = String.class;
                String str5 = (String) c9921M152305.m15235(objM152354, new Object[0]);
                if (JSONObject.parseObject(str5).getIntValue("retcode", -1) == 0 && !TextUtils.isEmpty(str5)) {
                    c9574.f24997.complete(str5);
                }
                return null;
            case 4:
                C9572 c9572 = (C9572) obj3;
                "<unused var>";
                method.getClass();
                "args";
                objArr.getClass();
                Object obj8 = objArr[2];
                "null cannot be cast to non-null type android.os.Bundle";
                obj8.getClass();
                byte[] byteArray2 = ((Bundle) obj8).getByteArray("rsp_bytes");
                byteArray2.getClass();
                Object objM152262 = C9917.m15226(AbstractC9919.m15228("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]);
                "newInstance(...)";
                objM152262.getClass();
                int i4 = C9921.f25825;
                C9921 c9921M152313 = C9921.m15231(objM152262.getClass());
                c9921M152313.f25826 = "mergeFrom";
                c9921M152313.m15234(byte[].class);
                Object objM152355 = c9921M152313.m15235(objM152262, byteArray2);
                "invokeFirst(...)";
                objM152355.getClass();
                int i5 = C9915.f25813;
                C9915 c9915M152214 = C9915.m15221(objM152355.getClass());
                c9915M152214.f25815 = "retMsg";
                Object objM152244 = c9915M152214.m15224(objM152355);
                C9921 c9921M152306 = C9921.m15230(objM152244);
                c9921M152306.f25826 = "get";
                c9921M152306.f25828 = String.class;
                c9921M152306.m15235(objM152244, new Object[0]);
                C9915 c9915M152215 = C9915.m15221(objM152355.getClass());
                c9915M152215.f25815 = "retCode";
                Object objM152245 = c9915M152215.m15224(objM152355);
                C9921 c9921M152307 = C9921.m15230(objM152245);
                c9921M152307.f25828 = null;
                c9921M152307.f25826 = "get";
                c9921M152307.m15235(objM152245, new Object[0]);
                C9915 c9915M152216 = C9915.m15221(objM152355.getClass());
                c9915M152216.f25815 = "rspText";
                Object objM152246 = c9915M152216.m15224(objM152355);
                C9921 c9921M152308 = C9921.m15230(objM152246);
                c9921M152308.f25828 = String.class;
                c9921M152308.f25826 = "get";
                String str6 = (String) c9921M152308.m15235(objM152246, new Object[0]);
                str6.getClass();
                String currentUin = QQEnvTool.getCurrentUin();
                Object objM15225 = C9917.m15225(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, AbstractC9919.m15228("com.tenpay.sdk.basebl.EncryptRequest"));
                "newInstance(...)";
                objM15225.getClass();
                C9921 c9921M152314 = C9921.m15231(objM15225.getClass());
                c9921M152314.m15234(String.class, String.class, cls, String.class);
                c9921M152314.f25828 = AbstractC9919.m15228("com.tenpay.sdk.basebl.DecytBean");
                c9921M152314.f25826 = "decypt";
                String str7 = (String) C9915.m15222(String.class, "decryptStr", c9921M152314.m15235(objM15225, currentUin, "hb_pre_grap", Integer.valueOf(c9572.f24982), str6));
                str7.getClass();
                c9572.f24988.complete(str7);
                return null;
            default:
                ((Boolean) objArr[1]).getClass();
                Object objM12404 = AbstractC7162.m12404(AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]), "mergeFrom", new Class[]{byte[].class}, ((Bundle) objArr[2]).getByteArray("rsp_bytes"));
                String str8 = (String) AbstractC7162.m12405(String.class, "get", AbstractC7165.m12419(objM12404.getClass(), "rspText").get(objM12404));
                C6759 c6759 = ((C9634) obj3).f25123;
                String currentUin2 = QQEnvTool.getCurrentUin();
                Object objM6845 = AbstractC3738.m6845(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, AbstractC7166.m12425("com.tenpay.sdk.basebl.EncryptRequest"));
                C7164 c7164M12413 = C7164.m12413(objM6845.getClass());
                c7164M12413.f17803.f3964 = new Class[]{String.class, String.class, cls, String.class};
                c7164M12413.f17803.f3962 = AbstractC7166.m12425("com.tenpay.sdk.basebl.DecytBean");
                c7164M12413.f17803.f3963 = "decypt";
                c6759.m11876((String) AbstractC7165.m12418(String.class, "decryptStr", c7164M12413.m12415(objM6845, currentUin2, "hb_pre_grap", Integer.valueOf(C9634.f25122), str8)));
                return null;
        }
    }
}
