package p202o;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p121i3.AbstractC3188r;
import p121i3.C3185o;
import p121i3.C3187q;
import p121i3.EnumC3191u;
import p180m3.InterfaceC4960u;

/* JADX INFO: renamed from: o.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5603l implements InterfaceC4960u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f17524a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p f17525b;

    public /* synthetic */ C5603l(long j10, InterfaceC0188p interfaceC0188p, int i10, AbstractC1043k abstractC1043k) {
        this(j10, (i10 & 2) != 0 ? null : interfaceC0188p, null);
    }

    /* JADX INFO: renamed from: b */
    public static C3185o m22711b(long j10) {
        return C3185o.m12043c(j10);
    }

    @Override // p180m3.InterfaceC4960u
    /* JADX INFO: renamed from: a */
    public long mo8891a(C3187q c3187q, long j10, EnumC3191u enumC3191u, long j11) {
        long jM12056p = ((C3185o) this.f17524a.invoke()).m12056p();
        long jM12044d = C3185o.m12044d((((long) AbstractC5604m.m22713b(c3187q.m12068g() + C3185o.m12049i(jM12056p), (int) (j11 >> 32), (int) (j10 >> 32), enumC3191u == EnumC3191u.f8484q)) << 32) | (4294967295L & ((long) AbstractC5604m.m22714c(c3187q.m12071j() + C3185o.m12050j(jM12056p), (int) (j11 & 4294967295L), (int) (j10 & 4294967295L), false, 8, null))));
        InterfaceC0188p interfaceC0188p = this.f17525b;
        if (interfaceC0188p != null) {
            interfaceC0188p.invoke(C3185o.m12043c(jM12056p), AbstractC3188r.m12077a(jM12044d, j11));
        }
        return jM12044d;
    }

    public C5603l(InterfaceC0173a interfaceC0173a, InterfaceC0188p interfaceC0188p) {
        this.f17524a = interfaceC0173a;
        this.f17525b = interfaceC0188p;
    }

    public /* synthetic */ C5603l(InterfaceC0173a interfaceC0173a, InterfaceC0188p interfaceC0188p, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC0173a, (i10 & 2) != 0 ? null : interfaceC0188p);
    }

    public /* synthetic */ C5603l(long j10, InterfaceC0188p interfaceC0188p, AbstractC1043k abstractC1043k) {
        this(j10, interfaceC0188p);
    }

    public C5603l(final long j10, InterfaceC0188p interfaceC0188p) {
        this(new InterfaceC0173a() { // from class: o.k
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C5603l.m22711b(j10);
            }
        }, interfaceC0188p);
    }
}
