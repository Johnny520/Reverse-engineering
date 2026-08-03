package p050c0;

import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0601K0 {

    /* JADX INFO: renamed from: a */
    public final String f1835a;

    /* JADX INFO: renamed from: b */
    public final int f1836b;

    /* JADX INFO: renamed from: c */
    public final int f1837c;

    /* JADX INFO: renamed from: d */
    public final int f1838d;

    /* JADX INFO: renamed from: e */
    public final int f1839e;

    /* JADX INFO: renamed from: f */
    public final int f1840f;

    /* JADX INFO: renamed from: g */
    public final int f1841g;

    /* JADX INFO: renamed from: h */
    public final int f1842h;

    public C0601K0(String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractC0307g.m703e(str, "dateKey");
        this.f1835a = str;
        this.f1836b = i2;
        this.f1837c = i3;
        this.f1838d = i4;
        this.f1839e = i5;
        this.f1840f = i6;
        this.f1841g = i7;
        this.f1842h = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0601K0)) {
            return false;
        }
        C0601K0 c0601k0 = (C0601K0) obj;
        return AbstractC0307g.m699a(this.f1835a, c0601k0.f1835a) && this.f1836b == c0601k0.f1836b && this.f1837c == c0601k0.f1837c && this.f1838d == c0601k0.f1838d && this.f1839e == c0601k0.f1839e && this.f1840f == c0601k0.f1840f && this.f1841g == c0601k0.f1841g && this.f1842h == c0601k0.f1842h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1842h) + AbstractC0324d.m718a(this.f1841g, AbstractC0324d.m718a(this.f1840f, AbstractC0324d.m718a(this.f1839e, AbstractC0324d.m718a(this.f1838d, AbstractC0324d.m718a(this.f1837c, AbstractC0324d.m718a(this.f1836b, this.f1835a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "InputStatsSnapshot(dateKey=" + this.f1835a + ", totalMsg=" + this.f1836b + ", textMsg=" + this.f1837c + ", textWord=" + this.f1838d + ", emojiMsg=" + this.f1839e + ", transferMsg=" + this.f1840f + ", redBagMsg=" + this.f1841g + ", fileMsg=" + this.f1842h + ")";
    }
}
