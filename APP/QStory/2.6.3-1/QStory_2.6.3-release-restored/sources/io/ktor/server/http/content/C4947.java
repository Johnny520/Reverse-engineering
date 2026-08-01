package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.AbstractC4829;
import io.ktor.util.C5041;
import java.util.ArrayList;
import p252.C8926;
import p252.C8954;
import p252.InterfaceC8941;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4947 extends AbstractC4829 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12847 = 1;

    public C4947(AbstractC4819 abstractC4819) {
        abstractC4819.getClass();
        this.f12846 = abstractC4819;
    }

    public String toString() {
        switch (this.f12847) {
            case 0:
                return "HttpStatusCodeContent(" + ((C8926) this.f12846) + ')';
            default:
                return super.toString();
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo8838(C5041 c5041, ArrayList arrayList) {
        switch (this.f12847) {
            case 1:
                c5041.getClass();
                ((AbstractC4819) this.f12846).mo8838(c5041, arrayList);
                break;
            default:
                super.mo8838(c5041, arrayList);
                break;
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8926 mo8839() {
        switch (this.f12847) {
            case 0:
                return (C8926) this.f12846;
            default:
                return ((AbstractC4819) this.f12846).mo8839();
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8840(C5041 c5041) {
        switch (this.f12847) {
            case 1:
                c5041.getClass();
                return ((AbstractC4819) this.f12846).mo8840(c5041);
            default:
                return super.mo8840(c5041);
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8941 mo8841() {
        switch (this.f12847) {
            case 1:
                return ((AbstractC4819) this.f12846).mo8841();
            default:
                return super.mo8841();
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C8954 mo8842() {
        switch (this.f12847) {
            case 1:
                return ((AbstractC4819) this.f12846).mo8842();
            default:
                return super.mo8842();
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Long mo8843() {
        switch (this.f12847) {
            case 1:
                return ((AbstractC4819) this.f12846).mo8843();
            default:
                return super.mo8843();
        }
    }

    public C4947(C8926 c8926) {
        c8926.getClass();
        this.f12846 = c8926;
    }
}
