package p018b3;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: b3.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0972q0 implements InterfaceC0955i {

    /* JADX INFO: renamed from: a */
    public final int f2974a;

    /* JADX INFO: renamed from: b */
    public final int f2975b;

    public C0972q0(int i10, int i11) {
        this.f2974a = i10;
        this.f2975b = i11;
    }

    @Override // p018b3.InterfaceC0955i
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0963m c0963m) {
        int iM8586m = AbstractC2368o.m8586m(this.f2974a, 0, c0963m.m3503h());
        int iM8586m2 = AbstractC2368o.m8586m(this.f2975b, 0, c0963m.m3503h());
        if (iM8586m < iM8586m2) {
            c0963m.m3511p(iM8586m, iM8586m2);
        } else {
            c0963m.m3511p(iM8586m2, iM8586m);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0972q0)) {
            return false;
        }
        C0972q0 c0972q0 = (C0972q0) obj;
        return this.f2974a == c0972q0.f2974a && this.f2975b == c0972q0.f2975b;
    }

    public int hashCode() {
        return (this.f2974a * 31) + this.f2975b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f2974a + ", end=" + this.f2975b + ')';
    }
}
