package io.ktor.server.application;

import io.ktor.server.engine.C4924;
import java.util.List;
import kotlin.coroutines.InterfaceC5192;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5192 f12692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f12695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4924 f12697;

    public C4891(C4924 c4924, List list, List list2, String str, boolean z, InterfaceC5192 interfaceC5192) {
        list.getClass();
        list2.getClass();
        str.getClass();
        interfaceC5192.getClass();
        this.f12697 = c4924;
        this.f12696 = list;
        this.f12695 = list2;
        this.f12694 = str;
        this.f12693 = z;
        if (this.f12693 && !this.f12695.isEmpty()) {
            interfaceC5192 = interfaceC5192.plus(C4901.f12709);
        }
        this.f12692 = interfaceC5192;
    }
}
