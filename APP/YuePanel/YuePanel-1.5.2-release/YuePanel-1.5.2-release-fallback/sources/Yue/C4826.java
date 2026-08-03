package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4826 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f15287;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.appcompat.view.menu.C7343 f15288;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.view.View f15289;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final androidx.appcompat.view.menu.C7350 f15290;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C4826.InterfaceC4831 f15291;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C4826.InterfaceC4830 f15292;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public android.view.View.OnTouchListener f15293;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ, reason: contains not printable characters */
    public class C4827 implements androidx.appcompat.view.menu.C7343.InterfaceC7344 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4826 f15294;

        public C4827(Yue.C4826 r1) {
                r0 = this;
                r0.f15294 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
        public boolean onMenuItemSelected(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1, @Yue.InterfaceC4410 android.view.MenuItem r2) {
                r0 = this;
                Yue.ۥۣۡۤۤ r1 = r0.f15294
                Yue.ۥۣۡۤۤ$ۥ۟۟۟۟ r1 = r1.f15291
                if (r1 == 0) goto Lb
                boolean r1 = r1.onMenuItemClick(r2)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.C7343.InterfaceC7344
        public void onMenuModeChange(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟, reason: contains not printable characters */
    public class C4828 implements android.widget.PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4826 f15295;

        public C4828(Yue.C4826 r1) {
                r0 = this;
                r0.f15295 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r2 = this;
                Yue.ۥۣۡۤۤ r0 = r2.f15295
                Yue.ۥۣۡۤۤ$ۥ۟۟۟ r1 = r0.f15292
                if (r1 == 0) goto L9
                r1.m19114(r0)
            L9:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟۟, reason: contains not printable characters */
    public class C4829 extends Yue.AbstractViewOnTouchListenerC2750 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4826 f15296;

        public C4829(Yue.C4826 r1, android.view.View r2) {
                r0 = this;
                r0.f15296 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.InterfaceC5782 mo1750() {
                r1 = this;
                Yue.ۥۣۡۤۤ r0 = r1.f15296
                androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r0.f15290
                Yue.ۥۡ۠ۦۧ r0 = r0.m28246()
                return r0
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo1751() {
                r1 = this;
                Yue.ۥۣۡۤۤ r0 = r1.f15296
                r0.m19113()
                r0 = 1
                return r0
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo12047() {
                r1 = this;
                Yue.ۥۣۡۤۤ r0 = r1.f15296
                r0.m19102()
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4830 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m19114(Yue.C4826 r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4831 {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public C4826(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.view.View r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C4826(@Yue.InterfaceC4410 android.content.Context r7, @Yue.InterfaceC4410 android.view.View r8, int r9) {
            r6 = this;
            int r4 = Yue.C5058.C5060.f16733
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public C4826(@Yue.InterfaceC4410 android.content.Context r9, @Yue.InterfaceC4410 android.view.View r10, int r11, @Yue.InterfaceC0642 int r12, @Yue.InterfaceC6018 int r13) {
            r8 = this;
            r8.<init>()
            r8.f15287 = r9
            r8.f15289 = r10
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r2 = new androidx.appcompat.view.menu.ۥ۟۟۟۟
            r2.<init>(r9)
            r8.f15288 = r2
            Yue.ۥۣۡۤۤ$ۥ r0 = new Yue.ۥۣۡۤۤ$ۥ
            r0.<init>(r8)
            r2.setCallback(r0)
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r7 = new androidx.appcompat.view.menu.ۥۣ۟۟۟
            r4 = 0
            r0 = r7
            r1 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f15290 = r7
            r7.m28251(r11)
            Yue.ۥۣۡۤۤ$ۥ۟ r9 = new Yue.ۥۣۡۤۤ$ۥ۟
            r9.<init>(r8)
            r7.m28252(r9)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m19102() {
            r1 = this;
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f15290
            r0.dismiss()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.view.View.OnTouchListener m19103() {
            r2 = this;
            android.view.View$OnTouchListener r0 = r2.f15293
            if (r0 != 0) goto Ld
            Yue.ۥۣۡۤۤ$ۥ۟۟ r0 = new Yue.ۥۣۡۤۤ$ۥ۟۟
            android.view.View r1 = r2.f15289
            r0.<init>(r2, r1)
            r2.f15293 = r0
        Ld:
            android.view.View$OnTouchListener r0 = r2.f15293
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m19104() {
            r1 = this;
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f15290
            int r0 = r0.m28244()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.view.Menu m19105() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.f15288
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.MenuInflater m19106() {
            r2 = this;
            Yue.ۥۢ۠ۥۢ r0 = new Yue.ۥۢ۠ۥۢ
            android.content.Context r1 = r2.f15287
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.widget.ListView m19107() {
            r1 = this;
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f15290
            boolean r0 = r0.m28247()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f15290
            android.widget.ListView r0 = r0.m28245()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m19108(@Yue.InterfaceC4144 int r3) {
            r2 = this;
            android.view.MenuInflater r0 = r2.m19106()
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r2.f15288
            r0.inflate(r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m19109(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f15290
            r0.m28250(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m19110(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f15290
            r0.m28251(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m19111(@Yue.InterfaceC4544 Yue.C4826.InterfaceC4830 r1) {
            r0 = this;
            r0.f15292 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m19112(@Yue.InterfaceC4544 Yue.C4826.InterfaceC4831 r1) {
            r0 = this;
            r0.f15291 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m19113() {
            r1 = this;
            androidx.appcompat.view.menu.ۥۣ۟۟۟ r0 = r1.f15290
            r0.m28253()
            return
    }
}
