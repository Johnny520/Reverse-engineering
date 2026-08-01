package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1900 implements InterfaceC1922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClipboardManager f5566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f5567;

    public C1900(Context context) {
        this.f5567 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ClipboardManager m3584() {
        ClipboardManager clipboardManager = this.f5566;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f5567.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f5566 = clipboardManager2;
        return clipboardManager2;
    }
}
