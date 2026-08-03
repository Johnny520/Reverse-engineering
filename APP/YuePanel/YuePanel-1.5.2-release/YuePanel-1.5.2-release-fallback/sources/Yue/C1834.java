package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1834 {

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C1835 {
        public C1835() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T> T m8598(android.app.Dialog r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }
    }

    public C1834() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.view.View m8597(@Yue.InterfaceC4410 android.app.Dialog r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = Yue.C1834.C1835.m8598(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Dialog"
            r2.<init>(r3)
            throw r2
    }
}
