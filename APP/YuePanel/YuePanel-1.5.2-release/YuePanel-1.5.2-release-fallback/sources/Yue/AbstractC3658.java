package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3658 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۦ$ۥ, reason: contains not printable characters */
    public interface InterfaceC3659<D> {
        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m14809(@Yue.InterfaceC4410 Yue.C3654<D> r1);

        @Yue.InterfaceC4410
        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        Yue.C3654<D> m14810(int r1, @Yue.InterfaceC4544 android.os.Bundle r2);

        @Yue.InterfaceC3875
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void m14811(@Yue.InterfaceC4410 Yue.C3654<D> r1, D r2);
    }

    public AbstractC3658() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m14800(boolean r0) {
            Yue.C3660.f11669 = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T extends androidx.lifecycle.LifecycleOwner & androidx.lifecycle.ViewModelStoreOwner> Yue.AbstractC3658 m14801(@Yue.InterfaceC4410 T r2) {
            Yue.ۥۣ۠ۧۧ r0 = new Yue.ۥۣ۠ۧۧ
            r1 = r2
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            androidx.lifecycle.ViewModelStore r1 = r1.getViewModelStore()
            r0.<init>(r2, r1)
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract void mo14802(int r1);

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract void mo14803(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract <D> Yue.C3654<D> mo14804(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo14805() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract <D> Yue.C3654<D> mo14806(int r1, @Yue.InterfaceC4544 android.os.Bundle r2, @Yue.InterfaceC4410 Yue.AbstractC3658.InterfaceC3659<D> r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract void mo14807();

    @Yue.InterfaceC4410
    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract <D> Yue.C3654<D> mo14808(int r1, @Yue.InterfaceC4544 android.os.Bundle r2, @Yue.InterfaceC4410 Yue.AbstractC3658.InterfaceC3659<D> r3);
}
