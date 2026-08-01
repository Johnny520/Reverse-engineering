package p334x1;

import p121i3.C3185o;
import p121i3.C3189s;
import p265s1.AbstractC7054b2;
import p265s1.InterfaceC7089i2;

/* JADX INFO: renamed from: x1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9306b {
    /* JADX INFO: renamed from: a */
    public static final C9305a m36273a(InterfaceC7089i2 interfaceC7089i2, long j10, long j11, int i10) {
        C9305a c9305a = new C9305a(interfaceC7089i2, j10, j11, null);
        c9305a.m36271k(i10);
        return c9305a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9305a m36274b(InterfaceC7089i2 interfaceC7089i2, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = C3185o.f8471b.m12058b();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = C3189s.m12082c((((long) interfaceC7089i2.mo27905a()) & 4294967295L) | (((long) interfaceC7089i2.mo27908e()) << 32));
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = AbstractC7054b2.f23487a.m27768a();
        }
        return m36273a(interfaceC7089i2, j12, j13, i10);
    }
}
