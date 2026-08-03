package p036c9;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: c9.p2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477p2 {

    /* JADX INFO: renamed from: a */
    public final String f1414a;

    /* JADX INFO: renamed from: b */
    public final boolean f1415b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0477p2(String str, boolean z9) {
        str.getClass();
        this.f1414a = str;
        this.f1415b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0477p2)) {
            return false;
        }
        C0477p2 c0477p2 = (C0477p2) obj;
        return AbstractC1416l.m3825a(this.f1414a, c0477p2.f1414a) && this.f1415b == c0477p2.f1415b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f1415b) + (this.f1414a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DocumentResult(message=" + this.f1414a + ", changed=" + this.f1415b + ")";
    }
}
