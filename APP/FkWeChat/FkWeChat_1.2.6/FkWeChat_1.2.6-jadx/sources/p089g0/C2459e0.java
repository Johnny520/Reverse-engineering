package p089g0;

import p121i3.C3185o;
import p121i3.C3187q;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p180m3.InterfaceC4960u;

/* JADX INFO: renamed from: g0.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2459e0 implements InterfaceC4960u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4960u f6648a;

    /* JADX INFO: renamed from: b */
    public C3189s f6649b;

    /* JADX INFO: renamed from: c */
    public EnumC3191u f6650c;

    /* JADX INFO: renamed from: d */
    public C3189s f6651d;

    /* JADX INFO: renamed from: e */
    public C3185o f6652e;

    public C2459e0(InterfaceC4960u interfaceC4960u) {
        this.f6648a = interfaceC4960u;
    }

    @Override // p180m3.InterfaceC4960u
    /* JADX INFO: renamed from: a */
    public long mo8891a(C3187q c3187q, long j10, EnumC3191u enumC3191u, long j11) {
        C3185o c3185o = this.f6652e;
        if (c3185o != null) {
            C3189s c3189s = this.f6649b;
            if ((c3189s == null ? false : C3189s.m12084e(c3189s.m12087h(), j10)) && this.f6650c == enumC3191u) {
                C3189s c3189s2 = this.f6651d;
                if (c3189s2 != null ? C3189s.m12084e(c3189s2.m12087h(), j11) : false) {
                    return c3185o.m12056p();
                }
            }
        }
        long jMo8891a = this.f6648a.mo8891a(c3187q, j10, enumC3191u, j11);
        this.f6649b = C3189s.m12081b(j10);
        this.f6650c = enumC3191u;
        this.f6651d = C3189s.m12081b(j11);
        this.f6652e = C3185o.m12043c(jMo8891a);
        return jMo8891a;
    }
}
