package p050c0;

import java.util.List;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0627U0 {

    /* JADX INFO: renamed from: a */
    public final Object f1937a;

    /* JADX INFO: renamed from: b */
    public final List f1938b;

    public C0627U0(Object r2, List r3) {
        AbstractC0307g.m703e(r2, "value");
        this.f1937a = r2;
        this.f1938b = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0627U0) == true) goto L8;
        return false;
    L8:
        C0627U0 r52 = (C0627U0) r5;
        Object r1 = r52.f1937a;
        if (AbstractC0307g.m699a(this.f1937a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1938b, r52.f1938b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1937a.hashCode() * 31;
        return this.f1938b.hashCode() + r02;
    }

    public final String toString() {
        return "Candidate(value=" + this.f1937a + ", path=" + this.f1938b + ")";
    }
}
