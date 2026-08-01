package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class ReverseFileComparator extends AbstractC5627 implements Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    private final Comparator<File> delegate;

    public ReverseFileComparator(Comparator<File> comparator) {
        Objects.requireNonNull(comparator, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.delegate = comparator;
    }

    @Override // org.apache.commons.io.comparator.AbstractC5627
    public String toString() {
        return super.toString() + "[" + this.delegate.toString() + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.delegate.compare(file2, file);
    }
}
