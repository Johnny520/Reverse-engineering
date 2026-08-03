package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: Dd */
/* JADX INFO: loaded from: classes.dex */
public final class C0149Dd {

    /* JADX INFO: renamed from: a */
    public final String f401a;

    /* JADX INFO: renamed from: b */
    public final String f402b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f403c;

    /* JADX INFO: renamed from: d */
    public final String f404d;

    /* JADX INFO: renamed from: e */
    public final C1251cA f405e = new C1251cA(new C2790z9(1, this));

    public C0149Dd(String str) {
        int i;
        int iM5056Q = 0;
        int iM5057R = AbstractC2564tz.m5057R(str, "->", 0, false, 6);
        int iM5057R2 = AbstractC2564tz.m5057R(str, "(", iM5057R + 1, false, 4);
        int i2 = iM5057R2 + 1;
        int iM5057R3 = AbstractC2564tz.m5057R(str, ")", i2, false, 4);
        if (iM5057R == -1 || iM5057R2 == -1 || iM5057R3 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f401a = AbstractC0235Fd.m479b(str.substring(0, iM5057R));
        this.f402b = str.substring(iM5057R + 2, iM5057R2);
        String strSubstring = str.substring(i2, iM5057R3);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM5056Q;
            while (iM5056Q < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(iM5056Q);
                if (cCharAt == '[') {
                    iM5056Q++;
                } else {
                    if (cCharAt == 'L') {
                        iM5056Q = AbstractC2564tz.m5056Q(strSubstring, ';', iM5056Q, 4);
                    }
                    iM5056Q++;
                    arrayList.add(AbstractC0235Fd.m479b(strSubstring.substring(i, iM5056Q)));
                }
            }
            break loop0;
        }
        if (i != iM5056Q) {
            throw new IllegalStateException("Unknown signString: ".concat(strSubstring));
        }
        this.f403c = arrayList;
        this.f404d = AbstractC0235Fd.m479b(str.substring(iM5057R3 + 1));
    }

    /* JADX INFO: renamed from: a */
    public final Method m293a(ClassLoader classLoader) throws Throwable {
        Class superclass;
        C1256cF c1256cF = AbstractC2808zl.f9522a;
        String str = this.f402b;
        if (AbstractC0585Nj.m1134a(str, "<clinit>") || AbstractC0585Nj.m1134a(str, "<init>")) {
            throw new IllegalArgumentException(this + " not a method");
        }
        try {
            C0382Iv c0382Iv = new C0382Iv();
            c0382Iv.f1315a = classLoader.loadClass(this.f401a);
            do {
                for (Method method : (Method[]) AbstractC2808zl.f9522a.m2372b(c0382Iv.f1315a, new C2790z9(3, c0382Iv))) {
                    if (AbstractC0585Nj.m1134a(method.getName(), str) && AbstractC0585Nj.m1134a((String) this.f405e.getValue(), AbstractC2808zl.f9523b.m2372b(method, new C2790z9(2, method)))) {
                        method.setAccessible(true);
                        return method;
                    }
                }
                superclass = ((Class) c0382Iv.f1315a).getSuperclass();
                c0382Iv.f1315a = superclass;
            } while (superclass != null);
            throw new NoSuchMethodException("Method " + this + " not found");
        } catch (ClassNotFoundException e) {
            throw new NoSuchMethodException("No such method: " + this).initCause(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0149Dd)) {
            return false;
        }
        C0149Dd c0149Dd = (C0149Dd) obj;
        return AbstractC0585Nj.m1134a(this.f401a, c0149Dd.f401a) && AbstractC0585Nj.m1134a(this.f402b, c0149Dd.f402b) && AbstractC0585Nj.m1134a(this.f403c, c0149Dd.f403c) && AbstractC0585Nj.m1134a(this.f404d, c0149Dd.f404d);
    }

    public final int hashCode() {
        return this.f404d.hashCode() + (this.f403c.hashCode() * 31) + (this.f402b.hashCode() * 31) + (this.f401a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC0235Fd.m481d(this.f401a) + "->" + this.f402b + ((String) this.f405e.getValue());
    }

    public C0149Dd(Method method) {
        this.f401a = AbstractC0235Fd.m478a(method.getDeclaringClass());
        this.f402b = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            arrayList.add(AbstractC0235Fd.m478a(cls));
        }
        this.f403c = arrayList;
        this.f404d = AbstractC0235Fd.m478a(method.getReturnType());
    }
}
