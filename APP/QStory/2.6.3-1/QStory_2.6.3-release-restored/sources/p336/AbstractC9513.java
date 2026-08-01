package p336;

import bsh.C3494;
import com.alibaba.fastjson2.AbstractC3738;
import java.lang.reflect.Proxy;
import lin.xposed.hook.util.p011qq.QQServiceTool;
import p026.AbstractC7017;
import p049.AbstractC7165;
import p049.AbstractC7166;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9513 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m14964() {
        try {
            return QQServiceTool.getMsgServiceOfKernel();
        } catch (Exception e) {
            String str = "getKernelMsgService error: " + e.getMessage();
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(str, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14965(int i, Object obj) {
        Object[] objArr = new Object[0];
        Object objM6845 = AbstractC3738.m6845(objArr, new Class[0], AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.MsgsReq"));
        AbstractC7165.m12424(objM6845, "peer", obj);
        AbstractC7165.m12424(objM6845, "cnt", Integer.valueOf(i));
        AbstractC7165.m12424(objM6845, "byType", 1);
        String strM14531 = "queryOrder";
        Boolean bool = Boolean.TRUE;
        AbstractC7165.m12424(objM6845, strM14531, bool);
        AbstractC7165.m12424(objM6845, "includeSelf", bool);
        AbstractC7165.m12424(objM6845, "includeDeleteMsg", Boolean.FALSE);
        return objM6845;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m14966(C9514 c9514) {
        Class clsM12425 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IMsgsRspOperateCallback");
        Object objNewProxyInstance = Proxy.newProxyInstance(clsM12425.getClassLoader(), new Class[]{clsM12425}, new C3494(c9514, 2));
        "newProxyInstance(...)";
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }
}
