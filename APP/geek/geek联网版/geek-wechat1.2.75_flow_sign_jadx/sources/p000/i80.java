package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
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

/* JADX INFO: loaded from: classes.dex */
public class i80 extends AbstractC0387ju {

    /* JADX INFO: renamed from: j */
    public static Class f2345j;

    /* JADX INFO: renamed from: k */
    public static Constructor f2346k;

    /* JADX INFO: renamed from: l */
    public static Method f2347l;

    /* JADX INFO: renamed from: m */
    public static Method f2348m;

    /* JADX INFO: renamed from: n */
    public static boolean f2349n;

    /* JADX INFO: renamed from: c */
    public final Class f2350c;

    /* JADX INFO: renamed from: d */
    public final Constructor f2351d;

    /* JADX INFO: renamed from: e */
    public final Method f2352e;

    /* JADX INFO: renamed from: f */
    public final Method f2353f;

    /* JADX INFO: renamed from: g */
    public final Method f2354g;

    /* JADX INFO: renamed from: h */
    public final Method f2355h;

    /* JADX INFO: renamed from: i */
    public final Method f2356i;

    public i80() throws NoSuchMethodException {
        Method methodMo1485E;
        Constructor<?> constructor;
        Method methodM1481D;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM1481D = m1481D(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo1485E = mo1485E(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo1485E = null;
            constructor = null;
            methodM1481D = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f2350c = cls;
        this.f2351d = constructor;
        this.f2352e = methodM1481D;
        this.f2353f = method;
        this.f2354g = method2;
        this.f2355h = method3;
        this.f2356i = methodMo1485E;
    }

    /* JADX INFO: renamed from: C */
    public static void m1480C() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2349n) {
            return;
        }
        f2349n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f2346k = constructor;
        f2345j = cls;
        f2347l = method2;
        f2348m = method;
    }

    /* JADX INFO: renamed from: D */
    public static Method m1481D(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m1482z(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m1480C();
        try {
            return ((Boolean) f2347l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public Typeface mo1483A(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2350c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2356i.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m1484B(Object obj) {
        try {
            return ((Boolean) this.f2354g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: E */
    public Method mo1485E(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: g */
    public final Typeface mo1486g(Context context, C0228fl c0228fl, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f2352e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f2351d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                C0265gl[] c0265glArr = c0228fl.f1805a;
                int length = c0265glArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        C0265gl c0265gl = c0265glArr[i2];
                        Context context2 = context;
                        if (m1489y(context2, objNewInstance, c0265gl.f2022a, c0265gl.f2026e, c0265gl.f2023b, c0265gl.f2024c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0265gl.f2025d))) {
                            i2++;
                            context = context2;
                        } else {
                            try {
                                this.f2355h.invoke(objNewInstance, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (m1484B(objNewInstance)) {
                        return mo1483A(objNewInstance);
                    }
                }
            }
            return null;
        }
        m1480C();
        try {
            Object objNewInstance2 = f2346k.newInstance(null);
            for (C0265gl c0265gl2 : c0228fl.f1805a) {
                File fileM1897p = AbstractC0498mu.m1897p(context);
                if (fileM1897p == null) {
                    return null;
                }
                try {
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    fileM1897p.delete();
                    throw th;
                }
                if (!AbstractC0498mu.m1892k(fileM1897p, resources, c0265gl2.f2027f) || !m1482z(objNewInstance2, fileM1897p.getPath(), c0265gl2.f2023b, c0265gl2.f2024c)) {
                    fileM1897p.delete();
                    return null;
                }
                fileM1897p.delete();
            }
            m1480C();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) f2345j, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) f2348m.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: h */
    public final Typeface mo1487h(Context context, C0338il[] c0338ilArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo1483A;
        boolean zBooleanValue;
        if (c0338ilArr.length >= 1) {
            Method method = this.f2352e;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C0338il c0338il : c0338ilArr) {
                        if (c0338il.f2552e == 0) {
                            Uri uri = c0338il.f2548a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC0498mu.m1901v(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f2351d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c0338ilArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f2355h;
                            if (i2 < length) {
                                C0338il c0338il2 = c0338ilArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0338il2.f2548a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f2353f.invoke(objNewInstance, byteBuffer, Integer.valueOf(c0338il2.f2549b), null, Integer.valueOf(c0338il2.f2550c), Integer.valueOf(c0338il2.f2551d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (m1484B(objNewInstance) && (typefaceMo1483A = mo1483A(objNewInstance)) != null) {
                                return Typeface.create(typefaceMo1483A, i);
                            }
                        }
                    }
                } else {
                    C0338il c0338ilMo1634l = mo1634l(i, c0338ilArr);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0338ilMo1634l.f2548a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0338ilMo1634l.f2550c).setItalic(c0338ilMo1634l.f2551d).build();
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

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: i */
    public final Typeface mo1488i(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f2352e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo1488i(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.f2351d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m1489y(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f2355h.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m1484B(objNewInstance)) {
                return mo1483A(objNewInstance);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1489y(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2352e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
