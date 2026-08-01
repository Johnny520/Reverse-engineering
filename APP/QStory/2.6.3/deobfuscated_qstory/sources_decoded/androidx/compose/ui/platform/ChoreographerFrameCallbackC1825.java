package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.activity.AbstractC0053;
import kotlin.Result;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1825 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f5316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5444 f5317;

    public ChoreographerFrameCallbackC1825(C5444 c5444, C1824 c1824, InterfaceC6558 interfaceC6558) {
        this.f5317 = c5444;
        this.f5316 = interfaceC6558;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objM163;
        try {
            objM163 = Result.m8745constructorimpl(this.f5316.invoke(Long.valueOf(j)));
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        this.f5317.resumeWith(objM163);
    }
}
