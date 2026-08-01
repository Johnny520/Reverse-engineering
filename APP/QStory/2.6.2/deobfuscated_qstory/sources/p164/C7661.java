package p164;

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
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p000.AbstractC6087;
import p153.C7601;
import p161.C7637;
import p161.C7638;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C7661 extends AbstractC4921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Method f20794 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Constructor f20795 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Method f20796 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean f20797 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Class f20798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Constructor f20799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f20800;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Method f20801;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Method f20802;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Method f20803;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Method f20804;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method f20805;

    public C7661() throws NoSuchMethodException {
        Method methodMo12902;
        Constructor<?> constructor;
        Method methodM12898;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM12898 = m12898(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo12902 = mo12902(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo12902 = null;
            constructor = null;
            methodM12898 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f20800 = cls;
        this.f20799 = constructor;
        this.f20802 = methodM12898;
        this.f20801 = method;
        this.f20804 = method2;
        this.f20805 = method3;
        this.f20803 = methodMo12902;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static boolean m12896(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m12897();
        try {
            return ((Boolean) f20794.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            C5919.m11252(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m12897() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f20797) {
            return;
        }
        f20797 = true;
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
        f20795 = constructor;
        f20798 = cls;
        f20794 = method2;
        f20796 = method;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static Method m12898(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public Typeface mo12899(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20800, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20803.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean m12900(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f20802.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Typeface mo9911(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.f20802;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f20799.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m12900(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f20805.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m12901(objNewInstance)) {
                    return mo12899(objNewInstance);
                }
            }
        } else {
            File fileM11398 = AbstractC6087.m11398(context);
            try {
                if (fileM11398 != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zM11414 = AbstractC6087.m11414(fileM11398, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zM11414) {
                                fileM11398.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM11398.getPath());
                            fileM11398.delete();
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
                fileM11398.delete();
                return null;
            } catch (Throwable th4) {
                fileM11398.delete();
                throw th4;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Typeface mo9913(Context context, C7601[] c7601Arr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo12899;
        boolean zBooleanValue;
        if (c7601Arr.length >= 1) {
            Method method = this.f20802;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C7601 c7601 : c7601Arr) {
                        if (c7601.f20618 == 0) {
                            Uri uri = c7601.f20623;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC6087.m11391(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f20799.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c7601Arr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f20805;
                            if (i2 < length) {
                                C7601 c76012 = c7601Arr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c76012.f20623);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f20801.invoke(objNewInstance, byteBuffer, Integer.valueOf(c76012.f20622), null, Integer.valueOf(c76012.f20621), Integer.valueOf(c76012.f20620 ? 1 : 0))).booleanValue();
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
                            } else if (m12901(objNewInstance) && (typefaceMo12899 = mo12899(objNewInstance)) != null) {
                                return Typeface.create(typefaceMo12899, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    C7601 c76013 = null;
                    for (C7601 c76014 : c7601Arr) {
                        int iAbs = (Math.abs(c76014.f20621 - i3) * 2) + (c76014.f20620 == z2 ? 0 : 1);
                        if (c76013 == null || i4 > iAbs) {
                            c76013 = c76014;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c76013.f20623, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c76013.f20621).setItalic(c76013.f20620).build();
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

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Typeface mo9915(Context context, C7638 c7638, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        C7637[] c7637Arr = c7638.f20737;
        Method method = this.f20802;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            m12897();
            try {
                Object objNewInstance2 = f20795.newInstance(null);
                for (C7637 c7637 : c7637Arr) {
                    File fileM11398 = AbstractC6087.m11398(context);
                    if (fileM11398 != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(c7637.f20731);
                                try {
                                    boolean zM11414 = AbstractC6087.m11414(fileM11398, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zM11414) {
                                        fileM11398.delete();
                                        return null;
                                    }
                                    if (!m12896(objNewInstance2, fileM11398.getPath(), c7637.f20735, c7637.f20734)) {
                                        fileM11398.delete();
                                        return null;
                                    }
                                    fileM11398.delete();
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
                            fileM11398.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileM11398.delete();
                            throw th4;
                        }
                    }
                }
                m12897();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) f20798, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f20796.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    C5919.m11252(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                C5919.m11252(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.f20799.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = c7637Arr.length;
            while (true) {
                if (i2 < length) {
                    C7637 c76372 = c7637Arr[i2];
                    C7661 c7661 = this;
                    Context context2 = context;
                    if (c7661.m12900(context2, objNewInstance, c76372.f20736, c76372.f20732, c76372.f20735, c76372.f20734 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c76372.f20733))) {
                        i2++;
                        this = c7661;
                        context = context2;
                    } else {
                        try {
                            c7661.f20805.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    C7661 c76612 = this;
                    if (c76612.m12901(objNewInstance)) {
                        return c76612.mo12899(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m12901(Object obj) {
        try {
            return ((Boolean) this.f20804.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public Method mo12902(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
