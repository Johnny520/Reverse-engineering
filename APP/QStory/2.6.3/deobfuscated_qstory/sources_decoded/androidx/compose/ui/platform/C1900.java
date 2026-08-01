package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1900 implements InterfaceC1922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClipboardManager f5567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f5568;

    public C1900(Context context) {
        this.f5568 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClipboardManager m3594() {
        ClipboardManager clipboardManager = this.f5567;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f5568.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f5567 = clipboardManager2;
        return clipboardManager2;
    }
}
