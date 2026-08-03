package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0206 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f456 = "android.activity.usage_time";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f457 = "android.usage_time_packages";

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ, reason: contains not printable characters */
    public static class C0207 extends Yue.C0206 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.app.ActivityOptions f458;

        public C0207(android.app.ActivityOptions r1) {
                r0 = this;
                r0.<init>()
                r0.f458 = r1
                return
        }

        @Override // Yue.C0206
        /* JADX INFO: renamed from: ۥ */
        public android.graphics.Rect mo1093() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.f458
                android.graphics.Rect r0 = Yue.C0206.C0210.m1105(r0)
                return r0
        }

        @Override // Yue.C0206
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo1094(@Yue.InterfaceC4410 android.app.PendingIntent r2) {
                r1 = this;
                android.app.ActivityOptions r0 = r1.f458
                Yue.C0206.C0209.m1104(r0, r2)
                return
        }

        @Override // Yue.C0206
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public Yue.C0206 mo1095(@Yue.InterfaceC4544 android.graphics.Rect r3) {
                r2 = this;
                Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
                android.app.ActivityOptions r1 = r2.f458
                android.app.ActivityOptions r3 = Yue.C0206.C0210.m1106(r1, r3)
                r0.<init>(r3)
                return r0
        }

        @Override // Yue.C0206
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public Yue.C0206 mo1096(boolean r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 >= r1) goto L7
                return r2
            L7:
                Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
                android.app.ActivityOptions r1 = r2.f458
                android.app.ActivityOptions r3 = Yue.C0206.C0211.m1107(r1, r3)
                r0.<init>(r3)
                return r0
        }

        @Override // Yue.C0206
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public android.os.Bundle mo1097() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.f458
                android.os.Bundle r0 = r0.toBundle()
                return r0
        }

        @Override // Yue.C0206
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public void mo1098(@Yue.InterfaceC4410 Yue.C0206 r2) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C0206.C0207
                if (r0 == 0) goto Ld
                Yue.ۥ۟۟ۧۨ$ۥ r2 = (Yue.C0206.C0207) r2
                android.app.ActivityOptions r0 = r1.f458
                android.app.ActivityOptions r2 = r2.f458
                r0.update(r2)
            Ld:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C0208 {
        public C0208() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.ActivityOptions m1099(android.app.Activity r0, android.view.View r1, java.lang.String r2) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeSceneTransitionAnimation(r0, r1, r2)
                return r0
        }

        @java.lang.SafeVarargs
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.ActivityOptions m1100(android.app.Activity r0, android.util.Pair<android.view.View, java.lang.String>... r1) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeSceneTransitionAnimation(r0, r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.ActivityOptions m1101() {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeTaskLaunchBehind()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C0209 {
        public C0209() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.ActivityOptions m1102() {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeBasic()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.ActivityOptions m1103(android.view.View r0, int r1, int r2, int r3, int r4) {
                android.app.ActivityOptions r0 = android.app.ActivityOptions.makeClipRevealAnimation(r0, r1, r2, r3, r4)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m1104(android.app.ActivityOptions r0, android.app.PendingIntent r1) {
                r0.requestUsageTimeReport(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C0210 {
        public C0210() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Rect m1105(android.app.ActivityOptions r0) {
                android.graphics.Rect r0 = r0.getLaunchBounds()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.ActivityOptions m1106(android.app.ActivityOptions r0, android.graphics.Rect r1) {
                android.app.ActivityOptions r0 = r0.setLaunchBounds(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C0211 {
        public C0211() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.ActivityOptions m1107(android.app.ActivityOptions r0, boolean r1) {
                android.app.ActivityOptions r0 = r0.setShareIdentityEnabled(r1)
                return r0
        }
    }

    public C0206() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C0206 m1085() {
            Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r1 = Yue.C0206.C0209.m1102()
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C0206 m1086(@Yue.InterfaceC4410 android.view.View r1, int r2, int r3, int r4, int r5) {
            Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r1 = Yue.C0206.C0209.m1103(r1, r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C0206 m1087(@Yue.InterfaceC4410 android.content.Context r1, int r2, int r3) {
            Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeCustomAnimation(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C0206 m1088(@Yue.InterfaceC4410 android.view.View r1, int r2, int r3, int r4, int r5) {
            Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeScaleUpAnimation(r1, r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Yue.C0206 m1089(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 java.lang.String r3) {
            Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r1 = Yue.C0206.C0208.m1099(r1, r2, r3)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C0206 m1090(@Yue.InterfaceC4410 android.app.Activity r4, @Yue.InterfaceC4544 Yue.C4678<android.view.View, java.lang.String>... r5) {
            if (r5 == 0) goto L1c
            int r0 = r5.length
            android.util.Pair[] r0 = new android.util.Pair[r0]
            r1 = 0
        L6:
            int r2 = r5.length
            if (r1 >= r2) goto L1d
            r2 = r5[r1]
            F r3 = r2.f14896
            android.view.View r3 = (android.view.View) r3
            S r2 = r2.f14897
            java.lang.String r2 = (java.lang.String) r2
            android.util.Pair r2 = android.util.Pair.create(r3, r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L1c:
            r0 = 0
        L1d:
            Yue.ۥ۟۟ۧۨ$ۥ r5 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r4 = Yue.C0206.C0208.m1100(r4, r0)
            r5.<init>(r4)
            return r5
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Yue.C0206 m1091() {
            Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r1 = Yue.C0206.C0208.m1101()
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Yue.C0206 m1092(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.graphics.Bitmap r2, int r3, int r4) {
            Yue.ۥ۟۟ۧۨ$ۥ r0 = new Yue.ۥ۟۟ۧۨ$ۥ
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeThumbnailScaleUpAnimation(r1, r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.graphics.Rect mo1093() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo1094(@Yue.InterfaceC4410 android.app.PendingIntent r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Yue.C0206 mo1095(@Yue.InterfaceC4544 android.graphics.Rect r1) {
            r0 = this;
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C0206 mo1096(boolean r1) {
            r0 = this;
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public android.os.Bundle mo1097() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo1098(@Yue.InterfaceC4410 Yue.C0206 r1) {
            r0 = this;
            return
    }
}
