package p167;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2409;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7714 implements InterfaceC2409 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2402 f20928;

    public C7714(EmojiCompatInitializer emojiCompatInitializer, AbstractC2402 abstractC2402) {
        this.f20928 = abstractC2402;
    }

    @Override // androidx.lifecycle.InterfaceC2409
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3537(InterfaceC2388 interfaceC2388) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC7695.m12993(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC7704(), 500L);
        this.f20928.mo4502(this);
    }
}
