package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1683 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C1684 {
        public C1684() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.database.CursorWindow m8093(java.lang.String r1, long r2) {
                android.database.CursorWindow r0 = new android.database.CursorWindow
                r0.<init>(r1, r2)
                return r0
        }
    }

    public C1683() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.database.CursorWindow m8092(@Yue.InterfaceC4544 java.lang.String r2, long r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.database.CursorWindow r2 = Yue.C1683.C1684.m8093(r2, r3)
            return r2
        Lb:
            android.database.CursorWindow r3 = new android.database.CursorWindow
            r3.<init>(r2)
            return r3
    }
}
