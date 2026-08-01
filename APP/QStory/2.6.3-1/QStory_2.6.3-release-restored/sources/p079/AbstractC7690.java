package p079;

import androidx.appcompat.app.C0955;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: renamed from: 飘花落叶言世子苏楪兰哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7690 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0955 f18648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0955 f18649;

    static {
        Object obj = null;
        f18649 = new C0955(obj, obj, obj, 22);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12646(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        C0955 c0955 = f18648;
        C0955 c09552 = f18649;
        if (c0955 == null) {
            try {
                C0955 c09553 = new C0955(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 22);
                f18648 = c09553;
                c0955 = c09553;
            } catch (Exception unused) {
                f18648 = c09552;
                c0955 = c09552;
            }
        }
        if (c0955 == c09552 || (method = (Method) c0955.f664) == null || (objInvoke = method.invoke(baseContinuationImpl.getClass(), null)) == null || (method2 = (Method) c0955.f665) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = (Method) c0955.f663;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
