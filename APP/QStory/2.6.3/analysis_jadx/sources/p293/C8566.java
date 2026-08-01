package p293;

import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8566 implements BiFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Executable f23910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23911;

    public /* synthetic */ C8566(Executable executable, int i) {
        this.f23911 = i;
        this.f23910 = executable;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f23911;
        Executable executable = this.f23910;
        Object objInvoke = null;
        switch (i) {
            case 0:
                try {
                    return ((Constructor) executable).newInstance(obj, obj2);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    C0276.m843("invoke error", e);
                    return null;
                }
            default:
                Method method = (Method) executable;
                try {
                    objInvoke = Modifier.isStatic(method.getModifiers()) ? method.invoke(null, obj, obj2) : method.invoke(obj, obj2);
                    break;
                } catch (IllegalAccessException e2) {
                    e = e2;
                    C0276.m843("invoke error", e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    C0276.m843("invoke error", e);
                }
                return objInvoke;
        }
    }
}
