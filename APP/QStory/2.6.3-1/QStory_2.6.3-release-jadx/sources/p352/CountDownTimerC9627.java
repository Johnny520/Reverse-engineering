package p352;

import android.os.CountDownTimer;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class CountDownTimerC9627 extends CountDownTimer {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C9626 f25111;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC9627(C9626 c9626) {
        super(10000L, 1000L);
        this.f25111 = c9626;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Iterator it = this.f25111.f25110.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
