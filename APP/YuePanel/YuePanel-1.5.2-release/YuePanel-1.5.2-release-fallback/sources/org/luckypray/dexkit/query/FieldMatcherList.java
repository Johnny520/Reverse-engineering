package org.luckypray.dexkit.query;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nMatcherCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatcherCollections.kt\norg/luckypray/dexkit/query/FieldMatcherList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n1#2:443\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ+\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0013\u001a\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u0013\u0010\u0017J+\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u0014J&\u0010\u001e\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J&\u0010!\u001a\u00020\u00002\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/FieldMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "typeName", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "matchType", "", "ignoreCase", "addForType", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)Lorg/luckypray/dexkit/query/FieldMatcherList;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "name", "addForName", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "add", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "matcher", "match", "(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;)Lorg/luckypray/dexkit/query/FieldMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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

    public FieldMatcherList(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.FieldMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
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

    public final /* synthetic */ org.luckypray.dexkit.query.FieldMatcherList add(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.FieldMatcherList addForName(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.FieldMatcherList r8 = addForName$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.FieldMatcherList addForName(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.FieldMatcherList r8 = addForName$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.FieldMatcherList addForName(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r0.name(r2, r3, r4)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FieldMatcherList addForType(@Yue.InterfaceC4418 java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r0.type(r2)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.FieldMatcherList addForType(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            org.luckypray.dexkit.query.FieldMatcherList r8 = addForType$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.FieldMatcherList addForType(@Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            org.luckypray.dexkit.query.FieldMatcherList r8 = addForType$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final org.luckypray.dexkit.query.FieldMatcherList addForType(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "matchType"
            Yue.C3329.m13906(r3, r0)
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
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.FieldMatcher
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.FieldMatcher
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }

    public final /* synthetic */ org.luckypray.dexkit.query.FieldMatcherList match(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = new org.luckypray.dexkit.query.matchers.FieldMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.FieldMatcherList match(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.FieldMatcher r2) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            r1.add(r2)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.FieldMatcher remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = r0.removeAt(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.FieldMatcher
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.FieldMatcher r2 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r2
            boolean r2 = r1.remove(r2)
            return r2
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.FieldMatcher r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.FieldMatcher removeAt(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            org.luckypray.dexkit.query.matchers.FieldMatcher r1 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r1
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
