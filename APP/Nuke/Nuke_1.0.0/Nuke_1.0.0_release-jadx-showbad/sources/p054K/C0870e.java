package p054K;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p092S0.C1260M;
import p110W0.InterfaceC1580e;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: K.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0870e extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final String f2732a;

    /* JADX INFO: renamed from: b */
    public final C1260M f2733b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1580e f2734c;

    /* JADX INFO: renamed from: d */
    public final int f2735d;

    /* JADX INFO: renamed from: e */
    public final boolean f2736e;

    /* JADX INFO: renamed from: f */
    public final int f2737f;

    /* JADX INFO: renamed from: g */
    public final int f2738g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0870e(String str, C1260M c1260m, InterfaceC1580e interfaceC1580e, int i5, boolean z5, int i6, int i7) {
        this.f2732a = str;
        this.f2733b = c1260m;
        this.f2734c = interfaceC1580e;
        this.f2735d = i5;
        this.f2736e = z5;
        this.f2737f = i6;
        this.f2738g = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C0873h c0873h = new C0873h();
        c0873h.f2747r = this.f2732a;
        c0873h.f2748s = this.f2733b;
        c0873h.f2749t = this.f2734c;
        c0873h.f2750u = this.f2735d;
        c0873h.f2751v = this.f2736e;
        c0873h.f2752w = this.f2737f;
        c0873h.f2753x = this.f2738g;
        return c0873h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0870e)) {
            return false;
        }
        C0870e c0870e = (C0870e) obj;
        return AbstractC1665j.m2981a(this.f2732a, c0870e.f2732a) && AbstractC1665j.m2981a(this.f2733b, c0870e.f2733b) && AbstractC1665j.m2981a(this.f2734c, c0870e.f2734c) && this.f2735d == c0870e.f2735d && this.f2736e == c0870e.f2736e && this.f2737f == c0870e.f2737f && this.f2738g == c0870e.f2738g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        boolean z5;
        String str;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z6;
        boolean z7;
        InterfaceC1580e interfaceC1580e;
        InterfaceC1580e interfaceC1580e2;
        int i9;
        int i10;
        C0873h c0873h = (C0873h) abstractC2206o;
        c0873h.getClass();
        C1260M c1260m = c0873h.f2748s;
        boolean z8 = false;
        boolean z9 = true;
        C1260M c1260m2 = this.f2733b;
        if (c1260m2 != c1260m) {
            if (!c1260m2.f4540a.m2321b(c1260m.f4540a)) {
                z5 = true;
            }
            str = c0873h.f2747r;
            str2 = this.f2732a;
            if (!AbstractC1665j.m2981a(str, str2)) {
                c0873h.f2747r = str2;
                c0873h.f2746B = null;
                z8 = true;
            }
            boolean z10 = !c0873h.f2748s.m2344c(c1260m2);
            c0873h.f2748s = c1260m2;
            i5 = c0873h.f2753x;
            i6 = this.f2738g;
            if (i5 != i6) {
                c0873h.f2753x = i6;
                z10 = true;
            }
            i7 = c0873h.f2752w;
            i8 = this.f2737f;
            if (i7 != i8) {
                c0873h.f2752w = i8;
                z10 = true;
            }
            z6 = c0873h.f2751v;
            z7 = this.f2736e;
            if (z6 != z7) {
                c0873h.f2751v = z7;
                z10 = true;
            }
            interfaceC1580e = c0873h.f2749t;
            interfaceC1580e2 = this.f2734c;
            if (!AbstractC1665j.m2981a(interfaceC1580e, interfaceC1580e2)) {
                c0873h.f2749t = interfaceC1580e2;
                z10 = true;
            }
            i9 = c0873h.f2750u;
            i10 = this.f2735d;
            if (i9 != i10) {
                z9 = z10;
            } else {
                c0873h.f2750u = i10;
            }
            if (!z8 || z9) {
                C0869d c0869dM1900J0 = c0873h.m1900J0();
                String str3 = c0873h.f2747r;
                C1260M c1260m3 = c0873h.f2748s;
                InterfaceC1580e interfaceC1580e3 = c0873h.f2749t;
                int i11 = c0873h.f2750u;
                boolean z11 = c0873h.f2751v;
                int i12 = c0873h.f2752w;
                int i13 = c0873h.f2753x;
                c0869dM1900J0.f2713a = str3;
                c0869dM1900J0.f2714b = c1260m3;
                c0869dM1900J0.f2715c = interfaceC1580e3;
                c0869dM1900J0.f2716d = i11;
                c0869dM1900J0.f2717e = z11;
                c0869dM1900J0.f2718f = i12;
                c0869dM1900J0.f2719g = i13;
                c0869dM1900J0.f2731s = (c0869dM1900J0.f2731s << 2) | 2;
                c0869dM1900J0.m1897c();
            }
            if (c0873h.f7199q) {
                return;
            }
            if (z8 || (z5 && c0873h.f2745A != null)) {
                AbstractC0601k.m1036l(c0873h);
            }
            if (z8 || z9) {
                AbstractC0601k.m1035k(c0873h);
                AbstractC0601k.m1034j(c0873h);
            }
            if (z5) {
                AbstractC0601k.m1034j(c0873h);
                return;
            }
            return;
        }
        c1260m2.getClass();
        z5 = false;
        str = c0873h.f2747r;
        str2 = this.f2732a;
        if (!AbstractC1665j.m2981a(str, str2)) {
        }
        boolean z102 = !c0873h.f2748s.m2344c(c1260m2);
        c0873h.f2748s = c1260m2;
        i5 = c0873h.f2753x;
        i6 = this.f2738g;
        if (i5 != i6) {
        }
        i7 = c0873h.f2752w;
        i8 = this.f2737f;
        if (i7 != i8) {
        }
        z6 = c0873h.f2751v;
        z7 = this.f2736e;
        if (z6 != z7) {
        }
        interfaceC1580e = c0873h.f2749t;
        interfaceC1580e2 = this.f2734c;
        if (!AbstractC1665j.m2981a(interfaceC1580e, interfaceC1580e2)) {
        }
        i9 = c0873h.f2750u;
        i10 = this.f2735d;
        if (i9 != i10) {
        }
        if (!z8) {
            C0869d c0869dM1900J02 = c0873h.m1900J0();
            String str32 = c0873h.f2747r;
            C1260M c1260m32 = c0873h.f2748s;
            InterfaceC1580e interfaceC1580e32 = c0873h.f2749t;
            int i112 = c0873h.f2750u;
            boolean z112 = c0873h.f2751v;
            int i122 = c0873h.f2752w;
            int i132 = c0873h.f2753x;
            c0869dM1900J02.f2713a = str32;
            c0869dM1900J02.f2714b = c1260m32;
            c0869dM1900J02.f2715c = interfaceC1580e32;
            c0869dM1900J02.f2716d = i112;
            c0869dM1900J02.f2717e = z112;
            c0869dM1900J02.f2718f = i122;
            c0869dM1900J02.f2719g = i132;
            c0869dM1900J02.f2731s = (c0869dM1900J02.f2731s << 2) | 2;
            c0869dM1900J02.m1897c();
        }
        if (c0873h.f7199q) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((AbstractC0231b.m395f(AbstractC0231b.m391b(this.f2735d, (this.f2734c.hashCode() + AbstractC0231b.m393d(this.f2732a.hashCode() * 31, 31, this.f2733b)) * 31, 31), 31, this.f2736e) + this.f2737f) * 31) + this.f2738g) * 31;
    }
}
