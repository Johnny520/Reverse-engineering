package p142;

import android.os.Bundle;
import androidx.appcompat.app.C0105;
import androidx.lifecycle.C2406;
import com.alibaba.fastjson2.AbstractC2905;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4395;
import p130.C7502;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7539 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0105 f20420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7502 f20421;

    public C7539(C7502 c7502) {
        this.f20421 = c7502;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12760() {
        if (!this.f20421.f20366) {
            C5925.m11311("Can not perform this action after onSaveInstanceState");
            return;
        }
        C0105 c0105 = this.f20420;
        if (c0105 == null) {
            c0105 = new C0105(this);
        }
        this.f20420 = c0105;
        try {
            C2406.class.getDeclaredConstructor(null);
            C0105 c01052 = this.f20420;
            if (c01052 != null) {
                ((LinkedHashSet) c01052.f289).add(C2406.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C2406.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12761(String str, InterfaceC7540 interfaceC7540) {
        interfaceC7540.getClass();
        C7502 c7502 = this.f20421;
        synchronized (c7502.f20363) {
            if (c7502.f20362.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c7502.f20362.put(str, interfaceC7540);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7540 m12762(String str) {
        InterfaceC7540 interfaceC7540;
        C7502 c7502 = this.f20421;
        synchronized (c7502.f20363) {
            Iterator it = c7502.f20362.entrySet().iterator();
            do {
                interfaceC7540 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                InterfaceC7540 interfaceC75402 = (InterfaceC7540) entry.getValue();
                if (AbstractC4395.m8907(str2, str)) {
                    interfaceC7540 = interfaceC75402;
                }
            } while (interfaceC7540 == null);
        }
        return interfaceC7540;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Bundle m12763(String str) {
        C7502 c7502 = this.f20421;
        if (!c7502.f20367) {
            C5925.m11311("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = c7502.f20360;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM6298 = bundle.containsKey(str) ? AbstractC2905.m6298(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c7502.f20360 = null;
        }
        return bundleM6298;
    }
}
