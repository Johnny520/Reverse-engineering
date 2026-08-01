package io.ktor.server.application;

import io.ktor.server.engine.C4092;
import java.util.List;
import kotlin.coroutines.InterfaceC4360;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4360 f12347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f12350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4092 f12352;

    public C4059(C4092 c4092, List list, List list2, String str, boolean z, InterfaceC4360 interfaceC4360) {
        list.getClass();
        list2.getClass();
        str.getClass();
        interfaceC4360.getClass();
        this.f12352 = c4092;
        this.f12351 = list;
        this.f12350 = list2;
        this.f12349 = str;
        this.f12348 = z;
        if (this.f12348 && !this.f12350.isEmpty()) {
            interfaceC4360 = interfaceC4360.plus(C4069.f12364);
        }
        this.f12347 = interfaceC4360;
    }
}
