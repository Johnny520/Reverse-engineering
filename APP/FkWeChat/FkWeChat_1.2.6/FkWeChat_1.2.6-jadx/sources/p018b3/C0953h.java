package p018b3;

import p030c3.AbstractC1314a;

/* JADX INFO: renamed from: b3.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0953h implements InterfaceC0955i {

    /* JADX INFO: renamed from: a */
    public final int f2935a;

    /* JADX INFO: renamed from: b */
    public final int f2936b;

    public C0953h(int i10, int i11) {
        this.f2935a = i10;
        this.f2936b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        AbstractC1314a.m5291a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // p018b3.InterfaceC0955i
    /* JADX INFO: renamed from: a */
    public void mo3444a(C0963m c0963m) {
        int i10 = this.f2935a;
        int i11 = 0;
        int i12 = 0;
        int iM3506k = 0;
        while (true) {
            if (i12 < i10) {
                int i13 = iM3506k + 1;
                if (c0963m.m3506k() <= i13) {
                    iM3506k = c0963m.m3506k();
                    break;
                } else {
                    iM3506k = AbstractC0957j.m3485b(c0963m.m3498c((c0963m.m3506k() - i13) + (-1)), c0963m.m3498c(c0963m.m3506k() - i13)) ? iM3506k + 2 : i13;
                    i12++;
                }
            } else {
                break;
            }
        }
        int i14 = this.f2936b;
        int iM3503h = 0;
        while (true) {
            if (i11 >= i14) {
                break;
            }
            int i15 = iM3503h + 1;
            if (c0963m.m3505j() + i15 >= c0963m.m3503h()) {
                iM3503h = c0963m.m3503h() - c0963m.m3505j();
                break;
            } else {
                iM3503h = AbstractC0957j.m3485b(c0963m.m3498c((c0963m.m3505j() + i15) + (-1)), c0963m.m3498c(c0963m.m3505j() + i15)) ? iM3503h + 2 : i15;
                i11++;
            }
        }
        c0963m.m3497b(c0963m.m3505j(), c0963m.m3505j() + iM3503h);
        c0963m.m3497b(c0963m.m3506k() - iM3506k, c0963m.m3506k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0953h)) {
            return false;
        }
        C0953h c0953h = (C0953h) obj;
        return this.f2935a == c0953h.f2935a && this.f2936b == c0953h.f2936b;
    }

    public int hashCode() {
        return (this.f2935a * 31) + this.f2936b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f2935a + ", lengthAfterCursor=" + this.f2936b + ')';
    }
}
