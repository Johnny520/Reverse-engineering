package bsh;

/* JADX INFO: renamed from: bsh.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1250s extends AbstractC1195i4 {

    /* JADX INFO: renamed from: y */
    public boolean f3803y;

    public C1250s(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m5081k(InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1169e2 {
        Object objMo4048p = interfaceC1188h3.mo4048p(c1174f1, runnableC1205k2);
        if (objMo4048p != Primitive.VOID) {
            return ((Boolean) Primitive.castWrapper(Boolean.TYPE, objMo4048p)).booleanValue();
        }
        throw new C1169e2("Condition evaluates to void type", interfaceC1188h3, c1174f1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4048p(bsh.C1174f1 r4, bsh.RunnableC1205k2 r5) {
        /*
            r3 = this;
            r0 = 0
            bsh.h3 r0 = r3.mo4051s(r0)
            boolean r0 = m5081k(r0, r4, r5)
            r1 = 1
            if (r0 == 0) goto L19
            boolean r0 = r3.f3803y
            if (r0 != 0) goto L36
            bsh.h3 r0 = r3.mo4051s(r1)
            java.lang.Object r4 = r0.mo4048p(r4, r5)
            goto L37
        L19:
            int r0 = r3.mo4050r()
            r2 = 2
            if (r0 <= r2) goto L29
            bsh.h3 r0 = r3.mo4051s(r2)
            java.lang.Object r4 = r0.mo4048p(r4, r5)
            goto L37
        L29:
            boolean r0 = r3.f3803y
            if (r0 == 0) goto L36
            bsh.h3 r0 = r3.mo4051s(r1)
            java.lang.Object r4 = r0.mo4048p(r4, r5)
            goto L37
        L36:
            r4 = 0
        L37:
            boolean r5 = r4 instanceof bsh.C1171e4
            if (r5 == 0) goto L3c
            return r4
        L3c:
            bsh.Primitive r4 = bsh.Primitive.VOID
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.C1250s.mo4048p(bsh.f1, bsh.k2):java.lang.Object");
    }
}
