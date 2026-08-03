package Yue;

import android.os.Bundle;
import android.view.LifecycleOwner;
import android.view.ViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5748 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۦ$ۥ */
    public interface InterfaceC0859<D> {
        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ */
        void m2427(@InterfaceC6391 C5746<D> c5746);

        @InterfaceC6391
        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ۟ */
        C5746<D> m2428(int i, @InterfaceC6490 Bundle bundle);

        @InterfaceC5922
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void m17836(@InterfaceC6391 C5746<D> c5746, D d);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m17829(boolean z) {
        C5749.f14257 = z;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T extends LifecycleOwner & ViewModelStoreOwner> AbstractC5748 m17830(@InterfaceC6391 T t) {
        return new C5749(t, t.getViewModelStore());
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ */
    public abstract void mo2425(int i);

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo2426(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract <D> C5746<D> mo17831(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo17832() {
        return false;
    }

    @InterfaceC6391
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract <D> C5746<D> mo17833(int i, @InterfaceC6490 Bundle bundle, @InterfaceC6391 InterfaceC0859<D> interfaceC0859);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract void mo17834();

    @InterfaceC6391
    @InterfaceC5922
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract <D> C5746<D> mo17835(int i, @InterfaceC6490 Bundle bundle, @InterfaceC6391 InterfaceC0859<D> interfaceC0859);
}
