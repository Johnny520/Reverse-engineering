package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: DataCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u00032\u00020\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u001f\u0010\f\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0013\u001a\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u0010\u0017J\u000b\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u001f\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\r\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\rJ!\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0019\u0010\u001a\u001a\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u0010\u0017¨\u0006\u001b"}, m115d2 = {"Lorg/luckypray/dexkit/result/BaseDataList;", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/IQuery;", "()V", "initialCapacity", "", "(I)V", "elements", "", "(Ljava/util/Collection;)V", "first", "()Ljava/lang/Object;", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "firstOrThrow", "exceptionSupplier", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "single", "singleOrNull", "singleOrThrow", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public abstract class BaseDataList<T> extends java.util.ArrayList<T> implements org.luckypray.dexkit.query.base.IQuery {
    public BaseDataList() {
            r0 = this;
            r0.<init>()
            return
    }

    public BaseDataList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public BaseDataList(java.util.Collection<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }

    public final T first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "list is empty"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final T first(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r3 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Iterator r0 = r3.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L9
            return r1
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No element matching predicate was found."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final T firstOrNull() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.Object r0 = r1.first()
        Lc:
            return r0
    }

    public final T firstOrNull(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r4) {
            r3 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Iterator r0 = r3.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L9
            return r1
        L20:
            r0 = 0
            return r0
    }

    public final T firstOrThrow(kotlin.jvm.functions.Function0<? extends java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "exceptionSupplier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            return r0
        L11:
            java.lang.Object r0 = r2.invoke()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public /* bridge */ int getSize() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.removeAt(r2)
            return r0
    }

    public /* bridge */ java.lang.Object removeAt(int r2) {
            r1 = this;
            java.lang.Object r0 = super.remove(r2)
            return r0
    }

    public final T single() {
            r4 = this;
            int r0 = r4.size()
            if (r0 == 0) goto L2a
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            r1 = 1
            int r2 = r4.size()
        L10:
            if (r1 >= r2) goto L29
            java.lang.Object r3 = r4.get(r1)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L1f
            int r1 = r1 + 1
            goto L10
        L1f:
            org.luckypray.dexkit.exceptions.NonUniqueResultException r2 = new org.luckypray.dexkit.exceptions.NonUniqueResultException
            int r3 = r4.size()
            r2.<init>(r3)
            throw r2
        L29:
            return r0
        L2a:
            org.luckypray.dexkit.exceptions.NoResultException r0 = new org.luckypray.dexkit.exceptions.NoResultException
            java.lang.String r1 = "No result found for query"
            r0.<init>(r1)
            throw r0
    }

    public final T single(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.size()
            java.lang.String r1 = "No result found for query"
            if (r0 == 0) goto L46
            r0 = 0
            java.util.Iterator r2 = r5.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L12
            if (r0 == 0) goto L3b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r4 == 0) goto L31
            goto L3b
        L31:
            org.luckypray.dexkit.exceptions.NonUniqueResultException r1 = new org.luckypray.dexkit.exceptions.NonUniqueResultException
            int r2 = r5.size()
            r1.<init>(r2)
            throw r1
        L3b:
            r0 = r3
            goto L12
        L3d:
            if (r0 == 0) goto L40
            return r0
        L40:
            org.luckypray.dexkit.exceptions.NoResultException r2 = new org.luckypray.dexkit.exceptions.NoResultException
            r2.<init>(r1)
            throw r2
        L46:
            org.luckypray.dexkit.exceptions.NoResultException r0 = new org.luckypray.dexkit.exceptions.NoResultException
            r0.<init>(r1)
            throw r0
    }

    public final T singleOrNull() {
            r5 = this;
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            r2 = 1
            int r3 = r5.size()
        L12:
            if (r2 >= r3) goto L22
            java.lang.Object r4 = r5.get(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r4 != 0) goto L1f
            return r1
        L1f:
            int r2 = r2 + 1
            goto L12
        L22:
            return r0
    }

    public final T singleOrNull(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            r0 = 0
            java.util.Iterator r2 = r5.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L12
            if (r0 == 0) goto L31
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r4 != 0) goto L31
            return r1
        L31:
            r0 = r3
            goto L12
        L33:
            return r0
    }

    public final T singleOrThrow(kotlin.jvm.functions.Function0<? extends java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "exceptionSupplier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r0 = r1.singleOrNull()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            java.lang.Object r0 = r2.invoke()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
