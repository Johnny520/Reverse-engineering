package p129a0;

import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1786a {

    /* JADX INFO: renamed from: a */
    public int f6102a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1786a) && this.f6102a == ((C1786a) obj).f6102a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f6102a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3202a.m5466a(new StringBuilder("DeltaCounter(count="), this.f6102a, ')');
    }
}
