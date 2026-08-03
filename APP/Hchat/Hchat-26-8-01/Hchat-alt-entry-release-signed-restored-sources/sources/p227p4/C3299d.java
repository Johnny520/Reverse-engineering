package p227p4;

import java.util.Arrays;
import p136j8.C2104o;

/* JADX INFO: renamed from: p4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3299d implements Comparable {

    /* JADX INFO: renamed from: g */
    public final int f10479g;

    /* JADX INFO: renamed from: h */
    public final int f10480h;

    /* JADX INFO: renamed from: i */
    public final C3297c f10481i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3299d(int i9, int i10, C3297c c3297c) {
        if (i9 < 0) {
            C2104o.m5294t("start < 0");
            throw null;
        }
        if (i10 <= i9) {
            C2104o.m5294t("end <= start");
            throw null;
        }
        if (c3297c.f24613g) {
            C2104o.m5294t("handlers.isMutable()");
            throw null;
        }
        this.f10479g = i9;
        this.f10480h = i10;
        this.f10481i = c3297c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3299d c3299d) {
        int i9 = c3299d.f10479g;
        int i10 = this.f10479g;
        if (i10 < i9) {
            return -1;
        }
        if (i10 > i9) {
            return 1;
        }
        int i11 = c3299d.f10480h;
        int i12 = this.f10480h;
        if (i12 < i11) {
            return -1;
        }
        if (i12 > i11) {
            return 1;
        }
        return this.f10481i.compareTo(c3299d.f10481i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C3299d) && compareTo((C3299d) obj) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f10481i.f24601h) + (((this.f10479g * 31) + this.f10480h) * 31);
    }
}
