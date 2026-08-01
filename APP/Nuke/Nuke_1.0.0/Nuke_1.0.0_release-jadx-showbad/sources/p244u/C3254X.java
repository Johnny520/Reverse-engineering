package p244u;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: u.X */
/* JADX INFO: loaded from: classes.dex */
public final class C3254X {

    /* JADX INFO: renamed from: a */
    public float f10068a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f10069b = true;

    /* JADX INFO: renamed from: c */
    public C3291x f10070c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3254X)) {
            return false;
        }
        C3254X c3254x = (C3254X) obj;
        return Float.compare(this.f10068a, c3254x.f10068a) == 0 && this.f10069b == c3254x.f10069b && AbstractC1665j.m2981a(this.f10070c, c3254x.f10070c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM395f = AbstractC0231b.m395f(Float.hashCode(this.f10068a) * 31, 31, this.f10069b);
        C3291x c3291x = this.f10070c;
        return (iM395f + (c3291x == null ? 0 : c3291x.hashCode())) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowColumnParentData(weight=" + this.f10068a + ", fill=" + this.f10069b + ", crossAxisAlignment=" + this.f10070c + ", flowLayoutData=null)";
    }
}
