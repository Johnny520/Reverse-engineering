package org.apache.commons.io.comparator;

import bsh.classpath.C2601;
import bsh.classpath.C2602;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CompositeFileComparator extends AbstractC5627 implements Serializable {
    private static final Comparator<?>[] EMPTY_COMPARATOR_ARRAY = new Comparator[0];
    private static final long serialVersionUID = -2224170307287243428L;
    private final Comparator<File>[] delegates;

    public CompositeFileComparator(Iterable<Comparator<File>> iterable) {
        this.delegates = iterable == null ? emptyArray() : (Comparator[]) StreamSupport.stream(iterable.spliterator(), false).toArray(new C2601(3));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Comparator<?>[], java.util.Comparator<java.io.File>[]] */
    private Comparator<File>[] emptyArray() {
        return EMPTY_COMPARATOR_ARRAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$compare$1(File file, File file2, Comparator comparator) {
        return Integer.valueOf(comparator.compare(file, file2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$compare$2(Integer num) {
        return num.intValue() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparator[] lambda$new$0(int i) {
        return new Comparator[i];
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return ((Integer) Stream.of((Object[]) this.delegates).map(new C5626(file, file2, 0)).filter(new C2602(2)).findFirst().orElse(0)).intValue();
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public String toString() {
        return super.toString() + Arrays.toString(this.delegates);
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public CompositeFileComparator(Comparator<File>... comparatorArr) {
        this.delegates = comparatorArr == null ? emptyArray() : (Comparator[]) comparatorArr.clone();
    }
}
