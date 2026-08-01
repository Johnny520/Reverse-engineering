package io.ktor.server.cio;

import io.ktor.util.AbstractC5049;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7383;
import p252.C8933;
import p252.InterfaceC8924;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4910 implements InterfaceC8924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8933 f12726;

    public C4910(C8933 c8933) {
        this.f12726 = c8933;
    }

    @Override // io.ktor.util.InterfaceC5046
    public final boolean isEmpty() {
        return this.f12726.f13048.isEmpty();
    }

    @Override // io.ktor.util.InterfaceC5046
    public final Set names() {
        return this.f12726.names();
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8911() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8912() {
        return this.f12726.mo8912();
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8913(String str) {
        str.getClass();
        return this.f12726.mo8913(str);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8914(InterfaceC7383 interfaceC7383) {
        AbstractC5049.m9193(this, interfaceC7383);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8915(String str) {
        List listMo8913 = this.f12726.mo8913("sessionId");
        if (listMo8913 == null) {
            return null;
        }
        return listMo8913.isEmpty() ? "" : (String) AbstractC5176.m9379(listMo8913);
    }
}
