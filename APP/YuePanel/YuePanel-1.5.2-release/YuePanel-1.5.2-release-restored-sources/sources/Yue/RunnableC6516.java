package Yue;

import Yue.C6517;
import com.nmmedit.protect.NativeUtil;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۡ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6516 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C6517.InterfaceC6522 f16762;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ IOException f16763;

    static {
        NativeUtil.classesInit0(237);
    }

    public /* synthetic */ RunnableC6516(C6517.InterfaceC6522 interfaceC6522, IOException iOException) {
        this.f16762 = interfaceC6522;
        this.f16763 = iOException;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
