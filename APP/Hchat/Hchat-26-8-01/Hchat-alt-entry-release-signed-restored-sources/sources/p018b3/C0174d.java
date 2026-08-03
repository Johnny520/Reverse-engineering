package p018b3;

import android.content.Context;
import android.content.res.AssetManager;
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
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p059e3.C0823d;

/* JADX INFO: renamed from: b3.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0174d extends AbstractC0000a {

    /* JADX INFO: renamed from: j */
    public final Class f451j;

    /* JADX INFO: renamed from: k */
    public final Constructor f452k;

    /* JADX INFO: renamed from: l */
    public final Method f453l;

    /* JADX INFO: renamed from: m */
    public final Method f454m;

    /* JADX INFO: renamed from: n */
    public final Method f455n;

    /* JADX INFO: renamed from: o */
    public final Method f456o;

    /* JADX INFO: renamed from: p */
    public final Method f457p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0174d() throws NoSuchMethodException {
        Method methodMo771g1;
        Constructor<?> constructor;
        Method methodM769f1;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM769f1 = m769f1(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo771g1 = mo771g1(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            methodMo771g1 = null;
            constructor = null;
            methodM769f1 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f451j = cls;
        this.f452k = constructor;
        this.f453l = methodM769f1;
        this.f454m = method;
        this.f455n = method2;
        this.f456o = method3;
        this.f457p = methodMo771g1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public static Method m769f1(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x0088 */
    @Override // p000a.AbstractC0000a
    /* JADX INFO: renamed from: D */
    public final Typeface mo104D(Context context, C0823d[] c0823dArr) throws IOException {
        Object objNewInstance;
        boolean zBooleanValue;
        Typeface typefaceMo770e1;
        boolean zBooleanValue2;
        if (c0823dArr.length >= 1) {
            Method method = this.f453l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C0823d c0823d : c0823dArr) {
                        if (c0823d.f2472e == 0) {
                            Uri uri = c0823d.f2468a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC0018a.m217C(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f452k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c0823dArr.length;
                        int i9 = 0;
                        boolean z9 = false;
                        while (true) {
                            Method method2 = this.f456o;
                            if (i9 < length) {
                                C0823d c0823d2 = c0823dArr[i9];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0823d2.f2468a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue2 = ((Boolean) this.f454m.invoke(objNewInstance, byteBuffer, Integer.valueOf(c0823d2.f2469b), null, Integer.valueOf(c0823d2.f2470c), Integer.valueOf(c0823d2.f2471d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue2 = false;
                                    }
                                    if (!zBooleanValue2) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z9 = true;
                                }
                                i9++;
                                z9 = z9;
                            } else if (z9) {
                                try {
                                    zBooleanValue = ((Boolean) this.f455n.invoke(objNewInstance, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue && (typefaceMo770e1 = mo770e1(objNewInstance)) != null) {
                                    return Typeface.create(typefaceMo770e1, 0);
                                }
                            } else {
                                method2.invoke(objNewInstance, null);
                            }
                        }
                    }
                } else {
                    int i10 = Integer.MAX_VALUE;
                    C0823d c0823d3 = null;
                    for (C0823d c0823d4 : c0823dArr) {
                        int iAbs = (Math.abs(c0823d4.f2470c - 400) * 2) + (c0823d4.f2471d ? 1 : 0);
                        if (c0823d3 == null || i10 > iAbs) {
                            c0823d3 = c0823d4;
                            i10 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0823d3.f2468a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0823d3.f2470c).setItalic(c0823d3.f2471d).build();
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
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public Typeface mo770e1(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f451j, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f457p.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public Method mo771g1(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
