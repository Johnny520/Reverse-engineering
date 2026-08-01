package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3325v extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10355c;

    /* JADX INFO: renamed from: d */
    public final float f10356d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3325v(float f2, float f5) {
        super(3);
        this.f10355c = f2;
        this.f10356d = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3325v)) {
            return false;
        }
        C3325v c3325v = (C3325v) obj;
        return Float.compare(this.f10355c, c3325v.f10355c) == 0 && Float.compare(this.f10356d, c3325v.f10356d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10356d) + (Float.hashCode(this.f10355c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f10355c);
        sb.append(", dy=");
        return AbstractC0231b.m401l(sb, this.f10356d, ')');
    }
}
