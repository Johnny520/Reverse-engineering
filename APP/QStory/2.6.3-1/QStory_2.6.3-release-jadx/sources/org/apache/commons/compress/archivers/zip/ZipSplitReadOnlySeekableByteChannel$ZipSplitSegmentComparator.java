package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.Comparator;
import p377.AbstractC9749;
import p392.AbstractC9809;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final class ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator implements Comparator<Path>, Serializable {
    private static final long serialVersionUID = 20200123;

    private ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator() {
    }

    @Override // java.util.Comparator
    public int compare(Path path, Path path2) {
        String strM15107 = AbstractC9749.m15107(path);
        String strM15141 = strM15107 != null ? AbstractC9809.m15141(strM15107) : null;
        String strM151072 = AbstractC9749.m15107(path2);
        String strM151412 = strM151072 != null ? AbstractC9809.m15141(strM151072) : null;
        if (!strM15141.startsWith("z")) {
            return -1;
        }
        if (strM151412.startsWith("z")) {
            return Integer.valueOf(Integer.parseInt(strM15141.substring(1))).compareTo(Integer.valueOf(Integer.parseInt(strM151412.substring(1))));
        }
        return 1;
    }
}
