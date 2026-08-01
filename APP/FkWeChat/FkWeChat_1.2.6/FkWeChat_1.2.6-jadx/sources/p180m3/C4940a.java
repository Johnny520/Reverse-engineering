package p180m3;

import p024b9.AbstractC1043k;
import p121i3.C3185o;
import p121i3.C3187q;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4499e;

/* JADX INFO: renamed from: m3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4940a implements InterfaceC4960u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e f14949a;

    /* JADX INFO: renamed from: b */
    public final long f14950b;

    public C4940a(InterfaceC4499e interfaceC4499e, long j10) {
        this.f14949a = interfaceC4499e;
        this.f14950b = j10;
    }

    @Override // p180m3.InterfaceC4960u
    /* JADX INFO: renamed from: a */
    public long mo8891a(C3187q c3187q, long j10, EnumC3191u enumC3191u, long j11) {
        InterfaceC4499e interfaceC4499e = this.f14949a;
        C3189s.a aVar = C3189s.f8481b;
        long jMo17411a = interfaceC4499e.mo17411a(aVar.m12088a(), c3187q.m12070i(), enumC3191u);
        return C3185o.m12053m(C3185o.m12053m(C3185o.m12053m(c3187q.m12072k(), jMo17411a), C3185o.m12055o(this.f14949a.mo17411a(aVar.m12088a(), j11, enumC3191u))), C3185o.m12044d((((long) (C3185o.m12049i(this.f14950b) * (enumC3191u == EnumC3191u.f8484q ? 1 : -1))) << 32) | (((long) C3185o.m12050j(this.f14950b)) & 4294967295L)));
    }

    public /* synthetic */ C4940a(InterfaceC4499e interfaceC4499e, long j10, AbstractC1043k abstractC1043k) {
        this(interfaceC4499e, j10);
    }
}
