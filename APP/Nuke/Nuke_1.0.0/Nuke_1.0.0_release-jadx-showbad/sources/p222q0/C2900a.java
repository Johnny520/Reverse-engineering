package p222q0;

import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p204n0.C2686e;
import p211o0.InterfaceC2760s;

/* JADX INFO: renamed from: q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2900a {

    /* JADX INFO: renamed from: a */
    public InterfaceC2007c f9180a;

    /* JADX INFO: renamed from: b */
    public EnumC2017m f9181b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2760s f9182c;

    /* JADX INFO: renamed from: d */
    public long f9183d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2900a)) {
            return false;
        }
        C2900a c2900a = (C2900a) obj;
        return AbstractC1665j.m2981a(this.f9180a, c2900a.f9180a) && this.f9181b == c2900a.f9181b && AbstractC1665j.m2981a(this.f9182c, c2900a.f9182c) && C2686e.m4661a(this.f9183d, c2900a.f9183d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f9183d) + ((this.f9182c.hashCode() + ((this.f9181b.hashCode() + (this.f9180a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DrawParams(density=" + this.f9180a + ", layoutDirection=" + this.f9181b + ", canvas=" + this.f9182c + ", size=" + ((Object) C2686e.m4664d(this.f9183d)) + ')';
    }
}
