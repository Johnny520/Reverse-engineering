package p332x;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: x.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9290x0 implements InterfaceC9288w0 {

    /* JADX INFO: renamed from: b */
    public final int f31772b;

    public C9290x0(int i10) {
        this.f31772b = i10;
    }

    @Override // p332x.InterfaceC9288w0
    /* JADX INFO: renamed from: a */
    public int mo36128a(int i10, int i11, float f10, int i12, int i13) {
        long j10 = i10;
        return AbstractC2368o.m8586m(i11, (int) AbstractC2368o.m8579f(j10 - ((long) this.f31772b), 0L), (int) AbstractC2368o.m8583j(j10 + ((long) this.f31772b), 2147483647L));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9290x0) && this.f31772b == ((C9290x0) obj).f31772b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f31772b);
    }
}
