package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import p376.C8978;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5597 extends C8978 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m10910(int i) throws IOException {
        if (i >= 0 && i <= 8) {
            return m14567(i);
        }
        C5919.m11246(AbstractC0053.m161(i, "Trying to read ", " bits, at most 8 are allowed"));
        return 0L;
    }
}
