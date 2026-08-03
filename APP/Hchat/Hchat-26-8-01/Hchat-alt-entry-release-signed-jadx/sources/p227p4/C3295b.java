package p227p4;

import p136j8.C2104o;
import p311v4.C4453d0;

/* JADX INFO: renamed from: p4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3295b implements Comparable {

    /* JADX INFO: renamed from: g */
    public final C4453d0 f10475g;

    /* JADX INFO: renamed from: h */
    public final int f10476h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3295b(C4453d0 c4453d0, int i9) {
        if (i9 < 0) {
            C2104o.m5294t("handler < 0");
            throw null;
        }
        this.f10476h = i9;
        this.f10475g = c4453d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3295b c3295b) {
        int i9 = c3295b.f10476h;
        int i10 = this.f10476h;
        if (i10 < i9) {
            return -1;
        }
        if (i10 > i9) {
            return 1;
        }
        return this.f10475g.compareTo(c3295b.f10475g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C3295b) && compareTo((C3295b) obj) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10475g.hashCode() + (this.f10476h * 31);
    }
}
