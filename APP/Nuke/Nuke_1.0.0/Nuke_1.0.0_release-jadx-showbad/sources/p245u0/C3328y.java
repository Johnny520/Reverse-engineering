package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3328y extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10365c;

    /* JADX INFO: renamed from: d */
    public final float f10366d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3328y(float f2, float f5) {
        super(1);
        this.f10365c = f2;
        this.f10366d = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3328y)) {
            return false;
        }
        C3328y c3328y = (C3328y) obj;
        return Float.compare(this.f10365c, c3328y.f10365c) == 0 && Float.compare(this.f10366d, c3328y.f10366d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10366d) + (Float.hashCode(this.f10365c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f10365c);
        sb.append(", dy=");
        return AbstractC0231b.m401l(sb, this.f10366d, ')');
    }
}
