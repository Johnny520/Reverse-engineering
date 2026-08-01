package p265s1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.k3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7100k3 extends AbstractC7078g1 {

    /* JADX INFO: renamed from: c */
    public final long f23601c;

    public C7100k3(long j10) {
        super(null);
        this.f23601c = j10;
    }

    @Override // p265s1.AbstractC7078g1
    /* JADX INFO: renamed from: a */
    public void mo27855a(long j10, InterfaceC7134r2 interfaceC7134r2, float f10) {
        interfaceC7134r2.mo28060e(1.0f);
        long jM28129o = this.f23601c;
        if (f10 != 1.0f) {
            jM28129o = C7128q1.m28129o(jM28129o, C7128q1.m28132r(jM28129o) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        interfaceC7134r2.mo28076u(jM28129o);
        if (interfaceC7134r2.mo28068m() != null) {
            interfaceC7134r2.mo28067l(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m27984b() {
        return this.f23601c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7100k3) && C7128q1.m28131q(this.f23601c, ((C7100k3) obj).f23601c);
    }

    public int hashCode() {
        return C7128q1.m28137w(this.f23601c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) C7128q1.m28138x(this.f23601c)) + ')';
    }

    public /* synthetic */ C7100k3(long j10, AbstractC1043k abstractC1043k) {
        this(j10);
    }
}
