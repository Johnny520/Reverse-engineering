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
public class c80 extends AbstractC0126ct {

    /* JADX INFO: renamed from: k */
    public static Class f916k;

    /* JADX INFO: renamed from: l */
    public static Constructor f917l;

    /* JADX INFO: renamed from: m */
    public static Method f918m;

    /* JADX INFO: renamed from: n */
    public static Method f919n;

    /* JADX INFO: renamed from: o */
    public static boolean f920o;

    /* JADX INFO: renamed from: d */
    public final Class f921d;

    /* JADX INFO: renamed from: e */
    public final Constructor f922e;

    /* JADX INFO: renamed from: f */
    public final Method f923f;

    /* JADX INFO: renamed from: g */
    public final Method f924g;

    /* JADX INFO: renamed from: h */
    public final Method f925h;

    /* JADX INFO: renamed from: i */
    public final Method f926i;

    /* JADX INFO: renamed from: j */
    public final Method f927j;

    public c80() throws NoSuchMethodException {
        Method methodMo642F;
        Constructor<?> constructor;
        Method methodM639E;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM639E = m639E(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo642F = mo642F(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo642F = null;
            constructor = null;
            methodM639E = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f921d = cls;
        this.f922e = constructor;
        this.f923f = methodM639E;
        this.f924g = method;
        this.f925h = method2;
        this.f926i = method3;
        this.f927j = methodMo642F;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m637A(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m638D();
        try {
            return ((Boolean) f918m.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m638D() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f920o) {
            return;
        }
        f920o = true;
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
        f917l = constructor;
        f916k = cls;
        f918m = method2;
        f919n = method;
    }

    /* JADX INFO: renamed from: E */
    public static Method m639E(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: B */
    public Typeface mo640B(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f921d, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f927j.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m641C(Object obj) {
        try {
            return ((Boolean) this.f925h.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public Method mo642F(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p000.AbstractC0126ct
    /* JADX INFO: renamed from: g */
    public final Typeface mo643g(Context context, C0155dl c0155dl, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f923f;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f922e.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                C0191el[] c0191elArr = c0155dl.f1604a;
                int length = c0191elArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        C0191el c0191el = c0191elArr[i2];
                        Context context2 = context;
                        if (m646z(context2, objNewInstance, c0191el.f1811a, c0191el.f1815e, c0191el.f1812b, c0191el.f1813c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0191el.f1814d))) {
                            i2++;
                            context = context2;
                        } else {
                            try {
                                this.f926i.invoke(objNewInstance, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (m641C(objNewInstance)) {
                        return mo640B(objNewInstance);
                    }
                }
            }
            return null;
        }
        m638D();
        try {
            Object objNewInstance2 = f917l.newInstance(null);
            for (C0191el c0191el2 : c0155dl.f1604a) {
                File fileM1310k = AbstractC0273gt.m1310k(context);
                if (fileM1310k == null) {
                    return null;
                }
                try {
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    fileM1310k.delete();
                    throw th;
                }
                if (!AbstractC0273gt.m1305f(fileM1310k, resources, c0191el2.f1816f) || !m637A(objNewInstance2, fileM1310k.getPath(), c0191el2.f1812b, c0191el2.f1813c)) {
                    fileM1310k.delete();
                    return null;
                }
                fileM1310k.delete();
            }
            m638D();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) f916k, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) f919n.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.AbstractC0126ct
    /* JADX INFO: renamed from: h */
    public final Typeface mo644h(Context context, C0265gl[] c0265glArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo640B;
        boolean zBooleanValue;
        if (c0265glArr.length >= 1) {
            Method method = this.f923f;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C0265gl c0265gl : c0265glArr) {
                        if (c0265gl.f2140e == 0) {
                            Uri uri = c0265gl.f2136a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC0273gt.m1312o(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f922e.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c0265glArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f926i;
                            if (i2 < length) {
                                C0265gl c0265gl2 = c0265glArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0265gl2.f2136a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f924g.invoke(objNewInstance, byteBuffer, Integer.valueOf(c0265gl2.f2137b), null, Integer.valueOf(c0265gl2.f2138c), Integer.valueOf(c0265gl2.f2139d ? 1 : 0))).booleanValue();
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
                            } else if (m641C(objNewInstance) && (typefaceMo640B = mo640B(objNewInstance)) != null) {
                                return Typeface.create(typefaceMo640B, i);
                            }
                        }
                    }
                } else {
                    C0265gl c0265glMo828l = mo828l(i, c0265glArr);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0265glMo828l.f2136a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0265glMo828l.f2138c).setItalic(c0265glMo828l.f2139d).build();
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

    @Override // p000.AbstractC0126ct
    /* JADX INFO: renamed from: i */
    public final Typeface mo645i(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f923f;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo645i(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.f922e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m646z(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f926i.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m641C(objNewInstance)) {
                return mo640B(objNewInstance);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m646z(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f923f.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
