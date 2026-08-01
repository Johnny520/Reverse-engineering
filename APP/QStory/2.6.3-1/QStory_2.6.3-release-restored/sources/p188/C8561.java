package p188;

import androidx.activity.ComponentActivity;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public volatile ComponentActivity f21335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CopyOnWriteArraySet f21336 = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(InterfaceC8560 interfaceC8560) {
        interfaceC8560.getClass();
        ComponentActivity componentActivity = this.f21335;
        if (componentActivity != null) {
            interfaceC8560.mo726(componentActivity);
        }
        this.f21336.add(interfaceC8560);
    }

    public final void removeOnContextAvailableListener(InterfaceC8560 interfaceC8560) {
        interfaceC8560.getClass();
        this.f21336.remove(interfaceC8560);
    }
}
