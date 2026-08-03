package p049b0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0559i extends AbstractC0560j {

    /* JADX INFO: renamed from: a */
    public final String f1657a;

    public C0559i(String str) {
        this.f1657a = str;
    }

    @Override // p049b0.AbstractC0560j
    /* JADX INFO: renamed from: a */
    public final String mo1370a() {
        return this.f1657a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0559i) && AbstractC0307g.m699a(this.f1657a, ((C0559i) obj).f1657a);
    }

    public final int hashCode() {
        return this.f1657a.hashCode();
    }

    public final String toString() {
        return "PARTIAL(detail=" + this.f1657a + ")";
    }
}
