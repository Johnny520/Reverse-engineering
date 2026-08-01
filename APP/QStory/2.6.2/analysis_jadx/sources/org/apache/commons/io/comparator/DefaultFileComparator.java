package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DefaultFileComparator extends AbstractC5627 implements Serializable {
    public static final Comparator<File> DEFAULT_COMPARATOR;
    public static final Comparator<File> DEFAULT_REVERSE;
    private static final long serialVersionUID = 3260141861365313518L;

    static {
        DefaultFileComparator defaultFileComparator = new DefaultFileComparator();
        DEFAULT_COMPARATOR = defaultFileComparator;
        DEFAULT_REVERSE = new ReverseFileComparator(defaultFileComparator);
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

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return file.compareTo(file2);
    }
}
