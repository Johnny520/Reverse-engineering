package p173lh;

import gg.AbstractC1416l;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kh.AbstractC2407b;
import p041d1.C0655c0;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p276sf.C3962i;

/* JADX INFO: renamed from: lh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2570d implements Serializable {

    /* JADX INFO: renamed from: g */
    public final String f8333g;

    /* JADX INFO: renamed from: h */
    public final String f8334h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f8335i;

    /* JADX INFO: renamed from: j */
    public final String f8336j;

    /* JADX INFO: renamed from: k */
    public final C3962i f8337k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2570d(String str) {
        int i9;
        str.getClass();
        this.f8337k = new C3962i(new C0655c0(this, 8));
        int iM6718q0 = 0;
        int iM6719r0 = AbstractC3149m.m6719r0(str, "->", 0, false, 6);
        int iM6719r02 = AbstractC3149m.m6719r0(str, "(", iM6719r0 + 1, false, 4);
        int i10 = iM6719r02 + 1;
        int iM6719r03 = AbstractC3149m.m6719r0(str, ")", i10, false, 4);
        if (iM6719r0 == -1 || iM6719r02 == -1 || iM6719r03 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f8333g = AbstractC2407b.m5747e(str.substring(0, iM6719r0));
        this.f8334h = str.substring(iM6719r0 + 2, iM6719r02);
        String strSubstring = str.substring(i10, iM6719r03);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i9 = iM6718q0;
            while (iM6718q0 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iM6718q0);
                if (cCharAt == '[') {
                    iM6718q0++;
                } else {
                    if (cCharAt == 'L') {
                        iM6718q0 = AbstractC3149m.m6718q0(strSubstring, ';', iM6718q0, 4);
                    }
                    iM6718q0++;
                    arrayList.add(AbstractC2407b.m5747e(strSubstring.substring(i9, iM6718q0)));
                }
            }
            break loop0;
        }
        if (i9 != iM6718q0) {
            C2104o.m5276A("Unknown signString: ".concat(strSubstring));
            throw null;
        }
        this.f8335i = arrayList;
        this.f8336j = AbstractC2407b.m5747e(str.substring(iM6719r03 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Constructor m6022a(ClassLoader classLoader) throws Throwable {
        classLoader.getClass();
        if (!AbstractC1416l.m3825a(this.f8334h, "<init>")) {
            throw new IllegalArgumentException(this + " not a constructor");
        }
        try {
            Class<?> clsLoadClass = classLoader.loadClass(this.f8333g);
            do {
                Constructor<?>[] declaredConstructors = clsLoadClass.getDeclaredConstructors();
                declaredConstructors.getClass();
                for (Constructor<?> constructor : declaredConstructors) {
                    String str = (String) this.f8337k.getValue();
                    constructor.getClass();
                    if (AbstractC1416l.m3825a(str, AbstractC2407b.m5743a(constructor))) {
                        constructor.setAccessible(true);
                        return constructor;
                    }
                }
                clsLoadClass = clsLoadClass.getSuperclass();
            } while (clsLoadClass != null);
            throw new NoSuchMethodException("Constructor " + this + " not found");
        } catch (ClassNotFoundException e6) {
            Throwable thInitCause = new NoSuchMethodException("No such method: " + this).initCause(e6);
            thInitCause.getClass();
            throw thInitCause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Method m6023b(ClassLoader classLoader) throws Throwable {
        classLoader.getClass();
        String str = this.f8334h;
        if (AbstractC1416l.m3825a(str, "<clinit>") || AbstractC1416l.m3825a(str, "<init>")) {
            throw new IllegalArgumentException(this + " not a method");
        }
        try {
            Class<?> clsLoadClass = classLoader.loadClass(this.f8333g);
            do {
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    if (AbstractC1416l.m3825a(method.getName(), str) && AbstractC1416l.m3825a((String) this.f8337k.getValue(), AbstractC2407b.m5745c(method))) {
                        method.setAccessible(true);
                        return method;
                    }
                }
                clsLoadClass = clsLoadClass.getSuperclass();
            } while (clsLoadClass != null);
            throw new NoSuchMethodException("Method " + this + " not found");
        } catch (ClassNotFoundException e6) {
            Throwable thInitCause = new NoSuchMethodException("No such method: " + this).initCause(e6);
            thInitCause.getClass();
            throw thInitCause;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2570d)) {
            return false;
        }
        C2570d c2570d = (C2570d) obj;
        return AbstractC1416l.m3825a(this.f8333g, c2570d.f8333g) && AbstractC1416l.m3825a(this.f8334h, c2570d.f8334h) && AbstractC1416l.m3825a(this.f8335i, c2570d.f8335i) && AbstractC1416l.m3825a(this.f8336j, c2570d.f8336j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8336j.hashCode() + (this.f8335i.hashCode() * 31) + (this.f8334h.hashCode() * 31) + (this.f8333g.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2407b.m5749g(this.f8333g) + "->" + this.f8334h + ((String) this.f8337k.getValue());
    }
}
