package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5434 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f20159 = "RoundedBitmapDrawableFa";

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠ۢ$ۥ, reason: contains not printable characters */
    public static class C5435 extends Yue.AbstractC5433 {
        public C5435(android.content.res.Resources r1, android.graphics.Bitmap r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC5433
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo20486(int r7, int r8, int r9, android.graphics.Rect r10, android.graphics.Rect r11) {
                r6 = this;
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                Yue.C2911.m12421(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // Yue.AbstractC5433
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public boolean mo20487() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f20146
                if (r0 == 0) goto Lc
                boolean r0 = Yue.C0757.m4646(r0)
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // Yue.AbstractC5433
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public void mo20488(boolean r2) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f20146
                if (r0 == 0) goto La
                Yue.C0757.m4647(r0, r2)
                r1.invalidateSelf()
            La:
                return
        }
    }

    public C5434() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.AbstractC5433 m20506(@Yue.InterfaceC4410 android.content.res.Resources r1, @Yue.InterfaceC4544 android.graphics.Bitmap r2) {
            Yue.ۥۡۧ۠۠ r0 = new Yue.ۥۡۧ۠۠
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.AbstractC5433 m20507(@Yue.InterfaceC4410 android.content.res.Resources r2, @Yue.InterfaceC4410 java.io.InputStream r3) {
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3)
            Yue.ۥۡۧ۠ۡ r2 = m20506(r2, r0)
            android.graphics.Bitmap r0 = r2.m20491()
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RoundedBitmapDrawable cannot decode "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "RoundedBitmapDrawableFa"
            android.util.Log.w(r0, r3)
        L24:
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.AbstractC5433 m20508(@Yue.InterfaceC4410 android.content.res.Resources r2, @Yue.InterfaceC4410 java.lang.String r3) {
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r3)
            Yue.ۥۡۧ۠ۡ r2 = m20506(r2, r0)
            android.graphics.Bitmap r0 = r2.m20491()
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RoundedBitmapDrawable cannot decode "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "RoundedBitmapDrawableFa"
            android.util.Log.w(r0, r3)
        L24:
            return r2
    }
}
