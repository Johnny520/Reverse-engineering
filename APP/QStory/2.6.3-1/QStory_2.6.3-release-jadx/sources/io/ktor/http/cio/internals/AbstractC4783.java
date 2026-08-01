package io.ktor.http.cio.internals;

import io.ktor.http.cio.C4790;
import p073.InterfaceC7680;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4783 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7680 f12509;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        f12509 = property != null ? Boolean.parseBoolean(property) : false ? new C4784() : new C4790(4096, 2);
    }
}
