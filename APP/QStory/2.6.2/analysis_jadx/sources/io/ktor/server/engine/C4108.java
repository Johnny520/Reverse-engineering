package io.ktor.server.engine;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import io.ktor.util.AbstractC4216;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6553;
import p236.C8115;
import p236.InterfaceC8111;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C4108 implements InterfaceC8111 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f12482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8115 f12483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8111 f12484;

    public C4108(InterfaceC8111 interfaceC8111) {
        interfaceC8111.getClass();
        this.f12484 = interfaceC8111;
        this.f12483 = new C8115(2);
        this.f12482 = new LinkedHashSet();
        this.f12481 = interfaceC8111.mo8362();
    }

    @Override // io.ktor.util.InterfaceC4213
    public final Set names() {
        return AbstractC0455.m1159(AbstractC0455.m1156(this.f12484.names(), ((Map) this.f12483.f3894).keySet()), this.f12482);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8362() {
        return this.f12481;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8363() {
        LinkedHashSet linkedHashSetM1156 = AbstractC0455.m1156(this.f12484.mo8363(), this.f12483.m13556().mo8363());
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM1156) {
            if (!this.f12482.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return AbstractC4343.m8800(arrayList);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8364(String str) {
        str.getClass();
        if (this.f12482.contains(str)) {
            return null;
        }
        C8115 c8115 = this.f12483;
        c8115.getClass();
        return ((Map) c8115.f3894).containsKey(str) ? c8115.m2406(str) : this.f12484.mo8364(str);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8365(InterfaceC6553 interfaceC6553) {
        AbstractC4216.m8644(this, interfaceC6553);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8366(String str) {
        List listMo8364 = mo8364(str);
        if (listMo8364 != null) {
            return (String) AbstractC4343.m8830(listMo8364);
        }
        return null;
    }
}
