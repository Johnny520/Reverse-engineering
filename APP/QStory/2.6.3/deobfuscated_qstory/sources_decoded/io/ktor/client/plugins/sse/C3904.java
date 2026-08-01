package io.ktor.client.plugins.sse;

import io.ktor.http.content.AbstractC3987;
import io.ktor.util.C4209;
import java.util.ArrayList;
import java.util.Set;
import p236.AbstractC8106;
import p236.AbstractC8115;
import p236.AbstractC8121;
import p236.C8097;
import p236.C8116;
import p236.C8117;
import p236.C8125;
import p236.InterfaceC8112;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3904 extends AbstractC3987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8117 f12104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f12106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3987 f12108;

    public C3904(long j, boolean z, boolean z2, AbstractC3987 abstractC3987) {
        abstractC3987.getClass();
        this.f12108 = abstractC3987;
        this.f12107 = j;
        this.f12106 = z;
        this.f12105 = z2;
        C8116 c8116 = new C8116(2);
        c8116.m2425(abstractC3987.mo8282());
        String[] strArr = AbstractC8115.f22413;
        C8125 c8125 = AbstractC8106.f22389;
        Set set = AbstractC8121.f22418;
        c8125.getClass();
        c8116.mo2423("Accept", c8125.toString());
        c8116.mo2423("Cache-Control", "no-store");
        this.f12104 = c8116.m13585();
    }

    public final String toString() {
        return "SSEClientContent";
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo8279(C4209 c4209, ArrayList arrayList) {
        c4209.getClass();
        this.f12108.mo8279(c4209, arrayList);
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8097 mo8280() {
        return this.f12108.mo8280();
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo8281(C4209 c4209) {
        c4209.getClass();
        return this.f12108.mo8281(c4209);
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8112 mo8282() {
        return this.f12104;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8125 mo8283() {
        return this.f12108.mo8283();
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Long mo8284() {
        return this.f12108.mo8284();
    }
}
