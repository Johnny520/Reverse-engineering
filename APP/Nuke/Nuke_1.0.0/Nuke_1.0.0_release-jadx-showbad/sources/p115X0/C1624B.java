package p115X0;

import p000A.C0042V0;
import p092S0.C1269g;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: X0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1624B {

    /* JADX INFO: renamed from: a */
    public final C1269g f5585a;

    /* JADX INFO: renamed from: b */
    public final C0042V0 f5586b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1624B(C1269g c1269g, C0042V0 c0042v0) {
        this.f5585a = c1269g;
        this.f5586b = c0042v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1624B)) {
            return false;
        }
        C1624B c1624b = (C1624B) obj;
        return AbstractC1665j.m2981a(this.f5585a, c1624b.f5585a) && AbstractC1665j.m2981a(this.f5586b, c1624b.f5586b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5586b.hashCode() + (this.f5585a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f5585a) + ", offsetMapping=" + this.f5586b + ')';
    }
}
