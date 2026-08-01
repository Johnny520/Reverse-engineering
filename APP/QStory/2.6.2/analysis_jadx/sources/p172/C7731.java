package p172;

import androidx.activity.ComponentActivity;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7731 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public volatile ComponentActivity f20995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CopyOnWriteArraySet f20996 = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(InterfaceC7730 interfaceC7730) {
        interfaceC7730.getClass();
        ComponentActivity componentActivity = this.f20995;
        if (componentActivity != null) {
            interfaceC7730.mo165(componentActivity);
        }
        this.f20996.add(interfaceC7730);
    }

    public final void removeOnContextAvailableListener(InterfaceC7730 interfaceC7730) {
        interfaceC7730.getClass();
        this.f20996.remove(interfaceC7730);
    }
}
