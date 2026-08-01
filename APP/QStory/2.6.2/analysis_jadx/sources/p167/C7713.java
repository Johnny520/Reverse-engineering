package p167;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2409;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7713 implements InterfaceC2409 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2402 f20933;

    public C7713(EmojiCompatInitializer emojiCompatInitializer, AbstractC2402 abstractC2402) {
        this.f20933 = abstractC2402;
    }

    @Override // androidx.lifecycle.InterfaceC2409
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3527(InterfaceC2388 interfaceC2388) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC7694.m12963(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC7703(), 500L);
        this.f20933.mo4492(this);
    }
}
