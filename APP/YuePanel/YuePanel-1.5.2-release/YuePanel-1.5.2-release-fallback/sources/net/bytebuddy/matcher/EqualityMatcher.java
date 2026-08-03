package net.bytebuddy.matcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class EqualityMatcher<T> extends net.bytebuddy.matcher.ElementMatcher.Junction.AbstractBase<T> {
    private final java.lang.Object value;

    public EqualityMatcher(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            java.lang.Object r2 = r4.value
            net.bytebuddy.matcher.EqualityMatcher r5 = (net.bytebuddy.matcher.EqualityMatcher) r5
            java.lang.Object r5 = r5.value
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L20
            return r1
        L20:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.value
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher
    public boolean matches(@net.bytebuddy.utility.nullability.MaybeNull T r2) {
            r1 = this;
            java.lang.Object r0 = r1.value
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "is("
            r0.append(r1)
            java.lang.Object r1 = r2.value
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
