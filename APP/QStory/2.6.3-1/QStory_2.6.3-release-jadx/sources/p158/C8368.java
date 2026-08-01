package p158;

import android.os.Bundle;
import androidx.appcompat.app.C0952;
import androidx.lifecycle.C3239;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5227;
import p146.C8331;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0952 f20765;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8331 f20766;

    public C8368(C8331 c8331) {
        this.f20766 = c8331;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13319() {
        if (!this.f20766.f20711) {
            C6755.m11870("Can not perform this action after onSaveInstanceState");
            return;
        }
        C0952 c0952 = this.f20765;
        if (c0952 == null) {
            c0952 = new C0952(this);
        }
        this.f20765 = c0952;
        try {
            C3239.class.getDeclaredConstructor(null);
            C0952 c09522 = this.f20765;
            if (c09522 != null) {
                ((LinkedHashSet) c09522.f634).add(C3239.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C3239.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13320(String str, InterfaceC8369 interfaceC8369) {
        interfaceC8369.getClass();
        C8331 c8331 = this.f20766;
        synchronized (c8331.f20708) {
            if (c8331.f20707.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c8331.f20707.put(str, interfaceC8369);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8369 m13321(String str) {
        InterfaceC8369 interfaceC8369;
        C8331 c8331 = this.f20766;
        synchronized (c8331.f20708) {
            Iterator it = c8331.f20707.entrySet().iterator();
            do {
                interfaceC8369 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                InterfaceC8369 interfaceC83692 = (InterfaceC8369) entry.getValue();
                if (AbstractC5227.m9466(str2, str)) {
                    interfaceC8369 = interfaceC83692;
                }
            } while (interfaceC8369 == null);
        }
        return interfaceC8369;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Bundle m13322(String str) {
        C8331 c8331 = this.f20766;
        if (!c8331.f20712) {
            C6755.m11870("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = c8331.f20705;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM6858 = bundle.containsKey(str) ? AbstractC3738.m6858(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            c8331.f20705 = null;
        }
        return bundleM6858;
    }
}
