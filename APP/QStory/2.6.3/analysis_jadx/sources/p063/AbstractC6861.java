package p063;

import androidx.appcompat.app.C0108;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: renamed from: 飘花落叶言世子苏楪兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6861 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0108 f18303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0108 f18304;

    static {
        Object obj = null;
        f18304 = new C0108(obj, obj, obj, 22);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12087(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        C0108 c0108 = f18303;
        C0108 c01082 = f18304;
        if (c0108 == null) {
            try {
                C0108 c01083 = new C0108(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 22);
                f18303 = c01083;
                c0108 = c01083;
            } catch (Exception unused) {
                f18303 = c01082;
                c0108 = c01082;
            }
        }
        if (c0108 == c01082 || (method = (Method) c0108.f319) == null || (objInvoke = method.invoke(baseContinuationImpl.getClass(), null)) == null || (method2 = (Method) c0108.f320) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = (Method) c0108.f318;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
