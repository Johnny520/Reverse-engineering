package org.apache.commons.p014io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final class ReverseFileComparator extends AbstractC6458 implements Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    private final Comparator<File> delegate;

    public ReverseFileComparator(Comparator<File> comparator) {
        Objects.requireNonNull(comparator, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.delegate = comparator;
    }

    @Override // org.apache.commons.p014io.comparator.AbstractC6458
    public String toString() {
        return super.toString() + "[" + this.delegate.toString() + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.delegate.compare(file2, file);
    }
}
