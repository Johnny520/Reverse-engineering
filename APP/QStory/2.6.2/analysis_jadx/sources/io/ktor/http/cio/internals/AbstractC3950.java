package io.ktor.http.cio.internals;

import io.ktor.http.cio.C3957;
import p057.InterfaceC6850;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3950 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6850 f12160;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        f12160 = property != null ? Boolean.parseBoolean(property) : false ? new C3951() : new C3957(4096, 2);
    }
}
