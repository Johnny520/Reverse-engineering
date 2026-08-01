package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DirectoryFileComparator extends AbstractC5627 implements Serializable {
    public static final Comparator<File> DIRECTORY_COMPARATOR;
    public static final Comparator<File> DIRECTORY_REVERSE;
    private static final int TYPE_DIRECTORY = 1;
    private static final int TYPE_FILE = 2;
    private static final long serialVersionUID = 296132640160964395L;

    static {
        DirectoryFileComparator directoryFileComparator = new DirectoryFileComparator();
        DIRECTORY_COMPARATOR = directoryFileComparator;
        DIRECTORY_REVERSE = new ReverseFileComparator(directoryFileComparator);
    }

    private int getType(File file) {
        return file.isDirectory() ? 1 : 2;
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return getType(file) - getType(file2);
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
