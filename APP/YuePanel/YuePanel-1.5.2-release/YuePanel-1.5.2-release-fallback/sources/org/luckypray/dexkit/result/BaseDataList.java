package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\r\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0013\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0017\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ#\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u000eJ!\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001a\u0010\u0012J\u001b\u0010\u001b\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lorg/luckypray/dexkit/result/BaseDataList;", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "firstOrNull", "()Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "first", "Lkotlin/Function0;", "", "exceptionSupplier", "firstOrThrow", "(LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;", "singleOrNull", "single", "singleOrThrow", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseDataList<T> extends java.util.ArrayList<T> implements org.luckypray.dexkit.query.base.QueryComponent {
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

    public BaseDataList(@Yue.InterfaceC4418 java.util.Collection<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
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
            throw r0
    }

    public final T first(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r4) {
            r3 = this;
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r4, r0)
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
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "No element matching predicate was found."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4543
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

    @Yue.InterfaceC4543
    public final T firstOrNull(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r4) {
            r3 = this;
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r4, r0)
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
            r4 = 0
            return r4
    }

    public final T firstOrThrow(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "exceptionSupplier"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            return r2
        L11:
            java.lang.Object r2 = r2.invoke()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
    }

    public /* bridge */ int getSize() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.removeAt(r1)
            return r1
    }

    public /* bridge */ java.lang.Object removeAt(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    public final T single() {
            r4 = this;
            int r0 = r4.size()
            if (r0 == 0) goto L2a
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            int r1 = r4.size()
            r2 = 1
        L10:
            if (r2 >= r1) goto L29
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = Yue.C3329.m13897(r0, r3)
            if (r3 == 0) goto L1f
            int r2 = r2 + 1
            goto L10
        L1f:
            org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = new org.luckypray.dexkit.exceptions.NonUniqueResultException
            int r1 = r4.size()
            r0.<init>(r1)
            throw r0
        L29:
            return r0
        L2a:
            org.luckypray.dexkit.exceptions.NoResultException r0 = new org.luckypray.dexkit.exceptions.NoResultException
            java.lang.String r1 = "No result found for query"
            r0.<init>(r1)
            throw r0
    }

    public final T single(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.size()
            java.lang.String r1 = "No result found for query"
            if (r0 == 0) goto L46
            java.util.Iterator r0 = r5.iterator()
            r2 = 0
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r0.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L12
            if (r2 == 0) goto L3b
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 == 0) goto L31
            goto L3b
        L31:
            org.luckypray.dexkit.exceptions.NonUniqueResultException r6 = new org.luckypray.dexkit.exceptions.NonUniqueResultException
            int r0 = r5.size()
            r6.<init>(r0)
            throw r6
        L3b:
            r2 = r3
            goto L12
        L3d:
            if (r2 == 0) goto L40
            return r2
        L40:
            org.luckypray.dexkit.exceptions.NoResultException r6 = new org.luckypray.dexkit.exceptions.NoResultException
            r6.<init>(r1)
            throw r6
        L46:
            org.luckypray.dexkit.exceptions.NoResultException r6 = new org.luckypray.dexkit.exceptions.NoResultException
            r6.<init>(r1)
            throw r6
    }

    @Yue.InterfaceC4543
    public final T singleOrNull() {
            r5 = this;
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            int r2 = r5.size()
            r3 = 1
        L12:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r5.get(r3)
            boolean r4 = Yue.C3329.m13897(r0, r4)
            if (r4 != 0) goto L1f
            return r1
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            return r0
    }

    @Yue.InterfaceC4543
    public final T singleOrNull(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, java.lang.Boolean> r6) {
            r5 = this;
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.util.Iterator r0 = r5.iterator()
            r2 = r1
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r0.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L12
            if (r2 == 0) goto L31
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L31
            return r1
        L31:
            r2 = r3
            goto L12
        L33:
            return r2
    }

    public final T singleOrThrow(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "exceptionSupplier"
            Yue.C3329.m13906(r2, r0)
            java.lang.Object r0 = r1.singleOrNull()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            java.lang.Object r2 = r2.invoke()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
