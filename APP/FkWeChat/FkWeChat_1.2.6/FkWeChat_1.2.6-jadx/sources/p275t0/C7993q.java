package p275t0;

import p024b9.AbstractC1061t;
import p121i3.C3187q;
import p165l1.InterfaceC4499e;
import p275t0.C7948d1;

/* JADX INFO: renamed from: t0.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7993q implements C7948d1.b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e.c f26573a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4499e.c f26574b;

    /* JADX INFO: renamed from: c */
    public final int f26575c;

    public C7993q(InterfaceC4499e.c cVar, InterfaceC4499e.c cVar2, int i10) {
        this.f26573a = cVar;
        this.f26574b = cVar2;
        this.f26575c = i10;
    }

    @Override // p275t0.C7948d1.b
    /* JADX INFO: renamed from: a */
    public int mo30689a(C3187q c3187q, long j10, int i10) {
        int iMo17428a = this.f26574b.mo17428a(0, c3187q.m12067f());
        return c3187q.m12071j() + iMo17428a + (-this.f26573a.mo17428a(0, i10)) + this.f26575c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7993q)) {
            return false;
        }
        C7993q c7993q = (C7993q) obj;
        return AbstractC1061t.m3842c(this.f26573a, c7993q.f26573a) && AbstractC1061t.m3842c(this.f26574b, c7993q.f26574b) && this.f26575c == c7993q.f26575c;
    }

    public int hashCode() {
        return (((this.f26573a.hashCode() * 31) + this.f26574b.hashCode()) * 31) + Integer.hashCode(this.f26575c);
    }

    public String toString() {
        return "Vertical(menuAlignment=" + this.f26573a + ", anchorAlignment=" + this.f26574b + ", offset=" + this.f26575c + ')';
    }
}
