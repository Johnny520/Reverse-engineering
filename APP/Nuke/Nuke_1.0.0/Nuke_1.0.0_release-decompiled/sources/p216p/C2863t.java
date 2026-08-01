package p216p;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
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

    public C2863t(C3162i c3162i, InterfaceC2819L interfaceC2819L, boolean z5, boolean z6, String str, InterfaceC1599a interfaceC1599a) {
        this.f9023a = c3162i;
        this.f9024b = interfaceC2819L;
        this.f9025c = z5;
        this.f9026d = z6;
        this.f9027e = str;
        this.f9028f = interfaceC1599a;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2865v(this.f9023a, this.f9024b, this.f9025c, this.f9026d, this.f9027e, this.f9028f);
    }

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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo141f(p169h0.AbstractC2206o r8) throws java.lang.ClassNotFoundException {
        /*
            r7 = this;
            p.v r8 = (p216p.C2865v) r8
            p.D r0 = r8.f9052z
            s.i r1 = r8.f9040H
            s.i r2 = r7.f9023a
            boolean r1 = p117X2.AbstractC1665j.m2981a(r1, r2)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L19
            r8.m5062M0()
            r8.f9040H = r2
            r8.f9046t = r2
            r1 = r3
            goto L1a
        L19:
            r1 = r4
        L1a:
            p.L r2 = r8.f9047u
            p.L r5 = r7.f9024b
            boolean r2 = p117X2.AbstractC1665j.m2981a(r2, r5)
            if (r2 != 0) goto L27
            r8.f9047u = r5
            r1 = r3
        L27:
            boolean r2 = r8.f9048v
            boolean r5 = r7.f9025c
            if (r2 == r5) goto L35
            r8.f9048v = r5
            if (r5 == 0) goto L34
            r8.mo1051O()
        L34:
            r1 = r3
        L35:
            boolean r2 = r8.f9050x
            boolean r5 = r7.f9026d
            if (r2 == r5) goto L4c
            if (r5 == 0) goto L41
            r8.m1021J0(r0)
            goto L47
        L41:
            r8.m1022K0(r0)
            r8.m5062M0()
        L47:
            p041H0.AbstractC0601k.m1036l(r8)
            r8.f9050x = r5
        L4c:
            java.lang.String r2 = r8.f9049w
            java.lang.String r5 = r7.f9027e
            boolean r2 = p117X2.AbstractC1665j.m2981a(r2, r5)
            if (r2 != 0) goto L5b
            r8.f9049w = r5
            p041H0.AbstractC0601k.m1036l(r8)
        L5b:
            W2.a r2 = r7.f9028f
            r8.f9051y = r2
            boolean r2 = r8.f9041I
            s.i r5 = r8.f9040H
            if (r5 != 0) goto L67
            r6 = r3
            goto L68
        L67:
            r6 = r4
        L68:
            if (r2 == r6) goto L76
            if (r5 != 0) goto L6d
            r4 = r3
        L6d:
            r8.f9041I = r4
            if (r4 != 0) goto L76
            H0.i r2 = r8.f9034B
            if (r2 != 0) goto L76
            goto L77
        L76:
            r3 = r1
        L77:
            if (r3 == 0) goto L8c
            H0.i r1 = r8.f9034B
            if (r1 != 0) goto L81
            boolean r2 = r8.f9041I
            if (r2 != 0) goto L8c
        L81:
            if (r1 == 0) goto L86
            r8.m1022K0(r1)
        L86:
            r1 = 0
            r8.f9034B = r1
            r8.m5066Q0()
        L8c:
            s.i r8 = r8.f9046t
            r0.m5016O0(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p216p.C2863t.mo141f(h0.o):void");
    }

    public final int hashCode() {
        C3162i c3162i = this.f9023a;
        int iHashCode = (c3162i != null ? c3162i.hashCode() : 0) * 31;
        InterfaceC2819L interfaceC2819L = this.f9024b;
        int iM395f = AbstractC0231b.m395f(AbstractC0231b.m395f((iHashCode + (interfaceC2819L != null ? interfaceC2819L.hashCode() : 0)) * 31, 31, this.f9025c), 31, this.f9026d);
        String str = this.f9027e;
        return this.f9028f.hashCode() + ((iM395f + (str != null ? str.hashCode() : 0)) * 961);
    }
}
