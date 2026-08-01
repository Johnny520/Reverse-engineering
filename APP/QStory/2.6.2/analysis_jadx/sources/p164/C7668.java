package p164;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7668 extends C7661 {
    @Override // p164.C7661
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final Typeface mo12899(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20800, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20803.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C5919.m11252(e);
            return null;
        }
    }

    @Override // p164.C7661
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final Method mo12902(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
