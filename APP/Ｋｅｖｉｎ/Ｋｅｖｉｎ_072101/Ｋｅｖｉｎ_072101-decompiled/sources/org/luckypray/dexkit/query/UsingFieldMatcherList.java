package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: MatcherCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u00020\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m115d2 = {"Lorg/luckypray/dexkit/query/UsingFieldMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/UsingFieldMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/IQuery;", "()V", "initialCapacity", "", "(I)V", "elements", "", "(Ljava/util/Collection;)V", "add", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class UsingFieldMatcherList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> implements org.luckypray.dexkit.query.base.IQuery {
    public UsingFieldMatcherList() {
            r0 = this;
            r0.<init>()
            return
    }

    public UsingFieldMatcherList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public UsingFieldMatcherList(java.util.Collection<org.luckypray.dexkit.query.matchers.UsingFieldMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }

    private final org.luckypray.dexkit.query.UsingFieldMatcherList add(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.UsingFieldMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.UsingFieldMatcherList r0 = (org.luckypray.dexkit.query.UsingFieldMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2 = new org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.UsingFieldMatcherList r0 = (org.luckypray.dexkit.query.UsingFieldMatcherList) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2) {
            r1 = this;
            boolean r0 = super.contains(r2)
            return r0
    }

    public /* bridge */ int getSize() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            int r0 = r1.indexOf(r0)
            return r0
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2) {
            r1 = this;
            int r0 = super.indexOf(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            int r0 = r1.lastIndexOf(r0)
            return r0
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2) {
            r1 = this;
            int r0 = super.lastIndexOf(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher remove(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = r1.removeAt(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.UsingFieldMatcher
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            boolean r0 = r1.remove(r0)
            return r0
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.UsingFieldMatcher r2) {
            r1 = this;
            boolean r0 = super.remove(r2)
            return r0
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.UsingFieldMatcher removeAt(int r2) {
            r1 = this;
            java.lang.Object r0 = super.remove(r2)
            org.luckypray.dexkit.query.matchers.UsingFieldMatcher r0 = (org.luckypray.dexkit.query.matchers.UsingFieldMatcher) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
