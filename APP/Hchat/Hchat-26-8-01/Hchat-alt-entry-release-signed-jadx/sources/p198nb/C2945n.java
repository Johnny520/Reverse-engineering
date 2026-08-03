package p198nb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: nb.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2945n extends AbstractC2943l {

    /* JADX INFO: renamed from: a */
    public final String f9659a;

    /* JADX INFO: renamed from: b */
    public int f9660b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2945n(String str) {
        str.getClass();
        this.f9659a = str;
        this.f9660b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2945n)) {
            return false;
        }
        C2945n c2945n = (C2945n) obj;
        return AbstractC1416l.m3825a(this.f9659a, c2945n.f9659a) && this.f9660b == c2945n.f9660b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f9660b) + (this.f9659a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Speech(text=" + this.f9659a + ", resumeOffset=" + this.f9660b + ")";
    }
}
