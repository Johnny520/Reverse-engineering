package io.ktor.client.plugins.sse;

import io.ktor.http.content.AbstractC3986;
import io.ktor.util.C4208;
import java.util.ArrayList;
import java.util.Set;
import p236.AbstractC8105;
import p236.AbstractC8114;
import p236.AbstractC8120;
import p236.C8096;
import p236.C8115;
import p236.C8116;
import p236.C8124;
import p236.InterfaceC8111;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3903 extends AbstractC3986 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8116 f12099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f12101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3986 f12103;

    public C3903(long j, boolean z, boolean z2, AbstractC3986 abstractC3986) {
        abstractC3986.getClass();
        this.f12103 = abstractC3986;
        this.f12102 = j;
        this.f12101 = z;
        this.f12100 = z2;
        C8115 c8115 = new C8115(2);
        c8115.m2415(abstractC3986.mo8292());
        String[] strArr = AbstractC8114.f22415;
        C8124 c8124 = AbstractC8105.f22391;
        Set set = AbstractC8120.f22420;
        c8124.getClass();
        c8115.mo2413("Accept", c8124.toString());
        c8115.mo2413("Cache-Control", "no-store");
        this.f12099 = c8115.m13556();
    }

    public final String toString() {
        return "SSEClientContent";
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo8289(C4208 c4208, ArrayList arrayList) {
        c4208.getClass();
        this.f12103.mo8289(c4208, arrayList);
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8096 mo8290() {
        return this.f12103.mo8290();
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo8291(C4208 c4208) {
        c4208.getClass();
        return this.f12103.mo8291(c4208);
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8111 mo8292() {
        return this.f12099;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8124 mo8293() {
        return this.f12103.mo8293();
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Long mo8294() {
        return this.f12103.mo8294();
    }
}
