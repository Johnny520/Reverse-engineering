package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0766 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C0767 {
        public C0767() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.ColorFilter m4676(int r1, java.lang.Object r2) {
                android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
                android.graphics.BlendMode r2 = (android.graphics.BlendMode) r2
                r0.<init>(r1, r2)
                return r0
        }
    }

    public C0766() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.ColorFilter m4675(int r3, @Yue.InterfaceC4410 Yue.EnumC0768 r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L12
            java.lang.Object r4 = Yue.C0769.C0771.m4679(r4)
            if (r4 == 0) goto L11
            android.graphics.ColorFilter r2 = Yue.C0766.C0767.m4676(r3, r4)
        L11:
            return r2
        L12:
            android.graphics.PorterDuff$Mode r4 = Yue.C0769.m4678(r4)
            if (r4 == 0) goto L1d
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r3, r4)
        L1d:
            return r2
    }
}
