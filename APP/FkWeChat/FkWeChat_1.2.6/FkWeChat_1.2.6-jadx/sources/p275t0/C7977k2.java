package p275t0;

import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p121i3.C3187q;
import p165l1.InterfaceC4499e;
import p275t0.C7948d1;

/* JADX INFO: renamed from: t0.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7977k2 implements C7948d1.b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e.c f26550a;

    /* JADX INFO: renamed from: b */
    public final int f26551b;

    public C7977k2(InterfaceC4499e.c cVar, int i10) {
        this.f26550a = cVar;
        this.f26551b = i10;
    }

    @Override // p275t0.C7948d1.b
    /* JADX INFO: renamed from: a */
    public int mo30689a(C3187q c3187q, long j10, int i10) {
        int i11 = (int) (j10 & 4294967295L);
        if (i10 >= i11 - (this.f26551b * 2)) {
            return InterfaceC4499e.f13028a.m17420i().mo17428a(i10, i11);
        }
        int iMo17428a = this.f26550a.mo17428a(i10, i11);
        int i12 = this.f26551b;
        return AbstractC2368o.m8586m(iMo17428a, i12, (i11 - i12) - i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7977k2)) {
            return false;
        }
        C7977k2 c7977k2 = (C7977k2) obj;
        return AbstractC1061t.m3842c(this.f26550a, c7977k2.f26550a) && this.f26551b == c7977k2.f26551b;
    }

    public int hashCode() {
        return (this.f26550a.hashCode() * 31) + Integer.hashCode(this.f26551b);
    }

    public String toString() {
        return "Vertical(alignment=" + this.f26550a + ", margin=" + this.f26551b + ')';
    }
}
