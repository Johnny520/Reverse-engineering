package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4205 extends Yue.C6094 {

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۦ$ۥ, reason: contains not printable characters */
    public static final class C4206 extends Yue.C0738 {
        public C4206() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C4205.C4206 m16416(int r1, int r2, java.nio.ByteBuffer r3) {
                r0 = this;
                r0.m4578(r1, r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C4205 m16417(int r2) {
                r1 = this;
                Yue.ۥۡۡ۠ۦ r0 = new Yue.ۥۡۡ۠ۦ
                r0.<init>()
                Yue.ۥۡۡ۠ۦ r2 = r1.m16418(r0, r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Yue.C4205 m16418(Yue.C4205 r2, int r3) {
                r1 = this;
                int r3 = r1.m4577(r3)
                java.nio.ByteBuffer r0 = r1.f2068
                int r3 = Yue.C4205.m16392(r3, r0)
                java.nio.ByteBuffer r0 = r1.f2068
                Yue.ۥۡۡ۠ۦ r2 = r2.m16405(r3, r0)
                return r2
        }
    }

    public C4205() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m16391() {
            Yue.C1506.m7401()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ int m16392(int r0, java.nio.ByteBuffer r1) {
            int r0 = Yue.C6094.m22858(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m16393(Yue.C2430 r2, int r3) {
            r0 = 1
            r1 = 0
            r2.m11221(r0, r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m16394(Yue.C2430 r2, int r3) {
            r0 = 2
            r1 = 0
            r2.m11221(r0, r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m16395(Yue.C2430 r1, int r2) {
            r0 = 0
            r1.m11217(r0, r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static int m16396(Yue.C2430 r2, int[] r3) {
            int r0 = r3.length
            r1 = 4
            r2.m11264(r1, r0, r1)
            int r0 = r3.length
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L12
            r1 = r3[r0]
            r2.m11220(r1)
            int r0 = r0 + (-1)
            goto L8
        L12:
            int r2 = r2.m11237()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static int m16397(Yue.C2430 r1, int r2, int r3, int r4) {
            r0 = 3
            r1.m11263(r0)
            m16394(r1, r4)
            m16393(r1, r3)
            m16395(r1, r2)
            int r1 = m16398(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static int m16398(Yue.C2430 r0) {
            int r0 = r0.m11236()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m16399(Yue.C2430 r0, int r1) {
            r0.m11238(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m16400(Yue.C2430 r0, int r1) {
            r0.m11242(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static Yue.C4205 m16401(java.nio.ByteBuffer r1) {
            Yue.ۥۡۡ۠ۦ r0 = new Yue.ۥۡۡ۠ۦ
            r0.<init>()
            Yue.ۥۡۡ۠ۦ r1 = m16402(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static Yue.C4205 m16402(java.nio.ByteBuffer r2, Yue.C4205 r3) {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            int r0 = r2.position()
            int r0 = r2.getInt(r0)
            int r1 = r2.position()
            int r0 = r0 + r1
            Yue.ۥۡۡ۠ۦ r2 = r3.m16405(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static void m16403(Yue.C2430 r1, int r2) {
            r0 = 4
            r1.m11264(r0, r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static void m16404(Yue.C2430 r1) {
            r0 = 3
            r1.m11263(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.C4205 m16405(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.m16406(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m16406(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.m22867(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Yue.C4203 m16407(int r2) {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = new Yue.ۥۡۡ۠ۥ
            r0.<init>()
            Yue.ۥۡۡ۠ۥ r2 = r1.m16408(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public Yue.C4203 m16408(Yue.C4203 r2, int r3) {
            r1 = this;
            r0 = 6
            int r0 = r1.m22865(r0)
            if (r0 == 0) goto L19
            int r0 = r1.m22870(r0)
            int r3 = r3 * 4
            int r0 = r0 + r3
            int r3 = r1.m22864(r0)
            java.nio.ByteBuffer r0 = r1.f22019
            Yue.ۥۡۡ۠ۥ r2 = r2.m16374(r3, r0)
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int m16409() {
            r1 = this;
            r0 = 6
            int r0 = r1.m22865(r0)
            if (r0 == 0) goto Lc
            int r0 = r1.m22873(r0)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Yue.C4203.C4204 m16410() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ$ۥ r0 = new Yue.ۥۡۡ۠ۥ$ۥ
            r0.<init>()
            Yue.ۥۡۡ۠ۥ$ۥ r0 = r1.m16411(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Yue.C4203.C4204 m16411(Yue.C4203.C4204 r4) {
            r3 = this;
            r0 = 6
            int r0 = r3.m22865(r0)
            if (r0 == 0) goto L13
            int r0 = r3.m22870(r0)
            r1 = 4
            java.nio.ByteBuffer r2 = r3.f22019
            Yue.ۥۡۡ۠ۥ$ۥ r4 = r4.m16388(r0, r1, r2)
            goto L14
        L13:
            r4 = 0
        L14:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public java.lang.String m16412() {
            r2 = this;
            r0 = 8
            int r0 = r2.m22865(r0)
            if (r0 == 0) goto L10
            int r1 = r2.f22018
            int r0 = r0 + r1
            java.lang.String r0 = r2.m22868(r0)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public java.nio.ByteBuffer m16413() {
            r2 = this;
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r0 = r2.m22871(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public java.nio.ByteBuffer m16414(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r3 = r2.m22872(r3, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public int m16415() {
            r3 = this;
            r0 = 4
            int r0 = r3.m22865(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r3.f22019
            int r2 = r3.f22018
            int r0 = r0 + r2
            int r0 = r1.getInt(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }
}
