package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class CollectionElementMatcher<T> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<java.lang.Iterable<? extends T>> {
    private final int index;
    private final net.bytebuddy.matcher.ElementMatcher<? super T> matcher;

    public CollectionElementMatcher(int r1, net.bytebuddy.matcher.ElementMatcher<? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.index = r1
            r0.matcher = r2
            return
    }

    public boolean doMatch(java.lang.Iterable<? extends T> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            r1 = r0
        L6:
            int r2 = r3.index
            if (r1 >= r2) goto L17
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L16
            r4.next()
            int r1 = r1 + 1
            goto L6
        L16:
            return r0
        L17:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2a
            net.bytebuddy.matcher.ElementMatcher<? super T> r1 = r3.matcher
            java.lang.Object r4 = r4.next()
            boolean r4 = r1.matches(r4)
            if (r4 == 0) goto L2a
            r0 = 1
        L2a:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = super.equals(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 != r5) goto Lc
            return r0
        Lc:
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1a
            return r1
        L1a:
            int r2 = r4.index
            net.bytebuddy.matcher.CollectionElementMatcher r5 = (net.bytebuddy.matcher.CollectionElementMatcher) r5
            int r3 = r5.index
            if (r2 == r3) goto L23
            return r1
        L23:
            net.bytebuddy.matcher.ElementMatcher<? super T> r2 = r4.matcher
            net.bytebuddy.matcher.ElementMatcher<? super T> r5 = r5.matcher
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2e
            return r1
        L2e:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            int r1 = r2.index
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher<? super T> r1 = r2.matcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "with("
            r0.append(r1)
            int r1 = r2.index
            r0.append(r1)
            java.lang.String r1 = " matches "
            r0.append(r1)
            net.bytebuddy.matcher.ElementMatcher<? super T> r1 = r2.matcher
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
