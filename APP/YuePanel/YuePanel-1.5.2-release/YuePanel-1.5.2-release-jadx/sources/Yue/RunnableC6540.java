package Yue;

import Yue.C6517;
import com.android.p001dx.p004io.Opcodes;
import com.nmmedit.protect.NativeUtil;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6540 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C6517.InterfaceC6521 f16809;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ IOException f16810;

    static {
        NativeUtil.classesInit0(Opcodes.OR_INT_LIT8);
    }

    public /* synthetic */ RunnableC6540(C6517.InterfaceC6521 interfaceC6521, IOException iOException) {
        this.f16809 = interfaceC6521;
        this.f16810 = iOException;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
