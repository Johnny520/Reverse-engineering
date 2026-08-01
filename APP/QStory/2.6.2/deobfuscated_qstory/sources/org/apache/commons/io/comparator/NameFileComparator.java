package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOCase;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class NameFileComparator extends AbstractC5627 implements Serializable {
    public static final Comparator<File> NAME_COMPARATOR;
    public static final Comparator<File> NAME_INSENSITIVE_COMPARATOR;
    public static final Comparator<File> NAME_INSENSITIVE_REVERSE;
    public static final Comparator<File> NAME_REVERSE;
    public static final Comparator<File> NAME_SYSTEM_COMPARATOR;
    public static final Comparator<File> NAME_SYSTEM_REVERSE;
    private static final long serialVersionUID = 8397947749814525798L;
    private final IOCase ioCase;

    static {
        NameFileComparator nameFileComparator = new NameFileComparator();
        NAME_COMPARATOR = nameFileComparator;
        NAME_REVERSE = new ReverseFileComparator(nameFileComparator);
        NameFileComparator nameFileComparator2 = new NameFileComparator(IOCase.INSENSITIVE);
        NAME_INSENSITIVE_COMPARATOR = nameFileComparator2;
        NAME_INSENSITIVE_REVERSE = new ReverseFileComparator(nameFileComparator2);
        NameFileComparator nameFileComparator3 = new NameFileComparator(IOCase.SYSTEM);
        NAME_SYSTEM_COMPARATOR = nameFileComparator3;
        NAME_SYSTEM_REVERSE = new ReverseFileComparator(nameFileComparator3);
    }

    public NameFileComparator(IOCase iOCase) {
        this.ioCase = IOCase.value(iOCase, IOCase.SENSITIVE);
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.ioCase.checkCompareTo(file.getName(), file2.getName());
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public String toString() {
        return super.toString() + "[ioCase=" + this.ioCase + "]";
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public NameFileComparator() {
        this.ioCase = IOCase.SENSITIVE;
    }
}
