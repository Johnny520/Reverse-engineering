package p172;

import androidx.activity.ComponentActivity;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public volatile ComponentActivity f20990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CopyOnWriteArraySet f20991 = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(InterfaceC7731 interfaceC7731) {
        interfaceC7731.getClass();
        ComponentActivity componentActivity = this.f20990;
        if (componentActivity != null) {
            interfaceC7731.mo166(componentActivity);
        }
        this.f20991.add(interfaceC7731);
    }

    public final void removeOnContextAvailableListener(InterfaceC7731 interfaceC7731) {
        interfaceC7731.getClass();
        this.f20991.remove(interfaceC7731);
    }
}
