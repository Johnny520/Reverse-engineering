package p007D0;

import java.io.Serializable;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0140f implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f330a;

    public C0140f(Throwable r2) {
        AbstractC0307g.m703e(r2, "exception");
        this.f330a = r2;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0140f) == false) goto L7;
        Throwable r22 = ((C0140f) r2).f330a;
        if (AbstractC0307g.m699a(this.f330a, r22) == false) goto L7;
        return true;
    L7:
        return false;
    }

    public final int hashCode() {
        return this.f330a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f330a + ')';
    }
}
