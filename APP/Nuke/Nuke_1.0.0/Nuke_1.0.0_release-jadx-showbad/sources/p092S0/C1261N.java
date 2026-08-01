package p092S0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1261N implements InterfaceC1264b {

    /* JADX INFO: renamed from: a */
    public final String f4543a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1261N(String str) {
        this.f4543a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1261N) {
            return AbstractC1665j.m2981a(this.f4543a, ((C1261N) obj).f4543a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4543a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("UrlAnnotation(url="), this.f4543a, ')');
    }
}
