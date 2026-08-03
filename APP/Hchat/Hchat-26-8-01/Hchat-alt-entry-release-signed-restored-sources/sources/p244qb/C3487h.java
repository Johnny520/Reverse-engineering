package p244qb;

import gg.AbstractC1416l;
import java.io.File;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: qb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3487h {

    /* JADX INFO: renamed from: a */
    public final boolean f11322a;

    /* JADX INFO: renamed from: b */
    public final File f11323b;

    /* JADX INFO: renamed from: c */
    public final String f11324c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3487h(File file, String str, boolean z9) {
        this.f11322a = z9;
        this.f11323b = file;
        this.f11324c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3487h)) {
            return false;
        }
        C3487h c3487h = (C3487h) obj;
        return this.f11322a == c3487h.f11322a && AbstractC1416l.m3825a(this.f11323b, c3487h.f11323b) && this.f11324c.equals(c3487h.f11324c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f11322a) * 31;
        File file = this.f11323b;
        return this.f11324c.hashCode() + ((iHashCode + (file == null ? 0 : file.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SaveResult(success=");
        sb2.append(this.f11322a);
        sb2.append(", file=");
        sb2.append(this.f11323b);
        sb2.append(", error=");
        return AbstractC0921a.m2255r(sb2, this.f11324c, ")");
    }
}
