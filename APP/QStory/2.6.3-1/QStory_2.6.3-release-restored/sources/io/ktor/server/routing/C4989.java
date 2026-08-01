package io.ktor.server.routing;

import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.server.request.InterfaceC4961;
import p252.InterfaceC8924;
import p252.InterfaceC8931;
import p252.InterfaceC8941;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4989 implements InterfaceC4961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8931 f12936;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8941 f12937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8924 f12938;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8924 f12939;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4995 f12940;

    public C4989(InterfaceC8924 interfaceC8924, InterfaceC4959 interfaceC4959, C4995 c4995) {
        interfaceC8924.getClass();
        interfaceC4959.getClass();
        this.f12940 = c4995;
        this.f12938 = interfaceC4959.mo960();
        this.f12939 = interfaceC4959.mo937();
        this.f12937 = interfaceC4959.mo944();
        this.f12936 = interfaceC4959.mo938();
        interfaceC4959.getCookies();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC8924 mo937() {
        return this.f12939;
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8931 mo938() {
        return this.f12936;
    }

    @Override // io.ktor.server.request.InterfaceC4961, io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4889 mo941() {
        return this.f12940;
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC8941 mo944() {
        return this.f12937;
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC8924 mo960() {
        throw null;
    }
}
