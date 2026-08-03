package org.luckypray.dexkit.query;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000e\u001a\u00020\u00002\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, d2 = {"Lorg/luckypray/dexkit/query/ClassMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/ClassMatcherList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "add", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/ClassMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassMatcherList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.ClassMatcher> implements org.luckypray.dexkit.query.base.QueryComponent {
    public ClassMatcherList() {
            r0 = this;
            r0.<init>()
            return
    }

    public ClassMatcherList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ClassMatcherList(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.ClassMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.ClassMatcherList add(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.ClassMatcher
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    public /* bridge */ int getSize() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.ClassMatcher
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.ClassMatcher
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.ClassMatcherList match(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = new org.luckypray.dexkit.query.matchers.ClassMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.ClassMatcherList match(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.add(r2)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.ClassMatcher remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = r0.removeAt(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.ClassMatcher
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r2
            boolean r2 = r1.remove(r2)
            return r2
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.ClassMatcher removeAt(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r1
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
