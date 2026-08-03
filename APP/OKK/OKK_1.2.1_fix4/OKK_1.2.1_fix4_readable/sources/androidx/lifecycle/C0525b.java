package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0525b {

    /* JADX INFO: renamed from: a */
    public final int f1475a;

    /* JADX INFO: renamed from: b */
    public final Method f1476b;

    public C0525b(int i2, Method method) {
        this.f1475a = i2;
        this.f1476b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0525b)) {
            return false;
        }
        C0525b c0525b = (C0525b) obj;
        return this.f1475a == c0525b.f1475a && this.f1476b.getName().equals(c0525b.f1476b.getName());
    }

    public final int hashCode() {
        return this.f1476b.getName().hashCode() + (this.f1475a * 31);
    }
}
