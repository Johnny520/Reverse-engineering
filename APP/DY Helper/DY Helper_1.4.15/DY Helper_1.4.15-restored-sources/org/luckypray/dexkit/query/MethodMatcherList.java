package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcherList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.MethodMatcher> implements org.luckypray.dexkit.query.base.QueryComponent {
    public MethodMatcherList() {
            r0 = this;
            r0.<init>()
            return
    }

    public MethodMatcherList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MethodMatcherList(java.util.Collection<org.luckypray.dexkit.query.matchers.MethodMatcher> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.MethodMatcherList add(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.MethodMatcher
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            boolean r1 = r1.contains(r2)
            return r1
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.MethodMatcher
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            int r1 = r1.indexOf(r2)
            return r1
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r0 = this;
            int r0 = super.indexOf(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.MethodMatcher
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            int r1 = r1.lastIndexOf(r2)
            return r1
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r0 = this;
            int r0 = super.lastIndexOf(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.query.MethodMatcherList match(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = new org.luckypray.dexkit.query.matchers.MethodMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.MethodMatcherList match(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r0 = this;
            r1.getClass()
            r0.add(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.MethodMatcher remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = r0.removeAt(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.MethodMatcher
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            boolean r1 = r1.remove(r2)
            return r1
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.MethodMatcher r1) {
            r0 = this;
            boolean r0 = super.remove(r1)
            return r0
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.MethodMatcher removeAt(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.remove(r1)
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.getSize()
            return r0
    }
}
