package p274t;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3173c;
import p121i3.C3179i;
import p121i3.InterfaceC3175e;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: t.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7924y implements InterfaceC7919x, InterfaceC7894s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7899t f26401a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3175e f26402b;

    /* JADX INFO: renamed from: c */
    public final long f26403c;

    public C7924y(InterfaceC3175e interfaceC3175e, long j10) {
        this.f26401a = C7899t.f26336a;
        this.f26402b = interfaceC3175e;
        this.f26403c = j10;
    }

    @Override // p274t.InterfaceC7919x
    /* JADX INFO: renamed from: a */
    public float mo30572a() {
        return C3173c.m11969h(m30599c()) ? this.f26402b.mo1225O0(C3173c.m11973l(m30599c())) : C3179i.f8458r.m12011b();
    }

    @Override // p274t.InterfaceC7894s
    /* JADX INFO: renamed from: b */
    public InterfaceC4507m mo30487b(InterfaceC4507m interfaceC4507m, InterfaceC4499e interfaceC4499e) {
        return this.f26401a.mo30487b(interfaceC4507m, interfaceC4499e);
    }

    /* JADX INFO: renamed from: c */
    public long m30599c() {
        return this.f26403c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7924y)) {
            return false;
        }
        C7924y c7924y = (C7924y) obj;
        return AbstractC1061t.m3842c(this.f26402b, c7924y.f26402b) && C3173c.m11967f(this.f26403c, c7924y.f26403c);
    }

    public int hashCode() {
        return (this.f26402b.hashCode() * 31) + C3173c.m11976o(this.f26403c);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f26402b + ", constraints=" + ((Object) C3173c.m11977p(this.f26403c)) + ')';
    }

    public /* synthetic */ C7924y(InterfaceC3175e interfaceC3175e, long j10, AbstractC1043k abstractC1043k) {
        this(interfaceC3175e, j10);
    }
}
