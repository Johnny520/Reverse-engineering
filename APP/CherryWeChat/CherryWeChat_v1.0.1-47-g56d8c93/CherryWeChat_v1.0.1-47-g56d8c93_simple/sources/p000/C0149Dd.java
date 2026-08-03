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
    public final C1251cA f405e;

    public C0149Dd(String r9) {
        this.f405e = new C1251cA(new C2790z9(1, this));
        int r2 = 0;
        int r0 = AbstractC2564tz.m5057R(r9, "->", 0, false, 6);
        int r1 = AbstractC2564tz.m5057R(r9, "(", r0 + 1, false, 4);
        int r3 = r1 + 1;
        int r5 = AbstractC2564tz.m5057R(r9, ")", r3, false, 4);
        if (r0 == (-1)) goto L23;
        if (r1 == (-1)) goto L23;
        if (r5 == (-1)) goto L23;
        this.f401a = AbstractC0235Fd.m479b(r9.substring(0, r0));
        this.f402b = r9.substring(r0 + 2, r1);
        String r02 = r9.substring(r3, r5);
        ArrayList r12 = new ArrayList();
    L7:
        int r32 = r2;
    L9:
        if (r2 >= r02.length()) goto L17;
        char r6 = r02.charAt(r2);
        if (r6 != '[') goto L14;
        r2 = r2 + 1;
        goto L9
    L14:
        if (r6 != 'L') goto L16;
        r2 = AbstractC2564tz.m5056Q(r02, ';', r2, 4);
    L16:
        r2 = r2 + 1;
        r12.add(AbstractC0235Fd.m479b(r02.substring(r32, r2)));
        goto L7
    L17:
        if (r32 != r2) goto L21;
        this.f403c = r12;
        this.f404d = AbstractC0235Fd.m479b(r9.substring(r5 + 1));
        return;
    L21:
        throw new IllegalStateException("Unknown signString: ".concat(r02));
    L23:
        throw new IllegalAccessError("not method descriptor: ".concat(r9));
    }

    /* JADX INFO: renamed from: a */
    public final Method m293a(ClassLoader r10) {
        C1256cF r0 = AbstractC2808zl.f9522a;
        String r1 = this.f402b;
        if (AbstractC0585Nj.m1134a(r1, "<clinit>") == true) goto L26;
        if (AbstractC0585Nj.m1134a(r1, "<init>") == true) goto L26;
        C0382Iv r02 = new C0382Iv();     // Catch: ClassNotFoundException -> L15
        r02.f1315a = r10.loadClass(this.f401a);     // Catch: ClassNotFoundException -> L15
    L7:
        Method[] r102 = (Method[]) AbstractC2808zl.f9522a.m2372b(r02.f1315a, new C2790z9(3, r02));     // Catch: ClassNotFoundException -> L15
        int r2 = r102.length;     // Catch: ClassNotFoundException -> L15
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L18;
        Method r4 = r102[r3];     // Catch: ClassNotFoundException -> L15
        if (AbstractC0585Nj.m1134a(r4.getName(), r1) == false) goto L17;
        if (AbstractC0585Nj.m1134a((String) this.f405e.getValue(), AbstractC2808zl.f9523b.m2372b(r4, new C2790z9(2, r4))) == false) goto L17;
        r4.setAccessible(true);     // Catch: ClassNotFoundException -> L15
        return r4;
    L17:
        r3 = r3 + 1;     // Catch: ClassNotFoundException -> L15
        goto L8
    L18:
        Class r103 = ((Class) r02.f1315a).getSuperclass();     // Catch: ClassNotFoundException -> L15
        r02.f1315a = r103;     // Catch: ClassNotFoundException -> L15
        if (r103 != null) goto L7;
        throw new NoSuchMethodException("Method " + this + " not found");     // Catch: ClassNotFoundException -> L15
    L15:
        e = move-exception;
        throw new NoSuchMethodException("No such method: " + this).initCause(e);
    L26:
        throw new IllegalArgumentException(this + " not a method");
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C0149Dd) == false) goto L23;
        C0149Dd r32 = (C0149Dd) r3;
        String r0 = r32.f401a;
        if (AbstractC0585Nj.m1134a(this.f401a, r0) == true) goto L10;
        return false;
    L10:
        if (AbstractC0585Nj.m1134a(this.f402b, r32.f402b) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f403c, r32.f403c) == true) goto L14;
        return false;
    L14:
        if (AbstractC0585Nj.m1134a(this.f404d, r32.f404d) == false) goto L22;
        return true;
    L22:
        return false;
    L23:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f401a.hashCode() * 31;
        int r1 = (this.f402b.hashCode() * 31) + r0;
        int r02 = (this.f403c.hashCode() * 31) + r1;
        return this.f404d.hashCode() + r02;
    }

    public final String toString() {
        return AbstractC0235Fd.m481d(this.f401a) + "->" + this.f402b + ((String) this.f405e.getValue());
    }

    public C0149Dd(Method r6) {
        this.f405e = new C1251cA(new C2790z9(1, this));
        this.f401a = AbstractC0235Fd.m478a(r6.getDeclaringClass());
        this.f402b = r6.getName();
        Class<?>[] r0 = r6.getParameterTypes();
        ArrayList r1 = new ArrayList(r0.length);
        int r2 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        r1.add(AbstractC0235Fd.m478a(r0[r3]));
        r3 = r3 + 1;
        goto L3
    L5:
        this.f403c = r1;
        this.f404d = AbstractC0235Fd.m478a(r6.getReturnType());
    }
}
