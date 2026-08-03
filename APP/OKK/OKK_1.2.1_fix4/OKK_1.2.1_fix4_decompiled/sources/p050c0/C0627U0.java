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

    public C0627U0(Object obj, List list) {
        AbstractC0307g.m703e(obj, "value");
        this.f1937a = obj;
        this.f1938b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0627U0)) {
            return false;
        }
        C0627U0 c0627u0 = (C0627U0) obj;
        return AbstractC0307g.m699a(this.f1937a, c0627u0.f1937a) && AbstractC0307g.m699a(this.f1938b, c0627u0.f1938b);
    }

    public final int hashCode() {
        return this.f1938b.hashCode() + (this.f1937a.hashCode() * 31);
    }

    public final String toString() {
        return "Candidate(value=" + this.f1937a + ", path=" + this.f1938b + ")";
    }
}
