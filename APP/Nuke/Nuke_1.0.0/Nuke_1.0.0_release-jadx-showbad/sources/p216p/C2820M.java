package p216p;

import android.view.View;
import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p058L.C0923Z;
import p058L.C0927b0;
import p077P0.C1135v;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: p.M */
/* JADX INFO: loaded from: classes.dex */
public final class C2820M extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0927b0 f8873a;

    /* JADX INFO: renamed from: b */
    public final C0923Z f8874b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2834a0 f8875c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2820M(C0927b0 c0927b0, C0923Z c0923z, InterfaceC2834a0 interfaceC2834a0) {
        this.f8873a = c0927b0;
        this.f8874b = c0923z;
        this.f8875c = interfaceC2834a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2822O(this.f8873a, this.f8874b, this.f8875c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2822O c2822o = (C2822O) abstractC2206o;
        c2822o.getClass();
        InterfaceC2834a0 interfaceC2834a0 = c2822o.f8882t;
        View view = c2822o.f8883u;
        InterfaceC2007c interfaceC2007c = c2822o.f8884v;
        c2822o.f8880r = this.f8873a;
        c2822o.f8881s = this.f8874b;
        InterfaceC2834a0 interfaceC2834a02 = this.f8875c;
        c2822o.f8882t = interfaceC2834a02;
        View viewM1046v = AbstractC0601k.m1046v(c2822o);
        InterfaceC2007c interfaceC2007c2 = AbstractC0601k.m1044t(c2822o).f1692C;
        if (c2822o.f8885w != null) {
            C1135v c1135v = AbstractC2823P.f8889a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !interfaceC2834a02.mo5027a()) || !C2010f.m3696b(Float.NaN, Float.NaN) || !C2010f.m3696b(Float.NaN, Float.NaN) || !interfaceC2834a02.equals(interfaceC2834a0) || !viewM1046v.equals(view) || !AbstractC1665j.m2981a(interfaceC2007c2, interfaceC2007c)) {
                c2822o.m5021K0();
            }
        }
        c2822o.m5022L0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8875c.hashCode() + ((this.f8874b.hashCode() + AbstractC0231b.m395f(AbstractC0231b.m390a(Float.NaN, AbstractC0231b.m390a(Float.NaN, AbstractC0231b.m392c(AbstractC0231b.m395f(AbstractC0231b.m390a(Float.NaN, this.f8873a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
