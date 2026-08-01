package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC4826;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.InputStream;
import p034.AbstractC7082;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4949 extends AbstractC4826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f12848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12849;

    public /* synthetic */ C4949(Object obj, int i) {
        this.f12849 = i;
        this.f12848 = obj;
    }

    @Override // io.ktor.http.content.AbstractC4826
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5084 mo8845() {
        int i = this.f12849;
        Object obj = this.f12848;
        switch (i) {
            case 0:
                return AbstractC7082.m12297((InputStream) obj);
            default:
                return (InterfaceC5084) obj;
        }
    }
}
