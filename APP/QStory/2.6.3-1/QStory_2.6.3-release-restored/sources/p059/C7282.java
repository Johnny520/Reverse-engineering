package p059;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p354.C9636;
import top.suzhelan.qstory.hook.item.C6759;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7282 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f18031;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f18032;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f18033;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f18034;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18035;

    public /* synthetic */ C7282(Object obj, Class cls, Object obj2, Object obj3, int i) {
        this.f18035 = i;
        this.f18031 = obj;
        this.f18033 = cls;
        this.f18034 = obj2;
        this.f18032 = obj3;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException {
        int i = this.f18035;
        Object obj2 = this.f18032;
        Class cls = this.f18033;
        Object obj3 = this.f18031;
        switch (i) {
            case 0:
                AbstractC7014.m12151("请求状态  : " + ((Boolean) objArr[1]).booleanValue());
                Object objM12404 = AbstractC7162.m12404(AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]), "mergeFrom", new Class[]{byte[].class}, ((Bundle) objArr[2]).getByteArray("rsp_bytes"));
                String str = (String) AbstractC7162.m12405(String.class, "toStringUtf8", AbstractC7162.m12405(cls, "get", AbstractC7165.m12419(objM12404.getClass(), "rspBody").get(objM12404)));
                Class clsM12425 = AbstractC7166.m12425("com.tenpay.sdk.net.core.comm.SessionKey");
                Class clsM124252 = AbstractC7166.m12425("com.tenpay.sdk.net.core.statistic.StatisticInfo");
                Class clsM124253 = AbstractC7166.m12425("com.tenpay.sdk.net.core.encrypt.EncryptResult");
                Class clsM124254 = AbstractC7166.m12425("com.tenpay.sdk.net.core.encrypt.DecryptResult");
                Object objM12405 = AbstractC7162.m12405(clsM124253, "getEncryptResult", obj2);
                Object obj4 = ((RunnableC7281) obj3).f18030;
                String strM14531 = "processDecrypt";
                Class cls2 = Boolean.TYPE;
                Boolean bool = Boolean.TRUE;
                Object objM12406 = AbstractC7162.m12406(obj4, strM14531, clsM124254, new Class[]{cls2, cls2, clsM12425, clsM124253, clsM124252, String.class}, bool, bool, this.f18034, objM12405, null, str);
                if (objM12406 != null) {
                    String str2 = (String) AbstractC7162.m12405(String.class, "getDecodedPlain", objM12406);
                    AbstractC7017.m12163(str2, "hb");
                    JSONObject object = JSONObject.parseObject(str2);
                    if (object.getIntValue("retcode") == 0) {
                        AbstractC7017.m12163(object, "hb");
                    }
                    break;
                }
                break;
            default:
                C9636 c9636 = (C9636) obj3;
                Object objM124042 = AbstractC7162.m12404(AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]), "mergeFrom", new Class[]{byte[].class}, ((Bundle) objArr[2]).getByteArray("rsp_bytes"));
                String str3 = (String) AbstractC7162.m12405(String.class, "toStringUtf8", AbstractC7162.m12405(cls, "get", AbstractC7165.m12419(objM124042.getClass(), "rspBody").get(objM124042)));
                Class clsM124255 = AbstractC7166.m12425("com.tenpay.sdk.net.core.comm.SessionKey");
                Class clsM124256 = AbstractC7166.m12425("com.tenpay.sdk.net.core.statistic.StatisticInfo");
                Class clsM124257 = AbstractC7166.m12425("com.tenpay.sdk.net.core.encrypt.EncryptResult");
                Class clsM124258 = AbstractC7166.m12425("com.tenpay.sdk.net.core.encrypt.DecryptResult");
                Object objM124052 = AbstractC7162.m12405(clsM124257, "getEncryptResult", obj2);
                Object obj5 = c9636.f25135;
                String strM145312 = "processDecrypt";
                Class cls3 = Boolean.TYPE;
                Boolean bool2 = Boolean.TRUE;
                Object objM124062 = AbstractC7162.m12406(obj5, strM145312, clsM124258, new Class[]{cls3, cls3, clsM124255, clsM124257, clsM124256, String.class}, bool2, bool2, this.f18034, objM124052, null, str3);
                if (objM124062 != null) {
                    String str4 = (String) AbstractC7162.m12405(String.class, "getDecodedPlain", objM124062);
                    if (JSONObject.parseObject(str4).getIntValue("retcode", -1) == 0 && !TextUtils.isEmpty(str4)) {
                        C6759 c6759 = c9636.f25138;
                        "领取成功";
                        c6759.m11876(str4);
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
