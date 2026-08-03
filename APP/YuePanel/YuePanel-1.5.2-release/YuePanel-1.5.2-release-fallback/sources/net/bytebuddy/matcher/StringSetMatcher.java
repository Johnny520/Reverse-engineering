package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class StringSetMatcher extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<java.lang.String> {
    private final java.util.Set<java.lang.String> values;

    public StringSetMatcher(java.util.Set<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.values = r1
            return
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.doMatch2(r1)
            return r1
    }

    /* JADX INFO: renamed from: doMatch, reason: avoid collision after fix types in other method */
    public boolean doMatch2(java.lang.String r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.values
            boolean r2 = r0.contains(r2)
            return r2
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
            java.util.Set<java.lang.String> r2 = r4.values
            net.bytebuddy.matcher.StringSetMatcher r5 = (net.bytebuddy.matcher.StringSetMatcher) r5
            java.util.Set<java.lang.String> r5 = r5.values
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
            java.util.Set<java.lang.String> r1 = r2.values
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "in("
            r0.append(r1)
            java.util.Set<java.lang.String> r1 = r5.values
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 == 0) goto L21
            r2 = 0
            goto L26
        L21:
            java.lang.String r4 = ", "
            r0.append(r4)
        L26:
            r0.append(r3)
            goto L11
        L2a:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
