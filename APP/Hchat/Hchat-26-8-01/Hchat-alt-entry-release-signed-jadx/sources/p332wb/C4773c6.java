package p332wb;

import gg.AbstractC1416l;
import java.util.Set;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wb.c6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4773c6 {

    /* JADX INFO: renamed from: a */
    public final boolean f16200a;

    /* JADX INFO: renamed from: b */
    public final Set f16201b;

    /* JADX INFO: renamed from: c */
    public final String f16202c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4773c6(boolean z9, Set set, String str) {
        set.getClass();
        str.getClass();
        this.f16200a = z9;
        this.f16201b = set;
        this.f16202c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4773c6)) {
            return false;
        }
        C4773c6 c4773c6 = (C4773c6) obj;
        return this.f16200a == c4773c6.f16200a && AbstractC1416l.m3825a(this.f16201b, c4773c6.f16201b) && AbstractC1416l.m3825a(this.f16202c, c4773c6.f16202c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16202c.hashCode() + ((this.f16201b.hashCode() + (Boolean.hashCode(this.f16200a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageBlockRuleState(typeAll=");
        sb2.append(this.f16200a);
        sb2.append(", types=");
        sb2.append(this.f16201b);
        sb2.append(", textKeywords=");
        return AbstractC0921a.m2255r(sb2, this.f16202c, ")");
    }
}
