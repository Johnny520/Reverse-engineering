package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bi2 {

    /* JADX INFO: renamed from: a */
    public final boolean f890a;

    /* JADX INFO: renamed from: b */
    public final int f891b;

    public bi2(int i, boolean z) {
        this.f890a = z;
        this.f891b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi2)) {
            return false;
        }
        bi2 bi2Var = (bi2) obj;
        return this.f890a == bi2Var.f890a && this.f891b == bi2Var.f891b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f891b) + (Boolean.hashCode(this.f890a) * 31);
    }

    public final String toString() {
        return "ScriptMessageDispatchResult(moduleLoaded=" + this.f890a + ", listenerCount=" + this.f891b + ")";
    }
}
