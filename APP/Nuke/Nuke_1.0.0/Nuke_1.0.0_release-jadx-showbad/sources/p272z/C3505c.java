package p272z;

import p153e1.InterfaceC2007c;
import p204n0.C2686e;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: z.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3505c implements InterfaceC3503a {

    /* JADX INFO: renamed from: a */
    public final float f10913a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3505c(float f2) {
        this.f10913a = f2;
        if (f2 < 0.0f || f2 > 100.0f) {
            AbstractC3204b.m5475a("The percent should be in the range of [0, 100]");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p272z.InterfaceC3503a
    /* JADX INFO: renamed from: a */
    public final float mo5759a(long j5, InterfaceC2007c interfaceC2007c) {
        return (this.f10913a / 100.0f) * C2686e.m4662b(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3505c) && Float.compare(this.f10913a, ((C3505c) obj).f10913a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10913a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CornerSize(size = " + this.f10913a + "%)";
    }
}
