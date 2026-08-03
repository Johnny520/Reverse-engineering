package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@InterfaceC7113(28)
public class C8027 extends C8026 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String f23861 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f23862 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f23863 = "sans-serif";

    @Override // Yue.C8026, Yue.C8024, Yue.C8029
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Typeface mo25352(@InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // Yue.C8026
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Typeface mo25359(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f23854, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f23860.invoke(null, objNewInstance, f23863, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // Yue.C8026
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Method mo25369(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
