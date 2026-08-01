package p055;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.p001ui.platform.RunnableC2733;
import p054.InterfaceC7201;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7244 implements InterfaceC7201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7243 f17941;

    public C7244(C7243 c7243) {
        this.f17941 = c7243;
    }

    @Override // p054.InterfaceC7201
    public final void hide() {
        if (this.f17941.f17770.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2733(11));
        }
    }

    @Override // p054.InterfaceC7201
    public final void show() {
        if (this.f17941.f17770.booleanValue()) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2733(12), 300L);
        }
    }
}
