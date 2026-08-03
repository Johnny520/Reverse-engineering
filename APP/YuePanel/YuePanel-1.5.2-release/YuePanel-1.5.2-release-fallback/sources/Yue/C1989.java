package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1989 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.view.DragAndDropPermissions f6327;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C1990 {
        public C1990() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m9210(android.view.DragAndDropPermissions r0) {
                r0.release()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.view.DragAndDropPermissions m9211(android.app.Activity r0, android.view.DragEvent r1) {
                android.view.DragAndDropPermissions r0 = r0.requestDragAndDropPermissions(r1)
                return r0
        }
    }

    public C1989(android.view.DragAndDropPermissions r1) {
            r0 = this;
            r0.<init>()
            r0.f6327 = r1
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C1989 m9208(@Yue.InterfaceC4410 android.app.Activity r0, @Yue.InterfaceC4410 android.view.DragEvent r1) {
            android.view.DragAndDropPermissions r0 = Yue.C1989.C1990.m9211(r0, r1)
            if (r0 == 0) goto Lc
            Yue.ۥ۠۠۠ۡ r1 = new Yue.ۥ۠۠۠ۡ
            r1.<init>(r0)
            return r1
        Lc:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m9209() {
            r1 = this;
            android.view.DragAndDropPermissions r0 = r1.f6327
            Yue.C1989.C1990.m9210(r0)
            return
    }
}
