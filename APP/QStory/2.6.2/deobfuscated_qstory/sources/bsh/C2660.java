package bsh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQMsgService;
import p000.AbstractC6087;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p322.C8725;
import p322.C8727;
import p337.C8807;
import p350.C8867;
import p392.AbstractC9121;
import p392.C9117;
import p392.C9119;
import p392.C9125;
import top.suzhelan.qstory.hook.item.C5923;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2660 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7967;

    public /* synthetic */ C2660(Object obj, int i) {
        this.f7967 = i;
        this.f7966 = obj;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v16 int, still in use, count: 1, list:
  (r4v16 int) from 0x00bc: INVOKE (r0v23 飘花落叶言苏哲子楪世兰.飘花落叶言子楪世苏兰哲), (r4v16 int), (r2v72 java.lang.String), (r1v50 java.util.ArrayList) VIRTUAL call: 飘花落叶言苏哲子楪世兰.飘花落叶言子楪世苏兰哲.飘花落叶言子楪世苏哲兰(int, java.lang.String, java.util.ArrayList):void A[MD:(int, java.lang.String, java.util.ArrayList):void (m), REMOVE] (LINE:189)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
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
        int i = this.f7967;
        Class cls = Integer.TYPE;
        Object obj3 = this.f7966;
        switch (i) {
            case 0:
                AbstractC2650 abstractC2650 = (AbstractC2650) obj3;
                abstractC2650.getClass();
                if (method.getDeclaringClass() == Object.class) {
                    String name = method.getName();
                    name.getClass();
                    switch (name) {
                        case "toString":
                            return "BshLambdaProxy[" + abstractC2650 + "]";
                        case "equals":
                            return Boolean.valueOf(objArr != null && objArr.length == 1 && obj == objArr[0]);
                        case "hashCode":
                            return Integer.valueOf(System.identityHashCode(obj));
                    }
                }
                return abstractC2650.invoke(objArr != null ? objArr : AbstractC2666.f8000, method.getExceptionTypes(), method.getReturnType());
            case 1:
                return QQMsgService.lambda$getMsgsByMsgId$1((QQMsgService.IMsgOperateCallback) obj3, obj, method, objArr);
            case 2:
                C8727 c8727 = (C8727) obj3;
                "<unused var>";
                method.getClass();
                "args";
                objArr.getClass();
                Object obj4 = objArr[2];
                "null cannot be cast to non-null type android.os.Bundle";
                obj4.getClass();
                byte[] byteArray = ((Bundle) obj4).getByteArray("rsp_bytes");
                byteArray.getClass();
                Object objM14655 = C9119.m14655(AbstractC9121.m14657("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]);
                "newInstance(...)";
                objM14655.getClass();
                int i2 = C9125.f25503;
                C9125 c9125M14680 = C9125.m14680(objM14655.getClass());
                c9125M14680.f25504 = "mergeFrom";
                c9125M14680.m14683(byte[].class);
                Object objM14684 = c9125M14680.m14684(objM14655, byteArray);
                "invokeFirst(...)";
                objM14684.getClass();
                int i3 = C9117.f25488;
                C9117 c9117M14648 = C9117.m14648(objM14684.getClass());
                c9117M14648.f25490 = "retMsg";
                Object objM14653 = c9117M14648.m14653(objM14684);
                C9125 c9125M14679 = C9125.m14679(objM14653);
                c9125M14679.f25504 = "get";
                c9125M14679.f25506 = String.class;
                String str = (String) c9125M14679.m14684(objM14653, new Object[0]);
                C9117 c9117M146482 = C9117.m14648(objM14684.getClass());
                c9117M146482.f25490 = "retCode";
                Object objM146532 = c9117M146482.m14653(objM14684);
                C9125 c9125M146792 = C9125.m14679(objM146532);
                c9125M146792.f25506 = null;
                c9125M146792.f25504 = "get";
                String str2 = (String) c9125M146792.m14684(objM146532, new Object[0]);
                C9117 c9117M146483 = C9117.m14648(objM14684.getClass());
                c9117M146483.f25490 = "rspBody";
                Object objM146533 = c9117M146483.m14653(objM14684);
                C9125 c9125M146793 = C9125.m14679(objM146533);
                c9125M146793.f25504 = "get";
                Object objM146842 = c9125M146793.m14684(objM146533, new Object[0]);
                objM146842.getClass();
                String str3 = (String) AbstractC5061.m10031(objM146842, "toStringUtf8", new Object[0]);
                str.getClass();
                str2.getClass();
                Object obj5 = c8727.f24609;
                if (obj5 == null) {
                    AbstractC4394.m8918("sessionKey");
                    throw null;
                }
                Object obj6 = c8727.f24610;
                if (obj6 == null) {
                    AbstractC4394.m8918("processEncrypt");
                    throw null;
                }
                Class clsM14657 = AbstractC9121.m14657("com.tenpay.sdk.net.core.comm.SessionKey");
                Class clsM146572 = AbstractC9121.m14657("com.tenpay.sdk.net.core.statistic.StatisticInfo");
                Class clsM146573 = AbstractC9121.m14657("com.tenpay.sdk.net.core.encrypt.EncryptResult");
                Class clsM146574 = AbstractC9121.m14657("com.tenpay.sdk.net.core.encrypt.DecryptResult");
                C9125 c9125M146802 = C9125.m14680(obj6.getClass());
                c9125M146802.f25504 = "getEncryptResult";
                c9125M146802.f25506 = clsM146573;
                Object objM146843 = c9125M146802.m14684(obj6, new Object[0]);
                Object obj7 = c8727.f24612;
                C9125 c9125M146794 = C9125.m14679(obj7);
                c9125M146794.f25504 = "processDecrypt";
                c9125M146794.f25506 = clsM146574;
                Class cls2 = Boolean.TYPE;
                c9125M146794.m14683(cls2, cls2, clsM14657, clsM146573, clsM146572, String.class);
                Boolean bool = Boolean.TRUE;
                Object objM146844 = c9125M146794.m14684(obj7, bool, bool, obj5, objM146843, null, str3);
                C9125 c9125M146795 = C9125.m14679(objM146844);
                c9125M146795.f25504 = "getDecodedPlain";
                c9125M146795.f25506 = String.class;
                String str4 = (String) c9125M146795.m14684(objM146844, new Object[0]);
                if (JSONObject.parseObject(str4).getIntValue("retcode", -1) == 0 && !TextUtils.isEmpty(str4)) {
                    c8727.f24606.complete(str4);
                }
                return null;
            case 3:
                C8725 c8725 = (C8725) obj3;
                "<unused var>";
                method.getClass();
                "args";
                objArr.getClass();
                Object obj8 = objArr[2];
                "null cannot be cast to non-null type android.os.Bundle";
                obj8.getClass();
                byte[] byteArray2 = ((Bundle) obj8).getByteArray("rsp_bytes");
                byteArray2.getClass();
                Object objM146552 = C9119.m14655(AbstractC9121.m14657("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]);
                "newInstance(...)";
                objM146552.getClass();
                int i4 = C9125.f25503;
                C9125 c9125M146803 = C9125.m14680(objM146552.getClass());
                c9125M146803.f25504 = "mergeFrom";
                c9125M146803.m14683(byte[].class);
                Object objM146845 = c9125M146803.m14684(objM146552, byteArray2);
                "invokeFirst(...)";
                objM146845.getClass();
                int i5 = C9117.f25488;
                C9117 c9117M146484 = C9117.m14648(objM146845.getClass());
                c9117M146484.f25490 = "retMsg";
                Object objM146534 = c9117M146484.m14653(objM146845);
                C9125 c9125M146796 = C9125.m14679(objM146534);
                c9125M146796.f25504 = "get";
                c9125M146796.f25506 = String.class;
                c9125M146796.m14684(objM146534, new Object[0]);
                C9117 c9117M146485 = C9117.m14648(objM146845.getClass());
                c9117M146485.f25490 = "retCode";
                Object objM146535 = c9117M146485.m14653(objM146845);
                C9125 c9125M146797 = C9125.m14679(objM146535);
                c9125M146797.f25506 = null;
                c9125M146797.f25504 = "get";
                c9125M146797.m14684(objM146535, new Object[0]);
                C9117 c9117M146486 = C9117.m14648(objM146845.getClass());
                c9117M146486.f25490 = "rspText";
                Object objM146536 = c9117M146486.m14653(objM146845);
                C9125 c9125M146798 = C9125.m14679(objM146536);
                c9125M146798.f25506 = String.class;
                c9125M146798.f25504 = "get";
                String str5 = (String) c9125M146798.m14684(objM146536, new Object[0]);
                str5.getClass();
                String currentUin = QQEnvTool.getCurrentUin();
                Object objM14654 = C9119.m14654(new Object[]{AbstractC6340.f17460}, new Class[]{Context.class}, AbstractC9121.m14657("com.tenpay.sdk.basebl.EncryptRequest"));
                "newInstance(...)";
                objM14654.getClass();
                C9125 c9125M146804 = C9125.m14680(objM14654.getClass());
                c9125M146804.m14683(String.class, String.class, cls, String.class);
                c9125M146804.f25506 = AbstractC9121.m14657("com.tenpay.sdk.basebl.DecytBean");
                c9125M146804.f25504 = "decypt";
                String str6 = (String) C9117.m14649(String.class, "decryptStr", c9125M146804.m14684(objM14654, currentUin, "hb_pre_grap", Integer.valueOf(c8725.f24591), str5));
                str6.getClass();
                c8725.f24597.complete(str6);
                return null;
            case 4:
                ((Boolean) objArr[1]).getClass();
                Object objM11817 = AbstractC6314.m11817(AbstractC6087.m11392(AbstractC6318.m11838("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]), "mergeFrom", new Class[]{byte[].class}, ((Bundle) objArr[2]).getByteArray("rsp_bytes"));
                String str7 = (String) AbstractC6314.m11818(String.class, "get", AbstractC6317.m11832(objM11817.getClass(), "rspText").get(objM11817));
                C5923 c5923 = ((C8807) obj3).f24780;
                String currentUin2 = QQEnvTool.getCurrentUin();
                Object objM11389 = AbstractC6087.m11389(new Object[]{AbstractC6340.f17460}, new Class[]{Context.class}, AbstractC6318.m11838("com.tenpay.sdk.basebl.EncryptRequest"));
                C6316 c6316M11826 = C6316.m11826(objM11389.getClass());
                c6316M11826.f17409.f3618 = new Class[]{String.class, String.class, cls, String.class};
                c6316M11826.f17409.f3616 = AbstractC6318.m11838("com.tenpay.sdk.basebl.DecytBean");
                c6316M11826.f17409.f3617 = "decypt";
                c5923.m11258((String) AbstractC6317.m11831(String.class, "decryptStr", c6316M11826.m11828(objM11389, currentUin2, "hb_pre_grap", Integer.valueOf(C8807.f24779), str7)));
                return null;
            default:
                C8867 c8867 = (C8867) obj3;
                if (AbstractC4394.m8917(method.getName(), "onResult") && objArr != null && objArr.length >= 1 && (obj2 = objArr[0]) != null) {
                    String strM6668 = (String) AbstractC6317.m11831(String.class, "errMsg", obj2);
                    if (strM6668 == null) {
                        strM6668 = "";
                    }
                    ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "msgList", obj2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    c8867.m14515(r4, strM6668, arrayList);
                }
                return null;
        }
    }
}
