package p130;

import android.os.Bundle;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.util.LinkedHashMap;
import p075.C6961;
import p116.C7342;
import p142.InterfaceC7537;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7502 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Bundle f20360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7342 f20364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7537 f20365;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f20367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6961 f20363 = new C6961(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f20362 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f20366 = true;

    public C7502(InterfaceC7537 interfaceC7537, C7342 c7342) {
        this.f20365 = interfaceC7537;
        this.f20364 = c7342;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12723() {
        InterfaceC7537 interfaceC7537 = this.f20365;
        if (((C2386) interfaceC7537.getLifecycle()).f7019 != Lifecycle$State.INITIALIZED) {
            C5925.m11311("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f20361) {
                C5925.m11311("SavedStateRegistry was already attached.");
                return;
            }
            this.f20364.invoke();
            interfaceC7537.getLifecycle().mo4503(new InterfaceC2380() { // from class: 飘花落叶言子兰世楪哲苏.飘花落叶言子楪世苏哲兰
                @Override // androidx.lifecycle.InterfaceC2380
                /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
                public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                    Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
                    C7502 c7502 = this.f20368;
                    if (lifecycle$Event == lifecycle$Event2) {
                        c7502.f20366 = true;
                    } else if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
                        c7502.f20366 = false;
                    }
                }
            });
            this.f20361 = true;
        }
    }
}
