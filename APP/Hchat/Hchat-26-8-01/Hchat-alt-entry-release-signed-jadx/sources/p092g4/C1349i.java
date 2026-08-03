package p092g4;

import java.util.Arrays;
import p068eh.AbstractC0921a;
import p311v4.C4451c0;
import p311v4.C4476y;
import p311v4.C4477z;

/* JADX INFO: renamed from: g4.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1349i {

    /* JADX INFO: renamed from: a */
    public final C1350j f4462a;

    /* JADX INFO: renamed from: b */
    public final C1350j f4463b;

    /* JADX INFO: renamed from: c */
    public final String f4464c;

    /* JADX INFO: renamed from: d */
    public final C1351k f4465d;

    /* JADX INFO: renamed from: e */
    public final C4476y f4466e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1349i(C1350j c1350j, C1350j c1350j2, String str, C1351k c1351k) {
        if (c1350j2 == null || str == null) {
            throw null;
        }
        this.f4462a = c1350j;
        this.f4463b = c1350j2;
        this.f4464c = str;
        this.f4465d = c1351k;
        this.f4466e = new C4476y(c1350j.f4481c, new C4477z(new C4451c0(str), new C4451c0(m3625a(false))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m3625a(boolean z9) {
        StringBuilder sb2 = new StringBuilder("(");
        if (z9) {
            sb2.append(this.f4462a.f4479a);
        }
        for (C1350j c1350j : this.f4465d.f4482a) {
            sb2.append(c1350j.f4479a);
        }
        sb2.append(")");
        sb2.append(this.f4463b.f4479a);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1349i)) {
            return false;
        }
        C1349i c1349i = (C1349i) obj;
        return c1349i.f4462a.equals(this.f4462a) && c1349i.f4464c.equals(this.f4464c) && c1349i.f4465d.equals(this.f4465d) && c1349i.f4463b.equals(this.f4463b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4463b.f4479a.hashCode() + ((Arrays.hashCode(this.f4465d.f4482a) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(527, 31, this.f4462a.f4479a), 31, this.f4464c)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4462a + "." + this.f4464c + "(" + this.f4465d + ")";
    }
}
