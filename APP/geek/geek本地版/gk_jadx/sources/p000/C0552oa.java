package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: oa */
/* JADX INFO: loaded from: classes.dex */
public final class C0552oa {

    /* JADX INFO: renamed from: a */
    public final int f3516a;

    /* JADX INFO: renamed from: b */
    public final Method f3517b;

    public C0552oa(int i, Method method) {
        this.f3516a = i;
        this.f3517b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0552oa)) {
            return false;
        }
        C0552oa c0552oa = (C0552oa) obj;
        return this.f3516a == c0552oa.f3516a && this.f3517b.getName().equals(c0552oa.f3517b.getName());
    }

    public final int hashCode() {
        return this.f3517b.getName().hashCode() + (this.f3516a * 31);
    }
}
