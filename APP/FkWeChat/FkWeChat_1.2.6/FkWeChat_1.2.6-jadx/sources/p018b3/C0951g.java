package p018b3;

import p030c3.AbstractC1314a;

/* JADX INFO: renamed from: b3.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0951g implements InterfaceC0955i {

    /* JADX INFO: renamed from: a */
    public final int f2933a;

    /* JADX INFO: renamed from: b */
    public final int f2934b;

    public C0951g(int i10, int i11) {
        this.f2933a = i10;
        this.f2934b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        AbstractC1314a.m5291a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // p018b3.InterfaceC0955i
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0963m c0963m) {
        int iM3505j = c0963m.m3505j();
        int i10 = this.f2934b;
        int iM3503h = iM3505j + i10;
        if (((iM3505j ^ iM3503h) & (i10 ^ iM3503h)) < 0) {
            iM3503h = c0963m.m3503h();
        }
        c0963m.m3497b(c0963m.m3505j(), Math.min(iM3503h, c0963m.m3503h()));
        int iM3506k = c0963m.m3506k();
        int i11 = this.f2933a;
        int i12 = iM3506k - i11;
        if (((iM3506k ^ i12) & (i11 ^ iM3506k)) < 0) {
            i12 = 0;
        }
        c0963m.m3497b(Math.max(0, i12), c0963m.m3506k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0951g)) {
            return false;
        }
        C0951g c0951g = (C0951g) obj;
        return this.f2933a == c0951g.f2933a && this.f2934b == c0951g.f2934b;
    }

    public int hashCode() {
        return (this.f2933a * 31) + this.f2934b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f2933a + ", lengthAfterCursor=" + this.f2934b + ')';
    }
}
