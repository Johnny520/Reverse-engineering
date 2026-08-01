package p039;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.RunnableC1898;
import p038.InterfaceC6372;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6415 implements InterfaceC6372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6414 f17596;

    public C6415(C6414 c6414) {
        this.f17596 = c6414;
    }

    @Override // p038.InterfaceC6372
    public final void hide() {
        if (this.f17596.f17425.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1898(11));
        }
    }

    @Override // p038.InterfaceC6372
    public final void show() {
        if (this.f17596.f17425.booleanValue()) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1898(12), 300L);
        }
    }
}
