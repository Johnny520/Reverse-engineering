package p041d1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: d1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1852b {

    /* JADX INFO: renamed from: a */
    public int f4895a;

    public /* synthetic */ C1852b(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m6549a() {
        return this.f4895a;
    }

    /* JADX INFO: renamed from: b */
    public final void m6550b(int i10) {
        this.f4895a += i10;
    }

    /* JADX INFO: renamed from: c */
    public final void m6551c(int i10) {
        this.f4895a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1852b) && this.f4895a == ((C1852b) obj).f4895a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f4895a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f4895a + ')';
    }

    public C1852b(int i10) {
        this.f4895a = i10;
    }
}
