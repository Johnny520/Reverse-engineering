package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class InstanceTypeMatcher<T> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> matcher;

    public InstanceTypeMatcher(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1) {
            r0 = this;
            r0.<init>()
            r0.matcher = r1
            return
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0 = r1.matcher
            java.lang.Class r2 = r2.getClass()
            net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
            boolean r2 = r0.matches(r2)
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
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2 = r4.matcher
            net.bytebuddy.matcher.InstanceTypeMatcher r5 = (net.bytebuddy.matcher.InstanceTypeMatcher) r5
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r5 = r5.matcher
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
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1 = r2.matcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ofType("
            r0.append(r1)
            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1 = r2.matcher
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
