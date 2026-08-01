package p328;

import android.os.CountDownTimer;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class CountDownTimerC8775 extends CountDownTimer {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8782 f24718;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC8775(C8782 c8782) {
        super(10000L, 1000L);
        this.f24718 = c8782;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Iterator it = this.f24718.f24733.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
