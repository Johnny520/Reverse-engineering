package p133j2;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: j2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2055e {

    /* JADX INFO: renamed from: a */
    public final int f6900a;

    /* JADX INFO: renamed from: b */
    public final int f6901b;

    /* JADX INFO: renamed from: c */
    public final boolean f6902c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2055e(int i9, int i10, boolean z9) {
        this.f6900a = i9;
        this.f6901b = i10;
        this.f6902c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2055e)) {
            return false;
        }
        C2055e c2055e = (C2055e) obj;
        return this.f6900a == c2055e.f6900a && this.f6901b == c2055e.f6901b && this.f6902c == c2055e.f6902c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f6902c) + AbstractC0921a.m2242e(this.f6901b, Integer.hashCode(this.f6900a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BidiRun(start=" + this.f6900a + ", end=" + this.f6901b + ", isRtl=" + this.f6902c + ')';
    }
}
