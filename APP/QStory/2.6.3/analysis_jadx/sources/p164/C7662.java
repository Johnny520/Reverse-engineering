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
import p053.AbstractC6561;
import p153.C7602;
import p161.C7638;
import p161.C7639;
import p175.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7662 extends AbstractC6561 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean f20789 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static Method f20790;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static Method f20791;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Constructor f20792;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Class f20793;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Method f20794;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Method f20795;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Method f20796;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Method f20797;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Method f20798;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f20799;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Constructor f20800;

    public C7662() throws NoSuchMethodException {
        Method methodMo12928;
        Constructor<?> constructor;
        Method methodM12925;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM12925 = m12925(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo12928 = mo12928(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo12928 = null;
            constructor = null;
            methodM12925 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f20799 = cls;
        this.f20800 = constructor;
        this.f20795 = methodM12925;
        this.f20794 = method;
        this.f20797 = method2;
        this.f20798 = method3;
        this.f20796 = methodMo12928;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static Method m12925(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static boolean m12926(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m12927();
        try {
            return ((Boolean) f20791.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            C5925.m11313(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static void m12927() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f20789) {
            return;
        }
        f20789 = true;
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
        f20792 = constructor;
        f20793 = cls;
        f20791 = method2;
        f20790 = method;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public Method mo12928(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Typeface mo12070(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.f20795;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f20800.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m12931(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f20798.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m12930(objNewInstance)) {
                    return mo12929(objNewInstance);
                }
            }
        } else {
            File fileM13060 = AbstractC7739.m13060(context);
            try {
                if (fileM13060 != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zM13084 = AbstractC7739.m13084(fileM13060, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zM13084) {
                                fileM13060.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM13060.getPath());
                            fileM13060.delete();
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
                fileM13060.delete();
                return null;
            } catch (Throwable th4) {
                fileM13060.delete();
                throw th4;
            }
        }
        return null;
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Typeface mo12072(Context context, C7602[] c7602Arr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo12929;
        boolean zBooleanValue;
        if (c7602Arr.length >= 1) {
            Method method = this.f20795;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C7602 c7602 : c7602Arr) {
                        if (c7602.f20613 == 0) {
                            Uri uri = c7602.f20618;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC7739.m13062(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f20800.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c7602Arr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f20798;
                            if (i2 < length) {
                                C7602 c76022 = c7602Arr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c76022.f20618);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f20794.invoke(objNewInstance, byteBuffer, Integer.valueOf(c76022.f20617), null, Integer.valueOf(c76022.f20616), Integer.valueOf(c76022.f20615 ? 1 : 0))).booleanValue();
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
                            } else if (m12930(objNewInstance) && (typefaceMo12929 = mo12929(objNewInstance)) != null) {
                                return Typeface.create(typefaceMo12929, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    C7602 c76023 = null;
                    for (C7602 c76024 : c7602Arr) {
                        int iAbs = (Math.abs(c76024.f20616 - i3) * 2) + (c76024.f20615 == z2 ? 0 : 1);
                        if (c76023 == null || i4 > iAbs) {
                            c76023 = c76024;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c76023.f20618, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c76023.f20616).setItalic(c76023.f20615).build();
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

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Typeface mo12073(Context context, C7639 c7639, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        C7638[] c7638Arr = c7639.f20732;
        Method method = this.f20795;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            m12927();
            try {
                Object objNewInstance2 = f20792.newInstance(null);
                for (C7638 c7638 : c7638Arr) {
                    File fileM13060 = AbstractC7739.m13060(context);
                    if (fileM13060 != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(c7638.f20726);
                                try {
                                    boolean zM13084 = AbstractC7739.m13084(fileM13060, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zM13084) {
                                        fileM13060.delete();
                                        return null;
                                    }
                                    if (!m12926(objNewInstance2, fileM13060.getPath(), c7638.f20730, c7638.f20729)) {
                                        fileM13060.delete();
                                        return null;
                                    }
                                    fileM13060.delete();
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
                            fileM13060.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileM13060.delete();
                            throw th4;
                        }
                    }
                }
                m12927();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) f20793, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f20790.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    C5925.m11313(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                C5925.m11313(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.f20800.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = c7638Arr.length;
            while (true) {
                if (i2 < length) {
                    C7638 c76382 = c7638Arr[i2];
                    C7662 c7662 = this;
                    Context context2 = context;
                    if (c7662.m12931(context2, objNewInstance, c76382.f20731, c76382.f20727, c76382.f20730, c76382.f20729 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c76382.f20728))) {
                        i2++;
                        this = c7662;
                        context = context2;
                    } else {
                        try {
                            c7662.f20798.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    C7662 c76622 = this;
                    if (c76622.m12930(objNewInstance)) {
                        return c76622.mo12929(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public Typeface mo12929(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20799, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20796.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final boolean m12930(Object obj) {
        try {
            return ((Boolean) this.f20797.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m12931(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f20795.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
