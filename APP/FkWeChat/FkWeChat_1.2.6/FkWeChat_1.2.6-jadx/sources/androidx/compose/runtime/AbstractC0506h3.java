package androidx.compose.runtime;

import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: androidx.compose.runtime.h3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0506h3 extends AbstractC0524k0 {
    public AbstractC0506h3(InterfaceC0173a interfaceC0173a) {
        super(interfaceC0173a, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 androidx.compose.runtime.v5) = (r5v5 androidx.compose.runtime.v5), (r5v6 androidx.compose.runtime.v5) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.AbstractC0524k0
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.InterfaceC0610v5 mo1695b(androidx.compose.runtime.C0513i3 r4, androidx.compose.runtime.InterfaceC0610v5 r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.C0490f1
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.m1754i()
            if (r0 == 0) goto L47
            r1 = r5
            androidx.compose.runtime.f1 r1 = (androidx.compose.runtime.C0490f1) r1
            androidx.compose.runtime.i2 r5 = r1.m1662b()
            java.lang.Object r0 = r4.m1749d()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof androidx.compose.runtime.C0578r5
            if (r0 == 0) goto L36
            boolean r0 = r4.m1755j()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.m1749d()
            androidx.compose.runtime.r5 r5 = (androidx.compose.runtime.C0578r5) r5
            java.lang.Object r2 = r5.m2195b()
            boolean r0 = p024b9.AbstractC1061t.m3842c(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof androidx.compose.runtime.C0605v0
            if (r0 == 0) goto L47
            a9.l r0 = r4.m1748c()
            androidx.compose.runtime.v0 r5 = (androidx.compose.runtime.C0605v0) r5
            a9.l r2 = r5.m2235b()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4e
            androidx.compose.runtime.v5 r4 = r3.m1698f(r4)
            return r4
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.AbstractC0506h3.mo1695b(androidx.compose.runtime.i3, androidx.compose.runtime.v5):androidx.compose.runtime.v5");
    }

    /* JADX INFO: renamed from: c */
    public abstract C0513i3 mo1630c(Object obj);

    /* JADX INFO: renamed from: d */
    public final C0513i3 m1696d(Object obj) {
        return mo1630c(obj);
    }

    /* JADX INFO: renamed from: e */
    public final C0513i3 m1697e(Object obj) {
        return mo1630c(obj).m1753h();
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0610v5 m1698f(C0513i3 c0513i3) {
        if (!c0513i3.m1754i()) {
            return c0513i3.m1748c() != null ? new C0605v0(c0513i3.m1748c()) : c0513i3.m1751f() != null ? new C0490f1(c0513i3.m1751f()) : new C0578r5(c0513i3.m1749d());
        }
        InterfaceC0512i2 interfaceC0512i2M1751f = c0513i3.m1751f();
        if (interfaceC0512i2M1751f == null) {
            Object objM1752g = c0513i3.m1752g();
            InterfaceC0466b5 interfaceC0466b5M1750e = c0513i3.m1750e();
            if (interfaceC0466b5M1750e == null) {
                interfaceC0466b5M1750e = AbstractC0473c5.m1579r();
            }
            interfaceC0512i2M1751f = AbstractC0473c5.m1570i(objM1752g, interfaceC0466b5M1750e);
        }
        return new C0490f1(interfaceC0512i2M1751f);
    }
}
