package p184j3;

import java.util.ArrayList;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0973m;
import p074O2.C1052j;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1178c;
import p172h3.EnumC2241a;
import p178i3.InterfaceC2323d;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: j3.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2387f implements InterfaceC2394m {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1051i f7735d;

    /* JADX INFO: renamed from: e */
    public final int f7736e;

    /* JADX INFO: renamed from: f */
    public final EnumC2241a f7737f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2323d f7738g;

    public AbstractC2387f(InterfaceC2323d interfaceC2323d, InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        this.f7735d = interfaceC1051i;
        this.f7736e = i5;
        this.f7737f = enumC2241a;
        this.f7738g = interfaceC2323d;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC2387f mo4237a(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a);

    /* JADX INFO: renamed from: b */
    public InterfaceC2323d mo4238b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo4239c(InterfaceC2324e interfaceC2324e, AbstractC1178c abstractC1178c);

    /* JADX INFO: renamed from: d */
    public final String m4240d() {
        ArrayList arrayList = new ArrayList(4);
        C1052j c1052j = C1052j.f3286d;
        InterfaceC1051i interfaceC1051i = this.f7735d;
        if (interfaceC1051i != c1052j) {
            arrayList.add("context=" + interfaceC1051i);
        }
        int i5 = this.f7736e;
        if (i5 != -3) {
            arrayList.add("capacity=" + i5);
        }
        EnumC2241a enumC2241a = EnumC2241a.f7351d;
        EnumC2241a enumC2241a2 = this.f7737f;
        if (enumC2241a2 != enumC2241a) {
            arrayList.add("onBufferOverflow=" + enumC2241a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0231b.m402m(sb, AbstractC0973m.m2016W(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // p178i3.InterfaceC2323d
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3119i(p178i3.InterfaceC2324e r9, p074O2.InterfaceC1046d r10) {
        /*
            r8 = this;
            int r0 = r8.f7736e
            r1 = -3
            P2.a r2 = p079P2.EnumC1152a.f3788d
            r3 = 0
            K2.q r4 = p056K2.C0891q.f2780a
            if (r0 != r1) goto L73
            O2.i r0 = r10.mo275e()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            S0.y r5 = new S0.y
            r6 = 18
            r7 = 0
            r5.<init>(r7, r6)
            O2.i r6 = r8.f7735d
            java.lang.Object r1 = r6.mo1165A(r5, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2b
            O2.i r1 = r0.mo1168m(r6)
            goto L30
        L2b:
            r1 = 0
            O2.i r1 = p160f3.AbstractC2162v.m3985g(r0, r6, r1)
        L30:
            boolean r5 = p117X2.AbstractC1665j.m2981a(r1, r0)
            if (r5 == 0) goto L3f
            Q2.c r10 = (p084Q2.AbstractC1178c) r10
            java.lang.Object r9 = r8.mo4239c(r9, r10)
            if (r9 != r2) goto L84
            return r9
        L3f:
            O2.e r5 = p074O2.C1047e.f3285d
            O2.g r6 = r1.mo1166C(r5)
            O2.g r0 = r0.mo1166C(r5)
            boolean r0 = p117X2.AbstractC1665j.m2981a(r6, r0)
            if (r0 == 0) goto L73
            O2.i r0 = r10.mo275e()
            boolean r5 = r9 instanceof p184j3.C2400s
            if (r5 != 0) goto L62
            boolean r5 = r9 instanceof p184j3.C2396o
            if (r5 == 0) goto L5c
            goto L62
        L5c:
            i3.h r5 = new i3.h
            r5.<init>(r9, r0)
            r9 = r5
        L62:
            j3.e r0 = new j3.e
            r5 = 1
            r0.<init>(r8, r3, r5)
            java.lang.Object r3 = p190k3.AbstractC2453a.m4383k(r1)
            java.lang.Object r9 = p184j3.AbstractC2384c.m4236a(r1, r9, r3, r0, r10)
            if (r9 != r2) goto L84
            return r9
        L73:
            G.k r0 = new G.k
            r1 = 6
            r0.<init>(r9, r8, r3, r1)
            java.lang.Object r9 = p160f3.AbstractC2162v.m3982d(r0, r10)
            if (r9 != r2) goto L80
            goto L81
        L80:
            r9 = r4
        L81:
            if (r9 != r2) goto L84
            return r9
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p184j3.AbstractC2387f.mo3119i(i3.e, O2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // p184j3.InterfaceC2394m
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p178i3.InterfaceC2323d mo4148n(p074O2.InterfaceC1051i r5, int r6, p172h3.EnumC2241a r7) {
        /*
            r4 = this;
            O2.i r0 = r4.f7735d
            O2.i r5 = r5.mo1168m(r0)
            h3.a r1 = p172h3.EnumC2241a.f7351d
            h3.a r2 = r4.f7737f
            int r3 = r4.f7736e
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = p117X2.AbstractC1665j.m2981a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            j3.f r5 = r4.mo4237a(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p184j3.AbstractC2387f.mo4148n(O2.i, int, h3.a):i3.d");
    }

    public final String toString() {
        return this.f7738g + " -> " + m4240d();
    }
}
