package p000;

/* JADX INFO: renamed from: ha */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0270ha implements m12 {

    /* JADX INFO: renamed from: b */
    public final int f3929b;

    public C0270ha(int i) {
        this.f3929b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0270ha.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f3929b == ((C0270ha) obj).f3929b;
    }

    public final int hashCode() {
        return this.f3929b;
    }

    public final String toString() {
        return vi0.m5694m(new StringBuilder("AndroidPointerIcon(type="), this.f3929b, ')');
    }
}
