package p148k;

import p010a9.InterfaceC0188p;
import p121i3.C3189s;
import p163l.AbstractC4276b4;
import p163l.AbstractC4322l;
import p163l.InterfaceC4303h0;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p221p1.AbstractC5923f;

/* JADX INFO: renamed from: k.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3886l {

    /* JADX INFO: renamed from: a */
    public static final long f11229a;

    static {
        long j10 = Integer.MIN_VALUE;
        f11229a = C3189s.m12082c((j10 & 4294967295L) | (j10 << 32));
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m15427a(InterfaceC4507m interfaceC4507m, InterfaceC4303h0 interfaceC4303h0, InterfaceC0188p interfaceC0188p) {
        return AbstractC5923f.m23837b(interfaceC4507m).mo17445i(new C3879h0(interfaceC4303h0, InterfaceC4499e.f13028a.m17426o(), interfaceC0188p));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m15428b(InterfaceC4507m interfaceC4507m, InterfaceC4303h0 interfaceC4303h0, InterfaceC0188p interfaceC0188p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4303h0 = AbstractC4322l.m16974j(0.0f, 400.0f, C3189s.m12081b(AbstractC4276b4.m16810d(C3189s.f8481b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0188p = null;
        }
        return m15427a(interfaceC4507m, interfaceC4303h0, interfaceC0188p);
    }

    /* JADX INFO: renamed from: c */
    public static final long m15429c() {
        return f11229a;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m15430d(long j10) {
        return !C3189s.m12084e(j10, f11229a);
    }
}
