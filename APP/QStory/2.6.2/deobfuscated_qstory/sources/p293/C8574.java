package p293;

import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8574 implements BiFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Executable f23919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23920;

    public /* synthetic */ C8574(Executable executable, int i) {
        this.f23920 = i;
        this.f23919 = executable;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f23920;
        Executable executable = this.f23919;
        Object objInvoke = null;
        switch (i) {
            case 0:
                try {
                    return ((Constructor) executable).newInstance(obj, obj2);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    C0276.m842("invoke error", e);
                    return null;
                }
            default:
                Method method = (Method) executable;
                try {
                    objInvoke = Modifier.isStatic(method.getModifiers()) ? method.invoke(null, obj, obj2) : method.invoke(obj, obj2);
                    break;
                } catch (IllegalAccessException e2) {
                    e = e2;
                    C0276.m842("invoke error", e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    C0276.m842("invoke error", e);
                }
                return objInvoke;
        }
    }
}
