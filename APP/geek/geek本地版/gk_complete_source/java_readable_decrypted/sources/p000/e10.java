package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e10 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f1660a;

    public e10(Throwable th) {
        AbstractC0346ip.m1503o("exception", th);
        this.f1660a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e10) {
            return AbstractC0346ip.m1497i(this.f1660a, ((e10) obj).f1660a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1660a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1660a + ')';
    }
}
