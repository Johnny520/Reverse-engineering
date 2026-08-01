package p299ub;

import p024b9.AbstractC1061t;
import p080f9.C2363j;

/* JADX INFO: renamed from: ub.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8622g {

    /* JADX INFO: renamed from: a */
    public final String f28688a;

    /* JADX INFO: renamed from: b */
    public final C2363j f28689b;

    public C8622g(String str, C2363j c2363j) {
        str.getClass();
        c2363j.getClass();
        this.f28688a = str;
        this.f28689b = c2363j;
    }

    /* JADX INFO: renamed from: a */
    public final String m33172a() {
        return this.f28688a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8622g)) {
            return false;
        }
        C8622g c8622g = (C8622g) obj;
        return AbstractC1061t.m3842c(this.f28688a, c8622g.f28688a) && AbstractC1061t.m3842c(this.f28689b, c8622g.f28689b);
    }

    public int hashCode() {
        return (this.f28688a.hashCode() * 31) + this.f28689b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f28688a + ", range=" + this.f28689b + ')';
    }
}
