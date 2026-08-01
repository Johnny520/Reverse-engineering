package org.luckypray.dexkit.query;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
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

    public NumberEncodeValueMatcherList(java.util.Collection<org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.query.NumberEncodeValueMatcherList add(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            r0.<init>()
            r2.invoke(r0)
            r1.add(r0)
            return r1
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList add(java.lang.Number r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            byte r3 = r3.byteValue()
            r2.addByte(r3)
            return r2
        Lf:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L1b
            short r3 = r3.shortValue()
            r2.addShort(r3)
            return r2
        L1b:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L27
            int r3 = r3.intValue()
            r2.addInt(r3)
            return r2
        L27:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L33
            long r0 = r3.longValue()
            r2.addLong(r0)
            return r2
        L33:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L3f
            float r3 = r3.floatValue()
            r2.addFloat(r3)
            return r2
        L3f:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L4a
            double r0 = r3.doubleValue()
            r2.addDouble(r0)
        L4a:
            return r2
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addByte(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createByte(r2)
            r1.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addDouble(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createDouble(r2)
            r1.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addFloat(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createFloat(r2)
            r1.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addInt(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createInt(r2)
            r1.add(r2)
            return r1
    }

    public final org.luckypray.dexkit.query.NumberEncodeValueMatcherList addLong(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.createLong(r2)
            r1.add(r2)
            return r1
    }

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
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            boolean r1 = r1.contains(r2)
            return r1
    }

    public /* bridge */ boolean contains(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
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
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            int r1 = r1.indexOf(r2)
            return r1
    }

    public /* bridge */ int indexOf(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
            r0 = this;
            int r0 = super.indexOf(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            int r1 = r1.lastIndexOf(r2)
            return r1
    }

    public /* bridge */ int lastIndexOf(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
            r0 = this;
            int r0 = super.lastIndexOf(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher remove(int r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.removeAt(r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r2
            boolean r1 = r1.remove(r2)
            return r1
    }

    public /* bridge */ boolean remove(org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1) {
            r0 = this;
            boolean r0 = super.remove(r1)
            return r0
    }

    public /* bridge */ org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher removeAt(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.remove(r1)
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.getSize()
            return r0
    }
}
