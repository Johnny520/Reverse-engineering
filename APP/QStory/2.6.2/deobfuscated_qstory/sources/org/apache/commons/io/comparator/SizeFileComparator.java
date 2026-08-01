package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import p377.AbstractC8981;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class SizeFileComparator extends AbstractC5627 implements Serializable {
    public static final Comparator<File> SIZE_COMPARATOR;
    public static final Comparator<File> SIZE_REVERSE;
    public static final Comparator<File> SIZE_SUMDIR_COMPARATOR;
    public static final Comparator<File> SIZE_SUMDIR_REVERSE;
    private static final long serialVersionUID = -1201561106411416190L;
    private final boolean sumDirectoryContents;

    static {
        SizeFileComparator sizeFileComparator = new SizeFileComparator();
        SIZE_COMPARATOR = sizeFileComparator;
        SIZE_REVERSE = new ReverseFileComparator(sizeFileComparator);
        SizeFileComparator sizeFileComparator2 = new SizeFileComparator(true);
        SIZE_SUMDIR_COMPARATOR = sizeFileComparator2;
        SIZE_SUMDIR_REVERSE = new ReverseFileComparator(sizeFileComparator2);
    }

    public SizeFileComparator() {
        this.sumDirectoryContents = false;
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        long jM14570 = (file.isDirectory() ? (this.sumDirectoryContents && file.exists()) ? AbstractC8981.m14570(file) : 0L : file.length()) - (file2.isDirectory() ? (this.sumDirectoryContents && file2.exists()) ? AbstractC8981.m14570(file2) : 0L : file2.length());
        if (jM14570 < 0) {
            return -1;
        }
        return jM14570 > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.sumDirectoryContents + "]";
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public SizeFileComparator(boolean z) {
        this.sumDirectoryContents = z;
    }
}
