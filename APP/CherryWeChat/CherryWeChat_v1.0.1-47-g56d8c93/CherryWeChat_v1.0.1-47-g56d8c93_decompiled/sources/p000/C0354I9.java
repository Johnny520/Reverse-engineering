package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: I9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0354I9 {

    /* JADX INFO: renamed from: a */
    public final int f1188a;

    /* JADX INFO: renamed from: b */
    public final Method f1189b;

    public C0354I9(int i, Method method) {
        this.f1188a = i;
        this.f1189b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0354I9)) {
            return false;
        }
        C0354I9 c0354i9 = (C0354I9) obj;
        return this.f1188a == c0354i9.f1188a && this.f1189b.getName().equals(c0354i9.f1189b.getName());
    }

    public final int hashCode() {
        return this.f1189b.getName().hashCode() + (this.f1188a * 31);
    }
}
