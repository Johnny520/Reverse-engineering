package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import p376.AbstractC8981;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class LastModifiedFileComparator extends AbstractC5628 implements Serializable {
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
        long jM14585 = AbstractC8981.m14585(file) - AbstractC8981.m14585(file2);
        if (jM14585 < 0) {
            return -1;
        }
        return jM14585 > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.AbstractC5628
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.io.comparator.AbstractC5628
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.apache.commons.io.comparator.AbstractC5628
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }
}
