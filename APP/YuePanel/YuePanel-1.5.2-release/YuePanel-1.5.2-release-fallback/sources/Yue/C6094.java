package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6094 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f22018;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.nio.ByteBuffer f22019;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f22020;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f22021;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.AbstractC6640 f22022;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۧ$ۥ, reason: contains not printable characters */
    public class C6095 implements java.util.Comparator<java.lang.Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.nio.ByteBuffer f22023;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6094 f22024;

        public C6095(Yue.C6094 r1, java.nio.ByteBuffer r2) {
                r0 = this;
                r0.f22024 = r1
                r0.f22023 = r2
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Integer r1, java.lang.Integer r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r1 = r0.m22877(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m22877(java.lang.Integer r3, java.lang.Integer r4) {
                r2 = this;
                Yue.ۥۣۢ۠ۧ r0 = r2.f22024
                java.nio.ByteBuffer r1 = r2.f22023
                int r3 = r0.m22875(r3, r4, r1)
                return r3
        }
    }

    public C6094() {
            r1 = this;
            r1.<init>()
            Yue.ۥۣۢۤ۠ r0 = Yue.AbstractC6640.m25509()
            r1.f22022 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m22857(java.nio.ByteBuffer r5, java.lang.String r6) {
            int r0 = r6.length()
            r1 = 4
            if (r0 != r1) goto L22
            r0 = 0
            r2 = r0
        L9:
            if (r2 >= r1) goto L20
            char r3 = r6.charAt(r2)
            int r4 = r5.position()
            int r4 = r4 + r1
            int r4 = r4 + r2
            byte r4 = r5.get(r4)
            char r4 = (char) r4
            if (r3 == r4) goto L1d
            return r0
        L1d:
            int r2 = r2 + 1
            goto L9
        L20:
            r5 = 1
            return r5
        L22:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r6 = "FlatBuffers: file identifier must be length 4"
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m22858(int r0, java.nio.ByteBuffer r1) {
            int r1 = r1.getInt(r0)
            int r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m22859(int r1, int r2, java.nio.ByteBuffer r3) {
            int r0 = r3.capacity()
            int r0 = r0 - r2
            int r1 = r1 + r0
            int r2 = r3.getInt(r0)
            int r1 = r1 - r2
            short r1 = r3.getShort(r1)
            int r1 = r1 + r0
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m22860(int r1, java.nio.ByteBuffer r2, Yue.AbstractC6640 r3) {
            int r0 = r2.getInt(r1)
            int r1 = r1 + r0
            int r0 = r2.getInt(r1)
            int r1 = r1 + 4
            java.lang.String r1 = r3.mo25511(r2, r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Yue.C6094 m22861(Yue.C6094 r0, int r1, java.nio.ByteBuffer r2) {
            int r1 = m22858(r1, r2)
            r0.m22867(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static int m22862(int r8, int r9, java.nio.ByteBuffer r10) {
            int r0 = r10.getInt(r8)
            int r8 = r8 + r0
            int r0 = r10.getInt(r9)
            int r9 = r9 + r0
            int r0 = r10.getInt(r8)
            int r1 = r10.getInt(r9)
            int r8 = r8 + 4
            int r9 = r9 + 4
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        L1b:
            if (r3 >= r2) goto L38
            int r4 = r3 + r8
            byte r5 = r10.get(r4)
            int r6 = r3 + r9
            byte r7 = r10.get(r6)
            if (r5 == r7) goto L35
            byte r8 = r10.get(r4)
            byte r9 = r10.get(r6)
            int r8 = r8 - r9
            return r8
        L35:
            int r3 = r3 + 1
            goto L1b
        L38:
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m22863(int r7, byte[] r8, java.nio.ByteBuffer r9) {
            int r0 = r9.getInt(r7)
            int r7 = r7 + r0
            int r0 = r9.getInt(r7)
            int r1 = r8.length
            int r7 = r7 + 4
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        L11:
            if (r3 >= r2) goto L28
            int r4 = r3 + r7
            byte r5 = r9.get(r4)
            r6 = r8[r3]
            if (r5 == r6) goto L25
            byte r7 = r9.get(r4)
            r8 = r8[r3]
            int r7 = r7 - r8
            return r7
        L25:
            int r3 = r3 + 1
            goto L11
        L28:
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int m22864(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f22019
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m22865(int r3) {
            r2 = this;
            int r0 = r2.f22021
            if (r3 >= r0) goto Le
            java.nio.ByteBuffer r0 = r2.f22019
            int r1 = r2.f22020
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m22866() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.m22867(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m22867(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.f22019 = r2
            if (r2 == 0) goto L16
            r0.f22018 = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.f22020 = r1
            java.nio.ByteBuffer r2 = r0.f22019
            short r1 = r2.getShort(r1)
            r0.f22021 = r1
            goto L1d
        L16:
            r1 = 0
            r0.f22018 = r1
            r0.f22020 = r1
            r0.f22021 = r1
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String m22868(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f22019
            Yue.ۥۣۢۤ۠ r1 = r2.f22022
            java.lang.String r3 = m22860(r3, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.C6094 m22869(Yue.C6094 r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f22019
            Yue.ۥۣۢ۠ۧ r2 = m22861(r2, r3, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m22870(int r2) {
            r1 = this;
            int r0 = r1.f22018
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.f22019
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            int r2 = r2 + 4
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.nio.ByteBuffer m22871(int r3, int r4) {
            r2 = this;
            int r3 = r2.m22865(r3)
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.nio.ByteBuffer r0 = r2.f22019
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r1)
            int r1 = r2.m22870(r3)
            r0.position(r1)
            int r3 = r2.m22873(r3)
            int r3 = r3 * r4
            int r1 = r1 + r3
            r0.limit(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public java.nio.ByteBuffer m22872(java.nio.ByteBuffer r2, int r3, int r4) {
            r1 = this;
            int r3 = r1.m22865(r3)
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r0 = r1.m22870(r3)
            r2.rewind()
            int r3 = r1.m22873(r3)
            int r3 = r3 * r4
            int r3 = r3 + r0
            r2.limit(r3)
            r2.position(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m22873(int r2) {
            r1 = this;
            int r0 = r1.f22018
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.f22019
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.f22019
            int r2 = r0.getInt(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.nio.ByteBuffer m22874() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f22019
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m22875(java.lang.Integer r1, java.lang.Integer r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m22876(int[] r5, java.nio.ByteBuffer r6) {
            r4 = this;
            int r0 = r5.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 0
            r2 = r1
        L5:
            int r3 = r5.length
            if (r2 >= r3) goto L13
            r3 = r5[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L5
        L13:
            Yue.ۥۣۢ۠ۧ$ۥ r2 = new Yue.ۥۣۢ۠ۧ$ۥ
            r2.<init>(r4, r6)
            java.util.Arrays.sort(r0, r2)
        L1b:
            int r6 = r5.length
            if (r1 >= r6) goto L29
            r6 = r0[r1]
            int r6 = r6.intValue()
            r5[r1] = r6
            int r1 = r1 + 1
            goto L1b
        L29:
            return
    }
}
