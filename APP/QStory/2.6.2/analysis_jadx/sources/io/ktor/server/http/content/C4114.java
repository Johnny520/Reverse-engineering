package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.AbstractC3996;
import io.ktor.util.C4208;
import java.util.ArrayList;
import p236.C8096;
import p236.C8124;
import p236.InterfaceC8111;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4114 extends AbstractC3996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12498 = 1;

    public C4114(AbstractC3986 abstractC3986) {
        abstractC3986.getClass();
        this.f12497 = abstractC3986;
    }

    public String toString() {
        switch (this.f12498) {
            case 0:
                return "HttpStatusCodeContent(" + ((C8096) this.f12497) + ')';
            default:
                return super.toString();
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo8289(C4208 c4208, ArrayList arrayList) {
        switch (this.f12498) {
            case 1:
                c4208.getClass();
                ((AbstractC3986) this.f12497).mo8289(c4208, arrayList);
                break;
            default:
                super.mo8289(c4208, arrayList);
                break;
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8096 mo8290() {
        switch (this.f12498) {
            case 0:
                return (C8096) this.f12497;
            default:
                return ((AbstractC3986) this.f12497).mo8290();
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8291(C4208 c4208) {
        switch (this.f12498) {
            case 1:
                c4208.getClass();
                return ((AbstractC3986) this.f12497).mo8291(c4208);
            default:
                return super.mo8291(c4208);
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8111 mo8292() {
        switch (this.f12498) {
            case 1:
                return ((AbstractC3986) this.f12497).mo8292();
            default:
                return super.mo8292();
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C8124 mo8293() {
        switch (this.f12498) {
            case 1:
                return ((AbstractC3986) this.f12497).mo8293();
            default:
                return super.mo8293();
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Long mo8294() {
        switch (this.f12498) {
            case 1:
                return ((AbstractC3986) this.f12497).mo8294();
            default:
                return super.mo8294();
        }
    }

    public C4114(C8096 c8096) {
        c8096.getClass();
        this.f12497 = c8096;
    }
}
