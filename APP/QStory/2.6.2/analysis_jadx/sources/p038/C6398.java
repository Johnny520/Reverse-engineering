package p038;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.RunnableC1898;
import p037.InterfaceC6355;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6398 implements InterfaceC6355 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6397 f17551;

    public C6398(C6397 c6397) {
        this.f17551 = c6397;
    }

    @Override // p037.InterfaceC6355
    public final void hide() {
        if (this.f17551.f17376.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1898(11));
        }
    }

    @Override // p037.InterfaceC6355
    public final void show() {
        if (this.f17551.f17376.booleanValue()) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1898(12), 300L);
        }
    }
}
