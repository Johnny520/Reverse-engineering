package p015b0;

import p024b9.AbstractC1043k;
import p135j2.InterfaceC3578w;
import p319w2.C9122q3;

/* JADX INFO: renamed from: b0.w4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0882w4 {

    /* JADX INFO: renamed from: a */
    public final C9122q3 f2772a;

    /* JADX INFO: renamed from: b */
    public InterfaceC3578w f2773b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3578w f2774c;

    public /* synthetic */ C0882w4(C9122q3 c9122q3, InterfaceC3578w interfaceC3578w, InterfaceC3578w interfaceC3578w2, int i10, AbstractC1043k abstractC1043k) {
        this(c9122q3, (i10 & 2) != 0 ? null : interfaceC3578w, (i10 & 4) != 0 ? null : interfaceC3578w2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3238e(C0882w4 c0882w4, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c0882w4.m3242d(j10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m3239a(long r6) {
        /*
            r5 = this;
            j2.w r0 = r5.f2773b
            if (r0 == 0) goto L1e
            boolean r1 = r0.mo13245d()
            if (r1 == 0) goto L16
            j2.w r1 = r5.f2774c
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            r1.g r2 = p135j2.InterfaceC3578w.m13371r0(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            r1.g$a r0 = p250r1.C6457g.f20319e
            r1.g r2 = r0.m25594a()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            r1.g$a r0 = p250r1.C6457g.f20319e
            r1.g r2 = r0.m25594a()
        L24:
            long r6 = p015b0.AbstractC0889x4.m3265a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b0.C0882w4.m3239a(long):long");
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3578w m3240b() {
        return this.f2774c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3578w m3241c() {
        return this.f2773b;
    }

    /* JADX INFO: renamed from: d */
    public final int m3242d(long j10, boolean z10) {
        if (z10) {
            j10 = m3239a(j10);
        }
        return this.f2772a.m35404x(m3247j(j10));
    }

    /* JADX INFO: renamed from: f */
    public final C9122q3 m3243f() {
        return this.f2772a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3244g(long j10) {
        long jM3247j = m3247j(m3239a(j10));
        int iM35398r = this.f2772a.m35398r(Float.intBitsToFloat((int) (4294967295L & jM3247j)));
        int i10 = (int) (jM3247j >> 32);
        return Float.intBitsToFloat(i10) >= this.f2772a.m35399s(iM35398r) && Float.intBitsToFloat(i10) <= this.f2772a.m35400t(iM35398r);
    }

    /* JADX INFO: renamed from: h */
    public final void m3245h(InterfaceC3578w interfaceC3578w) {
        this.f2774c = interfaceC3578w;
    }

    /* JADX INFO: renamed from: i */
    public final void m3246i(InterfaceC3578w interfaceC3578w) {
        this.f2773b = interfaceC3578w;
    }

    /* JADX INFO: renamed from: j */
    public final long m3247j(long j10) {
        InterfaceC3578w interfaceC3578w;
        InterfaceC3578w interfaceC3578w2 = this.f2773b;
        if (interfaceC3578w2 == null) {
            return j10;
        }
        if (!interfaceC3578w2.mo13245d()) {
            interfaceC3578w2 = null;
        }
        if (interfaceC3578w2 == null || (interfaceC3578w = this.f2774c) == null) {
            return j10;
        }
        InterfaceC3578w interfaceC3578w3 = interfaceC3578w.mo13245d() ? interfaceC3578w : null;
        return interfaceC3578w3 == null ? j10 : interfaceC3578w2.mo13253v(interfaceC3578w3, j10);
    }

    /* JADX INFO: renamed from: k */
    public final long m3248k(long j10) {
        InterfaceC3578w interfaceC3578w;
        InterfaceC3578w interfaceC3578w2 = this.f2773b;
        if (interfaceC3578w2 == null) {
            return j10;
        }
        if (!interfaceC3578w2.mo13245d()) {
            interfaceC3578w2 = null;
        }
        if (interfaceC3578w2 == null || (interfaceC3578w = this.f2774c) == null) {
            return j10;
        }
        InterfaceC3578w interfaceC3578w3 = interfaceC3578w.mo13245d() ? interfaceC3578w : null;
        return interfaceC3578w3 == null ? j10 : interfaceC3578w3.mo13253v(interfaceC3578w2, j10);
    }

    public C0882w4(C9122q3 c9122q3, InterfaceC3578w interfaceC3578w, InterfaceC3578w interfaceC3578w2) {
        this.f2772a = c9122q3;
        this.f2773b = interfaceC3578w;
        this.f2774c = interfaceC3578w2;
    }
}
