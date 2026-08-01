package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0468c {

    /* JADX INFO: renamed from: a */
    public final int f1510a;

    /* JADX INFO: renamed from: b */
    public final Method f1511b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0468c(int i2, Method method) {
        this.f1510a = i2;
        this.f1511b = method;
        method.setAccessible(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0468c)) {
            return false;
        }
        C0468c c0468c = (C0468c) obj;
        return this.f1510a == c0468c.f1510a && this.f1511b.getName().equals(c0468c.f1511b.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1511b.getName().hashCode() + (this.f1510a * 31);
    }
}
