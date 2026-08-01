package io.ktor.client.plugins.sse;

import io.ktor.http.content.AbstractC4819;
import io.ktor.util.C5041;
import java.util.ArrayList;
import java.util.Set;
import p252.AbstractC8935;
import p252.AbstractC8944;
import p252.AbstractC8950;
import p252.C8926;
import p252.C8945;
import p252.C8946;
import p252.C8954;
import p252.InterfaceC8941;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4736 extends AbstractC4819 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8946 f12449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f12451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f12452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC4819 f12453;

    public C4736(long j, boolean z, boolean z2, AbstractC4819 abstractC4819) {
        abstractC4819.getClass();
        this.f12453 = abstractC4819;
        this.f12452 = j;
        this.f12451 = z;
        this.f12450 = z2;
        C8945 c8945 = new C8945(2);
        c8945.m2985(abstractC4819.mo8841());
        String[] strArr = AbstractC8944.f22758;
        C8954 c8954 = AbstractC8935.f22734;
        Set set = AbstractC8950.f22763;
        c8954.getClass();
        c8945.mo2983("Accept", c8954.toString());
        c8945.mo2983("Cache-Control", "no-store");
        this.f12449 = c8945.m14144();
    }

    public final String toString() {
        return "SSEClientContent";
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo8838(C5041 c5041, ArrayList arrayList) {
        c5041.getClass();
        this.f12453.mo8838(c5041, arrayList);
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8926 mo8839() {
        return this.f12453.mo8839();
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo8840(C5041 c5041) {
        c5041.getClass();
        return this.f12453.mo8840(c5041);
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8941 mo8841() {
        return this.f12449;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8954 mo8842() {
        return this.f12453.mo8842();
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Long mo8843() {
        return this.f12453.mo8843();
    }
}
