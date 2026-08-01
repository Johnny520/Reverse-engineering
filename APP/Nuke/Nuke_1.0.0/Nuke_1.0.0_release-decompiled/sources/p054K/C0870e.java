package p054K;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
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

    public C0870e(String str, C1260M c1260m, InterfaceC1580e interfaceC1580e, int i5, boolean z5, int i6, int i7) {
        this.f2732a = str;
        this.f2733b = c1260m;
        this.f2734c = interfaceC1580e;
        this.f2735d = i5;
        this.f2736e = z5;
        this.f2737f = i6;
        this.f2738g = i7;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo141f(p169h0.AbstractC2206o r12) {
        /*
            r11 = this;
            K.h r12 = (p054K.C0873h) r12
            r12.getClass()
            S0.M r0 = r12.f2748s
            r1 = 0
            r2 = 1
            S0.M r3 = r11.f2733b
            if (r3 == r0) goto L1a
            S0.E r4 = r3.f4540a
            S0.E r0 = r0.f4540a
            boolean r0 = r4.m2321b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r12.f2747r
            java.lang.String r5 = r11.f2732a
            boolean r4 = p117X2.AbstractC1665j.m2981a(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r12.f2747r = r5
            r1 = 0
            r12.f2746B = r1
            r1 = r2
        L2f:
            S0.M r4 = r12.f2748s
            boolean r4 = r4.m2344c(r3)
            r4 = r4 ^ r2
            r12.f2748s = r3
            int r3 = r12.f2753x
            int r5 = r11.f2738g
            if (r3 == r5) goto L41
            r12.f2753x = r5
            r4 = r2
        L41:
            int r3 = r12.f2752w
            int r5 = r11.f2737f
            if (r3 == r5) goto L4a
            r12.f2752w = r5
            r4 = r2
        L4a:
            boolean r3 = r12.f2751v
            boolean r5 = r11.f2736e
            if (r3 == r5) goto L53
            r12.f2751v = r5
            r4 = r2
        L53:
            W0.e r3 = r12.f2749t
            W0.e r5 = r11.f2734c
            boolean r3 = p117X2.AbstractC1665j.m2981a(r3, r5)
            if (r3 != 0) goto L60
            r12.f2749t = r5
            r4 = r2
        L60:
            int r3 = r12.f2750u
            int r5 = r11.f2735d
            if (r3 != r5) goto L68
            r2 = r4
            goto L6a
        L68:
            r12.f2750u = r5
        L6a:
            if (r1 != 0) goto L6e
            if (r2 == 0) goto L9a
        L6e:
            K.d r3 = r12.m1900J0()
            java.lang.String r4 = r12.f2747r
            S0.M r5 = r12.f2748s
            W0.e r6 = r12.f2749t
            int r7 = r12.f2750u
            boolean r8 = r12.f2751v
            int r9 = r12.f2752w
            int r10 = r12.f2753x
            r3.f2713a = r4
            r3.f2714b = r5
            r3.f2715c = r6
            r3.f2716d = r7
            r3.f2717e = r8
            r3.f2718f = r9
            r3.f2719g = r10
            long r4 = r3.f2731s
            r6 = 2
            long r4 = r4 << r6
            r6 = 2
            long r4 = r4 | r6
            r3.f2731s = r4
            r3.m1897c()
        L9a:
            boolean r3 = r12.f7199q
            if (r3 != 0) goto L9f
            goto Lb9
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            K.f r3 = r12.f2745A
            if (r3 == 0) goto Laa
        La7:
            p041H0.AbstractC0601k.m1036l(r12)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb4
        Lae:
            p041H0.AbstractC0601k.m1035k(r12)
            p041H0.AbstractC0601k.m1034j(r12)
        Lb4:
            if (r0 == 0) goto Lb9
            p041H0.AbstractC0601k.m1034j(r12)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054K.C0870e.mo141f(h0.o):void");
    }

    public final int hashCode() {
        return (((AbstractC0231b.m395f(AbstractC0231b.m391b(this.f2735d, (this.f2734c.hashCode() + AbstractC0231b.m393d(this.f2732a.hashCode() * 31, 31, this.f2733b)) * 31, 31), 31, this.f2736e) + this.f2737f) * 31) + this.f2738g) * 31;
    }
}
