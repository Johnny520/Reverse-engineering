package p216p;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0597i;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p232s.C3162i;

/* JADX INFO: renamed from: p.t */
/* JADX INFO: loaded from: classes.dex */
final class C2863t extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C3162i f9023a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2819L f9024b;

    /* JADX INFO: renamed from: c */
    public final boolean f9025c;

    /* JADX INFO: renamed from: d */
    public final boolean f9026d;

    /* JADX INFO: renamed from: e */
    public final String f9027e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1599a f9028f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2863t(C3162i c3162i, InterfaceC2819L interfaceC2819L, boolean z5, boolean z6, String str, InterfaceC1599a interfaceC1599a) {
        this.f9023a = c3162i;
        this.f9024b = interfaceC2819L;
        this.f9025c = z5;
        this.f9026d = z6;
        this.f9027e = str;
        this.f9028f = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2865v(this.f9023a, this.f9024b, this.f9025c, this.f9026d, this.f9027e, this.f9028f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2863t.class != obj.getClass()) {
            return false;
        }
        C2863t c2863t = (C2863t) obj;
        return AbstractC1665j.m2981a(this.f9023a, c2863t.f9023a) && AbstractC1665j.m2981a(this.f9024b, c2863t.f9024b) && this.f9025c == c2863t.f9025c && this.f9026d == c2863t.f9026d && AbstractC1665j.m2981a(this.f9027e, c2863t.f9027e) && this.f9028f == c2863t.f9028f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo141f(AbstractC2206o abstractC2206o) throws ClassNotFoundException {
        boolean z5;
        InterfaceC0597i interfaceC0597i;
        C2865v c2865v = (C2865v) abstractC2206o;
        C2811D c2811d = c2865v.f9052z;
        C3162i c3162i = c2865v.f9040H;
        C3162i c3162i2 = this.f9023a;
        boolean z6 = true;
        if (AbstractC1665j.m2981a(c3162i, c3162i2)) {
            z5 = false;
        } else {
            c2865v.m5062M0();
            c2865v.f9040H = c3162i2;
            c2865v.f9046t = c3162i2;
            z5 = true;
        }
        InterfaceC2819L interfaceC2819L = c2865v.f9047u;
        InterfaceC2819L interfaceC2819L2 = this.f9024b;
        if (!AbstractC1665j.m2981a(interfaceC2819L, interfaceC2819L2)) {
            c2865v.f9047u = interfaceC2819L2;
            z5 = true;
        }
        boolean z7 = c2865v.f9048v;
        boolean z8 = this.f9025c;
        if (z7 != z8) {
            c2865v.f9048v = z8;
            if (z8) {
                c2865v.mo1051O();
            }
            z5 = true;
        }
        boolean z9 = c2865v.f9050x;
        boolean z10 = this.f9026d;
        if (z9 != z10) {
            if (z10) {
                c2865v.m1021J0(c2811d);
            } else {
                c2865v.m1022K0(c2811d);
                c2865v.m5062M0();
            }
            AbstractC0601k.m1036l(c2865v);
            c2865v.f9050x = z10;
        }
        String str = c2865v.f9049w;
        String str2 = this.f9027e;
        if (!AbstractC1665j.m2981a(str, str2)) {
            c2865v.f9049w = str2;
            AbstractC0601k.m1036l(c2865v);
        }
        c2865v.f9051y = this.f9028f;
        boolean z11 = c2865v.f9041I;
        C3162i c3162i3 = c2865v.f9040H;
        if (z11 == (c3162i3 == null)) {
            z6 = z5;
        } else {
            boolean z12 = c3162i3 == null;
            c2865v.f9041I = z12;
            if (z12 || c2865v.f9034B != null) {
            }
        }
        if (z6 && ((interfaceC0597i = c2865v.f9034B) != null || !c2865v.f9041I)) {
            if (interfaceC0597i != null) {
                c2865v.m1022K0(interfaceC0597i);
            }
            c2865v.f9034B = null;
            c2865v.m5066Q0();
        }
        c2811d.m5016O0(c2865v.f9046t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C3162i c3162i = this.f9023a;
        int iHashCode = (c3162i != null ? c3162i.hashCode() : 0) * 31;
        InterfaceC2819L interfaceC2819L = this.f9024b;
        int iM395f = AbstractC0231b.m395f(AbstractC0231b.m395f((iHashCode + (interfaceC2819L != null ? interfaceC2819L.hashCode() : 0)) * 31, 31, this.f9025c), 31, this.f9026d);
        String str = this.f9027e;
        return this.f9028f.hashCode() + ((iM395f + (str != null ? str.hashCode() : 0)) * 961);
    }
}
