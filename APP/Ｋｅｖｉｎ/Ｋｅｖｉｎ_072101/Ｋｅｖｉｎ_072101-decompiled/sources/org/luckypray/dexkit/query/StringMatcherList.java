package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: MatcherCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, m115d2 = {"Lorg/luckypray/dexkit/query/StringMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/IQuery;", "()V", "initialCapacity", "", "(I)V", "elements", "", "(Ljava/util/Collection;)V", "add", "usingString", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class StringMatcherList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.base.StringMatcher> implements org.luckypray.dexkit.query.base.IQuery {
    public StringMatcherList() {
            r0 = this;
            r0.<init>()
            return
    }

    public StringMatcherList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public StringMatcherList(java.util.Collection<org.luckypray.dexkit.query.matchers.base.StringMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }

    public static /* synthetic */ org.luckypray.dexkit.query.StringMatcherList add$default(org.luckypray.dexkit.query.StringMatcherList r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            org.luckypray.dexkit.query.StringMatcherList r0 = r0.add(r1, r2, r3)
            return r0
    }

    public final org.luckypray.dexkit.query.StringMatcherList add(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.StringMatcherList r0 = add$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.StringMatcherList add(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.StringMatcherList r0 = add$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final org.luckypray.dexkit.query.StringMatcherList add(java.lang.String r4, org.luckypray.dexkit.query.enums.StringMatchType r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "usingString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r3
            org.luckypray.dexkit.query.StringMatcherList r0 = (org.luckypray.dexkit.query.StringMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r4, r5, r6)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.StringMatcherList r0 = (org.luckypray.dexkit.query.StringMatcherList) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.StringMatcher
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.StringMatcher
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            int r0 = r1.indexOf(r0)
            return r0
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            int r0 = super.indexOf(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.StringMatcher
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            int r0 = r1.lastIndexOf(r0)
            return r0
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            int r0 = super.lastIndexOf(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.base.StringMatcher remove(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r1.removeAt(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.StringMatcher
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            boolean r0 = r1.remove(r0)
            return r0
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.base.StringMatcher r2) {
            r1 = this;
            boolean r0 = super.remove(r2)
            return r0
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.base.StringMatcher removeAt(int r2) {
            r1 = this;
            java.lang.Object r0 = super.remove(r2)
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
