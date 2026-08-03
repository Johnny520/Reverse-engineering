package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0575<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.lang.Object[] f1497;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1498;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1499;

    public C0575() {
            r1 = this;
            r1.<init>()
            r0 = 16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f1497 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m2048(@Yue.InterfaceC4418 T r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.f1497
            int r1 = r2.f1499
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r0.length
            int r3 = r3 + (-1)
            r3 = r3 & r1
            r2.f1499 = r3
            int r0 = r2.f1498
            if (r3 != r0) goto L15
            r2.m2050()
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m2049() {
            r1 = this;
            r0 = 0
            r1.f1498 = r0
            r1.f1499 = r0
            java.lang.Object[] r0 = r1.f1497
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f1497 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m2050() {
            r16 = this;
            r0 = r16
            java.lang.Object[] r1 = r0.f1497
            int r8 = r1.length
            int r2 = r8 << 1
            java.lang.Object[] r15 = new java.lang.Object[r2]
            int r4 = r0.f1498
            r6 = 10
            r7 = 0
            r3 = 0
            r5 = 0
            r2 = r15
            Yue.C0586.m2185(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r9 = r0.f1497
            int r1 = r9.length
            int r13 = r0.f1498
            int r11 = r1 - r13
            r14 = 4
            r1 = 0
            r12 = 0
            r10 = r15
            r15 = r1
            Yue.C0586.m2185(r9, r10, r11, r12, r13, r14, r15)
            r0.f1497 = r2
            r1 = 0
            r0.f1498 = r1
            r0.f1499 = r8
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m2051() {
            r2 = this;
            int r0 = r2.f1498
            int r1 = r2.f1499
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final T m2052() {
            r4 = this;
            int r0 = r4.f1498
            int r1 = r4.f1499
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            java.lang.Object[] r1 = r4.f1497
            r3 = r1[r0]
            r1[r0] = r2
            int r0 = r0 + 1
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0 & r1
            r4.f1498 = r0
            if (r3 == 0) goto L19
            return r3
        L19:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
    }
}
