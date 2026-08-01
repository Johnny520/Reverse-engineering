package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.Comparator;
import p361.AbstractC8920;
import p376.AbstractC8980;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final class ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator implements Comparator<Path>, Serializable {
    private static final long serialVersionUID = 20200123;

    private ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator() {
    }

    @Override // java.util.Comparator
    public int compare(Path path, Path path2) {
        String strM14548 = AbstractC8920.m14548(path);
        String strM14582 = strM14548 != null ? AbstractC8980.m14582(strM14548) : null;
        String strM145482 = AbstractC8920.m14548(path2);
        String strM145822 = strM145482 != null ? AbstractC8980.m14582(strM145482) : null;
        if (!strM14582.startsWith("z")) {
            return -1;
        }
        if (strM145822.startsWith("z")) {
            return Integer.valueOf(Integer.parseInt(strM14582.substring(1))).compareTo(Integer.valueOf(Integer.parseInt(strM145822.substring(1))));
        }
        return 1;
    }
}
