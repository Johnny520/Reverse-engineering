package p115X0;

import com.bumptech.glide.AbstractC1926h;
import p092S0.C1269g;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: X0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1626a implements InterfaceC1632g {

    /* JADX INFO: renamed from: a */
    public final C1269g f5588a;

    /* JADX INFO: renamed from: b */
    public final int f5589b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1626a(C1269g c1269g, int i5) {
        this.f5588a = c1269g;
        this.f5589b = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p115X0.InterfaceC1632g
    /* JADX INFO: renamed from: a */
    public final void mo1453a(C1633h c1633h) {
        int i5 = c1633h.f5622d;
        C1269g c1269g = this.f5588a;
        if (i5 != -1) {
            c1633h.m2932d(i5, c1633h.f5623e, c1269g.f4563e);
        } else {
            c1633h.m2932d(c1633h.f5620b, c1633h.f5621c, c1269g.f4563e);
        }
        int i6 = c1633h.f5620b;
        int i7 = c1633h.f5621c;
        int i8 = i6 == i7 ? i7 : -1;
        int i9 = this.f5589b;
        int iM3568k = AbstractC1926h.m3568k(i9 > 0 ? (i8 + i9) - 1 : (i8 + i9) - c1269g.f4563e.length(), 0, c1633h.f5619a.m2738b());
        c1633h.m2934f(iM3568k, iM3568k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626a)) {
            return false;
        }
        C1626a c1626a = (C1626a) obj;
        return AbstractC1665j.m2981a(this.f5588a.f4563e, c1626a.f5588a.f4563e) && this.f5589b == c1626a.f5589b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f5588a.f4563e.hashCode() * 31) + this.f5589b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f5588a.f4563e);
        sb.append("', newCursorPosition=");
        return AbstractC3202a.m5466a(sb, this.f5589b, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1626a(String str, int i5) {
        this(new C1269g(str), i5);
    }
}
