package p350;

import bsh.C2660;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Proxy;
import lin.xposed.hook.util.qq.QQServiceTool;
import p000.AbstractC6087;
import p010.AbstractC6157;
import p032.AbstractC6317;
import p032.AbstractC6318;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8866 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m14512() {
        try {
            return QQServiceTool.getMsgServiceOfKernel();
        } catch (Exception e) {
            String str = AbstractC3056.m6668(-3937279980132894119L) + e.getMessage();
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(str, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14513(int i, Object obj) {
        Object[] objArr = new Object[0];
        Object objM11389 = AbstractC6087.m11389(objArr, new Class[0], AbstractC6318.m11838(AbstractC3056.m6668(-3937826441706866087L)));
        AbstractC6317.m11837(objM11389, AbstractC3056.m6668(-3937279859873809831L), obj);
        AbstractC6317.m11837(objM11389, AbstractC3056.m6668(-3937279846988907943L), Integer.valueOf(i));
        AbstractC6317.m11837(objM11389, AbstractC3056.m6668(-3937279761089562023L), 1);
        String strM6668 = AbstractC3056.m6668(-3937279791154333095L);
        Boolean bool = Boolean.TRUE;
        AbstractC6317.m11837(objM11389, strM6668, bool);
        AbstractC6317.m11837(objM11389, AbstractC3056.m6668(-3937279700960019879L), bool);
        AbstractC6317.m11837(objM11389, AbstractC3056.m6668(-3937279718139889063L), Boolean.FALSE);
        return objM11389;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m14514(C8867 c8867) {
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937826235548435879L));
        Object objNewProxyInstance = Proxy.newProxyInstance(clsM11838.getClassLoader(), new Class[]{clsM11838}, new C2660(c8867, 5));
        AbstractC3056.m6668(-3937728482092778919L);
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }
}
