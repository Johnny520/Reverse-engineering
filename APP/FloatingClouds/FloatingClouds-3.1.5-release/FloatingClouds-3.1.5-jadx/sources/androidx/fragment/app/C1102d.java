package androidx.fragment.app;

import androidx.fragment.app.ComponentCallbacksC1100b;
import p000a.C0598ge;
import p000a.C0944z;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public class C1102d {

    /* JADX INFO: renamed from: a */
    public static final C0598ge<ClassLoader, C0598ge<String, Class<?>>> f4604a = new C0598ge<>();

    /* JADX INFO: renamed from: b */
    public static Class<?> m2543b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0598ge<ClassLoader, C0598ge<String, Class<?>>> c0598ge = f4604a;
        C0598ge<String, Class<?>> orDefault = c0598ge.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C0598ge<>();
            c0598ge.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    /* JADX DEBUG: Type inference failed for r3v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.b> */
    /* JADX INFO: renamed from: c */
    public static Class<? extends ComponentCallbacksC1100b> m2544c(ClassLoader classLoader, String str) {
        try {
            return m2543b(classLoader, str);
        } catch (ClassCastException e) {
            throw new ComponentCallbacksC1100b.e(C0944z.m2227g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new ComponentCallbacksC1100b.e(C0944z.m2227g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public ComponentCallbacksC1100b mo1391a(String str) {
        throw null;
    }
}
