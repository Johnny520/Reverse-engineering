package androidx.window.layout;

import android.os.Build;
import p134.C7507;
import p134.C7510;
import p134.InterfaceC7508;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2593 implements InterfaceC2591 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7508 f7774;

    public C2593() {
        this.f7774 = Build.VERSION.SDK_INT >= 34 ? C7507.f20381 : C7510.f20384;
        AbstractC8189.m13670(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
