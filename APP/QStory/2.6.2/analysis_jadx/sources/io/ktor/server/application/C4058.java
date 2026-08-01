package io.ktor.server.application;

import io.ktor.server.engine.C4091;
import java.util.List;
import kotlin.coroutines.InterfaceC4359;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4058 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4359 f12343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f12346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f12347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4091 f12348;

    public C4058(C4091 c4091, List list, List list2, String str, boolean z, InterfaceC4359 interfaceC4359) {
        list.getClass();
        list2.getClass();
        str.getClass();
        interfaceC4359.getClass();
        this.f12348 = c4091;
        this.f12347 = list;
        this.f12346 = list2;
        this.f12345 = str;
        this.f12344 = z;
        if (this.f12344 && !this.f12346.isEmpty()) {
            interfaceC4359 = interfaceC4359.plus(C4068.f12360);
        }
        this.f12343 = interfaceC4359;
    }
}
