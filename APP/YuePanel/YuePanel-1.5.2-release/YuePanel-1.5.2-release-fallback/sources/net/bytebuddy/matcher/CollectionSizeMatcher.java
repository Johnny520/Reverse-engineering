package net.bytebuddy.matcher;

import java.lang.Iterable;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class CollectionSizeMatcher<T extends java.lang.Iterable<?>> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final int size;

    public CollectionSizeMatcher(int r1) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            return
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Iteration required to count size of an iterable.", value = {"DLS_DEAD_LOCAL_STORE"})
    public boolean doMatch(T r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            int r0 = r4.size
            if (r5 != r0) goto L11
            r1 = r2
        L11:
            return r1
        L12:
            java.util.Iterator r5 = r5.iterator()
            r0 = r1
        L17:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L23
            r5.next()
            int r0 = r0 + 1
            goto L17
        L23:
            int r5 = r4.size
            if (r0 != r5) goto L28
            r1 = r2
        L28:
            return r1
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Iteration required to count size of an iterable.", value = {"DLS_DEAD_LOCAL_STORE"})
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
            int r2 = r4.size
            net.bytebuddy.matcher.CollectionSizeMatcher r5 = (net.bytebuddy.matcher.CollectionSizeMatcher) r5
            int r5 = r5.size
            if (r2 == r5) goto L23
            return r1
        L23:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            int r1 = r2.size
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ofSize("
            r0.append(r1)
            int r1 = r2.size
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
