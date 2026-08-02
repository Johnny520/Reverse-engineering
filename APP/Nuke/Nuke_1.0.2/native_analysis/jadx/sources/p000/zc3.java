package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zc3 implements bd3 {

    /* JADX INFO: renamed from: a */
    public final xc3 f13836a;

    public zc3(xc3 xc3Var) {
        this.f13836a = xc3Var;
    }

    @Override // p000.bd3
    /* JADX INFO: renamed from: a */
    public final /* bridge */ Object mo514a() {
        return (Void) super.mo514a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc3) && this.f13836a.equals(((zc3) obj).f13836a);
    }

    public final int hashCode() {
        return this.f13836a.hashCode();
    }

    public final String toString() {
        return "Err(error=" + this.f13836a + ")";
    }
}
