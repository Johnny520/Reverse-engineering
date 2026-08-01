package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: le */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0428le {

    /* JADX INFO: renamed from: a */
    public final int f3422a;

    /* JADX INFO: renamed from: b */
    public final Method f3423b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0428le(int i, Method method) {
        this.f3422a = i;
        this.f3423b = method;
        method.setAccessible(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0428le)) {
            return false;
        }
        C0428le c0428le = (C0428le) obj;
        return this.f3422a == c0428le.f3422a && this.f3423b.getName().equals(c0428le.f3423b.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3423b.getName().hashCode() + (this.f3422a * 31);
    }
}
