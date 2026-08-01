package p183;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3242;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8543 implements InterfaceC3242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3235 f21273;

    public C8543(EmojiCompatInitializer emojiCompatInitializer, AbstractC3235 abstractC3235) {
        this.f21273 = abstractC3235;
    }

    @Override // androidx.lifecycle.InterfaceC3242
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4097(InterfaceC3221 interfaceC3221) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC8524.m13552(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC8533(), 500L);
        this.f21273.mo5062(this);
    }
}
