package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.Comparator;
import p361.AbstractC8930;
import p377.AbstractC8980;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator implements Comparator<Path>, Serializable {
    private static final long serialVersionUID = 20200123;

    private ZipSplitReadOnlySeekableByteChannel$ZipSplitSegmentComparator() {
    }

    @Override // java.util.Comparator
    public int compare(Path path, Path path2) {
        String strM14535 = AbstractC8930.m14535(path);
        String strM14569 = strM14535 != null ? AbstractC8980.m14569(strM14535) : null;
        String strM145352 = AbstractC8930.m14535(path2);
        String strM145692 = strM145352 != null ? AbstractC8980.m14569(strM145352) : null;
        if (!strM14569.startsWith("z")) {
            return -1;
        }
        if (strM145692.startsWith("z")) {
            return Integer.valueOf(Integer.parseInt(strM14569.substring(1))).compareTo(Integer.valueOf(Integer.parseInt(strM145692.substring(1))));
        }
        return 1;
    }
}
