package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C7350 implements androidx.appcompat.view.menu.InterfaceC7347 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f25484 = 48;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f25485;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.appcompat.view.menu.C7343 f25486;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean f25487;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f25488;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f25489;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.view.View f25490;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f25491;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f25492;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 f25493;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.AbstractC4138 f25494;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.widget.PopupWindow.OnDismissListener f25495;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final android.widget.PopupWindow.OnDismissListener f25496;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥۣ۟۟۟$ۥ, reason: contains not printable characters */
    public class C7351 implements android.widget.PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.C7350 f25497;

        public C7351(androidx.appcompat.view.menu.C7350 r1) {
                r0 = this;
                r0.f25497 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r1 = this;
                androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f25497
                r0.mo28248()
                return
        }
    }

    public C7350(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r9) {
            r7 = this;
            int r5 = Yue.C5058.C5060.f16733
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C7350(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r9, @Yue.InterfaceC4410 android.view.View r10) {
            r7 = this;
            int r5 = Yue.C5058.C5060.f16733
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C7350(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r9, @Yue.InterfaceC4410 android.view.View r10, boolean r11, @Yue.InterfaceC0642 int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C7350(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r3, @Yue.InterfaceC4410 android.view.View r4, boolean r5, @Yue.InterfaceC0642 int r6, @Yue.InterfaceC6018 int r7) {
            r1 = this;
            r1.<init>()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.f25491 = r0
            androidx.appcompat.view.menu.ۥۣ۟۟۟$ۥ r0 = new androidx.appcompat.view.menu.ۥۣ۟۟۟$ۥ
            r0.<init>(r1)
            r1.f25496 = r0
            r1.f25485 = r2
            r1.f25486 = r3
            r1.f25490 = r4
            r1.f25487 = r5
            r1.f25488 = r6
            r1.f25489 = r7
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7347
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.m28247()
            if (r0 == 0) goto Lb
            Yue.ۥۡ۠ۦۧ r0 = r1.f25494
            r0.dismiss()
        Lb:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7347
    /* JADX INFO: renamed from: ۥ */
    public void mo28215(@Yue.InterfaceC4544 androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r2) {
            r1 = this;
            r1.f25493 = r2
            Yue.ۥۡ۠ۦۧ r0 = r1.f25494
            if (r0 == 0) goto L9
            r0.setCallback(r2)
        L9:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.AbstractC4138 m28243() {
            r15 = this;
            android.content.Context r0 = r15.f25485
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r15.f25485
            android.content.res.Resources r1 = r1.getResources()
            int r2 = Yue.C5058.C5063.f16932
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L3d
            androidx.appcompat.view.menu.ۥ۟ r0 = new androidx.appcompat.view.menu.ۥ۟
            android.content.Context r3 = r15.f25485
            android.view.View r4 = r15.f25490
            int r5 = r15.f25488
            int r6 = r15.f25489
            boolean r7 = r15.f25487
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L4f
        L3d:
            androidx.appcompat.view.menu.ۥ۟۟۟ۦ r0 = new androidx.appcompat.view.menu.ۥ۟۟۟ۦ
            android.content.Context r9 = r15.f25485
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r10 = r15.f25486
            android.view.View r11 = r15.f25490
            int r12 = r15.f25488
            int r13 = r15.f25489
            boolean r14 = r15.f25487
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L4f:
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r15.f25486
            r0.mo16226(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r15.f25496
            r0.mo16234(r1)
            android.view.View r1 = r15.f25490
            r0.mo16229(r1)
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r1 = r15.f25493
            r0.setCallback(r1)
            boolean r1 = r15.f25492
            r0.mo16231(r1)
            int r1 = r15.f25491
            r0.mo16232(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m28244() {
            r1 = this;
            int r0 = r1.f25491
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.widget.ListView m28245() {
            r1 = this;
            Yue.ۥۡ۠ۦۧ r0 = r1.m28246()
            android.widget.ListView r0 = r0.mo14695()
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.AbstractC4138 m28246() {
            r1 = this;
            Yue.ۥۡ۠ۦۧ r0 = r1.f25494
            if (r0 != 0) goto La
            Yue.ۥۡ۠ۦۧ r0 = r1.m28243()
            r1.f25494 = r0
        La:
            Yue.ۥۡ۠ۦۧ r0 = r1.f25494
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m28247() {
            r1 = this;
            Yue.ۥۡ۠ۦۧ r0 = r1.f25494
            if (r0 == 0) goto Lc
            boolean r0 = r0.mo14691()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo28248() {
            r1 = this;
            r0 = 0
            r1.f25494 = r0
            android.widget.PopupWindow$OnDismissListener r0 = r1.f25495
            if (r0 == 0) goto La
            r0.onDismiss()
        La:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m28249(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            r0.f25490 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28250(boolean r2) {
            r1 = this;
            r1.f25492 = r2
            Yue.ۥۡ۠ۦۧ r0 = r1.f25494
            if (r0 == 0) goto L9
            r0.mo16231(r2)
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28251(int r1) {
            r0 = this;
            r0.f25491 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28252(@Yue.InterfaceC4544 android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f25495 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m28253() {
            r2 = this;
            boolean r0 = r2.m28256()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28254(int r1, int r2) {
            r0 = this;
            boolean r1 = r0.m28257(r1, r2)
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "MenuPopupHelper cannot be used without an anchor"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28255(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            Yue.ۥۡ۠ۦۧ r0 = r3.m28246()
            r0.mo16235(r7)
            if (r6 == 0) goto L48
            int r6 = r3.f25491
            android.view.View r7 = r3.f25490
            int r7 = r7.getLayoutDirection()
            int r6 = Yue.C2911.m12423(r6, r7)
            r6 = r6 & 7
            r7 = 5
            if (r6 != r7) goto L21
            android.view.View r6 = r3.f25490
            int r6 = r6.getWidth()
            int r4 = r4 - r6
        L21:
            r0.mo16233(r4)
            r0.mo16236(r5)
            android.content.Context r6 = r3.f25485
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r6 = (int) r6
            android.graphics.Rect r7 = new android.graphics.Rect
            int r1 = r4 - r6
            int r2 = r5 - r6
            int r4 = r4 + r6
            int r5 = r5 + r6
            r7.<init>(r1, r2, r4, r5)
            r0.m16230(r7)
        L48:
            r0.show()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m28256() {
            r3 = this;
            boolean r0 = r3.m28247()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r3.f25490
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            r3.m28255(r2, r2, r2, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m28257(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.m28247()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.f25490
            if (r0 != 0) goto Le
            r3 = 0
            return r3
        Le:
            r2.m28255(r3, r4, r1, r1)
            return r1
    }
}
