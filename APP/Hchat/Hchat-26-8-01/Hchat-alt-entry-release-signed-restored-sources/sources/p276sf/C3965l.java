package p276sf;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: sf.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3965l implements Comparable {

    /* JADX INFO: renamed from: g */
    public final byte f12974g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1416l.m3827c(this.f12974g & 255, ((C3965l) obj).f12974g & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C3965l) {
            return this.f12974g == ((C3965l) obj).f12974g;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Byte.hashCode(this.f12974g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(this.f12974g & 255);
    }
}
