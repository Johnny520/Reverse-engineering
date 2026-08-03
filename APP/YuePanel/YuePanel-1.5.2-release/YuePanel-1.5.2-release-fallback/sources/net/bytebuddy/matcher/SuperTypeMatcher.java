package net.bytebuddy.matcher;

import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class SuperTypeMatcher<T extends net.bytebuddy.description.type.TypeDescription> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final net.bytebuddy.description.type.TypeDescription typeDescription;

    public SuperTypeMatcher(net.bytebuddy.description.type.TypeDescription r1) {
            r0 = this;
            r0.<init>()
            r0.typeDescription = r1
            return
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    public boolean doMatch(T r2) {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
            boolean r2 = r2.isAssignableFrom(r0)
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
            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
            net.bytebuddy.matcher.SuperTypeMatcher r5 = (net.bytebuddy.matcher.SuperTypeMatcher) r5
            net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "isSuperTypeOf("
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
