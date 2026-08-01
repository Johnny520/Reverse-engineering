package androidx.compose.p001ui.platform;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2735 implements InterfaceC2757 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClipboardManager f5912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f5913;

    public C2735(Context context) {
        this.f5913 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClipboardManager m4154() {
        ClipboardManager clipboardManager = this.f5912;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f5913.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f5912 = clipboardManager2;
        return clipboardManager2;
    }
}
