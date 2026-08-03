package p259r9;

import java.util.List;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: r9.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3769s {

    /* JADX INFO: renamed from: a */
    public final int f12326a;

    /* JADX INFO: renamed from: b */
    public final int f12327b;

    /* JADX INFO: renamed from: c */
    public final int f12328c;

    /* JADX INFO: renamed from: d */
    public final int f12329d;

    /* JADX INFO: renamed from: e */
    public final boolean f12330e;

    /* JADX INFO: renamed from: f */
    public final List f12331f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3769s(int i9, int i10, int i11, int i12, boolean z9, List list) {
        this.f12326a = i9;
        this.f12327b = i10;
        this.f12328c = i11;
        this.f12329d = i12;
        this.f12330e = z9;
        this.f12331f = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3769s m7925a(C3769s c3769s, int i9, int i10, int i11) {
        int i12 = c3769s.f12326a;
        int i13 = c3769s.f12327b;
        if ((i11 & 4) != 0) {
            i9 = c3769s.f12328c;
        }
        int i14 = i9;
        if ((i11 & 8) != 0) {
            i10 = c3769s.f12329d;
        }
        return new C3769s(i12, i13, i14, i10, c3769s.f12330e, c3769s.f12331f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3769s)) {
            return false;
        }
        C3769s c3769s = (C3769s) obj;
        return this.f12326a == c3769s.f12326a && this.f12327b == c3769s.f12327b && this.f12328c == c3769s.f12328c && this.f12329d == c3769s.f12329d && this.f12330e == c3769s.f12330e && this.f12331f.equals(c3769s.f12331f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12331f.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f12329d, AbstractC0921a.m2242e(this.f12328c, AbstractC0921a.m2242e(this.f12327b, Integer.hashCode(this.f12326a) * 31, 31), 31), 31), 31, this.f12330e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2256s = AbstractC0921a.m2256s(this.f12326a, this.f12327b, "AvatarDetailsSpacing(originalTop=", ", originalBottom=", ", appliedTop=");
        AbstractC4855en.m9272p(sbM2256s, this.f12328c, ", appliedBottom=", this.f12329d, ", originalClipToPadding=");
        sbM2256s.append(this.f12330e);
        sbM2256s.append(", clipStates=");
        sbM2256s.append(this.f12331f);
        sbM2256s.append(")");
        return sbM2256s.toString();
    }
}
