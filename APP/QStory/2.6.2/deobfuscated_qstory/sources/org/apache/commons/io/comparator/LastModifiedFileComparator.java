package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import p377.AbstractC8981;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class LastModifiedFileComparator extends AbstractC5627 implements Serializable {
    public static final Comparator<File> LASTMODIFIED_COMPARATOR;
    public static final Comparator<File> LASTMODIFIED_REVERSE;
    private static final long serialVersionUID = 7372168004395734046L;

    static {
        LastModifiedFileComparator lastModifiedFileComparator = new LastModifiedFileComparator();
        LASTMODIFIED_COMPARATOR = lastModifiedFileComparator;
        LASTMODIFIED_REVERSE = new ReverseFileComparator(lastModifiedFileComparator);
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        long jM14572 = AbstractC8981.m14572(file) - AbstractC8981.m14572(file2);
        if (jM14572 < 0) {
            return -1;
        }
        return jM14572 > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }
}
