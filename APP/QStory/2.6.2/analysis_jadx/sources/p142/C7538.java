package p142;

import android.os.Bundle;
import androidx.appcompat.app.C0105;
import androidx.lifecycle.C2406;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4394;
import p130.C7501;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7538 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0105 f20425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7501 f20426;

    public C7538(C7501 c7501) {
        this.f20426 = c7501;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12731() {
        if (!this.f20426.f20371) {
            C5919.m11250("Can not perform this action after onSaveInstanceState");
            return;
        }
        C0105 c0105 = this.f20425;
        if (c0105 == null) {
            c0105 = new C0105(this);
        }
        this.f20425 = c0105;
        try {
            C2406.class.getDeclaredConstructor(null);
            C0105 c01052 = this.f20425;
            if (c01052 != null) {
                ((LinkedHashSet) c01052.f289).add(C2406.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C2406.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12732(String str, InterfaceC7539 interfaceC7539) {
        interfaceC7539.getClass();
        C7501 c7501 = this.f20426;
        synchronized (c7501.f20368) {
            if (c7501.f20367.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c7501.f20367.put(str, interfaceC7539);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7539 m12733(String str) {
        InterfaceC7539 interfaceC7539;
        C7501 c7501 = this.f20426;
        synchronized (c7501.f20368) {
            Iterator it = c7501.f20367.entrySet().iterator();
            do {
                interfaceC7539 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                InterfaceC7539 interfaceC75392 = (InterfaceC7539) entry.getValue();
                if (AbstractC4394.m8917(str2, str)) {
                    interfaceC7539 = interfaceC75392;
                }
            } while (interfaceC7539 == null);
        }
        return interfaceC7539;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Bundle m12734(String str) {
        C7501 c7501 = this.f20426;
        if (!c7501.f20372) {
            C5919.m11250("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = c7501.f20365;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM13676 = bundle.containsKey(str) ? AbstractC8189.m13676(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c7501.f20365 = null;
        }
        return bundleM13676;
    }
}
