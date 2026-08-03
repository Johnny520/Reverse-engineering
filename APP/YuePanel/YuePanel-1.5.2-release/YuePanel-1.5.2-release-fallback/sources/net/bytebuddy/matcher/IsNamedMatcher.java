package net.bytebuddy.matcher;

import net.bytebuddy.description.NamedElement.WithOptionalName;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class IsNamedMatcher<T extends net.bytebuddy.description.NamedElement.WithOptionalName> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    public IsNamedMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            net.bytebuddy.description.NamedElement$WithOptionalName r1 = (net.bytebuddy.description.NamedElement.WithOptionalName) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    public boolean doMatch(T r1) {
            r0 = this;
            boolean r1 = r1.isNamed()
            return r1
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
            r3 = this;
            boolean r0 = super.equals(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r3 != r4) goto Lc
            return r0
        Lc:
            if (r4 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r3.getClass()
            java.lang.Class r4 = r4.getClass()
            if (r2 == r4) goto L1a
            return r1
        L1a:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "isNamed()"
            return r0
    }
}
