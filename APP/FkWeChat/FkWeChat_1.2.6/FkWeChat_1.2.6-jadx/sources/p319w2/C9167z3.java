package p319w2;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: w2.z3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9167z3 extends AbstractC9157x3 {

    /* JADX INFO: renamed from: a */
    public final String f31252a;

    public C9167z3(String str) {
        super(null);
        this.f31252a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m35609a() {
        return this.f31252a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9167z3) && AbstractC1061t.m3842c(this.f31252a, ((C9167z3) obj).f31252a);
    }

    public int hashCode() {
        return this.f31252a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f31252a + ')';
    }
}
