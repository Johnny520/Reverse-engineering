package p164;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7669 extends C7662 {
    @Override // p164.C7662
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final Method mo12928(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p164.C7662
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final Typeface mo12929(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20799, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20796.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C5925.m11313(e);
            return null;
        }
    }
}
