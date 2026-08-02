package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x92 implements Serializable {

    /* JADX INFO: renamed from: h */
    public final Throwable f12914h;

    public x92(Throwable th) {
        th.getClass();
        this.f12914h = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x92) {
            return t11.m5086l(this.f12914h, ((x92) obj).f12914h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12914h.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f12914h + ')';
    }
}
