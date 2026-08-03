package p339x1;

import p068eh.AbstractC0921a;
import p292u1.AbstractC4229a;
import p293u2.C4236f;

/* JADX INFO: renamed from: x1.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5621l {

    /* JADX INFO: renamed from: a */
    public final float f22902a;

    /* JADX INFO: renamed from: b */
    public final float f22903b;

    /* JADX INFO: renamed from: c */
    public final float f22904c;

    /* JADX INFO: renamed from: d */
    public final float f22905d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5621l(float f3, float f10, float f11, float f12) {
        this.f22902a = f3;
        this.f22903b = f10;
        this.f22904c = f11;
        this.f22905d = f12;
        if (f3 < 0.0f) {
            AbstractC4229a.m8493a("Left must be non-negative");
        }
        if (f10 < 0.0f) {
            AbstractC4229a.m8493a("Top must be non-negative");
        }
        if (f11 < 0.0f) {
            AbstractC4229a.m8493a("Right must be non-negative");
        }
        if (f12 >= 0.0f) {
            return;
        }
        AbstractC4229a.m8493a("Bottom must be non-negative");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5621l)) {
            return false;
        }
        C5621l c5621l = (C5621l) obj;
        return C4236f.m8520b(this.f22902a, c5621l.f22902a) && C4236f.m8520b(this.f22903b, c5621l.f22903b) && C4236f.m8520b(this.f22904c, c5621l.f22904c) && C4236f.m8520b(this.f22905d, c5621l.f22905d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0921a.m2241d(this.f22905d, AbstractC0921a.m2241d(this.f22904c, AbstractC0921a.m2241d(this.f22903b, Float.hashCode(this.f22902a) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) C4236f.m8521c(this.f22902a)) + ", top=" + ((Object) C4236f.m8521c(this.f22903b)) + ", end=" + ((Object) C4236f.m8521c(this.f22904c)) + ", bottom=" + ((Object) C4236f.m8521c(this.f22905d)) + ", isLayoutDirectionAware=true)";
    }
}
