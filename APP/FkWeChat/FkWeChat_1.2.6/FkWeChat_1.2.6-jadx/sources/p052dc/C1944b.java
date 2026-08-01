package p052dc;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: dc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1944b {

    /* JADX INFO: renamed from: a */
    public int f5420a;

    public /* synthetic */ C1944b(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m7050a() {
        return this.f5420a;
    }

    /* JADX INFO: renamed from: b */
    public final void m7051b(int i10) {
        this.f5420a += i10;
    }

    /* JADX INFO: renamed from: c */
    public final void m7052c(int i10) {
        this.f5420a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1944b) && this.f5420a == ((C1944b) obj).f5420a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f5420a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f5420a + ')';
    }

    public C1944b(int i10) {
        this.f5420a = i10;
    }
}
