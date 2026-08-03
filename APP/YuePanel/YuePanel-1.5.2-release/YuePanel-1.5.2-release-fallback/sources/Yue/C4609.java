package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4609 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۡۤ$ۥ, reason: contains not printable characters */
    public static final class C4610 extends Yue.AbstractC4607 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2825<Yue.AbstractC4607, Yue.C6593> f14718;

        public C4610(boolean r1, Yue.InterfaceC2825<? super Yue.AbstractC4607, Yue.C6593> r2) {
                r0 = this;
                r0.f14718 = r2
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC4607
        public void handleOnBackPressed() {
                r1 = this;
                Yue.ۥۣ۠ۡ۟<Yue.ۥۣۡۡۢ, Yue.ۥۣۢ۠ۤ> r0 = r1.f14718
                r0.invoke(r1)
                return
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.AbstractC4607 m18425(@Yue.InterfaceC4418 androidx.activity.OnBackPressedDispatcher r1, @Yue.InterfaceC4543 androidx.lifecycle.LifecycleOwner r2, boolean r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.AbstractC4607, Yue.C6593> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "onBackPressed"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥۣۡۡۤ$ۥ r0 = new Yue.ۥۣۡۡۤ$ۥ
            r0.<init>(r3, r4)
            if (r2 == 0) goto L15
            r1.m27753(r2, r0)
            goto L18
        L15:
            r1.m27752(r0)
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.AbstractC4607 m18426(androidx.activity.OnBackPressedDispatcher r0, androidx.lifecycle.LifecycleOwner r1, boolean r2, Yue.InterfaceC2825 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto La
            r2 = 1
        La:
            Yue.ۥۣۡۡۢ r0 = m18425(r0, r1, r2, r3)
            return r0
    }
}
