package Yue;

import Yue.InterfaceC7144;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC7728 {
    /* JADX INFO: renamed from: ۥ */
    public abstract void mo461(@InterfaceC6391 Runnable runnable);

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3822(@InterfaceC6391 Runnable runnable) {
        if (mo6929()) {
            runnable.run();
        } else {
            mo6930(runnable);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract boolean mo6929();

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public abstract void mo6930(@InterfaceC6391 Runnable runnable);
}
