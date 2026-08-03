package org.luckypray.dexkit.query;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J&\u0010\u000f\u001a\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%¢\u0006\u0004\b\u000f\u0010'¨\u0006("}, d2 = {"Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Ljava/util/ArrayList;", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "Lkotlin/collections/ArrayList;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "<init>", "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "", "number", "add", "(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "value", "addByte", "(B)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addShort", "(S)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "addInt", "(I)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addLong", "(J)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addFloat", "(F)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "", "addDouble", "(D)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/query/NumberEncodeValueMatcherList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class NumberEncodeValueMatcherList extends java.util.ArrayList<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> implements org.luckypray.dexkit.query.base.QueryComponent {
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

    public NumberEncodeValueMatcherList(@Yue.InterfaceC4418 java.util.Collection<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.NumberEncodeValueMatcherList add(Yue.InterfaceC2825 r2) {
            r1 = this;
            java.lang.String r0 = "init"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList add(@Yue.InterfaceC4418 java.lang.Number r3) {
            r2 = this;
            java.lang.String r0 = "number"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto L11
            byte r3 = r3.byteValue()
            r2.addByte(r3)
            goto L4c
        L11:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L1d
            short r3 = r3.shortValue()
            r2.addShort(r3)
            goto L4c
        L1d:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L29
            int r3 = r3.intValue()
            r2.addInt(r3)
            goto L4c
        L29:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L35
            long r0 = r3.longValue()
            r2.addLong(r0)
            goto L4c
        L35:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L41
            float r3 = r3.floatValue()
            r2.addFloat(r3)
            goto L4c
        L41:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L4c
            double r0 = r3.doubleValue()
            r2.addDouble(r0)
        L4c:
            return r2
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addByte(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createByte(r2)
            r1.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addDouble(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createDouble(r2)
            r1.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addFloat(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createFloat(r2)
            r1.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addInt(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createInt(r2)
            r1.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addLong(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createLong(r2)
            r1.add(r2)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addShort(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createShort(r2)
            r1.add(r2)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.removeAt(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            boolean r2 = r1.remove(r2)
            return r2
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher removeAt(int r1) {
            r0 = this;
            java.lang.Object r1 = super.remove(r1)
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r1
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
