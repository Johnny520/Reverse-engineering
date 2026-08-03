package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6140 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC6139 f22101 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC6139 f22102 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC6139 f22103 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC6139 f22104 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC6139 f22105 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.InterfaceC6139 f22106 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f22107 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f22108 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f22109 = 2;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ, reason: contains not printable characters */
    public static class C6141 implements Yue.C6140.InterfaceC6143 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final Yue.C6140.C6141 f22110 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean f22111;

        static {
                Yue.ۥۢۡ۠ۡ$ۥ r0 = new Yue.ۥۢۡ۠ۡ$ۥ
                r1 = 1
                r0.<init>(r1)
                Yue.C6140.C6141.f22110 = r0
                return
        }

        public C6141(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.f22111 = r1
                return
        }

        @Override // Yue.C6140.InterfaceC6143
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int mo23006(java.lang.CharSequence r5, int r6, int r7) {
                r4 = this;
                int r7 = r7 + r6
                r0 = 0
                r1 = r0
            L3:
                if (r6 >= r7) goto L26
                char r2 = r5.charAt(r6)
                byte r2 = java.lang.Character.getDirectionality(r2)
                int r2 = Yue.C6140.m23004(r2)
                r3 = 1
                if (r2 == 0) goto L1e
                if (r2 == r3) goto L17
                goto L23
            L17:
                boolean r1 = r4.f22111
                if (r1 != 0) goto L1c
                return r3
            L1c:
                r1 = r3
                goto L23
            L1e:
                boolean r1 = r4.f22111
                if (r1 == 0) goto L1c
                return r0
            L23:
                int r6 = r6 + 1
                goto L3
            L26:
                if (r1 == 0) goto L2b
                boolean r5 = r4.f22111
                return r5
            L2b:
                r5 = 2
                return r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟, reason: contains not printable characters */
    public static class C6142 implements Yue.C6140.InterfaceC6143 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final Yue.C6140.C6142 f22112 = null;

        static {
                Yue.ۥۢۡ۠ۡ$ۥ۟ r0 = new Yue.ۥۢۡ۠ۡ$ۥ۟
                r0.<init>()
                Yue.C6140.C6142.f22112 = r0
                return
        }

        public C6142() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C6140.InterfaceC6143
        /* JADX INFO: renamed from: ۥ */
        public int mo23006(java.lang.CharSequence r3, int r4, int r5) {
                r2 = this;
                int r5 = r5 + r4
                r0 = 2
                r1 = r0
            L3:
                if (r4 >= r5) goto L16
                if (r1 != r0) goto L16
                char r1 = r3.charAt(r4)
                byte r1 = java.lang.Character.getDirectionality(r1)
                int r1 = Yue.C6140.m23005(r1)
                int r4 = r4 + 1
                goto L3
            L16:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC6143 {
        /* JADX INFO: renamed from: ۥ */
        int mo23006(java.lang.CharSequence r1, int r2, int r3);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC6144 implements Yue.InterfaceC6139 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C6140.InterfaceC6143 f22113;

        public AbstractC6144(Yue.C6140.InterfaceC6143 r1) {
                r0 = this;
                r0.<init>()
                r0.f22113 = r1
                return
        }

        @Override // Yue.InterfaceC6139
        /* JADX INFO: renamed from: ۥ */
        public boolean mo23002(char[] r1, int r2, int r3) {
                r0 = this;
                java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1)
                boolean r1 = r0.mo23003(r1, r2, r3)
                return r1
        }

        @Override // Yue.InterfaceC6139
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo23003(java.lang.CharSequence r2, int r3, int r4) {
                r1 = this;
                if (r2 == 0) goto L1b
                if (r3 < 0) goto L1b
                if (r4 < 0) goto L1b
                int r0 = r2.length()
                int r0 = r0 - r4
                if (r0 < r3) goto L1b
                Yue.ۥۢۡ۠ۡ$ۥ۟۟ r0 = r1.f22113
                if (r0 != 0) goto L16
                boolean r2 = r1.mo23007()
                return r2
            L16:
                boolean r2 = r1.m23008(r2, r3, r4)
                return r2
            L1b:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public abstract boolean mo23007();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m23008(java.lang.CharSequence r2, int r3, int r4) {
                r1 = this;
                Yue.ۥۢۡ۠ۡ$ۥ۟۟ r0 = r1.f22113
                int r2 = r0.mo23006(r2, r3, r4)
                r3 = 1
                if (r2 == 0) goto L12
                if (r2 == r3) goto L10
                boolean r2 = r1.mo23007()
                return r2
            L10:
                r2 = 0
                return r2
            L12:
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C6145 extends Yue.C6140.AbstractC6144 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean f22114;

        public C6145(Yue.C6140.InterfaceC6143 r1, boolean r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f22114 = r2
                return
        }

        @Override // Yue.C6140.AbstractC6144
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo23007() {
                r1 = this;
                boolean r0 = r1.f22114
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C6146 extends Yue.C6140.AbstractC6144 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final Yue.C6140.C6146 f22115 = null;

        static {
                Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۠ r0 = new Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۠
                r0.<init>()
                Yue.C6140.C6146.f22115 = r0
                return
        }

        public C6146() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // Yue.C6140.AbstractC6144
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo23007() {
                r2 = this;
                java.util.Locale r0 = java.util.Locale.getDefault()
                int r0 = Yue.C6155.m23035(r0)
                r1 = 1
                if (r0 != r1) goto Lc
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    static {
            Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟ r0 = new Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            Yue.C6140.f22101 = r0
            Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟ r0 = new Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟
            r3 = 1
            r0.<init>(r1, r3)
            Yue.C6140.f22102 = r0
            Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟ r0 = new Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟
            Yue.ۥۢۡ۠ۡ$ۥ۟ r1 = Yue.C6140.C6142.f22112
            r0.<init>(r1, r2)
            Yue.C6140.f22103 = r0
            Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟ r0 = new Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟
            r0.<init>(r1, r3)
            Yue.C6140.f22104 = r0
            Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟ r0 = new Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۟
            Yue.ۥۢۡ۠ۡ$ۥ r1 = Yue.C6140.C6141.f22110
            r0.<init>(r1, r2)
            Yue.C6140.f22105 = r0
            Yue.ۥۢۡ۠ۡ$ۥ۟۟۟۠ r0 = Yue.C6140.C6146.f22115
            Yue.C6140.f22106 = r0
            return
    }

    public C6140() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m23004(int r1) {
            r0 = 1
            if (r1 == 0) goto Lb
            if (r1 == r0) goto L9
            r0 = 2
            if (r1 == r0) goto L9
            return r0
        L9:
            r1 = 0
            return r1
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m23005(int r2) {
            r0 = 1
            if (r2 == 0) goto Le
            if (r2 == r0) goto Lc
            r1 = 2
            if (r2 == r1) goto Lc
            switch(r2) {
                case 14: goto Le;
                case 15: goto Le;
                case 16: goto Lc;
                case 17: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r1
        Lc:
            r2 = 0
            return r2
        Le:
            return r0
    }
}
