package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC3421(name = "ViewTreeFullyDrawnReporterOwner")
public final class C6914 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۡ$ۥ, reason: contains not printable characters */
    public static final class C6915 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<android.view.View, android.view.View> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C6914.C6915 f24160 = null;

        static {
                Yue.ۥۢۤۧۡ$ۥ r0 = new Yue.ۥۢۤۧۡ$ۥ
                r0.<init>()
                Yue.C6914.C6915.f24160 = r0
                return
        }

        public C6915() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final android.view.View invoke2(@Yue.InterfaceC4418 android.view.View r2) {
                r1 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r2, r0)
                android.view.ViewParent r2 = r2.getParent()
                boolean r0 = r2 instanceof android.view.View
                if (r0 == 0) goto L10
                android.view.View r2 = (android.view.View) r2
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ android.view.View invoke(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r0.invoke2(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۡ$ۥ۟, reason: contains not printable characters */
    public static final class C6916 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<android.view.View, Yue.InterfaceC2821> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C6914.C6916 f24161 = null;

        static {
                Yue.ۥۢۤۧۡ$ۥ۟ r0 = new Yue.ۥۢۤۧۡ$ۥ۟
                r0.<init>()
                Yue.C6914.C6916.f24161 = r0
                return
        }

        public C6916() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.InterfaceC2821 invoke(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                Yue.ۥۣ۠۠ۦ r1 = r0.m26781(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.InterfaceC2821 m26781(@Yue.InterfaceC4418 android.view.View r2) {
                r1 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r2, r0)
                int r0 = Yue.C5001.C5002.f15888
                java.lang.Object r2 = r2.getTag(r0)
                boolean r0 = r2 instanceof Yue.InterfaceC2821
                if (r0 == 0) goto L12
                Yue.ۥۣ۠۠ۦ r2 = (Yue.InterfaceC2821) r2
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }
    }

    @Yue.InterfaceC3421(name = "get")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC2821 m26779(@Yue.InterfaceC4418 android.view.View r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۢۤۧۡ$ۥ r0 = Yue.C6914.C6915.f24160
            Yue.ۥۡۨۢ r1 = Yue.C5616.m20994(r1, r0)
            Yue.ۥۢۤۧۡ$ۥ۟ r0 = Yue.C6914.C6916.f24161
            Yue.ۥۡۨۢ r1 = Yue.C5629.m21106(r1, r0)
            java.lang.Object r1 = Yue.C5629.m21070(r1)
            Yue.ۥۣ۠۠ۦ r1 = (Yue.InterfaceC2821) r1
            return r1
    }

    @Yue.InterfaceC3421(name = "set")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m26780(@Yue.InterfaceC4418 android.view.View r1, @Yue.InterfaceC4418 Yue.InterfaceC2821 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "fullyDrawnReporterOwner"
            Yue.C3329.m13906(r2, r0)
            int r0 = Yue.C5001.C5002.f15888
            r1.setTag(r0, r2)
            return
    }
}
