package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C3327x extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10361c;

    /* JADX INFO: renamed from: d */
    public final float f10362d;

    /* JADX INFO: renamed from: e */
    public final float f10363e;

    /* JADX INFO: renamed from: f */
    public final float f10364f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3327x(float f2, float f5, float f6, float f7) {
        super(2);
        this.f10361c = f2;
        this.f10362d = f5;
        this.f10363e = f6;
        this.f10364f = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3327x)) {
            return false;
        }
        C3327x c3327x = (C3327x) obj;
        return Float.compare(this.f10361c, c3327x.f10361c) == 0 && Float.compare(this.f10362d, c3327x.f10362d) == 0 && Float.compare(this.f10363e, c3327x.f10363e) == 0 && Float.compare(this.f10364f, c3327x.f10364f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10364f) + AbstractC0231b.m390a(this.f10363e, AbstractC0231b.m390a(this.f10362d, Float.hashCode(this.f10361c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f10361c);
        sb.append(", dy1=");
        sb.append(this.f10362d);
        sb.append(", dx2=");
        sb.append(this.f10363e);
        sb.append(", dy2=");
        return AbstractC0231b.m401l(sb, this.f10364f, ')');
    }
}
