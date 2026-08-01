package org.apache.commons.p014io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import p392.AbstractC9810;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class SizeFileComparator extends AbstractC6458 implements Serializable {
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
        long jM15142 = (file.isDirectory() ? (this.sumDirectoryContents && file.exists()) ? AbstractC9810.m15142(file) : 0L : file.length()) - (file2.isDirectory() ? (this.sumDirectoryContents && file2.exists()) ? AbstractC9810.m15142(file2) : 0L : file2.length());
        if (jM15142 < 0) {
            return -1;
        }
        return jM15142 > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.p014io.comparator.AbstractC6458
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.p014io.comparator.AbstractC6458
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.sumDirectoryContents + "]";
    }

    @Override // org.apache.commons.p014io.comparator.AbstractC6458
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public SizeFileComparator(boolean z) {
        this.sumDirectoryContents = z;
    }
}
