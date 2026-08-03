package Yue;

import Yue.C5053;
import Yue.C5058;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@InterfaceC7113(21)
public class C8024 extends C8029 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f23829 = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f23830 = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f23831 = "addFontWeightStyle";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f23832 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Class<?> f23833;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Constructor<?> f23834;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Method f23835;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Method f23836;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean f23837;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m25347(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m25349();
        try {
            return ((Boolean) f23835.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    private static Typeface m25348(Object obj) throws NoSuchMethodException {
        m25349();
        try {
            Object objNewInstance = Array.newInstance(f23833, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f23836.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m25349() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f23837) {
            return;
        }
        f23837 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(f23829, e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f23834 = constructor;
        f23833 = cls;
        f23835 = method2;
        f23836 = method;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    private static Object m25350() throws NoSuchMethodException {
        m25349();
        try {
            return f23834.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // Yue.C8029
    /* JADX INFO: renamed from: ۥ۟ */
    public Typeface mo4044(Context context, C5053.C5055 c5055, Resources resources, int i) throws NoSuchMethodException {
        Object objM25350 = m25350();
        for (C5053.C5056 c5056 : c5055.m1871()) {
            File fileM25392 = C8032.m25392(context);
            if (fileM25392 == null) {
                return null;
            }
            try {
                if (!C8032.m25390(fileM25392, resources, c5056.m1873())) {
                    return null;
                }
                if (!m25347(objM25350, fileM25392.getPath(), c5056.m15572(), c5056.m15573())) {
                    return null;
                }
                fileM25392.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileM25392.delete();
            }
        }
        return m25348(objM25350);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    @Override // Yue.C8029
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Typeface mo25351(Context context, CancellationSignal cancellationSignal, @InterfaceC6391 C5058.C5059[] c5059Arr, int i) {
        if (c5059Arr.length < 1) {
            return null;
        }
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
                File fileM25353 = m25353(parcelFileDescriptorOpenFileDescriptor);
                if (fileM25353 != null && fileM25353.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM25353);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceMo25374 = super.mo25374(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceMo25374;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // Yue.C8029
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Typeface mo25352(@InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        Typeface typefaceM4405;
        try {
            typefaceM4405 = C8427.m4405(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceM4405 = null;
        }
        return typefaceM4405 == null ? super.mo25352(context, typeface, i, z) : typefaceM4405;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final File m25353(@InterfaceC6391 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
