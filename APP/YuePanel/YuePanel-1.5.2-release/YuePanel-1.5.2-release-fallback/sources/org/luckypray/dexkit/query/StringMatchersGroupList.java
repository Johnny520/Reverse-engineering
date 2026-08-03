package org.luckypray.dexkit.query;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMatcherCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/StringMatchersGroupList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1547#2:443\n1618#2,3:444\n*S KotlinDebug\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/StringMatchersGroupList\n*L\n411#1:443\n411#1:444,3\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ9\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ&\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/StringMatchersGroup;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "groupName", "usingStrings", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "add", "(Ljava/lang/String;Ljava/util/Collection;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "Lkotlin/Function1;", "Lorg/luckypray/dexkit/query/StringMatcherList;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(Ljava/lang/String;LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/StringMatchersGroupList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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

    public StringMatchersGroupList(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.StringMatchersGroup> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
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

    public final /* synthetic */ org.luckypray.dexkit.query.StringMatchersGroupList add(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.StringMatchersGroupList add(java.lang.String r3, Yue.InterfaceC2825 r4) {
            r2 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r0 = new org.luckypray.dexkit.query.matchers.StringMatchersGroup
            org.luckypray.dexkit.query.StringMatcherList r1 = new org.luckypray.dexkit.query.StringMatcherList
            r1.<init>()
            r4.invoke(r1)
            r0.<init>(r3, r1)
            r2.add(r0)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.StringMatchersGroupList add(@Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r10) {
            r8 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r10, r0)
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            org.luckypray.dexkit.query.StringMatchersGroupList r9 = add$default(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.StringMatchersGroupList add(@Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r10, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r11) {
            r8 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r11, r0)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.luckypray.dexkit.query.StringMatchersGroupList r9 = add$default(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.StringMatchersGroupList add(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r5, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r6, boolean r7) {
            r3 = this;
            java.lang.String r0 = "groupName"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "usingStrings"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            org.luckypray.dexkit.query.matchers.base.StringMatcher r2 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
            r2.<init>(r1, r6, r7)
            r0.add(r2)
            goto L1e
        L33:
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
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.StringMatchersGroup
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.StringMatchersGroup
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.StringMatchersGroup remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r1 = r0.removeAt(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.StringMatchersGroup
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r2 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r2
            boolean r2 = r1.remove(r2)
            return r2
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.StringMatchersGroup r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.StringMatchersGroup removeAt(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            org.luckypray.dexkit.query.matchers.StringMatchersGroup r1 = (org.luckypray.dexkit.query.matchers.StringMatchersGroup) r1
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
