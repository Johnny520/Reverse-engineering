package p085r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
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
import p052b1.AbstractC0503h;
import p083q.C0792f;
import p083q.C0793g;
import p093v.C1023h;

/* JADX INFO: renamed from: r.g */
/* JADX INFO: loaded from: classes.dex */
public class C0815g extends AbstractC0503h {

    /* JADX INFO: renamed from: p */
    public static Class f2719p = null;

    /* JADX INFO: renamed from: q */
    public static Constructor f2720q = null;

    /* JADX INFO: renamed from: r */
    public static Method f2721r = null;

    /* JADX INFO: renamed from: s */
    public static Method f2722s = null;

    /* JADX INFO: renamed from: t */
    public static boolean f2723t = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static boolean m1484Q(Object obj, String str, int i2, boolean z2) throws NoSuchMethodException {
        m1485R();
        try {
            return ((Boolean) f2721r.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static void m1485R() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2723t) {
            return;
        }
        f2723t = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f2720q = constructor;
        f2719p = cls;
        f2721r = method2;
        f2722s = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: l */
    public Typeface mo1001l(Context context, C0792f c0792f, Resources resources, int i2) throws NoSuchMethodException {
        m1485R();
        try {
            Object objNewInstance = f2720q.newInstance(null);
            for (C0793g c0793g : c0792f.f2638a) {
                File fileM967C = AbstractC0503h.m967C(context);
                if (fileM967C == null) {
                    return null;
                }
                try {
                    if (!AbstractC0503h.m982j(fileM967C, resources, c0793g.f2644f)) {
                        return null;
                    }
                    if (!m1484Q(objNewInstance, fileM967C.getPath(), c0793g.f2640b, c0793g.f2641c)) {
                        return null;
                    }
                    fileM967C.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM967C.delete();
                }
            }
            m1485R();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f2719p, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f2722s.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: m */
    public Typeface mo1002m(Context context, C1023h[] c1023hArr, int i2) {
        String str;
        if (c1023hArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo1005t(i2, c1023hArr).f3632a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceMo1003n = mo1003n(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceMo1003n;
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
        return null;
    }
}
