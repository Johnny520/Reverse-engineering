package p002A1;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: A1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0130c {

    /* JADX INFO: renamed from: a */
    public final int f521a;

    /* JADX INFO: renamed from: b */
    public final Method f522b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0130c(Method method, int i5) {
        this.f521a = i5;
        this.f522b = method;
        method.setAccessible(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0130c)) {
            return false;
        }
        C0130c c0130c = (C0130c) obj;
        return this.f521a == c0130c.f521a && this.f522b.getName().equals(c0130c.f522b.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f522b.getName().hashCode() + (this.f521a * 31);
    }
}
