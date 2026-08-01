package p130;

import android.os.Bundle;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.util.LinkedHashMap;
import p075.C6960;
import p116.C7341;
import p142.InterfaceC7536;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Bundle f20365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7341 f20369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7536 f20370;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f20372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6960 f20368 = new C6960(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f20367 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f20371 = true;

    public C7501(InterfaceC7536 interfaceC7536, C7341 c7341) {
        this.f20370 = interfaceC7536;
        this.f20369 = c7341;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12694() {
        InterfaceC7536 interfaceC7536 = this.f20370;
        if (((C2386) interfaceC7536.getLifecycle()).f7018 != Lifecycle$State.INITIALIZED) {
            C5919.m11250("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f20366) {
                C5919.m11250("SavedStateRegistry was already attached.");
                return;
            }
            this.f20369.invoke();
            interfaceC7536.getLifecycle().mo4493(new InterfaceC2380() { // from class: 飘花落叶言子兰世楪哲苏.飘花落叶言子楪世苏哲兰
                @Override // androidx.lifecycle.InterfaceC2380
                /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
                public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                    Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
                    C7501 c7501 = this.f20373;
                    if (lifecycle$Event == lifecycle$Event2) {
                        c7501.f20371 = true;
                    } else if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
                        c7501.f20371 = false;
                    }
                }
            });
            this.f20366 = true;
        }
    }
}
