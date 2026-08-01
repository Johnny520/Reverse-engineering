package org.apache.commons.lang3.builder;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class DiffBuilder$SDiff<T> extends Diff<T> {
    private static final long serialVersionUID = 1;
    private final DiffBuilder$SerializableSupplier<T> leftSupplier;
    private final DiffBuilder$SerializableSupplier<T> rightSupplier;

    private DiffBuilder$SDiff(String str, DiffBuilder$SerializableSupplier<T> diffBuilder$SerializableSupplier, DiffBuilder$SerializableSupplier<T> diffBuilder$SerializableSupplier2, Class<T> cls) {
        super(str, cls);
        Objects.requireNonNull(diffBuilder$SerializableSupplier);
        this.leftSupplier = diffBuilder$SerializableSupplier;
        Objects.requireNonNull(diffBuilder$SerializableSupplier2);
        this.rightSupplier = diffBuilder$SerializableSupplier2;
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public T getLeft() {
        return this.leftSupplier.get();
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public T getRight() {
        return this.rightSupplier.get();
    }
}
