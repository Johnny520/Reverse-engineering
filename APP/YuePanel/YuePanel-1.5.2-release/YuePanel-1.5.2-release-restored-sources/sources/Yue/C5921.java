package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5921 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final String f1782 = "kotlinx.coroutines.fast.service.loader";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f1783 = false;

    /* JADX INFO: renamed from: ۥ */
    public static final C6228 m2589(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        m18493();
        throw new C5667();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ C6228 m2590(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m2589(th, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m18491() {
    }

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m18492(@InterfaceC6399 AbstractC5912 abstractC5912) {
        return abstractC5912.mo16039() instanceof C6228;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Void m18493() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @InterfaceC6399
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final AbstractC5912 m18494(@InterfaceC6399 InterfaceC5919 interfaceC5919, @InterfaceC6399 List<? extends InterfaceC5919> list) {
        try {
            return interfaceC5919.mo286(list);
        } catch (Throwable th) {
            return m2589(th, interfaceC5919.mo285());
        }
    }
}
