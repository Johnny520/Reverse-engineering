package Yue;

import Yue.C6517;
import com.nmmedit.protect.NativeUtil;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۣۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6525 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C6517.InterfaceC6522 f16781;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ IOException f16782;

    static {
        NativeUtil.classesInit0(C3464.f305);
    }

    public /* synthetic */ RunnableC6525(C6517.InterfaceC6522 interfaceC6522, IOException iOException) {
        this.f16781 = interfaceC6522;
        this.f16782 = iOException;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
