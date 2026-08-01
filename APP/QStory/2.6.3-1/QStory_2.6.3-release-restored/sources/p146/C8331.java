package p146;

import android.os.Bundle;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.util.LinkedHashMap;
import p091.C7790;
import p132.C8171;
import p158.InterfaceC8366;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8331 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Bundle f20705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8171 f20709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8366 f20710;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f20712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7790 f20708 = new C7790(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f20707 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f20711 = true;

    public C8331(InterfaceC8366 interfaceC8366, C8171 c8171) {
        this.f20710 = interfaceC8366;
        this.f20709 = c8171;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13282() {
        InterfaceC8366 interfaceC8366 = this.f20710;
        if (((C3219) interfaceC8366.getLifecycle()).f7364 != Lifecycle$State.INITIALIZED) {
            C6755.m11870("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f20706) {
                C6755.m11870("SavedStateRegistry was already attached.");
                return;
            }
            this.f20709.invoke();
            interfaceC8366.getLifecycle().mo5063(new InterfaceC3213() { // from class: 飘花落叶言子兰世楪哲苏.飘花落叶言子楪世苏哲兰
                @Override // androidx.lifecycle.InterfaceC3213
                /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
                public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                    Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
                    C8331 c8331 = this.f20713;
                    if (lifecycle$Event == lifecycle$Event2) {
                        c8331.f20711 = true;
                    } else if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
                        c8331.f20711 = false;
                    }
                }
            });
            this.f20706 = true;
        }
    }
}
