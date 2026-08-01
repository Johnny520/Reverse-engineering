package p275t0;

import p024b9.AbstractC1061t;
import p121i3.C3187q;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4499e;
import p275t0.C7948d1;

/* JADX INFO: renamed from: t0.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7990p implements C7948d1.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e.b f26564a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4499e.b f26565b;

    /* JADX INFO: renamed from: c */
    public final int f26566c;

    public C7990p(InterfaceC4499e.b bVar, InterfaceC4499e.b bVar2, int i10) {
        this.f26564a = bVar;
        this.f26565b = bVar2;
        this.f26566c = i10;
    }

    @Override // p275t0.C7948d1.a
    /* JADX INFO: renamed from: a */
    public int mo30688a(C3187q c3187q, long j10, int i10, EnumC3191u enumC3191u) {
        int iMo17427a = this.f26565b.mo17427a(0, c3187q.m12073l(), enumC3191u);
        int i11 = -this.f26564a.mo17427a(0, i10, enumC3191u);
        EnumC3191u enumC3191u2 = EnumC3191u.f8484q;
        int i12 = this.f26566c;
        if (enumC3191u != enumC3191u2) {
            i12 = -i12;
        }
        return c3187q.m12068g() + iMo17427a + i11 + i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7990p)) {
            return false;
        }
        C7990p c7990p = (C7990p) obj;
        return AbstractC1061t.m3842c(this.f26564a, c7990p.f26564a) && AbstractC1061t.m3842c(this.f26565b, c7990p.f26565b) && this.f26566c == c7990p.f26566c;
    }

    public int hashCode() {
        return (((this.f26564a.hashCode() * 31) + this.f26565b.hashCode()) * 31) + Integer.hashCode(this.f26566c);
    }

    public String toString() {
        return "Horizontal(menuAlignment=" + this.f26564a + ", anchorAlignment=" + this.f26565b + ", offset=" + this.f26566c + ')';
    }
}
