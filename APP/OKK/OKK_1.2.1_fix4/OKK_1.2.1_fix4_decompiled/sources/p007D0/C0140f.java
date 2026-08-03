package p007D0;

import java.io.Serializable;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0140f implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f330a;

    public C0140f(Throwable th) {
        AbstractC0307g.m703e(th, "exception");
        this.f330a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0140f) {
            if (AbstractC0307g.m699a(this.f330a, ((C0140f) obj).f330a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f330a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f330a + ')';
    }
}
