package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class CollectionOneToOneMatcher<T> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<java.lang.Iterable<? extends T>> {
    private final java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> matchers;

    public CollectionOneToOneMatcher(java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> r1) {
            r0 = this;
            r0.<init>()
            r0.matchers = r1
            return
    }

    public boolean doMatch(java.lang.Iterable<? extends T> r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> r2 = r4.matchers
            int r2 = r2.size()
            if (r0 == r2) goto L15
            return r1
        L15:
            java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> r0 = r4.matchers
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r5.next()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r0.next()
            net.bytebuddy.matcher.ElementMatcher r3 = (net.bytebuddy.matcher.ElementMatcher) r3
            boolean r2 = r3.matches(r2)
            if (r2 != 0) goto L1f
        L3b:
            return r1
        L3c:
            r5 = 1
            return r5
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
            java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> r2 = r4.matchers
            net.bytebuddy.matcher.CollectionOneToOneMatcher r5 = (net.bytebuddy.matcher.CollectionOneToOneMatcher) r5
            java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> r5 = r5.matchers
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> r1 = r2.matchers
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "containing("
            r0.<init>(r1)
            java.util.List<? extends net.bytebuddy.matcher.ElementMatcher<? super T>> r1 = r5.matchers
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        Le:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r1.next()
            if (r2 == 0) goto L1c
            r2 = 0
            goto L21
        L1c:
            java.lang.String r4 = ", "
            r0.append(r4)
        L21:
            r0.append(r3)
            goto Le
        L25:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
