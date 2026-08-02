package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yp implements Comparable {
    public final int h;
    public final int i;
    public final wp j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yp(int i, int i2, wp wpVar) {
        if (i < 0) {
            s.j("start < 0");
            throw null;
        }
        if (i2 <= i) {
            s.j("end <= start");
            throw null;
        }
        if (wpVar.h) {
            s.j("handlers.isMutable()");
            throw null;
        }
        this.h = i;
        this.i = i2;
        this.j = wpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(yp ypVar) {
        int i = ypVar.h;
        int i2 = this.h;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = ypVar.i;
        int i4 = this.i;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.j.compareTo(ypVar.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof yp) && compareTo((yp) obj) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.j.i) + (((this.h * 31) + this.i) * 31);
    }
}
