package p050c0;

import java.lang.reflect.Method;
import java.util.Arrays;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0630W {

    /* JADX INFO: renamed from: a */
    public final Method f1941a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1942b;

    public C0630W(Method method, Object[] objArr) {
        AbstractC0307g.m703e(method, "method");
        this.f1941a = method;
        this.f1942b = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0630W)) {
            return false;
        }
        C0630W c0630w = (C0630W) obj;
        return AbstractC0307g.m699a(this.f1941a, c0630w.f1941a) && AbstractC0307g.m699a(this.f1942b, c0630w.f1942b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1942b) + (this.f1941a.hashCode() * 31);
    }

    public final String toString() {
        return "QuoteMethodCandidate(method=" + this.f1941a + ", args=" + Arrays.toString(this.f1942b) + ")";
    }
}
