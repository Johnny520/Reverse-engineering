package p056K2;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: K2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0889o implements Comparable {

    /* JADX INFO: renamed from: d */
    public final byte f2778d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1665j.m2987g(this.f2778d & 255, ((C0889o) obj).f2778d & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0889o) {
            return this.f2778d == ((C0889o) obj).f2778d;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Byte.hashCode(this.f2778d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(this.f2778d & 255);
    }
}
