package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: ft */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0215ft {

    /* JADX INFO: renamed from: a */
    public final int f3131a;

    /* JADX INFO: renamed from: b */
    public final Method f3132b;

    public C0215ft(Method method, int i) {
        this.f3131a = i;
        this.f3132b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0215ft)) {
            return false;
        }
        C0215ft c0215ft = (C0215ft) obj;
        return this.f3131a == c0215ft.f3131a && this.f3132b.getName().equals(c0215ft.f3132b.getName());
    }

    public final int hashCode() {
        return this.f3132b.getName().hashCode() + (this.f3131a * 31);
    }
}
