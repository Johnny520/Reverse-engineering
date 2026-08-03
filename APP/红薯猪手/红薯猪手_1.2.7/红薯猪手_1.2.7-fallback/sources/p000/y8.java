package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class y8 {

    public static final class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final ۟.z7.e f1202;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.graphics.Bitmap f1203;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.io.InputStream f1204;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final int f1205;

        public a(android.graphics.Bitmap r4) {
                r3 = this;
                ۟.z7$e r0 = ۟.z7.e.f1271
                java.lang.StringBuilder r1 = p000.ic.f502
                if (r4 == 0) goto Lc
                r1 = 0
                r2 = 0
                r3.<init>(r4, r1, r0, r2)
                return
            Lc:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "bitmap == null"
                r4.<init>(r0)
                throw r4
        }

        public a(android.graphics.Bitmap r4, java.io.InputStream r5, ۟.z7.e r6, int r7) {
                r3 = this;
                r3.<init>()
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L9
                r2 = r0
                goto La
            L9:
                r2 = r1
            La:
                if (r5 == 0) goto Ld
                goto Le
            Ld:
                r0 = r1
            Le:
                r0 = r0 ^ r2
                if (r0 == 0) goto L1c
                r3.f1203 = r4
                r3.f1204 = r5
                java.lang.StringBuilder r4 = p000.ic.f502
                r3.f1202 = r6
                r3.f1205 = r7
                return
            L1c:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                r4.<init>()
                throw r4
        }

        public a(java.io.InputStream r3, ۟.z7.e r4) {
                r2 = this;
                java.lang.StringBuilder r0 = p000.ic.f502
                if (r3 == 0) goto La
                r0 = 0
                r1 = 0
                r2.<init>(r1, r3, r4, r0)
                return
            La:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "stream == null"
                r3.<init>(r4)
                throw r3
        }
    }

    public y8() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m477(int r2, int r3, int r4, int r5, android.graphics.BitmapFactory.Options r6, p000.w8 r7) {
            if (r5 > r3) goto L7
            if (r4 <= r2) goto L5
            goto L7
        L5:
            r2 = 1
            goto L39
        L7:
            if (r3 != 0) goto L13
            float r3 = (float) r4
            float r2 = (float) r2
            float r3 = r3 / r2
            double r2 = (double) r3
        Ld:
            double r2 = java.lang.Math.floor(r2)
            int r2 = (int) r2
            goto L39
        L13:
            if (r2 != 0) goto L1a
            float r2 = (float) r5
            float r3 = (float) r3
            float r2 = r2 / r3
            double r2 = (double) r2
            goto Ld
        L1a:
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            double r0 = (double) r5
            double r0 = java.lang.Math.floor(r0)
            int r3 = (int) r0
            float r4 = (float) r4
            float r2 = (float) r2
            float r4 = r4 / r2
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            int r2 = (int) r4
            boolean r4 = r7.f1136
            if (r4 == 0) goto L35
            int r2 = java.lang.Math.max(r3, r2)
            goto L39
        L35:
            int r2 = java.lang.Math.min(r3, r2)
        L39:
            r6.inSampleSize = r2
            r2 = 0
            r6.inJustDecodeBounds = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.graphics.BitmapFactory.Options m478(p000.w8 r3) {
            boolean r0 = r3.m453()
            android.graphics.Bitmap$Config r1 = r3.f1142
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r2 = 0
            if (r0 != 0) goto L10
            if (r1 == 0) goto L1d
        L10:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inJustDecodeBounds = r0
            if (r1 == 0) goto L1d
            android.graphics.Bitmap$Config r3 = r3.f1142
            r2.inPreferredConfig = r3
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract boolean mo94(p000.w8 r1);

    /* JADX INFO: renamed from: ۥ۟۠ */
    public int mo435() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ */
    public abstract ۟.y8.a mo95(p000.w8 r1);

    /* JADX INFO: renamed from: ۥ۟ۢ */
    public boolean mo436(android.net.NetworkInfo r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
