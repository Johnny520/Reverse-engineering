package androidx.compose.p001ui.platform;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2734 implements InterfaceC2756 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2735 f5911;

    public C2734(C2735 c2735) {
        this.f5911 = c2735;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4153(C2759 c2759) {
        C2735 c2735 = this.f5911;
        if (c2759 != null) {
            c2735.m4154().setPrimaryClip(c2759.f6018);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c2735.m4154().clearPrimaryClip();
        } else {
            c2735.m4154().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
