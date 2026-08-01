package p106;

import android.view.KeyEvent;
import androidx.compose.ui.InterfaceC2129;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7307 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2129 m12474(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C7308(null, interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m12475(InterfaceC6557 interfaceC6557) {
        return new C7308(interfaceC6557, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m12476(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m12477(KeyEvent keyEvent) {
        return m12478(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m12478(int i) {
        long j = ((long) i) << 32;
        int i2 = AbstractC7310.f19459;
        return j;
    }
}
