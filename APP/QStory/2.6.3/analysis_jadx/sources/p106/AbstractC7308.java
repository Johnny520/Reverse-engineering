package p106;

import android.view.KeyEvent;
import androidx.compose.ui.InterfaceC2129;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7308 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC2129 m12501(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558) {
        return interfaceC2129.mo3866(new C7309(null, interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m12502(InterfaceC6558 interfaceC6558) {
        return new C7309(interfaceC6558, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int m12503(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m12504(KeyEvent keyEvent) {
        return m12505(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long m12505(int i) {
        long j = ((long) i) << 32;
        int i2 = AbstractC7311.f19454;
        return j;
    }
}
