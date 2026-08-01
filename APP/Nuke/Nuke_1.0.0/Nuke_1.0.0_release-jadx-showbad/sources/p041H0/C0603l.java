package p041H0;

import p011B4.AbstractC0231b;
import p023E0.AbstractC0277a;
import p153e1.C2010f;

/* JADX INFO: renamed from: H0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0603l {

    /* JADX INFO: renamed from: a */
    public final float f1951a;

    /* JADX INFO: renamed from: b */
    public final float f1952b;

    /* JADX INFO: renamed from: c */
    public final float f1953c;

    /* JADX INFO: renamed from: d */
    public final float f1954d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0603l(float f2, float f5, float f6, float f7) {
        this.f1951a = f2;
        this.f1952b = f5;
        this.f1953c = f6;
        this.f1954d = f7;
        if (f2 < 0.0f) {
            AbstractC0277a.m482a("Left must be non-negative");
        }
        if (f5 < 0.0f) {
            AbstractC0277a.m482a("Top must be non-negative");
        }
        if (f6 < 0.0f) {
            AbstractC0277a.m482a("Right must be non-negative");
        }
        if (f7 >= 0.0f) {
            return;
        }
        AbstractC0277a.m482a("Bottom must be non-negative");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0603l)) {
            return false;
        }
        C0603l c0603l = (C0603l) obj;
        return C2010f.m3696b(this.f1951a, c0603l.f1951a) && C2010f.m3696b(this.f1952b, c0603l.f1952b) && C2010f.m3696b(this.f1953c, c0603l.f1953c) && C2010f.m3696b(this.f1954d, c0603l.f1954d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0231b.m390a(this.f1954d, AbstractC0231b.m390a(this.f1953c, AbstractC0231b.m390a(this.f1952b, Float.hashCode(this.f1951a) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) C2010f.m3697c(this.f1951a)) + ", top=" + ((Object) C2010f.m3697c(this.f1952b)) + ", end=" + ((Object) C2010f.m3697c(this.f1953c)) + ", bottom=" + ((Object) C2010f.m3697c(this.f1954d)) + ", isLayoutDirectionAware=true)";
    }
}
