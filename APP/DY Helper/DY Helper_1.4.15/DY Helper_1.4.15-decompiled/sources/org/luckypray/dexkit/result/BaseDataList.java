package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
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

    public BaseDataList(java.util.Collection<? extends T> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    public final T first() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        Lc:
            java.lang.String r1 = "list is empty"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    public final T first(p000.a80 r3) {
            r2 = this;
            r3.getClass()
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7
            return r0
        L1e:
            java.lang.String r2 = "No element matching predicate was found."
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    public final T firstOrNull() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r1.first()
            return r1
    }

    public final T firstOrNull(p000.a80 r3) {
            r2 = this;
            r3.getClass()
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r3.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7
            return r0
        L1e:
            r2 = 0
            return r2
    }

    public final T firstOrThrow(p000.p70 r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            return r1
        Lf:
            java.lang.Object r1 = r2.invoke()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
    }

    public /* bridge */ int getSize() {
            r0 = this;
            int r0 = super.size()
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.removeAt(r1)
            return r0
    }

    public /* bridge */ java.lang.Object removeAt(int r1) {
            r0 = this;
            java.lang.Object r0 = super.remove(r1)
            return r0
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
            boolean r3 = p000.ln0.m3626(r0, r3)
            if (r3 == 0) goto L1f
            int r2 = r2 + 1
            goto L10
        L1f:
            org.luckypray.dexkit.exceptions.NonUniqueResultException r0 = new org.luckypray.dexkit.exceptions.NonUniqueResultException
            int r4 = r4.size()
            r0.<init>(r4)
            throw r0
        L29:
            return r0
        L2a:
            org.luckypray.dexkit.exceptions.NoResultException r4 = new org.luckypray.dexkit.exceptions.NoResultException
            java.lang.String r0 = "No result found for query"
            r4.<init>(r0)
            throw r4
    }

    public final T single(p000.a80 r6) {
            r5 = this;
            r6.getClass()
            int r0 = r5.size()
            java.lang.String r1 = "No result found for query"
            if (r0 == 0) goto L44
            java.util.Iterator r0 = r5.iterator()
            r2 = 0
        L10:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r0.next()
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L10
            if (r2 == 0) goto L39
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2f
            goto L39
        L2f:
            org.luckypray.dexkit.exceptions.NonUniqueResultException r6 = new org.luckypray.dexkit.exceptions.NonUniqueResultException
            int r5 = r5.size()
            r6.<init>(r5)
            throw r6
        L39:
            r2 = r3
            goto L10
        L3b:
            if (r2 == 0) goto L3e
            return r2
        L3e:
            org.luckypray.dexkit.exceptions.NoResultException r5 = new org.luckypray.dexkit.exceptions.NoResultException
            r5.<init>(r1)
            throw r5
        L44:
            org.luckypray.dexkit.exceptions.NoResultException r5 = new org.luckypray.dexkit.exceptions.NoResultException
            r5.<init>(r1)
            throw r5
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
            int r2 = r5.size()
            r3 = 1
        L12:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r5.get(r3)
            boolean r4 = p000.ln0.m3626(r0, r4)
            if (r4 != 0) goto L1f
            return r1
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            return r0
    }

    public final T singleOrNull(p000.a80 r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.util.Iterator r4 = r4.iterator()
            r0 = r1
        L10:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r4.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L10
            if (r0 == 0) goto L2f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2f
            return r1
        L2f:
            r0 = r2
            goto L10
        L31:
            return r0
    }

    public final T singleOrThrow(p000.p70 r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object r0 = r0.singleOrNull()
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.Object r0 = r1.invoke()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.getSize()
            return r0
    }
}
