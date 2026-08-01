package p115X0;

import p101U0.C1470e;
import p120Y0.AbstractC1732a;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: X0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1630e implements InterfaceC1632g {

    /* JADX INFO: renamed from: a */
    public final int f5615a;

    /* JADX INFO: renamed from: b */
    public final int f5616b;

    public C1630e(int i5, int i6) {
        this.f5615a = i5;
        this.f5616b = i6;
        if (i5 >= 0 && i6 >= 0) {
            return;
        }
        AbstractC1732a.m3085a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i6 + " respectively.");
    }

    @Override // p115X0.InterfaceC1632g
    /* JADX INFO: renamed from: a */
    public final void mo1453a(C1633h c1633h) {
        int i5 = c1633h.f5621c;
        C1470e c1470e = c1633h.f5619a;
        int i6 = this.f5616b;
        int iM2738b = i5 + i6;
        if (((i5 ^ iM2738b) & (i6 ^ iM2738b)) < 0) {
            iM2738b = c1470e.m2738b();
        }
        c1633h.m2929a(c1633h.f5621c, Math.min(iM2738b, c1470e.m2738b()));
        int i7 = c1633h.f5620b;
        int i8 = this.f5615a;
        int i9 = i7 - i8;
        if (((i7 ^ i9) & (i8 ^ i7)) < 0) {
            i9 = 0;
        }
        c1633h.m2929a(Math.max(0, i9), c1633h.f5620b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1630e)) {
            return false;
        }
        C1630e c1630e = (C1630e) obj;
        return this.f5615a == c1630e.f5615a && this.f5616b == c1630e.f5616b;
    }

    public final int hashCode() {
        return (this.f5615a * 31) + this.f5616b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f5615a);
        sb.append(", lengthAfterCursor=");
        return AbstractC3202a.m5466a(sb, this.f5616b, ')');
    }
}
