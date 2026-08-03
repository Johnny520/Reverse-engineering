package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
@Yue.InterfaceC5792(version = "1.5")
public class C6534 implements java.lang.Iterable<Yue.C6528>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6534.C6535 f22914 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f22915;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f22916;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f22917;

    /* JADX INFO: renamed from: Yue.ۥۢۢۦۧ$ۥ, reason: contains not printable characters */
    public static final class C6535 {
        public C6535() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6535(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C6534 m25023(int r3, int r4, int r5) {
                r2 = this;
                Yue.ۥۢۢۦۧ r0 = new Yue.ۥۢۢۦۧ
                r1 = 0
                r0.<init>(r3, r4, r5, r1)
                return r0
        }
    }

    static {
            Yue.ۥۢۢۦۧ$ۥ r0 = new Yue.ۥۢۢۦۧ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C6534.f22914 = r0
            return
    }

    public C6534(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.f22915 = r2
            int r2 = Yue.C6553.m25168(r2, r3, r4)
            r1.f22916 = r2
            r1.f22917 = r4
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

    public /* synthetic */ C6534(int r1, int r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C6534
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥۢۢۦۧ r0 = (Yue.C6534) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            int r0 = r2.f22915
            Yue.ۥۢۢۦۧ r3 = (Yue.C6534) r3
            int r1 = r3.f22915
            if (r0 != r1) goto L29
            int r0 = r2.f22916
            int r1 = r3.f22916
            if (r0 != r1) goto L29
            int r0 = r2.f22917
            int r3 = r3.f22917
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
            int r0 = r2.f22915
            int r0 = r0 * 31
            int r1 = r2.f22916
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f22917
            int r0 = r0 + r1
        L14:
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.f22917
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L12
            int r0 = r4.f22915
            int r3 = r4.f22916
            int r0 = java.lang.Integer.compareUnsigned(r0, r3)
            if (r0 <= 0) goto L1d
        L10:
            r1 = r2
            goto L1d
        L12:
            int r0 = r4.f22915
            int r3 = r4.f22916
            int r0 = java.lang.Integer.compareUnsigned(r0, r3)
            if (r0 >= 0) goto L1d
            goto L10
        L1d:
            return r1
    }

    @Override // java.lang.Iterable
    @Yue.InterfaceC4418
    public final java.util.Iterator<Yue.C6528> iterator() {
            r5 = this;
            Yue.ۥۢۢۦۨ r0 = new Yue.ۥۢۢۦۨ
            int r1 = r5.f22915
            int r2 = r5.f22916
            int r3 = r5.f22917
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f22917
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f22915
            java.lang.String r2 = Yue.C6528.m24984(r2)
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            int r2 = r3.f22916
            java.lang.String r2 = Yue.C6528.m24984(r2)
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f22917
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L52
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f22915
            java.lang.String r2 = Yue.C6528.m24984(r2)
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            int r2 = r3.f22916
            java.lang.String r2 = Yue.C6528.m24984(r2)
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f22917
            int r1 = -r1
            goto L27
        L52:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m25020() {
            r1 = this;
            int r0 = r1.f22915
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m25021() {
            r1 = this;
            int r0 = r1.f22916
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m25022() {
            r1 = this;
            int r0 = r1.f22917
            return r0
    }
}
