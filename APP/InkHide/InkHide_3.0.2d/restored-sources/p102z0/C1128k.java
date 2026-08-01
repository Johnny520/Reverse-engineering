package p102z0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: z0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1128k {

    /* JADX INFO: renamed from: a */
    public final List f3799a;

    /* JADX INFO: renamed from: b */
    public final List f3800b;

    /* JADX INFO: renamed from: c */
    public final int f3801c;

    /* JADX INFO: renamed from: d */
    public final String f3802d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1128k(List list, List list2, int i2, String str) {
        AbstractC0223g.m418e(str, "versionName");
        this.f3799a = list;
        this.f3800b = list2;
        this.f3801c = i2;
        this.f3802d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1128k)) {
            return false;
        }
        C1128k c1128k = (C1128k) obj;
        return AbstractC0223g.m414a(this.f3799a, c1128k.f3799a) && AbstractC0223g.m414a(this.f3800b, c1128k.f3800b) && this.f3801c == c1128k.f3801c && AbstractC0223g.m414a(this.f3802d, c1128k.f3802d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3802d.hashCode() + AbstractC0174d.m345a(this.f3801c, AbstractC0174d.m349e(this.f3800b, this.f3799a.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AvatarHookPoint(loadMethods=" + this.f3799a + ", hdGalleryMethods=" + this.f3800b + ", versionCode=" + this.f3801c + ", versionName=" + this.f3802d + ")";
    }
}
