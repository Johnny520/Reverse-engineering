package a;

/* JADX INFO: renamed from: a.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0054ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a.C0073bg f405a;

    /* JADX INFO: renamed from: a.ag$a */
    public static class a {
        public static void a(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
                boolean r0 = d(r3)
                if (r0 != 0) goto L41
                int r0 = r2 << 28
                int r1 = r3 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L41
                boolean r0 = d(r4)
                if (r0 != 0) goto L41
                boolean r0 = d(r5)
                if (r0 != 0) goto L41
                r2 = r2 & 7
                int r2 = r2 << 18
                r3 = r3 & 63
                int r3 = r3 << 12
                r2 = r2 | r3
                r3 = r4 & 63
                int r3 = r3 << 6
                r2 = r2 | r3
                r3 = r5 & 63
                r2 = r2 | r3
                int r3 = r2 >>> 10
                r4 = 55232(0xd7c0, float:7.7397E-41)
                int r3 = r3 + r4
                char r3 = (char) r3
                r6[r7] = r3
                int r7 = r7 + 1
                r2 = r2 & 1023(0x3ff, float:1.434E-42)
                r3 = 56320(0xdc00, float:7.8921E-41)
                int r2 = r2 + r3
                char r2 = (char) r2
                r6[r7] = r2
                return
            L41:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid UTF-8"
                r2.<init>(r3)
                throw r2
        }

        public static void b(byte r2, byte r3, byte r4, char[] r5, int r6) {
                boolean r0 = d(r3)
                if (r0 != 0) goto L2a
                r0 = -32
                r1 = -96
                if (r2 != r0) goto Le
                if (r3 < r1) goto L2a
            Le:
                r0 = -19
                if (r2 != r0) goto L14
                if (r3 >= r1) goto L2a
            L14:
                boolean r0 = d(r4)
                if (r0 != 0) goto L2a
                r2 = r2 & 15
                int r2 = r2 << 12
                r3 = r3 & 63
                int r3 = r3 << 6
                r2 = r2 | r3
                r3 = r4 & 63
                r2 = r2 | r3
                char r2 = (char) r2
                r5[r6] = r2
                return
            L2a:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid UTF-8"
                r2.<init>(r3)
                throw r2
        }

        public static void c(byte r1, byte r2, char[] r3, int r4) {
                r0 = -62
                if (r1 < r0) goto L1d
                boolean r0 = d(r2)
                if (r0 != 0) goto L15
                r1 = r1 & 31
                int r1 = r1 << 6
                r2 = r2 & 63
                r1 = r1 | r2
                char r1 = (char) r1
                r3[r4] = r1
                return
            L15:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
                r1.<init>(r2)
                throw r1
            L1d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
                r1.<init>(r2)
                throw r1
        }

        public static boolean d(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r1 = 1
                return r1
            L6:
                r1 = 0
                return r1
        }
    }

    public AbstractC0054ag() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.String a(java.nio.ByteBuffer r1, int r2, int r3);

    public abstract void b(java.lang.CharSequence r1, java.nio.ByteBuffer r2);

    public abstract int c(java.lang.CharSequence r1);
}
