package p346x9;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: x9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5735b {

    /* JADX INFO: renamed from: a */
    public final String f23362a;

    /* JADX INFO: renamed from: b */
    public final String f23363b;

    /* JADX INFO: renamed from: c */
    public final boolean f23364c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5735b(String str, String str2, boolean z9) {
        str2.getClass();
        this.f23362a = str;
        this.f23363b = str2;
        this.f23364c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5735b)) {
            return false;
        }
        C5735b c5735b = (C5735b) obj;
        return this.f23362a.equals(c5735b.f23362a) && AbstractC1416l.m3825a(this.f23363b, c5735b.f23363b) && this.f23364c == c5735b.f23364c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f23364c) + AbstractC0921a.m2244g(this.f23362a.hashCode() * 31, 31, this.f23363b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC3199a.m6840m(")", AbstractC0255e.m1027p("KeywordMatch(keyword=", this.f23362a, ", content=", this.f23363b, ", group="), this.f23364c);
    }
}
