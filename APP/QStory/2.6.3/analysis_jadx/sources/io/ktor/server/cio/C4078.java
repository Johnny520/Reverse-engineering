package io.ktor.server.cio;

import io.ktor.util.AbstractC4217;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6554;
import p236.C8104;
import p236.InterfaceC8095;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4078 implements InterfaceC8095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8104 f12381;

    public C4078(C8104 c8104) {
        this.f12381 = c8104;
    }

    @Override // io.ktor.util.InterfaceC4214
    public final boolean isEmpty() {
        return this.f12381.f12703.isEmpty();
    }

    @Override // io.ktor.util.InterfaceC4214
    public final Set names() {
        return this.f12381.names();
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8352() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8353() {
        return this.f12381.mo8353();
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8354(String str) {
        str.getClass();
        return this.f12381.mo8354(str);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8355(InterfaceC6554 interfaceC6554) {
        AbstractC4217.m8634(this, interfaceC6554);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8356(String str) {
        List listMo8354 = this.f12381.mo8354("sessionId");
        if (listMo8354 == null) {
            return null;
        }
        return listMo8354.isEmpty() ? "" : (String) AbstractC4344.m8820(listMo8354);
    }
}
