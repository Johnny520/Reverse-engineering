package androidx.compose.ui.platform;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1899 implements InterfaceC1921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1900 f5566;

    public C1899(C1900 c1900) {
        this.f5566 = c1900;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3593(C1924 c1924) {
        C1900 c1900 = this.f5566;
        if (c1924 != null) {
            c1900.m3594().setPrimaryClip(c1924.f5673);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c1900.m3594().clearPrimaryClip();
        } else {
            c1900.m3594().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
