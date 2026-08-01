package p085r;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p052b1.AbstractC0503h;
import p083q.C0792f;
import p083q.C0793g;
import p093v.C1023h;

/* JADX INFO: renamed from: r.i */
/* JADX INFO: loaded from: classes.dex */
public class C0817i extends C0815g {

    /* JADX INFO: renamed from: A */
    public final Method f2728A;

    /* JADX INFO: renamed from: u */
    public final Class f2729u;

    /* JADX INFO: renamed from: v */
    public final Constructor f2730v;

    /* JADX INFO: renamed from: w */
    public final Method f2731w;

    /* JADX INFO: renamed from: x */
    public final Method f2732x;

    /* JADX INFO: renamed from: y */
    public final Method f2733y;

    /* JADX INFO: renamed from: z */
    public final Method f2734z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0817i() throws NoSuchMethodException {
        Method methodMo1494Y;
        Constructor<?> constructor;
        Method methodM1488X;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM1488X = m1488X(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo1494Y = mo1494Y(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            methodMo1494Y = null;
            constructor = null;
            methodM1488X = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f2729u = cls;
        this.f2730v = constructor;
        this.f2731w = methodM1488X;
        this.f2732x = method;
        this.f2733y = method2;
        this.f2734z = method3;
        this.f2728A = methodMo1494Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static Method m1488X(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m1489S(Object obj) {
        try {
            this.f2734z.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final boolean m1490T(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2731w.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public Typeface mo1491U(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2729u, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2728A.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final boolean m1492V(Object obj) {
        try {
            return ((Boolean) this.f2733y.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final Object m1493W() {
        try {
            return this.f2730v.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public Method mo1494Y(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085r.C0815g, p052b1.AbstractC0503h
    /* JADX INFO: renamed from: l */
    public final Typeface mo1001l(Context context, C0792f c0792f, Resources resources, int i2) {
        Method method = this.f2731w;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo1001l(context, c0792f, resources, i2);
        }
        Object objM1493W = m1493W();
        if (objM1493W != null) {
            C0793g[] c0793gArr = c0792f.f2638a;
            int length = c0793gArr.length;
            int i3 = 0;
            while (i3 < length) {
                C0793g c0793g = c0793gArr[i3];
                String str = c0793g.f2639a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0793g.f2642d);
                Context context2 = context;
                if (!m1490T(context2, objM1493W, str, c0793g.f2643e, c0793g.f2640b, c0793g.f2641c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    m1489S(objM1493W);
                    return null;
                }
                i3++;
                context = context2;
            }
            if (m1492V(objM1493W)) {
                return mo1491U(objM1493W);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0081 */
    @Override // p085r.C0815g, p052b1.AbstractC0503h
    /* JADX INFO: renamed from: m */
    public final Typeface mo1002m(Context context, C1023h[] c1023hArr, int i2) {
        Typeface typefaceMo1491U;
        boolean zBooleanValue;
        if (c1023hArr.length >= 1) {
            Method method = this.f2731w;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (C1023h c1023h : c1023hArr) {
                    if (c1023h.f3636e == 0) {
                        Uri uri = c1023h.f3632a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, AbstractC0503h.m971G(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objM1493W = m1493W();
                if (objM1493W != null) {
                    int length = c1023hArr.length;
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 < length) {
                        C1023h c1023h2 = c1023hArr[i3];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c1023h2.f3632a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f2732x.invoke(objM1493W, byteBuffer, Integer.valueOf(c1023h2.f3633b), null, Integer.valueOf(c1023h2.f3634c), Integer.valueOf(c1023h2.f3635d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                m1489S(objM1493W);
                                return null;
                            }
                            z2 = true;
                        }
                        i3++;
                        z2 = z2;
                    }
                    if (!z2) {
                        m1489S(objM1493W);
                        return null;
                    }
                    if (m1492V(objM1493W) && (typefaceMo1491U = mo1491U(objM1493W)) != null) {
                        return Typeface.create(typefaceMo1491U, i2);
                    }
                }
            } else {
                C1023h c1023hMo1005t = mo1005t(i2, c1023hArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c1023hMo1005t.f3632a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c1023hMo1005t.f3634c).setItalic(c1023hMo1005t.f3635d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: o */
    public final Typeface mo1004o(Context context, Resources resources, int i2, String str, int i3) {
        Method method = this.f2731w;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo1004o(context, resources, i2, str, i3);
        }
        Object objM1493W = m1493W();
        if (objM1493W != null) {
            if (!m1490T(context, objM1493W, str, 0, -1, -1, null)) {
                m1489S(objM1493W);
                return null;
            }
            if (m1492V(objM1493W)) {
                return mo1491U(objM1493W);
            }
        }
        return null;
    }
}
