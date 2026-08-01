package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0900;
import java.io.IOException;
import p395.C9826;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6428 extends C9826 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m11526(int i) throws IOException {
        if (i >= 0 && i <= 8) {
            return m15162(i);
        }
        C6755.m11866(AbstractC0900.m722(i, "Trying to read ", " bits, at most 8 are allowed"));
        return 0L;
    }
}
