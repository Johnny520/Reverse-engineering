package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatchersGroupList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.StringMatchersGroup> implements org.luckypray.dexkit.query.base.QueryComponent {
    public StringMatchersGroupList() {
            r0 = this;
            r0.<init>()
            return
    }

    public StringMatchersGroupList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public StringMatchersGroupList(java.util.Collection<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.StringMatchersGroupList add$default(org.luckypray.dexkit.query.StringMatchersGroupList r0, java.lang.String r1, java.util.Collection r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Lb
            r4 = 0
        Lb:
            org.luckypray.dexkit.query.StringMatchersGroupList r0 = r0.add(r1, r2, r3, r4)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.StringMatchersGroupList add(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.StringMatchersGroupList add(java.lang.String r3, p000.a80 r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            org.luckypray.dexkit.query.StringMatcherList r1 = new org.luckypray.dexkit.query.StringMatcherList
            r1.<init>()
            r4.invoke(r1)
            r0.<init>(r3, r1)
            r2.add(r0)
            return r2
    }

    public final org.luckypray.dexkit.query.StringMatchersGroupList add(java.lang.String r8, java.util.Collection<java.lang.String> r9) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            org.luckypray.dexkit.query.StringMatchersGroupList r7 = add$default(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public final org.luckypray.dexkit.query.StringMatchersGroupList add(java.lang.String r8, java.util.Collection<java.lang.String> r9, org.luckypray.dexkit.query.enums.StringMatchType r10) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r5 = 8
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            org.luckypray.dexkit.query.StringMatchersGroupList r7 = add$default(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public final org.luckypray.dexkit.query.StringMatchersGroupList add(java.lang.String r4, java.util.Collection<java.lang.String> r5, org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r6, r7)
            r0.add(r2)
            goto L1a
        L2f:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r5 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r5.<init>(r4, r0)
            r3.add(r5)
            return r3
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.StringMatchersGroup
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            boolean r1 = r1.contains(r2)
            return r1
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
            r0 = this;
            boolean r0 = super.contains(r1)
            return r0
    }

    public /* bridge */ int getSize() {
            r0 = this;
            int r0 = super.size()
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.StringMatchersGroup
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            int r1 = r1.indexOf(r2)
            return r1
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
            r0 = this;
            int r0 = super.indexOf(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.StringMatchersGroup
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            int r1 = r1.lastIndexOf(r2)
            return r1
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
            r0 = this;
            int r0 = super.lastIndexOf(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.StringMatchersGroup remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = r0.removeAt(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.StringMatchersGroup
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            boolean r1 = r1.remove(r2)
            return r1
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
            r0 = this;
            boolean r0 = super.remove(r1)
            return r0
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.StringMatchersGroup removeAt(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.remove(r1)
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.getSize()
            return r0
    }
}
