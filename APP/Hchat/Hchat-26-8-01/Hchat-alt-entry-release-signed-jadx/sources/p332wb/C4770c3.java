package p332wb;

import java.util.List;

/* JADX INFO: renamed from: wb.c3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4770c3 {

    /* JADX INFO: renamed from: a */
    public final String f16185a;

    /* JADX INFO: renamed from: b */
    public final List f16186b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4770c3(String str, List list) {
        this.f16185a = str;
        this.f16186b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4770c3)) {
            return false;
        }
        C4770c3 c4770c3 = (C4770c3) obj;
        return this.f16185a.equals(c4770c3.f16185a) && this.f16186b.equals(c4770c3.f16186b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16186b.hashCode() + (this.f16185a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FeatureGroupEntry(title=" + this.f16185a + ", providers=" + this.f16186b + ")";
    }
}
