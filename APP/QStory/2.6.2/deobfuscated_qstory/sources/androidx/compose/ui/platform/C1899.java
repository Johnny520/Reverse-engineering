package androidx.compose.ui.platform;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1899 implements InterfaceC1921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1900 f5565;

    public C1899(C1900 c1900) {
        this.f5565 = c1900;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3583(C1924 c1924) {
        C1900 c1900 = this.f5565;
        if (c1924 != null) {
            c1900.m3584().setPrimaryClip(c1924.f5672);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c1900.m3584().clearPrimaryClip();
        } else {
            c1900.m3584().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
