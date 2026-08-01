package io.ktor.server.engine;

import io.ktor.util.AbstractC5049;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7383;
import p191.AbstractC8568;
import p252.C8945;
import p252.InterfaceC8941;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4941 implements InterfaceC8941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f12831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8945 f12832;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8941 f12833;

    public C4941(InterfaceC8941 interfaceC8941) {
        interfaceC8941.getClass();
        this.f12833 = interfaceC8941;
        this.f12832 = new C8945(2);
        this.f12831 = new LinkedHashSet();
        this.f12830 = interfaceC8941.mo8911();
    }

    @Override // io.ktor.util.InterfaceC5046
    public final Set names() {
        return AbstractC8568.m13622(AbstractC8568.m13613(this.f12833.names(), ((Map) this.f12832.f4240).keySet()), this.f12831);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8911() {
        return this.f12830;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8912() {
        LinkedHashSet linkedHashSetM13613 = AbstractC8568.m13613(this.f12833.mo8912(), this.f12832.m14144().mo8912());
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM13613) {
            if (!this.f12831.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return AbstractC5176.m9347(arrayList);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8913(String str) {
        str.getClass();
        if (this.f12831.contains(str)) {
            return null;
        }
        C8945 c8945 = this.f12832;
        c8945.getClass();
        return ((Map) c8945.f4240).containsKey(str) ? c8945.m2976(str) : this.f12833.mo8913(str);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8914(InterfaceC7383 interfaceC7383) {
        AbstractC5049.m9193(this, interfaceC7383);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8915(String str) {
        List listMo8913 = mo8913(str);
        if (listMo8913 != null) {
            return (String) AbstractC5176.m9374(listMo8913);
        }
        return null;
    }
}
