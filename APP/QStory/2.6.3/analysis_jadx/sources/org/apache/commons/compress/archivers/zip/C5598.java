package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import p379.C8997;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5598 extends C8997 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long m10967(int i) throws IOException {
        if (i >= 0 && i <= 8) {
            return m14603(i);
        }
        C5925.m11307(AbstractC0053.m162(i, "Trying to read ", " bits, at most 8 are allowed"));
        return 0L;
    }
}
