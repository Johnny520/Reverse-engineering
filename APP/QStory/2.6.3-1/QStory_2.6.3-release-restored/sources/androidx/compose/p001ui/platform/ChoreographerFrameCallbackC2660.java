package androidx.compose.p001ui.platform;

import android.view.Choreographer;
import androidx.activity.AbstractC0900;
import kotlin.Result;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2660 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f5661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6276 f5662;

    public ChoreographerFrameCallbackC2660(C6276 c6276, C2659 c2659, InterfaceC7387 interfaceC7387) {
        this.f5662 = c6276;
        this.f5661 = interfaceC7387;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objM723;
        try {
            objM723 = Result.m9304constructorimpl(this.f5661.invoke(Long.valueOf(j)));
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        this.f5662.resumeWith(objM723);
    }
}
