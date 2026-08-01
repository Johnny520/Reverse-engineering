package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class l10 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f2894a;

    public l10(Throwable th) {
        AbstractC0493mp.m1857g("exception", th);
        this.f2894a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l10) {
            return AbstractC0493mp.m1853c(this.f2894a, ((l10) obj).f2894a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2894a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2894a + ')';
    }
}
