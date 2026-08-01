package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC3994;
import io.ktor.utils.io.InterfaceC4252;
import java.io.InputStream;
import p018.AbstractC6253;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4117 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f12503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12504;

    public /* synthetic */ C4117(Object obj, int i) {
        this.f12504 = i;
        this.f12503 = obj;
    }

    @Override // io.ktor.http.content.AbstractC3994
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4252 mo8286() {
        int i = this.f12504;
        Object obj = this.f12503;
        switch (i) {
            case 0:
                return AbstractC6253.m11738((InputStream) obj);
            default:
                return (InterfaceC4252) obj;
        }
    }
}
