package io.ktor.server.engine;

import io.ktor.util.AbstractC4217;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6554;
import p175.AbstractC7739;
import p236.C8116;
import p236.InterfaceC8112;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4109 implements InterfaceC8112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f12486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8116 f12487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8112 f12488;

    public C4109(InterfaceC8112 interfaceC8112) {
        interfaceC8112.getClass();
        this.f12488 = interfaceC8112;
        this.f12487 = new C8116(2);
        this.f12486 = new LinkedHashSet();
        this.f12485 = interfaceC8112.mo8352();
    }

    @Override // io.ktor.util.InterfaceC4214
    public final Set names() {
        return AbstractC7739.m13063(AbstractC7739.m13054(this.f12488.names(), ((Map) this.f12487.f3895).keySet()), this.f12486);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8352() {
        return this.f12485;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8353() {
        LinkedHashSet linkedHashSetM13054 = AbstractC7739.m13054(this.f12488.mo8353(), this.f12487.m13585().mo8353());
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM13054) {
            if (!this.f12486.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return AbstractC4344.m8788(arrayList);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8354(String str) {
        str.getClass();
        if (this.f12486.contains(str)) {
            return null;
        }
        C8116 c8116 = this.f12487;
        c8116.getClass();
        return ((Map) c8116.f3895).containsKey(str) ? c8116.m2416(str) : this.f12488.mo8354(str);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8355(InterfaceC6554 interfaceC6554) {
        AbstractC4217.m8634(this, interfaceC6554);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8356(String str) {
        List listMo8354 = mo8354(str);
        if (listMo8354 != null) {
            return (String) AbstractC4344.m8815(listMo8354);
        }
        return null;
    }
}
