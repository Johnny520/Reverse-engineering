package p056K2;

import java.io.Serializable;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: K2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0884j implements Serializable {

    /* JADX INFO: renamed from: d */
    public final Throwable f2771d;

    public C0884j(Throwable th) {
        AbstractC1665j.m2985e(th, "exception");
        this.f2771d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0884j) {
            return AbstractC1665j.m2981a(this.f2771d, ((C0884j) obj).f2771d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2771d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2771d + ')';
    }
}
