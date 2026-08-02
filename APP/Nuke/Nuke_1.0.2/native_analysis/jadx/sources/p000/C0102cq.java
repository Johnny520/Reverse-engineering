package p000;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: cq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0102cq {

    /* JADX INFO: renamed from: c */
    public static final C0102cq f1665c = new C0102cq(AbstractC0142du.m1153K0(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set f1666a;

    /* JADX INFO: renamed from: b */
    public final up0 f1667b;

    public C0102cq(Set set, up0 up0Var) {
        this.f1666a = set;
        this.f1667b = up0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0102cq)) {
            return false;
        }
        C0102cq c0102cq = (C0102cq) obj;
        return c0102cq.f1666a.equals(this.f1666a) && t11.m5086l(c0102cq.f1667b, this.f1667b);
    }

    public final int hashCode() {
        int iHashCode = (this.f1666a.hashCode() + 1517) * 41;
        up0 up0Var = this.f1667b;
        return iHashCode + (up0Var != null ? up0Var.hashCode() : 0);
    }
}
