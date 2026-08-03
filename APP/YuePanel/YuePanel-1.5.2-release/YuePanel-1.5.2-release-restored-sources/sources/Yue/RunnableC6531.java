package Yue;

import Yue.C6517;
import com.nmmedit.protect.NativeUtil;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6531 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C6517.InterfaceC6524 f16793;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ IOException f16794;

    static {
        NativeUtil.classesInit0(426);
    }

    public /* synthetic */ RunnableC6531(C6517.InterfaceC6524 interfaceC6524, IOException iOException) {
        this.f16793 = interfaceC6524;
        this.f16794 = iOException;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
