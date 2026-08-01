package p095T;

import p117X2.AbstractC1665j;
import p163g0.InterfaceC2171c;

/* JADX INFO: renamed from: T.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1395x implements InterfaceC2171c {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1389u f4944d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1395x(InterfaceC1389u interfaceC1389u) {
        this.f4944d = interfaceC1389u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1395x) {
            return AbstractC1665j.m2981a(this.f4944d, ((C1395x) obj).f4944d);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4944d.hashCode() * 31;
    }
}
