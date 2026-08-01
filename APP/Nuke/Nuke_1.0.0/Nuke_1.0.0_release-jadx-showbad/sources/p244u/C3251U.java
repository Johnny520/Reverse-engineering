package p244u;

import p011B4.AbstractC0231b;
import p153e1.C2010f;
import p250v.AbstractC3349a;

/* JADX INFO: renamed from: u.U */
/* JADX INFO: loaded from: classes.dex */
public final class C3251U {

    /* JADX INFO: renamed from: a */
    public final float f10063a;

    /* JADX INFO: renamed from: b */
    public final float f10064b;

    /* JADX INFO: renamed from: c */
    public final float f10065c;

    /* JADX INFO: renamed from: d */
    public final float f10066d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3251U(float f2, float f5, float f6, float f7) {
        this.f10063a = f2;
        this.f10064b = f5;
        this.f10065c = f6;
        this.f10066d = f7;
        if (!((f2 >= 0.0f) & (f5 >= 0.0f) & (f6 >= 0.0f)) || !(f7 >= 0.0f)) {
            AbstractC3349a.m5598a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3251U)) {
            return false;
        }
        C3251U c3251u = (C3251U) obj;
        return C2010f.m3696b(this.f10063a, c3251u.f10063a) && C2010f.m3696b(this.f10064b, c3251u.f10064b) && C2010f.m3696b(this.f10065c, c3251u.f10065c) && C2010f.m3696b(this.f10066d, c3251u.f10066d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10066d) + AbstractC0231b.m390a(this.f10065c, AbstractC0231b.m390a(this.f10064b, Float.hashCode(this.f10063a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PaddingValues(start=" + ((Object) C2010f.m3697c(this.f10063a)) + ", top=" + ((Object) C2010f.m3697c(this.f10064b)) + ", end=" + ((Object) C2010f.m3697c(this.f10065c)) + ", bottom=" + ((Object) C2010f.m3697c(this.f10066d)) + ')';
    }
}
