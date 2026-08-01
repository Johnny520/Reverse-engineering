package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: MatcherCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ%\u0010\f\u001a\u00020\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m115d2 = {"Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/IQuery;", "()V", "initialCapacity", "", "(I)V", "elements", "", "(Ljava/util/Collection;)V", "add", "number", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addByte", "value", "", "addDouble", "", "addFloat", "", "addInt", "addLong", "", "addShort", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class NumberEncodeValueMatcherList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> implements org.luckypray.dexkit.query.base.IQuery {
    public NumberEncodeValueMatcherList() {
            r0 = this;
            r0.<init>()
            return
    }

    public NumberEncodeValueMatcherList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public NumberEncodeValueMatcherList(java.util.Collection<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }

    private final org.luckypray.dexkit.query.NumberEncodeValueMatcherList add(kotlin.jvm.functions.Function1<? super org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher, kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r2.<init>()
            r4.invoke(r2)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList add(java.lang.Number r5) {
            r4 = this;
            java.lang.String r0 = "number"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            boolean r2 = r5 instanceof java.lang.Byte
            if (r2 == 0) goto L16
            byte r2 = r5.byteValue()
            r4.addByte(r2)
            goto L51
        L16:
            boolean r2 = r5 instanceof java.lang.Short
            if (r2 == 0) goto L22
            short r2 = r5.shortValue()
            r4.addShort(r2)
            goto L51
        L22:
            boolean r2 = r5 instanceof java.lang.Integer
            if (r2 == 0) goto L2e
            int r2 = r5.intValue()
            r4.addInt(r2)
            goto L51
        L2e:
            boolean r2 = r5 instanceof java.lang.Long
            if (r2 == 0) goto L3a
            long r2 = r5.longValue()
            r4.addLong(r2)
            goto L51
        L3a:
            boolean r2 = r5 instanceof java.lang.Float
            if (r2 == 0) goto L46
            float r2 = r5.floatValue()
            r4.addFloat(r2)
            goto L51
        L46:
            boolean r2 = r5 instanceof java.lang.Double
            if (r2 == 0) goto L51
            double r2 = r5.doubleValue()
            r4.addDouble(r2)
        L51:
            r0 = r4
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addByte(byte r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r2.createByte(r4)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addDouble(double r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r2.createDouble(r4)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addFloat(float r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r2.createFloat(r4)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addInt(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r2.createInt(r4)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addLong(long r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r2.createLong(r4)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addShort(short r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r2.createShort(r4)
            r3.add(r2)
            r0 = r3
            org.luckypray.dexkit.query.NumberEncodeValueMatcherList r0 = (org.luckypray.dexkit.query.NumberEncodeValueMatcherList) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            int r0 = r1.indexOf(r0)
            return r0
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2) {
            r1 = this;
            int r0 = super.indexOf(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            int r0 = r1.lastIndexOf(r0)
            return r0
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2) {
            r1 = this;
            int r0 = super.lastIndexOf(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher remove(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r1.removeAt(r2)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            boolean r0 = r1.remove(r0)
            return r0
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2) {
            r1 = this;
            boolean r0 = super.remove(r2)
            return r0
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher removeAt(int r2) {
            r1 = this;
            java.lang.Object r0 = super.remove(r2)
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
