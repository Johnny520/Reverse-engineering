package p190n0;

import p121i3.AbstractC3186p;
import p121i3.C3185o;
import p121i3.C3187q;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4499e;
import p180m3.InterfaceC4960u;
import p250r1.C6455e;

/* JADX INFO: renamed from: n0.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5406p implements InterfaceC4960u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4499e f16644a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5442v f16645b;

    /* JADX INFO: renamed from: c */
    public long f16646c = C6455e.f20314b.m25569c();

    public C5406p(InterfaceC4499e interfaceC4499e, InterfaceC5442v interfaceC5442v) {
        this.f16644a = interfaceC4499e;
        this.f16645b = interfaceC5442v;
    }

    @Override // p180m3.InterfaceC4960u
    /* JADX INFO: renamed from: a */
    public long mo8891a(C3187q c3187q, long j10, EnumC3191u enumC3191u, long j11) {
        long jMo3083a = this.f16645b.mo3083a();
        if ((9223372034707292159L & jMo3083a) == 9205357640488583168L) {
            jMo3083a = this.f16646c;
        }
        this.f16646c = jMo3083a;
        return C3185o.m12053m(C3185o.m12053m(c3187q.m12072k(), AbstractC3186p.m12061c(jMo3083a)), this.f16644a.mo17411a(j11, C3189s.f8481b.m12088a(), enumC3191u));
    }
}
