package p000;

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

/* JADX INFO: renamed from: VB */
/* JADX INFO: loaded from: classes.dex */
public final class C0914VB extends AbstractC1293cr {

    /* JADX INFO: renamed from: m */
    public static Class f2843m = null;

    /* JADX INFO: renamed from: n */
    public static Constructor f2844n = null;

    /* JADX INFO: renamed from: o */
    public static Method f2845o = null;

    /* JADX INFO: renamed from: p */
    public static Method f2846p = null;

    /* JADX INFO: renamed from: q */
    public static boolean f2847q = false;

    /* JADX INFO: renamed from: f */
    public final Class f2848f;

    /* JADX INFO: renamed from: g */
    public final Constructor f2849g;

    /* JADX INFO: renamed from: h */
    public final Method f2850h;

    /* JADX INFO: renamed from: i */
    public final Method f2851i;

    /* JADX INFO: renamed from: j */
    public final Method f2852j;

    /* JADX INFO: renamed from: k */
    public final Method f2853k;

    /* JADX INFO: renamed from: l */
    public final Method f2854l;

    public C0914VB() throws NoSuchMethodException {
        Method methodM1761d0;
        Constructor<?> constructor;
        Method methodM1757c0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM1757c0 = m1757c0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodM1761d0 = m1761d0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodM1761d0 = null;
            constructor = null;
            methodM1757c0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f2848f = cls;
        this.f2849g = constructor;
        this.f2850h = methodM1757c0;
        this.f2851i = method;
        this.f2852j = method2;
        this.f2853k = method3;
        this.f2854l = methodM1761d0;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m1755Y(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m1756b0();
        try {
            return ((Boolean) f2845o.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1756b0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2847q) {
            return;
        }
        f2847q = true;
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
        f2844n = constructor;
        f2843m = cls;
        f2845o = method2;
        f2846p = method;
    }

    /* JADX INFO: renamed from: c0 */
    public static Method m1757c0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m1758X(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2850h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final Typeface m1759Z(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2848f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2854l.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m1760a0(Object obj) {
        try {
            return ((Boolean) this.f2852j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final Method m1761d0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: q */
    public final Typeface mo1762q(Context context, C0926Vh c0926Vh, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f2850h != null) {
            try {
                objNewInstance = this.f2849g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                C0969Wh[] c0969WhArr = c0926Vh.f2889a;
                int length = c0969WhArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        C0969Wh c0969Wh = c0969WhArr[i2];
                        Context context2 = context;
                        if (m1758X(context2, objNewInstance, c0969Wh.f3019a, c0969Wh.f3023e, c0969Wh.f3020b, c0969Wh.f3021c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0969Wh.f3022d))) {
                            i2++;
                            context = context2;
                        } else {
                            try {
                                this.f2853k.invoke(objNewInstance, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (m1760a0(objNewInstance)) {
                        return m1759Z(objNewInstance);
                    }
                }
            }
            return null;
        }
        m1756b0();
        try {
            Object objNewInstance2 = f2844n.newInstance(null);
            for (C0969Wh c0969Wh2 : c0926Vh.f2889a) {
                File fileM626s = AbstractC0295Gu.m626s(context);
                if (fileM626s == null) {
                    return null;
                }
                try {
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    fileM626s.delete();
                    throw th;
                }
                if (!AbstractC0295Gu.m614g(fileM626s, resources, c0969Wh2.f3024f) || !m1755Y(objNewInstance2, fileM626s.getPath(), c0969Wh2.f3020b, c0969Wh2.f3021c)) {
                    fileM626s.delete();
                    return null;
                }
                fileM626s.delete();
            }
            m1756b0();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) f2843m, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) f2846p.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: r */
    public final Typeface mo1763r(Context context, C1098Zh[] c1098ZhArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceM1759Z;
        boolean zBooleanValue;
        if (c1098ZhArr.length >= 1) {
            try {
                if (this.f2850h != null) {
                    HashMap map = new HashMap();
                    for (C1098Zh c1098Zh : c1098ZhArr) {
                        if (c1098Zh.f3490f == 0) {
                            Uri uri = c1098Zh.f3485a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC0295Gu.m630w(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f2849g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c1098ZhArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method = this.f2853k;
                            if (i2 < length) {
                                C1098Zh c1098Zh2 = c1098ZhArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c1098Zh2.f3485a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f2851i.invoke(objNewInstance, byteBuffer, Integer.valueOf(c1098Zh2.f3486b), null, Integer.valueOf(c1098Zh2.f3487c), Integer.valueOf(c1098Zh2.f3488d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method.invoke(objNewInstance, null);
                            } else if (m1760a0(objNewInstance) && (typefaceM1759Z = m1759Z(objNewInstance)) != null) {
                                return Typeface.create(typefaceM1759Z, i);
                            }
                        }
                    }
                } else {
                    C1098Zh c1098ZhMo1832w = mo1832w(c1098ZhArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c1098ZhMo1832w.f3485a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c1098ZhMo1832w.f3487c).setItalic(c1098ZhMo1832w.f3488d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: t */
    public final Typeface mo1764t(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f2850h == null) {
            return super.mo1764t(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.f2849g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m1758X(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f2853k.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m1760a0(objNewInstance)) {
                return m1759Z(objNewInstance);
            }
        }
        return null;
    }
}
