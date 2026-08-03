package p144k;

import gg.AbstractC1416l;
import p116i.C1746e0;
import p174m.C2609h2;
import p174m.C2638p;
import p174m.EnumC2640p1;
import p174m.InterfaceC2613i2;
import p187n.C2857k;
import p293u2.EnumC4243m;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5612i;
import p339x1.InterfaceC5626m1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.y1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2227y1 extends AbstractC5615j implements InterfaceC5609h, InterfaceC5626m1 {

    /* JADX INFO: renamed from: A */
    public C2857k f7372A;

    /* JADX INFO: renamed from: B */
    public boolean f7373B;

    /* JADX INFO: renamed from: C */
    public InterfaceC2185k1 f7374C;

    /* JADX INFO: renamed from: D */
    public C2609h2 f7375D;

    /* JADX INFO: renamed from: E */
    public InterfaceC5612i f7376E;

    /* JADX INFO: renamed from: F */
    public InterfaceC2188l1 f7377F;

    /* JADX INFO: renamed from: G */
    public InterfaceC2185k1 f7378G;

    /* JADX INFO: renamed from: H */
    public boolean f7379H;

    /* JADX INFO: renamed from: w */
    public InterfaceC2613i2 f7380w;

    /* JADX INFO: renamed from: x */
    public EnumC2640p1 f7381x;

    /* JADX INFO: renamed from: y */
    public boolean f7382y;

    /* JADX INFO: renamed from: z */
    public C2638p f7383z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        InterfaceC2188l1 interfaceC2188l1 = (InterfaceC2188l1) AbstractC5618k.m10152h(this, AbstractC2191m1.f7270a);
        if (AbstractC1416l.m3825a(interfaceC2188l1, this.f7377F)) {
            return;
        }
        this.f7377F = interfaceC2188l1;
        this.f7378G = null;
        InterfaceC5612i interfaceC5612i = this.f7376E;
        if (interfaceC5612i != null) {
            m10123l1(interfaceC5612i);
        }
        this.f7376E = null;
        m5464n1();
        C2609h2 c2609h2 = this.f7375D;
        if (c2609h2 != null) {
            InterfaceC2613i2 interfaceC2613i2 = this.f7380w;
            EnumC2640p1 enumC2640p1 = this.f7381x;
            c2609h2.m6060F1(this.f7373B ? this.f7378G : this.f7374C, this.f7383z, enumC2640p1, interfaceC2613i2, this.f7372A, this.f7382y, this.f7379H);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        this.f7379H = m5465o1();
        m5464n1();
        if (this.f7375D == null) {
            InterfaceC2613i2 interfaceC2613i2 = this.f7380w;
            C2609h2 c2609h2 = new C2609h2(this.f7373B ? this.f7378G : this.f7374C, this.f7383z, this.f7381x, interfaceC2613i2, this.f7372A, this.f7382y, this.f7379H);
            m10122k1(c2609h2);
            this.f7375D = c2609h2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        InterfaceC5612i interfaceC5612i = this.f7376E;
        if (interfaceC5612i != null) {
            m10123l1(interfaceC5612i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5612i
    /* JADX INFO: renamed from: k0 */
    public final void mo1330k0() {
        boolean zM5465o1 = m5465o1();
        if (this.f7379H != zM5465o1) {
            this.f7379H = zM5465o1;
            InterfaceC2613i2 interfaceC2613i2 = this.f7380w;
            EnumC2640p1 enumC2640p1 = this.f7381x;
            boolean z9 = this.f7373B;
            m5466p1(z9 ? this.f7378G : this.f7374C, this.f7383z, enumC2640p1, interfaceC2613i2, this.f7372A, z9, this.f7382y);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m5464n1() {
        InterfaceC5612i interfaceC5612i = this.f7376E;
        if (interfaceC5612i != null) {
            if (((AbstractC5852n) interfaceC5612i).f23788g.f23801t) {
                return;
            }
            m10122k1(interfaceC5612i);
            return;
        }
        if (this.f7373B) {
            AbstractC5618k.m10162r(this, new C1746e0(this, 5));
        }
        InterfaceC2185k1 interfaceC2185k1 = this.f7373B ? this.f7378G : this.f7374C;
        if (interfaceC2185k1 != null) {
            InterfaceC5612i interfaceC5612iMo1617c = interfaceC2185k1.mo1617c();
            if (((AbstractC5852n) interfaceC5612iMo1617c).f23788g.f23801t) {
                return;
            }
            m10122k1(interfaceC5612iMo1617c);
            this.f7376E = interfaceC5612iMo1617c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final boolean m5465o1() {
        return (this.f23801t ? AbstractC5618k.m10167w(this).f22772F : EnumC4243m.f13919g) != EnumC4243m.f13920h || this.f7381x == EnumC2640p1.f8622g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public final void m5466p1(InterfaceC2185k1 interfaceC2185k1, C2638p c2638p, EnumC2640p1 enumC2640p1, InterfaceC2613i2 interfaceC2613i2, C2857k c2857k, boolean z9, boolean z10) {
        boolean z11;
        this.f7380w = interfaceC2613i2;
        this.f7381x = enumC2640p1;
        boolean z12 = true;
        if (this.f7373B != z9) {
            this.f7373B = z9;
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC1416l.m3825a(this.f7374C, interfaceC2185k1)) {
            z12 = false;
        } else {
            this.f7374C = interfaceC2185k1;
        }
        if (z11 || (z12 && !z9)) {
            InterfaceC5612i interfaceC5612i = this.f7376E;
            if (interfaceC5612i != null) {
                m10123l1(interfaceC5612i);
            }
            this.f7376E = null;
            m5464n1();
        }
        this.f7382y = z10;
        this.f7383z = c2638p;
        this.f7372A = c2857k;
        boolean zM5465o1 = m5465o1();
        this.f7379H = zM5465o1;
        C2609h2 c2609h2 = this.f7375D;
        if (c2609h2 != null) {
            c2609h2.m6060F1(this.f7373B ? this.f7378G : this.f7374C, c2638p, enumC2640p1, interfaceC2613i2, c2857k, z10, zM5465o1);
        }
    }
}
