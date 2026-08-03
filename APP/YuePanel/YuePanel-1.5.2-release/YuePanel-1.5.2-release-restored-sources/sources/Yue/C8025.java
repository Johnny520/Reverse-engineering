package Yue;

import Yue.C5053;
import Yue.C5058;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۢۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@InterfaceC7113(24)
public class C8025 extends C8029 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f23838 = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f23839 = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f23840 = "addFontWeightStyle";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f23841 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Class<?> f23842;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Constructor<?> f23843;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Method f23844;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Method f23845;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f23838, e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f23843 = constructor;
        f23842 = cls;
        f23844 = method2;
        f23845 = method;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m25354(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f23844.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    private static Typeface m25355(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f23842, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f23845.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m25356() {
        Method method = f23844;
        if (method == null) {
            Log.w(f23838, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    private static Object m25357() {
        try {
            return f23843.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public Typeface mo4044(Context context, C5053.C5055 c5055, Resources resources, int i) {
        Object objM25357 = m25357();
        if (objM25357 == null) {
            return null;
        }
        for (C5053.C5056 c5056 : c5055.m1871()) {
            ByteBuffer byteBufferM4049 = C8032.m4049(context, resources, c5056.m1873());
            if (byteBufferM4049 == null || !m25354(objM25357, byteBufferM4049, c5056.m15570(), c5056.m15572(), c5056.m15573())) {
                return null;
            }
        }
        return m25355(objM25357);
    }

    @Override // Yue.C8029
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Typeface mo25351(Context context, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 C5058.C5059[] c5059Arr, int i) {
        Object objM25357 = m25357();
        if (objM25357 == null) {
            return null;
        }
        C7467 c7467 = new C7467();
        for (C5058.C5059 c5059 : c5059Arr) {
            Uri uriM15585 = c5059.m15585();
            ByteBuffer byteBufferM25393 = (ByteBuffer) c7467.get(uriM15585);
            if (byteBufferM25393 == null) {
                byteBufferM25393 = C8032.m25393(context, cancellationSignal, uriM15585);
                c7467.put(uriM15585, byteBufferM25393);
            }
            if (byteBufferM25393 == null || !m25354(objM25357, byteBufferM25393, c5059.m15584(), c5059.m15586(), c5059.m15587())) {
                return null;
            }
        }
        Typeface typefaceM25355 = m25355(objM25357);
        if (typefaceM25355 == null) {
            return null;
        }
        return Typeface.create(typefaceM25355, i);
    }

    @Override // Yue.C8029
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Typeface mo25352(@InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        Typeface typefaceM4405;
        try {
            typefaceM4405 = C8427.m4405(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM4405 = null;
        }
        return typefaceM4405 == null ? super.mo25352(context, typeface, i, z) : typefaceM4405;
    }
}
