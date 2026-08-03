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

    public C0630W(Method r2, Object[] r3) {
        AbstractC0307g.m703e(r2, "method");
        this.f1941a = r2;
        this.f1942b = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0630W) == true) goto L8;
        return false;
    L8:
        C0630W r52 = (C0630W) r5;
        Method r1 = r52.f1941a;
        if (AbstractC0307g.m699a(this.f1941a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1942b, r52.f1942b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1941a.hashCode() * 31;
        return Arrays.hashCode(this.f1942b) + r02;
    }

    public final String toString() {
        return "QuoteMethodCandidate(method=" + this.f1941a + ", args=" + Arrays.toString(this.f1942b) + ")";
    }
}
