package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: ok */
    private final boolean f7308ok;

    public ns0(boolean z) {
        this.f7308ok = z;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ns0 m3356c(ns0 ns0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ns0Var.f7308ok;
        }
        return ns0Var.m3358b(z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3357a() {
        return this.f7308ok;
    }

    /* JADX INFO: renamed from: b */
    public final ns0 m3358b(boolean z) {
        return new ns0(z);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3359d() {
        return this.f7308ok;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns0) && this.f7308ok == ((ns0) obj).f7308ok;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f7308ok);
    }

    public String toString() {
        return "Health(ok=" + this.f7308ok + ")";
    }
}
