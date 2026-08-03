package p346x9;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: x9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5739f {

    /* JADX INFO: renamed from: a */
    public final String f23384a;

    /* JADX INFO: renamed from: b */
    public final boolean f23385b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5739f(String str, boolean z9) {
        str.getClass();
        this.f23384a = str;
        this.f23385b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5739f)) {
            return false;
        }
        C5739f c5739f = (C5739f) obj;
        return AbstractC1416l.m3825a(this.f23384a, c5739f.f23384a) && this.f23385b == c5739f.f23385b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f23385b) + (this.f23384a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "KeywordRule(keyword=" + this.f23384a + ", wholeWord=" + this.f23385b + ")";
    }
}
