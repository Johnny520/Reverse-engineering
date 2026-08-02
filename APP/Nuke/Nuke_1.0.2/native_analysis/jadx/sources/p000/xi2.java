package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xi2 {

    /* JADX INFO: renamed from: a */
    public final List f13046a;

    /* JADX INFO: renamed from: b */
    public final List f13047b;

    public xi2(List list, List list2) {
        this.f13046a = list;
        this.f13047b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi2)) {
            return false;
        }
        xi2 xi2Var = (xi2) obj;
        return this.f13046a.equals(xi2Var.f13046a) && this.f13047b.equals(xi2Var.f13047b);
    }

    public final int hashCode() {
        return this.f13047b.hashCode() + (this.f13046a.hashCode() * 31);
    }

    public final String toString() {
        return "ScriptRepositorySnapshot(scripts=" + this.f13046a + ", issues=" + this.f13047b + ")";
    }
}
