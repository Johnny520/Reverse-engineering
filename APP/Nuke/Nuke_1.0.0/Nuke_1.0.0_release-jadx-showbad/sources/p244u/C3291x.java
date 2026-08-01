package p244u;

import p117X2.AbstractC1665j;
import p169h0.C2197f;

/* JADX INFO: renamed from: u.x */
/* JADX INFO: loaded from: classes.dex */
public final class C3291x {

    /* JADX INFO: renamed from: a */
    public final C2197f f10174a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3291x(C2197f c2197f) {
        this.f10174a = c2197f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3291x) && AbstractC1665j.m2981a(this.f10174a, ((C3291x) obj).f10174a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10174a.f7176a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f10174a + ')';
    }
}
