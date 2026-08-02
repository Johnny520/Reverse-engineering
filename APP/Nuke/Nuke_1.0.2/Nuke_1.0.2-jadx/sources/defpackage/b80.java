package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b80 {
    public static final HashSet a = new HashSet();
    public static final Object b = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Class cls, String str, boolean z) {
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        String string = pv2.I0(str).toString();
        if (string.length() <= 0) {
            s.j("Native library name is empty");
            return;
        }
        if (!wv2.d0(string, "lib", false) || !wv2.W(string, ".so", false)) {
            string = wv2.d0(string, "lib", false) ? string.concat(".so") : wv2.W(string, ".so", false) ? "lib".concat(string) : vi0.j("lib", string, ".so");
        }
        synchronized (b) {
            if (a.contains(string)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str2 : d(string)) {
                try {
                    c(b(str2, string), str2, cls);
                    x92Var3 = a83.a;
                } catch (Throwable th) {
                    x92Var3 = new x92(th);
                }
                if (!(x92Var3 instanceof x92)) {
                    a.add(string);
                    return;
                }
                Throwable thA = y92.a(x92Var3);
                if (thA != null) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load " + str2 + " from module APK");
                    fg1.m(unsatisfiedLinkError, thA);
                    arrayList.add(unsatisfiedLinkError);
                }
            }
            for (File file : e(string)) {
                if (file.isFile()) {
                    try {
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        c(file, absolutePath, cls);
                        x92Var2 = a83.a;
                    } catch (Throwable th2) {
                        x92Var2 = new x92(th2);
                    }
                    if (!(x92Var2 instanceof x92)) {
                        a.add(string);
                        return;
                    }
                    Throwable thA2 = y92.a(x92Var2);
                    if (thA2 != null) {
                        UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load " + file.getAbsolutePath());
                        fg1.m(unsatisfiedLinkError2, thA2);
                        arrayList.add(unsatisfiedLinkError2);
                    }
                }
            }
            if (z) {
                try {
                    String strZ0 = pv2.z0(pv2.y0(string, "lib"), ".so");
                    Method declaredMethod = Runtime.class.getDeclaredMethod("loadLibrary0", Class.class, String.class);
                    declaredMethod.setAccessible(true);
                    try {
                        declaredMethod.invoke(Runtime.getRuntime(), cls, strZ0);
                        x92Var = a83.a;
                    } catch (InvocationTargetException e) {
                        Throwable targetException = e.getTargetException();
                        if (targetException != null) {
                            throw targetException;
                        }
                        throw e;
                    }
                } catch (Throwable th3) {
                    x92Var = new x92(th3);
                }
                if (!(x92Var instanceof x92)) {
                    a.add(string);
                    return;
                }
                Throwable thA3 = y92.a(x92Var);
                if (thA3 != null) {
                    UnsatisfiedLinkError unsatisfiedLinkError3 = new UnsatisfiedLinkError("Failed to load " + string + " by platform loader");
                    fg1.m(unsatisfiedLinkError3, thA3);
                    arrayList.add(unsatisfiedLinkError3);
                }
            }
            String str3 = up0.l;
            if (str3 == null) {
                t11.S("moduleApkPath");
                throw null;
            }
            UnsatisfiedLinkError unsatisfiedLinkError4 = new UnsatisfiedLinkError("Unable to load " + string + " from module APK path: " + str3);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fg1.m(unsatisfiedLinkError4, (Throwable) it.next());
            }
            throw unsatisfiedLinkError4;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static File b(String str, String str2) throws IOException {
        String str3 = up0.l;
        if (str3 == null) {
            t11.S("moduleApkPath");
            throw null;
        }
        File file = new File(str3);
        Context context = up0.i;
        if (context == null) {
            t11.S("hostContext");
            throw null;
        }
        File file2 = new File(context.getCodeCacheDir(), "nuke_native");
        if (!file2.exists() && !file2.mkdirs()) {
            s.l(vi0.i("Unable to create native cache dir: ", file2.getAbsolutePath()));
            return null;
        }
        String name = file.getName();
        name.getClass();
        int iT0 = pv2.t0(6, name, ".");
        if (iT0 != -1) {
            name = name.substring(0, iT0);
        }
        File file3 = new File(file2, name + "-" + file.length() + "-" + file.lastModified() + "-" + str2);
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry(str);
            if (entry == null) {
                throw new IllegalStateException("Missing native library entry: " + str);
            }
            if (!file3.isFile() || file3.length() != entry.getSize()) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        inputStream.getClass();
                        p40.n(inputStream, fileOutputStream);
                        fileOutputStream.close();
                        inputStream.close();
                    } finally {
                    }
                } finally {
                }
            }
            zipFile.close();
            file3.setReadable(true, true);
            file3.setExecutable(true, true);
            return file3;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(File file, String str, Class cls) {
        Object x92Var;
        Method declaredMethod;
        Object x92Var2 = a83.a;
        String absolutePath = file.getAbsolutePath();
        try {
            absolutePath.getClass();
            declaredMethod = Runtime.class.getDeclaredMethod("load0", Class.class, String.class);
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        try {
            declaredMethod.invoke(Runtime.getRuntime(), cls, absolutePath);
            x92Var = x92Var2;
            if (!(x92Var instanceof x92)) {
                return;
            }
            Throwable thA = y92.a(x92Var);
            if (thA != null) {
                if (cls.getClassLoader() != b80.class.getClassLoader()) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to bind native library to " + cls.getName() + " classloader from " + str);
                    fg1.m(unsatisfiedLinkError, thA);
                    throw unsatisfiedLinkError;
                }
                try {
                    System.load(absolutePath);
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                if (!(x92Var2 instanceof x92)) {
                    return;
                }
                Throwable thA2 = y92.a(x92Var2);
                if (thA2 == null) {
                    return;
                }
                UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError(vi0.i("Failed to load native library from ", str));
                fg1.m(unsatisfiedLinkError2, thA);
                fg1.m(unsatisfiedLinkError2, thA2);
                throw unsatisfiedLinkError2;
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                throw targetException;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList d(String str) {
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            iu.g0(t11.l(str2, "arm64-v8a") ? eu.P("arm64-v8a", "arm64") : t11.l(str2, "armeabi-v7a") ? eu.P("armeabi-v7a", "arm") : eu.O(str2), arrayList);
        }
        List listF0 = du.F0(du.J0(arrayList));
        ArrayList arrayList2 = new ArrayList(eu.B(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            arrayList2.add("lib/" + ((String) it.next()) + "/" + str);
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List e(String str) {
        String str2 = up0.l;
        if (str2 == null) {
            t11.S("moduleApkPath");
            throw null;
        }
        File parentFile = new File(str2).getParentFile();
        if (parentFile == null) {
            return be0.h;
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArr) {
            iu.g0(t11.l(str3, "arm64-v8a") ? eu.P("arm64", "arm64-v8a") : t11.l(str3, "armeabi-v7a") ? eu.P("arm", "armeabi-v7a") : eu.O(str3), arrayList);
        }
        List listF0 = du.F0(du.J0(arrayList));
        ArrayList arrayList2 = new ArrayList(eu.B(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            arrayList2.add(new File(parentFile, "lib/" + ((String) it.next()) + "/" + str));
        }
        return arrayList2;
    }
}
