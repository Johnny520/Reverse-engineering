package p104h3;

import p024b9.AbstractC1043k;
import p030c3.AbstractC1314a;
import p265s1.AbstractC7078g1;
import p265s1.C7128q1;

/* JADX INFO: renamed from: h3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2851d implements InterfaceC2863p {

    /* JADX INFO: renamed from: b */
    public final long f7418b;

    public C2851d(long j10) {
        this.f7418b = j10;
        if (j10 != 16) {
            return;
        }
        AbstractC1314a.m5291a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p104h3.InterfaceC2863p
    /* JADX INFO: renamed from: a */
    public float mo10102a() {
        return C7128q1.m28132r(mo10103b());
    }

    @Override // p104h3.InterfaceC2863p
    /* JADX INFO: renamed from: b */
    public long mo10103b() {
        return this.f7418b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2851d) && C7128q1.m28131q(this.f7418b, ((C2851d) obj).f7418b);
    }

    @Override // p104h3.InterfaceC2863p
    /* JADX INFO: renamed from: f */
    public AbstractC7078g1 mo10104f() {
        return null;
    }

    public int hashCode() {
        return C7128q1.m28137w(this.f7418b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C7128q1.m28138x(this.f7418b)) + ')';
    }

    public /* synthetic */ C2851d(long j10, AbstractC1043k abstractC1043k) {
        this(j10);
    }
}
