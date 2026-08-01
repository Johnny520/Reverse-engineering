package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.compose.p001ui.graphics.AbstractC2409;
import androidx.compose.p001ui.graphics.AbstractC2433;
import kotlin.time.C5989;
import p068.InterfaceC7372;
import p072.InterfaceC7669;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5134 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f13211;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f13212;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13213 = 0;

    public /* synthetic */ C5134(long j, InterfaceC7669 interfaceC7669) {
        this.f13211 = j;
        this.f13212 = interfaceC7669;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13213;
        long j = this.f13211;
        Object obj = this.f13212;
        switch (i) {
            case 0:
                return "Request timed out after " + C5989.m10748(j) + "ms: " + ((InterfaceC7669) obj).getMethod();
            default:
                return ((AbstractC2409) ((AbstractC2433) obj)).mo3428(j);
        }
    }

    public /* synthetic */ C5134(AbstractC2433 abstractC2433, long j) {
        this.f13212 = abstractC2433;
        this.f13211 = j;
    }
}
