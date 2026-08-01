package io.ktor.server.cio;

import io.ktor.util.AbstractC4216;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6553;
import p236.C8103;
import p236.InterfaceC8094;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4077 implements InterfaceC8094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8103 f12377;

    public C4077(C8103 c8103) {
        this.f12377 = c8103;
    }

    @Override // io.ktor.util.InterfaceC4213
    public final boolean isEmpty() {
        return this.f12377.f12699.isEmpty();
    }

    @Override // io.ktor.util.InterfaceC4213
    public final Set names() {
        return this.f12377.names();
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8362() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8363() {
        return this.f12377.mo8363();
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8364(String str) {
        str.getClass();
        return this.f12377.mo8364(str);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8365(InterfaceC6553 interfaceC6553) {
        AbstractC4216.m8644(this, interfaceC6553);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8366(String str) {
        List listMo8364 = this.f12377.mo8364("sessionId");
        if (listMo8364 == null) {
            return null;
        }
        return listMo8364.isEmpty() ? "" : (String) AbstractC4343.m8827(listMo8364);
    }
}
