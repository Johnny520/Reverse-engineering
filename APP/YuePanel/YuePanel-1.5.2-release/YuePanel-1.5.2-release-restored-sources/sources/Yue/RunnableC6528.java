package Yue;

import Yue.C6517;
import com.nmmedit.protect.NativeUtil;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۡ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6528 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C6517.InterfaceC6524 f16787;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ IOException f16788;

    static {
        NativeUtil.classesInit0(246);
    }

    public /* synthetic */ RunnableC6528(C6517.InterfaceC6524 interfaceC6524, IOException iOException) {
        this.f16787 = interfaceC6524;
        this.f16788 = iOException;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
