package p085v;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000A.C0011l;
import p056f0.AbstractC0805P;
import p083u.C1087f;
import p083u.C1088g;

/* JADX INFO: renamed from: v.h */
/* JADX INFO: loaded from: classes.dex */
public class C1107h extends AbstractC0805P {

    /* JADX INFO: renamed from: i */
    public static Class f4258i = null;

    /* JADX INFO: renamed from: j */
    public static Constructor f4259j = null;

    /* JADX INFO: renamed from: k */
    public static Method f4260k = null;

    /* JADX INFO: renamed from: l */
    public static Method f4261l = null;

    /* JADX INFO: renamed from: m */
    public static boolean f4262m = false;

    /* JADX INFO: renamed from: b */
    public final Class f4263b;

    /* JADX INFO: renamed from: c */
    public final Constructor f4264c;

    /* JADX INFO: renamed from: d */
    public final Method f4265d;

    /* JADX INFO: renamed from: e */
    public final Method f4266e;

    /* JADX INFO: renamed from: f */
    public final Method f4267f;

    /* JADX INFO: renamed from: g */
    public final Method f4268g;

    /* JADX INFO: renamed from: h */
    public final Method f4269h;

    public C1107h() throws NoSuchMethodException {
        Method methodMo2615h0;
        Constructor<?> constructor;
        Method methodM2608g0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM2608g0 = m2608g0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo2615h0 = mo2615h0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo2615h0 = null;
            constructor = null;
            methodM2608g0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f4263b = cls;
        this.f4264c = constructor;
        this.f4265d = methodM2608g0;
        this.f4266e = method;
        this.f4267f = method2;
        this.f4268g = method3;
        this.f4269h = methodMo2615h0;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m2606a0(Object obj, String str, int i2, boolean z2) throws NoSuchMethodException {
        m2607e0();
        try {
            return ((Boolean) f4260k.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m2607e0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f4262m) {
            return;
        }
        f4262m = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f4259j = constructor;
        f4258i = cls;
        f4260k = method2;
        f4261l = method;
    }

    /* JADX INFO: renamed from: g0 */
    public static Method m2608g0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: Y */
    public final void m2609Y(Object obj) {
        try {
            this.f4268g.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m2610Z(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4265d.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public Typeface mo2611b0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f4263b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f4269h.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final Typeface m2612c0(Context context, C1087f c1087f, Resources resources, int i2) throws NoSuchMethodException {
        m2607e0();
        try {
            Object objNewInstance = f4259j.newInstance(null);
            for (C1088g c1088g : c1087f.f4194a) {
                File fileM2030C = AbstractC0805P.m2030C(context);
                if (fileM2030C == null) {
                    return null;
                }
                try {
                    if (!AbstractC0805P.m2045h(fileM2030C, resources, c1088g.f4200f)) {
                        return null;
                    }
                    if (!m2606a0(objNewInstance, fileM2030C.getPath(), c1088g.f4196b, c1088g.f4197c)) {
                        return null;
                    }
                    fileM2030C.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM2030C.delete();
                }
            }
            m2607e0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f4258i, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f4261l.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m2613d0(Object obj) {
        try {
            return ((Boolean) this.f4267f.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m2614f0() {
        try {
            return this.f4264c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public Method mo2615h0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: j */
    public final Typeface mo2070j(Context context, C1087f c1087f, Resources resources, int i2) {
        if (this.f4265d == null) {
            return m2612c0(context, c1087f, resources, i2);
        }
        Object objM2614f0 = m2614f0();
        if (objM2614f0 == null) {
            return null;
        }
        for (C1088g c1088g : c1087f.f4194a) {
            if (!m2610Z(context, objM2614f0, c1088g.f4195a, c1088g.f4199e, c1088g.f4196b, c1088g.f4197c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1088g.f4198d))) {
                m2609Y(objM2614f0);
                return null;
            }
        }
        if (m2613d0(objM2614f0)) {
            return mo2611b0(objM2614f0);
        }
        return null;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: k */
    public final Typeface mo2071k(Context context, C0011l[] c0011lArr, int i2) {
        Typeface typefaceMo2611b0;
        boolean zBooleanValue;
        if (c0011lArr.length < 1) {
            return null;
        }
        if (this.f4265d == null) {
            C0011l c0011lMo2073m = mo2073m(i2, c0011lArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0011lMo2073m.f30a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0011lMo2073m.f32c).setItalic(c0011lMo2073m.f33d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C0011l c0011l : c0011lArr) {
            if (c0011l.f34e == 0) {
                Uri uri = c0011l.f30a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC0805P.m2035K(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM2614f0 = m2614f0();
        if (objM2614f0 == null) {
            return null;
        }
        int length = c0011lArr.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            C0011l c0011l2 = c0011lArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0011l2.f30a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f4266e.invoke(objM2614f0, byteBuffer, Integer.valueOf(c0011l2.f31b), null, Integer.valueOf(c0011l2.f32c), Integer.valueOf(c0011l2.f33d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m2609Y(objM2614f0);
                    return null;
                }
                z2 = true;
            }
            i3++;
            z2 = z2;
        }
        if (!z2) {
            m2609Y(objM2614f0);
            return null;
        }
        if (m2613d0(objM2614f0) && (typefaceMo2611b0 = mo2611b0(objM2614f0)) != null) {
            return Typeface.create(typefaceMo2611b0, i2);
        }
        return null;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: l */
    public final Typeface mo2072l(Context context, Resources resources, int i2, String str, int i3) {
        if (this.f4265d == null) {
            return super.mo2072l(context, resources, i2, str, i3);
        }
        Object objM2614f0 = m2614f0();
        if (objM2614f0 == null) {
            return null;
        }
        if (!m2610Z(context, objM2614f0, str, 0, -1, -1, null)) {
            m2609Y(objM2614f0);
            return null;
        }
        if (m2613d0(objM2614f0)) {
            return mo2611b0(objM2614f0);
        }
        return null;
    }
}
