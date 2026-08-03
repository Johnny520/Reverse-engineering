package p121i4;

import bsh.C0353j;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p136j8.C2104o;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;
import p376z4.AbstractC6096j;
import p376z4.C6093g;

/* JADX INFO: renamed from: i4.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1973n extends AbstractC6096j {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6692h;

    /* JADX INFO: renamed from: i */
    public int f6693i;

    /* JADX INFO: renamed from: j */
    public final Object f6694j;

    /* JADX INFO: renamed from: k */
    public final Object f6695k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1973n(int i9, int i10) {
        super(i9 != 0);
        this.f6692h = i10;
        switch (i10) {
            case 1:
                super(true);
                this.f6694j = new C6093g(i9);
                this.f6695k = new C6093g(i9 + 1);
                this.f6693i = i9;
                break;
            default:
                this.f6694j = new InterfaceC4684d[i9];
                this.f6695k = new boolean[i9];
                this.f6693i = 0;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m4881t(String str) {
        throw new C1960b0("stack: ".concat(str), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.AbstractC6096j
    /* JADX INFO: renamed from: i */
    public void mo4882i() {
        switch (this.f6692h) {
            case 1:
                ((C6093g) this.f6694j).f24613g = false;
                ((C6093g) this.f6695k).f24613g = false;
                this.f24613g = false;
                break;
            default:
                super.mo4882i();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void m4883l(C1960b0 c1960b0) {
        int i9 = this.f6693i - 1;
        int i10 = 0;
        while (i10 <= i9) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("stack[", i10 == i9 ? "top0" : AbstractC0000a.m46X0(i9 - i10), "]: ");
            InterfaceC4684d interfaceC4684d = ((InterfaceC4684d[]) this.f6694j)[i10];
            sbM1026o.append(interfaceC4684d == null ? "<invalid>" : interfaceC4684d.toString());
            c1960b0.m2687a(sbM1026o.toString());
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m4884m(int i9, InterfaceC4684d interfaceC4684d) {
        InterfaceC4684d[] interfaceC4684dArr = (InterfaceC4684d[]) this.f6694j;
        m10855j();
        try {
            InterfaceC4684d interfaceC4684dMo4908g = interfaceC4684d.mo4908g();
            int i10 = (this.f6693i - i9) - 1;
            InterfaceC4684d interfaceC4684d2 = interfaceC4684dArr[i10];
            if (interfaceC4684d2 != null && interfaceC4684d2.getType().m9188i() == interfaceC4684dMo4908g.getType().m9188i()) {
                interfaceC4684dArr[i10] = interfaceC4684dMo4908g;
                return;
            }
            StringBuilder sb2 = new StringBuilder("incompatible substitution: ");
            sb2.append(interfaceC4684d2 == null ? "<invalid>" : interfaceC4684d2.toString());
            sb2.append(" -> ");
            sb2.append(interfaceC4684dMo4908g != null ? interfaceC4684dMo4908g.toString() : "<invalid>");
            m4881t(sb2.toString());
            throw null;
        } catch (NullPointerException unused) {
            C0353j.m1305c("type == null");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public C1973n m4885n() {
        InterfaceC4684d[] interfaceC4684dArr = (InterfaceC4684d[]) this.f6694j;
        C1973n c1973n = new C1973n(interfaceC4684dArr.length, 0);
        System.arraycopy(interfaceC4684dArr, 0, (InterfaceC4684d[]) c1973n.f6694j, 0, interfaceC4684dArr.length);
        boolean[] zArr = (boolean[]) this.f6695k;
        System.arraycopy(zArr, 0, (boolean[]) c1973n.f6695k, 0, zArr.length);
        c1973n.f6693i = this.f6693i;
        return c1973n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public InterfaceC4684d m4886o(int i9) {
        if (i9 < 0) {
            C2104o.m5294t("n < 0");
            return null;
        }
        if (i9 < this.f6693i) {
            return ((InterfaceC4684d[]) this.f6694j)[(r0 - i9) - 1];
        }
        m4881t("underflow");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public C4683c m4887p(int i9) {
        return m4886o(i9).getType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public void m4888q(InterfaceC4684d interfaceC4684d) {
        m10855j();
        try {
            InterfaceC4684d interfaceC4684dMo4908g = interfaceC4684d.mo4908g();
            int iM9188i = interfaceC4684dMo4908g.getType().m9188i();
            int i9 = this.f6693i;
            int i10 = i9 + iM9188i;
            InterfaceC4684d[] interfaceC4684dArr = (InterfaceC4684d[]) this.f6694j;
            if (i10 > interfaceC4684dArr.length) {
                m4881t("overflow");
                throw null;
            }
            if (iM9188i == 2) {
                interfaceC4684dArr[i9] = null;
                this.f6693i = i9 + 1;
            }
            int i11 = this.f6693i;
            interfaceC4684dArr[i11] = interfaceC4684dMo4908g;
            this.f6693i = i11 + 1;
        } catch (NullPointerException unused) {
            C0353j.m1305c("type == null");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m4889r() {
        C6093g c6093g = (C6093g) this.f6694j;
        m10855j();
        int i9 = this.f6693i;
        C6093g c6093g2 = (C6093g) this.f6695k;
        if (i9 != c6093g2.f24610i - 1) {
            C2104o.m5294t("incomplete instance");
            return;
        }
        int iM10846n = c6093g2.m10846n(i9);
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int iM10846n2 = c6093g2.m10846n(i11);
            if (iM10846n2 != iM10846n) {
                if (i11 != i10) {
                    c6093g2.m10848q(i10, iM10846n2);
                    c6093g.m10848q(i10, c6093g.m10846n(i11));
                }
                i10++;
            }
        }
        if (i10 != i9) {
            c6093g.m10849r(i10);
            c6093g2.m10848q(i10, iM10846n);
            c6093g2.m10849r(i10 + 1);
            this.f6693i = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m4890s(int i9) {
        m10855j();
        if (i9 < 0) {
            C2104o.m5294t("target < 0");
            return;
        }
        C6093g c6093g = (C6093g) this.f6695k;
        if (c6093g.f24610i == this.f6693i) {
            c6093g.m10844l(i9);
        } else {
            C0353j.m1309g("non-default elements not all set");
        }
    }
}
