package p336;

import android.os.CountDownTimer;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class CountDownTimerC8798 extends CountDownTimer {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8797 f24766;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC8798(C8797 c8797) {
        super(10000L, 1000L);
        this.f24766 = c8797;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Iterator it = this.f24766.f24765.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
