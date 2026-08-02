package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends qy1 {

    /* JADX INFO: renamed from: c */
    public final float f7884c;

    public oy1(float f) {
        super(3);
        this.f7884c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy1) && Float.compare(this.f7884c, ((oy1) obj).f7884c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7884c);
    }

    public final String toString() {
        return vi0.m5693l(new StringBuilder("RelativeVerticalTo(dy="), this.f7884c, ')');
    }
}
