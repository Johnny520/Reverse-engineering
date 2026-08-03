package p036c9;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: c9.f2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0437f2 {

    /* JADX INFO: renamed from: a */
    public final boolean f1289a;

    /* JADX INFO: renamed from: b */
    public final int f1290b;

    /* JADX INFO: renamed from: c */
    public final String f1291c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0437f2(String str, int i9, boolean z9) {
        this.f1289a = z9;
        this.f1290b = i9;
        this.f1291c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0437f2)) {
            return false;
        }
        C0437f2 c0437f2 = (C0437f2) obj;
        return this.f1289a == c0437f2.f1289a && this.f1290b == c0437f2.f1290b && AbstractC1416l.m3825a(this.f1291c, c0437f2.f1291c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1291c.hashCode() + AbstractC0921a.m2242e(this.f1290b, Boolean.hashCode(this.f1289a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportResult(success=");
        sb2.append(this.f1289a);
        sb2.append(", groupCount=");
        sb2.append(this.f1290b);
        sb2.append(", message=");
        return AbstractC0921a.m2255r(sb2, this.f1291c, ")");
    }
}
