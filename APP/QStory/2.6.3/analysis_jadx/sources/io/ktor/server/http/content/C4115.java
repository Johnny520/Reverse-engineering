package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.AbstractC3997;
import io.ktor.util.C4209;
import java.util.ArrayList;
import p236.C8097;
import p236.C8125;
import p236.InterfaceC8112;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4115 extends AbstractC3997 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12502 = 1;

    public C4115(AbstractC3987 abstractC3987) {
        abstractC3987.getClass();
        this.f12501 = abstractC3987;
    }

    public String toString() {
        switch (this.f12502) {
            case 0:
                return "HttpStatusCodeContent(" + ((C8097) this.f12501) + ')';
            default:
                return super.toString();
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo8279(C4209 c4209, ArrayList arrayList) {
        switch (this.f12502) {
            case 1:
                c4209.getClass();
                ((AbstractC3987) this.f12501).mo8279(c4209, arrayList);
                break;
            default:
                super.mo8279(c4209, arrayList);
                break;
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8097 mo8280() {
        switch (this.f12502) {
            case 0:
                return (C8097) this.f12501;
            default:
                return ((AbstractC3987) this.f12501).mo8280();
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8281(C4209 c4209) {
        switch (this.f12502) {
            case 1:
                c4209.getClass();
                return ((AbstractC3987) this.f12501).mo8281(c4209);
            default:
                return super.mo8281(c4209);
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8112 mo8282() {
        switch (this.f12502) {
            case 1:
                return ((AbstractC3987) this.f12501).mo8282();
            default:
                return super.mo8282();
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C8125 mo8283() {
        switch (this.f12502) {
            case 1:
                return ((AbstractC3987) this.f12501).mo8283();
            default:
                return super.mo8283();
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Long mo8284() {
        switch (this.f12502) {
            case 1:
                return ((AbstractC3987) this.f12501).mo8284();
            default:
                return super.mo8284();
        }
    }

    public C4115(C8097 c8097) {
        c8097.getClass();
        this.f12501 = c8097;
    }
}
