package p092S0;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1262O implements InterfaceC1264b {

    /* JADX INFO: renamed from: a */
    public final String f4544a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1262O(String str) {
        this.f4544a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1262O) {
            return AbstractC1665j.m2981a(this.f4544a, ((C1262O) obj).f4544a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4544a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f4544a, ')');
    }
}
