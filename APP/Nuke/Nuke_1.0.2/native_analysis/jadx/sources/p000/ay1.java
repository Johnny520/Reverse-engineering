package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f443c;

    public ay1(float f) {
        super(3);
        this.f443c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay1) && Float.compare(this.f443c, ((ay1) obj).f443c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f443c);
    }

    public final String toString() {
        return vi0.m5693l(new StringBuilder("HorizontalTo(x="), this.f443c, ')');
    }
}
