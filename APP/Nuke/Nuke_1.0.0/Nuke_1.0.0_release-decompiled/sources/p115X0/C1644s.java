package p115X0;

import com.bumptech.glide.AbstractC1926h;
import p092S0.C1269g;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: X0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1644s implements InterfaceC1632g {

    /* JADX INFO: renamed from: a */
    public final C1269g f5646a;

    /* JADX INFO: renamed from: b */
    public final int f5647b;

    public C1644s(String str, int i5) {
        this.f5646a = new C1269g(str);
        this.f5647b = i5;
    }

    @Override // p115X0.InterfaceC1632g
    /* JADX INFO: renamed from: a */
    public final void mo1453a(C1633h c1633h) {
        int i5 = c1633h.f5622d;
        C1269g c1269g = this.f5646a;
        if (i5 != -1) {
            int i6 = c1633h.f5623e;
            String str = c1269g.f4563e;
            String str2 = c1269g.f4563e;
            c1633h.m2932d(i5, i6, str);
            if (str2.length() > 0) {
                c1633h.m2933e(i5, str2.length() + i5);
            }
        } else {
            int i7 = c1633h.f5620b;
            int i8 = c1633h.f5621c;
            String str3 = c1269g.f4563e;
            String str4 = c1269g.f4563e;
            c1633h.m2932d(i7, i8, str3);
            if (str4.length() > 0) {
                c1633h.m2933e(i7, str4.length() + i7);
            }
        }
        int i9 = c1633h.f5620b;
        int i10 = c1633h.f5621c;
        int i11 = i9 == i10 ? i10 : -1;
        int i12 = this.f5647b;
        int iM3568k = AbstractC1926h.m3568k(i12 > 0 ? (i11 + i12) - 1 : (i11 + i12) - c1269g.f4563e.length(), 0, c1633h.f5619a.m2738b());
        c1633h.m2934f(iM3568k, iM3568k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1644s)) {
            return false;
        }
        C1644s c1644s = (C1644s) obj;
        return AbstractC1665j.m2981a(this.f5646a.f4563e, c1644s.f5646a.f4563e) && this.f5647b == c1644s.f5647b;
    }

    public final int hashCode() {
        return (this.f5646a.f4563e.hashCode() * 31) + this.f5647b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f5646a.f4563e);
        sb.append("', newCursorPosition=");
        return AbstractC3202a.m5466a(sb, this.f5647b, ')');
    }
}
