package p320;

import bsh.C2661;
import com.alibaba.fastjson2.AbstractC2905;
import java.lang.reflect.Proxy;
import lin.xposed.hook.util.qq.QQServiceTool;
import p010.AbstractC6188;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8684 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m14405() {
        try {
            return QQServiceTool.getMsgServiceOfKernel();
        } catch (Exception e) {
            String str = AbstractC8405.m13972(2811) + e.getMessage();
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(str, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14406(int i, Object obj) {
        Object[] objArr = new Object[0];
        Object objM6285 = AbstractC2905.m6285(objArr, new Class[0], AbstractC6337.m11866(AbstractC8405.m13972(2800)));
        AbstractC6336.m11865(objM6285, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵"), obj);
        AbstractC6336.m11865(objM6285, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜呜喵"), Integer.valueOf(i));
        AbstractC6336.m11865(objM6285, AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵喵~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), 1);
        String strM13972 = AbstractC8405.m13972(2812);
        Boolean bool = Boolean.TRUE;
        AbstractC6336.m11865(objM6285, strM13972, bool);
        AbstractC6336.m11865(objM6285, AbstractC8405.m13972(2813), bool);
        AbstractC6336.m11865(objM6285, AbstractC8405.m13972(2814), Boolean.FALSE);
        return objM6285;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m14407(C8685 c8685) {
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(2801));
        Object objNewProxyInstance = Proxy.newProxyInstance(clsM11866.getClassLoader(), new Class[]{clsM11866}, new C2661(c8685, 2));
        AbstractC8405.m13972(1582);
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }
}
