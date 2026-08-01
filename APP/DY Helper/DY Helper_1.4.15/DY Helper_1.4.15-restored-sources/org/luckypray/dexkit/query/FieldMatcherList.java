package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcherList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.FieldMatcher> implements org.luckypray.dexkit.query.base.QueryComponent {
    public FieldMatcherList() {
            r0 = this;
            r0.<init>()
            return
    }

    public FieldMatcherList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public FieldMatcherList(java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.FieldMatcherList addForName$default(org.luckypray.dexkit.query.FieldMatcherList r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.FieldMatcherList r0 = r0.addForName(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ org.luckypray.dexkit.query.FieldMatcherList addForType$default(org.luckypray.dexkit.query.FieldMatcherList r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.FieldMatcherList r0 = r0.addForType(r1, r2, r3)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.FieldMatcherList add(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.FieldMatcherList addForName(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.FieldMatcherList r6 = addForName$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.FieldMatcherList addForName(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.FieldMatcherList r6 = addForName$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.FieldMatcherList addForName(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r0.name(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.FieldMatcherList addForType(java.lang.Class<?> r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r0.type(r2)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.FieldMatcherList addForType(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            org.luckypray.dexkit.query.FieldMatcherList r6 = addForType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.FieldMatcherList addForType(java.lang.String r7, org.luckypray.dexkit.query.enums.StringMatchType r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.FieldMatcherList r6 = addForType$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final org.luckypray.dexkit.query.FieldMatcherList addForType(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r0.type(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.FieldMatcher
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            boolean r1 = r1.contains(r2)
            return r1
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.FieldMatcher
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            int r1 = r1.indexOf(r2)
            return r1
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            int r0 = super.indexOf(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.FieldMatcher
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            int r1 = r1.lastIndexOf(r2)
            return r1
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            int r0 = super.lastIndexOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.FieldMatcherList match(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.FieldMatcherList match(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.add(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.FieldMatcher remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = r0.removeAt(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.FieldMatcher
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            boolean r1 = r1.remove(r2)
            return r1
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            boolean r0 = super.remove(r1)
            return r0
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.FieldMatcher removeAt(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.remove(r1)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.getSize()
            return r0
    }
}
