package p180;

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
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p069.AbstractC7390;
import p169.C8431;
import p177.C8467;
import p177.C8468;
import p191.AbstractC8568;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8491 extends AbstractC7390 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean f21134 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static Method f21135;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static Method f21136;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Constructor f21137;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Class f21138;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Method f21139;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Method f21140;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Method f21141;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Method f21142;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Method f21143;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f21144;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Constructor f21145;

    public C8491() throws NoSuchMethodException {
        Method methodMo13487;
        Constructor<?> constructor;
        Method methodM13484;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM13484 = m13484(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo13487 = mo13487(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo13487 = null;
            constructor = null;
            methodM13484 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f21144 = cls;
        this.f21145 = constructor;
        this.f21140 = methodM13484;
        this.f21139 = method;
        this.f21142 = method2;
        this.f21143 = method3;
        this.f21141 = methodMo13487;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static Method m13484(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static boolean m13485(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m13486();
        try {
            return ((Boolean) f21136.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            C6755.m11872(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static void m13486() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f21134) {
            return;
        }
        f21134 = true;
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
        f21137 = constructor;
        f21138 = cls;
        f21136 = method2;
        f21135 = method;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public Method mo13487(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Typeface mo12629(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.f21140;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f21145.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m13490(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f21143.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m13489(objNewInstance)) {
                    return mo13488(objNewInstance);
                }
            }
        } else {
            File fileM13619 = AbstractC8568.m13619(context);
            try {
                if (fileM13619 != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zM13643 = AbstractC8568.m13643(fileM13619, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zM13643) {
                                fileM13619.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM13619.getPath());
                            fileM13619.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                fileM13619.delete();
                return null;
            } catch (Throwable th4) {
                fileM13619.delete();
                throw th4;
            }
        }
        return null;
    }

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Typeface mo12631(Context context, C8431[] c8431Arr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo13488;
        boolean zBooleanValue;
        if (c8431Arr.length >= 1) {
            Method method = this.f21140;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C8431 c8431 : c8431Arr) {
                        if (c8431.f20958 == 0) {
                            Uri uri = c8431.f20963;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC8568.m13621(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f21145.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c8431Arr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f21143;
                            if (i2 < length) {
                                C8431 c84312 = c8431Arr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c84312.f20963);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f21139.invoke(objNewInstance, byteBuffer, Integer.valueOf(c84312.f20962), null, Integer.valueOf(c84312.f20961), Integer.valueOf(c84312.f20960 ? 1 : 0))).booleanValue();
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
                            } else if (m13489(objNewInstance) && (typefaceMo13488 = mo13488(objNewInstance)) != null) {
                                return Typeface.create(typefaceMo13488, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    C8431 c84313 = null;
                    for (C8431 c84314 : c8431Arr) {
                        int iAbs = (Math.abs(c84314.f20961 - i3) * 2) + (c84314.f20960 == z2 ? 0 : 1);
                        if (c84313 == null || i4 > iAbs) {
                            c84313 = c84314;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c84313.f20963, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c84313.f20961).setItalic(c84313.f20960).build();
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

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Typeface mo12632(Context context, C8468 c8468, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        C8467[] c8467Arr = c8468.f21077;
        Method method = this.f21140;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            m13486();
            try {
                Object objNewInstance2 = f21137.newInstance(null);
                for (C8467 c8467 : c8467Arr) {
                    File fileM13619 = AbstractC8568.m13619(context);
                    if (fileM13619 != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(c8467.f21071);
                                try {
                                    boolean zM13643 = AbstractC8568.m13643(fileM13619, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zM13643) {
                                        fileM13619.delete();
                                        return null;
                                    }
                                    if (!m13485(objNewInstance2, fileM13619.getPath(), c8467.f21075, c8467.f21074)) {
                                        fileM13619.delete();
                                        return null;
                                    }
                                    fileM13619.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileM13619.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileM13619.delete();
                            throw th4;
                        }
                    }
                }
                m13486();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) f21138, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f21135.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    C6755.m11872(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                C6755.m11872(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.f21145.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = c8467Arr.length;
            while (true) {
                if (i2 < length) {
                    C8467 c84672 = c8467Arr[i2];
                    C8491 c8491 = this;
                    Context context2 = context;
                    if (c8491.m13490(context2, objNewInstance, c84672.f21076, c84672.f21072, c84672.f21075, c84672.f21074 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c84672.f21073))) {
                        i2++;
                        this = c8491;
                        context = context2;
                    } else {
                        try {
                            c8491.f21143.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    C8491 c84912 = this;
                    if (c84912.m13489(objNewInstance)) {
                        return c84912.mo13488(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public Typeface mo13488(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f21144, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f21141.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final boolean m13489(Object obj) {
        try {
            return ((Boolean) this.f21142.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m13490(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f21140.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
