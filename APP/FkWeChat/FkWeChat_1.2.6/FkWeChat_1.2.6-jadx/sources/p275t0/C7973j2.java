package p275t0;

import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p121i3.C3187q;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4499e;
import p275t0.C7948d1;

/* JADX INFO: renamed from: t0.j2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7973j2 implements C7948d1.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e.b f26547a;

    /* JADX INFO: renamed from: b */
    public final int f26548b;

    public C7973j2(InterfaceC4499e.b bVar, int i10) {
        this.f26547a = bVar;
        this.f26548b = i10;
    }

    @Override // p275t0.C7948d1.a
    /* JADX INFO: renamed from: a */
    public int mo30688a(C3187q c3187q, long j10, int i10, EnumC3191u enumC3191u) {
        int i11 = (int) (j10 >> 32);
        if (i10 >= i11 - (this.f26548b * 2)) {
            return InterfaceC4499e.f13028a.m17418g().mo17427a(i10, i11, enumC3191u);
        }
        int iMo17427a = this.f26547a.mo17427a(i10, i11, enumC3191u);
        int i12 = this.f26548b;
        return AbstractC2368o.m8586m(iMo17427a, i12, (i11 - i12) - i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7973j2)) {
            return false;
        }
        C7973j2 c7973j2 = (C7973j2) obj;
        return AbstractC1061t.m3842c(this.f26547a, c7973j2.f26547a) && this.f26548b == c7973j2.f26548b;
    }

    public int hashCode() {
        return (this.f26547a.hashCode() * 31) + Integer.hashCode(this.f26548b);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.f26547a + ", margin=" + this.f26548b + ')';
    }
}
