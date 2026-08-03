package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1085 implements java.lang.Iterable<java.lang.Character>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1085.C1086 f3224 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final char f3225;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final char f3226;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f3227;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۟$ۥ, reason: contains not printable characters */
    public static final class C1086 {
        public C1086() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1086(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C1085 m5764(char r2, char r3, int r4) {
                r1 = this;
                Yue.ۥۣ۟ۤ۟ r0 = new Yue.ۥۣ۟ۤ۟
                r0.<init>(r2, r3, r4)
                return r0
        }
    }

    static {
            Yue.ۥۣ۟ۤ۟$ۥ r0 = new Yue.ۥۣ۟ۤ۟$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C1085.f3224 = r0
            return
    }

    public C1085(char r2, char r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L15
            r1.f3225 = r2
            int r2 = Yue.C4968.m19395(r2, r3, r4)
            char r2 = (char) r2
            r1.f3226 = r2
            r1.f3227 = r4
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r2.<init>(r3)
            throw r2
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Step must be non-zero."
            r2.<init>(r3)
            throw r2
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C1085
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥۣ۟ۤ۟ r0 = (Yue.C1085) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            char r0 = r2.f3225
            Yue.ۥۣ۟ۤ۟ r3 = (Yue.C1085) r3
            char r1 = r3.f3225
            if (r0 != r1) goto L29
            char r0 = r2.f3226
            char r1 = r3.f3226
            if (r0 != r1) goto L29
            int r0 = r2.f3227
            int r3 = r3.f3227
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
            char r0 = r2.f3225
            int r0 = r0 * 31
            char r1 = r2.f3226
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f3227
            int r0 = r0 + r1
        L14:
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.f3227
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L12
            char r0 = r4.f3225
            char r3 = r4.f3226
            int r0 = Yue.C3329.m13910(r0, r3)
            if (r0 <= 0) goto L1d
        L10:
            r1 = r2
            goto L1d
        L12:
            char r0 = r4.f3225
            char r3 = r4.f3226
            int r0 = Yue.C3329.m13910(r0, r3)
            if (r0 >= 0) goto L1d
            goto L10
        L1d:
            return r1
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Character> iterator() {
            r1 = this;
            Yue.ۥۣ۟ۤ r0 = r1.m5763()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f3227
            java.lang.String r1 = " step "
            if (r0 <= 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r2 = r3.f3225
            r0.append(r2)
            java.lang.String r2 = ".."
            r0.append(r2)
            char r2 = r3.f3226
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f3227
        L1f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L42
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r2 = r3.f3225
            r0.append(r2)
            java.lang.String r2 = " downTo "
            r0.append(r2)
            char r2 = r3.f3226
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f3227
            int r1 = -r1
            goto L1f
        L42:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final char m5760() {
            r1 = this;
            char r0 = r1.f3225
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final char m5761() {
            r1 = this;
            char r0 = r1.f3226
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m5762() {
            r1 = this;
            int r0 = r1.f3227
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.AbstractC1084 m5763() {
            r4 = this;
            Yue.ۥۣ۟ۤ۠ r0 = new Yue.ۥۣ۟ۤ۠
            char r1 = r4.f3225
            char r2 = r4.f3226
            int r3 = r4.f3227
            r0.<init>(r1, r2, r3)
            return r0
    }
}
