package p088g0;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p119i2.C1941n0;
import p177m2.InterfaceC2760d;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: g0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1267k extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final String f4198a;

    /* JADX INFO: renamed from: b */
    public final C1941n0 f4199b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2760d f4200c;

    /* JADX INFO: renamed from: d */
    public final int f4201d;

    /* JADX INFO: renamed from: e */
    public final boolean f4202e;

    /* JADX INFO: renamed from: f */
    public final int f4203f;

    /* JADX INFO: renamed from: g */
    public final int f4204g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1267k(String str, C1941n0 c1941n0, InterfaceC2760d interfaceC2760d, int i9, boolean z9, int i10, int i11) {
        this.f4198a = str;
        this.f4199b = c1941n0;
        this.f4200c = interfaceC2760d;
        this.f4201d = i9;
        this.f4202e = z9;
        this.f4203f = i10;
        this.f4204g = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1267k)) {
            return false;
        }
        C1267k c1267k = (C1267k) obj;
        return AbstractC1416l.m3825a(this.f4198a, c1267k.f4198a) && AbstractC1416l.m3825a(this.f4199b, c1267k.f4199b) && AbstractC1416l.m3825a(this.f4200c, c1267k.f4200c) && this.f4201d == c1267k.f4201d && this.f4202e == c1267k.f4202e && this.f4203f == c1267k.f4203f && this.f4204g == c1267k.f4204g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C1270n c1270n = new C1270n();
        c1270n.f4217u = this.f4198a;
        c1270n.f4218v = this.f4199b;
        c1270n.f4219w = this.f4200c;
        c1270n.f4220x = this.f4201d;
        c1270n.f4221y = this.f4202e;
        c1270n.f4222z = this.f4203f;
        c1270n.f4211A = this.f4204g;
        return c1270n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        boolean z9;
        String str;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        InterfaceC2760d interfaceC2760d;
        InterfaceC2760d interfaceC2760d2;
        int i13;
        int i14;
        C1270n c1270n = (C1270n) abstractC5852n;
        c1270n.getClass();
        C1941n0 c1941n0 = c1270n.f4218v;
        boolean z12 = false;
        boolean z13 = true;
        C1941n0 c1941n02 = this.f4199b;
        if (c1941n02 != c1941n0) {
            if (!c1941n02.f6580a.m4792b(c1941n0.f6580a)) {
                z9 = true;
            }
            str = c1270n.f4217u;
            str2 = this.f4198a;
            if (!AbstractC1416l.m3825a(str, str2)) {
                c1270n.f4217u = str2;
                c1270n.f4216F = null;
                z12 = true;
            }
            boolean z14 = !c1270n.f4218v.m4821b(c1941n02);
            c1270n.f4218v = c1941n02;
            i9 = c1270n.f4211A;
            i10 = this.f4204g;
            if (i9 != i10) {
                c1270n.f4211A = i10;
                z14 = true;
            }
            i11 = c1270n.f4222z;
            i12 = this.f4203f;
            if (i11 != i12) {
                c1270n.f4222z = i12;
                z14 = true;
            }
            z10 = c1270n.f4221y;
            z11 = this.f4202e;
            if (z10 != z11) {
                c1270n.f4221y = z11;
                z14 = true;
            }
            interfaceC2760d = c1270n.f4219w;
            interfaceC2760d2 = this.f4200c;
            if (!AbstractC1416l.m3825a(interfaceC2760d, interfaceC2760d2)) {
                c1270n.f4219w = interfaceC2760d2;
                z14 = true;
            }
            i13 = c1270n.f4220x;
            i14 = this.f4201d;
            if (i13 != i14) {
                z13 = z14;
            } else {
                c1270n.f4220x = i14;
            }
            if (!z9 || z12 || z13) {
                c1270n.f4214D = null;
            }
            if (!z12 || z13) {
                c1270n.m3400k1().m3397f(c1270n.f4217u, c1270n.f4218v, c1270n.f4219w, c1270n.f4220x, c1270n.f4221y, c1270n.f4222z, c1270n.f4211A);
            }
            if (c1270n.f23801t) {
                return;
            }
            if (z12 || (z9 && c1270n.f4215E != null)) {
                AbstractC5618k.m10158n(c1270n);
            }
            if (z12 || z13) {
                AbstractC5618k.m10157m(c1270n);
                AbstractC5618k.m10156l(c1270n);
            }
            if (z9) {
                AbstractC5618k.m10156l(c1270n);
                return;
            }
            return;
        }
        c1941n02.getClass();
        z9 = false;
        str = c1270n.f4217u;
        str2 = this.f4198a;
        if (!AbstractC1416l.m3825a(str, str2)) {
        }
        boolean z142 = !c1270n.f4218v.m4821b(c1941n02);
        c1270n.f4218v = c1941n02;
        i9 = c1270n.f4211A;
        i10 = this.f4204g;
        if (i9 != i10) {
        }
        i11 = c1270n.f4222z;
        i12 = this.f4203f;
        if (i11 != i12) {
        }
        z10 = c1270n.f4221y;
        z11 = this.f4202e;
        if (z10 != z11) {
        }
        interfaceC2760d = c1270n.f4219w;
        interfaceC2760d2 = this.f4200c;
        if (!AbstractC1416l.m3825a(interfaceC2760d, interfaceC2760d2)) {
        }
        i13 = c1270n.f4220x;
        i14 = this.f4201d;
        if (i13 != i14) {
        }
        if (!z9) {
            c1270n.f4214D = null;
        }
        if (!z12) {
            c1270n.m3400k1().m3397f(c1270n.f4217u, c1270n.f4218v, c1270n.f4219w, c1270n.f4220x, c1270n.f4221y, c1270n.f4222z, c1270n.f4211A);
        }
        if (c1270n.f23801t) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f4201d, (this.f4200c.hashCode() + ((this.f4199b.hashCode() + (this.f4198a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f4202e) + this.f4203f) * 31) + this.f4204g) * 31;
    }
}
