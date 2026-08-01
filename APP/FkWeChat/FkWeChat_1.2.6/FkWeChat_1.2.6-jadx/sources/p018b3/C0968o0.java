package p018b3;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: b3.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0968o0 implements InterfaceC0955i {

    /* JADX INFO: renamed from: a */
    public final int f2966a;

    /* JADX INFO: renamed from: b */
    public final int f2967b;

    public C0968o0(int i10, int i11) {
        this.f2966a = i10;
        this.f2967b = i11;
    }

    @Override // p018b3.InterfaceC0955i
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0963m c0963m) {
        if (c0963m.m3507l()) {
            c0963m.m3496a();
        }
        int iM8586m = AbstractC2368o.m8586m(this.f2966a, 0, c0963m.m3503h());
        int iM8586m2 = AbstractC2368o.m8586m(this.f2967b, 0, c0963m.m3503h());
        if (iM8586m != iM8586m2) {
            if (iM8586m < iM8586m2) {
                c0963m.m3509n(iM8586m, iM8586m2);
            } else {
                c0963m.m3509n(iM8586m2, iM8586m);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0968o0)) {
            return false;
        }
        C0968o0 c0968o0 = (C0968o0) obj;
        return this.f2966a == c0968o0.f2966a && this.f2967b == c0968o0.f2967b;
    }

    public int hashCode() {
        return (this.f2966a * 31) + this.f2967b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f2966a + ", end=" + this.f2967b + ')';
    }
}
