package androidx.fragment.app;

import Yue.C7467;
import Yue.InterfaceC6391;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8876 {

    /* JADX INFO: renamed from: ۥ */
    public static final C7467<ClassLoader, C7467<String, Class<?>>> f3829 = new C7467<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m4841(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) {
        try {
            return Fragment.class.isAssignableFrom(m29963(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Class<?> m29963(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) throws ClassNotFoundException {
        C7467<ClassLoader, C7467<String, Class<?>>> c7467 = f3829;
        C7467<String, Class<?>> c74672 = c7467.get(classLoader);
        if (c74672 == null) {
            c74672 = new C7467<>();
            c7467.put(classLoader, c74672);
        }
        Class<?> cls = c74672.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c74672.put(str, cls2);
        return cls2;
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.Fragment> */
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Class<? extends Fragment> m29964(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) {
        try {
            return m29963(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C8843("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C8843("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public Fragment mo4815(@InterfaceC6391 ClassLoader classLoader, @InterfaceC6391 String str) {
        try {
            return m29964(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment.C8843("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new Fragment.C8843("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.C8843("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.C8843("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
