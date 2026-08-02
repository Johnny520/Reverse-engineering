package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ow1 implements Serializable {

    /* JADX INFO: renamed from: h */
    public final Object f7862h;

    /* JADX INFO: renamed from: i */
    public final Object f7863i;

    public ow1(Object obj, Object obj2) {
        this.f7862h = obj;
        this.f7863i = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow1)) {
            return false;
        }
        ow1 ow1Var = (ow1) obj;
        return t11.m5086l(this.f7862h, ow1Var.f7862h) && t11.m5086l(this.f7863i, ow1Var.f7863i);
    }

    public final int hashCode() {
        Object obj = this.f7862h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f7863i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f7862h + ", " + this.f7863i + ')';
    }
}
