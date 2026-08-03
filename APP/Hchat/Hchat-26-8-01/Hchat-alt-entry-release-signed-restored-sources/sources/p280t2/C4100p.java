package p280t2;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: t2.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4100p {

    /* JADX INFO: renamed from: c */
    public static final C4100p f13564c = new C4100p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f13565a;

    /* JADX INFO: renamed from: b */
    public final float f13566b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4100p(float f3, float f10) {
        this.f13565a = f3;
        this.f13566b = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4100p)) {
            return false;
        }
        C4100p c4100p = (C4100p) obj;
        return this.f13565a == c4100p.f13565a && this.f13566b == c4100p.f13566b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13566b) + (Float.hashCode(this.f13565a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f13565a);
        sb2.append(", skewX=");
        return AbstractC0921a.m2252o(sb2, this.f13566b, ')');
    }
}
