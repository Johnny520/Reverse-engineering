package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3257 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C3257.InterfaceC3260 f10645;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(25)
    public static final class C3258 implements Yue.C3257.InterfaceC3260 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.view.inputmethod.InputContentInfo f10646;

        public C3258(@Yue.InterfaceC4410 android.net.Uri r2, @Yue.InterfaceC4410 android.content.ClipDescription r3, @Yue.InterfaceC4544 android.net.Uri r4) {
                r1 = this;
                r1.<init>()
                android.view.inputmethod.InputContentInfo r0 = new android.view.inputmethod.InputContentInfo
                r0.<init>(r2, r3, r4)
                r1.f10646 = r0
                return
        }

        public C3258(@Yue.InterfaceC4410 java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                android.view.inputmethod.InputContentInfo r1 = (android.view.inputmethod.InputContentInfo) r1
                r0.f10646 = r1
                return
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.net.Uri mo13706() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f10646
                android.net.Uri r0 = r0.getLinkUri()
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.net.Uri mo13707() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f10646
                android.net.Uri r0 = r0.getContentUri()
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo13708() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f10646
                r0.requestPermission()
                return
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.content.ClipDescription mo13709() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f10646
                android.content.ClipDescription r0 = r0.getDescription()
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public java.lang.Object mo13710() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f10646
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo13711() {
                r1 = this;
                android.view.inputmethod.InputContentInfo r0 = r1.f10646
                r0.releasePermission()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ$ۥ۟, reason: contains not printable characters */
    public static final class C3259 implements Yue.C3257.InterfaceC3260 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.net.Uri f10647;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.content.ClipDescription f10648;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.net.Uri f10649;

        public C3259(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 android.content.ClipDescription r2, @Yue.InterfaceC4544 android.net.Uri r3) {
                r0 = this;
                r0.<init>()
                r0.f10647 = r1
                r0.f10648 = r2
                r0.f10649 = r3
                return
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ */
        public android.net.Uri mo13706() {
                r1 = this;
                android.net.Uri r0 = r1.f10649
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        public android.net.Uri mo13707() {
                r1 = this;
                android.net.Uri r0 = r1.f10647
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo13708() {
                r0 = this;
                return
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public android.content.ClipDescription mo13709() {
                r1 = this;
                android.content.ClipDescription r0 = r1.f10648
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.Object mo13710() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.C3257.InterfaceC3260
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo13711() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC3260 {
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ */
        android.net.Uri mo13706();

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        android.net.Uri mo13707();

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo13708();

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        android.content.ClipDescription mo13709();

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        java.lang.Object mo13710();

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo13711();
    }

    public C3257(@Yue.InterfaceC4410 Yue.C3257.InterfaceC3260 r1) {
            r0 = this;
            r0.<init>()
            r0.f10645 = r1
            return
    }

    public C3257(@Yue.InterfaceC4410 android.net.Uri r2, @Yue.InterfaceC4410 android.content.ClipDescription r3, @Yue.InterfaceC4544 android.net.Uri r4) {
            r1 = this;
            r1.<init>()
            Yue.ۥ۠ۥۢۦ$ۥ r0 = new Yue.ۥ۠ۥۢۦ$ۥ
            r0.<init>(r2, r3, r4)
            r1.f10645 = r0
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C3257 m13699(@Yue.InterfaceC4544 java.lang.Object r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            Yue.ۥ۠ۥۢۦ r0 = new Yue.ۥ۠ۥۢۦ
            Yue.ۥ۠ۥۢۦ$ۥ r1 = new Yue.ۥ۠ۥۢۦ$ۥ
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.net.Uri m13700() {
            r1 = this;
            Yue.ۥ۠ۥۢۦ$ۥ۟۟ r0 = r1.f10645
            android.net.Uri r0 = r0.mo13707()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.ClipDescription m13701() {
            r1 = this;
            Yue.ۥ۠ۥۢۦ$ۥ۟۟ r0 = r1.f10645
            android.content.ClipDescription r0 = r0.mo13709()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.net.Uri m13702() {
            r1 = this;
            Yue.ۥ۠ۥۢۦ$ۥ۟۟ r0 = r1.f10645
            android.net.Uri r0 = r0.mo13706()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m13703() {
            r1 = this;
            Yue.ۥ۠ۥۢۦ$ۥ۟۟ r0 = r1.f10645
            r0.mo13711()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m13704() {
            r1 = this;
            Yue.ۥ۠ۥۢۦ$ۥ۟۟ r0 = r1.f10645
            r0.mo13708()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Object m13705() {
            r1 = this;
            Yue.ۥ۠ۥۢۦ$ۥ۟۟ r0 = r1.f10645
            java.lang.Object r0 = r0.mo13710()
            return r0
    }
}
