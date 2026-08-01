package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC3993;
import io.ktor.utils.io.InterfaceC4251;
import java.io.InputStream;
import p175.AbstractC7738;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4116 extends AbstractC3993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f12499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12500;

    public /* synthetic */ C4116(Object obj, int i) {
        this.f12500 = i;
        this.f12499 = obj;
    }

    @Override // io.ktor.http.content.AbstractC3993
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4251 mo8296() {
        int i = this.f12500;
        Object obj = this.f12499;
        switch (i) {
            case 0:
                return AbstractC7738.m13021((InputStream) obj);
            default:
                return (InterfaceC4251) obj;
        }
    }
}
