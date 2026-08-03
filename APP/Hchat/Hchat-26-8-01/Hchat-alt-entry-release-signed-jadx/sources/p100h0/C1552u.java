package p100h0;

import p068eh.AbstractC0921a;
import p280t2.EnumC4094j;

/* JADX INFO: renamed from: h0.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1552u {

    /* JADX INFO: renamed from: a */
    public final EnumC4094j f5178a;

    /* JADX INFO: renamed from: b */
    public final int f5179b;

    /* JADX INFO: renamed from: c */
    public final long f5180c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1552u(EnumC4094j enumC4094j, int i9, long j3) {
        this.f5178a = enumC4094j;
        this.f5179b = i9;
        this.f5180c = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1552u)) {
            return false;
        }
        C1552u c1552u = (C1552u) obj;
        return this.f5178a == c1552u.f5178a && this.f5179b == c1552u.f5179b && this.f5180c == c1552u.f5180c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5180c) + AbstractC0921a.m2242e(this.f5179b, this.f5178a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnchorInfo(direction=" + this.f5178a + ", offset=" + this.f5179b + ", selectableId=" + this.f5180c + ')';
    }
}
