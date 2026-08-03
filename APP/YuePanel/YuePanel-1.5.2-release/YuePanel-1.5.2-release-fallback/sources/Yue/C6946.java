package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(23)
public class C6946 extends Yue.C6943 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean f24193 = true;

    /* JADX INFO: renamed from: Yue.ۥۢۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C6947 {
        public C6947() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m26850(android.view.View r0, int r1) {
                Yue.C6945.m26849(r0, r1)
                return
        }
    }

    static {
            return
    }

    public C6946() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C6935
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo26836(@Yue.InterfaceC4410 android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            super.mo26836(r3, r4)
            goto L15
        La:
            boolean r0 = Yue.C6946.f24193
            if (r0 == 0) goto L15
            Yue.C6946.C6947.m26850(r3, r4)     // Catch: java.lang.NoSuchMethodError -> L12
            goto L15
        L12:
            r3 = 0
            Yue.C6946.f24193 = r3
        L15:
            return
    }
}
