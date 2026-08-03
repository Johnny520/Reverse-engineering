package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f435 = "ActionProvider(support)";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f436;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.AbstractC0183.InterfaceC0184 f437;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.AbstractC0183.InterfaceC0185 f438;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public interface InterfaceC0184 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo1036(boolean r1);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧ۠$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC0185 {
        void onActionProviderVisibilityChanged(boolean r1);
    }

    public AbstractC0183(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f436 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.content.Context m1023() {
            r1 = this;
            android.content.Context r0 = r1.f436
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean mo1024() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo1025() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract android.view.View mo1026();

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.View mo1027(@Yue.InterfaceC4410 android.view.MenuItem r1) {
            r0 = this;
            android.view.View r1 = r0.mo1026()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo1028() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo1029(@Yue.InterfaceC4410 android.view.SubMenu r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo1030() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo1031() {
            r2 = this;
            Yue.ۥ۟۟ۧ۠$ۥ۟ r0 = r2.f438
            if (r0 == 0) goto L13
            boolean r0 = r2.mo1030()
            if (r0 == 0) goto L13
            Yue.ۥ۟۟ۧ۠$ۥ۟ r0 = r2.f438
            boolean r1 = r2.mo1025()
            r0.onActionProviderVisibilityChanged(r1)
        L13:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m1032() {
            r1 = this;
            r0 = 0
            r1.f438 = r0
            r1.f437 = r0
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m1033(@Yue.InterfaceC4544 Yue.AbstractC0183.InterfaceC0184 r1) {
            r0 = this;
            r0.f437 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void mo1034(@Yue.InterfaceC4544 Yue.AbstractC0183.InterfaceC0185 r3) {
            r2 = this;
            Yue.ۥ۟۟ۧ۠$ۥ۟ r0 = r2.f438
            if (r0 == 0) goto L29
            if (r3 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
            r0.append(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " instance while it is still in use somewhere else?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionProvider(support)"
            android.util.Log.w(r1, r0)
        L29:
            r2.f438 = r3
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m1035(boolean r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۠$ۥ r0 = r1.f437
            if (r0 == 0) goto L7
            r0.mo1036(r2)
        L7:
            return
    }
}
