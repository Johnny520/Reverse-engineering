package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class to0 implements Cloneable {

    /* JADX INFO: renamed from: h */
    public i51 f10863h;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final to0 clone() {
        try {
            return (to0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5338d(Object obj) {
        if (obj instanceof to0) {
            return b93.m495b(this.f10863h, ((to0) obj).f10863h);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof to0) && m5338d(obj);
    }

    /* JADX INFO: renamed from: f */
    public final int m5339f() {
        i51 i51Var = this.f10863h;
        if (i51Var != null) {
            return i51Var.hashCode();
        }
        return 0;
    }

    public final int hashCode() {
        return m5339f();
    }
}
