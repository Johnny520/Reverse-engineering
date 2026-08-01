package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: wa */
/* JADX INFO: loaded from: classes.dex */
public final class C0849wa {

    /* JADX INFO: renamed from: a */
    public final int f5075a;

    /* JADX INFO: renamed from: b */
    public final Method f5076b;

    public C0849wa(int i, Method method) {
        this.f5075a = i;
        this.f5076b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0849wa)) {
            return false;
        }
        C0849wa c0849wa = (C0849wa) obj;
        return this.f5075a == c0849wa.f5075a && this.f5076b.getName().equals(c0849wa.f5076b.getName());
    }

    public final int hashCode() {
        return this.f5076b.getName().hashCode() + (this.f5075a * 31);
    }
}
