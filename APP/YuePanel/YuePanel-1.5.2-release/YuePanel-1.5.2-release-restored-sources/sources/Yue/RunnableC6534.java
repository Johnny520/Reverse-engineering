package Yue;

import Yue.C6517;
import com.android.p001dx.p004io.Opcodes;
import com.nmmedit.protect.NativeUtil;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۣۡ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6534 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C6517.InterfaceC6521 f16799;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ IOException f16800;

    static {
        NativeUtil.classesInit0(Opcodes.MUL_DOUBLE_2ADDR);
    }

    public /* synthetic */ RunnableC6534(C6517.InterfaceC6521 interfaceC6521, IOException iOException) {
        this.f16799 = interfaceC6521;
        this.f16800 = iOException;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
