package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3276 implements java.lang.Iterable<java.lang.Integer>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3276.C3277 f10698 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f10699;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f10700;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f10701;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۦ$ۥ, reason: contains not printable characters */
    public static final class C3277 {
        public C3277() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3277(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C3276 m13741(int r2, int r3, int r4) {
                r1 = this;
                Yue.ۥ۠ۥۣۦ r0 = new Yue.ۥ۠ۥۣۦ
                r0.<init>(r2, r3, r4)
                return r0
        }
    }

    static {
            Yue.ۥ۠ۥۣۦ$ۥ r0 = new Yue.ۥ۠ۥۣۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C3276.f10698 = r0
            return
    }

    public C3276(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.f10699 = r2
            int r2 = Yue.C4968.m19395(r2, r3, r4)
            r1.f10700 = r2
            r1.f10701 = r4
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be non-zero."
            r2.<init>(r3)
            throw r2
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C3276
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥ۠ۥۣۦ r0 = (Yue.C3276) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            int r0 = r2.f10699
            Yue.ۥ۠ۥۣۦ r3 = (Yue.C3276) r3
            int r1 = r3.f10699
            if (r0 != r1) goto L29
            int r0 = r2.f10700
            int r1 = r3.f10700
            if (r0 != r1) goto L29
            int r0 = r2.f10701
            int r3 = r3.f10701
            if (r0 != r3) goto L29
        L27:
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            return r3
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L14
        L8:
            int r0 = r2.f10699
            int r0 = r0 * 31
            int r1 = r2.f10700
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f10701
            int r0 = r0 + r1
        L14:
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.f10701
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto Le
            int r0 = r4.f10699
            int r3 = r4.f10700
            if (r0 <= r3) goto L15
        Lc:
            r1 = r2
            goto L15
        Le:
            int r0 = r4.f10699
            int r3 = r4.f10700
            if (r0 >= r3) goto L15
            goto Lc
        L15:
            return r1
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Integer> iterator() {
            r1 = this;
            Yue.ۥ۠ۥۣۥ r0 = r1.m13740()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f10701
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f10699
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            int r2 = r3.f10700
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f10701
        L1f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L42
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f10699
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            int r2 = r3.f10700
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f10701
            int r1 = -r1
            goto L1f
        L42:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m13737() {
            r1 = this;
            int r0 = r1.f10699
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m13738() {
            r1 = this;
            int r0 = r1.f10700
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m13739() {
            r1 = this;
            int r0 = r1.f10701
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.AbstractC3275 m13740() {
            r4 = this;
            Yue.ۥ۠ۥۣۧ r0 = new Yue.ۥ۠ۥۣۧ
            int r1 = r4.f10699
            int r2 = r4.f10700
            int r3 = r4.f10701
            r0.<init>(r1, r2, r3)
            return r0
    }
}
