package Yue;

import Yue.C5053;
import Yue.C5058;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۢۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@InterfaceC7113(26)
public class C8026 extends C8024 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f23846 = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f23847 = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String f23848 = "addFontFromAssetManager";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String f23849 = "addFontFromBuffer";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f23850 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f23851 = "freeze";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final String f23852 = "abortCreation";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f23853 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Class<?> f23854;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Constructor<?> f23855;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Method f23856;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final Method f23857;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final Method f23858;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Method f23859;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Method f23860;

    public C8026() {
        Class<?> clsM25370;
        Constructor<?> constructorM25371;
        Method methodM25367;
        Method methodM25368;
        Method methodM25372;
        Method methodM25366;
        Method methodMo25369;
        try {
            clsM25370 = m25370();
            constructorM25371 = m25371(clsM25370);
            methodM25367 = m25367(clsM25370);
            methodM25368 = m25368(clsM25370);
            methodM25372 = m25372(clsM25370);
            methodM25366 = m25366(clsM25370);
            methodMo25369 = mo25369(clsM25370);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f23846, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            clsM25370 = null;
            constructorM25371 = null;
            methodM25367 = null;
            methodM25368 = null;
            methodM25372 = null;
            methodM25366 = null;
            methodMo25369 = null;
        }
        this.f23854 = clsM25370;
        this.f23855 = constructorM25371;
        this.f23856 = methodM25367;
        this.f23857 = methodM25368;
        this.f23858 = methodM25372;
        this.f23859 = methodM25366;
        this.f23860 = methodMo25369;
    }

    @Override // Yue.C8024, Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public Typeface mo4044(Context context, C5053.C5055 c5055, Resources resources, int i) {
        if (!m25365()) {
            return super.mo4044(context, c5055, resources, i);
        }
        Object objM25360 = m25360();
        if (objM25360 == null) {
            return null;
        }
        for (C5053.C5056 c5056 : c5055.m1871()) {
            if (!m25362(context, objM25360, c5056.m1872(), c5056.m15570(), c5056.m15572(), c5056.m15573() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c5056.m15571()))) {
                m25361(objM25360);
                return null;
            }
        }
        if (m25364(objM25360)) {
            return mo25359(objM25360);
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    @Override // Yue.C8024, Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Typeface mo25351(Context context, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 C5058.C5059[] c5059Arr, int i) {
        Typeface typefaceMo25359;
        if (c5059Arr.length < 1) {
            return null;
        }
        if (!m25365()) {
            C5058.C5059 c5059Mo25375 = mo25375(c5059Arr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c5059Mo25375.m15585(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c5059Mo25375.m15586()).setItalic(c5059Mo25375.m15587()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapM25395 = C8032.m25395(context, c5059Arr, cancellationSignal);
        Object objM25360 = m25360();
        if (objM25360 == null) {
            return null;
        }
        boolean z = false;
        for (C5058.C5059 c5059 : c5059Arr) {
            ByteBuffer byteBuffer = mapM25395.get(c5059.m15585());
            if (byteBuffer != null) {
                if (!m25363(objM25360, byteBuffer, c5059.m15584(), c5059.m15586(), c5059.m15587() ? 1 : 0)) {
                    m25361(objM25360);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m25361(objM25360);
            return null;
        }
        if (m25364(objM25360) && (typefaceMo25359 = mo25359(objM25360)) != null) {
            return Typeface.create(typefaceMo25359, i);
        }
        return null;
    }

    @Override // Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Typeface mo25358(Context context, Resources resources, int i, String str, int i2) {
        if (!m25365()) {
            return super.mo25358(context, resources, i, str, i2);
        }
        Object objM25360 = m25360();
        if (objM25360 == null) {
            return null;
        }
        if (!m25362(context, objM25360, str, 0, -1, -1, null)) {
            m25361(objM25360);
            return null;
        }
        if (m25364(objM25360)) {
            return mo25359(objM25360);
        }
        return null;
    }

    @Override // Yue.C8024, Yue.C8029
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Typeface mo25352(@InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        Typeface typefaceM4407;
        try {
            typefaceM4407 = C8428.m4407(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM4407 = null;
        }
        return typefaceM4407 == null ? super.mo25352(context, typeface, i, z) : typefaceM4407;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Typeface mo25359(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f23854, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f23860.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Object m25360() {
        try {
            return this.f23855.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m25361(Object obj) {
        try {
            this.f23859.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m25362(Context context, Object obj, String str, int i, int i2, int i3, @InterfaceC6490 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f23856.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m25363(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f23857.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m25364(Object obj) {
        try {
            return ((Boolean) this.f23858.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m25365() {
        if (this.f23856 == null) {
            Log.w(f23846, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f23856 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Method m25366(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f23852, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Method m25367(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f23848, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Method m25368(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f23849, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Method mo25369(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Class<?> m25370() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Constructor<?> m25371(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Method m25372(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f23851, null);
    }
}
