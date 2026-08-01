package p180;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8498 extends C8491 {
    @Override // p180.C8491
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final Method mo13487(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p180.C8491
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final Typeface mo13488(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f21144, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f21141.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            C6755.m11872(e);
            return null;
        }
    }
}
