package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.activity.AbstractC0053;
import kotlin.Result;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1825 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6557 f5315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5443 f5316;

    public ChoreographerFrameCallbackC1825(C5443 c5443, C1824 c1824, InterfaceC6557 interfaceC6557) {
        this.f5316 = c5443;
        this.f5315 = interfaceC6557;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objM162;
        try {
            objM162 = Result.m8755constructorimpl(this.f5315.invoke(Long.valueOf(j)));
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        this.f5316.resumeWith(objM162);
    }
}
